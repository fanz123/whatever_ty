package com.whty.smpp.netty.pdu;

/*
 * #%L
 * ch-smpp
 * %%
 * Copyright (C) 2009 - 2015 Cloudhopper by Twitter
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.jboss.netty.buffer.ChannelBuffer;

import com.whty.smpp.netty.constants.SmppConstants;
import com.whty.smpp.netty.exception.RecoverablePduException;
import com.whty.smpp.netty.exception.UnrecoverablePduException;
import com.whty.smpp.netty.util.ChannelBufferUtil;
import com.whty.smpp.netty.util.PduUtil;
/**
 * 
 * @ClassName DataSm
 * @author Administrator
 * @date 2017-3-10 下午1:35:30
 * @Description TODO(这里用一句话描述这个类的作用)
 */
public class DataSm extends BaseSm<DataSmResp> {

    public DataSm() {
        super(SmppConstants.CMD_ID_DATA_SM, "data_sm");
    }

    @Override
    public DataSmResp createResponse() {
        DataSmResp resp = new DataSmResp();
        resp.setSequenceNumber(this.getSequenceNumber());
        return resp;
    }

    @Override
    public Class<DataSmResp> getResponseClass() {
        return DataSmResp.class;
    }
    
    @Override
    public void readBody(ChannelBuffer buffer) throws UnrecoverablePduException, RecoverablePduException {
        this.serviceType = ChannelBufferUtil.readNullTerminatedString(buffer);
        this.sourceAddress = ChannelBufferUtil.readAddress(buffer);
        this.destAddress = ChannelBufferUtil.readAddress(buffer);
        this.esmClass = buffer.readByte();
        this.registeredDelivery = buffer.readByte();
        this.dataCoding = buffer.readByte();
    }

    @Override
    public int calculateByteSizeOfBody() {
        int bodyLength = 0;
        bodyLength += PduUtil.calculateByteSizeOfNullTerminatedString(this.serviceType);
        bodyLength += PduUtil.calculateByteSizeOfAddress(this.sourceAddress);
        bodyLength += PduUtil.calculateByteSizeOfAddress(this.destAddress);
        bodyLength += 3;    // esmClass, regDelivery, dataCoding bytes
        return bodyLength;
    }

    @Override
    public void writeBody(ChannelBuffer buffer) throws UnrecoverablePduException, RecoverablePduException {
        ChannelBufferUtil.writeNullTerminatedString(buffer, this.serviceType);
        ChannelBufferUtil.writeAddress(buffer, this.sourceAddress);
        ChannelBufferUtil.writeAddress(buffer, this.destAddress);
        buffer.writeByte(this.esmClass);
        buffer.writeByte(this.registeredDelivery);
        buffer.writeByte(this.dataCoding);
    }
    
}
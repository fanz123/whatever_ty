package com.whty.euicc.rsp.packets.message.request;

import com.whty.euicc.rsp.packets.message.MsgType;
import com.whty.euicc.rsp.packets.message.request.base.RequestMsgBody;

@MsgType("/gsma/rsp2/es9plus/cancelSession")
public class CancelSessionReq extends RequestMsgBody {
	private String transactionId;
	private String euiccCancelSessionSigned;
	private String euiccCancelSessionSignature;
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getEuiccCancelSessionSigned() {
		return euiccCancelSessionSigned;
	}
	public void setEuiccCancelSessionSigned(String euiccCancelSessionSigned) {
		this.euiccCancelSessionSigned = euiccCancelSessionSigned;
	}
	public String getEuiccCancelSessionSignature() {
		return euiccCancelSessionSignature;
	}
	public void setEuiccCancelSessionSignature(String euiccCancelSessionSignature) {
		this.euiccCancelSessionSignature = euiccCancelSessionSignature;
	}
	

}

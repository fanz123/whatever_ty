/****************************************************************************
 * MessageStateNotFoundException.java
 *
 * Copyright (C) Selenium Software Ltd 2006
 *
 * This file is part of SMPPSim.
 *
 * SMPPSim is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * SMPPSim is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SMPPSim; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * @author martin@seleniumsoftware.com
 * http://www.woolleynet.com
 * http://www.seleniumsoftware.com
 * $Header: /var/cvsroot/SMPPSim2/distribution/2.6.9/SMPPSim/src/java/com/seleniumsoftware/SMPPSim/exceptions/MessageStateNotFoundException.java,v 1.1 2012/07/24 14:48:59 martin Exp $
 ****************************************************************************
*/
package com.whty.smpp.exceptions;
/**
 * @ClassName MessageStateNotFoundException
 * @author Administrator
 * @date 2017-1-12 上午10:50:38
 * @Description TODO(异常抛出)
 */
public class MessageStateNotFoundException extends Exception
{
	public MessageStateNotFoundException() {
		super();
	}

	public MessageStateNotFoundException(String message) {
		super(message);
	}

}

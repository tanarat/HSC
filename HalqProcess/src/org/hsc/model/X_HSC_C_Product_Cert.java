/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.hsc.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for HSC_C_Product_Cert
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_C_Product_Cert extends PO implements I_HSC_C_Product_Cert, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20120123L;

    /** Standard Constructor */
    public X_HSC_C_Product_Cert (Properties ctx, int HSC_C_Product_Cert_ID, String trxName)
    {
      super (ctx, HSC_C_Product_Cert_ID, trxName);
      /** if (HSC_C_Product_Cert_ID == 0)
        {
			setHSC_C_Certificate_ID (0);
			setHSC_C_Product_Cert_ID (0);
			setHSC_Request_Product_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_HSC_C_Product_Cert (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_HSC_C_Product_Cert[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (I_C_BPartner)MTable.get(getCtx(), I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	public org.hsc.model.I_HSC_C_Certificate getHSC_C_Certificate() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_C_Certificate)MTable.get(getCtx(), org.hsc.model.I_HSC_C_Certificate.Table_Name)
			.getPO(getHSC_C_Certificate_ID(), get_TrxName());	}

	/** Set HSC_C_Certificate.
		@param HSC_C_Certificate_ID HSC_C_Certificate	  */
	public void setHSC_C_Certificate_ID (int HSC_C_Certificate_ID)
	{
		if (HSC_C_Certificate_ID < 1) 
			set_Value (COLUMNNAME_HSC_C_Certificate_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_C_Certificate_ID, Integer.valueOf(HSC_C_Certificate_ID));
	}

	/** Get HSC_C_Certificate.
		@return HSC_C_Certificate	  */
	public int getHSC_C_Certificate_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_C_Certificate_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HSC_C_Product_Cert.
		@param HSC_C_Product_Cert_ID HSC_C_Product_Cert	  */
	public void setHSC_C_Product_Cert_ID (int HSC_C_Product_Cert_ID)
	{
		if (HSC_C_Product_Cert_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HSC_C_Product_Cert_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_C_Product_Cert_ID, Integer.valueOf(HSC_C_Product_Cert_ID));
	}

	/** Get HSC_C_Product_Cert.
		@return HSC_C_Product_Cert	  */
	public int getHSC_C_Product_Cert_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_C_Product_Cert_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.hsc.model.I_HSC_Product getHSC_Product() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_Product)MTable.get(getCtx(), org.hsc.model.I_HSC_Product.Table_Name)
			.getPO(getHSC_Product_ID(), get_TrxName());	}

	/** Set HSC_Product.
		@param HSC_Product_ID HSC_Product	  */
	public void setHSC_Product_ID (int HSC_Product_ID)
	{
		if (HSC_Product_ID < 1) 
			set_Value (COLUMNNAME_HSC_Product_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_Product_ID, Integer.valueOf(HSC_Product_ID));
	}

	/** Get HSC_Product.
		@return HSC_Product	  */
	public int getHSC_Product_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.hsc.model.I_HSC_Request_Product getHSC_Request_Product() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_Request_Product)MTable.get(getCtx(), org.hsc.model.I_HSC_Request_Product.Table_Name)
			.getPO(getHSC_Request_Product_ID(), get_TrxName());	}

	/** Set HSC_Request_Product.
		@param HSC_Request_Product_ID HSC_Request_Product	  */
	public void setHSC_Request_Product_ID (int HSC_Request_Product_ID)
	{
		if (HSC_Request_Product_ID < 1) 
			set_Value (COLUMNNAME_HSC_Request_Product_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_Request_Product_ID, Integer.valueOf(HSC_Request_Product_ID));
	}

	/** Get HSC_Request_Product.
		@return HSC_Request_Product	  */
	public int getHSC_Request_Product_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Request_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}
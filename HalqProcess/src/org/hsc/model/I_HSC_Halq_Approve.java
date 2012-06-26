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
package org.hsc.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for HSC_Halq_Approve
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS
 */
public interface I_HSC_Halq_Approve 
{

    /** TableName=HSC_Halq_Approve */
    public static final String Table_Name = "HSC_Halq_Approve";

    /** AD_Table_ID=1000007 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner .
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner .
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name HSC_Halq_Approve_ID */
    public static final String COLUMNNAME_HSC_Halq_Approve_ID = "HSC_Halq_Approve_ID";

	/** Set HSC_Halq_Approve_ID	  */
	public void setHSC_Halq_Approve_ID (int HSC_Halq_Approve_ID);

	/** Get HSC_Halq_Approve_ID	  */
	public int getHSC_Halq_Approve_ID();

    /** Column name HSC_Halq_Project_ID */
    public static final String COLUMNNAME_HSC_Halq_Project_ID = "HSC_Halq_Project_ID";

	/** Set HSC_Halq_Project_ID	  */
	public void setHSC_Halq_Project_ID (int HSC_Halq_Project_ID);

	/** Get HSC_Halq_Project_ID	  */
	public int getHSC_Halq_Project_ID();

	public org.hsc.model.I_HSC_Halq_Project getHSC_Halq_Project() throws RuntimeException;

    /** Column name HSC_Halq_Registration_Form_ID */
    public static final String COLUMNNAME_HSC_Halq_Registration_Form_ID = "HSC_Halq_Registration_Form_ID";

	/** Set HSC_Halq_Registration_Form_ID	  */
	public void setHSC_Halq_Registration_Form_ID (int HSC_Halq_Registration_Form_ID);

	/** Get HSC_Halq_Registration_Form_ID	  */
	public int getHSC_Halq_Registration_Form_ID();

	public org.hsc.model.I_HSC_Halq_Registration_Form getHSC_Halq_Registration_Form() throws RuntimeException;

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name Project_Name */
    public static final String COLUMNNAME_Project_Name = "Project_Name";

	/** Set Project_Name	  */
	public void setProject_Name (String Project_Name);

	/** Get Project_Name	  */
	public String getProject_Name();

    /** Column name Send_Approve_Mail */
    public static final String COLUMNNAME_Send_Approve_Mail = "Send_Approve_Mail";

	/** Set Send_Approve_Mail	  */
	public void setSend_Approve_Mail (String Send_Approve_Mail);

	/** Get Send_Approve_Mail	  */
	public String getSend_Approve_Mail();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
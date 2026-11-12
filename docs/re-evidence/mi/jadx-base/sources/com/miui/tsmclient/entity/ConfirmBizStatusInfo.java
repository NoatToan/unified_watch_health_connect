package com.miui.tsmclient.entity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.h;
import com.miui.tsmclient.model.mitsm.f;
import com.miui.tsmclient.util.Constants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class ConfirmBizStatusInfo {
    private static final String[] ALLOWED_OPERATIONS = {"issue", "transferIn", "transferOut", "return", "recharge", "autoRechargeRecharge", "autoRechargeQueryOrderByOrderId", "issueWithRecharge", "pullBusCardIssue", "pullBusCardTransferIn", "pullBusCardTransferOut", "pullBusCardOutReturn", "pullBusCardTopUpData", "pullBusCardOutInstall"};
    public static final String STATUS_FAILED = "FAILED";
    public static final String STATUS_SUCCESS = "SUCCESS";
    private boolean isKeepExtra;
    private String mActionType;
    private Bundle mBundle;
    private String mBusinessId;
    private String mCardCategory;
    private String mCardName;
    private String mCoreOperation;
    private int mErrorCode;
    private String mErrorDesc;
    private String mExtra;
    private String mOrderId;
    private String mOrderSource;
    private String mResult;
    private String mSessionId;

    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x009d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00bc, please report this as an issue */
    public ConfirmBizStatusInfo(CardInfo cardInfo, Bundle bundle, com.miui.tsmclient.model.mitsm.a aVar) {
        String str;
        String string;
        String strB;
        this.mBundle = bundle;
        if (bundle == null) {
            this.mBundle = new Bundle();
        }
        this.mErrorCode = -1;
        this.mOrderSource = this.mBundle.getBoolean(Constants.EXTRA_OUT_OPERATION) ? Constants.OUT_WALLET : Constants.IN_WALLET;
        if (cardInfo.isTransCard()) {
            str = "TRANSIT";
        } else {
            if (!cardInfo.isMiFareCard()) {
                if (cardInfo.isBankCard() || cardInfo.isQrBankCard()) {
                    str = "UNION_PAY";
                }
                this.mBusinessId = this.mBundle.getString("business_id");
                string = this.mBundle.getString("order_id");
                this.mOrderId = string;
                if (TextUtils.isEmpty(string)) {
                    this.mOrderId = this.mBundle.getString("orderId");
                }
                if (this.mBundle.getInt(Constants.EXTRA_TOKEN_ID) == ActionToken.TokenType.issueAndRecharge.getId()) {
                    com.miui.tsmclient.model.mitsm.a aVar2 = com.miui.tsmclient.model.mitsm.a.ISSUE_WITH_RECHARGE;
                    this.mActionType = aVar2.name();
                    strB = aVar2.b();
                } else {
                    this.mActionType = aVar.name();
                    strB = aVar.b();
                }
                this.mCoreOperation = strB;
                if (this.mBundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                    this.mCoreOperation += "Async";
                }
                if (this.mBundle.getBoolean(Constants.EXTRA_PRE_LOAD)) {
                    this.mCoreOperation = "pre" + this.mCoreOperation;
                }
                this.mCardName = cardInfo.mCardType;
            }
            str = "DOOR";
        }
        this.mCardCategory = str;
        this.mBusinessId = this.mBundle.getString("business_id");
        string = this.mBundle.getString("order_id");
        this.mOrderId = string;
        if (TextUtils.isEmpty(string)) {
            this.mOrderId = this.mBundle.getString("orderId");
        }
        if (this.mBundle.getInt(Constants.EXTRA_TOKEN_ID) == ActionToken.TokenType.issueAndRecharge.getId()) {
            com.miui.tsmclient.model.mitsm.a aVar3 = com.miui.tsmclient.model.mitsm.a.ISSUE_WITH_RECHARGE;
            this.mActionType = aVar3.name();
            strB = aVar3.b();
        } else {
            this.mActionType = aVar.name();
            strB = aVar.b();
        }
        this.mCoreOperation = strB;
        if (this.mBundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
            this.mCoreOperation += "Async";
        }
        if (this.mBundle.getBoolean(Constants.EXTRA_PRE_LOAD)) {
            this.mCoreOperation = "pre" + this.mCoreOperation;
        }
        this.mCardName = cardInfo.mCardType;
    }

    public String getActionType() {
        return this.mActionType;
    }

    public String getBusinessId() {
        return this.mBusinessId;
    }

    public String getCardCategory() {
        return this.mCardCategory;
    }

    public String getCardName() {
        return this.mCardName;
    }

    public String getCoreOperation() {
        return this.mCoreOperation;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorDesc() {
        return this.mErrorDesc;
    }

    public String getExtra() {
        return this.mExtra;
    }

    public String getOrderId() {
        return this.mOrderId;
    }

    public String getOrderSource() {
        return this.mOrderSource;
    }

    public String getResult() {
        return this.mResult;
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    public boolean isResultSuccess() {
        return TextUtils.equals(this.mResult, "SUCCESS");
    }

    public void setActionType(String str) {
        this.mActionType = str;
    }

    public void setBusinessId(String str) {
        this.mBusinessId = str;
    }

    public void setCardCategory(String str) {
        this.mCardCategory = str;
    }

    public void setCardName(String str) {
        this.mCardName = str;
    }

    public void setCoreOperation(String str) {
        this.mCoreOperation = str;
    }

    public void setErrorCode(int i) {
        if (this.mErrorCode == -1) {
            this.mErrorCode = i;
            this.mResult = i == 0 ? "SUCCESS" : STATUS_FAILED;
        }
    }

    public void setErrorDesc(String str) {
        this.mErrorDesc = str;
    }

    public void setExtra(String str) {
        this.mExtra = str;
    }

    public void setOrderId(String str) {
        this.mOrderId = str;
    }

    public void setOrderSource(String str) {
        this.mOrderSource = str;
    }

    public void setResult(String str) {
        this.mResult = str;
    }

    public void setSessionId(String str) {
        this.mSessionId = str;
    }

    public BaseResponse upload(Context context) {
        if (this.mErrorCode == 0 && !Arrays.asList(ALLOWED_OPERATIONS).contains(this.mCoreOperation)) {
            return new BaseResponse(0, new Object[0]);
        }
        if (this.mErrorCode > 1000000 && !this.isKeepExtra) {
            this.mExtra = null;
        }
        return h.a(context).a(this);
    }

    public void setExtra(String str, boolean z) {
        this.mExtra = str;
        this.isKeepExtra = z;
    }
}

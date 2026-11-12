package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;

/* JADX INFO: loaded from: classes6.dex */
public class DCEPModeResponse extends CommonResponseInfo {
    public static final String PARAM_DIGITAL_WALLET = "DIGITAL_WALLET";
    public static final String PARAM_IS_ACCOUNT_MODE = "ACCOUNT_MODE";
    public static final String PARAM_IS_VALUE_MODE = "WORTH_MODE";

    @SerializedName("data")
    private DCEPMode mDCEPMode;

    public class DCEPMode {

        @SerializedName(DCEPModeResponse.PARAM_IS_ACCOUNT_MODE)
        private boolean isAccountMode;

        @SerializedName(DCEPModeResponse.PARAM_IS_VALUE_MODE)
        private boolean isValueMode;

        public DCEPMode() {
        }

        public boolean isAccountMode() {
            return this.isAccountMode;
        }

        public boolean isValueMode() {
            return this.isValueMode;
        }
    }

    public DCEPMode getDcepMode() {
        return this.mDCEPMode;
    }

    @Override // com.miui.tsmclient.common.data.CommonResponseInfo
    public boolean isSuccess() {
        return super.isSuccess() && this.mDCEPMode != null;
    }
}

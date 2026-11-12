package com.huawei.watchface.mvp.model.helper.systemparam;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class SystemParamInfo {
    private List<SystemParam> list;

    @SerializedName(alternate = {"resultcode"}, value = "resultCode")
    private String resultCode;

    @SerializedName(alternate = {"resultinfo"}, value = "resultInfo")
    private String resultInfo;

    public static class SystemParam {
        private String paramCode;
        private String paramContent;
        private String paramName;
        private String paramStatus;
        private String strategyId;

        public String getParamCode() {
            return this.paramCode;
        }

        public String getParamContent() {
            return this.paramContent;
        }

        public String getParamName() {
            return this.paramName;
        }

        public String getParamStatus() {
            return this.paramStatus;
        }

        public String getStrategyId() {
            return this.strategyId;
        }

        public void setParamCode(String str) {
            this.paramCode = str;
        }

        public void setParamContent(String str) {
            this.paramContent = str;
        }

        public void setParamName(String str) {
            this.paramName = str;
        }

        public void setParamStatus(String str) {
            this.paramStatus = str;
        }

        public void setStrategyId(String str) {
            this.strategyId = str;
        }
    }

    public List<SystemParam> getList() {
        return this.list;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public String getResultInfo() {
        return this.resultInfo;
    }

    public void setList(List<SystemParam> list) {
        this.list = list;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public void setResultInfo(String str) {
        this.resultInfo = str;
    }
}

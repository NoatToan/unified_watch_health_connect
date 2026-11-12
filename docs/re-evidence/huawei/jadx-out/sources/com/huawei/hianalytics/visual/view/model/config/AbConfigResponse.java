package com.huawei.hianalytics.visual.view.model.config;

import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class AbConfigResponse {
    private int code;
    private String message;
    private AbConfigResult result;

    public static class AbConfigResult {
        private List<FeatureConfigValue> featureConfigValues;

        public static class FeatureConfigValue {
            private String paramKey;
            private String paramValue;

            public String getParamKey() {
                return this.paramKey;
            }

            public String getParamValue() {
                return this.paramValue;
            }

            public void setParamKey(String str) {
                this.paramKey = str;
            }

            public void setParamValue(String str) {
                this.paramValue = str;
            }
        }

        public List<FeatureConfigValue> getFeatureConfigValues() {
            return this.featureConfigValues;
        }
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public AbConfigResult getResult() {
        return this.result;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setResult(AbConfigResult abConfigResult) {
        this.result = abConfigResult;
    }
}

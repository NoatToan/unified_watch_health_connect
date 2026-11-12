package com.huawei.openalliance.ad.beans.parameter;

/* JADX INFO: loaded from: classes12.dex */
public class UiEngineInfo {
    private String cachedStylePkgVer;
    private String cachedTptEgnVer;
    private String h5EngineVer;

    public static final class Builder {
        private String cachedStylePkgVer;
        private String cachedTptEgnVer;
        private String h5EngineVer;

        public Builder c(String str) {
            this.h5EngineVer = str;
            return this;
        }

        public Builder b(String str) {
            this.cachedTptEgnVer = str;
            return this;
        }

        public UiEngineInfo a() {
            UiEngineInfo uiEngineInfo = new UiEngineInfo();
            uiEngineInfo.cachedStylePkgVer = this.cachedStylePkgVer;
            uiEngineInfo.cachedTptEgnVer = this.cachedTptEgnVer;
            uiEngineInfo.h5EngineVer = this.h5EngineVer;
            return uiEngineInfo;
        }

        public Builder a(String str) {
            this.cachedStylePkgVer = str;
            return this;
        }
    }

    public String b() {
        return this.cachedTptEgnVer;
    }

    public String a() {
        return this.cachedStylePkgVer;
    }
}

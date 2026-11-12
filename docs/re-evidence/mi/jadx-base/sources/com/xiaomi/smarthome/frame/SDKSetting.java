package com.xiaomi.smarthome.frame;

/* JADX INFO: loaded from: classes2.dex */
public class SDKSetting {
    public static boolean ENABLE_CORE_SERVICE_WHITE_LIST;

    public static class Builder {
        boolean enableCoreServiceWhiteList;
        boolean enableCoreServiceWhiteList_IsSet = false;

        public SDKSetting build() {
            if (this.enableCoreServiceWhiteList_IsSet) {
                return new SDKSetting(this);
            }
            throw new RuntimeException("CoreServiceWhiteList not set");
        }

        public Builder enableCoreServiceWhiteList(boolean z) {
            this.enableCoreServiceWhiteList = z;
            this.enableCoreServiceWhiteList_IsSet = true;
            return this;
        }
    }

    private SDKSetting(Builder builder) {
        ENABLE_CORE_SERVICE_WHITE_LIST = builder.enableCoreServiceWhiteList;
    }
}

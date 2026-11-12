package com.xiaomi.smarthome.cache;

import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes4.dex */
public class SmartConfigCache {
    private static final String KEY_MCU_VERSION = "SMART.CONFIG.KEY.MCU.VERSION";
    private static final String KEY_USE_HOST_OBJ = "SMART.CONFIG.KEY.USE_HOST_OBJ";
    private static final String MMKV_NAME = "smart.config.cache";

    public static final class Holder {
        public static final SmartConfigCache INSTANCE = new SmartConfigCache();
    }

    public static SmartConfigCache getInstance() {
        return Holder.INSTANCE;
    }

    public MMKV getCache() {
        return MMKV.G(MMKV_NAME, 2);
    }

    public String getMcuVersion(String str) {
        return MMKV.G(MMKV_NAME, 2).j(KEY_MCU_VERSION + str);
    }

    public boolean setMcuVersion(String str, String str2) {
        return MMKV.G(MMKV_NAME, 2).u(KEY_MCU_VERSION + str, str2);
    }

    public void setUseHostObj(boolean z) {
        MMKV.G(MMKV_NAME, 2).w(KEY_USE_HOST_OBJ, z);
    }

    public boolean useBleHostObj() {
        return MMKV.G(MMKV_NAME, 2).c(KEY_USE_HOST_OBJ);
    }

    private SmartConfigCache() {
    }
}

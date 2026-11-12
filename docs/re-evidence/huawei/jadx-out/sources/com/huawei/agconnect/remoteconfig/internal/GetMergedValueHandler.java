package com.huawei.agconnect.remoteconfig.internal;

import com.huawei.agconnect.remoteconfig.AGConnectConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class GetMergedValueHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConfigValuesImpl f5060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConfigValuesImpl f5061b;

    String e(String str) {
        ConfigValuesImpl configValuesImpl;
        ConfigValuesImpl configValuesImpl2 = this.f5060a;
        if (configValuesImpl2 == null || !configValuesImpl2.containKey(str)) {
            ConfigValuesImpl configValuesImpl3 = this.f5061b;
            if (configValuesImpl3 == null || !configValuesImpl3.containKey(str)) {
                return "";
            }
            configValuesImpl = this.f5061b;
        } else {
            configValuesImpl = this.f5060a;
        }
        return configValuesImpl.getValueAsString(str);
    }

    long d(String str) {
        ConfigValuesImpl configValuesImpl;
        ConfigValuesImpl configValuesImpl2 = this.f5060a;
        if (configValuesImpl2 == null || !configValuesImpl2.containKey(str)) {
            ConfigValuesImpl configValuesImpl3 = this.f5061b;
            if (configValuesImpl3 == null || !configValuesImpl3.containKey(str)) {
                return 0L;
            }
            configValuesImpl = this.f5061b;
        } else {
            configValuesImpl = this.f5060a;
        }
        return configValuesImpl.getValueAsLong(str).longValue();
    }

    double c(String str) {
        ConfigValuesImpl configValuesImpl;
        ConfigValuesImpl configValuesImpl2 = this.f5060a;
        if (configValuesImpl2 == null || !configValuesImpl2.containKey(str)) {
            ConfigValuesImpl configValuesImpl3 = this.f5061b;
            if (configValuesImpl3 == null || !configValuesImpl3.containKey(str)) {
                return 0.0d;
            }
            configValuesImpl = this.f5061b;
        } else {
            configValuesImpl = this.f5060a;
        }
        return configValuesImpl.getValueAsDouble(str).doubleValue();
    }

    byte[] b(String str) {
        ConfigValuesImpl configValuesImpl;
        ConfigValuesImpl configValuesImpl2 = this.f5060a;
        if (configValuesImpl2 == null || !configValuesImpl2.containKey(str)) {
            ConfigValuesImpl configValuesImpl3 = this.f5061b;
            if (configValuesImpl3 == null || !configValuesImpl3.containKey(str)) {
                return AGConnectConfig.DEFAULT.BYTE_ARRAY_VALUE;
            }
            configValuesImpl = this.f5061b;
        } else {
            configValuesImpl = this.f5060a;
        }
        return configValuesImpl.getValueAsByteArray(str);
    }

    boolean a(String str) {
        ConfigValuesImpl configValuesImpl;
        ConfigValuesImpl configValuesImpl2 = this.f5060a;
        if (configValuesImpl2 == null || !configValuesImpl2.containKey(str)) {
            ConfigValuesImpl configValuesImpl3 = this.f5061b;
            if (configValuesImpl3 == null || !configValuesImpl3.containKey(str)) {
                return false;
            }
            configValuesImpl = this.f5061b;
        } else {
            configValuesImpl = this.f5060a;
        }
        return configValuesImpl.getValueAsBoolean(str).booleanValue();
    }

    Map<String, Object> a() {
        HashMap map = new HashMap();
        map.putAll(this.f5061b.c());
        map.putAll(this.f5060a.c());
        return map;
    }

    GetMergedValueHandler(ConfigValuesImpl configValuesImpl, ConfigValuesImpl configValuesImpl2) {
        this.f5060a = configValuesImpl;
        this.f5061b = configValuesImpl2;
    }
}

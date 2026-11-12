package com.huawei.agconnect.remoteconfig;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.remoteconfig.internal.AGConnectConfigImpl;
import com.huawei.hmf.tasks.Task;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AGConnectConfig {
    private static final Map<String, AGConnectConfig> SERVICES_MAP = new HashMap();
    private static final String TAG = "AGConnectConfig";

    /* JADX INFO: loaded from: classes22.dex */
    public static final class DEFAULT {
        public static final boolean BOOLEAN_VALUE = false;
        public static final byte[] BYTE_ARRAY_VALUE = new byte[0];
        public static final double DOUBLE_VALUE = 0.0d;
        public static final long LONG_VALUE = 0;
        public static final String STRING_VALUE = "";
    }

    /* JADX INFO: loaded from: classes22.dex */
    public enum SOURCE {
        STATIC,
        DEFAULT,
        REMOTE
    }

    public abstract void apply(ConfigValues configValues);

    public abstract void applyDefault(int i);

    public abstract void applyDefault(Map<String, Object> map);

    public abstract void clearAll();

    public abstract Task<ConfigValues> fetch();

    public abstract Task<ConfigValues> fetch(long j);

    public abstract Task<ConfigValues> fetchDiscrete(long j, long j2);

    public abstract Map<String, String> getCustomAttributes();

    public abstract boolean getEnableCollectUserPrivacy();

    public abstract Map<String, Object> getMergedAll();

    public abstract SOURCE getSource(String str);

    public abstract Boolean getValueAsBoolean(String str);

    public abstract byte[] getValueAsByteArray(String str);

    public abstract Double getValueAsDouble(String str);

    public abstract Long getValueAsLong(String str);

    public abstract String getValueAsString(String str);

    public abstract ConfigValues loadLastFetched();

    public abstract void setCustomAttributes(Map<String, String> map);

    public abstract void setDeveloperMode(boolean z);

    public abstract void setEnableCollectUserPrivacy(boolean z);

    public static AGConnectConfig getInstance(AGConnectInstance aGConnectInstance) {
        AGConnectConfig aGConnectConfigImpl;
        if (aGConnectInstance == null) {
            throw new NullPointerException("AGConnectInstance can not be null.");
        }
        AGConnectConfig aGConnectConfig = (AGConnectConfig) aGConnectInstance.getService(AGConnectConfigImpl.class);
        if (aGConnectConfig != null) {
            return aGConnectConfig;
        }
        synchronized (AGConnectConfig.class) {
            Map<String, AGConnectConfig> map = SERVICES_MAP;
            aGConnectConfigImpl = map.get(aGConnectInstance.getIdentifier());
            if (aGConnectConfigImpl == null) {
                Logger.i(TAG, "init config with constructor.");
                aGConnectConfigImpl = new AGConnectConfigImpl(aGConnectInstance.getContext(), aGConnectInstance);
                map.put(aGConnectInstance.getIdentifier(), aGConnectConfigImpl);
            }
        }
        return aGConnectConfigImpl;
    }

    public static AGConnectConfig getInstance() {
        AGConnectInstance aGConnectInstance = AGConnectInstance.getInstance();
        if (aGConnectInstance != null) {
            return getInstance(aGConnectInstance);
        }
        throw new NullPointerException("The AGConnect SDK is not initialized. Please call the 'AGConnectInstance.initialize()' method first.");
    }
}

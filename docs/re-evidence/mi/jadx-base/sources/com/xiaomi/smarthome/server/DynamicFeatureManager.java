package com.xiaomi.smarthome.server;

import androidx.collection.ArrayMap;
import com.xiaomi.smarthome.core.entity.externalload.LoadInfo;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.core.server.internal.plugin.util.Callback;
import com.xiaomi.smarthome.server.callback.PluginCancelDownloadCallback;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum DynamicFeatureManager {
    instance;

    private static final String PREFIX_PATH = "df://";
    private static final String TAG = "DynamicFeatureManager";
    private final Map<String, PluginPackageInfo> mMap = new ArrayMap();

    public static abstract class DynamicFeatureCallback {
        private final String info;

        public DynamicFeatureCallback(String str) {
            this.info = str;
        }

        public void onCancel(String str) {
        }

        public abstract void onFailure(String str, int i);

        public void onProgress(String str, float f) {
        }

        public abstract void onSuccess(String str, PluginPackageInfo pluginPackageInfo);
    }

    DynamicFeatureManager() {
    }

    private PluginPackageInfo getFeatureInfo(String str) {
        Map<String, PluginPackageInfo> map = this.mMap;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    private String getFeaturePackageName(String str) {
        PluginPackageInfo featureInfo = getFeatureInfo(str);
        if (featureInfo == null) {
            return null;
        }
        return featureInfo.getPackagePath().replace(PREFIX_PATH, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$downloadPlugin$0(DynamicFeatureCallback dynamicFeatureCallback, LoadInfo loadInfo) throws RuntimeException {
        int status = loadInfo.getStatus();
        if (status == 1) {
            dynamicFeatureCallback.onProgress(dynamicFeatureCallback.info, loadInfo.getProgress());
            return null;
        }
        if (status == 3) {
            dynamicFeatureCallback.onSuccess(dynamicFeatureCallback.info, getPluginPackageInfo(dynamicFeatureCallback.info));
            return null;
        }
        if (status != 4) {
            return null;
        }
        dynamicFeatureCallback.onFailure(dynamicFeatureCallback.info, (int) loadInfo.getProgress());
        return null;
    }

    public void cancelPluginDownload(String str, com.xiaomi.smarthome.core.entity.plugin.PluginDownloadTask pluginDownloadTask, PluginCancelDownloadCallback pluginCancelDownloadCallback) {
    }

    public void downloadPlugin(String str, final DynamicFeatureCallback dynamicFeatureCallback) {
        if (dynamicFeatureCallback == null) {
            return;
        }
        String featurePackageName = getFeaturePackageName(str);
        if (isInstalled(featurePackageName)) {
            dynamicFeatureCallback.onSuccess(featurePackageName, getPluginPackageInfo(featurePackageName));
        } else {
            PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().loadExternal(featurePackageName, new Callback() { // from class: h77
                @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.Callback
                public final Object call(Object obj) {
                    return this.f19771a.lambda$downloadPlugin$0(dynamicFeatureCallback, (LoadInfo) obj);
                }
            });
        }
    }

    public PluginPackageInfo getDownloadPluginPackageInfo(long j) {
        Map<String, PluginPackageInfo> map = this.mMap;
        if (map == null) {
            return null;
        }
        for (Map.Entry<String, PluginPackageInfo> entry : map.entrySet()) {
            PluginPackageInfo value = entry.getValue();
            if (isInstalled(entry.getKey()) && value.getPackageId() == j) {
                return value;
            }
        }
        return null;
    }

    public int getFeatureSize() {
        Map<String, PluginPackageInfo> map = this.mMap;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public PluginPackageInfo getPluginPackageInfo(String str) {
        Map<String, PluginPackageInfo> map = this.mMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public void installPlugin(String str, DynamicFeatureCallback dynamicFeatureCallback) {
        downloadPlugin(str, dynamicFeatureCallback);
    }

    public boolean isDynamicFeature(String str) {
        return getFeatureInfo(str) != null;
    }

    public boolean isDynamicFeaturePath(String str) {
        return str != null && str.startsWith(PREFIX_PATH);
    }

    public boolean isInstalled(String str) {
        PluginPackageInfo featureInfo = getFeatureInfo(str);
        if (featureInfo == null) {
            return false;
        }
        boolean z = PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().getLoadInfoStatus(str) == 3;
        if (!z) {
            try {
                Class.forName(featureInfo.getPackageName());
                return true;
            } catch (ClassNotFoundException unused) {
            }
        }
        return z;
    }
}

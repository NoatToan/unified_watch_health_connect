package com.xiaomi.smarthome.server;

import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class InnerPluginPackageManager {
    private static volatile InnerPluginPackageManager mInstance;
    private HashMap<String, PluginPackageInfo> mDownloadPackageMap = new HashMap<>();

    private InnerPluginPackageManager() {
        init();
    }

    private PluginPackageInfo createPluginPackageInfo(long j, long j2, int i, String str, String str2, int i2, List<String> list) {
        PluginPackageInfo pluginPackageInfo = new PluginPackageInfo();
        pluginPackageInfo.setPluginId(j);
        pluginPackageInfo.setPackageId(j2);
        pluginPackageInfo.setDeveloperId(1L);
        pluginPackageInfo.setMinApiLevel(i);
        pluginPackageInfo.setPlatform(PluginPackageConstant.RN_DIR_A);
        pluginPackageInfo.setVersion(i2);
        pluginPackageInfo.setPackageType("rn");
        pluginPackageInfo.setPackagePath(str);
        pluginPackageInfo.setPackageName(str2);
        pluginPackageInfo.setModelList(list);
        pluginPackageInfo.setLastModifiedTime(System.currentTimeMillis());
        return pluginPackageInfo;
    }

    public static InnerPluginPackageManager getInstance() {
        if (mInstance == null) {
            synchronized (InnerPluginPackageManager.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new InnerPluginPackageManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mInstance;
    }

    private void init() {
        initDownloadPackageMap();
    }

    private void initDownloadPackageMap() {
        this.mDownloadPackageMap.clear();
    }

    public void addInnerPluginPackageInfo(String str, long j, long j2, int i, String str2, String str3, int i2, List<String> list) {
        this.mDownloadPackageMap.put(str, createPluginPackageInfo(j, j2, i, str2, str3, i2, list));
    }

    public List<String> getInnerPluginModes() {
        ArrayList arrayList = new ArrayList();
        HashMap<String, PluginPackageInfo> map = this.mDownloadPackageMap;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    public PluginPackageInfo getInnerPluginPackageInfo(String str) {
        return this.mDownloadPackageMap.get(str);
    }

    public boolean isInnerPluginModel(String str) {
        return this.mDownloadPackageMap.containsKey(str);
    }
}

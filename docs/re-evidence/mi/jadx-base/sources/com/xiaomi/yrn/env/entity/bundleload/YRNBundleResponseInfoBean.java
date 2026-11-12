package com.xiaomi.yrn.env.entity.bundleload;

import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import defpackage.sk1;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class YRNBundleResponseInfoBean implements Serializable {
    protected String appName;
    protected int maxNativeApiLevel;
    protected List<YRNBundleInfo> modules;
    protected String platform;
    protected String rnEngineVersion;

    public static void updateModules(String str, YRNBundleResponseInfoBean yRNBundleResponseInfoBean) {
        sk1.d(str, "appName can not be empty!");
        if (yRNBundleResponseInfoBean.getModules() == null || yRNBundleResponseInfoBean.getModules().isEmpty()) {
            return;
        }
        Iterator<YRNBundleInfo> it = yRNBundleResponseInfoBean.getModules().iterator();
        while (it.hasNext()) {
            it.next().setAppName(str);
        }
    }

    public String getAppName() {
        return this.appName;
    }

    public int getMaxNativeApiLevel() {
        return this.maxNativeApiLevel;
    }

    public List<YRNBundleInfo> getModules() {
        return this.modules;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getRnEngineVersion() {
        return this.rnEngineVersion;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setMaxNativeApiLevel(int i) {
        this.maxNativeApiLevel = i;
    }

    public void setModules(List<YRNBundleInfo> list) {
        this.modules = list;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setRnEngineVersion(String str) {
        this.rnEngineVersion = str;
    }
}

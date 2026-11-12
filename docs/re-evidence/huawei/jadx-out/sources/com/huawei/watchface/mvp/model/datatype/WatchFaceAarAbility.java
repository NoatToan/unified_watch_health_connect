package com.huawei.watchface.mvp.model.datatype;

/* JADX INFO: loaded from: classes45.dex */
public class WatchFaceAarAbility {
    private boolean enableAnrCollect;
    private boolean enableReloadOnConfigChange = true;
    private boolean enableWebViewUrlCache;

    public boolean getEnableAnrCollect() {
        return this.enableAnrCollect;
    }

    public boolean isEnableReloadOnConfigChange() {
        return this.enableReloadOnConfigChange;
    }

    public boolean isEnableWebViewUrlCache() {
        return this.enableWebViewUrlCache;
    }

    public void setEnableAnrCollect(boolean z) {
        this.enableAnrCollect = z;
    }

    public void setEnableReloadOnConfigChange(boolean z) {
        this.enableReloadOnConfigChange = z;
    }

    public void setEnableWebViewUrlCache(boolean z) {
        this.enableWebViewUrlCache = z;
    }
}

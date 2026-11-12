package com.huawei.health.h5pro.jsbridge.system.share;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.operation.utils.Constants;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public class ShareObj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(Constants.BI_MODULE_ID)
    private String f6890a = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(KnitFragment.KEY_EXTRA)
    private Map<String, Object> f6891c;

    @SerializedName("sharePlatform")
    private int[] d;

    @SerializedName("shareBiMap")
    private Map<String, Object> e;

    public Map<String, Object> getExtra() {
        return this.f6891c;
    }

    public String getModuleId() {
        return this.f6890a;
    }

    public Map<String, Object> getShareBiMap() {
        return this.e;
    }

    public int[] getSharePlatform() {
        return this.d;
    }

    public void setExtra(Map<String, Object> map) {
        this.f6891c = map;
    }

    public void setModuleId(String str) {
        this.f6890a = str;
    }

    public void setShareBiMap(Map<String, Object> map) {
        this.e = map;
    }

    public void setSharePlatform(int[] iArr) {
        this.d = iArr;
    }
}

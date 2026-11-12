package com.huawei.health.h5pro.jsbridge.system.shareplus;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.operation.utils.Constants;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public class SharePlusParam {

    @SerializedName(KnitFragment.KEY_EXTRA)
    private Map<String, Object> d;

    @SerializedName("shareBiMap")
    private Map<String, Object> h;

    @SerializedName("type")
    private String o = "";

    @SerializedName("text")
    private String k = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("base64")
    private String f6901a = "";

    @SerializedName("uri")
    private String m = "";

    @SerializedName(ContentResource.FILE_NAME)
    private String e = "";

    @SerializedName(Constants.BI_MODULE_ID)
    private String f = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("filePath")
    private String f6902b = "";

    @SerializedName("mineType")
    private String j = "";

    @SerializedName("mimeType")
    private String g = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("distList")
    private List<String> f6903c = null;

    @SerializedName("isReport")
    private boolean i = false;

    public String getBase64() {
        return this.f6901a;
    }

    public List<String> getDistList() {
        return this.f6903c;
    }

    public Map<String, Object> getExtra() {
        return this.d;
    }

    public String getFileName() {
        return this.e;
    }

    public String getFilePath() {
        return this.f6902b;
    }

    public String getMimeType() {
        return TextUtils.isEmpty(this.g) ? this.j : this.g;
    }

    public String getModuleId() {
        return this.f;
    }

    public Map<String, Object> getShareBiMap() {
        return this.h;
    }

    public String getText() {
        return this.k;
    }

    public String getType() {
        return this.o;
    }

    public String getUri() {
        return this.m;
    }

    public boolean isReport() {
        return this.i;
    }

    public void setBase64(String str) {
        this.f6901a = str;
    }

    public void setDistList(List<String> list) {
        this.f6903c = list;
    }

    public void setExtra(Map<String, Object> map) {
        this.d = map;
    }

    public void setFileName(String str) {
        this.e = str;
    }

    public void setFilePath(String str) {
        this.f6902b = str;
    }

    public void setIsReport(boolean z) {
        this.i = z;
    }

    public void setMimeType(String str) {
        this.g = str;
    }

    public void setMineType(String str) {
        this.j = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.g = str;
    }

    public void setModuleId(String str) {
        this.f = str;
    }

    public void setShareBiMap(Map<String, Object> map) {
        this.h = map;
    }

    public void setText(String str) {
        this.k = str;
    }

    public void setType(String str) {
        this.o = str;
    }

    public void setUri(String str) {
        this.m = str;
    }
}

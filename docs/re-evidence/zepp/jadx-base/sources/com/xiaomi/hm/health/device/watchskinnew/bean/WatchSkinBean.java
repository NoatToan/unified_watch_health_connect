package com.xiaomi.hm.health.device.watchskinnew.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.watch.companion.ximalaya.XimalayaConst;
import com.loc.z;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b9\u0010:R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010 \u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R$\u0010$\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010R$\u0010(\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010\u000e\"\u0004\b'\u0010\u0010R\"\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR$\u00100\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010\f\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010R$\u00108\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/bean/WatchSkinBean;", "", "", "a", "Ljava/lang/Integer;", "getId", "()Ljava/lang/Integer;", WebConst.QueryParam.SET_ID, "(Ljava/lang/Integer;)V", "id", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "c", "getDescription", "setDescription", "description", GoogleApiAvailabilityLight.a, LogUtil.I, "getSize", "()I", "setSize", "(I)V", "size", "e", "getVersion", "setVersion", "version", "f", "getImage", "setImage", "image", "g", "getDownloadUrl", "setDownloadUrl", XimalayaConst.DOWNLOAD_URL, "h", "getDownloadTimes", "setDownloadTimes", "downloadTimes", "i", "getHelpLink", "setHelpLink", "helpLink", "Lcom/xiaomi/hm/health/device/watchskinnew/bean/Metas;", z.j, "Lcom/xiaomi/hm/health/device/watchskinnew/bean/Metas;", "getMetas", "()Lcom/xiaomi/hm/health/device/watchskinnew/bean/Metas;", "setMetas", "(Lcom/xiaomi/hm/health/device/watchskinnew/bean/Metas;)V", "metas", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchSkinBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("id")
    @Nullable
    private Integer id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("name")
    @Nullable
    private String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("description")
    @Nullable
    private String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("size")
    private int size;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("version")
    @Nullable
    private String version;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("image")
    @Nullable
    private String image;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("download_url")
    @Nullable
    private String downloadUrl;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("download_times")
    private int downloadTimes = 10;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName("helper_link")
    @Nullable
    private String helpLink;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @SerializedName("metas")
    @Nullable
    private Metas metas;

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final int getDownloadTimes() {
        return this.downloadTimes;
    }

    @Nullable
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Nullable
    public final String getHelpLink() {
        return this.helpLink;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final Metas getMetas() {
        return this.metas;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getSize() {
        return this.size;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setDownloadTimes(int i) {
        this.downloadTimes = i;
    }

    public final void setDownloadUrl(@Nullable String str) {
        this.downloadUrl = str;
    }

    public final void setHelpLink(@Nullable String str) {
        this.helpLink = str;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setImage(@Nullable String str) {
        this.image = str;
    }

    public final void setMetas(@Nullable Metas metas) {
        this.metas = metas;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }
}

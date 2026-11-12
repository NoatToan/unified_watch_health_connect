package com.xiaomi.hm.health.device.watchskinnew.bean;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.watch.companion.ximalaya.XimalayaConst;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.loc.z;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bA\u0010BR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010$\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00104\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010\f\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u0010\u0010R$\u0010<\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010@\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010\f\u001a\u0004\b>\u0010\u000e\"\u0004\b?\u0010\u0010¨\u0006C"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/bean/Data;", "", "", "a", "Ljava/lang/Integer;", "getId", "()Ljava/lang/Integer;", WebConst.QueryParam.SET_ID, "(Ljava/lang/Integer;)V", "id", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "", "c", "Ljava/lang/Boolean;", "isFree", "()Ljava/lang/Boolean;", "setFree", "(Ljava/lang/Boolean;)V", "", GoogleApiAvailabilityLight.a, "Ljava/lang/Float;", "getPrice", "()Ljava/lang/Float;", "setPrice", "(Ljava/lang/Float;)V", FirebaseAnalytics.Param.PRICE, "e", "getRank", "setRank", WatchFaceDetailActivity.FROM_RANK, "f", "getCustomizable", "setCustomizable", "customizable", "", "g", "Ljava/lang/Long;", "getSize", "()Ljava/lang/Long;", "setSize", "(Ljava/lang/Long;)V", "size", "h", "getImage", "setImage", "image", "Lcom/xiaomi/hm/health/device/watchskinnew/bean/MetasNew;", "i", "Lcom/xiaomi/hm/health/device/watchskinnew/bean/MetasNew;", "getMetas", "()Lcom/xiaomi/hm/health/device/watchskinnew/bean/MetasNew;", "setMetas", "(Lcom/xiaomi/hm/health/device/watchskinnew/bean/MetasNew;)V", "metas", z.j, "getDownloadUrl", "setDownloadUrl", XimalayaConst.DOWNLOAD_URL, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class Data {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("id")
    @Nullable
    private Integer id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("name")
    @Nullable
    private String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("is_free")
    @Nullable
    private Boolean isFree;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @Nullable
    private Float price;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName(WatchFaceDetailActivity.FROM_RANK)
    @Nullable
    private Float rank;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("customizable")
    @Nullable
    private Boolean customizable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("size")
    @Nullable
    private Long size;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("image")
    @Nullable
    private String image;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName("metas")
    @Nullable
    private MetasNew metas;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @SerializedName("download_url")
    @Nullable
    private String downloadUrl;

    @Nullable
    public final Boolean getCustomizable() {
        return this.customizable;
    }

    @Nullable
    public final String getDownloadUrl() {
        return this.downloadUrl;
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
    public final MetasNew getMetas() {
        return this.metas;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Float getPrice() {
        return this.price;
    }

    @Nullable
    public final Float getRank() {
        return this.rank;
    }

    @Nullable
    public final Long getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: isFree, reason: from getter */
    public final Boolean getIsFree() {
        return this.isFree;
    }

    public final void setCustomizable(@Nullable Boolean bool) {
        this.customizable = bool;
    }

    public final void setDownloadUrl(@Nullable String str) {
        this.downloadUrl = str;
    }

    public final void setFree(@Nullable Boolean bool) {
        this.isFree = bool;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setImage(@Nullable String str) {
        this.image = str;
    }

    public final void setMetas(@Nullable MetasNew metasNew) {
        this.metas = metasNew;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPrice(@Nullable Float f) {
        this.price = f;
    }

    public final void setRank(@Nullable Float f) {
        this.rank = f;
    }

    public final void setSize(@Nullable Long l) {
        this.size = l;
    }
}

package com.huami.watch.companion.watchface.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.watch.companion.ximalaya.XimalayaConst;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR$\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR$\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R$\u0010%\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u000b\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000fR$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/huami/watch/companion/watchface/bean/WatchSkinBean;", "Ljava/io/Serializable;", "", "id", "Ljava/lang/Integer;", "getId", "()Ljava/lang/Integer;", WebConst.QueryParam.SET_ID, "(Ljava/lang/Integer;)V", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "description", "getDescription", "setDescription", "size", LogUtil.I, "getSize", "()I", "setSize", "(I)V", "version", "getVersion", "setVersion", "image", "getImage", "setImage", XimalayaConst.DOWNLOAD_URL, "getDownloadUrl", "setDownloadUrl", "downloadTimes", "getDownloadTimes", "setDownloadTimes", "helpLink", "getHelpLink", "setHelpLink", "Lcom/huami/watch/companion/watchface/bean/Metas;", "metas", "Lcom/huami/watch/companion/watchface/bean/Metas;", "getMetas", "()Lcom/huami/watch/companion/watchface/bean/Metas;", "setMetas", "(Lcom/huami/watch/companion/watchface/bean/Metas;)V", "<init>", "()V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class WatchSkinBean implements Serializable {

    @SerializedName("description")
    @Nullable
    private String description;

    @SerializedName("download_times")
    private int downloadTimes = 10;

    @SerializedName("download_url")
    @Nullable
    private String downloadUrl;

    @SerializedName("helper_link")
    @Nullable
    private String helpLink;

    @SerializedName("id")
    @Nullable
    private Integer id;

    @SerializedName("image")
    @Nullable
    private String image;

    @SerializedName("metas")
    @Nullable
    private Metas metas;

    @SerializedName("name")
    @Nullable
    private String name;

    @SerializedName("size")
    private int size;

    @SerializedName("version")
    @Nullable
    private String version;

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

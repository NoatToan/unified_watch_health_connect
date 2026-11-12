package com.xiaomi.hm.health.device.watchskinstore.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.huami.ad.Constants;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.watch.companion.ximalaya.XimalayaConst;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0002VWB\t\b\u0016¢\u0006\u0004\bR\u0010SB!\b\u0016\u0012\u0006\u0010F\u001a\u00020\u0007\u0012\u0006\u0010H\u001a\u00020\n\u0012\u0006\u0010J\u001a\u00020\u0007¢\u0006\u0004\bR\u0010TB\u0011\b\u0016\u0012\u0006\u0010L\u001a\u00020\u0003¢\u0006\u0004\bR\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\bR\u0010UJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\"\u0010*\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010!R$\u0010-\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0013\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\"\u00100\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010#\u001a\u0004\b1\u0010%\"\u0004\b2\u0010'R\"\u00103\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\r\u001a\u0004\b4\u0010\u000f\"\u0004\b5\u0010\u0011R\"\u00106\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010#\u001a\u0004\b7\u0010%\"\u0004\b8\u0010'R$\u00109\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0013\u001a\u0004\b:\u0010\u0015\"\u0004\b;\u0010\u0017R$\u0010<\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010\u0013\u001a\u0004\b=\u0010\u0015\"\u0004\b>\u0010\u0017R$\u0010@\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010F\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010#\u001a\u0004\bF\u0010%\"\u0004\bG\u0010'R$\u0010H\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\u0013\u001a\u0004\bI\u0010\u0015\"\u0004\bG\u0010\u0017R\"\u0010J\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010#\u001a\u0004\bJ\u0010%\"\u0004\bK\u0010'R\u0016\u0010L\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010\rR\"\u0010M\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010#\u001a\u0004\bM\u0010%\"\u0004\bN\u0010'R\"\u0010O\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\r\u001a\u0004\bP\u0010\u000f\"\u0004\bQ\u0010\u0011¨\u0006X"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinBean;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "Ljava/io/Serializable;", "", "getItemType", "", "o", "", "equals", "hashCode", "", "toString", "id", LogUtil.I, "getId", "()I", WebConst.QueryParam.SET_ID, "(I)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "description", "getDescription", "setDescription", "", WatchFaceDetailActivity.FROM_RANK, "F", "getRank", "()F", "setRank", "(F)V", "favorited", "Z", "getFavorited", "()Z", "setFavorited", "(Z)V", "isFree", "setFree", FirebaseAnalytics.Param.PRICE, "getPrice", "setPrice", TrainingWebConst.QueryParam.SKUID, "getSkuId", "setSkuId", "downloadable", "getDownloadable", "setDownloadable", "size", "getSize", "setSize", "customizable", "getCustomizable", "setCustomizable", "image", "getImage", "setImage", XimalayaConst.DOWNLOAD_URL, "getDownloadUrl", "setDownloadUrl", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinBean$MetasBean;", "metas", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinBean$MetasBean;", "getMetas", "()Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinBean$MetasBean;", "setMetas", "(Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinBean$MetasBean;)V", "isHeader", "setHeader", "header", "getHeader", "isMore", "setMore", "itemType", "isLocal", "setLocal", "selectColor", "getSelectColor", "setSelectColor", "<init>", "()V", "(ZLjava/lang/String;Z)V", "(ILjava/lang/String;)V", "Companion", "MetasBean", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchSkinBean implements MultiItemEntity, Serializable {
    public static final int TYPE_ITEM = 0;
    public static final int TYPE_ITEM_EMPTY = 3;
    public static final int TYPE_ITEM_MORE = 2;
    private boolean customizable;

    @Nullable
    private String description;

    @SerializedName("download_url")
    @Nullable
    private String downloadUrl;
    private boolean downloadable;
    private boolean favorited;

    @Nullable
    private String header;
    private int id;

    @Nullable
    private String image;

    @SerializedName("is_free")
    private boolean isFree;
    private boolean isHeader;
    private boolean isLocal;
    private boolean isMore;
    private int itemType;

    @Nullable
    private MetasBean metas;

    @Nullable
    private String name;
    private float price;
    private float rank;
    private int selectColor;
    private int size;

    @SerializedName("sku_id")
    @Nullable
    private String skuId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinBean$MetasBean;", "Ljava/io/Serializable;", "", "toString", "badge", "Ljava/lang/String;", "getBadge", "()Ljava/lang/String;", "setBadge", "(Ljava/lang/String;)V", "minimumFirmwareVersion", "getMinimumFirmwareVersion", "setMinimumFirmwareVersion", "transparentBackground", "getTransparentBackground", "setTransparentBackground", Constants.GIF_PATH, "getGif", "setGif", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class MetasBean implements Serializable {

        @Nullable
        private String badge;

        @Nullable
        private String gif;

        @SerializedName("minimum_firmware_version")
        @Nullable
        private String minimumFirmwareVersion;

        @SerializedName("transparent_background")
        @Nullable
        private String transparentBackground;

        @Nullable
        public final String getBadge() {
            return this.badge;
        }

        @Nullable
        public final String getGif() {
            return this.gif;
        }

        @Nullable
        public final String getMinimumFirmwareVersion() {
            return this.minimumFirmwareVersion;
        }

        @Nullable
        public final String getTransparentBackground() {
            return this.transparentBackground;
        }

        public final void setBadge(@Nullable String str) {
            this.badge = str;
        }

        public final void setGif(@Nullable String str) {
            this.gif = str;
        }

        public final void setMinimumFirmwareVersion(@Nullable String str) {
            this.minimumFirmwareVersion = str;
        }

        public final void setTransparentBackground(@Nullable String str) {
            this.transparentBackground = str;
        }

        @NotNull
        public String toString() {
            return "MetasBean(badge=" + this.badge + ", minimumFirmwareVersion=" + this.minimumFirmwareVersion + ", transparentBackground=" + this.transparentBackground + ", gif=" + this.gif + ")";
        }
    }

    public WatchSkinBean() {
    }

    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        return o != null && Intrinsics.areEqual(WatchSkinBean.class, o.getClass()) && this.id == ((WatchSkinBean) o).id;
    }

    public final boolean getCustomizable() {
        return this.customizable;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final boolean getDownloadable() {
        return this.downloadable;
    }

    public final boolean getFavorited() {
        return this.favorited;
    }

    @Nullable
    public final String getHeader() {
        return this.header;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }

    @Nullable
    public final MetasBean getMetas() {
        return this.metas;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final float getPrice() {
        return this.price;
    }

    public final float getRank() {
        return this.rank;
    }

    public final int getSelectColor() {
        return this.selectColor;
    }

    public final int getSize() {
        return this.size;
    }

    @Nullable
    public final String getSkuId() {
        return this.skuId;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.id));
    }

    /* JADX INFO: renamed from: isFree, reason: from getter */
    public final boolean getIsFree() {
        return this.isFree;
    }

    /* JADX INFO: renamed from: isHeader, reason: from getter */
    public final boolean getIsHeader() {
        return this.isHeader;
    }

    /* JADX INFO: renamed from: isLocal, reason: from getter */
    public final boolean getIsLocal() {
        return this.isLocal;
    }

    /* JADX INFO: renamed from: isMore, reason: from getter */
    public final boolean getIsMore() {
        return this.isMore;
    }

    public final void setCustomizable(boolean z) {
        this.customizable = z;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setDownloadUrl(@Nullable String str) {
        this.downloadUrl = str;
    }

    public final void setDownloadable(boolean z) {
        this.downloadable = z;
    }

    public final void setFavorited(boolean z) {
        this.favorited = z;
    }

    public final void setFree(boolean z) {
        this.isFree = z;
    }

    public final void setHeader(boolean z) {
        this.isHeader = z;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setImage(@Nullable String str) {
        this.image = str;
    }

    public final void setLocal(boolean z) {
        this.isLocal = z;
    }

    public final void setMetas(@Nullable MetasBean metasBean) {
        this.metas = metasBean;
    }

    public final void setMore(boolean z) {
        this.isMore = z;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPrice(float f) {
        this.price = f;
    }

    public final void setRank(float f) {
        this.rank = f;
    }

    public final void setSelectColor(int i) {
        this.selectColor = i;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void setSkuId(@Nullable String str) {
        this.skuId = str;
    }

    @NotNull
    public String toString() {
        return "WatchSkinBean(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", rank=" + this.rank + ", favorited=" + this.favorited + ", isFree=" + this.isFree + ", price=" + this.price + ", skuId=" + this.skuId + ", downloadable=" + this.downloadable + ", size=" + this.size + ", customizable=" + this.customizable + ", image=" + this.image + ", downloadUrl=" + this.downloadUrl + ", metas=" + this.metas + ", isHeader=" + this.isHeader + ", header=" + this.header + ", isMore=" + this.isMore + ", itemType=" + this.itemType + ", isLocal=" + this.isLocal + ")";
    }

    public WatchSkinBean(boolean z, @NotNull String str, boolean z2) {
        this.isHeader = z;
        this.header = str;
        this.isMore = z2;
    }

    public final void setHeader(@Nullable String str) {
        this.header = str;
    }

    public WatchSkinBean(int i) {
        this.isHeader = false;
        this.header = null;
        this.isMore = false;
        this.itemType = i;
    }

    public WatchSkinBean(int i, @NotNull String str) {
        this.id = i;
        this.name = str;
    }
}

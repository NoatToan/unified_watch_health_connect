package com.huami.watchfacesstore.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\bC\b\u0086\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010(\u001a\u00020\u0005\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b]\u0010^J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0004J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0003Jð\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010(\u001a\u00020\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\b1\u00102J\t\u00103\u001a\u00020\u0007HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001J\u0013\u00106\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b8\u0010\u0004R\u0019\u0010\u001f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u00109\u001a\u0004\b:\u0010;R$\u0010 \u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001e\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u00107\u001a\u0004\b!\u0010\u0004R\u001b\u0010\"\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010A\u001a\u0004\bB\u0010CR\u001b\u0010#\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010<\u001a\u0004\bD\u0010>R\u001b\u0010$\u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010E\u001a\u0004\bF\u0010\u000fR\u001b\u0010%\u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010E\u001a\u0004\bG\u0010\u000fR\u001b\u0010&\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010H\u001a\u0004\bI\u0010\u0012R$\u0010'\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010H\u001a\u0004\bJ\u0010\u0012\"\u0004\bK\u0010LR\"\u0010(\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00109\u001a\u0004\bM\u0010;\"\u0004\bN\u0010OR$\u0010)\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010<\u001a\u0004\bP\u0010>\"\u0004\bQ\u0010@R$\u0010*\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010H\u001a\u0004\bR\u0010\u0012\"\u0004\bS\u0010LR\u001e\u0010+\u001a\u0004\u0018\u00010\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010<\u001a\u0004\bT\u0010>R$\u0010,\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u00107\u001a\u0004\b,\u0010\u0004\"\u0004\bU\u0010VR\u001b\u0010-\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010<\u001a\u0004\bW\u0010>R\u001e\u0010.\u001a\u0004\u0018\u00010\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010<\u001a\u0004\bX\u0010>R\u001e\u0010/\u001a\u0004\u0018\u00010\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010<\u001a\u0004\bY\u0010>R\u001b\u00100\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010Z\u001a\u0004\b[\u0010\\¨\u0006_"}, d2 = {"Lcom/huami/watchfacesstore/bean/WatchData;", "", "", "component1", "()Ljava/lang/Boolean;", "", "component2", "", "component3", "component4", "Lcom/huami/watchfacesstore/bean/Metas;", "component5", "component6", "", "component7", "()Ljava/lang/Float;", "component8", "component9", "()Ljava/lang/Integer;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "Lcom/huami/watchfacesstore/bean/Publisher;", "component19", "customizable", "id", "image", "isFree", "metas", "name", FirebaseAnalytics.Param.PRICE, WatchFaceDetailActivity.FROM_RANK, "size", "color", "status", "dialPath", "publisherId", "currencyCode", "isPurchased", "version", "thirdPartyProductId", TrainingWebConst.QueryParam.SKUID, "publisher", "copy", "(Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Boolean;Lcom/huami/watchfacesstore/bean/Metas;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/watchfacesstore/bean/Publisher;)Lcom/huami/watchfacesstore/bean/WatchData;", "toString", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "getCustomizable", LogUtil.I, "getId", "()I", "Ljava/lang/String;", "getImage", "()Ljava/lang/String;", "setImage", "(Ljava/lang/String;)V", "Lcom/huami/watchfacesstore/bean/Metas;", "getMetas", "()Lcom/huami/watchfacesstore/bean/Metas;", "getName", "Ljava/lang/Float;", "getPrice", "getRank", "Ljava/lang/Integer;", "getSize", "getColor", "setColor", "(Ljava/lang/Integer;)V", "getStatus", "setStatus", "(I)V", "getDialPath", "setDialPath", "getPublisherId", "setPublisherId", "getCurrencyCode", "setPurchased", "(Ljava/lang/Boolean;)V", "getVersion", "getThirdPartyProductId", "getSkuId", "Lcom/huami/watchfacesstore/bean/Publisher;", "getPublisher", "()Lcom/huami/watchfacesstore/bean/Publisher;", "<init>", "(Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Boolean;Lcom/huami/watchfacesstore/bean/Metas;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/watchfacesstore/bean/Publisher;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WatchData {

    @Nullable
    private Integer color;

    @SerializedName("currency_code")
    @Nullable
    private final String currencyCode;

    @Nullable
    private final Boolean customizable;

    @Nullable
    private String dialPath;
    private final int id;

    @Nullable
    private String image;

    @SerializedName("is_free")
    @Nullable
    private final Boolean isFree;

    @SerializedName("is_purchased")
    @Nullable
    private Boolean isPurchased;

    @Nullable
    private final Metas metas;

    @Nullable
    private final String name;

    @Nullable
    private final Float price;

    @Nullable
    private final Publisher publisher;

    @Nullable
    private Integer publisherId;

    @Nullable
    private final Float rank;

    @Nullable
    private final Integer size;

    @SerializedName("sku_id")
    @Nullable
    private final String skuId;
    private int status;

    @SerializedName("thirdparty_product_id")
    @Nullable
    private final String thirdPartyProductId;

    @Nullable
    private final String version;

    public WatchData(@Nullable Boolean bool, int i, @Nullable String str, @Nullable Boolean bool2, @Nullable Metas metas, @Nullable String str2, @Nullable Float f, @Nullable Float f2, @Nullable Integer num, @Nullable Integer num2, int i2, @Nullable String str3, @Nullable Integer num3, @Nullable String str4, @Nullable Boolean bool3, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Publisher publisher) {
        this.customizable = bool;
        this.id = i;
        this.image = str;
        this.isFree = bool2;
        this.metas = metas;
        this.name = str2;
        this.price = f;
        this.rank = f2;
        this.size = num;
        this.color = num2;
        this.status = i2;
        this.dialPath = str3;
        this.publisherId = num3;
        this.currencyCode = str4;
        this.isPurchased = bool3;
        this.version = str5;
        this.thirdPartyProductId = str6;
        this.skuId = str7;
        this.publisher = publisher;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getCustomizable() {
        return this.customizable;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDialPath() {
        return this.dialPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getPublisherId() {
        return this.publisherId;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getIsPurchased() {
        return this.isPurchased;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getThirdPartyProductId() {
        return this.thirdPartyProductId;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getSkuId() {
        return this.skuId;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Publisher getPublisher() {
        return this.publisher;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsFree() {
        return this.isFree;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Metas getMetas() {
        return this.metas;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Float getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Float getRank() {
        return this.rank;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getSize() {
        return this.size;
    }

    @NotNull
    public final WatchData copy(@Nullable Boolean customizable, int id, @Nullable String image, @Nullable Boolean isFree, @Nullable Metas metas, @Nullable String name, @Nullable Float price, @Nullable Float rank, @Nullable Integer size, @Nullable Integer color, int status, @Nullable String dialPath, @Nullable Integer publisherId, @Nullable String currencyCode, @Nullable Boolean isPurchased, @Nullable String version, @Nullable String thirdPartyProductId, @Nullable String skuId, @Nullable Publisher publisher) {
        return new WatchData(customizable, id, image, isFree, metas, name, price, rank, size, color, status, dialPath, publisherId, currencyCode, isPurchased, version, thirdPartyProductId, skuId, publisher);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchData)) {
            return false;
        }
        WatchData watchData = (WatchData) other;
        return Intrinsics.areEqual(this.customizable, watchData.customizable) && this.id == watchData.id && Intrinsics.areEqual(this.image, watchData.image) && Intrinsics.areEqual(this.isFree, watchData.isFree) && Intrinsics.areEqual(this.metas, watchData.metas) && Intrinsics.areEqual(this.name, watchData.name) && Intrinsics.areEqual((Object) this.price, (Object) watchData.price) && Intrinsics.areEqual((Object) this.rank, (Object) watchData.rank) && Intrinsics.areEqual(this.size, watchData.size) && Intrinsics.areEqual(this.color, watchData.color) && this.status == watchData.status && Intrinsics.areEqual(this.dialPath, watchData.dialPath) && Intrinsics.areEqual(this.publisherId, watchData.publisherId) && Intrinsics.areEqual(this.currencyCode, watchData.currencyCode) && Intrinsics.areEqual(this.isPurchased, watchData.isPurchased) && Intrinsics.areEqual(this.version, watchData.version) && Intrinsics.areEqual(this.thirdPartyProductId, watchData.thirdPartyProductId) && Intrinsics.areEqual(this.skuId, watchData.skuId) && Intrinsics.areEqual(this.publisher, watchData.publisher);
    }

    @Nullable
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    public final Boolean getCustomizable() {
        return this.customizable;
    }

    @Nullable
    public final String getDialPath() {
        return this.dialPath;
    }

    public final int getId() {
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

    @Nullable
    public final Float getPrice() {
        return this.price;
    }

    @Nullable
    public final Publisher getPublisher() {
        return this.publisher;
    }

    @Nullable
    public final Integer getPublisherId() {
        return this.publisherId;
    }

    @Nullable
    public final Float getRank() {
        return this.rank;
    }

    @Nullable
    public final Integer getSize() {
        return this.size;
    }

    @Nullable
    public final String getSkuId() {
        return this.skuId;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final String getThirdPartyProductId() {
        return this.thirdPartyProductId;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        Boolean bool = this.customizable;
        int iHashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + this.id) * 31;
        String str = this.image;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.isFree;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Metas metas = this.metas;
        int iHashCode4 = (iHashCode3 + (metas == null ? 0 : metas.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.price;
        int iHashCode6 = (iHashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.rank;
        int iHashCode7 = (iHashCode6 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.size;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.color;
        int iHashCode9 = (((iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.status) * 31;
        String str3 = this.dialPath;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.publisherId;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.currencyCode;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.isPurchased;
        int iHashCode13 = (iHashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.version;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.thirdPartyProductId;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.skuId;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Publisher publisher = this.publisher;
        return iHashCode16 + (publisher != null ? publisher.hashCode() : 0);
    }

    @Nullable
    public final Boolean isFree() {
        return this.isFree;
    }

    @Nullable
    public final Boolean isPurchased() {
        return this.isPurchased;
    }

    public final void setColor(@Nullable Integer num) {
        this.color = num;
    }

    public final void setDialPath(@Nullable String str) {
        this.dialPath = str;
    }

    public final void setImage(@Nullable String str) {
        this.image = str;
    }

    public final void setPublisherId(@Nullable Integer num) {
        this.publisherId = num;
    }

    public final void setPurchased(@Nullable Boolean bool) {
        this.isPurchased = bool;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @NotNull
    public String toString() {
        return "WatchData(customizable=" + this.customizable + ", id=" + this.id + ", image=" + this.image + ", isFree=" + this.isFree + ", metas=" + this.metas + ", name=" + this.name + ", price=" + this.price + ", rank=" + this.rank + ", size=" + this.size + ", color=" + this.color + ", status=" + this.status + ", dialPath=" + this.dialPath + ", publisherId=" + this.publisherId + ", currencyCode=" + this.currencyCode + ", isPurchased=" + this.isPurchased + ", version=" + this.version + ", thirdPartyProductId=" + this.thirdPartyProductId + ", skuId=" + this.skuId + ", publisher=" + this.publisher + ")";
    }

    public /* synthetic */ WatchData(Boolean bool, int i, String str, Boolean bool2, Metas metas, String str2, Float f, Float f2, Integer num, Integer num2, int i2, String str3, Integer num3, String str4, Boolean bool3, String str5, String str6, String str7, Publisher publisher, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : bool, i, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : bool2, (i3 & 16) != 0 ? null : metas, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : f, (i3 & 128) != 0 ? null : f2, (i3 & 256) != 0 ? null : num, (i3 & 512) != 0 ? null : num2, (i3 & 1024) != 0 ? 0 : i2, (i3 & 2048) != 0 ? null : str3, (i3 & 4096) != 0 ? null : num3, (i3 & 8192) != 0 ? null : str4, (i3 & 16384) != 0 ? null : bool3, (32768 & i3) != 0 ? null : str5, (65536 & i3) != 0 ? null : str6, (131072 & i3) != 0 ? null : str7, (i3 & 262144) != 0 ? null : publisher);
    }
}

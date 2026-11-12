package com.huami.watchfacesstore.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.huami.network.hmnetwork.webapi.HMWebParameter;
import com.huami.watch.companion.ximalaya.XimalayaConst;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bX\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010'\u001a\u00020\u0007\u0012\u0006\u0010(\u001a\u00020\u0007\u0012\u0006\u0010)\u001a\u00020\n\u0012\u0006\u0010*\u001a\u00020\n\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u0006\u0010-\u001a\u00020\n\u0012\u0006\u0010.\u001a\u00020\n\u0012\u0006\u0010/\u001a\u00020\u0011\u0012\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013\u0012\u0006\u00102\u001a\u00020\u0002\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u00105\u001a\u00020\n\u0012\b\b\u0002\u00106\u001a\u00020\n\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013¢\u0006\u0004\bo\u0010pJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\nHÆ\u0003J\t\u0010\u0010\u001a\u00020\nHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013HÆ\u0003J´\u0002\u0010=\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\n2\b\b\u0002\u0010*\u001a\u00020\n2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\n2\b\b\u0002\u0010/\u001a\u00020\u00112\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00132\b\b\u0002\u00102\u001a\u00020\u00022\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u00105\u001a\u00020\n2\b\b\u0002\u00106\u001a\u00020\n2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00108\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b=\u0010>J\t\u0010?\u001a\u00020\u0004HÖ\u0001J\t\u0010@\u001a\u00020\u0002HÖ\u0001J\u0013\u0010B\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010$\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010%\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010F\u001a\u0004\bG\u0010HR\u001b\u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010F\u001a\u0004\bI\u0010HR\u0019\u0010'\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010(\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010J\u001a\u0004\bM\u0010LR\u0019\u0010)\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010N\u001a\u0004\bO\u0010PR\"\u0010*\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010N\u001a\u0004\b*\u0010P\"\u0004\bQ\u0010RR\u001b\u0010+\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010F\u001a\u0004\bS\u0010HR\u001c\u0010,\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010F\u001a\u0004\bT\u0010HR\u0019\u0010-\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010N\u001a\u0004\bU\u0010PR\u001c\u0010.\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010N\u001a\u0004\b.\u0010PR\u0019\u0010/\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010V\u001a\u0004\bW\u0010XR!\u00100\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010Y\u001a\u0004\bZ\u0010[R!\u00101\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00138\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010Y\u001a\u0004\b\\\u0010[R\u0019\u00102\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010C\u001a\u0004\b]\u0010ER$\u00103\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010F\u001a\u0004\b^\u0010H\"\u0004\b_\u0010`R$\u00104\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u00105\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010N\u001a\u0004\b5\u0010P\"\u0004\bf\u0010RR\u001c\u00106\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010N\u001a\u0004\b6\u0010PR\u001e\u00107\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010F\u001a\u0004\bg\u0010HR$\u00108\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010h\u001a\u0004\b8\u0010\u001f\"\u0004\bi\u0010jR\u001b\u00109\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010F\u001a\u0004\bk\u0010HR\u001e\u0010:\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010F\u001a\u0004\bl\u0010HR\u001e\u0010;\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010F\u001a\u0004\bm\u0010HR$\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010Y\u001a\u0004\bn\u0010[¨\u0006q"}, d2 = {"Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "", "", "component1", "", "component2", "component3", "", "component4", "component5", "", "component6", "component7", "component8", "component9", "component10", "component11", "Lcom/huami/watchfacesstore/bean/Metas;", "component12", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "component13", "component14", "component15", "component16", "Lcom/huami/watchfacesstore/bean/Publisher;", "component17", "component18", "component19", "component20", "component21", "()Ljava/lang/Boolean;", "component22", "component23", "component24", "component25", "id", "name", "description", FirebaseAnalytics.Param.PRICE, WatchFaceDetailActivity.FROM_RANK, "customizable", "isCollect", "image", XimalayaConst.DOWNLOAD_URL, "downloadable", "isFree", "metas", WatchFaceDetailActivity.FROM_RECOMMEND, "styles", "size", "bgPath", "publisher", "isSelected", "isHighPowerCost", "currencyCode", "isPurchased", "version", HMWebParameter.PARAM_THIRD_PARTY_ID, TrainingWebConst.QueryParam.SKUID, "payChannels", "copy", "(ILjava/lang/String;Ljava/lang/String;FFZZLjava/lang/String;Ljava/lang/String;ZZLcom/huami/watchfacesstore/bean/Metas;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lcom/huami/watchfacesstore/bean/Publisher;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "toString", "hashCode", "other", "equals", LogUtil.I, "getId", "()I", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getDescription", "F", "getPrice", "()F", "getRank", "Z", "getCustomizable", "()Z", "setCollect", "(Z)V", "getImage", "getDownloadUrl", "getDownloadable", "Lcom/huami/watchfacesstore/bean/Metas;", "getMetas", "()Lcom/huami/watchfacesstore/bean/Metas;", "Ljava/util/List;", "getRecommend", "()Ljava/util/List;", "getStyles", "getSize", "getBgPath", "setBgPath", "(Ljava/lang/String;)V", "Lcom/huami/watchfacesstore/bean/Publisher;", "getPublisher", "()Lcom/huami/watchfacesstore/bean/Publisher;", "setPublisher", "(Lcom/huami/watchfacesstore/bean/Publisher;)V", "setSelected", "getCurrencyCode", "Ljava/lang/Boolean;", "setPurchased", "(Ljava/lang/Boolean;)V", "getVersion", "getThirdPartyId", "getSkuId", "getPayChannels", "<init>", "(ILjava/lang/String;Ljava/lang/String;FFZZLjava/lang/String;Ljava/lang/String;ZZLcom/huami/watchfacesstore/bean/Metas;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lcom/huami/watchfacesstore/bean/Publisher;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WatchFaceDetailBean {

    @Nullable
    private String bgPath;

    @SerializedName("currency_code")
    @Nullable
    private final String currencyCode;
    private final boolean customizable;

    @Nullable
    private final String description;

    @SerializedName("download_url")
    @NotNull
    private final String downloadUrl;
    private final boolean downloadable;
    private final int id;

    @Nullable
    private final String image;

    @SerializedName("favorited")
    private boolean isCollect;

    @SerializedName("is_free")
    private final boolean isFree;

    @SerializedName("is_high_cost")
    private final boolean isHighPowerCost;

    @SerializedName("is_purchased")
    @Nullable
    private Boolean isPurchased;
    private boolean isSelected;

    @NotNull
    private final Metas metas;

    @NotNull
    private final String name;

    @SerializedName("pay_channels")
    @Nullable
    private final List<String> payChannels;
    private final float price;

    @Nullable
    private Publisher publisher;
    private final float rank;

    @Nullable
    private final List<WatchData> recommend;
    private final int size;

    @SerializedName("sku_id")
    @Nullable
    private final String skuId;

    @Nullable
    private final List<WatchFaceDetailBean> styles;

    @SerializedName("thirdparty_product_id")
    @Nullable
    private final String thirdPartyId;

    @Nullable
    private final String version;

    public WatchFaceDetailBean(int i, @NotNull String str, @Nullable String str2, float f, float f2, boolean z, boolean z2, @Nullable String str3, @NotNull String str4, boolean z3, boolean z4, @NotNull Metas metas, @Nullable List<WatchData> list, @Nullable List<WatchFaceDetailBean> list2, int i2, @Nullable String str5, @Nullable Publisher publisher, boolean z5, boolean z6, @Nullable String str6, @Nullable Boolean bool, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable List<String> list3) {
        this.id = i;
        this.name = str;
        this.description = str2;
        this.price = f;
        this.rank = f2;
        this.customizable = z;
        this.isCollect = z2;
        this.image = str3;
        this.downloadUrl = str4;
        this.downloadable = z3;
        this.isFree = z4;
        this.metas = metas;
        this.recommend = list;
        this.styles = list2;
        this.size = i2;
        this.bgPath = str5;
        this.publisher = publisher;
        this.isSelected = z5;
        this.isHighPowerCost = z6;
        this.currencyCode = str6;
        this.isPurchased = bool;
        this.version = str7;
        this.thirdPartyId = str8;
        this.skuId = str9;
        this.payChannels = list3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getDownloadable() {
        return this.downloadable;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsFree() {
        return this.isFree;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Metas getMetas() {
        return this.metas;
    }

    @Nullable
    public final List<WatchData> component13() {
        return this.recommend;
    }

    @Nullable
    public final List<WatchFaceDetailBean> component14() {
        return this.styles;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getBgPath() {
        return this.bgPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Publisher getPublisher() {
        return this.publisher;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getIsHighPowerCost() {
        return this.isHighPowerCost;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getIsPurchased() {
        return this.isPurchased;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getThirdPartyId() {
        return this.thirdPartyId;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getSkuId() {
        return this.skuId;
    }

    @Nullable
    public final List<String> component25() {
        return this.payChannels;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCustomizable() {
        return this.customizable;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsCollect() {
        return this.isCollect;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @NotNull
    public final WatchFaceDetailBean copy(int id, @NotNull String name, @Nullable String description, float price, float rank, boolean customizable, boolean isCollect, @Nullable String image, @NotNull String downloadUrl, boolean downloadable, boolean isFree, @NotNull Metas metas, @Nullable List<WatchData> recommend, @Nullable List<WatchFaceDetailBean> styles, int size, @Nullable String bgPath, @Nullable Publisher publisher, boolean isSelected, boolean isHighPowerCost, @Nullable String currencyCode, @Nullable Boolean isPurchased, @Nullable String version, @Nullable String thirdPartyId, @Nullable String skuId, @Nullable List<String> payChannels) {
        return new WatchFaceDetailBean(id, name, description, price, rank, customizable, isCollect, image, downloadUrl, downloadable, isFree, metas, recommend, styles, size, bgPath, publisher, isSelected, isHighPowerCost, currencyCode, isPurchased, version, thirdPartyId, skuId, payChannels);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchFaceDetailBean)) {
            return false;
        }
        WatchFaceDetailBean watchFaceDetailBean = (WatchFaceDetailBean) other;
        return this.id == watchFaceDetailBean.id && Intrinsics.areEqual(this.name, watchFaceDetailBean.name) && Intrinsics.areEqual(this.description, watchFaceDetailBean.description) && Intrinsics.areEqual((Object) Float.valueOf(this.price), (Object) Float.valueOf(watchFaceDetailBean.price)) && Intrinsics.areEqual((Object) Float.valueOf(this.rank), (Object) Float.valueOf(watchFaceDetailBean.rank)) && this.customizable == watchFaceDetailBean.customizable && this.isCollect == watchFaceDetailBean.isCollect && Intrinsics.areEqual(this.image, watchFaceDetailBean.image) && Intrinsics.areEqual(this.downloadUrl, watchFaceDetailBean.downloadUrl) && this.downloadable == watchFaceDetailBean.downloadable && this.isFree == watchFaceDetailBean.isFree && Intrinsics.areEqual(this.metas, watchFaceDetailBean.metas) && Intrinsics.areEqual(this.recommend, watchFaceDetailBean.recommend) && Intrinsics.areEqual(this.styles, watchFaceDetailBean.styles) && this.size == watchFaceDetailBean.size && Intrinsics.areEqual(this.bgPath, watchFaceDetailBean.bgPath) && Intrinsics.areEqual(this.publisher, watchFaceDetailBean.publisher) && this.isSelected == watchFaceDetailBean.isSelected && this.isHighPowerCost == watchFaceDetailBean.isHighPowerCost && Intrinsics.areEqual(this.currencyCode, watchFaceDetailBean.currencyCode) && Intrinsics.areEqual(this.isPurchased, watchFaceDetailBean.isPurchased) && Intrinsics.areEqual(this.version, watchFaceDetailBean.version) && Intrinsics.areEqual(this.thirdPartyId, watchFaceDetailBean.thirdPartyId) && Intrinsics.areEqual(this.skuId, watchFaceDetailBean.skuId) && Intrinsics.areEqual(this.payChannels, watchFaceDetailBean.payChannels);
    }

    @Nullable
    public final String getBgPath() {
        return this.bgPath;
    }

    @Nullable
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final boolean getCustomizable() {
        return this.customizable;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final boolean getDownloadable() {
        return this.downloadable;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final Metas getMetas() {
        return this.metas;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<String> getPayChannels() {
        return this.payChannels;
    }

    public final float getPrice() {
        return this.price;
    }

    @Nullable
    public final Publisher getPublisher() {
        return this.publisher;
    }

    public final float getRank() {
        return this.rank;
    }

    @Nullable
    public final List<WatchData> getRecommend() {
        return this.recommend;
    }

    public final int getSize() {
        return this.size;
    }

    @Nullable
    public final String getSkuId() {
        return this.skuId;
    }

    @Nullable
    public final List<WatchFaceDetailBean> getStyles() {
        return this.styles;
    }

    @Nullable
    public final String getThirdPartyId() {
        return this.thirdPartyId;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v38, types: [int] */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = ((this.id * 31) + this.name.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Float.floatToIntBits(this.price)) * 31) + Float.floatToIntBits(this.rank)) * 31;
        boolean z = this.customizable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode2 + r1) * 31;
        boolean z2 = this.isCollect;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        String str2 = this.image;
        int iHashCode3 = (((i2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.downloadUrl.hashCode()) * 31;
        boolean z3 = this.downloadable;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (iHashCode3 + r3) * 31;
        boolean z4 = this.isFree;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int iHashCode4 = (((i3 + r4) * 31) + this.metas.hashCode()) * 31;
        List<WatchData> list = this.recommend;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<WatchFaceDetailBean> list2 = this.styles;
        int iHashCode6 = (((iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.size) * 31;
        String str3 = this.bgPath;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Publisher publisher = this.publisher;
        int iHashCode8 = (iHashCode7 + (publisher == null ? 0 : publisher.hashCode())) * 31;
        boolean z5 = this.isSelected;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i4 = (iHashCode8 + r5) * 31;
        boolean z6 = this.isHighPowerCost;
        int i5 = (i4 + (z6 ? 1 : z6)) * 31;
        String str4 = this.currencyCode;
        int iHashCode9 = (i5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isPurchased;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.version;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.thirdPartyId;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.skuId;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<String> list3 = this.payChannels;
        return iHashCode13 + (list3 != null ? list3.hashCode() : 0);
    }

    public final boolean isCollect() {
        return this.isCollect;
    }

    public final boolean isFree() {
        return this.isFree;
    }

    public final boolean isHighPowerCost() {
        return this.isHighPowerCost;
    }

    @Nullable
    public final Boolean isPurchased() {
        return this.isPurchased;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setBgPath(@Nullable String str) {
        this.bgPath = str;
    }

    public final void setCollect(boolean z) {
        this.isCollect = z;
    }

    public final void setPublisher(@Nullable Publisher publisher) {
        this.publisher = publisher;
    }

    public final void setPurchased(@Nullable Boolean bool) {
        this.isPurchased = bool;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    @NotNull
    public String toString() {
        return "WatchFaceDetailBean(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", price=" + this.price + ", rank=" + this.rank + ", customizable=" + this.customizable + ", isCollect=" + this.isCollect + ", image=" + this.image + ", downloadUrl=" + this.downloadUrl + ", downloadable=" + this.downloadable + ", isFree=" + this.isFree + ", metas=" + this.metas + ", recommend=" + this.recommend + ", styles=" + this.styles + ", size=" + this.size + ", bgPath=" + this.bgPath + ", publisher=" + this.publisher + ", isSelected=" + this.isSelected + ", isHighPowerCost=" + this.isHighPowerCost + ", currencyCode=" + this.currencyCode + ", isPurchased=" + this.isPurchased + ", version=" + this.version + ", thirdPartyId=" + this.thirdPartyId + ", skuId=" + this.skuId + ", payChannels=" + this.payChannels + ")";
    }

    public /* synthetic */ WatchFaceDetailBean(int i, String str, String str2, float f, float f2, boolean z, boolean z2, String str3, String str4, boolean z3, boolean z4, Metas metas, List list, List list2, int i2, String str5, Publisher publisher, boolean z5, boolean z6, String str6, Boolean bool, String str7, String str8, String str9, List list3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, f, f2, z, z2, str3, str4, z3, z4, metas, list, list2, i2, (i3 & 32768) != 0 ? null : str5, (i3 & 65536) != 0 ? null : publisher, (i3 & 131072) != 0 ? false : z5, (i3 & 262144) != 0 ? false : z6, (i3 & 524288) != 0 ? null : str6, (i3 & 1048576) != 0 ? null : bool, (i3 & 2097152) != 0 ? null : str7, (i3 & 4194304) != 0 ? null : str8, (i3 & 8388608) != 0 ? null : str9, (i3 & 16777216) != 0 ? null : list3);
    }
}

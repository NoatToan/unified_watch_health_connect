package com.huami.watchfacesstore.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Entity(primaryKeys = {"id", "device_id"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b^\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\n\u0012\u0006\u0010\"\u001a\u00020\n\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0014\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010.\u001a\u00020\u0004\u0012\b\b\u0002\u0010/\u001a\u00020\u0007¢\u0006\u0004\bp\u0010qJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003Jæ\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00142\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b0\u00101J\t\u00102\u001a\u00020\u0004HÖ\u0001J\t\u00103\u001a\u00020\u0002HÖ\u0001J\u0013\u00105\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u001c\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u001d\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u001c\u0010\u001f\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\"\u0010 \u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u00107\u0012\u0004\bF\u0010G\u001a\u0004\bE\u00109R\u001c\u0010!\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001c\u0010\"\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\b\"\u0010KR\u001e\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010;\u001a\u0004\bN\u0010=R\u001c\u0010$\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010;\u001a\u0004\bP\u0010=R\u001e\u0010%\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010;\u001a\u0004\bR\u0010=R\u001e\u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010;\u001a\u0004\bT\u0010=R\u001c\u0010'\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010;\u001a\u0004\bV\u0010=R\u001c\u0010(\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010;\u001a\u0004\bX\u0010=R\u001c\u0010)\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u00107\u001a\u0004\bZ\u00109R\u001c\u0010*\u001a\u00020\u00148\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R$\u0010+\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010;\u001a\u0004\b`\u0010=\"\u0004\ba\u0010bR$\u0010,\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010\u0018\"\u0004\bf\u0010gR$\u0010-\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010d\u001a\u0004\bi\u0010\u0018\"\u0004\bj\u0010gR\"\u0010.\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bk\u0010;\u001a\u0004\bl\u0010=\"\u0004\bm\u0010bR\u001c\u0010/\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010A\u001a\u0004\bo\u0010C¨\u0006r"}, d2 = {"Lcom/huami/watchfacesstore/room/WatchFaceInfo;", "", "", "component1", "", "component2", "component3", "", "component4", "component5", "", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "", "component15", "component16", "component17", "()Ljava/lang/Integer;", "component18", "component19", "component20", "id", "name", "description", "rating", FirebaseAnalytics.Param.PRICE, "customizable", "isFree", "thumbnailImgPath", "dialPath", "transBackgroundPath", "gifPath", "deviceId", "minimumFirmwareVersion", "size", ParamKey.createTime, "bgPath", "color", "publisherId", "version", "realPrice", "copy", "(ILjava/lang/String;Ljava/lang/String;FIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;F)Lcom/huami/watchfacesstore/room/WatchFaceInfo;", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getId", "()I", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", "getDescription", GoogleApiAvailabilityLight.a, "F", "getRating", "()F", "e", "getPrice", "getPrice$annotations", "()V", "f", "Z", "getCustomizable", "()Z", "g", "h", "getThumbnailImgPath", "i", "getDialPath", z.j, "getTransBackgroundPath", hl.k, "getGifPath", "l", "getDeviceId", "m", "getMinimumFirmwareVersion", GoogleApiAvailabilityLight.b, "getSize", "o", "J", "getCreateTime", "()J", b.r, "getBgPath", "setBgPath", "(Ljava/lang/String;)V", DTransferConstants.SEARCH_KEY, "Ljava/lang/Integer;", "getColor", "setColor", "(Ljava/lang/Integer;)V", "r", "getPublisherId", "setPublisherId", SOAP.XMLNS, "getVersion", "setVersion", "t", "getRealPrice", "<init>", "(ILjava/lang/String;Ljava/lang/String;FIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;F)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WatchFaceInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @ColumnInfo
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @ColumnInfo
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @ColumnInfo
    @Nullable
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @ColumnInfo
    private final float rating;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @ColumnInfo
    private final int price;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @ColumnInfo
    private final boolean customizable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "is_free")
    private final boolean isFree;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "thumbnail_image_path")
    @Nullable
    private final String thumbnailImgPath;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "dial_path")
    @NotNull
    private final String dialPath;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "transparent_background_path")
    @Nullable
    private final String transBackgroundPath;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "gif_img_path")
    @Nullable
    private final String gifPath;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "device_id")
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "minimum_firmware_version")
    @NotNull
    private final String minimumFirmwareVersion;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @ColumnInfo
    private final int size;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "create_time")
    private final long createTime;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "bg_path")
    @Nullable
    private String bgPath;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    @ColumnInfo
    @Nullable
    private Integer color;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "publisher_id")
    @Nullable
    private Integer publisherId;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
    @ColumnInfo
    @NotNull
    private String version;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "real_price")
    private final float realPrice;

    public WatchFaceInfo(int i, @NotNull String str, @Nullable String str2, float f, int i2, boolean z, boolean z2, @Nullable String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6, @NotNull String str7, @NotNull String str8, int i3, long j, @Nullable String str9, @Nullable Integer num, @Nullable Integer num2, @NotNull String str10, float f2) {
        this.id = i;
        this.name = str;
        this.description = str2;
        this.rating = f;
        this.price = i2;
        this.customizable = z;
        this.isFree = z2;
        this.thumbnailImgPath = str3;
        this.dialPath = str4;
        this.transBackgroundPath = str5;
        this.gifPath = str6;
        this.deviceId = str7;
        this.minimumFirmwareVersion = str8;
        this.size = i3;
        this.createTime = j;
        this.bgPath = str9;
        this.color = num;
        this.publisherId = num2;
        this.version = str10;
        this.realPrice = f2;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "这个价格不用了，使用下面的realPrice", replaceWith = @ReplaceWith(expression = "realPrice", imports = {}))
    public static /* synthetic */ void getPrice$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTransBackgroundPath() {
        return this.transBackgroundPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getGifPath() {
        return this.gifPath;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getMinimumFirmwareVersion() {
        return this.minimumFirmwareVersion;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getBgPath() {
        return this.bgPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getPublisherId() {
        return this.publisherId;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final float getRealPrice() {
        return this.realPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCustomizable() {
        return this.customizable;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsFree() {
        return this.isFree;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getThumbnailImgPath() {
        return this.thumbnailImgPath;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDialPath() {
        return this.dialPath;
    }

    @NotNull
    public final WatchFaceInfo copy(int id, @NotNull String name, @Nullable String description, float rating, int price, boolean customizable, boolean isFree, @Nullable String thumbnailImgPath, @NotNull String dialPath, @Nullable String transBackgroundPath, @Nullable String gifPath, @NotNull String deviceId, @NotNull String minimumFirmwareVersion, int size, long createTime, @Nullable String bgPath, @Nullable Integer color, @Nullable Integer publisherId, @NotNull String version, float realPrice) {
        return new WatchFaceInfo(id, name, description, rating, price, customizable, isFree, thumbnailImgPath, dialPath, transBackgroundPath, gifPath, deviceId, minimumFirmwareVersion, size, createTime, bgPath, color, publisherId, version, realPrice);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchFaceInfo)) {
            return false;
        }
        WatchFaceInfo watchFaceInfo = (WatchFaceInfo) other;
        return this.id == watchFaceInfo.id && Intrinsics.areEqual(this.name, watchFaceInfo.name) && Intrinsics.areEqual(this.description, watchFaceInfo.description) && Intrinsics.areEqual((Object) Float.valueOf(this.rating), (Object) Float.valueOf(watchFaceInfo.rating)) && this.price == watchFaceInfo.price && this.customizable == watchFaceInfo.customizable && this.isFree == watchFaceInfo.isFree && Intrinsics.areEqual(this.thumbnailImgPath, watchFaceInfo.thumbnailImgPath) && Intrinsics.areEqual(this.dialPath, watchFaceInfo.dialPath) && Intrinsics.areEqual(this.transBackgroundPath, watchFaceInfo.transBackgroundPath) && Intrinsics.areEqual(this.gifPath, watchFaceInfo.gifPath) && Intrinsics.areEqual(this.deviceId, watchFaceInfo.deviceId) && Intrinsics.areEqual(this.minimumFirmwareVersion, watchFaceInfo.minimumFirmwareVersion) && this.size == watchFaceInfo.size && this.createTime == watchFaceInfo.createTime && Intrinsics.areEqual(this.bgPath, watchFaceInfo.bgPath) && Intrinsics.areEqual(this.color, watchFaceInfo.color) && Intrinsics.areEqual(this.publisherId, watchFaceInfo.publisherId) && Intrinsics.areEqual(this.version, watchFaceInfo.version) && Intrinsics.areEqual((Object) Float.valueOf(this.realPrice), (Object) Float.valueOf(watchFaceInfo.realPrice));
    }

    @Nullable
    public final String getBgPath() {
        return this.bgPath;
    }

    @Nullable
    public final Integer getColor() {
        return this.color;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final boolean getCustomizable() {
        return this.customizable;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDialPath() {
        return this.dialPath;
    }

    @Nullable
    public final String getGifPath() {
        return this.gifPath;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getMinimumFirmwareVersion() {
        return this.minimumFirmwareVersion;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPrice() {
        return this.price;
    }

    @Nullable
    public final Integer getPublisherId() {
        return this.publisherId;
    }

    public final float getRating() {
        return this.rating;
    }

    public final float getRealPrice() {
        return this.realPrice;
    }

    public final int getSize() {
        return this.size;
    }

    @Nullable
    public final String getThumbnailImgPath() {
        return this.thumbnailImgPath;
    }

    @Nullable
    public final String getTransBackgroundPath() {
        return this.transBackgroundPath;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public int hashCode() {
        int iHashCode = ((this.id * 31) + this.name.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Float.floatToIntBits(this.rating)) * 31) + this.price) * 31;
        boolean z = this.customizable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode2 + r1) * 31;
        boolean z2 = this.isFree;
        int i2 = (i + (z2 ? 1 : z2)) * 31;
        String str2 = this.thumbnailImgPath;
        int iHashCode3 = (((i2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.dialPath.hashCode()) * 31;
        String str3 = this.transBackgroundPath;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.gifPath;
        int iHashCode5 = (((((((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.deviceId.hashCode()) * 31) + this.minimumFirmwareVersion.hashCode()) * 31) + this.size) * 31) + defpackage.b.a(this.createTime)) * 31;
        String str5 = this.bgPath;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.color;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.publisherId;
        return ((((iHashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.version.hashCode()) * 31) + Float.floatToIntBits(this.realPrice);
    }

    public final boolean isFree() {
        return this.isFree;
    }

    public final void setBgPath(@Nullable String str) {
        this.bgPath = str;
    }

    public final void setColor(@Nullable Integer num) {
        this.color = num;
    }

    public final void setPublisherId(@Nullable Integer num) {
        this.publisherId = num;
    }

    public final void setVersion(@NotNull String str) {
        this.version = str;
    }

    @NotNull
    public String toString() {
        return "WatchFaceInfo(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", rating=" + this.rating + ", price=" + this.price + ", customizable=" + this.customizable + ", isFree=" + this.isFree + ", thumbnailImgPath=" + this.thumbnailImgPath + ", dialPath=" + this.dialPath + ", transBackgroundPath=" + this.transBackgroundPath + ", gifPath=" + this.gifPath + ", deviceId=" + this.deviceId + ", minimumFirmwareVersion=" + this.minimumFirmwareVersion + ", size=" + this.size + ", createTime=" + this.createTime + ", bgPath=" + this.bgPath + ", color=" + this.color + ", publisherId=" + this.publisherId + ", version=" + this.version + ", realPrice=" + this.realPrice + ")";
    }

    public /* synthetic */ WatchFaceInfo(int i, String str, String str2, float f, int i2, boolean z, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, int i3, long j, String str9, Integer num, Integer num2, String str10, float f2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, f, i2, z, z2, str3, str4, str5, str6, str7, str8, i3, j, (i4 & 32768) != 0 ? null : str9, (i4 & 65536) != 0 ? null : num, (i4 & 131072) != 0 ? null : num2, (i4 & 262144) != 0 ? "" : str10, (i4 & 524288) != 0 ? 0.0f : f2);
    }
}

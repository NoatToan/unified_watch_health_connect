package com.huami.sleepassistant.apilib.db.po;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Entity
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b=\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0004\u0012\b\b\u0002\u0010'\u001a\u00020\u0004¢\u0006\u0004\bg\u0010hJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003JÕ\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u0004HÆ\u0001J\t\u0010)\u001a\u00020\u0002HÖ\u0001J\t\u0010*\u001a\u00020\u0004HÖ\u0001J\u0013\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0019\u0010\u0017\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00101R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010/\u001a\u0004\b;\u00101\"\u0004\b<\u00103R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010/\u001a\u0004\b>\u00101\"\u0004\b?\u00103R$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010/\u001a\u0004\bA\u00101\"\u0004\bB\u00103R$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010/\u001a\u0004\bD\u00101\"\u0004\bE\u00103R$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010/\u001a\u0004\bG\u00101\"\u0004\bH\u00103R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010/\u001a\u0004\bJ\u00101\"\u0004\bK\u00103R$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010/\u001a\u0004\bM\u00101\"\u0004\bN\u00103R$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010/\u001a\u0004\bP\u00101\"\u0004\bQ\u00103R$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010/\u001a\u0004\bS\u00101\"\u0004\bT\u00103R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010/\u001a\u0004\bV\u00101\"\u0004\bW\u00103R\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u00105\u001a\u0004\bY\u00107\"\u0004\bZ\u0010[R\"\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u00105\u001a\u0004\b]\u00107\"\u0004\b^\u0010[R$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010/\u001a\u0004\b`\u00101\"\u0004\ba\u00103R\"\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u00105\u001a\u0004\b&\u00107\"\u0004\bc\u0010[R\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u00105\u001a\u0004\be\u00107\"\u0004\bf\u0010[¨\u0006i"}, d2 = {"Lcom/huami/sleepassistant/apilib/db/po/Music;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "id", "whetherPay", "goodsId", "scIntroduction", "supportDevices", "deliveryApps", "deliveryTime", "expiredTime", "languages", "simpleChinese", "bigImgUrl", "smallImgUrl", "audioUrl", "sort", "ispresence", "playAddress", "isPlay", "progress", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", WebConst.QueryParam.SET_ID, "(Ljava/lang/String;)V", "b", LogUtil.I, "getWhetherPay", "()I", "c", "getGoodsId", GoogleApiAvailabilityLight.a, "getScIntroduction", "setScIntroduction", "e", "getSupportDevices", "setSupportDevices", "f", "getDeliveryApps", "setDeliveryApps", "g", "getDeliveryTime", "setDeliveryTime", "h", "getExpiredTime", "setExpiredTime", "i", "getLanguages", "setLanguages", z.j, "getSimpleChinese", "setSimpleChinese", hl.k, "getBigImgUrl", "setBigImgUrl", "l", "getSmallImgUrl", "setSmallImgUrl", "m", "getAudioUrl", "setAudioUrl", GoogleApiAvailabilityLight.b, "getSort", "setSort", "(I)V", "o", "getIspresence", "setIspresence", b.r, "getPlayAddress", "setPlayAddress", DTransferConstants.SEARCH_KEY, "setPlay", "r", "getProgress", "setProgress", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;II)V", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Music {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    @NotNull
    private String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int whetherPay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String goodsId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private String scIntroduction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private String supportDevices;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private String deliveryApps;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private String deliveryTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private String expiredTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private String languages;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private String simpleChinese;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private String bigImgUrl;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    private String smallImgUrl;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    private String audioUrl;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    private int sort;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    private int ispresence;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @Nullable
    private String playAddress;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    private int isPlay;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    private int progress;

    public Music() {
        this(null, 0, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, 0, 0, 262143, null);
    }

    public Music(@NotNull String str, int i, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, int i2, int i3, @Nullable String str13, int i4, int i5) {
        this.id = str;
        this.whetherPay = i;
        this.goodsId = str2;
        this.scIntroduction = str3;
        this.supportDevices = str4;
        this.deliveryApps = str5;
        this.deliveryTime = str6;
        this.expiredTime = str7;
        this.languages = str8;
        this.simpleChinese = str9;
        this.bigImgUrl = str10;
        this.smallImgUrl = str11;
        this.audioUrl = str12;
        this.sort = i2;
        this.ispresence = i3;
        this.playAddress = str13;
        this.isPlay = i4;
        this.progress = i5;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSimpleChinese() {
        return this.simpleChinese;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBigImgUrl() {
        return this.bigImgUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSmallImgUrl() {
        return this.smallImgUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getIspresence() {
        return this.ispresence;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPlayAddress() {
        return this.playAddress;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getIsPlay() {
        return this.isPlay;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWhetherPay() {
        return this.whetherPay;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGoodsId() {
        return this.goodsId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getScIntroduction() {
        return this.scIntroduction;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSupportDevices() {
        return this.supportDevices;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeliveryApps() {
        return this.deliveryApps;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeliveryTime() {
        return this.deliveryTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getExpiredTime() {
        return this.expiredTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLanguages() {
        return this.languages;
    }

    @NotNull
    public final Music copy(@NotNull String id, int whetherPay, @Nullable String goodsId, @Nullable String scIntroduction, @Nullable String supportDevices, @Nullable String deliveryApps, @Nullable String deliveryTime, @Nullable String expiredTime, @Nullable String languages, @Nullable String simpleChinese, @Nullable String bigImgUrl, @Nullable String smallImgUrl, @Nullable String audioUrl, int sort, int ispresence, @Nullable String playAddress, int isPlay, int progress) {
        return new Music(id, whetherPay, goodsId, scIntroduction, supportDevices, deliveryApps, deliveryTime, expiredTime, languages, simpleChinese, bigImgUrl, smallImgUrl, audioUrl, sort, ispresence, playAddress, isPlay, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Music)) {
            return false;
        }
        Music music = (Music) other;
        return Intrinsics.areEqual(this.id, music.id) && this.whetherPay == music.whetherPay && Intrinsics.areEqual(this.goodsId, music.goodsId) && Intrinsics.areEqual(this.scIntroduction, music.scIntroduction) && Intrinsics.areEqual(this.supportDevices, music.supportDevices) && Intrinsics.areEqual(this.deliveryApps, music.deliveryApps) && Intrinsics.areEqual(this.deliveryTime, music.deliveryTime) && Intrinsics.areEqual(this.expiredTime, music.expiredTime) && Intrinsics.areEqual(this.languages, music.languages) && Intrinsics.areEqual(this.simpleChinese, music.simpleChinese) && Intrinsics.areEqual(this.bigImgUrl, music.bigImgUrl) && Intrinsics.areEqual(this.smallImgUrl, music.smallImgUrl) && Intrinsics.areEqual(this.audioUrl, music.audioUrl) && this.sort == music.sort && this.ispresence == music.ispresence && Intrinsics.areEqual(this.playAddress, music.playAddress) && this.isPlay == music.isPlay && this.progress == music.progress;
    }

    @Nullable
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    @Nullable
    public final String getBigImgUrl() {
        return this.bigImgUrl;
    }

    @Nullable
    public final String getDeliveryApps() {
        return this.deliveryApps;
    }

    @Nullable
    public final String getDeliveryTime() {
        return this.deliveryTime;
    }

    @Nullable
    public final String getExpiredTime() {
        return this.expiredTime;
    }

    @Nullable
    public final String getGoodsId() {
        return this.goodsId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getIspresence() {
        return this.ispresence;
    }

    @Nullable
    public final String getLanguages() {
        return this.languages;
    }

    @Nullable
    public final String getPlayAddress() {
        return this.playAddress;
    }

    public final int getProgress() {
        return this.progress;
    }

    @Nullable
    public final String getScIntroduction() {
        return this.scIntroduction;
    }

    @Nullable
    public final String getSimpleChinese() {
        return this.simpleChinese;
    }

    @Nullable
    public final String getSmallImgUrl() {
        return this.smallImgUrl;
    }

    public final int getSort() {
        return this.sort;
    }

    @Nullable
    public final String getSupportDevices() {
        return this.supportDevices;
    }

    public final int getWhetherPay() {
        return this.whetherPay;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.whetherPay) * 31;
        String str = this.goodsId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scIntroduction;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.supportDevices;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deliveryApps;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deliveryTime;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.expiredTime;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.languages;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.simpleChinese;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.bigImgUrl;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.smallImgUrl;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.audioUrl;
        int iHashCode12 = (((((iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.sort) * 31) + this.ispresence) * 31;
        String str12 = this.playAddress;
        return ((((iHashCode12 + (str12 != null ? str12.hashCode() : 0)) * 31) + this.isPlay) * 31) + this.progress;
    }

    public final int isPlay() {
        return this.isPlay;
    }

    public final void setAudioUrl(@Nullable String str) {
        this.audioUrl = str;
    }

    public final void setBigImgUrl(@Nullable String str) {
        this.bigImgUrl = str;
    }

    public final void setDeliveryApps(@Nullable String str) {
        this.deliveryApps = str;
    }

    public final void setDeliveryTime(@Nullable String str) {
        this.deliveryTime = str;
    }

    public final void setExpiredTime(@Nullable String str) {
        this.expiredTime = str;
    }

    public final void setId(@NotNull String str) {
        this.id = str;
    }

    public final void setIspresence(int i) {
        this.ispresence = i;
    }

    public final void setLanguages(@Nullable String str) {
        this.languages = str;
    }

    public final void setPlay(int i) {
        this.isPlay = i;
    }

    public final void setPlayAddress(@Nullable String str) {
        this.playAddress = str;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setScIntroduction(@Nullable String str) {
        this.scIntroduction = str;
    }

    public final void setSimpleChinese(@Nullable String str) {
        this.simpleChinese = str;
    }

    public final void setSmallImgUrl(@Nullable String str) {
        this.smallImgUrl = str;
    }

    public final void setSort(int i) {
        this.sort = i;
    }

    public final void setSupportDevices(@Nullable String str) {
        this.supportDevices = str;
    }

    @NotNull
    public String toString() {
        return "Music(id=" + this.id + ", whetherPay=" + this.whetherPay + ", goodsId=" + ((Object) this.goodsId) + ", scIntroduction=" + ((Object) this.scIntroduction) + ", supportDevices=" + ((Object) this.supportDevices) + ", deliveryApps=" + ((Object) this.deliveryApps) + ", deliveryTime=" + ((Object) this.deliveryTime) + ", expiredTime=" + ((Object) this.expiredTime) + ", languages=" + ((Object) this.languages) + ", simpleChinese=" + ((Object) this.simpleChinese) + ", bigImgUrl=" + ((Object) this.bigImgUrl) + ", smallImgUrl=" + ((Object) this.smallImgUrl) + ", audioUrl=" + ((Object) this.audioUrl) + ", sort=" + this.sort + ", ispresence=" + this.ispresence + ", playAddress=" + ((Object) this.playAddress) + ", isPlay=" + this.isPlay + ", progress=" + this.progress + ')';
    }

    public /* synthetic */ Music(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i2, int i3, String str13, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? null : str2, (i6 & 8) != 0 ? null : str3, (i6 & 16) != 0 ? null : str4, (i6 & 32) != 0 ? null : str5, (i6 & 64) != 0 ? null : str6, (i6 & 128) != 0 ? null : str7, (i6 & 256) != 0 ? null : str8, (i6 & 512) != 0 ? null : str9, (i6 & 1024) != 0 ? null : str10, (i6 & 2048) != 0 ? null : str11, (i6 & 4096) != 0 ? null : str12, (i6 & 8192) != 0 ? 0 : i2, (i6 & 16384) != 0 ? 0 : i3, (i6 & 32768) != 0 ? null : str13, (i6 & 65536) != 0 ? 0 : i4, (i6 & 131072) != 0 ? 0 : i5);
    }
}

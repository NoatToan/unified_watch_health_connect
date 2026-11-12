package com.huami.sleepassistant.apilib.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001B½\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0004¢\u0006\u0004\bM\u0010NJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003JÁ\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010 \u001a\u00020\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010#\u001a\u00020\u0004HÆ\u0001J\t\u0010%\u001a\u00020\u0002HÖ\u0001J\t\u0010&\u001a\u00020\u0004HÖ\u0001J\u0013\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0015\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b.\u0010/R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b0\u0010,R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u00103R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010*\u001a\u0004\b4\u0010,\"\u0004\b5\u00103R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010*\u001a\u0004\b6\u0010,\"\u0004\b7\u00103R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010*\u001a\u0004\b8\u0010,\"\u0004\b9\u00103R$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010*\u001a\u0004\b:\u0010,\"\u0004\b;\u00103R$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010*\u001a\u0004\b<\u0010,\"\u0004\b=\u00103R$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010*\u001a\u0004\b>\u0010,\"\u0004\b?\u00103R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010*\u001a\u0004\b@\u0010,\"\u0004\bA\u00103R$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010*\u001a\u0004\bB\u0010,\"\u0004\bC\u00103R\"\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010-\u001a\u0004\bD\u0010/\"\u0004\bE\u0010FR$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010*\u001a\u0004\bG\u0010,\"\u0004\bH\u00103R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010*\u001a\u0004\bI\u0010,\"\u0004\bJ\u00103R\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010-\u001a\u0004\bK\u0010/\"\u0004\bL\u0010F¨\u0006O"}, d2 = {"Lcom/huami/sleepassistant/apilib/vo/MusicVo;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "id", "whetherPay", "goodsId", "scIntroduction", "supportDevices", "deliveryApps", "deliveryTime", "expiredTime", "languages", "simpleChinese", "bigImgUrl", "audioUrl", "sort", "playAddress", "smallImgUrl", "progress", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", LogUtil.I, "getWhetherPay", "()I", "getGoodsId", "getScIntroduction", "setScIntroduction", "(Ljava/lang/String;)V", "getSupportDevices", "setSupportDevices", "getDeliveryApps", "setDeliveryApps", "getDeliveryTime", "setDeliveryTime", "getExpiredTime", "setExpiredTime", "getLanguages", "setLanguages", "getSimpleChinese", "setSimpleChinese", "getBigImgUrl", "setBigImgUrl", "getAudioUrl", "setAudioUrl", "getSort", "setSort", "(I)V", "getPlayAddress", "setPlayAddress", "getSmallImgUrl", "setSmallImgUrl", "getProgress", "setProgress", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MusicVo {

    @Nullable
    private String audioUrl;

    @Nullable
    private String bigImgUrl;

    @Nullable
    private String deliveryApps;

    @Nullable
    private String deliveryTime;

    @Nullable
    private String expiredTime;

    @Nullable
    private final String goodsId;

    @NotNull
    private final String id;

    @Nullable
    private String languages;

    @Nullable
    private String playAddress;
    private int progress;

    @Nullable
    private String scIntroduction;

    @Nullable
    private String simpleChinese;

    @Nullable
    private String smallImgUrl;
    private int sort;

    @Nullable
    private String supportDevices;
    private final int whetherPay;

    public MusicVo(@NotNull String str, int i, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, int i2, @Nullable String str12, @Nullable String str13, int i3) {
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
        this.audioUrl = str11;
        this.sort = i2;
        this.playAddress = str12;
        this.smallImgUrl = str13;
        this.progress = i3;
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
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPlayAddress() {
        return this.playAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSmallImgUrl() {
        return this.smallImgUrl;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
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
    public final MusicVo copy(@NotNull String id, int whetherPay, @Nullable String goodsId, @Nullable String scIntroduction, @Nullable String supportDevices, @Nullable String deliveryApps, @Nullable String deliveryTime, @Nullable String expiredTime, @Nullable String languages, @Nullable String simpleChinese, @Nullable String bigImgUrl, @Nullable String audioUrl, int sort, @Nullable String playAddress, @Nullable String smallImgUrl, int progress) {
        return new MusicVo(id, whetherPay, goodsId, scIntroduction, supportDevices, deliveryApps, deliveryTime, expiredTime, languages, simpleChinese, bigImgUrl, audioUrl, sort, playAddress, smallImgUrl, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicVo)) {
            return false;
        }
        MusicVo musicVo = (MusicVo) other;
        return Intrinsics.areEqual(this.id, musicVo.id) && this.whetherPay == musicVo.whetherPay && Intrinsics.areEqual(this.goodsId, musicVo.goodsId) && Intrinsics.areEqual(this.scIntroduction, musicVo.scIntroduction) && Intrinsics.areEqual(this.supportDevices, musicVo.supportDevices) && Intrinsics.areEqual(this.deliveryApps, musicVo.deliveryApps) && Intrinsics.areEqual(this.deliveryTime, musicVo.deliveryTime) && Intrinsics.areEqual(this.expiredTime, musicVo.expiredTime) && Intrinsics.areEqual(this.languages, musicVo.languages) && Intrinsics.areEqual(this.simpleChinese, musicVo.simpleChinese) && Intrinsics.areEqual(this.bigImgUrl, musicVo.bigImgUrl) && Intrinsics.areEqual(this.audioUrl, musicVo.audioUrl) && this.sort == musicVo.sort && Intrinsics.areEqual(this.playAddress, musicVo.playAddress) && Intrinsics.areEqual(this.smallImgUrl, musicVo.smallImgUrl) && this.progress == musicVo.progress;
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
        String str10 = this.audioUrl;
        int iHashCode11 = (((iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31) + this.sort) * 31;
        String str11 = this.playAddress;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.smallImgUrl;
        return ((iHashCode12 + (str12 != null ? str12.hashCode() : 0)) * 31) + this.progress;
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

    public final void setLanguages(@Nullable String str) {
        this.languages = str;
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
        return "MusicVo(id=" + this.id + ", whetherPay=" + this.whetherPay + ", goodsId=" + ((Object) this.goodsId) + ", scIntroduction=" + ((Object) this.scIntroduction) + ", supportDevices=" + ((Object) this.supportDevices) + ", deliveryApps=" + ((Object) this.deliveryApps) + ", deliveryTime=" + ((Object) this.deliveryTime) + ", expiredTime=" + ((Object) this.expiredTime) + ", languages=" + ((Object) this.languages) + ", simpleChinese=" + ((Object) this.simpleChinese) + ", bigImgUrl=" + ((Object) this.bigImgUrl) + ", audioUrl=" + ((Object) this.audioUrl) + ", sort=" + this.sort + ", playAddress=" + ((Object) this.playAddress) + ", smallImgUrl=" + ((Object) this.smallImgUrl) + ", progress=" + this.progress + ')';
    }

    public /* synthetic */ MusicVo(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i2, String str12, String str13, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? null : str3, (i4 & 16) != 0 ? null : str4, (i4 & 32) != 0 ? null : str5, (i4 & 64) != 0 ? null : str6, (i4 & 128) != 0 ? null : str7, (i4 & 256) != 0 ? null : str8, (i4 & 512) != 0 ? null : str9, (i4 & 1024) != 0 ? null : str10, (i4 & 2048) != 0 ? null : str11, (i4 & 4096) != 0 ? 0 : i2, (i4 & 8192) != 0 ? null : str12, (i4 & 16384) == 0 ? str13 : null, (i4 & 32768) != 0 ? 0 : i3);
    }
}

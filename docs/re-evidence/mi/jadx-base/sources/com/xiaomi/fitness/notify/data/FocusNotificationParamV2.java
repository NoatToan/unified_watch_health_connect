package com.xiaomi.fitness.notify.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0015HÆ\u0003J¶\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b\f\u0010!R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2;", "", "protocol", "", "aodTitle", "", "aodPic", "ticker", "tickerPic", "enableFloat", "", "updatable", "isPartBg", "timeout", "baseInfo", "Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BaseInfo;", "hintInfo", "picInfo", "bgInfo", "Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BgInfo;", "progressInfo", "Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2ProgressInfo;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BaseInfo;Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BaseInfo;Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BaseInfo;Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BgInfo;Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2ProgressInfo;)V", "getProtocol", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAodTitle", "()Ljava/lang/String;", "getAodPic", "getTicker", "getTickerPic", "getEnableFloat", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUpdatable", "getTimeout", "getBaseInfo", "()Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BaseInfo;", "getHintInfo", "getPicInfo", "getBgInfo", "()Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BgInfo;", "getProgressInfo", "()Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2ProgressInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BaseInfo;Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BaseInfo;Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BaseInfo;Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BgInfo;Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2ProgressInfo;)Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2;", "equals", "other", "hashCode", "toString", "notify-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FocusNotificationParamV2 {

    @Nullable
    private final String aodPic;

    @Nullable
    private final String aodTitle;

    @Nullable
    private final FocusNotificationParamV2BaseInfo baseInfo;

    @Nullable
    private final FocusNotificationParamV2BgInfo bgInfo;

    @Nullable
    private final Boolean enableFloat;

    @Nullable
    private final FocusNotificationParamV2BaseInfo hintInfo;

    @Nullable
    private final Boolean isPartBg;

    @Nullable
    private final FocusNotificationParamV2BaseInfo picInfo;

    @Nullable
    private final FocusNotificationParamV2ProgressInfo progressInfo;

    @Nullable
    private final Integer protocol;

    @Nullable
    private final String ticker;

    @Nullable
    private final String tickerPic;

    @Nullable
    private final Integer timeout;

    @Nullable
    private final Boolean updatable;

    public FocusNotificationParamV2(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Integer num2, @Nullable FocusNotificationParamV2BaseInfo focusNotificationParamV2BaseInfo, @Nullable FocusNotificationParamV2BaseInfo focusNotificationParamV2BaseInfo2, @Nullable FocusNotificationParamV2BaseInfo focusNotificationParamV2BaseInfo3, @Nullable FocusNotificationParamV2BgInfo focusNotificationParamV2BgInfo, @Nullable FocusNotificationParamV2ProgressInfo focusNotificationParamV2ProgressInfo) {
        this.protocol = num;
        this.aodTitle = str;
        this.aodPic = str2;
        this.ticker = str3;
        this.tickerPic = str4;
        this.enableFloat = bool;
        this.updatable = bool2;
        this.isPartBg = bool3;
        this.timeout = num2;
        this.baseInfo = focusNotificationParamV2BaseInfo;
        this.hintInfo = focusNotificationParamV2BaseInfo2;
        this.picInfo = focusNotificationParamV2BaseInfo3;
        this.bgInfo = focusNotificationParamV2BgInfo;
        this.progressInfo = focusNotificationParamV2ProgressInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getProtocol() {
        return this.protocol;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final FocusNotificationParamV2BaseInfo getBaseInfo() {
        return this.baseInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final FocusNotificationParamV2BaseInfo getHintInfo() {
        return this.hintInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final FocusNotificationParamV2BaseInfo getPicInfo() {
        return this.picInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final FocusNotificationParamV2BgInfo getBgInfo() {
        return this.bgInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final FocusNotificationParamV2ProgressInfo getProgressInfo() {
        return this.progressInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAodTitle() {
        return this.aodTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAodPic() {
        return this.aodPic;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTicker() {
        return this.ticker;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTickerPic() {
        return this.tickerPic;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getEnableFloat() {
        return this.enableFloat;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getUpdatable() {
        return this.updatable;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsPartBg() {
        return this.isPartBg;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getTimeout() {
        return this.timeout;
    }

    @NotNull
    public final FocusNotificationParamV2 copy(@Nullable Integer protocol, @Nullable String aodTitle, @Nullable String aodPic, @Nullable String ticker, @Nullable String tickerPic, @Nullable Boolean enableFloat, @Nullable Boolean updatable, @Nullable Boolean isPartBg, @Nullable Integer timeout, @Nullable FocusNotificationParamV2BaseInfo baseInfo, @Nullable FocusNotificationParamV2BaseInfo hintInfo, @Nullable FocusNotificationParamV2BaseInfo picInfo, @Nullable FocusNotificationParamV2BgInfo bgInfo, @Nullable FocusNotificationParamV2ProgressInfo progressInfo) {
        return new FocusNotificationParamV2(protocol, aodTitle, aodPic, ticker, tickerPic, enableFloat, updatable, isPartBg, timeout, baseInfo, hintInfo, picInfo, bgInfo, progressInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FocusNotificationParamV2)) {
            return false;
        }
        FocusNotificationParamV2 focusNotificationParamV2 = (FocusNotificationParamV2) other;
        return Intrinsics.areEqual(this.protocol, focusNotificationParamV2.protocol) && Intrinsics.areEqual(this.aodTitle, focusNotificationParamV2.aodTitle) && Intrinsics.areEqual(this.aodPic, focusNotificationParamV2.aodPic) && Intrinsics.areEqual(this.ticker, focusNotificationParamV2.ticker) && Intrinsics.areEqual(this.tickerPic, focusNotificationParamV2.tickerPic) && Intrinsics.areEqual(this.enableFloat, focusNotificationParamV2.enableFloat) && Intrinsics.areEqual(this.updatable, focusNotificationParamV2.updatable) && Intrinsics.areEqual(this.isPartBg, focusNotificationParamV2.isPartBg) && Intrinsics.areEqual(this.timeout, focusNotificationParamV2.timeout) && Intrinsics.areEqual(this.baseInfo, focusNotificationParamV2.baseInfo) && Intrinsics.areEqual(this.hintInfo, focusNotificationParamV2.hintInfo) && Intrinsics.areEqual(this.picInfo, focusNotificationParamV2.picInfo) && Intrinsics.areEqual(this.bgInfo, focusNotificationParamV2.bgInfo) && Intrinsics.areEqual(this.progressInfo, focusNotificationParamV2.progressInfo);
    }

    @Nullable
    public final String getAodPic() {
        return this.aodPic;
    }

    @Nullable
    public final String getAodTitle() {
        return this.aodTitle;
    }

    @Nullable
    public final FocusNotificationParamV2BaseInfo getBaseInfo() {
        return this.baseInfo;
    }

    @Nullable
    public final FocusNotificationParamV2BgInfo getBgInfo() {
        return this.bgInfo;
    }

    @Nullable
    public final Boolean getEnableFloat() {
        return this.enableFloat;
    }

    @Nullable
    public final FocusNotificationParamV2BaseInfo getHintInfo() {
        return this.hintInfo;
    }

    @Nullable
    public final FocusNotificationParamV2BaseInfo getPicInfo() {
        return this.picInfo;
    }

    @Nullable
    public final FocusNotificationParamV2ProgressInfo getProgressInfo() {
        return this.progressInfo;
    }

    @Nullable
    public final Integer getProtocol() {
        return this.protocol;
    }

    @Nullable
    public final String getTicker() {
        return this.ticker;
    }

    @Nullable
    public final String getTickerPic() {
        return this.tickerPic;
    }

    @Nullable
    public final Integer getTimeout() {
        return this.timeout;
    }

    @Nullable
    public final Boolean getUpdatable() {
        return this.updatable;
    }

    public int hashCode() {
        Integer num = this.protocol;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.aodTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.aodPic;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ticker;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tickerPic;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.enableFloat;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.updatable;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isPartBg;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.timeout;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        FocusNotificationParamV2BaseInfo focusNotificationParamV2BaseInfo = this.baseInfo;
        int iHashCode10 = (iHashCode9 + (focusNotificationParamV2BaseInfo == null ? 0 : focusNotificationParamV2BaseInfo.hashCode())) * 31;
        FocusNotificationParamV2BaseInfo focusNotificationParamV2BaseInfo2 = this.hintInfo;
        int iHashCode11 = (iHashCode10 + (focusNotificationParamV2BaseInfo2 == null ? 0 : focusNotificationParamV2BaseInfo2.hashCode())) * 31;
        FocusNotificationParamV2BaseInfo focusNotificationParamV2BaseInfo3 = this.picInfo;
        int iHashCode12 = (iHashCode11 + (focusNotificationParamV2BaseInfo3 == null ? 0 : focusNotificationParamV2BaseInfo3.hashCode())) * 31;
        FocusNotificationParamV2BgInfo focusNotificationParamV2BgInfo = this.bgInfo;
        int iHashCode13 = (iHashCode12 + (focusNotificationParamV2BgInfo == null ? 0 : focusNotificationParamV2BgInfo.hashCode())) * 31;
        FocusNotificationParamV2ProgressInfo focusNotificationParamV2ProgressInfo = this.progressInfo;
        return iHashCode13 + (focusNotificationParamV2ProgressInfo != null ? focusNotificationParamV2ProgressInfo.hashCode() : 0);
    }

    @Nullable
    public final Boolean isPartBg() {
        return this.isPartBg;
    }

    @NotNull
    public String toString() {
        return "FocusNotificationParamV2(protocol=" + this.protocol + ", aodTitle=" + this.aodTitle + ", aodPic=" + this.aodPic + ", ticker=" + this.ticker + ", tickerPic=" + this.tickerPic + ", enableFloat=" + this.enableFloat + ", updatable=" + this.updatable + ", isPartBg=" + this.isPartBg + ", timeout=" + this.timeout + ", baseInfo=" + this.baseInfo + ", hintInfo=" + this.hintInfo + ", picInfo=" + this.picInfo + ", bgInfo=" + this.bgInfo + ", progressInfo=" + this.progressInfo + ")";
    }
}

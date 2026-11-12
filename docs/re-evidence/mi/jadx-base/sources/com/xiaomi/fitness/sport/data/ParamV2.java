package com.xiaomi.fitness.sport.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010+\u001a\u00020\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003Jn\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/sport/data/ParamV2;", "", "protocol", "", "ticker", "", "aodTitle", "highlightInfo", "Lcom/xiaomi/fitness/sport/data/HighlightInfo;", "picInfo", "Lcom/xiaomi/fitness/sport/data/PicInfo;", "hintInfo", "Lcom/xiaomi/fitness/sport/data/HintInfo;", "timeout", "enableFloat", "", "updatable", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/sport/data/HighlightInfo;Lcom/xiaomi/fitness/sport/data/PicInfo;Lcom/xiaomi/fitness/sport/data/HintInfo;Ljava/lang/Integer;ZZ)V", "getProtocol", "()I", "getTicker", "()Ljava/lang/String;", "getAodTitle", "getHighlightInfo", "()Lcom/xiaomi/fitness/sport/data/HighlightInfo;", "getPicInfo", "()Lcom/xiaomi/fitness/sport/data/PicInfo;", "getHintInfo", "()Lcom/xiaomi/fitness/sport/data/HintInfo;", "getTimeout", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEnableFloat", "()Z", "getUpdatable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/sport/data/HighlightInfo;Lcom/xiaomi/fitness/sport/data/PicInfo;Lcom/xiaomi/fitness/sport/data/HintInfo;Ljava/lang/Integer;ZZ)Lcom/xiaomi/fitness/sport/data/ParamV2;", "equals", "other", "hashCode", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ParamV2 {

    @Nullable
    private final String aodTitle;
    private final boolean enableFloat;

    @NotNull
    private final HighlightInfo highlightInfo;

    @NotNull
    private final HintInfo hintInfo;

    @NotNull
    private final PicInfo picInfo;
    private final int protocol;

    @Nullable
    private final String ticker;

    @Nullable
    private final Integer timeout;
    private final boolean updatable;

    public ParamV2(int i, @Nullable String str, @Nullable String str2, @NotNull HighlightInfo highlightInfo, @NotNull PicInfo picInfo, @NotNull HintInfo hintInfo, @Nullable Integer num, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(highlightInfo, "highlightInfo");
        Intrinsics.checkNotNullParameter(picInfo, "picInfo");
        Intrinsics.checkNotNullParameter(hintInfo, "hintInfo");
        this.protocol = i;
        this.ticker = str;
        this.aodTitle = str2;
        this.highlightInfo = highlightInfo;
        this.picInfo = picInfo;
        this.hintInfo = hintInfo;
        this.timeout = num;
        this.enableFloat = z;
        this.updatable = z2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getProtocol() {
        return this.protocol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTicker() {
        return this.ticker;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAodTitle() {
        return this.aodTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HighlightInfo getHighlightInfo() {
        return this.highlightInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PicInfo getPicInfo() {
        return this.picInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HintInfo getHintInfo() {
        return this.hintInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getTimeout() {
        return this.timeout;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getEnableFloat() {
        return this.enableFloat;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getUpdatable() {
        return this.updatable;
    }

    @NotNull
    public final ParamV2 copy(int protocol, @Nullable String ticker, @Nullable String aodTitle, @NotNull HighlightInfo highlightInfo, @NotNull PicInfo picInfo, @NotNull HintInfo hintInfo, @Nullable Integer timeout, boolean enableFloat, boolean updatable) {
        Intrinsics.checkNotNullParameter(highlightInfo, "highlightInfo");
        Intrinsics.checkNotNullParameter(picInfo, "picInfo");
        Intrinsics.checkNotNullParameter(hintInfo, "hintInfo");
        return new ParamV2(protocol, ticker, aodTitle, highlightInfo, picInfo, hintInfo, timeout, enableFloat, updatable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParamV2)) {
            return false;
        }
        ParamV2 paramV2 = (ParamV2) other;
        return this.protocol == paramV2.protocol && Intrinsics.areEqual(this.ticker, paramV2.ticker) && Intrinsics.areEqual(this.aodTitle, paramV2.aodTitle) && Intrinsics.areEqual(this.highlightInfo, paramV2.highlightInfo) && Intrinsics.areEqual(this.picInfo, paramV2.picInfo) && Intrinsics.areEqual(this.hintInfo, paramV2.hintInfo) && Intrinsics.areEqual(this.timeout, paramV2.timeout) && this.enableFloat == paramV2.enableFloat && this.updatable == paramV2.updatable;
    }

    @Nullable
    public final String getAodTitle() {
        return this.aodTitle;
    }

    public final boolean getEnableFloat() {
        return this.enableFloat;
    }

    @NotNull
    public final HighlightInfo getHighlightInfo() {
        return this.highlightInfo;
    }

    @NotNull
    public final HintInfo getHintInfo() {
        return this.hintInfo;
    }

    @NotNull
    public final PicInfo getPicInfo() {
        return this.picInfo;
    }

    public final int getProtocol() {
        return this.protocol;
    }

    @Nullable
    public final String getTicker() {
        return this.ticker;
    }

    @Nullable
    public final Integer getTimeout() {
        return this.timeout;
    }

    public final boolean getUpdatable() {
        return this.updatable;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.protocol) * 31;
        String str = this.ticker;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.aodTitle;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.highlightInfo.hashCode()) * 31) + this.picInfo.hashCode()) * 31) + this.hintInfo.hashCode()) * 31;
        Integer num = this.timeout;
        return ((((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.enableFloat)) * 31) + Boolean.hashCode(this.updatable);
    }

    @NotNull
    public String toString() {
        return "ParamV2(protocol=" + this.protocol + ", ticker=" + this.ticker + ", aodTitle=" + this.aodTitle + ", highlightInfo=" + this.highlightInfo + ", picInfo=" + this.picInfo + ", hintInfo=" + this.hintInfo + ", timeout=" + this.timeout + ", enableFloat=" + this.enableFloat + ", updatable=" + this.updatable + ")";
    }

    public /* synthetic */ ParamV2(int i, String str, String str2, HighlightInfo highlightInfo, PicInfo picInfo, HintInfo hintInfo, Integer num, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, highlightInfo, picInfo, hintInfo, (i2 & 64) != 0 ? null : num, z, z2);
    }
}

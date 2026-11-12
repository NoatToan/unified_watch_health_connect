package com.huami.sleep.vo;

import com.alipay.sdk.m.x.d;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.model.BreathQualityRiskLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b(\u0010)J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R$\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/huami/sleep/vo/BreathQualityDayScoreVo;", "", "", "component1", "", "component2", "component3", "Lcom/huami/sleep/model/BreathQualityRiskLevel;", "component4", "title", "titleColor", "tipStr", "enumLevel", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", d.o, "(Ljava/lang/String;)V", "b", LogUtil.I, "getTitleColor", "()I", "setTitleColor", "(I)V", "c", "getTipStr", "setTipStr", GoogleApiAvailabilityLight.a, "Lcom/huami/sleep/model/BreathQualityRiskLevel;", "getEnumLevel", "()Lcom/huami/sleep/model/BreathQualityRiskLevel;", "setEnumLevel", "(Lcom/huami/sleep/model/BreathQualityRiskLevel;)V", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/huami/sleep/model/BreathQualityRiskLevel;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BreathQualityDayScoreVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int titleColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private String tipStr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private BreathQualityRiskLevel enumLevel;

    public BreathQualityDayScoreVo() {
        this(null, 0, null, null, 15, null);
    }

    public BreathQualityDayScoreVo(@Nullable String str, int i, @Nullable String str2, @Nullable BreathQualityRiskLevel breathQualityRiskLevel) {
        this.title = str;
        this.titleColor = i;
        this.tipStr = str2;
        this.enumLevel = breathQualityRiskLevel;
    }

    public static /* synthetic */ BreathQualityDayScoreVo copy$default(BreathQualityDayScoreVo breathQualityDayScoreVo, String str, int i, String str2, BreathQualityRiskLevel breathQualityRiskLevel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = breathQualityDayScoreVo.title;
        }
        if ((i2 & 2) != 0) {
            i = breathQualityDayScoreVo.titleColor;
        }
        if ((i2 & 4) != 0) {
            str2 = breathQualityDayScoreVo.tipStr;
        }
        if ((i2 & 8) != 0) {
            breathQualityRiskLevel = breathQualityDayScoreVo.enumLevel;
        }
        return breathQualityDayScoreVo.copy(str, i, str2, breathQualityRiskLevel);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTitleColor() {
        return this.titleColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTipStr() {
        return this.tipStr;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BreathQualityRiskLevel getEnumLevel() {
        return this.enumLevel;
    }

    @NotNull
    public final BreathQualityDayScoreVo copy(@Nullable String title, int titleColor, @Nullable String tipStr, @Nullable BreathQualityRiskLevel enumLevel) {
        return new BreathQualityDayScoreVo(title, titleColor, tipStr, enumLevel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreathQualityDayScoreVo)) {
            return false;
        }
        BreathQualityDayScoreVo breathQualityDayScoreVo = (BreathQualityDayScoreVo) other;
        return Intrinsics.areEqual(this.title, breathQualityDayScoreVo.title) && this.titleColor == breathQualityDayScoreVo.titleColor && Intrinsics.areEqual(this.tipStr, breathQualityDayScoreVo.tipStr) && this.enumLevel == breathQualityDayScoreVo.enumLevel;
    }

    @Nullable
    public final BreathQualityRiskLevel getEnumLevel() {
        return this.enumLevel;
    }

    @Nullable
    public final String getTipStr() {
        return this.tipStr;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.titleColor) * 31;
        String str2 = this.tipStr;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BreathQualityRiskLevel breathQualityRiskLevel = this.enumLevel;
        return iHashCode2 + (breathQualityRiskLevel != null ? breathQualityRiskLevel.hashCode() : 0);
    }

    public final void setEnumLevel(@Nullable BreathQualityRiskLevel breathQualityRiskLevel) {
        this.enumLevel = breathQualityRiskLevel;
    }

    public final void setTipStr(@Nullable String str) {
        this.tipStr = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTitleColor(int i) {
        this.titleColor = i;
    }

    @NotNull
    public String toString() {
        return "BreathQualityDayScoreVo(title=" + this.title + ", titleColor=" + this.titleColor + ", tipStr=" + this.tipStr + ", enumLevel=" + this.enumLevel + ")";
    }

    public /* synthetic */ BreathQualityDayScoreVo(String str, int i, String str2, BreathQualityRiskLevel breathQualityRiskLevel, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : breathQualityRiskLevel);
    }
}

package com.xiaomi.fitness.userinfo.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/userinfo/bean/UserIndicatorsInfo;", "", "indicators", "", "indicatorsValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIndicators", "()Ljava/lang/String;", "setIndicators", "(Ljava/lang/String;)V", "getIndicatorsValue", "setIndicatorsValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserIndicatorsInfo {

    @NotNull
    private String indicators;

    @NotNull
    private String indicatorsValue;

    public UserIndicatorsInfo(@NotNull String indicators, @NotNull String indicatorsValue) {
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        Intrinsics.checkNotNullParameter(indicatorsValue, "indicatorsValue");
        this.indicators = indicators;
        this.indicatorsValue = indicatorsValue;
    }

    public static /* synthetic */ UserIndicatorsInfo copy$default(UserIndicatorsInfo userIndicatorsInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userIndicatorsInfo.indicators;
        }
        if ((i & 2) != 0) {
            str2 = userIndicatorsInfo.indicatorsValue;
        }
        return userIndicatorsInfo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIndicators() {
        return this.indicators;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIndicatorsValue() {
        return this.indicatorsValue;
    }

    @NotNull
    public final UserIndicatorsInfo copy(@NotNull String indicators, @NotNull String indicatorsValue) {
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        Intrinsics.checkNotNullParameter(indicatorsValue, "indicatorsValue");
        return new UserIndicatorsInfo(indicators, indicatorsValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserIndicatorsInfo)) {
            return false;
        }
        UserIndicatorsInfo userIndicatorsInfo = (UserIndicatorsInfo) other;
        return Intrinsics.areEqual(this.indicators, userIndicatorsInfo.indicators) && Intrinsics.areEqual(this.indicatorsValue, userIndicatorsInfo.indicatorsValue);
    }

    @NotNull
    public final String getIndicators() {
        return this.indicators;
    }

    @NotNull
    public final String getIndicatorsValue() {
        return this.indicatorsValue;
    }

    public int hashCode() {
        return (this.indicators.hashCode() * 31) + this.indicatorsValue.hashCode();
    }

    public final void setIndicators(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.indicators = str;
    }

    public final void setIndicatorsValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.indicatorsValue = str;
    }

    @NotNull
    public String toString() {
        return "UserIndicatorsInfo(indicators=" + this.indicators + ", indicatorsValue=" + this.indicatorsValue + ")";
    }
}

package com.huami.sleep.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\r\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/huami/sleep/service/SleepChartSection;", "", "", "component1", "component2", "component3", "component4", "Lcom/huami/sleep/service/SleepMode;", "component5", "startIndex", "endIndex", "value", "color", "mode", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getStartIndex", "()I", "b", "getEndIndex", "c", "getValue", GoogleApiAvailabilityLight.a, "getColor", "e", "Lcom/huami/sleep/service/SleepMode;", "getMode", "()Lcom/huami/sleep/service/SleepMode;", "<init>", "(IIIILcom/huami/sleep/service/SleepMode;)V", "sleep-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepChartSection {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int startIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int endIndex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int color;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final SleepMode mode;

    public SleepChartSection(int i, int i2, int i3, int i4, @NotNull SleepMode sleepMode) {
        this.startIndex = i;
        this.endIndex = i2;
        this.value = i3;
        this.color = i4;
        this.mode = sleepMode;
    }

    public static /* synthetic */ SleepChartSection copy$default(SleepChartSection sleepChartSection, int i, int i2, int i3, int i4, SleepMode sleepMode, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = sleepChartSection.startIndex;
        }
        if ((i5 & 2) != 0) {
            i2 = sleepChartSection.endIndex;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = sleepChartSection.value;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = sleepChartSection.color;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            sleepMode = sleepChartSection.mode;
        }
        return sleepChartSection.copy(i, i6, i7, i8, sleepMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SleepMode getMode() {
        return this.mode;
    }

    @NotNull
    public final SleepChartSection copy(int startIndex, int endIndex, int value, int color, @NotNull SleepMode mode) {
        return new SleepChartSection(startIndex, endIndex, value, color, mode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepChartSection)) {
            return false;
        }
        SleepChartSection sleepChartSection = (SleepChartSection) other;
        return this.startIndex == sleepChartSection.startIndex && this.endIndex == sleepChartSection.endIndex && this.value == sleepChartSection.value && this.color == sleepChartSection.color && this.mode == sleepChartSection.mode;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    @NotNull
    public final SleepMode getMode() {
        return this.mode;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((this.startIndex * 31) + this.endIndex) * 31) + this.value) * 31) + this.color) * 31) + this.mode.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepChartSection(startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", value=" + this.value + ", color=" + this.color + ", mode=" + this.mode + ")";
    }
}

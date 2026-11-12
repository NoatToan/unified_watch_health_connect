package com.xiaomi.fitness.health.todayhealth.ui.items;

import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/SleepAverageRateModel;", "", "type", "", "titleResId", "drawableResId", "valueCharSequence", "", "ref", "", "sleepSegmentReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "<init>", "(IIILjava/lang/CharSequence;Ljava/lang/String;Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;)V", "getType", "()I", "getTitleResId", "getDrawableResId", "getValueCharSequence", "()Ljava/lang/CharSequence;", "getRef", "()Ljava/lang/String;", "getSleepSegmentReport", "()Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepAverageRateModel {
    private final int drawableResId;

    @NotNull
    private final String ref;

    @NotNull
    private final SleepSegmentReport sleepSegmentReport;
    private final int titleResId;
    private final int type;

    @NotNull
    private final CharSequence valueCharSequence;

    public SleepAverageRateModel(int i, int i2, int i3, @NotNull CharSequence valueCharSequence, @NotNull String ref, @NotNull SleepSegmentReport sleepSegmentReport) {
        Intrinsics.checkNotNullParameter(valueCharSequence, "valueCharSequence");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(sleepSegmentReport, "sleepSegmentReport");
        this.type = i;
        this.titleResId = i2;
        this.drawableResId = i3;
        this.valueCharSequence = valueCharSequence;
        this.ref = ref;
        this.sleepSegmentReport = sleepSegmentReport;
    }

    public static /* synthetic */ SleepAverageRateModel copy$default(SleepAverageRateModel sleepAverageRateModel, int i, int i2, int i3, CharSequence charSequence, String str, SleepSegmentReport sleepSegmentReport, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = sleepAverageRateModel.type;
        }
        if ((i4 & 2) != 0) {
            i2 = sleepAverageRateModel.titleResId;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = sleepAverageRateModel.drawableResId;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            charSequence = sleepAverageRateModel.valueCharSequence;
        }
        CharSequence charSequence2 = charSequence;
        if ((i4 & 16) != 0) {
            str = sleepAverageRateModel.ref;
        }
        String str2 = str;
        if ((i4 & 32) != 0) {
            sleepSegmentReport = sleepAverageRateModel.sleepSegmentReport;
        }
        return sleepAverageRateModel.copy(i, i5, i6, charSequence2, str2, sleepSegmentReport);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDrawableResId() {
        return this.drawableResId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CharSequence getValueCharSequence() {
        return this.valueCharSequence;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SleepSegmentReport getSleepSegmentReport() {
        return this.sleepSegmentReport;
    }

    @NotNull
    public final SleepAverageRateModel copy(int type, int titleResId, int drawableResId, @NotNull CharSequence valueCharSequence, @NotNull String ref, @NotNull SleepSegmentReport sleepSegmentReport) {
        Intrinsics.checkNotNullParameter(valueCharSequence, "valueCharSequence");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(sleepSegmentReport, "sleepSegmentReport");
        return new SleepAverageRateModel(type, titleResId, drawableResId, valueCharSequence, ref, sleepSegmentReport);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepAverageRateModel)) {
            return false;
        }
        SleepAverageRateModel sleepAverageRateModel = (SleepAverageRateModel) other;
        return this.type == sleepAverageRateModel.type && this.titleResId == sleepAverageRateModel.titleResId && this.drawableResId == sleepAverageRateModel.drawableResId && Intrinsics.areEqual(this.valueCharSequence, sleepAverageRateModel.valueCharSequence) && Intrinsics.areEqual(this.ref, sleepAverageRateModel.ref) && Intrinsics.areEqual(this.sleepSegmentReport, sleepAverageRateModel.sleepSegmentReport);
    }

    public final int getDrawableResId() {
        return this.drawableResId;
    }

    @NotNull
    public final String getRef() {
        return this.ref;
    }

    @NotNull
    public final SleepSegmentReport getSleepSegmentReport() {
        return this.sleepSegmentReport;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final CharSequence getValueCharSequence() {
        return this.valueCharSequence;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.titleResId)) * 31) + Integer.hashCode(this.drawableResId)) * 31) + this.valueCharSequence.hashCode()) * 31) + this.ref.hashCode()) * 31) + this.sleepSegmentReport.hashCode();
    }

    @NotNull
    public String toString() {
        int i = this.type;
        int i2 = this.titleResId;
        int i3 = this.drawableResId;
        CharSequence charSequence = this.valueCharSequence;
        return "SleepAverageRateModel(type=" + i + ", titleResId=" + i2 + ", drawableResId=" + i3 + ", valueCharSequence=" + ((Object) charSequence) + ", ref=" + this.ref + ", sleepSegmentReport=" + this.sleepSegmentReport + ")";
    }
}

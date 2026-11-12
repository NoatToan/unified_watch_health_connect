package com.huami.heartrate.ui;

import android.text.SpannableStringBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/heartrate/ui/HistoryListValueData;", "", "", "component1", "component2", "component3", "Landroid/text/SpannableStringBuilder;", "component4", "year", "date", "time", "value", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getYear", "()Ljava/lang/String;", "b", "getDate", "c", "getTime", GoogleApiAvailabilityLight.a, "Landroid/text/SpannableStringBuilder;", "getValue", "()Landroid/text/SpannableStringBuilder;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/text/SpannableStringBuilder;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HistoryListValueData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String year;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String time;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final SpannableStringBuilder value;

    public HistoryListValueData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull SpannableStringBuilder spannableStringBuilder) {
        this.year = str;
        this.date = str2;
        this.time = str3;
        this.value = spannableStringBuilder;
    }

    public static /* synthetic */ HistoryListValueData copy$default(HistoryListValueData historyListValueData, String str, String str2, String str3, SpannableStringBuilder spannableStringBuilder, int i, Object obj) {
        if ((i & 1) != 0) {
            str = historyListValueData.year;
        }
        if ((i & 2) != 0) {
            str2 = historyListValueData.date;
        }
        if ((i & 4) != 0) {
            str3 = historyListValueData.time;
        }
        if ((i & 8) != 0) {
            spannableStringBuilder = historyListValueData.value;
        }
        return historyListValueData.copy(str, str2, str3, spannableStringBuilder);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SpannableStringBuilder getValue() {
        return this.value;
    }

    @NotNull
    public final HistoryListValueData copy(@NotNull String year, @NotNull String date, @NotNull String time, @NotNull SpannableStringBuilder value) {
        return new HistoryListValueData(year, date, time, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryListValueData)) {
            return false;
        }
        HistoryListValueData historyListValueData = (HistoryListValueData) other;
        return Intrinsics.areEqual(this.year, historyListValueData.year) && Intrinsics.areEqual(this.date, historyListValueData.date) && Intrinsics.areEqual(this.time, historyListValueData.time) && Intrinsics.areEqual(this.value, historyListValueData.value);
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    @NotNull
    public final SpannableStringBuilder getValue() {
        return this.value;
    }

    @NotNull
    public final String getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((((this.year.hashCode() * 31) + this.date.hashCode()) * 31) + this.time.hashCode()) * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "HistoryListValueData(year=" + this.year + ", date=" + this.date + ", time=" + this.time + ", value=" + ((Object) this.value) + ")";
    }
}

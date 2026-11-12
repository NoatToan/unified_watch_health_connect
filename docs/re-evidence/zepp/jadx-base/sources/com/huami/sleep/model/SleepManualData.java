package com.huami.sleep.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/huami/sleep/model/SleepManualData;", "", "", "component1", "component2", "date", "summary", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "b", "getSummary", "setSummary", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepManualData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private String date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private String summary;

    /* JADX WARN: Multi-variable type inference failed */
    public SleepManualData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public SleepManualData(@Nullable String str, @Nullable String str2) {
        this.date = str;
        this.summary = str2;
    }

    public static /* synthetic */ SleepManualData copy$default(SleepManualData sleepManualData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sleepManualData.date;
        }
        if ((i & 2) != 0) {
            str2 = sleepManualData.summary;
        }
        return sleepManualData.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    @NotNull
    public final SleepManualData copy(@Nullable String date, @Nullable String summary) {
        return new SleepManualData(date, summary);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepManualData)) {
            return false;
        }
        SleepManualData sleepManualData = (SleepManualData) other;
        return Intrinsics.areEqual(this.date, sleepManualData.date) && Intrinsics.areEqual(this.summary, sleepManualData.summary);
    }

    @Nullable
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        String str = this.date;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.summary;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDate(@Nullable String str) {
        this.date = str;
    }

    public final void setSummary(@Nullable String str) {
        this.summary = str;
    }

    @NotNull
    public String toString() {
        return "SleepManualData(date=" + this.date + ", summary=" + this.summary + ")";
    }

    public /* synthetic */ SleepManualData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}

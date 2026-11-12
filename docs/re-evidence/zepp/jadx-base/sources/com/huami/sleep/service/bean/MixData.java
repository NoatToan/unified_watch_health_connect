package com.huami.sleep.service.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/sleep/service/bean/MixData;", "", "", "component1", "component2", "summary", "date", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getSummary", "()Ljava/lang/String;", "b", "getDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MixData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("summary")
    @Nullable
    private final String summary;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("date")
    @NotNull
    private final String date;

    /* JADX WARN: Multi-variable type inference failed */
    public MixData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public MixData(@Nullable String str, @NotNull String str2) {
        this.summary = str;
        this.date = str2;
    }

    public static /* synthetic */ MixData copy$default(MixData mixData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mixData.summary;
        }
        if ((i & 2) != 0) {
            str2 = mixData.date;
        }
        return mixData.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final MixData copy(@Nullable String summary, @NotNull String date) {
        return new MixData(summary, date);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MixData)) {
            return false;
        }
        MixData mixData = (MixData) other;
        return Intrinsics.areEqual(this.summary, mixData.summary) && Intrinsics.areEqual(this.date, mixData.date);
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        String str = this.summary;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.date.hashCode();
    }

    @NotNull
    public String toString() {
        return "MixData(summary=" + this.summary + ", date=" + this.date + ")";
    }

    public /* synthetic */ MixData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "1970-01-01" : str2);
    }
}

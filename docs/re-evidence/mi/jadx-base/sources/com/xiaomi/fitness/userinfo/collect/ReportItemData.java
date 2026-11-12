package com.xiaomi.fitness.userinfo.collect;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.watch.face.edit.utils.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\tHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/userinfo/collect/ReportItemData;", "", "category", "", "key", "detail", Source.TIME_SECOND, "", "count", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "getCategory", "()Ljava/lang/String;", "getKey", "getDetail", "getTimeSecond", "()J", "setTimeSecond", "(J)V", "getCount", "()I", FitnessReportKey.setCount, "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReportItemData {

    @SerializedName("category")
    @NotNull
    private final String category;

    @SerializedName("value")
    private int count;

    @SerializedName("detail")
    @NotNull
    private final String detail;

    @SerializedName("key")
    @NotNull
    private final String key;

    @SerializedName("time")
    private long timeSecond;

    public ReportItemData(@NotNull String category, @NotNull String key, @NotNull String detail, long j, int i) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.category = category;
        this.key = key;
        this.detail = detail;
        this.timeSecond = j;
        this.count = i;
    }

    public static /* synthetic */ ReportItemData copy$default(ReportItemData reportItemData, String str, String str2, String str3, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = reportItemData.category;
        }
        if ((i2 & 2) != 0) {
            str2 = reportItemData.key;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = reportItemData.detail;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            j = reportItemData.timeSecond;
        }
        long j2 = j;
        if ((i2 & 16) != 0) {
            i = reportItemData.count;
        }
        return reportItemData.copy(str, str4, str5, j2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimeSecond() {
        return this.timeSecond;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final ReportItemData copy(@NotNull String category, @NotNull String key, @NotNull String detail, long timeSecond, int count) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(detail, "detail");
        return new ReportItemData(category, key, detail, timeSecond, count);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportItemData)) {
            return false;
        }
        ReportItemData reportItemData = (ReportItemData) other;
        return Intrinsics.areEqual(this.category, reportItemData.category) && Intrinsics.areEqual(this.key, reportItemData.key) && Intrinsics.areEqual(this.detail, reportItemData.detail) && this.timeSecond == reportItemData.timeSecond && this.count == reportItemData.count;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final String getDetail() {
        return this.detail;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final long getTimeSecond() {
        return this.timeSecond;
    }

    public int hashCode() {
        return (((((((this.category.hashCode() * 31) + this.key.hashCode()) * 31) + this.detail.hashCode()) * 31) + Long.hashCode(this.timeSecond)) * 31) + Integer.hashCode(this.count);
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setTimeSecond(long j) {
        this.timeSecond = j;
    }

    @NotNull
    public String toString() {
        return "ReportItemData(category=" + this.category + ", key=" + this.key + ", detail=" + this.detail + ", timeSecond=" + this.timeSecond + ", count=" + this.count + ")";
    }
}

package com.huami.bodymeasurements.common.business.history;

import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/bodymeasurements/common/business/history/HistoryDataItem;", "", "", "component1", "", "component2", "", "component3", "valueStr", "timeStamp", "delete", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getValueStr", "()Ljava/lang/String;", "b", "J", "getTimeStamp", "()J", "c", "Z", "getDelete", "()Z", "<init>", "(Ljava/lang/String;JZ)V", "common_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HistoryDataItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String valueStr;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long timeStamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean delete;

    public HistoryDataItem(@NotNull String str, long j, boolean z) {
        this.valueStr = str;
        this.timeStamp = j;
        this.delete = z;
    }

    public static /* synthetic */ HistoryDataItem copy$default(HistoryDataItem historyDataItem, String str, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = historyDataItem.valueStr;
        }
        if ((i & 2) != 0) {
            j = historyDataItem.timeStamp;
        }
        if ((i & 4) != 0) {
            z = historyDataItem.delete;
        }
        return historyDataItem.copy(str, j, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValueStr() {
        return this.valueStr;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDelete() {
        return this.delete;
    }

    @NotNull
    public final HistoryDataItem copy(@NotNull String valueStr, long timeStamp, boolean delete) {
        return new HistoryDataItem(valueStr, timeStamp, delete);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryDataItem)) {
            return false;
        }
        HistoryDataItem historyDataItem = (HistoryDataItem) other;
        return Intrinsics.areEqual(this.valueStr, historyDataItem.valueStr) && this.timeStamp == historyDataItem.timeStamp && this.delete == historyDataItem.delete;
    }

    public final boolean getDelete() {
        return this.delete;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final String getValueStr() {
        return this.valueStr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((this.valueStr.hashCode() * 31) + b.a(this.timeStamp)) * 31;
        boolean z = this.delete;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "HistoryDataItem(valueStr=" + this.valueStr + ", timeStamp=" + this.timeStamp + ", delete=" + this.delete + ')';
    }

    public /* synthetic */ HistoryDataItem(String str, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? false : z);
    }
}

package com.xiaomi.hm.health.healthdata.ui.vo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000e\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/vo/HistoryItem;", "", "", "component1", "component2", "", "component3", "", "component4", "component5", "value", "time", "timeStamp", "oldData", "delete", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "getTime", "c", "J", "getTimeStamp", "()J", GoogleApiAvailabilityLight.a, "Z", "getOldData", "()Z", "e", "getDelete", "<init>", "(Ljava/lang/String;Ljava/lang/String;JZZ)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HistoryItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String time;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long timeStamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean oldData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean delete;

    public HistoryItem(@NotNull String str, @NotNull String str2, long j, boolean z, boolean z2) {
        this.value = str;
        this.time = str2;
        this.timeStamp = j;
        this.oldData = z;
        this.delete = z2;
    }

    public static /* synthetic */ HistoryItem copy$default(HistoryItem historyItem, String str, String str2, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = historyItem.value;
        }
        if ((i & 2) != 0) {
            str2 = historyItem.time;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            j = historyItem.timeStamp;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = historyItem.oldData;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = historyItem.delete;
        }
        return historyItem.copy(str, str3, j2, z3, z2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getOldData() {
        return this.oldData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDelete() {
        return this.delete;
    }

    @NotNull
    public final HistoryItem copy(@NotNull String value, @NotNull String time, long timeStamp, boolean oldData, boolean delete) {
        return new HistoryItem(value, time, timeStamp, oldData, delete);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryItem)) {
            return false;
        }
        HistoryItem historyItem = (HistoryItem) other;
        return Intrinsics.areEqual(this.value, historyItem.value) && Intrinsics.areEqual(this.time, historyItem.time) && this.timeStamp == historyItem.timeStamp && this.oldData == historyItem.oldData && this.delete == historyItem.delete;
    }

    public final boolean getDelete() {
        return this.delete;
    }

    public final boolean getOldData() {
        return this.oldData;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.value.hashCode() * 31) + this.time.hashCode()) * 31) + b.a(this.timeStamp)) * 31;
        boolean z = this.oldData;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.delete;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "HistoryItem(value=" + this.value + ", time=" + this.time + ", timeStamp=" + this.timeStamp + ", oldData=" + this.oldData + ", delete=" + this.delete + ")";
    }

    public /* synthetic */ HistoryItem(String str, String str2, long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }
}

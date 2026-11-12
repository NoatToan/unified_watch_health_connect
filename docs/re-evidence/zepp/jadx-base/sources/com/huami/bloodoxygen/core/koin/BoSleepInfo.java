package com.huami.bloodoxygen.core.koin;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\u0019\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0003JA\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R)\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/huami/bloodoxygen/core/koin/BoSleepInfo;", "", "", "valid", "", "component1", "", "component2", "component3", "Ljava/util/ArrayList;", "Lcom/huami/bloodoxygen/core/koin/BoSleepPiece;", "Lkotlin/collections/ArrayList;", "component4", "date", "start", "end", "pieces", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "b", "J", "getStart", "()J", "setStart", "(J)V", "c", "getEnd", "setEnd", GoogleApiAvailabilityLight.a, "Ljava/util/ArrayList;", "getPieces", "()Ljava/util/ArrayList;", "<init>", "(Ljava/lang/String;JJLjava/util/ArrayList;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BoSleepInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private long start;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private long end;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final ArrayList<BoSleepPiece> pieces;

    public BoSleepInfo(@NotNull String str, long j, long j2, @NotNull ArrayList<BoSleepPiece> arrayList) {
        this.date = str;
        this.start = j;
        this.end = j2;
        this.pieces = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoSleepInfo copy$default(BoSleepInfo boSleepInfo, String str, long j, long j2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = boSleepInfo.date;
        }
        if ((i & 2) != 0) {
            j = boSleepInfo.start;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = boSleepInfo.end;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            arrayList = boSleepInfo.pieces;
        }
        return boSleepInfo.copy(str, j3, j4, arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    @NotNull
    public final ArrayList<BoSleepPiece> component4() {
        return this.pieces;
    }

    @NotNull
    public final BoSleepInfo copy(@NotNull String date, long start, long end, @NotNull ArrayList<BoSleepPiece> pieces) {
        return new BoSleepInfo(date, start, end, pieces);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoSleepInfo)) {
            return false;
        }
        BoSleepInfo boSleepInfo = (BoSleepInfo) other;
        return Intrinsics.areEqual(this.date, boSleepInfo.date) && this.start == boSleepInfo.start && this.end == boSleepInfo.end && Intrinsics.areEqual(this.pieces, boSleepInfo.pieces);
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public final long getEnd() {
        return this.end;
    }

    @NotNull
    public final ArrayList<BoSleepPiece> getPieces() {
        return this.pieces;
    }

    public final long getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((((this.date.hashCode() * 31) + b.a(this.start)) * 31) + b.a(this.end)) * 31) + this.pieces.hashCode();
    }

    public final void setEnd(long j) {
        this.end = j;
    }

    public final void setStart(long j) {
        this.start = j;
    }

    @NotNull
    public String toString() {
        return "BoSleepInfo(date=" + this.date + ", start=" + this.start + ", end=" + this.end + ", pieces=" + this.pieces + ")";
    }

    public final boolean valid() {
        long j = this.start;
        if (j > 0) {
            long j2 = this.end;
            if (j2 > 0 && j2 > j) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ BoSleepInfo(String str, long j, long j2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? -1L : j, (i & 4) == 0 ? j2 : -1L, (i & 8) != 0 ? new ArrayList() : arrayList);
    }
}

package com.huami.bloodoxygen.core.koin;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/bloodoxygen/core/koin/BoHeartRate;", "", "", "component1", "", "", "component2", "date", "hrs", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getHrs", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BoHeartRate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Byte> hrs;

    public BoHeartRate(@NotNull String str, @NotNull List<Byte> list) {
        this.date = str;
        this.hrs = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoHeartRate copy$default(BoHeartRate boHeartRate, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = boHeartRate.date;
        }
        if ((i & 2) != 0) {
            list = boHeartRate.hrs;
        }
        return boHeartRate.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final List<Byte> component2() {
        return this.hrs;
    }

    @NotNull
    public final BoHeartRate copy(@NotNull String date, @NotNull List<Byte> hrs) {
        return new BoHeartRate(date, hrs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoHeartRate)) {
            return false;
        }
        BoHeartRate boHeartRate = (BoHeartRate) other;
        return Intrinsics.areEqual(this.date, boHeartRate.date) && Intrinsics.areEqual(this.hrs, boHeartRate.hrs);
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final List<Byte> getHrs() {
        return this.hrs;
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.hrs.hashCode();
    }

    @NotNull
    public String toString() {
        return "BoHeartRate(date=" + this.date + ", hrs=" + this.hrs + ")";
    }
}

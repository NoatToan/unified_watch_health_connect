package com.huami.sleep.service;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0007\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\t\u0010\u0014R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/huami/sleep/service/SleepChanges;", "", "", "component1", "component2", "component3", "component4", "isSleepScoreRose", "isSleepDurationRose", "isDeepSleepDurationRose", "napSleepRose", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "()Z", "b", "c", GoogleApiAvailabilityLight.a, "getNapSleepRose", "<init>", "(ZZZZ)V", "sleep-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepChanges {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isSleepScoreRose;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean isSleepDurationRose;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean isDeepSleepDurationRose;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean napSleepRose;

    public SleepChanges(boolean z, boolean z2, boolean z3, boolean z4) {
        this.isSleepScoreRose = z;
        this.isSleepDurationRose = z2;
        this.isDeepSleepDurationRose = z3;
        this.napSleepRose = z4;
    }

    public static /* synthetic */ SleepChanges copy$default(SleepChanges sleepChanges, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sleepChanges.isSleepScoreRose;
        }
        if ((i & 2) != 0) {
            z2 = sleepChanges.isSleepDurationRose;
        }
        if ((i & 4) != 0) {
            z3 = sleepChanges.isDeepSleepDurationRose;
        }
        if ((i & 8) != 0) {
            z4 = sleepChanges.napSleepRose;
        }
        return sleepChanges.copy(z, z2, z3, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSleepScoreRose() {
        return this.isSleepScoreRose;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSleepDurationRose() {
        return this.isSleepDurationRose;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsDeepSleepDurationRose() {
        return this.isDeepSleepDurationRose;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getNapSleepRose() {
        return this.napSleepRose;
    }

    @NotNull
    public final SleepChanges copy(boolean isSleepScoreRose, boolean isSleepDurationRose, boolean isDeepSleepDurationRose, boolean napSleepRose) {
        return new SleepChanges(isSleepScoreRose, isSleepDurationRose, isDeepSleepDurationRose, napSleepRose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepChanges)) {
            return false;
        }
        SleepChanges sleepChanges = (SleepChanges) other;
        return this.isSleepScoreRose == sleepChanges.isSleepScoreRose && this.isSleepDurationRose == sleepChanges.isSleepDurationRose && this.isDeepSleepDurationRose == sleepChanges.isDeepSleepDurationRose && this.napSleepRose == sleepChanges.napSleepRose;
    }

    public final boolean getNapSleepRose() {
        return this.napSleepRose;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public int hashCode() {
        boolean z = this.isSleepScoreRose;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isSleepDurationRose;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.isDeepSleepDurationRose;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.napSleepRose;
        return i3 + (z4 ? 1 : z4);
    }

    public final boolean isDeepSleepDurationRose() {
        return this.isDeepSleepDurationRose;
    }

    public final boolean isSleepDurationRose() {
        return this.isSleepDurationRose;
    }

    public final boolean isSleepScoreRose() {
        return this.isSleepScoreRose;
    }

    @NotNull
    public String toString() {
        return "SleepChanges(isSleepScoreRose=" + this.isSleepScoreRose + ", isSleepDurationRose=" + this.isSleepDurationRose + ", isDeepSleepDurationRose=" + this.isDeepSleepDurationRose + ", napSleepRose=" + this.napSleepRose + ")";
    }

    public /* synthetic */ SleepChanges(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, (i & 8) != 0 ? false : z4);
    }
}

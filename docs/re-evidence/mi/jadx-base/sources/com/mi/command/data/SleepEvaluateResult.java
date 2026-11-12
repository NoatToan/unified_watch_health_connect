package com.mi.command.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0003J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\""}, d2 = {"Lcom/mi/command/data/SleepEvaluateResult;", "Landroid/os/Parcelable;", "researchId", "", "timestamp", "", "evaluate", "spirit", "<init>", "(IJII)V", "getResearchId", "()I", "getTimestamp", "()J", "getEvaluate", "getSpirit", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepEvaluateResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SleepEvaluateResult> CREATOR = new Creator();
    private final int evaluate;
    private final int researchId;
    private final int spirit;
    private final long timestamp;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SleepEvaluateResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SleepEvaluateResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SleepEvaluateResult(parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SleepEvaluateResult[] newArray(int i) {
            return new SleepEvaluateResult[i];
        }
    }

    public SleepEvaluateResult(int i, long j, int i2, int i3) {
        this.researchId = i;
        this.timestamp = j;
        this.evaluate = i2;
        this.spirit = i3;
    }

    public static /* synthetic */ SleepEvaluateResult copy$default(SleepEvaluateResult sleepEvaluateResult, int i, long j, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = sleepEvaluateResult.researchId;
        }
        if ((i4 & 2) != 0) {
            j = sleepEvaluateResult.timestamp;
        }
        long j2 = j;
        if ((i4 & 4) != 0) {
            i2 = sleepEvaluateResult.evaluate;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = sleepEvaluateResult.spirit;
        }
        return sleepEvaluateResult.copy(i, j2, i5, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResearchId() {
        return this.researchId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEvaluate() {
        return this.evaluate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSpirit() {
        return this.spirit;
    }

    @NotNull
    public final SleepEvaluateResult copy(int researchId, long timestamp, int evaluate, int spirit) {
        return new SleepEvaluateResult(researchId, timestamp, evaluate, spirit);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepEvaluateResult)) {
            return false;
        }
        SleepEvaluateResult sleepEvaluateResult = (SleepEvaluateResult) other;
        return this.researchId == sleepEvaluateResult.researchId && this.timestamp == sleepEvaluateResult.timestamp && this.evaluate == sleepEvaluateResult.evaluate && this.spirit == sleepEvaluateResult.spirit;
    }

    public final int getEvaluate() {
        return this.evaluate;
    }

    public final int getResearchId() {
        return this.researchId;
    }

    public final int getSpirit() {
        return this.spirit;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.researchId) * 31) + Long.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.evaluate)) * 31) + Integer.hashCode(this.spirit);
    }

    @NotNull
    public String toString() {
        return "SleepEvaluateResult(researchId=" + this.researchId + ", timestamp=" + this.timestamp + ", evaluate=" + this.evaluate + ", spirit=" + this.spirit + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.researchId);
        dest.writeLong(this.timestamp);
        dest.writeInt(this.evaluate);
        dest.writeInt(this.spirit);
    }
}

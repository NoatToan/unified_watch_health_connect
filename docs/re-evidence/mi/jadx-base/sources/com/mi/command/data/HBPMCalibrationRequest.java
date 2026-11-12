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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u0003J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/mi/command/data/HBPMCalibrationRequest;", "Landroid/os/Parcelable;", "researchId", "", "type", "needCalibTimes", "currentCalibTimes", "systolicBp", "diastolicBp", "<init>", "(IIIIII)V", "getResearchId", "()I", "getType", "getNeedCalibTimes", "getCurrentCalibTimes", "getSystolicBp", "getDiastolicBp", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HBPMCalibrationRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HBPMCalibrationRequest> CREATOR = new Creator();
    private final int currentCalibTimes;
    private final int diastolicBp;
    private final int needCalibTimes;
    private final int researchId;
    private final int systolicBp;
    private final int type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HBPMCalibrationRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HBPMCalibrationRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HBPMCalibrationRequest(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HBPMCalibrationRequest[] newArray(int i) {
            return new HBPMCalibrationRequest[i];
        }
    }

    public HBPMCalibrationRequest(int i, int i2, int i3, int i4, int i5, int i6) {
        this.researchId = i;
        this.type = i2;
        this.needCalibTimes = i3;
        this.currentCalibTimes = i4;
        this.systolicBp = i5;
        this.diastolicBp = i6;
    }

    public static /* synthetic */ HBPMCalibrationRequest copy$default(HBPMCalibrationRequest hBPMCalibrationRequest, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = hBPMCalibrationRequest.researchId;
        }
        if ((i7 & 2) != 0) {
            i2 = hBPMCalibrationRequest.type;
        }
        int i8 = i2;
        if ((i7 & 4) != 0) {
            i3 = hBPMCalibrationRequest.needCalibTimes;
        }
        int i9 = i3;
        if ((i7 & 8) != 0) {
            i4 = hBPMCalibrationRequest.currentCalibTimes;
        }
        int i10 = i4;
        if ((i7 & 16) != 0) {
            i5 = hBPMCalibrationRequest.systolicBp;
        }
        int i11 = i5;
        if ((i7 & 32) != 0) {
            i6 = hBPMCalibrationRequest.diastolicBp;
        }
        return hBPMCalibrationRequest.copy(i, i8, i9, i10, i11, i6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResearchId() {
        return this.researchId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNeedCalibTimes() {
        return this.needCalibTimes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCurrentCalibTimes() {
        return this.currentCalibTimes;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSystolicBp() {
        return this.systolicBp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDiastolicBp() {
        return this.diastolicBp;
    }

    @NotNull
    public final HBPMCalibrationRequest copy(int researchId, int type, int needCalibTimes, int currentCalibTimes, int systolicBp, int diastolicBp) {
        return new HBPMCalibrationRequest(researchId, type, needCalibTimes, currentCalibTimes, systolicBp, diastolicBp);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HBPMCalibrationRequest)) {
            return false;
        }
        HBPMCalibrationRequest hBPMCalibrationRequest = (HBPMCalibrationRequest) other;
        return this.researchId == hBPMCalibrationRequest.researchId && this.type == hBPMCalibrationRequest.type && this.needCalibTimes == hBPMCalibrationRequest.needCalibTimes && this.currentCalibTimes == hBPMCalibrationRequest.currentCalibTimes && this.systolicBp == hBPMCalibrationRequest.systolicBp && this.diastolicBp == hBPMCalibrationRequest.diastolicBp;
    }

    public final int getCurrentCalibTimes() {
        return this.currentCalibTimes;
    }

    public final int getDiastolicBp() {
        return this.diastolicBp;
    }

    public final int getNeedCalibTimes() {
        return this.needCalibTimes;
    }

    public final int getResearchId() {
        return this.researchId;
    }

    public final int getSystolicBp() {
        return this.systolicBp;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.researchId) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.needCalibTimes)) * 31) + Integer.hashCode(this.currentCalibTimes)) * 31) + Integer.hashCode(this.systolicBp)) * 31) + Integer.hashCode(this.diastolicBp);
    }

    @NotNull
    public String toString() {
        return "HBPMCalibrationRequest(researchId=" + this.researchId + ", type=" + this.type + ", needCalibTimes=" + this.needCalibTimes + ", currentCalibTimes=" + this.currentCalibTimes + ", systolicBp=" + this.systolicBp + ", diastolicBp=" + this.diastolicBp + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.researchId);
        dest.writeInt(this.type);
        dest.writeInt(this.needCalibTimes);
        dest.writeInt(this.currentCalibTimes);
        dest.writeInt(this.systolicBp);
        dest.writeInt(this.diastolicBp);
    }
}

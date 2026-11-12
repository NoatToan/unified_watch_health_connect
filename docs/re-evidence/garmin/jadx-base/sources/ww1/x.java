package ww1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.training.adapters.DateAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lww1/x;", "Landroid/os/Parcelable;", "", "currentPhase", "Lorg/joda/time/DateTime;", "startDate", "endDate", "Lww1/a0;", "trainingPhase", "<init>", "(Ljava/lang/Boolean;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lww1/a0;)V", "a", "Ljava/lang/Boolean;", "getCurrentPhase", "()Ljava/lang/Boolean;", "b", "Lorg/joda/time/DateTime;", "getStartDate", "()Lorg/joda/time/DateTime;", "c", "d", "Lww1/a0;", "()Lww1/a0;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("currentPhase")
    private final Boolean currentPhase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    @JsonAdapter(DateAdapter.class)
    private final DateTime startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    @JsonAdapter(DateAdapter.class)
    private final DateTime endDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingPhase")
    private final a0 trainingPhase;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<x> {
        @Override // android.os.Parcelable.Creator
        public final x createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new x(boolValueOf, (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readInt() != 0 ? a0.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final x[] newArray(int i14) {
            return new x[i14];
        }
    }

    public x(Boolean bool, DateTime dateTime, DateTime dateTime2, a0 a0Var) {
        this.currentPhase = bool;
        this.startDate = dateTime;
        this.endDate = dateTime2;
        this.trainingPhase = a0Var;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a0 getTrainingPhase() {
        return this.trainingPhase;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return p005kotlin.jvm.internal.s.g(this.currentPhase, xVar.currentPhase) && p005kotlin.jvm.internal.s.g(this.startDate, xVar.startDate) && p005kotlin.jvm.internal.s.g(this.endDate, xVar.endDate) && this.trainingPhase == xVar.trainingPhase;
    }

    public final DateTime getStartDate() {
        return this.startDate;
    }

    public final int hashCode() {
        Boolean bool = this.currentPhase;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        DateTime dateTime = this.startDate;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.endDate;
        int iHashCode3 = (iHashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        a0 a0Var = this.trainingPhase;
        return iHashCode3 + (a0Var != null ? a0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlanPhase(currentPhase=" + this.currentPhase + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", trainingPhase=" + this.trainingPhase + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Boolean bool = this.currentPhase;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeSerializable(this.startDate);
        parcel.writeSerializable(this.endDate);
        a0 a0Var = this.trainingPhase;
        if (a0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(a0Var.name());
        }
    }
}

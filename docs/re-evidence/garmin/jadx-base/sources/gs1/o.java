package gs1;

import android.os.Parcel;
import android.os.Parcelable;
import c22.j0;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lgs1/o;", "Landroid/os/Parcelable;", "", "currentDaySleepEndTimeGMT", "currentDaySleepStartTimeGMT", "nextDaySleepEndTimeGMT", "nextDaySleepStartTimeGMT", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "a", "Ljava/lang/Long;", "getCurrentDaySleepEndTimeGMT", "()Ljava/lang/Long;", "b", "getCurrentDaySleepStartTimeGMT", "c", "getNextDaySleepEndTimeGMT", "d", "getNextDaySleepStartTimeGMT", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("currentDaySleepEndTimeGMT")
    private final Long currentDaySleepEndTimeGMT;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("currentDaySleepStartTimeGMT")
    private final Long currentDaySleepStartTimeGMT;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nextDaySleepEndTimeGMT")
    private final Long nextDaySleepEndTimeGMT;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nextDaySleepStartTimeGMT")
    private final Long nextDaySleepStartTimeGMT;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DateTime f78838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DateTime f78839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DateTime f78840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DateTime f78841h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public /* synthetic */ o(Long l14, Long l15, Long l16, Long l17, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : l16, (i14 & 8) != 0 ? null : l17);
    }

    public static o b(o oVar, Long l14, Long l15, Long l16, Long l17, int i14) {
        if ((i14 & 1) != 0) {
            l14 = oVar.currentDaySleepEndTimeGMT;
        }
        if ((i14 & 2) != 0) {
            l15 = oVar.currentDaySleepStartTimeGMT;
        }
        if ((i14 & 4) != 0) {
            l16 = oVar.nextDaySleepEndTimeGMT;
        }
        if ((i14 & 8) != 0) {
            l17 = oVar.nextDaySleepStartTimeGMT;
        }
        return new o(l14, l15, l16, l17);
    }

    public final DateTime d() {
        if (this.f78840g == null) {
            j0 j0Var = j0.f23099a;
            Long l14 = this.nextDaySleepEndTimeGMT;
            j0Var.getClass();
            this.f78840g = j0.B(l14);
        }
        return this.f78840g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.currentDaySleepEndTimeGMT, oVar.currentDaySleepEndTimeGMT) && p005kotlin.jvm.internal.s.g(this.currentDaySleepStartTimeGMT, oVar.currentDaySleepStartTimeGMT) && p005kotlin.jvm.internal.s.g(this.nextDaySleepEndTimeGMT, oVar.nextDaySleepEndTimeGMT) && p005kotlin.jvm.internal.s.g(this.nextDaySleepStartTimeGMT, oVar.nextDaySleepStartTimeGMT);
    }

    public final DateTime f() {
        if (this.f78841h == null) {
            j0 j0Var = j0.f23099a;
            Long l14 = this.nextDaySleepStartTimeGMT;
            j0Var.getClass();
            this.f78841h = j0.B(l14);
        }
        return this.f78841h;
    }

    public final DateTime g() {
        if (this.f78838e == null) {
            j0 j0Var = j0.f23099a;
            Long l14 = this.currentDaySleepEndTimeGMT;
            j0Var.getClass();
            this.f78838e = j0.B(l14);
        }
        return this.f78838e;
    }

    public final DateTime h() {
        if (this.f78839f == null) {
            j0 j0Var = j0.f23099a;
            Long l14 = this.currentDaySleepStartTimeGMT;
            j0Var.getClass();
            this.f78839f = j0.B(l14);
        }
        return this.f78839f;
    }

    public final int hashCode() {
        Long l14 = this.currentDaySleepEndTimeGMT;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.currentDaySleepStartTimeGMT;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.nextDaySleepEndTimeGMT;
        int iHashCode3 = (iHashCode2 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.nextDaySleepStartTimeGMT;
        return iHashCode3 + (l17 != null ? l17.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.currentDaySleepEndTimeGMT;
        Long l15 = this.currentDaySleepStartTimeGMT;
        Long l16 = this.nextDaySleepEndTimeGMT;
        Long l17 = this.nextDaySleepStartTimeGMT;
        StringBuilder sbJ = f3.j(l14, l15, "SleepTimesDTO(currentDaySleepEndTimeGMT=", ", currentDaySleepStartTimeGMT=", ", nextDaySleepEndTimeGMT=");
        sbJ.append(l16);
        sbJ.append(", nextDaySleepStartTimeGMT=");
        sbJ.append(l17);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.currentDaySleepEndTimeGMT;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.currentDaySleepStartTimeGMT;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Long l16 = this.nextDaySleepEndTimeGMT;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        Long l17 = this.nextDaySleepStartTimeGMT;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
    }

    public o(Long l14, Long l15, Long l16, Long l17) {
        this.currentDaySleepEndTimeGMT = l14;
        this.currentDaySleepStartTimeGMT = l15;
        this.nextDaySleepEndTimeGMT = l16;
        this.nextDaySleepStartTimeGMT = l17;
    }

    public o() {
        this(null, null, null, null, 15, null);
    }
}

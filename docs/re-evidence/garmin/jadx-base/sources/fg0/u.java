package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import ds.e0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lfg0/u;", "Landroid/os/Parcelable;", "Lgg0/f;", "eventType", "", "hasPrimaryEvent", "", "primaryEventName", "Lorg/joda/time/DateTime;", "raceStartDate", "raceEndDate", "calendarSelectionDate", "shouldPromptIfSelectedDateBeforeMinimum", "", "distanceInMeters", "durationInSeconds", "durationDisplayText", "<init>", "(Lgg0/f;ZLjava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gg0.f f71349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f71350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTime f71352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DateTime f71353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTime f71354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f71355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f71356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Double f71357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f71358j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            parcel.getClass();
            gg0.f fVarValueOf = gg0.f.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z15 = false;
                z14 = true;
            } else {
                z14 = false;
                z15 = false;
            }
            return new u(fVarValueOf, z14, parcel.readString(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? z15 : true, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i14) {
            return new u[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ u(gg0.f fVar, boolean z14, String str, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, boolean z15, Double d14, Double d15, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        fVar = (i14 & 1) != 0 ? gg0.f.f77130f : fVar;
        z14 = (i14 & 2) != 0 ? false : z14;
        str = (i14 & 4) != 0 ? "" : str;
        if ((i14 & 8) != 0) {
            dateTime = DateTime.now();
            dateTime.getClass();
        }
        if ((i14 & 16) != 0) {
            dateTime2 = DateTime.now();
            dateTime2.getClass();
        }
        this(fVar, z14, str, dateTime, dateTime2, (i14 & 32) != 0 ? null : dateTime3, (i14 & 64) != 0 ? false : z15, (i14 & 128) != 0 ? null : d14, (i14 & 256) != 0 ? null : d15, (i14 & 512) != 0 ? "" : str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f71349a == uVar.f71349a && this.f71350b == uVar.f71350b && p005kotlin.jvm.internal.s.g(this.f71351c, uVar.f71351c) && p005kotlin.jvm.internal.s.g(this.f71352d, uVar.f71352d) && p005kotlin.jvm.internal.s.g(this.f71353e, uVar.f71353e) && p005kotlin.jvm.internal.s.g(this.f71354f, uVar.f71354f) && this.f71355g == uVar.f71355g && p005kotlin.jvm.internal.s.g(this.f71356h, uVar.f71356h) && p005kotlin.jvm.internal.s.g(this.f71357i, uVar.f71357i) && p005kotlin.jvm.internal.s.g(this.f71358j, uVar.f71358j);
    }

    public final int hashCode() {
        int iA = e0.a(e0.a(wr.g.j(q6.f.g(this.f71349a.hashCode() * 31, 31, this.f71350b), 31, this.f71351c), this.f71352d, 31), this.f71353e, 31);
        DateTime dateTime = this.f71354f;
        int iG = q6.f.g((iA + (dateTime == null ? 0 : dateTime.hashCode())) * 31, 31, this.f71355g);
        Double d14 = this.f71356h;
        int iHashCode = (iG + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f71357i;
        return this.f71358j.hashCode() + ((iHashCode + (d15 != null ? d15.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FBTFlowDataDTO(eventType=" + this.f71349a + ", hasPrimaryEvent=" + this.f71350b + ", primaryEventName=" + this.f71351c + ", raceStartDate=" + this.f71352d + ", raceEndDate=" + this.f71353e + ", calendarSelectionDate=" + this.f71354f + ", shouldPromptIfSelectedDateBeforeMinimum=" + this.f71355g + ", distanceInMeters=" + this.f71356h + ", durationInSeconds=" + this.f71357i + ", durationDisplayText=" + this.f71358j + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f71349a.name());
        parcel.writeInt(this.f71350b ? 1 : 0);
        parcel.writeString(this.f71351c);
        parcel.writeSerializable(this.f71352d);
        parcel.writeSerializable(this.f71353e);
        parcel.writeSerializable(this.f71354f);
        parcel.writeInt(this.f71355g ? 1 : 0);
        Double d14 = this.f71356h;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f71357i;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeString(this.f71358j);
    }

    public u(gg0.f fVar, boolean z14, String str, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, boolean z15, Double d14, Double d15, String str2) {
        fVar.getClass();
        str.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        str2.getClass();
        this.f71349a = fVar;
        this.f71350b = z14;
        this.f71351c = str;
        this.f71352d = dateTime;
        this.f71353e = dateTime2;
        this.f71354f = dateTime3;
        this.f71355g = z15;
        this.f71356h = d14;
        this.f71357i = d15;
        this.f71358j = str2;
    }

    public u() {
        this(null, false, null, null, null, null, false, null, null, null, 1023, null);
    }
}

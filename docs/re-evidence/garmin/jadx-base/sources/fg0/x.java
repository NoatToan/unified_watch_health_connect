package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfg0/x;", "Landroid/os/Parcelable;", "Lrt1/r;", "trainingPlanType", "", "name", "Lorg/joda/time/DateTime;", "registrationDate", "", "distance", "Lgg0/f;", "activityType", "raceStartDate", "raceEndDate", "Lxw1/d;", "athletePlanDTO", "Lxw1/k;", "raceDTO", "", "shouldLaunchCoachEditFlow", "<init>", "(Lrt1/r;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Integer;Lgg0/f;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lxw1/d;Lxw1/k;Ljava/lang/Boolean;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rt1.r f71365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f71367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f71368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gg0.f f71369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTime f71370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f71371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xw1.d f71372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final xw1.k f71373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f71374j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<x> {
        @Override // android.os.Parcelable.Creator
        public final x createFromParcel(Parcel parcel) {
            rt1.r rVarValueOf;
            Boolean bool;
            xw1.k kVar;
            Boolean boolValueOf;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                rVarValueOf = null;
                bool = null;
            } else {
                rVarValueOf = rt1.r.valueOf(parcel.readString());
                bool = null;
            }
            String string = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            Object objValueOf = parcel.readInt() == 0 ? bool : Integer.valueOf(parcel.readInt());
            Object objValueOf2 = parcel.readInt() == 0 ? bool : gg0.f.valueOf(parcel.readString());
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
            xw1.d dVar = (xw1.d) (parcel.readInt() == 0 ? bool : xw1.d.CREATOR.createFromParcel(parcel));
            xw1.k kVar2 = (xw1.k) (parcel.readInt() == 0 ? bool : xw1.k.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() == 0) {
                boolValueOf = bool;
                kVar = kVar2;
            } else {
                kVar = kVar2;
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new x(rVarValueOf, string, dateTime, objValueOf, objValueOf2, dateTime2, dateTime3, dVar, kVar, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final x[] newArray(int i14) {
            return new x[i14];
        }
    }

    public /* synthetic */ x(rt1.r rVar, String str, DateTime dateTime, Integer num, gg0.f fVar, DateTime dateTime2, DateTime dateTime3, xw1.d dVar, xw1.k kVar, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : rVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : dateTime, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? gg0.f.f77130f : fVar, (i14 & 32) != 0 ? null : dateTime2, (i14 & 64) != 0 ? null : dateTime3, (i14 & 128) != 0 ? null : dVar, (i14 & 256) != 0 ? null : kVar, (i14 & 512) != 0 ? null : bool);
    }

    public static x b(x xVar, String str, DateTime dateTime, Integer num, DateTime dateTime2, DateTime dateTime3, xw1.d dVar, xw1.k kVar, Boolean bool, int i14) {
        rt1.r rVar = xVar.f71365a;
        if ((i14 & 2) != 0) {
            str = xVar.f71366b;
        }
        String str2 = str;
        if ((i14 & 4) != 0) {
            dateTime = xVar.f71367c;
        }
        DateTime dateTime4 = dateTime;
        if ((i14 & 8) != 0) {
            num = xVar.f71368d;
        }
        Integer num2 = num;
        gg0.f fVar = xVar.f71369e;
        DateTime dateTime5 = (i14 & 32) != 0 ? xVar.f71370f : dateTime2;
        DateTime dateTime6 = (i14 & 64) != 0 ? xVar.f71371g : dateTime3;
        xw1.d dVar2 = (i14 & 128) != 0 ? xVar.f71372h : dVar;
        xw1.k kVar2 = (i14 & 256) != 0 ? xVar.f71373i : kVar;
        Boolean bool2 = (i14 & 512) != 0 ? xVar.f71374j : bool;
        xVar.getClass();
        return new x(rVar, str2, dateTime4, num2, fVar, dateTime5, dateTime6, dVar2, kVar2, bool2);
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
        return this.f71365a == xVar.f71365a && p005kotlin.jvm.internal.s.g(this.f71366b, xVar.f71366b) && p005kotlin.jvm.internal.s.g(this.f71367c, xVar.f71367c) && p005kotlin.jvm.internal.s.g(this.f71368d, xVar.f71368d) && this.f71369e == xVar.f71369e && p005kotlin.jvm.internal.s.g(this.f71370f, xVar.f71370f) && p005kotlin.jvm.internal.s.g(this.f71371g, xVar.f71371g) && p005kotlin.jvm.internal.s.g(this.f71372h, xVar.f71372h) && p005kotlin.jvm.internal.s.g(this.f71373i, xVar.f71373i) && p005kotlin.jvm.internal.s.g(this.f71374j, xVar.f71374j);
    }

    public final int hashCode() {
        rt1.r rVar = this.f71365a;
        int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        String str = this.f71366b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DateTime dateTime = this.f71367c;
        int iHashCode3 = (iHashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Integer num = this.f71368d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        gg0.f fVar = this.f71369e;
        int iHashCode5 = (iHashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        DateTime dateTime2 = this.f71370f;
        int iHashCode6 = (iHashCode5 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.f71371g;
        int iHashCode7 = (iHashCode6 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        xw1.d dVar = this.f71372h;
        int iHashCode8 = (iHashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        xw1.k kVar = this.f71373i;
        int iHashCode9 = (iHashCode8 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Boolean bool = this.f71374j;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "GarminCoachAtpDTO(trainingPlanType=" + this.f71365a + ", name=" + this.f71366b + ", registrationDate=" + this.f71367c + ", distance=" + this.f71368d + ", activityType=" + this.f71369e + ", raceStartDate=" + this.f71370f + ", raceEndDate=" + this.f71371g + ", athletePlanDTO=" + this.f71372h + ", raceDTO=" + this.f71373i + ", shouldLaunchCoachEditFlow=" + this.f71374j + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        rt1.r rVar = this.f71365a;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(rVar.name());
        }
        parcel.writeString(this.f71366b);
        parcel.writeSerializable(this.f71367c);
        Integer num = this.f71368d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        gg0.f fVar = this.f71369e;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(fVar.name());
        }
        parcel.writeSerializable(this.f71370f);
        parcel.writeSerializable(this.f71371g);
        xw1.d dVar = this.f71372h;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
        xw1.k kVar = this.f71373i;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kVar.writeToParcel(parcel, i14);
        }
        Boolean bool = this.f71374j;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
    }

    public x(rt1.r rVar, String str, DateTime dateTime, Integer num, gg0.f fVar, DateTime dateTime2, DateTime dateTime3, xw1.d dVar, xw1.k kVar, Boolean bool) {
        this.f71365a = rVar;
        this.f71366b = str;
        this.f71367c = dateTime;
        this.f71368d = num;
        this.f71369e = fVar;
        this.f71370f = dateTime2;
        this.f71371g = dateTime3;
        this.f71372h = dVar;
        this.f71373i = kVar;
        this.f71374j = bool;
    }

    public x() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}

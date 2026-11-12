package dh0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ldh0/a;", "Landroid/os/Parcelable;", "", "chronologicalAge", "", "fitnessAge", "achievableFitnessAge", "previousFitnessAge", "", "Ldh0/d;", "metrics", "Lorg/joda/time/DateTime;", "lastUpdated", "", "invalidReasonKey", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1272a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f59542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f59543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f59544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f59545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<d> f59546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTime f59547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f59548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f59549h;

    /* JADX INFO: renamed from: dh0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1272a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(d.CREATOR, parcel, arrayList, iA, 1);
            }
            return new a(numValueOf, dValueOf, dValueOf2, dValueOf3, arrayList, (DateTime) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(Integer num, Double d14, Double d15, Double d16, List list, DateTime dateTime, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : d16, (i14 & 16) != 0 ? x.k(new d(g.VIGOROUS_DAYS, null, null, null, null, null, null, null, 254, null), new d(g.VIGOROUS_MINUTES, null, null, null, null, null, null, null, 254, null), new d(g.RESTING_HR, null, null, null, null, null, null, null, 254, null), new d(g.BMI, null, null, null, null, null, null, null, 254, null)) : list, (i14 & 32) != 0 ? null : dateTime, (i14 & 64) != 0 ? null : str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f59542a, aVar.f59542a) && s.g(this.f59543b, aVar.f59543b) && s.g(this.f59544c, aVar.f59544c) && s.g(this.f59545d, aVar.f59545d) && s.g(this.f59546e, aVar.f59546e) && s.g(this.f59547f, aVar.f59547f) && s.g(this.f59548g, aVar.f59548g);
    }

    public final int hashCode() {
        Integer num = this.f59542a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d14 = this.f59543b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f59544c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f59545d;
        int iB = u0.b((iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31, 31, this.f59546e);
        DateTime dateTime = this.f59547f;
        int iHashCode4 = (iB + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        String str = this.f59548g;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = u0.m("FitnessAgeDetails(chronologicalAge=", this.f59542a, ", fitnessAge=", this.f59543b, ", achievableFitnessAge=");
        b71.i.p(this.f59544c, this.f59545d, ", previousFitnessAge=", ", metrics=", sbM);
        sbM.append(this.f59546e);
        sbM.append(", lastUpdated=");
        sbM.append(this.f59547f);
        sbM.append(", invalidReasonKey=");
        return am.j.o(this.f59548g, ")", sbM);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.f59542a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d14 = this.f59543b;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f59544c;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.f59545d;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Iterator itE = kg.f.e(this.f59546e, parcel);
        while (itE.hasNext()) {
            ((d) itE.next()).writeToParcel(parcel, i14);
        }
        parcel.writeSerializable(this.f59547f);
        parcel.writeString(this.f59548g);
    }

    public a(Integer num, Double d14, Double d15, Double d16, List<d> list, DateTime dateTime, String str) {
        list.getClass();
        this.f59542a = num;
        this.f59543b = d14;
        this.f59544c = d15;
        this.f59545d = d16;
        this.f59546e = list;
        this.f59547f = dateTime;
        this.f59548g = str;
        f.f59583c.getClass();
        f fVar = f.e.f59589d;
        if (!s.g(str, fVar.f59584a)) {
            fVar = f.c.f59587d;
            if (!s.g(str, fVar.f59584a)) {
                fVar = f.b.f59586d;
                if (!s.g(str, fVar.f59584a)) {
                    fVar = f.d.f59588d;
                    if (!s.g(str, fVar.f59584a)) {
                        fVar = null;
                    }
                }
            }
        }
        this.f59549h = fVar;
    }

    public a() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}

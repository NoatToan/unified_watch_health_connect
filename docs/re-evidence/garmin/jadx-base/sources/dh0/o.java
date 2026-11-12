package dh0;

import android.os.Parcel;
import android.os.Parcelable;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Ldh0/o;", "Landroid/os/Parcelable;", "", "fitnessAge", "achievableFitnessAge", "vigorousDaysAvg", "rhr", "bodyFat", "bmi", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class o implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f59617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f59618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f59619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f59620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f59621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f59622f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<o> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/fitness_age/data/model/SummaryMetricDto.$serializer", "Lm63/e0;", "Ldh0/o;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f59623a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f59623a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.fitness_age.data.model.SummaryMetricDto", aVar, 6);
            m1Var.j("fitnessAge", true);
            m1Var.j("achievableFitnessAge", true);
            m1Var.j("vigorousDaysAvg", true);
            m1Var.j("rhr", true);
            m1Var.j("bodyFat", true);
            m1Var.j("bmi", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            x xVar = x.f117036a;
            return new i63.c[]{j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Double d14 = null;
            Double d15 = null;
            Double d16 = null;
            Double d17 = null;
            Double d18 = null;
            Double d19 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        d14 = (Double) cVarC.v(eVar2, 0, x.f117036a, d14);
                        i15 |= 1;
                        break;
                    case 1:
                        d15 = (Double) cVarC.v(eVar2, 1, x.f117036a, d15);
                        i15 |= 2;
                        break;
                    case 2:
                        d16 = (Double) cVarC.v(eVar2, 2, x.f117036a, d16);
                        i15 |= 4;
                        break;
                    case 3:
                        d17 = (Double) cVarC.v(eVar2, 3, x.f117036a, d17);
                        i15 |= 8;
                        break;
                    case 4:
                        d18 = (Double) cVarC.v(eVar2, 4, x.f117036a, d18);
                        i15 |= 16;
                        break;
                    case 5:
                        d19 = (Double) cVarC.v(eVar2, 5, x.f117036a, d19);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new o(i15, d14, d15, d16, d17, d18, d19, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            o oVar = (o) obj;
            oVar.getClass();
            Double d14 = oVar.f59622f;
            Double d15 = oVar.f59621e;
            Double d16 = oVar.f59620d;
            Double d17 = oVar.f59619c;
            Double d18 = oVar.f59618b;
            Double d19 = oVar.f59617a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || d19 != null) {
                dVarC.d(eVar, 0, x.f117036a, d19);
            }
            if (dVarC.C(eVar) || d18 != null) {
                dVarC.d(eVar, 1, x.f117036a, d18);
            }
            if (dVarC.C(eVar) || d17 != null) {
                dVarC.d(eVar, 2, x.f117036a, d17);
            }
            if (dVarC.C(eVar) || d16 != null) {
                dVarC.d(eVar, 3, x.f117036a, d16);
            }
            if (dVarC.C(eVar) || d15 != null) {
                dVarC.d(eVar, 4, x.f117036a, d15);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 5, x.f117036a, d14);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public /* synthetic */ o(int i14, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f59617a = null;
        } else {
            this.f59617a = d14;
        }
        if ((i14 & 2) == 0) {
            this.f59618b = null;
        } else {
            this.f59618b = d15;
        }
        if ((i14 & 4) == 0) {
            this.f59619c = null;
        } else {
            this.f59619c = d16;
        }
        if ((i14 & 8) == 0) {
            this.f59620d = null;
        } else {
            this.f59620d = d17;
        }
        if ((i14 & 16) == 0) {
            this.f59621e = null;
        } else {
            this.f59621e = d18;
        }
        if ((i14 & 32) == 0) {
            this.f59622f = null;
        } else {
            this.f59622f = d19;
        }
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
        return s.g(this.f59617a, oVar.f59617a) && s.g(this.f59618b, oVar.f59618b) && s.g(this.f59619c, oVar.f59619c) && s.g(this.f59620d, oVar.f59620d) && s.g(this.f59621e, oVar.f59621e) && s.g(this.f59622f, oVar.f59622f);
    }

    public final int hashCode() {
        Double d14 = this.f59617a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f59618b;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f59619c;
        int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f59620d;
        int iHashCode4 = (iHashCode3 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f59621e;
        int iHashCode5 = (iHashCode4 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f59622f;
        return iHashCode5 + (d19 != null ? d19.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = tn.k.i("SummaryMetricDto(fitnessAge=", this.f59617a, this.f59618b, ", achievableFitnessAge=", ", vigorousDaysAvg=");
        b71.i.p(this.f59619c, this.f59620d, ", rhr=", ", bodyFat=", sbI);
        return sn.a.f(this.f59621e, this.f59622f, ", bmi=", ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.f59617a;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f59618b;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.f59619c;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.f59620d;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.f59621e;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.f59622f;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
    }

    /* JADX INFO: renamed from: dh0.o$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldh0/o$b;", "", "<init>", "()V", "Li63/c;", "Ldh0/o;", "serializer", "()Li63/c;", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<o> serializer() {
            return a.f59623a;
        }

        private Companion() {
        }
    }

    public o() {
        this((Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, 63, (p005kotlin.jvm.internal.j) null);
    }

    public o(Double d14, Double d15, Double d16, Double d17, Double d18, Double d19) {
        this.f59617a = d14;
        this.f59618b = d15;
        this.f59619c = d16;
        this.f59620d = d17;
        this.f59621e = d18;
        this.f59622f = d19;
    }

    public /* synthetic */ o(Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : d15, (i14 & 4) != 0 ? null : d16, (i14 & 8) != 0 ? null : d17, (i14 & 16) != 0 ? null : d18, (i14 & 32) != 0 ? null : d19);
    }
}

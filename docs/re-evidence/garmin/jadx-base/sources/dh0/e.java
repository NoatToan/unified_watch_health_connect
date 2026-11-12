package dh0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import java.util.ArrayList;
import java.util.List;
import m63.d0;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.x;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019By\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012B{\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016¨\u0006\u001a"}, d2 = {"Ldh0/e;", "Landroid/os/Parcelable;", "", "value", "targetValue", "potentialAge", "", "stale", "", "", "staleInputs", "lastMeasurementDate", "", "numOfWeeksForIm", "", "improvementValue", "priority", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Lm63/u1;)V", "Companion", "a", "b", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class e implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f59573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f59574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f59575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f59576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f59577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f59578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f59579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Float f59580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f59581i;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<e> CREATOR = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f59572j = {null, null, null, null, o13.m.a(o13.n.PUBLICATION, new d4.h(29)), null, null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/fitness_age/data/model/FitnessAgeDetailsMetricDto.$serializer", "Lm63/e0;", "Ldh0/e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f59582a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f59582a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.fitness_age.data.model.FitnessAgeDetailsMetricDto", aVar, 9);
            m1Var.j("value", true);
            m1Var.j("targetValue", true);
            m1Var.j("potentialAge", true);
            m1Var.j("stale", true);
            m1Var.j("staleInputs", true);
            m1Var.j("lastMeasurementDate", true);
            m1Var.j("numOfWeeksForIm", true);
            m1Var.j("improvementValue", true);
            m1Var.j("priority", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = e.f59572j;
            x xVar = x.f117036a;
            i63.c<?> cVarD = j63.a.d(xVar);
            i63.c<?> cVarD2 = j63.a.d(xVar);
            i63.c<?> cVarD3 = j63.a.d(xVar);
            i63.c<?> cVarD4 = j63.a.d(m63.g.f116948a);
            i63.c<?> cVarD5 = j63.a.d(lVarArr[4].getValue());
            i63.c<?> cVarD6 = j63.a.d(y1.f117048a);
            m0 m0Var = m0.f116981a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, cVarD4, cVarD5, cVarD6, j63.a.d(m0Var), j63.a.d(d0.f116930a), j63.a.d(m0Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = e.f59572j;
            int i14 = l63.c.f110557a;
            Integer num = null;
            boolean z14 = true;
            Float f14 = null;
            int i15 = 0;
            Double d14 = null;
            Double d15 = null;
            Double d16 = null;
            Boolean bool = null;
            List list = null;
            String str = null;
            Integer num2 = null;
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
                        bool = (Boolean) cVarC.v(eVar2, 3, m63.g.f116948a, bool);
                        i15 |= 8;
                        break;
                    case 4:
                        list = (List) cVarC.v(eVar2, 4, lVarArr[4].getValue(), list);
                        i15 |= 16;
                        break;
                    case 5:
                        str = (String) cVarC.v(eVar2, 5, y1.f117048a, str);
                        i15 |= 32;
                        break;
                    case 6:
                        num2 = (Integer) cVarC.v(eVar2, 6, m0.f116981a, num2);
                        i15 |= 64;
                        break;
                    case 7:
                        f14 = (Float) cVarC.v(eVar2, 7, d0.f116930a, f14);
                        i15 |= 128;
                        break;
                    case 8:
                        num = (Integer) cVarC.v(eVar2, 8, m0.f116981a, num);
                        i15 |= 256;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new e(i15, d14, d15, d16, bool, list, str, num2, f14, num, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            e eVar = (e) obj;
            eVar.getClass();
            Integer num = eVar.f59581i;
            Float f14 = eVar.f59580h;
            Integer num2 = eVar.f59579g;
            String str = eVar.f59578f;
            List<String> list = eVar.f59577e;
            Boolean bool = eVar.f59576d;
            Double d14 = eVar.f59575c;
            Double d15 = eVar.f59574b;
            Double d16 = eVar.f59573a;
            k63.e eVar2 = descriptor;
            l63.d dVarC = fVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = e.f59572j;
            if (dVarC.C(eVar2) || d16 != null) {
                dVarC.d(eVar2, 0, x.f117036a, d16);
            }
            if (dVarC.C(eVar2) || d15 != null) {
                dVarC.d(eVar2, 1, x.f117036a, d15);
            }
            if (dVarC.C(eVar2) || d14 != null) {
                dVarC.d(eVar2, 2, x.f117036a, d14);
            }
            if (dVarC.C(eVar2) || bool != null) {
                dVarC.d(eVar2, 3, m63.g.f116948a, bool);
            }
            if (dVarC.C(eVar2) || list != null) {
                dVarC.d(eVar2, 4, lVarArr[4].getValue(), list);
            }
            if (dVarC.C(eVar2) || str != null) {
                dVarC.d(eVar2, 5, y1.f117048a, str);
            }
            if (dVarC.C(eVar2) || num2 != null) {
                dVarC.d(eVar2, 6, m0.f116981a, num2);
            }
            if (dVarC.C(eVar2) || f14 != null) {
                dVarC.d(eVar2, 7, d0.f116930a, f14);
            }
            if (dVarC.C(eVar2) || num != null) {
                dVarC.d(eVar2, 8, m0.f116981a, num);
            }
            dVarC.b(eVar2);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Float f14;
            Integer numValueOf;
            parcel.getClass();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Double d14 = dValueOf2;
            Double d15 = dValueOf3;
            Boolean bool = boolValueOf;
            String string = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                Float f15 = fValueOf;
                numValueOf = null;
                f14 = f15;
            } else {
                f14 = fValueOf;
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new e(dValueOf, d14, d15, bool, arrayListCreateStringArrayList, string, numValueOf2, f14, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(int i14, Double d14, Double d15, Double d16, Boolean bool, List list, String str, Integer num, Float f14, Integer num2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f59573a = null;
        } else {
            this.f59573a = d14;
        }
        if ((i14 & 2) == 0) {
            this.f59574b = null;
        } else {
            this.f59574b = d15;
        }
        if ((i14 & 4) == 0) {
            this.f59575c = null;
        } else {
            this.f59575c = d16;
        }
        if ((i14 & 8) == 0) {
            this.f59576d = null;
        } else {
            this.f59576d = bool;
        }
        if ((i14 & 16) == 0) {
            this.f59577e = null;
        } else {
            this.f59577e = list;
        }
        if ((i14 & 32) == 0) {
            this.f59578f = null;
        } else {
            this.f59578f = str;
        }
        if ((i14 & 64) == 0) {
            this.f59579g = null;
        } else {
            this.f59579g = num;
        }
        if ((i14 & 128) == 0) {
            this.f59580h = null;
        } else {
            this.f59580h = f14;
        }
        if ((i14 & 256) == 0) {
            this.f59581i = null;
        } else {
            this.f59581i = num2;
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
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f59573a, eVar.f59573a) && s.g(this.f59574b, eVar.f59574b) && s.g(this.f59575c, eVar.f59575c) && s.g(this.f59576d, eVar.f59576d) && s.g(this.f59577e, eVar.f59577e) && s.g(this.f59578f, eVar.f59578f) && s.g(this.f59579g, eVar.f59579g) && s.g(this.f59580h, eVar.f59580h) && s.g(this.f59581i, eVar.f59581i);
    }

    public final int hashCode() {
        Double d14 = this.f59573a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f59574b;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f59575c;
        int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Boolean bool = this.f59576d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.f59577e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f59578f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f59579g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Float f14 = this.f59580h;
        int iHashCode8 = (iHashCode7 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Integer num2 = this.f59581i;
        return iHashCode8 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = tn.k.i("FitnessAgeDetailsMetricDto(value=", this.f59573a, this.f59574b, ", targetValue=", ", potentialAge=");
        sbI.append(this.f59575c);
        sbI.append(", stale=");
        sbI.append(this.f59576d);
        sbI.append(", staleInputs=");
        o2.c.n(", lastMeasurementDate=", this.f59578f, ", numOfWeeksForIm=", sbI, this.f59577e);
        sbI.append(this.f59579g);
        sbI.append(", improvementValue=");
        sbI.append(this.f59580h);
        sbI.append(", priority=");
        return f3.i(sbI, this.f59581i, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.f59573a;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f59574b;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.f59575c;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Boolean bool = this.f59576d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeStringList(this.f59577e);
        parcel.writeString(this.f59578f);
        Integer num = this.f59579g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Float f14 = this.f59580h;
        if (f14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f14.floatValue());
        }
        Integer num2 = this.f59581i;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
    }

    /* JADX INFO: renamed from: dh0.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldh0/e$b;", "", "<init>", "()V", "Li63/c;", "Ldh0/e;", "serializer", "()Li63/c;", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<e> serializer() {
            return a.f59582a;
        }

        private Companion() {
        }
    }

    public e() {
        this((Double) null, (Double) null, (Double) null, (Boolean) null, (List) null, (String) null, (Integer) null, (Float) null, (Integer) null, 511, (p005kotlin.jvm.internal.j) null);
    }

    public e(Double d14, Double d15, Double d16, Boolean bool, List<String> list, String str, Integer num, Float f14, Integer num2) {
        this.f59573a = d14;
        this.f59574b = d15;
        this.f59575c = d16;
        this.f59576d = bool;
        this.f59577e = list;
        this.f59578f = str;
        this.f59579g = num;
        this.f59580h = f14;
        this.f59581i = num2;
    }

    public /* synthetic */ e(Double d14, Double d15, Double d16, Boolean bool, List list, String str, Integer num, Float f14, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : d15, (i14 & 4) != 0 ? null : d16, (i14 & 8) != 0 ? null : bool, (i14 & 16) != 0 ? null : list, (i14 & 32) != 0 ? null : str, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? null : f14, (i14 & 256) != 0 ? null : num2);
    }
}

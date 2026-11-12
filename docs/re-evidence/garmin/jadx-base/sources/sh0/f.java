package sh0;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import i63.h;
import lc.u0;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0003\u000e\u000f\u0010B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0011"}, d2 = {"Lsh0/f;", "Landroid/os/Parcelable;", "", "_calendarDate", "Lsh0/f$d;", "values", "<init>", "(Ljava/lang/String;Lsh0/f$d;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lsh0/f$d;Lm63/u1;)V", "Companion", "d", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class f implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f159298b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<f> CREATOR = new c();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readString(), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(int i14, String str, d dVar, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f159297a = null;
        } else {
            this.f159297a = str;
        }
        if ((i14 & 2) == 0) {
            this.f159298b = null;
        } else {
            this.f159298b = dVar;
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f159297a, fVar.f159297a) && s.g(this.f159298b, fVar.f159298b);
    }

    public final int hashCode() {
        String str = this.f159297a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        d dVar = this.f159298b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "WeeklyFloorsSummaryDto(_calendarDate=" + this.f159297a + ", values=" + this.f159298b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f159297a);
        d dVar = this.f159298b;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lsh0/f$d;", "Landroid/os/Parcelable;", "", "dataDaysCount", "", "floorsAscended", "floorsDescended", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class d implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f159301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f159302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f159303c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<d> CREATOR = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f159300d = 8;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/floors/data/model/WeeklyFloorsSummaryDto.Values.$serializer", "Lm63/e0;", "Lsh0/f$d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f159304a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f159304a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.floors.data.model.WeeklyFloorsSummaryDto.Values", aVar, 3);
                m1Var.j("wellnessDataDaysCount", true);
                m1Var.j("wellnessFloorsAscended", true);
                m1Var.j("wellnessFloorsDescended", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                i63.c<?> cVarD = j63.a.d(m0.f116981a);
                x xVar = x.f117036a;
                return new i63.c[]{cVarD, j63.a.d(xVar), j63.a.d(xVar)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                Integer num = null;
                Double d14 = null;
                Double d15 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        num = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num);
                        i15 |= 1;
                    } else if (iE == 1) {
                        d14 = (Double) cVarC.v(eVar2, 1, x.f117036a, d14);
                        i15 |= 2;
                    } else {
                        if (iE != 2) {
                            hb.a.o(iE);
                            return null;
                        }
                        d15 = (Double) cVarC.v(eVar2, 2, x.f117036a, d15);
                        i15 |= 4;
                    }
                }
                cVarC.b(eVar2);
                return new d(i15, num, d14, d15, (u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                d dVar = (d) obj;
                dVar.getClass();
                Double d14 = dVar.f159303c;
                Double d15 = dVar.f159302b;
                Integer num = dVar.f159301a;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || num != null) {
                    dVarC.d(eVar, 0, m0.f116981a, num);
                }
                if (dVarC.C(eVar) || d15 != null) {
                    dVarC.d(eVar, 1, x.f117036a, d15);
                }
                if (dVarC.C(eVar) || d14 != null) {
                    dVarC.d(eVar, 2, x.f117036a, d14);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new d(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        public /* synthetic */ d(int i14, Integer num, Double d14, Double d15, u1 u1Var) {
            if ((i14 & 1) == 0) {
                this.f159301a = null;
            } else {
                this.f159301a = num;
            }
            if ((i14 & 2) == 0) {
                this.f159302b = null;
            } else {
                this.f159302b = d14;
            }
            if ((i14 & 4) == 0) {
                this.f159303c = null;
            } else {
                this.f159303c = d15;
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
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return s.g(this.f159301a, dVar.f159301a) && s.g(this.f159302b, dVar.f159302b) && s.g(this.f159303c, dVar.f159303c);
        }

        public final int hashCode() {
            Integer num = this.f159301a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Double d14 = this.f159302b;
            int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f159303c;
            return iHashCode2 + (d15 != null ? d15.hashCode() : 0);
        }

        public final String toString() {
            return i.g(u0.m("Values(dataDaysCount=", this.f159301a, ", floorsAscended=", this.f159302b, ", floorsDescended="), this.f159303c, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Integer num = this.f159301a;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num);
            }
            Double d14 = this.f159302b;
            if (d14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d14);
            }
            Double d15 = this.f159303c;
            if (d15 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d15);
            }
        }

        /* JADX INFO: renamed from: sh0.f$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsh0/f$d$b;", "", "<init>", "()V", "Li63/c;", "Lsh0/f$d;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final i63.c<d> serializer() {
                return a.f159304a;
            }

            private Companion() {
            }
        }

        public d() {
            this((Integer) null, (Double) null, (Double) null, 7, (j) null);
        }

        public d(Integer num, Double d14, Double d15) {
            this.f159301a = num;
            this.f159302b = d14;
            this.f159303c = d15;
        }

        public /* synthetic */ d(Integer num, Double d14, Double d15, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15);
        }
    }

    /* JADX INFO: renamed from: sh0.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsh0/f$b;", "", "<init>", "()V", "Li63/c;", "Lsh0/f;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<f> serializer() {
            return a.f159299a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this((String) null, (d) (0 == true ? 1 : 0), 3, (j) (0 == true ? 1 : 0));
    }

    public f(String str, d dVar) {
        this.f159297a = str;
        this.f159298b = dVar;
    }

    public /* synthetic */ f(String str, d dVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : dVar);
    }
}

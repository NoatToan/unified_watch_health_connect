package jq1;

import android.os.Parcel;
import android.os.Parcelable;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0003\u000e\u000f\u0010B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0011"}, d2 = {"Ljq1/j;", "Landroid/os/Parcelable;", "", "_calendarDate", "Ljq1/j$d;", "values", "<init>", "(Ljava/lang/String;Ljq1/j$d;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljq1/j$d;Lm63/u1;)V", "Companion", "d", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class j implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f100023b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<j> CREATOR = new c();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readString(), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public /* synthetic */ j(int i14, String str, d dVar, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f100022a = null;
        } else {
            this.f100022a = str;
        }
        if ((i14 & 2) == 0) {
            this.f100023b = null;
        } else {
            this.f100023b = dVar;
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
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.f100022a, jVar.f100022a) && s.g(this.f100023b, jVar.f100023b);
    }

    public final int hashCode() {
        String str = this.f100022a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        d dVar = this.f100023b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "StepsSummaryDTO(_calendarDate=" + this.f100022a + ", values=" + this.f100023b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f100022a);
        d dVar = this.f100023b;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Ljq1/j$d;", "Landroid/os/Parcelable;", "", "totalSteps", "", "dataDaysCount", "totalDistance", "<init>", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class d implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Double f100025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f100026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f100027c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<d> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/steps/data/model/StepsSummaryDTO.Values.$serializer", "Lm63/e0;", "Ljq1/j$d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f100028a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f100028a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.steps.data.model.StepsSummaryDTO.Values", aVar, 3);
                m1Var.j("totalSteps", true);
                m1Var.j("wellnessDataDaysCount", true);
                m1Var.j("totalDistance", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                x xVar = x.f117036a;
                return new i63.c[]{j63.a.d(xVar), j63.a.d(m0.f116981a), j63.a.d(xVar)};
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
                Integer num = null;
                Double d15 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        d14 = (Double) cVarC.v(eVar2, 0, x.f117036a, d14);
                        i15 |= 1;
                    } else if (iE == 1) {
                        num = (Integer) cVarC.v(eVar2, 1, m0.f116981a, num);
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
                return new d(i15, d14, num, d15, (u1) null);
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
                Double d14 = dVar.f100027c;
                Integer num = dVar.f100026b;
                Double d15 = dVar.f100025a;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || d15 != null) {
                    dVarC.d(eVar, 0, x.f117036a, d15);
                }
                if (dVarC.C(eVar) || num != null) {
                    dVarC.d(eVar, 1, m0.f116981a, num);
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
                return new d(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        public /* synthetic */ d(int i14, Double d14, Integer num, Double d15, u1 u1Var) {
            if ((i14 & 1) == 0) {
                this.f100025a = null;
            } else {
                this.f100025a = d14;
            }
            if ((i14 & 2) == 0) {
                this.f100026b = null;
            } else {
                this.f100026b = num;
            }
            if ((i14 & 4) == 0) {
                this.f100027c = null;
            } else {
                this.f100027c = d15;
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
            return s.g(this.f100025a, dVar.f100025a) && s.g(this.f100026b, dVar.f100026b) && s.g(this.f100027c, dVar.f100027c);
        }

        public final int hashCode() {
            Double d14 = this.f100025a;
            int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
            Integer num = this.f100026b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Double d15 = this.f100027c;
            return iHashCode2 + (d15 != null ? d15.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Values(totalSteps=");
            sb3.append(this.f100025a);
            sb3.append(", dataDaysCount=");
            sb3.append(this.f100026b);
            sb3.append(", totalDistance=");
            return b71.i.g(sb3, this.f100027c, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Double d14 = this.f100025a;
            if (d14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d14);
            }
            Integer num = this.f100026b;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num);
            }
            Double d15 = this.f100027c;
            if (d15 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d15);
            }
        }

        /* JADX INFO: renamed from: jq1.j$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljq1/j$d$b;", "", "<init>", "()V", "Li63/c;", "Ljq1/j$d;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<d> serializer() {
                return a.f100028a;
            }

            private Companion() {
            }
        }

        public d() {
            this((Double) null, (Integer) null, (Double) null, 7, (p005kotlin.jvm.internal.j) null);
        }

        public d(Double d14, Integer num, Double d15) {
            this.f100025a = d14;
            this.f100026b = num;
            this.f100027c = d15;
        }

        public /* synthetic */ d(Double d14, Integer num, Double d15, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : d15);
        }
    }

    /* JADX INFO: renamed from: jq1.j$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljq1/j$b;", "", "<init>", "()V", "Li63/c;", "Ljq1/j;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<j> serializer() {
            return a.f100024a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j() {
        this((String) null, (d) (0 == true ? 1 : 0), 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
    }

    public j(String str, d dVar) {
        this.f100022a = str;
        this.f100023b = dVar;
    }

    public /* synthetic */ j(String str, d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : dVar);
    }
}

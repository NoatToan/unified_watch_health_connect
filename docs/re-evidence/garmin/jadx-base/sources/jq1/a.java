package jq1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jk0.w;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.x;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000f\u0010\u0011B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0012"}, d2 = {"Ljq1/a;", "Landroid/os/Parcelable;", "", "Ljq1/e;", "values", "Ljq1/a$d;", "aggregations", "<init>", "(Ljava/util/List;Ljq1/a$d;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Ljq1/a$d;Lm63/u1;)V", "Companion", "d", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e> f99973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f99974b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f99972c = {m.a(n.PUBLICATION, new w(10)), null};

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(e.CREATOR, parcel, arrayList, iA, 1);
            }
            return new a(arrayList, parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(int i14, List list, d dVar, u1 u1Var) {
        this.f99973a = (i14 & 1) == 0 ? j0.f134944a : list;
        if ((i14 & 2) == 0) {
            this.f99974b = null;
        } else {
            this.f99974b = dVar;
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f99973a, aVar.f99973a) && s.g(this.f99974b, aVar.f99974b);
    }

    public final int hashCode() {
        int iHashCode = this.f99973a.hashCode() * 31;
        d dVar = this.f99974b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "DailyStepsChartItemDTO(values=" + this.f99973a + ", aggregations=" + this.f99974b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.f99973a, parcel);
        while (itE.hasNext()) {
            ((e) itE.next()).writeToParcel(parcel, i14);
        }
        d dVar = this.f99974b;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Ljq1/a$d;", "Landroid/os/Parcelable;", "", "totalStepsAverage", "totalStepsWeeklyAverage", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class d implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Double f99976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f99977b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<d> CREATOR = new c();

        /* JADX INFO: renamed from: jq1.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/steps/data/model/DailyStepsChartItemDTO.DailyAggregations.$serializer", "Lm63/e0;", "Ljq1/a$d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C1924a implements e0<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1924a f99978a;
            private static final k63.e descriptor;

            static {
                C1924a c1924a = new C1924a();
                f99978a = c1924a;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.steps.data.model.DailyStepsChartItemDTO.DailyAggregations", c1924a, 2);
                m1Var.j("totalStepsAverage", true);
                m1Var.j("totalStepsWeeklyAverage", true);
                descriptor = m1Var;
            }

            private C1924a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                x xVar = x.f117036a;
                return new i63.c[]{j63.a.d(xVar), j63.a.d(xVar)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                Double d14 = null;
                Double d15 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        d14 = (Double) cVarC.v(eVar2, 0, x.f117036a, d14);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        d15 = (Double) cVarC.v(eVar2, 1, x.f117036a, d15);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new d(i15, d14, d15, u1Var);
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
                Double d14 = dVar.f99977b;
                Double d15 = dVar.f99976a;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || d15 != null) {
                    dVarC.d(eVar, 0, x.f117036a, d15);
                }
                if (dVarC.C(eVar) || d14 != null) {
                    dVarC.d(eVar, 1, x.f117036a, d14);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new d(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        public /* synthetic */ d(int i14, Double d14, Double d15, u1 u1Var) {
            if ((i14 & 1) == 0) {
                this.f99976a = null;
            } else {
                this.f99976a = d14;
            }
            if ((i14 & 2) == 0) {
                this.f99977b = null;
            } else {
                this.f99977b = d15;
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
            return s.g(this.f99976a, dVar.f99976a) && s.g(this.f99977b, dVar.f99977b);
        }

        public final int hashCode() {
            Double d14 = this.f99976a;
            int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
            Double d15 = this.f99977b;
            return iHashCode + (d15 != null ? d15.hashCode() : 0);
        }

        public final String toString() {
            return "DailyAggregations(totalStepsAverage=" + this.f99976a + ", totalStepsWeeklyAverage=" + this.f99977b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Double d14 = this.f99976a;
            if (d14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d14);
            }
            Double d15 = this.f99977b;
            if (d15 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.m(parcel, 1, d15);
            }
        }

        /* JADX INFO: renamed from: jq1.a$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljq1/a$d$b;", "", "<init>", "()V", "Li63/c;", "Ljq1/a$d;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<d> serializer() {
                return C1924a.f99978a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this((Double) null, (Double) (0 == true ? 1 : 0), 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }

        public d(Double d14, Double d15) {
            this.f99976a = d14;
            this.f99977b = d15;
        }

        public /* synthetic */ d(Double d14, Double d15, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : d15);
        }
    }

    /* JADX INFO: renamed from: jq1.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljq1/a$b;", "", "<init>", "()V", "Li63/c;", "Ljq1/a;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C1923a.f99975a;
        }

        private Companion() {
        }
    }

    public a() {
        this((List) null, (d) null, 3, (p005kotlin.jvm.internal.j) null);
    }

    public a(List<e> list, d dVar) {
        list.getClass();
        this.f99973a = list;
        this.f99974b = dVar;
    }

    public a(List list, d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? null : dVar);
    }
}

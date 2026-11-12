package tq0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.FeatureType;
import com.google.firebase.perf.FirebasePerformance;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B/\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0015"}, d2 = {"Ltq0/i;", "Landroid/os/Parcelable;", "", "Ltq0/i$d;", "datasetValues", "", "chartTitle", "Ltq0/i$e;", "options", "<init>", "(Ljava/util/List;Ljava/lang/String;Ltq0/i$e;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ltq0/i$e;Lm63/u1;)V", "Companion", "b", "d", JWKParameterNames.RSA_EXPONENT, "a", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class i implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f166081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f166082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f166083c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<i> CREATOR = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f166080d = {o13.m.a(n.PUBLICATION, new tk0.a(24)), null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/insights/model/InsightChartHistogramBarDTO.$serializer", "Lm63/e0;", "Ltq0/i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f166084a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f166084a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.insights.model.InsightChartHistogramBarDTO", aVar, 3);
            m1Var.j("dataset", true);
            m1Var.j("title", true);
            m1Var.j("options", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(i.f166080d[0].getValue()), j63.a.d(y1.f117048a), j63.a.d(e.a.f166093a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = i.f166080d;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            List list = null;
            String str = null;
            e eVar3 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    list = (List) cVarC.v(eVar2, 0, lVarArr[0].getValue(), list);
                    i15 |= 1;
                } else if (iE == 1) {
                    str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    eVar3 = (e) cVarC.v(eVar2, 2, e.a.f166093a, eVar3);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new i(i15, list, str, eVar3, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF94809a() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            i iVar = (i) obj;
            iVar.getClass();
            String str = iVar.f166082b;
            List<d> list = iVar.f166081a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = i.f166080d;
            if (dVarC.C(eVar) || list != null) {
                dVarC.d(eVar, 0, lVarArr[0].getValue(), list);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 1, y1.f117048a, str);
            }
            dVarC.d(eVar, 2, e.a.f166093a, iVar.f166083c);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(d.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new i(arrayList, parcel.readString(), parcel.readInt() != 0 ? e.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public /* synthetic */ i(int i14, List list, String str, e eVar, u1 u1Var) {
        if (4 != (i14 & 4)) {
            k1.h(i14, 4, a.f166084a.getF94809a());
            throw null;
        }
        if ((i14 & 1) == 0) {
            this.f166081a = null;
        } else {
            this.f166081a = list;
        }
        if ((i14 & 2) == 0) {
            this.f166082b = null;
        } else {
            this.f166082b = str;
        }
        this.f166083c = eVar;
    }

    public final List<h> b() {
        d dVar;
        List<h> list;
        List<d> list2 = this.f166081a;
        return (list2 == null || (dVar = (d) h0.e0(0, list2)) == null || (list = dVar.f166086a) == null) ? j0.f134944a : list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f166081a, iVar.f166081a) && s.g(this.f166082b, iVar.f166082b) && s.g(this.f166083c, iVar.f166083c);
    }

    public final int hashCode() {
        List<d> list = this.f166081a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f166082b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.f166083c;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "InsightChartHistogramBarDTO(datasetValues=" + this.f166081a + ", chartTitle=" + this.f166082b + ", options=" + this.f166083c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<d> list = this.f166081a;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((d) itO.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.f166082b);
        e eVar = this.f166083c;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Ltq0/i$d;", "Landroid/os/Parcelable;", "", "Ltq0/h;", "values", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class d implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<h> f166086a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<d> CREATOR = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f166085b = {o13.m.a(n.PUBLICATION, new tk0.a(25))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/insights/model/InsightChartHistogramBarDTO.DatasetValues.$serializer", "Lm63/e0;", "Ltq0/i$d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f166087a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f166087a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.insights.model.InsightChartHistogramBarDTO.DatasetValues", aVar, 1);
                m1Var.j("values", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{d.f166085b[0].getValue()};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = d.f166085b;
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                List list = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        list = (List) cVarC.l(eVar2, 0, lVarArr[0].getValue(), list);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new d(i15, list, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF94809a() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                d dVar = (d) obj;
                dVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.e(eVar, 0, d.f166085b[0].getValue(), dVar.f166086a);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(h.CREATOR, parcel, arrayList, iA, 1);
                }
                return new d(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        public /* synthetic */ d(int i14, List list, u1 u1Var) {
            if (1 == (i14 & 1)) {
                this.f166086a = list;
            } else {
                k1.h(i14, 1, a.f166087a.getF94809a());
                throw null;
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
            return (obj instanceof d) && s.g(this.f166086a, ((d) obj).f166086a);
        }

        public final int hashCode() {
            return this.f166086a.hashCode();
        }

        public final String toString() {
            return tn.k.h("DatasetValues(values=", ")", this.f166086a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Iterator itE = kg.f.e(this.f166086a, parcel);
            while (itE.hasNext()) {
                ((h) itE.next()).writeToParcel(parcel, i14);
            }
        }

        /* JADX INFO: renamed from: tq0.i$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltq0/i$d$b;", "", "<init>", "()V", "Li63/c;", "Ltq0/i$d;", "serializer", "()Li63/c;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<d> serializer() {
                return a.f166087a;
            }

            private Companion() {
            }
        }

        public d(List<h> list) {
            list.getClass();
            this.f166086a = list;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Ltq0/i$e;", "Landroid/os/Parcelable;", "", "axisLabelX", "emphasisLabel", "unitYTitle", "unitXTitle", "percentile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class e implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f166088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f166089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f166090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f166091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f166092e;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<e> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/insights/model/InsightChartHistogramBarDTO.Options.$serializer", "Lm63/e0;", "Ltq0/i$e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f166093a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f166093a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.insights.model.InsightChartHistogramBarDTO.Options", aVar, 5);
                m1Var.j("axisLabel-x", true);
                m1Var.j("emphasisLabel", true);
                m1Var.j("unit-y", true);
                m1Var.j("unit-x", true);
                m1Var.j("percentile", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                y1 y1Var = y1.f117048a;
                return new i63.c[]{j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                        i15 |= 1;
                    } else if (iE == 1) {
                        str2 = (String) cVarC.v(eVar2, 1, y1.f117048a, str2);
                        i15 |= 2;
                    } else if (iE == 2) {
                        str3 = (String) cVarC.v(eVar2, 2, y1.f117048a, str3);
                        i15 |= 4;
                    } else if (iE == 3) {
                        str4 = (String) cVarC.v(eVar2, 3, y1.f117048a, str4);
                        i15 |= 8;
                    } else {
                        if (iE != 4) {
                            hb.a.o(iE);
                            return null;
                        }
                        str5 = (String) cVarC.v(eVar2, 4, y1.f117048a, str5);
                        i15 |= 16;
                    }
                }
                cVarC.b(eVar2);
                return new e(i15, str, str2, str3, str4, str5, (u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF94809a() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                e eVar = (e) obj;
                eVar.getClass();
                String str = eVar.f166092e;
                String str2 = eVar.f166091d;
                String str3 = eVar.f166090c;
                String str4 = eVar.f166089b;
                String str5 = eVar.f166088a;
                k63.e eVar2 = descriptor;
                l63.d dVarC = fVar.c(eVar2);
                if (dVarC.C(eVar2) || str5 != null) {
                    dVarC.d(eVar2, 0, y1.f117048a, str5);
                }
                if (dVarC.C(eVar2) || str4 != null) {
                    dVarC.d(eVar2, 1, y1.f117048a, str4);
                }
                if (dVarC.C(eVar2) || str3 != null) {
                    dVarC.d(eVar2, 2, y1.f117048a, str3);
                }
                if (dVarC.C(eVar2) || str2 != null) {
                    dVarC.d(eVar2, 3, y1.f117048a, str2);
                }
                if (dVarC.C(eVar2) || str != null) {
                    dVarC.d(eVar2, 4, y1.f117048a, str);
                }
                dVarC.b(eVar2);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new e(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i14) {
                return new e[i14];
            }
        }

        public /* synthetic */ e(int i14, String str, String str2, String str3, String str4, String str5, u1 u1Var) {
            if ((i14 & 1) == 0) {
                this.f166088a = null;
            } else {
                this.f166088a = str;
            }
            if ((i14 & 2) == 0) {
                this.f166089b = null;
            } else {
                this.f166089b = str2;
            }
            if ((i14 & 4) == 0) {
                this.f166090c = null;
            } else {
                this.f166090c = str3;
            }
            if ((i14 & 8) == 0) {
                this.f166091d = null;
            } else {
                this.f166091d = str4;
            }
            if ((i14 & 16) == 0) {
                this.f166092e = null;
            } else {
                this.f166092e = str5;
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
            return s.g(this.f166088a, eVar.f166088a) && s.g(this.f166089b, eVar.f166089b) && s.g(this.f166090c, eVar.f166090c) && s.g(this.f166091d, eVar.f166091d) && s.g(this.f166092e, eVar.f166092e);
        }

        public final int hashCode() {
            String str = this.f166088a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f166089b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f166090c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f166091d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f166092e;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("Options(axisLabelX=", this.f166088a, ", emphasisLabel=", this.f166089b, ", unitYTitle=");
            sn.a.t(sbI, this.f166090c, ", unitXTitle=", this.f166091d, ", percentile=");
            return am.j.o(this.f166092e, ")", sbI);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f166088a);
            parcel.writeString(this.f166089b);
            parcel.writeString(this.f166090c);
            parcel.writeString(this.f166091d);
            parcel.writeString(this.f166092e);
        }

        /* JADX INFO: renamed from: tq0.i$e$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltq0/i$e$b;", "", "<init>", "()V", "Li63/c;", "Ltq0/i$e;", "serializer", "()Li63/c;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<e> serializer() {
                return a.f166093a;
            }

            private Companion() {
            }
        }

        public e() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (p005kotlin.jvm.internal.j) null);
        }

        public e(String str, String str2, String str3, String str4, String str5) {
            this.f166088a = str;
            this.f166089b = str2;
            this.f166090c = str3;
            this.f166091d = str4;
            this.f166092e = str5;
        }

        public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5);
        }
    }

    /* JADX INFO: renamed from: tq0.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Ltq0/i$b;", "", "<init>", "()V", "Li63/c;", "Ltq0/i;", "serializer", "()Li63/c;", "", FeatureType.DATASET, "Ljava/lang/String;", "CHART_TITLE", FirebasePerformance.HttpMethod.OPTIONS, "AXIS_LABEL_X", "EMPHASIS_LABEL", "UNIT_Y", "UNIT_X", "PERCENTILE", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<i> serializer() {
            return a.f166084a;
        }

        private Companion() {
        }
    }

    public i(List<d> list, String str, e eVar) {
        this.f166081a = list;
        this.f166082b = str;
        this.f166083c = eVar;
    }

    public /* synthetic */ i(List list, String str, e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : str, eVar);
    }
}

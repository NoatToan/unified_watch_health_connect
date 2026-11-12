package bo;

import bm.y;
import java.util.List;
import m63.d0;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001cB\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019¨\u0006\u001d"}, d2 = {"Lbo/o;", "", "", "weight", "Lbo/p;", "weightUnit", "visibility", "visibilityUnit", "", "surfaceCondition", "current", "", "waterType", "", "waterDensity", "", "Lbo/n;", "summarizedDiveGases", "", "totalSurfaceTime", "<init>", "(Ljava/lang/Double;Lbo/p;Ljava/lang/Double;Lbo/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/lang/Long;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Double;Lbo/p;Ljava/lang/Double;Lbo/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/lang/Long;Lm63/u1;)V", "Companion", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class o {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f19218k = {null, null, null, null, null, null, null, null, o13.m.a(o13.n.PUBLICATION, new y(12)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f19219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f19220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f19221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f19222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f19225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Float f19226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<n> f19227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f19228j;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/activities/history/data/model/SummarizedDiveInfoDTO.$serializer", "Lm63/e0;", "Lbo/o;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19229a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f19229a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.activities.history.data.model.SummarizedDiveInfoDTO", aVar, 10);
            m1Var.j("weight", true);
            m1Var.j("weightUnit", true);
            m1Var.j("visibility", true);
            m1Var.j("visibilityUnit", true);
            m1Var.j("surfaceCondition", true);
            m1Var.j("current", true);
            m1Var.j("waterType", true);
            m1Var.j("waterDensity", true);
            m1Var.j("summarizedDiveGases", true);
            m1Var.j("totalSurfaceTime", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = o.f19218k;
            x xVar = x.f117036a;
            i63.c<?> cVarD = j63.a.d(xVar);
            p.a aVar = p.a.f19233a;
            i63.c<?> cVarD2 = j63.a.d(aVar);
            i63.c<?> cVarD3 = j63.a.d(xVar);
            i63.c<?> cVarD4 = j63.a.d(aVar);
            y1 y1Var = y1.f117048a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, cVarD4, j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(m0.f116981a), j63.a.d(d0.f116930a), j63.a.d(lVarArr[8].getValue()), j63.a.d(v0.f117027a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            o13.l<i63.c<Object>>[] lVarArr;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr2 = o.f19218k;
            int i14 = l63.c.f110557a;
            Long l14 = null;
            List list = null;
            boolean z14 = true;
            Float f14 = null;
            int i15 = 0;
            Double d14 = null;
            p pVar = null;
            Double d15 = null;
            p pVar2 = null;
            String str = null;
            String str2 = null;
            Integer num = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        continue;
                    case 0:
                        lVarArr = lVarArr2;
                        d14 = (Double) cVarC.v(eVar2, 0, x.f117036a, d14);
                        i15 |= 1;
                        break;
                    case 1:
                        lVarArr = lVarArr2;
                        pVar = (p) cVarC.v(eVar2, 1, p.a.f19233a, pVar);
                        i15 |= 2;
                        break;
                    case 2:
                        lVarArr = lVarArr2;
                        d15 = (Double) cVarC.v(eVar2, 2, x.f117036a, d15);
                        i15 |= 4;
                        break;
                    case 3:
                        lVarArr = lVarArr2;
                        pVar2 = (p) cVarC.v(eVar2, 3, p.a.f19233a, pVar2);
                        i15 |= 8;
                        break;
                    case 4:
                        lVarArr = lVarArr2;
                        str = (String) cVarC.v(eVar2, 4, y1.f117048a, str);
                        i15 |= 16;
                        break;
                    case 5:
                        lVarArr = lVarArr2;
                        str2 = (String) cVarC.v(eVar2, 5, y1.f117048a, str2);
                        i15 |= 32;
                        break;
                    case 6:
                        lVarArr = lVarArr2;
                        num = (Integer) cVarC.v(eVar2, 6, m0.f116981a, num);
                        i15 |= 64;
                        break;
                    case 7:
                        lVarArr = lVarArr2;
                        f14 = (Float) cVarC.v(eVar2, 7, d0.f116930a, f14);
                        i15 |= 128;
                        break;
                    case 8:
                        lVarArr = lVarArr2;
                        list = (List) cVarC.v(eVar2, 8, lVarArr[8].getValue(), list);
                        i15 |= 256;
                        break;
                    case 9:
                        lVarArr = lVarArr2;
                        l14 = (Long) cVarC.v(eVar2, 9, v0.f117027a, l14);
                        i15 |= 512;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
                lVarArr2 = lVarArr;
            }
            cVarC.b(eVar2);
            return new o(i15, d14, pVar, d15, pVar2, str, str2, num, f14, list, l14, (u1) null);
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
            Long l14 = oVar.f19228j;
            List<n> list = oVar.f19227i;
            Float f14 = oVar.f19226h;
            Integer num = oVar.f19225g;
            String str = oVar.f19224f;
            String str2 = oVar.f19223e;
            p pVar = oVar.f19222d;
            Double d14 = oVar.f19221c;
            p pVar2 = oVar.f19220b;
            Double d15 = oVar.f19219a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = o.f19218k;
            if (dVarC.C(eVar) || d15 != null) {
                dVarC.d(eVar, 0, x.f117036a, d15);
            }
            if (dVarC.C(eVar) || pVar2 != null) {
                dVarC.d(eVar, 1, p.a.f19233a, pVar2);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 2, x.f117036a, d14);
            }
            if (dVarC.C(eVar) || pVar != null) {
                dVarC.d(eVar, 3, p.a.f19233a, pVar);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 4, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 5, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 6, m0.f116981a, num);
            }
            if (dVarC.C(eVar) || f14 != null) {
                dVarC.d(eVar, 7, d0.f116930a, f14);
            }
            if (dVarC.C(eVar) || list != null) {
                dVarC.d(eVar, 8, lVarArr[8].getValue(), list);
            }
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 9, v0.f117027a, l14);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ o(int i14, Double d14, p pVar, Double d15, p pVar2, String str, String str2, Integer num, Float f14, List list, Long l14, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f19219a = null;
        } else {
            this.f19219a = d14;
        }
        if ((i14 & 2) == 0) {
            this.f19220b = null;
        } else {
            this.f19220b = pVar;
        }
        if ((i14 & 4) == 0) {
            this.f19221c = null;
        } else {
            this.f19221c = d15;
        }
        if ((i14 & 8) == 0) {
            this.f19222d = null;
        } else {
            this.f19222d = pVar2;
        }
        if ((i14 & 16) == 0) {
            this.f19223e = null;
        } else {
            this.f19223e = str;
        }
        if ((i14 & 32) == 0) {
            this.f19224f = null;
        } else {
            this.f19224f = str2;
        }
        if ((i14 & 64) == 0) {
            this.f19225g = null;
        } else {
            this.f19225g = num;
        }
        if ((i14 & 128) == 0) {
            this.f19226h = null;
        } else {
            this.f19226h = f14;
        }
        if ((i14 & 256) == 0) {
            this.f19227i = null;
        } else {
            this.f19227i = list;
        }
        if ((i14 & 512) == 0) {
            this.f19228j = null;
        } else {
            this.f19228j = l14;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return s.g(this.f19219a, oVar.f19219a) && s.g(this.f19220b, oVar.f19220b) && s.g(this.f19221c, oVar.f19221c) && s.g(this.f19222d, oVar.f19222d) && s.g(this.f19223e, oVar.f19223e) && s.g(this.f19224f, oVar.f19224f) && s.g(this.f19225g, oVar.f19225g) && s.g(this.f19226h, oVar.f19226h) && s.g(this.f19227i, oVar.f19227i) && s.g(this.f19228j, oVar.f19228j);
    }

    public final int hashCode() {
        Double d14 = this.f19219a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        p pVar = this.f19220b;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        Double d15 = this.f19221c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        p pVar2 = this.f19222d;
        int iHashCode4 = (iHashCode3 + (pVar2 == null ? 0 : pVar2.hashCode())) * 31;
        String str = this.f19223e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19224f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f19225g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Float f14 = this.f19226h;
        int iHashCode8 = (iHashCode7 + (f14 == null ? 0 : f14.hashCode())) * 31;
        List<n> list = this.f19227i;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Long l14 = this.f19228j;
        return iHashCode9 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SummarizedDiveInfoDTO(weight=");
        sb3.append(this.f19219a);
        sb3.append(", weightUnit=");
        sb3.append(this.f19220b);
        sb3.append(", visibility=");
        sb3.append(this.f19221c);
        sb3.append(", visibilityUnit=");
        sb3.append(this.f19222d);
        sb3.append(", surfaceCondition=");
        sn.a.t(sb3, this.f19223e, ", current=", this.f19224f, ", waterType=");
        sb3.append(this.f19225g);
        sb3.append(", waterDensity=");
        sb3.append(this.f19226h);
        sb3.append(", summarizedDiveGases=");
        sb3.append(this.f19227i);
        sb3.append(", totalSurfaceTime=");
        sb3.append(this.f19228j);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: bo.o$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbo/o$b;", "", "<init>", "()V", "Li63/c;", "Lbo/o;", "serializer", "()Li63/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<o> serializer() {
            return a.f19229a;
        }

        private Companion() {
        }
    }

    public o() {
        this((Double) null, (p) null, (Double) null, (p) null, (String) null, (String) null, (Integer) null, (Float) null, (List) null, (Long) null, 1023, (p005kotlin.jvm.internal.j) null);
    }

    public o(Double d14, p pVar, Double d15, p pVar2, String str, String str2, Integer num, Float f14, List<n> list, Long l14) {
        this.f19219a = d14;
        this.f19220b = pVar;
        this.f19221c = d15;
        this.f19222d = pVar2;
        this.f19223e = str;
        this.f19224f = str2;
        this.f19225g = num;
        this.f19226h = f14;
        this.f19227i = list;
        this.f19228j = l14;
    }

    public /* synthetic */ o(Double d14, p pVar, Double d15, p pVar2, String str, String str2, Integer num, Float f14, List list, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : pVar, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : pVar2, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? null : str2, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? null : f14, (i14 & 256) != 0 ? null : list, (i14 & 512) != 0 ? null : l14);
    }
}

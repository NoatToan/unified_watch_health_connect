package g01;

import java.util.List;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lg01/g;", "", "Lb63/o;", "calendarDate", "", "Lg01/x;", "meals", "Ll01/e;", "dailyViewType", "Lb63/v;", "dailyTimelineStartTime", "dailyTimelineEndTime", "<init>", "(Lb63/o;Ljava/util/List;Ll01/e;Lb63/v;Lb63/v;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILb63/o;Ljava/util/List;Ll01/e;Lb63/v;Lb63/v;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f74181f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b63.o f74182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<x> f74183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l01.e f74184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63.v f74185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b63.v f74186e;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/consumable/DailyMealEntryDTO.$serializer", "Lm63/e0;", "Lg01/g;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74187a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f74187a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.DailyMealEntryDTO", aVar, 5);
            m1Var.j("calendarDate", false);
            m1Var.j("meals", true);
            m1Var.j("dailyViewType", true);
            m1Var.j("dailyTimelineStartTime", true);
            m1Var.j("dailyTimelineEndTime", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = g.f74181f;
            return new i63.c[]{h63.k.f82304a, j63.a.d(lVarArr[1].getValue()), j63.a.d(lVarArr[2].getValue()), j63.a.d(lVarArr[3].getValue()), j63.a.d(lVarArr[4].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = g.f74181f;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            b63.o oVar = null;
            List list = null;
            l01.e eVar3 = null;
            b63.v vVar = null;
            b63.v vVar2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    oVar = (b63.o) cVarC.l(eVar2, 0, h63.k.f82304a, oVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    list = (List) cVarC.v(eVar2, 1, lVarArr[1].getValue(), list);
                    i15 |= 2;
                } else if (iE == 2) {
                    eVar3 = (l01.e) cVarC.v(eVar2, 2, lVarArr[2].getValue(), eVar3);
                    i15 |= 4;
                } else if (iE == 3) {
                    vVar = (b63.v) cVarC.v(eVar2, 3, lVarArr[3].getValue(), vVar);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    vVar2 = (b63.v) cVarC.v(eVar2, 4, lVarArr[4].getValue(), vVar2);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new g(i15, oVar, list, eVar3, vVar, vVar2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            g gVar = (g) obj;
            gVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = g.f74181f;
            h63.k kVar = h63.k.f82304a;
            b63.o oVar = gVar.f74182a;
            b63.v vVar = gVar.f74186e;
            b63.v vVar2 = gVar.f74185d;
            l01.e eVar2 = gVar.f74184c;
            List<x> list = gVar.f74183b;
            dVarC.e(eVar, 0, kVar, oVar);
            if (dVarC.C(eVar) || list != null) {
                dVarC.d(eVar, 1, lVarArr[1].getValue(), list);
            }
            if (dVarC.C(eVar) || eVar2 != null) {
                dVarC.d(eVar, 2, lVarArr[2].getValue(), eVar2);
            }
            if (dVarC.C(eVar) || vVar2 != null) {
                dVarC.d(eVar, 3, lVarArr[3].getValue(), vVar2);
            }
            if (dVarC.C(eVar) || vVar != null) {
                dVarC.d(eVar, 4, lVarArr[4].getValue(), vVar);
            }
            dVarC.b(eVar);
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f74181f = new o13.l[]{null, o13.m.a(nVar, new fy1.h(18)), o13.m.a(nVar, new fy1.h(19)), o13.m.a(nVar, new fy1.h(20)), o13.m.a(nVar, new fy1.h(21))};
    }

    public /* synthetic */ g(int i14, b63.o oVar, List list, l01.e eVar, b63.v vVar, b63.v vVar2, u1 u1Var) {
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, a.f74187a.getF158591b());
            throw null;
        }
        this.f74182a = oVar;
        if ((i14 & 2) == 0) {
            this.f74183b = null;
        } else {
            this.f74183b = list;
        }
        if ((i14 & 4) == 0) {
            this.f74184c = null;
        } else {
            this.f74184c = eVar;
        }
        if ((i14 & 8) == 0) {
            this.f74185d = null;
        } else {
            this.f74185d = vVar;
        }
        if ((i14 & 16) == 0) {
            this.f74186e = null;
        } else {
            this.f74186e = vVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.f74182a, gVar.f74182a) && p005kotlin.jvm.internal.s.g(this.f74183b, gVar.f74183b) && this.f74184c == gVar.f74184c && p005kotlin.jvm.internal.s.g(this.f74185d, gVar.f74185d) && p005kotlin.jvm.internal.s.g(this.f74186e, gVar.f74186e);
    }

    public final int hashCode() {
        int iHashCode = this.f74182a.f16206a.hashCode() * 31;
        List<x> list = this.f74183b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        l01.e eVar = this.f74184c;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        b63.v vVar = this.f74185d;
        int iHashCode4 = (iHashCode3 + (vVar == null ? 0 : vVar.f16219a.hashCode())) * 31;
        b63.v vVar2 = this.f74186e;
        return iHashCode4 + (vVar2 != null ? vVar2.f16219a.hashCode() : 0);
    }

    public final String toString() {
        return "DailyMealEntryDTO(calendarDate=" + this.f74182a + ", meals=" + this.f74183b + ", dailyViewType=" + this.f74184c + ", dailyTimelineStartTime=" + this.f74185d + ", dailyTimelineEndTime=" + this.f74186e + ")";
    }

    /* JADX INFO: renamed from: g01.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/g$b;", "", "<init>", "()V", "Li63/c;", "Lg01/g;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<g> serializer() {
            return a.f74187a;
        }

        private Companion() {
        }
    }

    public g(b63.o oVar, List<x> list, l01.e eVar, b63.v vVar, b63.v vVar2) {
        oVar.getClass();
        this.f74182a = oVar;
        this.f74183b = list;
        this.f74184c = eVar;
        this.f74185d = vVar;
        this.f74186e = vVar2;
    }

    public /* synthetic */ g(b63.o oVar, List list, l01.e eVar, b63.v vVar, b63.v vVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(oVar, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : eVar, (i14 & 8) != 0 ? null : vVar, (i14 & 16) != 0 ? null : vVar2);
    }
}

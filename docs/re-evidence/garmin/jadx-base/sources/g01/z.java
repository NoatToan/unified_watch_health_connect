package g01;

import java.util.ArrayList;
import java.util.List;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015BG\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lg01/z;", "", "", "Lg01/x;", "meals", "", "handleFutureLoggedFoodDeletion", "Lb63/v;", "dailyTimelineStartTime", "dailyTimelineEndTime", "Ll01/e;", "dailyViewType", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Lb63/v;Lb63/v;Ll01/e;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Boolean;Lb63/v;Lb63/v;Ll01/e;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class z {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f74293f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<x> f74294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f74295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.v f74296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63.v f74297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l01.e f74298e;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/consumable/MealsDTO.$serializer", "Lm63/e0;", "Lg01/z;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74299a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f74299a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.MealsDTO", aVar, 5);
            m1Var.j("meals", false);
            m1Var.j("handleFutureLoggedFoodDeletion", true);
            m1Var.j("dailyTimelineStartTime", true);
            m1Var.j("dailyTimelineEndTime", true);
            m1Var.j("dailyViewType", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = z.f74293f;
            return new i63.c[]{j63.a.d(lVarArr[0].getValue()), j63.a.d(m63.g.f116948a), j63.a.d(lVarArr[2].getValue()), j63.a.d(lVarArr[3].getValue()), j63.a.d(lVarArr[4].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = z.f74293f;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            List list = null;
            Boolean bool = null;
            b63.v vVar = null;
            b63.v vVar2 = null;
            l01.e eVar3 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    list = (List) cVarC.v(eVar2, 0, lVarArr[0].getValue(), list);
                    i15 |= 1;
                } else if (iE == 1) {
                    bool = (Boolean) cVarC.v(eVar2, 1, m63.g.f116948a, bool);
                    i15 |= 2;
                } else if (iE == 2) {
                    vVar = (b63.v) cVarC.v(eVar2, 2, lVarArr[2].getValue(), vVar);
                    i15 |= 4;
                } else if (iE == 3) {
                    vVar2 = (b63.v) cVarC.v(eVar2, 3, lVarArr[3].getValue(), vVar2);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    eVar3 = (l01.e) cVarC.v(eVar2, 4, lVarArr[4].getValue(), eVar3);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new z(i15, list, bool, vVar, vVar2, eVar3, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            z zVar = (z) obj;
            zVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = z.f74293f;
            i63.c<Object> value = lVarArr[0].getValue();
            List<x> list = zVar.f74294a;
            l01.e eVar2 = zVar.f74298e;
            b63.v vVar = zVar.f74297d;
            b63.v vVar2 = zVar.f74296c;
            Boolean bool = zVar.f74295b;
            dVarC.d(eVar, 0, value, list);
            if (dVarC.C(eVar) || !p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                dVarC.d(eVar, 1, m63.g.f116948a, bool);
            }
            if (dVarC.C(eVar) || vVar2 != null) {
                dVarC.d(eVar, 2, lVarArr[2].getValue(), vVar2);
            }
            if (dVarC.C(eVar) || vVar != null) {
                dVarC.d(eVar, 3, lVarArr[3].getValue(), vVar);
            }
            if (dVarC.C(eVar) || eVar2 != null) {
                dVarC.d(eVar, 4, lVarArr[4].getValue(), eVar2);
            }
            dVarC.b(eVar);
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f74293f = new o13.l[]{o13.m.a(nVar, new q(11)), null, o13.m.a(nVar, new q(12)), o13.m.a(nVar, new q(13)), o13.m.a(nVar, new q(14))};
    }

    public /* synthetic */ z(int i14, List list, Boolean bool, b63.v vVar, b63.v vVar2, l01.e eVar, u1 u1Var) {
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, a.f74299a.getF158591b());
            throw null;
        }
        this.f74294a = list;
        if ((i14 & 2) == 0) {
            this.f74295b = Boolean.FALSE;
        } else {
            this.f74295b = bool;
        }
        if ((i14 & 4) == 0) {
            this.f74296c = null;
        } else {
            this.f74296c = vVar;
        }
        if ((i14 & 8) == 0) {
            this.f74297d = null;
        } else {
            this.f74297d = vVar2;
        }
        if ((i14 & 16) == 0) {
            this.f74298e = null;
        } else {
            this.f74298e = eVar;
        }
    }

    public static z a(z zVar, ArrayList arrayList, Boolean bool, b63.v vVar, b63.v vVar2, int i14) {
        if ((i14 & 2) != 0) {
            bool = zVar.f74295b;
        }
        Boolean bool2 = bool;
        if ((i14 & 4) != 0) {
            vVar = zVar.f74296c;
        }
        b63.v vVar3 = vVar;
        if ((i14 & 8) != 0) {
            vVar2 = zVar.f74297d;
        }
        l01.e eVar = zVar.f74298e;
        zVar.getClass();
        return new z(arrayList, bool2, vVar3, vVar2, eVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return p005kotlin.jvm.internal.s.g(this.f74294a, zVar.f74294a) && p005kotlin.jvm.internal.s.g(this.f74295b, zVar.f74295b) && p005kotlin.jvm.internal.s.g(this.f74296c, zVar.f74296c) && p005kotlin.jvm.internal.s.g(this.f74297d, zVar.f74297d) && this.f74298e == zVar.f74298e;
    }

    public final int hashCode() {
        List<x> list = this.f74294a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.f74295b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        b63.v vVar = this.f74296c;
        int iHashCode3 = (iHashCode2 + (vVar == null ? 0 : vVar.f16219a.hashCode())) * 31;
        b63.v vVar2 = this.f74297d;
        int iHashCode4 = (iHashCode3 + (vVar2 == null ? 0 : vVar2.f16219a.hashCode())) * 31;
        l01.e eVar = this.f74298e;
        return iHashCode4 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "MealsDTO(meals=" + this.f74294a + ", handleFutureLoggedFoodDeletion=" + this.f74295b + ", dailyTimelineStartTime=" + this.f74296c + ", dailyTimelineEndTime=" + this.f74297d + ", dailyViewType=" + this.f74298e + ")";
    }

    /* JADX INFO: renamed from: g01.z$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/z$b;", "", "<init>", "()V", "Li63/c;", "Lg01/z;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<z> serializer() {
            return a.f74299a;
        }

        private Companion() {
        }
    }

    public z(List<x> list, Boolean bool, b63.v vVar, b63.v vVar2, l01.e eVar) {
        this.f74294a = list;
        this.f74295b = bool;
        this.f74296c = vVar;
        this.f74297d = vVar2;
        this.f74298e = eVar;
    }

    public /* synthetic */ z(List list, Boolean bool, b63.v vVar, b63.v vVar2, l01.e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, (i14 & 2) != 0 ? Boolean.FALSE : bool, (i14 & 4) != 0 ? null : vVar, (i14 & 8) != 0 ? null : vVar2, (i14 & 16) != 0 ? null : eVar);
    }
}

package yo;

import am.x0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import ps.d1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyo/w;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.newmodel.a f198311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f198312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f198313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f198314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f198315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f198316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f198317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<List<d1>> f198318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w0<Boolean> f198319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w0<Boolean> f198320j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f198321a;

        public a(e23.l lVar) {
            lVar.getClass();
            this.f198321a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f198321a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f198321a.invoke(obj);
        }
    }

    public w() {
        j0 j0Var = j0.f134944a;
        this.f198315e = j0Var;
        this.f198316f = j0Var;
        this.f198317g = j0Var;
        y0<List<d1>> y0Var = new y0<>();
        this.f198318h = y0Var;
        w0<Boolean> w0Var = new w0<>();
        w0Var.n(y0Var, new a(new x9.b(25, w0Var, this)));
        this.f198319i = w0Var;
        w0<Boolean> w0Var2 = new w0<>();
        w0Var2.n(y0Var, new a(new androidx.lifecycle.k(w0Var2, 12)));
        this.f198320j = w0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.List] */
    public final void a(int i14, o13.p<d1, d1> pVar) {
        pVar.getClass();
        d1 d1Var = pVar.f128594a;
        d1 d1Var2 = pVar.f128595b;
        if (d1Var2 == null) {
            int size = ((ArrayList) e()).size();
            int i15 = i14 + 1;
            if (i15 >= 0 && i15 < size) {
                ((ArrayList) e()).remove(i15);
            }
        } else {
            ((ArrayList) e()).set(i14 + 1, d1Var2);
        }
        if (d1Var == null) {
            ((ArrayList) e()).remove(i14);
        } else {
            ((ArrayList) e()).set(i14, d1Var);
        }
        int i16 = 0;
        for (Object obj : (ArrayList) e()) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                p13.x.q();
                throw null;
            }
            d1 d1Var3 = (d1) obj;
            d1 d1Var4 = (d1) ((ArrayList) e()).get(i16);
            Iterator it = ((ArrayList) e()).subList(0, i16).iterator();
            double dDoubleValue = 0.0d;
            double d14 = 0.0d;
            while (it.hasNext()) {
                d14 += ((d1) it.next()).f139786b;
            }
            d1Var4.f139789e = d14 + d1Var3.f139786b;
            d1 d1Var5 = (d1) ((ArrayList) e()).get(i16);
            d1 d1Var6 = (d1) h0.e0(i16 - 1, e());
            Double d15 = (Double) h0.e0(oi0.c.z(this.f198315e, d1Var6 != null ? d1Var6.f139789e : 0.0d), this.f198317g);
            d1Var5.f139792h = (d15 != null ? d15.doubleValue() : 0.0d) / 1000.0d;
            d1 d1Var7 = (d1) ((ArrayList) e()).get(i16);
            Double d16 = (Double) h0.e0(oi0.c.z(this.f198315e, ((d1) ((ArrayList) e()).get(i16)).f139789e), this.f198317g);
            if (d16 != null) {
                dDoubleValue = d16.doubleValue();
            }
            d1Var7.f139793i = dDoubleValue / 1000.0d;
            i16 = i17;
        }
        this.f198318h.j(e());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i14, v13.c cVar) {
        s sVar;
        z zVar;
        o13.p pVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i15 = sVar.f198302e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                sVar.f198302e = i15 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object obj = sVar.f198300c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = sVar.f198302e;
        if (i16 == 0) {
            o13.r.b(obj);
            z zVar2 = ((ArrayList) e()).size() == 2 ? z.LEG_REMOVAL_BLOCKED : z.NORMAL;
            d1 d1Var = (d1) ((ArrayList) e()).get(i14);
            if (i14 != 0) {
                i14--;
                d1 d1Var2 = (d1) h0.e0(i14, e());
                double d14 = (d1Var2 != null ? d1Var2.f139786b : 0.0d) + d1Var.f139786b;
                sVar.f198299b = zVar2;
                sVar.f198298a = i14;
                sVar.f198302e = 1;
                o13.p pVarI = i(d14, i14);
                if (pVarI != aVar) {
                    zVar = zVar2;
                    obj = pVarI;
                    pVar = (o13.p) obj;
                }
            } else {
                sVar.f198299b = zVar2;
                sVar.f198298a = i14;
                sVar.f198302e = 2;
                o13.p pVarI2 = i(0.0d, i14);
                if (pVarI2 != aVar) {
                    zVar = zVar2;
                    obj = pVarI2;
                    pVar = (o13.p) obj;
                }
            }
            return aVar;
        }
        if (i16 == 1) {
            i14 = sVar.f198298a;
            zVar = sVar.f198299b;
            o13.r.b(obj);
            pVar = (o13.p) obj;
        } else {
            if (i16 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = sVar.f198298a;
            zVar = sVar.f198299b;
            o13.r.b(obj);
            pVar = (o13.p) obj;
        }
        return new vo.e(zVar, p.TIME, i14, pVar, null, 16, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object c(int i14, int i15, x0 x0Var, v13.c cVar) {
        t tVar;
        int i16 = i14;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i17 = tVar.f198306d;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                tVar.f198306d = i17 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object objH = tVar.f198304b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i18 = tVar.f198306d;
        if (i18 == 0) {
            o13.r.b(objH);
            if (i15 == 0) {
                return Unit.INSTANCE;
            }
            d1 d1Var = (d1) ((ArrayList) e()).get(i16);
            double d14 = i15;
            d1 d1Var2 = new d1(null, 0.0d, d1Var.f139787c - d14, 0.0d, 0.0d, x0Var, false, 0.0d, 0.0d, null, null, 1536, null);
            d1Var.f139787c = d14;
            ((ArrayList) e()).add(i16 + 1, d1Var2);
            double d15 = d1Var.f139787c;
            tVar.f198303a = i16;
            tVar.f198306d = 1;
            objH = h(d15, i16);
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i18 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i16 = tVar.f198303a;
            o13.r.b(objH);
        }
        a(i16, (o13.p) objH);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object d(int i14, int i15, x0 x0Var, v13.c cVar) {
        u uVar;
        int i16 = i14;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i17 = uVar.f198310d;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                uVar.f198310d = i17 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objI = uVar.f198308b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i18 = uVar.f198310d;
        if (i18 == 0) {
            o13.r.b(objI);
            if (i15 == 0) {
                return Unit.INSTANCE;
            }
            d1 d1Var = (d1) ((ArrayList) e()).get(i16);
            double d14 = i15;
            d1 d1Var2 = new d1(null, d1Var.f139786b - d14, 0.0d, 0.0d, 0.0d, x0Var, false, 0.0d, 0.0d, null, null, 1536, null);
            d1Var.f139786b = d14;
            ((ArrayList) e()).add(i16 + 1, d1Var2);
            double d15 = d1Var.f139786b;
            uVar.f198307a = i16;
            uVar.f198310d = 1;
            objI = i(d15, i16);
            if (objI == obj) {
                return obj;
            }
        } else {
            if (i18 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i16 = uVar.f198307a;
            o13.r.b(objI);
        }
        a(i16, (o13.p) objI);
        return Unit.INSTANCE;
    }

    public final List<d1> e() {
        ArrayList arrayList = this.f198313c;
        if (arrayList != null) {
            return arrayList;
        }
        p005kotlin.jvm.internal.s.m("legs");
        throw null;
    }

    public final d f() {
        d dVar = this.f198312b;
        if (dVar != null) {
            return dVar;
        }
        p005kotlin.jvm.internal.s.m("reconstructDTO");
        throw null;
    }

    public final vo.e g(int i14, o13.p pVar, p pVar2) {
        x0 x0Var;
        z zVar;
        A a14 = pVar.f128594a;
        B b14 = pVar.f128595b;
        if (a14 == 0) {
            x0Var = ((d1) ((ArrayList) e()).get(i14)).f139790f;
        } else {
            x0Var = null;
            if (b14 == 0) {
                d1 d1Var = (d1) h0.e0(i14 + 1, e());
                if (d1Var != null) {
                    x0Var = d1Var.f139790f;
                }
            }
        }
        x0 x0Var2 = x0Var;
        if (((ArrayList) e()).size() == 2 && x0Var2 != null) {
            zVar = z.LEG_REMOVAL_BLOCKED;
        } else if (pVar.f128594a == 0) {
            zVar = z.CURRENT_LEG_REMOVAL_PENDING;
        } else {
            zVar = (b14 != 0 || i14 == ((ArrayList) e()).size() + (-1)) ? z.NORMAL : z.NEXT_LEG_REMOVAL_PENDING;
        }
        return new vo.e(zVar, pVar2, i14, pVar, x0Var2);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    public final o13.p h(double d14, int i14) {
        d1 d1VarB = d1.b((d1) ((ArrayList) e()).get(i14));
        d1 d1Var = (d1) h0.e0(i14 + 1, e());
        d1 d1VarB2 = d1Var != null ? d1.b(d1Var) : null;
        double d15 = (d1VarB.f139787c + (d1VarB2 != null ? d1VarB2.f139787c : 0.0d)) - d14;
        double d16 = d1VarB.f139786b + (d1VarB2 != null ? d1VarB2.f139786b : 0.0d);
        List<d1> listE = e();
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        for (Object obj : (ArrayList) listE) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                p13.x.q();
                throw null;
            }
            if (i15 < i14) {
                arrayList.add(obj);
            }
            i15 = i16;
        }
        Iterator it = arrayList.iterator();
        double d17 = 0.0d;
        while (it.hasNext()) {
            d17 += ((d1) it.next()).f139787c;
        }
        double dF = oi0.c.F(d17 + d14, this.f198316f, this.f198315e) - oi0.c.F(d17, this.f198316f, this.f198315e);
        d1VarB.f139786b = dF;
        d1VarB.f139787c = d14;
        if (d1VarB2 != null) {
            d1VarB2.f139786b = d16 - dF;
        }
        if (d1VarB2 != null) {
            d1VarB2.f139787c = d15;
        }
        double d18 = d1VarB.f139787c;
        d1VarB.f139788d = d18 / d1VarB.f139786b;
        if (d1VarB2 != null) {
            d1VarB2.f139788d = d1VarB2.f139787c / d1VarB2.f139786b;
        }
        if (d18 == 0.0d) {
            d1VarB = null;
        }
        return new o13.p(d1VarB, (d1VarB2 != null ? d1VarB2.f139787c : 0.0d) < 1.0d ? null : d1VarB2);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final o13.p i(double d14, int i14) {
        double d15;
        d1 d1VarB = d1.b((d1) ((ArrayList) e()).get(i14));
        d1 d1Var = (d1) h0.e0(i14 + 1, e());
        d1 d1VarB2 = d1Var != null ? d1.b(d1Var) : null;
        double d16 = (d1VarB.f139786b + (d1VarB2 != null ? d1VarB2.f139786b : 0.0d)) - d14;
        double d17 = d1VarB.f139787c + (d1VarB2 != null ? d1VarB2.f139787c : 0.0d);
        d1VarB.f139786b = d14;
        if (i14 > 0) {
            d15 = ((d1) ((ArrayList) e()).get(i14 - 1)).f139789e;
        } else {
            d15 = 0.0d;
        }
        double dF = oi0.c.F(d15 + d14, this.f198315e, this.f198316f) - oi0.c.F(d15, this.f198315e, this.f198316f);
        d1VarB.f139787c = dF;
        if (d1VarB2 != null) {
            d1VarB2.f139787c = d17 - dF;
        }
        if (d1VarB2 != null) {
            d1VarB2.f139786b = d16;
        }
        double d18 = d1VarB.f139787c;
        double d19 = d1VarB.f139786b;
        d1VarB.f139788d = d18 / d19;
        if (d1VarB2 != null) {
            d1VarB2.f139788d = d1VarB2.f139787c / d1VarB2.f139786b;
        }
        if (d19 == 0.0d) {
            d1VarB = null;
        }
        return new o13.p(d1VarB, (d1VarB2 != null ? d1VarB2.f139786b : 0.0d) >= 1.0d ? d1VarB2 : null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    public final void j(com.garmin.android.apps.connectmobile.activities.newmodel.a aVar) {
        int iG;
        int iG2;
        Object arrayList;
        Object arrayList2;
        Object arrayList3;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC2;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC3;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG2;
        Object next;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG3;
        Object next2;
        this.f198311a = aVar;
        int iG3 = -1;
        Object obj = null;
        if (aVar == null || (listG3 = aVar.G()) == null) {
            iG = -1;
        } else {
            Iterator<T> it = listG3.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!d53.u.q(((com.garmin.android.apps.connectmobile.activities.newmodel.y) next2).F(), "SUMDURATION", true));
            com.garmin.android.apps.connectmobile.activities.newmodel.y yVar = (com.garmin.android.apps.connectmobile.activities.newmodel.y) next2;
            if (yVar != null) {
                iG = yVar.G();
            } else {
                iG = -1;
            }
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.a aVar2 = this.f198311a;
        if (aVar2 == null || (listG2 = aVar2.G()) == null) {
            iG2 = -1;
        } else {
            Iterator<T> it3 = listG2.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!d53.u.q(((com.garmin.android.apps.connectmobile.activities.newmodel.y) next).F(), "directTimestamp", true));
            com.garmin.android.apps.connectmobile.activities.newmodel.y yVar2 = (com.garmin.android.apps.connectmobile.activities.newmodel.y) next;
            if (yVar2 != null) {
                iG2 = yVar2.G();
            } else {
                iG2 = -1;
            }
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.a aVar3 = this.f198311a;
        if (aVar3 != null && (listG = aVar3.G()) != null) {
            for (Object obj2 : listG) {
                if (d53.u.q(((com.garmin.android.apps.connectmobile.activities.newmodel.y) obj2).F(), "SUMDISTANCE", true)) {
                    obj = obj2;
                    break;
                }
            }
            com.garmin.android.apps.connectmobile.activities.newmodel.y yVar3 = (com.garmin.android.apps.connectmobile.activities.newmodel.y) obj;
            if (yVar3 != null) {
                iG3 = yVar3.G();
            }
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.a aVar4 = this.f198311a;
        if (aVar4 == null || (listC3 = aVar4.C()) == null) {
            arrayList = j0.f134944a;
        } else {
            arrayList = new ArrayList();
            Iterator<T> it4 = listC3.iterator();
            while (it4.hasNext()) {
                List<Double> listC4 = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) it4.next()).C();
                listC4.getClass();
                Double d14 = (Double) h0.e0(iG, listC4);
                if (d14 != null) {
                    arrayList.add(d14);
                }
            }
        }
        this.f198315e = arrayList;
        com.garmin.android.apps.connectmobile.activities.newmodel.a aVar5 = this.f198311a;
        if (aVar5 == null || (listC2 = aVar5.C()) == null) {
            arrayList2 = j0.f134944a;
        } else {
            arrayList2 = new ArrayList();
            Iterator<T> it5 = listC2.iterator();
            while (it5.hasNext()) {
                List<Double> listC5 = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) it5.next()).C();
                listC5.getClass();
                Double d15 = (Double) h0.e0(iG2, listC5);
                if (d15 != null) {
                    arrayList2.add(d15);
                }
            }
        }
        this.f198317g = arrayList2;
        com.garmin.android.apps.connectmobile.activities.newmodel.a aVar6 = this.f198311a;
        if (aVar6 == null || (listC = aVar6.C()) == null) {
            arrayList3 = j0.f134944a;
        } else {
            arrayList3 = new ArrayList();
            Iterator<T> it6 = listC.iterator();
            while (it6.hasNext()) {
                List<Double> listC6 = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) it6.next()).C();
                listC6.getClass();
                Double d16 = (Double) h0.e0(iG3, listC6);
                if (d16 != null) {
                    arrayList3.add(d16);
                }
            }
        }
        this.f198316f = arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(int i14, double d14, v13.c cVar) {
        x xVar;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i15 = xVar.f198326e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                xVar.f198326e = i15 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object objH = xVar.f198324c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = xVar.f198326e;
        if (i16 == 0) {
            o13.r.b(objH);
            xVar.f198322a = i14;
            xVar.f198323b = d14;
            xVar.f198326e = 1;
            objH = h(d14, i14);
            if (objH != obj) {
            }
        }
        if (i16 != 1) {
            if (i16 == 2) {
                o13.r.b(objH);
                return objH;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d14 = xVar.f198323b;
        i14 = xVar.f198322a;
        o13.r.b(objH);
        p pVar = p.DISTANCE;
        xVar.f198322a = i14;
        xVar.f198323b = d14;
        xVar.f198326e = 2;
        Object objG = g(i14, (o13.p) objH, pVar);
        return objG == obj ? obj : objG;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(int i14, double d14, v13.c cVar) {
        y yVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i15 = yVar.f198331e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                yVar.f198331e = i15 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object objI = yVar.f198329c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = yVar.f198331e;
        if (i16 == 0) {
            o13.r.b(objI);
            yVar.f198327a = i14;
            yVar.f198328b = d14;
            yVar.f198331e = 1;
            objI = i(d14, i14);
            if (objI != obj) {
            }
        }
        if (i16 != 1) {
            if (i16 == 2) {
                o13.r.b(objI);
                return objI;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d14 = yVar.f198328b;
        i14 = yVar.f198327a;
        o13.r.b(objI);
        p pVar = p.TIME;
        yVar.f198327a = i14;
        yVar.f198328b = d14;
        yVar.f198331e = 2;
        Object objG = g(i14, (o13.p) objI, pVar);
        return objG == obj ? obj : objG;
    }
}

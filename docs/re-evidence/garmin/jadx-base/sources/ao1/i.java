package ao1;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.v1;
import aq.c2;
import aq.f2;
import b11.v;
import b21.l4;
import b21.o4;
import b63.o;
import b63.u;
import b82.t0;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import d53.w;
import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l11.t;
import lc.m0;
import lc.y;
import o13.p;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;
import p13.l0;
import p3.l1;
import p3.p1;
import q21.q;
import r53.p2;
import s21.a0;
import s21.s;
import u21.a1;
import u21.e0;
import u21.f0;
import u21.h1;
import u21.u0;
import u21.z0;
import wn1.n;
import wn1.r;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11568c;

    public /* synthetic */ i(int i14, Object obj, Object obj2) {
        this.f11566a = i14;
        this.f11567b = obj;
        this.f11568c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x02e6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        Object value;
        d11.i iVar;
        boolean z14;
        boolean z15;
        Object value2;
        d11.i iVar2;
        d11.e eVarA;
        ArrayList arrayList;
        Object value3;
        d11.i iVar3;
        l01.k kVar;
        double dDoubleValue;
        int i14 = this.f11566a;
        int i15 = 0;
        int i16 = 1;
        Object obj = this.f11568c;
        Object obj2 = this.f11567b;
        switch (i14) {
            case 0:
                n nVar = (n) obj2;
                ((p1) obj).setValue(Boolean.TRUE);
                nVar.getClass();
                ge1.b.T(v1.a(nVar), null, null, new r(nVar, null), 3);
                return Unit.INSTANCE;
            case 1:
                c2 c2Var = ((f2) obj2).f11940c;
                c2Var.V0(true);
                c2Var.d5(((f2.g) obj).getBindingAdapterPosition());
                return Unit.INSTANCE;
            case 2:
                ((l) obj2).invoke(Double.valueOf(((l1) obj).getDoubleValue()));
                return Unit.INSTANCE;
            case 3:
                HelpActivity.a aVar = HelpActivity.f36653a;
                ro0.l lVar = ro0.l.BENCHMARK_EXERCISE;
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("EXTRA_BENCHMARKS", new ArrayList<>(((dy1.c) obj).f61537c));
                Unit unit = Unit.INSTANCE;
                HelpActivity.a.e(aVar, (Context) obj2, lVar, null, bundle, 4);
                return Unit.INSTANCE;
            case 4:
                ey1.j jVar = (ey1.j) obj2;
                ge1.b.T(v1.a(jVar), null, null, new ey1.l(jVar, null), 3).J(new ay1.a(jVar, i16));
                ((m0) obj).m();
                return Unit.INSTANCE;
            case 5:
                ((az0.e) obj2).f13694a.unregisterNetworkCallback((az0.d.a) obj);
                return Unit.INSTANCE;
            case 6:
                l4.g gVar = (l4.g) obj;
                y.l((m0) obj2, new l4.j(Long.valueOf(gVar.f14880b), u.Companion.a(u.INSTANCE, gVar.f14881c), gVar.f14884f));
                return Unit.INSTANCE;
            case 7:
                m0 m0Var = (m0) obj;
                p2 p2Var = ((f11.f) obj2).f67921f;
                do {
                    value = p2Var.getValue();
                    iVar = (d11.i) value;
                } while (!p2Var.b(value, d11.i.a(iVar, null, null, null, null, d11.e.a(iVar.f57084f, false, false, false, false, false, false, false, 63), null, false, false, false, false, null, 4063)));
                m0Var.n();
                return Unit.INSTANCE;
            case 8:
                f11.f fVar = (f11.f) obj2;
                Context context = (Context) obj;
                context.getClass();
                p2 p2Var2 = fVar.f67921f;
                d11.i iVar4 = (d11.i) p2Var2.getValue();
                d11.g gVar2 = iVar4.f57080b;
                i53.c<d11.f> cVar = iVar4.f57082d;
                String str = gVar2.f57069a;
                Double d14 = gVar2.f57072d;
                boolean z16 = str == null || w.J(str);
                if (zf.b.D(d14)) {
                    double dDoubleValue2 = d14.doubleValue();
                    if (1.0d > dDoubleValue2 || dDoubleValue2 > 999999.999d) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                } else {
                    z14 = false;
                }
                boolean zIsEmpty = cVar.isEmpty();
                boolean z17 = cVar.size() <= 50;
                if (cVar.isEmpty()) {
                    z15 = true;
                } else {
                    Iterator<d11.f> it = cVar.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z15 = true;
                        } else if (it.next().f57067a.G0() <= 0.0d) {
                            z15 = false;
                        }
                    }
                }
                if (!z16 && z14 && !zIsEmpty && z15 && z17) {
                    p<String, String> pVar = fVar.f67923h;
                    if (pVar == null) {
                        do {
                            value3 = p2Var2.getValue();
                            iVar3 = (d11.i) value3;
                        } while (!p2Var2.b(value3, d11.i.a(iVar3, null, null, null, null, d11.e.a(iVar3.f57084f, false, false, false, false, false, true, false, 95), null, false, false, false, false, null, 4063)));
                    } else {
                        ge1.b.T(v1.a(fVar), null, null, new f11.e(fVar, context, iVar4, pVar.f128595b, pVar.f128594a, null), 3);
                    }
                } else {
                    do {
                        value2 = p2Var2.getValue();
                        iVar2 = (d11.i) value2;
                        eVarA = d11.e.a(iVar2.f57084f, z16, !z14, zIsEmpty, !z17, false, false, false, 112);
                        i53.c<d11.f> cVar2 = iVar2.f57082d;
                        arrayList = new ArrayList(p13.y.r(cVar2, 10));
                        for (d11.f fVar2 : cVar2) {
                            boolean z18 = fVar2.f57067a.G0() <= 0.0d;
                            v vVar = fVar2.f57067a;
                            vVar.getClass();
                            arrayList.add(new d11.f(vVar, z18));
                        }
                    } while (!p2Var2.b(value2, d11.i.a(iVar2, null, null, i53.a.j(arrayList), null, eVarA, null, false, false, false, false, null, 4055)));
                }
                return Unit.INSTANCE;
            case 9:
                l4.l lVar2 = (l4.l) obj2;
                String str2 = lVar2.f14919c;
                i01.i.Companion companion = i01.i.INSTANCE;
                String str3 = lVar2.f14921e;
                companion.getClass();
                return ParametersHolderKt.parametersOf(str2, (t.b.c) obj, i01.i.Companion.a(str3), lVar2.b(), u.Companion.a(u.INSTANCE, lVar2.f14918b), lVar2.f14923g);
            case 10:
                l4.c cVar3 = (l4.c) obj2;
                String str4 = cVar3.f14859c;
                i01.i.Companion companion2 = i01.i.INSTANCE;
                String str5 = cVar3.f14864h;
                companion2.getClass();
                return ParametersHolderKt.parametersOf(str4, (t.b.C2080b) obj, i01.i.Companion.a(str5), cVar3.b(), u.Companion.a(u.INSTANCE, cVar3.f14858b), cVar3.f14866j);
            case 11:
                l4.b bVar = (l4.b) obj2;
                String str6 = bVar.f14847c;
                i01.i.Companion companion3 = i01.i.INSTANCE;
                String str7 = bVar.f14851g;
                companion3.getClass();
                return ParametersHolderKt.parametersOf(str6, (t.b.a) obj, i01.i.Companion.a(str7), bVar.b(), u.Companion.a(u.INSTANCE, bVar.f14846b), bVar.f14853i);
            case 12:
                l4.b bVar2 = (l4.b) obj;
                y.l((m0) obj2, new l4.f(bVar2.f14847c, bVar2.f14853i, u.Companion.a(u.INSTANCE, bVar2.f14846b)));
                return Unit.INSTANCE;
            case 13:
                l4.y yVar = (l4.y) obj2;
                o oVarB = o.Companion.b(o.INSTANCE, yVar.f14992c);
                Boolean boolValueOf = Boolean.valueOf(yVar.f14994e);
                i01.a.Companion companion4 = i01.a.INSTANCE;
                String str8 = yVar.f14991b;
                companion4.getClass();
                return ParametersHolderKt.parametersOf(oVarB, boolValueOf, i01.a.Companion.a(str8), (i53.f) obj);
            case 14:
                ((i21.d) obj2).f87287t.setValue(l0.f134950a);
                ((NutritionActivity.g) obj).invoke();
                return Unit.INSTANCE;
            case 15:
                y.l((m0) obj2, new l4.i(((l4.a) obj).f14831c));
                return Unit.INSTANCE;
            case 16:
                l4.q qVar = (l4.q) obj2;
                List list = (List) obj;
                qVar.getClass();
                o4.a aVar2 = o4.f15095a;
                String str9 = qVar.f14950b;
                aVar2.getClass();
                o4 o4VarA = o4.a.a(str9);
                if (o4VarA == null) {
                    o4VarA = o4.LOG_FOOD;
                }
                return ParametersHolderKt.parametersOf(o4VarA, u.Companion.a(u.INSTANCE, qVar.f14951c), qVar.f14952d, list);
            case 17:
                l4.q qVar2 = (l4.q) obj;
                y.l((m0) obj2, new l4.m(m21.b.C2206b.INSTANCE, u.Companion.a(u.INSTANCE, qVar2.f14951c), qVar2.f14952d.f14339b, qVar2.f14953e));
                return Unit.INSTANCE;
            case 18:
                l4.p pVar2 = (l4.p) obj2;
                pVar2.getClass();
                return ParametersHolderKt.parametersOf(u.Companion.a(u.INSTANCE, pVar2.f14945b), pVar2.f14946c, (List) obj);
            case 19:
                ((i21.d) obj2).Q4(p13.w.c(((u) obj).b()));
                return Unit.INSTANCE;
            case 20:
                x01.b bVar3 = (x01.b) obj;
                if (!((m0) obj2).n()) {
                    bVar3.invoke();
                }
                return Unit.INSTANCE;
            case 21:
                l4.u uVar = (l4.u) obj;
                return ParametersHolderKt.parametersOf(((q) obj2).f142280c, uVar.f14972c, uVar.f14971b);
            case 22:
                l4.s sVar = (l4.s) obj;
                b63.v.Companion companion5 = b63.v.INSTANCE;
                return ParametersHolderKt.parametersOf((String) obj2, b63.v.Companion.c(companion5, sVar.f14964d), b63.v.Companion.c(companion5, sVar.f14965e));
            case 23:
                Integer num = ((e0) ((p1) obj).getF182175a()).f167938a;
                p2 p2Var3 = ((f0) obj2).f167954c;
                p2Var3.k(null, e0.a((e0) p2Var3.getValue(), num, false, false, true, 4));
                return Unit.INSTANCE;
            case 24:
                u0 u0Var = (u0) obj2;
                s21.y yVar2 = ((a0) ((p1) obj).getF182175a()).A;
                int i17 = yVar2 == null ? -1 : u0.b.f168167b[yVar2.ordinal()];
                if (i17 == 1) {
                    ge1.b.T(v1.a(u0Var), null, null, new a1(u0Var, null), 3);
                } else if (i17 == 2 && (kVar = u0Var.f168162m) != null) {
                    ge1.b.T(v1.a(u0Var), null, null, new z0(u0Var, kVar, null), 3);
                }
                u0Var.u1();
                return Unit.INSTANCE;
            case 25:
                a0 a0Var = (a0) obj2;
                s sVar2 = (s) obj;
                boolean z19 = a0Var.f156039d;
                Double d15 = a0Var.f156046k;
                int iDoubleValue = d15 != null ? (int) d15.doubleValue() : 0;
                Double d16 = a0Var.f156047l;
                if (d16 == null) {
                    if (d15 != null) {
                        dDoubleValue = d15.doubleValue();
                    }
                    return ParametersHolderKt.parametersOf(new h1(z19, sVar2, iDoubleValue, i15, a0Var.f156049n, a0Var.f156052q, a0Var.f156050o, a0Var.f156051p, a0Var.f156054s, a0Var.f156055t, a0Var.f156056u, a0Var.f156048m));
                }
                dDoubleValue = d16.doubleValue();
                i15 = (int) dDoubleValue;
                return ParametersHolderKt.parametersOf(new h1(z19, sVar2, iDoubleValue, i15, a0Var.f156049n, a0Var.f156052q, a0Var.f156050o, a0Var.f156051p, a0Var.f156054s, a0Var.f156055t, a0Var.f156056u, a0Var.f156048m));
            case 26:
                tz.a aVar3 = (tz.a) obj2;
                e50.f fVar3 = (e50.f) obj;
                aVar3.f167285b.s(fVar3.f63005c);
                qz.a.b(aVar3, fVar3.f63003a, null, 6);
                return Unit.INSTANCE;
            case 27:
                CourseDetailsActivity courseDetailsActivity = (CourseDetailsActivity) obj2;
                CourseDetailsActivity.a aVar4 = CourseDetailsActivity.f33024k;
                b50.p pVarIa = courseDetailsActivity.ia();
                pVarIa.getClass();
                pVarIa.z4(new e50.b.l((fn0.a) obj));
                b50.p pVarIa2 = courseDetailsActivity.ia();
                pVarIa2.getClass();
                pVarIa2.z4(e50.b.a.f62947a);
                return Unit.INSTANCE;
            case 28:
                t0 t0Var = t0.f16792a;
                ((e23.p) obj2).invoke("", Boolean.FALSE);
                ((m4.q) obj).y(false);
                return Unit.INSTANCE;
            default:
                ((p1) obj).setValue((bb0.c) obj2);
                return Unit.INSTANCE;
        }
    }
}

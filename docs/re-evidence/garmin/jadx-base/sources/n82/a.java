package n82;

import b63.o;
import c2.x2;
import e23.p;
import h4.r;
import i3.ve;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kv1.y;
import lc.m0;
import m4.b0;
import na0.s;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.t0;
import p13.x;
import p3.c2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124945a;

    public /* synthetic */ a(int i14) {
        this.f124945a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        switch (this.f124945a) {
            case 0:
                b bVar = (b) obj2;
                b.a aVar = b.f124946f;
                ((d4.n) obj).getClass();
                bVar.getClass();
                o82.g gVarA = bVar.a();
                c2 c2Var = bVar.f124949b;
                return x.k(gVarA, Long.valueOf(((o82.a) c2Var.getF182175a()).f130843a.f16206a.toEpochDay()), Long.valueOf(((o82.a) c2Var.getF182175a()).f130844b.f16206a.toEpochDay()));
            case 1:
                Map map = (Map) obj2;
                ((d4.n) obj).getClass();
                map.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(t0.a(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(((o82.g) entry.getKey()).name(), entry.getValue());
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(t0.a(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry2.getKey(), Long.valueOf(((o) entry2.getValue()).f16206a.toEpochDay()));
                }
                return linkedHashMap2;
            case 2:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = s.f125195a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    na0.j.f125129e.getClass();
                    na0.i iVar = new na0.i(na0.j.f125130f, 2111, true, true);
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        ArrayList arrayList = new ArrayList(5);
                        for (int i14 = 0; i14 < 5; i14++) {
                            obj3 = objQ;
                            arrayList.add(new b0());
                        }
                        obj3 = objQ;
                        mVar.K(arrayList);
                        obj3 = arrayList;
                    }
                    obj3 = objQ;
                    List list = (List) obj3;
                    Object objQ2 = mVar.q();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    Object obj4 = objQ2;
                    if (objQ2 == c2565a) {
                        a aVar2 = new a(4);
                        mVar.K(aVar2);
                        obj4 = aVar2;
                    }
                    p pVar = (p) obj4;
                    Object objQ3 = mVar.q();
                    Object obj5 = objQ3;
                    if (objQ3 == c2565a) {
                        n61.h hVar = new n61.h(17);
                        mVar.K(hVar);
                        obj5 = hVar;
                    }
                    e23.a aVar3 = (e23.a) obj5;
                    Object objQ4 = mVar.q();
                    Object obj6 = objQ4;
                    if (objQ4 == c2565a) {
                        n61.h hVar2 = new n61.h(18);
                        mVar.K(hVar2);
                        obj6 = hVar2;
                    }
                    na0.h.a(iVar, false, list, pVar, aVar3, (e23.a) obj6, mVar, 224304);
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = s.f125195a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    ve.a(x2.d(r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar2), 0L, 0.0f, 0.0f, null, s.f125197c, mVar2, 12582918, 122);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj).intValue();
                s sVar3 = s.f125195a;
                ((String) obj2).getClass();
                return Unit.INSTANCE;
            case 5:
                return ((m0) obj2).s();
            case 6:
                Scope scope = (Scope) obj;
                no1.d dVar = no1.d.f126723a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var = s0.f105811a;
                return new oo1.a((f12.l) scope.get((k23.d<?>) t0Var.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (no1.b) scope.get((k23.d<?>) t0Var.b(no1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 7:
                no1.d dVar2 = no1.d.f126723a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (eo1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, eo1.a.class, new c83.h.a[0], null, null, null, 120);
            case 8:
                Scope scope2 = (Scope) obj;
                no1.d dVar3 = no1.d.f126723a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var2 = s0.f105811a;
                return new qo1.c((eo1.a) scope2.get((k23.d<?>) t0Var2.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope2.get((k23.d<?>) t0Var2.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (oo1.a) scope2.get((k23.d<?>) t0Var2.b(oo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 9:
                Scope scope3 = (Scope) obj;
                no1.d dVar4 = no1.d.f126723a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new a22.i((eo1.a) scope3.get((k23.d<?>) s0.f105811a.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 10:
                Scope scope4 = (Scope) obj;
                no1.d dVar5 = no1.d.f126723a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                return new l22.a(ModuleExtKt.androidContext(scope4));
            case 11:
                Scope scope5 = (Scope) obj;
                no1.d dVar6 = no1.d.f126723a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return new do1.o((l22.b) scope5.get((k23.d<?>) s0.f105811a.b(l22.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 12:
                nu1.a aVar4 = nu1.a.f127915a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (ru1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC_WEB_URL, ru1.a.class, new c83.h.a[0], null, null, null, 120);
            case 13:
                Scope scope6 = (Scope) obj;
                nu1.a aVar5 = nu1.a.f127915a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var3 = s0.f105811a;
                return new ru1.e((ru1.a) scope6.get((k23.d<?>) t0Var3.b(ru1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope6.get((k23.d<?>) t0Var3.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 14:
                Scope scope7 = (Scope) obj;
                nu1.a aVar6 = nu1.a.f127915a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                return new ru1.c((ru1.a) scope7.get((k23.d<?>) s0.f105811a.b(ru1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 15:
                Scope scope8 = (Scope) obj;
                nu1.a aVar7 = nu1.a.f127915a;
                scope8.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var4 = s0.f105811a;
                return new ou1.d((ru1.b) scope8.get((k23.d<?>) t0Var4.b(ru1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ru1.d) scope8.get((k23.d<?>) t0Var4.b(ru1.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 16:
                Scope scope9 = (Scope) obj;
                nu1.c cVar = nu1.c.f127918a;
                scope9.getClass();
                ((ParametersHolder) obj2).getClass();
                return new pi0.e(ModuleExtKt.androidContext(scope9));
            case 17:
                Scope scope10 = (Scope) obj;
                nu1.c cVar2 = nu1.c.f127918a;
                scope10.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var5 = s0.f105811a;
                return new ox1.c((l22.b) scope10.get((k23.d<?>) t0Var5.b(l22.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pi0.e) scope10.get((k23.d<?>) t0Var5.b(pi0.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 18:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                nu1.c cVar3 = nu1.c.f127918a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new lu1.d((mu1.a) parametersHolder.elementAt(0, s0.f105811a.b(mu1.a.class)));
            case 19:
                Scope scope11 = (Scope) obj;
                nu1.c cVar4 = nu1.c.f127918a;
                scope11.getClass();
                ((ParametersHolder) obj2).getClass();
                return new nx1.l((y) scope11.get((k23.d<?>) s0.f105811a.b(y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 20:
                Scope scope12 = (Scope) obj;
                nu1.c cVar5 = nu1.c.f127918a;
                scope12.getClass();
                ((ParametersHolder) obj2).getClass();
                return new nx1.j((uw1.b) scope12.get((k23.d<?>) s0.f105811a.b(uw1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 21:
                Scope scope13 = (Scope) obj;
                nu1.c cVar6 = nu1.c.f127918a;
                scope13.getClass();
                ((ParametersHolder) obj2).getClass();
                return new nx1.c((uw1.b) scope13.get((k23.d<?>) s0.f105811a.b(uw1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 22:
                Scope scope14 = (Scope) obj;
                nu1.c cVar7 = nu1.c.f127918a;
                scope14.getClass();
                ((ParametersHolder) obj2).getClass();
                return new nx1.o((uw1.b) scope14.get((k23.d<?>) s0.f105811a.b(uw1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 23:
                Scope scope15 = (Scope) obj;
                nu1.c cVar8 = nu1.c.f127918a;
                scope15.getClass();
                ((ParametersHolder) obj2).getClass();
                return new nx1.h((uw1.b) scope15.get((k23.d<?>) s0.f105811a.b(uw1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 24:
                Scope scope16 = (Scope) obj;
                nu1.c cVar9 = nu1.c.f127918a;
                scope16.getClass();
                ((ParametersHolder) obj2).getClass();
                return new nx1.f((kv1.b) scope16.get((k23.d<?>) s0.f105811a.b(kv1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 25:
                Scope scope17 = (Scope) obj;
                nu1.c cVar10 = nu1.c.f127918a;
                scope17.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var6 = s0.f105811a;
                return new st1.a((gu1.b) scope17.get((k23.d<?>) t0Var6.b(gu1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (uw1.b) scope17.get((k23.d<?>) t0Var6.b(uw1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope17.get((k23.d<?>) t0Var6.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 26:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                nu1.c cVar11 = nu1.c.f127918a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new mu1.a((j70.d) parametersHolder2.elementAt(0, s0.f105811a.b(j70.d.class)));
            case 27:
                Scope scope18 = (Scope) obj;
                nu1.c cVar12 = nu1.c.f127918a;
                scope18.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var7 = s0.f105811a;
                return new st1.c((uw1.b) scope18.get((k23.d<?>) t0Var7.b(uw1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (gu1.b) scope18.get((k23.d<?>) t0Var7.b(gu1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope18.get((k23.d<?>) t0Var7.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 28:
                nu1.c cVar13 = nu1.c.f127918a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new nx1.p();
            default:
                Scope scope19 = (Scope) obj;
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                nu1.c cVar14 = nu1.c.f127918a;
                scope19.getClass();
                parametersHolder3.getClass();
                p005kotlin.jvm.internal.t0 t0Var8 = s0.f105811a;
                return new ey1.j(((Number) parametersHolder3.elementAt(0, t0Var8.b(Long.class))).longValue(), ModuleExtKt.androidContext(scope19), (nx1.j) scope19.get((k23.d<?>) t0Var8.b(nx1.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (nx1.h) scope19.get((k23.d<?>) t0Var8.b(nx1.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (nx1.f) scope19.get((k23.d<?>) t0Var8.b(nx1.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (st1.a) scope19.get((k23.d<?>) t0Var8.b(st1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (st1.c) scope19.get((k23.d<?>) t0Var8.b(st1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (nx1.c) scope19.get((k23.d<?>) t0Var8.b(nx1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (nx1.o) scope19.get((k23.d<?>) t0Var8.b(nx1.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (nx1.l) scope19.get((k23.d<?>) t0Var8.b(nx1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (nx1.p) scope19.get((k23.d<?>) t0Var8.b(nx1.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope19.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ox1.c) scope19.get((k23.d<?>) t0Var8.b(ox1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hg0.b) scope19.get((k23.d<?>) t0Var8.b(hg0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (iy1.c) scope19.get((k23.d<?>) t0Var8.b(iy1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ou1.g) scope19.get((k23.d<?>) t0Var8.b(ou1.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
        }
    }
}

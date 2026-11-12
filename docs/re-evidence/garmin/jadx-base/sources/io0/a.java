package io0;

import e2.f0;
import e23.l;
import f4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m92.c0;
import m92.e0;
import m92.h0;
import m92.m;
import o4.u1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p13.j0;
import p3.c2;
import p3.x3;
import q4.f;
import s1.j;
import t70.g0;
import t70.i;
import t70.i0;
import t70.l0;
import t70.q;
import xd2.m0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f94586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f94587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f94588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f94589e;

    public /* synthetic */ a(float f14, o0 o0Var, p008y1.a aVar, o0 o0Var2) {
        this.f94585a = 3;
        this.f94586b = f14;
        this.f94587c = o0Var;
        this.f94588d = aVar;
        this.f94589e = o0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f94585a;
        float f14 = this.f94586b;
        Object obj2 = this.f94589e;
        Object obj3 = this.f94588d;
        Object obj4 = this.f94587c;
        switch (i14) {
            case 0:
                i53.d dVar = (i53.d) obj3;
                go0.e.a aVar = (go0.e.a) obj2;
                f fVar = (f) obj;
                fVar.getClass();
                u1.f129010b.getClass();
                m.b bVar = new m.b((List) obj4, u1.f129011c, null);
                ArrayList arrayList = new ArrayList(dVar.size());
                Iterator it = dVar.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    arrayList.add(new h0.e.a(((Number) entry.getKey()).floatValue(), ((Number) entry.getValue()).floatValue()));
                }
                return c0.e(fVar, this.f94586b, bVar, false, 0.0f, null, null, arrayList, null, Float.valueOf(aVar.f78194f), Float.valueOf(aVar.f78195g), Float.valueOf(aVar.f78196h), Float.valueOf(aVar.f78197i), e0.CUBIC_BEZIER, false, null, 24764);
            case 1:
                x3 x3Var = (x3) obj4;
                j02.h0 h0Var = (j02.h0) obj3;
                q qVar = (q) obj2;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                t70.a.f162801a.getClass();
                f0.b(f0Var, null, t70.a.f162802b, 3);
                List list = (List) x3Var.getF182175a();
                if (list == null) {
                    list = j0.f134944a;
                }
                List list2 = list;
                f0Var.a(list2.size(), new i.e(new t52.c(1), list2), new i.f(i.d.f162871a, list2), new z3.e(802480018, true, new i.g(list2, h0Var, qVar, x3Var, this.f94586b)));
                return Unit.INSTANCE;
            case 2:
                x3 x3Var2 = (x3) obj4;
                j02.h0 h0Var2 = (j02.h0) obj3;
                l0 l0Var = (l0) obj2;
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                t70.b.f162807a.getClass();
                f0.b(f0Var2, null, t70.b.f162808b, 3);
                List list3 = (List) x3Var2.getF182175a();
                if (list3 == null) {
                    list3 = j0.f134944a;
                }
                List list4 = list3;
                f0Var2.a(list4.size(), new g0(new t52.c(2), list4), new t70.h0(t70.f0.f162848a, list4), new z3.e(802480018, true, new i0(list4, h0Var2, l0Var, x3Var2, this.f94586b)));
                return Unit.INSTANCE;
            case 3:
                o0 o0Var = (o0) obj4;
                p008y1.a aVar2 = (p008y1.a) obj3;
                o0 o0Var2 = (o0) obj2;
                j jVar = (j) obj;
                c2 c2Var = jVar.f155607e;
                if ((((Number) c2Var.getF182175a()).floatValue() >= f14 || o0Var.f105806a <= f14) && (((Number) c2Var.getF182175a()).floatValue() <= f14 || o0Var.f105806a >= f14)) {
                    aVar2.a(((Number) c2Var.getF182175a()).floatValue(), ((Number) jVar.b()).floatValue());
                    o0Var2.f105806a = ((Number) jVar.b()).floatValue();
                    o0Var.f105806a = ((Number) c2Var.getF182175a()).floatValue();
                } else {
                    float fFloatValue = ((Number) c2Var.getF182175a()).floatValue();
                    m0 m0Var = p008y1.e.f193170a;
                    if (f14 == 0.0f) {
                        f14 = 0.0f;
                    } else if (f14 <= 0.0f ? fFloatValue >= f14 : fFloatValue <= f14) {
                        f14 = fFloatValue;
                    }
                    aVar2.a(f14, ((Number) jVar.b()).floatValue());
                    o0Var2.f105806a = Float.isNaN(((Number) jVar.b()).floatValue()) ? 0.0f : ((Number) jVar.b()).floatValue();
                    o0Var.f105806a = f14;
                    jVar.a();
                }
                return Unit.INSTANCE;
            default:
                w13.a aVar3 = (w13.a) obj4;
                f2.j0 j0Var = (f2.j0) obj;
                j0Var.getClass();
                j0Var.g(aVar3.size(), null, null, new y12.d(aVar3), new z3.e(-1942245546, true, new y12.e(aVar3, (s) obj3, (l) obj2, f14)));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(float f14, int i14, Object obj, Object obj2, Object obj3) {
        this.f94585a = i14;
        this.f94587c = obj;
        this.f94588d = obj2;
        this.f94589e = obj3;
        this.f94586b = f14;
    }
}

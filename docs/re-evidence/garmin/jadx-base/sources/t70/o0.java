package t70;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditInFocusViewModel$save$1", f = "EditInFocusViewModel.kt", l = {163, TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", v = 2)
public final class o0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f162938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f162939b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(l0 l0Var, t13.d<? super o0> dVar) {
        super(2, dVar);
        this.f162939b = l0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o0(this.f162939b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0179, code lost:
    
        if (r1.emit(r0, r18) == r8) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        Object objV0;
        Object obj2;
        g3 g3VarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f162938a;
        l0 l0Var = this.f162939b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                objV0 = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            l0Var.f162910g.k(null, Boolean.FALSE);
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        l0Var.f162910g.k(null, Boolean.TRUE);
        List<o70.r> listA4 = l0Var.A4();
        ArrayList arrayList2 = new ArrayList(p13.y.r(listA4, 10));
        Iterator it = listA4.iterator();
        while (it.hasNext()) {
            arrayList2.add(new j70.b(((o70.r) it.next()).getF130049a()));
        }
        w13.c cVar = o70.c.f129940l;
        int i15 = 0;
        cVar.getClass();
        Object[] objArrD = p005kotlin.jvm.internal.i.d(cVar, new o70.c[0]);
        ArrayList arrayList3 = new ArrayList(objArrD.length);
        for (Object obj3 : objArrD) {
            arrayList3.add(((o70.c) obj3).f129941a);
        }
        ArrayList arrayList4 = l0Var.f162918o;
        if (arrayList4 != null) {
            arrayList = new ArrayList();
            for (Object obj4 : arrayList4) {
                if (arrayList3.contains(((o70.r) obj4).getF130049a())) {
                    arrayList.add(obj4);
                }
            }
        } else {
            arrayList = p13.j0.f134944a;
        }
        List<o70.r> listA5 = l0Var.A4();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : listA5) {
            if (arrayList3.contains(((o70.r) obj5).getF130049a())) {
                arrayList5.add(obj5);
            }
        }
        List<o70.r> listZ0 = p13.h0.z0(arrayList5, p13.h0.g1((Iterable) arrayList));
        ArrayList arrayList6 = new ArrayList();
        for (o70.r rVar : listZ0) {
            w13.c cVar2 = o70.c.f129940l;
            cVar2.getClass();
            Object[] objArrD2 = p005kotlin.jvm.internal.i.d(cVar2, new o70.c[i15]);
            int length = objArrD2.length;
            int i16 = i15;
            while (true) {
                if (i16 >= length) {
                    obj2 = null;
                    break;
                }
                obj2 = objArrD2[i16];
                if (p005kotlin.jvm.internal.s.g(rVar.getF130049a(), ((o70.c) obj2).f129941a)) {
                    break;
                }
                i16++;
            }
            o70.c cVar3 = (o70.c) obj2;
            if (cVar3 != null) {
                arrayList6.add(cVar3);
            }
            i15 = 0;
        }
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            ge1.b.T(v1.a(l0Var), null, null, new n0(l0Var, (o70.c) it3.next(), null), 3);
        }
        l70.c cVar4 = l0Var.f162904a;
        this.f162938a = 1;
        objV0 = l70.c.V0(cVar4, arrayList2, null, null, null, null, this, 30);
        if (objV0 != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) objV0;
        if (v2Var instanceof v2.b) {
            g3.a aVar2 = g3.f35298f;
            Unit unit = Unit.INSTANCE;
            aVar2.getClass();
            g3VarA = g3.a.d(unit);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
        }
        e2 e2Var = l0Var.f162908e;
        this.f162938a = 2;
    }
}

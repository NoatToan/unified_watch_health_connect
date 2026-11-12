package ug2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewKt$MainView$4$1", f = "MainView.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f170777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f170778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3<vg2.a> f170779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x3<yg2.g> f170780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yg2.h f170781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x3<List<vf2.e>> f170782g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(lc.m0 m0Var, r0 r0Var, x3<? extends vg2.a> x3Var, x3<yg2.g> x3Var2, yg2.h hVar, x3<? extends List<vf2.e>> x3Var3, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f170777b = m0Var;
        this.f170778c = r0Var;
        this.f170779d = x3Var;
        this.f170780e = x3Var2;
        this.f170781f = hVar;
        this.f170782g = x3Var3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g0 g0Var = new g0(this.f170777b, this.f170778c, this.f170779d, this.f170780e, this.f170781f, this.f170782g, dVar);
        g0Var.f170776a = obj;
        return g0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ce  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List listB1;
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        vg2.a f182175a = this.f170779d.getF182175a();
        if (f182175a != null) {
            boolean zEquals = f182175a.equals(vg2.a.c.INSTANCE);
            lc.m0 m0Var = this.f170777b;
            r0 r0Var = this.f170778c;
            if (zEquals) {
                yg2.g f182175a2 = this.f170780e.getF182175a();
                yg2.h hVar = this.f170781f;
                if (f182175a2 != null) {
                    hVar.getClass();
                    int i14 = f182175a2.f196985b;
                    hVar.f197014x = i14;
                    float f14 = f182175a2.f196986c;
                    hVar.f197015y = f14;
                    hVar.f197004l.setValue(String.valueOf(i14));
                    hVar.f197005m.setValue(String.valueOf(f14));
                    hVar.f197006n.k(null, Boolean.valueOf(f182175a2.f196988e == -1));
                    p2 p2Var = hVar.f197007o;
                    Boolean bool = Boolean.FALSE;
                    p2Var.k(null, bool);
                    hVar.f197008p.k(null, bool);
                    hVar.f197011t = false;
                    hVar.f197012v = false;
                    hVar.f197010r = true;
                    hVar.f197013w = f182175a2.f196984a;
                    List<vf2.c> list = f182175a2.f196989f;
                    p2 p2Var2 = hVar.f196998f;
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        for (vf2.c cVar : list) {
                            Iterator it = ((Iterable) hVar.f197002j.getValue()).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                vf2.e eVar = (vf2.e) next;
                                if (p005kotlin.jvm.internal.s.g(eVar.f177930b, cVar.f177924b) && p005kotlin.jvm.internal.s.g(eVar.f177933e, cVar.f177923a)) {
                                    break;
                                }
                            }
                            vf2.e eVar2 = (vf2.e) next;
                            if (eVar2 != null) {
                                arrayList.add(eVar2);
                            }
                        }
                        listB1 = p13.h0.b1(p13.h0.f1(arrayList));
                        if (listB1 == null) {
                            listB1 = p13.j0.f134944a;
                        }
                    } else {
                        listB1 = p13.j0.f134944a;
                    }
                    p2Var2.setValue(listB1);
                    hVar.f196996d.setValue(p13.h0.d0((List) p2Var2.getValue()));
                } else {
                    zg2.c.f204692a.getClass();
                    zg2.c.b("MainView", "navigationDestination is LiveActivityRouting.EditWorkout but missing exerciseEditData.");
                }
                List<vf2.e> f182175a3 = this.f170782g.getF182175a();
                hVar.getClass();
                f182175a3.getClass();
                p2 p2Var3 = hVar.f197000h;
                ArrayList arrayListD1 = p13.h0.d1((Collection) p2Var3.getValue());
                arrayListD1.addAll(f182175a3);
                p2Var3.setValue(p13.h0.T(i53.a.e(arrayListD1)));
                lc.y.l(m0Var, f182175a);
                r0Var.f170931h.setValue(null);
            } else {
                lc.y.l(m0Var, f182175a);
                r0Var.f170931h.setValue(null);
            }
        }
        return Unit.INSTANCE;
    }
}

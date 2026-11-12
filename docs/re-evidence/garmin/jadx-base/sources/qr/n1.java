package qr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lps/y1;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityTypedSplits$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n1 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends ps.y1>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f146354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146355b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(t tVar, t13.d<? super n1> dVar) {
        super(2, dVar);
        this.f146355b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n1 n1Var = new n1(this.f146355b, dVar);
        n1Var.f146354a = obj;
        return n1Var;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends ps.y1> v2Var, t13.d<? super Unit> dVar) {
        return ((n1) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ps.x1 x1Var;
        Object next;
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146354a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ArrayList arrayList = null;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            ps.y1 y1Var = (ps.y1) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            List<ps.x1> listD = y1Var.d();
            List listN0 = listD != null ? p13.h0.N0(listD, new a61.c(new q51.a(20), 17)) : null;
            int i14 = t.A2;
            t tVar = this.f146355b;
            if (tVar.U4().getValue().g() != null) {
                List<ps.x0> listG = tVar.U4().getValue().g();
                ArrayList<ps.x0> arrayList2 = listG != null ? new ArrayList(listG) : null;
                if (arrayList2 != null) {
                    for (ps.x0 x0Var : arrayList2) {
                        if (x0Var.S0() == null) {
                            if (listN0 != null) {
                                Iterator it = listN0.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    List<Integer> listP0 = ((ps.x1) next).p0();
                                    if (listP0 != null && listP0.contains(new Integer(x0Var.getLapIndex() - 1))) {
                                        break;
                                    }
                                }
                                x1Var = (ps.x1) next;
                            } else {
                                x1Var = null;
                            }
                            if (x1Var != null) {
                                arrayList2.set(x0Var.getLapIndex() - 1, ps.x0.b(x0Var, null, x1Var.getInternalType(), -1, 524271));
                            }
                        }
                    }
                }
                tVar.U4().setValue(ps.p.b(tVar.U4().getValue(), y1Var.getActivityId(), null, arrayList2, listN0, 10));
            } else {
                r53.z1<ps.p> z1VarU4 = tVar.U4();
                ps.p value = tVar.U4().getValue();
                long activityId = y1Var.getActivityId();
                if (listN0 != null) {
                    ArrayList arrayList3 = new ArrayList(p13.y.r(listN0, 10));
                    Iterator it3 = listN0.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(ss.m.a((ps.x1) it3.next()));
                    }
                    arrayList = new ArrayList(arrayList3);
                }
                z1VarU4.setValue(ps.p.b(value, activityId, null, arrayList, listN0, 10));
            }
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error fetching typed splits: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
        }
        return Unit.INSTANCE;
    }
}

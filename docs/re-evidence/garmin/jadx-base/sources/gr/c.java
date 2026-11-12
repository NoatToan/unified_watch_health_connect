package gr;

import am.x0;
import am.z0;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import o13.q;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.y;
import r53.p2;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.activities.viewmodel.ActivityTypesViewModel$getRecentActivityTypes$1", f = "ActivityTypesViewModel.kt", l = {75}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f78531b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, d<? super c> dVar) {
        super(2, dVar);
        this.f78531b = bVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new c(this.f78531b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objK0;
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f78530a;
        b bVar = this.f78531b;
        if (i14 == 0) {
            r.b(obj);
            am.d dVar = (am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null);
            Long l14 = ((a) bVar.f78524a.getValue()).f78522i;
            Integer num = new Integer(10);
            this.f78530a = 1;
            objK0 = dVar.k0(l14, num, this);
            if (objK0 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objK0 = ((q) obj).f128597a;
        }
        j0 j0Var = j0.f134944a;
        int i15 = q.f128596b;
        if (objK0 instanceof q.b) {
            objK0 = j0Var;
        }
        Iterable iterable = (Iterable) objK0;
        ArrayList arrayList = new ArrayList(y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(z0.l(x0.f4346x, ((zf2.d) it.next()).f204629a));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((a) bVar.f78524a.getValue()).f78523j.contains((x0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        p2 p2Var = bVar.f78524a;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, a.a((a) value, h0.S0(arrayList2, 5), null, 0, false, false, null, 1021)));
        return Unit.INSTANCE;
    }
}

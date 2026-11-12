package ds0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.jet_lag.presentation.JetLagViewModel$fetchTrips$1", f = "JetLagViewModel.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f61086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f61087b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f61087b = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f61087b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f61086a;
        o oVar = this.f61087b;
        if (i14 == 0) {
            r.b(obj);
            oVar.f61089b.j(g3.a.c(g3.f35298f));
            zr0.a aVar2 = oVar.f61088a;
            this.f61086a = 1;
            obj = aVar2.f(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            T t7 = ((v2.b) v2Var).f47386a;
            yr0.o oVar2 = (yr0.o) h0.d0((List) t7);
            yr0.f fVar = oVar2 != null ? oVar2.f199041f : null;
            y0<g3<List<yr0.o>>> y0Var = oVar.f61089b;
            g3.a aVar3 = g3.f35298f;
            Iterable iterable = (Iterable) t7;
            ArrayList arrayList = new ArrayList(y.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(yr0.o.b((yr0.o) it.next(), fVar));
            }
            aVar3.getClass();
            y0Var.j(g3.a.d(arrayList));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar4 = (v2.a) v2Var;
            Integer num = aVar4.f47384b;
            if (num != null && num.intValue() == 404) {
                z.h(g3.f35298f, null, oVar.f61089b);
            } else {
                oVar.f61089b.j(g3.a.a(g3.f35298f, aVar4.f47385c, null, null, null, 14));
            }
        }
        return Unit.INSTANCE;
    }
}

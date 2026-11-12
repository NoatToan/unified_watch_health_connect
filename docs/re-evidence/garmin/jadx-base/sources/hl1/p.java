package hl1;

import am.x0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.SelectActivityViewModel$fetchNoGpsActivityTypes$1", f = "SelectActivityViewModel.kt", l = {124}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f84452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f84453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f84454c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f84454c = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f84454c, dVar);
        pVar.f84453b = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f84453b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f84452a;
        n nVar = this.f84454c;
        if (i14 == 0) {
            o13.r.b(obj);
            y51.a aVar2 = nVar.f84423i;
            this.f84453b = b0Var;
            this.f84452a = 1;
            obj = aVar2.d(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
            ArrayList arrayList = new ArrayList(y.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((x0) it.next()).f4358a);
            }
            nVar.f84428n = h0.g1(arrayList);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.RECORD_ACTIVITY;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to fetch no GPS data activity types: ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SelectActivityViewModel", strD);
        }
        return Unit.INSTANCE;
    }
}

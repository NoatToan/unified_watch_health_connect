package uy0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$e;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetSafetyAndTrackingItemsUseCase$invoke$2", f = "GetSafetyAndTrackingItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p0 extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f173278a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, t13.d<? super p0> dVar) {
        super(2, dVar);
        this.f173278a = q0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p0(this.f173278a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b.e>> dVar) {
        return ((p0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ty0.b[] bVarArr = ty0.b.V1.f166941g;
        if (bVarArr == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayListL0 = p13.u.l0(bVarArr);
        q0 q0Var = this.f173278a;
        com.garmin.android.apps.connectmobile.b1 b1Var = q0Var.f173282a;
        com.garmin.android.apps.connectmobile.b1 b1Var2 = q0Var.f173282a;
        boolean zK = b1Var.K();
        if (!b1Var2.a0() || zK) {
            arrayListL0.remove(ty0.b.f166905p1);
        }
        if (!zK) {
            arrayListL0.remove(ty0.b.f166902o1);
        }
        if (!b1Var2.r0()) {
            arrayListL0.remove(ty0.b.f166908q1);
            arrayListL0.remove(ty0.b.f166911r1);
        } else if (q0Var.f173283b.invoke().booleanValue()) {
            arrayListL0.remove(ty0.b.f166908q1);
        } else {
            arrayListL0.remove(ty0.b.f166911r1);
        }
        if (!b1Var2.x0()) {
            arrayListL0.remove(ty0.b.f166913s1);
        }
        if (!b1Var2.E0()) {
            arrayListL0.remove(ty0.b.f166916t1);
        }
        List listA = ty0.c.a(arrayListL0);
        ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.garmin.android.apps.connectmobile.navigation.more.b.e(q0Var.f173285d, (ty0.b) it.next(), null, false, 12, null));
        }
        return arrayList;
    }
}

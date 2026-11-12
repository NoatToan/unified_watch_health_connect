package uy0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$e;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetHealthItemsUseCase$invoke$2", f = "GetHealthItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ty0.b f173286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f173287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<String> f173288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ty0.b bVar, s sVar, List<String> list, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f173286a = bVar;
        this.f173287b = sVar;
        this.f173288c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f173286a, this.f173287b, this.f173288c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b.e>> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ty0.b[] bVarArr = this.f173286a.f166941g;
        if (bVarArr == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayListL0 = p13.u.l0(bVarArr);
        s sVar = this.f173287b;
        com.garmin.android.apps.connectmobile.b1 b1Var = sVar.f173295a;
        com.garmin.android.apps.connectmobile.b1 b1Var2 = sVar.f173295a;
        if (!b1Var.F0()) {
            arrayListL0.remove(ty0.b.S0);
        }
        if (!b1Var2.e0()) {
            arrayListL0.remove(ty0.b.V0);
            arrayListL0.remove(ty0.b.W0);
        }
        if (!b1Var2.M0()) {
            arrayListL0.remove(ty0.b.X0);
        }
        if (!b1Var2.o0()) {
            arrayListL0.remove(ty0.b.Y0);
        }
        if (!b1Var2.P()) {
            arrayListL0.remove(ty0.b.Z0);
        }
        if (!b1Var2.j()) {
            arrayListL0.remove(ty0.b.f166854a1);
        }
        if ((!b1Var2.q0() && !b1Var2.N0()) || !b1Var2.P0()) {
            arrayListL0.remove(ty0.b.D);
        }
        if (!b1Var2.T0()) {
            arrayListL0.remove(ty0.b.f166863d1);
        }
        if (!b1Var2.k()) {
            arrayListL0.remove(ty0.b.f166857b1);
        }
        if (!b1Var2.c()) {
            arrayListL0.remove(ty0.b.f166860c1);
        }
        if (!b1Var2.Q()) {
            arrayListL0.remove(ty0.b.f166866e1);
        }
        if (!b1Var2.W()) {
            arrayListL0.remove(ty0.b.f166869f1);
        }
        if (!b1Var2.n0()) {
            arrayListL0.remove(ty0.b.f166875h1);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : arrayListL0) {
            if (!p13.h0.R(this.f173288c, ((ty0.b) obj2).f166942h)) {
                arrayList.add(obj2);
            }
        }
        List listA = ty0.c.a(arrayList);
        ArrayList arrayList2 = new ArrayList(p13.y.r(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.garmin.android.apps.connectmobile.navigation.more.b.e(this.f173286a, (ty0.b) it.next(), null, false, 12, null));
        }
        return arrayList2;
    }
}

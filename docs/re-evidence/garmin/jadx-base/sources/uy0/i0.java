package uy0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$e;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetNutritionStatsUseCase$invoke$2", f = "GetNutritionStatsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f173209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<String> f173210b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, List<String> list, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f173209a = j0Var;
        this.f173210b = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i0(this.f173209a, this.f173210b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b.e>> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ty0.b[] bVarArr = ty0.b.f166898n1.f166941g;
        if (bVarArr == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayListL0 = p13.u.l0(bVarArr);
        j0 j0Var = this.f173209a;
        if (!j0Var.f173213a.w0()) {
            arrayListL0.remove(ty0.b.f166886k1);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : arrayListL0) {
            if (!p13.h0.R(this.f173210b, ((ty0.b) obj2).f166942h)) {
                arrayList.add(obj2);
            }
        }
        List listA = ty0.c.a(arrayList);
        ArrayList arrayList2 = new ArrayList(p13.y.r(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.garmin.android.apps.connectmobile.navigation.more.b.e(j0Var.f173215c, (ty0.b) it.next(), null, false, 12, null));
        }
        return arrayList2;
    }
}

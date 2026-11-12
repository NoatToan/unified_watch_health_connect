package uy0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$e;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetTrainingAndPlaningItemsUseCase$invoke$2", f = "GetTrainingAndPlaningItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b1 extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f173099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<String> f173100b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var, List<String> list, t13.d<? super b1> dVar) {
        super(2, dVar);
        this.f173099a = c1Var;
        this.f173100b = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b1(this.f173099a, this.f173100b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b.e>> dVar) {
        return ((b1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ty0.b[] bVarArr = ty0.b.L1.f166941g;
        if (bVarArr == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayListL0 = p13.u.l0(bVarArr);
        c1 c1Var = this.f173099a;
        com.garmin.android.apps.connectmobile.b1 b1Var = c1Var.f173109a;
        com.garmin.android.apps.connectmobile.b1 b1Var2 = c1Var.f173109a;
        if (b1Var.m0()) {
            if (!b1Var2.g()) {
                arrayListL0.remove(ty0.b.f166921v1);
            }
            if (!b1Var2.a()) {
                arrayListL0.remove(ty0.b.f166933z1);
            }
        } else {
            arrayListL0.remove(ty0.b.f166918u1);
            arrayListL0.remove(ty0.b.f166921v1);
            arrayListL0.remove(ty0.b.f166924w1);
            arrayListL0.remove(ty0.b.f166927x1);
            arrayListL0.remove(ty0.b.f166930y1);
            arrayListL0.remove(ty0.b.f166933z1);
        }
        if (!b1Var2.Y()) {
            arrayListL0.remove(ty0.b.B1);
        }
        if (!b1Var2.b()) {
            arrayListL0.remove(ty0.b.A1);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : arrayListL0) {
            if (!p13.h0.R(this.f173100b, ((ty0.b) obj2).f166942h)) {
                arrayList.add(obj2);
            }
        }
        List listA = ty0.c.a(arrayList);
        ArrayList arrayList2 = new ArrayList(p13.y.r(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.garmin.android.apps.connectmobile.navigation.more.b.e(c1Var.f173111c, (ty0.b) it.next(), null, false, 12, null));
        }
        return arrayList2;
    }
}

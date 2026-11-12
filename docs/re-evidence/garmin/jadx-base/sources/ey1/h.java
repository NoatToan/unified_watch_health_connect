package ey1;

import java.util.ArrayList;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import r53.b2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.SetupStrengthTrainingPlanViewModel$updateBenchmarks$1", f = "SetupStrengthTrainingPlanViewModel.kt", l = {624}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f67330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dy1.d f67331c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, dy1.d dVar, t13.d<? super h> dVar2) {
        super(2, dVar2);
        this.f67330b = aVar;
        this.f67331c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f67330b, this.f67331c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67329a;
        if (i14 == 0) {
            o13.r.b(obj);
            nx1.b bVar = this.f67330b.f67280l;
            this.f67329a = 1;
            b2 b2Var = bVar.f128200d;
            i53.c<dy1.d> cVar = ((dy1.c) b2Var.f150540a.getValue()).f61536b;
            cVar.getClass();
            ArrayList arrayList = new ArrayList(y.r(cVar, 10));
            for (dy1.d dVar : cVar) {
                dy1.d dVar2 = dVar;
                dVar2.getClass();
                mx1.a aVar2 = dVar2.f61540a;
                dy1.d dVar3 = this.f67331c;
                if (aVar2 == dVar3.f61540a) {
                    dVar = dVar3;
                }
                arrayList.add(dVar);
            }
            bVar.f128199c.k(null, dy1.c.a((dy1.c) b2Var.f150540a.getValue(), false, i53.a.j(arrayList), null, 13));
            Unit unit = Unit.INSTANCE;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            if (unit == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

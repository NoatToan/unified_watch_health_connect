package xv1;

import e23.p;
import fg0.j;
import fg0.k;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rt1.l;
import v13.e;
import v13.i;
import vt1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.training.fbtap.triathloneditgoal.FBTTriathlonEditGoalViewModel$onSaveGoal$1", f = "FBTTriathlonEditGoalViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f192269a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, t13.d<? super b> dVar2) {
        super(2, dVar2);
        this.f192269a = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f192269a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        d dVar = this.f192269a;
        k kVar = (k) dVar.I.getValue();
        if (kVar != null) {
            j eventCustomization = kVar.getEventCustomization();
            j jVar = dVar.T;
            if (s.g(jVar != null ? jVar.h() : null, eventCustomization != null ? eventCustomization.h() : null)) {
                j jVar2 = dVar.T;
                if (!s.g(jVar2 != null ? jVar2.getCustomGoal() : null, eventCustomization != null ? eventCustomization.getCustomGoal() : null)) {
                    l.f154545a.getClass();
                    l.f154547c.add("Goal");
                }
            } else {
                l.f154545a.getClass();
                l.f154547c.add("Goal");
            }
            l lVar = l.f154545a;
            o oVar = o.f180178i;
            lVar.getClass();
            l.c(oVar);
            dVar.U4(kVar);
        }
        return Unit.INSTANCE;
    }
}

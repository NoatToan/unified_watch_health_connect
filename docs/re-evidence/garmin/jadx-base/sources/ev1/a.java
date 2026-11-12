package ev1;

import e23.p;
import fg0.j;
import fg0.k;
import gg0.h;
import jv1.m;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rt1.l;
import t13.d;
import v13.e;
import v13.i;
import vt1.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.training.fbtap.editgoal.FBTEditGoalViewModel$saveGoal$1", f = "FBTEditGoalViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f66162a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, d<? super a> dVar) {
        super(2, dVar);
        this.f66162a = bVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f66162a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        k kVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        b bVar = this.f66162a;
        gv1.a aVar2 = (gv1.a) bVar.P.getValue();
        if (aVar2 != null && (kVar = aVar2.f79445d) != null) {
            j eventCustomization = kVar.getEventCustomization();
            j jVar = eventCustomization == null ? new j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null) : eventCustomization;
            gv1.a aVar3 = (gv1.a) bVar.P.getValue();
            fg0.d dVar = null;
            if ((aVar3 != null ? aVar3.f79442a : null) != g.FINISH) {
                m mVarY4 = bVar.Y4();
                Double d14 = mVarY4 != null ? mVarY4.f101076a : null;
                m mVarY5 = bVar.Y4();
                h hVar = mVarY5 != null ? mVarY5.f101078c : null;
                m mVarY6 = bVar.Y4();
                gg0.i iVar = mVarY6 != null ? mVarY6.f101077b : null;
                if (d14 != null && hVar != null && iVar != null) {
                    dVar = new fg0.d(new Double(d14.doubleValue()), iVar, hVar);
                }
            }
            bVar.U4(k.d(kVar, null, null, null, null, null, null, j.b(jVar, dVar, null, null, null, null, null, 8190), -16777217));
            l.f154545a.getClass();
            l.f154547c.add("Goal");
            l.c(bVar.I);
        }
        return Unit.INSTANCE;
    }
}

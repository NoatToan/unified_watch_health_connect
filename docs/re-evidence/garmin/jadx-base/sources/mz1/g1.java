package mz1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$unSubscribeToEvent$1", f = "EventDetailsViewModel.kt", l = {710}, m = "invokeSuspend", v = 2)
public final class g1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f121766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f121767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(e0 e0Var, String str, t13.d<? super g1> dVar) {
        super(2, dVar);
        this.f121766c = e0Var;
        this.f121767d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g1 g1Var = new g1(this.f121766c, this.f121767d, dVar);
        g1Var.f121765b = obj;
        return g1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f121765b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121764a;
        String str = this.f121767d;
        e0 e0Var = this.f121766c;
        if (i14 == 0) {
            o13.r.b(obj);
            e0Var.N4().j(g3.a.c(g3.f35298f));
            zf0.d dVar = e0Var.f204384a;
            this.f121765b = b0Var;
            this.f121764a = 1;
            dVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.a0(dVar, str, null), this);
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
            androidx.lifecycle.y0<g3<gg0.d>> y0VarN4 = e0Var.N4();
            g3.a aVar2 = g3.f35298f;
            gg0.d dVar2 = gg0.d.UNSUBSCRIBED;
            aVar2.getClass();
            y0VarN4.j(g3.a.d(dVar2));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            v2.a aVar3 = (v2.a) v2Var;
            String str2 = "Erorr occurred while removing the event " + str + " : Error " + aVar3.f47383a + " code : " + aVar3.f47384b;
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var, "EventDetailsViewModel", str2);
            e0Var.N4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}

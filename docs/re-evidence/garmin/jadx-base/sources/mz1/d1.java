package mz1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$reportEventImage$1", f = "EventDetailsViewModel.kt", l = {757}, m = "invokeSuspend", v = 2)
public final class d1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f121675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f121676d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e0 e0Var, String str, t13.d<? super d1> dVar) {
        super(2, dVar);
        this.f121675c = e0Var;
        this.f121676d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d1 d1Var = new d1(this.f121675c, this.f121676d, dVar);
        d1Var.f121674b = obj;
        return d1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f121674b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121673a;
        e0 e0Var = this.f121675c;
        if (i14 == 0) {
            o13.r.b(obj);
            zf0.d dVar = e0Var.f204384a;
            fg0.w wVar = e0Var.f121692m1;
            if (wVar == null) {
                p005kotlin.jvm.internal.s.m("flagEventImageDTO");
                throw null;
            }
            this.f121674b = b0Var;
            this.f121673a = 1;
            dVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.y(dVar, this.f121676d, wVar, null), this);
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
            int i15 = e0.K1;
            v2.b bVar = (v2.b) v2Var;
            ((androidx.lifecycle.y0) e0Var.f121680b1.getValue()).j(new v2.b(null, bVar.f47387b, bVar.f47388c, null, 8, null));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            int i16 = e0.K1;
            ((androidx.lifecycle.y0) e0Var.f121680b1.getValue()).j(v2Var);
            String strG = androidx.room.a0.g(((v2.a) v2Var).f47384b, "Report image failed ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "AddTIEventViewModel", strG);
        }
        return Unit.INSTANCE;
    }
}

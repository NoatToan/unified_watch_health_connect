package rw;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import fw.m;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.AddBloodPressureViewModel$addBloodPressure$1", f = "AddBloodPressureViewModel.kt", l = {55}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f154812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pw.a f154813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y0<m<Boolean>> f154814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, pw.a aVar, y0<m<Boolean>> y0Var, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f154812b = iVar;
        this.f154813c = aVar;
        this.f154814d = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f154812b, this.f154813c, this.f154814d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154811a;
        if (i14 == 0) {
            r.b(obj);
            lw.b bVar = this.f154812b.f154815a;
            this.f154811a = 1;
            obj = bVar.f(this.f154813c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        boolean z14 = v2Var instanceof v2.b;
        y0<m<Boolean>> y0Var = this.f154814d;
        if (z14) {
            y0Var.j(m.a.g(m.f73767e, Boolean.TRUE, 1));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            y0Var.j(m.a.b(m.f73767e, new fw.r(), null, 5));
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.e(a2Var, "Adding a blood pressure reading failed");
        }
        return Unit.INSTANCE;
    }
}

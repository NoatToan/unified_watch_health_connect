package rk0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.GearDetailsViewModel$delete$1$2", f = "GearDetailsViewModel.kt", l = {249}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f153162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f153163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f153164c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h0 h0Var, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f153164c = h0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i0 i0Var = new i0(this.f153164c, dVar);
        i0Var.f153163b = obj;
        return i0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        g0 g0Var;
        o53.b0 b0Var = (o53.b0) this.f153163b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f153162a;
        h0 h0Var = this.f153164c;
        if (i14 == 0) {
            o13.r.b(obj);
            kk0.b bVar = h0Var.f153147b;
            String str = h0Var.f153146a.f153101a;
            this.f153163b = b0Var;
            this.f153162a = 1;
            obj = bVar.j(str, this);
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
            p2 p2Var = h0Var.f153149d;
            do {
                value2 = p2Var.getValue();
                g0Var = (g0) value2;
            } while (!p2Var.b(value2, g0.a(g0Var, null, null, null, null, o0.b(g0Var.f153132e, null, null, null, null, false, 255), null, false, false, 231)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            a2 a2Var = a2.GEAR;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error deleting gear. ");
            i2.f36769a.getClass();
            i2.a.p(a2Var, "GearDetailsViewModel", strD);
            p2 p2Var2 = h0Var.f153149d;
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, g0.a((g0) value, null, null, null, u0.Failed, null, null, false, false, 247)));
        }
        return Unit.INSTANCE;
    }
}

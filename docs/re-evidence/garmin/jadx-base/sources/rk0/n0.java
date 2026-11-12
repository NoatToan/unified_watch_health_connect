package rk0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.GearDetailsViewModel$unlinkFromActivity$1$2", f = "GearDetailsViewModel.kt", l = {334}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f153232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f153233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f153234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f153235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(h0 h0Var, long j8, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f153234c = h0Var;
        this.f153235d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n0 n0Var = new n0(this.f153234c, this.f153235d, dVar);
        n0Var.f153233b = obj;
        return n0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        g0 g0Var;
        o53.b0 b0Var = (o53.b0) this.f153233b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f153232a;
        h0 h0Var = this.f153234c;
        if (i14 == 0) {
            o13.r.b(obj);
            kk0.b bVar = h0Var.f153147b;
            String str = h0Var.f153146a.f153101a;
            this.f153233b = b0Var;
            this.f153232a = 1;
            obj = bVar.E(str, this.f153235d, this);
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
            } while (!p2Var.b(value2, g0.a(g0Var, null, null, null, null, o0.b(g0Var.f153132e, null, null, null, null, false, 447), null, false, false, 231)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            a2 a2Var = a2.GEAR;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error unlinking gear from activity. ");
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

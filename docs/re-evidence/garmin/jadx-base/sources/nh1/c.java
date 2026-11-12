package nh1;

import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.w2;
import dv.m;
import dv.n;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.settings.devices.indexbpm.IndexBpmSettingsViewModel$getDeviceSettingsAsync$1", f = "IndexBpmSettingsViewModel.kt", l = {38}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f126145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f126146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f126147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0<g3<DeviceSettingsDTO>> f126148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, long j8, z0<g3<DeviceSettingsDTO>> z0Var, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f126146c = bVar;
        this.f126147d = j8;
        this.f126148e = z0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f126146c, this.f126147d, this.f126148e, dVar);
        cVar.f126145b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f126145b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126144a;
        if (i14 == 0) {
            r.b(obj);
            m mVar = this.f126146c.f126143a;
            this.f126145b = b0Var;
            this.f126144a = 1;
            mVar.getClass();
            obj = f0.J(mVar, new n(mVar, this.f126147d, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        boolean z14 = v2Var instanceof v2.b;
        z0<g3<DeviceSettingsDTO>> z0Var = this.f126148e;
        if (z14) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "MercurySettingsViewModel", "Success obtaining device settings.");
            g3.a aVar3 = g3.f35298f;
            T t7 = ((v2.b) v2Var).f47386a;
            aVar3.getClass();
            z0Var.onChanged(g3.a.d(t7));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar4 = (v2.a) v2Var;
            w2.b(aVar4, a2.GENERAL, "MercurySettingsViewModel", "Error obtaining device settings.");
            z0Var.onChanged(g3.a.a(g3.f35298f, "", aVar4.f47383a, null, null, 12));
        }
        return Unit.INSTANCE;
    }
}

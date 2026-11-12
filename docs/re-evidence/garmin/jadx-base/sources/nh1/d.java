package nh1;

import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import dv.m;
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
@e(c = "com.garmin.android.apps.connectmobile.settings.devices.indexbpm.IndexBpmSettingsViewModel$saveDeviceSettingsAsync$1", f = "IndexBpmSettingsViewModel.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f126150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f126151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f126152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f126153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z0<g3<Boolean>> f126154f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, long j8, String str, z0<g3<Boolean>> z0Var, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f126151c = bVar;
        this.f126152d = j8;
        this.f126153e = str;
        this.f126154f = z0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f126151c, this.f126152d, this.f126153e, this.f126154f, dVar);
        dVar2.f126150b = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f126150b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126149a;
        String str = this.f126153e;
        if (i14 == 0) {
            r.b(obj);
            m mVar = this.f126151c.f126143a;
            this.f126150b = b0Var;
            this.f126149a = 1;
            obj = mVar.a(this.f126152d, str, this);
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        z0<g3<Boolean>> z0Var = this.f126154f;
        if (zBooleanValue) {
            String strN = fb1.c.n("Success saving device settings to GC: ", str);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "MercurySettingsViewModel", strN);
            g3.a aVar3 = g3.f35298f;
            Boolean bool = Boolean.TRUE;
            aVar3.getClass();
            z0Var.onChanged(g3.a.d(bool));
        } else {
            if (zBooleanValue) {
                u0.r();
                return null;
            }
            a2 a2Var2 = a2.GENERAL;
            String strN2 = fb1.c.n("Error saving device settings to GC: ", str);
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "MercurySettingsViewModel", strN2);
            z0Var.onChanged(g3.a.a(g3.f35298f, "", null, null, null, 14));
        }
        return Unit.INSTANCE;
    }
}

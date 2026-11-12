package ij1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.u;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.PrimaryDeviceViewModel$updatePrimaryTrainingDevice$1", f = "PrimaryDeviceViewModel.kt", l = {201}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f93881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f93882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gj1.d f93883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f93884e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g gVar, gj1.d dVar, boolean z14, t13.d<? super n> dVar2) {
        super(2, dVar2);
        this.f93882c = gVar;
        this.f93883d = dVar;
        this.f93884e = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(this.f93882c, this.f93883d, this.f93884e, dVar);
        nVar.f93881b = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f93881b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f93880a;
        gj1.d dVar = this.f93883d;
        g gVar = this.f93882c;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = g.f93833m;
            gVar.z4().j(g3.a.c(g3.f35298f));
            fj1.b bVar = gVar.f93834a;
            this.f93881b = b0Var;
            this.f93880a = 1;
            obj = bVar.b(dVar, this);
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
            int i16 = g.f93833m;
            y0<g3<u<Long, Boolean, Boolean>>> y0VarZ4 = gVar.z4();
            g3.a aVar2 = g3.f35298f;
            Long deviceId = dVar.getDeviceId();
            u uVar = new u(new Long(deviceId != null ? deviceId.longValue() : 0L), Boolean.TRUE, Boolean.valueOf(this.f93884e));
            aVar2.getClass();
            y0VarZ4.j(g3.a.d(uVar));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String string = ((v2.a) v2Var).f47383a.toString();
            y.f136664a.getClass();
            y.a.c("GCMSettingsViewModel", string);
            int i17 = g.f93833m;
            gVar.z4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}

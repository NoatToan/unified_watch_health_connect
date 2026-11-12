package x80;

import android.text.TextUtils;
import e23.p;
import hk0.s;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.DeviceSetupViewModel$sendSyncReadyMessageToDevice$1$1", f = "DeviceSetupViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f189535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q90.c f189536b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, q90.c cVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f189535a = eVar;
        this.f189536b = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f189535a, this.f189536b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String strD0;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        rd2.j jVar = this.f189535a.f189504f;
        long j8 = this.f189536b.f143493a;
        jVar.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI != null && (strD0 = fVarI.d0()) != null) {
            hk0.a aVarF = hk0.a.f();
            aVarF.getClass();
            if (TextUtils.isEmpty(strD0)) {
                aVarF.c("syncReady");
            } else {
                ea2.a aVar2 = (ea2.a) s.a().getCapability(strD0, ea2.a.class);
                if (aVar2 != null) {
                    aVar2.completeHandshake();
                }
            }
        }
        return Unit.INSTANCE;
    }
}

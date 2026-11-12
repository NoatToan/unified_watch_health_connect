package y90;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.sync.RetryDeviceSetupFirmwareUpdateUseCase$invoke$1", f = "RetryDeviceSetupFirmwareUpdateUseCase.kt", l = {27}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f195279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q90.c f195280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, q90.c cVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f195279b = fVar;
        this.f195280c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f195279b, this.f195280c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195278a;
        q90.c cVar = this.f195280c;
        f fVar = this.f195279b;
        if (i14 == 0) {
            r.b(obj);
            h hVar = fVar.f195282b;
            this.f195278a = 1;
            obj = hVar.a(cVar, true, this);
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
        if (((z90.c) obj) == z90.c.SKIPPED) {
            fVar.f195281a.b(cVar.f143493a);
        }
        return Unit.INSTANCE;
    }
}

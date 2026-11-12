package x80;

import e23.p;
import java.util.List;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import y80.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.DeviceSetupViewModel$saveMandatoryDeviceSettings$1", f = "DeviceSetupViewModel.kt", l = {362}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f189532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q90.c f189533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f189534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q90.c cVar, e eVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f189533b = cVar;
        this.f189534c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f189533b, this.f189534c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        z80.f fVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f189532a;
        if (i14 == 0) {
            r.b(obj);
            q90.c cVar = this.f189533b;
            if (!cVar.f143500h) {
                z80.f fVar2 = cVar.f143497e;
                fVar = (fVar2 != null ? fVar2.f203048f : null) != null ? new z80.f((List) null, (Integer) null, (String) null, (String) null, (String) null, Boolean.TRUE, (Boolean) null, (Boolean) null, 223, (p005kotlin.jvm.internal.j) null) : null;
            }
            if (fVar != null) {
                w wVar = this.f189534c.f189512n;
                long j8 = cVar.f143493a;
                this.f189532a = 1;
                if (wVar.b(j8, fVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            ((q) obj).getClass();
        }
        return Unit.INSTANCE;
    }
}

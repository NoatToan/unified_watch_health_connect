package qb0;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.sync.FirmwareUpdateProgressScreenKt$FirmwareUpdateProgressRoute$1$1", f = "FirmwareUpdateProgressScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x3<sb0.b> f144019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f144020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<bd0.b0, Unit> f144021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(x3<sb0.b> x3Var, e23.a<Unit> aVar, e23.l<? super bd0.b0, Unit> lVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f144019a = x3Var;
        this.f144020b = aVar;
        this.f144021c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f144019a, this.f144020b, this.f144021c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        z90.b bVar = this.f144019a.getF182175a().f158393d;
        if (bVar != null) {
            if (bVar == z90.b.SUCCESS) {
                this.f144020b.invoke();
            } else {
                this.f144021c.invoke(bd0.b0.REMOTE_DEVICE_SYNC_FAILED);
            }
        }
        return Unit.INSTANCE;
    }
}

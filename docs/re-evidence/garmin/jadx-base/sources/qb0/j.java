package qb0;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.sync.DeviceSyncProgressScreenKt$DeviceSyncProgressRoute$1$1", f = "DeviceSyncProgressScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d90.f f144003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f144004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<sb0.b> f144005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<z90.b, Unit> f144006d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(d90.f fVar, e23.a<Unit> aVar, x3<sb0.b> x3Var, e23.l<? super z90.b, Unit> lVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f144003a = fVar;
        this.f144004b = aVar;
        this.f144005c = x3Var;
        this.f144006d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f144003a, this.f144004b, this.f144005c, this.f144006d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        x3<sb0.b> x3Var = this.f144005c;
        boolean z14 = x3Var.getF182175a().f158392c;
        e23.l<z90.b, Unit> lVar = this.f144006d;
        if (z14) {
            d90.f fVar = this.f144003a;
            if ((fVar instanceof d90.f.e) || (fVar instanceof d90.f.C1248f)) {
                this.f144004b.invoke();
            } else {
                z90.b bVar = x3Var.getF182175a().f158393d;
                if (bVar != null) {
                    lVar.invoke(bVar);
                }
            }
        } else {
            z90.b bVar2 = x3Var.getF182175a().f158393d;
            if (bVar2 != null) {
                lVar.invoke(bVar2);
            }
        }
        return Unit.INSTANCE;
    }
}

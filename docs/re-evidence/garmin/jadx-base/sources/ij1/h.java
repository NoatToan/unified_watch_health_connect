package ij1;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.PrimaryDeviceViewModel$buildUIModel$1", f = "PrimaryDeviceViewModel.kt", l = {334}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f93853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gj1.f f93854c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, gj1.f fVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f93853b = gVar;
        this.f93854c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f93853b, this.f93854c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f93852a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f93852a = 1;
            if (this.f93853b.A4(this.f93854c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

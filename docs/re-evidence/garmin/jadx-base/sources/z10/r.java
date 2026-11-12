package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.BaseConsentViewModel$setChildDefaultLivetrack$1", f = "BaseConsentViewModel.kt", l = {122}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.y0 f201223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f201224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<Boolean> f201225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f201226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f201227e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.lifecycle.y0<Boolean> y0Var, j jVar, long j8, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f201225c = y0Var;
        this.f201226d = jVar;
        this.f201227e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f201225c, this.f201226d, this.f201227e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201224b;
        if (i14 == 0) {
            o13.r.b(obj);
            androidx.lifecycle.y0<Boolean> y0Var2 = this.f201225c;
            this.f201223a = y0Var2;
            this.f201224b = 1;
            int i15 = j.f201057e;
            Object objZ4 = this.f201226d.z4(this.f201227e, 0, this);
            if (objZ4 == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
            obj = objZ4;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f201223a;
            o13.r.b(obj);
        }
        y0Var.m(obj);
        return Unit.INSTANCE;
    }
}

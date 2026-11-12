package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.ConsentViewModel$getChildConsent$1", f = "ConsentViewModel.kt", l = {34}, m = "invokeSuspend", v = 2)
public final class f1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.y0 f200987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f200988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<q92.v> f200989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q92.x f200990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f200991e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(androidx.lifecycle.y0<q92.v> y0Var, q92.x xVar, long j8, t13.d<? super f1> dVar) {
        super(2, dVar);
        this.f200989c = y0Var;
        this.f200990d = xVar;
        this.f200991e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f1(this.f200989c, this.f200990d, this.f200991e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f200988b;
        if (i14 == 0) {
            o13.r.b(obj);
            p92.o oVar = p92.o.f136619a;
            s92.l lVar = new s92.l(String.valueOf(this.f200991e));
            androidx.lifecycle.y0<q92.v> y0Var2 = this.f200989c;
            this.f200987a = y0Var2;
            this.f200988b = 1;
            obj = oVar.k(this.f200990d, lVar, this);
            if (obj == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f200987a;
            o13.r.b(obj);
        }
        y0Var.m(obj);
        return Unit.INSTANCE;
    }
}

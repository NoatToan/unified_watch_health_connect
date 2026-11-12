package hv;

import androidx.lifecycle.y0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q92.v;
import q92.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.bic.device.TellUsMoreViewModel$geDataStorageConsent$1", f = "TellUsMoreViewModel.kt", l = {45}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f85786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0<v> f85788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(y0<v> y0Var, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f85788c = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f85788c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f85787b;
        if (i14 == 0) {
            r.b(obj);
            p92.o oVar = p92.o.f136619a;
            x xVar = x.DI_CONNECT_UPLOAD;
            y0<v> y0Var2 = this.f85788c;
            this.f85786a = y0Var2;
            this.f85787b = 1;
            obj = oVar.c(xVar, this);
            if (obj == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f85786a;
            r.b(obj);
        }
        y0Var.m(obj);
        return Unit.INSTANCE;
    }
}

package v92;

import androidx.lifecycle.y0;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.consent.ui.ConsentViewModel$fetchDeviceUploadConsent$1", f = "ConsentViewModel.kt", l = {498}, m = "invokeSuspend")
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f176539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f176540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f176541c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(r rVar, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f176541c = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f176541c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        y0<d0> y0Var;
        d0 aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f176540b;
        r rVar = this.f176541c;
        if (i14 == 0) {
            o13.r.b(obj);
            y0<d0> y0Var2 = rVar.f176472g;
            q92.f fVar = rVar.f176466a;
            this.f176539a = y0Var2;
            this.f176540b = 1;
            Object objE0 = ge1.b.e0(fVar.f143631d.f143828c, new q92.n(fVar, null), this);
            if (objE0 == aVar2) {
                return aVar2;
            }
            y0Var = y0Var2;
            obj = objE0;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f176539a;
            o13.r.b(obj);
        }
        q92.a0 a0Var = (q92.a0) obj;
        if (a0Var instanceof q92.a0.b) {
            aVar = new d0.i(((s92.a) ((q92.a0.b) a0Var).f143609a).getValue());
        } else {
            if (!(a0Var instanceof q92.a0.a)) {
                u0.r();
                return null;
            }
            aVar = new d0.a(new e.c(((q92.a0.a) a0Var).f143608a), new p(rVar, 1));
        }
        y0Var.m(aVar);
        return Unit.INSTANCE;
    }
}

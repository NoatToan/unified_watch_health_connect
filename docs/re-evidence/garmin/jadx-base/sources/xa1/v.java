package xa1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyViewModel$updateRiderWeight$1", f = "EditPowerGuideStrategyViewModel.kt", l = {StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f189815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<g3<Unit>> f189816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f189817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab1.r f189818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f189819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y0<g3<Unit>> y0Var, k kVar, ab1.r rVar, double d14, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f189816b = y0Var;
        this.f189817c = kVar;
        this.f189818d = rVar;
        this.f189819e = d14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f189816b, this.f189817c, this.f189818d, this.f189819e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f189815a;
        y0<g3<Unit>> y0Var = this.f189816b;
        if (i14 == 0) {
            o13.r.b(obj);
            y0Var.j(g3.a.c(g3.f35298f));
            sa1.a0 a0Var = this.f189817c.f189756e;
            this.f189815a = 1;
            a0Var.getClass();
            obj = f0.J(a0Var, new sa1.b0(a0Var, this.f189818d, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            f12.l.f68084a.getClass();
            f12.l.a.a().K1(this.f189819e);
            y0Var.j(g3.a.e(g3.f35298f));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            y0Var.j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47383a.toString(), null, null, null, 14));
        }
        return Unit.INSTANCE;
    }
}

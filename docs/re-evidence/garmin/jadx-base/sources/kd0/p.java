package kd0;

import android.app.Activity;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.BaseModuleAppDelegateImpl$showLockedInLiveActivitySessionInProgressDialog$showDialog$1$1", f = "BaseModuleAppDelegateImpl.kt", l = {417}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<au0.m0> f104275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f104276c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p005kotlin.jvm.internal.r0<au0.m0> r0Var, Activity activity, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f104275b = r0Var;
        this.f104276c = activity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f104275b, this.f104276c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f104274a;
        if (i14 == 0) {
            o13.r.b(obj);
            bu0.m mVar = (bu0.m) KoinJavaComponent.get$default(bu0.m.class, null, null, 6, null);
            this.f104274a = 1;
            objA = mVar.a(this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objA = ((o13.q) obj).f128597a;
        }
        if (o13.q.b(objA) != null) {
            au0.m0 m0Var = this.f104275b.f105810a;
            if (m0Var == null) {
                p005kotlin.jvm.internal.s.m("dialog");
                throw null;
            }
            m0Var.y6(false);
            Toast.makeText(this.f104276c, R.string.txt_error_occurred, 0).show();
        }
        return Unit.INSTANCE;
    }
}

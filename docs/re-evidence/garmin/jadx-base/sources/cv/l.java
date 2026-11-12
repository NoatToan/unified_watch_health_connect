package cv;

import android.app.Activity;
import androidx.lifecycle.n0;
import o13.r;
import o53.b0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcv/l;", "Landroidx/lifecycle/n;", "Landroid/app/Activity;", "activity", "Lbv/c;", "baseModuleAppDelegate", "<init>", "(Landroid/app/Activity;Lbv/c;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements androidx.lifecycle.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f55817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bv.c f55818b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.base.activity.StartupChecksNavigationHandler$onStart$1", f = "StartupChecksNavigationHandler.kt", l = {20}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f55819a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f55819a;
            l lVar = l.this;
            if (i14 == 0) {
                r.b(obj);
                bv.c cVar = lVar.f55818b;
                Activity activity = lVar.f55817a;
                this.f55819a = 1;
                obj = cVar.e(activity, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                lVar.f55817a.finish();
            }
            return Unit.INSTANCE;
        }
    }

    public l(Activity activity, bv.c cVar) {
        activity.getClass();
        cVar.getClass();
        this.f55817a = activity;
        this.f55818b = cVar;
    }

    @Override // androidx.lifecycle.n
    public final void onStart(n0 n0Var) {
        ge1.b.T(f0.w(n0Var), null, null, new a(null), 3);
    }
}

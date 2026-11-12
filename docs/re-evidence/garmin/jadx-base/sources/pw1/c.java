package pw1;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.v;
import androidx.lifecycle.i0;
import com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardActivity;
import e23.p;
import o13.r;
import o53.b0;
import o53.f0;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import u53.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardActivity$checkAndShowAddToHomeDialog$1", f = "ITPDashboardActivity.kt", l = {246, 247}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f141714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ITPDashboardActivity f141715c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardActivity$checkAndShowAddToHomeDialog$1$1", f = "ITPDashboardActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ITPDashboardActivity f141716a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ITPDashboardActivity iTPDashboardActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f141716a = iTPDashboardActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f141716a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            ITPDashboardActivity iTPDashboardActivity = this.f141716a;
            v supportFragmentManager = iTPDashboardActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            i0 i0VarW = f0.w(iTPDashboardActivity);
            ComposeView composeView = iTPDashboardActivity.f45623i;
            if (composeView == null) {
                s.m("composeView");
                throw null;
            }
            View rootView = composeView.getRootView();
            rootView.getClass();
            tu1.a.q(iTPDashboardActivity, supportFragmentManager, i0VarW, rootView, new pw1.a(iTPDashboardActivity, 7));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z14, ITPDashboardActivity iTPDashboardActivity, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f141714b = z14;
        this.f141715c = iTPDashboardActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f141714b, this.f141715c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (ge1.b.e0(r6, r1, r5) == r0) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141713a;
        if (i14 == 0) {
            r.b(obj);
            tu1.i.a aVar2 = tu1.i.f166483a;
            this.f141713a = 1;
            obj = aVar2.n(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        if (((Boolean) obj).booleanValue() && this.f141714b) {
            x53.c cVar = s0.f129406a;
            t1 t1Var = o.f168762a;
            a aVar3 = new a(this.f141715c, null);
            this.f141713a = 2;
        }
        return Unit.INSTANCE;
    }
}

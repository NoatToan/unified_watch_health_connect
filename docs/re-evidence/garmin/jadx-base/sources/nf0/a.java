package nf0;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.IntroFragment;
import mt0.h0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"Lnf0/a;", "Landroidx/fragment/app/Fragment;", "", "contentLayoutId", "<init>", "(I)V", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MenuItem f125765a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"nf0/a$b", "Landroidx/core/view/s;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements androidx.core.view.s {

        /* JADX INFO: renamed from: nf0.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.CancellableSetupFragment$onViewCreated$1$onMenuItemSelected$1", f = "CancellableSetupFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C2421a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o0 f125767a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f125768b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2421a(o0 o0Var, a aVar, t13.d<? super C2421a> dVar) {
                super(2, dVar);
                this.f125767a = o0Var;
                this.f125768b = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2421a(this.f125767a, this.f125768b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2421a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                this.f125767a.show(this.f125768b.getChildFragmentManager(), (String) null);
                return Unit.INSTANCE;
            }
        }

        public b() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            a aVar = a.this;
            if (aVar.getF34827c()) {
                MenuItem menuItemAdd = menu.add(0, 101, 0, R.string.lbl_cancel);
                aVar.f125765a = menuItemAdd;
                if (menuItemAdd != null) {
                    menuItemAdd.setShowAsActionFlags(1);
                }
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != 101) {
                return false;
            }
            o0.a aVar = o0.f149771c;
            a aVar2 = a.this;
            String string = aVar2.getString(R.string.lbl_exit_ecg_app_setup);
            String string2 = aVar2.getString(R.string.msg_ecg_cancel_confirmation);
            h0 h0Var = new h0(aVar2, 10);
            aVar.getClass();
            f0.w(aVar2).b(new C2421a(o0.a.a(string, string2, R.string.lbl_exit, h0Var, R.string.lbl_cancel, null), aVar2, null));
            return false;
        }
    }

    static {
        new C2420a(null);
    }

    public a() {
        this(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.j(this, new b());
    }

    public abstract void u6();

    /* JADX INFO: renamed from: v6 */
    public boolean getF34827c() {
        return !(this instanceof IntroFragment);
    }

    /* JADX INFO: renamed from: nf0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnf0/a$a;", "", "<init>", "()V", "", "MENU_CANCEL", "I", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2420a {
        public /* synthetic */ C2420a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2420a() {
        }
    }

    public a(int i14) {
        super(i14);
    }
}

package xr;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import qr.t;
import r22.q0;
import u1.d2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lxr/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "Lnr/t$g;", "overviewState", "Lnr/y;", "openEvaluationGroupBottomSheet", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f191947e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f191948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q0 f191949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bs.b f191950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d2 f191951d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f191952a;

        public b(Fragment fragment) {
            this.f191952a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f191952a.requireActivity();
        }
    }

    /* JADX INFO: renamed from: xr.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3575c implements e23.a<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f191953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f191954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f191955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f191956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f191957e;

        public C3575c(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f191953a = fragment;
            this.f191954b = qualifier;
            this.f191955c = aVar;
            this.f191956d = aVar2;
            this.f191957e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.t] */
        @Override // e23.a
        public final t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f191955c.invoke();
            y1 viewModelStore = viewModelStoreOwner.getViewModelStore();
            Fragment fragment = this.f191953a;
            e23.a aVar = this.f191956d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(t.class), viewModelStore, null, defaultViewModelCreationExtras, this.f191954b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f191957e, 4, null);
        }
    }

    static {
        new a(null);
    }

    public c() {
        super(R.layout.composable_container);
        this.f191948a = o13.m.a(o13.n.NONE, new C3575c(this, null, new b(this), null, null));
        this.f191950c = (bs.b) KoinJavaComponent.get$default(bs.b.class, null, null, 6, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ((ComposeView) view2.findViewById(R.id.composable_container)).setContent(new z3.e(-1381701507, true, new vy0.e(this, 23)));
        nr.t tVar = ((nr.i) u6().L1.getValue()).f127191a;
        if (tVar == null || !((nr.t.f) tVar).f127341f) {
            return;
        }
        b0 f158016a = getViewLifecycleOwner().getF158016a();
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        f158016a.a(new cv.k(mVarRequireActivity, new xr.a(0, this, view2)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final t u6() {
        return (t) this.f191948a.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxr/c$a;", "", "<init>", "()V", "", "SCREENSHOT_DETECTION_SNACK_BAR_DURATION_SECONDS", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

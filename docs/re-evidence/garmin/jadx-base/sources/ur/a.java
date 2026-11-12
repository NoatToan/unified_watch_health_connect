package ur;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import qr.t;
import tr2.o;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lur/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f172312a;

    /* JADX INFO: renamed from: ur.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3217a implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f172313a;

        public C3217a(Fragment fragment) {
            this.f172313a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f172313a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f172314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f172315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f172316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f172317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f172318e;

        public b(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f172314a = fragment;
            this.f172315b = qualifier;
            this.f172316c = aVar;
            this.f172317d = aVar2;
            this.f172318e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.t] */
        @Override // e23.a
        public final t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f172316c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f172314a;
            e23.a aVar = this.f172317d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                g gVar = viewModelStoreOwner instanceof g ? (g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(t.class), f189591b, null, defaultViewModelCreationExtras, this.f172315b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f172318e, 4, null);
        }
    }

    public a() {
        super(R.layout.composable_container);
        this.f172312a = o13.m.a(n.NONE, new b(this, null, new C3217a(this), null, null));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ((ComposeView) view2.findViewById(R.id.composable_container)).setContent(new e(-1158710777, true, new o(this, 8)));
    }
}

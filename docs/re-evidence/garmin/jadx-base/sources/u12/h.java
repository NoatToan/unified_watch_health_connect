package u12;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.d3;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import r22.v1;
import tn2.t;
import tr2.y;
import ty1.g2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu12/h;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f167779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f167780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f167781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ip.a f167782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m12.r f167783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<Intent> f167784f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f167785a;

        public a(e23.l lVar) {
            lVar.getClass();
            this.f167785a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f167785a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f167785a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f167786a;

        public b(Fragment fragment) {
            this.f167786a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f167786a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f167787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f167788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f167789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f167790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f167791e;

        public c(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f167787a = fragment;
            this.f167788b = qualifier;
            this.f167789c = aVar;
            this.f167790d = aVar2;
            this.f167791e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f167789c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f167787a;
            e23.a aVar = this.f167790d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.class), f189591b, null, defaultViewModelCreationExtras, this.f167788b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f167791e, 4, null);
        }
    }

    public h() {
        super(R.layout.gcm_fragment_recycler_view);
        this.f167780b = new f();
        this.f167781c = o13.m.a(o13.n.NONE, new c(this, null, new b(this), null, null));
        this.f167783e = (m12.r) KoinJavaComponent.get$default(m12.r.class, null, null, 6, null);
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new y(this, 3));
        cVarRegisterForActivityResult.getClass();
        this.f167784f = cVarRegisterForActivityResult;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Object obj;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        a7.e eVarRequireActivity = requireActivity();
        d3 d3Var = eVarRequireActivity instanceof d3 ? (d3) eVarRequireActivity : null;
        if (d3Var != null) {
            d3Var.updateActionBarTitle(getString(R.string.privacy_custom_levels));
        }
        Bundle bundleRequireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            obj = bundleRequireArguments != null ? (Parcelable) bundleRequireArguments.getParcelable("GCM_extra_screen_access_role", hl.a.class) : null;
        } else {
            Parcelable parcelable = bundleRequireArguments != null ? bundleRequireArguments.getParcelable("GCM_extra_screen_access_role") : null;
            if (!(parcelable instanceof hl.a)) {
                parcelable = null;
            }
            obj = (hl.a) parcelable;
        }
        Object obj2 = (hl.a) obj;
        if (obj2 == null) {
            obj2 = hl.a.c.f84256b;
        }
        RecyclerView recyclerView = (RecyclerView) view2;
        this.f167779a = recyclerView;
        f fVar = this.f167780b;
        recyclerView.setAdapter(fVar);
        RecyclerView recyclerView2 = this.f167779a;
        if (recyclerView2 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView3 = this.f167779a;
        if (recyclerView3 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView3.addItemDecoration(new v1(20, false, false, true, false, 22, null));
        ((com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b) this.f167781c.getValue()).f47155i.f(getViewLifecycleOwner(), new a(new t(this, 21)));
        g2 g2Var = new g2(5, this, obj2);
        fVar.getClass();
        fVar.f167776a = g2Var;
    }
}

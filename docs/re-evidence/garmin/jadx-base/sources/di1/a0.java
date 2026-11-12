package di1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
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
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldi1/a0;", "Ldv/b;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 extends dv.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f59724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f59725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f59726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f59727e = o13.m.a(o13.n.NONE, new c(this, null, new b(this), null, null));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f59728f = new n(new z(this, 0));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f59729a;

        public a(e23.l lVar) {
            lVar.getClass();
            this.f59729a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f59729a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f59729a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f59730a;

        public b(Fragment fragment) {
            this.f59730a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f59730a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<hd0.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f59731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f59732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f59733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f59734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f59735e;

        public c(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f59731a = fragment;
            this.f59732b = qualifier;
            this.f59733c = aVar;
            this.f59734d = aVar2;
            this.f59735e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, hd0.b] */
        @Override // e23.a
        public final hd0.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f59733c.invoke();
            y1 viewModelStore = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f59731a;
            e23.a aVar = this.f59734d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(hd0.b.class), viewModelStore, null, defaultViewModelCreationExtras, this.f59732b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f59735e, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.wifi_stored_networks, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        d3 d3Var = this.f61319a;
        if (d3Var != null) {
            d3Var.focusTitle();
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        u6(getString(R.string.smart_scale_device_settings_wifi_networks));
        View viewFindViewById = view2.findViewById(R.id.networks_header);
        viewFindViewById.getClass();
        this.f59724b = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.networks_no_data);
        viewFindViewById2.getClass();
        this.f59725c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.networks_list);
        viewFindViewById3.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f59726d = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView2 = this.f59726d;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("networksRecyclerView");
            throw null;
        }
        recyclerView2.setAdapter(this.f59728f);
        View viewFindViewById4 = view2.findViewById(R.id.networks_btn);
        viewFindViewById4.getClass();
        ((Button) viewFindViewById4).setOnClickListener(new com.garmin.android.apps.connectmobile.connectiq.x(this, 18));
        ((hd0.b) this.f59727e.getValue()).f83309b.f(getViewLifecycleOwner(), new a(new z(this, 1)));
    }
}

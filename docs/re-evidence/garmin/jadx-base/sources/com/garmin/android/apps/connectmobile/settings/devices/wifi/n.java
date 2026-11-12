package com.garmin.android.apps.connectmobile.settings.devices.wifi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.garmin.proto.generated.WifiSetup;
import di1.v;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/n;", "Ldv/b;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends dv.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f43372h = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f43373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f43374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f43375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView f43376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f43377f = o13.m.a(o13.n.NONE, new e(this, null, new d(this), null, null));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f43378g = new h(new v(this, 1), new cq0.g(this, 19));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43379a;

        static {
            int[] iArr = new int[WifiSetup.StatusType.values().length];
            try {
                iArr[WifiSetup.StatusType.ConnectionSuccess.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WifiSetup.StatusType.InvalidCredentials.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f43379a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f43380a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f43380a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f43380a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43380a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43381a;

        public d(Fragment fragment) {
            this.f43381a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f43381a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<hd0.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f43383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f43384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f43385d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f43386e;

        public e(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f43382a = fragment;
            this.f43383b = qualifier;
            this.f43384c = aVar;
            this.f43385d = aVar2;
            this.f43386e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, hd0.b] */
        @Override // e23.a
        public final hd0.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f43384c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f43382a;
            e23.a aVar = this.f43385d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(hd0.b.class), f189591b, null, defaultViewModelCreationExtras, this.f43383b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f43386e, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.wifi_scanned_networks, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        d3 d3Var = this.f61319a;
        if (d3Var != null) {
            d3Var.focusTitle();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        this.f43373b = arguments != null ? arguments.getString("GCM_deviceProductNbr") : null;
        u6(getString(R.string.wifi_add_a_network));
        View viewFindViewById = view2.findViewById(R.id.networks_header);
        viewFindViewById.getClass();
        this.f43374c = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.networks_no_data);
        viewFindViewById2.getClass();
        this.f43375d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.networks_list);
        viewFindViewById3.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f43376e = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView2 = this.f43376e;
        if (recyclerView2 == null) {
            s.m("networksRecyclerView");
            throw null;
        }
        recyclerView2.setAdapter(this.f43378g);
        v6().f83309b.f(getViewLifecycleOwner(), new c(new v(this, 0)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final hd0.b v6() {
        return (hd0.b) this.f43377f.getValue();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/n$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

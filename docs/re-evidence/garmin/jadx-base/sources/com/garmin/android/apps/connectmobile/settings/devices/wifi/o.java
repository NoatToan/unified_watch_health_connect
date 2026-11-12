package com.garmin.android.apps.connectmobile.settings.devices.wifi;

import a03.n0;
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
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.WifiSetup;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/o;", "Ldv/b;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends dv.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f43387d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43388b = o13.m.a(o13.n.NONE, new e(this, null, new d(this), null, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f43389c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43390a;

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
            f43390a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f43391a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f43391a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f43391a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43391a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43392a;

        public d(Fragment fragment) {
            this.f43392a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f43392a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<hd0.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f43394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f43395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f43396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f43397e;

        public e(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f43393a = fragment;
            this.f43394b = qualifier;
            this.f43395c = aVar;
            this.f43396d = aVar2;
            this.f43397e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, hd0.b] */
        @Override // e23.a
        public final hd0.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f43395c.invoke();
            y1 viewModelStore = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f43393a;
            e23.a aVar = this.f43396d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(hd0.b.class), viewModelStore, null, defaultViewModelCreationExtras, this.f43394b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f43397e, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.wifi_stored_network_actions, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        this.f43389c = arguments != null ? arguments.getString("GCM_deviceProductNbr") : null;
        View viewFindViewById = view2.findViewById(R.id.update_password_btn);
        viewFindViewById.getClass();
        new k32.l(viewFindViewById).a(R.string.wifi_update_password_lbl, null);
        View viewFindViewById2 = view2.findViewById(R.id.test_network_btn);
        ((TextView) viewFindViewById2.findViewById(R.id.text1)).setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_primary_action));
        new k32.l(viewFindViewById2).a(R.string.wifi_test_network_connection, null);
        View viewFindViewById3 = view2.findViewById(R.id.forget_network_btn);
        ((TextView) viewFindViewById3.findViewById(R.id.text1)).setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_primary_action));
        new k32.l(viewFindViewById3).a(R.string.wifi_forget_network, null);
        v6().f83309b.f(getViewLifecycleOwner(), new c(new n0(this, viewFindViewById, viewFindViewById2, viewFindViewById3, 22)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final hd0.b v6() {
        return (hd0.b) this.f43388b.getValue();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/o$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

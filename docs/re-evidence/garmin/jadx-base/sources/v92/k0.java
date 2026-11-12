package v92;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.consent.ui.view.DeviceUploadConsentView;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lv92/k0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k0 extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f176419c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f176420a = new w1(s0.f105811a.b(r.class), new c(this), new v10.a(10), new d(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeviceUploadConsentView f176421b;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f176422a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f176422a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f176422a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f176422a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f176423a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f176423a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f176423a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f176424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f176425b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f176424a = aVar;
            this.f176425b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f176424a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f176425b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.device_upload_screen, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        DeviceUploadConsentView deviceUploadConsentView = (DeviceUploadConsentView) view2.findViewById(R.id.device_upload_view);
        this.f176421b = deviceUploadConsentView;
        if (deviceUploadConsentView == null) {
            p005kotlin.jvm.internal.s.m("deviceUploadView");
            throw null;
        }
        final int i14 = 0;
        deviceUploadConsentView.setOnClickListener(new e23.l(this) { // from class: v92.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f176413b;

            {
                this.f176413b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                k0 k0Var = this.f176413b;
                switch (i15) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        k0.a aVar = k0.f176419c;
                        ((r) k0Var.f176420a.getValue()).f176473h.m(new a.c(zBooleanValue));
                        return Unit.INSTANCE;
                    default:
                        d0 d0Var = (d0) obj;
                        k0.a aVar2 = k0.f176419c;
                        p92.y.f136664a.getClass();
                        p92.y.a.a("DeviceUploadViewFragment", "consentViewState = " + d0Var);
                        if (d0Var instanceof d0.i) {
                            DeviceUploadConsentView deviceUploadConsentView2 = k0Var.f176421b;
                            if (deviceUploadConsentView2 == null) {
                                p005kotlin.jvm.internal.s.m("deviceUploadView");
                                throw null;
                            }
                            deviceUploadConsentView2.setDeviceUploadChecked(((d0.i) d0Var).f176350a);
                        } else {
                            if (d0Var instanceof d0.c) {
                                DeviceUploadConsentView deviceUploadConsentView3 = k0Var.f176421b;
                                if (deviceUploadConsentView3 == null) {
                                    p005kotlin.jvm.internal.s.m("deviceUploadView");
                                    throw null;
                                }
                                deviceUploadConsentView3.b();
                                SwitchCompat switchCompat = deviceUploadConsentView3.f49838d;
                                if (switchCompat == null) {
                                    p005kotlin.jvm.internal.s.m("deviceUploadSwitch");
                                    throw null;
                                }
                                switchCompat.setVisibility(0);
                                deviceUploadConsentView3.f49839e.setVisibility(8);
                            } else if (d0Var instanceof d0.b) {
                                DeviceUploadConsentView deviceUploadConsentView4 = k0Var.f176421b;
                                if (deviceUploadConsentView4 == null) {
                                    p005kotlin.jvm.internal.s.m("deviceUploadView");
                                    throw null;
                                }
                                deviceUploadConsentView4.setDeviceUploadChecked(((d0.b) d0Var).f176340c == f0.ENABLED);
                            } else if (d0Var instanceof d0.a) {
                                e eVar = ((d0.a) d0Var).f176336a;
                                if (eVar instanceof e.c) {
                                    DeviceUploadConsentView deviceUploadConsentView5 = k0Var.f176421b;
                                    if (deviceUploadConsentView5 == null) {
                                        p005kotlin.jvm.internal.s.m("deviceUploadView");
                                        throw null;
                                    }
                                    deviceUploadConsentView5.b();
                                    SwitchCompat switchCompat2 = deviceUploadConsentView5.f49838d;
                                    if (switchCompat2 == null) {
                                        p005kotlin.jvm.internal.s.m("deviceUploadSwitch");
                                        throw null;
                                    }
                                    switchCompat2.setVisibility(0);
                                    deviceUploadConsentView5.f49839e.setVisibility(8);
                                } else if ((eVar instanceof e.d) || (eVar instanceof e.a)) {
                                    k0Var.u6();
                                }
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        });
        final int i15 = 1;
        ((r) this.f176420a.getValue()).f176472g.f(getViewLifecycleOwner(), new b(new e23.l(this) { // from class: v92.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f176413b;

            {
                this.f176413b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                k0 k0Var = this.f176413b;
                switch (i16) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        k0.a aVar = k0.f176419c;
                        ((r) k0Var.f176420a.getValue()).f176473h.m(new a.c(zBooleanValue));
                        return Unit.INSTANCE;
                    default:
                        d0 d0Var = (d0) obj;
                        k0.a aVar2 = k0.f176419c;
                        p92.y.f136664a.getClass();
                        p92.y.a.a("DeviceUploadViewFragment", "consentViewState = " + d0Var);
                        if (d0Var instanceof d0.i) {
                            DeviceUploadConsentView deviceUploadConsentView2 = k0Var.f176421b;
                            if (deviceUploadConsentView2 == null) {
                                p005kotlin.jvm.internal.s.m("deviceUploadView");
                                throw null;
                            }
                            deviceUploadConsentView2.setDeviceUploadChecked(((d0.i) d0Var).f176350a);
                        } else {
                            if (d0Var instanceof d0.c) {
                                DeviceUploadConsentView deviceUploadConsentView3 = k0Var.f176421b;
                                if (deviceUploadConsentView3 == null) {
                                    p005kotlin.jvm.internal.s.m("deviceUploadView");
                                    throw null;
                                }
                                deviceUploadConsentView3.b();
                                SwitchCompat switchCompat = deviceUploadConsentView3.f49838d;
                                if (switchCompat == null) {
                                    p005kotlin.jvm.internal.s.m("deviceUploadSwitch");
                                    throw null;
                                }
                                switchCompat.setVisibility(0);
                                deviceUploadConsentView3.f49839e.setVisibility(8);
                            } else if (d0Var instanceof d0.b) {
                                DeviceUploadConsentView deviceUploadConsentView4 = k0Var.f176421b;
                                if (deviceUploadConsentView4 == null) {
                                    p005kotlin.jvm.internal.s.m("deviceUploadView");
                                    throw null;
                                }
                                deviceUploadConsentView4.setDeviceUploadChecked(((d0.b) d0Var).f176340c == f0.ENABLED);
                            } else if (d0Var instanceof d0.a) {
                                e eVar = ((d0.a) d0Var).f176336a;
                                if (eVar instanceof e.c) {
                                    DeviceUploadConsentView deviceUploadConsentView5 = k0Var.f176421b;
                                    if (deviceUploadConsentView5 == null) {
                                        p005kotlin.jvm.internal.s.m("deviceUploadView");
                                        throw null;
                                    }
                                    deviceUploadConsentView5.b();
                                    SwitchCompat switchCompat2 = deviceUploadConsentView5.f49838d;
                                    if (switchCompat2 == null) {
                                        p005kotlin.jvm.internal.s.m("deviceUploadSwitch");
                                        throw null;
                                    }
                                    switchCompat2.setVisibility(0);
                                    deviceUploadConsentView5.f49839e.setVisibility(8);
                                } else if ((eVar instanceof e.d) || (eVar instanceof e.a)) {
                                    k0Var.u6();
                                }
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    public final void u6() {
        DeviceUploadConsentView deviceUploadConsentView = this.f176421b;
        if (deviceUploadConsentView == null) {
            p005kotlin.jvm.internal.s.m("deviceUploadView");
            throw null;
        }
        deviceUploadConsentView.b();
        deviceUploadConsentView.f49839e.setVisibility(8);
        SwitchCompat switchCompat = deviceUploadConsentView.f49838d;
        if (switchCompat == null) {
            p005kotlin.jvm.internal.s.m("deviceUploadSwitch");
            throw null;
        }
        switchCompat.toggle();
        SwitchCompat switchCompat2 = deviceUploadConsentView.f49838d;
        if (switchCompat2 != null) {
            switchCompat2.setVisibility(0);
        } else {
            p005kotlin.jvm.internal.s.m("deviceUploadSwitch");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv92/k0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

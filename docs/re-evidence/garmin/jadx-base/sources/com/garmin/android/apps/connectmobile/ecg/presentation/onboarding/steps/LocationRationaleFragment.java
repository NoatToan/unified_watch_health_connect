package com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.LocationRationaleFragment;
import g.f;
import g.h;
import java.util.Iterator;
import java.util.Map;
import nf0.o;
import o53.f0;
import of0.q;
import of0.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import r22.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/LocationRationaleFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LocationRationaleFragment extends Fragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f34816e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f34817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.c<String[]> f34818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.c<Intent> f34819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.c<Intent> f34820d;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f34821a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f34821a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f34821a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f34822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f34823b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f34822a = aVar;
            this.f34823b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f34822a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f34823b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f34824a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f34824a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f34824a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    public LocationRationaleFragment() {
        super(R.layout.location_rationale_fragment);
        this.f34817a = new w1(s0.f105811a.b(o.class), new b(this), new d(this), new c(null, this));
        final int i14 = 0;
        f.c<String[]> cVarRegisterForActivityResult = registerForActivityResult(new f(), new f.b(this) { // from class: of0.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LocationRationaleFragment f131698b;

            {
                this.f131698b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i15 = i14;
                LocationRationaleFragment locationRationaleFragment = this.f131698b;
                switch (i15) {
                    case 0:
                        Map map = (Map) obj;
                        int i16 = LocationRationaleFragment.f34816e;
                        map.getClass();
                        if (!map.isEmpty()) {
                            Iterator it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    if (!locationRationaleFragment.u6().f125822d.a("EcgOnboardingViewModel")) {
                                        locationRationaleFragment.w6();
                                    } else {
                                        locationRationaleFragment.v6();
                                    }
                                    break;
                                }
                            }
                        }
                        locationRationaleFragment.y6();
                        break;
                    case 1:
                        int i17 = LocationRationaleFragment.f34816e;
                        ((f.a) obj).getClass();
                        if (locationRationaleFragment.u6().L4()) {
                            if (!locationRationaleFragment.u6().f125822d.a("EcgOnboardingViewModel")) {
                                locationRationaleFragment.w6();
                            } else {
                                locationRationaleFragment.v6();
                            }
                        }
                        break;
                    default:
                        int i18 = LocationRationaleFragment.f34816e;
                        ((f.a) obj).getClass();
                        if (locationRationaleFragment.u6().f125822d.a("EcgOnboardingViewModel")) {
                            if (!locationRationaleFragment.u6().L4()) {
                                locationRationaleFragment.y6();
                            } else {
                                locationRationaleFragment.v6();
                            }
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult.getClass();
        this.f34818b = cVarRegisterForActivityResult;
        final int i15 = 1;
        f.c<Intent> cVarRegisterForActivityResult2 = registerForActivityResult(new h(), new f.b(this) { // from class: of0.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LocationRationaleFragment f131698b;

            {
                this.f131698b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i16 = i15;
                LocationRationaleFragment locationRationaleFragment = this.f131698b;
                switch (i16) {
                    case 0:
                        Map map = (Map) obj;
                        int i17 = LocationRationaleFragment.f34816e;
                        map.getClass();
                        if (!map.isEmpty()) {
                            Iterator it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    if (!locationRationaleFragment.u6().f125822d.a("EcgOnboardingViewModel")) {
                                        locationRationaleFragment.w6();
                                    } else {
                                        locationRationaleFragment.v6();
                                    }
                                    break;
                                }
                            }
                        }
                        locationRationaleFragment.y6();
                        break;
                    case 1:
                        int i18 = LocationRationaleFragment.f34816e;
                        ((f.a) obj).getClass();
                        if (locationRationaleFragment.u6().L4()) {
                            if (!locationRationaleFragment.u6().f125822d.a("EcgOnboardingViewModel")) {
                                locationRationaleFragment.w6();
                            } else {
                                locationRationaleFragment.v6();
                            }
                        }
                        break;
                    default:
                        int i19 = LocationRationaleFragment.f34816e;
                        ((f.a) obj).getClass();
                        if (locationRationaleFragment.u6().f125822d.a("EcgOnboardingViewModel")) {
                            if (!locationRationaleFragment.u6().L4()) {
                                locationRationaleFragment.y6();
                            } else {
                                locationRationaleFragment.v6();
                            }
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult2.getClass();
        this.f34819c = cVarRegisterForActivityResult2;
        final int i16 = 2;
        f.c<Intent> cVarRegisterForActivityResult3 = registerForActivityResult(new h(), new f.b(this) { // from class: of0.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LocationRationaleFragment f131698b;

            {
                this.f131698b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i17 = i16;
                LocationRationaleFragment locationRationaleFragment = this.f131698b;
                switch (i17) {
                    case 0:
                        Map map = (Map) obj;
                        int i18 = LocationRationaleFragment.f34816e;
                        map.getClass();
                        if (!map.isEmpty()) {
                            Iterator it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    if (!locationRationaleFragment.u6().f125822d.a("EcgOnboardingViewModel")) {
                                        locationRationaleFragment.w6();
                                    } else {
                                        locationRationaleFragment.v6();
                                    }
                                    break;
                                }
                            }
                        }
                        locationRationaleFragment.y6();
                        break;
                    case 1:
                        int i19 = LocationRationaleFragment.f34816e;
                        ((f.a) obj).getClass();
                        if (locationRationaleFragment.u6().L4()) {
                            if (!locationRationaleFragment.u6().f125822d.a("EcgOnboardingViewModel")) {
                                locationRationaleFragment.w6();
                            } else {
                                locationRationaleFragment.v6();
                            }
                        }
                        break;
                    default:
                        int i110 = LocationRationaleFragment.f34816e;
                        ((f.a) obj).getClass();
                        if (locationRationaleFragment.u6().f125822d.a("EcgOnboardingViewModel")) {
                            if (!locationRationaleFragment.u6().L4()) {
                                locationRationaleFragment.y6();
                            } else {
                                locationRationaleFragment.v6();
                            }
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult3.getClass();
        this.f34820d = cVarRegisterForActivityResult3;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        ((Button) view2.findViewById(R.id.allow_location_access_button)).setOnClickListener(new q(this, 0));
        ((Button) view2.findViewById(R.id.cancel_button)).setOnClickListener(new q(this, 1));
        ((TextView) view2.findViewById(R.id.privacy_policy_link)).setOnClickListener(new q(this, 2));
    }

    public final o u6() {
        return (o) this.f34817a.getValue();
    }

    public final void v6() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_CHECK_ENABLED_AT_CURRENT_LOCATION", true);
        NavHostFragment.f10124e.getClass();
        NavHostFragment.a.a(this).g(R.id.action_intro_fragment, bundle);
    }

    public final void w6() {
        this.f34820d.a(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), null);
    }

    public final void y6() {
        o0.a aVar = o0.f149771c;
        String string = getString(R.string.weather_location_permission_needed);
        String string2 = getString(R.string.msg_ecg_settings_location_required);
        q qVar = new q(this, 3);
        q qVar2 = new q(this, 4);
        aVar.getClass();
        f0.w(this).b(new r(o0.a.a(string, string2, R.string.lbl_settings, qVar, R.string.lbl_exit_setup_capitalized, qVar2), this, null));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/LocationRationaleFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

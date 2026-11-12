package com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.ConsentActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.EmergencyCallingActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import pj1.d0;
import pj1.s;
import q92.x;
import ue0.h;
import uj1.j0;
import uj1.k0;
import w61.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/f;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "Lyj1/o;", "uiState", "", "isNavigatingToRealtimeSettings", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends Fragment {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f43837h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f43838a = new w1(s0.f105811a.b(s.class), new d(this), new C0816f(this), new e(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43839b = View.generateViewId();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43840c = View.generateViewId();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.c<Intent> f43841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.c<Intent> f43842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<Long> f43843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f43844g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/f$b", "Lb/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = f.f43837h;
            s sVarU6 = f.this.u6();
            int i14 = s.f137969j1;
            sVarU6.q5(false);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/f$c", "Landroidx/core/view/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements androidx.core.view.s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            f fVar = f.this;
            MenuItem menuItemAdd = menu.add(0, fVar.f43839b, 0, R.string.lbl_help);
            if (menuItemAdd != null) {
                menuItemAdd.setShowAsActionFlags(0);
            }
            MenuItem menuItemAdd2 = menu.add(0, fVar.f43840c, 0, R.string.gdpr_livetrack_data_privacy);
            if (menuItemAdd2 != null) {
                menuItemAdd2.setShowAsActionFlags(0);
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            f fVar = f.this;
            boolean z14 = false;
            if (itemId != fVar.f43839b) {
                if (itemId != fVar.f43840c) {
                    return false;
                }
                hl.a aVar = fVar.u6().f137981q;
                f.c<Intent> cVar = fVar.f43841d;
                ConsentActivity.a aVar2 = ConsentActivity.f32155r;
                Context contextRequireContext = fVar.requireContext();
                contextRequireContext.getClass();
                cVar.a(ConsentActivity.a.b(aVar2, contextRequireContext, x.DI_CONNECT_LIVETRACK, p005kotlin.jvm.internal.s.g(aVar, hl.a.c.f84256b), aVar, 8), null);
                return true;
            }
            Context contextRequireContext2 = fVar.requireContext();
            contextRequireContext2.getClass();
            boolean zN4 = fVar.u6().N4();
            boolean z15 = fVar.u6().f137988z;
            boolean z16 = fVar.u6().A;
            s sVarU6 = fVar.u6();
            hl.a aVar3 = sVarU6.f137981q;
            if (!p005kotlin.jvm.internal.s.g(aVar3, hl.a.c.f84256b)) {
                if (!(aVar3 instanceof hl.a.b)) {
                    u0.r();
                    return false;
                }
                List<h> list = sVarU6.I;
                if (list != null && !list.isEmpty()) {
                    for (h hVar : list) {
                        Boolean boolG = hVar.getIncidentDetectionCapable();
                        Boolean bool = Boolean.TRUE;
                        if (p005kotlin.jvm.internal.s.g(boolG, bool) && !p005kotlin.jvm.internal.s.g(hVar.getFallDetectionCapable(), bool)) {
                            z14 = true;
                            break;
                        }
                    }
                }
            } else {
                List list2 = (List) sVarU6.f137979k0.d();
                if (list2 != null) {
                    ArrayList<sd2.f> arrayListD = d0.d(list2);
                    if (!arrayListD.isEmpty()) {
                        for (sd2.f fVar2 : arrayListD) {
                            fVar2.getClass();
                            if (km2.a.i(fVar2.getUnitID(), null, SupportedCapability.INCIDENT_DETECTION.ordinal()) || d0.j(fVar2)) {
                                if (!fVar2.u0()) {
                                    z14 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            d0.m(contextRequireContext2, zN4, z15, z16, z14);
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43847a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f43847a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43847a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43849b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43848a = aVar;
            this.f43849b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43848a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43849b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0816f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43850a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0816f(Fragment fragment) {
            super(0);
            this.f43850a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43850a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public f() {
        final int i14 = 0;
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new f.b(this) { // from class: uj1.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f f171552b;

            {
                this.f171552b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f fVar = this.f171552b;
                switch (i15) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                        aVar.getClass();
                        if (aVar.f67585a == 0 && (intent = aVar.f67586b) != null && intent.getBooleanExtra("extra_consent_revoked", false)) {
                            fVar.requireActivity().finish();
                            break;
                        }
                        break;
                    case 1:
                        f.a aVar3 = (f.a) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            Intent intent2 = aVar3.f67586b;
                            l20.a aVar5 = null;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent2.getParcelableExtra("EXTRA_SELECTED_EMERGENCY_CONTACT", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra = intent2.getParcelableExtra("EXTRA_SELECTED_EMERGENCY_CONTACT");
                                    parcelable = (l20.a) (parcelableExtra instanceof l20.a ? parcelableExtra : null);
                                }
                                aVar5 = (l20.a) parcelable;
                            }
                            fVar.u6().i5(aVar5);
                        }
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar6 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                        bool.getClass();
                        fVar.u6().U4(bool.booleanValue());
                        break;
                }
            }
        });
        cVarRegisterForActivityResult.getClass();
        this.f43841d = cVarRegisterForActivityResult;
        final int i15 = 1;
        f.c<Intent> cVarRegisterForActivityResult2 = registerForActivityResult(new g.h(), new f.b(this) { // from class: uj1.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f f171552b;

            {
                this.f171552b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f fVar = this.f171552b;
                switch (i16) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                        aVar.getClass();
                        if (aVar.f67585a == 0 && (intent = aVar.f67586b) != null && intent.getBooleanExtra("extra_consent_revoked", false)) {
                            fVar.requireActivity().finish();
                            break;
                        }
                        break;
                    case 1:
                        f.a aVar3 = (f.a) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            Intent intent2 = aVar3.f67586b;
                            l20.a aVar5 = null;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent2.getParcelableExtra("EXTRA_SELECTED_EMERGENCY_CONTACT", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra = intent2.getParcelableExtra("EXTRA_SELECTED_EMERGENCY_CONTACT");
                                    parcelable = (l20.a) (parcelableExtra instanceof l20.a ? parcelableExtra : null);
                                }
                                aVar5 = (l20.a) parcelable;
                            }
                            fVar.u6().i5(aVar5);
                        }
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar6 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                        bool.getClass();
                        fVar.u6().U4(bool.booleanValue());
                        break;
                }
            }
        });
        cVarRegisterForActivityResult2.getClass();
        this.f43842e = cVarRegisterForActivityResult2;
        final int i16 = 2;
        f.c<Long> cVarRegisterForActivityResult3 = registerForActivityResult(((vi1.a) KoinJavaComponent.get$default(vi1.a.class, null, null, 6, null)).e(), new f.b(this) { // from class: uj1.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f f171552b;

            {
                this.f171552b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f fVar = this.f171552b;
                switch (i17) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                        aVar.getClass();
                        if (aVar.f67585a == 0 && (intent = aVar.f67586b) != null && intent.getBooleanExtra("extra_consent_revoked", false)) {
                            fVar.requireActivity().finish();
                            break;
                        }
                        break;
                    case 1:
                        f.a aVar3 = (f.a) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            Intent intent2 = aVar3.f67586b;
                            l20.a aVar5 = null;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent2.getParcelableExtra("EXTRA_SELECTED_EMERGENCY_CONTACT", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra = intent2.getParcelableExtra("EXTRA_SELECTED_EMERGENCY_CONTACT");
                                    parcelable = (l20.a) (parcelableExtra instanceof l20.a ? parcelableExtra : null);
                                }
                                aVar5 = (l20.a) parcelable;
                            }
                            fVar.u6().i5(aVar5);
                        }
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar6 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                        bool.getClass();
                        fVar.u6().U4(bool.booleanValue());
                        break;
                }
            }
        });
        cVarRegisterForActivityResult3.getClass();
        this.f43843f = cVarRegisterForActivityResult3;
        this.f43844g = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().b(this.f43844g, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new z3.e(583751894, true, new k0(this, 1)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        u6().V0.m(Boolean.FALSE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new c(), b0.b.RESUMED);
        String string = getString(R.string.device_settings_safety_features);
        string.getClass();
        g22.e.g(this, string);
        u6().M0.f(getViewLifecycleOwner(), new g(new j0(this, 0)));
        u6().O0.f(getViewLifecycleOwner(), new g(new j0(this, 1)));
        u6().S0.f(getViewLifecycleOwner(), new g(new j0(this, 4)));
        u6().U0.f(getViewLifecycleOwner(), new g(new j0(this, 8)));
        u6().Y0.f(getViewLifecycleOwner(), new g(new j0(this, 9)));
        u6().f137971b1.f(getViewLifecycleOwner(), new g(new j0(this, 10)));
        u6().o5();
    }

    public final s u6() {
        return (s) this.f43838a.getValue();
    }

    public final void v6(wj1.a aVar) {
        EmergencyCallingActivity.a aVar2 = EmergencyCallingActivity.f43789d;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        hl.a.c cVar = hl.a.c.f84256b;
        aVar2.getClass();
        this.f43842e.a(EmergencyCallingActivity.a.a(contextRequireContext, aVar, null, cVar), null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "LTE_DEVICE_ACTIVATED", "LTE_DEVICE_ASSISTANCE_PLUS_SUPPORTED", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

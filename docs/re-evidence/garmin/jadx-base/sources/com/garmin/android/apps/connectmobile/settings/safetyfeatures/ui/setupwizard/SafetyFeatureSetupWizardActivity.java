package com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.SafetyFeatureSetupWizardActivity;
import dv.i;
import fw.p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l20.r;
import lc.u0;
import n23.j;
import o13.h;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import pj1.s;
import pj1.y;
import r22.p0;
import yj1.l;
import z10.p3;
import zb0.n0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/setupwizard/SafetyFeatureSetupWizardActivity;", "Lz10/p3;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SafetyFeatureSetupWizardActivity extends p3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f43851k = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f43852c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f43856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f43857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w1 f43858i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43853d = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f43859j = new b();

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/setupwizard/SafetyFeatureSetupWizardActivity$b", "Landroidx/lifecycle/z0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lyj1/l;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0<g3<? extends l>> {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43861a;

            static {
                int[] iArr = new int[p.values().length];
                try {
                    iArr[p.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p.LOADING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f43861a = iArr;
            }
        }

        public b() {
        }

        @Override // androidx.lifecycle.z0
        public final void onChanged(g3<? extends l> g3Var) {
            g3<? extends l> g3Var2 = g3Var;
            g3Var2.getClass();
            int i14 = a.f43861a[g3Var2.f35300a.ordinal()];
            SafetyFeatureSetupWizardActivity safetyFeatureSetupWizardActivity = SafetyFeatureSetupWizardActivity.this;
            if (i14 != 1) {
                if (i14 == 2) {
                    safetyFeatureSetupWizardActivity.showProgressOverlay();
                    return;
                } else {
                    if (i14 != 3) {
                        u0.r();
                        return;
                    }
                    safetyFeatureSetupWizardActivity.hideProgressOverlay();
                    a aVar = SafetyFeatureSetupWizardActivity.f43851k;
                    safetyFeatureSetupWizardActivity.displayFailedMessage();
                    return;
                }
            }
            safetyFeatureSetupWizardActivity.hideProgressOverlay();
            a aVar2 = SafetyFeatureSetupWizardActivity.f43851k;
            safetyFeatureSetupWizardActivity.ka().H0.k(this);
            if (safetyFeatureSetupWizardActivity.f43856g) {
                if (safetyFeatureSetupWizardActivity.ka().N4() && safetyFeatureSetupWizardActivity.ka().f137988z) {
                    safetyFeatureSetupWizardActivity.ka().J0.j("SafetyFeaturesSetupWizardDeviceSelectionFragment");
                    return;
                }
                if (safetyFeatureSetupWizardActivity.ka().N4()) {
                    safetyFeatureSetupWizardActivity.f43853d = true;
                } else {
                    safetyFeatureSetupWizardActivity.f43854e = true;
                }
                safetyFeatureSetupWizardActivity.na();
                return;
            }
            s sVarKa = safetyFeatureSetupWizardActivity.ka();
            t tVar = sVarKa.f137975f1;
            if (!((qj1.a) tVar.getValue()).f145046a.W2("key_show_fall_detection_feature_onboarding", true)) {
                safetyFeatureSetupWizardActivity.na();
                return;
            }
            boolean z14 = sVarKa.A;
            ((qj1.a) tVar.getValue()).f145046a.O2("key_show_fall_detection_feature_onboarding", z14);
            sVarKa.f137972c1.m(Boolean.valueOf(z14));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f43862a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f43862a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43862a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43862a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f43863a;

        public d(b.g gVar) {
            this.f43863a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43863a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f43865b;

        public e(e23.a aVar, b.g gVar) {
            this.f43864a = aVar;
            this.f43865b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43864a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43865b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public SafetyFeatureSetupWizardActivity() {
        final int i14 = 0;
        this.f43857h = m.b(new e23.a(this) { // from class: zj1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SafetyFeatureSetupWizardActivity f204928b;

            {
                this.f204928b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i15 = i14;
                Object serializableExtra = null;
                SafetyFeatureSetupWizardActivity safetyFeatureSetupWizardActivity = this.f204928b;
                switch (i15) {
                    case 0:
                        SafetyFeatureSetupWizardActivity.a aVar = SafetyFeatureSetupWizardActivity.f43851k;
                        Bundle extras = safetyFeatureSetupWizardActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Object parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                            }
                            hl.a aVar2 = (hl.a) parcelable;
                            if (aVar2 != null) {
                                return aVar2;
                            }
                        }
                        return hl.a.c.f84256b;
                    default:
                        SafetyFeatureSetupWizardActivity.a aVar3 = SafetyFeatureSetupWizardActivity.f43851k;
                        long longExtra = safetyFeatureSetupWizardActivity.getIntent().getLongExtra("GCM_deviceUnitID", 0L);
                        Long lValueOf = Long.valueOf(longExtra);
                        if (longExtra <= 0) {
                            lValueOf = null;
                        }
                        Intent intent = safetyFeatureSetupWizardActivity.getIntent();
                        if (Build.VERSION.SDK_INT < 33) {
                            Object serializableExtra2 = intent != null ? intent.getSerializableExtra("GCM_extra_wizard_type") : null;
                            serializableExtra = (yj1.n) (serializableExtra2 instanceof yj1.n ? serializableExtra2 : null);
                        } else if (intent != null) {
                            serializableExtra = intent.getSerializableExtra("GCM_extra_wizard_type", yj1.n.class);
                        }
                        return new y(new yj1.m(true, lValueOf, (yj1.n) serializableExtra), safetyFeatureSetupWizardActivity.la());
                }
            }
        });
        final int i15 = 1;
        this.f43858i = new w1(s0.f105811a.b(s.class), new d(this), new e23.a(this) { // from class: zj1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SafetyFeatureSetupWizardActivity f204928b;

            {
                this.f204928b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i16 = i15;
                Object serializableExtra = null;
                SafetyFeatureSetupWizardActivity safetyFeatureSetupWizardActivity = this.f204928b;
                switch (i16) {
                    case 0:
                        SafetyFeatureSetupWizardActivity.a aVar = SafetyFeatureSetupWizardActivity.f43851k;
                        Bundle extras = safetyFeatureSetupWizardActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Object parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                            }
                            hl.a aVar2 = (hl.a) parcelable;
                            if (aVar2 != null) {
                                return aVar2;
                            }
                        }
                        return hl.a.c.f84256b;
                    default:
                        SafetyFeatureSetupWizardActivity.a aVar3 = SafetyFeatureSetupWizardActivity.f43851k;
                        long longExtra = safetyFeatureSetupWizardActivity.getIntent().getLongExtra("GCM_deviceUnitID", 0L);
                        Long lValueOf = Long.valueOf(longExtra);
                        if (longExtra <= 0) {
                            lValueOf = null;
                        }
                        Intent intent = safetyFeatureSetupWizardActivity.getIntent();
                        if (Build.VERSION.SDK_INT < 33) {
                            Object serializableExtra2 = intent != null ? intent.getSerializableExtra("GCM_extra_wizard_type") : null;
                            serializableExtra = (yj1.n) (serializableExtra2 instanceof yj1.n ? serializableExtra2 : null);
                        } else if (intent != null) {
                            serializableExtra = intent.getSerializableExtra("GCM_extra_wizard_type", yj1.n.class);
                        }
                        return new y(new yj1.m(true, lValueOf, (yj1.n) serializableExtra), safetyFeatureSetupWizardActivity.la());
                }
            }
        }, new e(null, this));
    }

    @Override // z10.p3
    public final Fragment ca() {
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.f43912d.getClass();
        return com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.a.a(true);
    }

    @Override // z10.p3
    public final String da() {
        String str = this.f43852c;
        if (str != null) {
            return str;
        }
        String string = getString(R.string.device_settings_safety_features);
        string.getClass();
        return string;
    }

    @Override // z10.p3
    public final boolean ia() {
        hl.a aVarLa = la();
        if (p005kotlin.jvm.internal.s.g(aVarLa, hl.a.c.f84256b)) {
            return false;
        }
        if (aVarLa instanceof hl.a.b) {
            return true;
        }
        u0.r();
        return false;
    }

    public final s ka() {
        return (s) this.f43858i.getValue();
    }

    public final hl.a la() {
        return (hl.a) this.f43857h.getValue();
    }

    public final void ma(Fragment fragment, String str) {
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarC = j.c(supportFragmentManager, supportFragmentManager, R.id.content_frame, fragment, str);
        if (!p005kotlin.jvm.internal.s.g(str, "SafetyFeatureSetupWizardFragment_BLANK")) {
            aVarC.d(str);
        }
        aVarC.e();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    public final void na() {
        tj1.e eVar;
        r userContactsDTO;
        List<l20.a> listF;
        l20.a aVar;
        tj1.e eVar2;
        r userContactsDTO2;
        List<l20.a> listF2;
        Object next;
        if (this.f43853d) {
            oa();
            s sVarKa = ka();
            if (!sVarKa.f137983t) {
                sVarKa.f137983t = true;
            }
            sVarKa.J0.m("AssistanceTypeFragment");
            return;
        }
        if (this.f43854e || this.f43855f) {
            oa();
            if (this.f43855f) {
                ka().b5(true);
                return;
            } else {
                s.c5(ka());
                return;
            }
        }
        s sVarKa2 = ka();
        t tVar = sVarKa2.f137975f1;
        boolean zO4 = false;
        if (!(sVarKa2.f137981q instanceof hl.a.b)) {
            if (!sVarKa2.f137982r) {
                if (sVarKa2.f137985w == null) {
                    Map<zb0.u0, vg1.t> map = n0.f203577a;
                    if (!bo1.a.a().c().t() || !sVarKa2.f137988z) {
                        zO4 = (!bo1.a.a().c().t() && sVarKa2.f137988z) ? !((qj1.a) tVar.getValue()).f145046a.W2("key_emergency_calling_setup_completed", false) : s.O4();
                    } else if (s.O4() && !((qj1.a) tVar.getValue()).f145046a.W2("key_emergency_calling_setup_completed", false)) {
                        zO4 = true;
                        break;
                    }
                } else {
                    zO4 = true;
                    break;
                }
            } else {
                g3<tj1.e> g3VarD = sVarKa2.C4().d();
                if (g3VarD != null && (eVar = g3VarD.f35301b) != null && (userContactsDTO = eVar.getUserContactsDTO()) != null && (listF = userContactsDTO.f()) != null && !listF.isEmpty()) {
                    Iterator<T> it = listF.iterator();
                    do {
                        if (!it.hasNext()) {
                            zO4 = true;
                            break;
                        }
                    } while (!ge1.b.Q((l20.a) it.next()));
                } else {
                    zO4 = true;
                    break;
                }
            }
        } else {
            g3<tj1.e> g3VarD2 = sVarKa2.C4().d();
            if (g3VarD2 == null || (eVar2 = g3VarD2.f35301b) == null || (userContactsDTO2 = eVar2.getUserContactsDTO()) == null || (listF2 = userContactsDTO2.f()) == null) {
                aVar = null;
            } else {
                Iterator<T> it3 = listF2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!p005kotlin.jvm.internal.s.g(((l20.a) next).getIsSosDefault(), Boolean.TRUE));
                aVar = (l20.a) next;
            }
            if (aVar == null) {
                zO4 = true;
                break;
            }
        }
        if (!zO4) {
            s.d5(ka(), this, "GCM_open_existing_assistance", null, 12);
            return;
        }
        this.f43852c = getString(s3.b() ? R.string.device_settings_safety_features : R.string.safety_features_setup);
        s sVarKa3 = ka();
        if (!sVarKa3.f137983t) {
            sVarKa3.f137983t = true;
        }
        boolean z14 = sVarKa3.f137982r;
        y0<String> y0Var = sVarKa3.J0;
        if (z14) {
            y0Var.j("SafetyFeatureSetupRequiredFragment");
        } else {
            y0Var.j("SafetyFeatureSetupWizardFragment");
        }
    }

    public final void oa() {
        String string = getString(s3.b() ? R.string.device_settings_safety_features : R.string.safety_features_setup);
        this.f43852c = string;
        setTitle(string);
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        this.f43853d = getIntent().getBooleanExtra("GCM_OpenAssistanceTypeScreen", false);
        this.f43855f = getIntent().getBooleanExtra("GCM_open_myinfo_Screen", false);
        getIntent().getBooleanExtra("GCM_open_existing_assistance", false);
        boolean booleanExtra = getIntent().getBooleanExtra("GCM_safety_features_continue_wizard", false);
        this.f43856g = booleanExtra;
        if (booleanExtra) {
            oa();
        }
        hl.a aVarLa = la();
        hl.a.b bVar = aVarLa instanceof hl.a.b ? (hl.a.b) aVarLa : null;
        if (bVar != null && (str = bVar.f84253c) != null) {
            ((ComposeView) findViewById(R.id.managed_account_notice)).setContent(new z3.e(759484222, true, new f20.g(bVar, str, 10)));
        }
        ka().H0.f(this, this.f43859j);
        final int i14 = 0;
        ka().O0.f(this, new c(new e23.l(this) { // from class: zj1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SafetyFeatureSetupWizardActivity f204930b;

            {
                this.f204930b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                char c14 = 1;
                SafetyFeatureSetupWizardActivity safetyFeatureSetupWizardActivity = this.f204930b;
                switch (i15) {
                    case 0:
                        SafetyFeatureSetupWizardActivity.a aVar = SafetyFeatureSetupWizardActivity.f43851k;
                        safetyFeatureSetupWizardActivity.setTitle(safetyFeatureSetupWizardActivity.getString(R.string.device_settings_safety_features));
                        p0 p0Var = new p0();
                        p0Var.showNow(safetyFeatureSetupWizardActivity.getSupportFragmentManager(), null);
                        p0Var.y6(R.string.safety_features_wizard_setup_complete, R.string.safety_features_wizard_setup_complete_message);
                        Dialog dialog = p0Var.getDialog();
                        if (dialog != null) {
                            dialog.setOnDismissListener(new uj1.f(p0Var, safetyFeatureSetupWizardActivity, c14 == true ? 1 : 0));
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        SafetyFeatureSetupWizardActivity.a aVar2 = SafetyFeatureSetupWizardActivity.f43851k;
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -2117742814:
                                    if (str2.equals("AssistanceTypeFragment")) {
                                        boolean z14 = safetyFeatureSetupWizardActivity.getSupportFragmentManager().G("SafetyFeaturesSetupWizardDeviceSelectionFragment") == null;
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n.getClass();
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b bVar2 = new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putBoolean("ARG_SHOW_EXIT_DIALOG", z14);
                                        bVar2.setArguments(bundle2);
                                        safetyFeatureSetupWizardActivity.ma(bVar2, str2);
                                    }
                                    break;
                                case -1910533203:
                                    if (str2.equals("SafetyFeaturesReviewEmergencyContactsFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f(), str2);
                                    }
                                    break;
                                case -1757308446:
                                    if (str2.equals("LTEDeviceSelectorFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c.f43732k.getClass();
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c cVar = new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putBoolean("ARG_IS_SETUP_WIZARD", true);
                                        cVar.setArguments(bundle3);
                                        cVar.setCancelable(false);
                                        cVar.show(safetyFeatureSetupWizardActivity.getSupportFragmentManager(), str2);
                                    }
                                    break;
                                case -1283079632:
                                    if (str2.equals("MyInformationFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d(), str2);
                                    }
                                    break;
                                case -945434008:
                                    if (str2.equals("SafetyFeatureSetupRequiredFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d.f43911a.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d(), str2);
                                    }
                                    break;
                                case -916202867:
                                    if (str2.equals("SafetyFeaturesSetupWizardDeviceSelectionFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g.f43936b.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g(), str2);
                                    }
                                    break;
                                case 113225280:
                                    if (str2.equals("EmergencyNotesFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c.f43896j.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c(), str2);
                                    }
                                    break;
                                case 424376988:
                                    if (str2.equals("AddContactNewUserFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.a.f43866c.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.a(), str2);
                                    }
                                    break;
                                case 708753321:
                                    if (str2.equals("SafetyFeatureSetupWizardFragment_BLANK")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.f43912d.getClass();
                                        safetyFeatureSetupWizardActivity.ma(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.a.a(true), str2);
                                    }
                                    break;
                                case 1234920052:
                                    if (str2.equals("SafetyFeatureSetupWizardFragment")) {
                                        safetyFeatureSetupWizardActivity.setTitle(safetyFeatureSetupWizardActivity.getString(R.string.device_settings_safety_features));
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.f43912d.getClass();
                                        safetyFeatureSetupWizardActivity.ma(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.a.a(false), str2);
                                    }
                                    break;
                            }
                        }
                        break;
                    default:
                        SafetyFeatureSetupWizardActivity.a aVar3 = SafetyFeatureSetupWizardActivity.f43851k;
                        if (p005kotlin.jvm.internal.s.g((Boolean) obj, Boolean.TRUE)) {
                            uj1.l.f171535g.getClass();
                            new uj1.l().show(safetyFeatureSetupWizardActivity.getSupportFragmentManager(), (String) null);
                        } else {
                            safetyFeatureSetupWizardActivity.na();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        getSupportFragmentManager().b(new i(this, 6));
        final int i15 = 1;
        ka().K0.f(this, new c(new e23.l(this) { // from class: zj1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SafetyFeatureSetupWizardActivity f204930b;

            {
                this.f204930b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                char c14 = 1;
                SafetyFeatureSetupWizardActivity safetyFeatureSetupWizardActivity = this.f204930b;
                switch (i16) {
                    case 0:
                        SafetyFeatureSetupWizardActivity.a aVar = SafetyFeatureSetupWizardActivity.f43851k;
                        safetyFeatureSetupWizardActivity.setTitle(safetyFeatureSetupWizardActivity.getString(R.string.device_settings_safety_features));
                        p0 p0Var = new p0();
                        p0Var.showNow(safetyFeatureSetupWizardActivity.getSupportFragmentManager(), null);
                        p0Var.y6(R.string.safety_features_wizard_setup_complete, R.string.safety_features_wizard_setup_complete_message);
                        Dialog dialog = p0Var.getDialog();
                        if (dialog != null) {
                            dialog.setOnDismissListener(new uj1.f(p0Var, safetyFeatureSetupWizardActivity, c14 == true ? 1 : 0));
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        SafetyFeatureSetupWizardActivity.a aVar2 = SafetyFeatureSetupWizardActivity.f43851k;
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -2117742814:
                                    if (str2.equals("AssistanceTypeFragment")) {
                                        boolean z14 = safetyFeatureSetupWizardActivity.getSupportFragmentManager().G("SafetyFeaturesSetupWizardDeviceSelectionFragment") == null;
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n.getClass();
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b bVar2 = new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putBoolean("ARG_SHOW_EXIT_DIALOG", z14);
                                        bVar2.setArguments(bundle2);
                                        safetyFeatureSetupWizardActivity.ma(bVar2, str2);
                                    }
                                    break;
                                case -1910533203:
                                    if (str2.equals("SafetyFeaturesReviewEmergencyContactsFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f(), str2);
                                    }
                                    break;
                                case -1757308446:
                                    if (str2.equals("LTEDeviceSelectorFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c.f43732k.getClass();
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c cVar = new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putBoolean("ARG_IS_SETUP_WIZARD", true);
                                        cVar.setArguments(bundle3);
                                        cVar.setCancelable(false);
                                        cVar.show(safetyFeatureSetupWizardActivity.getSupportFragmentManager(), str2);
                                    }
                                    break;
                                case -1283079632:
                                    if (str2.equals("MyInformationFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d(), str2);
                                    }
                                    break;
                                case -945434008:
                                    if (str2.equals("SafetyFeatureSetupRequiredFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d.f43911a.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d(), str2);
                                    }
                                    break;
                                case -916202867:
                                    if (str2.equals("SafetyFeaturesSetupWizardDeviceSelectionFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g.f43936b.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g(), str2);
                                    }
                                    break;
                                case 113225280:
                                    if (str2.equals("EmergencyNotesFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c.f43896j.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c(), str2);
                                    }
                                    break;
                                case 424376988:
                                    if (str2.equals("AddContactNewUserFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.a.f43866c.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.a(), str2);
                                    }
                                    break;
                                case 708753321:
                                    if (str2.equals("SafetyFeatureSetupWizardFragment_BLANK")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.f43912d.getClass();
                                        safetyFeatureSetupWizardActivity.ma(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.a.a(true), str2);
                                    }
                                    break;
                                case 1234920052:
                                    if (str2.equals("SafetyFeatureSetupWizardFragment")) {
                                        safetyFeatureSetupWizardActivity.setTitle(safetyFeatureSetupWizardActivity.getString(R.string.device_settings_safety_features));
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.f43912d.getClass();
                                        safetyFeatureSetupWizardActivity.ma(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.a.a(false), str2);
                                    }
                                    break;
                            }
                        }
                        break;
                    default:
                        SafetyFeatureSetupWizardActivity.a aVar3 = SafetyFeatureSetupWizardActivity.f43851k;
                        if (p005kotlin.jvm.internal.s.g((Boolean) obj, Boolean.TRUE)) {
                            uj1.l.f171535g.getClass();
                            new uj1.l().show(safetyFeatureSetupWizardActivity.getSupportFragmentManager(), (String) null);
                        } else {
                            safetyFeatureSetupWizardActivity.na();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i16 = 2;
        ka().f137973d1.f(this, new c(new e23.l(this) { // from class: zj1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SafetyFeatureSetupWizardActivity f204930b;

            {
                this.f204930b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                char c14 = 1;
                SafetyFeatureSetupWizardActivity safetyFeatureSetupWizardActivity = this.f204930b;
                switch (i17) {
                    case 0:
                        SafetyFeatureSetupWizardActivity.a aVar = SafetyFeatureSetupWizardActivity.f43851k;
                        safetyFeatureSetupWizardActivity.setTitle(safetyFeatureSetupWizardActivity.getString(R.string.device_settings_safety_features));
                        p0 p0Var = new p0();
                        p0Var.showNow(safetyFeatureSetupWizardActivity.getSupportFragmentManager(), null);
                        p0Var.y6(R.string.safety_features_wizard_setup_complete, R.string.safety_features_wizard_setup_complete_message);
                        Dialog dialog = p0Var.getDialog();
                        if (dialog != null) {
                            dialog.setOnDismissListener(new uj1.f(p0Var, safetyFeatureSetupWizardActivity, c14 == true ? 1 : 0));
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        SafetyFeatureSetupWizardActivity.a aVar2 = SafetyFeatureSetupWizardActivity.f43851k;
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -2117742814:
                                    if (str2.equals("AssistanceTypeFragment")) {
                                        boolean z14 = safetyFeatureSetupWizardActivity.getSupportFragmentManager().G("SafetyFeaturesSetupWizardDeviceSelectionFragment") == null;
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n.getClass();
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b bVar2 = new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putBoolean("ARG_SHOW_EXIT_DIALOG", z14);
                                        bVar2.setArguments(bundle2);
                                        safetyFeatureSetupWizardActivity.ma(bVar2, str2);
                                    }
                                    break;
                                case -1910533203:
                                    if (str2.equals("SafetyFeaturesReviewEmergencyContactsFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f(), str2);
                                    }
                                    break;
                                case -1757308446:
                                    if (str2.equals("LTEDeviceSelectorFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c.f43732k.getClass();
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c cVar = new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putBoolean("ARG_IS_SETUP_WIZARD", true);
                                        cVar.setArguments(bundle3);
                                        cVar.setCancelable(false);
                                        cVar.show(safetyFeatureSetupWizardActivity.getSupportFragmentManager(), str2);
                                    }
                                    break;
                                case -1283079632:
                                    if (str2.equals("MyInformationFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d(), str2);
                                    }
                                    break;
                                case -945434008:
                                    if (str2.equals("SafetyFeatureSetupRequiredFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d.f43911a.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d(), str2);
                                    }
                                    break;
                                case -916202867:
                                    if (str2.equals("SafetyFeaturesSetupWizardDeviceSelectionFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g.f43936b.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g(), str2);
                                    }
                                    break;
                                case 113225280:
                                    if (str2.equals("EmergencyNotesFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c.f43896j.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c(), str2);
                                    }
                                    break;
                                case 424376988:
                                    if (str2.equals("AddContactNewUserFragment")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.a.f43866c.getClass();
                                        safetyFeatureSetupWizardActivity.ma(new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.a(), str2);
                                    }
                                    break;
                                case 708753321:
                                    if (str2.equals("SafetyFeatureSetupWizardFragment_BLANK")) {
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.f43912d.getClass();
                                        safetyFeatureSetupWizardActivity.ma(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.a.a(true), str2);
                                    }
                                    break;
                                case 1234920052:
                                    if (str2.equals("SafetyFeatureSetupWizardFragment")) {
                                        safetyFeatureSetupWizardActivity.setTitle(safetyFeatureSetupWizardActivity.getString(R.string.device_settings_safety_features));
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.f43912d.getClass();
                                        safetyFeatureSetupWizardActivity.ma(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.a.a(false), str2);
                                    }
                                    break;
                            }
                        }
                        break;
                    default:
                        SafetyFeatureSetupWizardActivity.a aVar3 = SafetyFeatureSetupWizardActivity.f43851k;
                        if (p005kotlin.jvm.internal.s.g((Boolean) obj, Boolean.TRUE)) {
                            uj1.l.f171535g.getClass();
                            new uj1.l().show(safetyFeatureSetupWizardActivity.getSupportFragmentManager(), (String) null);
                        } else {
                            safetyFeatureSetupWizardActivity.na();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/setupwizard/SafetyFeatureSetupWizardActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, hl.a aVar) {
            context.getClass();
            aVar.getClass();
            Intent intent = new Intent(context, (Class<?>) SafetyFeatureSetupWizardActivity.class);
            intent.putExtra("GCM_extra_screen_access_role", aVar);
            return intent;
        }

        private a() {
        }
    }
}

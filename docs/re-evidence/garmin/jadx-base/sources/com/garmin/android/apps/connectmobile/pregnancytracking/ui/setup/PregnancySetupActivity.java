package com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.reminders.MenstrualCycleReminders;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyGenesisActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupGenesisActivity;
import e23.l;
import fw.p;
import java.util.ArrayList;
import lc.u0;
import o13.h;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import qb1.a0;
import qb1.c0;
import rd2.j;
import z6.h0;
import zb0.n0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/setup/PregnancySetupActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lqb1/a0;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/setup/a$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PregnancySetupActivity extends com.garmin.android.apps.connectmobile.c implements a0, com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.a.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f40934g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f40936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f40937c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40940f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f40935a = e.TERMS_CONDITIONS;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f40938d = m.b(new q42.d(this, 5));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f40942b;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40941a = iArr;
            int[] iArr2 = new int[e.values().length];
            try {
                iArr2[e.TERMS_CONDITIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[e.DUE_DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[e.HYDRATION_GOALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[e.WEIGHT_GAIN_GOALS.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[e.INDEX_SCALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[e.TRAINING_STATUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[e.MOVE_ALERTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            f40942b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f40943a;

        public c(l lVar) {
            lVar.getClass();
            this.f40943a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f40943a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40943a.invoke(obj);
        }
    }

    public static Bundle fa() {
        Bundle bundle = new Bundle();
        bundle.putInt("DRAWABLE_RES_KEY", 2131232783);
        bundle.putInt("PAGE_TITLE_KEY", R.string.pregnancy_and_training_status_title);
        bundle.putInt("PAGE_DESCRIPTION_KEY", R.string.pregnancy_training_status_message);
        bundle.putInt("RADIO_BUTTON_TITLE", R.string.training_status_pause_prompt);
        bundle.putBoolean("RADIO_BUTTON_VALUE", true);
        return bundle;
    }

    public static void ja(PregnancySetupActivity pregnancySetupActivity, Fragment fragment, String str) {
        v supportFragmentManager = pregnancySetupActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.d(str);
        aVar.l(R.id.pregnancy_setup_container, fragment, str);
        aVar.s(true, true);
    }

    @Override // qb1.a0
    public final void E8() {
        ha();
    }

    public final qb1.f ca() {
        return (qb1.f) this.f40938d.getValue();
    }

    public final o13.p<e, Bundle> da() {
        DeviceSettingsDTO deviceSettingsDTO = ca().f144068l;
        String productDisplayName = null;
        if (deviceSettingsDTO != null && !deviceSettingsDTO.t1()) {
            e eVar = e.MOVE_ALERTS;
            long j8 = deviceSettingsDTO.f33860a;
            rd2.f.a().f152045a.getClass();
            sd2.f fVarI = j.i(j8, null);
            if (fVarI != null) {
                productDisplayName = TextUtils.isEmpty(fVarI.getDisplayName()) ? fVarI.getProductDisplayName() : fVarI.getDisplayName();
            }
            if (productDisplayName == null) {
                productDisplayName = "";
            }
            Bundle bundleE = am.j.e(2131233352, "DRAWABLE_RES_KEY");
            String string = getString(R.string.pregnancy_move_alerts_title, productDisplayName);
            string.getClass();
            bundleE.putString("PAGE_TITLE_STRING", string);
            bundleE.putInt("PAGE_DESCRIPTION_KEY", R.string.pregnancy_move_alert_body);
            bundleE.putInt("RADIO_BUTTON_TITLE", R.string.device_settings_move_alert);
            bundleE.putBoolean("RADIO_BUTTON_VALUE", true);
            return new o13.p<>(eVar, bundleE);
        }
        return new o13.p<>(null, null);
    }

    public final o13.p<e, Bundle> ea() {
        boolean z14;
        switch (b.f40942b[this.f40935a.ordinal()]) {
            case 1:
                return new o13.p<>(e.DUE_DATE, null);
            case 2:
                op0.c cVar = ca().f144065i;
                if (cVar == null) {
                    return new o13.p<>(e.HYDRATION_GOALS, null);
                }
                q22.b bVarH = jp0.c.h(cVar.i());
                Double baseGoalInML = cVar.getBaseGoalInML();
                if (baseGoalInML == null || Double.isNaN(baseGoalInML.doubleValue())) {
                    baseGoalInML = Double.valueOf(jp0.c.n(bVarH));
                    z14 = true;
                } else {
                    z14 = false;
                }
                double dRint = Math.rint(q22.a.a(baseGoalInML.doubleValue(), q22.b.MILLILITER, bVarH));
                int i14 = jp0.c.a.f99876c[bVarH.ordinal()];
                if (i14 == 1 ? dRint >= 80.0d : !(i14 == 2 ? dRint < 10.0d : i14 != 3 || dRint < 2366.0d)) {
                    if (!z14) {
                        return new o13.p<>(e.WEIGHT_GAIN_GOALS, null);
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putDouble("EXTRA_HYDRATION_GOAL", baseGoalInML.doubleValue());
                bundle.putInt("EXTRA_HYDRATION_MEASUREMENT_UNIT", bVarH.ordinal());
                return new o13.p<>(e.HYDRATION_GOALS, bundle);
            case 3:
                return new o13.p<>(e.WEIGHT_GAIN_GOALS, null);
            case 4:
                if (ca().B) {
                    return new o13.p<>(e.INDEX_SCALE, null);
                }
                if (n0.h()) {
                    f12.l.f68084a.getClass();
                    String strV0 = f12.l.a.a().V0();
                    if (strV0 == null || strV0.length() == 0) {
                        return new o13.p<>(e.TRAINING_STATUS, fa());
                    }
                }
                f12.l.f68084a.getClass();
                return f12.l.a.a().s4() != -1 ? da() : new o13.p<>(null, null);
            case 5:
                if (n0.h()) {
                    f12.l.f68084a.getClass();
                    String strV1 = f12.l.a.a().V0();
                    if (strV1 == null || strV1.length() == 0) {
                        return new o13.p<>(e.TRAINING_STATUS, fa());
                    }
                }
                f12.l.f68084a.getClass();
                return f12.l.a.a().s4() != -1 ? da() : new o13.p<>(null, null);
            case 6:
                f12.l.f68084a.getClass();
                return f12.l.a.a().s4() != -1 ? da() : new o13.p<>(null, null);
            default:
                return new o13.p<>(null, null);
        }
    }

    public final void ga(e eVar, Bundle bundle) {
        int[] iArr = b.f40942b;
        int iOrdinal = eVar.ordinal();
        String str = eVar.f40981a;
        switch (iArr[iOrdinal]) {
            case 1:
                c0 c0Var = new c0();
                v supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.l(R.id.pregnancy_setup_container, c0Var, str);
                aVar.s(true, true);
                break;
            case 2:
                ja(this, new qb1.e(), str);
                break;
            case 3:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.b.f40952i.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.b bVar = new com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.b();
                bVar.setArguments(bundle);
                ja(this, bVar, str);
                break;
            case 4:
                f.f40985j.getClass();
                f fVar = new f();
                fVar.setArguments(bundle);
                ja(this, fVar, str);
                break;
            case 5:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.c.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.c.f40965f;
                DeviceSettingsDTO deviceSettingsDTO = ca().f144066j;
                aVar2.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.c cVar = new com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.c();
                if (deviceSettingsDTO != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("DEVICE_SETTING_KEY", deviceSettingsDTO);
                    cVar.setArguments(bundle2);
                }
                ja(this, cVar, str);
                break;
            case 6:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.a.f40946f.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.a aVar3 = new com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.a();
                if (bundle != null) {
                    aVar3.setArguments(bundle);
                }
                ja(this, aVar3, str);
                break;
            case 7:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.a.f40946f.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.a aVar4 = new com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.a();
                if (bundle != null) {
                    aVar4.setArguments(bundle);
                }
                ja(this, aVar4, str);
                break;
            default:
                u0.r();
                return;
        }
        ((y0) ca().f144058b.getValue()).m(eVar);
    }

    public final void ha() {
        o13.p<e, Bundle> pVarEa = ea();
        e eVar = pVarEa.f128594a;
        Bundle bundle = pVarEa.f128595b;
        if (eVar == null) {
            ca().M4();
        }
        if (eVar != null) {
            ga(eVar, bundle);
        }
    }

    public final void ia(boolean z14) {
        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
        Intent intent = new Intent(this, (Class<?>) DashboardActivity.class);
        intent.addFlags(67108864);
        h0 h0VarE = h0.e(this);
        ArrayList<Intent> arrayList = h0VarE.f202637a;
        arrayList.add(intent);
        arrayList.add(PregnancyGenesisActivity.a.a(PregnancyGenesisActivity.f40516b, this, false, false, null, z14, false, 94));
        h0VarE.g();
    }

    @Override // com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.a.b
    public final void j7(String str, boolean z14) {
        if (s.g(e.TRAINING_STATUS.f40981a, str)) {
            ca().A = z14;
        } else if (s.g(e.MOVE_ALERTS.f40981a, str)) {
            ca().f144080z = z14;
        }
        ha();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().M() <= 0) {
            finish();
            return;
        }
        getSupportFragmentManager().b0();
        e.a aVar = e.f40972d;
        Fragment fragmentF = getSupportFragmentManager().F(R.id.pregnancy_setup_container);
        e eVar = null;
        String tag = fragmentF != null ? fragmentF.getTag() : null;
        aVar.getClass();
        if (tag != null) {
            for (e eVar2 : e.values()) {
                if (s.g(eVar2.f40981a, tag)) {
                    eVar = eVar2;
                    break;
                }
            }
        }
        if (eVar != null) {
            ((y0) ca().f144058b.getValue()).m(eVar);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pregnancy_setup);
        i52.a.f91796a.getClass();
        i52.a.f91797b.edit().putBoolean(i52.a.c(R.string.key_has_user_seen_awareness_banner), true).apply();
        Bundle extras = getIntent().getExtras();
        this.f40940f = extras != null ? extras.getInt("EXTRA_RETRY_COUNTER", 0) : 0;
        initActionBar(R.string.mct_setup, 2);
        View viewFindViewById = findViewById(R.id.pregnancy_setup_next_button);
        viewFindViewById.getClass();
        this.f40936b = (Button) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.pregnancy_setup_borderless_button);
        viewFindViewById2.getClass();
        this.f40937c = (Button) viewFindViewById2;
        if (ea().f128594a == null) {
            Button button = this.f40936b;
            if (button == null) {
                s.m("mNextButton");
                throw null;
            }
            button.setText(getString(R.string.lbl_finish));
        }
        Button button2 = this.f40936b;
        if (button2 == null) {
            s.m("mNextButton");
            throw null;
        }
        final int i14 = 0;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: qb1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PregnancySetupActivity f144038b;

            {
                this.f144038b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        PregnancySetupActivity pregnancySetupActivity = this.f144038b;
                        if (!pregnancySetupActivity.f40935a.f40982b) {
                            pregnancySetupActivity.ha();
                            return;
                        }
                        androidx.lifecycle.n0 n0VarG = pregnancySetupActivity.getSupportFragmentManager().G(pregnancySetupActivity.f40935a.f40981a);
                        if (n0VarG instanceof b0) {
                            ((b0) n0VarG).i0();
                            return;
                        }
                        return;
                    default:
                        PregnancySetupActivity pregnancySetupActivity2 = this.f144038b;
                        if (!pregnancySetupActivity2.f40935a.f40983c) {
                            pregnancySetupActivity2.ha();
                            return;
                        }
                        androidx.lifecycle.n0 n0VarG2 = pregnancySetupActivity2.getSupportFragmentManager().G(pregnancySetupActivity2.f40935a.f40981a);
                        if (n0VarG2 instanceof b0) {
                            ((b0) n0VarG2).r0();
                            if (p005kotlin.jvm.internal.s.g(pregnancySetupActivity2.f40935a.f40981a, com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.e.INDEX_SCALE.f40981a)) {
                                Button button3 = pregnancySetupActivity2.f40937c;
                                if (button3 != null) {
                                    button3.setVisibility(8);
                                    return;
                                } else {
                                    p005kotlin.jvm.internal.s.m("mSkipButton");
                                    throw null;
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        Button button3 = this.f40937c;
        if (button3 == null) {
            s.m("mSkipButton");
            throw null;
        }
        final int i15 = 1;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: qb1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PregnancySetupActivity f144038b;

            {
                this.f144038b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        PregnancySetupActivity pregnancySetupActivity = this.f144038b;
                        if (!pregnancySetupActivity.f40935a.f40982b) {
                            pregnancySetupActivity.ha();
                            return;
                        }
                        androidx.lifecycle.n0 n0VarG = pregnancySetupActivity.getSupportFragmentManager().G(pregnancySetupActivity.f40935a.f40981a);
                        if (n0VarG instanceof b0) {
                            ((b0) n0VarG).i0();
                            return;
                        }
                        return;
                    default:
                        PregnancySetupActivity pregnancySetupActivity2 = this.f144038b;
                        if (!pregnancySetupActivity2.f40935a.f40983c) {
                            pregnancySetupActivity2.ha();
                            return;
                        }
                        androidx.lifecycle.n0 n0VarG2 = pregnancySetupActivity2.getSupportFragmentManager().G(pregnancySetupActivity2.f40935a.f40981a);
                        if (n0VarG2 instanceof b0) {
                            ((b0) n0VarG2).r0();
                            if (p005kotlin.jvm.internal.s.g(pregnancySetupActivity2.f40935a.f40981a, com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.e.INDEX_SCALE.f40981a)) {
                                Button button4 = pregnancySetupActivity2.f40937c;
                                if (button4 != null) {
                                    button4.setVisibility(8);
                                    return;
                                } else {
                                    p005kotlin.jvm.internal.s.m("mSkipButton");
                                    throw null;
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        final int i16 = 0;
        ((y0) ca().f144058b.getValue()).f(this, new c(new l(this) { // from class: qb1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PregnancySetupActivity f144040b;

            {
                this.f144040b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                db1.c cVar;
                int i17 = i16;
                final int i18 = 4;
                final PregnancySetupActivity pregnancySetupActivity = this.f144040b;
                final int i19 = 2;
                final int i24 = 1;
                final int i25 = 3;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.e eVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.e) obj;
                        PregnancySetupActivity.a aVar = PregnancySetupActivity.f40934g;
                        eVar.getClass();
                        pregnancySetupActivity.f40935a = eVar;
                        int i26 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.e.b.f40984a[eVar.ordinal()];
                        if (i26 == 1) {
                            cVar = new db1.c(R.string.wallet_terms_and_conditions_title, 0, 8, R.string.lbl_next, 0, 16, null);
                        } else if (i26 == 2) {
                            cVar = new db1.c(R.string.mct_setup, 0, 0, R.string.lbl_next, R.string.pregnancy_keep_hydration_goal);
                        } else if (i26 != 3) {
                            cVar = i26 != 4 ? new db1.c(R.string.mct_setup, 0, 8, R.string.lbl_next, 0, 16, null) : new db1.c(R.string.mct_setup, 0, 8, R.string.lbl_finish, 0, 16, null);
                        } else {
                            cVar = new db1.c(R.string.mct_setup, 0, 0, R.string.lbl_next, R.string.pregnancy_index_scale_settings);
                        }
                        pregnancySetupActivity.updateActionBarTitle(pregnancySetupActivity.getString(cVar.f58989a));
                        Button button4 = pregnancySetupActivity.f40936b;
                        if (button4 == null) {
                            p005kotlin.jvm.internal.s.m("mNextButton");
                            throw null;
                        }
                        button4.setVisibility(cVar.f58990b);
                        Button button5 = pregnancySetupActivity.f40936b;
                        if (button5 == null) {
                            p005kotlin.jvm.internal.s.m("mNextButton");
                            throw null;
                        }
                        button5.setText(pregnancySetupActivity.getString(cVar.f58992d));
                        Button button6 = pregnancySetupActivity.f40937c;
                        if (button6 == null) {
                            p005kotlin.jvm.internal.s.m("mSkipButton");
                            throw null;
                        }
                        button6.setVisibility(cVar.f58991c);
                        Button button7 = pregnancySetupActivity.f40937c;
                        if (button7 == null) {
                            p005kotlin.jvm.internal.s.m("mSkipButton");
                            throw null;
                        }
                        button7.setText(pregnancySetupActivity.getString(cVar.f58993e));
                        if (eVar == com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.e.HYDRATION_GOALS) {
                            tb1.e.a aVar2 = tb1.e.f163745a;
                            op0.c cVar2 = pregnancySetupActivity.ca().f144065i;
                            Double baseGoalInML = cVar2 != null ? cVar2.getBaseGoalInML() : null;
                            aVar2.getClass();
                            if (baseGoalInML == null || Double.isNaN(baseGoalInML.doubleValue())) {
                                Button button8 = pregnancySetupActivity.f40937c;
                                if (button8 == null) {
                                    p005kotlin.jvm.internal.s.m("mSkipButton");
                                    throw null;
                                }
                                button8.setText(pregnancySetupActivity.getString(R.string.lbl_skip_button));
                            }
                        }
                        if (pregnancySetupActivity.ea().f128594a == null) {
                            Button button9 = pregnancySetupActivity.f40936b;
                            if (button9 == null) {
                                p005kotlin.jvm.internal.s.m("mNextButton");
                                throw null;
                            }
                            button9.setText(pregnancySetupActivity.getString(R.string.lbl_finish));
                        }
                        return Unit.INSTANCE;
                    case 1:
                        fw.m mVar = (fw.m) obj;
                        PregnancySetupActivity.a aVar3 = PregnancySetupActivity.f40934g;
                        int i27 = PregnancySetupActivity.b.f40941a[mVar.f73769b.ordinal()];
                        if (i27 == 1) {
                            pregnancySetupActivity.showProgressOverlay();
                        } else if (i27 == 2) {
                            pregnancySetupActivity.hideProgressOverlay();
                        } else {
                            if (i27 != 3) {
                                u0.r();
                                return null;
                            }
                            pregnancySetupActivity.hideProgressOverlay();
                            g22.a.a(pregnancySetupActivity, mVar.f73771d);
                        }
                        return Unit.INSTANCE;
                    default:
                        fw.m mVar2 = (fw.m) obj;
                        PregnancySetupActivity.a aVar4 = PregnancySetupActivity.f40934g;
                        int i28 = PregnancySetupActivity.b.f40941a[mVar2.f73769b.ordinal()];
                        if (i28 != 1) {
                            final int i29 = 0;
                            if (i28 == 2) {
                                pregnancySetupActivity.hideProgressOverlay();
                                i52.a.f91796a.getClass();
                                f12.l.f68084a.getClass();
                                f12.l.a.a().e4(true);
                                MenstrualCycleReminders.a aVar5 = MenstrualCycleReminders.f39205a;
                                GarminConnectMobileApp.f28685g.getClass();
                                Context contextA = GarminConnectMobileApp.a.a();
                                aVar5.getClass();
                                MenstrualCycleReminders.a.a(contextA);
                                pregnancySetupActivity.ia(false);
                            } else {
                                if (i28 != 3) {
                                    u0.r();
                                    return null;
                                }
                                pregnancySetupActivity.hideProgressOverlay();
                                a aVar6 = (a) mVar2.f73770c;
                                if (aVar6 != null && aVar6.f144033e) {
                                    androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_error_saving_title).setMessage(R.string.pregnancy_error_saving_message).setPositiveButton(R.string.common_button_ok, new mt0.y(25)).create();
                                    eVarCreate.setCanceledOnTouchOutside(false);
                                    eVarCreate.show();
                                } else if (aVar6 != null && aVar6.f144034f) {
                                    DataStorageConsentActivity.a.c(DataStorageConsentActivity.f32194t, pregnancySetupActivity);
                                } else if (aVar6 == null || !aVar6.f144029a) {
                                    if (aVar6 == null || !aVar6.f144030b) {
                                        if (aVar6 != null && aVar6.f144032d) {
                                            androidx.appcompat.app.e eVarCreate2 = new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_weight_gain_goals).setMessage(R.string.pregnancy_weight_gain_goal_not_activated).setPositiveButton(R.string.action_settings, new DialogInterface.OnClickListener() { // from class: qb1.b
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i30) {
                                                    int i34 = i29;
                                                    PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                                    switch (i34) {
                                                        case 0:
                                                            PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                            h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                            Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                            ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                            arrayList.add(intent);
                                                            MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                            aVar8.getClass();
                                                            arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                            h0VarE.g();
                                                            break;
                                                        case 1:
                                                            PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.ia(false);
                                                            break;
                                                        case 2:
                                                            pregnancySetupActivity2.f40939e++;
                                                            pregnancySetupActivity2.ca().M4();
                                                            dialogInterface.dismiss();
                                                            break;
                                                        case 3:
                                                            PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.finish();
                                                            break;
                                                        case 4:
                                                            pregnancySetupActivity2.f40940f++;
                                                            pregnancySetupActivity2.ca().M4();
                                                            dialogInterface.dismiss();
                                                            break;
                                                        case 5:
                                                            PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                            break;
                                                        default:
                                                            PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                            pregnancySetupActivity2.ia(true);
                                                            dialogInterface.dismiss();
                                                            break;
                                                    }
                                                }
                                            }).setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: qb1.b
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i30) {
                                                    int i34 = i24;
                                                    PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                                    switch (i34) {
                                                        case 0:
                                                            PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                            h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                            Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                            ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                            arrayList.add(intent);
                                                            MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                            aVar8.getClass();
                                                            arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                            h0VarE.g();
                                                            break;
                                                        case 1:
                                                            PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.ia(false);
                                                            break;
                                                        case 2:
                                                            pregnancySetupActivity2.f40939e++;
                                                            pregnancySetupActivity2.ca().M4();
                                                            dialogInterface.dismiss();
                                                            break;
                                                        case 3:
                                                            PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.finish();
                                                            break;
                                                        case 4:
                                                            pregnancySetupActivity2.f40940f++;
                                                            pregnancySetupActivity2.ca().M4();
                                                            dialogInterface.dismiss();
                                                            break;
                                                        case 5:
                                                            PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                            break;
                                                        default:
                                                            PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                            pregnancySetupActivity2.ia(true);
                                                            dialogInterface.dismiss();
                                                            break;
                                                    }
                                                }
                                            }).create();
                                            eVarCreate2.setCanceledOnTouchOutside(false);
                                            eVarCreate2.show();
                                        }
                                        if (aVar6 != null && aVar6.f144031c) {
                                            new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_hydration_goal_not_updated).setMessage(R.string.pregnancy_hydration_goal_error_message).setPositiveButton(R.string.lbl_ok, new pk1.t(4, aVar6, pregnancySetupActivity)).create().show();
                                        }
                                    } else if (pregnancySetupActivity.f40940f < 3) {
                                        androidx.appcompat.app.e eVarCreate3 = new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_something_went_wrong).setMessage(R.string.connect_iq_try_again).setPositiveButton(R.string.lbl_retry, new DialogInterface.OnClickListener() { // from class: qb1.b
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i30) {
                                                int i34 = i18;
                                                PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                                switch (i34) {
                                                    case 0:
                                                        PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                        h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                        Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                        ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                        arrayList.add(intent);
                                                        MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                        aVar8.getClass();
                                                        arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                        h0VarE.g();
                                                        break;
                                                    case 1:
                                                        PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.ia(false);
                                                        break;
                                                    case 2:
                                                        pregnancySetupActivity2.f40939e++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 3:
                                                        PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.finish();
                                                        break;
                                                    case 4:
                                                        pregnancySetupActivity2.f40940f++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 5:
                                                        PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                        break;
                                                    default:
                                                        PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                        pregnancySetupActivity2.ia(true);
                                                        dialogInterface.dismiss();
                                                        break;
                                                }
                                            }
                                        }).setNegativeButton(R.string.lbl_cancel, new mt0.y(27)).create();
                                        eVarCreate3.setCanceledOnTouchOutside(false);
                                        eVarCreate3.show();
                                    } else {
                                        final int i30 = 5;
                                        androidx.appcompat.app.e.a positiveButton = new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_set_up_again).setMessage(R.string.pregnancy_error_saving_details_message).setPositiveButton(R.string.mct_set_up, new DialogInterface.OnClickListener() { // from class: qb1.b
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i34) {
                                                int i35 = i30;
                                                PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                                switch (i35) {
                                                    case 0:
                                                        PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                        h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                        Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                        ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                        arrayList.add(intent);
                                                        MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                        aVar8.getClass();
                                                        arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                        h0VarE.g();
                                                        break;
                                                    case 1:
                                                        PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.ia(false);
                                                        break;
                                                    case 2:
                                                        pregnancySetupActivity2.f40939e++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 3:
                                                        PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.finish();
                                                        break;
                                                    case 4:
                                                        pregnancySetupActivity2.f40940f++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 5:
                                                        PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                        break;
                                                    default:
                                                        PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                        pregnancySetupActivity2.ia(true);
                                                        dialogInterface.dismiss();
                                                        break;
                                                }
                                            }
                                        });
                                        final int i34 = 6;
                                        androidx.appcompat.app.e eVarCreate4 = positiveButton.setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: qb1.b
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i35) {
                                                int i36 = i34;
                                                PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                                switch (i36) {
                                                    case 0:
                                                        PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                        h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                        Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                        ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                        arrayList.add(intent);
                                                        MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                        aVar8.getClass();
                                                        arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                        h0VarE.g();
                                                        break;
                                                    case 1:
                                                        PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.ia(false);
                                                        break;
                                                    case 2:
                                                        pregnancySetupActivity2.f40939e++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 3:
                                                        PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.finish();
                                                        break;
                                                    case 4:
                                                        pregnancySetupActivity2.f40940f++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 5:
                                                        PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                        break;
                                                    default:
                                                        PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                        pregnancySetupActivity2.ia(true);
                                                        dialogInterface.dismiss();
                                                        break;
                                                }
                                            }
                                        }).create();
                                        eVarCreate4.setCanceledOnTouchOutside(false);
                                        eVarCreate4.show();
                                    }
                                } else if (pregnancySetupActivity.f40939e < 3) {
                                    androidx.appcompat.app.e eVarCreate5 = new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_something_went_wrong).setMessage(R.string.connect_iq_try_again).setPositiveButton(R.string.lbl_retry, new DialogInterface.OnClickListener() { // from class: qb1.b
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i35) {
                                            int i36 = i19;
                                            PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                            switch (i36) {
                                                case 0:
                                                    PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                    h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                    com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                    Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                    ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                    arrayList.add(intent);
                                                    MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                    aVar8.getClass();
                                                    arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                    h0VarE.g();
                                                    break;
                                                case 1:
                                                    PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.ia(false);
                                                    break;
                                                case 2:
                                                    pregnancySetupActivity2.f40939e++;
                                                    pregnancySetupActivity2.ca().M4();
                                                    dialogInterface.dismiss();
                                                    break;
                                                case 3:
                                                    PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.finish();
                                                    break;
                                                case 4:
                                                    pregnancySetupActivity2.f40940f++;
                                                    pregnancySetupActivity2.ca().M4();
                                                    dialogInterface.dismiss();
                                                    break;
                                                case 5:
                                                    PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                    break;
                                                default:
                                                    PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                    pregnancySetupActivity2.ia(true);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton(R.string.lbl_cancel, new mt0.y(26)).create();
                                    eVarCreate5.setCanceledOnTouchOutside(false);
                                    eVarCreate5.show();
                                } else {
                                    androidx.appcompat.app.e eVarCreate6 = new androidx.appcompat.app.e.a(pregnancySetupActivity).setMessage(R.string.pregnancy_something_went_wrong).setPositiveButton(R.string.lbl_ok, new DialogInterface.OnClickListener() { // from class: qb1.b
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i35) {
                                            int i36 = i25;
                                            PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                            switch (i36) {
                                                case 0:
                                                    PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                    h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                    com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                    Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                    ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                    arrayList.add(intent);
                                                    MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                    aVar8.getClass();
                                                    arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                    h0VarE.g();
                                                    break;
                                                case 1:
                                                    PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.ia(false);
                                                    break;
                                                case 2:
                                                    pregnancySetupActivity2.f40939e++;
                                                    pregnancySetupActivity2.ca().M4();
                                                    dialogInterface.dismiss();
                                                    break;
                                                case 3:
                                                    PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.finish();
                                                    break;
                                                case 4:
                                                    pregnancySetupActivity2.f40940f++;
                                                    pregnancySetupActivity2.ca().M4();
                                                    dialogInterface.dismiss();
                                                    break;
                                                case 5:
                                                    PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                    break;
                                                default:
                                                    PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                    pregnancySetupActivity2.ia(true);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    }).setCancelable(false).create();
                                    eVarCreate6.setCanceledOnTouchOutside(false);
                                    eVarCreate6.show();
                                }
                            }
                        } else {
                            pregnancySetupActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i17 = 1;
        ((y0) ca().f144059c.getValue()).f(this, new c(new l(this) { // from class: qb1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PregnancySetupActivity f144040b;

            {
                this.f144040b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                db1.c cVar;
                int i18 = i17;
                final int i19 = 4;
                final PregnancySetupActivity pregnancySetupActivity = this.f144040b;
                final int i110 = 2;
                final int i24 = 1;
                final int i25 = 3;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.e eVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.e) obj;
                        PregnancySetupActivity.a aVar = PregnancySetupActivity.f40934g;
                        eVar.getClass();
                        pregnancySetupActivity.f40935a = eVar;
                        int i26 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.e.b.f40984a[eVar.ordinal()];
                        if (i26 == 1) {
                            cVar = new db1.c(R.string.wallet_terms_and_conditions_title, 0, 8, R.string.lbl_next, 0, 16, null);
                        } else if (i26 == 2) {
                            cVar = new db1.c(R.string.mct_setup, 0, 0, R.string.lbl_next, R.string.pregnancy_keep_hydration_goal);
                        } else if (i26 != 3) {
                            cVar = i26 != 4 ? new db1.c(R.string.mct_setup, 0, 8, R.string.lbl_next, 0, 16, null) : new db1.c(R.string.mct_setup, 0, 8, R.string.lbl_finish, 0, 16, null);
                        } else {
                            cVar = new db1.c(R.string.mct_setup, 0, 0, R.string.lbl_next, R.string.pregnancy_index_scale_settings);
                        }
                        pregnancySetupActivity.updateActionBarTitle(pregnancySetupActivity.getString(cVar.f58989a));
                        Button button4 = pregnancySetupActivity.f40936b;
                        if (button4 == null) {
                            p005kotlin.jvm.internal.s.m("mNextButton");
                            throw null;
                        }
                        button4.setVisibility(cVar.f58990b);
                        Button button5 = pregnancySetupActivity.f40936b;
                        if (button5 == null) {
                            p005kotlin.jvm.internal.s.m("mNextButton");
                            throw null;
                        }
                        button5.setText(pregnancySetupActivity.getString(cVar.f58992d));
                        Button button6 = pregnancySetupActivity.f40937c;
                        if (button6 == null) {
                            p005kotlin.jvm.internal.s.m("mSkipButton");
                            throw null;
                        }
                        button6.setVisibility(cVar.f58991c);
                        Button button7 = pregnancySetupActivity.f40937c;
                        if (button7 == null) {
                            p005kotlin.jvm.internal.s.m("mSkipButton");
                            throw null;
                        }
                        button7.setText(pregnancySetupActivity.getString(cVar.f58993e));
                        if (eVar == com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.e.HYDRATION_GOALS) {
                            tb1.e.a aVar2 = tb1.e.f163745a;
                            op0.c cVar2 = pregnancySetupActivity.ca().f144065i;
                            Double baseGoalInML = cVar2 != null ? cVar2.getBaseGoalInML() : null;
                            aVar2.getClass();
                            if (baseGoalInML == null || Double.isNaN(baseGoalInML.doubleValue())) {
                                Button button8 = pregnancySetupActivity.f40937c;
                                if (button8 == null) {
                                    p005kotlin.jvm.internal.s.m("mSkipButton");
                                    throw null;
                                }
                                button8.setText(pregnancySetupActivity.getString(R.string.lbl_skip_button));
                            }
                        }
                        if (pregnancySetupActivity.ea().f128594a == null) {
                            Button button9 = pregnancySetupActivity.f40936b;
                            if (button9 == null) {
                                p005kotlin.jvm.internal.s.m("mNextButton");
                                throw null;
                            }
                            button9.setText(pregnancySetupActivity.getString(R.string.lbl_finish));
                        }
                        return Unit.INSTANCE;
                    case 1:
                        fw.m mVar = (fw.m) obj;
                        PregnancySetupActivity.a aVar3 = PregnancySetupActivity.f40934g;
                        int i27 = PregnancySetupActivity.b.f40941a[mVar.f73769b.ordinal()];
                        if (i27 == 1) {
                            pregnancySetupActivity.showProgressOverlay();
                        } else if (i27 == 2) {
                            pregnancySetupActivity.hideProgressOverlay();
                        } else {
                            if (i27 != 3) {
                                u0.r();
                                return null;
                            }
                            pregnancySetupActivity.hideProgressOverlay();
                            g22.a.a(pregnancySetupActivity, mVar.f73771d);
                        }
                        return Unit.INSTANCE;
                    default:
                        fw.m mVar2 = (fw.m) obj;
                        PregnancySetupActivity.a aVar4 = PregnancySetupActivity.f40934g;
                        int i28 = PregnancySetupActivity.b.f40941a[mVar2.f73769b.ordinal()];
                        if (i28 != 1) {
                            final int i29 = 0;
                            if (i28 == 2) {
                                pregnancySetupActivity.hideProgressOverlay();
                                i52.a.f91796a.getClass();
                                f12.l.f68084a.getClass();
                                f12.l.a.a().e4(true);
                                MenstrualCycleReminders.a aVar5 = MenstrualCycleReminders.f39205a;
                                GarminConnectMobileApp.f28685g.getClass();
                                Context contextA = GarminConnectMobileApp.a.a();
                                aVar5.getClass();
                                MenstrualCycleReminders.a.a(contextA);
                                pregnancySetupActivity.ia(false);
                            } else {
                                if (i28 != 3) {
                                    u0.r();
                                    return null;
                                }
                                pregnancySetupActivity.hideProgressOverlay();
                                a aVar6 = (a) mVar2.f73770c;
                                if (aVar6 != null && aVar6.f144033e) {
                                    androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_error_saving_title).setMessage(R.string.pregnancy_error_saving_message).setPositiveButton(R.string.common_button_ok, new mt0.y(25)).create();
                                    eVarCreate.setCanceledOnTouchOutside(false);
                                    eVarCreate.show();
                                } else if (aVar6 != null && aVar6.f144034f) {
                                    DataStorageConsentActivity.a.c(DataStorageConsentActivity.f32194t, pregnancySetupActivity);
                                } else if (aVar6 == null || !aVar6.f144029a) {
                                    if (aVar6 == null || !aVar6.f144030b) {
                                        if (aVar6 != null && aVar6.f144032d) {
                                            androidx.appcompat.app.e eVarCreate2 = new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_weight_gain_goals).setMessage(R.string.pregnancy_weight_gain_goal_not_activated).setPositiveButton(R.string.action_settings, new DialogInterface.OnClickListener() { // from class: qb1.b
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i35) {
                                                    int i36 = i29;
                                                    PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                                    switch (i36) {
                                                        case 0:
                                                            PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                            h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                            Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                            ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                            arrayList.add(intent);
                                                            MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                            aVar8.getClass();
                                                            arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                            h0VarE.g();
                                                            break;
                                                        case 1:
                                                            PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.ia(false);
                                                            break;
                                                        case 2:
                                                            pregnancySetupActivity2.f40939e++;
                                                            pregnancySetupActivity2.ca().M4();
                                                            dialogInterface.dismiss();
                                                            break;
                                                        case 3:
                                                            PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.finish();
                                                            break;
                                                        case 4:
                                                            pregnancySetupActivity2.f40940f++;
                                                            pregnancySetupActivity2.ca().M4();
                                                            dialogInterface.dismiss();
                                                            break;
                                                        case 5:
                                                            PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                            break;
                                                        default:
                                                            PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                            pregnancySetupActivity2.ia(true);
                                                            dialogInterface.dismiss();
                                                            break;
                                                    }
                                                }
                                            }).setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: qb1.b
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i35) {
                                                    int i36 = i24;
                                                    PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                                    switch (i36) {
                                                        case 0:
                                                            PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                            h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                            Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                            ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                            arrayList.add(intent);
                                                            MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                            aVar8.getClass();
                                                            arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                            h0VarE.g();
                                                            break;
                                                        case 1:
                                                            PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.ia(false);
                                                            break;
                                                        case 2:
                                                            pregnancySetupActivity2.f40939e++;
                                                            pregnancySetupActivity2.ca().M4();
                                                            dialogInterface.dismiss();
                                                            break;
                                                        case 3:
                                                            PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.finish();
                                                            break;
                                                        case 4:
                                                            pregnancySetupActivity2.f40940f++;
                                                            pregnancySetupActivity2.ca().M4();
                                                            dialogInterface.dismiss();
                                                            break;
                                                        case 5:
                                                            PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                            break;
                                                        default:
                                                            PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                            pregnancySetupActivity2.ia(true);
                                                            dialogInterface.dismiss();
                                                            break;
                                                    }
                                                }
                                            }).create();
                                            eVarCreate2.setCanceledOnTouchOutside(false);
                                            eVarCreate2.show();
                                        }
                                        if (aVar6 != null && aVar6.f144031c) {
                                            new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_hydration_goal_not_updated).setMessage(R.string.pregnancy_hydration_goal_error_message).setPositiveButton(R.string.lbl_ok, new pk1.t(4, aVar6, pregnancySetupActivity)).create().show();
                                        }
                                    } else if (pregnancySetupActivity.f40940f < 3) {
                                        androidx.appcompat.app.e eVarCreate3 = new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_something_went_wrong).setMessage(R.string.connect_iq_try_again).setPositiveButton(R.string.lbl_retry, new DialogInterface.OnClickListener() { // from class: qb1.b
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i35) {
                                                int i36 = i19;
                                                PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                                switch (i36) {
                                                    case 0:
                                                        PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                        h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                        Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                        ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                        arrayList.add(intent);
                                                        MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                        aVar8.getClass();
                                                        arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                        h0VarE.g();
                                                        break;
                                                    case 1:
                                                        PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.ia(false);
                                                        break;
                                                    case 2:
                                                        pregnancySetupActivity2.f40939e++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 3:
                                                        PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.finish();
                                                        break;
                                                    case 4:
                                                        pregnancySetupActivity2.f40940f++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 5:
                                                        PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                        break;
                                                    default:
                                                        PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                        pregnancySetupActivity2.ia(true);
                                                        dialogInterface.dismiss();
                                                        break;
                                                }
                                            }
                                        }).setNegativeButton(R.string.lbl_cancel, new mt0.y(27)).create();
                                        eVarCreate3.setCanceledOnTouchOutside(false);
                                        eVarCreate3.show();
                                    } else {
                                        final int i30 = 5;
                                        androidx.appcompat.app.e.a positiveButton = new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_set_up_again).setMessage(R.string.pregnancy_error_saving_details_message).setPositiveButton(R.string.mct_set_up, new DialogInterface.OnClickListener() { // from class: qb1.b
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i35) {
                                                int i36 = i30;
                                                PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                                switch (i36) {
                                                    case 0:
                                                        PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                        h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                        Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                        ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                        arrayList.add(intent);
                                                        MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                        aVar8.getClass();
                                                        arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                        h0VarE.g();
                                                        break;
                                                    case 1:
                                                        PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.ia(false);
                                                        break;
                                                    case 2:
                                                        pregnancySetupActivity2.f40939e++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 3:
                                                        PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.finish();
                                                        break;
                                                    case 4:
                                                        pregnancySetupActivity2.f40940f++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 5:
                                                        PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                        break;
                                                    default:
                                                        PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                        pregnancySetupActivity2.ia(true);
                                                        dialogInterface.dismiss();
                                                        break;
                                                }
                                            }
                                        });
                                        final int i34 = 6;
                                        androidx.appcompat.app.e eVarCreate4 = positiveButton.setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: qb1.b
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i35) {
                                                int i36 = i34;
                                                PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                                switch (i36) {
                                                    case 0:
                                                        PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                        h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                        Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                        ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                        arrayList.add(intent);
                                                        MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                        aVar8.getClass();
                                                        arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                        h0VarE.g();
                                                        break;
                                                    case 1:
                                                        PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.ia(false);
                                                        break;
                                                    case 2:
                                                        pregnancySetupActivity2.f40939e++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 3:
                                                        PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.finish();
                                                        break;
                                                    case 4:
                                                        pregnancySetupActivity2.f40940f++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 5:
                                                        PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                        break;
                                                    default:
                                                        PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                        pregnancySetupActivity2.ia(true);
                                                        dialogInterface.dismiss();
                                                        break;
                                                }
                                            }
                                        }).create();
                                        eVarCreate4.setCanceledOnTouchOutside(false);
                                        eVarCreate4.show();
                                    }
                                } else if (pregnancySetupActivity.f40939e < 3) {
                                    androidx.appcompat.app.e eVarCreate5 = new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_something_went_wrong).setMessage(R.string.connect_iq_try_again).setPositiveButton(R.string.lbl_retry, new DialogInterface.OnClickListener() { // from class: qb1.b
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i35) {
                                            int i36 = i110;
                                            PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                            switch (i36) {
                                                case 0:
                                                    PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                    h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                    com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                    Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                    ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                    arrayList.add(intent);
                                                    MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                    aVar8.getClass();
                                                    arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                    h0VarE.g();
                                                    break;
                                                case 1:
                                                    PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.ia(false);
                                                    break;
                                                case 2:
                                                    pregnancySetupActivity2.f40939e++;
                                                    pregnancySetupActivity2.ca().M4();
                                                    dialogInterface.dismiss();
                                                    break;
                                                case 3:
                                                    PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.finish();
                                                    break;
                                                case 4:
                                                    pregnancySetupActivity2.f40940f++;
                                                    pregnancySetupActivity2.ca().M4();
                                                    dialogInterface.dismiss();
                                                    break;
                                                case 5:
                                                    PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                    break;
                                                default:
                                                    PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                    pregnancySetupActivity2.ia(true);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton(R.string.lbl_cancel, new mt0.y(26)).create();
                                    eVarCreate5.setCanceledOnTouchOutside(false);
                                    eVarCreate5.show();
                                } else {
                                    androidx.appcompat.app.e eVarCreate6 = new androidx.appcompat.app.e.a(pregnancySetupActivity).setMessage(R.string.pregnancy_something_went_wrong).setPositiveButton(R.string.lbl_ok, new DialogInterface.OnClickListener() { // from class: qb1.b
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i35) {
                                            int i36 = i25;
                                            PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                            switch (i36) {
                                                case 0:
                                                    PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                    h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                    com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                    Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                    ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                    arrayList.add(intent);
                                                    MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                    aVar8.getClass();
                                                    arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                    h0VarE.g();
                                                    break;
                                                case 1:
                                                    PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.ia(false);
                                                    break;
                                                case 2:
                                                    pregnancySetupActivity2.f40939e++;
                                                    pregnancySetupActivity2.ca().M4();
                                                    dialogInterface.dismiss();
                                                    break;
                                                case 3:
                                                    PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.finish();
                                                    break;
                                                case 4:
                                                    pregnancySetupActivity2.f40940f++;
                                                    pregnancySetupActivity2.ca().M4();
                                                    dialogInterface.dismiss();
                                                    break;
                                                case 5:
                                                    PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                    break;
                                                default:
                                                    PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                    pregnancySetupActivity2.ia(true);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    }).setCancelable(false).create();
                                    eVarCreate6.setCanceledOnTouchOutside(false);
                                    eVarCreate6.show();
                                }
                            }
                        } else {
                            pregnancySetupActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i18 = 2;
        ca().J4().f(this, new c(new l(this) { // from class: qb1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PregnancySetupActivity f144040b;

            {
                this.f144040b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                db1.c cVar;
                int i19 = i18;
                final int i110 = 4;
                final PregnancySetupActivity pregnancySetupActivity = this.f144040b;
                final int i111 = 2;
                final int i24 = 1;
                final int i25 = 3;
                switch (i19) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.e eVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.e) obj;
                        PregnancySetupActivity.a aVar = PregnancySetupActivity.f40934g;
                        eVar.getClass();
                        pregnancySetupActivity.f40935a = eVar;
                        int i26 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.e.b.f40984a[eVar.ordinal()];
                        if (i26 == 1) {
                            cVar = new db1.c(R.string.wallet_terms_and_conditions_title, 0, 8, R.string.lbl_next, 0, 16, null);
                        } else if (i26 == 2) {
                            cVar = new db1.c(R.string.mct_setup, 0, 0, R.string.lbl_next, R.string.pregnancy_keep_hydration_goal);
                        } else if (i26 != 3) {
                            cVar = i26 != 4 ? new db1.c(R.string.mct_setup, 0, 8, R.string.lbl_next, 0, 16, null) : new db1.c(R.string.mct_setup, 0, 8, R.string.lbl_finish, 0, 16, null);
                        } else {
                            cVar = new db1.c(R.string.mct_setup, 0, 0, R.string.lbl_next, R.string.pregnancy_index_scale_settings);
                        }
                        pregnancySetupActivity.updateActionBarTitle(pregnancySetupActivity.getString(cVar.f58989a));
                        Button button4 = pregnancySetupActivity.f40936b;
                        if (button4 == null) {
                            p005kotlin.jvm.internal.s.m("mNextButton");
                            throw null;
                        }
                        button4.setVisibility(cVar.f58990b);
                        Button button5 = pregnancySetupActivity.f40936b;
                        if (button5 == null) {
                            p005kotlin.jvm.internal.s.m("mNextButton");
                            throw null;
                        }
                        button5.setText(pregnancySetupActivity.getString(cVar.f58992d));
                        Button button6 = pregnancySetupActivity.f40937c;
                        if (button6 == null) {
                            p005kotlin.jvm.internal.s.m("mSkipButton");
                            throw null;
                        }
                        button6.setVisibility(cVar.f58991c);
                        Button button7 = pregnancySetupActivity.f40937c;
                        if (button7 == null) {
                            p005kotlin.jvm.internal.s.m("mSkipButton");
                            throw null;
                        }
                        button7.setText(pregnancySetupActivity.getString(cVar.f58993e));
                        if (eVar == com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.e.HYDRATION_GOALS) {
                            tb1.e.a aVar2 = tb1.e.f163745a;
                            op0.c cVar2 = pregnancySetupActivity.ca().f144065i;
                            Double baseGoalInML = cVar2 != null ? cVar2.getBaseGoalInML() : null;
                            aVar2.getClass();
                            if (baseGoalInML == null || Double.isNaN(baseGoalInML.doubleValue())) {
                                Button button8 = pregnancySetupActivity.f40937c;
                                if (button8 == null) {
                                    p005kotlin.jvm.internal.s.m("mSkipButton");
                                    throw null;
                                }
                                button8.setText(pregnancySetupActivity.getString(R.string.lbl_skip_button));
                            }
                        }
                        if (pregnancySetupActivity.ea().f128594a == null) {
                            Button button9 = pregnancySetupActivity.f40936b;
                            if (button9 == null) {
                                p005kotlin.jvm.internal.s.m("mNextButton");
                                throw null;
                            }
                            button9.setText(pregnancySetupActivity.getString(R.string.lbl_finish));
                        }
                        return Unit.INSTANCE;
                    case 1:
                        fw.m mVar = (fw.m) obj;
                        PregnancySetupActivity.a aVar3 = PregnancySetupActivity.f40934g;
                        int i27 = PregnancySetupActivity.b.f40941a[mVar.f73769b.ordinal()];
                        if (i27 == 1) {
                            pregnancySetupActivity.showProgressOverlay();
                        } else if (i27 == 2) {
                            pregnancySetupActivity.hideProgressOverlay();
                        } else {
                            if (i27 != 3) {
                                u0.r();
                                return null;
                            }
                            pregnancySetupActivity.hideProgressOverlay();
                            g22.a.a(pregnancySetupActivity, mVar.f73771d);
                        }
                        return Unit.INSTANCE;
                    default:
                        fw.m mVar2 = (fw.m) obj;
                        PregnancySetupActivity.a aVar4 = PregnancySetupActivity.f40934g;
                        int i28 = PregnancySetupActivity.b.f40941a[mVar2.f73769b.ordinal()];
                        if (i28 != 1) {
                            final int i29 = 0;
                            if (i28 == 2) {
                                pregnancySetupActivity.hideProgressOverlay();
                                i52.a.f91796a.getClass();
                                f12.l.f68084a.getClass();
                                f12.l.a.a().e4(true);
                                MenstrualCycleReminders.a aVar5 = MenstrualCycleReminders.f39205a;
                                GarminConnectMobileApp.f28685g.getClass();
                                Context contextA = GarminConnectMobileApp.a.a();
                                aVar5.getClass();
                                MenstrualCycleReminders.a.a(contextA);
                                pregnancySetupActivity.ia(false);
                            } else {
                                if (i28 != 3) {
                                    u0.r();
                                    return null;
                                }
                                pregnancySetupActivity.hideProgressOverlay();
                                a aVar6 = (a) mVar2.f73770c;
                                if (aVar6 != null && aVar6.f144033e) {
                                    androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_error_saving_title).setMessage(R.string.pregnancy_error_saving_message).setPositiveButton(R.string.common_button_ok, new mt0.y(25)).create();
                                    eVarCreate.setCanceledOnTouchOutside(false);
                                    eVarCreate.show();
                                } else if (aVar6 != null && aVar6.f144034f) {
                                    DataStorageConsentActivity.a.c(DataStorageConsentActivity.f32194t, pregnancySetupActivity);
                                } else if (aVar6 == null || !aVar6.f144029a) {
                                    if (aVar6 == null || !aVar6.f144030b) {
                                        if (aVar6 != null && aVar6.f144032d) {
                                            androidx.appcompat.app.e eVarCreate2 = new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_weight_gain_goals).setMessage(R.string.pregnancy_weight_gain_goal_not_activated).setPositiveButton(R.string.action_settings, new DialogInterface.OnClickListener() { // from class: qb1.b
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i35) {
                                                    int i36 = i29;
                                                    PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                                    switch (i36) {
                                                        case 0:
                                                            PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                            h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                            Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                            ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                            arrayList.add(intent);
                                                            MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                            aVar8.getClass();
                                                            arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                            h0VarE.g();
                                                            break;
                                                        case 1:
                                                            PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.ia(false);
                                                            break;
                                                        case 2:
                                                            pregnancySetupActivity2.f40939e++;
                                                            pregnancySetupActivity2.ca().M4();
                                                            dialogInterface.dismiss();
                                                            break;
                                                        case 3:
                                                            PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.finish();
                                                            break;
                                                        case 4:
                                                            pregnancySetupActivity2.f40940f++;
                                                            pregnancySetupActivity2.ca().M4();
                                                            dialogInterface.dismiss();
                                                            break;
                                                        case 5:
                                                            PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                            break;
                                                        default:
                                                            PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                            pregnancySetupActivity2.ia(true);
                                                            dialogInterface.dismiss();
                                                            break;
                                                    }
                                                }
                                            }).setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: qb1.b
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i35) {
                                                    int i36 = i24;
                                                    PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                                    switch (i36) {
                                                        case 0:
                                                            PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                            h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                            Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                            ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                            arrayList.add(intent);
                                                            MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                            aVar8.getClass();
                                                            arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                            h0VarE.g();
                                                            break;
                                                        case 1:
                                                            PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.ia(false);
                                                            break;
                                                        case 2:
                                                            pregnancySetupActivity2.f40939e++;
                                                            pregnancySetupActivity2.ca().M4();
                                                            dialogInterface.dismiss();
                                                            break;
                                                        case 3:
                                                            PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.finish();
                                                            break;
                                                        case 4:
                                                            pregnancySetupActivity2.f40940f++;
                                                            pregnancySetupActivity2.ca().M4();
                                                            dialogInterface.dismiss();
                                                            break;
                                                        case 5:
                                                            PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                            dialogInterface.dismiss();
                                                            pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                            break;
                                                        default:
                                                            PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                            pregnancySetupActivity2.ia(true);
                                                            dialogInterface.dismiss();
                                                            break;
                                                    }
                                                }
                                            }).create();
                                            eVarCreate2.setCanceledOnTouchOutside(false);
                                            eVarCreate2.show();
                                        }
                                        if (aVar6 != null && aVar6.f144031c) {
                                            new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_hydration_goal_not_updated).setMessage(R.string.pregnancy_hydration_goal_error_message).setPositiveButton(R.string.lbl_ok, new pk1.t(4, aVar6, pregnancySetupActivity)).create().show();
                                        }
                                    } else if (pregnancySetupActivity.f40940f < 3) {
                                        androidx.appcompat.app.e eVarCreate3 = new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_something_went_wrong).setMessage(R.string.connect_iq_try_again).setPositiveButton(R.string.lbl_retry, new DialogInterface.OnClickListener() { // from class: qb1.b
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i35) {
                                                int i36 = i110;
                                                PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                                switch (i36) {
                                                    case 0:
                                                        PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                        h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                        Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                        ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                        arrayList.add(intent);
                                                        MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                        aVar8.getClass();
                                                        arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                        h0VarE.g();
                                                        break;
                                                    case 1:
                                                        PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.ia(false);
                                                        break;
                                                    case 2:
                                                        pregnancySetupActivity2.f40939e++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 3:
                                                        PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.finish();
                                                        break;
                                                    case 4:
                                                        pregnancySetupActivity2.f40940f++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 5:
                                                        PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                        break;
                                                    default:
                                                        PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                        pregnancySetupActivity2.ia(true);
                                                        dialogInterface.dismiss();
                                                        break;
                                                }
                                            }
                                        }).setNegativeButton(R.string.lbl_cancel, new mt0.y(27)).create();
                                        eVarCreate3.setCanceledOnTouchOutside(false);
                                        eVarCreate3.show();
                                    } else {
                                        final int i30 = 5;
                                        androidx.appcompat.app.e.a positiveButton = new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_set_up_again).setMessage(R.string.pregnancy_error_saving_details_message).setPositiveButton(R.string.mct_set_up, new DialogInterface.OnClickListener() { // from class: qb1.b
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i35) {
                                                int i36 = i30;
                                                PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                                switch (i36) {
                                                    case 0:
                                                        PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                        h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                        Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                        ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                        arrayList.add(intent);
                                                        MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                        aVar8.getClass();
                                                        arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                        h0VarE.g();
                                                        break;
                                                    case 1:
                                                        PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.ia(false);
                                                        break;
                                                    case 2:
                                                        pregnancySetupActivity2.f40939e++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 3:
                                                        PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.finish();
                                                        break;
                                                    case 4:
                                                        pregnancySetupActivity2.f40940f++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 5:
                                                        PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                        break;
                                                    default:
                                                        PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                        pregnancySetupActivity2.ia(true);
                                                        dialogInterface.dismiss();
                                                        break;
                                                }
                                            }
                                        });
                                        final int i34 = 6;
                                        androidx.appcompat.app.e eVarCreate4 = positiveButton.setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: qb1.b
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i35) {
                                                int i36 = i34;
                                                PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                                switch (i36) {
                                                    case 0:
                                                        PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                        h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                        Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                        ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                        arrayList.add(intent);
                                                        MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                        aVar8.getClass();
                                                        arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                        h0VarE.g();
                                                        break;
                                                    case 1:
                                                        PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.ia(false);
                                                        break;
                                                    case 2:
                                                        pregnancySetupActivity2.f40939e++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 3:
                                                        PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.finish();
                                                        break;
                                                    case 4:
                                                        pregnancySetupActivity2.f40940f++;
                                                        pregnancySetupActivity2.ca().M4();
                                                        dialogInterface.dismiss();
                                                        break;
                                                    case 5:
                                                        PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                        dialogInterface.dismiss();
                                                        pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                        break;
                                                    default:
                                                        PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                        pregnancySetupActivity2.ia(true);
                                                        dialogInterface.dismiss();
                                                        break;
                                                }
                                            }
                                        }).create();
                                        eVarCreate4.setCanceledOnTouchOutside(false);
                                        eVarCreate4.show();
                                    }
                                } else if (pregnancySetupActivity.f40939e < 3) {
                                    androidx.appcompat.app.e eVarCreate5 = new androidx.appcompat.app.e.a(pregnancySetupActivity).setTitle(R.string.pregnancy_something_went_wrong).setMessage(R.string.connect_iq_try_again).setPositiveButton(R.string.lbl_retry, new DialogInterface.OnClickListener() { // from class: qb1.b
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i35) {
                                            int i36 = i111;
                                            PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                            switch (i36) {
                                                case 0:
                                                    PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                    h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                    com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                    Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                    ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                    arrayList.add(intent);
                                                    MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                    aVar8.getClass();
                                                    arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                    h0VarE.g();
                                                    break;
                                                case 1:
                                                    PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.ia(false);
                                                    break;
                                                case 2:
                                                    pregnancySetupActivity2.f40939e++;
                                                    pregnancySetupActivity2.ca().M4();
                                                    dialogInterface.dismiss();
                                                    break;
                                                case 3:
                                                    PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.finish();
                                                    break;
                                                case 4:
                                                    pregnancySetupActivity2.f40940f++;
                                                    pregnancySetupActivity2.ca().M4();
                                                    dialogInterface.dismiss();
                                                    break;
                                                case 5:
                                                    PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                    break;
                                                default:
                                                    PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                    pregnancySetupActivity2.ia(true);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton(R.string.lbl_cancel, new mt0.y(26)).create();
                                    eVarCreate5.setCanceledOnTouchOutside(false);
                                    eVarCreate5.show();
                                } else {
                                    androidx.appcompat.app.e eVarCreate6 = new androidx.appcompat.app.e.a(pregnancySetupActivity).setMessage(R.string.pregnancy_something_went_wrong).setPositiveButton(R.string.lbl_ok, new DialogInterface.OnClickListener() { // from class: qb1.b
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i35) {
                                            int i36 = i25;
                                            PregnancySetupActivity pregnancySetupActivity2 = pregnancySetupActivity;
                                            switch (i36) {
                                                case 0:
                                                    PregnancySetupActivity.a aVar7 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    PregnancySetupActivity pregnancySetupActivity3 = pregnancySetupActivity;
                                                    h0 h0VarE = h0.e(pregnancySetupActivity3);
                                                    com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                                    Intent intent = new Intent(pregnancySetupActivity3, (Class<?>) DashboardActivity.class);
                                                    ArrayList<Intent> arrayList = h0VarE.f202637a;
                                                    arrayList.add(intent);
                                                    MenstrualCycleSettingsActivity.a aVar8 = MenstrualCycleSettingsActivity.f39030c;
                                                    aVar8.getClass();
                                                    arrayList.add(MenstrualCycleSettingsActivity.a.a(aVar8, pregnancySetupActivity3, null, false, false, false, 48));
                                                    h0VarE.g();
                                                    break;
                                                case 1:
                                                    PregnancySetupActivity.a aVar9 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.ia(false);
                                                    break;
                                                case 2:
                                                    pregnancySetupActivity2.f40939e++;
                                                    pregnancySetupActivity2.ca().M4();
                                                    dialogInterface.dismiss();
                                                    break;
                                                case 3:
                                                    PregnancySetupActivity.a aVar10 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.finish();
                                                    break;
                                                case 4:
                                                    pregnancySetupActivity2.f40940f++;
                                                    pregnancySetupActivity2.ca().M4();
                                                    dialogInterface.dismiss();
                                                    break;
                                                case 5:
                                                    PregnancySetupActivity.a aVar11 = PregnancySetupActivity.f40934g;
                                                    dialogInterface.dismiss();
                                                    pregnancySetupActivity2.startActivity(new Intent(pregnancySetupActivity2, (Class<?>) PregnancySetupGenesisActivity.class));
                                                    break;
                                                default:
                                                    PregnancySetupActivity.a aVar12 = PregnancySetupActivity.f40934g;
                                                    pregnancySetupActivity2.ia(true);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    }).setCancelable(false).create();
                                    eVarCreate6.setCanceledOnTouchOutside(false);
                                    eVarCreate6.show();
                                }
                            }
                        } else {
                            pregnancySetupActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        ga(this.f40935a, null);
        qb1.f fVarCa = ca();
        fVarCa.getClass();
        ge1.b.T(v1.a(fVarCa), null, null, new qb1.n(fVarCa, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/setup/PregnancySetupActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_RETRY_COUNTER", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

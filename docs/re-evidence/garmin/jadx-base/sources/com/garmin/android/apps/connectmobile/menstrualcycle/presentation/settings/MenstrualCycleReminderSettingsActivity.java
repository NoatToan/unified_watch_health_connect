package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleReminderSettingsActivity;
import g8.i;
import java.io.Serializable;
import jx0.e;
import k23.l;
import kg.f;
import kt2.d;
import o13.m;
import o13.t;
import o53.b0;
import o53.m1;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import r22.m0;
import t13.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/settings/MenstrualCycleReminderSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lo53/b0;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MenstrualCycleReminderSettingsActivity extends c implements b0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f39014o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ l<Object>[] f39015p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f39016a = m.b(new e(this, 26));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f39017b = m.b(new d(23));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g23.b f39018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LocalTime f39019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g23.b f39020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f39021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g23.b f39022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LocalTime f39023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public kx0.a f39024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f39025j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SwitchCompat f39026k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearLayout f39027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m0 f39028m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m1 f39029n;

    static {
        p005kotlin.jvm.internal.b0 b0Var = new p005kotlin.jvm.internal.b0(MenstrualCycleReminderSettingsActivity.class, "mPeriodReminder", "getMPeriodReminder()Z", 0);
        t0 t0Var = s0.f105811a;
        f39015p = new l[]{t0Var.f(b0Var), f.g(MenstrualCycleReminderSettingsActivity.class, "mPeriodOccurrence", "getMPeriodOccurrence()I", 0, t0Var), f.g(MenstrualCycleReminderSettingsActivity.class, "mLoggingReminder", "getMLoggingReminder()Z", 0, t0Var)};
        f39014o = new a(null);
    }

    public MenstrualCycleReminderSettingsActivity() {
        g23.a.f75578a.getClass();
        this.f39018c = new g23.b();
        this.f39020e = new g23.b();
        this.f39022g = new g23.b();
        this.f39029n = i.c();
    }

    public final boolean ca() {
        return ((Boolean) this.f39022g.getValue(this, f39015p[2])).booleanValue();
    }

    public final int da() {
        return ((Number) this.f39020e.getValue(this, f39015p[1])).intValue();
    }

    public final boolean ea() {
        return ((Boolean) this.f39018c.getValue(this, f39015p[0])).booleanValue();
    }

    public final void fa() {
        TextView textView = (TextView) findViewById(R.id.mct_reminder_settings_logging_time);
        DateTimeFormatter dateTimeFormatterShortTime = DateTimeFormat.shortTime();
        LocalTime localTime = this.f39023h;
        if (localTime == null) {
            s.m("mLoggingTime");
            throw null;
        }
        String strPrint = dateTimeFormatterShortTime.print(localTime);
        textView.setText(strPrint);
        textView.setContentDescription(oi0.c.A(this, new kn1.m(12), strPrint));
    }

    public final void ga() {
        boolean zEa;
        i52.a.f91796a.getClass();
        f12.l.f68084a.getClass();
        if (!f12.l.a.a().P3() || i52.a.l() == ww0.a.NONE) {
            SwitchCompat switchCompat = this.f39026k;
            if (switchCompat == null) {
                s.m("mctReminderSettingsPeriodSwitch");
                throw null;
            }
            switchCompat.setEnabled(false);
            SwitchCompat switchCompat2 = this.f39026k;
            if (switchCompat2 == null) {
                s.m("mctReminderSettingsPeriodSwitch");
                throw null;
            }
            switchCompat2.setChecked(false);
            zEa = false;
        } else {
            zEa = ea();
        }
        findViewById(R.id.mct_reminder_settings_period_options).setVisibility(zEa ? 0 : 8);
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final g getF136462d() {
        return o53.s0.f129406a.plus(this.f39029n);
    }

    public final void ha() {
        TextView textView = (TextView) findViewById(R.id.mct_reminder_settings_period_time);
        DateTimeFormatter dateTimeFormatterShortTime = DateTimeFormat.shortTime();
        LocalTime localTime = this.f39019d;
        if (localTime == null) {
            s.m("mPeriodTime");
            throw null;
        }
        String strPrint = dateTimeFormatterShortTime.print(localTime);
        textView.setText(strPrint);
        textView.setContentDescription(oi0.c.A(this, new kn1.m(11), strPrint));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        String stringExtra;
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            if (i14 == 2) {
                stringExtra = intent != null ? intent.getStringExtra("TEXT_EXTRA") : null;
                if (stringExtra == null || stringExtra.length() == 0) {
                    stringExtra = getString(R.string.mct_period_reminder_default_text);
                    stringExtra.getClass();
                }
                this.f39021f = stringExtra;
                return;
            }
            if (i14 != 3) {
                return;
            }
            stringExtra = intent != null ? intent.getStringExtra("TEXT_EXTRA") : null;
            if (stringExtra == null || stringExtra.length() == 0) {
                stringExtra = getString(R.string.mct_logging_reminder_default_text);
                stringExtra.getClass();
            }
            this.f39025j = stringExtra;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        i52.a.f91796a.getClass();
        SharedPreferences sharedPreferences = i52.a.f91797b;
        if (sharedPreferences.getBoolean(i52.a.c(R.string.key_mct_period_reminder_enabled), true) == ea()) {
            LocalTime localTimeH = i52.a.h();
            LocalTime localTime = this.f39019d;
            if (localTime == null) {
                s.m("mPeriodTime");
                throw null;
            }
            if (localTimeH.equals(localTime) && sharedPreferences.getInt(i52.a.c(R.string.key_mct_period_reminder_occurrence), 3) == da()) {
                String strG = i52.a.g();
                String str = this.f39021f;
                if (str == null) {
                    s.m("mPeriodText");
                    throw null;
                }
                if (strG.equals(str) && sharedPreferences.getBoolean(i52.a.c(R.string.key_mct_logging_reminder_enabled), true) == ca()) {
                    LocalTime localTimeF = i52.a.f();
                    LocalTime localTime2 = this.f39023h;
                    if (localTime2 == null) {
                        s.m("mLoggingTime");
                        throw null;
                    }
                    if (localTimeF.equals(localTime2)) {
                        kx0.a aVarD = i52.a.d();
                        kx0.a aVar = this.f39024i;
                        if (aVar == null) {
                            s.m("mLoggingFrequency");
                            throw null;
                        }
                        if (aVarD == aVar) {
                            String strE = i52.a.e();
                            String str2 = this.f39025j;
                            if (str2 == null) {
                                s.m("mLoggingText");
                                throw null;
                            }
                            if (strE.equals(str2)) {
                                super.onBackPressed();
                                return;
                            }
                        }
                    }
                }
            }
        }
        sharedPreferences.edit().putBoolean(i52.a.c(R.string.key_mct_period_reminder_enabled), ea()).apply();
        LocalTime localTime3 = this.f39019d;
        if (localTime3 == null) {
            s.m("mPeriodTime");
            throw null;
        }
        sharedPreferences.edit().putLong(i52.a.c(R.string.key_mct_period_reminder_time), localTime3.getMillisOfDay()).apply();
        sharedPreferences.edit().putInt(i52.a.c(R.string.key_mct_period_reminder_occurrence), da()).apply();
        String str3 = this.f39021f;
        if (str3 == null) {
            s.m("mPeriodText");
            throw null;
        }
        sharedPreferences.edit().putString(i52.a.c(R.string.key_mct_period_reminder_text), str3).apply();
        sharedPreferences.edit().putBoolean(i52.a.c(R.string.key_mct_logging_reminder_enabled), ca()).apply();
        LocalTime localTime4 = this.f39023h;
        if (localTime4 == null) {
            s.m("mLoggingTime");
            throw null;
        }
        sharedPreferences.edit().putLong(i52.a.c(R.string.key_mct_logging_reminder_time), localTime4.getMillisOfDay()).apply();
        kx0.a aVar2 = this.f39024i;
        if (aVar2 == null) {
            s.m("mLoggingFrequency");
            throw null;
        }
        sharedPreferences.edit().putString(i52.a.c(R.string.key_mct_logging_reminder_frequency), aVar2.name()).apply();
        String str4 = this.f39025j;
        if (str4 == null) {
            s.m("mLoggingText");
            throw null;
        }
        sharedPreferences.edit().putString(i52.a.c(R.string.key_mct_logging_reminder_text), str4).apply();
        if (ea()) {
            ((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).u(this);
        } else {
            ((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).q(this);
        }
        setResult(-1);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializable;
        Object serializable2;
        Object serializable3;
        super.onCreate(bundle);
        setContentView(R.layout.activity_menstrual_cycle_reminder_settings);
        initActionBar(true, getString(R.string.mct_reminders));
        g23.b bVar = this.f39022g;
        g23.b bVar2 = this.f39020e;
        l<?>[] lVarArr = f39015p;
        g23.b bVar3 = this.f39018c;
        if (bundle != null) {
            bVar3.setValue(this, lVarArr[0], Boolean.valueOf(bundle.getBoolean("PERIOD_REMINDER_KEY")));
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                serializable = bundle.getSerializable("PERIOD_TIME_KEY", LocalTime.class);
            } else {
                Serializable serializable4 = bundle.getSerializable("PERIOD_TIME_KEY");
                if (!(serializable4 instanceof LocalTime)) {
                    serializable4 = null;
                }
                serializable = (LocalTime) serializable4;
            }
            serializable.getClass();
            this.f39019d = (LocalTime) serializable;
            bVar2.setValue(this, lVarArr[1], Integer.valueOf(bundle.getInt("PERIOD_OCCURRENCE_KEY")));
            String string = bundle.getString("PERIOD_TEXT_KEY");
            string.getClass();
            this.f39021f = string;
            bVar.setValue(this, lVarArr[2], Boolean.valueOf(bundle.getBoolean("LOGGING_REMINDER_KEY")));
            if (i14 >= 33) {
                serializable2 = bundle.getSerializable("LOGGING_TIME_KEY", LocalTime.class);
            } else {
                Serializable serializable5 = bundle.getSerializable("LOGGING_TIME_KEY");
                if (!(serializable5 instanceof LocalTime)) {
                    serializable5 = null;
                }
                serializable2 = (LocalTime) serializable5;
            }
            serializable2.getClass();
            this.f39023h = (LocalTime) serializable2;
            if (i14 >= 33) {
                serializable3 = bundle.getSerializable("LOGGING_FREQUENCY_KEY", kx0.a.class);
            } else {
                Serializable serializable6 = bundle.getSerializable("LOGGING_FREQUENCY_KEY");
                if (!(serializable6 instanceof kx0.a)) {
                    serializable6 = null;
                }
                serializable3 = (kx0.a) serializable6;
            }
            serializable3.getClass();
            this.f39024i = (kx0.a) serializable3;
            String string2 = bundle.getString("LOGGING_TEXT_KEY");
            string2.getClass();
            this.f39025j = string2;
        } else {
            ((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).z(this);
            i52.a.f91796a.getClass();
            SharedPreferences sharedPreferences = i52.a.f91797b;
            bVar3.setValue(this, lVarArr[0], Boolean.valueOf(sharedPreferences.getBoolean(i52.a.c(R.string.key_mct_period_reminder_enabled), true)));
            this.f39019d = i52.a.h();
            bVar2.setValue(this, lVarArr[1], Integer.valueOf(sharedPreferences.getInt(i52.a.c(R.string.key_mct_period_reminder_occurrence), 3)));
            this.f39021f = i52.a.g();
            bVar.setValue(this, lVarArr[2], Boolean.valueOf(sharedPreferences.getBoolean(i52.a.c(R.string.key_mct_logging_reminder_enabled), true)));
            this.f39023h = i52.a.f();
            this.f39024i = i52.a.d();
            this.f39025j = i52.a.e();
        }
        View viewFindViewById = findViewById(R.id.root_view);
        viewFindViewById.getClass();
        this.f39027l = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.mct_reminder_settings_period_switch);
        viewFindViewById2.getClass();
        SwitchCompat switchCompat = (SwitchCompat) viewFindViewById2;
        this.f39026k = switchCompat;
        switchCompat.setChecked(ea());
        ga();
        SwitchCompat switchCompat2 = this.f39026k;
        if (switchCompat2 == null) {
            s.m("mctReminderSettingsPeriodSwitch");
            throw null;
        }
        final int i15 = 1;
        switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: kx0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MenstrualCycleReminderSettingsActivity f107042b;

            {
                this.f107042b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i16 = i15;
                MenstrualCycleReminderSettingsActivity menstrualCycleReminderSettingsActivity = this.f107042b;
                switch (i16) {
                    case 0:
                        MenstrualCycleReminderSettingsActivity.a aVar = MenstrualCycleReminderSettingsActivity.f39014o;
                        compoundButton.getClass();
                        menstrualCycleReminderSettingsActivity.f39022g.setValue(menstrualCycleReminderSettingsActivity, MenstrualCycleReminderSettingsActivity.f39015p[2], Boolean.valueOf(z14));
                        menstrualCycleReminderSettingsActivity.findViewById(R.id.mct_reminder_settings_logging_options).setVisibility(menstrualCycleReminderSettingsActivity.ca() ? 0 : 8);
                        break;
                    default:
                        MenstrualCycleReminderSettingsActivity.a aVar2 = MenstrualCycleReminderSettingsActivity.f39014o;
                        compoundButton.getClass();
                        menstrualCycleReminderSettingsActivity.f39018c.setValue(menstrualCycleReminderSettingsActivity, MenstrualCycleReminderSettingsActivity.f39015p[0], Boolean.valueOf(z14));
                        menstrualCycleReminderSettingsActivity.ga();
                        break;
                }
            }
        });
        ha();
        findViewById(R.id.mct_reminder_settings_period_time_row).setOnClickListener(new kx0.c(this, 6));
        ((TextView) findViewById(R.id.mct_reminder_settings_period_frequency_value)).setText(((String[]) this.f39016a.getValue())[da() - 1]);
        findViewById(R.id.mct_reminder_settings_period_frequency_row).setOnClickListener(new kx0.c(this, 7));
        findViewById(R.id.mct_reminder_settings_period_reminder_text).setOnClickListener(new kx0.c(this, 0));
        SwitchCompat switchCompat3 = (SwitchCompat) findViewById(R.id.mct_reminder_settings_logging_switch);
        switchCompat3.setChecked(ca());
        findViewById(R.id.mct_reminder_settings_logging_options).setVisibility(ca() ? 0 : 8);
        final int i16 = 0;
        switchCompat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: kx0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MenstrualCycleReminderSettingsActivity f107042b;

            {
                this.f107042b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i17 = i16;
                MenstrualCycleReminderSettingsActivity menstrualCycleReminderSettingsActivity = this.f107042b;
                switch (i17) {
                    case 0:
                        MenstrualCycleReminderSettingsActivity.a aVar = MenstrualCycleReminderSettingsActivity.f39014o;
                        compoundButton.getClass();
                        menstrualCycleReminderSettingsActivity.f39022g.setValue(menstrualCycleReminderSettingsActivity, MenstrualCycleReminderSettingsActivity.f39015p[2], Boolean.valueOf(z14));
                        menstrualCycleReminderSettingsActivity.findViewById(R.id.mct_reminder_settings_logging_options).setVisibility(menstrualCycleReminderSettingsActivity.ca() ? 0 : 8);
                        break;
                    default:
                        MenstrualCycleReminderSettingsActivity.a aVar2 = MenstrualCycleReminderSettingsActivity.f39014o;
                        compoundButton.getClass();
                        menstrualCycleReminderSettingsActivity.f39018c.setValue(menstrualCycleReminderSettingsActivity, MenstrualCycleReminderSettingsActivity.f39015p[0], Boolean.valueOf(z14));
                        menstrualCycleReminderSettingsActivity.ga();
                        break;
                }
            }
        });
        fa();
        findViewById(R.id.mct_reminder_settings_logging_time_row).setOnClickListener(new kx0.c(this, 1));
        TextView textView = (TextView) findViewById(R.id.mct_reminder_settings_logging_frequency_value);
        kx0.a aVar = this.f39024i;
        if (aVar == null) {
            s.m("mLoggingFrequency");
            throw null;
        }
        textView.setText(aVar.a(this));
        findViewById(R.id.mct_reminder_settings_logging_frequency_row).setOnClickListener(new kx0.c(this, 2));
        findViewById(R.id.mct_reminder_settings_logging_reminder_text).setOnClickListener(new kx0.c(this, 3));
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        this.f39029n.c(null);
        super.onDestroy();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        j22.b.f96736a.getClass();
        if (!j22.b.l() || j22.b.a(this)) {
            m0 m0Var = this.f39028m;
            if (m0Var != null) {
                m0Var.dismiss();
            }
            LinearLayout linearLayout = this.f39027l;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                return;
            } else {
                s.m("rootView");
                throw null;
            }
        }
        LinearLayout linearLayout2 = this.f39027l;
        if (linearLayout2 == null) {
            s.m("rootView");
            throw null;
        }
        linearLayout2.setVisibility(8);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "MenstrualCycleReminderSettingsActivity", "showEnableAlarmsAndRemindersDialog");
        m0 m0VarC = m0.a.c(m0.f149759e, getString(R.string.lbl_alarms_and_reminders_permission_needed), getString(R.string.lbl_set_reminders_alarms_and_reminders_permission_must_be_turned_on), R.string.lbl_turn_on_alarms_and_reminders, new kx0.c(this, 4), R.string.common_button_not_now, new kx0.c(this, 5), 192);
        this.f39028m = m0VarC;
        m0VarC.show(getSupportFragmentManager(), "MenstrualCycleReminderSettingsActivity");
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("PERIOD_REMINDER_KEY", ea());
        LocalTime localTime = this.f39019d;
        if (localTime == null) {
            s.m("mPeriodTime");
            throw null;
        }
        bundle.putSerializable("PERIOD_TIME_KEY", localTime);
        bundle.putInt("PERIOD_OCCURRENCE_KEY", da());
        String str = this.f39021f;
        if (str == null) {
            s.m("mPeriodText");
            throw null;
        }
        bundle.putString("PERIOD_TEXT_KEY", str);
        bundle.putBoolean("LOGGING_REMINDER_KEY", ca());
        LocalTime localTime2 = this.f39023h;
        if (localTime2 == null) {
            s.m("mLoggingTime");
            throw null;
        }
        bundle.putSerializable("LOGGING_TIME_KEY", localTime2);
        kx0.a aVar = this.f39024i;
        if (aVar == null) {
            s.m("mLoggingFrequency");
            throw null;
        }
        bundle.putSerializable("LOGGING_FREQUENCY_KEY", aVar);
        String str2 = this.f39025j;
        if (str2 == null) {
            s.m("mLoggingText");
            throw null;
        }
        bundle.putString("LOGGING_TEXT_KEY", str2);
        super.onSaveInstanceState(bundle);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/settings/MenstrualCycleReminderSettingsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "NEXT_PERIOD_KEY", "PERIOD_REMINDER_KEY", "PERIOD_TIME_KEY", "PERIOD_OCCURRENCE_KEY", "PERIOD_TEXT_KEY", "LOGGING_REMINDER_KEY", "LOGGING_TIME_KEY", "LOGGING_FREQUENCY_KEY", "LOGGING_TEXT_KEY", "", "REQUEST_CODE_PERIOD_TEXT", "I", "REQUEST_CODE_LOGGING_TEXT", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

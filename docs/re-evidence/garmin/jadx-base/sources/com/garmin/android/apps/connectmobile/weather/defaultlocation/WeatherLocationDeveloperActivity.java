package com.garmin.android.apps.connectmobile.weather.defaultlocation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import c22.t3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationDeveloperActivity;
import com.garmin.android.apps.connectmobile.z1;
import com.garmin.android.library.backgroundtaskmanagement.BizOperationException;
import e23.p;
import gw.g0;
import java.util.Objects;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.g;
import u53.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weather/defaultlocation/WeatherLocationDeveloperActivity;", "Lcom/garmin/android/apps/connectmobile/z1;", "Lo53/b0;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WeatherLocationDeveloperActivity extends z1 implements b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f47888c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f47889a = c0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47890b = "WeatherLocationDeveloperActivity";

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationDeveloperActivity$onCreate$2$1", f = "WeatherLocationDeveloperActivity.kt", l = {54}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public JSONObject f47891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UserSettingsDTO f47893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WeatherLocationDeveloperActivity f47894d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UserSettingsDTO userSettingsDTO, WeatherLocationDeveloperActivity weatherLocationDeveloperActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f47893c = userSettingsDTO;
            this.f47894d = weatherLocationDeveloperActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f47893c, this.f47894d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            JSONObject jSONObject;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f47892b;
            WeatherLocationDeveloperActivity weatherLocationDeveloperActivity = this.f47894d;
            if (i14 == 0) {
                r.b(obj);
                UserSettingsDTO userSettingsDTO = this.f47893c;
                JSONObject jSONObjectB = t3.b(userSettingsDTO.t1(), GCMSettingManager.s().t1());
                String str = weatherLocationDeveloperActivity.f47890b;
                Objects.toString(jSONObjectB);
                try {
                    o53.r<UserSettingsDTO> rVarK = new g0(null, userSettingsDTO, jSONObjectB).k();
                    this.f47891a = jSONObjectB;
                    this.f47892b = 1;
                    if (((s) rVarK).C(this) == aVar) {
                        return aVar;
                    }
                } catch (BizOperationException e4) {
                    e = e4;
                    jSONObject = jSONObjectB;
                    String str2 = weatherLocationDeveloperActivity.f47890b;
                    Objects.toString(jSONObject);
                    e.toString();
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jSONObject = this.f47891a;
                try {
                    r.b(obj);
                } catch (BizOperationException e14) {
                    e = e14;
                    String str3 = weatherLocationDeveloperActivity.f47890b;
                    Objects.toString(jSONObject);
                    e.toString();
                }
            }
            weatherLocationDeveloperActivity.runOnUiThread(new eh2.b(weatherLocationDeveloperActivity, 10));
            return Unit.INSTANCE;
        }
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final g getF195311f() {
        return this.f47889a.f168725a;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_weather_location_developer);
        initActionBar(true, getString(R.string.weather_location_settings_title));
        final int i14 = 0;
        ((Button) findViewById(R.id.clearSharedPreferencesBtn)).setOnClickListener(new View.OnClickListener(this) { // from class: g42.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeatherLocationDeveloperActivity f75792b;

            {
                this.f75792b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                d dVar;
                int i15 = i14;
                WeatherLocationDeveloperActivity weatherLocationDeveloperActivity = this.f75792b;
                switch (i15) {
                    case 0:
                        int i16 = WeatherLocationDeveloperActivity.f47888c;
                        du2.g.f61293g.getClass();
                        du2.g.a.e(weatherLocationDeveloperActivity, null, null);
                        du2.g.a.f(weatherLocationDeveloperActivity, null);
                        du2.g.a.b(weatherLocationDeveloperActivity).edit().putBoolean("key_user_has_seen_map_tooltip", false).apply();
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.f47923j.getClass();
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.a.a(weatherLocationDeveloperActivity, false);
                        Toast.makeText(weatherLocationDeveloperActivity, "Preferences Cleared", 1).show();
                        break;
                    case 1:
                        int i17 = WeatherLocationDeveloperActivity.f47888c;
                        UserSettingsDTO userSettingsDTOS = GCMSettingManager.s();
                        wi1.j jVar = userSettingsDTOS.f43524b;
                        if (jVar == null || (dVar = jVar.f185558w) == null) {
                            dVar = null;
                        } else {
                            dVar.f75784a = false;
                            dVar.f75788e = null;
                            dVar.f75787d = null;
                            dVar.f75789f = null;
                            dVar.f75785b = null;
                            dVar.f75786c = null;
                        }
                        if (dVar != null) {
                            ge1.b.T(weatherLocationDeveloperActivity, null, null, new WeatherLocationDeveloperActivity.a(userSettingsDTOS, weatherLocationDeveloperActivity, null), 3);
                            break;
                        }
                        break;
                    case 2:
                        int i18 = WeatherLocationDeveloperActivity.f47888c;
                        du2.g.f61293g.getClass();
                        du2.g.a.b(weatherLocationDeveloperActivity).edit().putBoolean("key_user_has_seen_map_tooltip", false).apply();
                        Toast.makeText(weatherLocationDeveloperActivity, "Tooltip Preference Reset", 0).show();
                        break;
                    default:
                        int i19 = WeatherLocationDeveloperActivity.f47888c;
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.f47923j.getClass();
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.a.a(weatherLocationDeveloperActivity, false);
                        Toast.makeText(weatherLocationDeveloperActivity, "Dialog Preference Reset", 0).show();
                        break;
                }
            }
        });
        final int i15 = 1;
        ((Button) findViewById(R.id.sendDefaultsToServerBtn)).setOnClickListener(new View.OnClickListener(this) { // from class: g42.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeatherLocationDeveloperActivity f75792b;

            {
                this.f75792b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                d dVar;
                int i16 = i15;
                WeatherLocationDeveloperActivity weatherLocationDeveloperActivity = this.f75792b;
                switch (i16) {
                    case 0:
                        int i17 = WeatherLocationDeveloperActivity.f47888c;
                        du2.g.f61293g.getClass();
                        du2.g.a.e(weatherLocationDeveloperActivity, null, null);
                        du2.g.a.f(weatherLocationDeveloperActivity, null);
                        du2.g.a.b(weatherLocationDeveloperActivity).edit().putBoolean("key_user_has_seen_map_tooltip", false).apply();
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.f47923j.getClass();
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.a.a(weatherLocationDeveloperActivity, false);
                        Toast.makeText(weatherLocationDeveloperActivity, "Preferences Cleared", 1).show();
                        break;
                    case 1:
                        int i18 = WeatherLocationDeveloperActivity.f47888c;
                        UserSettingsDTO userSettingsDTOS = GCMSettingManager.s();
                        wi1.j jVar = userSettingsDTOS.f43524b;
                        if (jVar == null || (dVar = jVar.f185558w) == null) {
                            dVar = null;
                        } else {
                            dVar.f75784a = false;
                            dVar.f75788e = null;
                            dVar.f75787d = null;
                            dVar.f75789f = null;
                            dVar.f75785b = null;
                            dVar.f75786c = null;
                        }
                        if (dVar != null) {
                            ge1.b.T(weatherLocationDeveloperActivity, null, null, new WeatherLocationDeveloperActivity.a(userSettingsDTOS, weatherLocationDeveloperActivity, null), 3);
                            break;
                        }
                        break;
                    case 2:
                        int i19 = WeatherLocationDeveloperActivity.f47888c;
                        du2.g.f61293g.getClass();
                        du2.g.a.b(weatherLocationDeveloperActivity).edit().putBoolean("key_user_has_seen_map_tooltip", false).apply();
                        Toast.makeText(weatherLocationDeveloperActivity, "Tooltip Preference Reset", 0).show();
                        break;
                    default:
                        int i110 = WeatherLocationDeveloperActivity.f47888c;
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.f47923j.getClass();
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.a.a(weatherLocationDeveloperActivity, false);
                        Toast.makeText(weatherLocationDeveloperActivity, "Dialog Preference Reset", 0).show();
                        break;
                }
            }
        });
        final int i16 = 2;
        ((Button) findViewById(R.id.resetTooltipValueBtn)).setOnClickListener(new View.OnClickListener(this) { // from class: g42.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeatherLocationDeveloperActivity f75792b;

            {
                this.f75792b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                d dVar;
                int i17 = i16;
                WeatherLocationDeveloperActivity weatherLocationDeveloperActivity = this.f75792b;
                switch (i17) {
                    case 0:
                        int i18 = WeatherLocationDeveloperActivity.f47888c;
                        du2.g.f61293g.getClass();
                        du2.g.a.e(weatherLocationDeveloperActivity, null, null);
                        du2.g.a.f(weatherLocationDeveloperActivity, null);
                        du2.g.a.b(weatherLocationDeveloperActivity).edit().putBoolean("key_user_has_seen_map_tooltip", false).apply();
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.f47923j.getClass();
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.a.a(weatherLocationDeveloperActivity, false);
                        Toast.makeText(weatherLocationDeveloperActivity, "Preferences Cleared", 1).show();
                        break;
                    case 1:
                        int i19 = WeatherLocationDeveloperActivity.f47888c;
                        UserSettingsDTO userSettingsDTOS = GCMSettingManager.s();
                        wi1.j jVar = userSettingsDTOS.f43524b;
                        if (jVar == null || (dVar = jVar.f185558w) == null) {
                            dVar = null;
                        } else {
                            dVar.f75784a = false;
                            dVar.f75788e = null;
                            dVar.f75787d = null;
                            dVar.f75789f = null;
                            dVar.f75785b = null;
                            dVar.f75786c = null;
                        }
                        if (dVar != null) {
                            ge1.b.T(weatherLocationDeveloperActivity, null, null, new WeatherLocationDeveloperActivity.a(userSettingsDTOS, weatherLocationDeveloperActivity, null), 3);
                            break;
                        }
                        break;
                    case 2:
                        int i110 = WeatherLocationDeveloperActivity.f47888c;
                        du2.g.f61293g.getClass();
                        du2.g.a.b(weatherLocationDeveloperActivity).edit().putBoolean("key_user_has_seen_map_tooltip", false).apply();
                        Toast.makeText(weatherLocationDeveloperActivity, "Tooltip Preference Reset", 0).show();
                        break;
                    default:
                        int i111 = WeatherLocationDeveloperActivity.f47888c;
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.f47923j.getClass();
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.a.a(weatherLocationDeveloperActivity, false);
                        Toast.makeText(weatherLocationDeveloperActivity, "Dialog Preference Reset", 0).show();
                        break;
                }
            }
        });
        final int i17 = 3;
        ((Button) findViewById(R.id.resetInfoDialogValueBtn)).setOnClickListener(new View.OnClickListener(this) { // from class: g42.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeatherLocationDeveloperActivity f75792b;

            {
                this.f75792b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                d dVar;
                int i18 = i17;
                WeatherLocationDeveloperActivity weatherLocationDeveloperActivity = this.f75792b;
                switch (i18) {
                    case 0:
                        int i19 = WeatherLocationDeveloperActivity.f47888c;
                        du2.g.f61293g.getClass();
                        du2.g.a.e(weatherLocationDeveloperActivity, null, null);
                        du2.g.a.f(weatherLocationDeveloperActivity, null);
                        du2.g.a.b(weatherLocationDeveloperActivity).edit().putBoolean("key_user_has_seen_map_tooltip", false).apply();
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.f47923j.getClass();
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.a.a(weatherLocationDeveloperActivity, false);
                        Toast.makeText(weatherLocationDeveloperActivity, "Preferences Cleared", 1).show();
                        break;
                    case 1:
                        int i110 = WeatherLocationDeveloperActivity.f47888c;
                        UserSettingsDTO userSettingsDTOS = GCMSettingManager.s();
                        wi1.j jVar = userSettingsDTOS.f43524b;
                        if (jVar == null || (dVar = jVar.f185558w) == null) {
                            dVar = null;
                        } else {
                            dVar.f75784a = false;
                            dVar.f75788e = null;
                            dVar.f75787d = null;
                            dVar.f75789f = null;
                            dVar.f75785b = null;
                            dVar.f75786c = null;
                        }
                        if (dVar != null) {
                            ge1.b.T(weatherLocationDeveloperActivity, null, null, new WeatherLocationDeveloperActivity.a(userSettingsDTOS, weatherLocationDeveloperActivity, null), 3);
                            break;
                        }
                        break;
                    case 2:
                        int i111 = WeatherLocationDeveloperActivity.f47888c;
                        du2.g.f61293g.getClass();
                        du2.g.a.b(weatherLocationDeveloperActivity).edit().putBoolean("key_user_has_seen_map_tooltip", false).apply();
                        Toast.makeText(weatherLocationDeveloperActivity, "Tooltip Preference Reset", 0).show();
                        break;
                    default:
                        int i112 = WeatherLocationDeveloperActivity.f47888c;
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.f47923j.getClass();
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.a.a(weatherLocationDeveloperActivity, false);
                        Toast.makeText(weatherLocationDeveloperActivity, "Dialog Preference Reset", 0).show();
                        break;
                }
            }
        });
    }
}

package com.garmin.android.apps.connectmobile.settings.devices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import ch1.a2;
import ch1.c5;
import ch1.d2;
import ch1.t2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import mt0.b2;
import ro0.l;
import wi1.j;
import zk0.h;

/* JADX INFO: loaded from: classes10.dex */
public class IntensityMinutesConfigActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f42140k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42141a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f42142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public UserSettingsDTO f42143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f42144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a2 f42146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t2 f42147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c5 f42148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d2 f42149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f42150j;

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<nr0.a> {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            IntensityMinutesConfigActivity intensityMinutesConfigActivity = IntensityMinutesConfigActivity.this;
            g1.b(intensityMinutesConfigActivity, cVar);
            intensityMinutesConfigActivity.hideProgressOverlay();
            intensityMinutesConfigActivity.f42142b.remove(Long.valueOf(j8));
            ArrayList<fb2.e> arrayList = intensityMinutesConfigActivity.f42141a;
            j jVar = intensityMinutesConfigActivity.f42144d;
            if (jVar == null || arrayList == null) {
                return;
            }
            for (fb2.e eVar : arrayList) {
                eVar.m(eVar.k(jVar));
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, nr0.a aVar) {
            IntensityMinutesConfigActivity intensityMinutesConfigActivity = IntensityMinutesConfigActivity.this;
            intensityMinutesConfigActivity.getClass();
            intensityMinutesConfigActivity.f42145e = aVar.b();
        }
    }

    public IntensityMinutesConfigActivity() {
        new nr0.a();
        this.f42142b = new ArrayList();
    }

    public static void da(Activity activity, UserSettingsDTO userSettingsDTO, int i14) {
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) IntensityMinutesConfigActivity.class);
            intent.putExtra("GCM_user_settings", userSettingsDTO);
            intent.putExtra("INTENSITY_MINUTES_GOAL", i14);
            activity.startActivityForResult(intent, 20);
        }
    }

    public final void ca() {
        a2 a2Var = this.f42146f;
        j jVar = this.f42144d;
        a2Var.getClass();
        if (a2.A(jVar) == j.d.HR_ZONES) {
            this.f42147g.l(true);
            this.f42148h.l(true);
            return;
        }
        this.f42144d.C(j.c.ZONE_3);
        this.f42147g.k(this.f42144d);
        this.f42147g.l(false);
        this.f42144d.D(j.c.ZONE_4);
        this.f42148h.k(this.f42144d);
        this.f42148h.l(false);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent();
        UserSettingsDTO userSettingsDTO = this.f42143c;
        userSettingsDTO.f43524b = this.f42144d;
        intent.putExtra("GCM_user_settings", userSettingsDTO);
        intent.putExtra("INTENSITY_MINUTES_GOAL", this.f42145e);
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_device_settings_intensity_minutes_config);
        Intent intent = getIntent();
        UserSettingsDTO userSettingsDTO = (UserSettingsDTO) intent.getParcelableExtra("GCM_user_settings");
        this.f42143c = userSettingsDTO;
        this.f42144d = userSettingsDTO.f43524b;
        this.f42145e = intent.getIntExtra("INTENSITY_MINUTES_GOAL", 150);
        h hVar = new h();
        this.f42150j = hVar;
        hVar.goalType = "INTENSITY_MINUTES";
        hVar.D(this.f42145e);
        super.initActionBar(true, R.string.user_settings_weekly_intensity_minutes);
        this.f42149i = new d2(this, true, new b2(this, 14));
        this.f42146f = new a2(this);
        this.f42147g = new t2(this);
        this.f42148h = new c5(this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        linearLayout.addView(fb2.g.a(this));
        linearLayout.addView(this.f42149i.a());
        linearLayout.addView(fb2.g.a(this));
        linearLayout.addView(this.f42146f.a());
        linearLayout.addView(fb2.g.a(this));
        linearLayout.addView(this.f42147g.a());
        linearLayout.addView(this.f42148h.a());
        boolean zG = this.f42149i.g(this, this.f42150j);
        this.f42149i.addObserver(this);
        this.f42149i.m(zG);
        a2 a2Var = this.f42146f;
        j jVar = this.f42144d;
        a2Var.getClass();
        boolean zY = a2Var.y(findViewById(a2.f27292h), this, jVar);
        this.f42146f.addObserver(this);
        this.f42146f.m(zY);
        boolean zG2 = this.f42147g.g(this, this.f42144d);
        this.f42147g.addObserver(this);
        this.f42147g.m(zG2);
        boolean zG3 = this.f42148h.g(this, this.f42144d);
        this.f42148h.addObserver(this);
        this.f42148h.m(zG3);
        ca();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.intensity_minutes_config, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.da(this, l.INTENSITY_MINUTES, null, null);
        return true;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj != null) {
            if (observable instanceof a2) {
                ca();
            }
            if (observable instanceof t2) {
                this.f42147g.k(this.f42144d);
                this.f42148h.k(this.f42144d);
            }
            if (observable instanceof c5) {
                this.f42148h.k(this.f42144d);
                this.f42147g.k(this.f42144d);
            }
        }
    }
}

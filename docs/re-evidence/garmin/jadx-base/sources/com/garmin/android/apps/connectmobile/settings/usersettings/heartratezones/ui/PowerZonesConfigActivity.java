package com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui;

import am.x0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import hb2.i;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import ro0.l;
import uk1.n;
import vk1.e;
import xk1.g;
import xk1.h;
import xk1.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/PowerZonesConfigActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PowerZonesConfigActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f44055i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ok1.b f44056a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f44058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44060e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f44062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f44063h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f44057b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f44061f = e.CYCLING;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44064a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.CROSS_COUNTRY_SKIING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.ROWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44064a = iArr;
        }
    }

    public static final void ca(Context context, int i14, String str) {
        f44055i.getClass();
        a.a(context, i14, str);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (!i.a(this)) {
            finish();
            return;
        }
        Fragment fragmentG = getSupportFragmentManager().G("powerZoneFragmentTag");
        if (fragmentG != null) {
            j jVar = (j) fragmentG;
            EditText editText = jVar.f191239j;
            if (editText != null) {
                editText.clearFocus();
            }
            EditText editText2 = jVar.f191240k;
            if (editText2 != null) {
                editText2.clearFocus();
            }
            EditText editText3 = jVar.f191242l;
            if (editText3 != null) {
                editText3.clearFocus();
            }
            EditText editText4 = jVar.f191243m;
            if (editText4 != null) {
                editText4.clearFocus();
            }
            EditText editText5 = jVar.f191244n;
            if (editText5 != null) {
                editText5.clearFocus();
            }
            EditText editText6 = jVar.f191245o;
            if (editText6 != null) {
                editText6.clearFocus();
            }
            EditText editText7 = jVar.f191246p;
            if (editText7 != null) {
                editText7.clearFocus();
            }
            EditText editText8 = jVar.f191247q;
            if (editText8 != null) {
                editText8.clearFocus();
            }
            EditText editText9 = jVar.f191249t;
            if (editText9 != null) {
                editText9.clearFocus();
            }
            EditText editText10 = jVar.f191250v;
            if (editText10 != null) {
                editText10.clearFocus();
            }
            EditText editText11 = jVar.f191251w;
            if (editText11 != null) {
                editText11.clearFocus();
            }
            EditText editText12 = jVar.f191252x;
            if (editText12 != null) {
                editText12.clearFocus();
            }
            EditText editText13 = jVar.f191253y;
            if (editText13 != null) {
                editText13.clearFocus();
            }
            EditText editText14 = jVar.f191254z;
            if (editText14 != null) {
                editText14.clearFocus();
            }
            EditText editText15 = jVar.A;
            if (editText15 != null) {
                editText15.clearFocus();
            }
            if (!jVar.f191232c) {
                finish();
                return;
            }
            showProgressOverlay();
            this.f44063h = new h(this);
            uk1.j jVarA = uk1.j.f171905b.a();
            ok1.b bVar = this.f44056a;
            bVar.getClass();
            h hVar = this.f44063h;
            jVarA.getClass();
            com.garmin.android.library.backgroundtaskmanagement.c.d(new n(bVar, jVarA), hVar);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String strA;
        super.onCreate(bundle);
        setContentView(R.layout.gcm_settings_powerzones);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("EXTRA_SPORT_TYPE");
        if (stringExtra != null) {
            this.f44061f = e.valueOf(stringExtra);
        }
        this.f44059d = intent.getIntExtra("EXTRA_CYCLING_FTP", 200);
        this.f44060e = intent.getIntExtra("EXTRA_RUNNING_FTP", 200);
        intent.getIntExtra("EXTRA_ROWING_FTP", 200);
        c3 c3Var = this.f44061f.f178605a;
        if (c3Var != null) {
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            strA = dh.b.A(applicationContext, c3Var);
        } else {
            strA = null;
        }
        initActionBar(true, strA);
        ((a31.e) KoinJavaComponent.get$default(a31.e.class, null, null, 6, null)).b(e31.a.POWER_ZONES_CONFIGURED);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.menu_help, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        Bundle bundle = new Bundle();
        int i14 = b.f44064a[this.f44061f.ordinal()];
        if (i14 == 1) {
            bundle.putString("GCM_extra_activity_type", x0.f4308n.f4358a);
        } else if (i14 == 2) {
            bundle.putString("GCM_extra_activity_type", x0.U1.f4358a);
        } else if (i14 != 3) {
            bundle.putString("GCM_extra_activity_type", x0.f4312o.f4358a);
        } else {
            bundle.putString("GCM_extra_activity_type", x0.f4273c2.f4358a);
        }
        HelpActivity.a aVar = HelpActivity.f36653a;
        l lVar = l.POWER_ZONES;
        aVar.getClass();
        HelpActivity.a.d(this, lVar, "DEFAULT_ACTION", bundle);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        long j8 = this.f44057b;
        if (j8 != -1) {
            com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(j8);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f44056a == null && hasInternetConnection()) {
            showProgressOverlay();
            this.f44062g = new g(this);
            uk1.j jVarA = uk1.j.f171905b.a();
            String strName = this.f44061f.name();
            g gVar = this.f44062g;
            gVar.getClass();
            jVarA.getClass();
            this.f44057b = com.garmin.android.library.backgroundtaskmanagement.c.d(new uk1.g(jVarA, false, strName, 2, null), gVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/PowerZonesConfigActivity$a;", "", "<init>", "()V", "", "EXTRA_SPORT_TYPE", "Ljava/lang/String;", "EXTRA_CYCLING_FTP", "EXTRA_RUNNING_FTP", "EXTRA_ROWING_FTP", "TAG", "POWER_ZONE_FRAGMENT_TAG", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, int i14, String str) {
            if (context != null) {
                Intent intent = new Intent(context, (Class<?>) PowerZonesConfigActivity.class);
                intent.putExtra("EXTRA_SPORT_TYPE", str);
                intent.putExtra("EXTRA_CYCLING_FTP", i14);
                context.startActivity(intent);
            }
        }

        private a() {
        }
    }
}

package com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui;

import am.a2;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import ch1.a1;
import ch1.q3;
import ch1.r3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import fb2.e;
import fb2.g;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vk1.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/RestingHeartRateActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Ljava/util/Observer;", "<init>", "()V", "b", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RestingHeartRateActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f44075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f44076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q3 f44077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r3 f44078e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a1 f44080g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f44074a = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f44079f = b.AUTO;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/RestingHeartRateActivity$b;", "", "", "resId", "<init>", "(Ljava/lang/String;II)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        AUTO(R.string.heart_rate_zones_auto_average),
        CUSTOM(R.string.heart_rate_zones_set_custom_resting_hr);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44084a;

        b(int i14) {
            this.f44084a = i14;
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("HR_ZONE_MODE_EXTRA", this.f44079f);
        f fVar = this.f44075b;
        fVar.getClass();
        intent.putExtra("RESTING_HEART_RATE_VALUE_EXTRA", fVar.f178613c);
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        initActionBar(true, R.string.hr_zones_lbl_resting_heart_rate);
        f fVar = (f) a2.c(getIntent().getExtras(), "HR_ZONE_EXTRA");
        this.f44075b = fVar;
        if (fVar == null) {
            i2.a aVar = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.SETTINGS;
            aVar.getClass();
            i2.a.f(a2Var, "RestingHeartRateActivity", "Missing SportHRZonesDTO");
            finish();
            return;
        }
        View viewFindViewById = findViewById(R.id.page_content);
        viewFindViewById.getClass();
        this.f44076c = (LinearLayout) viewFindViewById;
        f fVar2 = this.f44075b;
        fVar2.getClass();
        this.f44079f = fVar2.f178629t ? b.AUTO : b.CUSTOM;
        this.f44077d = new q3(this);
        this.f44080g = new a1(this);
        this.f44078e = new r3(this);
        ArrayList<e> arrayList = this.f44074a;
        arrayList.clear();
        q3 q3Var = this.f44077d;
        q3Var.getClass();
        arrayList.add(q3Var);
        a1 a1Var = this.f44080g;
        a1Var.getClass();
        arrayList.add(a1Var);
        r3 r3Var = this.f44078e;
        r3Var.getClass();
        arrayList.add(r3Var);
        if (arrayList != null) {
            for (e eVar : arrayList) {
                eVar.getClass();
                LinearLayout linearLayout = this.f44076c;
                linearLayout.getClass();
                linearLayout.addView(eVar.a());
                if (eVar instanceof q3) {
                    LinearLayout linearLayout2 = this.f44076c;
                    linearLayout2.getClass();
                    linearLayout2.addView(g.c(this, getString(R.string.heart_rate_zones_auto_average_help)));
                }
            }
        }
        q3 q3Var2 = this.f44077d;
        q3Var2.getClass();
        b bVar = this.f44079f;
        bVar.getClass();
        boolean zY = q3Var2.y(findViewById(q3.f27442h), this, bVar);
        q3 q3Var3 = this.f44077d;
        q3Var3.getClass();
        q3Var3.m(zY);
        q3 q3Var4 = this.f44077d;
        q3Var4.getClass();
        q3Var4.addObserver(this);
        q3 q3Var5 = this.f44077d;
        q3Var5.getClass();
        q3Var5.l(true);
        r3 r3Var2 = this.f44078e;
        r3Var2.getClass();
        f fVar3 = this.f44075b;
        fVar3.getClass();
        boolean zG = r3Var2.g(this, fVar3);
        r3 r3Var3 = this.f44078e;
        r3Var3.getClass();
        r3Var3.m(zG);
        r3 r3Var4 = this.f44078e;
        r3Var4.getClass();
        r3Var4.addObserver(this);
        r3 r3Var5 = this.f44078e;
        r3Var5.getClass();
        r3Var5.l(this.f44079f != b.AUTO);
        a1 a1Var2 = this.f44080g;
        a1Var2.getClass();
        a1 a1Var3 = this.f44080g;
        a1Var3.getClass();
        a1Var2.m(a1Var3.g(this, new Object()));
        a1 a1Var4 = this.f44080g;
        a1Var4.getClass();
        a1Var4.l(true);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList<e> arrayList = this.f44074a;
        if (arrayList != null) {
            for (e eVar : arrayList) {
                eVar.getClass();
                eVar.n();
            }
        }
        arrayList.clear();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
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

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        obj.getClass();
        if (obj instanceof b) {
            boolean z14 = obj == b.AUTO;
            if (z14) {
                f fVar = this.f44075b;
                fVar.getClass();
                f fVar2 = this.f44075b;
                fVar2.getClass();
                fVar.f178613c = fVar2.f178630v;
                r3 r3Var = this.f44078e;
                r3Var.getClass();
                f fVar3 = this.f44075b;
                fVar3.getClass();
                r3Var.k(fVar3);
            }
            r3 r3Var2 = this.f44078e;
            r3Var2.getClass();
            r3Var2.l(!z14);
            this.f44079f = (b) obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/RestingHeartRateActivity$a;", "", "<init>", "()V", "", "HR_ZONE_EXTRA", "Ljava/lang/String;", "HR_ZONE_MODE_EXTRA", "RESTING_HEART_RATE_VALUE_EXTRA", "TAG", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

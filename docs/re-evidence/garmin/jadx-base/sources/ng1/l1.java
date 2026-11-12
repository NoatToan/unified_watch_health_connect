package ng1;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l1 extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f125962i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f125963a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f125965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MenuItem f125966d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fh1.v0 f125969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fh1.n0 f125970h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f125964b = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f125967e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f125968f = View.generateViewId();

    public final androidx.appcompat.app.e ca(int i14) {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this);
        aVar.setMessage(i14);
        aVar.setNeutralButton(R.string.lbl_ok, new mt0.y(9));
        return aVar.create();
    }

    public void da() {
        HashSet<fb2.a> hashSet = this.f125967e;
        if (hashSet.size() == 1) {
            fb2.a aVar = (fb2.a) hashSet.iterator().next();
            if (aVar.i()) {
                aVar.l(false);
                return;
            }
            return;
        }
        for (fb2.a aVar2 : hashSet) {
            if (!aVar2.i()) {
                aVar2.l(true);
            }
        }
    }

    public void ea() {
        String string = null;
        for (fb2.e eVar : this.f125964b) {
            boolean zG = eVar.g(this, this.f125963a);
            eVar.addObserver(this);
            eVar.m(zG);
            if (eVar instanceof fb2.a) {
                fb2.a aVar = (fb2.a) eVar;
                if (!(aVar instanceof fh1.n0) && !(aVar instanceof fh1.v0) && aVar.q(this.f125963a)) {
                    this.f125967e.add(aVar);
                }
                if (aVar instanceof fh1.y0) {
                    aVar.f70327e = false;
                }
                if ((aVar instanceof fh1.r) || (aVar instanceof fh1.e)) {
                    string = getResources().getString(R.string.device_settings_last_displayed_footnote);
                }
            }
        }
        if (string != null) {
            ((TextView) findViewById(this.f125968f)).setText(string);
        }
        da();
    }

    public void fa() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        linearLayout.removeAllViews();
        for (fb2.e eVar : this.f125964b) {
            if (eVar instanceof fb2.a) {
                if (eVar instanceof fh1.v0) {
                    this.f125969g = (fh1.v0) eVar;
                }
                if (eVar instanceof fh1.n0) {
                    this.f125970h = (fh1.n0) eVar;
                }
                boolean z14 = eVar instanceof fh1.e;
                int i14 = this.f125968f;
                if (z14) {
                    linearLayout.addView(fb2.g.a(this));
                    linearLayout.addView(eVar.a());
                    TextView textViewC = fb2.g.c(this, "dummy_text");
                    textViewC.setId(i14);
                    linearLayout.addView(textViewC);
                } else if (eVar instanceof fh1.r) {
                    linearLayout.addView(fb2.g.a(this));
                    linearLayout.addView(eVar.a());
                    TextView textViewC2 = fb2.g.c(this, "dummy_text");
                    textViewC2.setId(i14);
                    linearLayout.addView(textViewC2);
                } else {
                    linearLayout.addView(eVar.a());
                }
            }
        }
        linearLayout.addView(fb2.g.a(this));
    }

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f125963a);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        Intent intent = getIntent();
        if (intent != null) {
            this.f125963a = (DeviceSettingsDTO) intent.getExtras().getParcelable("GCM_deviceSettings");
            String stringExtra = intent.getStringExtra("GCM_deviceSettingsTitle");
            this.f125965c = stringExtra;
            initActionBar(true, !TextUtils.isEmpty(stringExtra) ? this.f125965c : "");
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.connect_iq_app_mgt, menu);
        this.f125966d = menu.findItem(R.id.menu_item_reorder);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f125964b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        this.f125967e.clear();
    }

    public void update(Observable observable, Object obj) {
        if (obj != null) {
            boolean z14 = observable instanceof fb2.a;
            HashSet hashSet = this.f125967e;
            if (z14) {
                fb2.a aVar = (fb2.a) observable;
                if ((aVar instanceof fh1.n0) || (aVar instanceof fh1.v0) || !aVar.q(this.f125963a)) {
                    hashSet.remove(aVar);
                } else {
                    hashSet.add(aVar);
                }
            }
            fb2.a aVar2 = (fb2.a) observable;
            if (hashSet.size() == 0 && !(aVar2 instanceof fh1.n0) && !(aVar2 instanceof fh1.v0)) {
                if (this.f125970h.q(this.f125963a) && this.f125969g.q(this.f125963a)) {
                    ca(R.string.select_one_screen_heart_rate_and_stress).show();
                } else if (this.f125970h.q(this.f125963a) && !this.f125969g.q(this.f125963a)) {
                    ca(R.string.select_one_screen_heart_rate).show();
                } else if (!this.f125970h.q(this.f125963a) && this.f125969g.q(this.f125963a)) {
                    ca(R.string.select_one_screen_stress).show();
                }
            }
            da();
        }
    }
}

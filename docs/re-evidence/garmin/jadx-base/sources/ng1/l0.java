package ng1;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;
import c22.t3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l0 extends q implements Observer {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f125961r = new ArrayList();

    public static void ea(i.c cVar, List<fb2.e> list, UserSettingsDTO userSettingsDTO, Observer observer) {
        if (userSettingsDTO == null || list == null) {
            return;
        }
        for (fb2.e eVar : list) {
            boolean zG = eVar.g(cVar, userSettingsDTO);
            if (observer != null) {
                eVar.addObserver(observer);
            }
            eVar.m(zG);
        }
    }

    @Override // ng1.q
    public void ca(UserSettingsDTO userSettingsDTO) {
        ArrayList arrayList = this.f125961r;
        arrayList.clear();
        da();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        linearLayout.addView(fb2.g.a(this));
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linearLayout.addView(((fb2.e) it.next()).a());
            }
        }
        linearLayout.addView(fb2.g.a(this));
    }

    public void da() {
        ArrayList<fb2.e> arrayList = this.f125961r;
        if (arrayList != null) {
            for (fb2.e eVar : arrayList) {
                i2.k(a2.SETTINGS, "DynamicUserSettingsActivity", "Initializing: " + eVar.toString());
                eVar.m(eVar.g(this, new Object()));
                eVar.addObserver(this);
                eVar.l(true);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (com.garmin.android.library.backgroundtaskmanagement.c.f50123c.e(Long.valueOf(this.f125990d))) {
            super.onBackPressed();
            return;
        }
        UserSettingsDTO userSettingsDTO = this.f125995i;
        JSONObject jSONObjectB = userSettingsDTO != null ? t3.b(userSettingsDTO.t1(), this.f125996j) : null;
        i2.a(a2.SETTINGS, "BaseUserSettings", "User Settings JSON delta = " + jSONObjectB);
        if (jSONObjectB == null) {
            if (this.f125997k) {
                this.f126000n.x4(this.f125992f, "BaseUserSettings");
                Toast.makeText(this, R.string.msg_settings_saved_successfully, 0).show();
            }
            finish();
            return;
        }
        if (!hb2.i.a(this)) {
            finish();
            return;
        }
        this.f125987a = new s(this);
        if (this.f125995i == null) {
            finish();
        } else {
            showProgressOverlay();
            this.f125990d = ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).a(this.f125995i, jSONObjectB, this.f125987a);
        }
    }

    @Override // ng1.q, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_activity_options_dynamic_content);
        initActionBar(true, R.string.settings_title);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f125961r;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((fb2.e) it.next()).n();
            }
        }
        arrayList.clear();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    public void update(Observable observable, Object obj) {
    }
}

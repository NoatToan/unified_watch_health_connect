package ci2;

import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.presentationlayer.SettingsActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lci2/l;", "", "Lcom/garmin/androiddynamicsettings/app/presentationlayer/SettingsActivity;", "settingsActivity", "", "section", "deepLink", "<init>", "(Lcom/garmin/androiddynamicsettings/app/presentationlayer/SettingsActivity;Ljava/lang/String;Ljava/lang/String;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SettingsActivity f27707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hi2.d f27710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ii2.b f27711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nh2.d f27712f;

    public l(SettingsActivity settingsActivity, String str, String str2) {
        settingsActivity.getClass();
        str.getClass();
        this.f27707a = settingsActivity;
        this.f27708b = str;
        this.f27709c = str2;
        this.f27710d = new hi2.d("SettingsCoordinator", null, 2, null);
        nh2.d dVar = new nh2.d();
        this.f27712f = dVar;
        this.f27711e = (ii2.b) new x1(settingsActivity, new ii2.c(dVar)).b(s0.f105811a.b(ii2.b.class));
        settingsActivity.R9(true);
        dVar.b(new k(this), str);
    }

    public static final void a(l lVar) {
        lVar.f27710d.getClass();
        m.a aVar = m.f27713k;
        nh2.d dVar = lVar.f27712f;
        aVar.getClass();
        m mVarA = m.a.a(dVar);
        v supportFragmentManager = lVar.f27707a.getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.l(R.id.settings_fragment_container, mVarA, null);
        aVar2.e();
    }

    public final void b(boolean z14) {
        String strD;
        hi2.d dVar = this.f27710d;
        dVar.getClass();
        zh2.e.f204807a.getClass();
        nh2.a aVar = zh2.e.f204811e;
        aVar.getClass();
        Map<String, Object> map = aVar.f126155a.get(this.f27708b);
        if (map != null) {
            com.garmin.androiddynamicsettings.app.util.a.f50704a.getClass();
            strD = com.garmin.androiddynamicsettings.app.util.a.C1021a.d(map);
        } else {
            strD = null;
        }
        com.garmin.androiddynamicsettings.app.util.a.C1021a c1021a = com.garmin.androiddynamicsettings.app.util.a.f50704a;
        nh2.d dVar2 = this.f27712f;
        Map<String, Object> map2 = dVar2.f126168h;
        c1021a.getClass();
        String strD2 = com.garmin.androiddynamicsettings.app.util.a.C1021a.d(map2);
        SettingsActivity settingsActivity = this.f27707a;
        if (strD == null || strD2 == null) {
            dVar.b("Either updated or original DTO is null");
            zh2.a aVarA = zh2.e.a();
            String string = settingsActivity.getString(R.string.txt_something_went_wrong_try_again);
            string.getClass();
            ((uc0.d) aVarA).j(string);
            d(false, null);
            return;
        }
        try {
            HashMap<String, Object> mapA = com.garmin.androiddynamicsettings.app.util.a.C1021a.a(strD, strD2);
            if (mapA == null) {
                mapA = new HashMap<>();
            }
            mapA.toString();
            if (mapA.size() <= 0) {
                dVar.a("No differences in Settings change.");
                d(false, null);
                return;
            }
            dVar.a("Changes made. Need to save.");
            if (z14 || dVar2.f126165e != mh2.a.CancelConfirm) {
                c(strD, strD2, mapA);
            } else {
                kh2.g.f104792a.d(settingsActivity, new i(this));
            }
        } catch (JSONException e4) {
            dVar.b("Frame difference " + e4);
            zh2.e.f204807a.getClass();
            zh2.a aVarA2 = zh2.e.a();
            String string2 = settingsActivity.getString(R.string.txt_something_went_wrong_try_again);
            string2.getClass();
            ((uc0.d) aVarA2).j(string2);
            d(false, null);
        }
    }

    public final void c(String str, String str2, HashMap<String, Object> map) {
        Unit unit;
        SettingsActivity settingsActivity = this.f27707a;
        if (settingsActivity.f50696h) {
            settingsActivity.f50677n = 1;
            settingsActivity.R9(false);
            com.garmin.androiddynamicsettings.app.util.a.f50704a.getClass();
            String strD = com.garmin.androiddynamicsettings.app.util.a.C1021a.d(map);
            if (strD == null) {
                strD = "";
            }
            String str3 = this.f27708b;
            ni2.c cVar = new ni2.c(str3, str, str2, strD);
            zh2.e.f204807a.getClass();
            zh2.e.b().c(str3, cVar, new j(this, cVar, str, str2, map));
            return;
        }
        com.garmin.androiddynamicsettings.app.util.a.f50704a.getClass();
        String strD2 = com.garmin.androiddynamicsettings.app.util.a.C1021a.d(map);
        if (strD2 != null) {
            if (new JSONObject(strD2).length() > 0) {
                int i14 = settingsActivity.f50677n;
                c cVar2 = settingsActivity.f50693e;
                if (i14 <= 2) {
                    androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(settingsActivity).setTitle(settingsActivity.getString(R.string.lbl_what_i_do_alert_title)).setMessage(settingsActivity.getString(R.string.settings_internet_lost_reconnect)).setPositiveButton(settingsActivity.getString(R.string.common_retry), new g(this, str, str2, map, 0)).setNegativeButton(settingsActivity.getString(R.string.lbl_cancel), new ag0.e(28)).create();
                    eVarCreate.getClass();
                    cVar2.a(eVarCreate);
                } else {
                    androidx.appcompat.app.e eVarCreate2 = new androidx.appcompat.app.e.a(settingsActivity).setTitle(settingsActivity.getString(R.string.common_save_error_title)).setMessage(settingsActivity.getString(R.string.settings_try_again_internet)).setPositiveButton(settingsActivity.getString(R.string.lbl_ok), new h(this, 0)).create();
                    eVarCreate2.getClass();
                    cVar2.a(eVarCreate2);
                }
            } else {
                d(false, null);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            d(false, null);
        }
    }

    public final void d(boolean z14, ni2.c cVar) {
        StringBuilder sb3 = new StringBuilder("Closing ");
        String str = this.f27708b;
        sb3.append(str);
        sb3.append(" settings.");
        this.f27710d.a(sb3.toString());
        zh2.e.f204807a.getClass();
        if (zh2.e.b().equals(zh2.e.a())) {
            ((uc0.d) zh2.e.a()).b(str, cVar, z14);
        } else {
            zh2.e.b().b(str, cVar, z14);
            ((uc0.d) zh2.e.a()).b(str, cVar, z14);
        }
        this.f27707a.finish();
    }

    public final void e(boolean z14, ni2.c cVar) {
        this.f27707a.O9();
        zh2.e.f204807a.getClass();
        nh2.a aVar = zh2.e.f204811e;
        aVar.getClass();
        aVar.f126155a.remove(this.f27708b);
        d(z14, cVar);
    }
}

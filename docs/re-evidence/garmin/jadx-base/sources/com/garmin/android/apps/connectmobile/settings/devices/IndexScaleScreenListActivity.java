package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.y;
import com.garmin.android.apps.connectmobile.devices.model.z;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import fb2.b0;
import fb2.x;
import fh1.k;
import fh1.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import ng1.l1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/IndexScaleScreenListActivity;", "Lng1/l1;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IndexScaleScreenListActivity extends l1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f42138k = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f42139j = new ArrayList();

    public static int ga(String str) {
        switch (str.hashCode()) {
            case -1917362887:
                return !str.equals("ADVANCED_METRICS_FIELD_ID") ? -1 : 4;
            case -1795483022:
                return !str.equals("APP_NATIVE_ID_WEIGHT") ? -1 : 0;
            case -1411129560:
                return !str.equals("APP_NATIVE_ID_POWER_TO_WEIGHT") ? -1 : 2;
            case -1390577900:
                return !str.equals("APP_NATIVE_ID_BODY_WATER") ? -1 : 9;
            case -962356138:
                return !str.equals("APP_NATIVE_ID_BODY_FAT") ? -1 : 6;
            case -828618424:
                return !str.equals("APP_NATIVE_ID_MUSCLE_MASS") ? -1 : 7;
            case -214749276:
                return !str.equals("APP_NATIVE_ID_BMI") ? -1 : 5;
            case -55541419:
                return !str.equals("APP_NATIVE_ID_BONE_MASS") ? -1 : 8;
            case 167599898:
                return !str.equals("APP_NATIVE_ID_WEATHER") ? -1 : 3;
            case 1128342411:
                return !str.equals("APP_NATIVE_ID_WEIGHT_DELTA") ? -1 : 1;
            default:
                return -1;
        }
    }

    @Override // ng1.l1
    public final void da() {
        for (fb2.a aVar : this.f125964b) {
            if (aVar instanceof l) {
                l lVar = (l) aVar;
                if (s.g(lVar.f71597j, "APP_NATIVE_ID_WEIGHT")) {
                    lVar.l(false);
                }
            }
            if (aVar instanceof k) {
                boolean zX = ((k) aVar).x();
                ArrayList<l> arrayList = this.f42139j;
                if (zX) {
                    for (l lVar2 : arrayList) {
                        lVar2.m(true);
                        boolean zQ = lVar2.q(this.f125963a);
                        boolean z14 = lVar2.f70329g;
                        b0 b0Var = lVar2.f70345c;
                        if (z14) {
                            GCMComplexTwoLineButton gCMComplexTwoLineButton = ((x) b0Var).f70382b;
                            if (gCMComplexTwoLineButton != null) {
                                gCMComplexTwoLineButton.g(zQ);
                            }
                        } else {
                            GCMComplexOneLineButton gCMComplexOneLineButton = ((fb2.b) b0Var).f70333b;
                            if (gCMComplexOneLineButton != null) {
                                gCMComplexOneLineButton.i(zQ);
                            }
                        }
                    }
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((l) it.next()).m(false);
                    }
                }
            }
        }
    }

    @Override // ng1.l1
    public final void fa() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        linearLayout.removeAllViews();
        linearLayout.addView(fb2.g.a(this));
        TextView textViewC = fb2.g.c(this, getString(R.string.connect_iq_widgets));
        textViewC.setAllCaps(true);
        linearLayout.addView(textViewC);
        for (fb2.a aVar : this.f125964b) {
            if (aVar instanceof k) {
                linearLayout.addView(fb2.g.a(this));
            }
            linearLayout.addView(aVar.a());
        }
        f12.l.f68084a.getClass();
        if (f12.l.a.a().w().equals(UserSettingsDTO.c.MALE.f43537a)) {
            return;
        }
        linearLayout.addView(fb2.g.c(this, getString(R.string.msg_advanced_body_metrics_info)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void ha() {
        List<y> list;
        l lVar;
        ArrayList arrayList = this.f125964b;
        arrayList.clear();
        z zVarH = this.f125963a.H();
        if (zVarH == null || (list = zVarH.f34343c) == null) {
            finish();
        } else {
            ArrayMap arrayMap = new ArrayMap();
            Iterator<y> it = list.iterator();
            while (true) {
                int i14 = 0;
                if (it.hasNext()) {
                    String str = it.next().f34328a;
                    if (str != null) {
                        fh1.y.f71613a.getClass();
                        switch (str) {
                            case "APP_NATIVE_ID_WEIGHT":
                            case "APP_NATIVE_ID_POWER_TO_WEIGHT":
                            case "APP_NATIVE_ID_BODY_WATER":
                            case "APP_NATIVE_ID_BODY_FAT":
                            case "APP_NATIVE_ID_MUSCLE_MASS":
                            case "APP_NATIVE_ID_BMI":
                            case "APP_NATIVE_ID_BONE_MASS":
                            case "APP_NATIVE_ID_WEATHER":
                            case "APP_NATIVE_ID_WEIGHT_DELTA":
                                lVar = new l(this, str);
                                break;
                            default:
                                lVar = null;
                                break;
                        }
                        int iGa = ga(str);
                        if (lVar != null) {
                            lVar.f70327e = false;
                            arrayMap.put(Integer.valueOf(iGa), lVar);
                            String str2 = lVar.f71597j;
                            switch (str2.hashCode()) {
                                case -1390577900:
                                    if (!str2.equals("APP_NATIVE_ID_BODY_WATER")) {
                                    }
                                    break;
                                case -962356138:
                                    if (!str2.equals("APP_NATIVE_ID_BODY_FAT")) {
                                    }
                                    break;
                                case -828618424:
                                    if (!str2.equals("APP_NATIVE_ID_MUSCLE_MASS")) {
                                    }
                                    break;
                                case -214749276:
                                    if (!str2.equals("APP_NATIVE_ID_BMI")) {
                                    }
                                    break;
                                case -55541419:
                                    if (!str2.equals("APP_NATIVE_ID_BONE_MASS")) {
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            this.f42139j.add(lVar);
                        }
                    }
                } else {
                    arrayMap.put(Integer.valueOf(ga("ADVANCED_METRICS_FIELD_ID")), new k(this));
                    int size = arrayMap.size();
                    if (size >= 0) {
                        while (true) {
                            fb2.a aVar = (fb2.a) arrayMap.get(Integer.valueOf(i14));
                            if (aVar != null) {
                                arrayList.add(aVar);
                            }
                            if (i14 != size) {
                                i14++;
                            }
                        }
                    }
                }
            }
        }
        fa();
        ea();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 10) {
            DeviceSettingsDTO deviceSettingsDTO = null;
            deviceSettingsDTO = null;
            if (intent != null && intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                deviceSettingsDTO = (DeviceSettingsDTO) (extras != null ? extras.get("GCM_deviceSettings") : null);
            }
            if (deviceSettingsDTO != null) {
                this.f125963a = deviceSettingsDTO;
                ha();
            }
        }
    }

    @Override // ng1.l1, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.components_title);
        ha();
    }

    @Override // ng1.l1, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f125966d.setVisible(false);
        return true;
    }

    @Override // ng1.l1, java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        if (observable instanceof k) {
            da();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/IndexScaleScreenListActivity$a;", "", "<init>", "()V", "", "ADVANCED_METRICS_FIELD_ID", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

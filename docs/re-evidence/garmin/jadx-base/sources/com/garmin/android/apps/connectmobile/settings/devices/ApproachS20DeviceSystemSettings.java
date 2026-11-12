package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import ch1.c1;
import ch1.s4;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import fb2.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/ApproachS20DeviceSystemSettings;", "Lcom/garmin/android/apps/connectmobile/c;", "Ljava/util/Observer;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ApproachS20DeviceSystemSettings extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f41879c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41880a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeviceSettingsDTO f41881b;

    @Override // android.app.Activity
    public final void finish() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.n(a2Var, "ApproachS20DeviceSystemSettings", "finish()");
        ArrayList arrayList = this.f41880a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        getIntent().putExtra("GCM_deviceSettings", this.f41881b);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        Bundle extras = getIntent().getExtras();
        boolean booleanExtra = false;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_deviceSettings", DeviceSettingsDTO.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_deviceSettings");
                if (!(parcelable2 instanceof DeviceSettingsDTO)) {
                    parcelable2 = null;
                }
                parcelable = (DeviceSettingsDTO) parcelable2;
            }
            this.f41881b = (DeviceSettingsDTO) parcelable;
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            booleanExtra = getIntent().getBooleanExtra("MilitaryTimeFormatSupported", false);
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.device_setting_system);
            }
            initActionBar(true, stringExtra);
        }
        if (this.f41881b == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            aVar.getClass();
            i2.a.f(a2Var, "ApproachS20DeviceSystemSettings", "Invalid device settings object while entering device settings time, date, system screen!");
            finish();
            return;
        }
        findViewById(R.id.header_view).setVisibility(8);
        ArrayList<fb2.e> arrayList = this.f41880a;
        arrayList.clear();
        arrayList.add(new s4(this, booleanExtra));
        arrayList.add(new c1(this));
        View viewFindViewById = findViewById(R.id.page_content);
        viewFindViewById.getClass();
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        DeviceSettingsDTO deviceSettingsDTO = this.f41881b;
        if (deviceSettingsDTO != null) {
            for (fb2.e eVar : arrayList) {
                if (!(eVar instanceof r) && eVar.h(deviceSettingsDTO)) {
                    linearLayout.addView(fb2.g.a(this));
                }
                linearLayout.addView(eVar.a());
            }
            linearLayout.addView(fb2.g.a(this));
            for (fb2.e eVar2 : arrayList) {
                boolean zG = eVar2.g(this, deviceSettingsDTO);
                eVar2.addObserver(this);
                eVar2.m(zG);
            }
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        obj.getClass();
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.n(a2.SETTINGS, "ApproachS20DeviceSystemSettings", "update(): observable=" + observable + ", data=" + obj);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/ApproachS20DeviceSystemSettings$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_MILITARY_TIME_FORMAT_SUPPORTED", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

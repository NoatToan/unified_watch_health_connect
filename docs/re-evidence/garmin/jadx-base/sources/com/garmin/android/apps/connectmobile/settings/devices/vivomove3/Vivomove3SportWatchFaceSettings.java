package com.garmin.android.apps.connectmobile.settings.devices.vivomove3;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.i0;
import bi1.n;
import bi1.o;
import ch1.v5;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import fb2.e;
import ge1.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import o13.p;
import o53.f0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.u0;
import sd2.f;
import zb0.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivomove3/Vivomove3SportWatchFaceSettings;", "Lcom/garmin/android/apps/connectmobile/c;", "Ljava/util/Observer;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class Vivomove3SportWatchFaceSettings extends c implements Observer {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f43206g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f43207h = "Vivomove3SportWatchFaceSettings";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f43208i = u0.e(new p(DeviceSettingsDTO.q.ANALOG_GENERIC_1, 2131232142), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_2, 2131232144), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_3, 2131232146), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_4, 2131232148), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_5, 2131232150), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_6, 2131232152), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_7, 2131232154), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_8, 2131232156), new p(DeviceSettingsDTO.q.ANALOG_GENERIC_9, 2131232158));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeviceSettingsDTO f43210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v5 f43211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f43212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f43213e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43209a = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f43214f = 2131232352;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$q, java.lang.Integer>] */
    public Map<DeviceSettingsDTO.q, Integer> ca() {
        return f43208i;
    }

    public v5 da() {
        return new n(this);
    }

    public String ea(f fVar) {
        if (fVar != null) {
            return t.d(fVar);
        }
        return null;
    }

    @Override // android.app.Activity
    public final void finish() {
        ArrayList arrayList = this.f43209a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((e) it.next()).n();
        }
        arrayList.clear();
        Intent intent = getIntent();
        DeviceSettingsDTO deviceSettingsDTO = this.f43210b;
        if (deviceSettingsDTO == null) {
            s.m("deviceSettingsDTO");
            throw null;
        }
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        Intent intent2 = getIntent();
        DeviceSettingsDTO deviceSettingsDTO2 = this.f43210b;
        if (deviceSettingsDTO2 == null) {
            s.m("deviceSettingsDTO");
            throw null;
        }
        intent2.putExtra("activityForResult", deviceSettingsDTO2.Y1().toString());
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DeviceSettingsDTO deviceSettingsDTO;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_watch_faces);
        View viewFindViewById = findViewById(R.id.image_watchface_current_view);
        viewFindViewById.getClass();
        this.f43212d = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.image_device_frame);
        viewFindViewById2.getClass();
        this.f43213e = (ImageView) viewFindViewById2;
        Bundle extras = getIntent().getExtras();
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
            deviceSettingsDTO = (DeviceSettingsDTO) parcelable;
        } else {
            deviceSettingsDTO = null;
        }
        String str = f43207h;
        if (deviceSettingsDTO == null) {
            a2 a2Var = a2.SETTINGS;
            i2.f36769a.getClass();
            i2.a.f(a2Var, str, "Invalid device settings object while entering device watch face settings !");
            finish();
            return;
        }
        this.f43210b = deviceSettingsDTO;
        i0 i0VarW = f0.w(this);
        x53.c cVar = s0.f129406a;
        b.T(i0VarW, x53.b.f189152a, null, new o(this, null), 2);
        Integer num = ca().get(deviceSettingsDTO.i0());
        if (num != null) {
            int iIntValue = num.intValue();
            ImageView imageView = this.f43212d;
            if (imageView == null) {
                s.m("imageWatchfaceCurrentView");
                throw null;
            }
            imageView.setImageResource(iIntValue);
        }
        Bundle extras2 = getIntent().getExtras();
        initActionBar(true, extras2 != null ? extras2.getString("GCM_deviceSettingsTitle") : null);
        this.f43211c = da();
        ArrayList<e> arrayList = this.f43209a;
        arrayList.clear();
        v5 v5Var = this.f43211c;
        if (v5Var == null) {
            s.m("watchFaceField");
            throw null;
        }
        arrayList.add(v5Var);
        for (e eVar : arrayList) {
            i2.f36769a.getClass();
            i2.a.n(a2.SETTINGS, str, "Initializing: " + eVar);
            DeviceSettingsDTO deviceSettingsDTO2 = this.f43210b;
            if (deviceSettingsDTO2 == null) {
                s.m("deviceSettingsDTO");
                throw null;
            }
            boolean zG = eVar.g(this, deviceSettingsDTO2);
            eVar.addObserver(this);
            eVar.m(zG);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        a2 a2Var = a2.SETTINGS;
        String strJ = hb.a.j("update: observable=", observable, ", data=", obj);
        i2.f36769a.getClass();
        i2.a.n(a2Var, f43207h, strJ);
        if (obj != null) {
            Integer num = ca().get((DeviceSettingsDTO.q) obj);
            if (num != null) {
                int iIntValue = num.intValue();
                ImageView imageView = this.f43212d;
                if (imageView == null) {
                    s.m("imageWatchfaceCurrentView");
                    throw null;
                }
                imageView.setImageResource(iIntValue);
            }
            v5 v5Var = this.f43211c;
            if (v5Var == null) {
                s.m("watchFaceField");
                throw null;
            }
            DeviceSettingsDTO deviceSettingsDTO = this.f43210b;
            if (deviceSettingsDTO == null) {
                s.m("deviceSettingsDTO");
                throw null;
            }
            v5Var.A(this, deviceSettingsDTO);
            v5 v5Var2 = this.f43211c;
            if (v5Var2 != null) {
                v5Var2.m(true);
            } else {
                s.m("watchFaceField");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivomove3/Vivomove3SportWatchFaceSettings$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

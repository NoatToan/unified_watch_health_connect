package com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.e;
import ch1.f0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.controlsmenu.ControlsMenuActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music.Vivoactive3MusicAppearanceActivity;
import da2.d;
import fb2.g;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import la2.b;
import la2.c;
import la2.h;
import n23.j;
import ng1.p;
import org.koin.java.KoinJavaComponent;
import xg1.l;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
public class Vivoactive3MusicAppearanceActivity extends p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f43160r = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f43161m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f43162n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f0 f43164p;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f43163o = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f43165q = new a();

    public class a implements la2.a {
        public a() {
        }

        @Override // la2.a
        public final void onDeviceConnected(b bVar) {
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(h hVar) {
            e.a aVar = new e.a(Vivoactive3MusicAppearanceActivity.this);
            aVar.setTitle(R.string.connect_iq_device_has_disconnected_title);
            aVar.setMessage(R.string.connect_iq_device_has_disconnected_msg);
            aVar.setPositiveButton(R.string.lbl_ok, new l(this, 10));
            aVar.create().show();
        }
    }

    public final boolean ea() {
        boolean zA = ((l80.b) KoinJavaComponent.get(l80.b.class)).a(this.f43162n);
        if (!zA) {
            e.a aVar = new e.a(this);
            aVar.setTitle(R.string.connect_iq_device_not_connected_title);
            aVar.setMessage(R.string.connect_iq_device_not_connected_msg);
            aVar.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
            aVar.create().show();
        }
        return zA;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "ConnectIQManagementActivity");
        if (i15 == -1 && i14 == 10) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO == null || this.f125976b <= 0) {
                return;
            }
            for (fb2.e eVar : this.f43163o) {
                eVar.m(eVar.k(deviceSettingsDTO));
            }
            this.f125985k = deviceSettingsDTO;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (ca()) {
            super.onBackPressed();
        } else {
            da();
        }
    }

    @Override // ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f43162n = intent.getLongExtra("CONNECT_IQ_DEVICE_UNIT_ID", -1L);
        intent.getStringExtra("CONNECT_IQ_DEVICE_SKU");
        if (this.f43162n == -1) {
            this.f43162n = intent.getLongExtra("GCM_deviceUnitID", -1L);
        }
        if (this.f43162n == -1) {
            i2.f(a2.SETTINGS, "ConnectIQManagementActivity", "Missing required device unit id parameter");
            finish();
            return;
        }
        setContentView(R.layout.gcm_vva3m_appearance);
        super.initActionBar(true, R.string.appearance_title);
        final int i14 = 0;
        findViewById(R.id.custom_bttn_watchfaces).setOnClickListener(new View.OnClickListener(this) { // from class: yh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Vivoactive3MusicAppearanceActivity f197284b;

            {
                this.f197284b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                Vivoactive3MusicAppearanceActivity vivoactive3MusicAppearanceActivity = this.f197284b;
                switch (i15) {
                    case 0:
                        int i16 = Vivoactive3MusicAppearanceActivity.f43160r;
                        if (vivoactive3MusicAppearanceActivity.ea()) {
                            ((d0) KoinJavaComponent.get(d0.class)).E(vivoactive3MusicAppearanceActivity, vivoactive3MusicAppearanceActivity.f43162n);
                        }
                        break;
                    default:
                        int i17 = Vivoactive3MusicAppearanceActivity.f43160r;
                        if (vivoactive3MusicAppearanceActivity.ea()) {
                            ((d0) KoinJavaComponent.get(d0.class)).P(vivoactive3MusicAppearanceActivity, vivoactive3MusicAppearanceActivity.f43162n);
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        findViewById(R.id.custom_bttn_widgets).setOnClickListener(new View.OnClickListener(this) { // from class: yh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Vivoactive3MusicAppearanceActivity f197284b;

            {
                this.f197284b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                Vivoactive3MusicAppearanceActivity vivoactive3MusicAppearanceActivity = this.f197284b;
                switch (i16) {
                    case 0:
                        int i17 = Vivoactive3MusicAppearanceActivity.f43160r;
                        if (vivoactive3MusicAppearanceActivity.ea()) {
                            ((d0) KoinJavaComponent.get(d0.class)).E(vivoactive3MusicAppearanceActivity, vivoactive3MusicAppearanceActivity.f43162n);
                        }
                        break;
                    default:
                        int i18 = Vivoactive3MusicAppearanceActivity.f43160r;
                        if (vivoactive3MusicAppearanceActivity.ea()) {
                            ((d0) KoinJavaComponent.get(d0.class)).P(vivoactive3MusicAppearanceActivity, vivoactive3MusicAppearanceActivity.f43162n);
                        }
                        break;
                }
            }
        });
        this.f43164p = new f0(this);
        ArrayList<fb2.e> arrayList = this.f43163o;
        arrayList.clear();
        arrayList.add(this.f43164p);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((fb2.e) it.next()) instanceof f0) {
                linearLayout.addView(this.f43164p.a());
            }
        }
        linearLayout.addView(g.a(this));
        for (fb2.e eVar : arrayList) {
            boolean zG = eVar.g(this, this.f125985k);
            eVar.addObserver(this);
            eVar.m(zG);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.f43161m) {
            d.b().f58886a.i(this.f43165q);
            this.f43161m = false;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f43161m) {
            return;
        }
        d.b().f58886a.b(this.f43165q);
        this.f43161m = true;
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj == null || !(observable instanceof f0)) {
            return;
        }
        ControlsMenuActivity.ia(this, this.f125985k, (String) obj, 2131233592, 10, this.f125976b, false);
    }
}

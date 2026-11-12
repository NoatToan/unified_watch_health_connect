package com.garmin.android.apps.connectmobile.settings.devices;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.lifecycle.x1;
import c22.l3;
import c22.t3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.PowerZonesConfigActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.PowerZonesListActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;
import mt0.b2;
import ng1.e0;
import ng1.f0;
import ng1.g0;
import ng1.h0;
import ng1.i0;
import o72.t;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import xk1.v;
import z10.d1;
import zb0.d0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceUserSettingsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final /* synthetic */ int f42010c1 = 0;
    public GCMComplexTwoLineButton A;
    public GCMComplexOneLineButton B;
    public ViewGroup C;
    public GCMComplexTwoLineButton D;
    public GCMComplexTwoLineButton E;
    public GCMComplexTwoLineButton F;
    public final e0 H0;
    public final e0 Q0;
    public final e0 R0;
    public final e0 S0;
    public long T;
    public xk0.g X;
    public oc1.d Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f42013b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public ArrayList<bm2.c> f42014b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public UserSettingsDTO f42015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONObject f42016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zk0.c f42017e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zk0.h f42019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zk0.h f42020h;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f42024k0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public lj0.j f42027n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f42028o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public GCMComplexTwoLineButton f42029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public GCMComplexTwoLineButton f42030q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public GCMComplexTwoLineButton f42031r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GCMComplexTwoLineButton f42032t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexTwoLineButton f42033v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ViewGroup f42034w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public GCMComplexTwoLineButton f42035x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public GCMComplexTwoLineButton f42036y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ViewGroup f42037z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f42018f = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f42021i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f42022j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42023k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f42025l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f42026m = false;
    public long I = -1;
    public long P = -1;
    public boolean Z = false;
    public final i I0 = new i();
    public final j J0 = new j();
    public final k K0 = new k();
    public final l L0 = new l();
    public final m M0 = new m();
    public final n N0 = new n();
    public final o O0 = new o();
    public final p P0 = new p();
    public final q T0 = new q();
    public final a U0 = new a();
    public final b V0 = new b();
    public final c W0 = new c();
    public final d X0 = new d();
    public final e Y0 = new e();
    public final f Z0 = new f();

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final g f42012a1 = new g();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int iIntValue;
            boolean z14;
            DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
            zk0.c cVar = deviceUserSettingsActivity.f42017e;
            if (cVar != null) {
                int iIntValue2 = cVar.getUserGoal().intValue();
                zk0.c cVar2 = deviceUserSettingsActivity.f42017e;
                if (iIntValue2 > 0) {
                    iIntValue = cVar2.getUserGoal().intValue();
                    z14 = false;
                } else {
                    iIntValue = cVar2.getDeviceGoal().intValue();
                    z14 = true;
                }
                xg1.m.u6(new b2(this, 10), iIntValue, z14).show(deviceUserSettingsActivity.getSupportFragmentManager(), "");
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
            zk0.h hVar = deviceUserSettingsActivity.f42019g;
            if (hVar != null) {
                qh0.a.u6(hVar.C(), new b2(this, 11)).show(deviceUserSettingsActivity.getSupportFragmentManager(), (String) null);
            }
        }
    }

    public class c implements View.OnClickListener {

        public class a implements xg1.i<Double> {
            public a() {
            }

            @Override // xg1.i
            public final void a(Double d14) {
                int iIntValue = d14.intValue();
                c cVar = c.this;
                if (iIntValue < 150 || 99999 < iIntValue) {
                    DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
                    Toast.makeText(deviceUserSettingsActivity, deviceUserSettingsActivity.getString(R.string.wellness_goal_error, Integer.toString(150), Integer.toString(DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE)), 0).show();
                    return;
                }
                DeviceUserSettingsActivity deviceUserSettingsActivity2 = DeviceUserSettingsActivity.this;
                DeviceUserSettingsActivity deviceUserSettingsActivity3 = DeviceUserSettingsActivity.this;
                if (deviceUserSettingsActivity2.f42020h.C() != iIntValue) {
                    deviceUserSettingsActivity3.ea(iIntValue);
                    deviceUserSettingsActivity3.f42018f = true;
                }
            }
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
            if (deviceUserSettingsActivity.f42020h != null) {
                ur0.a aVarS = ((d0) KoinJavaComponent.get(d0.class)).S(Double.valueOf(deviceUserSettingsActivity.f42020h.C()));
                aVarS.f172323d = new a();
                aVarS.g(deviceUserSettingsActivity.getSupportFragmentManager());
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
            zk0.h hVar = deviceUserSettingsActivity.f42020h;
            if (hVar != null) {
                IntensityMinutesConfigActivity.da(deviceUserSettingsActivity, deviceUserSettingsActivity.f42015c, hVar.C());
            }
        }
    }

    public class e implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public e() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
            deviceUserSettingsActivity.I = -1L;
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS && deviceUserSettingsActivity.f42015c != null) {
                deviceUserSettingsActivity.ca();
                return;
            }
            i2.f(a2.SETTINGS, "DeviceUserSettingsActivity", "Error fetching user settings from GC [" + cVar.name() + "].");
            if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK) {
                Toast.makeText(deviceUserSettingsActivity, R.string.txt_error_occurred, 0).show();
            }
            deviceUserSettingsActivity.finish();
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            UserSettingsDTO userSettingsDTO = (UserSettingsDTO) obj;
            DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
            deviceUserSettingsActivity.f42015c = userSettingsDTO;
            deviceUserSettingsActivity.f42016d = userSettingsDTO.t1();
        }
    }

    public class f implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public f() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
            deviceUserSettingsActivity.P = -1L;
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                deviceUserSettingsActivity.Y.x4(deviceUserSettingsActivity.f42013b, "DeviceUserSettingsActivity");
                ((l80.b) KoinJavaComponent.get(l80.b.class)).n(deviceUserSettingsActivity, deviceUserSettingsActivity.f42013b, "DeviceUserSettingsActivity");
                Toast.makeText(deviceUserSettingsActivity, deviceUserSettingsActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
            } else {
                i2.f(a2.SETTINGS, "DeviceUserSettingsActivity", "Error saving user settings to GC [" + cVar.name() + "].");
                if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK) {
                    Toast.makeText(deviceUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                }
            }
            deviceUserSettingsActivity.hideProgressOverlay();
            deviceUserSettingsActivity.finish();
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    public class g implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<List<PowerZonesDTO>> {
        public g() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
            deviceUserSettingsActivity.hideProgressOverlay();
            g1.b(deviceUserSettingsActivity, cVar);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, List<PowerZonesDTO> list) {
            DeviceUserSettingsActivity.this.f42024k0 = t.L(vk1.e.CYCLING.name(), list);
        }
    }

    public static /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42046a;

        static {
            int[] iArr = new int[fw.p.values().length];
            f42046a = iArr;
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42046a[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42046a[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
            int iOrdinal = (deviceUserSettingsActivity.f42015c.G() != null ? deviceUserSettingsActivity.f42015c.G() : UserSettingsDTO.c.MALE).ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(deviceUserSettingsActivity);
            aVar.setTitle(R.string.lbl_gender).setSingleChoiceItems(UserSettingsDTO.c.a(deviceUserSettingsActivity), iOrdinal, new kx0.f(this, 17));
            aVar.create().show();
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            new com.garmin.android.apps.connectmobile.settings.d(DeviceUserSettingsActivity.this, new b2(this, 12));
        }
    }

    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
            deviceUserSettingsActivity.f42015c.S0(-1.0d);
            deviceUserSettingsActivity.ha();
        }
    }

    public class l implements View.OnClickListener {
        public l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
            if (deviceUserSettingsActivity.f42015c != null) {
                new j42.b(deviceUserSettingsActivity, new b2(this, 13));
            }
        }
    }

    public class m implements View.OnClickListener {
        public m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
            deviceUserSettingsActivity.f42015c.s1(0.0d);
            deviceUserSettingsActivity.la();
        }
    }

    public class n implements View.OnClickListener {
        public n() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14;
            int i15;
            DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
            UserSettingsDTO userSettingsDTO = deviceUserSettingsActivity.f42015c;
            if (userSettingsDTO != null) {
                long jM = userSettingsDTO.M();
                l3.f23124b.getClass();
                int[] iArrF = l3.a.f(jM);
                if (iArrF != null) {
                    int i16 = iArrF[0];
                    i15 = iArrF[1];
                    i14 = i16;
                } else {
                    i14 = 22;
                    i15 = 0;
                }
                ls0.m mVar = new ls0.m(this, 3);
                DeviceUserSettingsActivity deviceUserSettingsActivity2 = DeviceUserSettingsActivity.this;
                TimePickerDialog timePickerDialog = new TimePickerDialog(deviceUserSettingsActivity2, R.style.GCMTimePicker, mVar, i14, i15, DateFormat.is24HourFormat(deviceUserSettingsActivity2));
                timePickerDialog.setTitle(R.string.sleep_lbl_start_time);
                timePickerDialog.show();
                og.a.W(timePickerDialog, deviceUserSettingsActivity);
                og.a.w(timePickerDialog, deviceUserSettingsActivity);
            }
        }
    }

    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14;
            int i15;
            DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
            UserSettingsDTO userSettingsDTO = deviceUserSettingsActivity.f42015c;
            if (userSettingsDTO != null) {
                long jZ = userSettingsDTO.Z();
                l3.f23124b.getClass();
                int[] iArrF = l3.a.f(jZ);
                if (iArrF != null) {
                    int i16 = iArrF[0];
                    i15 = iArrF[1];
                    i14 = i16;
                } else {
                    i14 = 6;
                    i15 = 0;
                }
                ls0.m mVar = new ls0.m(this, 4);
                DeviceUserSettingsActivity deviceUserSettingsActivity2 = DeviceUserSettingsActivity.this;
                TimePickerDialog timePickerDialog = new TimePickerDialog(deviceUserSettingsActivity2, R.style.GCMTimePicker, mVar, i14, i15, DateFormat.is24HourFormat(deviceUserSettingsActivity2));
                timePickerDialog.setTitle(R.string.sleep_lbl_wake_time);
                timePickerDialog.show();
                og.a.w(timePickerDialog, deviceUserSettingsActivity);
                og.a.W(timePickerDialog, deviceUserSettingsActivity);
            }
        }
    }

    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
            int iOrdinal = deviceUserSettingsActivity.f42015c.H().ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(deviceUserSettingsActivity);
            aVar.setTitle(R.string.handedness_title).setSingleChoiceItems(UserSettingsDTO.d.a(deviceUserSettingsActivity), iOrdinal, new kx0.f(this, 18));
            aVar.create().show();
        }
    }

    public class q implements View.OnClickListener {
        public q() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            d0 d0Var = (d0) KoinJavaComponent.get(d0.class);
            DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
            d0Var.m(deviceUserSettingsActivity, deviceUserSettingsActivity.f42011a, -1);
            deviceUserSettingsActivity.f42018f = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ng1.e0] */
    /* JADX WARN: Type inference failed for: r0v10, types: [ng1.e0] */
    /* JADX WARN: Type inference failed for: r0v11, types: [ng1.e0] */
    /* JADX WARN: Type inference failed for: r0v12, types: [ng1.e0] */
    public DeviceUserSettingsActivity() {
        final int i14 = 0;
        this.H0 = new View.OnClickListener(this) { // from class: ng1.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceUserSettingsActivity f125925b;

            {
                this.f125925b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x003e  */
            /* JADX WARN: Code duplicated, block: B:19:0x0050  */
            /* JADX WARN: Code duplicated, block: B:20:0x006c  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String strA0;
                int i15 = i14;
                bm2.c cVar = null;
                DeviceUserSettingsActivity deviceUserSettingsActivity = this.f125925b;
                switch (i15) {
                    case 0:
                        int i16 = DeviceUserSettingsActivity.f42010c1;
                        deviceUserSettingsActivity.startActivity(new Intent(deviceUserSettingsActivity, (Class<?>) UpdateBirthdateActivity.class));
                        break;
                    case 1:
                        if (deviceUserSettingsActivity.Z) {
                            PowerZonesListActivity.ca(deviceUserSettingsActivity, deviceUserSettingsActivity.f42013b);
                        } else {
                            PowerZonesConfigActivity.ca(deviceUserSettingsActivity, deviceUserSettingsActivity.f42024k0, vk1.e.CYCLING.name());
                        }
                        deviceUserSettingsActivity.f42018f = true;
                        break;
                    case 2:
                        for (bm2.c cVar2 : deviceUserSettingsActivity.f42014b1) {
                            String str = deviceUserSettingsActivity.f42011a;
                            if (str != null && (str.equals(cVar2.f18899b) || cVar2.f18899b.contains(deviceUserSettingsActivity.f42011a))) {
                                cVar = cVar2;
                                if (cVar != null) {
                                    strA0 = ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).a0(deviceUserSettingsActivity.f42011a, cVar.f18932r);
                                    if (strA0 != null) {
                                        Intent intent = new Intent();
                                        intent.setClassName(deviceUserSettingsActivity, strA0);
                                        intent.putExtra("GCM_deviceUnitID", deviceUserSettingsActivity.f42013b);
                                        intent.putExtra("GCM_deviceProductNbr", deviceUserSettingsActivity.f42011a);
                                        deviceUserSettingsActivity.startActivity(intent);
                                        deviceUserSettingsActivity.f42018f = true;
                                    } else {
                                        i2.d("DeviceUserSettingsActivity", "Could not start HRZones config, class not found.");
                                    }
                                }
                                break;
                            }
                        }
                        if (cVar != null) {
                            strA0 = ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).a0(deviceUserSettingsActivity.f42011a, cVar.f18932r);
                            if (strA0 != null) {
                                Intent intent2 = new Intent();
                                intent2.setClassName(deviceUserSettingsActivity, strA0);
                                intent2.putExtra("GCM_deviceUnitID", deviceUserSettingsActivity.f42013b);
                                intent2.putExtra("GCM_deviceProductNbr", deviceUserSettingsActivity.f42011a);
                                deviceUserSettingsActivity.startActivity(intent2);
                                deviceUserSettingsActivity.f42018f = true;
                            } else {
                                i2.d("DeviceUserSettingsActivity", "Could not start HRZones config, class not found.");
                            }
                        }
                        break;
                    default:
                        int i17 = DeviceUserSettingsActivity.f42010c1;
                        HelpActivity.da(deviceUserSettingsActivity, ro0.l.HEART_RATE_ZONES, "DEFAULT_ACTION", null);
                        break;
                }
            }
        };
        final int i15 = 1;
        this.Q0 = new View.OnClickListener(this) { // from class: ng1.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceUserSettingsActivity f125925b;

            {
                this.f125925b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x003e  */
            /* JADX WARN: Code duplicated, block: B:19:0x0050  */
            /* JADX WARN: Code duplicated, block: B:20:0x006c  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String strA0;
                int i16 = i15;
                bm2.c cVar = null;
                DeviceUserSettingsActivity deviceUserSettingsActivity = this.f125925b;
                switch (i16) {
                    case 0:
                        int i17 = DeviceUserSettingsActivity.f42010c1;
                        deviceUserSettingsActivity.startActivity(new Intent(deviceUserSettingsActivity, (Class<?>) UpdateBirthdateActivity.class));
                        break;
                    case 1:
                        if (deviceUserSettingsActivity.Z) {
                            PowerZonesListActivity.ca(deviceUserSettingsActivity, deviceUserSettingsActivity.f42013b);
                        } else {
                            PowerZonesConfigActivity.ca(deviceUserSettingsActivity, deviceUserSettingsActivity.f42024k0, vk1.e.CYCLING.name());
                        }
                        deviceUserSettingsActivity.f42018f = true;
                        break;
                    case 2:
                        for (bm2.c cVar2 : deviceUserSettingsActivity.f42014b1) {
                            String str = deviceUserSettingsActivity.f42011a;
                            if (str != null && (str.equals(cVar2.f18899b) || cVar2.f18899b.contains(deviceUserSettingsActivity.f42011a))) {
                                cVar = cVar2;
                                if (cVar != null) {
                                    strA0 = ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).a0(deviceUserSettingsActivity.f42011a, cVar.f18932r);
                                    if (strA0 != null) {
                                        Intent intent2 = new Intent();
                                        intent2.setClassName(deviceUserSettingsActivity, strA0);
                                        intent2.putExtra("GCM_deviceUnitID", deviceUserSettingsActivity.f42013b);
                                        intent2.putExtra("GCM_deviceProductNbr", deviceUserSettingsActivity.f42011a);
                                        deviceUserSettingsActivity.startActivity(intent2);
                                        deviceUserSettingsActivity.f42018f = true;
                                    } else {
                                        i2.d("DeviceUserSettingsActivity", "Could not start HRZones config, class not found.");
                                    }
                                }
                                break;
                            }
                        }
                        if (cVar != null) {
                            strA0 = ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).a0(deviceUserSettingsActivity.f42011a, cVar.f18932r);
                            if (strA0 != null) {
                                Intent intent3 = new Intent();
                                intent3.setClassName(deviceUserSettingsActivity, strA0);
                                intent3.putExtra("GCM_deviceUnitID", deviceUserSettingsActivity.f42013b);
                                intent3.putExtra("GCM_deviceProductNbr", deviceUserSettingsActivity.f42011a);
                                deviceUserSettingsActivity.startActivity(intent3);
                                deviceUserSettingsActivity.f42018f = true;
                            } else {
                                i2.d("DeviceUserSettingsActivity", "Could not start HRZones config, class not found.");
                            }
                        }
                        break;
                    default:
                        int i18 = DeviceUserSettingsActivity.f42010c1;
                        HelpActivity.da(deviceUserSettingsActivity, ro0.l.HEART_RATE_ZONES, "DEFAULT_ACTION", null);
                        break;
                }
            }
        };
        final int i16 = 2;
        this.R0 = new View.OnClickListener(this) { // from class: ng1.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceUserSettingsActivity f125925b;

            {
                this.f125925b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x003e  */
            /* JADX WARN: Code duplicated, block: B:19:0x0050  */
            /* JADX WARN: Code duplicated, block: B:20:0x006c  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String strA0;
                int i17 = i16;
                bm2.c cVar = null;
                DeviceUserSettingsActivity deviceUserSettingsActivity = this.f125925b;
                switch (i17) {
                    case 0:
                        int i18 = DeviceUserSettingsActivity.f42010c1;
                        deviceUserSettingsActivity.startActivity(new Intent(deviceUserSettingsActivity, (Class<?>) UpdateBirthdateActivity.class));
                        break;
                    case 1:
                        if (deviceUserSettingsActivity.Z) {
                            PowerZonesListActivity.ca(deviceUserSettingsActivity, deviceUserSettingsActivity.f42013b);
                        } else {
                            PowerZonesConfigActivity.ca(deviceUserSettingsActivity, deviceUserSettingsActivity.f42024k0, vk1.e.CYCLING.name());
                        }
                        deviceUserSettingsActivity.f42018f = true;
                        break;
                    case 2:
                        for (bm2.c cVar2 : deviceUserSettingsActivity.f42014b1) {
                            String str = deviceUserSettingsActivity.f42011a;
                            if (str != null && (str.equals(cVar2.f18899b) || cVar2.f18899b.contains(deviceUserSettingsActivity.f42011a))) {
                                cVar = cVar2;
                                if (cVar != null) {
                                    strA0 = ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).a0(deviceUserSettingsActivity.f42011a, cVar.f18932r);
                                    if (strA0 != null) {
                                        Intent intent3 = new Intent();
                                        intent3.setClassName(deviceUserSettingsActivity, strA0);
                                        intent3.putExtra("GCM_deviceUnitID", deviceUserSettingsActivity.f42013b);
                                        intent3.putExtra("GCM_deviceProductNbr", deviceUserSettingsActivity.f42011a);
                                        deviceUserSettingsActivity.startActivity(intent3);
                                        deviceUserSettingsActivity.f42018f = true;
                                    } else {
                                        i2.d("DeviceUserSettingsActivity", "Could not start HRZones config, class not found.");
                                    }
                                }
                                break;
                            }
                        }
                        if (cVar != null) {
                            strA0 = ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).a0(deviceUserSettingsActivity.f42011a, cVar.f18932r);
                            if (strA0 != null) {
                                Intent intent4 = new Intent();
                                intent4.setClassName(deviceUserSettingsActivity, strA0);
                                intent4.putExtra("GCM_deviceUnitID", deviceUserSettingsActivity.f42013b);
                                intent4.putExtra("GCM_deviceProductNbr", deviceUserSettingsActivity.f42011a);
                                deviceUserSettingsActivity.startActivity(intent4);
                                deviceUserSettingsActivity.f42018f = true;
                            } else {
                                i2.d("DeviceUserSettingsActivity", "Could not start HRZones config, class not found.");
                            }
                        }
                        break;
                    default:
                        int i19 = DeviceUserSettingsActivity.f42010c1;
                        HelpActivity.da(deviceUserSettingsActivity, ro0.l.HEART_RATE_ZONES, "DEFAULT_ACTION", null);
                        break;
                }
            }
        };
        final int i17 = 3;
        this.S0 = new View.OnClickListener(this) { // from class: ng1.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceUserSettingsActivity f125925b;

            {
                this.f125925b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x003e  */
            /* JADX WARN: Code duplicated, block: B:19:0x0050  */
            /* JADX WARN: Code duplicated, block: B:20:0x006c  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String strA0;
                int i18 = i17;
                bm2.c cVar = null;
                DeviceUserSettingsActivity deviceUserSettingsActivity = this.f125925b;
                switch (i18) {
                    case 0:
                        int i19 = DeviceUserSettingsActivity.f42010c1;
                        deviceUserSettingsActivity.startActivity(new Intent(deviceUserSettingsActivity, (Class<?>) UpdateBirthdateActivity.class));
                        break;
                    case 1:
                        if (deviceUserSettingsActivity.Z) {
                            PowerZonesListActivity.ca(deviceUserSettingsActivity, deviceUserSettingsActivity.f42013b);
                        } else {
                            PowerZonesConfigActivity.ca(deviceUserSettingsActivity, deviceUserSettingsActivity.f42024k0, vk1.e.CYCLING.name());
                        }
                        deviceUserSettingsActivity.f42018f = true;
                        break;
                    case 2:
                        for (bm2.c cVar2 : deviceUserSettingsActivity.f42014b1) {
                            String str = deviceUserSettingsActivity.f42011a;
                            if (str != null && (str.equals(cVar2.f18899b) || cVar2.f18899b.contains(deviceUserSettingsActivity.f42011a))) {
                                cVar = cVar2;
                                if (cVar != null) {
                                    strA0 = ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).a0(deviceUserSettingsActivity.f42011a, cVar.f18932r);
                                    if (strA0 != null) {
                                        Intent intent4 = new Intent();
                                        intent4.setClassName(deviceUserSettingsActivity, strA0);
                                        intent4.putExtra("GCM_deviceUnitID", deviceUserSettingsActivity.f42013b);
                                        intent4.putExtra("GCM_deviceProductNbr", deviceUserSettingsActivity.f42011a);
                                        deviceUserSettingsActivity.startActivity(intent4);
                                        deviceUserSettingsActivity.f42018f = true;
                                    } else {
                                        i2.d("DeviceUserSettingsActivity", "Could not start HRZones config, class not found.");
                                    }
                                }
                                break;
                            }
                        }
                        if (cVar != null) {
                            strA0 = ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).a0(deviceUserSettingsActivity.f42011a, cVar.f18932r);
                            if (strA0 != null) {
                                Intent intent5 = new Intent();
                                intent5.setClassName(deviceUserSettingsActivity, strA0);
                                intent5.putExtra("GCM_deviceUnitID", deviceUserSettingsActivity.f42013b);
                                intent5.putExtra("GCM_deviceProductNbr", deviceUserSettingsActivity.f42011a);
                                deviceUserSettingsActivity.startActivity(intent5);
                                deviceUserSettingsActivity.f42018f = true;
                            } else {
                                i2.d("DeviceUserSettingsActivity", "Could not start HRZones config, class not found.");
                            }
                        }
                        break;
                    default:
                        int i110 = DeviceUserSettingsActivity.f42010c1;
                        HelpActivity.da(deviceUserSettingsActivity, ro0.l.HEART_RATE_ZONES, "DEFAULT_ACTION", null);
                        break;
                }
            }
        };
    }

    public static void fa(Activity activity, long j8, String str) {
        if (d1.f()) {
            activity.getClass();
            d1.o(activity, new v(12));
        } else {
            Intent intent = new Intent(activity, (Class<?>) DeviceUserSettingsActivity.class);
            intent.putExtra("GCM_deviceProductNbr", str);
            intent.putExtra("GCM_deviceUnitID", j8);
            activity.startActivity(intent);
        }
    }

    public final void ca() {
        ArrayList<bm2.c> arrayList;
        String str;
        int i14 = this.f42028o - 1;
        this.f42028o = i14;
        if (i14 == 0) {
            hideProgressOverlay();
            if (this.f42021i && (str = this.f42011a) != null && u0.n(str, u0.E5)) {
                this.f42030q.setVisibility(0);
                ga();
                this.f42032t.setVisibility(0);
                UserSettingsDTO userSettingsDTO = this.f42015c;
                if (userSettingsDTO != null) {
                    this.f42032t.setButtonBottomLeftLabel(getString(userSettingsDTO.H().f43545b));
                }
                this.f42029p.setVisibility(8);
                this.f42031r.setVisibility(8);
                this.f42033v.setVisibility(8);
                this.f42034w.setVisibility(8);
                this.f42037z.setVisibility(8);
                this.B.setVisibility(8);
                this.D.setVisibility(8);
                this.E.setVisibility(8);
                this.F.setVisibility(8);
                return;
            }
            if (u0.n(this.f42011a, u0.N5, u0.O5)) {
                this.f42033v.setVisibility(0);
                la();
                this.f42030q.setVisibility(8);
                this.f42029p.setVisibility(8);
                this.f42031r.setVisibility(8);
                this.f42034w.setVisibility(8);
                this.f42037z.setVisibility(8);
                this.B.setVisibility(8);
                this.D.setVisibility(8);
                this.E.setVisibility(8);
                this.F.setVisibility(8);
                this.f42032t.setVisibility(8);
                return;
            }
            if (u0.n(this.f42011a, u0.A5)) {
                this.E.setVisibility(8);
                this.f42037z.setVisibility(8);
            } else if (u0.n(this.f42011a, u0.f203807r5) || u0.n(this.f42011a, u0.f203812s5) || u0.n(this.f42011a, u0.f203818t5) || u0.n(this.f42011a, u0.f203767l5) || u0.n(this.f42011a, u0.I1)) {
                this.f42037z.setVisibility(8);
            }
            if (!u0.n(this.f42011a, u0.E4) && this.f42015c != null) {
                ha();
                la();
            }
            this.f42029p.setVisibility(0);
            UserSettingsDTO userSettingsDTO2 = this.f42015c;
            if (userSettingsDTO2 == null || userSettingsDTO2.F() == null) {
                this.f42029p.setButtonBottomLeftLabel(getString(R.string.no_value));
            } else {
                this.f42029p.setButtonBottomLeftLabel(DateTimeFormat.mediumDate().print(this.f42015c.F()));
            }
            this.f42030q.setVisibility(0);
            ga();
            this.f42031r.setVisibility(0);
            ha();
            this.f42033v.setVisibility(0);
            la();
            if (this.f42026m) {
                this.f42034w.setVisibility(0);
                ia();
                ka();
            }
            if (this.f42017e != null && td2.a.a(this.f42013b)) {
                this.C.setVisibility(0);
                this.D.setVisibility(0);
                ja();
            }
            if (this.f42023k && this.f42019g != null) {
                this.C.setVisibility(0);
                this.E.setVisibility(0);
                zk0.h hVar = this.f42019g;
                if (hVar != null) {
                    this.E.setButtonBottomLeftLabel(Integer.toString(hVar.C()));
                }
            }
            if (this.f42022j && this.f42020h != null) {
                this.C.setVisibility(0);
                this.F.setVisibility(0);
                zk0.h hVar2 = this.f42020h;
                if (hVar2 != null) {
                    this.F.setButtonBottomLeftLabel(Integer.toString(hVar2.C()));
                }
            }
            if (!((d0) KoinJavaComponent.get(d0.class)).A(this.f42011a) || u0.n(this.f42011a, u0.G4) || u0.n(this.f42011a, u0.I4) || u0.n(this.f42011a, u0.f203796q) || u0.n(this.f42011a, u0.f203802r) || u0.n(this.f42011a, u0.f203824v) || u0.n(this.f42011a, u0.f203848z) || u0.n(this.f42011a, u0.f203754k) || u0.n(this.f42011a, u0.f203769m) || u0.n(this.f42011a, u0.Q5) || u0.n(this.f42011a, u0.T5) || u0.n(this.f42011a, u0.V5) || u0.n(this.f42011a, u0.f203836x) || u0.n(this.f42011a, u0.W5) || u0.n(this.f42011a, u0.X5) || u0.n(this.f42011a, u0.f203726f6) || u0.n(this.f42011a, u0.f203732g6)) {
                this.B.setVisibility(8);
            } else {
                this.B.setVisibility(0);
            }
            if (!u0.q(this.f42011a) && (arrayList = this.f42014b1) != null) {
                for (bm2.c cVar : arrayList) {
                    if (this.f42013b == cVar.f18942x && cVar.E) {
                        this.f42037z.setVisibility(0);
                        break;
                    }
                }
            }
            this.f42032t.setVisibility(8);
        }
    }

    public final String da(long j8) {
        return (DateFormat.is24HourFormat(this) ? DateTimeFormat.forPattern("HH:mm") : DateTimeFormat.forPattern("hh:mm a")).withZone(DateTimeZone.UTC).print(new DateTime(j8 * 1000));
    }

    public final void ea(int i14) {
        zk0.h hVar = new zk0.h("INTENSITY_MINUTES", i14);
        xk0.g gVar = this.X;
        gVar.getClass();
        xk0.g.x4(gVar, "intensity-minutes", hVar).f(this, new f0(this, i14, 0));
    }

    public final void ga() {
        UserSettingsDTO userSettingsDTO = this.f42015c;
        if (userSettingsDTO != null) {
            this.f42030q.setButtonBottomLeftLabel(getString((userSettingsDTO.G() != null ? this.f42015c.G() : UserSettingsDTO.c.NOT_SPECIFIED).f43538b));
        }
    }

    public final void ha() {
        if (this.f42015c != null) {
            String strF = l3.f((float) this.f42015c.I(), this, ((f12.l) KoinJavaComponent.get(f12.l.class)).y());
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42031r;
            if (TextUtils.isEmpty(strF)) {
                strF = getString(R.string.no_value);
            }
            gCMComplexTwoLineButton.setButtonBottomLeftLabel(strF);
        }
    }

    public final void ia() {
        UserSettingsDTO userSettingsDTO = this.f42015c;
        if (userSettingsDTO != null) {
            this.f42035x.setButtonBottomLeftLabel(da(userSettingsDTO.M() >= 0 ? this.f42015c.M() : 79200L));
        }
    }

    public final void ja() {
        int iIntValue;
        zk0.c cVar = this.f42017e;
        if (cVar != null) {
            int iIntValue2 = cVar.getUserGoal().intValue();
            zk0.c cVar2 = this.f42017e;
            if (iIntValue2 != 0) {
                iIntValue = cVar2.getUserGoal().intValue();
            } else {
                iIntValue = cVar2.getDeviceGoal().intValue() != 0 ? this.f42017e.getDeviceGoal().intValue() : 0;
            }
            this.D.setButtonBottomLeftLabel(Integer.toString(iIntValue));
        }
    }

    public final void ka() {
        UserSettingsDTO userSettingsDTO = this.f42015c;
        if (userSettingsDTO != null) {
            this.f42036y.setButtonBottomLeftLabel(da(userSettingsDTO.Z() >= 0 ? this.f42015c.Z() : 21600L));
        }
    }

    public final void la() {
        if (this.f42015c != null) {
            String strL = l3.l(this.f42015c.E2() / 1000.0d, this, ((f12.l) KoinJavaComponent.get(f12.l.class)).y());
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42033v;
            if (TextUtils.isEmpty(strL)) {
                strL = getString(R.string.no_value);
            }
            gCMComplexTwoLineButton.setButtonBottomLeftLabel(strL);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        this.f42015c = (UserSettingsDTO) intent.getParcelableExtra("GCM_user_settings");
        this.f42020h.D(intent.getIntExtra("INTENSITY_MINUTES_GOAL", 150));
        ea(this.f42020h.C());
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        UserSettingsDTO userSettingsDTO = this.f42015c;
        JSONObject jSONObjectB = userSettingsDTO != null ? t3.b(userSettingsDTO.t1(), this.f42016d) : null;
        i2.a(a2.SETTINGS, "DeviceUserSettingsActivity", "User Settings JSON delta = " + jSONObjectB);
        if (this.P == -1 && jSONObjectB != null) {
            showProgressOverlay();
            this.P = ((d0) KoinJavaComponent.get(d0.class)).a(this.f42015c, jSONObjectB, this.Z0);
            yr1.e.g(this.f42013b, -1L, this, "DeviceUserSettingsActivity");
        } else {
            if (this.f42018f) {
                this.Y.x4(this.f42013b, "DeviceUserSettingsActivity");
                Toast.makeText(this, getText(R.string.msg_settings_saved_successfully), 0).show();
            }
            super.onBackPressed();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_user_settings);
        initActionBar(true, R.string.devices_settings_user_settings);
        if (d1.f()) {
            d1.o(this, new kx0.f(this, 16));
        }
        if (getIntent().getExtras() != null) {
            this.f42011a = getIntent().getExtras().getString("GCM_deviceProductNbr");
            this.f42013b = getIntent().getExtras().getLong("GCM_deviceUnitID", -1L);
        }
        if (this.f42011a == null) {
            i2.f(a2.SETTINGS, "DeviceUserSettingsActivity", "Invalid device product number! Exit device user settings.");
            finish();
            return;
        }
        x1 x1Var = new x1(this);
        t0 t0Var = s0.f105811a;
        this.X = (xk0.g) x1Var.b(t0Var.b(xk0.g.class));
        this.Y = (oc1.d) new x1(this).b(t0Var.b(oc1.d.class));
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_birth_date);
        this.f42029p = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.H0);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_gender);
        this.f42030q = gCMComplexTwoLineButton2;
        gCMComplexTwoLineButton2.setOnClickListener(this.I0);
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_height);
        this.f42031r = gCMComplexTwoLineButton3;
        gCMComplexTwoLineButton3.setOnClickListener(this.J0);
        this.f42031r.setSecondActionOnClickListener(this.K0);
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_weight);
        this.f42033v = gCMComplexTwoLineButton4;
        gCMComplexTwoLineButton4.setOnClickListener(this.L0);
        this.f42033v.setSecondActionOnClickListener(this.M0);
        this.f42034w = (ViewGroup) findViewById(R.id.user_settings_sleep_container);
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_sleep_time);
        this.f42035x = gCMComplexTwoLineButton5;
        gCMComplexTwoLineButton5.setOnClickListener(this.N0);
        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_wake_time);
        this.f42036y = gCMComplexTwoLineButton6;
        gCMComplexTwoLineButton6.setOnClickListener(this.O0);
        GCMComplexTwoLineButton gCMComplexTwoLineButton7 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_handedness);
        this.f42032t = gCMComplexTwoLineButton7;
        gCMComplexTwoLineButton7.setOnClickListener(this.P0);
        this.f42037z = (ViewGroup) findViewById(R.id.user_settings_heart_rate_zones_container);
        ((GCMComplexTwoLineButton) findViewById(R.id.user_settings_heart_rate_zones)).setOnClickListener(this.R0);
        GCMComplexTwoLineButton gCMComplexTwoLineButton8 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_power_zones);
        this.A = gCMComplexTwoLineButton8;
        gCMComplexTwoLineButton8.setOnClickListener(this.Q0);
        findViewById(R.id.user_settings_heart_rate_zones_help_icon).setOnClickListener(this.S0);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.user_settings_custom_step_length);
        this.B = gCMComplexOneLineButton;
        gCMComplexOneLineButton.setOnClickListener(this.T0);
        this.C = (ViewGroup) findViewById(R.id.user_settings_goals_container);
        GCMComplexTwoLineButton gCMComplexTwoLineButton9 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_daily_steps_goal);
        this.D = gCMComplexTwoLineButton9;
        gCMComplexTwoLineButton9.setOnClickListener(this.U0);
        GCMComplexTwoLineButton gCMComplexTwoLineButton10 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_daily_floors_climbed_goal);
        this.E = gCMComplexTwoLineButton10;
        gCMComplexTwoLineButton10.setOnClickListener(this.V0);
        this.F = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_weekly_intensity_minutes);
        this.f42028o++;
        ed0.a.d(new h0(this));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f42015c == null) {
            showProgressOverlay();
            this.f42028o++;
            Object[] objArr = {String.valueOf(this.f42013b)};
            lj0.f fVar = lj0.f.f112996x;
            lj0.j jVar = new lj0.j(new i0(this));
            this.f42027n = jVar;
            jVar.b(new lj0.i(fVar, objArr));
            showProgressOverlay();
            this.f42028o++;
            this.I = ((d0) KoinJavaComponent.get(d0.class)).i(this.Y0);
            if (td2.a.a(this.f42013b)) {
                showProgressOverlay();
                this.f42028o++;
                xk0.g gVar = this.X;
                gVar.getClass();
                xy2.b.K(gVar, new xk0.b(gVar, null)).f(this, new g0(this, 0));
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        com.garmin.android.library.backgroundtaskmanagement.c cVar = com.garmin.android.library.backgroundtaskmanagement.c.f50123c;
        cVar.a(this.T);
        cVar.a(this.I);
        lj0.j jVar = this.f42027n;
        if (jVar != null) {
            jVar.a();
        }
    }
}

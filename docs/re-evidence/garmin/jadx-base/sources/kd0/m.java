package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.UserDevicesActivity;
import com.garmin.android.apps.connectmobile.VirtualTrainingModeActivity;
import com.garmin.android.apps.connectmobile.bikesensors.CalibrationSettingsActivity;
import com.garmin.android.apps.connectmobile.consent.ConsentDeleteDataActivity;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.setup.BLEDeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.BLEDeviceSetupWizardActivity;
import com.garmin.android.apps.connectmobile.startup.StartupChecksActivity;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkd0/m;", "Lbv/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements bv.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f104216a = 0;

    static {
        new a(null);
    }

    @Override // bv.c
    public final void a(Activity activity, Bundle bundle, int i14) {
        activity.getClass();
        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
        com.garmin.android.apps.connectmobile.navigation.b.a.c(activity, bundle, i14);
    }

    @Override // bv.c
    public final void b(Context context) {
        zp0.c.f206560v.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        new zp0.c(applicationContext).b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        com.bumptech.glide.b.b(applicationContext2).a();
    }

    @Override // bv.c
    public final void c(Context context, q92.v vVar) {
        vVar.getClass();
        ConsentDeleteDataActivity.f32160d.getClass();
        Intent intent = new Intent(context, (Class<?>) ConsentDeleteDataActivity.class);
        intent.putExtra("extra_consent_status", vVar);
        intent.setFlags(268468224);
        context.startActivity(intent);
    }

    @Override // bv.c
    public final boolean d(Activity activity) {
        activity.getClass();
        return activity instanceof DashboardActivity;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        if (r8 == r1) goto L33;
     */
    @Override // bv.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Activity activity, v13.c cVar) {
        q qVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f104296d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f104296d = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objE = qVar.f104294b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f104296d;
        if (i15 == 0) {
            o13.r.b(objE);
            f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            qVar.f104293a = activity;
            qVar.f104296d = 1;
            objE = bVar.E(qVar);
            if (objE != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            activity = qVar.f104293a;
            o13.r.b(objE);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            activity = qVar.f104293a;
            o13.r.b(objE);
        }
        StartupChecksActivity.f44788d.getClass();
        if (!StartupChecksActivity.a.a()) {
            return Boolean.FALSE;
        }
        Intent intent = activity.getIntent();
        intent.getClass();
        StartupChecksActivity.a.b(activity, intent);
        return Boolean.TRUE;
        if (!((Boolean) objE).booleanValue() || (activity instanceof dv.k) || activity.getIntent().getBooleanExtra("extra_launched_from_graduation", false)) {
            return Boolean.FALSE;
        }
        dq1.d.f60719j.getClass();
        dq1.d dVar = (dq1.d) dq1.d.f60720k.getValue();
        qVar.f104293a = activity;
        qVar.f104296d = 2;
        if (!dVar.f60722b.invoke().booleanValue() || (objB = dVar.b(qVar)) != aVar) {
            Object objB = Unit.INSTANCE;
        }
    }

    @Override // bv.c
    public final void f(Context context, Intent intent) {
        bd0.a aVar;
        bm2.c cVar;
        bm2.d dVar;
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        if (Arrays.asList(zb0.b.a().f203427a).contains(context.getClass().getName()) || intent.getExtras() == null) {
            return;
        }
        zb0.b bVarA = zb0.b.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        bVarA.getClass();
        SharedPreferences.Editor editorEdit = GarminConnectMobileApp.f28688j.getSharedPreferences("BleInCompleteConnectionCheck", 0).edit();
        editorEdit.putLong("displayTime", jCurrentTimeMillis);
        editorEdit.apply();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable3 = (Parcelable) extras.getParcelable("extra_ble_device", bd0.a.class);
            } else {
                Parcelable parcelable4 = extras.getParcelable("extra_ble_device");
                if (!(parcelable4 instanceof bd0.a)) {
                    parcelable4 = null;
                }
                parcelable3 = (bd0.a) parcelable4;
            }
            aVar = (bd0.a) parcelable3;
        } else {
            aVar = null;
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = (Parcelable) extras2.getParcelable("extra_device_dto", bm2.c.class);
            } else {
                Parcelable parcelable5 = extras2.getParcelable("extra_device_dto");
                if (!(parcelable5 instanceof bm2.c)) {
                    parcelable5 = null;
                }
                parcelable2 = (bm2.c) parcelable5;
            }
            cVar = (bm2.c) parcelable2;
        } else {
            cVar = null;
        }
        Bundle extras3 = intent.getExtras();
        if (extras3 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras3.getParcelable("extra_device_info", bm2.d.class);
            } else {
                Parcelable parcelable6 = extras3.getParcelable("extra_device_info");
                if (!(parcelable6 instanceof bm2.d)) {
                    parcelable6 = null;
                }
                parcelable = (bm2.d) parcelable6;
            }
            dVar = (bm2.d) parcelable;
        } else {
            dVar = null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICES;
        String str = "Show re-pair device setup dialog " + aVar + StringUtils.SPACE + cVar + StringUtils.SPACE + dVar;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, str);
        final zb0.z zVar = new zb0.z(context, aVar, cVar != null ? zb0.k.f(cVar) : null, dVar);
        Context context2 = zVar.f203878a;
        com.garmin.android.apps.connectmobile.devices.model.l lVar = zVar.f203880c;
        final int i14 = 0;
        androidx.appcompat.app.e.a positiveButton = new androidx.appcompat.app.e.a(context2).setCancelable(false).setTitle(R.string.connect_iq_device_has_disconnected_title).setMessage(context2.getString(R.string.msg_device_disconnected_try_reconnect, lVar != null ? lVar.getProductDisplayName() : context2.getString(R.string.incomplete_device_default_device_name))).setPositiveButton(R.string.lbl_reconnect_device_bond, new DialogInterface.OnClickListener() { // from class: zb0.y
            /* JADX WARN: Code duplicated, block: B:29:0x00bf  */
            /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
            /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i15) {
                Intent intent2;
                String str2;
                switch (i14) {
                    case 0:
                        z zVar2 = zVar;
                        Context context3 = zVar2.f203878a;
                        com.garmin.android.apps.connectmobile.devices.model.l lVar2 = zVar2.f203880c;
                        bd0.a aVar2 = zVar2.f203879b;
                        if (aVar2 == null || lVar2 == null) {
                            intent2 = null;
                            if (intent2 == null) {
                                UserDevicesActivity.ca(context3);
                            } else {
                                context3.startActivity(intent2);
                            }
                        } else if (z10.d1.f()) {
                            context3.getClass();
                            z10.d1.o(context3, new xk1.v(12));
                        } else {
                            hk0.p.c().k(aVar2.f17520a);
                            if (x80.d.c(lVar2.getPartNumberPartial())) {
                                bm2.a aVarB = aVar2.b();
                                com.garmin.android.apps.connectmobile.devices.model.l lVar3 = zVar2.f203880c;
                                bm2.d dVar2 = zVar2.f203881d;
                                DeviceSetupActivity.a aVar3 = DeviceSetupActivity.f33758b;
                                aVar3.getClass();
                                context3.getClass();
                                DeviceSetupActivity.a.e(aVar3, context3, aVarB, lVar3, dVar2, 16);
                            } else {
                                u0 u0Var = (u0) u0.f203782n6.get(lVar2.getPartNumberPartial());
                                if (u0Var == null || (str2 = u0Var.f203855b) == null) {
                                    intent2 = null;
                                } else if (x80.d.b(lVar2.getPartNumberPartial())) {
                                    intent2 = new Intent(context3, (Class<?>) BLEDeviceSetupWizardActivity.class);
                                    intent2.putExtra("GCM_deviceDTO", lVar2);
                                    intent2.putExtra("GCM_bleDevice", aVar2);
                                } else {
                                    Intent intent3 = new Intent(context3, (Class<?>) BLEDeviceSetupActivity.class);
                                    intent3.putExtra("extra_device_dto", lVar2);
                                    intent3.putExtra("extra_ble_device", aVar2);
                                    intent3.putExtra("extra_setup_strategy_classname", str2);
                                    intent2 = intent3;
                                }
                                if (intent2 == null) {
                                    UserDevicesActivity.ca(context3);
                                } else {
                                    context3.startActivity(intent2);
                                }
                            }
                        }
                        dialogInterface.dismiss();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.devices.model.l lVar4 = zVar.f203880c;
                        if (lVar4 != null) {
                            Iterator<String> it = hk0.p.e(lVar4.getDeviceUnitId()).iterator();
                            while (it.hasNext()) {
                                hk0.p.c().e(it.next());
                            }
                        }
                        dialogInterface.dismiss();
                        break;
                }
            }
        });
        final int i15 = 1;
        androidx.appcompat.app.e eVarCreate = positiveButton.setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: zb0.y
            /* JADX WARN: Code duplicated, block: B:29:0x00bf  */
            /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
            /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i16) {
                Intent intent2;
                String str2;
                switch (i15) {
                    case 0:
                        z zVar2 = zVar;
                        Context context3 = zVar2.f203878a;
                        com.garmin.android.apps.connectmobile.devices.model.l lVar2 = zVar2.f203880c;
                        bd0.a aVar2 = zVar2.f203879b;
                        if (aVar2 == null || lVar2 == null) {
                            intent2 = null;
                            if (intent2 == null) {
                                UserDevicesActivity.ca(context3);
                            } else {
                                context3.startActivity(intent2);
                            }
                        } else if (z10.d1.f()) {
                            context3.getClass();
                            z10.d1.o(context3, new xk1.v(12));
                        } else {
                            hk0.p.c().k(aVar2.f17520a);
                            if (x80.d.c(lVar2.getPartNumberPartial())) {
                                bm2.a aVarB = aVar2.b();
                                com.garmin.android.apps.connectmobile.devices.model.l lVar3 = zVar2.f203880c;
                                bm2.d dVar2 = zVar2.f203881d;
                                DeviceSetupActivity.a aVar3 = DeviceSetupActivity.f33758b;
                                aVar3.getClass();
                                context3.getClass();
                                DeviceSetupActivity.a.e(aVar3, context3, aVarB, lVar3, dVar2, 16);
                            } else {
                                u0 u0Var = (u0) u0.f203782n6.get(lVar2.getPartNumberPartial());
                                if (u0Var == null || (str2 = u0Var.f203855b) == null) {
                                    intent2 = null;
                                } else if (x80.d.b(lVar2.getPartNumberPartial())) {
                                    intent2 = new Intent(context3, (Class<?>) BLEDeviceSetupWizardActivity.class);
                                    intent2.putExtra("GCM_deviceDTO", lVar2);
                                    intent2.putExtra("GCM_bleDevice", aVar2);
                                } else {
                                    Intent intent3 = new Intent(context3, (Class<?>) BLEDeviceSetupActivity.class);
                                    intent3.putExtra("extra_device_dto", lVar2);
                                    intent3.putExtra("extra_ble_device", aVar2);
                                    intent3.putExtra("extra_setup_strategy_classname", str2);
                                    intent2 = intent3;
                                }
                                if (intent2 == null) {
                                    UserDevicesActivity.ca(context3);
                                } else {
                                    context3.startActivity(intent2);
                                }
                            }
                        }
                        dialogInterface.dismiss();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.devices.model.l lVar4 = zVar.f203880c;
                        if (lVar4 != null) {
                            Iterator<String> it = hk0.p.e(lVar4.getDeviceUnitId()).iterator();
                            while (it.hasNext()) {
                                hk0.p.c().e(it.next());
                            }
                        }
                        dialogInterface.dismiss();
                        break;
                }
            }
        }).create();
        eVarCreate.show();
        oe2.f.e(eVarCreate, 1.3f);
    }

    @Override // bv.c
    public final void g(Context context, long j8) {
        VirtualTrainingModeActivity.f28715d.getClass();
        Intent intent = new Intent(context, (Class<?>) VirtualTrainingModeActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", j8);
        context.startActivity(intent);
    }

    @Override // bv.c
    public final void h(Context context, long j8, String str) {
        CalibrationSettingsActivity.a aVar = CalibrationSettingsActivity.f30766m;
        Long lValueOf = Long.valueOf(j8);
        aVar.getClass();
        Intent intent = new Intent(context, (Class<?>) CalibrationSettingsActivity.class);
        intent.putExtra("GCM_deviceUnitID", lValueOf);
        intent.putExtra("GCM_macAddress", str);
        context.startActivity(intent);
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [T, androidx.fragment.app.Fragment, au0.m0] */
    @Override // bv.c
    public final void i(Activity activity, boolean z14) {
        i.c cVar = activity instanceof i.c ? (i.c) activity : null;
        if (cVar == null) {
            return;
        }
        androidx.fragment.app.v supportFragmentManager = cVar.getSupportFragmentManager();
        supportFragmentManager.getClass();
        Fragment fragmentG = supportFragmentManager.G("LOCKED_IN_LIVE_ACTIVITY_SESSION_IN_PROGRESS_DIALOG_TAG");
        if (!z14 || fragmentG != null) {
            if (z14 || fragmentG == null) {
                return;
            }
            au0.m0 m0Var = fragmentG instanceof au0.m0 ? (au0.m0) fragmentG : null;
            if (m0Var != null) {
                m0Var.dismissAllowingStateLoss();
                return;
            }
            return;
        }
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        au0.m0.b bVar = au0.m0.f12967d;
        String string = activity.getString(R.string.lbl_activity_in_progress);
        string.getClass();
        String string2 = activity.getString(R.string.msg_live_activity_resume_save);
        string2.getClass();
        String string3 = activity.getString(R.string.lbl_resume);
        string3.getClass();
        String string4 = activity.getString(R.string.lbl_save_and_end);
        string4.getClass();
        k62.k kVar = new k62.k(activity, 1, r0Var, cVar);
        bVar.getClass();
        ?? m0Var2 = new au0.m0();
        Bundle bundleD = tn.k.d("EXTRA_TITLE", string, "EXTRA_MESSAGE", string2);
        bundleD.putString("EXTRA_POSITIVE_BUTTON_TEXT", string3);
        bundleD.putString("EXTRA_NEGATIVE_BUTTON_TEXT", string4);
        bundleD.putBoolean("EXTRA_CANCELABLE", false);
        m0Var2.setArguments(bundleD);
        m0Var2.f12968a = new au0.m0.c(kVar);
        r0Var.f105810a = m0Var2;
        m0Var2.show(supportFragmentManager, "LOCKED_IN_LIVE_ACTIVITY_SESSION_IN_PROGRESS_DIALOG_TAG");
    }

    @Override // bv.c
    public final void j(Context context, Intent intent) {
        bd0.a aVar;
        bm2.c cVar;
        Parcelable parcelable;
        Parcelable parcelable2;
        if (Arrays.asList(zb0.b.a().f203427a).contains(context.getClass().getName()) || intent.getExtras() == null) {
            return;
        }
        zb0.b bVarA = zb0.b.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        bVarA.getClass();
        SharedPreferences.Editor editorEdit = GarminConnectMobileApp.f28688j.getSharedPreferences("BleInCompleteConnectionCheck", 0).edit();
        editorEdit.putLong("displayTime", jCurrentTimeMillis);
        editorEdit.apply();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = (Parcelable) extras.getParcelable("extra_ble_device", bd0.a.class);
            } else {
                Parcelable parcelable3 = extras.getParcelable("extra_ble_device");
                if (!(parcelable3 instanceof bd0.a)) {
                    parcelable3 = null;
                }
                parcelable2 = (bd0.a) parcelable3;
            }
            aVar = (bd0.a) parcelable2;
        } else {
            aVar = null;
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras2.getParcelable("extra_device_dto", bm2.c.class);
            } else {
                Parcelable parcelable4 = extras2.getParcelable("extra_device_dto");
                if (!(parcelable4 instanceof bm2.c)) {
                    parcelable4 = null;
                }
                parcelable = (bm2.c) parcelable4;
            }
            cVar = (bm2.c) parcelable;
        } else {
            cVar = null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICES;
        String str = "Show incomplete device setup dialog " + aVar + StringUtils.SPACE + cVar;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, str);
        new zb0.a0(context, aVar, cVar != null ? zb0.k.f(cVar) : null).a();
    }

    @Override // bv.c
    public final o k() {
        au0.z zVar = (au0.z) KoinJavaComponent.get$default(au0.z.class, null, null, 6, null);
        return new o(zVar.f13012k, (bu0.j) KoinJavaComponent.get$default(bu0.j.class, null, null, 6, null));
    }

    public final com.garmin.android.apps.connectmobile.k1 l() {
        return com.garmin.android.apps.connectmobile.k1.f37122a;
    }

    public final SharedPreferences m(String str) {
        GarminConnectMobileApp.f28685g.getClass();
        SharedPreferences sharedPreferences = GarminConnectMobileApp.a.b().getSharedPreferences(str, 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object n(long j8, v13.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f104241c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f104241c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objF = nVar.f104239a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f104241c;
        boolean zContains = true;
        if (i15 == 0) {
            o13.r.b(objF);
            re0.o oVar = (re0.o) KoinJavaComponent.get$default(re0.o.class, null, null, 6, null);
            nVar.f104241c = 1;
            objF = oVar.f(j8, nVar);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objF);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objF;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            List<String> listY = ((com.garmin.android.apps.connectmobile.userprofile.model.m) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).y();
            if (listY != null) {
                zContains = listY.contains("ROLE_PARTIALLY_SUSPENDED");
            }
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            zContains = false;
        }
        return Boolean.valueOf(zContains);
    }

    public final void o(String str) {
        if (str.equals("MENSTRUAL_CYCLE")) {
            i52.a.f91796a.getClass();
            f12.l.f68084a.getClass();
            f12.l.a.a().D1();
        } else if (str.equals("PREGNANCY")) {
            i52.a.f91796a.getClass();
            f12.l.f68084a.getClass();
            f12.l.a.a().w1();
        } else {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            String strM = am.j.m("Unable to mark ", str, " nav bar tip as shown");
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.o(a2Var, strM);
        }
    }

    public final void p() {
        sn.a.o(f12.l.f68084a, true);
    }

    public final boolean q(String str) {
        f12.l.f68084a.getClass();
        for (String str2 : f12.l.a.a().t1()) {
            if (p005kotlin.jvm.internal.s.g(str2, str)) {
                return false;
            }
        }
        if (str.equals("MENSTRUAL_CYCLE")) {
            i52.a.f91796a.getClass();
            f12.l.f68084a.getClass();
            return f12.l.a.a().q2();
        }
        if (str.equals("PREGNANCY")) {
            i52.a.f91796a.getClass();
            f12.l.f68084a.getClass();
            return f12.l.a.a().B2();
        }
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        String strM = am.j.m("Unable to determine if ", str, " nav bar tip has been shown");
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.o(a2Var, strM);
        return false;
    }

    public final void r() {
        cw.q qVarN = cw.q.N();
        qVarN.getClass();
        com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.i(qVarN), null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lkd0/m$a;", "", "<init>", "()V", "", "GROUP_RIDE_CODE_RECEIVED_TAG", "Ljava/lang/String;", "LOCKED_IN_LIVE_ACTIVITY_SESSION_IN_PROGRESS_DIALOG_TAG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

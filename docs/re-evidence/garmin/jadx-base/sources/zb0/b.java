package zb0;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.AddGarminDeviceGuide;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.apps.connectmobile.devices.setup.BLEDeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.setup.BLEScanningActivity;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.BLEDeviceSetupWizardActivity;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.BLEScanningWizardActivity;
import com.garmin.android.apps.connectmobile.x2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public class b extends Handler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static b f203426c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f203427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f203428b;

    public static class a extends g22.c<Void, Void> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f203429c;

        public a(Context context) {
            this.f203429c = context;
        }

        @Override // g22.c
        @SuppressLint({"MissingPermission"})
        public final Void b(Void[] voidArr) throws Throwable {
            BluetoothAdapter defaultAdapter;
            bm2.c cVarC;
            j22.b.f96736a.getClass();
            if (j22.b.b(this.f203429c)) {
                b.a().getClass();
                if (b.b() && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null) {
                    Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
                    b bVarA = b.a();
                    bVarA.getClass();
                    HashMap map = new HashMap();
                    if (bondedDevices != null) {
                        for (BluetoothDevice bluetoothDevice : bondedDevices) {
                            if (bluetoothDevice != null && !TextUtils.isEmpty(bluetoothDevice.getAddress())) {
                                map.put(bluetoothDevice.getAddress(), bluetoothDevice.getName());
                            }
                        }
                    }
                    rd2.m.f().getClass();
                    ArrayList arrayListG = rd2.m.g();
                    if (arrayListG != null && !arrayListG.isEmpty()) {
                        Set setKeySet = map.keySet();
                        sd2.j jVar = null;
                        for (int i14 = 0; i14 < arrayListG.size(); i14++) {
                            if (setKeySet.contains(((sd2.j) arrayListG.get(i14)).J0)) {
                                jVar = (sd2.j) arrayListG.get(i14);
                            } else {
                                rd2.m mVarF = rd2.m.f();
                                long j8 = ((sd2.j) arrayListG.get(i14)).f158686c;
                                mVarF.getClass();
                                rd2.m.e(j8);
                            }
                        }
                        if (jVar != null && (cVarC = b.c(jVar.Z0)) != null) {
                            String str = (String) map.get(jVar.J0);
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 100;
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("extra_ble_device", new bd0.a(jVar.J0, str));
                            bundle.putParcelable("extra_device_dto", cVarC);
                            messageObtain.setData(bundle);
                            bVarA.sendMessage(messageObtain);
                        }
                    }
                }
            }
            return null;
        }
    }

    private b(Looper looper) {
        super(looper);
        this.f203427a = new String[]{AddGarminDeviceGuide.class.getName(), a0.class.getName(), BLEDeviceSetupActivity.class.getName(), BLEDeviceSetupWizardActivity.class.getName(), BLEScanningActivity.class.getName(), BLEScanningWizardActivity.class.getName()};
    }

    public static b a() {
        if (f203426c == null) {
            f203426c = new b(Looper.getMainLooper());
        }
        return f203426c;
    }

    public static boolean b() {
        if (((f12.b) KoinJavaComponent.get(f12.b.class)).c() && !GarminDeviceWakefulService.f33825e) {
            long j8 = GarminConnectMobileApp.f28688j.getSharedPreferences("BleInCompleteConnectionCheck", 0).getLong("displayTime", -1L);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j8 < 0) {
                return true;
            }
            long j14 = jCurrentTimeMillis - j8;
            if (j14 > 0 && j14 / 3600000 > 24) {
                return true;
            }
        }
        return false;
    }

    public static bm2.c c(String str) {
        String[] strArrD;
        String str2;
        if (!TextUtils.isEmpty(str) && (strArrD = qd2.a.b().d(qd2.a.b.ALL_DEVICES)) != null && !TextUtils.isEmpty(strArrD[1])) {
            try {
                JSONArray jSONArray = new JSONObject(strArrD[1]).getJSONArray("devices");
                if (jSONArray.length() > 0) {
                    String strB = c22.b0.b(null);
                    for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                        bm2.c cVarD = bm2.c.d(jSONArray.getJSONObject(i14));
                        if (cVarD != null && !hv.i.b(cVarD.f18935t, cVarD.f18938v, strB) && (str2 = cVarD.f18899b) != null && str2.length() >= 9 && str.equalsIgnoreCase(str2.substring(5, 9))) {
                            return cVarD;
                        }
                    }
                }
            } catch (JSONException e4) {
                lc.u0.v(e4, hb.a.l("retrieveDeviceInfo() for product number: ", str, " error:"), a2.DEVICES, "BleConnectionsCheck");
            }
        }
        return null;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        u0 u0Var;
        if (message.what == 100) {
            bd0.a aVar = (bd0.a) message.getData().getParcelable("extra_ble_device");
            bm2.c cVar = (bm2.c) message.getData().getParcelable("extra_device_dto");
            if (b()) {
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putParcelable("extra_ble_device", aVar);
                bundle.putParcelable("extra_device_dto", cVar);
                intent.putExtras(bundle);
                com.garmin.android.apps.connectmobile.z.f49770a.getClass();
                com.garmin.android.apps.connectmobile.z.f49772c.j(new com.garmin.android.apps.connectmobile.y<>(new x2(intent)));
                if (aVar != null) {
                    c22.d1.b bVar = new c22.d1.b(aVar.f17520a, cVar != null ? cVar.getF143516f() : aVar.f17522c, cVar != null ? cVar.f18942x : -1L, null);
                    boolean z14 = false;
                    if ((cVar != null ? cVar.getF143517g() : null) != null && (u0Var = (u0) u0.f203782n6.get(cVar.getF143517g())) != null && u0Var.f203859f) {
                        z14 = true;
                    }
                    c22.d1.c("android_partiallyPairedDevice", bVar, Boolean.valueOf(z14));
                }
            }
        }
    }
}

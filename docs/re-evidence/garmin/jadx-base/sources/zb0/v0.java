package zb0;

import android.app.Notification;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class v0 implements nm2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static JSONObject f203863b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f203864a = GarminConnectMobileApp.f28688j;

    public v0() {
        c();
    }

    @Override // nm2.a
    public final boolean a(long j8) {
        String strValueOf = String.valueOf(j8);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f203864a);
        StringBuilder sb3 = new StringBuilder("LastFirmwareUpdateCheck_");
        sb3.append(strValueOf);
        return defaultSharedPreferences.getLong(sb3.toString(), 0L) + 86400000 <= System.currentTimeMillis();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x010b  */
    @Override // nm2.a
    public final void b(bm2.d dVar, byte[] bArr, String str) {
        boolean z14;
        boolean z15;
        boolean z16;
        if (str == null) {
            return;
        }
        String strValueOf = String.valueOf(dVar.getF92746j());
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = this.f203864a;
        PreferenceManager.getDefaultSharedPreferences(context).edit().putLong("LastFirmwareUpdateCheck_" + strValueOf, jCurrentTimeMillis).apply();
        String strValueOf2 = String.valueOf(dVar.getF92746j());
        String f172496d = dVar.getF92742f();
        int f172495c = dVar.getF92744h();
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "GarminDeviceSWUpdateChecker", c22.t.e(f172495c, "shouldNotifyUser: [", f172496d, "], deviceProductNbr [", "] BEGIN ****"));
        long j8 = PreferenceManager.getDefaultSharedPreferences(context).getLong("LastFirmwareNotification_" + strValueOf2, 0L) + 259200000;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (j8 > jCurrentTimeMillis2) {
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GarminDeviceSWUpdateChecker", "shouldNotifyUser: less than 3 days since last check, let's not bother user");
            z14 = false;
        } else {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putLong("LastFirmwareNotification_" + strValueOf2, jCurrentTimeMillis2).apply();
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GarminDeviceSWUpdateChecker", "shouldNotifyUser: >= 3 days since last check, parsing mOTASoftwareVersionsJSONObj");
            try {
                JSONArray jSONArray = f203863b.getJSONArray("products");
                int i14 = 0;
                while (true) {
                    if (i14 >= jSONArray.length()) {
                        z14 = false;
                        z15 = false;
                        break;
                    }
                    JSONObject jSONObject = jSONArray.getJSONObject(i14);
                    if (jSONObject.optInt("productNumber", -1) == f172495c) {
                        int iOptInt = jSONObject.optInt("minVersion", -1);
                        z15 = true;
                        if (iOptInt == -1) {
                            JSONObject jSONObject2 = new JSONObject(str);
                            boolean zOptBoolean = jSONObject2.optBoolean("messageExistInQueue", false);
                            boolean zOptBoolean2 = jSONObject2.optBoolean("messageAddedInQueue", false);
                            i2.a(a2.DEVICES, "GarminDeviceSWUpdateChecker", "shouldNotifyUser: messageExistInQueue[" + zOptBoolean + "], messageAddedInQueue[" + zOptBoolean2 + "]");
                            if (zOptBoolean || zOptBoolean2) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                        } else {
                            int iA = vm2.e.a(bArr);
                            if (iA == -1 || iA >= iOptInt) {
                                z16 = false;
                            } else {
                                i2.a(a2.DEVICES, "GarminDeviceSWUpdateChecker", "shouldNotifyUser: device XML software version [" + iA + "] for device [" + f172496d + "] doesn't support OTA firmware updates");
                                z16 = true;
                            }
                        }
                        z14 = z16;
                        break;
                    }
                    i14++;
                }
                try {
                    i2.a(a2.DEVICES, "GarminDeviceSWUpdateChecker", "shouldNotifyUser: prodNbrFoundInJSON [" + z15 + "]");
                } catch (Exception e4) {
                    e = e4;
                    i2.f(a2.DEVICES, "GarminDeviceSWUpdateChecker", "shouldNotifyUser: " + e.getMessage());
                }
            } catch (Exception e14) {
                e = e14;
                z14 = false;
            }
        }
        a2 a2Var2 = a2.DEVICES;
        i2.a(a2Var2, "GarminDeviceSWUpdateChecker", "shouldNotifyUser [" + z14 + "]");
        String strE = c22.t.e(f172495c, "shouldNotifyUser [", f172496d, "], deviceProductNbr [", "] END ****");
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.b(a2Var2, "GarminDeviceSWUpdateChecker", strE);
        if (z14) {
            String f172496d2 = dVar.getF92742f();
            aVar.getClass();
            i2.a.b(a2Var2, "GarminDeviceSWUpdateChecker", "notifyUser BEGIN ****");
            sz0.e eVar = sz0.e.f161378q;
            z6.q qVar = new z6.q(context, eVar.f161386a);
            qVar.N.icon = 2131232010;
            qVar.g(context.getText(R.string.notification_title_software_update_available));
            qVar.f(context.getString(R.string.notification_text_software_update_available, f172496d2));
            qVar.f202689k = z6.q.e("");
            qVar.B = "recommendation";
            qVar.f202691m = 0;
            z6.o oVar = new z6.o();
            oVar.f202664e = z6.q.e(context.getString(R.string.notification_bigtext_software_update_available, f172496d2));
            qVar.l(oVar);
            Notification notificationC = qVar.c();
            sz0.f.f161394a.getClass();
            sz0.f.a.f(context, notificationC, 11, eVar);
            aVar.getClass();
            i2.a.b(a2Var2, "GarminDeviceSWUpdateChecker", "notifyUser END ****");
        }
    }

    public final boolean c() {
        a2 a2Var;
        StringBuilder sb3;
        if (f203863b == null) {
            i2.a(a2.DEVICES, "GarminDeviceSWUpdateChecker", "initOTASoftwareVersionsJSONObj BEGIN ****");
            InputStream inputStreamOpenRawResource = this.f203864a.getResources().openRawResource(R.raw.device_ota_sw_versions);
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, "UTF-8"));
                    while (true) {
                        int i14 = bufferedReader.read(cArr);
                        if (i14 != -1) {
                            stringWriter.write(cArr, 0, i14);
                        } else {
                            try {
                                break;
                            } catch (JSONException e4) {
                                i2.f(a2.DEVICES, "GarminDeviceSWUpdateChecker", "initOTASoftwareVersionsJSONObj: JSONException creating JSON object from 'R.raw.device_ota_sw_versions': " + e4.getMessage());
                            }
                        }
                    }
                    f203863b = new JSONObject(stringWriter.toString());
                    if (inputStreamOpenRawResource != null) {
                        try {
                            inputStreamOpenRawResource.close();
                        } catch (IOException e14) {
                            e = e14;
                            a2Var = a2.DEVICES;
                            sb3 = new StringBuilder("initOTASoftwareVersionsJSONObj: IOException closing inputstream: ");
                            sb3.append(e.getMessage());
                            i2.f(a2Var, "GarminDeviceSWUpdateChecker", sb3.toString());
                        }
                    }
                } catch (Throwable th3) {
                    if (inputStreamOpenRawResource != null) {
                        try {
                            inputStreamOpenRawResource.close();
                        } catch (IOException e15) {
                            i2.f(a2.DEVICES, "GarminDeviceSWUpdateChecker", "initOTASoftwareVersionsJSONObj: IOException closing inputstream: " + e15.getMessage());
                        }
                    }
                    throw th3;
                }
            } catch (UnsupportedEncodingException e16) {
                i2.f(a2.DEVICES, "GarminDeviceSWUpdateChecker", "initOTASoftwareVersionsJSONObj: UnsupportedEncodingException reading 'R.raw.device_ota_sw_versions': " + e16.getMessage());
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException e17) {
                        e = e17;
                        a2Var = a2.DEVICES;
                        sb3 = new StringBuilder("initOTASoftwareVersionsJSONObj: IOException closing inputstream: ");
                        sb3.append(e.getMessage());
                        i2.f(a2Var, "GarminDeviceSWUpdateChecker", sb3.toString());
                    }
                }
            } catch (IOException e18) {
                i2.f(a2.DEVICES, "GarminDeviceSWUpdateChecker", "initOTASoftwareVersionsJSONObj: IOException reading 'R.raw.device_ota_sw_versions': " + e18.getMessage());
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException e19) {
                        e = e19;
                        a2Var = a2.DEVICES;
                        sb3 = new StringBuilder("initOTASoftwareVersionsJSONObj: IOException closing inputstream: ");
                        sb3.append(e.getMessage());
                        i2.f(a2Var, "GarminDeviceSWUpdateChecker", sb3.toString());
                    }
                }
            }
            i2.a(a2.DEVICES, "GarminDeviceSWUpdateChecker", "initOTASoftwareVersionsJSONObj END ****");
        }
        return f203863b != null;
    }
}

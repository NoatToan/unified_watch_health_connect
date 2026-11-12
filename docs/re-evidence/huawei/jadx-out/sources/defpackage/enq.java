package defpackage;

import android.os.Bundle;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hwlogsmodel.LogUtil;
import java.security.SecureRandom;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class enq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f33236c = new Object();
    private static volatile enq e;

    private enq() {
        LogUtil.a("DeviceAutoTestTools", "DeviceAutoTestTools getInstance()");
    }

    public static enq d() {
        if (e == null) {
            synchronized (f33236c) {
                if (e == null) {
                    e = new enq();
                }
            }
        }
        return e;
    }

    public boolean c() {
        return new env(dxw.d(), "deviceautotest").a("deviceauto");
    }

    public boolean g(String str) {
        return !"0".equals(new env(dxw.d(), "deviceautotest").e(str));
    }

    public HealthDevice b(String str) {
        String str2;
        String str3 = "";
        try {
            JSONObject jSONObject = new JSONObject(new env(dxw.d(), "deviceautotest").e(str));
            str2 = (String) jSONObject.get("product_bluetoothname");
            try {
                str3 = (String) jSONObject.get("product_mac");
            } catch (JSONException unused) {
                LogUtil.e("DeviceAutoTestTools", "DeviceAutoTestTools buildAutoDevice JSONException");
            }
        } catch (JSONException unused2) {
            str2 = "";
        }
        return new dms(str2, str3, str3);
    }

    private void b(String str, HealthData healthData) {
        String str2;
        try {
            String str3 = (String) new JSONObject(new env(dxw.d(), "deviceautotest").e(str)).get("product_random_insert");
            if (!"insert".equals(str3)) {
                str2 = "deviceautotestdata";
            } else {
                str2 = "deviceautotestinterdata";
            }
            String strE = new env(dxw.d(), str2).e(str);
            if (healthData instanceof emq) {
                e(str3, strE, (emq) healthData);
                return;
            }
            if (healthData instanceof dso) {
                b(str3, strE, (dso) healthData);
                return;
            }
            if (healthData instanceof eni) {
                b(str3, strE, (eni) healthData);
            } else if (!(healthData instanceof enb)) {
                LogUtil.j("DeviceAutoTestTools", "DeviceAutoTestTools HealthData Class is error ");
            } else {
                a(str3, strE, (enb) healthData);
            }
        } catch (JSONException unused) {
            LogUtil.e("DeviceAutoTestTools", "DeviceAutoTestTools JSONException");
        }
    }

    private void e(String str, String str2, emq emqVar) throws JSONException {
        float f;
        if (str.equals("random")) {
            JSONArray jSONArray = new JSONArray(str2);
            int iNextInt = new SecureRandom().nextInt(100) - 1;
            if (iNextInt < 0) {
                iNextInt = 0;
            }
            f = jSONArray.getJSONObject(iNextInt).getInt("bloodsugar");
        } else if ("insert".equals(str)) {
            try {
                f = Float.parseFloat(new JSONObject(str2).getString("bloodsugar"));
            } catch (NumberFormatException unused) {
                LogUtil.e("DeviceAutoTestTools", "DeviceAutoTestTools setBloodSugar Exception");
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        LogUtil.d("DeviceAutoTestTools", "DeviceAutoTestTools setBloodSugar bloodsugar =", Float.valueOf(f));
        emqVar.setBloodSugar(f);
        emqVar.setStartTime(new Date().getTime());
        emqVar.setEndTime(new Date().getTime());
        emqVar.setSequenceNumber(0);
    }

    private void b(String str, String str2, dso dsoVar) throws JSONException {
        float f;
        if (str.equals("random")) {
            JSONArray jSONArray = new JSONArray(str2);
            int iNextInt = new SecureRandom().nextInt(100) - 1;
            if (iNextInt < 0) {
                iNextInt = 0;
            }
            f = jSONArray.getJSONObject(iNextInt).getInt("weight");
        } else if (str.equals("insert")) {
            try {
                f = Float.parseFloat(new JSONObject(str2).getString("weight"));
            } catch (NumberFormatException unused) {
                LogUtil.j("DeviceAutoTestTools", "DeviceAutoTestTools setWeightData Exception");
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        LogUtil.d("DeviceAutoTestTools", "DeviceAutoTestTools setWeightData weight =", Float.valueOf(f));
        dsoVar.setWeight(f);
        dsoVar.setBodyFatRat(20.0f);
        dsoVar.setStartTime(new Date().getTime());
        dsoVar.setEndTime(new Date().getTime());
    }

    private void b(String str, String str2, eni eniVar) throws JSONException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (str.equals("random")) {
            JSONArray jSONArray = new JSONArray(str2);
            int iNextInt = new SecureRandom().nextInt(100) - 1;
            JSONObject jSONObject = jSONArray.getJSONObject(iNextInt >= 0 ? iNextInt : 0);
            i5 = jSONObject.getInt("low");
            i4 = jSONObject.getInt("high");
            i3 = jSONObject.getInt("heart");
        } else if (str.equals("insert")) {
            try {
                JSONObject jSONObject2 = new JSONObject(str2);
                i = Integer.parseInt(jSONObject2.getString("low"));
                try {
                    i2 = Integer.parseInt(jSONObject2.getString("high"));
                    try {
                        i5 = Integer.parseInt(jSONObject2.getString("heart"));
                    } catch (NumberFormatException unused) {
                        LogUtil.e("DeviceAutoTestTools", "setBloodPressureData Exception");
                    }
                } catch (NumberFormatException unused2) {
                    i2 = 0;
                }
            } catch (NumberFormatException unused3) {
                i = 0;
                i2 = 0;
            }
            i3 = i5;
            i5 = i;
            i4 = i2;
        } else {
            i3 = 0;
            i4 = 0;
        }
        LogUtil.d("DeviceAutoTestTools", "low =", Integer.valueOf(i5), " high=", Integer.valueOf(i4), "heartRate=", Integer.valueOf(i3));
        eniVar.setSystolic((short) i4);
        eniVar.setDiastolic((short) i5);
        eniVar.setHeartRate((short) i3);
    }

    private void a(String str, String str2, enb enbVar) throws JSONException {
        int i = 0;
        if (str.equals("random")) {
            JSONArray jSONArray = new JSONArray(str2);
            int iNextInt = new SecureRandom().nextInt(100) - 1;
            i = jSONArray.getJSONObject(iNextInt >= 0 ? iNextInt : 0).getInt("heart");
        } else if (str.equals("insert")) {
            try {
                i = Integer.parseInt(new JSONObject(str2).getString("heart"));
            } catch (NumberFormatException unused) {
                LogUtil.e("DeviceAutoTestTools", "DeviceAutoTestTools setHeartRateData Exception");
            }
        }
        LogUtil.d("DeviceAutoTestTools", "DeviceAutoTestTools heartRateCount =", Integer.valueOf(i));
        enbVar.setHeartRate(Integer.valueOf(i));
    }

    public HealthData d(String str) {
        emq emqVar = new emq();
        b(str, emqVar);
        return emqVar;
    }

    public HealthData e(String str) {
        eni eniVar = new eni();
        b(str, eniVar);
        return eniVar;
    }

    public HealthData a(String str) {
        dso dsoVar = new dso();
        b(str, dsoVar);
        return dsoVar;
    }

    public HealthData c(String str) {
        enb enbVar = new enb();
        b(str, enbVar);
        return enbVar;
    }

    public Bundle a(HealthDevice.HealthDeviceKind healthDeviceKind, String str) {
        String str2;
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(new env(dxw.d(), "deviceautotest").e(str));
            String str3 = jSONObject.get("product_bluetoothname") instanceof String ? (String) jSONObject.get("product_bluetoothname") : null;
            String str4 = jSONObject.get("product_mac") instanceof String ? (String) jSONObject.get("product_mac") : null;
            String str5 = jSONObject.get("product_random_insert") instanceof String ? (String) jSONObject.get("product_random_insert") : null;
            bundle.putString("product_bluetoothname", str3);
            bundle.putString("product_mac", str4);
            if (!"insert".equals(str5)) {
                str2 = "deviceautotestdata";
            } else {
                str2 = "deviceautotestinterdata";
            }
            a(str5, new env(dxw.d(), str2).e(str), healthDeviceKind, bundle);
            return bundle;
        } catch (JSONException unused) {
            LogUtil.e("DeviceAutoTestTools", "buildAutoTestSilentData JSONException");
            return bundle;
        }
    }

    private void a(String str, String str2, HealthDevice.HealthDeviceKind healthDeviceKind, Bundle bundle) throws JSONException {
        JSONObject jSONObject;
        String string;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if ("random".equals(str)) {
            JSONArray jSONArray = new JSONArray(str2);
            int iNextInt = new SecureRandom().nextInt(100) - 1;
            if (iNextInt < 0) {
                iNextInt = 0;
            }
            jSONObject = jSONArray.getJSONObject(iNextInt);
        } else {
            jSONObject = "insert".equals(str) ? new JSONObject(str2) : null;
        }
        String string2 = "0";
        if (jSONObject != null) {
            try {
                try {
                    if (healthDeviceKind == HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE) {
                        string = jSONObject.getString("low");
                        String string3 = jSONObject.getString("high");
                        try {
                            string2 = jSONObject.getString("heart");
                            bundle.putString("low", string);
                            bundle.putString("high", string3);
                            bundle.putString("heart", string2);
                            str4 = string2;
                            string2 = string3;
                        } catch (NumberFormatException e2) {
                            e = e2;
                            str3 = string2;
                            string2 = string3;
                            LogUtil.j("DeviceAutoTestTools", "e1 = ", e.getMessage());
                            str4 = str3;
                        }
                    } else {
                        if (healthDeviceKind == HealthDevice.HealthDeviceKind.HDK_WEIGHT) {
                            string = jSONObject.getString("weight");
                            bundle.putString("weight", string);
                        } else if (healthDeviceKind == HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR) {
                            string = jSONObject.getString("bloodsugar");
                            bundle.putString("bloodsugar", string);
                        } else {
                            str4 = "0";
                            string = str4;
                        }
                        str4 = "0";
                    }
                } catch (NumberFormatException e3) {
                    e = e3;
                    str3 = "0";
                }
            } catch (NumberFormatException e4) {
                e = e4;
                string = "0";
                str3 = string;
            }
            str5 = str4;
            str6 = string;
            str7 = string2;
        } else {
            str6 = "0";
            str7 = str6;
            str5 = str7;
        }
        LogUtil.d("DeviceAutoTestTools", "argFirst =", str6, " argSecond=", str7, "argThird=", str5);
    }
}

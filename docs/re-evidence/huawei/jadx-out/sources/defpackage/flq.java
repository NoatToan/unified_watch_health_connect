package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.userlabelmgr.model.UpdateUserLabel;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.Services;
import health.compact.a.Sha256;
import health.compact.a.SharedPreferenceManager;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes29.dex */
public class flq {
    private static flq i;
    private UpdateUserLabel h;
    private ArrayList<dxy> k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f34190b = new Object();
    private static final fmh[] e = {new fmh(0.0d, 30.0d, "SportDeviceTime_12"), new fmh(30.0d, 90.0d, "SportDeviceTime_13"), new fmh(90.0d, 180.0d, "SportDeviceTime_14"), new fmh(180.0d, 2.147483647E9d, "SportDeviceTime_15")};
    private static final fmh[] g = {new fmh(0.0d, 30.0d, "SportDeviceTime_16"), new fmh(30.0d, 90.0d, "SportDeviceTime_17"), new fmh(90.0d, 180.0d, "SportDeviceTime_18"), new fmh(180.0d, 2.147483647E9d, "SportDeviceTime_19")};
    private static final fmh[] d = {new fmh(0.0d, 30.0d, "SportDeviceTime_4"), new fmh(30.0d, 90.0d, "SportDeviceTime_5"), new fmh(90.0d, 180.0d, "SportDeviceTime_6"), new fmh(180.0d, 2.147483647E9d, "SportDeviceTime_7")};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final fmh[] f34189a = {new fmh(0.0d, 30.0d, "SportDeviceTime_8"), new fmh(30.0d, 90.0d, "SportDeviceTime_9"), new fmh(90.0d, 180.0d, "SportDeviceTime_10"), new fmh(180.0d, 2.147483647E9d, "SportDeviceTime_11")};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ArrayList<fmh[]> f34191c = new ArrayList(16) { // from class: flq.1
        private static final long serialVersionUID = -743974295768716726L;

        {
            add(flq.e);
            add(flq.g);
            add(flq.d);
            add(flq.f34189a);
        }
    };
    private Context j = BaseApplication.getContext();
    private String f = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);

    private flq() {
    }

    public static flq b() {
        flq flqVar;
        LogUtil.a("BiDeviceLabelHelper", "enter BiDeviceLabelHelper getInstance");
        synchronized (f34190b) {
            if (i == null) {
                i = new flq();
            }
            flqVar = i;
        }
        return flqVar;
    }

    public void h() {
        LogUtil.a("BiDeviceLabelHelper", "registerCallback");
        this.h = new UpdateUserLabel() { // from class: flq.2
            @Override // com.huawei.health.userlabelmgr.model.UpdateUserLabel
            public void onUpdate() {
                flq.this.i();
            }
        };
        fmc.a(this.j).e(this.h);
    }

    public void f() {
        LogUtil.a("BiDeviceLabelHelper", "enter unRegisterCallback");
        if (this.h != null) {
            fmc.a(this.j).d(this.h);
        }
    }

    public void i() {
        this.k = ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).getWearInfo();
        m();
        k();
        g();
        j();
    }

    private void m() {
        ArrayList<dxy> arrayList = this.k;
        if (arrayList == null || arrayList.size() == 0) {
            LogUtil.j("BiDeviceLabelHelper", "generateDeviceTypeLabel no device.");
            fmc.a(this.j).e("health_sport_device_type_smart_wear", "SportDeviceModel_0", this.f);
        } else {
            LogUtil.a("BiDeviceLabelHelper", "generateDeviceTypeLabel has device.");
            fmc.a(this.j).e("health_sport_device_type_smart_wear", "SportDeviceModel_1", this.f);
        }
    }

    private void k() {
        ArrayList<dxy> arrayList = this.k;
        if (arrayList == null) {
            LogUtil.j("BiDeviceLabelHelper", "generateDeviceTypeNumLabel mUsedDeviceLists is null.");
            return;
        }
        Iterator<dxy> it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (it.hasNext()) {
            int iB = fmk.b(it.next().g());
            if (iB == 1) {
                z = true;
            } else if (iB == 2) {
                z3 = true;
            } else if (iB == 3) {
                z4 = true;
            } else if (iB != 4) {
                LogUtil.j("BiDeviceLabelHelper", "generateDeviceTypeNumLabel classification is unKnow.");
            } else {
                z2 = true;
            }
        }
        fmc.a(this.j).e("health_sport_device_up_smart_wear", d(z, z2, z3, z4), this.f);
    }

    private String d(boolean z, boolean z2, boolean z3, boolean z4) {
        StringBuilder sb = new StringBuilder(16);
        if (z3) {
            sb.append("SportDeviceType_3");
        } else {
            sb.append("SportDeviceType_2");
        }
        if (z4) {
            sb.append(",SportDeviceType_5");
        } else {
            sb.append(",SportDeviceType_4");
        }
        if (z) {
            sb.append(",SportDeviceType_7");
        } else {
            sb.append(",SportDeviceType_6");
        }
        if (z2) {
            sb.append(",SportDeviceType_9");
        } else {
            sb.append(",SportDeviceType_8");
        }
        LogUtil.a("BiDeviceLabelHelper", "getDeviceTypeNumLabelValue labelValue:", sb.toString());
        return sb.toString();
    }

    private void g() {
        if (this.k == null) {
            LogUtil.j("BiDeviceLabelHelper", "generateDeviceActiveLabel mUsedDeviceLists is null.");
        } else {
            fmc.a(this.j).e("health_sport_device_time_smart_wear", e(o()), this.f);
        }
    }

    private long[] o() {
        flq flqVar = this;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        for (dxy dxyVar : flqVar.k) {
            int iB = fmk.b(dxyVar.g());
            String strB = flqVar.b(dxyVar);
            LogUtil.a("BiDeviceLabelHelper", "generateDeviceActiveLabel classification:", Integer.valueOf(iB), " value:", strB);
            if (!TextUtils.isEmpty(strB)) {
                try {
                    j5 = Long.parseLong(strB);
                } catch (NumberFormatException unused) {
                    LogUtil.e("BiDeviceLabelHelper", "generateDeviceActiveLabel exception");
                }
            }
            if (iB != 1) {
                if (iB != 2) {
                    if (iB != 3) {
                        if (iB != 4) {
                            LogUtil.j("BiDeviceLabelHelper", "generateDeviceActiveLabel classification is unKnow.");
                        } else if (j5 > j2) {
                            j2 = j5;
                        }
                    } else if (j5 > j4) {
                        j4 = j5;
                    }
                } else if (j5 > j3) {
                    j3 = j5;
                }
            } else if (j5 > j) {
                j = j5;
            }
            flqVar = this;
        }
        return new long[]{j, j2, j3, j4};
    }

    private String b(dxy dxyVar) {
        String strE = SharedPreferenceManager.e(this.j, String.valueOf(2000000), dxyVar.d());
        if (TextUtils.isEmpty(strE)) {
            try {
                strE = SharedPreferenceManager.e(this.j, String.valueOf(2000000), c(Sha256.c(dxyVar.d().getBytes("UTF-8"))));
            } catch (UnsupportedEncodingException e2) {
                LogUtil.e("BiDeviceLabelHelper", "getDeviceActiveTime UnsupportedEncodingException:", e2.getMessage());
            } catch (Exception unused) {
                LogUtil.e("BiDeviceLabelHelper", "getDeviceActiveTime Exception");
            }
            LogUtil.a("BiDeviceLabelHelper", "getDeviceActiveTime value:", strE);
        }
        return strE;
    }

    private static String c(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(128);
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    private String e(long[] jArr) {
        double[] dArr = new double[jArr.length];
        String[] strArr = new String[jArr.length];
        StringBuilder sb = new StringBuilder(16);
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            dArr[i2] = 0.0d;
            strArr[i2] = "";
            long j = jArr[i2];
            if (j != 0) {
                dArr[i2] = (jCurrentTimeMillis - j) / 8.64E7d;
            }
            if (dArr[i2] != 0.0d) {
                c(i2, dArr, strArr);
            }
            if (!TextUtils.isEmpty(strArr[i2])) {
                sb.append(strArr[i2]);
                sb.append(",");
            }
        }
        if (sb.toString().endsWith(",")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        LogUtil.a("BiDeviceLabelHelper", "getActiveTimeLabelValue value:", sb.toString());
        return sb.toString();
    }

    private void c(int i2, double[] dArr, String[] strArr) {
        if (i2 >= 0) {
            ArrayList<fmh[]> arrayList = f34191c;
            if (i2 >= arrayList.size()) {
                return;
            }
            for (fmh fmhVar : arrayList.get(i2)) {
                String matchResult = fmhVar.getMatchResult(dArr[i2]);
                strArr[i2] = matchResult;
                if (matchResult != null) {
                    return;
                }
            }
        }
    }

    private void j() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "BiDeviceLabelHelper");
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceName())) {
            LogUtil.a("BiDeviceLabelHelper", "generateCurrentDeviceLabel deviceName is empty");
            fmc.a(this.j).e("health_sport_current_device_name", "", this.f);
        } else {
            String deviceModel = deviceInfo.getDeviceModel();
            LogUtil.a("BiDeviceLabelHelper", "generateCurrentDeviceLabel deviceName is ", deviceModel);
            fmc.a(this.j).e("health_sport_current_device_name", deviceModel, this.f);
        }
    }
}

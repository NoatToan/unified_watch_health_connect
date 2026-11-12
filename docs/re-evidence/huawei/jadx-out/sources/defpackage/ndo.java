package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.core.app.ActivityCompat;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HarmonyBuild;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ndo {
    public void e(byte[] bArr, DeviceInfo deviceInfo) {
        String strE = eeq.e(bArr);
        String strSubstring = strE.substring(4, strE.length());
        ArrayList arrayList = new ArrayList(16);
        boolean z = false;
        try {
            for (eew eewVar : new eet().b(strSubstring).e()) {
                if (Integer.parseInt(eewVar.e(), 16) == 127) {
                    z = true;
                } else {
                    arrayList.add(Integer.valueOf(Integer.parseInt(eewVar.e(), 16)));
                }
            }
        } catch (eeu e) {
            LogUtil.e("HandsetInfo", "getHandsetInfo() error e = ", e.getMessage());
        } catch (NumberFormatException unused) {
            LogUtil.e("HandsetInfo", "getHandsetInfo() error NumberFormatException");
        }
        if (z) {
            return;
        }
        b(arrayList, deviceInfo);
    }

    private void b(List<Integer> list, DeviceInfo deviceInfo) {
        LogUtil.a("HandsetInfo", "getHandsetInfo() in");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(16);
        ndp ndpVar = new ndp();
        ndpVar.e(eeq.a(Build.BOARD));
        ndpVar.a(eeq.a(Build.BRAND));
        ndpVar.j(eeq.a(Build.DEVICE));
        ndpVar.r(eeq.a(Build.MODEL));
        ndpVar.f(eeq.a(Build.HARDWARE));
        ndpVar.t(eeq.a(Build.PRODUCT));
        ndpVar.l(eeq.a(Build.MANUFACTURER));
        ndpVar.s(eeq.a(Build.VERSION.RELEASE));
        ndpVar.p(eeq.d(Build.VERSION.SDK_INT));
        e(ndpVar);
        int iR = ndpVar.r();
        if (CommonUtil.bd()) {
            iR = 26;
        }
        ndpVar.i(eeq.d(iR));
        ndpVar.d(eeq.d(CommonUtil.e(BaseApplication.getContext())));
        d(ndpVar);
        ndpVar.g(ndpVar.u());
        ndpVar.h(ndpVar.x());
        ndpVar.y(c());
        ndpVar.c(eeq.d(2));
        ndpVar.k(eeq.d(1));
        String strD = d();
        ndpVar.q(strD);
        LogUtil.a("HandsetInfo", "phoneCapabilityByString: ", strD);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(ndpVar.a(list));
        ndpVar.c(list, byteBufferAllocate);
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("HandsetInfo", "deviceCommand", deviceCommand);
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private String c() {
        String strA;
        try {
            PackageInfo packageInfo = BaseApplication.getContext().getPackageManager().getPackageInfo(BaseApplication.getContext().getPackageName(), 4096);
            if (packageInfo != null) {
                strA = packageInfo.versionName;
            } else {
                strA = CommonUtil.a(BaseApplication.getContext());
            }
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("HandsetInfo", "getVersionName e NameNotFoundException");
            strA = "";
        }
        return eeq.a(strA);
    }

    private String d() {
        boolean z = ActivityCompat.checkSelfPermission(BaseApplication.getContext(), "android.permission.START_ACTIVITIES_FROM_BACKGROUND") == 0;
        LogUtil.a("HandsetInfo", "getPhoneCapability isStartActivityFromBackground: ", Boolean.valueOf(z));
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(1);
        } else {
            sb.append(0);
        }
        String string = sb.reverse().toString();
        int length = string.length();
        int i = length % 8 == 0 ? length / 8 : (length / 8) + 1;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (i != 1) {
                LogUtil.a("HandsetInfo", "getPhoneCapabilityByString phoneCapability more than eight digits.");
            } else {
                byteBufferAllocate.put((byte) Integer.parseInt(string, 2));
            }
        }
        return eeq.e(byteBufferAllocate.array());
    }

    private void e(ndp ndpVar) {
        ndpVar.m(eeq.d(HarmonyBuild.f36562c ? 1 : 0));
        ndpVar.o(eeq.d(HarmonyBuild.d));
        ndpVar.n(eeq.a(HarmonyBuild.f36561a));
    }

    private void d(ndp ndpVar) {
        Object systemService = BaseApplication.getContext().getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            ndpVar.b(eeq.a(telephonyManager.getNetworkCountryIso()));
            LogUtil.a("HandsetInfo", "CountryCode", telephonyManager.getNetworkCountryIso());
        }
    }
}

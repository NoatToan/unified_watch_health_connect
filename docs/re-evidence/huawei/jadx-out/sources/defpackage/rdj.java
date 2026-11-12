package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.datatype.DataDeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.Utils;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes16.dex */
public class rdj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static lmf f47180c;
    private static lmg d;

    /* JADX INFO: Access modifiers changed from: private */
    public static lmf c() {
        return f47180c;
    }

    private static void b(lmf lmfVar) {
        f47180c = lmfVar;
    }

    public void a(String str, Context context, IBaseResponseCallback iBaseResponseCallback) {
        DeviceInfo deviceInfoB;
        if (c() == null) {
            b(lmf.d());
        }
        if (d == null) {
            d = new lmg();
        }
        LogUtil.d("WearBIUtil", "huid = ", LoginInit.getInstance(context).getAccountInfo(1011));
        if (TextUtils.isEmpty(str)) {
            deviceInfoB = mgg.d("WearBIUtil");
        } else {
            deviceInfoB = mgg.b(str, "WearBIUtil");
        }
        if (deviceInfoB != null) {
            LogUtil.a("WearBIUtil", "mDeviceInfo.setBiAnalyticsData curDeviceInfo = ", deviceInfoB.getSoftVersion());
            d(deviceInfoB);
            if (deviceInfoB.getProductType() >= 57) {
                c().e(d);
                if (iBaseResponseCallback != null) {
                    iBaseResponseCallback.a(0, d);
                }
            }
        }
        e(str, iBaseResponseCallback, deviceInfoB);
    }

    private void e(String str, final IBaseResponseCallback iBaseResponseCallback, final DeviceInfo deviceInfo) {
        mfe.d().d(str, new IBaseResponseCallback() { // from class: rdj.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && obj != null) {
                    DataDeviceInfo dataDeviceInfo = obj instanceof DataDeviceInfo ? (DataDeviceInfo) obj : null;
                    if (dataDeviceInfo != null) {
                        rdj.d.d(dataDeviceInfo.getDeviceSoftVersion());
                        if (dataDeviceInfo.getDeviceType() >= 34) {
                            rdj.d.a(dataDeviceInfo.getDeviceModel());
                        }
                        LogUtil.d("WearBIUtil", "mDeviceInfo.DeviceType = " + rdj.d.a());
                        LogUtil.d("WearBIUtil", "mDeviceInfo.DeviceVersion = " + rdj.d.b());
                        if (3 == dataDeviceInfo.getDeviceType()) {
                            rdj.d.c(dataDeviceInfo.getDeviceSn());
                        } else if (deviceInfo != null && dataDeviceInfo.getDeviceType() == 10) {
                            if (TextUtils.isEmpty(deviceInfo.getUuid())) {
                                rdj.d.c(dataDeviceInfo.getDeviceSn());
                            } else {
                                rdj.d.c(deviceInfo.getUuid());
                            }
                        } else {
                            LogUtil.d("WearBIUtil", "don't need special handle ProductType");
                        }
                        rdj.c().e(rdj.d);
                    }
                }
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(i, obj);
                }
            }
        });
    }

    private void d(DeviceInfo deviceInfo) {
        String udidFromDevice = deviceInfo.getUdidFromDevice();
        if (!TextUtils.isEmpty(udidFromDevice)) {
            d.c(udidFromDevice);
        } else {
            if (Utils.o()) {
                String strReplace = nio.e(deviceInfo.getSecurityDeviceId()).replace(Marker.ANY_NON_NULL_MARKER, "A").replace("=", "A").replace("/", "A");
                if (strReplace.length() >= 24) {
                    strReplace = strReplace.substring(0, 24);
                }
                d.c(strReplace);
            } else if (deviceInfo.getDeviceIdType() == 1) {
                String strReplace2 = nio.e(deviceInfo.getSecurityDeviceId()).replace(Marker.ANY_NON_NULL_MARKER, "A").replace("=", "A").replace("/", "A");
                if (strReplace2.length() >= 24) {
                    strReplace2 = strReplace2.substring(0, 24);
                }
                d.c(strReplace2);
            } else {
                d.c(deviceInfo.getDeviceIdentify());
            }
            b(deviceInfo);
        }
        if (11 == deviceInfo.getProductType() && "HUAWEI CM-R1P".equals(deviceInfo.getDeviceName())) {
            d.a("R1-PRO");
        } else if (deviceInfo.getProductType() == 10 && (TextUtils.equals(deviceInfo.getDeviceName(), "PORSCHE DESIGN") || TextUtils.equals(deviceInfo.getDeviceModel(), "PORSCHE DESIGN"))) {
            d.a("PORSCHE DESIGN");
        } else if (deviceInfo.getProductType() >= 34) {
            d.a(deviceInfo.getDeviceModel());
        } else {
            d.a(mga.d(deviceInfo));
        }
        d.d(deviceInfo.getSoftVersion());
        d.i(deviceInfo.getUdidFromDevice());
        d.b(deviceInfo.getSecurityDeviceId());
        d.e(deviceInfo.getDeviceIdentify());
        d.c(deviceInfo.getProductType());
    }

    private void b(DeviceInfo deviceInfo) {
        if (deviceInfo != null && deviceInfo.getProductType() >= 58) {
            d.c(deviceInfo.getDeviceUdid());
        }
    }
}

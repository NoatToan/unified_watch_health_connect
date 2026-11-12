package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mzq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42765c = new Object();
    private static mzq d;

    private mzq() {
    }

    public static mzq e() {
        mzq mzqVar;
        synchronized (f42765c) {
            if (d == null) {
                d = new mzq();
            }
            mzqVar = d;
        }
        return mzqVar;
    }

    public void c(byte[] bArr, DeviceInfo deviceInfo) {
        if (bArr == null || bArr.length < 2) {
            LogUtil.j("HwSyncTimeManager", "HwSyncTimeManager dataInfo is null");
            return;
        }
        String strE = eeq.e(bArr);
        LogUtil.a("HwSyncTimeManager", "HwSyncTimeManager data ", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("HwSyncTimeManager", "HwSyncTimeManager messageHex is error");
            return;
        }
        try {
            List<eew> listE = new eet().b(strE.substring(4)).e();
            if (listE != null && !listE.isEmpty()) {
                e(listE, deviceInfo);
                return;
            }
            LogUtil.j("HwSyncTimeManager", "HwSyncTimeManager tlv is error");
        } catch (eeu unused) {
            LogUtil.e("HwSyncTimeManager", "COMMAND_ID_GET_DATE TlvException");
        }
    }

    private void e(List<eew> list, DeviceInfo deviceInfo) {
        int iV;
        for (eew eewVar : list) {
            if (CommonUtil.b(eewVar.e(), 16) == 1 && (iV = CommonUtil.v(eewVar.b())) == 1) {
                LogUtil.a("HwSyncTimeManager", "HwSyncTimeManager syncTime is ", Integer.valueOf(iV));
                c(deviceInfo);
                return;
            }
        }
    }

    private void c(DeviceInfo deviceInfo) {
        LogUtil.a("HwSyncTimeManager", "is Enter ZoneID");
        if (deviceInfo == null) {
            LogUtil.j("HwSyncTimeManager", "btDeviceInfo is null");
            return;
        }
        if (!mjx.d(deviceInfo.getProductType())) {
            mkf.d().b(deviceInfo);
            return;
        }
        lnr lnrVarN = lmw.n();
        lnrVarN.e(deviceInfo.getDeviceIdentify());
        mkn.e().sendDeviceData(mko.a(lnrVarN));
    }
}

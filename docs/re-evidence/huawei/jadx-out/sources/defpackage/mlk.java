package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mlk {
    private mlk() {
    }

    public static mlk a() {
        return a.e;
    }

    static class a {
        private static final mlk e = new mlk();
    }

    public void b(byte[] bArr) {
        lzj lzjVarC = c(bArr);
        if (lzjVarC == null || ort.e(lzjVarC.f()) || lzjVarC.e() != 1) {
            LogUtil.a("HwNotificationAppSwitchManager", "app switch status is not close or pkgName is null");
            return;
        }
        StorageParams storageParams = new StorageParams(0);
        String strF = lzjVarC.f();
        lzjVarC.e(0);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10001), strF, String.valueOf(0), storageParams);
        NotificationContentProviderUtil.a(strF, 0);
        ReleaseLogUtil.d("R_HwNotificationAppSwitchManager", strF, " switch status modify to close");
        mlm.b(lzjVarC, 1);
        nca.c().d(1);
    }

    private static lzj c(byte[] bArr) {
        List<eew> listE = e(bArr);
        if (listE == null) {
            LogUtil.j("HwNotificationAppSwitchManager", "generatePackageName tlvList is null");
            return null;
        }
        lzj lzjVar = new lzj();
        for (eew eewVar : listE) {
            int iV = CommonUtil.v(eewVar.e());
            if (iV == 3) {
                lzjVar.e(eeq.d(eewVar.b()));
            } else if (iV == 4) {
                try {
                    lzjVar.e(Integer.parseInt(eewVar.b()));
                } catch (NumberFormatException unused) {
                    LogUtil.e("HwNotificationAppSwitchManager", "parseBytesToTlv 0x04 throw NumberFormatException");
                }
            }
        }
        return lzjVar;
    }

    public static List<eew> e(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            LogUtil.j("HwNotificationAppSwitchManager", "parseBytesToTlv dataInfos is invalid");
            return null;
        }
        String strE = eeq.e(bArr);
        try {
            ees eesVarB = new eet().b(strE.substring(4));
            if (!coq.d(eesVarB.b()) && eesVarB.b().get(0) != null && !coq.d(eesVarB.b().get(0).b()) && eesVarB.b().get(0).b().get(0) != null) {
                return eesVarB.b().get(0).b().get(0).e();
            }
        } catch (eeu unused) {
            LogUtil.e("HwNotificationAppSwitchManager", "parseBytesToTlv TlvException");
        }
        return null;
    }
}

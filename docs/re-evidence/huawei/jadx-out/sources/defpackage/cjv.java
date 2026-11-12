package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.command.CommandBase;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class cjv implements CommandBase {
    @Override // com.huawei.devicesdk.command.CommandBase
    public boolean handleReceivedData(String str, cmm cmmVar) {
        if (cmmVar == null || cmmVar.d() == null || cmmVar.d().length < 2) {
            LogUtil.e("ConnectParameterReportCommand", "dataContents is not valid");
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("ConnectParameterReportCommand", "handleReceivedData mac is null");
            return true;
        }
        byte[] bArrD = cmmVar.d();
        if (1 == bArrD[0] && 17 == bArrD[1]) {
            String strD = cph.d(bArrD);
            if (strD == null || strD.length() < 8) {
                LogUtil.e("ConnectParameterReportCommand", "getMtsInterval is not valid data");
                return false;
            }
            try {
                int i = Integer.parseInt(strD.substring(8, strD.length()), 16);
                cml cmlVarC = cnk.c().c(str);
                if (cmlVarC != null) {
                    cmlVarC.g(i);
                } else {
                    cmlVarC = new cml();
                    cmlVarC.g(i);
                }
                cnk.c().e(str, cmlVarC);
                ReleaseLogUtil.c("DEVMGR_ConnectParameterReportCommand", "handleReceivedData interval : ", Integer.valueOf(i));
                return false;
            } catch (NumberFormatException unused) {
                LogUtil.d("ConnectParameterReportCommand", "getMTSInterval NumberFormatException");
            }
        }
        return true;
    }
}

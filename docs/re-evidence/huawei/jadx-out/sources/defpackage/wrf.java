package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcrowdtestapi.HealthFeedbackCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.ProcessUtil;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class wrf implements HealthFeedbackCallback {
    private final Handler e;

    public wrf(Handler handler) {
        this.e = handler;
    }

    @Override // com.huawei.hwcrowdtestapi.HealthFeedbackCallback
    public void onFailed(String str) {
        LogUtil.j("HealthFeedbackListener", "onFailed to feedback issues");
    }

    @Override // com.huawei.hwcrowdtestapi.HealthFeedbackCallback
    public ltn collectLogs(int i, String str, String str2, boolean z) {
        LogUtil.a("HealthFeedbackListener", "collectLogs bugTypeId:", Integer.valueOf(i), ", dtsNumber:", str2);
        mjh.a(z);
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(mjh.f41741a + "MaintenanceLog");
        arrayList.add(mjh.f41741a + BaseApplication.getAppPackage());
        arrayList.add(mjh.f41741a + BaseApplication.getAppPackage() + ".h5pro");
        StringBuilder sb = new StringBuilder();
        sb.append(mjh.f41741a);
        sb.append(ProcessUtil.e("_PhoneService"));
        arrayList.add(sb.toString());
        arrayList.add(mjh.f41741a + ProcessUtil.e("_DaemonService"));
        arrayList.add(mjh.f41741a + ProcessUtil.e("_leakcanary"));
        arrayList.add(mjh.f41741a + "com.huawei.version.json");
        arrayList.add(mjh.f41741a + "huawei_crashLog_0.txt");
        arrayList.add(mjh.f41741a + "huawei_crashLog_1.txt");
        arrayList.add(mjh.f41741a + "huawei_crashLog_2.txt");
        arrayList.add(mjh.f41741a + "app_config_value.txt");
        arrayList.add(mjh.f41741a + "leak.txt");
        if (CommonUtil.ap()) {
            arrayList.add(mjh.f41741a + "hihealth_sensitive_export.zip");
            arrayList.add(mjh.f41741a + "hihealth_003_export.zip");
        }
        DfxBaseHandler.getAllDfxLogFileToPathList(new File(mjh.f41741a), arrayList);
        ltn ltnVar = new ltn();
        ltnVar.e(arrayList);
        ltnVar.c(200);
        Message messageObtain = Message.obtain();
        messageObtain.what = 37;
        Bundle bundle = new Bundle();
        bundle.putInt("bugTypeId", i);
        bundle.putString("fileLogId", str);
        bundle.putString("dtsNumber", str2);
        messageObtain.setData(bundle);
        this.e.sendMessage(messageObtain);
        LogUtil.a("HealthFeedbackListener", "collectLogs mFeedbackHandler sendMessage MSG_GET_DEVICE_LOG, bugTypeId = " + i + ", fileLogId = " + str + ", dtsNumber = " + str2);
        return ltnVar;
    }
}

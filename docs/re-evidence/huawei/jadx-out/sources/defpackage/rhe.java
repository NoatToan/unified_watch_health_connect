package defpackage;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.googlefit.GoogleFitDataManage;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes16.dex */
public class rhe {
    public static void b(Context context) {
        LogUtil.d("Step_GoalValue", "doSyncThirdPartService start.");
        if (CommonUtil.cb()) {
            e(context);
        }
    }

    private static void e(Context context) {
        if (!CommonUtil.ab(context)) {
            LogUtil.e("Step_GoalValue", "doSyncGoogleFit network is not connected!");
            return;
        }
        boolean zE = wzu.a().e();
        LogUtil.a("Step_GoalValue", "doSyncGoogleFit.isConnect = ", Boolean.valueOf(zE));
        if (zE) {
            new GoogleFitDataManage(context).d();
            LogUtil.a("Step_GoalValue", "doSyncGoogleFit end");
        }
    }
}

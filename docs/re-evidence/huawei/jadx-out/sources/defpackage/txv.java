package defpackage;

import android.content.res.Resources;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.R;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes43.dex */
public class txv extends txt {
    public void e() {
        if (VersionControlUtil.isSupportSleepManagement()) {
            ReleaseLogUtil.d("SEND_MSG_FOR_INTEL_SLEEP", "SendMsgForMonthly sendMsg");
            txt.a aVar = new txt.a();
            Resources resources = BaseApplication.getContext().getResources();
            aVar.a(resources.getString(R.string.IDS_Intel_sleep_improvement_title));
            aVar.d(resources.getString(R.string.IDS_intel_sleep_bubble_3) + resources.getString(R.string.IDS_intel_sleep_see_details) + ">>");
            StringBuilder sb = new StringBuilder("huaweihealth://huaweihealth.app/");
            sb.append(c("openwith?address=com.huawei.health.h5.sleep-management?h5pro=true&pName=com.huawei.health&path=sleepReport&statusBarTextBlack&isImmerse&isNeedLogin=true", 2));
            aVar.e(sb.toString());
            aVar.b("huaweischeme://healthapp/router/" + c("openwith?address=com.huawei.health.h5.sleep-management?h5pro=true&pName=com.huawei.health&path=sleepReport&statusBarTextBlack&isImmerse&isNeedLogin=true", 1));
            ReleaseLogUtil.d("SEND_MSG_FOR_INTEL_SLEEP", aVar.toString());
            uce.c(aVar);
        }
    }
}

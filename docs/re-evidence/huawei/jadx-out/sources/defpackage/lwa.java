package defpackage;

import android.content.Context;
import com.huawei.agconnect.apms.Agent;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lwa {
    public static void b(Context context) {
        LogUtil.a("CmccAiJumpUtil", "jumpCmccAiH5Page entry");
        if (context == null) {
            LogUtil.j("CmccAiJumpUtil", "jumpCmccAiH5Page context is null.");
            return;
        }
        String str = d() + "/hw/";
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addCustomizeJsModule(Agent.OS_NAME, lwc.class).showStatusBar().setStatusBarTextBlack(true).setImmerse().setNeedSoftInputAdapter();
        H5ProClient.startH5LightApp(context, str, builder.build());
    }

    public static String d() {
        LogUtil.a("CmccAiJumpUtil", "getCmccDomainName entry");
        return BaseApplication.b().getResources().getString(R.string.lingxi_domain_name);
    }
}

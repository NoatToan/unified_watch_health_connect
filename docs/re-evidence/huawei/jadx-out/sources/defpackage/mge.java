package defpackage;

import com.huawei.haf.bundle.AppBundle;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.KeyValDbManager;

/* JADX INFO: loaded from: classes10.dex */
public class mge {
    public static void c(String str) {
        LogUtil.a("DevicePluginMgrUtil", "enter saveDownloadHiAiPluginFlag ,feature type is: ", str);
        if (!AppBundle.c().isBundleModule("PluginHiAiEngine") || ddr.e().isPluginAvaiable()) {
            return;
        }
        LogUtil.a("DevicePluginMgrUtil", "HiAI plugin not exist，save download Hi AI flag");
        KeyValDbManager.d(BaseApplication.getContext()).b("downloadHiAiPlugin", str);
    }
}

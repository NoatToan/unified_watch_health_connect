package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class wtx {
    public static void b(String str, DownloadCallback<File> downloadCallback) {
        b(str, true, downloadCallback);
    }

    private static void b(String str, boolean z, DownloadCallback<File> downloadCallback) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(qqs.e(BaseApplication.b()) ? "_dark" : "_light");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(MultiUsersManager.INSTANCE.getMainUser().d() == 0 ? "_girl" : "_boy");
        String string2 = sb2.toString();
        if (z) {
            string2 = string2 + "_big";
        }
        HashMap map = new HashMap();
        map.put("configType", "aiBodyShapePics");
        fdy.d(new fda("com.huawei.health_Sport_Common", map), string2, 7, downloadCallback);
    }
}

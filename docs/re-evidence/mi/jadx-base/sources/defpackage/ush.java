package defpackage;

import android.text.TextUtils;
import com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.file.FileUtil;
import com.xiaomi.smarthome.server.PluginPackageManager;

/* JADX INFO: loaded from: classes5.dex */
public class ush {
    public static void a(String str, String str2) {
        RnPluginLog.d("deleteDataAfterDeviceRemoved,did=" + str2);
        vsh.a(str2);
        String absolutePath = ((IRnRuntimeProvider) RnModuleProvider.as(IRnRuntimeProvider.class)).getPluginDirWithDid(MiJiaEnvironment.getAppContext(), PluginPackageManager.getInstance().getInstallPackageInfo(str), str2).getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath)) {
            return;
        }
        FileUtil.deleteDirectory(absolutePath);
        nam.o(absolutePath, "config.xml");
    }
}

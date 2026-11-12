package defpackage;

import android.content.Context;
import android.content.Intent;
import com.huawei.android.bundlecore.UserConfirmationDialog;
import com.huawei.android.bundlecore.download.Downloader;
import com.huawei.android.bundlecore.update.ModuleUpdateService;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;

/* JADX INFO: loaded from: classes22.dex */
public final class ban {
    public static void d(Context context) {
        bbo.d().e();
        azs.b(context);
    }

    public static void d(Context context, Downloader downloader, Class<? extends UserConfirmationDialog> cls) {
        if (ProcessUtil.b()) {
            bav.c(context, downloader, cls);
        }
        bbo.d().b();
    }

    public static boolean b(Context context, String str, String str2) {
        if (!ProcessUtil.b()) {
            return false;
        }
        try {
            Intent intent = new Intent("ModuleUpdateService");
            intent.setClassName(context, ModuleUpdateService.class.getName());
            intent.putExtra("new_module_info_version", str);
            intent.putExtra("new_module_info_path", str2);
            context.startService(intent);
            return true;
        } catch (IllegalStateException e) {
            LogUtil.d("Bundle_BundleFramework", "updateModuleInfo, ex=", LogUtil.c(e));
            return false;
        }
    }
}

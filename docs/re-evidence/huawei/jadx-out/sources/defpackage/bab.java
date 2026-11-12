package defpackage;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import com.huawei.haf.dynamic.DynamicLoaderException;
import com.huawei.haf.dynamic.DynamicResourcesLoader;
import java.io.File;

/* JADX INFO: loaded from: classes22.dex */
public class bab {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final azq f873c = new azq("SplitInstallHelper");

    public static void e(Context context) {
        if (e(context, context.getResources())) {
            return;
        }
        f873c.c("Failed to load context resources", new Object[0]);
    }

    public static void c(Activity activity, Resources resources) {
        if (e(activity, resources)) {
            return;
        }
        f873c.c("Failed to load activity resources", new Object[0]);
    }

    public static void b(Service service) {
        if (e(service, service.getBaseContext().getResources())) {
            return;
        }
        f873c.c("Failed to load service resources", new Object[0]);
    }

    public static void e(BroadcastReceiver broadcastReceiver, Context context) {
        if (!"ReceiverRestrictedContext".equals(context.getClass().getSimpleName()) || e(((ContextWrapper) context).getBaseContext(), context.getResources())) {
            return;
        }
        f873c.c("Failed to load receiver resources", new Object[0]);
    }

    public static void b(Context context, String str) {
        if (bbm.d(context, str)) {
            return;
        }
        try {
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError e) {
            String str2 = context.getApplicationInfo().nativeLibraryDir + File.pathSeparatorChar + System.mapLibraryName(str);
            if (new File(str2).exists()) {
                System.load(str2);
                return;
            }
            throw e;
        }
    }

    private static boolean e(Context context, Resources resources) {
        try {
            DynamicResourcesLoader.c(context, resources, bbo.d().getLoadedModuleApkPaths());
            return true;
        } catch (DynamicLoaderException e) {
            f873c.c(e, "checkOrUpdateResources fail.", new Object[0]);
            return false;
        }
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import com.huawei.android.bundlecore.download.Downloader;
import com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class bav {
    private static final AtomicReference<ModuleInstallSupervisor> d = new AtomicReference<>();

    public static void c(Context context, Downloader downloader, Class<? extends Activity> cls) {
        if (e() == null) {
            bay bayVar = new bay(context, downloader, cls);
            d.set(bayVar);
            bayVar.initialize(context);
        }
    }

    public static ModuleInstallSupervisor e() {
        return d.get();
    }
}

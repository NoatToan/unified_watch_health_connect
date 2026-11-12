package defpackage;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import com.huawei.haf.bundle.AppBundleResources;

/* JADX INFO: loaded from: classes22.dex */
public final class bby implements AppBundleResources {
    @Override // com.huawei.haf.bundle.AppBundleResources
    public void loadResources(Context context) {
        bab.e(context);
    }

    @Override // com.huawei.haf.bundle.AppBundleResources
    public void loadResources(Activity activity, Resources resources) {
        bab.c(activity, resources);
    }

    @Override // com.huawei.haf.bundle.AppBundleResources
    public void loadResources(Service service) {
        bab.b(service);
    }

    @Override // com.huawei.haf.bundle.AppBundleResources
    public void loadResources(BroadcastReceiver broadcastReceiver, Context context) {
        bab.e(broadcastReceiver, context);
    }

    @Override // com.huawei.haf.bundle.AppBundleResources
    public void loadLibrary(Context context, String str) {
        bab.b(context, str);
    }
}

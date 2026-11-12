package defpackage;

import android.content.Context;
import com.huawei.haf.dynamic.DynamicResourcesLoader;
import health.compact.a.AuthorizationUtils;

/* JADX INFO: loaded from: classes.dex */
public class dbl extends DynamicResourcesLoader.WebViewLoadPolicy {
    @Override // com.huawei.haf.dynamic.DynamicResourcesLoader.WebViewLoadPolicy
    public boolean b(Context context) {
        return super.b(context) && AuthorizationUtils.c(context);
    }

    @Override // com.huawei.haf.dynamic.DynamicResourcesLoader.WebViewLoadPolicy
    public boolean d(Context context) {
        return !AuthorizationUtils.c(context);
    }
}

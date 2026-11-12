package com.huawei.haf.router;

import android.content.Context;
import android.os.Bundle;
import com.huawei.haf.common.base.BaseContentProvider;
import com.huawei.haf.handler.HandlerExecutor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AppRouterRemoteProvider extends BaseContentProvider {
    @Override // com.huawei.haf.common.base.BaseContentProvider, android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        if (bundle == null || !"navigate".equals(str)) {
            return null;
        }
        navigate(bundle);
        return null;
    }

    protected void navigate(Bundle bundle) {
        HandlerExecutor.c(new InnerRouterRunnable(bundle));
    }

    static class InnerRouterRunnable implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bundle f6013a;

        InnerRouterRunnable(Bundle bundle) {
            this.f6013a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppRouterResultReceiver.c((Context) null, this.f6013a);
        }
    }
}

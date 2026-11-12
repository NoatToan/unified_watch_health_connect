package com.huawei.health.routeradapter;

import android.content.Context;
import com.huawei.haf.common.exception.HafException;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.template.InterceptorHandler;
import defpackage.gvd;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes2.dex */
public final class HealthLoginInterceptorService implements InterceptorHandler {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.template.InterceptorHandler
    public void process(Guidepost guidepost, InterceptorHandler.InterceptorCallback interceptorCallback) {
        if (!gvd.c(guidepost)) {
            a(guidepost, interceptorCallback, false);
            return;
        }
        Context contextE = guidepost.e();
        if (gvd.b(contextE) && gvd.c(contextE)) {
            if (Utils.o() && gvd.e(guidepost)) {
                gvd.a(contextE);
                interceptorCallback.onInterrupt(new HafException("oversea user not used"));
                return;
            } else {
                a(guidepost, interceptorCallback, true);
                return;
            }
        }
        gvd.d(guidepost, null, true);
        interceptorCallback.onInterrupt(new HafException("no login"));
    }

    private void a(Guidepost guidepost, InterceptorHandler.InterceptorCallback interceptorCallback, boolean z) {
        if (gvd.b(guidepost)) {
            gvd.d(guidepost, null, z);
            interceptorCallback.onInterrupt(new HafException("need obtainAdapterInit"));
        } else {
            interceptorCallback.onContinue(guidepost);
        }
    }
}

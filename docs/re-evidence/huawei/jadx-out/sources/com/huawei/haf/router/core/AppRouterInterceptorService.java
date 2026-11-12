package com.huawei.haf.router.core;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.template.InterceptorHandler;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class AppRouterInterceptorService implements Runnable {
    AppRouterInterceptorService() {
        HandlerCenter.a().d(this, "interceptor");
    }

    void d(Guidepost guidepost, InterceptorHandler.InterceptorCallback interceptorCallback) {
        if (AppRouterStore.f6063c.isEmpty()) {
            interceptorCallback.onContinue(guidepost);
        } else {
            HandlerCenter.a().d(new InterceptorExecutor(AppRouterStore.f6062b.size(), guidepost, interceptorCallback), "interceptor");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator<Map.Entry<Integer, Class<? extends InterceptorHandler>>> it = AppRouterStore.f6063c.entrySet().iterator();
        while (it.hasNext()) {
            Class<? extends InterceptorHandler> value = it.next().getValue();
            try {
                InterceptorHandler interceptorHandlerNewInstance = value.newInstance();
                interceptorHandlerNewInstance.init(BaseApplication.b());
                AppRouterStore.f6062b.add(interceptorHandlerNewInstance);
            } catch (Exception e) {
                throw new AppRouterHandleException("init interceptor error! name = [" + value.getName() + "], reason = [" + e.getMessage() + "]");
            }
        }
    }

    static class InterceptorExecutor extends CountDownLatch implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Guidepost f6040a;
        private final InterceptorHandler.InterceptorCallback e;

        InterceptorExecutor(int i, Guidepost guidepost, InterceptorHandler.InterceptorCallback interceptorCallback) {
            super(i);
            this.f6040a = guidepost;
            this.e = interceptorCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e(0);
                await(250L, TimeUnit.SECONDS);
                if (getCount() > 0) {
                    this.e.onInterrupt(new AppRouterHandleException("The interceptor processing timed out."));
                } else if (this.f6040a.k() instanceof Throwable) {
                    this.e.onInterrupt((Throwable) this.f6040a.k());
                } else {
                    this.e.onContinue(this.f6040a);
                }
            } catch (Exception e) {
                this.e.onInterrupt(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(final int i) {
            if (i >= AppRouterStore.f6062b.size()) {
                return;
            }
            AppRouterStore.f6062b.get(i).process(this.f6040a, new InterceptorHandler.InterceptorCallback() { // from class: com.huawei.haf.router.core.AppRouterInterceptorService.InterceptorExecutor.1
                @Override // com.huawei.haf.router.facade.template.InterceptorHandler.InterceptorCallback
                public void onContinue(Guidepost guidepost) {
                    InterceptorExecutor.this.countDown();
                    InterceptorExecutor.this.e(i + 1);
                }

                @Override // com.huawei.haf.router.facade.template.InterceptorHandler.InterceptorCallback
                public void onInterrupt(Throwable th) {
                    Guidepost guidepost = InterceptorExecutor.this.f6040a;
                    if (th == null) {
                        th = new AppRouterHandleException("No message.");
                    }
                    guidepost.d(th);
                    InterceptorExecutor.this.c();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            while (getCount() > 0) {
                countDown();
            }
        }
    }
}

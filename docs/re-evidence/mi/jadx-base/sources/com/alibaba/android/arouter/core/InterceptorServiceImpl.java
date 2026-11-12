package com.alibaba.android.arouter.core;

import android.content.Context;
import com.alibaba.android.arouter.exception.HandlerException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.service.InterceptorService;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.facade.template.ILogger;
import defpackage.kb;
import defpackage.ni3;
import defpackage.nre;
import defpackage.x3r;
import defpackage.z4f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@Route(path = "/arouter/service/interceptor")
public class InterceptorServiceImpl implements InterceptorService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f5711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f5712b = new Object();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Postcard f5713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterceptorCallback f5714b;

        public a(Postcard postcard, InterceptorCallback interceptorCallback) {
            this.f5713a = postcard;
            this.f5714b = interceptorCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            ni3 ni3Var = new ni3(x3r.f.size());
            try {
                InterceptorServiceImpl.a(0, ni3Var, this.f5713a);
                ni3Var.await(this.f5713a.getTimeout(), TimeUnit.SECONDS);
                if (ni3Var.getCount() > 0) {
                    this.f5714b.onInterrupt(new HandlerException("The interceptor processing timed out."));
                } else if (this.f5713a.getTag() != null) {
                    this.f5714b.onInterrupt(new HandlerException(this.f5713a.getTag().toString()));
                } else {
                    this.f5714b.onContinue(this.f5713a);
                }
            } catch (Exception e) {
                this.f5714b.onInterrupt(e);
            }
        }
    }

    public static class b implements InterceptorCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ni3 f5715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f5716b;
        public final /* synthetic */ Postcard c;

        public b(ni3 ni3Var, int i, Postcard postcard) {
            this.f5715a = ni3Var;
            this.f5716b = i;
            this.c = postcard;
        }

        @Override // com.alibaba.android.arouter.facade.callback.InterceptorCallback
        public void onContinue(Postcard postcard) {
            this.f5715a.countDown();
            InterceptorServiceImpl.a(this.f5716b + 1, this.f5715a, postcard);
        }

        @Override // com.alibaba.android.arouter.facade.callback.InterceptorCallback
        public void onInterrupt(Throwable th) {
            this.c.setTag(th == null ? new HandlerException("No message.") : th.getMessage());
            this.f5715a.a();
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f5717a;

        public c(Context context) {
            this.f5717a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (z4f.b(x3r.e)) {
                Iterator<Map.Entry<Integer, Class<? extends IInterceptor>>> it = x3r.e.entrySet().iterator();
                while (it.hasNext()) {
                    Class<? extends IInterceptor> value = it.next().getValue();
                    try {
                        IInterceptor iInterceptorNewInstance = value.getConstructor(new Class[0]).newInstance(new Object[0]);
                        iInterceptorNewInstance.init(this.f5717a);
                        x3r.f.add(iInterceptorNewInstance);
                    } catch (Exception e) {
                        throw new HandlerException("ARouter::ARouter init interceptor error! name = [" + value.getName() + "], reason = [" + e.getMessage() + "]");
                    }
                }
                boolean unused = InterceptorServiceImpl.f5711a = true;
                kb.c.info(ILogger.defaultTag, "ARouter interceptors init over.");
                synchronized (InterceptorServiceImpl.f5712b) {
                    InterceptorServiceImpl.f5712b.notifyAll();
                }
            }
        }
    }

    public static void a(int i, ni3 ni3Var, Postcard postcard) {
        if (i < x3r.f.size()) {
            x3r.f.get(i).process(postcard, new b(ni3Var, i, postcard));
        }
    }

    public static void e() {
        synchronized (f5712b) {
            while (!f5711a) {
                try {
                    f5712b.wait(10000L);
                } catch (InterruptedException e) {
                    throw new HandlerException("ARouter::Interceptor init cost too much time error! reason = [" + e.getMessage() + "]");
                }
            }
        }
    }

    @Override // com.alibaba.android.arouter.facade.service.InterceptorService
    public void doInterceptions(Postcard postcard, InterceptorCallback interceptorCallback) {
        List<IInterceptor> list = x3r.f;
        if (list == null || list.size() <= 0) {
            interceptorCallback.onContinue(postcard);
            return;
        }
        e();
        if (f5711a) {
            nre.f28288b.execute(new a(postcard, interceptorCallback));
        } else {
            interceptorCallback.onInterrupt(new HandlerException("Interceptors initialization takes too much time."));
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        nre.f28288b.execute(new c(context));
    }
}

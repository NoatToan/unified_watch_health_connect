package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.JavaJSExecutor;
import defpackage.sk1;
import java.util.HashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class WebsocketJavaScriptExecutor implements JavaJSExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, String> f7280a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.facebook.react.devsupport.e f7281b;

    public static class WebsocketExecutorTimeoutException extends Exception {
        public WebsocketExecutorTimeoutException(String str) {
            super(str);
        }
    }

    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f7282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f7283b;
        public final /* synthetic */ String c;

        public a(e eVar, AtomicInteger atomicInteger, String str) {
            this.f7282a = eVar;
            this.f7283b = atomicInteger;
            this.c = str;
        }

        @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.e
        public void onFailure(Throwable th) {
            if (this.f7283b.decrementAndGet() <= 0) {
                this.f7282a.onFailure(th);
            } else {
                WebsocketJavaScriptExecutor.this.d(this.c, this);
            }
        }

        @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.e
        public void onSuccess() {
            this.f7282a.onSuccess();
        }
    }

    public class b implements com.facebook.react.devsupport.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7284a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.facebook.react.devsupport.e f7285b;
        public final /* synthetic */ Handler c;
        public final /* synthetic */ e d;

        public class a implements com.facebook.react.devsupport.e.a {
            public a() {
            }

            @Override // com.facebook.react.devsupport.e.a
            public void onFailure(Throwable th) {
                b.this.c.removeCallbacksAndMessages(null);
                if (b.this.f7284a) {
                    return;
                }
                b.this.d.onFailure(th);
                b.this.f7284a = true;
            }

            @Override // com.facebook.react.devsupport.e.a
            public void onSuccess(String str) {
                b.this.c.removeCallbacksAndMessages(null);
                b bVar = b.this;
                WebsocketJavaScriptExecutor.this.f7281b = bVar.f7285b;
                if (b.this.f7284a) {
                    return;
                }
                b.this.d.onSuccess();
                b.this.f7284a = true;
            }
        }

        public b(com.facebook.react.devsupport.e eVar, Handler handler, e eVar2) {
            this.f7285b = eVar;
            this.c = handler;
            this.d = eVar2;
        }

        @Override // com.facebook.react.devsupport.e.a
        public void onFailure(Throwable th) {
            this.c.removeCallbacksAndMessages(null);
            if (this.f7284a) {
                return;
            }
            this.d.onFailure(th);
            this.f7284a = true;
        }

        @Override // com.facebook.react.devsupport.e.a
        public void onSuccess(String str) {
            this.f7285b.f(new a());
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.facebook.react.devsupport.e f7287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f7288b;

        public c(com.facebook.react.devsupport.e eVar, e eVar2) {
            this.f7287a = eVar;
            this.f7288b = eVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7287a.b();
            this.f7288b.onFailure(new WebsocketExecutorTimeoutException("Timeout while connecting to remote debugger"));
        }
    }

    public interface e {
        void onFailure(Throwable th);

        void onSuccess();
    }

    public void c(String str, e eVar) {
        d(str, new a(eVar, new AtomicInteger(3), str));
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public void close() {
        com.facebook.react.devsupport.e eVar = this.f7281b;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final void d(String str, e eVar) {
        com.facebook.react.devsupport.e eVar2 = new com.facebook.react.devsupport.e();
        Handler handler = new Handler(Looper.getMainLooper());
        eVar2.c(str, new b(eVar2, handler, eVar));
        handler.postDelayed(new c(eVar2, eVar), 5000L);
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public String executeJSCall(String str, String str2) throws JavaJSExecutor.ProxyExecutorException {
        d dVar = new d(null);
        ((com.facebook.react.devsupport.e) sk1.c(this.f7281b)).d(str, str2, dVar);
        try {
            return dVar.a();
        } catch (Throwable th) {
            throw new JavaJSExecutor.ProxyExecutorException(th);
        }
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public void loadApplicationScript(String str) throws JavaJSExecutor.ProxyExecutorException {
        d dVar = new d(null);
        ((com.facebook.react.devsupport.e) sk1.c(this.f7281b)).e(str, this.f7280a, dVar);
        try {
            dVar.a();
        } catch (Throwable th) {
            throw new JavaJSExecutor.ProxyExecutorException(th);
        }
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public void setGlobalVariable(String str, String str2) {
        this.f7280a.put(str, str2);
    }

    public static class d implements com.facebook.react.devsupport.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Semaphore f7289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Throwable f7290b;
        public String c;

        public d() {
            this.f7289a = new Semaphore(0);
        }

        public String a() throws Throwable {
            this.f7289a.acquire();
            Throwable th = this.f7290b;
            if (th == null) {
                return this.c;
            }
            throw th;
        }

        @Override // com.facebook.react.devsupport.e.a
        public void onFailure(Throwable th) {
            this.f7290b = th;
            this.f7289a.release();
        }

        @Override // com.facebook.react.devsupport.e.a
        public void onSuccess(String str) {
            this.c = str;
            this.f7289a.release();
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }
}

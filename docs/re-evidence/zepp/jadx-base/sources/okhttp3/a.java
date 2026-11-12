package okhttp3;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.connection.ConnectInterceptor;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import okio.AsyncTimeout;
import okio.Timeout;

/* JADX INFO: loaded from: classes23.dex */
final class a implements Call {
    public final OkHttpClient a;
    public final RetryAndFollowUpInterceptor b;
    public final AsyncTimeout c;

    @Nullable
    private EventListener d;
    public final Request e;
    public final boolean f;
    private boolean g;

    /* JADX INFO: renamed from: okhttp3.a$a, reason: collision with other inner class name */
    public class C1188a extends AsyncTimeout {
        public C1188a() {
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            a.this.cancel();
        }
    }

    public final class b extends NamedRunnable {
        public static final /* synthetic */ boolean c = false;
        private final Callback a;

        public b(Callback callback) {
            super("OkHttp %s", a.this.f());
            this.a = callback;
        }

        public void e(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    a.this.d.callFailed(a.this, interruptedIOException);
                    this.a.onFailure(a.this, interruptedIOException);
                    a.this.a.dispatcher().d(this);
                }
            } catch (Throwable th) {
                a.this.a.dispatcher().d(this);
                throw th;
            }
        }

        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
            Throwable th;
            boolean z;
            IOException e;
            a.this.c.enter();
            try {
                try {
                    z = true;
                    try {
                        this.a.onResponse(a.this, a.this.d());
                    } catch (IOException e2) {
                        e = e2;
                        IOException iOExceptionH = a.this.h(e);
                        if (z) {
                            Platform.get().log(4, "Callback failure for " + a.this.i(), iOExceptionH);
                        } else {
                            a.this.d.callFailed(a.this, iOExceptionH);
                            this.a.onFailure(a.this, iOExceptionH);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        a.this.cancel();
                        if (!z) {
                            this.a.onFailure(a.this, new IOException("canceled due to " + th));
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    a.this.a.dispatcher().d(this);
                    throw th3;
                }
            } catch (IOException e3) {
                e = e3;
                z = false;
            } catch (Throwable th4) {
                th = th4;
                z = false;
            }
            a.this.a.dispatcher().d(this);
        }

        public a f() {
            return a.this;
        }

        public String g() {
            return a.this.e.url().host();
        }

        public Request h() {
            return a.this.e;
        }
    }

    private a(OkHttpClient okHttpClient, Request request, boolean z) {
        this.a = okHttpClient;
        this.e = request;
        this.f = z;
        this.b = new RetryAndFollowUpInterceptor(okHttpClient, z);
        C1188a c1188a = new C1188a();
        this.c = c1188a;
        c1188a.timeout(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
    }

    private void b() {
        this.b.setCallStackTrace(Platform.get().getStackTraceForCloseable("response.body().close()"));
    }

    public static a e(OkHttpClient okHttpClient, Request request, boolean z) {
        a aVar = new a(okHttpClient, request, z);
        aVar.d = okHttpClient.eventListenerFactory().create(aVar);
        return aVar;
    }

    @Override // okhttp3.Call
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a mo4492clone() {
        return e(this.a, this.e, this.f);
    }

    @Override // okhttp3.Call
    public void cancel() {
        this.b.cancel();
    }

    public Response d() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a.interceptors());
        arrayList.add(this.b);
        arrayList.add(new BridgeInterceptor(this.a.cookieJar()));
        arrayList.add(new CacheInterceptor(this.a.a()));
        arrayList.add(new ConnectInterceptor(this.a));
        if (!this.f) {
            arrayList.addAll(this.a.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(this.f));
        Response responseProceed = new RealInterceptorChain(arrayList, null, null, null, 0, this.e, this, this.d, this.a.connectTimeoutMillis(), this.a.readTimeoutMillis(), this.a.writeTimeoutMillis()).proceed(this.e);
        if (!this.b.isCanceled()) {
            return responseProceed;
        }
        Util.closeQuietly(responseProceed);
        throw new IOException("Canceled");
    }

    @Override // okhttp3.Call
    public void enqueue(Callback callback) {
        synchronized (this) {
            if (this.g) {
                throw new IllegalStateException("Already Executed");
            }
            this.g = true;
        }
        b();
        this.d.callStart(this);
        this.a.dispatcher().a(new b(callback));
    }

    @Override // okhttp3.Call
    public Response execute() throws IOException {
        synchronized (this) {
            if (this.g) {
                throw new IllegalStateException("Already Executed");
            }
            this.g = true;
        }
        b();
        this.c.enter();
        this.d.callStart(this);
        try {
            try {
                this.a.dispatcher().b(this);
                Response responseD = d();
                if (responseD == null) {
                    throw new IOException("Canceled");
                }
                this.a.dispatcher().e(this);
                return responseD;
            } catch (IOException e) {
                IOException iOExceptionH = h(e);
                this.d.callFailed(this, iOExceptionH);
                throw iOExceptionH;
            }
        } catch (Throwable th) {
            this.a.dispatcher().e(this);
            throw th;
        }
        this.a.dispatcher().e(this);
        throw th;
    }

    public String f() {
        return this.e.url().redact();
    }

    public StreamAllocation g() {
        return this.b.streamAllocation();
    }

    @Nullable
    public IOException h(@Nullable IOException iOException) {
        if (!this.c.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public String i() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(f());
        return sb.toString();
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
        return this.b.isCanceled();
    }

    @Override // okhttp3.Call
    public synchronized boolean isExecuted() {
        return this.g;
    }

    @Override // okhttp3.Call
    public Request request() {
        return this.e;
    }

    @Override // okhttp3.Call
    public Timeout timeout() {
        return this.c;
    }
}

package retrofit2;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes23.dex */
final class d<T> implements Call<T> {
    private final h<T, ?> a;

    @Nullable
    private final Object[] b;
    private volatile boolean c;

    @GuardedBy("this")
    @Nullable
    private okhttp3.Call d;

    @GuardedBy("this")
    @Nullable
    private Throwable e;

    @GuardedBy("this")
    private boolean f;

    public class a implements okhttp3.Callback {
        public final /* synthetic */ Callback a;

        public a(Callback callback) {
            this.a = callback;
        }

        private void a(Throwable th) {
            try {
                this.a.onFailure(d.this, th);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public void onFailure(okhttp3.Call call, IOException iOException) {
            a(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(okhttp3.Call call, okhttp3.Response response) {
            try {
                try {
                    this.a.onResponse(d.this, d.this.c(response));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                a(th2);
            }
        }
    }

    public static final class b extends ResponseBody {
        private final ResponseBody b;
        public IOException c;

        public class a extends ForwardingSource {
            public a(Source source) {
                super(source);
            }

            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j) throws IOException {
                try {
                    return super.read(buffer, j);
                } catch (IOException e) {
                    b.this.c = e;
                    throw e;
                }
            }
        }

        public b(ResponseBody responseBody) {
            this.b = responseBody;
        }

        public void b() throws IOException {
            IOException iOException = this.c;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.b.close();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.b.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.b.contentType();
        }

        @Override // okhttp3.ResponseBody
        public BufferedSource source() {
            return Okio.buffer(new a(this.b.source()));
        }
    }

    public static final class c extends ResponseBody {
        private final MediaType b;
        private final long c;

        public c(MediaType mediaType, long j) {
            this.b = mediaType;
            this.c = j;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.c;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.b;
        }

        @Override // okhttp3.ResponseBody
        public BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public d(h<T, ?> hVar, @Nullable Object[] objArr) {
        this.a = hVar;
        this.b = objArr;
    }

    private okhttp3.Call b() throws IOException {
        okhttp3.Call callD = this.a.d(this.b);
        Objects.requireNonNull(callD, "Call.Factory returned null.");
        return callD;
    }

    @Override // retrofit2.Call
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d<T> clone() {
        return new d<>(this.a, this.b);
    }

    public Response<T> c(okhttp3.Response response) throws IOException {
        ResponseBody responseBodyBody = response.body();
        okhttp3.Response responseBuild = response.newBuilder().body(new c(responseBodyBody.contentType(), responseBodyBody.contentLength())).build();
        int iCode = responseBuild.code();
        if (iCode < 200 || iCode >= 300) {
            try {
                return Response.error(i.a(responseBodyBody), responseBuild);
            } finally {
                responseBodyBody.close();
            }
        }
        if (iCode == 204 || iCode == 205) {
            responseBodyBody.close();
            return Response.success((Object) null, responseBuild);
        }
        b bVar = new b(responseBodyBody);
        try {
            return Response.success(this.a.e(bVar), responseBuild);
        } catch (RuntimeException e) {
            bVar.b();
            throw e;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        okhttp3.Call call;
        this.c = true;
        synchronized (this) {
            call = this.d;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // retrofit2.Call
    public void enqueue(Callback<T> callback) {
        okhttp3.Call call;
        Throwable th;
        i.b(callback, "callback == null");
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already executed.");
            }
            this.f = true;
            call = this.d;
            th = this.e;
            if (call == null && th == null) {
                try {
                    okhttp3.Call callB = b();
                    this.d = callB;
                    call = callB;
                } catch (Throwable th2) {
                    th = th2;
                    i.p(th);
                    this.e = th;
                }
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.c) {
            call.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(call, new a(callback));
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        okhttp3.Call callB;
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already executed.");
            }
            this.f = true;
            Throwable th = this.e;
            if (th != null) {
                if (th instanceof IOException) {
                    throw ((IOException) th);
                }
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            callB = this.d;
            if (callB == null) {
                try {
                    callB = b();
                    this.d = callB;
                } catch (IOException | Error | RuntimeException e) {
                    i.p(e);
                    this.e = e;
                    throw e;
                }
            }
        }
        if (this.c) {
            callB.cancel();
        }
        return c(FirebasePerfOkHttpClient.execute(callB));
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z = true;
        if (this.c) {
            return true;
        }
        synchronized (this) {
            okhttp3.Call call = this.d;
            if (call == null || !call.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.f;
    }

    @Override // retrofit2.Call
    public synchronized Request request() {
        okhttp3.Call call = this.d;
        if (call != null) {
            return call.request();
        }
        Throwable th = this.e;
        if (th != null) {
            if (th instanceof IOException) {
                throw new RuntimeException("Unable to create request.", this.e);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            okhttp3.Call callB = b();
            this.d = callB;
            return callB.request();
        } catch (IOException e) {
            this.e = e;
            throw new RuntimeException("Unable to create request.", e);
        } catch (Error e2) {
            e = e2;
            i.p(e);
            this.e = e;
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            i.p(e);
            this.e = e;
            throw e;
        }
    }
}

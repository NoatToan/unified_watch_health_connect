package defpackage;

import java.io.IOException;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes3.dex */
public final class d7h<T> implements ka3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lok f15177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f15178b;
    public final Call.Factory c;
    public final dk4<ResponseBody, T> d;
    public volatile boolean e;
    public Call f;
    public Throwable g;
    public boolean h;

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ xa3 f15179a;

        public a(xa3 xa3Var) {
            this.f15179a = xa3Var;
        }

        public final void a(Throwable th) {
            try {
                this.f15179a.onFailure(d7h.this, th);
            } catch (Throwable th2) {
                kmq.s(th2);
                th2.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            a(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            try {
                try {
                    this.f15179a.onResponse(d7h.this, d7h.this.d(response));
                } catch (Throwable th) {
                    kmq.s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                kmq.s(th2);
                a(th2);
            }
        }
    }

    public static final class b extends ResponseBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResponseBody f15181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BufferedSource f15182b;
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
            this.f15181a = responseBody;
            this.f15182b = Okio.buffer(new a(responseBody.getSource()));
        }

        public void a() throws IOException {
            IOException iOException = this.c;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f15181a.close();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.f15181a.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public MediaType get$contentType() {
            return this.f15181a.get$contentType();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public BufferedSource getSource() {
            return this.f15182b;
        }
    }

    public static final class c extends ResponseBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaType f15184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15185b;

        public c(MediaType mediaType, long j) {
            this.f15184a = mediaType;
            this.f15185b = j;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.f15185b;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public MediaType get$contentType() {
            return this.f15184a;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public BufferedSource getSource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public d7h(lok lokVar, Object[] objArr, Call.Factory factory, dk4<ResponseBody, T> dk4Var) {
        this.f15177a = lokVar;
        this.f15178b = objArr;
        this.c = factory;
        this.d = dk4Var;
    }

    @Override // defpackage.ka3
    public void E(xa3<T> xa3Var) {
        Call call;
        Throwable th;
        Objects.requireNonNull(xa3Var, "callback == null");
        synchronized (this) {
            try {
                if (this.h) {
                    throw new IllegalStateException("Already executed.");
                }
                this.h = true;
                call = this.f;
                th = this.g;
                if (call == null && th == null) {
                    try {
                        Call callB = b();
                        this.f = callB;
                        call = callB;
                    } catch (Throwable th2) {
                        th = th2;
                        kmq.s(th);
                        this.g = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            xa3Var.onFailure(this, th);
            return;
        }
        if (this.e) {
            call.cancel();
        }
        call.enqueue(new a(xa3Var));
    }

    @Override // defpackage.ka3
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d7h<T> clone() {
        return new d7h<>(this.f15177a, this.f15178b, this.c, this.d);
    }

    public final Call b() throws IOException {
        Call callNewCall = this.c.newCall(this.f15177a.a(this.f15178b));
        if (callNewCall != null) {
            return callNewCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public final Call c() throws IOException {
        Call call = this.f;
        if (call != null) {
            return call;
        }
        Throwable th = this.g;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            Call callB = b();
            this.f = callB;
            return callB;
        } catch (IOException | Error | RuntimeException e) {
            kmq.s(e);
            this.g = e;
            throw e;
        }
    }

    @Override // defpackage.ka3
    public void cancel() {
        Call call;
        this.e = true;
        synchronized (this) {
            call = this.f;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public prk<T> d(Response response) throws IOException {
        ResponseBody responseBodyBody = response.body();
        Response responseBuild = response.newBuilder().body(new c(responseBodyBody.get$contentType(), responseBodyBody.getContentLength())).build();
        int iCode = responseBuild.code();
        if (iCode < 200 || iCode >= 300) {
            try {
                return prk.c(kmq.a(responseBodyBody), responseBuild);
            } finally {
                responseBodyBody.close();
            }
        }
        if (iCode == 204 || iCode == 205) {
            responseBodyBody.close();
            return prk.h(null, responseBuild);
        }
        b bVar = new b(responseBodyBody);
        try {
            return prk.h(this.d.convert(bVar), responseBuild);
        } catch (RuntimeException e) {
            bVar.a();
            throw e;
        }
    }

    @Override // defpackage.ka3
    public prk<T> execute() throws IOException {
        Call callC;
        synchronized (this) {
            if (this.h) {
                throw new IllegalStateException("Already executed.");
            }
            this.h = true;
            callC = c();
        }
        if (this.e) {
            callC.cancel();
        }
        return d(callC.execute());
    }

    @Override // defpackage.ka3
    public boolean isCanceled() {
        boolean z = true;
        if (this.e) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f;
                if (call == null || !call.getCanceled()) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.ka3
    public synchronized Request request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return c().request();
    }
}

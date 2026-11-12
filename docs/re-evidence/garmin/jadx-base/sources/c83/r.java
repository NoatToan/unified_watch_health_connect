package c83;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.ArrayList;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import w63.g0;

/* JADX INFO: loaded from: classes11.dex */
public final class r<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f25816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f25818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Call.Factory f25819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h<ResponseBody, T> f25820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f25821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Call f25822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Throwable f25823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25824i;

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f25825a;

        public a(f fVar) {
            this.f25825a = fVar;
        }

        @Override // okhttp3.Callback
        public final void onFailure(Call call, IOException iOException) {
            try {
                this.f25825a.a(r.this, iOException);
            } catch (Throwable th3) {
                f0.m(th3);
                th3.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public final void onResponse(Call call, Response response) {
            f fVar = this.f25825a;
            r rVar = r.this;
            try {
                try {
                    fVar.c(rVar, rVar.c(response));
                } catch (Throwable th3) {
                    f0.m(th3);
                    th3.printStackTrace();
                }
            } catch (Throwable th4) {
                f0.m(th4);
                try {
                    fVar.a(rVar, th4);
                } catch (Throwable th5) {
                    f0.m(th5);
                    th5.printStackTrace();
                }
            }
        }
    }

    public static final class b extends ResponseBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResponseBody f25827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w63.b0 f25828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public IOException f25829c;

        public class a extends w63.o {
            public a(g0 g0Var) {
                super(g0Var);
            }

            @Override // w63.o, w63.g0
            public final long read(w63.e eVar, long j8) throws IOException {
                try {
                    return super.read(eVar, j8);
                } catch (IOException e4) {
                    b.this.f25829c = e4;
                    throw e4;
                }
            }
        }

        public b(ResponseBody responseBody) {
            this.f25827a = responseBody;
            this.f25828b = new w63.b0(new a(responseBody.getBodySource()));
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f25827a.close();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public final long getContentLength() {
            return this.f25827a.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType get$contentType() {
            return this.f25827a.get$contentType();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public final w63.g getBodySource() {
            return this.f25828b;
        }
    }

    public static final class c extends ResponseBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaType f25831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f25832b;

        public c(MediaType mediaType, long j8) {
            this.f25831a = mediaType;
            this.f25832b = j8;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public final long getContentLength() {
            return this.f25832b;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType get$contentType() {
            return this.f25831a;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public final w63.g getBodySource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public r(z zVar, Object obj, Object[] objArr, Call.Factory factory, h<ResponseBody, T> hVar) {
        this.f25816a = zVar;
        this.f25817b = obj;
        this.f25818c = objArr;
        this.f25819d = factory;
        this.f25820e = hVar;
    }

    public final Call a() {
        HttpUrl httpUrlResolve;
        z zVar = this.f25816a;
        v<?>[] vVarArr = zVar.f25909k;
        Object[] objArr = this.f25818c;
        int length = objArr.length;
        if (length != vVarArr.length) {
            vb.h.s(am.j.q(b71.i.i(length, "Argument count (", ") doesn't match expected count ("), vVarArr.length, ")"));
            return null;
        }
        y yVar = new y(zVar.f25902d, zVar.f25901c, zVar.f25903e, zVar.f25904f, zVar.f25905g, zVar.f25906h, zVar.f25907i, zVar.f25908j);
        if (zVar.f25910l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i14 = 0; i14 < length; i14++) {
            arrayList.add(objArr[i14]);
            vVarArr[i14].a(yVar, objArr[i14]);
        }
        HttpUrl.Builder builder = yVar.f25889d;
        if (builder != null) {
            httpUrlResolve = builder.build();
        } else {
            String str = yVar.f25888c;
            HttpUrl httpUrl = yVar.f25887b;
            httpUrlResolve = httpUrl.resolve(str);
            if (httpUrlResolve == null) {
                StringBuilder sb3 = new StringBuilder("Malformed URL. Base: ");
                sb3.append(httpUrl);
                c22.t.j(sb3, ", Relative: ", yVar.f25888c);
                return null;
            }
        }
        RequestBody aVar = yVar.f25896k;
        if (aVar == null) {
            FormBody.Builder builder2 = yVar.f25895j;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = yVar.f25894i;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (yVar.f25893h) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = yVar.f25892g;
        Headers.Builder builder4 = yVar.f25891f;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new y.a(aVar, mediaType);
            } else {
                builder4.add(HttpHeaders.CONTENT_TYPE, mediaType.getMediaType());
            }
        }
        Call callNewCall = this.f25819d.newCall(yVar.f25890e.url(httpUrlResolve).headers(builder4.build()).method(yVar.f25886a, aVar).tag(l.class, new l(zVar.f25899a, this.f25817b, zVar.f25900b, arrayList)).build());
        if (callNewCall != null) {
            return callNewCall;
        }
        j20.x.l("Call.Factory returned null.");
        return null;
    }

    public final Call b() throws IOException {
        Call call = this.f25822g;
        if (call != null) {
            return call;
        }
        Throwable th3 = this.f25823h;
        if (th3 != null) {
            if (th3 instanceof IOException) {
                throw ((IOException) th3);
            }
            if (th3 instanceof RuntimeException) {
                throw ((RuntimeException) th3);
            }
            throw ((Error) th3);
        }
        try {
            Call callA = a();
            this.f25822g = callA;
            return callA;
        } catch (IOException | Error | RuntimeException e4) {
            f0.m(e4);
            this.f25823h = e4;
            throw e4;
        }
    }

    public final a0<T> c(Response response) throws IOException {
        ResponseBody responseBodyBody = response.body();
        Response responseBuild = response.newBuilder().body(new c(responseBodyBody.get$contentType(), responseBodyBody.getContentLength())).build();
        int iCode = responseBuild.code();
        if (iCode < 200 || iCode >= 300) {
            try {
                w63.e eVar = new w63.e();
                responseBodyBody.getBodySource().V3(eVar);
                return a0.a(ResponseBody.create(responseBodyBody.get$contentType(), responseBodyBody.getContentLength(), eVar), responseBuild);
            } finally {
                responseBodyBody.close();
            }
        }
        if (iCode == 204 || iCode == 205) {
            responseBodyBody.close();
            return a0.c(null, responseBuild);
        }
        b bVar = new b(responseBodyBody);
        try {
            return a0.c(this.f25820e.convert(bVar), responseBuild);
        } catch (RuntimeException e4) {
            IOException iOException = bVar.f25829c;
            if (iOException == null) {
                throw e4;
            }
            throw iOException;
        }
    }

    @Override // c83.d
    public final void cancel() {
        Call call;
        this.f25821f = true;
        synchronized (this) {
            call = this.f25822g;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // c83.d
    /* JADX INFO: renamed from: clone */
    public final d m7clone() {
        return new r(this.f25816a, this.f25817b, this.f25818c, this.f25819d, this.f25820e);
    }

    @Override // c83.d
    public final a0<T> execute() {
        Call callB;
        synchronized (this) {
            if (this.f25824i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f25824i = true;
            callB = b();
        }
        if (this.f25821f) {
            callB.cancel();
        }
        return c(callB.execute());
    }

    @Override // c83.d
    public final boolean isCanceled() {
        boolean z14 = true;
        if (this.f25821f) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f25822g;
                if (call == null || !call.getCanceled()) {
                    z14 = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    @Override // c83.d
    public final void q0(f<T> fVar) {
        Call call;
        Throwable th3;
        synchronized (this) {
            try {
                if (this.f25824i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f25824i = true;
                call = this.f25822g;
                th3 = this.f25823h;
                if (call == null && th3 == null) {
                    try {
                        Call callA = a();
                        this.f25822g = callA;
                        call = callA;
                    } catch (Throwable th4) {
                        th3 = th4;
                        f0.m(th3);
                        this.f25823h = th3;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        if (th3 != null) {
            fVar.a(this, th3);
            return;
        }
        if (this.f25821f) {
            call.cancel();
        }
        call.enqueue(new a(fVar));
    }

    @Override // c83.d
    public final synchronized Request request() {
        try {
        } catch (IOException e4) {
            throw new RuntimeException("Unable to create request.", e4);
        }
        return b().request();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m8clone() {
        return new r(this.f25816a, this.f25817b, this.f25818c, this.f25819d, this.f25820e);
    }
}

package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public class j7h extends q92<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call.Factory f22490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CacheControl f22491b;
    public Executor c;

    public class a extends ea2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Call f22492a;

        /* JADX INFO: renamed from: j7h$a$a, reason: collision with other inner class name */
        public class RunnableC0980a implements Runnable {
            public RunnableC0980a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f22492a.cancel();
            }
        }

        public a(Call call) {
            this.f22492a = call;
        }

        @Override // defpackage.fbi
        public void b() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f22492a.cancel();
            } else {
                j7h.this.c.execute(new RunnableC0980a());
            }
        }
    }

    public class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f22495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ekg.a f22496b;

        public b(c cVar, ekg.a aVar) {
            this.f22495a = cVar;
            this.f22496b = aVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            j7h.this.l(call, iOException, this.f22496b);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            this.f22495a.g = SystemClock.elapsedRealtime();
            ResponseBody responseBodyBody = response.body();
            try {
                try {
                    if (!response.isSuccessful()) {
                        j7h.this.l(call, new IOException("Unexpected HTTP code " + response), this.f22496b);
                        return;
                    }
                    c83 c83VarC = c83.c(response.header("Content-Range"));
                    if (c83VarC != null && (c83VarC.f5037a != 0 || c83VarC.f5038b != Integer.MAX_VALUE)) {
                        this.f22495a.k(c83VarC);
                        this.f22495a.j(8);
                    }
                    long contentLength = responseBodyBody.getContentLength();
                    if (contentLength < 0) {
                        contentLength = 0;
                    }
                    this.f22496b.b(responseBodyBody.byteStream(), (int) contentLength);
                } catch (Exception e) {
                    j7h.this.l(call, e, this.f22496b);
                }
            } finally {
                responseBodyBody.close();
            }
        }
    }

    public static class c extends yk9 {
        public long f;
        public long g;
        public long h;

        public c(cg4<o98> cg4Var, ebi ebiVar) {
            super(cg4Var, ebiVar);
        }
    }

    public j7h(Call.Factory factory, Executor executor) {
        this(factory, executor, true);
    }

    @Override // defpackage.ekg
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public c b(cg4<o98> cg4Var, ebi ebiVar) {
        return new c(cg4Var, ebiVar);
    }

    @Override // defpackage.ekg
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void e(c cVar, ekg.a aVar) {
        cVar.f = SystemClock.elapsedRealtime();
        try {
            Request.Builder builder = new Request.Builder().url(cVar.h().toString()).get();
            CacheControl cacheControl = this.f22491b;
            if (cacheControl != null) {
                builder.cacheControl(cacheControl);
            }
            c83 c83VarB = cVar.b().b().b();
            if (c83VarB != null) {
                builder.addHeader("Range", c83VarB.d());
            }
            j(cVar, aVar, builder.build());
        } catch (Exception e) {
            aVar.onFailure(e);
        }
    }

    public void j(c cVar, ekg.a aVar, Request request) {
        Call callNewCall = this.f22490a.newCall(request);
        cVar.b().c(new a(callNewCall));
        callNewCall.enqueue(new b(cVar, aVar));
    }

    @Override // defpackage.q92, defpackage.ekg
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map<String, String> c(c cVar, int i) {
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(cVar.g - cVar.f));
        map.put("fetch_time", Long.toString(cVar.h - cVar.g));
        map.put("total_time", Long.toString(cVar.h - cVar.f));
        map.put("image_size", Integer.toString(i));
        return map;
    }

    public final void l(Call call, Exception exc, ekg.a aVar) {
        if (call.getCanceled()) {
            aVar.a();
        } else {
            aVar.onFailure(exc);
        }
    }

    @Override // defpackage.q92, defpackage.ekg
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, int i) {
        cVar.h = SystemClock.elapsedRealtime();
    }

    public j7h(OkHttpClient okHttpClient) {
        this(okHttpClient, okHttpClient.dispatcher().executorService());
    }

    public j7h(Call.Factory factory, Executor executor, boolean z) {
        this.f22490a = factory;
        this.c = executor;
        this.f22491b = z ? new CacheControl.Builder().noStore().build() : null;
    }
}

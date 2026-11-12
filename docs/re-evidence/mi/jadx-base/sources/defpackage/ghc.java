package defpackage;

import android.net.Uri;
import com.xiaomi.accountsdk.request.SimpleRequest;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public class ghc extends q92<yk9> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f18996b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ yk9 f18997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ekg.a f18998b;

        public a(yk9 yk9Var, ekg.a aVar) {
            this.f18997a = yk9Var;
            this.f18998b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            ghc.this.h(this.f18997a, this.f18998b);
        }
    }

    public class b extends ea2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Future f18999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ekg.a f19000b;

        public b(Future future, ekg.a aVar) {
            this.f18999a = future;
            this.f19000b = aVar;
        }

        @Override // defpackage.fbi
        public void b() {
            if (this.f18999a.cancel(false)) {
                this.f19000b.a();
            }
        }
    }

    public ghc(int i) {
        this(Executors.newFixedThreadPool(3));
        this.f18995a = i;
    }

    public static String g(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    public static boolean i(int i) {
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public static boolean j(int i) {
        return i >= 200 && i < 300;
    }

    public static HttpURLConnection k(Uri uri) throws IOException {
        return (HttpURLConnection) idq.m(uri).openConnection();
    }

    @Override // defpackage.ekg
    public yk9 b(cg4<o98> cg4Var, ebi ebiVar) {
        return new yk9(cg4Var, ebiVar);
    }

    @Override // defpackage.ekg
    public void e(yk9 yk9Var, ekg.a aVar) {
        yk9Var.b().c(new b(this.f18996b.submit(new a(yk9Var, aVar)), aVar));
    }

    public final HttpURLConnection f(Uri uri, int i) throws IOException {
        HttpURLConnection httpURLConnectionK = k(uri);
        httpURLConnectionK.setConnectTimeout(this.f18995a);
        int responseCode = httpURLConnectionK.getResponseCode();
        if (j(responseCode)) {
            return httpURLConnectionK;
        }
        if (!i(responseCode)) {
            httpURLConnectionK.disconnect();
            throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
        }
        String headerField = httpURLConnectionK.getHeaderField(SimpleRequest.LOCATION);
        httpURLConnectionK.disconnect();
        Uri uri2 = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i <= 0 || uri2 == null || uri2.getScheme().equals(scheme)) {
            throw new IOException(i == 0 ? g("URL %s follows too many redirects", uri.toString()) : g("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        }
        return f(uri2, i - 1);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x003c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[SYNTHETIC] */
    public void h(yk9 yk9Var, ekg.a aVar) throws Throwable {
        HttpURLConnection httpURLConnectionF;
        InputStream inputStream = null;
        try {
            httpURLConnectionF = f(yk9Var.h(), 5);
            if (httpURLConnectionF != null) {
                try {
                    try {
                        inputStream = httpURLConnectionF.getInputStream();
                        aVar.b(inputStream, -1);
                    } catch (IOException e) {
                        e = e;
                        aVar.onFailure(e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (httpURLConnectionF == null) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnectionF != null) {
                        throw th;
                    }
                    httpURLConnectionF.disconnect();
                    throw th;
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            if (httpURLConnectionF == null) {
                return;
            }
        } catch (IOException e2) {
            e = e2;
            httpURLConnectionF = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnectionF = null;
            if (inputStream != null) {
                inputStream.close();
            }
            if (httpURLConnectionF != null) {
                throw th;
            }
            httpURLConnectionF.disconnect();
            throw th;
        }
        httpURLConnectionF.disconnect();
    }

    public ghc(ExecutorService executorService) {
        this.f18996b = executorService;
    }
}

package defpackage;

import com.braintreepayments.api.HttpResponseParser;
import com.braintreepayments.api.NetworkResponseCallback;
import com.braintreepayments.api.Scheduler;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes21.dex */
public class tp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<URL, Integer> f49472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ut f49473c;
    private final Scheduler d;

    protected tp(SSLSocketFactory sSLSocketFactory, HttpResponseParser httpResponseParser) {
        this(new ut(sSLSocketFactory, httpResponseParser), new uv());
    }

    tp(ut utVar, Scheduler scheduler) {
        this.f49473c = utVar;
        this.d = scheduler;
        this.f49472b = new HashMap();
    }

    String c(tr trVar) throws Exception {
        return this.f49473c.d(trVar).getE();
    }

    void a(tr trVar, NetworkResponseCallback networkResponseCallback) {
        b(trVar, 0, networkResponseCallback);
    }

    void b(tr trVar, int i, NetworkResponseCallback networkResponseCallback) {
        c(trVar, i, networkResponseCallback);
    }

    private void c(final tr trVar, final int i, final NetworkResponseCallback networkResponseCallback) {
        b(trVar);
        this.d.runOnBackground(new Runnable() { // from class: tp.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    tp.this.e(networkResponseCallback, tp.this.f49473c.d(trVar));
                } catch (Exception e) {
                    int i2 = i;
                    if (i2 == 0) {
                        tp.this.c(networkResponseCallback, e);
                    } else {
                        if (i2 != 1) {
                            return;
                        }
                        tp.this.e(trVar, i2, networkResponseCallback);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(tr trVar, int i, NetworkResponseCallback networkResponseCallback) {
        URL urlG;
        try {
            urlG = trVar.g();
        } catch (MalformedURLException | URISyntaxException unused) {
            urlG = null;
        }
        if (urlG != null) {
            int iA = a(urlG) + 1;
            if (iA < 3) {
                c(trVar, i, networkResponseCallback);
                this.f49472b.put(urlG, Integer.valueOf(iA));
            } else {
                c(networkResponseCallback, new tq("Retry limit has been exceeded. Try again later."));
            }
        }
    }

    private int a(URL url) {
        Integer num = this.f49472b.get(url);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private void b(tr trVar) {
        URL urlG;
        try {
            urlG = trVar.g();
        } catch (MalformedURLException | URISyntaxException unused) {
            urlG = null;
        }
        if (urlG != null) {
            this.f49472b.remove(urlG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final NetworkResponseCallback networkResponseCallback, final tv tvVar) {
        if (networkResponseCallback != null) {
            this.d.runOnMain(new Runnable() { // from class: tp.2
                @Override // java.lang.Runnable
                public void run() {
                    networkResponseCallback.onResult(tvVar, null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final NetworkResponseCallback networkResponseCallback, final Exception exc) {
        if (networkResponseCallback != null) {
            this.d.runOnMain(new Runnable() { // from class: tp.4
                @Override // java.lang.Runnable
                public void run() {
                    networkResponseCallback.onResult(null, exc);
                }
            });
        }
    }
}

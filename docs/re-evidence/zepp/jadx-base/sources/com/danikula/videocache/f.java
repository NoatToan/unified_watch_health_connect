package com.danikula.videocache;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes2.dex */
class f {
    private static final Logger d = LoggerFactory.getLogger("Pinger");
    private static final String e = "ping";
    private static final String f = "ping ok";
    private final ExecutorService a = Executors.newSingleThreadExecutor();
    private final String b;
    private final int c;

    public class b implements Callable<Boolean> {
        private b() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            return Boolean.valueOf(f.this.f());
        }
    }

    public f(String str, int i) {
        this.b = (String) Preconditions.checkNotNull(str);
        this.c = i;
    }

    private List<Proxy> b() {
        try {
            return ProxySelector.getDefault().select(new URI(c()));
        } catch (URISyntaxException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private String c() {
        return String.format(Locale.US, "http://%s:%d/%s", this.b, Integer.valueOf(this.c), e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() throws ProxyCacheException {
        HttpUrlSource httpUrlSource = new HttpUrlSource(c());
        try {
            byte[] bytes = f.getBytes();
            httpUrlSource.open(0L);
            byte[] bArr = new byte[bytes.length];
            httpUrlSource.read(bArr);
            boolean zEquals = Arrays.equals(bytes, bArr);
            d.info("Ping response: `" + new String(bArr) + "`, pinged? " + zEquals);
            return zEquals;
        } catch (ProxyCacheException e2) {
            d.error("Error reading ping response", (Throwable) e2);
            return false;
        } finally {
            httpUrlSource.close();
        }
    }

    public boolean d(String str) {
        return e.equals(str);
    }

    public boolean e(int i, int i2) {
        Preconditions.a(i >= 1);
        Preconditions.a(i2 > 0);
        int i3 = 0;
        while (i3 < i) {
            try {
                if (((Boolean) this.a.submit(new b()).get(i2, TimeUnit.MILLISECONDS)).booleanValue()) {
                    return true;
                }
                i3++;
                i2 *= 2;
            } catch (InterruptedException e2) {
                e = e2;
                d.error("Error pinging server due to unexpected error", e);
            } catch (ExecutionException e3) {
                e = e3;
                d.error("Error pinging server due to unexpected error", e);
            } catch (TimeoutException unused) {
                d.warn("Error pinging server (attempt: " + i3 + ", timeout: " + i2 + "). ");
            }
        }
        String str = String.format(Locale.US, "Error pinging server (attempts: %d, max timeout: %d). If you see this message, please, report at https://github.com/danikula/AndroidVideoCache/issues/134. Default proxies are: %s", Integer.valueOf(i3), Integer.valueOf(i2 / 2), b());
        d.error(str, (Throwable) new ProxyCacheException(str));
        return false;
    }

    public void g(Socket socket) throws IOException {
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write(f.getBytes());
    }
}

package com.xmlywind.sdk.b;

import com.xmlywind.logger.SigmobLog;
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

/* JADX INFO: loaded from: classes22.dex */
class k {
    private final ExecutorService a = Executors.newSingleThreadExecutor();
    private final String b;
    private final int c;

    public class a implements Callable<Boolean> {
        private a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(k.this.b());
        }
    }

    public k(String str, int i) {
        this.b = (String) l.a(str);
        this.c = i;
    }

    private List<Proxy> a() {
        try {
            return ProxySelector.getDefault().select(new URI(c()));
        } catch (URISyntaxException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        boolean zEquals;
        h hVar = new h(c());
        try {
            try {
                byte[] bytes = "ping ok".getBytes();
                hVar.a(0L);
                byte[] bArr = new byte[bytes.length];
                hVar.a(bArr);
                zEquals = Arrays.equals(bytes, bArr);
                SigmobLog.i("Ping response: `" + new String(bArr) + "`, pinged? " + zEquals);
            } catch (n e) {
                SigmobLog.e("Error reading ping response", e);
                zEquals = false;
            }
            return zEquals;
        } finally {
            hVar.b();
        }
    }

    private String c() {
        return String.format(Locale.US, "http://%s:%d/%s", this.b, Integer.valueOf(this.c), "ping");
    }

    public void a(Socket socket) throws IOException {
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write("ping ok".getBytes());
    }

    public boolean a(int i, int i2) {
        l.a(i >= 1);
        l.a(i2 > 0);
        int i3 = 0;
        while (i3 < i) {
            try {
                if (((Boolean) this.a.submit(new a()).get(i2, TimeUnit.MILLISECONDS)).booleanValue()) {
                    return true;
                }
                i2 *= 2;
                i3++;
            } catch (InterruptedException e) {
                e = e;
                SigmobLog.w("Error pinging server due to unexpected error", e);
            } catch (ExecutionException e2) {
                e = e2;
                SigmobLog.w("Error pinging server due to unexpected error", e);
            } catch (TimeoutException unused) {
                SigmobLog.w("Error pinging server (attempt: " + i3 + ", timeout: " + i2 + "). ");
            }
        }
        String str = String.format(Locale.US, "Error pinging server (attempts: %d, max timeout: %d). If you see this message, please, report at https://github.com/danikula/AndroidVideoCache/issues/134. Default proxies are: %s", Integer.valueOf(i3), Integer.valueOf(i2 / 2), a());
        SigmobLog.e(str, new n(str));
        return false;
    }

    public boolean a(String str) {
        return "ping".equals(str);
    }
}

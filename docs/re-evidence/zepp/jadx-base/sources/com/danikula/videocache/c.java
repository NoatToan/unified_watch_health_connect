package com.danikula.videocache;

import android.text.TextUtils;
import com.danikula.videocache.file.FileCache;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
class c extends g {
    private static final float n = 0.2f;
    private final HttpUrlSource k;
    private final FileCache l;
    private CacheListener m;

    public c(HttpUrlSource httpUrlSource, FileCache fileCache) {
        super(httpUrlSource, fileCache);
        this.l = fileCache;
        this.k = httpUrlSource;
    }

    private String p(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    private boolean q(b bVar) throws ProxyCacheException {
        long length = this.k.length();
        return (((length > 0L ? 1 : (length == 0L ? 0 : -1)) > 0) && bVar.c && ((float) bVar.b) > ((float) this.l.available()) + (((float) length) * 0.2f)) ? false : true;
    }

    private String r(b bVar) throws IOException, ProxyCacheException {
        String mime = this.k.getMime();
        boolean z = !TextUtils.isEmpty(mime);
        long jAvailable = this.l.isCompleted() ? this.l.available() : this.k.length();
        boolean z2 = jAvailable >= 0;
        boolean z3 = bVar.c;
        long j = z3 ? jAvailable - bVar.b : jAvailable;
        boolean z4 = z2 && z3;
        StringBuilder sb = new StringBuilder();
        sb.append(bVar.c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb.append("Accept-Ranges: bytes\n");
        sb.append(z2 ? p("Content-Length: %d\n", Long.valueOf(j)) : "");
        sb.append(z4 ? p("Content-Range: bytes %d-%d/%d\n", Long.valueOf(bVar.b), Long.valueOf(jAvailable - 1), Long.valueOf(jAvailable)) : "");
        sb.append(z ? p("Content-Type: %s\n", mime) : "");
        sb.append("\n");
        return sb.toString();
    }

    private void u(OutputStream outputStream, long j) throws IOException, ProxyCacheException {
        byte[] bArr = new byte[8192];
        while (true) {
            int iJ = j(bArr, j, 8192);
            if (iJ == -1) {
                outputStream.flush();
                return;
            } else {
                outputStream.write(bArr, 0, iJ);
                j += (long) iJ;
            }
        }
    }

    private void v(OutputStream outputStream, long j) throws IOException, ProxyCacheException {
        HttpUrlSource httpUrlSource = new HttpUrlSource(this.k);
        try {
            httpUrlSource.open((int) j);
            byte[] bArr = new byte[8192];
            while (true) {
                int i = httpUrlSource.read(bArr);
                if (i == -1) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, i);
            }
        } finally {
            httpUrlSource.close();
        }
    }

    @Override // com.danikula.videocache.g
    public void g(int i) {
        CacheListener cacheListener = this.m;
        if (cacheListener != null) {
            cacheListener.onCacheAvailable(this.l.file, this.k.getUrl(), i);
        }
    }

    public void s(b bVar, Socket socket) throws IOException, ProxyCacheException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(r(bVar).getBytes("UTF-8"));
        long j = bVar.b;
        if (q(bVar)) {
            u(bufferedOutputStream, j);
        } else {
            v(bufferedOutputStream, j);
        }
    }

    public void t(CacheListener cacheListener) {
        this.m = cacheListener;
    }
}

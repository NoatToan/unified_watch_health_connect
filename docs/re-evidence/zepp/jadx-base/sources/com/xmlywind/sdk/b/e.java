package com.xmlywind.sdk.b;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
class e extends m {
    private final h a;
    private final com.xmlywind.sdk.b.a.b b;
    private b c;

    public e(h hVar, com.xmlywind.sdk.b.a.b bVar) {
        super(hVar, bVar);
        this.b = bVar;
        this.a = hVar;
    }

    private String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    private void a(OutputStream outputStream, long j) throws n, IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int iA = a(bArr, j, 8192);
            if (iA == -1) {
                outputStream.flush();
                return;
            } else {
                outputStream.write(bArr, 0, iA);
                j += (long) iA;
            }
        }
    }

    private boolean a(d dVar) {
        long jA = this.a.a();
        return (((jA > 0L ? 1 : (jA == 0L ? 0 : -1)) > 0) && dVar.c && ((float) dVar.b) > ((float) this.b.a()) + (((float) jA) * 0.2f)) ? false : true;
    }

    private String b(d dVar) {
        String strC = this.a.c();
        boolean z = !TextUtils.isEmpty(strC);
        long jA = this.b.d() ? this.b.a() : this.a.a();
        boolean z2 = jA >= 0;
        boolean z3 = dVar.c;
        long j = z3 ? jA - dVar.b : jA;
        boolean z4 = z2 && z3;
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb.append("Accept-Ranges: bytes\n");
        sb.append(z2 ? a("Content-Length: %d\n", Long.valueOf(j)) : "");
        sb.append(z4 ? a("Content-Range: bytes %d-%d/%d\n", Long.valueOf(dVar.b), Long.valueOf(jA - 1), Long.valueOf(jA)) : "");
        sb.append(z ? a("Content-Type: %s\n", strC) : "");
        sb.append("\n");
        return sb.toString();
    }

    private void b(OutputStream outputStream, long j) {
        h hVar = new h(this.a);
        try {
            hVar.a((int) j);
            byte[] bArr = new byte[8192];
            while (true) {
                int iA = hVar.a(bArr);
                if (iA == -1) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, iA);
            }
        } finally {
            hVar.b();
        }
    }

    @Override // com.xmlywind.sdk.b.m
    public void a(int i) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(this.b.a, this.a.d(), i);
        }
    }

    public void a(b bVar) {
        this.c = bVar;
    }

    public void a(d dVar, Socket socket) throws n, IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(b(dVar).getBytes("UTF-8"));
        long j = dVar.b;
        if (a(dVar)) {
            a(bufferedOutputStream, j);
        } else {
            b(bufferedOutputStream, j);
        }
    }
}

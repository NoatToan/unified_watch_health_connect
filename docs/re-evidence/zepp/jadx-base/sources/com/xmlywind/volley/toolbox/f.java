package com.xmlywind.volley.toolbox;

import android.text.TextUtils;
import com.loopj.android.http.AsyncHttpClient;
import com.xiaomi.infra.galaxy.fds.Common;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.volley.p;
import com.xmlywind.volley.s;
import com.xmlywind.volley.t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes22.dex */
public class f extends com.xmlywind.volley.l<d> {
    private File b;
    private File c;
    private d d;
    private long e;
    private final Object f;
    private a g;

    public interface a {
        void a(d dVar);

        void a(d dVar, long j, long j2);

        void b(d dVar);

        void c(d dVar);
    }

    public f(d dVar, a aVar) {
        super(0, dVar.a, null);
        this.e = 0L;
        this.f = new Object();
        this.g = null;
        File file = new File(dVar.c);
        this.b = file;
        if (file.getParentFile() != null && !this.b.getParentFile().exists()) {
            this.b.getParentFile().mkdirs();
        }
        if (this.b.exists()) {
            this.b.delete();
        }
        this.d = dVar;
        File file2 = new File(dVar.c + ".tmp");
        this.c = file2;
        if (!dVar.h) {
            file2.delete();
        }
        this.g = aVar;
        a((p) new com.xmlywind.volley.c(10000, 2, 0.0f));
        a(false);
        t.b("FileDownloadRequest()  [ %s ], url = [%s]", dVar.c, dVar.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [long] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // com.xmlywind.volley.l
    public com.xmlywind.volley.n<d> a(com.xmlywind.volley.i iVar) throws Throwable {
        s sVar;
        boolean zContainsKey;
        ?? length;
        ?? r1;
        Throwable th;
        ?? r0;
        IOException e;
        GZIPInputStream gZIPInputStream;
        FileOutputStream fileOutputStream;
        this.d.f = iVar.f;
        if (!k()) {
            Map<String, String> mapA = e.a(iVar.d);
            if (mapA.containsKey("Transfer-Encoding")) {
                String str = "chunked";
                if (mapA.get("Transfer-Encoding").equalsIgnoreCase("chunked")) {
                    length = this.c.length();
                    r1 = str;
                } else {
                    zContainsKey = mapA.containsKey(Common.CONTENT_LENGTH);
                    if (zContainsKey) {
                        length = Long.parseLong(mapA.get(Common.CONTENT_LENGTH)) + this.e;
                        r1 = zContainsKey;
                    } else {
                        length = 0;
                        r1 = zContainsKey;
                    }
                }
            } else {
                zContainsKey = mapA.containsKey(Common.CONTENT_LENGTH);
                if (zContainsKey) {
                    length = Long.parseLong(mapA.get(Common.CONTENT_LENGTH)) + this.e;
                    r1 = zContainsKey;
                } else {
                    length = 0;
                    r1 = zContainsKey;
                }
            }
            this.d.e = length;
            ?? r5 = 0;
            if (!this.c.canRead() || this.c.length() <= 0 || (this.c.length() != length && length != 0)) {
                if (!this.b.canRead() || this.b.length() != length) {
                    sVar = new s("Download temporary file was invalid!" + this.c.getAbsolutePath());
                }
                return com.xmlywind.volley.n.a(this.d, null);
            }
            if (!h.b(mapA)) {
                if (!this.c.renameTo(this.b)) {
                    sVar = new s("Can't rename the download temporary file!");
                }
                return com.xmlywind.volley.n.a(this.d, null);
            }
            boolean z = false;
            try {
                try {
                    gZIPInputStream = new GZIPInputStream(new FileInputStream(this.c));
                    try {
                        fileOutputStream = new FileOutputStream(this.b);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = gZIPInputStream.read(bArr, 0, 4096);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i);
                            }
                            try {
                                gZIPInputStream.close();
                            } catch (IOException e2) {
                                t.c(e2.getMessage(), new Object[0]);
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                t.c(e3.getMessage(), new Object[0]);
                            }
                            z = true;
                        } catch (IOException e4) {
                            e = e4;
                            t.c(e.getMessage(), new Object[0]);
                            if (gZIPInputStream != null) {
                                try {
                                    gZIPInputStream.close();
                                } catch (IOException e5) {
                                    t.c(e5.getMessage(), new Object[0]);
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e6) {
                                    t.c(e6.getMessage(), new Object[0]);
                                }
                            }
                        }
                    } catch (IOException e7) {
                        e = e7;
                        fileOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        r5 = gZIPInputStream;
                        r0 = 0;
                        if (r5 != 0) {
                            try {
                                r5.close();
                            } catch (IOException e8) {
                                t.c(e8.getMessage(), new Object[0]);
                            }
                        }
                        if (r0 == 0) {
                            throw th;
                        }
                        try {
                            r0.close();
                            throw th;
                        } catch (IOException e9) {
                            t.c(e9.getMessage(), new Object[0]);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    r5 = length;
                    r0 = r1;
                    th = th3;
                }
            } catch (IOException e10) {
                e = e10;
                gZIPInputStream = null;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                r0 = 0;
            }
            this.c.delete();
            if (!z) {
                sVar = new s("error gzip unzip the download temporary file!");
            }
            return com.xmlywind.volley.n.a(this.d, null);
        }
        sVar = new s("Request was Canceled!");
        return com.xmlywind.volley.n.a(sVar);
    }

    @Override // com.xmlywind.volley.l
    public void a(s sVar) {
        this.d.g = 0;
        if (this.b.exists()) {
            this.b.delete();
        }
        if (this.c.exists()) {
            this.c.delete();
        }
        d dVar = this.d;
        dVar.i = sVar;
        this.g.c(dVar);
    }

    @Override // com.xmlywind.volley.l
    public void a(d dVar) {
        this.d.g = 1;
        this.g.a(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00fa A[Catch: all -> 0x01e2, TRY_ENTER, TryCatch #1 {all -> 0x01e2, blocks: (B:30:0x00fa, B:32:0x0102, B:31:0x00ff), top: B:81:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ff A[Catch: all -> 0x01e2, TryCatch #1 {all -> 0x01e2, blocks: (B:30:0x00fa, B:32:0x0102, B:31:0x00ff), top: B:81:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0116 A[Catch: all -> 0x01de, TRY_ENTER, TryCatch #8 {all -> 0x01de, blocks: (B:34:0x0108, B:35:0x010a, B:38:0x0116, B:40:0x011c, B:41:0x0138), top: B:95:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0138 A[Catch: all -> 0x01de, TRY_LEAVE, TryCatch #8 {all -> 0x01de, blocks: (B:34:0x0108, B:35:0x010a, B:38:0x0116, B:40:0x011c, B:41:0x0138), top: B:95:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0178  */
    /* JADX WARN: Code duplicated, block: B:87:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a7 A[EDGE_INSN: B:97:0x01a7->B:54:0x01a7 BREAK  A[LOOP:0: B:35:0x010a->B:53:0x017e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x011c A[SYNTHETIC] */
    public byte[] a(i iVar) throws IOException {
        long length;
        RandomAccessFile randomAccessFile;
        InputStream inputStreamD;
        RandomAccessFile randomAccessFile2;
        RandomAccessFile randomAccessFile3;
        byte[] bArr;
        int i;
        a aVar;
        String str;
        String str2;
        String str3;
        f fVar = this;
        Map<String, String> mapA = e.a(iVar.b());
        boolean zA = h.a(mapA);
        long jC = iVar.c();
        int i2 = -1;
        long j = 0;
        int i3 = 0;
        try {
            try {
                try {
                    try {
                        if (!mapA.containsKey("Transfer-Encoding") || !mapA.get("Transfer-Encoding").equalsIgnoreCase("chunked")) {
                            if (jC < 0 || !mapA.containsKey("Content-Length")) {
                                length = fVar.c.length();
                            } else {
                                if (jC == 0 && fVar.b.exists() && fVar.b.length() == jC) {
                                    fVar.b.renameTo(fVar.c);
                                    iVar.d().close();
                                    return new byte[0];
                                }
                                if (zA) {
                                    length = fVar.c.length();
                                    jC += length;
                                    String strB = h.b(mapA, "Content-Range");
                                    t.b("Content-Range %s", strB);
                                    if (!TextUtils.isEmpty(strB)) {
                                        String str4 = Constants.CONTENT_RANGE_PARAMS + length + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + (jC - 1);
                                        if (TextUtils.indexOf(strB, str4) == -1) {
                                            iVar.d().close();
                                            fVar.c.delete();
                                            throw new IllegalStateException("The Content-Range Header is invalid Assume[" + str4 + "] vs Real[" + strB + "], has remove the temporary file [" + fVar.c + "].");
                                        }
                                    }
                                }
                            }
                            randomAccessFile = null;
                            randomAccessFile2 = new RandomAccessFile(fVar.c, "rw");
                            if (zA) {
                                randomAccessFile2.seek(length);
                                j = length;
                            } else {
                                randomAccessFile2.setLength(0L);
                            }
                            inputStreamD = iVar.d();
                            bArr = new byte[8192];
                            while (true) {
                                i = inputStreamD.read(bArr);
                                if (i == i2) {
                                    break;
                                }
                                if (k()) {
                                    t.a(fVar.d.a + " download  is cancel", new Object[i3]);
                                    break;
                                }
                                randomAccessFile2.write(bArr, i3, i);
                                j += (long) i;
                                aVar = fVar.g;
                                if (aVar != null) {
                                    try {
                                        d dVar = fVar.d;
                                        str = "recv: ";
                                        str2 = " total: ";
                                        randomAccessFile3 = randomAccessFile2;
                                        str3 = " offset ";
                                        try {
                                            aVar.a(dVar, jC, j);
                                        } catch (Throwable th) {
                                            th = th;
                                            t.c("callback downloadProgress  error " + th.getMessage(), new Object[0]);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str = "recv: ";
                                        str2 = " total: ";
                                        randomAccessFile3 = randomAccessFile2;
                                        str3 = " offset ";
                                    }
                                } else {
                                    str = "recv: ";
                                    str2 = " total: ";
                                    randomAccessFile3 = randomAccessFile2;
                                    str3 = " offset ";
                                }
                                try {
                                    t.b(str + j + str2 + jC + str3 + i, new Object[0]);
                                    fVar = this;
                                    randomAccessFile2 = randomAccessFile3;
                                    i2 = -1;
                                    i3 = 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                th = th3;
                                randomAccessFile = randomAccessFile3;
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    if (inputStreamD != null) {
                                        try {
                                            inputStreamD.close();
                                        } catch (Throwable unused) {
                                            t.a("Error occured when calling consumingContent", new Object[0]);
                                        }
                                    }
                                    if (randomAccessFile == null) {
                                        throw th4;
                                    }
                                    randomAccessFile.close();
                                    throw th4;
                                }
                            }
                            randomAccessFile3 = randomAccessFile2;
                            t.b("recv: " + j + " total: " + jC + " offset " + i, new Object[0]);
                            inputStreamD.close();
                            randomAccessFile3.close();
                            return new byte[0];
                        }
                        t.b("Response doesn't present Content-Length!", new Object[0]);
                        inputStreamD.close();
                    } catch (Throwable unused2) {
                        t.a("Error occured when calling consumingContent", new Object[0]);
                    }
                    bArr = new byte[8192];
                    while (true) {
                        i = inputStreamD.read(bArr);
                        if (i == i2) {
                            break;
                            break;
                        }
                        if (k()) {
                            t.a(fVar.d.a + " download  is cancel", new Object[i3]);
                            break;
                        }
                        randomAccessFile2.write(bArr, i3, i);
                        j += (long) i;
                        aVar = fVar.g;
                        if (aVar != null) {
                            d dVar2 = fVar.d;
                            str = "recv: ";
                            str2 = " total: ";
                            randomAccessFile3 = randomAccessFile2;
                            str3 = " offset ";
                            aVar.a(dVar2, jC, j);
                        } else {
                            str = "recv: ";
                            str2 = " total: ";
                            randomAccessFile3 = randomAccessFile2;
                            str3 = " offset ";
                        }
                        t.b(str + j + str2 + jC + str3 + i, new Object[0]);
                        fVar = this;
                        randomAccessFile2 = randomAccessFile3;
                        i2 = -1;
                        i3 = 0;
                        th = th3;
                        randomAccessFile = randomAccessFile3;
                        throw th;
                    }
                    randomAccessFile3 = randomAccessFile2;
                    t.b("recv: " + j + " total: " + jC + " offset " + i, new Object[0]);
                    randomAccessFile3.close();
                    return new byte[0];
                } catch (Throwable th5) {
                    th = th5;
                    randomAccessFile3 = randomAccessFile2;
                }
                if (zA) {
                    randomAccessFile2.seek(length);
                    j = length;
                } else {
                    randomAccessFile2.setLength(0L);
                }
                inputStreamD = iVar.d();
            } catch (Throwable th6) {
                th = th6;
                randomAccessFile3 = randomAccessFile2;
                inputStreamD = null;
            }
            randomAccessFile2 = new RandomAccessFile(fVar.c, "rw");
        } catch (Throwable th7) {
            th = th7;
            inputStreamD = null;
        }
        length = 0;
        randomAccessFile = null;
    }

    @Override // com.xmlywind.volley.l
    public Map<String, String> c() {
        HashMap map = new HashMap();
        this.e = this.c.length();
        map.put("Connection", "Keep-Alive");
        map.put("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
        map.put("Range", Constants.RANGE_PARAMS + this.e + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        a("Range,bytes=" + this.e + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        return map;
    }

    @Override // com.xmlywind.volley.l
    public void j() {
        super.j();
        synchronized (this.f) {
            this.g = null;
        }
    }

    @Override // com.xmlywind.volley.l
    public com.xmlywind.volley.l.b o() {
        return com.xmlywind.volley.l.b.LOW;
    }
}

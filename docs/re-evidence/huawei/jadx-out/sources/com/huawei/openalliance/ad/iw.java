package com.huawei.openalliance.ad;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.huawei.hms.network.embedded.j2;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public class iw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f19281a = Pattern.compile("(\\d+)-(\\d+)/(\\d+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f19282b = Pattern.compile("(\\d+)/(\\d+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f19283c = Pattern.compile("(\\d+)");
    private final io d;
    private final jc e;
    private final ii f;
    private Map<String, Long> g;
    private ix h;
    private iy i;
    private im j;
    private long k = 157286400;
    private ip l;
    private Context m;

    private boolean a(int i) {
        return i != -1;
    }

    private boolean c(int i) {
        return (i == 200 || i == 206) ? false : true;
    }

    public void a(final Socket socket) {
        if (!a()) {
            jb jbVar = new jb();
            io ioVar = this.d;
            if (ioVar != null && !TextUtils.isEmpty(ioVar.a())) {
                jbVar.a("Range", this.d.a());
            }
            this.e.a(new jd(this.d.b(), jbVar, null), new jc.a() { // from class: com.huawei.openalliance.ad.iw.1
                @Override // com.huawei.openalliance.ad.jc.a
                public void a(Throwable th) {
                    hw.b("ProxyRequestProcessor", "request remote server failed:%s, info:%s", com.huawei.openalliance.ad.utils.ds.a(iw.this.d.b()), th.getClass().getSimpleName());
                    iw.this.b(socket);
                }

                @Override // com.huawei.openalliance.ad.jc.a
                public void a(je jeVar) {
                    hw.a("ProxyRequestProcessor", "request remote server success:%s,", com.huawei.openalliance.ad.utils.ds.a(iw.this.d.b()));
                    iw iwVar = iw.this;
                    iwVar.a(socket, jeVar, iwVar.d.c());
                }
            });
            return;
        }
        hw.b("ProxyRequestProcessor", "max limit, skip.");
        iy iyVar = this.i;
        if (iyVar != null) {
            iyVar.a(-2);
        }
        ip ipVar = this.l;
        if (ipVar != null) {
            ipVar.a();
        }
        b(socket);
    }

    public void a(iy iyVar) {
        this.i = iyVar;
    }

    public void a(ip ipVar) {
        this.l = ipVar;
    }

    private boolean b(int i) {
        int i2 = i / 100;
        return i2 == 4 || i2 == 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Socket socket) {
        try {
            hw.a("ProxyRequestProcessor", "close socket");
            if (!socket.isInputShutdown()) {
                socket.shutdownInput();
            }
            if (!socket.isOutputShutdown()) {
                socket.shutdownOutput();
            }
            socket.close();
        } catch (Throwable th) {
            hw.c("ProxyRequestProcessor", "close socket failed, %s", th.getClass().getSimpleName());
        }
    }

    private void b(final String str) {
        if (com.huawei.openalliance.ad.utils.dg.b(this.d.e())) {
            return;
        }
        this.h = new ix(this.m, this.d.e(), this.f, this.d.f());
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.iw.2
            @Override // java.lang.Runnable
            public void run() {
                boolean zA = iw.this.h.a(iw.this.d.b(), str);
                hw.b("ProxyRequestProcessor", "check file valid: %s", Boolean.valueOf(zA));
                if (zA || iw.this.i == null) {
                    return;
                }
                com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.iw.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        im.a().b(true);
                        iw.this.i.a(-3);
                    }
                });
            }
        });
    }

    private long b(je jeVar) {
        if (jeVar == null) {
            return 0L;
        }
        String strA = jeVar.a().a(j2.w);
        if (hw.a()) {
            hw.a("ProxyRequestProcessor", "lengthStr: %s", strA);
        }
        if (TextUtils.isEmpty(strA) || strA.length() < 3) {
            return 0L;
        }
        try {
            return Long.parseLong(strA.substring(1, strA.length() - 1));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private boolean a(int i, long j) {
        long j2 = i;
        if (j2 == j) {
            return true;
        }
        hw.a("ProxyRequestProcessor", "isCompleteLocalResource Range bytes: %d", this.d.d());
        Long lD = this.d.d();
        return lD != null && lD.longValue() + j2 == j;
    }

    private boolean a() {
        return this.j.a(this.d.b()) > this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Socket socket, je jeVar, String str) {
        BufferedOutputStream bufferedOutputStream;
        try {
            bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
            try {
                hw.a("ProxyRequestProcessor", "write header to client");
                bufferedOutputStream.write(a(jeVar).getBytes("UTF-8"));
                a(jeVar, bufferedOutputStream, str);
            } catch (Throwable th) {
                th = th;
                try {
                    hw.d("ProxyRequestProcessor", "write header failed: %s", th.getClass().getSimpleName());
                } finally {
                    b(socket);
                    com.huawei.openalliance.ad.utils.df.a(bufferedOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream = null;
        }
    }

    private void a(String str, int i) {
        if (this.g.get(this.d.b() + str) == null) {
            this.g.put(this.d.b() + str, Long.valueOf(System.currentTimeMillis() + 60000));
        }
        for (Map.Entry<String, Long> entry : this.g.entrySet()) {
            Long l = this.g.get(entry.getKey());
            if (l != null && l.longValue() < System.currentTimeMillis()) {
                this.g.remove(entry.getKey());
            }
        }
    }

    private void a(BufferedOutputStream bufferedOutputStream, byte[] bArr, int i) throws IOException {
        bufferedOutputStream.write(bArr, 0, i);
        bufferedOutputStream.flush();
    }

    private void a(je jeVar, BufferedOutputStream bufferedOutputStream, String str) {
        long jLongValue;
        long j;
        long j2;
        long jB;
        int iB = jeVar.b();
        OutputStream outputStream = null;
        try {
            if (!c(iB)) {
                iz izVarA = this.f.a(this.d.b(), str);
                if (izVarA == null) {
                    com.huawei.openalliance.ad.utils.df.a((Closeable) null);
                    return;
                }
                OutputStream outputStreamB = izVarA.b();
                try {
                    if (iB == 206) {
                        hw.a("ProxyRequestProcessor", "http status code = 200, request uri:" + this.d.b());
                        jB = a(jeVar.a().a("Content-Range"));
                        hw.a("ProxyRequestProcessor", "totalLength:" + jB);
                        jLongValue = this.d.d().longValue();
                    } else {
                        jLongValue = 0;
                        if (iB == 200) {
                            jB = b(jeVar);
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        hw.b("ProxyRequestProcessor", "totalLength: %s, cost: %s", Long.valueOf(j), Long.valueOf(im.a().a(this.d.b())));
                        a(jeVar, bufferedOutputStream, izVarA, outputStreamB, j, j2);
                        outputStream = outputStreamB;
                    }
                    j = jB;
                    j2 = jLongValue;
                    hw.b("ProxyRequestProcessor", "totalLength: %s, cost: %s", Long.valueOf(j), Long.valueOf(im.a().a(this.d.b())));
                    a(jeVar, bufferedOutputStream, izVarA, outputStreamB, j, j2);
                    outputStream = outputStreamB;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStreamB;
                    try {
                        hw.b("ProxyRequestProcessor", "write err: %s", th.getClass().getSimpleName());
                        return;
                    } finally {
                        com.huawei.openalliance.ad.utils.df.a(outputStream);
                    }
                }
            } else if (b(iB)) {
                a(str, iB);
            }
            com.huawei.openalliance.ad.utils.df.a(outputStream);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void a(je jeVar, BufferedOutputStream bufferedOutputStream, iz izVar, OutputStream outputStream, long j, long j2) throws Throwable {
        String str;
        String str2;
        IOException iOException;
        int i;
        int i2;
        String str3 = "write %d bytes to client";
        hw.a("ProxyRequestProcessor", "client cursor: %d", Long.valueOf(j2));
        if (a()) {
            hw.b("ProxyRequestProcessor", "data consume exceed limit, skip read content.");
            iy iyVar = this.i;
            if (iyVar != null) {
                iyVar.a(-2);
            }
            ip ipVar = this.l;
            if (ipVar != null) {
                ipVar.a();
                return;
            }
            return;
        }
        InputStream inputStreamA = jeVar.c().a();
        int iMin = (int) Math.min(j, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
        byte[] bArr = new byte[iMin];
        System.currentTimeMillis();
        int i3 = 0;
        try {
            IOException iOException2 = null;
            long j3 = j2;
            int i4 = inputStreamA.read(bArr, 0, iMin);
            IOException iOException3 = null;
            int i5 = 0;
            while (a(i4)) {
                try {
                    try {
                        try {
                            if (a()) {
                                break;
                            }
                            if (iOException2 == null) {
                                try {
                                    a(bufferedOutputStream, bArr, i4);
                                } catch (IOException e) {
                                    iOException = e;
                                }
                            }
                            iOException = iOException2;
                            if (iOException3 == null) {
                                int i6 = i4;
                                str2 = str3;
                                i2 = i3;
                                try {
                                    try {
                                        a(izVar, outputStream, j3, bArr, i6);
                                        i = i6;
                                        j3 += (long) i;
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } catch (IOException e2) {
                                    i = i6;
                                    iOException3 = e2;
                                }
                            } else {
                                i = i4;
                                str2 = str3;
                                i2 = i3;
                            }
                            i5 += i;
                            try {
                                this.j.a(this.d.b(), i);
                                i4 = inputStreamA.read(bArr, i2, iMin);
                                i3 = i2;
                                iOException2 = iOException;
                                str3 = str2;
                            } catch (IOException unused) {
                                i3 = i5;
                                str = str2;
                                try {
                                    hw.c("ProxyRequestProcessor", "write failed or client close connection, client socket closed");
                                    hw.a("ProxyRequestProcessor", str, Integer.valueOf(i3));
                                    com.huawei.openalliance.ad.utils.df.a((Closeable) inputStreamA);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (IOException unused2) {
                            str2 = str3;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str2 = str3;
                    }
                    i3 = i5;
                    str = str2;
                } catch (IOException unused3) {
                    str = str3;
                } catch (Throwable th4) {
                    th = th4;
                    str = str3;
                }
                hw.a("ProxyRequestProcessor", str, Integer.valueOf(i3));
                com.huawei.openalliance.ad.utils.df.a((Closeable) inputStreamA);
                throw th;
            }
            String str4 = str3;
            try {
                if (iOException3 != null) {
                    hw.d("ProxyRequestProcessor", "write cache stream failed, close cache stream");
                    a(izVar, j);
                } else if (200 == jeVar.b()) {
                    a(izVar, outputStream, j, i5);
                }
                hw.a("ProxyRequestProcessor", str4, Integer.valueOf(i5));
            } catch (IOException unused4) {
                str = str4;
                i3 = i5;
                hw.c("ProxyRequestProcessor", "write failed or client close connection, client socket closed");
                hw.a("ProxyRequestProcessor", str, Integer.valueOf(i3));
            } catch (Throwable th5) {
                th = th5;
                str = str4;
                i3 = i5;
                hw.a("ProxyRequestProcessor", str, Integer.valueOf(i3));
                com.huawei.openalliance.ad.utils.df.a((Closeable) inputStreamA);
                throw th;
            }
        } catch (IOException unused5) {
            str = "write %d bytes to client";
        } catch (Throwable th6) {
            th = th6;
            str = "write %d bytes to client";
            i3 = 0;
        }
        com.huawei.openalliance.ad.utils.df.a((Closeable) inputStreamA);
    }

    private void a(iz izVar, OutputStream outputStream, long j, byte[] bArr, int i) throws IOException {
        int iC;
        if (outputStream != null) {
            if (j < izVar.c()) {
                if (((long) i) + j > izVar.c()) {
                    iC = (int) (izVar.c() - j);
                    i -= iC;
                    hw.a("ProxyRequestProcessor", "start: %d, count: %d", Integer.valueOf(iC), Integer.valueOf(i));
                }
                outputStream.flush();
            }
            iC = 0;
            outputStream.write(bArr, iC, i);
            outputStream.flush();
        }
    }

    private void a(iz izVar, OutputStream outputStream, long j, int i) {
        if (outputStream == null || !a(i, j)) {
            return;
        }
        hw.a("ProxyRequestProcessor", "Get complete resource, %s", izVar.a());
        this.f.a(j, izVar);
        b(com.huawei.openalliance.ad.utils.ai.h(this.f.a(this.d.b(), izVar)));
    }

    private void a(iz izVar, long j) {
        this.f.a(izVar);
    }

    private void a(Context context) {
        this.j = im.a();
        long jQ = fp.b(context.getApplicationContext()).q();
        this.k = jQ;
        hw.b("ProxyRequestProcessor", "init, max data consume is: %s", Long.valueOf(jQ));
    }

    private String a(je jeVar) {
        String str = String.format(Locale.ENGLISH, "HTTP/1.1 %d %s", Integer.valueOf(jeVar.b()), jeVar.d());
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        jb jbVarA = jeVar.a();
        for (String str2 : jbVarA.a()) {
            sb.append(String.format(Locale.ENGLISH, "%s: %s%n", str2, jbVarA.a(str2)));
        }
        sb.append("\n");
        String string = sb.toString();
        hw.a("ProxyRequestProcessor", "headers: " + string);
        return string;
    }

    private long a(String str) {
        if (str != null && !str.isEmpty()) {
            Matcher matcher = f19281a.matcher(str);
            if (matcher.find()) {
                return Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1));
            }
            Matcher matcher2 = f19282b.matcher(str);
            if (matcher2.find()) {
                return Long.parseLong(matcher2.group(2));
            }
            Matcher matcher3 = f19283c.matcher(str);
            if (matcher3.find()) {
                return Long.parseLong(matcher3.group(1));
            }
        }
        return 0L;
    }

    public iw(Context context, io ioVar, jc jcVar, ii iiVar, Map<String, Long> map) {
        this.d = ioVar;
        this.e = jcVar;
        this.f = iiVar;
        this.g = map;
        Context applicationContext = context.getApplicationContext();
        this.m = applicationContext;
        a(applicationContext);
    }
}

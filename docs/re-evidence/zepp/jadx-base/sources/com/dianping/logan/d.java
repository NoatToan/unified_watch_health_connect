package com.dianping.logan;

import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
class d extends Thread {
    private static final String u = "LoganThread";
    private static final int v = 60000;
    private static final long w = 86400000;
    private static final int x = 1024;
    private long d;
    private boolean e;
    private File f;
    private boolean g;
    private long h;
    private com.dianping.logan.c i;
    private ConcurrentLinkedQueue<com.dianping.logan.b> j;
    private String k;
    private String l;
    private long m;
    private long n;
    private long o;
    private String p;
    private String q;
    private int r;
    private ExecutorService t;
    private final Object a = new Object();
    private final Object b = new Object();
    private volatile boolean c = true;
    private ConcurrentLinkedQueue<com.dianping.logan.b> s = new ConcurrentLinkedQueue<>();

    public class a implements OnLoganProtocolStatus {
        public a() {
        }

        @Override // com.dianping.logan.OnLoganProtocolStatus
        public void loganProtocolStatus(String str, int i) {
            Logan.a(str, i);
        }
    }

    public class b implements SendLogRunnable.a {
        public b() {
        }

        @Override // com.dianping.logan.SendLogRunnable.a
        public void a(int i) {
            synchronized (d.this.b) {
                d.this.r = i;
                if (i == 10002) {
                    d.this.j.addAll(d.this.s);
                    d.this.s.clear();
                    d.this.n();
                }
            }
        }
    }

    public class c implements ThreadFactory {
        public c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(Thread.currentThread().getThreadGroup(), runnable, "logan-thread-send-log", 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    public d(ConcurrentLinkedQueue<com.dianping.logan.b> concurrentLinkedQueue, String str, String str2, long j, long j2, long j3, String str3, String str4) {
        this.j = concurrentLinkedQueue;
        this.k = str;
        this.l = str2;
        this.m = j;
        this.n = j2;
        this.o = j3;
        this.p = str3;
        this.q = str4;
    }

    private void e(com.dianping.logan.b bVar) {
        if (bVar == null || !bVar.a()) {
            return;
        }
        if (this.i == null) {
            com.dianping.logan.c cVarA = com.dianping.logan.c.a();
            this.i = cVarA;
            cVarA.setOnLoganProtocolStatus(new a());
            this.i.logan_init(this.k, this.l, (int) this.n, this.p, this.q);
            this.i.logan_debug(Logan.c);
        }
        com.dianping.logan.b.a aVar = bVar.a;
        if (aVar == com.dianping.logan.b.a.WRITE) {
            j(bVar.b);
            return;
        }
        if (aVar != com.dianping.logan.b.a.SEND) {
            if (aVar == com.dianping.logan.b.a.FLUSH) {
                h();
            }
        } else if (bVar.c.d != null) {
            synchronized (this.b) {
                if (this.r == 10001) {
                    this.s.add(bVar);
                } else {
                    i(bVar.c);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.FileOutputStream] */
    private boolean f(String str, String str2) throws Throwable {
        int i;
        FileInputStream fileInputStream = null;
        fileInputStream = null;
        fileInputStream = null;
        fileInputStream = null;
        boolean z = false;
        try {
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File((String) str));
                    try {
                        str = new FileOutputStream(new File(str2));
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                i = fileInputStream2.read(bArr);
                                if (i < 0) {
                                    break;
                                }
                                str.write(bArr, 0, i);
                                str.flush();
                            }
                            z = true;
                            try {
                                fileInputStream2.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            str.close();
                            fileInputStream = i;
                            str = str;
                        } catch (FileNotFoundException e2) {
                            e = e2;
                            fileInputStream = fileInputStream2;
                            str = str;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                }
                            }
                            if (str != 0) {
                                str.close();
                                fileInputStream = fileInputStream;
                                str = str;
                            }
                            return z;
                        } catch (IOException e4) {
                            e = e4;
                            fileInputStream = fileInputStream2;
                            str = str;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                }
                            }
                            if (str != 0) {
                                str.close();
                                fileInputStream = fileInputStream;
                                str = str;
                            }
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e6) {
                                    e6.printStackTrace();
                                }
                            }
                            if (str == 0) {
                                throw th;
                            }
                            try {
                                str.close();
                                throw th;
                            } catch (Exception e7) {
                                e7.printStackTrace();
                                throw th;
                            }
                        }
                    } catch (FileNotFoundException e8) {
                        e = e8;
                        str = 0;
                    } catch (IOException e9) {
                        e = e9;
                        str = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        str = 0;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } catch (FileNotFoundException e11) {
                e = e11;
                str = 0;
            } catch (IOException e12) {
                e = e12;
                str = 0;
            } catch (Throwable th3) {
                th = th3;
                str = 0;
            }
            return z;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private void g(long j) {
        String[] list;
        File file = new File(this.l);
        if (!file.isDirectory() || (list = file.list()) == null) {
            return;
        }
        for (String str : list) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    String[] strArrSplit = str.split("\\.");
                    if (strArrSplit.length > 0 && Long.valueOf(strArrSplit[0]).longValue() <= j && strArrSplit.length == 1) {
                        new File(this.l, str).delete();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void h() {
        if (Logan.c) {
            Log.d(u, "Logan flush start");
        }
        com.dianping.logan.c cVar = this.i;
        if (cVar != null) {
            cVar.logan_flush();
        }
    }

    private void i(e eVar) {
        if (Logan.c) {
            Log.d(u, "Logan send start");
        }
        if (TextUtils.isEmpty(this.l) || eVar == null || !eVar.a()) {
            return;
        }
        if (!o(eVar)) {
            if (Logan.c) {
                Log.d(u, "Logan prepare log file failed, can't find log file");
            }
        } else {
            eVar.d.b(eVar);
            eVar.d.a(new b());
            this.r = 10001;
            if (this.t == null) {
                this.t = Executors.newSingleThreadExecutor(new c());
            }
            this.t.execute(eVar.d);
        }
    }

    private void j(f fVar) {
        if (Logan.c) {
            Log.d(u, "Logan write start");
        }
        if (this.f == null) {
            this.f = new File(this.l);
        }
        if (!l()) {
            long currentTime = Util.getCurrentTime();
            g(currentTime - this.m);
            this.d = currentTime;
            this.i.logan_open(String.valueOf(currentTime));
        }
        if (System.currentTimeMillis() - this.h > 60000) {
            this.g = k();
        }
        this.h = System.currentTimeMillis();
        if (this.g) {
            this.i.logan_write(fVar.f, fVar.a, fVar.e, fVar.d, fVar.c, fVar.b);
        }
    }

    private boolean k() {
        try {
            StatFs statFs = new StatFs(this.l);
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()) > this.o;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean l() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.d;
        return j < jCurrentTimeMillis && j + 86400000 > jCurrentTimeMillis;
    }

    private boolean m(String str) {
        if (TextUtils.isEmpty(this.l)) {
            return false;
        }
        File file = new File(this.l + File.separator + str);
        return file.exists() && file.isFile();
    }

    private boolean o(e eVar) {
        if (Logan.c) {
            Log.d(u, "prepare log file");
        }
        if (!m(eVar.b)) {
            eVar.c = "";
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.l);
        String str = File.separator;
        sb.append(str);
        sb.append(eVar.b);
        String string = sb.toString();
        if (!eVar.b.equals(String.valueOf(Util.getCurrentTime()))) {
            eVar.c = string;
            return true;
        }
        h();
        String str2 = this.l + str + eVar.b + ".copy";
        if (!f(string, str2)) {
            return false;
        }
        eVar.c = str2;
        return true;
    }

    public void n() {
        if (this.e) {
            return;
        }
        synchronized (this.a) {
            this.a.notify();
        }
    }

    public void p() {
        this.c = false;
        if (this.e) {
            return;
        }
        synchronized (this.a) {
            this.a.notify();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        while (this.c) {
            synchronized (this.a) {
                this.e = true;
                try {
                    com.dianping.logan.b bVarPoll = this.j.poll();
                    if (bVarPoll == null) {
                        this.e = false;
                        this.a.wait();
                        this.e = true;
                    } else {
                        e(bVarPoll);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    this.e = false;
                }
            }
        }
    }
}

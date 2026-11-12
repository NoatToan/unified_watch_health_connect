package defpackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class xl9 implements dpe {
    public static final ExecutorService f = Executors.newSingleThreadExecutor();
    public static xl9 g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39233b;
    public final long c;
    public final b d;
    public final c e;

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f39234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public File f39235b;
        public BufferedWriter c;

        public b() {
        }

        public void a(String str) {
            try {
                this.c.write(str);
                this.c.newLine();
                this.c.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean b() {
            BufferedWriter bufferedWriter = this.c;
            if (bufferedWriter == null) {
                return true;
            }
            try {
                bufferedWriter.close();
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                Object[] objArr = objArr == true ? 1 : 0;
                Object[] objArr2 = objArr == true ? 1 : 0;
                return false;
            } finally {
                this.c = null;
                this.f39234a = null;
                this.f39235b = null;
            }
        }

        public String c() {
            return this.f39234a;
        }

        public boolean d() {
            return this.c != null;
        }

        public boolean e(String str) {
            this.f39234a = str;
            File file = new File(xl9.this.f39232a, str);
            this.f39235b = file;
            if (!file.exists()) {
                try {
                    File parentFile = this.f39235b.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    this.f39235b.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                    this.f39234a = null;
                    this.f39235b = null;
                    return false;
                }
            }
            try {
                this.c = new BufferedWriter(new FileWriter(this.f39235b, true));
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                this.f39234a = null;
                this.f39235b = null;
                return false;
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BlockingQueue<cpe> f39236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f39237b;

        public c() {
            this.f39236a = new LinkedBlockingQueue();
        }

        public boolean a() {
            boolean z;
            synchronized (this) {
                z = this.f39237b;
            }
            return z;
        }

        public void b(cpe cpeVar) {
            try {
                this.f39236a.put(cpeVar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void c() {
            synchronized (this) {
                xl9.f.execute(this);
                this.f39237b = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    xl9.this.f(this.f39236a.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    try {
                        synchronized (this) {
                            this.f39237b = false;
                            return;
                        }
                    } catch (Exception unused) {
                        e.printStackTrace();
                        return;
                    }
                }
            }
        }
    }

    public xl9(String str, long j, String str2) {
        this.f39232a = str;
        this.f39233b = str2;
        this.c = j;
        this.d = new b();
        this.e = new c();
        e();
    }

    public static synchronized xl9 h(String str, long j, String str2) {
        try {
            if (g == null) {
                g = new xl9(str, j, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    @Override // defpackage.dpe
    public void a(xoe xoeVar, int i, String str, boolean z, String str2) {
        if (i <= 3) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.e.a()) {
            this.e.c();
        }
        this.e.b(new cpe(jCurrentTimeMillis, i, str, str2));
    }

    public final void e() {
        if (this.c <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        File[] fileArrListFiles = new File(this.f39232a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (jCurrentTimeMillis - file.lastModified() > this.c) {
                try {
                    file.delete();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final void f(cpe cpeVar) {
        if (this.d.c() == null) {
            String strG = g();
            if (this.d.d()) {
                this.d.b();
            }
            if (!this.d.e(strG)) {
                return;
            }
        }
        this.d.a(cpeVar.a());
    }

    public final String g() {
        if (!this.f39233b.isEmpty()) {
            return this.f39233b;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(new Date(System.currentTimeMillis()));
    }
}

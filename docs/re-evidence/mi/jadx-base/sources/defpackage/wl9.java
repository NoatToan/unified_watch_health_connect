package defpackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public class wl9 implements b9i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ul9 f38091b;
    public final ix1 c;
    public final o04 d;
    public ix9 e;
    public e f;
    public volatile d g;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f38092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ul9 f38093b;
        public ix1 c;
        public o04 d;
        public ix9 e;

        public b(String str) {
            this.f38092a = str;
        }

        public b a(jx1 jx1Var) {
            if (!(jx1Var instanceof ix1)) {
                jx1Var = new kx1(jx1Var);
            }
            ix1 ix1Var = (ix1) jx1Var;
            this.c = ix1Var;
            lx1.b(ix1Var);
            return this;
        }

        public wl9 b() {
            d();
            return new wl9(this);
        }

        public b c(ul9 ul9Var) {
            this.f38093b = ul9Var;
            return this;
        }

        public final void d() {
            if (this.f38093b == null) {
                this.f38093b = cy5.e();
            }
            if (this.c == null) {
                this.c = cy5.b();
            }
            if (this.d == null) {
                this.d = cy5.d();
            }
            if (this.e == null) {
                this.e = cy5.f();
            }
        }

        public b e(ix9 ix9Var) {
            this.e = ix9Var;
            return this;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f38094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38095b;
        public String c;
        public String d;

        public c(long j, int i, String str, String str2) {
            this.f38094a = j;
            this.f38095b = i;
            this.c = str;
            this.d = str2;
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BlockingQueue<c> f38096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f38097b;

        public d() {
            this.f38096a = new LinkedBlockingQueue();
        }

        public void a(c cVar) {
            try {
                this.f38096a.put(cVar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public boolean b() {
            boolean z;
            synchronized (this) {
                z = this.f38097b;
            }
            return z;
        }

        public void c() {
            synchronized (this) {
                try {
                    if (this.f38097b) {
                        return;
                    }
                    new Thread(this).start();
                    this.f38097b = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    c cVarTake = this.f38096a.take();
                    if (cVarTake == null) {
                        return;
                    } else {
                        wl9.this.e(cVarTake.f38094a, cVarTake.f38095b, cVarTake.c, cVarTake.d);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    synchronized (this) {
                        this.f38097b = false;
                        return;
                    }
                }
            }
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f38098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public File f38099b;
        public BufferedWriter c;

        public e() {
        }

        public void a(String str) {
            try {
                this.c.write(str);
                this.c.newLine();
                this.c.flush();
            } catch (IOException unused) {
            }
        }

        public boolean b() {
            BufferedWriter bufferedWriter = this.c;
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            this.c = null;
            this.f38098a = null;
            this.f38099b = null;
            return true;
        }

        public File c() {
            return this.f38099b;
        }

        public String d() {
            return this.f38098a;
        }

        public boolean e() {
            return this.c != null && this.f38099b.exists();
        }

        public boolean f(String str) {
            this.f38098a = str;
            File file = new File(wl9.this.f38090a, str);
            this.f38099b = file;
            if (!file.exists()) {
                try {
                    File parentFile = this.f38099b.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    this.f38099b.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                    b();
                    return false;
                }
            }
            try {
                this.c = new BufferedWriter(new FileWriter(this.f38099b, true));
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                b();
                return false;
            }
        }
    }

    public wl9(b bVar) {
        this.f38090a = bVar.f38092a;
        this.f38091b = bVar.f38093b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = new e();
        this.g = new d();
        c();
    }

    public final void c() {
        File file = new File(this.f38090a);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public final void d() {
        File[] fileArrListFiles = new File(this.f38090a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.d.a(file)) {
                file.delete();
            }
        }
    }

    public final void e(long j, int i, String str, String str2) {
        String strD = this.f.d();
        boolean z = !this.f.e();
        if (strD == null || z || this.f38091b.a()) {
            String strB = this.f38091b.b(i, System.currentTimeMillis());
            if (strB == null || strB.trim().length() == 0) {
                b0i.d().b("File name should not be empty, ignore log: " + str2);
                return;
            }
            if (!strB.equals(strD) || z) {
                this.f.b();
                d();
                if (!this.f.f(strB)) {
                    return;
                } else {
                    strD = strB;
                }
            }
        }
        File fileC = this.f.c();
        if (this.c.c(fileC)) {
            this.f.b();
            lx1.a(fileC, this.c);
            if (!this.f.f(strD)) {
                return;
            }
        }
        this.f.a(this.e.a(j, i, str, str2).toString());
    }

    @Override // defpackage.b9i
    public void println(int i, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.g.b()) {
            this.g.c();
        }
        this.g.a(new c(jCurrentTimeMillis, i, str, str2));
    }
}

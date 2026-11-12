package defpackage;

import android.os.IBinder;

/* JADX INFO: loaded from: classes11.dex */
public class w8s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IBinder f37733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o8s.b f37734b;

    public w8s(o8s.b bVar, IBinder iBinder) {
        this.f37734b = bVar;
        this.f37733a = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String packageName = o8s.this.f28866a.getPackageName();
            String strK = o8s.this.k();
            o8s.a aVar = new o8s.a();
            aVar.f28869b = o8s.c.a(this.f37733a, packageName, strK, "OUID");
            o8s.this.d = aVar;
            o8s.this.l();
            o8s.this.c = 2;
            synchronized (o8s.this.e) {
                try {
                    o8s.this.e.notifyAll();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            o8s.this.l();
            o8s.this.c = 2;
            synchronized (o8s.this.e) {
                try {
                    o8s.this.e.notifyAll();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th) {
            o8s.this.l();
            o8s.this.c = 2;
            synchronized (o8s.this.e) {
                try {
                    o8s.this.e.notifyAll();
                } catch (Exception unused4) {
                }
                throw th;
            }
        }
    }
}

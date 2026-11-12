package defpackage;

import android.os.IBinder;

/* JADX INFO: loaded from: classes11.dex */
public class e7s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IBinder f16361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t6s.a f16362b;

    public e7s(t6s.a aVar, IBinder iBinder) {
        this.f16362b = aVar;
        this.f16361a = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            t6s.this.d = t6s.b.a(this.f16361a);
            t6s.this.e = t6s.b.b(this.f16361a);
            t6s.this.i();
            t6s.this.c = 2;
            synchronized (t6s.this.g) {
                try {
                    t6s.this.g.notifyAll();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            t6s.this.i();
            t6s.this.c = 2;
            synchronized (t6s.this.g) {
                try {
                    t6s.this.g.notifyAll();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th) {
            t6s.this.i();
            t6s.this.c = 2;
            synchronized (t6s.this.g) {
                try {
                    t6s.this.g.notifyAll();
                } catch (Exception unused4) {
                }
                throw th;
            }
        }
    }
}

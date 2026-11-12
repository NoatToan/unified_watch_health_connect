package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class kb4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f14 f23672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23673b;

    public kb4() {
        this(f14.f17281a);
    }

    public synchronized void a() throws InterruptedException {
        while (!this.f23673b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z = false;
        while (!this.f23673b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z;
        z = this.f23673b;
        this.f23673b = false;
        return z;
    }

    public synchronized boolean d() {
        return this.f23673b;
    }

    public synchronized boolean e() {
        if (this.f23673b) {
            return false;
        }
        this.f23673b = true;
        notifyAll();
        return true;
    }

    public kb4(f14 f14Var) {
        this.f23672a = f14Var;
    }
}

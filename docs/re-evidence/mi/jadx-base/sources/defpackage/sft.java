package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class sft {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33601a;

    public sft(int i) {
        this.f33601a = i;
    }

    public static sft a() {
        return new sft(20);
    }

    public synchronized void b(int i) {
        if (i < 23 || i > 247) {
            return;
        }
        this.f33601a = i - 3;
    }

    public synchronized void c() {
        this.f33601a = 20;
    }

    public synchronized int d() {
        return this.f33601a;
    }
}

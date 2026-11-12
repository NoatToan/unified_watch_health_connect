package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class tem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Thread f34624a = null;

    public void a() {
        Thread threadCurrentThread = Thread.currentThread();
        if (this.f34624a == null) {
            this.f34624a = threadCurrentThread;
        }
        sk1.a(this.f34624a == threadCurrentThread);
    }
}

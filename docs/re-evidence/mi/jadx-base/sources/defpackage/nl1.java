package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class nl1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28029b;
    public boolean c;
    public T d;
    public int e;
    public String f;

    @FunctionalInterface
    public interface a {
        void onError(int i, String str);
    }

    @FunctionalInterface
    public interface b<T> {
        void onSuccess(T t);
    }

    private /* synthetic */ void lambda$callback$0(b bVar) {
        bVar.onSuccess(this.d);
    }

    private /* synthetic */ void lambda$callback$1(a aVar) {
        aVar.onError(this.e, this.f);
    }

    private /* synthetic */ void lambda$callbackError$3(a aVar) {
        aVar.onError(this.e, this.f);
    }

    private /* synthetic */ void lambda$callbackSuccess$2(b bVar) {
        bVar.onSuccess(this.d);
    }

    public final void a() {
        if (this.f28028a && this.c) {
            synchronized (this) {
                notifyAll();
            }
        }
    }

    public synchronized void b(int i, String str) {
        if (this.f28028a) {
            return;
        }
        this.f28028a = true;
        this.e = i;
        this.f = str;
        a();
    }

    public synchronized void c(T t) {
        if (this.f28028a) {
            return;
        }
        this.f28028a = true;
        this.f28029b = true;
        this.d = t;
        a();
    }
}

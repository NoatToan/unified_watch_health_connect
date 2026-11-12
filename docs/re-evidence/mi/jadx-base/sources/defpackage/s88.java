package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public class s88<Result> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Result f33400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f33401b = new Throwable();
    public volatile boolean c = false;

    public Result a() {
        return this.f33400a;
    }

    public Throwable b() {
        return this.f33401b;
    }

    public boolean c() {
        return this.c;
    }

    public void d(Throwable th) {
        this.f33401b = th;
    }

    public void e(Result result) {
        this.f33400a = result;
        this.c = true;
    }
}

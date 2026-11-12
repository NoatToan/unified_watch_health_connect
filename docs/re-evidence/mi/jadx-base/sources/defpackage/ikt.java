package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ikt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h7n f21264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21265b;
    public final /* synthetic */ int c;
    public final /* synthetic */ jkt d;

    public ikt(jkt jktVar, h7n h7nVar, int i, int i2) {
        this.d = jktVar;
        this.f21264a = h7nVar;
        this.f21265b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jkt jktVar = this.d;
        h7n h7nVar = this.f21264a;
        jktVar.h(new qht(h7nVar.d(), this.f21265b, this.c, h7nVar.a(), h7nVar.f(), h7nVar.h(), h7nVar.g(), h7nVar.c(), h7nVar.i()));
    }
}

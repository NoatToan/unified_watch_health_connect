package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class z9s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ od8 f41056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h3s f41057b;

    public z9s(h3s h3sVar, od8 od8Var) {
        this.f41057b = h3sVar;
        this.f41056a = od8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f41057b.t(this.f41056a);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class i6s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z5s.b f20843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z5s f20844b;

    public i6s(z5s z5sVar, z5s.b bVar) {
        this.f20844b = z5sVar;
        this.f20843a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f20844b.e(this.f20843a);
    }
}

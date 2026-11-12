package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class e5d implements y4d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h5d f16279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f5d f16280b;

    public e5d(h5d h5dVar, f5d f5dVar) {
        this.f16279a = h5dVar;
        this.f16280b = f5dVar;
    }

    @Override // defpackage.y4d
    public void a(String str, int i, boolean z) {
        this.f16279a.l(i);
        this.f16280b.e(this.f16279a, 1);
    }
}

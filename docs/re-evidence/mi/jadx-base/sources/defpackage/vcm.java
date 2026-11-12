package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public class vcm implements xb4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final skh f36751a;

    public vcm(skh skhVar) {
        this.f36751a = skhVar;
    }

    @Override // defpackage.xb4
    public lc4 a() {
        return wcm.f(this.f36751a.a());
    }

    @Override // defpackage.xb4
    public mc4 b(String str) {
        skh skhVar = this.f36751a;
        if (skhVar != null) {
            return skhVar.A(str);
        }
        return null;
    }
}

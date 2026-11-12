package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ri1 implements sxa<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f32561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32562b = new Object();
    public final ma4 c;

    public ri1(ma4 ma4Var) {
        this.c = ma4Var;
    }

    @Override // defpackage.sxa
    public Object generatedComponent() {
        if (this.f32561a == null) {
            synchronized (this.f32562b) {
                try {
                    if (this.f32561a == null) {
                        this.f32561a = this.c.get();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f32561a;
    }
}

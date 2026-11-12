package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class jfi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22742a;

    public jfi(boolean z) {
        this.f22742a = z;
    }

    public void a(atk[] atkVarArr) {
        if (!this.f22742a || atkVarArr == null || atkVarArr.length < 3) {
            return;
        }
        atk atkVar = atkVarArr[0];
        atkVarArr[0] = atkVarArr[2];
        atkVarArr[2] = atkVar;
    }
}

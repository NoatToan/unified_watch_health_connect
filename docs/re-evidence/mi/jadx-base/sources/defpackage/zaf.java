package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class zaf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f41072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41073b;

    public void a(float f) {
        float f2 = this.f41072a + f;
        this.f41072a = f2;
        int i = this.f41073b + 1;
        this.f41073b = i;
        if (i == Integer.MAX_VALUE) {
            this.f41072a = f2 / 2.0f;
            this.f41073b = i / 2;
        }
    }
}

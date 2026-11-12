package defpackage;

/* JADX INFO: loaded from: classes16.dex */
public class qjm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f46316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f46317b;
    private boolean d;

    public qjm() {
    }

    public qjm(boolean z, boolean z2) {
        this.d = z;
        this.f46317b = z2;
    }

    public qjm(boolean z, boolean z2, boolean z3) {
        this.d = z;
        this.f46317b = z2;
        this.f46316a = z3;
    }

    public qjm c(boolean z) {
        this.d = z;
        return this;
    }

    public boolean a() {
        return this.d;
    }

    public qjm b(boolean z) {
        this.f46317b = z;
        return this;
    }

    public boolean e() {
        return this.f46317b;
    }

    public qjm d(boolean z) {
        this.f46316a = z;
        return this;
    }

    public boolean c() {
        return this.f46316a;
    }
}

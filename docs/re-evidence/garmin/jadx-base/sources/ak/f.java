package ak;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3529b;

    public f(int i14) {
        this.f3528a = false;
        this.f3529b = false;
        this.f3528a = k.d(1, i14);
        this.f3529b = k.d(4, i14);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Extended Assignment=");
        boolean z14 = this.f3529b;
        boolean z15 = this.f3528a;
        if (z15 || z14) {
            if (z15) {
                sb3.append(" -Background Scanning");
            }
            if (z14) {
                sb3.append(" -Frequency Agility");
            }
        } else {
            sb3.append("[Not Enabled]");
        }
        return sb3.toString();
    }

    public f() {
        this.f3528a = false;
        this.f3529b = false;
    }
}

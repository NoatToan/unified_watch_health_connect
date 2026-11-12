package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public class dcv {
    private int[] i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31614b = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31613a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31615c = -1;
    private boolean e = false;
    private int d = 1;

    public int c() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }

    public int a() {
        return this.f31614b;
    }

    public void d(int i) {
        this.f31614b = i;
    }

    public int b() {
        return this.f31613a;
    }

    public void b(int i) {
        this.f31613a = i;
    }

    public int d() {
        return this.f31615c;
    }

    public void c(int i) {
        this.f31615c = i;
    }

    public int[] e() {
        int[] iArr = this.i;
        if (iArr == null) {
            return new int[0];
        }
        return (int[]) iArr.clone();
    }

    public void a(int[] iArr) {
        if (iArr == null) {
            this.i = new int[0];
        } else {
            this.i = (int[]) iArr.clone();
        }
    }

    public boolean f() {
        return this.e;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Option{type=");
        sb.append(this.f31614b);
        sb.append(", duration=");
        sb.append(this.f31613a);
        sb.append(", isSupportDevice=");
        sb.append(this.d);
        sb.append(", rhythm=");
        sb.append(this.f31615c);
        int[] iArr = this.i;
        if (iArr == null || iArr.length < 1) {
            sb.append(", vibrateDuration=[]");
        } else {
            sb.append(", vibrateDuration=[");
            for (int i : this.i) {
                sb.append(i);
                sb.append(", ");
            }
            sb.append("]");
        }
        sb.append(", screenOn=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}

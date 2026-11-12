package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5181a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5182b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5183c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5184d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5185e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5186f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5187g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5188h = false;

    public final void a(int i14, int i15) {
        this.f5183c = i14;
        this.f5184d = i15;
        this.f5188h = true;
        if (this.f5187g) {
            if (i15 != Integer.MIN_VALUE) {
                this.f5181a = i15;
            }
            if (i14 != Integer.MIN_VALUE) {
                this.f5182b = i14;
                return;
            }
            return;
        }
        if (i14 != Integer.MIN_VALUE) {
            this.f5181a = i14;
        }
        if (i15 != Integer.MIN_VALUE) {
            this.f5182b = i15;
        }
    }
}

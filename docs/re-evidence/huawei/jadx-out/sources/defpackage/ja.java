package defpackage;

/* JADX INFO: loaded from: classes21.dex */
public class ja {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38274c;
    private float d;

    public void b(float f) {
        float f2 = this.d + f;
        this.d = f2;
        int i = this.f38274c + 1;
        this.f38274c = i;
        if (i == Integer.MAX_VALUE) {
            this.d = f2 / 2.0f;
            this.f38274c = i / 2;
        }
    }
}

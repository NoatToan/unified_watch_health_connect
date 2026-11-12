package defpackage;

import androidx.core.os.TraceCompat;

/* JADX INFO: loaded from: classes21.dex */
public class iz {
    private final String[] d = new String[5];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f38232a = new long[5];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38233c = 0;
    private int e = 0;

    public void a(String str) {
        int i = this.f38233c;
        if (i == 5) {
            this.e++;
            return;
        }
        this.d[i] = str;
        this.f38232a[i] = System.nanoTime();
        TraceCompat.beginSection(str);
        this.f38233c++;
    }

    public float e(String str) {
        int i = this.e;
        if (i > 0) {
            this.e = i - 1;
            return 0.0f;
        }
        int i2 = this.f38233c - 1;
        this.f38233c = i2;
        if (i2 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(this.d[i2])) {
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.d[this.f38233c] + ".");
        }
        TraceCompat.endSection();
        return (System.nanoTime() - this.f38232a[this.f38233c]) / 1000000.0f;
    }
}

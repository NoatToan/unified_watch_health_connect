package b8;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f16373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16375d;

    public c() {
        if (d.f16376a == null) {
            d.f16376a = new e();
        }
    }

    public final int a(int i14) {
        if (i14 < this.f16375d) {
            return this.f16373b.getShort(this.f16374c + i14);
        }
        return 0;
    }
}

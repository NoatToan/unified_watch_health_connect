package xa;

import fa.z;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f189673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f189674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f189675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f189676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f189677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f189678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a[] f189679g;

    public f(boolean z14, int i14, int i15) {
        fa.a.a(i14 > 0);
        fa.a.a(i15 >= 0);
        this.f189673a = z14;
        this.f189674b = i14;
        this.f189678f = i15;
        this.f189679g = new a[i15 + 100];
        if (i15 <= 0) {
            this.f189675c = null;
            return;
        }
        this.f189675c = new byte[i15 * i14];
        for (int i16 = 0; i16 < i15; i16++) {
            this.f189679g[i16] = new a(this.f189675c, i16 * i14);
        }
    }

    public final synchronized void a(int i14) {
        boolean z14 = i14 < this.f189676d;
        this.f189676d = i14;
        if (z14) {
            b();
        }
    }

    public final synchronized void b() {
        try {
            int i14 = 0;
            int iMax = Math.max(0, z.f(this.f189676d, this.f189674b) - this.f189677e);
            int i15 = this.f189678f;
            if (iMax >= i15) {
                return;
            }
            if (this.f189675c != null) {
                int i16 = i15 - 1;
                while (i14 <= i16) {
                    a aVar = this.f189679g[i14];
                    aVar.getClass();
                    if (aVar.f189665a == this.f189675c) {
                        i14++;
                    } else {
                        a aVar2 = this.f189679g[i16];
                        aVar2.getClass();
                        if (aVar2.f189665a != this.f189675c) {
                            i16--;
                        } else {
                            a[] aVarArr = this.f189679g;
                            aVarArr[i14] = aVar2;
                            aVarArr[i16] = aVar;
                            i16--;
                            i14++;
                        }
                    }
                }
                iMax = Math.max(iMax, i14);
                if (iMax >= this.f189678f) {
                    return;
                }
            }
            Arrays.fill(this.f189679g, iMax, this.f189678f, (Object) null);
            this.f189678f = iMax;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public f(boolean z14, int i14) {
        this(z14, i14, 0);
    }
}

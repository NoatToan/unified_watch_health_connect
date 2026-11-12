package p4;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o4.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lp4/k;", "Lp4/c;", "", "name", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;I)V", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends c {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, int i14) {
        super(str, b.f135538e, i14, null);
        b.f135535b.getClass();
    }

    @Override // p4.c
    public final float[] a(float[] fArr) {
        float f14 = fArr[0];
        j.f135579a.getClass();
        float[] fArr2 = j.f135584f;
        float f15 = f14 / fArr2[0];
        float f16 = fArr[1] / fArr2[1];
        float f17 = fArr[2] / fArr2[2];
        float fCbrt = f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f16 > 0.008856452f ? (float) Math.cbrt(f16) : (f16 * 7.787037f) + 0.13793103f;
        float fCbrt3 = f17 > 0.008856452f ? (float) Math.cbrt(f17) : (f17 * 7.787037f) + 0.13793103f;
        float f18 = (116.0f * fCbrt2) - 16.0f;
        float f19 = (fCbrt - fCbrt2) * 500.0f;
        float f22 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f18 < 0.0f) {
            f18 = 0.0f;
        }
        if (f18 > 100.0f) {
            f18 = 100.0f;
        }
        fArr[0] = f18;
        if (f19 < -128.0f) {
            f19 = -128.0f;
        }
        if (f19 > 128.0f) {
            f19 = 128.0f;
        }
        fArr[1] = f19;
        if (f22 < -128.0f) {
            f22 = -128.0f;
        }
        fArr[2] = f22 <= 128.0f ? f22 : 128.0f;
        return fArr;
    }

    @Override // p4.c
    public final float b(int i14) {
        return i14 == 0 ? 100.0f : 128.0f;
    }

    @Override // p4.c
    public final float c(int i14) {
        return i14 == 0 ? 0.0f : -128.0f;
    }

    @Override // p4.c
    public final long e(float f14, float f15, float f16) {
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 100.0f) {
            f14 = 100.0f;
        }
        if (f15 < -128.0f) {
            f15 = -128.0f;
        }
        if (f15 > 128.0f) {
            f15 = 128.0f;
        }
        float f17 = (f14 + 16.0f) / 116.0f;
        float f18 = (f15 * 0.002f) + f17;
        float f19 = f18 > 0.20689656f ? f18 * f18 * f18 : (f18 - 0.13793103f) * 0.12841855f;
        float f22 = f17 > 0.20689656f ? f17 * f17 * f17 : (f17 - 0.13793103f) * 0.12841855f;
        j jVar = j.f135579a;
        jVar.getClass();
        float[] fArr = j.f135584f;
        float f24 = f19 * fArr[0];
        jVar.getClass();
        return (((long) Float.floatToRawIntBits(f22 * fArr[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f24)) << 32);
    }

    @Override // p4.c
    public final float[] f(float[] fArr) {
        float f14 = fArr[0];
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 100.0f) {
            f14 = 100.0f;
        }
        fArr[0] = f14;
        float f15 = fArr[1];
        if (f15 < -128.0f) {
            f15 = -128.0f;
        }
        if (f15 > 128.0f) {
            f15 = 128.0f;
        }
        fArr[1] = f15;
        float f16 = fArr[2];
        float f17 = f16 >= -128.0f ? f16 : -128.0f;
        float f18 = f17 <= 128.0f ? f17 : 128.0f;
        fArr[2] = f18;
        float f19 = (f14 + 16.0f) / 116.0f;
        float f22 = (f15 * 0.002f) + f19;
        float f24 = f19 - (f18 * 0.005f);
        float f25 = f22 > 0.20689656f ? f22 * f22 * f22 : (f22 - 0.13793103f) * 0.12841855f;
        float f26 = f19 > 0.20689656f ? f19 * f19 * f19 : (f19 - 0.13793103f) * 0.12841855f;
        float f27 = f24 > 0.20689656f ? f24 * f24 * f24 : (f24 - 0.13793103f) * 0.12841855f;
        j.f135579a.getClass();
        float[] fArr2 = j.f135584f;
        fArr[0] = f25 * fArr2[0];
        fArr[1] = f26 * fArr2[1];
        fArr[2] = f27 * fArr2[2];
        return fArr;
    }

    @Override // p4.c
    public final float g(float f14, float f15, float f16) {
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 100.0f) {
            f14 = 100.0f;
        }
        if (f16 < -128.0f) {
            f16 = -128.0f;
        }
        if (f16 > 128.0f) {
            f16 = 128.0f;
        }
        float f17 = ((f14 + 16.0f) / 116.0f) - (f16 * 0.005f);
        float f18 = f17 > 0.20689656f ? f17 * f17 * f17 : 0.12841855f * (f17 - 0.13793103f);
        j.f135579a.getClass();
        return f18 * j.f135584f[2];
    }

    @Override // p4.c
    public final long h(float f14, float f15, float f16, float f17, c cVar) {
        j jVar = j.f135579a;
        jVar.getClass();
        float[] fArr = j.f135584f;
        float f18 = f14 / fArr[0];
        jVar.getClass();
        float f19 = f15 / fArr[1];
        jVar.getClass();
        float f22 = f16 / fArr[2];
        float fCbrt = f18 > 0.008856452f ? (float) Math.cbrt(f18) : (f18 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f19 > 0.008856452f ? (float) Math.cbrt(f19) : (f19 * 7.787037f) + 0.13793103f;
        float f24 = (116.0f * fCbrt2) - 16.0f;
        float f25 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f22 > 0.008856452f ? (float) Math.cbrt(f22) : (f22 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f24 < 0.0f) {
            f24 = 0.0f;
        }
        if (f24 > 100.0f) {
            f24 = 100.0f;
        }
        if (f25 < -128.0f) {
            f25 = -128.0f;
        }
        if (f25 > 128.0f) {
            f25 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return f0.a(f24, f25, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f17, cVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lp4/k$a;", "", "<init>", "()V", "", "A", "F", "B", "C", "D", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

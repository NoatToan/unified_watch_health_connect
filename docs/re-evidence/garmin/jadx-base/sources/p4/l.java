package p4;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o4.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lp4/l;", "Lp4/c;", "", "name", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;I)V", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f135585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f135586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f135587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f135588g;

    static {
        new a(null);
        p4.a.f135532b.getClass();
        float[] fArr = p4.a.f135533c.f135534a;
        j.f135579a.getClass();
        float[] fArrF = d.f(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.b(fArr, j.f135581c.a(), j.f135583e.a()));
        f135585d = fArrF;
        float[] fArr2 = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f135586e = fArr2;
        f135587f = d.e(fArrF);
        f135588g = d.e(fArr2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, int i14) {
        super(str, b.f135538e, i14, null);
        b.f135535b.getClass();
    }

    @Override // p4.c
    public final float[] a(float[] fArr) {
        d.h(f135585d, fArr);
        fArr[0] = gl.b.r(fArr[0]);
        fArr[1] = gl.b.r(fArr[1]);
        fArr[2] = gl.b.r(fArr[2]);
        d.h(f135586e, fArr);
        return fArr;
    }

    @Override // p4.c
    public final float b(int i14) {
        return i14 == 0 ? 1.0f : 0.5f;
    }

    @Override // p4.c
    public final float c(int i14) {
        return i14 == 0 ? 0.0f : -0.5f;
    }

    @Override // p4.c
    public final long e(float f14, float f15, float f16) {
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        if (f15 < -0.5f) {
            f15 = -0.5f;
        }
        if (f15 > 0.5f) {
            f15 = 0.5f;
        }
        if (f16 < -0.5f) {
            f16 = -0.5f;
        }
        float f17 = f16 <= 0.5f ? f16 : 0.5f;
        float[] fArr = f135588g;
        float f18 = (fArr[6] * f17) + (fArr[3] * f15) + (fArr[0] * f14);
        float f19 = (fArr[7] * f17) + (fArr[4] * f15) + (fArr[1] * f14);
        float f22 = (fArr[8] * f17) + (fArr[5] * f15) + (fArr[2] * f14);
        float f24 = f18 * f18 * f18;
        float f25 = f19 * f19 * f19;
        float f26 = f22 * f22 * f22;
        float[] fArr2 = f135587f;
        return (((long) Float.floatToRawIntBits((fArr2[7] * f26) + (fArr2[4] * f25) + (fArr2[1] * f24))) & 4294967295L) | (((long) Float.floatToRawIntBits((fArr2[6] * f26) + ((fArr2[3] * f25) + (fArr2[0] * f24)))) << 32);
    }

    @Override // p4.c
    public final float[] f(float[] fArr) {
        float f14 = fArr[0];
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        fArr[0] = f14;
        float f15 = fArr[1];
        if (f15 < -0.5f) {
            f15 = -0.5f;
        }
        if (f15 > 0.5f) {
            f15 = 0.5f;
        }
        fArr[1] = f15;
        float f16 = fArr[2];
        float f17 = f16 >= -0.5f ? f16 : -0.5f;
        fArr[2] = f17 <= 0.5f ? f17 : 0.5f;
        d.h(f135588g, fArr);
        float f18 = fArr[0];
        fArr[0] = f18 * f18 * f18;
        float f19 = fArr[1];
        fArr[1] = f19 * f19 * f19;
        float f22 = fArr[2];
        fArr[2] = f22 * f22 * f22;
        d.h(f135587f, fArr);
        return fArr;
    }

    @Override // p4.c
    public final float g(float f14, float f15, float f16) {
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        if (f15 < -0.5f) {
            f15 = -0.5f;
        }
        if (f15 > 0.5f) {
            f15 = 0.5f;
        }
        if (f16 < -0.5f) {
            f16 = -0.5f;
        }
        float f17 = f16 <= 0.5f ? f16 : 0.5f;
        float[] fArr = f135588g;
        float f18 = (fArr[6] * f17) + (fArr[3] * f15) + (fArr[0] * f14);
        float f19 = (fArr[7] * f17) + (fArr[4] * f15) + (fArr[1] * f14);
        float f22 = (fArr[8] * f17) + (fArr[5] * f15) + (fArr[2] * f14);
        float f24 = f18 * f18 * f18;
        float f25 = f19 * f19 * f19;
        float f26 = f22 * f22 * f22;
        float[] fArr2 = f135587f;
        return (fArr2[8] * f26) + (fArr2[5] * f25) + (fArr2[2] * f24);
    }

    @Override // p4.c
    public final long h(float f14, float f15, float f16, float f17, c cVar) {
        float[] fArr = f135585d;
        float f18 = (fArr[6] * f16) + (fArr[3] * f15) + (fArr[0] * f14);
        float f19 = (fArr[7] * f16) + (fArr[4] * f15) + (fArr[1] * f14);
        float f22 = (fArr[8] * f16) + (fArr[5] * f15) + (fArr[2] * f14);
        float fR = gl.b.r(f18);
        float fR2 = gl.b.r(f19);
        float fR3 = gl.b.r(f22);
        float[] fArr2 = f135586e;
        return f0.a((fArr2[6] * fR3) + (fArr2[3] * fR2) + (fArr2[0] * fR), (fArr2[7] * fR3) + (fArr2[4] * fR2) + (fArr2[1] * fR), (fArr2[8] * fR3) + (fArr2[5] * fR2) + (fArr2[2] * fR), f17, cVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lp4/l$a;", "", "<init>", "()V", "", "M1", "[F", "M2", "InverseM1", "InverseM2", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

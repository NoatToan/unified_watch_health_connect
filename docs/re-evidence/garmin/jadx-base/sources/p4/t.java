package p4;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o4.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp4/t;", "Lp4/c;", "", "name", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;I)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, int i14) {
        super(str, b.f135537d, i14, null);
        b.f135535b.getClass();
    }

    @Override // p4.c
    public final float[] a(float[] fArr) {
        float f14 = fArr[0];
        if (f14 < -2.0f) {
            f14 = -2.0f;
        }
        if (f14 > 2.0f) {
            f14 = 2.0f;
        }
        fArr[0] = f14;
        float f15 = fArr[1];
        if (f15 < -2.0f) {
            f15 = -2.0f;
        }
        if (f15 > 2.0f) {
            f15 = 2.0f;
        }
        fArr[1] = f15;
        float f16 = fArr[2];
        float f17 = f16 >= -2.0f ? f16 : -2.0f;
        fArr[2] = f17 <= 2.0f ? f17 : 2.0f;
        return fArr;
    }

    @Override // p4.c
    public final float b(int i14) {
        return 2.0f;
    }

    @Override // p4.c
    public final float c(int i14) {
        return -2.0f;
    }

    @Override // p4.c
    public final long e(float f14, float f15, float f16) {
        if (f14 < -2.0f) {
            f14 = -2.0f;
        }
        if (f14 > 2.0f) {
            f14 = 2.0f;
        }
        if (f15 < -2.0f) {
            f15 = -2.0f;
        }
        return (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f15 <= 2.0f ? f15 : 2.0f)) & 4294967295L);
    }

    @Override // p4.c
    public final float[] f(float[] fArr) {
        float f14 = fArr[0];
        if (f14 < -2.0f) {
            f14 = -2.0f;
        }
        if (f14 > 2.0f) {
            f14 = 2.0f;
        }
        fArr[0] = f14;
        float f15 = fArr[1];
        if (f15 < -2.0f) {
            f15 = -2.0f;
        }
        if (f15 > 2.0f) {
            f15 = 2.0f;
        }
        fArr[1] = f15;
        float f16 = fArr[2];
        float f17 = f16 >= -2.0f ? f16 : -2.0f;
        fArr[2] = f17 <= 2.0f ? f17 : 2.0f;
        return fArr;
    }

    @Override // p4.c
    public final float g(float f14, float f15, float f16) {
        if (f16 < -2.0f) {
            f16 = -2.0f;
        }
        if (f16 > 2.0f) {
            return 2.0f;
        }
        return f16;
    }

    @Override // p4.c
    public final long h(float f14, float f15, float f16, float f17, c cVar) {
        if (f14 < -2.0f) {
            f14 = -2.0f;
        }
        if (f14 > 2.0f) {
            f14 = 2.0f;
        }
        if (f15 < -2.0f) {
            f15 = -2.0f;
        }
        if (f15 > 2.0f) {
            f15 = 2.0f;
        }
        if (f16 < -2.0f) {
            f16 = -2.0f;
        }
        return f0.a(f14, f15, f16 <= 2.0f ? f16 : 2.0f, f17, cVar);
    }
}

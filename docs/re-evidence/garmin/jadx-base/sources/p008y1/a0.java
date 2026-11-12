package p008y1;

import b2.e;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.u;
import xd2.m0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ly1/a0;", "T", "Ly1/w0;", "", UserMetadata.KEYDATA_FILENAME, "", "anchors", "<init>", "(Ljava/util/List;[F)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a0<T> implements w0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<T> f193073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f193074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f193075c;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(List<? extends T> list, float[] fArr) {
        this.f193073a = list;
        this.f193074b = fArr;
        if (!(list.size() == fArr.length)) {
            e.a("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + u.f0(fArr));
        }
        this.f193075c = fArr.length;
    }

    @Override // p008y1.w0
    public final T a(float f14) {
        float[] fArr = this.f193074b;
        int length = fArr.length;
        float f15 = Float.POSITIVE_INFINITY;
        int i14 = 0;
        int i15 = -1;
        int i16 = 0;
        while (i14 < length) {
            int i17 = i16 + 1;
            float fAbs = Math.abs(f14 - fArr[i14]);
            if (fAbs <= f15) {
                i15 = i16;
                f15 = fAbs;
            }
            i14++;
            i16 = i17;
        }
        if (i15 == -1) {
            return null;
        }
        return this.f193073a.get(i15);
    }

    @Override // p008y1.w0
    public final T b(float f14, boolean z14) {
        float[] fArr = this.f193074b;
        int length = fArr.length;
        int i14 = 0;
        int i15 = -1;
        float f15 = Float.POSITIVE_INFINITY;
        int i16 = 0;
        while (i14 < length) {
            float f16 = fArr[i14];
            int i17 = i16 + 1;
            float f17 = z14 ? f16 - f14 : f14 - f16;
            if (f17 < 0.0f) {
                f17 = Float.POSITIVE_INFINITY;
            }
            if (f17 <= f15) {
                i15 = i16;
                f15 = f17;
            }
            i14++;
            i16 = i17;
        }
        if (i15 == -1) {
            return null;
        }
        return this.f193073a.get(i15);
    }

    @Override // p008y1.w0
    public final float c(T t7) {
        int iIndexOf = this.f193073a.indexOf(t7);
        m0 m0Var = e.f193171b;
        if (iIndexOf >= 0) {
            float[] fArr = this.f193074b;
            if (iIndexOf < fArr.length) {
                return fArr[iIndexOf];
            }
        }
        m0Var.invoke(Integer.valueOf(iIndexOf));
        return Float.valueOf(Float.NaN).floatValue();
    }

    @Override // p008y1.w0
    public final float d() {
        float[] fArr = this.f193074b;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMax = fArr[0];
        int i14 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMax = Math.max(fMax, fArr[i14]);
                if (i14 == length) {
                    break;
                }
                i14++;
            }
        }
        return fMax;
    }

    @Override // p008y1.w0
    public final float e() {
        float[] fArr = this.f193074b;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMin = fArr[0];
        int i14 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMin = Math.min(fMin, fArr[i14]);
                if (i14 == length) {
                    break;
                }
                i14++;
            }
        }
        return fMin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return s.g(this.f193073a, a0Var.f193073a) && Arrays.equals(this.f193074b, a0Var.f193074b) && this.f193075c == a0Var.f193075c;
    }

    @Override // p008y1.w0
    public final boolean f(T t7) {
        return this.f193073a.indexOf(t7) != -1;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f193074b) + (this.f193073a.hashCode() * 31)) * 31) + this.f193075c;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    public final String toString() {
        float f14;
        StringBuilder sb3 = new StringBuilder("DraggableAnchors(anchors={");
        int i14 = 0;
        while (true) {
            int i15 = this.f193075c;
            if (i14 >= i15) {
                sb3.append("})");
                return sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(h0.e0(i14, this.f193073a));
            sb4.append('=');
            m0 m0Var = e.f193171b;
            if (i14 >= 0) {
                float[] fArr = this.f193074b;
                if (i14 < fArr.length) {
                    f14 = fArr[i14];
                } else {
                    m0Var.invoke(Integer.valueOf(i14));
                    f14 = Float.NaN;
                }
            } else {
                m0Var.invoke(Integer.valueOf(i14));
                f14 = Float.NaN;
            }
            sb4.append(f14);
            sb3.append(sb4.toString());
            if (i14 < i15 - 1) {
                sb3.append(", ");
            }
            i14++;
        }
    }
}

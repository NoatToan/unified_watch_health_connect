package h6;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lh6/c;", "Lh6/a;", "", "fromSp", "toDp", "<init>", "([F[F)V", "a", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements h6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f82147c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f82148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f82149b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            h.s("Array lengths must match and be nonzero");
            throw null;
        }
        this.f82148a = fArr;
        this.f82149b = fArr2;
    }

    @Override // h6.a
    public final float a(float f14) {
        return a.a(f82147c, f14, this.f82148a, this.f82149b);
    }

    @Override // h6.a
    public final float b(float f14) {
        return a.a(f82147c, f14, this.f82149b, this.f82148a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f82148a, cVar.f82148a) && Arrays.equals(this.f82149b, cVar.f82149b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f82149b) + (Arrays.hashCode(this.f82148a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f82148a);
        string.getClass();
        sb3.append(string);
        sb3.append(", toDpValues=");
        String string2 = Arrays.toString(this.f82149b);
        string2.getClass();
        sb3.append(string2);
        sb3.append(CoreConstants.CURLY_RIGHT);
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh6/c$a;", "", "<init>", "()V", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static final float a(a aVar, float f14, float[] fArr, float[] fArr2) {
            float f15;
            float f16;
            float f17;
            float f18;
            aVar.getClass();
            float fAbs = Math.abs(f14);
            float fSignum = Math.signum(f14);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                return fSignum * fArr2[iBinarySearch];
            }
            int i14 = -(iBinarySearch + 1);
            int i15 = i14 - 1;
            if (i15 >= fArr.length - 1) {
                float f19 = fArr[fArr.length - 1];
                float f22 = fArr2[fArr.length - 1];
                if (f19 == 0.0f) {
                    return 0.0f;
                }
                return (f22 / f19) * f14;
            }
            if (i15 == -1) {
                float f24 = fArr[0];
                f17 = fArr2[0];
                f18 = f24;
                f16 = 0.0f;
                f15 = 0.0f;
            } else {
                float f25 = fArr[i15];
                float f26 = fArr[i14];
                f15 = fArr2[i15];
                f16 = f25;
                f17 = fArr2[i14];
                f18 = f26;
            }
            d.f82150a.getClass();
            return (((f17 - f15) * Math.max(0.0f, Math.min(1.0f, f16 == f18 ? 0.0f : (fAbs - f16) / (f18 - f16)))) + f15) * fSignum;
        }

        private a() {
        }
    }
}

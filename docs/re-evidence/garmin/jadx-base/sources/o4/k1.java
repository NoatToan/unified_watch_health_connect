package o4;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BC\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo4/k1;", "Lo4/p1;", "", "", "Lo4/d0;", "colors", "", "stops", "Ln4/c;", TtmlNode.CENTER, "radius", "Lo4/x1;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/j;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k1 extends p1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<d0> f128882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Float> f128883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f128884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f128885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f128886h;

    /* JADX WARN: Illegal instructions before constructor call */
    public k1(List list, List list2, long j8, float f14, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        List list3 = (i15 & 2) != 0 ? null : list2;
        if ((i15 & 16) != 0) {
            x1.f129034b.getClass();
            i14 = 0;
        }
        this(list, list3, j8, f14, i14, null);
    }

    @Override // o4.p1
    public final Shader b(long j8) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j14 = this.f128884f;
        if ((9223372034707292159L & j14) == 9205357640488583168L) {
            long jB = n4.h.b(j8);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & 4294967295L));
        } else {
            int i14 = (int) (j14 >> 32);
            if (Float.intBitsToFloat(i14) == Float.POSITIVE_INFINITY) {
                i14 = (int) (j8 >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i14);
            int i15 = (int) (j14 & 4294967295L);
            if (Float.intBitsToFloat(i15) == Float.POSITIVE_INFINITY) {
                i15 = (int) (j8 & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i15);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        n4.c.a aVar = n4.c.f123541b;
        float f14 = this.f128885g;
        if (f14 == Float.POSITIVE_INFINITY) {
            f14 = n4.g.f(j8) / 2;
        }
        float f15 = f14;
        List<d0> list = this.f128882d;
        List<Float> list2 = this.f128883e;
        n.c(list, list2);
        return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), f15, n.a(list), n.b(list2, list), o.a(this.f128886h));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (p005kotlin.jvm.internal.s.g(this.f128882d, k1Var.f128882d) && p005kotlin.jvm.internal.s.g(this.f128883e, k1Var.f128883e) && n4.c.d(this.f128884f, k1Var.f128884f) && this.f128885g == k1Var.f128885g) {
            int i14 = k1Var.f128886h;
            x1.a aVar = x1.f129034b;
            if (this.f128886h == i14) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f128882d.hashCode() * 31;
        List<Float> list = this.f128883e;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        n4.c.a aVar = n4.c.f123541b;
        int iD = q6.f.d(this.f128885g, q6.f.e(iHashCode2, 31, this.f128884f), 31);
        x1.a aVar2 = x1.f129034b;
        return Integer.hashCode(this.f128886h) + iD;
    }

    public final String toString() {
        String str;
        long j8 = this.f128884f;
        String str2 = "";
        if ((9223372034707292159L & j8) != 9205357640488583168L) {
            str = "center=" + ((Object) n4.c.l(j8)) + ", ";
        } else {
            str = "";
        }
        float f14 = this.f128885g;
        if ((Float.floatToRawIntBits(f14) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f14 + ", ";
        }
        StringBuilder sb3 = new StringBuilder("RadialGradient(colors=");
        sb3.append(this.f128882d);
        sb3.append(", stops=");
        o2.c.n(", ", str, str2, sb3, this.f128883e);
        sb3.append("tileMode=");
        sb3.append((Object) x1.a(this.f128886h));
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    private k1(List<d0> list, List<Float> list2, long j8, float f14, int i14) {
        this.f128882d = list;
        this.f128883e = list2;
        this.f128884f = j8;
        this.f128885g = f14;
        this.f128886h = i14;
    }

    public /* synthetic */ k1(List list, List list2, long j8, float f14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, list2, j8, f14, i14);
    }
}

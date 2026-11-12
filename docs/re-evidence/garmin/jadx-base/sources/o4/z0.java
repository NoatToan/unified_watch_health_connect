package o4;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BC\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo4/z0;", "Lo4/p1;", "", "", "Lo4/d0;", "colors", "", "stops", "Ln4/c;", TtmlNode.START, TtmlNode.END, "Lo4/x1;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/j;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z0 extends p1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<d0> f129041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Float> f129042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f129043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f129044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f129045h;

    /* JADX WARN: Illegal instructions before constructor call */
    public z0(List list, List list2, long j8, long j14, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        int i16;
        List list3 = (i15 & 2) != 0 ? null : list2;
        if ((i15 & 16) != 0) {
            x1.f129034b.getClass();
            i16 = 0;
        } else {
            i16 = i14;
        }
        this(list, list3, j8, j14, i16, null);
    }

    @Override // o4.p1
    public final Shader b(long j8) {
        long j14 = this.f129043f;
        int i14 = (int) (j14 >> 32);
        if (Float.intBitsToFloat(i14) == Float.POSITIVE_INFINITY) {
            i14 = (int) (j8 >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i14);
        int i15 = (int) (j14 & 4294967295L);
        if (Float.intBitsToFloat(i15) == Float.POSITIVE_INFINITY) {
            i15 = (int) (j8 & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i15);
        long j15 = this.f129044g;
        int i16 = (int) (j15 >> 32);
        if (Float.intBitsToFloat(i16) == Float.POSITIVE_INFINITY) {
            i16 = (int) (j8 >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i16);
        int i17 = (int) (j15 & 4294967295L);
        if (Float.intBitsToFloat(i17) == Float.POSITIVE_INFINITY) {
            i17 = (int) (j8 & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i17);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List<d0> list = this.f129041d;
        List<Float> list2 = this.f129042e;
        n.c(list, list2);
        return new LinearGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)), n.a(list), n.b(list2, list), o.a(this.f129045h));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (!p005kotlin.jvm.internal.s.g(this.f129041d, z0Var.f129041d) || !p005kotlin.jvm.internal.s.g(this.f129042e, z0Var.f129042e) || !n4.c.d(this.f129043f, z0Var.f129043f) || !n4.c.d(this.f129044g, z0Var.f129044g)) {
            return false;
        }
        int i14 = z0Var.f129045h;
        x1.a aVar = x1.f129034b;
        return this.f129045h == i14;
    }

    public final int hashCode() {
        int iHashCode = this.f129041d.hashCode() * 31;
        List<Float> list = this.f129042e;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        n4.c.a aVar = n4.c.f123541b;
        int iE = q6.f.e(q6.f.e(iHashCode2, 31, this.f129043f), 31, this.f129044g);
        x1.a aVar2 = x1.f129034b;
        return Integer.hashCode(this.f129045h) + iE;
    }

    public final String toString() {
        String str;
        long j8 = this.f129043f;
        String str2 = "";
        if (((((j8 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) n4.c.l(j8)) + ", ";
        } else {
            str = "";
        }
        long j14 = this.f129044g;
        if (((((j14 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) n4.c.l(j14)) + ", ";
        }
        StringBuilder sb3 = new StringBuilder("LinearGradient(colors=");
        sb3.append(this.f129041d);
        sb3.append(", stops=");
        o2.c.n(", ", str, str2, sb3, this.f129042e);
        sb3.append("tileMode=");
        sb3.append((Object) x1.a(this.f129045h));
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    private z0(List<d0> list, List<Float> list2, long j8, long j14, int i14) {
        this.f129041d = list;
        this.f129042e = list2;
        this.f129043f = j8;
        this.f129044g = j14;
        this.f129045h = i14;
    }

    public /* synthetic */ z0(List list, List list2, long j8, long j14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, list2, j8, j14, i14);
    }
}

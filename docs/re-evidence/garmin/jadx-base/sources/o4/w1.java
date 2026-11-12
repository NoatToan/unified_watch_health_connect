package o4;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lo4/w1;", "Lo4/p1;", "", "Ln4/c;", TtmlNode.CENTER, "", "Lo4/d0;", "colors", "", "stops", "<init>", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/j;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w1 extends p1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f129030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<d0> f129031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<Float> f129032f;

    public /* synthetic */ w1(long j8, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, list, (i14 & 4) != 0 ? null : list2, null);
    }

    @Override // o4.p1
    public final Shader b(long j8) {
        long jFloatToRawIntBits;
        long j14 = this.f129030d;
        if ((9223372034707292159L & j14) == 9205357640488583168L) {
            jFloatToRawIntBits = n4.h.b(j8);
        } else {
            int i14 = (int) (j14 >> 32);
            if (Float.intBitsToFloat(i14) == Float.POSITIVE_INFINITY) {
                i14 = (int) (j8 >> 32);
            }
            float fIntBitsToFloat = Float.intBitsToFloat(i14);
            int i15 = (int) (j14 & 4294967295L);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i15) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j8 & 4294967295L)) : Float.intBitsToFloat(i15);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
            n4.c.a aVar = n4.c.f123541b;
        }
        List<d0> list = this.f129031e;
        List<Float> list2 = this.f129032f;
        n.c(list, list2);
        return new SweepGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), n.a(list), n.b(list2, list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return n4.c.d(this.f129030d, w1Var.f129030d) && p005kotlin.jvm.internal.s.g(this.f129031e, w1Var.f129031e) && p005kotlin.jvm.internal.s.g(this.f129032f, w1Var.f129032f);
    }

    public final int hashCode() {
        n4.c.a aVar = n4.c.f123541b;
        int iB = lc.u0.b(Long.hashCode(this.f129030d) * 31, 31, this.f129031e);
        List<Float> list = this.f129032f;
        return iB + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str;
        long j8 = this.f129030d;
        if ((9223372034707292159L & j8) != 9205357640488583168L) {
            str = "center=" + ((Object) n4.c.l(j8)) + ", ";
        } else {
            str = "";
        }
        StringBuilder sbL = hb.a.l("SweepGradient(", str, "colors=");
        sbL.append(this.f129031e);
        sbL.append(", stops=");
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f129032f, sbL);
    }

    private w1(long j8, List<d0> list, List<Float> list2) {
        this.f129030d = j8;
        this.f129031e = list;
        this.f129032f = list2;
    }

    public /* synthetic */ w1(long j8, List list, List list2, p005kotlin.jvm.internal.j jVar) {
        this(j8, list, list2);
    }
}

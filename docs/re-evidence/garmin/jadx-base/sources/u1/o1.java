package u1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu1/o1;", "", "Lo4/d0;", "glowColor", "Lc2/h2;", "drawPadding", "<init>", "(JLc2/h2;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f167648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2.h2 f167649b;

    public /* synthetic */ o1(long j8, c2.h2 h2Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? o4.f0.d(4284900966L) : j8, (i14 & 2) != 0 ? c2.l.c(0.0f, 0.0f, 3) : h2Var, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        o1 o1Var = (o1) obj;
        return o4.d0.d(this.f167648a, o1Var.f167648a) && p005kotlin.jvm.internal.s.g(this.f167649b, o1Var.f167649b);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return this.f167649b.hashCode() + (Long.hashCode(this.f167648a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OverscrollConfiguration(glowColor=");
        q2.m(this.f167648a, ", drawPadding=", sb3);
        sb3.append(this.f167649b);
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    private o1(long j8, c2.h2 h2Var) {
        this.f167648a = j8;
        this.f167649b = h2Var;
    }

    public /* synthetic */ o1(long j8, c2.h2 h2Var, p005kotlin.jvm.internal.j jVar) {
        this(j8, h2Var);
    }
}

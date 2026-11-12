package r1;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lr1/o2;", "", "Lr1/y1;", "fade", "Lr1/l2;", "slide", "Lr1/h0;", "changeSize", "Lr1/e2;", "scale", "Lr1/r2;", "veil", "", "hold", "", "effectsMap", "<init>", "(Lr1/y1;Lr1/l2;Lr1/h0;Lr1/e2;Lr1/r2;ZLjava/util/Map;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f149181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l2 f149182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f149183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2 f149184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r2 f149185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f149186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<Object, Object> f149187g;

    /* JADX WARN: Illegal instructions before constructor call */
    public o2(y1 y1Var, l2 l2Var, h0 h0Var, e2 e2Var, r2 r2Var, boolean z14, Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        y1Var = (i14 & 1) != 0 ? null : y1Var;
        l2Var = (i14 & 2) != 0 ? null : l2Var;
        h0Var = (i14 & 4) != 0 ? null : h0Var;
        e2Var = (i14 & 8) != 0 ? null : e2Var;
        r2Var = (i14 & 16) != 0 ? null : r2Var;
        z14 = (i14 & 32) != 0 ? false : z14;
        if ((i14 & 64) != 0) {
            map = p13.k0.f134949a;
            map.getClass();
        }
        this(y1Var, l2Var, h0Var, e2Var, r2Var, z14, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return p005kotlin.jvm.internal.s.g(this.f149181a, o2Var.f149181a) && p005kotlin.jvm.internal.s.g(this.f149182b, o2Var.f149182b) && p005kotlin.jvm.internal.s.g(this.f149183c, o2Var.f149183c) && p005kotlin.jvm.internal.s.g(this.f149184d, o2Var.f149184d) && p005kotlin.jvm.internal.s.g(this.f149185e, o2Var.f149185e) && this.f149186f == o2Var.f149186f && p005kotlin.jvm.internal.s.g(this.f149187g, o2Var.f149187g);
    }

    public final int hashCode() {
        y1 y1Var = this.f149181a;
        int iHashCode = (y1Var == null ? 0 : y1Var.hashCode()) * 31;
        l2 l2Var = this.f149182b;
        int iHashCode2 = (iHashCode + (l2Var == null ? 0 : l2Var.hashCode())) * 31;
        h0 h0Var = this.f149183c;
        int iHashCode3 = (iHashCode2 + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        e2 e2Var = this.f149184d;
        int iHashCode4 = (iHashCode3 + (e2Var == null ? 0 : e2Var.hashCode())) * 31;
        r2 r2Var = this.f149185e;
        return this.f149187g.hashCode() + q6.f.g((iHashCode4 + (r2Var != null ? r2Var.hashCode() : 0)) * 31, 31, this.f149186f);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f149181a + ", slide=" + this.f149182b + ", changeSize=" + this.f149183c + ", scale=" + this.f149184d + ", veil=" + this.f149185e + ", hold=" + this.f149186f + ", effectsMap=" + this.f149187g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public o2() {
        this(null, null, null, null, null, false, null, 127, null);
    }

    public o2(y1 y1Var, l2 l2Var, h0 h0Var, e2 e2Var, r2 r2Var, boolean z14, Map<Object, Object> map) {
        this.f149181a = y1Var;
        this.f149182b = l2Var;
        this.f149183c = h0Var;
        this.f149184d = e2Var;
        this.f149185e = r2Var;
        this.f149186f = z14;
        this.f149187g = map;
    }
}

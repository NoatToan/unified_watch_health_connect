package h33;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f81402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f81403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<x33.c, h0> f81404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f81405d;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(h0 h0Var, h0 h0Var2, Map<x33.c, ? extends h0> map) {
        h0Var.getClass();
        map.getClass();
        this.f81402a = h0Var;
        this.f81403b = h0Var2;
        this.f81404c = map;
        o13.m.b(new z(this));
        h0 h0Var3 = h0.IGNORE;
        this.f81405d = h0Var == h0Var3 && h0Var2 == h0Var3 && map.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f81402a == a0Var.f81402a && this.f81403b == a0Var.f81403b && p005kotlin.jvm.internal.s.g(this.f81404c, a0Var.f81404c);
    }

    public final int hashCode() {
        int iHashCode = this.f81402a.hashCode() * 31;
        h0 h0Var = this.f81403b;
        return this.f81404c.hashCode() + ((iHashCode + (h0Var == null ? 0 : h0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f81402a + ", migrationLevel=" + this.f81403b + ", userDefinedLevelForSpecificAnnotation=" + this.f81404c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(h0 h0Var, h0 h0Var2, Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        h0Var2 = (i14 & 2) != 0 ? null : h0Var2;
        if ((i14 & 4) != 0) {
            map = p13.k0.f134949a;
            map.getClass();
        }
        this(h0Var, h0Var2, map);
    }
}

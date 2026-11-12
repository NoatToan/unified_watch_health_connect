package q3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p1.t0;
import p1.u0;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001\u0088\u0001\u0004\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0005¨\u0006\u0006"}, d2 = {"Lq3/f;", "", "Key", "Scope", "map", "Lp1/t0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f<Key, Scope> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0<Object, Object> f142376a;

    public static final void a(t0<Object, Object> t0Var, Key key, Scope scope) {
        int i14 = t0Var.i(key);
        boolean z14 = i14 < 0;
        Object obj = z14 ? null : t0Var.f134722c[i14];
        if (obj != null) {
            if (obj instanceof u0) {
                ((u0) obj).d(scope);
            } else if (obj != scope) {
                u0 u0Var = new u0(0, 1, null);
                u0Var.d(obj);
                u0Var.d(scope);
                scope = (Scope) u0Var;
            }
            scope = (Scope) obj;
        }
        if (!z14) {
            t0Var.f134722c[i14] = scope;
            return;
        }
        int i15 = ~i14;
        t0Var.f134721b[i15] = key;
        t0Var.f134722c[i15] = scope;
    }

    public static final boolean b(t0<Object, Object> t0Var, Key key, Scope scope) {
        Object objD = t0Var.d(key);
        if (objD == null) {
            return false;
        }
        if (!(objD instanceof u0)) {
            if (!objD.equals(scope)) {
                return false;
            }
            t0Var.k(key);
            return true;
        }
        u0 u0Var = (u0) objD;
        boolean zL = u0Var.l(scope);
        if (zL && u0Var.b()) {
            t0Var.k(key);
        }
        return zL;
    }

    public static final void c(t0<Object, Object> t0Var, Scope scope) {
        boolean zB;
        long[] jArr = t0Var.f134720a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j8 = jArr[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j8) < 128) {
                        int i17 = (i14 << 3) + i16;
                        Object obj = t0Var.f134721b[i17];
                        Object obj2 = t0Var.f134722c[i17];
                        if (obj2 instanceof u0) {
                            u0 u0Var = (u0) obj2;
                            u0Var.l(scope);
                            zB = u0Var.b();
                        } else {
                            zB = obj2 == scope;
                        }
                        if (zB) {
                            t0Var.l(i17);
                        }
                    }
                    j8 >>= 8;
                }
                if (i15 != 8) {
                    return;
                }
            }
            if (i14 == length) {
                return;
            } else {
                i14++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return s.g(this.f142376a, ((f) obj).f142376a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f142376a.hashCode();
    }

    public final String toString() {
        return "ScopeMap(map=" + this.f142376a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

package q3;

import ch.qos.logback.core.CoreConstants;
import e23.l;
import j23.t;
import n23.j;
import p005kotlin.Metadata;
import p1.b1;
import p1.q0;
import p1.t0;
import p13.s;
import p3.h1;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001\u0088\u0001\u0004\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0005¨\u0006\u0006"}, d2 = {"Lq3/b;", "", "K", "V", "map", "Lp1/t0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0<Object, Object> f142355a;

    private /* synthetic */ b(t0 t0Var) {
        this.f142355a = t0Var;
    }

    public static final void a(t0<Object, Object> t0Var, K k14, V v14) {
        int i14 = t0Var.i(k14);
        boolean z14 = i14 < 0;
        Object obj = z14 ? null : t0Var.f134722c[i14];
        if (obj != null) {
            if (obj instanceof q0) {
                q0 q0Var = (q0) obj;
                q0Var.g(v14);
                v14 = (V) q0Var;
            } else {
                Object[] objArr = b1.f134677a;
                q0 q0Var2 = new q0(2);
                q0Var2.g(obj);
                q0Var2.g(v14);
                v14 = (V) q0Var2;
            }
        }
        if (!z14) {
            t0Var.f134722c[i14] = v14;
            return;
        }
        int i15 = ~i14;
        t0Var.f134721b[i15] = k14;
        t0Var.f134722c[i15] = v14;
    }

    public static final /* synthetic */ b b(t0 t0Var) {
        return new b(t0Var);
    }

    public static t0 c() {
        return new t0(0, 1, null);
    }

    public static final Object d(t0 t0Var, h1 h1Var) {
        Object objD = t0Var.d(h1Var);
        if (objD == null) {
            return null;
        }
        if (!(objD instanceof q0)) {
            t0Var.k(h1Var);
            return objD;
        }
        q0 q0Var = (q0) objD;
        if (q0Var.d()) {
            j.s("List is empty.");
            return null;
        }
        int i14 = q0Var.f134668b - 1;
        E eB = q0Var.b(i14);
        q0Var.l(i14);
        eB.getClass();
        if (q0Var.d()) {
            t0Var.k(h1Var);
        }
        if (q0Var.f134668b == 1) {
            t0Var.m(h1Var, q0Var.a());
        }
        return eB;
    }

    public static final void e(t0 t0Var, h1 h1Var, l lVar) {
        Object objD = t0Var.d(h1Var);
        if (objD != null) {
            if (!(objD instanceof q0)) {
                if (((Boolean) lVar.invoke(objD)).booleanValue()) {
                    t0Var.k(h1Var);
                    return;
                }
                return;
            }
            q0 q0Var = (q0) objD;
            int i14 = q0Var.f134668b;
            Object[] objArr = q0Var.f134667a;
            int i15 = 0;
            j23.l lVarO = t.o(0, i14);
            int i16 = lVarO.f96796a;
            int i17 = lVarO.f96797b;
            if (i16 <= i17) {
                while (true) {
                    objArr[i16 - i15] = objArr[i16];
                    if (((Boolean) lVar.invoke(objArr[i16])).booleanValue()) {
                        i15++;
                    }
                    if (i16 == i17) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            s.m(i14 - i15, i14, null, objArr);
            q0Var.f134668b -= i15;
            if (q0Var.d()) {
                t0Var.k(h1Var);
            }
            if (q0Var.f134668b == 1) {
                t0Var.m(h1Var, q0Var.a());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0060 A[LOOP:0: B:9:0x001e->B:22:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0063 A[EDGE_INSN: B:25:0x0063->B:23:0x0063 BREAK  A[LOOP:0: B:9:0x001e->B:22:0x0060], SYNTHETIC] */
    public static final q0 f(t0 t0Var) {
        if (t0Var.e()) {
            q0 q0Var = b1.f134678b;
            q0Var.getClass();
            return q0Var;
        }
        q0 q0Var2 = new q0(0, 1, null);
        Object[] objArr = t0Var.f134722c;
        long[] jArr = t0Var.f134720a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j8 = jArr[i14];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i14 != length) {
                        break;
                        break;
                    }
                    i14++;
                } else {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j8) < 128) {
                            Object obj = objArr[(i14 << 3) + i16];
                            if (obj instanceof q0) {
                                q0Var2.i((q0) obj);
                            } else {
                                obj.getClass();
                                q0Var2.g(obj);
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                    if (i14 != length) {
                        break;
                    }
                    i14++;
                }
            }
        }
        return q0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return p005kotlin.jvm.internal.s.g(this.f142355a, ((b) obj).f142355a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f142355a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f142355a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

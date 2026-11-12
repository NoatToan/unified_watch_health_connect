package p5;

import java.util.Iterator;
import java.util.Map;
import kotlin.o3;
import p005kotlin.Metadata;
import p1.g1;
import p1.i1;
import p1.t0;
import p1.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp5/q;", "Lp5/k0;", "", "", "Lp5/j0;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements k0, Iterable<Map.Entry<? extends j0<?>, ? extends Object>>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0<j0<?>, Object> f136085a = g1.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p1.e0 f136086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u0<j0<?>> f136087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f136088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f136089e;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p5.k0
    public final <T> void a(j0<T> j0Var, T t7) {
        boolean z14 = t7 instanceof a;
        t0<j0<?>, Object> t0Var = this.f136085a;
        if (z14 && t0Var.b(j0Var)) {
            Object objD = t0Var.d(j0Var);
            objD.getClass();
            a aVar = (a) objD;
            a aVar2 = (a) t7;
            String str = aVar2.f135945a;
            if (str == null) {
                str = aVar.f135945a;
            }
            o13.h hVar = aVar2.f135946b;
            if (hVar == null) {
                hVar = aVar.f135946b;
            }
            t0Var.m(j0Var, new a(str, hVar));
        } else {
            t0Var.m(j0Var, t7);
        }
        if (j0Var.f136025d != null) {
            if (this.f136087c == null) {
                this.f136087c = i1.a();
            }
            u0<j0<?>> u0Var = this.f136087c;
            if (u0Var != null) {
                u0Var.d(j0Var);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005d A[LOOP:0: B:5:0x0026->B:15:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[EDGE_INSN: B:18:0x0060->B:16:0x0060 BREAK  A[LOOP:0: B:5:0x0026->B:15:0x005d], SYNTHETIC] */
    public final q b() {
        q qVar = new q();
        qVar.f136088d = this.f136088d;
        qVar.f136089e = this.f136089e;
        t0<j0<?>, Object> t0Var = qVar.f136085a;
        t0Var.getClass();
        t0<j0<?>, Object> t0Var2 = this.f136085a;
        t0Var2.getClass();
        Object[] objArr = t0Var2.f134721b;
        Object[] objArr2 = t0Var2.f134722c;
        long[] jArr = t0Var2.f134720a;
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
                            int i17 = (i14 << 3) + i16;
                            t0Var.m((j0<?>) objArr[i17], objArr2[i17]);
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
        return qVar;
    }

    public final <T> T c(j0<T> j0Var) {
        T t7 = (T) this.f136085a.d(j0Var);
        if (t7 != null) {
            return t7;
        }
        kg.f.o("Key not present: ", j0Var, " - consider getOrElse or getOrNull");
        return null;
    }

    public final <T> T d(j0<T> j0Var, e23.a<? extends T> aVar) {
        T t7 = (T) this.f136085a.d(j0Var);
        return t7 == null ? aVar.invoke() : t7;
    }

    public final void e(q qVar) {
        t0<j0<?>, Object> t0Var = qVar.f136085a;
        Object[] objArr = t0Var.f134721b;
        Object[] objArr2 = t0Var.f134722c;
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
                        Object obj = objArr[i17];
                        Object obj2 = objArr2[i17];
                        j0<?> j0Var = (j0) obj;
                        t0<j0<?>, Object> t0Var2 = this.f136085a;
                        Object objD = t0Var2.d(j0Var);
                        j0Var.getClass();
                        Object objInvoke = j0Var.f136023b.invoke(objD, obj2);
                        if (objInvoke != null) {
                            t0Var2.m(j0Var, objInvoke);
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
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.f136085a, qVar.f136085a) && this.f136088d == qVar.f136088d && this.f136089e == qVar.f136089e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136089e) + q6.f.g(this.f136085a.hashCode() * 31, 31, this.f136088d);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends j0<?>, ? extends Object>> iterator() {
        p1.e0 e0Var = this.f136086b;
        if (e0Var == null) {
            t0<j0<?>, Object> t0Var = this.f136085a;
            t0Var.getClass();
            p1.e0 e0Var2 = new p1.e0(t0Var);
            this.f136086b = e0Var2;
            e0Var = e0Var2;
        }
        return e0Var.entrySet().iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder();
        if (this.f136088d) {
            sb3.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f136089e) {
            sb3.append(str);
            sb3.append("isClearingSemantics=true");
            str = ", ";
        }
        t0<j0<?>, Object> t0Var = this.f136085a;
        Object[] objArr = t0Var.f134721b;
        Object[] objArr2 = t0Var.f134722c;
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
                            int i17 = (i14 << 3) + i16;
                            Object obj = objArr[i17];
                            Object obj2 = objArr2[i17];
                            sb3.append(str);
                            sb3.append(((j0) obj).f136022a);
                            sb3.append(" : ");
                            sb3.append(obj2);
                            str = ", ";
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
        return o3.b(this) + "{ " + ((Object) sb3) + " }";
    }
}

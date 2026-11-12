package p1;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp1/z;", "E", "", "", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class z<E> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f134878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f134879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f134880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f134881d;

    public z(int i14) {
        if (i14 == 0) {
            this.f134879b = q1.a.f142055b;
            this.f134880c = q1.a.f142056c;
            return;
        }
        int i15 = i14 * 8;
        for (int i16 = 4; i16 < 32; i16++) {
            int i17 = (1 << i16) - 12;
            if (i15 <= i17) {
                i15 = i17;
                break;
            }
        }
        int i18 = i15 / 8;
        this.f134879b = new long[i18];
        this.f134880c = new Object[i18];
    }

    public final void a() {
        int i14 = this.f134881d;
        Object[] objArr = this.f134880c;
        for (int i15 = 0; i15 < i14; i15++) {
            objArr[i15] = null;
        }
        this.f134881d = 0;
        this.f134878a = false;
    }

    public final E b(long j8) {
        E e4;
        int iB = q1.a.b(this.f134879b, this.f134881d, j8);
        if (iB < 0 || (e4 = (E) this.f134880c[iB]) == b0.f134674a) {
            return null;
        }
        return e4;
    }

    public final int c(long j8) {
        if (this.f134878a) {
            int i14 = this.f134881d;
            long[] jArr = this.f134879b;
            Object[] objArr = this.f134880c;
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                Object obj = objArr[i16];
                if (obj != b0.f134674a) {
                    if (i16 != i15) {
                        jArr[i15] = jArr[i16];
                        objArr[i15] = obj;
                        objArr[i16] = null;
                    }
                    i15++;
                }
            }
            this.f134878a = false;
            this.f134881d = i15;
        }
        return q1.a.b(this.f134879b, this.f134881d, j8);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        z zVar = (z) objClone;
        zVar.f134879b = (long[]) this.f134879b.clone();
        zVar.f134880c = (Object[]) this.f134880c.clone();
        return zVar;
    }

    public final boolean d() {
        return h() == 0;
    }

    public final long e(int i14) {
        int i15;
        if (i14 < 0 || i14 >= (i15 = this.f134881d)) {
            vb.h.s(am.j.h(i14, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.f134878a) {
            long[] jArr = this.f134879b;
            Object[] objArr = this.f134880c;
            int i16 = 0;
            for (int i17 = 0; i17 < i15; i17++) {
                Object obj = objArr[i17];
                if (obj != b0.f134674a) {
                    if (i17 != i16) {
                        jArr[i16] = jArr[i17];
                        objArr[i16] = obj;
                        objArr[i17] = null;
                    }
                    i16++;
                }
            }
            this.f134878a = false;
            this.f134881d = i16;
        }
        return this.f134879b[i14];
    }

    public final void f(long j8, E e4) {
        Object obj = b0.f134674a;
        int iB = q1.a.b(this.f134879b, this.f134881d, j8);
        if (iB >= 0) {
            this.f134880c[iB] = e4;
            return;
        }
        int i14 = ~iB;
        int i15 = this.f134881d;
        if (i14 < i15) {
            Object[] objArr = this.f134880c;
            if (objArr[i14] == obj) {
                this.f134879b[i14] = j8;
                objArr[i14] = e4;
                return;
            }
        }
        if (this.f134878a) {
            long[] jArr = this.f134879b;
            if (i15 >= jArr.length) {
                Object[] objArr2 = this.f134880c;
                int i16 = 0;
                for (int i17 = 0; i17 < i15; i17++) {
                    Object obj2 = objArr2[i17];
                    if (obj2 != obj) {
                        if (i17 != i16) {
                            jArr[i16] = jArr[i17];
                            objArr2[i16] = obj2;
                            objArr2[i17] = null;
                        }
                        i16++;
                    }
                }
                this.f134878a = false;
                this.f134881d = i16;
                i14 = ~q1.a.b(this.f134879b, i16, j8);
            }
        }
        int i18 = this.f134881d;
        if (i18 >= this.f134879b.length) {
            int i19 = (i18 + 1) * 8;
            for (int i24 = 4; i24 < 32; i24++) {
                int i25 = (1 << i24) - 12;
                if (i19 <= i25) {
                    i19 = i25;
                    break;
                }
            }
            int i26 = i19 / 8;
            this.f134879b = Arrays.copyOf(this.f134879b, i26);
            this.f134880c = Arrays.copyOf(this.f134880c, i26);
        }
        int i27 = this.f134881d;
        if (i27 - i14 != 0) {
            long[] jArr2 = this.f134879b;
            int i28 = i14 + 1;
            p13.s.g(jArr2, jArr2, i28, i14, i27);
            Object[] objArr3 = this.f134880c;
            p13.s.h(objArr3, objArr3, i28, i14, this.f134881d);
        }
        this.f134879b[i14] = j8;
        this.f134880c[i14] = e4;
        this.f134881d++;
    }

    public final void g(long j8) {
        int iB = q1.a.b(this.f134879b, this.f134881d, j8);
        if (iB >= 0) {
            Object[] objArr = this.f134880c;
            Object obj = objArr[iB];
            Object obj2 = b0.f134674a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f134878a = true;
            }
        }
    }

    public final int h() {
        if (this.f134878a) {
            int i14 = this.f134881d;
            long[] jArr = this.f134879b;
            Object[] objArr = this.f134880c;
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                Object obj = objArr[i16];
                if (obj != b0.f134674a) {
                    if (i16 != i15) {
                        jArr[i15] = jArr[i16];
                        objArr[i15] = obj;
                        objArr[i16] = null;
                    }
                    i15++;
                }
            }
            this.f134878a = false;
            this.f134881d = i15;
        }
        return this.f134881d;
    }

    public final E i(int i14) {
        int i15;
        if (i14 < 0 || i14 >= (i15 = this.f134881d)) {
            vb.h.s(am.j.h(i14, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.f134878a) {
            long[] jArr = this.f134879b;
            Object[] objArr = this.f134880c;
            int i16 = 0;
            for (int i17 = 0; i17 < i15; i17++) {
                Object obj = objArr[i17];
                if (obj != b0.f134674a) {
                    if (i17 != i16) {
                        jArr[i16] = jArr[i17];
                        objArr[i16] = obj;
                        objArr[i17] = null;
                    }
                    i16++;
                }
            }
            this.f134878a = false;
            this.f134881d = i16;
        }
        return (E) this.f134880c[i14];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder(this.f134881d * 28);
        sb3.append(CoreConstants.CURLY_LEFT);
        int i14 = this.f134881d;
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 > 0) {
                sb3.append(", ");
            }
            sb3.append(e(i15));
            sb3.append('=');
            E eI = i(i15);
            if (eI != sb3) {
                sb3.append(eI);
            } else {
                sb3.append("(this Map)");
            }
        }
        sb3.append(CoreConstants.CURLY_RIGHT);
        return sb3.toString();
    }

    public z() {
        this(0, 1, null);
    }

    public /* synthetic */ z(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 10 : i14);
    }
}

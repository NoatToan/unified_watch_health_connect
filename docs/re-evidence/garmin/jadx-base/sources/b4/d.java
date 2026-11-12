package b4;

import p005kotlin.Metadata;
import p1.q0;
import p1.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb4/d;", "Lb4/f;", "<init>", "()V", "runtime-retain"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15693c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15691a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t0<Object, Object> f15694d = new t0<>(0, 1, null);

    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0064 A[LOOP:0: B:5:0x000e->B:25:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[EDGE_INSN: B:29:0x0067->B:26:0x0067 BREAK  A[LOOP:0: B:5:0x000e->B:25:0x0064], SYNTHETIC] */
    public final void a() {
        t0<Object, Object> t0Var = this.f15694d;
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
                                q0 q0Var = (q0) obj;
                                Object[] objArr2 = q0Var.f134667a;
                                int i17 = q0Var.f134668b;
                                for (int i18 = 0; i18 < i17; i18++) {
                                    Object obj2 = objArr2[i18];
                                    if (obj2 instanceof e) {
                                        ((e) obj2).a();
                                    }
                                }
                            } else if (obj instanceof e) {
                                ((e) obj).a();
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    } else if (i14 != length) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        }
        t0Var.g();
    }
}

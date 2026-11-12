package w5;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    public static final Object a(int i14, Object obj, p pVar, f0 f0Var, int i15) {
        boolean z14;
        boolean z15;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        c0.a aVar = c0.f182075b;
        boolean z16 = false;
        if ((i14 & 1) == 0 || p005kotlin.jvm.internal.s.g(pVar.getWeight(), f0Var)) {
            z14 = false;
        } else {
            f0.f182097b.getClass();
            f0 f0Var2 = f0.f182100e;
            if (f0Var.compareTo(f0Var2) < 0 || p005kotlin.jvm.internal.s.h(pVar.getWeight().f182107a, f0Var2.f182107a) >= 0) {
                z14 = false;
            } else {
                z14 = true;
            }
        }
        if ((i14 & 2) != 0) {
            int iB = pVar.b();
            b0.a aVar2 = b0.f182070b;
            if (i15 == iB) {
                z15 = false;
            } else {
                z15 = true;
            }
        } else {
            z15 = false;
        }
        if (!z15 && !z14) {
            return obj;
        }
        int i16 = z14 ? f0Var.f182107a : pVar.getWeight().f182107a;
        if (z15) {
            b0.f182070b.getClass();
            if (i15 == b0.f182071c) {
                z16 = true;
            }
        } else {
            int iB2 = pVar.b();
            b0.f182070b.getClass();
            if (iB2 == b0.f182071c) {
                z16 = true;
            }
        }
        t0.f182165a.getClass();
        return Typeface.create((Typeface) obj, i16, z16);
    }
}

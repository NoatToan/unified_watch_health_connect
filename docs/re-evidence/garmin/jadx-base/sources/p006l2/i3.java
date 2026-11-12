package p006l2;

import f5.c0;
import n4.c;
import n4.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import s5.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll2/i3;", "", "Ls5/q0;", "value", "Lf5/c0;", "innerTextFieldCoordinates", "decorationBoxCoordinates", "<init>", "(Ls5/q0;Lf5/c0;Lf5/c0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f108575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0 f108576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c0 f108577c;

    public /* synthetic */ i3(q0 q0Var, c0 c0Var, c0 c0Var2, int i14, j jVar) {
        this(q0Var, (i14 & 2) != 0 ? null : c0Var, (i14 & 4) != 0 ? null : c0Var2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    public final long a(long j8) {
        d dVarJ0;
        c0 c0Var = this.f108576b;
        if (c0Var == null) {
            d.f123545e.getClass();
            dVarJ0 = d.f123546f;
        } else {
            if (c0Var.isAttached()) {
                c0 c0Var2 = this.f108577c;
                dVarJ0 = c0Var2 != null ? c0Var2.j0(c0Var, true) : null;
            } else {
                d.f123545e.getClass();
                dVarJ0 = d.f123546f;
            }
            if (dVarJ0 == null) {
                d.f123545e.getClass();
                dVarJ0 = d.f123546f;
            }
        }
        int i14 = (int) (j8 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i14);
        float fIntBitsToFloat2 = dVarJ0.f123547a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i14);
            fIntBitsToFloat2 = dVarJ0.f123549c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i14);
            }
        }
        int i15 = (int) (j8 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i15);
        float fIntBitsToFloat5 = dVarJ0.f123548b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i15);
            fIntBitsToFloat5 = dVarJ0.f123550d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i15);
            }
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
        c.a aVar = c.f123541b;
        return jFloatToRawIntBits;
    }

    public final int b(long j8, boolean z14) {
        if (z14) {
            j8 = a(j8);
        }
        return this.f108575a.f157281b.g(d(j8));
    }

    public final boolean c(long j8) {
        long jD = d(a(j8));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        q0 q0Var = this.f108575a;
        int iE = q0Var.f157281b.e(fIntBitsToFloat);
        int i14 = (int) (jD >> 32);
        return Float.intBitsToFloat(i14) >= q0Var.g(iE) && Float.intBitsToFloat(i14) <= q0Var.h(iE);
    }

    public final long d(long j8) {
        c0 c0Var;
        c0 c0Var2 = this.f108576b;
        if (c0Var2 == null) {
            return j8;
        }
        if (!c0Var2.isAttached()) {
            c0Var2 = null;
        }
        if (c0Var2 == null || (c0Var = this.f108577c) == null) {
            return j8;
        }
        c0 c0Var3 = c0Var.isAttached() ? c0Var : null;
        return c0Var3 == null ? j8 : c0Var2.b0(c0Var3, j8);
    }

    public final long e(long j8) {
        c0 c0Var;
        c0 c0Var2 = this.f108576b;
        if (c0Var2 == null) {
            return j8;
        }
        if (!c0Var2.isAttached()) {
            c0Var2 = null;
        }
        if (c0Var2 == null || (c0Var = this.f108577c) == null) {
            return j8;
        }
        c0 c0Var3 = c0Var.isAttached() ? c0Var : null;
        return c0Var3 == null ? j8 : c0Var3.b0(c0Var2, j8);
    }

    public i3(q0 q0Var, c0 c0Var, c0 c0Var2) {
        this.f108575a = q0Var;
        this.f108576b = c0Var;
        this.f108577c = c0Var2;
    }
}

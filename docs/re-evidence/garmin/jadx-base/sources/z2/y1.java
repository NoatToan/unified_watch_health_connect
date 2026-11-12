package z2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import p005kotlin.Metadata;
import p006l2.i3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lz2/y1;", "Lz2/d;", "Lx5/l0;", "currentValue", "Lx5/c0;", "offsetMapping", "Ll2/i3;", "layoutResultProxy", "Lz2/s2;", RemoteConfigConstants.ResponseFieldKey.STATE, "<init>", "(Lx5/l0;Lx5/c0;Ll2/i3;Lz2/s2;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y1 extends d<y1> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x5.l0 f201846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i3 f201847i;

    public y1(x5.l0 l0Var, x5.c0 c0Var, i3 i3Var, s2 s2Var) {
        super(l0Var.f188878a, l0Var.f188879b, i3Var != null ? i3Var.f108575a : null, c0Var, s2Var, null);
        this.f201846h = l0Var;
        this.f201847i = i3Var;
    }

    public final List<x5.k> q(e23.l<? super y1, ? extends x5.k> lVar) {
        if (!s5.w0.e(this.f201548f)) {
            return p13.x.k(new x5.b("", 0), new x5.k0(s5.w0.h(this.f201548f), s5.w0.h(this.f201548f)));
        }
        x5.k kVarInvoke = lVar.invoke(this);
        if (kVarInvoke != null) {
            return p13.w.c(kVarInvoke);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int r(i3 i3Var, int i14) {
        n4.d dVarJ0;
        f5.c0 c0Var = i3Var.f108576b;
        s5.q0 q0Var = i3Var.f108575a;
        if (c0Var == null) {
            n4.d.f123545e.getClass();
            dVarJ0 = n4.d.f123546f;
        } else {
            f5.c0 c0Var2 = i3Var.f108577c;
            dVarJ0 = c0Var2 != null ? c0Var2.j0(c0Var, true) : null;
            if (dVarJ0 == null) {
                n4.d.f123545e.getClass();
                dVarJ0 = n4.d.f123546f;
            }
        }
        long j8 = this.f201846h.f188879b;
        s5.w0.a aVar = s5.w0.f157315b;
        int i15 = (int) (j8 & 4294967295L);
        x5.c0 c0Var3 = this.f201546d;
        n4.d dVarC = q0Var.c(c0Var3.b(i15));
        float f14 = dVarC.f123547a;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (dVarJ0.g() & 4294967295L)) * i14) + dVarC.f123548b;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f14);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L;
        n4.c.a aVar2 = n4.c.f123541b;
        return c0Var3.a(q0Var.f157281b.g(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y1(x5.l0 l0Var, x5.c0 c0Var, i3 i3Var, s2 s2Var, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            x5.c0.f188826a.getClass();
            c0Var = x5.c0.a.f188828b;
        }
        this(l0Var, c0Var, i3Var, (i14 & 8) != 0 ? new s2() : s2Var);
    }
}

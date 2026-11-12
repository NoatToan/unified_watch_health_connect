package p006l2;

import g6.m;
import g8.i;
import n4.c;
import n4.d;
import n4.g;
import o4.h;
import o4.y;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import s5.q0;
import s5.w0;
import x5.c0;
import x5.l0;
import x5.p0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ll2/t2;", "", "<init>", "()V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f108797a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll2/t2$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(y yVar, long j8, c0 c0Var, q0 q0Var, h hVar) {
            int iB = c0Var.b(w0.h(j8));
            int iB2 = c0Var.b(w0.g(j8));
            if (iB != iB2) {
                yVar.r(q0Var.k(iB, iB2), hVar);
            }
        }

        public static void b(l0 l0Var, n2 n2Var, q0 q0Var, f5.c0 c0Var, p0 p0Var, boolean z14, c0 c0Var2) {
            d dVarB;
            if (z14) {
                int iB = c0Var2.b(w0.g(l0Var.f188879b));
                String str = u2.f108806a;
                if (iB < q0Var.f157280a.f157265a.f157138b.length()) {
                    dVarB = q0Var.b(iB);
                } else {
                    dVarB = iB != 0 ? q0Var.b(iB - 1) : new d(0.0f, 0.0f, 1.0f, (int) (m.a(u2.a(n2Var.f108675b, n2Var.f108680g, n2Var.f108681h, u2.f108806a, 1)).f76013a & 4294967295L));
                }
                float f14 = dVarB.f123548b;
                float f15 = dVarB.f123547a;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
                c.a aVar = c.f123541b;
                long jB = c0Var.B(jFloatToRawIntBits);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jB >> 32)))) << 32);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(dVarB.f123549c - f15)) << 32) | (((long) Float.floatToRawIntBits(dVarB.f123550d - f14)) & 4294967295L);
                g.a aVar2 = g.f123559b;
                d dVarG = i.g(jFloatToRawIntBits2, jFloatToRawIntBits3);
                if (s.g(p0Var.f188928a.f188887b.get(), p0Var)) {
                    p0Var.f188929b.a(dVarG);
                }
            }
        }

        private a() {
        }
    }
}

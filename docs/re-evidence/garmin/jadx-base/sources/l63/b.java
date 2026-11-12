package l63;

import i63.i;
import kotlinx.serialization.SerializationException;
import m63.o1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ll63/b;", "Ll63/f;", "Ll63/d;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b implements f, d {
    @Override // l63.f
    public void A(double d14) {
        F(Double.valueOf(d14));
    }

    @Override // l63.d
    public final void B(k63.e eVar, int i14, double d14) {
        eVar.getClass();
        E(eVar, i14);
        A(d14);
    }

    @Override // l63.f
    public void D() {
        throw new SerializationException("'null' is not supported by default");
    }

    public void E(k63.e eVar, int i14) {
        eVar.getClass();
    }

    public void F(Object obj) {
        obj.getClass();
        StringBuilder sb3 = new StringBuilder("Non-serializable ");
        Class<?> cls = obj.getClass();
        t0 t0Var = s0.f105811a;
        sb3.append(t0Var.b(cls));
        sb3.append(" is not supported by ");
        sb3.append(t0Var.b(getClass()));
        sb3.append(" encoder");
        throw new SerializationException(sb3.toString());
    }

    @Override // l63.d
    public void b(k63.e eVar) {
        eVar.getClass();
    }

    @Override // l63.f
    public d c(k63.e eVar) {
        eVar.getClass();
        return this;
    }

    @Override // l63.d
    public <T> void d(k63.e eVar, int i14, i<? super T> iVar, T t7) {
        eVar.getClass();
        iVar.getClass();
        E(eVar, i14);
        if (iVar.getF94809a().b()) {
            l(iVar, t7);
        } else if (t7 == null) {
            D();
        } else {
            l(iVar, t7);
        }
    }

    @Override // l63.d
    public final <T> void e(k63.e eVar, int i14, i<? super T> iVar, T t7) {
        eVar.getClass();
        iVar.getClass();
        E(eVar, i14);
        l(iVar, t7);
    }

    @Override // l63.d
    public final f f(o1 o1Var, int i14) {
        o1Var.getClass();
        E(o1Var, i14);
        return g(o1Var.h(i14));
    }

    @Override // l63.f
    public f g(k63.e eVar) {
        eVar.getClass();
        return this;
    }

    @Override // l63.f
    public void h(short s8) {
        F(Short.valueOf(s8));
    }

    @Override // l63.f
    public void i(boolean z14) {
        F(Boolean.valueOf(z14));
    }

    @Override // l63.d
    public final void j(o1 o1Var, int i14, byte b14) {
        o1Var.getClass();
        E(o1Var, i14);
        w(b14);
    }

    @Override // l63.d
    public final void k(k63.e eVar, int i14, String str) {
        eVar.getClass();
        str.getClass();
        E(eVar, i14);
        p(str);
    }

    @Override // l63.f
    public void m(k63.e eVar, int i14) {
        eVar.getClass();
        F(Integer.valueOf(i14));
    }

    @Override // l63.d
    public final void n(k63.e eVar, int i14, boolean z14) {
        eVar.getClass();
        E(eVar, i14);
        i(z14);
    }

    @Override // l63.f
    public void o(int i14) {
        F(Integer.valueOf(i14));
    }

    @Override // l63.f
    public void p(String str) {
        str.getClass();
        F(str);
    }

    @Override // l63.d
    public final void r(o1 o1Var, int i14, short s8) {
        o1Var.getClass();
        E(o1Var, i14);
        h(s8);
    }

    @Override // l63.f
    public void s(long j8) {
        F(Long.valueOf(j8));
    }

    @Override // l63.f
    public void t(char c14) {
        F(Character.valueOf(c14));
    }

    @Override // l63.d
    public final void u(o1 o1Var, int i14, char c14) {
        o1Var.getClass();
        E(o1Var, i14);
        t(c14);
    }

    @Override // l63.d
    public final void v(int i14, int i15, k63.e eVar) {
        eVar.getClass();
        E(eVar, i14);
        o(i15);
    }

    @Override // l63.f
    public void w(byte b14) {
        F(Byte.valueOf(b14));
    }

    @Override // l63.d
    public final void x(k63.e eVar, int i14, float f14) {
        eVar.getClass();
        E(eVar, i14);
        y(f14);
    }

    @Override // l63.f
    public void y(float f14) {
        F(Float.valueOf(f14));
    }

    @Override // l63.d
    public final void z(k63.e eVar, int i14, long j8) {
        eVar.getClass();
        E(eVar, i14);
        s(j8);
    }
}

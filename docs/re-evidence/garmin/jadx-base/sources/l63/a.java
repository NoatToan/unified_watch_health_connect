package l63;

import kotlinx.serialization.SerializationException;
import m63.o1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ll63/a;", "Ll63/e;", "Ll63/c;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a implements e, c {
    @Override // l63.c
    public final int A(k63.e eVar, int i14) {
        eVar.getClass();
        return u();
    }

    @Override // l63.c
    public final short B(o1 o1Var, int i14) {
        o1Var.getClass();
        return p();
    }

    @Override // l63.c
    public final byte C(o1 o1Var, int i14) {
        o1Var.getClass();
        return m();
    }

    @Override // l63.e
    public boolean D() {
        return true;
    }

    public Object E() {
        throw new SerializationException(s0.f105811a.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // l63.c
    public void b(k63.e eVar) {
        eVar.getClass();
    }

    @Override // l63.e
    public c c(k63.e eVar) {
        eVar.getClass();
        return this;
    }

    @Override // l63.c
    public final char d(o1 o1Var, int i14) {
        o1Var.getClass();
        return q();
    }

    @Override // l63.e
    public double f() {
        Object objE = E();
        objE.getClass();
        return ((Double) objE).doubleValue();
    }

    @Override // l63.c
    public final boolean g(k63.e eVar, int i14) {
        eVar.getClass();
        return y();
    }

    @Override // l63.c
    public final e j(o1 o1Var, int i14) {
        o1Var.getClass();
        return k(o1Var.h(i14));
    }

    @Override // l63.e
    public e k(k63.e eVar) {
        eVar.getClass();
        return this;
    }

    @Override // l63.c
    public <T> T l(k63.e eVar, int i14, i63.b<? extends T> bVar, T t7) {
        eVar.getClass();
        bVar.getClass();
        return (T) h(bVar);
    }

    @Override // l63.e
    public byte m() {
        Object objE = E();
        objE.getClass();
        return ((Byte) objE).byteValue();
    }

    @Override // l63.c
    public final float n(k63.e eVar, int i14) {
        eVar.getClass();
        return x();
    }

    @Override // l63.e
    public long o() {
        Object objE = E();
        objE.getClass();
        return ((Long) objE).longValue();
    }

    @Override // l63.e
    public short p() {
        Object objE = E();
        objE.getClass();
        return ((Short) objE).shortValue();
    }

    @Override // l63.e
    public char q() {
        Object objE = E();
        objE.getClass();
        return ((Character) objE).charValue();
    }

    @Override // l63.c
    public final String r(k63.e eVar, int i14) {
        eVar.getClass();
        return s();
    }

    @Override // l63.e
    public String s() {
        Object objE = E();
        objE.getClass();
        return (String) objE;
    }

    @Override // l63.c
    public final double t(k63.e eVar, int i14) {
        eVar.getClass();
        return f();
    }

    @Override // l63.e
    public int u() {
        Object objE = E();
        objE.getClass();
        return ((Integer) objE).intValue();
    }

    @Override // l63.c
    public final <T> T v(k63.e eVar, int i14, i63.b<? extends T> bVar, T t7) {
        eVar.getClass();
        bVar.getClass();
        if (bVar.getF116202c().b() || D()) {
            return (T) h(bVar);
        }
        return null;
    }

    @Override // l63.c
    public final long w(k63.e eVar, int i14) {
        eVar.getClass();
        return o();
    }

    @Override // l63.e
    public float x() {
        Object objE = E();
        objE.getClass();
        return ((Float) objE).floatValue();
    }

    @Override // l63.e
    public boolean y() {
        Object objE = E();
        objE.getClass();
        return ((Boolean) objE).booleanValue();
    }

    @Override // l63.e
    public int z(k63.e eVar) {
        eVar.getClass();
        Object objE = E();
        objE.getClass();
        return ((Integer) objE).intValue();
    }
}

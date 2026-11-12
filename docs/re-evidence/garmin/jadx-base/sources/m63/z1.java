package m63;

import java.util.ArrayList;
import kotlinx.serialization.SerializationException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm63/z1;", "", "Tag", "Ll63/e;", "Ll63/c;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class z1<Tag> implements l63.e, l63.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<Tag> f117055b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f117056c;

    @Override // l63.c
    public final int A(k63.e eVar, int i14) {
        eVar.getClass();
        return L(R(eVar, i14));
    }

    @Override // l63.c
    public final short B(o1 o1Var, int i14) {
        o1Var.getClass();
        return O(R(o1Var, i14));
    }

    @Override // l63.c
    public final byte C(o1 o1Var, int i14) {
        o1Var.getClass();
        return F(R(o1Var, i14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l63.e
    public boolean D() {
        Object objN0 = p13.h0.n0(this.f117055b);
        if (objN0 == null) {
            return false;
        }
        return N(objN0);
    }

    public boolean E(Tag tag) {
        Q();
        throw null;
    }

    public byte F(Tag tag) {
        Q();
        throw null;
    }

    public char G(Tag tag) {
        Q();
        throw null;
    }

    public double H(Tag tag) {
        Q();
        throw null;
    }

    public int I(Tag tag, k63.e eVar) {
        eVar.getClass();
        Q();
        throw null;
    }

    public float J(Tag tag) {
        Q();
        throw null;
    }

    public l63.e K(Tag tag, k63.e eVar) {
        eVar.getClass();
        this.f117055b.add(tag);
        return this;
    }

    public int L(Tag tag) {
        Q();
        throw null;
    }

    public long M(Tag tag) {
        Q();
        throw null;
    }

    public boolean N(Tag tag) {
        return true;
    }

    public short O(Tag tag) {
        Q();
        throw null;
    }

    public String P(Tag tag) {
        Q();
        throw null;
    }

    public final void Q() {
        throw new SerializationException(p005kotlin.jvm.internal.s0.f105811a.b(getClass()) + " can't retrieve untyped values");
    }

    public abstract String R(k63.e eVar, int i14);

    public final Tag S() {
        ArrayList<Tag> arrayList = this.f117055b;
        Tag tagRemove = arrayList.remove(p13.x.j(arrayList));
        this.f117056c = true;
        return tagRemove;
    }

    @Override // l63.e, l63.c
    /* JADX INFO: renamed from: a */
    public p63.e getF129822e() {
        return p63.h.f136264a;
    }

    @Override // l63.c
    public void b(k63.e eVar) {
        eVar.getClass();
    }

    @Override // l63.e
    public l63.c c(k63.e eVar) {
        eVar.getClass();
        return this;
    }

    @Override // l63.c
    public final char d(o1 o1Var, int i14) {
        o1Var.getClass();
        return G(R(o1Var, i14));
    }

    @Override // l63.e
    public final double f() {
        return H(S());
    }

    @Override // l63.c
    public final boolean g(k63.e eVar, int i14) {
        eVar.getClass();
        return E(R(eVar, i14));
    }

    @Override // l63.c
    public final l63.e j(o1 o1Var, int i14) {
        o1Var.getClass();
        return K(R(o1Var, i14), o1Var.h(i14));
    }

    @Override // l63.e
    public l63.e k(k63.e eVar) {
        eVar.getClass();
        return K(S(), eVar);
    }

    @Override // l63.c
    public final <T> T l(k63.e eVar, int i14, i63.b<? extends T> bVar, T t7) {
        eVar.getClass();
        bVar.getClass();
        this.f117055b.add(R(eVar, i14));
        bVar.getClass();
        T t14 = (T) h(bVar);
        if (!this.f117056c) {
            S();
        }
        this.f117056c = false;
        return t14;
    }

    @Override // l63.e
    public final byte m() {
        return F(S());
    }

    @Override // l63.c
    public final float n(k63.e eVar, int i14) {
        eVar.getClass();
        return J(R(eVar, i14));
    }

    @Override // l63.e
    public final long o() {
        return M(S());
    }

    @Override // l63.e
    public final short p() {
        return O(S());
    }

    @Override // l63.e
    public final char q() {
        return G(S());
    }

    @Override // l63.c
    public final String r(k63.e eVar, int i14) {
        eVar.getClass();
        return P(R(eVar, i14));
    }

    @Override // l63.e
    public final String s() {
        return P(S());
    }

    @Override // l63.c
    public final double t(k63.e eVar, int i14) {
        eVar.getClass();
        return H(R(eVar, i14));
    }

    @Override // l63.e
    public final int u() {
        return L(S());
    }

    @Override // l63.c
    public final <T> T v(k63.e eVar, int i14, i63.b<? extends T> bVar, T t7) {
        eVar.getClass();
        bVar.getClass();
        this.f117055b.add(R(eVar, i14));
        T t14 = (bVar.getF94809a().b() || D()) ? (T) h(bVar) : null;
        if (!this.f117056c) {
            S();
        }
        this.f117056c = false;
        return t14;
    }

    @Override // l63.c
    public final long w(k63.e eVar, int i14) {
        eVar.getClass();
        return M(R(eVar, i14));
    }

    @Override // l63.e
    public final float x() {
        return J(S());
    }

    @Override // l63.e
    public final boolean y() {
        return E(S());
    }

    @Override // l63.e
    public final int z(k63.e eVar) {
        eVar.getClass();
        return I(S(), eVar);
    }
}

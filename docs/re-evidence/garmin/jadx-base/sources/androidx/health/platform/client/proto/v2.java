package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public abstract class v2<T, B> {
    public abstract void a(B b14, int i14, int i15);

    public abstract void b(B b14, int i14, long j8);

    public abstract void c(B b14, int i14, T t7);

    public abstract void d(B b14, int i14, i iVar);

    public abstract void e(B b14, int i14, long j8);

    public abstract w2 f(Object obj);

    public abstract w2 g(Object obj);

    public abstract int h(T t7);

    public abstract int i(T t7);

    public abstract void j(Object obj);

    public abstract w2 k(Object obj, Object obj2);

    public final boolean l(B b14, u1 u1Var, int i14) throws InvalidProtocolBufferException {
        k kVar = (k) u1Var;
        int i15 = kVar.f7699b;
        int i16 = i15 >>> 3;
        int i17 = i15 & 7;
        if (i17 == 0) {
            kVar.y(0);
            e(b14, i16, kVar.f7698a.p());
            return true;
        }
        if (i17 == 1) {
            kVar.y(1);
            b(b14, i16, kVar.f7698a.m());
            return true;
        }
        if (i17 == 2) {
            d(b14, i16, kVar.f());
            return true;
        }
        if (i17 != 3) {
            if (i17 == 4) {
                return false;
            }
            if (i17 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            kVar.y(5);
            a(b14, i16, kVar.f7698a.l());
            return true;
        }
        w2 w2VarM = m();
        int i18 = (i16 << 3) | 4;
        int i19 = i14 + 1;
        if (i19 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        while (kVar.b() != Integer.MAX_VALUE && l(w2VarM, kVar, i19)) {
        }
        if (i18 != kVar.f7699b) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        c(b14, i16, p(w2VarM));
        return true;
    }

    public abstract w2 m();

    public abstract void n(Object obj, B b14);

    public abstract void o(Object obj, T t7);

    public abstract w2 p(Object obj);

    public abstract void q(T t7, d3 d3Var);

    public abstract void r(T t7, d3 d3Var);
}

package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class m1<T, B> {
    public abstract void a(B b14, int i14, int i15);

    public abstract void b(B b14, int i14, long j8);

    public abstract void c(B b14, int i14, T t7);

    public abstract void d(B b14, int i14, h hVar);

    public abstract void e(B b14, int i14, long j8);

    public abstract n1 f(Object obj);

    public abstract n1 g(Object obj);

    public abstract int h(T t7);

    public abstract int i(T t7);

    public abstract void j(Object obj);

    public abstract n1 k(Object obj, Object obj2);

    public final boolean l(B b14, f1 f1Var, int i14) throws InvalidProtocolBufferException {
        j jVar = (j) f1Var;
        int i15 = jVar.f6744b;
        int i16 = i15 >>> 3;
        int i17 = i15 & 7;
        if (i17 == 0) {
            jVar.y(0);
            e(b14, i16, jVar.f6743a.o());
            return true;
        }
        if (i17 == 1) {
            jVar.y(1);
            b(b14, i16, jVar.f6743a.l());
            return true;
        }
        if (i17 == 2) {
            d(b14, i16, jVar.f());
            return true;
        }
        if (i17 != 3) {
            if (i17 == 4) {
                return false;
            }
            if (i17 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            jVar.y(5);
            a(b14, i16, jVar.f6743a.k());
            return true;
        }
        n1 n1VarM = m();
        int i18 = (i16 << 3) | 4;
        int i19 = i14 + 1;
        if (i19 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        while (jVar.b() != Integer.MAX_VALUE && l(n1VarM, jVar, i19)) {
        }
        if (i18 != jVar.f6744b) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        c(b14, i16, p(n1VarM));
        return true;
    }

    public abstract n1 m();

    public abstract void n(Object obj, B b14);

    public abstract void o(Object obj, T t7);

    public abstract n1 p(Object obj);

    public abstract void q(T t7, u1 u1Var);

    public abstract void r(T t7, u1 u1Var);
}

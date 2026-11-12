package androidx.health.platform.client.proto;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b2<T, B> {
    public abstract void a(B b2, int i, int i2);

    public abstract void b(B b2, int i, long j);

    public abstract void c(B b2, int i, T t);

    public abstract void d(B b2, int i, ByteString byteString);

    public abstract void e(B b2, int i, long j);

    public abstract B f(Object obj);

    public abstract T g(Object obj);

    public abstract int h(T t);

    public abstract int i(T t);

    public abstract void j(Object obj);

    public abstract T k(T t, T t2);

    public final void l(B b2, w0 w0Var) throws IOException {
        while (w0Var.l() != Integer.MAX_VALUE && m(b2, w0Var)) {
        }
    }

    public final boolean m(B b2, w0 w0Var) throws IOException {
        int tag = w0Var.getTag();
        int iA = WireFormat.a(tag);
        int iB = WireFormat.b(tag);
        if (iB == 0) {
            e(b2, iA, w0Var.r());
            return true;
        }
        if (iB == 1) {
            b(b2, iA, w0Var.s());
            return true;
        }
        if (iB == 2) {
            d(b2, iA, w0Var.readBytes());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            a(b2, iA, w0Var.C());
            return true;
        }
        B bN = n();
        int iC = WireFormat.c(iA, 4);
        l(bN, w0Var);
        if (iC != w0Var.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        c(b2, iA, r(bN));
        return true;
    }

    public abstract B n();

    public abstract void o(Object obj, B b2);

    public abstract void p(Object obj, T t);

    public abstract boolean q(w0 w0Var);

    public abstract T r(B b2);

    public abstract void s(T t, Writer writer) throws IOException;

    public abstract void t(T t, Writer writer) throws IOException;
}

package com.google.crypto.tink.shaded.protobuf;

import defpackage.qee;
import defpackage.wdi;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f9391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9392b;
    public int c;
    public int d = 0;

    public h(g gVar) {
        g gVar2 = (g) s.b(gVar, "input");
        this.f9391a = gVar2;
        gVar2.d = this;
    }

    public static h O(g gVar) {
        h hVar = gVar.d;
        return hVar != null ? hVar : new h(gVar);
    }

    private <T> T P(k0<T> k0Var, l lVar) throws IOException {
        int i = this.c;
        this.c = WireFormat.c(WireFormat.a(this.f9392b), 4);
        try {
            T tE = k0Var.e();
            k0Var.g(tE, this, lVar);
            k0Var.c(tE);
            if (this.f9392b != this.c) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.c = i;
            return tE;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    private <T> T Q(k0<T> k0Var, l lVar) throws IOException {
        int iD = this.f9391a.D();
        g gVar = this.f9391a;
        if (gVar.f9383a >= gVar.f9384b) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iM = gVar.m(iD);
        T tE = k0Var.e();
        this.f9391a.f9383a++;
        k0Var.g(tE, this, lVar);
        k0Var.c(tE);
        this.f9391a.a(0);
        g gVar2 = this.f9391a;
        gVar2.f9383a--;
        gVar2.l(iM);
        return tE;
    }

    private void S(int i) throws IOException {
        if (this.f9391a.d() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void T(int i) throws IOException {
        if (WireFormat.b(this.f9392b) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    private void U(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    private void V(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void A(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = WireFormat.b(this.f9392b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f9391a.s()));
                    if (this.f9391a.e()) {
                        return;
                    } else {
                        iC = this.f9391a.C();
                    }
                } while (iC == this.f9392b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f9391a.D();
            V(iD);
            int iD2 = this.f9391a.d() + iD;
            do {
                list.add(Long.valueOf(this.f9391a.s()));
            } while (this.f9391a.d() < iD2);
            return;
        }
        x xVar = (x) list;
        int iB2 = WireFormat.b(this.f9392b);
        if (iB2 == 1) {
            do {
                xVar.i(this.f9391a.s());
                if (this.f9391a.e()) {
                    return;
                } else {
                    iC2 = this.f9391a.C();
                }
            } while (iC2 == this.f9392b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD3 = this.f9391a.D();
        V(iD3);
        int iD4 = this.f9391a.d() + iD3;
        do {
            xVar.i(this.f9391a.s());
        } while (this.f9391a.d() < iD4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void B(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof r)) {
            int iB = WireFormat.b(this.f9392b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f9391a.D()));
                    if (this.f9391a.e()) {
                        return;
                    } else {
                        iC = this.f9391a.C();
                    }
                } while (iC == this.f9392b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f9391a.d() + this.f9391a.D();
            do {
                list.add(Integer.valueOf(this.f9391a.D()));
            } while (this.f9391a.d() < iD);
            S(iD);
            return;
        }
        r rVar = (r) list;
        int iB2 = WireFormat.b(this.f9392b);
        if (iB2 == 0) {
            do {
                rVar.Q(this.f9391a.D());
                if (this.f9391a.e()) {
                    return;
                } else {
                    iC2 = this.f9391a.C();
                }
            } while (iC2 == this.f9392b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = this.f9391a.d() + this.f9391a.D();
        do {
            rVar.Q(this.f9391a.D());
        } while (this.f9391a.d() < iD2);
        S(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public int C() throws IOException {
        T(5);
        return this.f9391a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public long D() throws IOException {
        T(0);
        return this.f9391a.z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public String E() throws IOException {
        T(2);
        return this.f9391a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public int F() throws IOException {
        T(5);
        return this.f9391a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public String G() throws IOException {
        T(2);
        return this.f9391a.B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public <T> T H(k0<T> k0Var, l lVar) throws IOException {
        T(3);
        return (T) P(k0Var, lVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public <T> T I(Class<T> cls, l lVar) throws IOException {
        T(3);
        return (T) P(wdi.a().d(cls), lVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public <K, V> void J(Map<K, V> map, y.a<K, V> aVar, l lVar) throws IOException {
        T(2);
        this.f9391a.m(this.f9391a.D());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public <T> void K(List<T> list, k0<T> k0Var, l lVar) throws IOException {
        int iC;
        if (WireFormat.b(this.f9392b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f9392b;
        do {
            list.add(Q(k0Var, lVar));
            if (this.f9391a.e() || this.d != 0) {
                return;
            } else {
                iC = this.f9391a.C();
            }
        } while (iC == i);
        this.d = iC;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public <T> T L(k0<T> k0Var, l lVar) throws IOException {
        T(2);
        return (T) Q(k0Var, lVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public <T> T M(Class<T> cls, l lVar) throws IOException {
        T(2);
        return (T) Q(wdi.a().d(cls), lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public <T> void N(List<T> list, k0<T> k0Var, l lVar) throws IOException {
        int iC;
        if (WireFormat.b(this.f9392b) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f9392b;
        do {
            list.add(P(k0Var, lVar));
            if (this.f9391a.e() || this.d != 0) {
                return;
            } else {
                iC = this.f9391a.C();
            }
        } while (iC == i);
        this.d = iC;
    }

    public void R(List<String> list, boolean z) throws IOException {
        int iC;
        int iC2;
        if (WireFormat.b(this.f9392b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if (!(list instanceof qee) || z) {
            do {
                list.add(z ? G() : E());
                if (this.f9391a.e()) {
                    return;
                } else {
                    iC = this.f9391a.C();
                }
            } while (iC == this.f9392b);
            this.d = iC;
            return;
        }
        qee qeeVar = (qee) list;
        do {
            qeeVar.D(readBytes());
            if (this.f9391a.e()) {
                return;
            } else {
                iC2 = this.f9391a.C();
            }
        } while (iC2 == this.f9392b);
        this.d = iC2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void a(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = WireFormat.b(this.f9392b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f9391a.z()));
                    if (this.f9391a.e()) {
                        return;
                    } else {
                        iC = this.f9391a.C();
                    }
                } while (iC == this.f9392b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f9391a.d() + this.f9391a.D();
            do {
                list.add(Long.valueOf(this.f9391a.z()));
            } while (this.f9391a.d() < iD);
            S(iD);
            return;
        }
        x xVar = (x) list;
        int iB2 = WireFormat.b(this.f9392b);
        if (iB2 == 0) {
            do {
                xVar.i(this.f9391a.z());
                if (this.f9391a.e()) {
                    return;
                } else {
                    iC2 = this.f9391a.C();
                }
            } while (iC2 == this.f9392b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = this.f9391a.d() + this.f9391a.D();
        do {
            xVar.i(this.f9391a.z());
        } while (this.f9391a.d() < iD2);
        S(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public long b() throws IOException {
        T(1);
        return this.f9391a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public int c() throws IOException {
        T(0);
        return this.f9391a.D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public int d() throws IOException {
        T(0);
        return this.f9391a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public int e() throws IOException {
        T(0);
        return this.f9391a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void f(List<Boolean> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof f)) {
            int iB = WireFormat.b(this.f9392b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f9391a.n()));
                    if (this.f9391a.e()) {
                        return;
                    } else {
                        iC = this.f9391a.C();
                    }
                } while (iC == this.f9392b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f9391a.d() + this.f9391a.D();
            do {
                list.add(Boolean.valueOf(this.f9391a.n()));
            } while (this.f9391a.d() < iD);
            S(iD);
            return;
        }
        f fVar = (f) list;
        int iB2 = WireFormat.b(this.f9392b);
        if (iB2 == 0) {
            do {
                fVar.p(this.f9391a.n());
                if (this.f9391a.e()) {
                    return;
                } else {
                    iC2 = this.f9391a.C();
                }
            } while (iC2 == this.f9392b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = this.f9391a.d() + this.f9391a.D();
        do {
            fVar.p(this.f9391a.n());
        } while (this.f9391a.d() < iD2);
        S(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void g(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof r)) {
            int iB = WireFormat.b(this.f9392b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f9391a.y()));
                    if (this.f9391a.e()) {
                        return;
                    } else {
                        iC = this.f9391a.C();
                    }
                } while (iC == this.f9392b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f9391a.d() + this.f9391a.D();
            do {
                list.add(Integer.valueOf(this.f9391a.y()));
            } while (this.f9391a.d() < iD);
            S(iD);
            return;
        }
        r rVar = (r) list;
        int iB2 = WireFormat.b(this.f9392b);
        if (iB2 == 0) {
            do {
                rVar.Q(this.f9391a.y());
                if (this.f9391a.e()) {
                    return;
                } else {
                    iC2 = this.f9391a.C();
                }
            } while (iC2 == this.f9392b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = this.f9391a.d() + this.f9391a.D();
        do {
            rVar.Q(this.f9391a.y());
        } while (this.f9391a.d() < iD2);
        S(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public int getTag() {
        return this.f9392b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public long h() throws IOException {
        T(0);
        return this.f9391a.E();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void i(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = WireFormat.b(this.f9392b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f9391a.x()));
                    if (this.f9391a.e()) {
                        return;
                    } else {
                        iC = this.f9391a.C();
                    }
                } while (iC == this.f9392b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f9391a.D();
            V(iD);
            int iD2 = this.f9391a.d() + iD;
            do {
                list.add(Long.valueOf(this.f9391a.x()));
            } while (this.f9391a.d() < iD2);
            return;
        }
        x xVar = (x) list;
        int iB2 = WireFormat.b(this.f9392b);
        if (iB2 == 1) {
            do {
                xVar.i(this.f9391a.x());
                if (this.f9391a.e()) {
                    return;
                } else {
                    iC2 = this.f9391a.C();
                }
            } while (iC2 == this.f9392b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD3 = this.f9391a.D();
        V(iD3);
        int iD4 = this.f9391a.d() + iD3;
        do {
            xVar.i(this.f9391a.x());
        } while (this.f9391a.d() < iD4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void j(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof r)) {
            int iB = WireFormat.b(this.f9392b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f9391a.u()));
                    if (this.f9391a.e()) {
                        return;
                    } else {
                        iC = this.f9391a.C();
                    }
                } while (iC == this.f9392b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f9391a.d() + this.f9391a.D();
            do {
                list.add(Integer.valueOf(this.f9391a.u()));
            } while (this.f9391a.d() < iD);
            S(iD);
            return;
        }
        r rVar = (r) list;
        int iB2 = WireFormat.b(this.f9392b);
        if (iB2 == 0) {
            do {
                rVar.Q(this.f9391a.u());
                if (this.f9391a.e()) {
                    return;
                } else {
                    iC2 = this.f9391a.C();
                }
            } while (iC2 == this.f9392b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = this.f9391a.d() + this.f9391a.D();
        do {
            rVar.Q(this.f9391a.u());
        } while (this.f9391a.d() < iD2);
        S(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void k(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof r)) {
            int iB = WireFormat.b(this.f9392b);
            if (iB == 2) {
                int iD = this.f9391a.D();
                U(iD);
                int iD2 = this.f9391a.d() + iD;
                do {
                    list.add(Integer.valueOf(this.f9391a.r()));
                } while (this.f9391a.d() < iD2);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f9391a.r()));
                if (this.f9391a.e()) {
                    return;
                } else {
                    iC = this.f9391a.C();
                }
            } while (iC == this.f9392b);
            this.d = iC;
            return;
        }
        r rVar = (r) list;
        int iB2 = WireFormat.b(this.f9392b);
        if (iB2 == 2) {
            int iD3 = this.f9391a.D();
            U(iD3);
            int iD4 = this.f9391a.d() + iD3;
            do {
                rVar.Q(this.f9391a.r());
            } while (this.f9391a.d() < iD4);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            rVar.Q(this.f9391a.r());
            if (this.f9391a.e()) {
                return;
            } else {
                iC2 = this.f9391a.C();
            }
        } while (iC2 == this.f9392b);
        this.d = iC2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public int l() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.f9392b = i;
            this.d = 0;
        } else {
            this.f9392b = this.f9391a.C();
        }
        int i2 = this.f9392b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.a(i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void m(List<String> list) throws IOException {
        R(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void n(List<Float> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof q)) {
            int iB = WireFormat.b(this.f9392b);
            if (iB == 2) {
                int iD = this.f9391a.D();
                U(iD);
                int iD2 = this.f9391a.d() + iD;
                do {
                    list.add(Float.valueOf(this.f9391a.t()));
                } while (this.f9391a.d() < iD2);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.f9391a.t()));
                if (this.f9391a.e()) {
                    return;
                } else {
                    iC = this.f9391a.C();
                }
            } while (iC == this.f9392b);
            this.d = iC;
            return;
        }
        q qVar = (q) list;
        int iB2 = WireFormat.b(this.f9392b);
        if (iB2 == 2) {
            int iD3 = this.f9391a.D();
            U(iD3);
            int iD4 = this.f9391a.d() + iD3;
            do {
                qVar.J(this.f9391a.t());
            } while (this.f9391a.d() < iD4);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            qVar.J(this.f9391a.t());
            if (this.f9391a.e()) {
                return;
            } else {
                iC2 = this.f9391a.C();
            }
        } while (iC2 == this.f9392b);
        this.d = iC2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public boolean o() throws IOException {
        int i;
        if (this.f9391a.e() || (i = this.f9392b) == this.c) {
            return false;
        }
        return this.f9391a.F(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void p(List<ByteString> list) throws IOException {
        int iC;
        if (WireFormat.b(this.f9392b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.f9391a.e()) {
                return;
            } else {
                iC = this.f9391a.C();
            }
        } while (iC == this.f9392b);
        this.d = iC;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void q(List<Double> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof j)) {
            int iB = WireFormat.b(this.f9392b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f9391a.p()));
                    if (this.f9391a.e()) {
                        return;
                    } else {
                        iC = this.f9391a.C();
                    }
                } while (iC == this.f9392b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f9391a.D();
            V(iD);
            int iD2 = this.f9391a.d() + iD;
            do {
                list.add(Double.valueOf(this.f9391a.p()));
            } while (this.f9391a.d() < iD2);
            return;
        }
        j jVar = (j) list;
        int iB2 = WireFormat.b(this.f9392b);
        if (iB2 == 1) {
            do {
                jVar.h(this.f9391a.p());
                if (this.f9391a.e()) {
                    return;
                } else {
                    iC2 = this.f9391a.C();
                }
            } while (iC2 == this.f9392b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD3 = this.f9391a.D();
        V(iD3);
        int iD4 = this.f9391a.d() + iD3;
        do {
            jVar.h(this.f9391a.p());
        } while (this.f9391a.d() < iD4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public long r() throws IOException {
        T(0);
        return this.f9391a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public ByteString readBytes() throws IOException {
        T(2);
        return this.f9391a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public double readDouble() throws IOException {
        T(1);
        return this.f9391a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public float readFloat() throws IOException {
        T(5);
        return this.f9391a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public long s() throws IOException {
        T(1);
        return this.f9391a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void t(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof r)) {
            int iB = WireFormat.b(this.f9392b);
            if (iB == 2) {
                int iD = this.f9391a.D();
                U(iD);
                int iD2 = this.f9391a.d() + iD;
                do {
                    list.add(Integer.valueOf(this.f9391a.w()));
                } while (this.f9391a.d() < iD2);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f9391a.w()));
                if (this.f9391a.e()) {
                    return;
                } else {
                    iC = this.f9391a.C();
                }
            } while (iC == this.f9392b);
            this.d = iC;
            return;
        }
        r rVar = (r) list;
        int iB2 = WireFormat.b(this.f9392b);
        if (iB2 == 2) {
            int iD3 = this.f9391a.D();
            U(iD3);
            int iD4 = this.f9391a.d() + iD3;
            do {
                rVar.Q(this.f9391a.w());
            } while (this.f9391a.d() < iD4);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            rVar.Q(this.f9391a.w());
            if (this.f9391a.e()) {
                return;
            } else {
                iC2 = this.f9391a.C();
            }
        } while (iC2 == this.f9392b);
        this.d = iC2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public boolean u() throws IOException {
        T(0);
        return this.f9391a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void v(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = WireFormat.b(this.f9392b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f9391a.E()));
                    if (this.f9391a.e()) {
                        return;
                    } else {
                        iC = this.f9391a.C();
                    }
                } while (iC == this.f9392b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f9391a.d() + this.f9391a.D();
            do {
                list.add(Long.valueOf(this.f9391a.E()));
            } while (this.f9391a.d() < iD);
            S(iD);
            return;
        }
        x xVar = (x) list;
        int iB2 = WireFormat.b(this.f9392b);
        if (iB2 == 0) {
            do {
                xVar.i(this.f9391a.E());
                if (this.f9391a.e()) {
                    return;
                } else {
                    iC2 = this.f9391a.C();
                }
            } while (iC2 == this.f9392b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = this.f9391a.d() + this.f9391a.D();
        do {
            xVar.i(this.f9391a.E());
        } while (this.f9391a.d() < iD2);
        S(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void w(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = WireFormat.b(this.f9392b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f9391a.v()));
                    if (this.f9391a.e()) {
                        return;
                    } else {
                        iC = this.f9391a.C();
                    }
                } while (iC == this.f9392b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f9391a.d() + this.f9391a.D();
            do {
                list.add(Long.valueOf(this.f9391a.v()));
            } while (this.f9391a.d() < iD);
            S(iD);
            return;
        }
        x xVar = (x) list;
        int iB2 = WireFormat.b(this.f9392b);
        if (iB2 == 0) {
            do {
                xVar.i(this.f9391a.v());
                if (this.f9391a.e()) {
                    return;
                } else {
                    iC2 = this.f9391a.C();
                }
            } while (iC2 == this.f9392b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = this.f9391a.d() + this.f9391a.D();
        do {
            xVar.i(this.f9391a.v());
        } while (this.f9391a.d() < iD2);
        S(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void x(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof r)) {
            int iB = WireFormat.b(this.f9392b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f9391a.q()));
                    if (this.f9391a.e()) {
                        return;
                    } else {
                        iC = this.f9391a.C();
                    }
                } while (iC == this.f9392b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f9391a.d() + this.f9391a.D();
            do {
                list.add(Integer.valueOf(this.f9391a.q()));
            } while (this.f9391a.d() < iD);
            S(iD);
            return;
        }
        r rVar = (r) list;
        int iB2 = WireFormat.b(this.f9392b);
        if (iB2 == 0) {
            do {
                rVar.Q(this.f9391a.q());
                if (this.f9391a.e()) {
                    return;
                } else {
                    iC2 = this.f9391a.C();
                }
            } while (iC2 == this.f9392b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = this.f9391a.d() + this.f9391a.D();
        do {
            rVar.Q(this.f9391a.q());
        } while (this.f9391a.d() < iD2);
        S(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public void y(List<String> list) throws IOException {
        R(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public int z() throws IOException {
        T(0);
        return this.f9391a.u();
    }
}

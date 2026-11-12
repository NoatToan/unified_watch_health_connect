package com.google.protobuf;

import defpackage.xdi;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class u0<T> implements e1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f9760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1<?, ?> f9761b;
    public final boolean c;
    public final u<?> d;

    public u0(q1<?, ?> q1Var, u<?> uVar, q0 q0Var) {
        this.f9761b = q1Var;
        this.c = uVar.e(q0Var);
        this.d = uVar;
        this.f9760a = q0Var;
    }

    private <UT, UB> int i(q1<UT, UB> q1Var, T t) {
        return q1Var.i(q1Var.g(t));
    }

    private <UT, UB, ET extends a0.c<ET>> void j(q1<UT, UB> q1Var, u<ET> uVar, T t, a1 a1Var, t tVar) throws IOException {
        UB ubF = q1Var.f(t);
        a0<ET> a0VarD = uVar.d(t);
        while (a1Var.l() != Integer.MAX_VALUE) {
            try {
                if (!l(a1Var, tVar, uVar, a0VarD, q1Var, ubF)) {
                    return;
                }
            } finally {
                q1Var.o(t, ubF);
            }
        }
    }

    public static <T> u0<T> k(q1<?, ?> q1Var, u<?> uVar, q0 q0Var) {
        return new u0<>(q1Var, uVar, q0Var);
    }

    @Override // com.google.protobuf.e1
    public void a(T t, T t2) {
        f1.H(this.f9761b, t, t2);
        if (this.c) {
            f1.F(this.d, t, t2);
        }
    }

    @Override // com.google.protobuf.e1
    public final boolean b(T t) {
        return this.d.c(t).C();
    }

    @Override // com.google.protobuf.e1
    public void c(T t) {
        this.f9761b.j(t);
        this.d.f(t);
    }

    @Override // com.google.protobuf.e1
    public int d(T t) {
        int i = i(this.f9761b, t);
        return this.c ? i + this.d.c(t).t() : i;
    }

    @Override // com.google.protobuf.e1
    public T e() {
        return (T) this.f9760a.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.e1
    public boolean equals(T t, T t2) {
        if (!this.f9761b.g(t).equals(this.f9761b.g(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(t).equals(this.d.c(t2));
        }
        return true;
    }

    @Override // com.google.protobuf.e1
    public void f(T t, Writer writer) throws IOException {
        Iterator itF = this.d.c(t).F();
        while (itF.hasNext()) {
            Map.Entry entry = (Map.Entry) itF.next();
            a0.c cVar = (a0.c) entry.getKey();
            if (cVar.getLiteJavaType() != WireFormat.JavaType.MESSAGE || cVar.isRepeated() || cVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof e0.b) {
                writer.b(cVar.getNumber(), ((e0.b) entry).a().f());
            } else {
                writer.b(cVar.getNumber(), entry.getValue());
            }
        }
        m(this.f9761b, t, writer);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.e1
    public void g(T t, byte[] bArr, int i, int i2, g.b bVar) throws IOException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
        s1 s1VarN = generatedMessageLite.unknownFields;
        if (s1VarN == s1.c()) {
            s1VarN = s1.n();
            generatedMessageLite.unknownFields = s1VarN;
        }
        a0<GeneratedMessageLite.d> a0VarA = ((GeneratedMessageLite.c) t).a();
        GeneratedMessageLite.e eVar = null;
        while (i < i2) {
            int I = g.I(bArr, i, bVar);
            int i3 = bVar.f9640a;
            if (i3 == WireFormat.f9593a) {
                int i4 = 0;
                ByteString byteString = null;
                while (I < i2) {
                    I = g.I(bArr, I, bVar);
                    int i5 = bVar.f9640a;
                    int iA = WireFormat.a(i5);
                    int iB = WireFormat.b(i5);
                    if (iA != 2) {
                        if (iA == 3) {
                            if (eVar != null) {
                                I = g.p(xdi.a().d(eVar.d().getClass()), bArr, I, i2, bVar);
                                a0VarA.M(eVar.d, bVar.c);
                            } else if (iB == 2) {
                                I = g.b(bArr, I, bVar);
                                byteString = (ByteString) bVar.c;
                            }
                        }
                        if (i5 == WireFormat.f9594b) {
                            break;
                        } else {
                            I = g.N(i5, bArr, I, i2, bVar);
                        }
                    } else if (iB == 0) {
                        I = g.I(bArr, I, bVar);
                        i4 = bVar.f9640a;
                        eVar = (GeneratedMessageLite.e) this.d.b(bVar.d, this.f9760a, i4);
                    } else {
                        if (i5 == WireFormat.f9594b) {
                            break;
                            break;
                        }
                        I = g.N(i5, bArr, I, i2, bVar);
                    }
                }
                if (byteString != null) {
                    s1VarN.q(WireFormat.c(i4, 2), byteString);
                }
                i = I;
            } else if (WireFormat.b(i3) == 2) {
                GeneratedMessageLite.e eVar2 = (GeneratedMessageLite.e) this.d.b(bVar.d, this.f9760a, WireFormat.a(i3));
                if (eVar2 != null) {
                    i = g.p(xdi.a().d(eVar2.d().getClass()), bArr, I, i2, bVar);
                    a0VarA.M(eVar2.d, bVar.c);
                } else {
                    i = g.G(i3, bArr, I, i2, s1VarN, bVar);
                }
                eVar = eVar2;
            } else {
                i = g.N(i3, bArr, I, i2, bVar);
            }
        }
        if (i != i2) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.e1
    public void h(T t, a1 a1Var, t tVar) throws IOException {
        j(this.f9761b, this.d, t, a1Var, tVar);
    }

    @Override // com.google.protobuf.e1
    public int hashCode(T t) {
        int iHashCode = this.f9761b.g(t).hashCode();
        return this.c ? (iHashCode * 53) + this.d.c(t).hashCode() : iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <UT, UB, ET extends a0.c<ET>> boolean l(a1 a1Var, t tVar, u<ET> uVar, a0<ET> a0Var, q1<UT, UB> q1Var, UB ub) throws IOException {
        int tag = a1Var.getTag();
        if (tag != WireFormat.f9593a) {
            if (WireFormat.b(tag) != 2) {
                return a1Var.o();
            }
            Object objB = uVar.b(tVar, this.f9760a, WireFormat.a(tag));
            if (objB == null) {
                return q1Var.m(ub, a1Var);
            }
            uVar.h(a1Var, objB, tVar, a0Var);
            return true;
        }
        Object objB2 = null;
        int iC = 0;
        ByteString bytes = null;
        while (a1Var.l() != Integer.MAX_VALUE) {
            int tag2 = a1Var.getTag();
            if (tag2 == WireFormat.c) {
                iC = a1Var.c();
                objB2 = uVar.b(tVar, this.f9760a, iC);
            } else if (tag2 == WireFormat.d) {
                if (objB2 != null) {
                    uVar.h(a1Var, objB2, tVar, a0Var);
                } else {
                    bytes = a1Var.readBytes();
                }
            } else if (!a1Var.o()) {
                break;
            }
        }
        if (a1Var.getTag() != WireFormat.f9594b) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objB2 != null) {
                uVar.i(bytes, objB2, tVar, a0Var);
            } else {
                q1Var.d(ub, iC, bytes);
            }
        }
        return true;
    }

    public final <UT, UB> void m(q1<UT, UB> q1Var, T t, Writer writer) throws IOException {
        q1Var.s(q1Var.g(t), writer);
    }
}

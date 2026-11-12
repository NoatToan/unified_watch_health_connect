package androidx.datastore.preferences.protobuf;

import defpackage.ydi;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e0<T> implements k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f2197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0<?, ?> f2198b;
    public final boolean c;
    public final m<?> d;

    public e0(n0<?, ?> n0Var, m<?> mVar, b0 b0Var) {
        this.f2198b = n0Var;
        this.c = mVar.e(b0Var);
        this.d = mVar;
        this.f2197a = b0Var;
    }

    private <UT, UB> int i(n0<UT, UB> n0Var, T t) {
        return n0Var.i(n0Var.g(t));
    }

    private <UT, UB, ET extends p.b<ET>> void j(n0<UT, UB> n0Var, m<ET> mVar, T t, i0 i0Var, l lVar) throws IOException {
        UB ubF = n0Var.f(t);
        p<ET> pVarD = mVar.d(t);
        while (i0Var.l() != Integer.MAX_VALUE) {
            try {
                if (!l(i0Var, lVar, mVar, pVarD, n0Var, ubF)) {
                    return;
                }
            } finally {
                n0Var.o(t, ubF);
            }
        }
    }

    public static <T> e0<T> k(n0<?, ?> n0Var, m<?> mVar, b0 b0Var) {
        return new e0<>(n0Var, mVar, b0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public void a(T t, T t2) {
        l0.G(this.f2198b, t, t2);
        if (this.c) {
            l0.E(this.d, t, t2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final boolean b(T t) {
        return this.d.c(t).p();
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public void c(T t) {
        this.f2198b.j(t);
        this.d.f(t);
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public int d(T t) {
        int i = i(this.f2198b, t);
        return this.c ? i + this.d.c(t).j() : i;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public T e() {
        return (T) this.f2197a.newBuilderForType().buildPartial();
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public boolean equals(T t, T t2) {
        if (!this.f2198b.g(t).equals(this.f2198b.g(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(t).equals(this.d.c(t2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public void f(T t, Writer writer) throws IOException {
        Iterator itS = this.d.c(t).s();
        while (itS.hasNext()) {
            Map.Entry entry = (Map.Entry) itS.next();
            p.b bVar = (p.b) entry.getKey();
            if (bVar.getLiteJavaType() != WireFormat.JavaType.MESSAGE || bVar.isRepeated() || bVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof t.b) {
                writer.b(bVar.getNumber(), ((t.b) entry).a().e());
            } else {
                writer.b(bVar.getNumber(), entry.getValue());
            }
        }
        m(this.f2198b, t, writer);
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public void g(T t, i0 i0Var, l lVar) throws IOException {
        j(this.f2198b, this.d, t, i0Var, lVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.k0
    public void h(T t, byte[] bArr, int i, int i2, d.b bVar) throws IOException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
        o0 o0VarL = generatedMessageLite.unknownFields;
        if (o0VarL == o0.e()) {
            o0VarL = o0.l();
            generatedMessageLite.unknownFields = o0VarL;
        }
        p<GeneratedMessageLite.d> pVarC = ((GeneratedMessageLite.c) t).C();
        GeneratedMessageLite.e eVar = null;
        while (i < i2) {
            int I = d.I(bArr, i, bVar);
            int i3 = bVar.f2187a;
            if (i3 == WireFormat.f2182a) {
                int i4 = 0;
                ByteString byteString = null;
                while (I < i2) {
                    I = d.I(bArr, I, bVar);
                    int i5 = bVar.f2187a;
                    int iA = WireFormat.a(i5);
                    int iB = WireFormat.b(i5);
                    if (iA != 2) {
                        if (iA == 3) {
                            if (eVar != null) {
                                I = d.p(ydi.a().d(eVar.b().getClass()), bArr, I, i2, bVar);
                                pVarC.x(eVar.f2179b, bVar.c);
                            } else if (iB == 2) {
                                I = d.b(bArr, I, bVar);
                                byteString = (ByteString) bVar.c;
                            }
                        }
                        if (i5 == WireFormat.f2183b) {
                            break;
                        } else {
                            I = d.N(i5, bArr, I, i2, bVar);
                        }
                    } else if (iB == 0) {
                        I = d.I(bArr, I, bVar);
                        i4 = bVar.f2187a;
                        eVar = (GeneratedMessageLite.e) this.d.b(bVar.d, this.f2197a, i4);
                    } else {
                        if (i5 == WireFormat.f2183b) {
                            break;
                            break;
                        }
                        I = d.N(i5, bArr, I, i2, bVar);
                    }
                }
                if (byteString != null) {
                    o0VarL.n(WireFormat.c(i4, 2), byteString);
                }
                i = I;
            } else if (WireFormat.b(i3) == 2) {
                GeneratedMessageLite.e eVar2 = (GeneratedMessageLite.e) this.d.b(bVar.d, this.f2197a, WireFormat.a(i3));
                if (eVar2 != null) {
                    i = d.p(ydi.a().d(eVar2.b().getClass()), bArr, I, i2, bVar);
                    pVarC.x(eVar2.f2179b, bVar.c);
                } else {
                    i = d.G(i3, bArr, I, i2, o0VarL, bVar);
                }
                eVar = eVar2;
            } else {
                i = d.N(i3, bArr, I, i2, bVar);
            }
        }
        if (i != i2) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public int hashCode(T t) {
        int iHashCode = this.f2198b.g(t).hashCode();
        return this.c ? (iHashCode * 53) + this.d.c(t).hashCode() : iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <UT, UB, ET extends p.b<ET>> boolean l(i0 i0Var, l lVar, m<ET> mVar, p<ET> pVar, n0<UT, UB> n0Var, UB ub) throws IOException {
        int tag = i0Var.getTag();
        if (tag != WireFormat.f2182a) {
            if (WireFormat.b(tag) != 2) {
                return i0Var.o();
            }
            Object objB = mVar.b(lVar, this.f2197a, WireFormat.a(tag));
            if (objB == null) {
                return n0Var.m(ub, i0Var);
            }
            mVar.h(i0Var, objB, lVar, pVar);
            return true;
        }
        Object objB2 = null;
        int iC = 0;
        ByteString bytes = null;
        while (i0Var.l() != Integer.MAX_VALUE) {
            int tag2 = i0Var.getTag();
            if (tag2 == WireFormat.c) {
                iC = i0Var.c();
                objB2 = mVar.b(lVar, this.f2197a, iC);
            } else if (tag2 == WireFormat.d) {
                if (objB2 != null) {
                    mVar.h(i0Var, objB2, lVar, pVar);
                } else {
                    bytes = i0Var.readBytes();
                }
            } else if (!i0Var.o()) {
                break;
            }
        }
        if (i0Var.getTag() != WireFormat.f2183b) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objB2 != null) {
                mVar.i(bytes, objB2, lVar, pVar);
            } else {
                n0Var.d(ub, iC, bytes);
            }
        }
        return true;
    }

    public final <UT, UB> void m(n0<UT, UB> n0Var, T t, Writer writer) throws IOException {
        n0Var.s(n0Var.g(t), writer);
    }
}

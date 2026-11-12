package androidx.health.platform.client.proto;

import defpackage.vdi;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r0<T> implements w1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f2528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2<?, ?> f2529b;
    public final boolean c;
    public final z<?> d;

    public r0(b2<?, ?> b2Var, z<?> zVar, o0 o0Var) {
        this.f2529b = b2Var;
        this.c = zVar.e(o0Var);
        this.d = zVar;
        this.f2528a = o0Var;
    }

    private <UT, UB> int i(b2<UT, UB> b2Var, T t) {
        return b2Var.i(b2Var.g(t));
    }

    private <UT, UB, ET extends c0.b<ET>> void j(b2<UT, UB> b2Var, z<ET> zVar, T t, w0 w0Var, y yVar) throws IOException {
        UB ubF = b2Var.f(t);
        c0<ET> c0VarD = zVar.d(t);
        while (w0Var.l() != Integer.MAX_VALUE) {
            try {
                if (!l(w0Var, yVar, zVar, c0VarD, b2Var, ubF)) {
                    return;
                }
            } finally {
                b2Var.o(t, ubF);
            }
        }
    }

    public static <T> r0<T> k(b2<?, ?> b2Var, z<?> zVar, o0 o0Var) {
        return new r0<>(b2Var, zVar, o0Var);
    }

    @Override // androidx.health.platform.client.proto.w1
    public void a(T t, T t2) {
        x1.G(this.f2529b, t, t2);
        if (this.c) {
            x1.E(this.d, t, t2);
        }
    }

    @Override // androidx.health.platform.client.proto.w1
    public final boolean b(T t) {
        return this.d.c(t).p();
    }

    @Override // androidx.health.platform.client.proto.w1
    public void c(T t) {
        this.f2529b.j(t);
        this.d.f(t);
    }

    @Override // androidx.health.platform.client.proto.w1
    public int d(T t) {
        int i = i(this.f2529b, t);
        return this.c ? i + this.d.c(t).j() : i;
    }

    @Override // androidx.health.platform.client.proto.w1
    public T e() {
        o0 o0Var = this.f2528a;
        return o0Var instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) o0Var).G() : (T) o0Var.newBuilderForType().buildPartial();
    }

    @Override // androidx.health.platform.client.proto.w1
    public boolean equals(T t, T t2) {
        if (!this.f2529b.g(t).equals(this.f2529b.g(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(t).equals(this.d.c(t2));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.health.platform.client.proto.w1
    public void f(T t, byte[] bArr, int i, int i2, d.b bVar) throws IOException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
        c2 c2VarK = generatedMessageLite.unknownFields;
        if (c2VarK == c2.c()) {
            c2VarK = c2.k();
            generatedMessageLite.unknownFields = c2VarK;
        }
        c0<GeneratedMessageLite.d> c0VarN = ((GeneratedMessageLite.c) t).N();
        GeneratedMessageLite.e eVar = null;
        while (i < i2) {
            int I = d.I(bArr, i, bVar);
            int i3 = bVar.f2482a;
            if (i3 == WireFormat.f2470a) {
                int i4 = 0;
                ByteString byteString = null;
                while (I < i2) {
                    I = d.I(bArr, I, bVar);
                    int i5 = bVar.f2482a;
                    int iA = WireFormat.a(i5);
                    int iB = WireFormat.b(i5);
                    if (iA != 2) {
                        if (iA == 3) {
                            if (eVar != null) {
                                I = d.p(vdi.a().c(eVar.b().getClass()), bArr, I, i2, bVar);
                                c0VarN.y(eVar.f2466b, bVar.c);
                            } else if (iB == 2) {
                                I = d.b(bArr, I, bVar);
                                byteString = (ByteString) bVar.c;
                            }
                        }
                        if (i5 == WireFormat.f2471b) {
                            break;
                        } else {
                            I = d.P(i5, bArr, I, i2, bVar);
                        }
                    } else if (iB == 0) {
                        I = d.I(bArr, I, bVar);
                        i4 = bVar.f2482a;
                        eVar = (GeneratedMessageLite.e) this.d.b(bVar.d, this.f2528a, i4);
                    } else {
                        if (i5 == WireFormat.f2471b) {
                            break;
                            break;
                        }
                        I = d.P(i5, bArr, I, i2, bVar);
                    }
                }
                if (byteString != null) {
                    c2VarK.n(WireFormat.c(i4, 2), byteString);
                }
                i = I;
            } else if (WireFormat.b(i3) == 2) {
                GeneratedMessageLite.e eVar2 = (GeneratedMessageLite.e) this.d.b(bVar.d, this.f2528a, WireFormat.a(i3));
                if (eVar2 != null) {
                    i = d.p(vdi.a().c(eVar2.b().getClass()), bArr, I, i2, bVar);
                    c0VarN.y(eVar2.f2466b, bVar.c);
                } else {
                    i = d.G(i3, bArr, I, i2, c2VarK, bVar);
                }
                eVar = eVar2;
            } else {
                i = d.P(i3, bArr, I, i2, bVar);
            }
        }
        if (i != i2) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // androidx.health.platform.client.proto.w1
    public void g(T t, Writer writer) throws IOException {
        Iterator itT = this.d.c(t).t();
        while (itT.hasNext()) {
            Map.Entry entry = (Map.Entry) itT.next();
            c0.b bVar = (c0.b) entry.getKey();
            if (bVar.getLiteJavaType() != WireFormat.JavaType.MESSAGE || bVar.isRepeated() || bVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof g0.b) {
                writer.b(bVar.getNumber(), ((g0.b) entry).a().e());
            } else {
                writer.b(bVar.getNumber(), entry.getValue());
            }
        }
        m(this.f2529b, t, writer);
    }

    @Override // androidx.health.platform.client.proto.w1
    public void h(T t, w0 w0Var, y yVar) throws IOException {
        j(this.f2529b, this.d, t, w0Var, yVar);
    }

    @Override // androidx.health.platform.client.proto.w1
    public int hashCode(T t) {
        int iHashCode = this.f2529b.g(t).hashCode();
        return this.c ? (iHashCode * 53) + this.d.c(t).hashCode() : iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <UT, UB, ET extends c0.b<ET>> boolean l(w0 w0Var, y yVar, z<ET> zVar, c0<ET> c0Var, b2<UT, UB> b2Var, UB ub) throws IOException {
        int tag = w0Var.getTag();
        if (tag != WireFormat.f2470a) {
            if (WireFormat.b(tag) != 2) {
                return w0Var.o();
            }
            Object objB = zVar.b(yVar, this.f2528a, WireFormat.a(tag));
            if (objB == null) {
                return b2Var.m(ub, w0Var);
            }
            zVar.h(w0Var, objB, yVar, c0Var);
            return true;
        }
        Object objB2 = null;
        int iC = 0;
        ByteString bytes = null;
        while (w0Var.l() != Integer.MAX_VALUE) {
            int tag2 = w0Var.getTag();
            if (tag2 == WireFormat.c) {
                iC = w0Var.c();
                objB2 = zVar.b(yVar, this.f2528a, iC);
            } else if (tag2 == WireFormat.d) {
                if (objB2 != null) {
                    zVar.h(w0Var, objB2, yVar, c0Var);
                } else {
                    bytes = w0Var.readBytes();
                }
            } else if (!w0Var.o()) {
                break;
            }
        }
        if (w0Var.getTag() != WireFormat.f2471b) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objB2 != null) {
                zVar.i(bytes, objB2, yVar, c0Var);
            } else {
                b2Var.d(ub, iC, bytes);
            }
        }
        return true;
    }

    public final <UT, UB> void m(b2<UT, UB> b2Var, T t, Writer writer) throws IOException {
        b2Var.s(b2Var.g(t), writer);
    }
}

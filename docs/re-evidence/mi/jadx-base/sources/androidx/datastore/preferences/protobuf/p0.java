package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class p0 extends n0<o0, o0> {
    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public o0 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(o0 o0Var) {
        return o0Var.f();
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(o0 o0Var) {
        return o0Var.g();
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public o0 k(o0 o0Var, o0 o0Var2) {
        return o0Var2.equals(o0.e()) ? o0Var : o0.k(o0Var, o0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public o0 n() {
        return o0.l();
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, o0 o0Var) {
        p(obj, o0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, o0 o0Var) {
        ((GeneratedMessageLite) obj).unknownFields = o0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public o0 r(o0 o0Var) {
        o0Var.j();
        return o0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(o0 o0Var, Writer writer) throws IOException {
        o0Var.o(writer);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(o0 o0Var, Writer writer) throws IOException {
        o0Var.q(writer);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public void j(Object obj) {
        g(obj).j();
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public boolean q(i0 i0Var) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(o0 o0Var, int i, int i2) {
        o0Var.n(WireFormat.c(i, 5), Integer.valueOf(i2));
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(o0 o0Var, int i, long j) {
        o0Var.n(WireFormat.c(i, 1), Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(o0 o0Var, int i, o0 o0Var2) {
        o0Var.n(WireFormat.c(i, 3), o0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(o0 o0Var, int i, ByteString byteString) {
        o0Var.n(WireFormat.c(i, 2), byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(o0 o0Var, int i, long j) {
        o0Var.n(WireFormat.c(i, 0), Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public o0 f(Object obj) {
        o0 o0VarG = g(obj);
        if (o0VarG != o0.e()) {
            return o0VarG;
        }
        o0 o0VarL = o0.l();
        p(obj, o0VarL);
        return o0VarL;
    }
}

package androidx.health.platform.client.proto;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class d2 extends b2<c2, c2> {
    @Override // androidx.health.platform.client.proto.b2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c2 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.health.platform.client.proto.b2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(c2 c2Var) {
        return c2Var.d();
    }

    @Override // androidx.health.platform.client.proto.b2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(c2 c2Var) {
        return c2Var.e();
    }

    @Override // androidx.health.platform.client.proto.b2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public c2 k(c2 c2Var, c2 c2Var2) {
        if (c2.c().equals(c2Var2)) {
            return c2Var;
        }
        return c2.c().equals(c2Var) ? c2.j(c2Var, c2Var2) : c2Var.i(c2Var2);
    }

    @Override // androidx.health.platform.client.proto.b2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public c2 n() {
        return c2.k();
    }

    @Override // androidx.health.platform.client.proto.b2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, c2 c2Var) {
        p(obj, c2Var);
    }

    @Override // androidx.health.platform.client.proto.b2
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, c2 c2Var) {
        ((GeneratedMessageLite) obj).unknownFields = c2Var;
    }

    @Override // androidx.health.platform.client.proto.b2
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public c2 r(c2 c2Var) {
        c2Var.h();
        return c2Var;
    }

    @Override // androidx.health.platform.client.proto.b2
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(c2 c2Var, Writer writer) throws IOException {
        c2Var.p(writer);
    }

    @Override // androidx.health.platform.client.proto.b2
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(c2 c2Var, Writer writer) throws IOException {
        c2Var.r(writer);
    }

    @Override // androidx.health.platform.client.proto.b2
    public void j(Object obj) {
        g(obj).h();
    }

    @Override // androidx.health.platform.client.proto.b2
    public boolean q(w0 w0Var) {
        return false;
    }

    @Override // androidx.health.platform.client.proto.b2
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(c2 c2Var, int i, int i2) {
        c2Var.n(WireFormat.c(i, 5), Integer.valueOf(i2));
    }

    @Override // androidx.health.platform.client.proto.b2
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(c2 c2Var, int i, long j) {
        c2Var.n(WireFormat.c(i, 1), Long.valueOf(j));
    }

    @Override // androidx.health.platform.client.proto.b2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(c2 c2Var, int i, c2 c2Var2) {
        c2Var.n(WireFormat.c(i, 3), c2Var2);
    }

    @Override // androidx.health.platform.client.proto.b2
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(c2 c2Var, int i, ByteString byteString) {
        c2Var.n(WireFormat.c(i, 2), byteString);
    }

    @Override // androidx.health.platform.client.proto.b2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(c2 c2Var, int i, long j) {
        c2Var.n(WireFormat.c(i, 0), Long.valueOf(j));
    }

    @Override // androidx.health.platform.client.proto.b2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public c2 f(Object obj) {
        c2 c2VarG = g(obj);
        if (c2VarG != c2.c()) {
            return c2VarG;
        }
        c2 c2VarK = c2.k();
        p(obj, c2VarK);
        return c2VarK;
    }
}

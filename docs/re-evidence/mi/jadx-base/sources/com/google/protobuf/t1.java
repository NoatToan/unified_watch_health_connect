package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class t1 extends q1<s1, s1> {
    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public s1 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(s1 s1Var) {
        return s1Var.d();
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(s1 s1Var) {
        return s1Var.e();
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public s1 k(s1 s1Var, s1 s1Var2) {
        return s1Var2.equals(s1.c()) ? s1Var : s1.m(s1Var, s1Var2);
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public s1 n() {
        return s1.n();
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, s1 s1Var) {
        p(obj, s1Var);
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, s1 s1Var) {
        ((GeneratedMessageLite) obj).unknownFields = s1Var;
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public s1 r(s1 s1Var) {
        s1Var.h();
        return s1Var;
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(s1 s1Var, Writer writer) throws IOException {
        s1Var.s(writer);
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(s1 s1Var, Writer writer) throws IOException {
        s1Var.u(writer);
    }

    @Override // com.google.protobuf.q1
    public void j(Object obj) {
        g(obj).h();
    }

    @Override // com.google.protobuf.q1
    public boolean q(a1 a1Var) {
        return false;
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(s1 s1Var, int i, int i2) {
        s1Var.q(WireFormat.c(i, 5), Integer.valueOf(i2));
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(s1 s1Var, int i, long j) {
        s1Var.q(WireFormat.c(i, 1), Long.valueOf(j));
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(s1 s1Var, int i, s1 s1Var2) {
        s1Var.q(WireFormat.c(i, 3), s1Var2);
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(s1 s1Var, int i, ByteString byteString) {
        s1Var.q(WireFormat.c(i, 2), byteString);
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(s1 s1Var, int i, long j) {
        s1Var.q(WireFormat.c(i, 0), Long.valueOf(j));
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public s1 f(Object obj) {
        s1 s1VarG = g(obj);
        if (s1VarG != s1.c()) {
            return s1VarG;
        }
        s1 s1VarN = s1.n();
        p(obj, s1VarN);
        return s1VarN;
    }
}

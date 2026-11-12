package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class u1 extends q1<r1, r1.b> {
    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public r1 g(Object obj) {
        return ((GeneratedMessageV3) obj).unknownFields;
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(r1 r1Var) {
        return r1Var.getSerializedSize();
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(r1 r1Var) {
        return r1Var.f();
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public r1 k(r1 r1Var, r1 r1Var2) {
        return r1Var.toBuilder().q(r1Var2).build();
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public r1.b n() {
        return r1.g();
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, r1.b bVar) {
        ((GeneratedMessageV3) obj).unknownFields = bVar.build();
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, r1 r1Var) {
        ((GeneratedMessageV3) obj).unknownFields = r1Var;
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public r1 r(r1.b bVar) {
        return bVar.build();
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(r1 r1Var, Writer writer) throws IOException {
        r1Var.m(writer);
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(r1 r1Var, Writer writer) throws IOException {
        r1Var.n(writer);
    }

    @Override // com.google.protobuf.q1
    public void j(Object obj) {
    }

    @Override // com.google.protobuf.q1
    public boolean q(a1 a1Var) {
        return a1Var.J();
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(r1.b bVar, int i, int i2) {
        bVar.i(i, r1.c.t().b(i2).g());
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(r1.b bVar, int i, long j) {
        bVar.i(i, r1.c.t().c(j).g());
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(r1.b bVar, int i, r1 r1Var) {
        bVar.i(i, r1.c.t().d(r1Var).g());
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(r1.b bVar, int i, ByteString byteString) {
        bVar.i(i, r1.c.t().e(byteString).g());
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(r1.b bVar, int i, long j) {
        bVar.i(i, r1.c.t().f(j).g());
    }

    @Override // com.google.protobuf.q1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public r1.b f(Object obj) {
        return ((GeneratedMessageV3) obj).unknownFields.toBuilder();
    }
}

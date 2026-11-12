package com.google.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    void A(int i, List<Long> list, boolean z) throws IOException;

    FieldOrder B();

    void C(int i, long j) throws IOException;

    void D(int i, List<Integer> list, boolean z) throws IOException;

    void E(int i, List<Boolean> list, boolean z) throws IOException;

    void F(int i, float f) throws IOException;

    void G(int i, int i2) throws IOException;

    void H(int i, List<Long> list, boolean z) throws IOException;

    void I(int i, int i2) throws IOException;

    @Deprecated
    void J(int i, List<?> list) throws IOException;

    void K(int i, ByteString byteString) throws IOException;

    void L(int i, List<?> list) throws IOException;

    <K, V> void M(int i, k0.b<K, V> bVar, Map<K, V> map) throws IOException;

    void N(int i, List<?> list, e1 e1Var) throws IOException;

    @Deprecated
    void O(int i, Object obj, e1 e1Var) throws IOException;

    @Deprecated
    void P(int i, List<?> list, e1 e1Var) throws IOException;

    void Q(int i, Object obj, e1 e1Var) throws IOException;

    void R(int i, Object obj) throws IOException;

    @Deprecated
    void S(int i, Object obj) throws IOException;

    void a(int i, List<Float> list, boolean z) throws IOException;

    void b(int i, Object obj) throws IOException;

    void c(int i, int i2) throws IOException;

    void d(int i, String str) throws IOException;

    void e(int i, long j) throws IOException;

    void f(int i, List<Integer> list, boolean z) throws IOException;

    void g(int i, int i2) throws IOException;

    void h(int i, List<Integer> list, boolean z) throws IOException;

    void i(int i, List<Integer> list, boolean z) throws IOException;

    void j(int i, long j) throws IOException;

    void k(int i, int i2) throws IOException;

    void l(int i, List<Long> list, boolean z) throws IOException;

    void m(int i, long j) throws IOException;

    void n(int i, boolean z) throws IOException;

    void o(int i, int i2) throws IOException;

    @Deprecated
    void p(int i) throws IOException;

    void q(int i, List<Long> list, boolean z) throws IOException;

    @Deprecated
    void r(int i) throws IOException;

    void s(int i, List<Integer> list, boolean z) throws IOException;

    void t(int i, List<Double> list, boolean z) throws IOException;

    void u(int i, List<ByteString> list) throws IOException;

    void v(int i, List<String> list) throws IOException;

    void w(int i, long j) throws IOException;

    void x(int i, List<Long> list, boolean z) throws IOException;

    void y(int i, List<Integer> list, boolean z) throws IOException;

    void z(int i, double d) throws IOException;
}

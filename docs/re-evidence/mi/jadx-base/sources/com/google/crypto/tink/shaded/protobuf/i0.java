package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface i0 {
    void A(List<Long> list) throws IOException;

    void B(List<Integer> list) throws IOException;

    int C() throws IOException;

    long D() throws IOException;

    String E() throws IOException;

    int F() throws IOException;

    String G() throws IOException;

    @Deprecated
    <T> T H(k0<T> k0Var, l lVar) throws IOException;

    @Deprecated
    <T> T I(Class<T> cls, l lVar) throws IOException;

    <K, V> void J(Map<K, V> map, y.a<K, V> aVar, l lVar) throws IOException;

    <T> void K(List<T> list, k0<T> k0Var, l lVar) throws IOException;

    <T> T L(k0<T> k0Var, l lVar) throws IOException;

    <T> T M(Class<T> cls, l lVar) throws IOException;

    @Deprecated
    <T> void N(List<T> list, k0<T> k0Var, l lVar) throws IOException;

    void a(List<Long> list) throws IOException;

    long b() throws IOException;

    int c() throws IOException;

    int d() throws IOException;

    int e() throws IOException;

    void f(List<Boolean> list) throws IOException;

    void g(List<Integer> list) throws IOException;

    int getTag();

    long h() throws IOException;

    void i(List<Long> list) throws IOException;

    void j(List<Integer> list) throws IOException;

    void k(List<Integer> list) throws IOException;

    int l() throws IOException;

    void m(List<String> list) throws IOException;

    void n(List<Float> list) throws IOException;

    boolean o() throws IOException;

    void p(List<ByteString> list) throws IOException;

    void q(List<Double> list) throws IOException;

    long r() throws IOException;

    ByteString readBytes() throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    long s() throws IOException;

    void t(List<Integer> list) throws IOException;

    boolean u() throws IOException;

    void v(List<Long> list) throws IOException;

    void w(List<Long> list) throws IOException;

    void x(List<Integer> list) throws IOException;

    void y(List<String> list) throws IOException;

    int z() throws IOException;
}

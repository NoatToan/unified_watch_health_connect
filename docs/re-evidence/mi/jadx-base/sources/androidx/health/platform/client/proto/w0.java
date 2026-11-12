package androidx.health.platform.client.proto;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface w0 {
    void A(List<Long> list) throws IOException;

    void B(List<Integer> list) throws IOException;

    int C() throws IOException;

    long D() throws IOException;

    String E() throws IOException;

    int F() throws IOException;

    String G() throws IOException;

    <K, V> void H(Map<K, V> map, l0.a<K, V> aVar, y yVar) throws IOException;

    <T> void I(T t, w1<T> w1Var, y yVar) throws IOException;

    <T> void J(T t, w1<T> w1Var, y yVar) throws IOException;

    @Deprecated
    <T> void K(List<T> list, w1<T> w1Var, y yVar) throws IOException;

    <T> T L(Class<T> cls, y yVar) throws IOException;

    <T> void M(List<T> list, w1<T> w1Var, y yVar) throws IOException;

    @Deprecated
    <T> T N(Class<T> cls, y yVar) throws IOException;

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

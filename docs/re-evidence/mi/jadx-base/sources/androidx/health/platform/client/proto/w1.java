package androidx.health.platform.client.proto;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface w1<T> {
    void a(T t, T t2);

    boolean b(T t);

    void c(T t);

    int d(T t);

    T e();

    boolean equals(T t, T t2);

    void f(T t, byte[] bArr, int i, int i2, d.b bVar) throws IOException;

    void g(T t, Writer writer) throws IOException;

    void h(T t, w0 w0Var, y yVar) throws IOException;

    int hashCode(T t);
}

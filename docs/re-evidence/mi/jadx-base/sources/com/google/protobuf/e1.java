package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public interface e1<T> {
    void a(T t, T t2);

    boolean b(T t);

    void c(T t);

    int d(T t);

    T e();

    boolean equals(T t, T t2);

    void f(T t, Writer writer) throws IOException;

    void g(T t, byte[] bArr, int i, int i2, g.b bVar) throws IOException;

    void h(T t, a1 a1Var, t tVar) throws IOException;

    int hashCode(T t);
}

package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface k0<T> {
    void a(T t, T t2);

    boolean b(T t);

    void c(T t);

    int d(T t);

    T e();

    boolean equals(T t, T t2);

    void f(T t, Writer writer) throws IOException;

    void g(T t, i0 i0Var, l lVar) throws IOException;

    void h(T t, byte[] bArr, int i, int i2, d.b bVar) throws IOException;

    int hashCode(T t);
}

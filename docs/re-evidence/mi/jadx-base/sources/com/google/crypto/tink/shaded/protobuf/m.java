package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.p.b;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m<T extends p.b<T>> {
    public abstract int a(Map.Entry<?, ?> entry);

    public abstract Object b(l lVar, b0 b0Var, int i);

    public abstract p<T> c(Object obj);

    public abstract p<T> d(Object obj);

    public abstract boolean e(b0 b0Var);

    public abstract void f(Object obj);

    public abstract <UT, UB> UB g(i0 i0Var, Object obj, l lVar, p<T> pVar, UB ub, n0<UT, UB> n0Var) throws IOException;

    public abstract void h(i0 i0Var, Object obj, l lVar, p<T> pVar) throws IOException;

    public abstract void i(ByteString byteString, Object obj, l lVar, p<T> pVar) throws IOException;

    public abstract void j(Writer writer, Map.Entry<?, ?> entry) throws IOException;
}

package com.google.protobuf;

import com.google.protobuf.a0.c;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class u<T extends a0.c<T>> {
    public abstract int a(Map.Entry<?, ?> entry);

    public abstract Object b(t tVar, q0 q0Var, int i);

    public abstract a0<T> c(Object obj);

    public abstract a0<T> d(Object obj);

    public abstract boolean e(q0 q0Var);

    public abstract void f(Object obj);

    public abstract <UT, UB> UB g(a1 a1Var, Object obj, t tVar, a0<T> a0Var, UB ub, q1<UT, UB> q1Var) throws IOException;

    public abstract void h(a1 a1Var, Object obj, t tVar, a0<T> a0Var) throws IOException;

    public abstract void i(ByteString byteString, Object obj, t tVar, a0<T> a0Var) throws IOException;

    public abstract void j(Writer writer, Map.Entry<?, ?> entry) throws IOException;
}

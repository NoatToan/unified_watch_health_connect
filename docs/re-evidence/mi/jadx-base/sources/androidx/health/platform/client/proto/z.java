package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.c0.b;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class z<T extends c0.b<T>> {
    public abstract int a(Map.Entry<?, ?> entry);

    public abstract Object b(y yVar, o0 o0Var, int i);

    public abstract c0<T> c(Object obj);

    public abstract c0<T> d(Object obj);

    public abstract boolean e(o0 o0Var);

    public abstract void f(Object obj);

    public abstract <UT, UB> UB g(Object obj, w0 w0Var, Object obj2, y yVar, c0<T> c0Var, UB ub, b2<UT, UB> b2Var) throws IOException;

    public abstract void h(w0 w0Var, Object obj, y yVar, c0<T> c0Var) throws IOException;

    public abstract void i(ByteString byteString, Object obj, y yVar, c0<T> c0Var) throws IOException;

    public abstract void j(Writer writer, Map.Entry<?, ?> entry) throws IOException;
}

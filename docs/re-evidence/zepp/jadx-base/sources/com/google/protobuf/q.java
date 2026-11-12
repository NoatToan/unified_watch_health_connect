package com.google.protobuf;

import com.huami.message.api.WebConst;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
final class q {
    private static final q c = new q();
    private final ConcurrentMap<Class<?>, t<?>> b = new ConcurrentHashMap();
    private final u a = new ManifestSchemaFactory();

    private q() {
    }

    public static q a() {
        return c;
    }

    public int b() {
        int schemaSize = 0;
        for (t<?> tVar : this.b.values()) {
            if (tVar instanceof MessageSchema) {
                schemaSize += ((MessageSchema) tVar).getSchemaSize();
            }
        }
        return schemaSize;
    }

    public <T> boolean c(T t) {
        return j(t).isInitialized(t);
    }

    public <T> void d(T t) {
        j(t).makeImmutable(t);
    }

    public <T> void e(T t, s sVar) throws IOException {
        f(t, sVar, ExtensionRegistryLite.getEmptyRegistry());
    }

    public <T> void f(T t, s sVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        j(t).mergeFrom(t, sVar, extensionRegistryLite);
    }

    public t<?> g(Class<?> cls, t<?> tVar) {
        Internal.b(cls, WebConst.QueryParam.MESSAGE_TYPE);
        Internal.b(tVar, "schema");
        return this.b.putIfAbsent(cls, tVar);
    }

    public t<?> h(Class<?> cls, t<?> tVar) {
        Internal.b(cls, WebConst.QueryParam.MESSAGE_TYPE);
        Internal.b(tVar, "schema");
        return this.b.put(cls, tVar);
    }

    public <T> t<T> i(Class<T> cls) {
        Internal.b(cls, WebConst.QueryParam.MESSAGE_TYPE);
        t<T> tVar = (t) this.b.get(cls);
        if (tVar != null) {
            return tVar;
        }
        t<T> tVarCreateSchema = this.a.createSchema(cls);
        t<T> tVar2 = (t<T>) g(cls, tVarCreateSchema);
        return tVar2 != null ? tVar2 : tVarCreateSchema;
    }

    public <T> t<T> j(T t) {
        return i(t.getClass());
    }

    public <T> void k(T t, Writer writer) throws IOException {
        j(t).writeTo(t, writer);
    }
}

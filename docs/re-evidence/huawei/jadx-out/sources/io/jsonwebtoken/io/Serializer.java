package io.jsonwebtoken.io;

import defpackage.yxv;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes46.dex */
public interface Serializer<T> {
    void serialize(T t, OutputStream outputStream) throws yxv;

    @Deprecated
    byte[] serialize(T t) throws yxv;
}

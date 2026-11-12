package io.jsonwebtoken.io;

import defpackage.yxr;
import java.io.Reader;

/* JADX INFO: loaded from: classes46.dex */
public interface Deserializer<T> {
    T deserialize(Reader reader) throws yxr;

    @Deprecated
    T deserialize(byte[] bArr) throws yxr;
}

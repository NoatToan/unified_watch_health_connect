package io.jsonwebtoken.io;

import defpackage.yxv;
import defpackage.yxy;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes46.dex */
public abstract class AbstractSerializer<T> implements Serializer<T> {
    protected abstract void doSerialize(T t, OutputStream outputStream) throws Exception;

    @Override // io.jsonwebtoken.io.Serializer
    public final byte[] serialize(T t) throws yxv {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        serialize(t, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    @Override // io.jsonwebtoken.io.Serializer
    public final void serialize(T t, OutputStream outputStream) throws yxv {
        try {
            doSerialize(t, outputStream);
        } catch (Throwable th) {
            if (th instanceof yxv) {
                throw th;
            }
            throw new yxv("Unable to serialize object of type " + yxy.e(t) + ": " + th.getMessage(), th);
        }
    }
}

package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
interface t<T> {
    boolean equals(T t, T t2);

    int getSerializedSize(T t);

    int hashCode(T t);

    boolean isInitialized(T t);

    void makeImmutable(T t);

    void mergeFrom(T t, s sVar, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void mergeFrom(T t, T t2);

    void mergeFrom(T t, byte[] bArr, int i, int i2, b.C0256b c0256b) throws IOException;

    T newInstance();

    void writeTo(T t, Writer writer) throws IOException;
}

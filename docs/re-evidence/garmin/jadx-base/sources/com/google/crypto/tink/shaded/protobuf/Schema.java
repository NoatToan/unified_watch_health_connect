package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
interface Schema<T> {
    boolean equals(T t7, T t14);

    int getSerializedSize(T t7);

    int hashCode(T t7);

    boolean isInitialized(T t7);

    void makeImmutable(T t7);

    void mergeFrom(T t7, Reader reader, ExtensionRegistryLite extensionRegistryLite);

    void mergeFrom(T t7, T t14);

    void mergeFrom(T t7, byte[] bArr, int i14, int i15, ArrayDecoders.Registers registers);

    T newInstance();

    void writeTo(T t7, Writer writer);
}

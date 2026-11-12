package com.google.crypto.tink.shaded.protobuf;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface LazyStringList extends ProtocolStringList {
    void add(ByteString byteString);

    void add(byte[] bArr);

    boolean addAllByteArray(Collection<byte[]> collection);

    boolean addAllByteString(Collection<? extends ByteString> collection);

    List<byte[]> asByteArrayList();

    byte[] getByteArray(int i14);

    ByteString getByteString(int i14);

    Object getRaw(int i14);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();

    void mergeFrom(LazyStringList lazyStringList);

    void set(int i14, ByteString byteString);

    void set(int i14, byte[] bArr);
}

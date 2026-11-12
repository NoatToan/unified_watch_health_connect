package com.google.crypto.tink.shaded.protobuf;

import defpackage.asf;
import defpackage.ukh;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public interface b0 extends asf {

    public interface a extends asf, Cloneable {
        b0 build();

        b0 buildPartial();

        a mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;

        a o0(b0 b0Var);
    }

    void a(CodedOutputStream codedOutputStream) throws IOException;

    ukh<? extends b0> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    ByteString toByteString();
}

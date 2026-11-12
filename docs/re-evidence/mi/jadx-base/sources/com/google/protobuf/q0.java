package com.google.protobuf;

import defpackage.bsf;
import defpackage.vkh;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public interface q0 extends bsf {

    public interface a extends bsf, Cloneable {
        q0 build();

        q0 buildPartial();

        a mergeFrom(j jVar, t tVar) throws IOException;

        a mergeFrom(q0 q0Var);

        a mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;
    }

    vkh<? extends q0> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;
}

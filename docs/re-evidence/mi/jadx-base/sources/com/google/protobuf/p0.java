package com.google.protobuf;

import defpackage.vkh;

/* JADX INFO: loaded from: classes5.dex */
public interface p0 extends q0, s0 {

    public interface a extends q0.a, s0 {
        a addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        p0 build();

        p0 buildPartial();

        a clearField(Descriptors.FieldDescriptor fieldDescriptor);

        @Override // com.google.protobuf.s0
        Descriptors.b getDescriptorForType();

        a mergeFrom(ByteString byteString) throws InvalidProtocolBufferException;

        a mergeFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException;

        a mergeFrom(p0 p0Var);

        a newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor);

        a setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        a setUnknownFields(r1 r1Var);
    }

    vkh<? extends p0> getParserForType();

    a newBuilderForType();

    a toBuilder();
}

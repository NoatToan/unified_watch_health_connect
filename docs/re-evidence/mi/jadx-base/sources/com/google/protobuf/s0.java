package com.google.protobuf;

import defpackage.bsf;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface s0 extends bsf {
    Map<Descriptors.FieldDescriptor, Object> getAllFields();

    p0 getDefaultInstanceForType();

    Descriptors.b getDescriptorForType();

    Object getField(Descriptors.FieldDescriptor fieldDescriptor);

    r1 getUnknownFields();

    boolean hasField(Descriptors.FieldDescriptor fieldDescriptor);
}

package com.google.protobuf;

import com.google.protobuf.q0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Extension<ContainingType extends q0, Type> extends r<ContainingType, Type> {

    public enum ExtensionType {
        IMMUTABLE,
        MUTABLE,
        PROTO1
    }

    public enum MessageType {
        PROTO1,
        PROTO2
    }

    @Override // com.google.protobuf.r
    public final boolean a() {
        return false;
    }

    public abstract Object b(Object obj);

    public abstract Descriptors.FieldDescriptor c();

    public abstract p0 d();

    public abstract Object e(Object obj);
}

package com.google.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class NewInstanceSchemaLite implements m {
    @Override // com.google.protobuf.m
    public Object newInstance(Object obj) {
        return ((GeneratedMessageLite) obj).dynamicMethod(GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }
}

package com.google.protobuf;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
public interface Message extends MessageLite, MessageOrBuilder {

    public interface Builder extends MessageLite.Builder, MessageOrBuilder {
        @CanIgnoreReturnValue
        Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        Message build();

        Message buildPartial();

        @CanIgnoreReturnValue
        Builder clear();

        @CanIgnoreReturnValue
        Builder clearField(Descriptors.FieldDescriptor fieldDescriptor);

        @CanIgnoreReturnValue
        Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor);

        /* JADX INFO: renamed from: clone */
        Builder mo57clone();

        @Override // com.google.protobuf.MessageOrBuilder
        Descriptors.Descriptor getDescriptorForType();

        Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor);

        Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i14);

        @Override // com.google.protobuf.MessageLite.Builder
        boolean mergeDelimitedFrom(InputStream inputStream);

        @Override // com.google.protobuf.MessageLite.Builder
        boolean mergeDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite);

        @CanIgnoreReturnValue
        Builder mergeFrom(ByteString byteString);

        @CanIgnoreReturnValue
        Builder mergeFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite);

        @CanIgnoreReturnValue
        Builder mergeFrom(CodedInputStream codedInputStream);

        @CanIgnoreReturnValue
        Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        @CanIgnoreReturnValue
        Builder mergeFrom(Message message);

        @CanIgnoreReturnValue
        Builder mergeFrom(InputStream inputStream);

        @CanIgnoreReturnValue
        Builder mergeFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite);

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] bArr);

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] bArr, int i14, int i15);

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] bArr, int i14, int i15, ExtensionRegistryLite extensionRegistryLite);

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite);

        @CanIgnoreReturnValue
        Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet);

        Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor);

        @CanIgnoreReturnValue
        Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        @CanIgnoreReturnValue
        Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj);

        @CanIgnoreReturnValue
        Builder setUnknownFields(UnknownFieldSet unknownFieldSet);
    }

    boolean equals(Object obj);

    Parser<? extends Message> getParserForType();

    int hashCode();

    Builder newBuilderForType();

    Builder toBuilder();

    String toString();
}

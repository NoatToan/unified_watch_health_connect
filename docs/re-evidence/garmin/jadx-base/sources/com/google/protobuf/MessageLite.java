package com.google.protobuf;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite build();

        MessageLite buildPartial();

        @CanIgnoreReturnValue
        Builder clear();

        /* JADX INFO: renamed from: clone */
        Builder mo57clone();

        boolean mergeDelimitedFrom(InputStream inputStream);

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
        Builder mergeFrom(MessageLite messageLite);

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
    }

    Parser<? extends MessageLite> getParserForType();

    int getSerializedSize();

    Builder newBuilderForType();

    Builder toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeDelimitedTo(OutputStream outputStream);

    void writeTo(CodedOutputStream codedOutputStream);

    void writeTo(OutputStream outputStream);
}

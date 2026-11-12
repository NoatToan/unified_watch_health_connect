package com.garmin.proto.generated;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class GDISmartProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000eGDISmart.proto\u0012\u000fGDI.Proto.Smart\"\r\n\u0005Smart*\u0004\b\u0001\u0010bB-\n\u001acom.garmin.proto.generatedB\rGDISmartProtoH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Smart_Smart_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Smart_Smart_fieldAccessorTable;

    public interface SmartOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder<Smart> {
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_Smart_Smart_descriptor = descriptor2;
        internal_static_GDI_Proto_Smart_Smart_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[0]);
    }

    private GDISmartProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class Smart extends GeneratedMessageV3.ExtendableMessage<Smart> implements SmartOrBuilder {
        private static final Smart DEFAULT_INSTANCE = new Smart();

        @Deprecated
        public static final Parser<Smart> PARSER = new AbstractParser<Smart>() { // from class: com.garmin.proto.generated.GDISmartProto.Smart.1
            @Override // com.google.protobuf.Parser
            public Smart parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Smart.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        private Smart(GeneratedMessageV3.ExtendableBuilder<Smart, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Smart getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISmartProto.internal_static_GDI_Proto_Smart_Smart_descriptor;
        }

        public static Builder newBuilder(Smart smart) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(smart);
        }

        public static Smart parseDelimitedFrom(InputStream inputStream) {
            return (Smart) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Smart parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Smart> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Smart)) {
                return super.equals(obj);
            }
            Smart smart = (Smart) obj;
            return getUnknownFields().equals(smart.getUnknownFields()) && getExtensionFields().equals(smart.getExtensionFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Smart> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + (AbstractMessage.hashFields(getDescriptor().hashCode() + 779, getExtensionFields()) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISmartProto.internal_static_GDI_Proto_Smart_Smart_fieldAccessorTable.ensureFieldAccessorsInitialized(Smart.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Smart();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            newExtensionWriter().writeUntil(98, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<Smart, Builder> implements SmartOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISmartProto.internal_static_GDI_Proto_Smart_Smart_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder addExtension(GeneratedMessage.GeneratedExtension<Smart, List<Type>> generatedExtension, Type type) {
                return (Builder) super.addExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Smart build() {
                Smart smartBuildPartial = buildPartial();
                if (smartBuildPartial.isInitialized()) {
                    return smartBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) smartBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Smart buildPartial() {
                Smart smart = new Smart(this);
                onBuilt();
                return smart;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <T> Builder clearExtension(GeneratedMessage.GeneratedExtension<Smart, T> generatedExtension) {
                return (Builder) super.clearExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISmartProto.internal_static_GDI_Proto_Smart_Smart_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISmartProto.internal_static_GDI_Proto_Smart_Smart_fieldAccessorTable.ensureFieldAccessorsInitialized(Smart.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return extensionsAreInitialized();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z14 = true;
                            }
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<Smart, Type> generatedExtension, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, Type>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Smart getDefaultInstanceForType() {
                return Smart.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return addExtension((GeneratedMessage.GeneratedExtension<Smart, List<Object>>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<Smart, Object>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, int i14, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<Smart, List<Object>>) generatedExtension, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<Smart, List<Type>> generatedExtension, int i14, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, i14, type);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Smart) {
                    return mergeFrom((Smart) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Smart smart) {
                if (smart == Smart.getDefaultInstance()) {
                    return this;
                }
                mergeExtensionFields(smart);
                mergeUnknownFields(smart.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Smart getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ Smart(Builder builder) {
            this((GeneratedMessageV3.ExtendableBuilder<Smart, ?>) builder);
        }

        private Smart() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Smart parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Smart) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Smart parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Smart parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Smart parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Smart parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Smart parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Smart parseFrom(InputStream inputStream) {
            return (Smart) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Smart parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Smart) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Smart parseFrom(CodedInputStream codedInputStream) {
            return (Smart) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Smart parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Smart) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}

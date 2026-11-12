package com.garmin.proto.generated;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class SaMDEcg {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fGDIEcg.proto\u0012\u0012GDI.Proto.SaMD.Ecg\"¿\u0003\n\u0007Service\u00129\n\u000eenable_request\u0018\u0001 \u0001(\u000b2!.GDI.Proto.SaMD.Ecg.EnableRequest\u0012;\n\u000fenable_response\u0018\u0002 \u0001(\u000b2\".GDI.Proto.SaMD.Ecg.EnableResponse\u00129\n\u000elaunch_request\u0018\u0003 \u0001(\u000b2!.GDI.Proto.SaMD.Ecg.LaunchRequest\u0012;\n\u000flaunch_response\u0018\u0004 \u0001(\u000b2\".GDI.Proto.SaMD.Ecg.LaunchResponse\u0012>\n\u0011first_read_result\u0018\u0005 \u0001(\u000b2#.GDI.Proto.SaMD.Ecg.FirstReadResult\u0012@\n\u0012app_status_request\u0018\u0006 \u0001(\u000b2$.GDI.Proto.SaMD.Ecg.AppStatusRequest\u0012B\n\u0013app_status_response\u0018\u0007 \u0001(\u000b2%.GDI.Proto.SaMD.Ecg.AppStatusResponse\" \n\rEnableRequest\u0012\u000f\n\u0007samd_id\u0018\u0001 \u0001(\t\"\u007f\n\u000eEnableResponse\u0012A\n\u0006status\u0018\u0001 \u0001(\u000e21.GDI.Proto.SaMD.Ecg.EnableResponse.ResponseStatus\"*\n\u000eResponseStatus\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u000b\n\u0007FAILURE\u0010\u0001\"\u000f\n\rLaunchRequest\"ª\u0001\n\u000eLaunchResponse\u0012A\n\u0006status\u0018\u0001 \u0001(\u000e21.GDI.Proto.SaMD.Ecg.LaunchResponse.ResponseStatus\"U\n\u000eResponseStatus\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u0010\n\fFAILURE_BUSY\u0010\u0001\u0012\u0017\n\u0013FAILURE_LOW_BATTERY\u0010\u0002\u0012\u000b\n\u0007FAILURE\u0010\u0003\"q\n\u000fFirstReadResult\u0012:\n\u0006status\u0018\u0001 \u0001(\u000e2*.GDI.Proto.SaMD.Ecg.FirstReadResult.Status\"\"\n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u000b\n\u0007TIMEOUT\u0010\u0001\"\u0012\n\u0010AppStatusRequest\"\u0086\u0001\n\u0011AppStatusResponse\u0012D\n\u0006status\u0018\u0001 \u0001(\u000e24.GDI.Proto.SaMD.Ecg.AppStatusResponse.ResponseStatus\"+\n\u000eResponseStatus\u0012\f\n\bDISABLED\u0010\u0000\u0012\u000b\n\u0007ENABLED\u0010\u0001B'\n\u001acom.garmin.proto.generatedB\u0007SaMDEcgH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SaMD_Ecg_AppStatusRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SaMD_Ecg_AppStatusRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SaMD_Ecg_AppStatusResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SaMD_Ecg_AppStatusResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SaMD_Ecg_EnableRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SaMD_Ecg_EnableRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SaMD_Ecg_EnableResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SaMD_Ecg_EnableResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SaMD_Ecg_FirstReadResult_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SaMD_Ecg_FirstReadResult_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SaMD_Ecg_LaunchRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SaMD_Ecg_LaunchRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SaMD_Ecg_LaunchResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SaMD_Ecg_LaunchResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SaMD_Ecg_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SaMD_Ecg_Service_fieldAccessorTable;

    public interface AppStatusRequestOrBuilder extends MessageOrBuilder {
    }

    public interface AppStatusResponseOrBuilder extends MessageOrBuilder {
        AppStatusResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface EnableRequestOrBuilder extends MessageOrBuilder {
        String getSamdId();

        ByteString getSamdIdBytes();

        boolean hasSamdId();
    }

    public interface EnableResponseOrBuilder extends MessageOrBuilder {
        EnableResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface FirstReadResultOrBuilder extends MessageOrBuilder {
        FirstReadResult.Status getStatus();

        boolean hasStatus();
    }

    public interface LaunchRequestOrBuilder extends MessageOrBuilder {
    }

    public interface LaunchResponseOrBuilder extends MessageOrBuilder {
        LaunchResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        AppStatusRequest getAppStatusRequest();

        AppStatusRequestOrBuilder getAppStatusRequestOrBuilder();

        AppStatusResponse getAppStatusResponse();

        AppStatusResponseOrBuilder getAppStatusResponseOrBuilder();

        EnableRequest getEnableRequest();

        EnableRequestOrBuilder getEnableRequestOrBuilder();

        EnableResponse getEnableResponse();

        EnableResponseOrBuilder getEnableResponseOrBuilder();

        FirstReadResult getFirstReadResult();

        FirstReadResultOrBuilder getFirstReadResultOrBuilder();

        LaunchRequest getLaunchRequest();

        LaunchRequestOrBuilder getLaunchRequestOrBuilder();

        LaunchResponse getLaunchResponse();

        LaunchResponseOrBuilder getLaunchResponseOrBuilder();

        boolean hasAppStatusRequest();

        boolean hasAppStatusResponse();

        boolean hasEnableRequest();

        boolean hasEnableResponse();

        boolean hasFirstReadResult();

        boolean hasLaunchRequest();

        boolean hasLaunchResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_SaMD_Ecg_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_SaMD_Ecg_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"EnableRequest", "EnableResponse", "LaunchRequest", "LaunchResponse", "FirstReadResult", "AppStatusRequest", "AppStatusResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_SaMD_Ecg_EnableRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_SaMD_Ecg_EnableRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"SamdId"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_SaMD_Ecg_EnableResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_SaMD_Ecg_EnableResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_SaMD_Ecg_LaunchRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_SaMD_Ecg_LaunchRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[0]);
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_SaMD_Ecg_LaunchResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_SaMD_Ecg_LaunchResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_SaMD_Ecg_FirstReadResult_descriptor = descriptor7;
        internal_static_GDI_Proto_SaMD_Ecg_FirstReadResult_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Status"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_SaMD_Ecg_AppStatusRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_SaMD_Ecg_AppStatusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[0]);
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_SaMD_Ecg_AppStatusResponse_descriptor = descriptor9;
        internal_static_GDI_Proto_SaMD_Ecg_AppStatusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Status"});
    }

    private SaMDEcg() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class AppStatusRequest extends GeneratedMessageV3 implements AppStatusRequestOrBuilder {
        private static final AppStatusRequest DEFAULT_INSTANCE = new AppStatusRequest();

        @Deprecated
        public static final Parser<AppStatusRequest> PARSER = new AbstractParser<AppStatusRequest>() { // from class: com.garmin.proto.generated.SaMDEcg.AppStatusRequest.1
            @Override // com.google.protobuf.Parser
            public AppStatusRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AppStatusRequest.newBuilder();
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

        private AppStatusRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AppStatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_AppStatusRequest_descriptor;
        }

        public static Builder newBuilder(AppStatusRequest appStatusRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(appStatusRequest);
        }

        public static AppStatusRequest parseDelimitedFrom(InputStream inputStream) {
            return (AppStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AppStatusRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AppStatusRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof AppStatusRequest) {
                return getUnknownFields().equals(((AppStatusRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AppStatusRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_AppStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AppStatusRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new AppStatusRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AppStatusRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_AppStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AppStatusRequest build() {
                AppStatusRequest appStatusRequestBuildPartial = buildPartial();
                if (appStatusRequestBuildPartial.isInitialized()) {
                    return appStatusRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) appStatusRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AppStatusRequest buildPartial() {
                AppStatusRequest appStatusRequest = new AppStatusRequest(this);
                onBuilt();
                return appStatusRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_AppStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_AppStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AppStatusRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
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
            public AppStatusRequest getDefaultInstanceForType() {
                return AppStatusRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AppStatusRequest) {
                    return mergeFrom((AppStatusRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AppStatusRequest appStatusRequest) {
                if (appStatusRequest == AppStatusRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(appStatusRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AppStatusRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ AppStatusRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private AppStatusRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AppStatusRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AppStatusRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AppStatusRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AppStatusRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AppStatusRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AppStatusRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AppStatusRequest parseFrom(InputStream inputStream) {
            return (AppStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AppStatusRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AppStatusRequest parseFrom(CodedInputStream codedInputStream) {
            return (AppStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AppStatusRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LaunchRequest extends GeneratedMessageV3 implements LaunchRequestOrBuilder {
        private static final LaunchRequest DEFAULT_INSTANCE = new LaunchRequest();

        @Deprecated
        public static final Parser<LaunchRequest> PARSER = new AbstractParser<LaunchRequest>() { // from class: com.garmin.proto.generated.SaMDEcg.LaunchRequest.1
            @Override // com.google.protobuf.Parser
            public LaunchRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LaunchRequest.newBuilder();
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

        private LaunchRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LaunchRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_LaunchRequest_descriptor;
        }

        public static Builder newBuilder(LaunchRequest launchRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(launchRequest);
        }

        public static LaunchRequest parseDelimitedFrom(InputStream inputStream) {
            return (LaunchRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LaunchRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LaunchRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof LaunchRequest) {
                return getUnknownFields().equals(((LaunchRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LaunchRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_LaunchRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LaunchRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new LaunchRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LaunchRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_LaunchRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LaunchRequest build() {
                LaunchRequest launchRequestBuildPartial = buildPartial();
                if (launchRequestBuildPartial.isInitialized()) {
                    return launchRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) launchRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LaunchRequest buildPartial() {
                LaunchRequest launchRequest = new LaunchRequest(this);
                onBuilt();
                return launchRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_LaunchRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_LaunchRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LaunchRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
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
            public LaunchRequest getDefaultInstanceForType() {
                return LaunchRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LaunchRequest) {
                    return mergeFrom((LaunchRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LaunchRequest launchRequest) {
                if (launchRequest == LaunchRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(launchRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LaunchRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ LaunchRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private LaunchRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LaunchRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LaunchRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LaunchRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LaunchRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LaunchRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LaunchRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LaunchRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LaunchRequest parseFrom(InputStream inputStream) {
            return (LaunchRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LaunchRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LaunchRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LaunchRequest parseFrom(CodedInputStream codedInputStream) {
            return (LaunchRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LaunchRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LaunchRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AppStatusResponse extends GeneratedMessageV3 implements AppStatusResponseOrBuilder {
        private static final AppStatusResponse DEFAULT_INSTANCE = new AppStatusResponse();

        @Deprecated
        public static final Parser<AppStatusResponse> PARSER = new AbstractParser<AppStatusResponse>() { // from class: com.garmin.proto.generated.SaMDEcg.AppStatusResponse.1
            @Override // com.google.protobuf.Parser
            public AppStatusResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AppStatusResponse.newBuilder();
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
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;

        private AppStatusResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AppStatusResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_AppStatusResponse_descriptor;
        }

        public static Builder newBuilder(AppStatusResponse appStatusResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(appStatusResponse);
        }

        public static AppStatusResponse parseDelimitedFrom(InputStream inputStream) {
            return (AppStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AppStatusResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AppStatusResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppStatusResponse)) {
                return super.equals(obj);
            }
            AppStatusResponse appStatusResponse = (AppStatusResponse) obj;
            if (hasStatus() != appStatusResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == appStatusResponse.status_) && getUnknownFields().equals(appStatusResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AppStatusResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.AppStatusResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.DISABLED : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.AppStatusResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.status_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_AppStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AppStatusResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new AppStatusResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AppStatusResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(AppStatusResponse appStatusResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    appStatusResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                appStatusResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_AppStatusResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AppStatusResponse build() {
                AppStatusResponse appStatusResponseBuildPartial = buildPartial();
                if (appStatusResponseBuildPartial.isInitialized()) {
                    return appStatusResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) appStatusResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AppStatusResponse buildPartial() {
                AppStatusResponse appStatusResponse = new AppStatusResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(appStatusResponse);
                }
                onBuilt();
                return appStatusResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_AppStatusResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.AppStatusResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.DISABLED : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.AppStatusResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_AppStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AppStatusResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AppStatusResponse getDefaultInstanceForType() {
                return AppStatusResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AppStatusResponse) {
                    return mergeFrom((AppStatusResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AppStatusResponse appStatusResponse) {
                if (appStatusResponse == AppStatusResponse.getDefaultInstance()) {
                    return this;
                }
                if (appStatusResponse.hasStatus()) {
                    setStatus(appStatusResponse.getStatus());
                }
                mergeUnknownFields(appStatusResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AppStatusResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AppStatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AppStatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ AppStatusResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AppStatusResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private AppStatusResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AppStatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AppStatusResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AppStatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AppStatusResponse parseFrom(InputStream inputStream) {
            return (AppStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AppStatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AppStatusResponse parseFrom(CodedInputStream codedInputStream) {
            return (AppStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AppStatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            DISABLED(0),
            ENABLED(1);

            public static final int DISABLED_VALUE = 0;
            public static final int ENABLED_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.SaMDEcg.AppStatusResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                if (i14 == 0) {
                    return DISABLED;
                }
                if (i14 != 1) {
                    return null;
                }
                return ENABLED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return AppStatusResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                h.s("EnumValueDescriptor is not for this type.");
                return null;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class EnableRequest extends GeneratedMessageV3 implements EnableRequestOrBuilder {
        private static final EnableRequest DEFAULT_INSTANCE = new EnableRequest();

        @Deprecated
        public static final Parser<EnableRequest> PARSER = new AbstractParser<EnableRequest>() { // from class: com.garmin.proto.generated.SaMDEcg.EnableRequest.1
            @Override // com.google.protobuf.Parser
            public EnableRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EnableRequest.newBuilder();
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
        public static final int SAMD_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object samdId_;

        private EnableRequest() {
            this.samdId_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.samdId_ = "";
        }

        public static EnableRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_EnableRequest_descriptor;
        }

        public static Builder newBuilder(EnableRequest enableRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(enableRequest);
        }

        public static EnableRequest parseDelimitedFrom(InputStream inputStream) {
            return (EnableRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EnableRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EnableRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnableRequest)) {
                return super.equals(obj);
            }
            EnableRequest enableRequest = (EnableRequest) obj;
            if (hasSamdId() != enableRequest.hasSamdId()) {
                return false;
            }
            return (!hasSamdId() || getSamdId().equals(enableRequest.getSamdId())) && getUnknownFields().equals(enableRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EnableRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.EnableRequestOrBuilder
        public String getSamdId() {
            Object obj = this.samdId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.samdId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.EnableRequestOrBuilder
        public ByteString getSamdIdBytes() {
            Object obj = this.samdId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.samdId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.samdId_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.EnableRequestOrBuilder
        public boolean hasSamdId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSamdId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSamdId().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_EnableRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EnableRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new EnableRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.samdId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnableRequestOrBuilder {
            private int bitField0_;
            private Object samdId_;

            private Builder() {
                this.samdId_ = "";
            }

            private void buildPartial0(EnableRequest enableRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    enableRequest.samdId_ = this.samdId_;
                } else {
                    i14 = 0;
                }
                enableRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_EnableRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnableRequest build() {
                EnableRequest enableRequestBuildPartial = buildPartial();
                if (enableRequestBuildPartial.isInitialized()) {
                    return enableRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) enableRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnableRequest buildPartial() {
                EnableRequest enableRequest = new EnableRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(enableRequest);
                }
                onBuilt();
                return enableRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.samdId_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSamdId() {
                this.samdId_ = EnableRequest.getDefaultInstance().getSamdId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_EnableRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.EnableRequestOrBuilder
            public String getSamdId() {
                Object obj = this.samdId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.samdId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.EnableRequestOrBuilder
            public ByteString getSamdIdBytes() {
                Object obj = this.samdId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.samdId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.EnableRequestOrBuilder
            public boolean hasSamdId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_EnableRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EnableRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.samdId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSamdId(String str) {
                str.getClass();
                this.samdId_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSamdIdBytes(ByteString byteString) {
                byteString.getClass();
                this.samdId_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EnableRequest getDefaultInstanceForType() {
                return EnableRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.samdId_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EnableRequest) {
                    return mergeFrom((EnableRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EnableRequest enableRequest) {
                if (enableRequest == EnableRequest.getDefaultInstance()) {
                    return this;
                }
                if (enableRequest.hasSamdId()) {
                    this.samdId_ = enableRequest.samdId_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                mergeUnknownFields(enableRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EnableRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EnableRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnableRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EnableRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EnableRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EnableRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EnableRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private EnableRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.samdId_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EnableRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EnableRequest parseFrom(InputStream inputStream) {
            return (EnableRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ EnableRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static EnableRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnableRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EnableRequest parseFrom(CodedInputStream codedInputStream) {
            return (EnableRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EnableRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnableRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EnableResponse extends GeneratedMessageV3 implements EnableResponseOrBuilder {
        private static final EnableResponse DEFAULT_INSTANCE = new EnableResponse();

        @Deprecated
        public static final Parser<EnableResponse> PARSER = new AbstractParser<EnableResponse>() { // from class: com.garmin.proto.generated.SaMDEcg.EnableResponse.1
            @Override // com.google.protobuf.Parser
            public EnableResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EnableResponse.newBuilder();
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
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;

        private EnableResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EnableResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_EnableResponse_descriptor;
        }

        public static Builder newBuilder(EnableResponse enableResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(enableResponse);
        }

        public static EnableResponse parseDelimitedFrom(InputStream inputStream) {
            return (EnableResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EnableResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EnableResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnableResponse)) {
                return super.equals(obj);
            }
            EnableResponse enableResponse = (EnableResponse) obj;
            if (hasStatus() != enableResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == enableResponse.status_) && getUnknownFields().equals(enableResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EnableResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.EnableResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.EnableResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.status_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_EnableResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EnableResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new EnableResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnableResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(EnableResponse enableResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    enableResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                enableResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_EnableResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnableResponse build() {
                EnableResponse enableResponseBuildPartial = buildPartial();
                if (enableResponseBuildPartial.isInitialized()) {
                    return enableResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) enableResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnableResponse buildPartial() {
                EnableResponse enableResponse = new EnableResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(enableResponse);
                }
                onBuilt();
                return enableResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_EnableResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.EnableResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.EnableResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_EnableResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EnableResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EnableResponse getDefaultInstanceForType() {
                return EnableResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EnableResponse) {
                    return mergeFrom((EnableResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EnableResponse enableResponse) {
                if (enableResponse == EnableResponse.getDefaultInstance()) {
                    return this;
                }
                if (enableResponse.hasStatus()) {
                    setStatus(enableResponse.getStatus());
                }
                mergeUnknownFields(enableResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EnableResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EnableResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnableResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EnableResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ EnableResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static EnableResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private EnableResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EnableResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EnableResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EnableResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EnableResponse parseFrom(InputStream inputStream) {
            return (EnableResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EnableResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnableResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EnableResponse parseFrom(CodedInputStream codedInputStream) {
            return (EnableResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EnableResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnableResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            SUCCESS(0),
            FAILURE(1);

            public static final int FAILURE_VALUE = 1;
            public static final int SUCCESS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.SaMDEcg.EnableResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                if (i14 == 0) {
                    return SUCCESS;
                }
                if (i14 != 1) {
                    return null;
                }
                return FAILURE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return EnableResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                h.s("EnumValueDescriptor is not for this type.");
                return null;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class FirstReadResult extends GeneratedMessageV3 implements FirstReadResultOrBuilder {
        private static final FirstReadResult DEFAULT_INSTANCE = new FirstReadResult();

        @Deprecated
        public static final Parser<FirstReadResult> PARSER = new AbstractParser<FirstReadResult>() { // from class: com.garmin.proto.generated.SaMDEcg.FirstReadResult.1
            @Override // com.google.protobuf.Parser
            public FirstReadResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FirstReadResult.newBuilder();
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
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;

        private FirstReadResult(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FirstReadResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_FirstReadResult_descriptor;
        }

        public static Builder newBuilder(FirstReadResult firstReadResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(firstReadResult);
        }

        public static FirstReadResult parseDelimitedFrom(InputStream inputStream) {
            return (FirstReadResult) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FirstReadResult parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FirstReadResult> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FirstReadResult)) {
                return super.equals(obj);
            }
            FirstReadResult firstReadResult = (FirstReadResult) obj;
            if (hasStatus() != firstReadResult.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == firstReadResult.status_) && getUnknownFields().equals(firstReadResult.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FirstReadResult> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.FirstReadResultOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.FirstReadResultOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.status_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_FirstReadResult_fieldAccessorTable.ensureFieldAccessorsInitialized(FirstReadResult.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new FirstReadResult();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FirstReadResultOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(FirstReadResult firstReadResult) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    firstReadResult.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                firstReadResult.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_FirstReadResult_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FirstReadResult build() {
                FirstReadResult firstReadResultBuildPartial = buildPartial();
                if (firstReadResultBuildPartial.isInitialized()) {
                    return firstReadResultBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) firstReadResultBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FirstReadResult buildPartial() {
                FirstReadResult firstReadResult = new FirstReadResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(firstReadResult);
                }
                onBuilt();
                return firstReadResult;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_FirstReadResult_descriptor;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.FirstReadResultOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.FirstReadResultOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_FirstReadResult_fieldAccessorTable.ensureFieldAccessorsInitialized(FirstReadResult.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(Status status) {
                status.getClass();
                this.bitField0_ |= 1;
                this.status_ = status.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FirstReadResult getDefaultInstanceForType() {
                return FirstReadResult.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FirstReadResult) {
                    return mergeFrom((FirstReadResult) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FirstReadResult firstReadResult) {
                if (firstReadResult == FirstReadResult.getDefaultInstance()) {
                    return this;
                }
                if (firstReadResult.hasStatus()) {
                    setStatus(firstReadResult.getStatus());
                }
                mergeUnknownFields(firstReadResult.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FirstReadResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FirstReadResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FirstReadResult) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FirstReadResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ FirstReadResult(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static FirstReadResult parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private FirstReadResult() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FirstReadResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FirstReadResult parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FirstReadResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FirstReadResult parseFrom(InputStream inputStream) {
            return (FirstReadResult) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FirstReadResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FirstReadResult) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FirstReadResult parseFrom(CodedInputStream codedInputStream) {
            return (FirstReadResult) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FirstReadResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FirstReadResult) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            SUCCESS(0),
            TIMEOUT(1);

            public static final int SUCCESS_VALUE = 0;
            public static final int TIMEOUT_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.SaMDEcg.FirstReadResult.Status.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Status findValueByNumber(int i14) {
                    return Status.forNumber(i14);
                }
            };
            private static final Status[] VALUES = values();

            Status(int i14) {
                this.value = i14;
            }

            public static Status forNumber(int i14) {
                if (i14 == 0) {
                    return SUCCESS;
                }
                if (i14 != 1) {
                    return null;
                }
                return TIMEOUT;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return FirstReadResult.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Status> internalGetValueMap() {
                return internalValueMap;
            }

            public static Status valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                h.s("EnumValueDescriptor is not for this type.");
                return null;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static Status valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class LaunchResponse extends GeneratedMessageV3 implements LaunchResponseOrBuilder {
        private static final LaunchResponse DEFAULT_INSTANCE = new LaunchResponse();

        @Deprecated
        public static final Parser<LaunchResponse> PARSER = new AbstractParser<LaunchResponse>() { // from class: com.garmin.proto.generated.SaMDEcg.LaunchResponse.1
            @Override // com.google.protobuf.Parser
            public LaunchResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LaunchResponse.newBuilder();
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
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;

        private LaunchResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LaunchResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_LaunchResponse_descriptor;
        }

        public static Builder newBuilder(LaunchResponse launchResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(launchResponse);
        }

        public static LaunchResponse parseDelimitedFrom(InputStream inputStream) {
            return (LaunchResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LaunchResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LaunchResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LaunchResponse)) {
                return super.equals(obj);
            }
            LaunchResponse launchResponse = (LaunchResponse) obj;
            if (hasStatus() != launchResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == launchResponse.status_) && getUnknownFields().equals(launchResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LaunchResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.LaunchResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.LaunchResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.status_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_LaunchResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LaunchResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new LaunchResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LaunchResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(LaunchResponse launchResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    launchResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                launchResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_LaunchResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LaunchResponse build() {
                LaunchResponse launchResponseBuildPartial = buildPartial();
                if (launchResponseBuildPartial.isInitialized()) {
                    return launchResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) launchResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LaunchResponse buildPartial() {
                LaunchResponse launchResponse = new LaunchResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(launchResponse);
                }
                onBuilt();
                return launchResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_LaunchResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.LaunchResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.LaunchResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_LaunchResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LaunchResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LaunchResponse getDefaultInstanceForType() {
                return LaunchResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LaunchResponse) {
                    return mergeFrom((LaunchResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LaunchResponse launchResponse) {
                if (launchResponse == LaunchResponse.getDefaultInstance()) {
                    return this;
                }
                if (launchResponse.hasStatus()) {
                    setStatus(launchResponse.getStatus());
                }
                mergeUnknownFields(launchResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LaunchResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LaunchResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LaunchResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LaunchResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ LaunchResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LaunchResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private LaunchResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LaunchResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LaunchResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LaunchResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LaunchResponse parseFrom(InputStream inputStream) {
            return (LaunchResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LaunchResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LaunchResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LaunchResponse parseFrom(CodedInputStream codedInputStream) {
            return (LaunchResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LaunchResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LaunchResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            SUCCESS(0),
            FAILURE_BUSY(1),
            FAILURE_LOW_BATTERY(2),
            FAILURE(3);

            public static final int FAILURE_BUSY_VALUE = 1;
            public static final int FAILURE_LOW_BATTERY_VALUE = 2;
            public static final int FAILURE_VALUE = 3;
            public static final int SUCCESS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.SaMDEcg.LaunchResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                if (i14 == 0) {
                    return SUCCESS;
                }
                if (i14 == 1) {
                    return FAILURE_BUSY;
                }
                if (i14 == 2) {
                    return FAILURE_LOW_BATTERY;
                }
                if (i14 != 3) {
                    return null;
                }
                return FAILURE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return LaunchResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                h.s("EnumValueDescriptor is not for this type.");
                return null;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int APP_STATUS_REQUEST_FIELD_NUMBER = 6;
        public static final int APP_STATUS_RESPONSE_FIELD_NUMBER = 7;
        public static final int ENABLE_REQUEST_FIELD_NUMBER = 1;
        public static final int ENABLE_RESPONSE_FIELD_NUMBER = 2;
        public static final int FIRST_READ_RESULT_FIELD_NUMBER = 5;
        public static final int LAUNCH_REQUEST_FIELD_NUMBER = 3;
        public static final int LAUNCH_RESPONSE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private AppStatusRequest appStatusRequest_;
        private AppStatusResponse appStatusResponse_;
        private int bitField0_;
        private EnableRequest enableRequest_;
        private EnableResponse enableResponse_;
        private FirstReadResult firstReadResult_;
        private LaunchRequest launchRequest_;
        private LaunchResponse launchResponse_;
        private byte memoizedIsInitialized;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.SaMDEcg.Service.1
            @Override // com.google.protobuf.Parser
            public Service parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Service.newBuilder();
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

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_Service_descriptor;
        }

        public static Builder newBuilder(Service service) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(service);
        }

        public static Service parseDelimitedFrom(InputStream inputStream) {
            return (Service) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Service parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Service> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Service)) {
                return super.equals(obj);
            }
            Service service = (Service) obj;
            if (hasEnableRequest() != service.hasEnableRequest()) {
                return false;
            }
            if ((hasEnableRequest() && !getEnableRequest().equals(service.getEnableRequest())) || hasEnableResponse() != service.hasEnableResponse()) {
                return false;
            }
            if ((hasEnableResponse() && !getEnableResponse().equals(service.getEnableResponse())) || hasLaunchRequest() != service.hasLaunchRequest()) {
                return false;
            }
            if ((hasLaunchRequest() && !getLaunchRequest().equals(service.getLaunchRequest())) || hasLaunchResponse() != service.hasLaunchResponse()) {
                return false;
            }
            if ((hasLaunchResponse() && !getLaunchResponse().equals(service.getLaunchResponse())) || hasFirstReadResult() != service.hasFirstReadResult()) {
                return false;
            }
            if ((hasFirstReadResult() && !getFirstReadResult().equals(service.getFirstReadResult())) || hasAppStatusRequest() != service.hasAppStatusRequest()) {
                return false;
            }
            if ((!hasAppStatusRequest() || getAppStatusRequest().equals(service.getAppStatusRequest())) && hasAppStatusResponse() == service.hasAppStatusResponse()) {
                return (!hasAppStatusResponse() || getAppStatusResponse().equals(service.getAppStatusResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public AppStatusRequest getAppStatusRequest() {
            AppStatusRequest appStatusRequest = this.appStatusRequest_;
            return appStatusRequest == null ? AppStatusRequest.getDefaultInstance() : appStatusRequest;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public AppStatusRequestOrBuilder getAppStatusRequestOrBuilder() {
            AppStatusRequest appStatusRequest = this.appStatusRequest_;
            return appStatusRequest == null ? AppStatusRequest.getDefaultInstance() : appStatusRequest;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public AppStatusResponse getAppStatusResponse() {
            AppStatusResponse appStatusResponse = this.appStatusResponse_;
            return appStatusResponse == null ? AppStatusResponse.getDefaultInstance() : appStatusResponse;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public AppStatusResponseOrBuilder getAppStatusResponseOrBuilder() {
            AppStatusResponse appStatusResponse = this.appStatusResponse_;
            return appStatusResponse == null ? AppStatusResponse.getDefaultInstance() : appStatusResponse;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public EnableRequest getEnableRequest() {
            EnableRequest enableRequest = this.enableRequest_;
            return enableRequest == null ? EnableRequest.getDefaultInstance() : enableRequest;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public EnableRequestOrBuilder getEnableRequestOrBuilder() {
            EnableRequest enableRequest = this.enableRequest_;
            return enableRequest == null ? EnableRequest.getDefaultInstance() : enableRequest;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public EnableResponse getEnableResponse() {
            EnableResponse enableResponse = this.enableResponse_;
            return enableResponse == null ? EnableResponse.getDefaultInstance() : enableResponse;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public EnableResponseOrBuilder getEnableResponseOrBuilder() {
            EnableResponse enableResponse = this.enableResponse_;
            return enableResponse == null ? EnableResponse.getDefaultInstance() : enableResponse;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public FirstReadResult getFirstReadResult() {
            FirstReadResult firstReadResult = this.firstReadResult_;
            return firstReadResult == null ? FirstReadResult.getDefaultInstance() : firstReadResult;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public FirstReadResultOrBuilder getFirstReadResultOrBuilder() {
            FirstReadResult firstReadResult = this.firstReadResult_;
            return firstReadResult == null ? FirstReadResult.getDefaultInstance() : firstReadResult;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public LaunchRequest getLaunchRequest() {
            LaunchRequest launchRequest = this.launchRequest_;
            return launchRequest == null ? LaunchRequest.getDefaultInstance() : launchRequest;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public LaunchRequestOrBuilder getLaunchRequestOrBuilder() {
            LaunchRequest launchRequest = this.launchRequest_;
            return launchRequest == null ? LaunchRequest.getDefaultInstance() : launchRequest;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public LaunchResponse getLaunchResponse() {
            LaunchResponse launchResponse = this.launchResponse_;
            return launchResponse == null ? LaunchResponse.getDefaultInstance() : launchResponse;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public LaunchResponseOrBuilder getLaunchResponseOrBuilder() {
            LaunchResponse launchResponse = this.launchResponse_;
            return launchResponse == null ? LaunchResponse.getDefaultInstance() : launchResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Service> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getEnableRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getEnableResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getLaunchRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getLaunchResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getFirstReadResult());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getAppStatusRequest());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getAppStatusResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public boolean hasAppStatusRequest() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public boolean hasAppStatusResponse() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public boolean hasEnableRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public boolean hasEnableResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public boolean hasFirstReadResult() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public boolean hasLaunchRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
        public boolean hasLaunchResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEnableRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEnableRequest().hashCode();
            }
            if (hasEnableResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getEnableResponse().hashCode();
            }
            if (hasLaunchRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getLaunchRequest().hashCode();
            }
            if (hasLaunchResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getLaunchResponse().hashCode();
            }
            if (hasFirstReadResult()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getFirstReadResult().hashCode();
            }
            if (hasAppStatusRequest()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getAppStatusRequest().hashCode();
            }
            if (hasAppStatusResponse()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getAppStatusResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Service();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getEnableRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getEnableResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getLaunchRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getLaunchResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getFirstReadResult());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getAppStatusRequest());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getAppStatusResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> appStatusRequestBuilder_;
            private AppStatusRequest appStatusRequest_;
            private SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> appStatusResponseBuilder_;
            private AppStatusResponse appStatusResponse_;
            private int bitField0_;
            private SingleFieldBuilderV3<EnableRequest, EnableRequest.Builder, EnableRequestOrBuilder> enableRequestBuilder_;
            private EnableRequest enableRequest_;
            private SingleFieldBuilderV3<EnableResponse, EnableResponse.Builder, EnableResponseOrBuilder> enableResponseBuilder_;
            private EnableResponse enableResponse_;
            private SingleFieldBuilderV3<FirstReadResult, FirstReadResult.Builder, FirstReadResultOrBuilder> firstReadResultBuilder_;
            private FirstReadResult firstReadResult_;
            private SingleFieldBuilderV3<LaunchRequest, LaunchRequest.Builder, LaunchRequestOrBuilder> launchRequestBuilder_;
            private LaunchRequest launchRequest_;
            private SingleFieldBuilderV3<LaunchResponse, LaunchResponse.Builder, LaunchResponseOrBuilder> launchResponseBuilder_;
            private LaunchResponse launchResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<EnableRequest, EnableRequest.Builder, EnableRequestOrBuilder> singleFieldBuilderV3 = this.enableRequestBuilder_;
                    service.enableRequest_ = singleFieldBuilderV3 == null ? this.enableRequest_ : (EnableRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<EnableResponse, EnableResponse.Builder, EnableResponseOrBuilder> singleFieldBuilderV4 = this.enableResponseBuilder_;
                    service.enableResponse_ = singleFieldBuilderV4 == null ? this.enableResponse_ : (EnableResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<LaunchRequest, LaunchRequest.Builder, LaunchRequestOrBuilder> singleFieldBuilderV5 = this.launchRequestBuilder_;
                    service.launchRequest_ = singleFieldBuilderV5 == null ? this.launchRequest_ : (LaunchRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<LaunchResponse, LaunchResponse.Builder, LaunchResponseOrBuilder> singleFieldBuilderV6 = this.launchResponseBuilder_;
                    service.launchResponse_ = singleFieldBuilderV6 == null ? this.launchResponse_ : (LaunchResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<FirstReadResult, FirstReadResult.Builder, FirstReadResultOrBuilder> singleFieldBuilderV7 = this.firstReadResultBuilder_;
                    service.firstReadResult_ = singleFieldBuilderV7 == null ? this.firstReadResult_ : (FirstReadResult) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> singleFieldBuilderV8 = this.appStatusRequestBuilder_;
                    service.appStatusRequest_ = singleFieldBuilderV8 == null ? this.appStatusRequest_ : (AppStatusRequest) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> singleFieldBuilderV9 = this.appStatusResponseBuilder_;
                    service.appStatusResponse_ = singleFieldBuilderV9 == null ? this.appStatusResponse_ : (AppStatusResponse) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> getAppStatusRequestFieldBuilder() {
                if (this.appStatusRequestBuilder_ == null) {
                    this.appStatusRequestBuilder_ = new SingleFieldBuilderV3<>(getAppStatusRequest(), getParentForChildren(), isClean());
                    this.appStatusRequest_ = null;
                }
                return this.appStatusRequestBuilder_;
            }

            private SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> getAppStatusResponseFieldBuilder() {
                if (this.appStatusResponseBuilder_ == null) {
                    this.appStatusResponseBuilder_ = new SingleFieldBuilderV3<>(getAppStatusResponse(), getParentForChildren(), isClean());
                    this.appStatusResponse_ = null;
                }
                return this.appStatusResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_Service_descriptor;
            }

            private SingleFieldBuilderV3<EnableRequest, EnableRequest.Builder, EnableRequestOrBuilder> getEnableRequestFieldBuilder() {
                if (this.enableRequestBuilder_ == null) {
                    this.enableRequestBuilder_ = new SingleFieldBuilderV3<>(getEnableRequest(), getParentForChildren(), isClean());
                    this.enableRequest_ = null;
                }
                return this.enableRequestBuilder_;
            }

            private SingleFieldBuilderV3<EnableResponse, EnableResponse.Builder, EnableResponseOrBuilder> getEnableResponseFieldBuilder() {
                if (this.enableResponseBuilder_ == null) {
                    this.enableResponseBuilder_ = new SingleFieldBuilderV3<>(getEnableResponse(), getParentForChildren(), isClean());
                    this.enableResponse_ = null;
                }
                return this.enableResponseBuilder_;
            }

            private SingleFieldBuilderV3<FirstReadResult, FirstReadResult.Builder, FirstReadResultOrBuilder> getFirstReadResultFieldBuilder() {
                if (this.firstReadResultBuilder_ == null) {
                    this.firstReadResultBuilder_ = new SingleFieldBuilderV3<>(getFirstReadResult(), getParentForChildren(), isClean());
                    this.firstReadResult_ = null;
                }
                return this.firstReadResultBuilder_;
            }

            private SingleFieldBuilderV3<LaunchRequest, LaunchRequest.Builder, LaunchRequestOrBuilder> getLaunchRequestFieldBuilder() {
                if (this.launchRequestBuilder_ == null) {
                    this.launchRequestBuilder_ = new SingleFieldBuilderV3<>(getLaunchRequest(), getParentForChildren(), isClean());
                    this.launchRequest_ = null;
                }
                return this.launchRequestBuilder_;
            }

            private SingleFieldBuilderV3<LaunchResponse, LaunchResponse.Builder, LaunchResponseOrBuilder> getLaunchResponseFieldBuilder() {
                if (this.launchResponseBuilder_ == null) {
                    this.launchResponseBuilder_ = new SingleFieldBuilderV3<>(getLaunchResponse(), getParentForChildren(), isClean());
                    this.launchResponse_ = null;
                }
                return this.launchResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getEnableRequestFieldBuilder();
                    getEnableResponseFieldBuilder();
                    getLaunchRequestFieldBuilder();
                    getLaunchResponseFieldBuilder();
                    getFirstReadResultFieldBuilder();
                    getAppStatusRequestFieldBuilder();
                    getAppStatusResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Service build() {
                Service serviceBuildPartial = buildPartial();
                if (serviceBuildPartial.isInitialized()) {
                    return serviceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) serviceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Service buildPartial() {
                Service service = new Service(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(service);
                }
                onBuilt();
                return service;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.enableRequest_ = null;
                SingleFieldBuilderV3<EnableRequest, EnableRequest.Builder, EnableRequestOrBuilder> singleFieldBuilderV3 = this.enableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.enableRequestBuilder_ = null;
                }
                this.enableResponse_ = null;
                SingleFieldBuilderV3<EnableResponse, EnableResponse.Builder, EnableResponseOrBuilder> singleFieldBuilderV4 = this.enableResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.enableResponseBuilder_ = null;
                }
                this.launchRequest_ = null;
                SingleFieldBuilderV3<LaunchRequest, LaunchRequest.Builder, LaunchRequestOrBuilder> singleFieldBuilderV5 = this.launchRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.launchRequestBuilder_ = null;
                }
                this.launchResponse_ = null;
                SingleFieldBuilderV3<LaunchResponse, LaunchResponse.Builder, LaunchResponseOrBuilder> singleFieldBuilderV6 = this.launchResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.launchResponseBuilder_ = null;
                }
                this.firstReadResult_ = null;
                SingleFieldBuilderV3<FirstReadResult, FirstReadResult.Builder, FirstReadResultOrBuilder> singleFieldBuilderV7 = this.firstReadResultBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.firstReadResultBuilder_ = null;
                }
                this.appStatusRequest_ = null;
                SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> singleFieldBuilderV8 = this.appStatusRequestBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.appStatusRequestBuilder_ = null;
                }
                this.appStatusResponse_ = null;
                SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> singleFieldBuilderV9 = this.appStatusResponseBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.appStatusResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearAppStatusRequest() {
                this.bitField0_ &= -33;
                this.appStatusRequest_ = null;
                SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> singleFieldBuilderV3 = this.appStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.appStatusRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAppStatusResponse() {
                this.bitField0_ &= -65;
                this.appStatusResponse_ = null;
                SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> singleFieldBuilderV3 = this.appStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.appStatusResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEnableRequest() {
                this.bitField0_ &= -2;
                this.enableRequest_ = null;
                SingleFieldBuilderV3<EnableRequest, EnableRequest.Builder, EnableRequestOrBuilder> singleFieldBuilderV3 = this.enableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.enableRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEnableResponse() {
                this.bitField0_ &= -3;
                this.enableResponse_ = null;
                SingleFieldBuilderV3<EnableResponse, EnableResponse.Builder, EnableResponseOrBuilder> singleFieldBuilderV3 = this.enableResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.enableResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFirstReadResult() {
                this.bitField0_ &= -17;
                this.firstReadResult_ = null;
                SingleFieldBuilderV3<FirstReadResult, FirstReadResult.Builder, FirstReadResultOrBuilder> singleFieldBuilderV3 = this.firstReadResultBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.firstReadResultBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLaunchRequest() {
                this.bitField0_ &= -5;
                this.launchRequest_ = null;
                SingleFieldBuilderV3<LaunchRequest, LaunchRequest.Builder, LaunchRequestOrBuilder> singleFieldBuilderV3 = this.launchRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.launchRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLaunchResponse() {
                this.bitField0_ &= -9;
                this.launchResponse_ = null;
                SingleFieldBuilderV3<LaunchResponse, LaunchResponse.Builder, LaunchResponseOrBuilder> singleFieldBuilderV3 = this.launchResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.launchResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public AppStatusRequest getAppStatusRequest() {
                SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> singleFieldBuilderV3 = this.appStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AppStatusRequest) singleFieldBuilderV3.getMessage();
                }
                AppStatusRequest appStatusRequest = this.appStatusRequest_;
                return appStatusRequest == null ? AppStatusRequest.getDefaultInstance() : appStatusRequest;
            }

            public AppStatusRequest.Builder getAppStatusRequestBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (AppStatusRequest.Builder) getAppStatusRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public AppStatusRequestOrBuilder getAppStatusRequestOrBuilder() {
                SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> singleFieldBuilderV3 = this.appStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AppStatusRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AppStatusRequest appStatusRequest = this.appStatusRequest_;
                return appStatusRequest == null ? AppStatusRequest.getDefaultInstance() : appStatusRequest;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public AppStatusResponse getAppStatusResponse() {
                SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> singleFieldBuilderV3 = this.appStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AppStatusResponse) singleFieldBuilderV3.getMessage();
                }
                AppStatusResponse appStatusResponse = this.appStatusResponse_;
                return appStatusResponse == null ? AppStatusResponse.getDefaultInstance() : appStatusResponse;
            }

            public AppStatusResponse.Builder getAppStatusResponseBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (AppStatusResponse.Builder) getAppStatusResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public AppStatusResponseOrBuilder getAppStatusResponseOrBuilder() {
                SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> singleFieldBuilderV3 = this.appStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AppStatusResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AppStatusResponse appStatusResponse = this.appStatusResponse_;
                return appStatusResponse == null ? AppStatusResponse.getDefaultInstance() : appStatusResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public EnableRequest getEnableRequest() {
                SingleFieldBuilderV3<EnableRequest, EnableRequest.Builder, EnableRequestOrBuilder> singleFieldBuilderV3 = this.enableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EnableRequest) singleFieldBuilderV3.getMessage();
                }
                EnableRequest enableRequest = this.enableRequest_;
                return enableRequest == null ? EnableRequest.getDefaultInstance() : enableRequest;
            }

            public EnableRequest.Builder getEnableRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (EnableRequest.Builder) getEnableRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public EnableRequestOrBuilder getEnableRequestOrBuilder() {
                SingleFieldBuilderV3<EnableRequest, EnableRequest.Builder, EnableRequestOrBuilder> singleFieldBuilderV3 = this.enableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EnableRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EnableRequest enableRequest = this.enableRequest_;
                return enableRequest == null ? EnableRequest.getDefaultInstance() : enableRequest;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public EnableResponse getEnableResponse() {
                SingleFieldBuilderV3<EnableResponse, EnableResponse.Builder, EnableResponseOrBuilder> singleFieldBuilderV3 = this.enableResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EnableResponse) singleFieldBuilderV3.getMessage();
                }
                EnableResponse enableResponse = this.enableResponse_;
                return enableResponse == null ? EnableResponse.getDefaultInstance() : enableResponse;
            }

            public EnableResponse.Builder getEnableResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (EnableResponse.Builder) getEnableResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public EnableResponseOrBuilder getEnableResponseOrBuilder() {
                SingleFieldBuilderV3<EnableResponse, EnableResponse.Builder, EnableResponseOrBuilder> singleFieldBuilderV3 = this.enableResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EnableResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EnableResponse enableResponse = this.enableResponse_;
                return enableResponse == null ? EnableResponse.getDefaultInstance() : enableResponse;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public FirstReadResult getFirstReadResult() {
                SingleFieldBuilderV3<FirstReadResult, FirstReadResult.Builder, FirstReadResultOrBuilder> singleFieldBuilderV3 = this.firstReadResultBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FirstReadResult) singleFieldBuilderV3.getMessage();
                }
                FirstReadResult firstReadResult = this.firstReadResult_;
                return firstReadResult == null ? FirstReadResult.getDefaultInstance() : firstReadResult;
            }

            public FirstReadResult.Builder getFirstReadResultBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (FirstReadResult.Builder) getFirstReadResultFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public FirstReadResultOrBuilder getFirstReadResultOrBuilder() {
                SingleFieldBuilderV3<FirstReadResult, FirstReadResult.Builder, FirstReadResultOrBuilder> singleFieldBuilderV3 = this.firstReadResultBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FirstReadResultOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FirstReadResult firstReadResult = this.firstReadResult_;
                return firstReadResult == null ? FirstReadResult.getDefaultInstance() : firstReadResult;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public LaunchRequest getLaunchRequest() {
                SingleFieldBuilderV3<LaunchRequest, LaunchRequest.Builder, LaunchRequestOrBuilder> singleFieldBuilderV3 = this.launchRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LaunchRequest) singleFieldBuilderV3.getMessage();
                }
                LaunchRequest launchRequest = this.launchRequest_;
                return launchRequest == null ? LaunchRequest.getDefaultInstance() : launchRequest;
            }

            public LaunchRequest.Builder getLaunchRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (LaunchRequest.Builder) getLaunchRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public LaunchRequestOrBuilder getLaunchRequestOrBuilder() {
                SingleFieldBuilderV3<LaunchRequest, LaunchRequest.Builder, LaunchRequestOrBuilder> singleFieldBuilderV3 = this.launchRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LaunchRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LaunchRequest launchRequest = this.launchRequest_;
                return launchRequest == null ? LaunchRequest.getDefaultInstance() : launchRequest;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public LaunchResponse getLaunchResponse() {
                SingleFieldBuilderV3<LaunchResponse, LaunchResponse.Builder, LaunchResponseOrBuilder> singleFieldBuilderV3 = this.launchResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LaunchResponse) singleFieldBuilderV3.getMessage();
                }
                LaunchResponse launchResponse = this.launchResponse_;
                return launchResponse == null ? LaunchResponse.getDefaultInstance() : launchResponse;
            }

            public LaunchResponse.Builder getLaunchResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (LaunchResponse.Builder) getLaunchResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public LaunchResponseOrBuilder getLaunchResponseOrBuilder() {
                SingleFieldBuilderV3<LaunchResponse, LaunchResponse.Builder, LaunchResponseOrBuilder> singleFieldBuilderV3 = this.launchResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LaunchResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LaunchResponse launchResponse = this.launchResponse_;
                return launchResponse == null ? LaunchResponse.getDefaultInstance() : launchResponse;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public boolean hasAppStatusRequest() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public boolean hasAppStatusResponse() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public boolean hasEnableRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public boolean hasEnableResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public boolean hasFirstReadResult() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public boolean hasLaunchRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.SaMDEcg.ServiceOrBuilder
            public boolean hasLaunchResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SaMDEcg.internal_static_GDI_Proto_SaMD_Ecg_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAppStatusRequest(AppStatusRequest appStatusRequest) {
                AppStatusRequest appStatusRequest2;
                SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> singleFieldBuilderV3 = this.appStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(appStatusRequest);
                } else if ((this.bitField0_ & 32) == 0 || (appStatusRequest2 = this.appStatusRequest_) == null || appStatusRequest2 == AppStatusRequest.getDefaultInstance()) {
                    this.appStatusRequest_ = appStatusRequest;
                } else {
                    getAppStatusRequestBuilder().mergeFrom(appStatusRequest);
                }
                if (this.appStatusRequest_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAppStatusResponse(AppStatusResponse appStatusResponse) {
                AppStatusResponse appStatusResponse2;
                SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> singleFieldBuilderV3 = this.appStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(appStatusResponse);
                } else if ((this.bitField0_ & 64) == 0 || (appStatusResponse2 = this.appStatusResponse_) == null || appStatusResponse2 == AppStatusResponse.getDefaultInstance()) {
                    this.appStatusResponse_ = appStatusResponse;
                } else {
                    getAppStatusResponseBuilder().mergeFrom(appStatusResponse);
                }
                if (this.appStatusResponse_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEnableRequest(EnableRequest enableRequest) {
                EnableRequest enableRequest2;
                SingleFieldBuilderV3<EnableRequest, EnableRequest.Builder, EnableRequestOrBuilder> singleFieldBuilderV3 = this.enableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(enableRequest);
                } else if ((this.bitField0_ & 1) == 0 || (enableRequest2 = this.enableRequest_) == null || enableRequest2 == EnableRequest.getDefaultInstance()) {
                    this.enableRequest_ = enableRequest;
                } else {
                    getEnableRequestBuilder().mergeFrom(enableRequest);
                }
                if (this.enableRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEnableResponse(EnableResponse enableResponse) {
                EnableResponse enableResponse2;
                SingleFieldBuilderV3<EnableResponse, EnableResponse.Builder, EnableResponseOrBuilder> singleFieldBuilderV3 = this.enableResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(enableResponse);
                } else if ((this.bitField0_ & 2) == 0 || (enableResponse2 = this.enableResponse_) == null || enableResponse2 == EnableResponse.getDefaultInstance()) {
                    this.enableResponse_ = enableResponse;
                } else {
                    getEnableResponseBuilder().mergeFrom(enableResponse);
                }
                if (this.enableResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFirstReadResult(FirstReadResult firstReadResult) {
                FirstReadResult firstReadResult2;
                SingleFieldBuilderV3<FirstReadResult, FirstReadResult.Builder, FirstReadResultOrBuilder> singleFieldBuilderV3 = this.firstReadResultBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(firstReadResult);
                } else if ((this.bitField0_ & 16) == 0 || (firstReadResult2 = this.firstReadResult_) == null || firstReadResult2 == FirstReadResult.getDefaultInstance()) {
                    this.firstReadResult_ = firstReadResult;
                } else {
                    getFirstReadResultBuilder().mergeFrom(firstReadResult);
                }
                if (this.firstReadResult_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(getEnableRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getEnableResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getLaunchRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getLaunchResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getFirstReadResultFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getAppStatusRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getAppStatusResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
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

            public Builder mergeLaunchRequest(LaunchRequest launchRequest) {
                LaunchRequest launchRequest2;
                SingleFieldBuilderV3<LaunchRequest, LaunchRequest.Builder, LaunchRequestOrBuilder> singleFieldBuilderV3 = this.launchRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(launchRequest);
                } else if ((this.bitField0_ & 4) == 0 || (launchRequest2 = this.launchRequest_) == null || launchRequest2 == LaunchRequest.getDefaultInstance()) {
                    this.launchRequest_ = launchRequest;
                } else {
                    getLaunchRequestBuilder().mergeFrom(launchRequest);
                }
                if (this.launchRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLaunchResponse(LaunchResponse launchResponse) {
                LaunchResponse launchResponse2;
                SingleFieldBuilderV3<LaunchResponse, LaunchResponse.Builder, LaunchResponseOrBuilder> singleFieldBuilderV3 = this.launchResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(launchResponse);
                } else if ((this.bitField0_ & 8) == 0 || (launchResponse2 = this.launchResponse_) == null || launchResponse2 == LaunchResponse.getDefaultInstance()) {
                    this.launchResponse_ = launchResponse;
                } else {
                    getLaunchResponseBuilder().mergeFrom(launchResponse);
                }
                if (this.launchResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAppStatusRequest(AppStatusRequest.Builder builder) {
                SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> singleFieldBuilderV3 = this.appStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.appStatusRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setAppStatusResponse(AppStatusResponse.Builder builder) {
                SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> singleFieldBuilderV3 = this.appStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.appStatusResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setEnableRequest(EnableRequest.Builder builder) {
                SingleFieldBuilderV3<EnableRequest, EnableRequest.Builder, EnableRequestOrBuilder> singleFieldBuilderV3 = this.enableRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.enableRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setEnableResponse(EnableResponse.Builder builder) {
                SingleFieldBuilderV3<EnableResponse, EnableResponse.Builder, EnableResponseOrBuilder> singleFieldBuilderV3 = this.enableResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.enableResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFirstReadResult(FirstReadResult.Builder builder) {
                SingleFieldBuilderV3<FirstReadResult, FirstReadResult.Builder, FirstReadResultOrBuilder> singleFieldBuilderV3 = this.firstReadResultBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.firstReadResult_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setLaunchRequest(LaunchRequest.Builder builder) {
                SingleFieldBuilderV3<LaunchRequest, LaunchRequest.Builder, LaunchRequestOrBuilder> singleFieldBuilderV3 = this.launchRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.launchRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLaunchResponse(LaunchResponse.Builder builder) {
                SingleFieldBuilderV3<LaunchResponse, LaunchResponse.Builder, LaunchResponseOrBuilder> singleFieldBuilderV3 = this.launchResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.launchResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Service getDefaultInstanceForType() {
                return Service.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            public Builder setAppStatusRequest(AppStatusRequest appStatusRequest) {
                SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> singleFieldBuilderV3 = this.appStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    appStatusRequest.getClass();
                    this.appStatusRequest_ = appStatusRequest;
                } else {
                    singleFieldBuilderV3.setMessage(appStatusRequest);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setAppStatusResponse(AppStatusResponse appStatusResponse) {
                SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> singleFieldBuilderV3 = this.appStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    appStatusResponse.getClass();
                    this.appStatusResponse_ = appStatusResponse;
                } else {
                    singleFieldBuilderV3.setMessage(appStatusResponse);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setEnableRequest(EnableRequest enableRequest) {
                SingleFieldBuilderV3<EnableRequest, EnableRequest.Builder, EnableRequestOrBuilder> singleFieldBuilderV3 = this.enableRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    enableRequest.getClass();
                    this.enableRequest_ = enableRequest;
                } else {
                    singleFieldBuilderV3.setMessage(enableRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setEnableResponse(EnableResponse enableResponse) {
                SingleFieldBuilderV3<EnableResponse, EnableResponse.Builder, EnableResponseOrBuilder> singleFieldBuilderV3 = this.enableResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    enableResponse.getClass();
                    this.enableResponse_ = enableResponse;
                } else {
                    singleFieldBuilderV3.setMessage(enableResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFirstReadResult(FirstReadResult firstReadResult) {
                SingleFieldBuilderV3<FirstReadResult, FirstReadResult.Builder, FirstReadResultOrBuilder> singleFieldBuilderV3 = this.firstReadResultBuilder_;
                if (singleFieldBuilderV3 == null) {
                    firstReadResult.getClass();
                    this.firstReadResult_ = firstReadResult;
                } else {
                    singleFieldBuilderV3.setMessage(firstReadResult);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setLaunchRequest(LaunchRequest launchRequest) {
                SingleFieldBuilderV3<LaunchRequest, LaunchRequest.Builder, LaunchRequestOrBuilder> singleFieldBuilderV3 = this.launchRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    launchRequest.getClass();
                    this.launchRequest_ = launchRequest;
                } else {
                    singleFieldBuilderV3.setMessage(launchRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLaunchResponse(LaunchResponse launchResponse) {
                SingleFieldBuilderV3<LaunchResponse, LaunchResponse.Builder, LaunchResponseOrBuilder> singleFieldBuilderV3 = this.launchResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    launchResponse.getClass();
                    this.launchResponse_ = launchResponse;
                } else {
                    singleFieldBuilderV3.setMessage(launchResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Service) {
                    return mergeFrom((Service) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Service service) {
                if (service == Service.getDefaultInstance()) {
                    return this;
                }
                if (service.hasEnableRequest()) {
                    mergeEnableRequest(service.getEnableRequest());
                }
                if (service.hasEnableResponse()) {
                    mergeEnableResponse(service.getEnableResponse());
                }
                if (service.hasLaunchRequest()) {
                    mergeLaunchRequest(service.getLaunchRequest());
                }
                if (service.hasLaunchResponse()) {
                    mergeLaunchResponse(service.getLaunchResponse());
                }
                if (service.hasFirstReadResult()) {
                    mergeFirstReadResult(service.getFirstReadResult());
                }
                if (service.hasAppStatusRequest()) {
                    mergeAppStatusRequest(service.getAppStatusRequest());
                }
                if (service.hasAppStatusResponse()) {
                    mergeAppStatusResponse(service.getAppStatusResponse());
                }
                mergeUnknownFields(service.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Service getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ Service(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private Service() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Service) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Service parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Service parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Service parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Service parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Service parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Service parseFrom(InputStream inputStream) {
            return (Service) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Service parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Service) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Service parseFrom(CodedInputStream codedInputStream) {
            return (Service) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Service parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Service) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}

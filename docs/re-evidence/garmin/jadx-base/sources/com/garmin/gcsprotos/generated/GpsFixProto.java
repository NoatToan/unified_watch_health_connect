package com.garmin.gcsprotos.generated;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes12.dex */
public final class GpsFixProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fgpsFix.proto\u0012\u0010CSM.Proto.GpsFix\u001a\u000fdataTypes.proto\"5\n\rGpsFixRequest\u0012\u0012\n\nurl_params\u0018\u000b \u0001(\t\u0012\u0010\n\bprovider\u0018\f \u0001(\t\"[\n\u000eGpsFixResponse\u0012;\n\u000fresponse_status\u0018\u0001 \u0001(\u000e2\u001e.CSM.Proto.GpsFix.GpsFixStatus:\u0002OK\u0012\f\n\u0004data\u0018\f \u0001(\f*\u0016\n\fGpsFixStatus\u0012\u0006\n\u0002OK\u0010\u0000B/\n\u001ecom.garmin.gcsprotos.generatedB\u000bGpsFixProtoH\u0003"}, new Descriptors.FileDescriptor[]{DataTypesProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_CSM_Proto_GpsFix_GpsFixRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_GpsFix_GpsFixRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_GpsFix_GpsFixResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_GpsFix_GpsFixResponse_fieldAccessorTable;

    public interface GpsFixRequestOrBuilder extends MessageOrBuilder {
        String getProvider();

        ByteString getProviderBytes();

        String getUrlParams();

        ByteString getUrlParamsBytes();

        boolean hasProvider();

        boolean hasUrlParams();
    }

    public interface GpsFixResponseOrBuilder extends MessageOrBuilder {
        ByteString getData();

        GpsFixStatus getResponseStatus();

        boolean hasData();

        boolean hasResponseStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_CSM_Proto_GpsFix_GpsFixRequest_descriptor = descriptor2;
        internal_static_CSM_Proto_GpsFix_GpsFixRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"UrlParams", "Provider"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_CSM_Proto_GpsFix_GpsFixResponse_descriptor = descriptor3;
        internal_static_CSM_Proto_GpsFix_GpsFixResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"ResponseStatus", "Data"});
        DataTypesProto.getDescriptor();
    }

    private GpsFixProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class GpsFixRequest extends GeneratedMessageV3 implements GpsFixRequestOrBuilder {
        private static final GpsFixRequest DEFAULT_INSTANCE = new GpsFixRequest();

        @Deprecated
        public static final Parser<GpsFixRequest> PARSER = new AbstractParser<GpsFixRequest>() { // from class: com.garmin.gcsprotos.generated.GpsFixProto.GpsFixRequest.1
            @Override // com.google.protobuf.Parser
            public GpsFixRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GpsFixRequest.newBuilder();
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
        public static final int PROVIDER_FIELD_NUMBER = 12;
        public static final int URL_PARAMS_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object provider_;
        private volatile Object urlParams_;

        private GpsFixRequest() {
            this.urlParams_ = "";
            this.provider_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.urlParams_ = "";
            this.provider_ = "";
        }

        public static GpsFixRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GpsFixProto.internal_static_CSM_Proto_GpsFix_GpsFixRequest_descriptor;
        }

        public static Builder newBuilder(GpsFixRequest gpsFixRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gpsFixRequest);
        }

        public static GpsFixRequest parseDelimitedFrom(InputStream inputStream) {
            return (GpsFixRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GpsFixRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GpsFixRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GpsFixRequest)) {
                return super.equals(obj);
            }
            GpsFixRequest gpsFixRequest = (GpsFixRequest) obj;
            if (hasUrlParams() != gpsFixRequest.hasUrlParams()) {
                return false;
            }
            if ((!hasUrlParams() || getUrlParams().equals(gpsFixRequest.getUrlParams())) && hasProvider() == gpsFixRequest.hasProvider()) {
                return (!hasProvider() || getProvider().equals(gpsFixRequest.getProvider())) && getUnknownFields().equals(gpsFixRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GpsFixRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixRequestOrBuilder
        public String getProvider() {
            Object obj = this.provider_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.provider_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixRequestOrBuilder
        public ByteString getProviderBytes() {
            Object obj = this.provider_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.provider_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(11, this.urlParams_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(12, this.provider_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixRequestOrBuilder
        public String getUrlParams() {
            Object obj = this.urlParams_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.urlParams_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixRequestOrBuilder
        public ByteString getUrlParamsBytes() {
            Object obj = this.urlParams_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.urlParams_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixRequestOrBuilder
        public boolean hasProvider() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixRequestOrBuilder
        public boolean hasUrlParams() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUrlParams()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getUrlParams().hashCode();
            }
            if (hasProvider()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getProvider().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GpsFixProto.internal_static_CSM_Proto_GpsFix_GpsFixRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GpsFixRequest.class, Builder.class);
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
            return new GpsFixRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.urlParams_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.provider_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GpsFixRequestOrBuilder {
            private int bitField0_;
            private Object provider_;
            private Object urlParams_;

            private Builder() {
                this.urlParams_ = "";
                this.provider_ = "";
            }

            private void buildPartial0(GpsFixRequest gpsFixRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    gpsFixRequest.urlParams_ = this.urlParams_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    gpsFixRequest.provider_ = this.provider_;
                    i14 |= 2;
                }
                gpsFixRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GpsFixProto.internal_static_CSM_Proto_GpsFix_GpsFixRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GpsFixRequest build() {
                GpsFixRequest gpsFixRequestBuildPartial = buildPartial();
                if (gpsFixRequestBuildPartial.isInitialized()) {
                    return gpsFixRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) gpsFixRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GpsFixRequest buildPartial() {
                GpsFixRequest gpsFixRequest = new GpsFixRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(gpsFixRequest);
                }
                onBuilt();
                return gpsFixRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.urlParams_ = "";
                this.provider_ = "";
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

            public Builder clearProvider() {
                this.provider_ = GpsFixRequest.getDefaultInstance().getProvider();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearUrlParams() {
                this.urlParams_ = GpsFixRequest.getDefaultInstance().getUrlParams();
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
                return GpsFixProto.internal_static_CSM_Proto_GpsFix_GpsFixRequest_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixRequestOrBuilder
            public String getProvider() {
                Object obj = this.provider_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.provider_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixRequestOrBuilder
            public ByteString getProviderBytes() {
                Object obj = this.provider_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.provider_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixRequestOrBuilder
            public String getUrlParams() {
                Object obj = this.urlParams_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.urlParams_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixRequestOrBuilder
            public ByteString getUrlParamsBytes() {
                Object obj = this.urlParams_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.urlParams_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixRequestOrBuilder
            public boolean hasProvider() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixRequestOrBuilder
            public boolean hasUrlParams() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GpsFixProto.internal_static_CSM_Proto_GpsFix_GpsFixRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GpsFixRequest.class, Builder.class);
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
                                if (tag == 90) {
                                    this.urlParams_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 98) {
                                    this.provider_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
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

            public Builder setProvider(String str) {
                str.getClass();
                this.provider_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setProviderBytes(ByteString byteString) {
                byteString.getClass();
                this.provider_ = byteString;
                this.bitField0_ |= 2;
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

            public Builder setUrlParams(String str) {
                str.getClass();
                this.urlParams_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUrlParamsBytes(ByteString byteString) {
                byteString.getClass();
                this.urlParams_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GpsFixRequest getDefaultInstanceForType() {
                return GpsFixRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.urlParams_ = "";
                this.provider_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GpsFixRequest) {
                    return mergeFrom((GpsFixRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GpsFixRequest gpsFixRequest) {
                if (gpsFixRequest == GpsFixRequest.getDefaultInstance()) {
                    return this;
                }
                if (gpsFixRequest.hasUrlParams()) {
                    this.urlParams_ = gpsFixRequest.urlParams_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (gpsFixRequest.hasProvider()) {
                    this.provider_ = gpsFixRequest.provider_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(gpsFixRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GpsFixRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GpsFixRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GpsFixRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GpsFixRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GpsFixRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GpsFixRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GpsFixRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GpsFixRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GpsFixRequest parseFrom(InputStream inputStream) {
            return (GpsFixRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GpsFixRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GpsFixRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private GpsFixRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.urlParams_ = "";
            this.provider_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GpsFixRequest parseFrom(CodedInputStream codedInputStream) {
            return (GpsFixRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GpsFixRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GpsFixRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ GpsFixRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class GpsFixResponse extends GeneratedMessageV3 implements GpsFixResponseOrBuilder {
        public static final int DATA_FIELD_NUMBER = 12;
        private static final GpsFixResponse DEFAULT_INSTANCE = new GpsFixResponse();

        @Deprecated
        public static final Parser<GpsFixResponse> PARSER = new AbstractParser<GpsFixResponse>() { // from class: com.garmin.gcsprotos.generated.GpsFixProto.GpsFixResponse.1
            @Override // com.google.protobuf.Parser
            public GpsFixResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GpsFixResponse.newBuilder();
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
        public static final int RESPONSE_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString data_;
        private byte memoizedIsInitialized;
        private int responseStatus_;

        private GpsFixResponse() {
            this.responseStatus_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.responseStatus_ = 0;
            this.data_ = byteString;
        }

        public static GpsFixResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GpsFixProto.internal_static_CSM_Proto_GpsFix_GpsFixResponse_descriptor;
        }

        public static Builder newBuilder(GpsFixResponse gpsFixResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gpsFixResponse);
        }

        public static GpsFixResponse parseDelimitedFrom(InputStream inputStream) {
            return (GpsFixResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GpsFixResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GpsFixResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GpsFixResponse)) {
                return super.equals(obj);
            }
            GpsFixResponse gpsFixResponse = (GpsFixResponse) obj;
            if (hasResponseStatus() != gpsFixResponse.hasResponseStatus()) {
                return false;
            }
            if ((!hasResponseStatus() || this.responseStatus_ == gpsFixResponse.responseStatus_) && hasData() == gpsFixResponse.hasData()) {
                return (!hasData() || getData().equals(gpsFixResponse.getData())) && getUnknownFields().equals(gpsFixResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixResponseOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GpsFixResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixResponseOrBuilder
        public GpsFixStatus getResponseStatus() {
            GpsFixStatus gpsFixStatusForNumber = GpsFixStatus.forNumber(this.responseStatus_);
            return gpsFixStatusForNumber == null ? GpsFixStatus.OK : gpsFixStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.responseStatus_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(12, this.data_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixResponseOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixResponseOrBuilder
        public boolean hasResponseStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResponseStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.responseStatus_;
            }
            if (hasData()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GpsFixProto.internal_static_CSM_Proto_GpsFix_GpsFixResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GpsFixResponse.class, Builder.class);
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
            return new GpsFixResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.responseStatus_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(12, this.data_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GpsFixResponseOrBuilder {
            private int bitField0_;
            private ByteString data_;
            private int responseStatus_;

            private Builder() {
                this.responseStatus_ = 0;
                this.data_ = ByteString.EMPTY;
            }

            private void buildPartial0(GpsFixResponse gpsFixResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    gpsFixResponse.responseStatus_ = this.responseStatus_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    gpsFixResponse.data_ = this.data_;
                    i14 |= 2;
                }
                gpsFixResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GpsFixProto.internal_static_CSM_Proto_GpsFix_GpsFixResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GpsFixResponse build() {
                GpsFixResponse gpsFixResponseBuildPartial = buildPartial();
                if (gpsFixResponseBuildPartial.isInitialized()) {
                    return gpsFixResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) gpsFixResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GpsFixResponse buildPartial() {
                GpsFixResponse gpsFixResponse = new GpsFixResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(gpsFixResponse);
                }
                onBuilt();
                return gpsFixResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.responseStatus_ = 0;
                this.data_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearData() {
                this.bitField0_ &= -3;
                this.data_ = GpsFixResponse.getDefaultInstance().getData();
                onChanged();
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

            public Builder clearResponseStatus() {
                this.bitField0_ &= -2;
                this.responseStatus_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixResponseOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GpsFixProto.internal_static_CSM_Proto_GpsFix_GpsFixResponse_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixResponseOrBuilder
            public GpsFixStatus getResponseStatus() {
                GpsFixStatus gpsFixStatusForNumber = GpsFixStatus.forNumber(this.responseStatus_);
                return gpsFixStatusForNumber == null ? GpsFixStatus.OK : gpsFixStatusForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixResponseOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.GpsFixProto.GpsFixResponseOrBuilder
            public boolean hasResponseStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GpsFixProto.internal_static_CSM_Proto_GpsFix_GpsFixResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GpsFixResponse.class, Builder.class);
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
                                    if (GpsFixStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.responseStatus_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 98) {
                                    this.data_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
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

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setResponseStatus(GpsFixStatus gpsFixStatus) {
                gpsFixStatus.getClass();
                this.bitField0_ |= 1;
                this.responseStatus_ = gpsFixStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GpsFixResponse getDefaultInstanceForType() {
                return GpsFixResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.responseStatus_ = 0;
                this.data_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GpsFixResponse) {
                    return mergeFrom((GpsFixResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GpsFixResponse gpsFixResponse) {
                if (gpsFixResponse == GpsFixResponse.getDefaultInstance()) {
                    return this;
                }
                if (gpsFixResponse.hasResponseStatus()) {
                    setResponseStatus(gpsFixResponse.getResponseStatus());
                }
                if (gpsFixResponse.hasData()) {
                    setData(gpsFixResponse.getData());
                }
                mergeUnknownFields(gpsFixResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GpsFixResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GpsFixResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GpsFixResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GpsFixResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GpsFixResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GpsFixResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GpsFixResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GpsFixResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GpsFixResponse parseFrom(InputStream inputStream) {
            return (GpsFixResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private GpsFixResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.responseStatus_ = 0;
            this.data_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GpsFixResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GpsFixResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GpsFixResponse parseFrom(CodedInputStream codedInputStream) {
            return (GpsFixResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ GpsFixResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GpsFixResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GpsFixResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum GpsFixStatus implements ProtocolMessageEnum {
        OK(0);

        public static final int OK_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<GpsFixStatus> internalValueMap = new Internal.EnumLiteMap<GpsFixStatus>() { // from class: com.garmin.gcsprotos.generated.GpsFixProto.GpsFixStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public GpsFixStatus findValueByNumber(int i14) {
                return GpsFixStatus.forNumber(i14);
            }
        };
        private static final GpsFixStatus[] VALUES = values();

        GpsFixStatus(int i14) {
            this.value = i14;
        }

        public static GpsFixStatus forNumber(int i14) {
            if (i14 != 0) {
                return null;
            }
            return OK;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GpsFixProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<GpsFixStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static GpsFixStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static GpsFixStatus valueOf(int i14) {
            return forNumber(i14);
        }
    }
}

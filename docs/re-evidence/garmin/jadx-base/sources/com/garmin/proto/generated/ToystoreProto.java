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
public final class ToystoreProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011GDIToystore.proto\u0012\u0012GDI.Proto.Toystore\u001a\rGDICore.proto\u001a\u0016GDIConnectIQHTTP.proto\"¡\u0005\n\u000fToystoreService\u0012E\n\u0010run_code_request\u0018\u0001 \u0001(\u000b2+.GDI.Proto.Toystore.ConnectIQRunCodeRequest\u0012G\n\u0011run_code_response\u0018\u0002 \u0001(\u000b2,.GDI.Proto.Toystore.ConnectIQRunCodeResponse\u0012P\n\u0018connect_iq_oauth_request\u0018\u0003 \u0001(\u000b2..GDI.Proto.ConnectIQHTTP.ConnectIQOAuthRequest\u0012R\n\u0019connect_iq_oauth_response\u0018\u0004 \u0001(\u000b2/.GDI.Proto.ConnectIQHTTP.ConnectIQOAuthResponse\u0012a\n!connect_iq_oauth_complete_request\u0018\u0005 \u0001(\u000b26.GDI.Proto.ConnectIQHTTP.ConnectIQOAuthCompleteRequest\u0012c\n\"connect_iq_oauth_complete_response\u0018\u0006 \u0001(\u000b27.GDI.Proto.ConnectIQHTTP.ConnectIQOAuthCompleteResponse\u0012F\n\u0010purchase_request\u0018\u0007 \u0001(\u000b2,.GDI.Proto.Toystore.ConnectIQPurchaseRequest\u0012H\n\u0011purchase_response\u0018\b \u0001(\u000b2-.GDI.Proto.Toystore.ConnectIQPurchaseResponse\"\u0091\u0001\n\u0017ConnectIQRunCodeRequest\u0012\u0010\n\bapp_uuid\u0018\u0001 \u0001(\f\u0012E\n\brun_type\u0018\u0002 \u0001(\u000e23.GDI.Proto.Toystore.ConnectIQRunCodeRequest.RunType\"\u001d\n\u0007RunType\u0012\u0012\n\u000eAUTHENTICATION\u0010\u0000\"Â\u0001\n\u0018ConnectIQRunCodeResponse\u0012K\n\u0006status\u0018\u0001 \u0001(\u000e2;.GDI.Proto.Toystore.ConnectIQRunCodeResponse.ResponseStatus\"Y\n\u000eResponseStatus\u0012\u0006\n\u0002OK\u0010\u0000\u0012\u0011\n\rUNKNOWN_ERROR\u0010\u0001\u0012\u0015\n\u0011APP_NOT_INSTALLED\u0010\u0002\u0012\u0015\n\u0011NOT_ENOUGH_MEMORY\u0010\u0003\"k\n\u0018ConnectIQPurchaseRequest\u0012\u0015\n\rmanifest_uuid\u0018\u0001 \u0002(\f\u0012\u0012\n\nstore_uuid\u0018\u0002 \u0002(\f\u0012\u0010\n\bapp_name\u0018\u0003 \u0001(\t\u0012\u0012\n\npromo_code\u0018\u0004 \u0001(\t\"\u0084\u0001\n\u0019ConnectIQPurchaseResponse\u0012D\n\u0006status\u0018\u0001 \u0001(\u000e24.GDI.Proto.Toystore.ConnectIQPurchaseResponse.Status\"!\n\u0006Status\u0012\u0006\n\u0002OK\u0010\u0000\u0012\u000f\n\u000bNOT_HANDLED\u0010\u0001\"\u0085\u0001\n\u0013CapabilitiesRequest2n\n\u0011toy_store_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\u0015 \u0001(\u000b2'.GDI.Proto.Toystore.CapabilitiesRequest\"§\u0001\n\u0014CapabilitiesResponse\u0012\u001c\n\u0014app_purchase_support\u0018\u0001 \u0001(\b2q\n\u0012toy_store_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\u0015 \u0001(\u000b2(.GDI.Proto.Toystore.CapabilitiesResponseB-\n\u001acom.garmin.proto.generatedB\rToystoreProtoH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor(), GDIConnectIQHTTPProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Toystore_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Toystore_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Toystore_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Toystore_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Toystore_ConnectIQPurchaseRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Toystore_ConnectIQPurchaseRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Toystore_ConnectIQPurchaseResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Toystore_ConnectIQPurchaseResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Toystore_ConnectIQRunCodeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Toystore_ConnectIQRunCodeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Toystore_ConnectIQRunCodeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Toystore_ConnectIQRunCodeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Toystore_ToystoreService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Toystore_ToystoreService_fieldAccessorTable;

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        boolean getAppPurchaseSupport();

        boolean hasAppPurchaseSupport();
    }

    public interface ConnectIQPurchaseRequestOrBuilder extends MessageOrBuilder {
        String getAppName();

        ByteString getAppNameBytes();

        ByteString getManifestUuid();

        String getPromoCode();

        ByteString getPromoCodeBytes();

        ByteString getStoreUuid();

        boolean hasAppName();

        boolean hasManifestUuid();

        boolean hasPromoCode();

        boolean hasStoreUuid();
    }

    public interface ConnectIQPurchaseResponseOrBuilder extends MessageOrBuilder {
        ConnectIQPurchaseResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface ConnectIQRunCodeRequestOrBuilder extends MessageOrBuilder {
        ByteString getAppUuid();

        ConnectIQRunCodeRequest.RunType getRunType();

        boolean hasAppUuid();

        boolean hasRunType();
    }

    public interface ConnectIQRunCodeResponseOrBuilder extends MessageOrBuilder {
        ConnectIQRunCodeResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface ToystoreServiceOrBuilder extends MessageOrBuilder {
        GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest getConnectIqOauthCompleteRequest();

        GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder getConnectIqOauthCompleteRequestOrBuilder();

        GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse getConnectIqOauthCompleteResponse();

        GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder getConnectIqOauthCompleteResponseOrBuilder();

        GDIConnectIQHTTPProto.ConnectIQOAuthRequest getConnectIqOauthRequest();

        GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder getConnectIqOauthRequestOrBuilder();

        GDIConnectIQHTTPProto.ConnectIQOAuthResponse getConnectIqOauthResponse();

        GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder getConnectIqOauthResponseOrBuilder();

        ConnectIQPurchaseRequest getPurchaseRequest();

        ConnectIQPurchaseRequestOrBuilder getPurchaseRequestOrBuilder();

        ConnectIQPurchaseResponse getPurchaseResponse();

        ConnectIQPurchaseResponseOrBuilder getPurchaseResponseOrBuilder();

        ConnectIQRunCodeRequest getRunCodeRequest();

        ConnectIQRunCodeRequestOrBuilder getRunCodeRequestOrBuilder();

        ConnectIQRunCodeResponse getRunCodeResponse();

        ConnectIQRunCodeResponseOrBuilder getRunCodeResponseOrBuilder();

        boolean hasConnectIqOauthCompleteRequest();

        boolean hasConnectIqOauthCompleteResponse();

        boolean hasConnectIqOauthRequest();

        boolean hasConnectIqOauthResponse();

        boolean hasPurchaseRequest();

        boolean hasPurchaseResponse();

        boolean hasRunCodeRequest();

        boolean hasRunCodeResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_Toystore_ToystoreService_descriptor = descriptor2;
        internal_static_GDI_Proto_Toystore_ToystoreService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"RunCodeRequest", "RunCodeResponse", "ConnectIqOauthRequest", "ConnectIqOauthResponse", "ConnectIqOauthCompleteRequest", "ConnectIqOauthCompleteResponse", "PurchaseRequest", "PurchaseResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_Toystore_ConnectIQRunCodeRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_Toystore_ConnectIQRunCodeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"AppUuid", "RunType"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_Toystore_ConnectIQRunCodeResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_Toystore_ConnectIQRunCodeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_Toystore_ConnectIQPurchaseRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_Toystore_ConnectIQPurchaseRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ManifestUuid", "StoreUuid", "AppName", "PromoCode"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_Toystore_ConnectIQPurchaseResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_Toystore_ConnectIQPurchaseResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_Toystore_CapabilitiesRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_Toystore_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[0]);
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_Toystore_CapabilitiesResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_Toystore_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"AppPurchaseSupport"});
        GDICore.getDescriptor();
        GDIConnectIQHTTPProto.getDescriptor();
    }

    private ToystoreProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.toyStoreRequest);
        extensionRegistryLite.add(CapabilitiesResponse.toyStoreResponse);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int TOY_STORE_REQUEST_FIELD_NUMBER = 21;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.ToystoreProto.CapabilitiesRequest.1
            @Override // com.google.protobuf.Parser
            public CapabilitiesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CapabilitiesRequest.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> toyStoreRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ToystoreProto.internal_static_GDI_Proto_Toystore_CapabilitiesRequest_descriptor;
        }

        public static Builder newBuilder(CapabilitiesRequest capabilitiesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(capabilitiesRequest);
        }

        public static CapabilitiesRequest parseDelimitedFrom(InputStream inputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CapabilitiesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CapabilitiesRequest) {
                return getUnknownFields().equals(((CapabilitiesRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesRequest> getParserForType() {
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
            return ToystoreProto.internal_static_GDI_Proto_Toystore_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
            return new CapabilitiesRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesRequest build() {
                CapabilitiesRequest capabilitiesRequestBuildPartial = buildPartial();
                if (capabilitiesRequestBuildPartial.isInitialized()) {
                    return capabilitiesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) capabilitiesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesRequest buildPartial() {
                CapabilitiesRequest capabilitiesRequest = new CapabilitiesRequest(this);
                onBuilt();
                return capabilitiesRequest;
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
                return ToystoreProto.internal_static_GDI_Proto_Toystore_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
            public CapabilitiesRequest getDefaultInstanceForType() {
                return CapabilitiesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CapabilitiesRequest) {
                    return mergeFrom((CapabilitiesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CapabilitiesRequest capabilitiesRequest) {
                if (capabilitiesRequest == CapabilitiesRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(capabilitiesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CapabilitiesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CapabilitiesRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CapabilitiesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CapabilitiesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CapabilitiesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int APP_PURCHASE_SUPPORT_FIELD_NUMBER = 1;
        public static final int TOY_STORE_RESPONSE_FIELD_NUMBER = 21;
        private static final long serialVersionUID = 0;
        private boolean appPurchaseSupport_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.ToystoreProto.CapabilitiesResponse.1
            @Override // com.google.protobuf.Parser
            public CapabilitiesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CapabilitiesResponse.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesResponse> toyStoreResponse = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesResponse.class, getDefaultInstance());

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.appPurchaseSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ToystoreProto.internal_static_GDI_Proto_Toystore_CapabilitiesResponse_descriptor;
        }

        public static Builder newBuilder(CapabilitiesResponse capabilitiesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(capabilitiesResponse);
        }

        public static CapabilitiesResponse parseDelimitedFrom(InputStream inputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CapabilitiesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CapabilitiesResponse)) {
                return super.equals(obj);
            }
            CapabilitiesResponse capabilitiesResponse = (CapabilitiesResponse) obj;
            if (hasAppPurchaseSupport() != capabilitiesResponse.hasAppPurchaseSupport()) {
                return false;
            }
            return (!hasAppPurchaseSupport() || getAppPurchaseSupport() == capabilitiesResponse.getAppPurchaseSupport()) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.ToystoreProto.CapabilitiesResponseOrBuilder
        public boolean getAppPurchaseSupport() {
            return this.appPurchaseSupport_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.appPurchaseSupport_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.CapabilitiesResponseOrBuilder
        public boolean hasAppPurchaseSupport() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAppPurchaseSupport()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getAppPurchaseSupport());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ToystoreProto.internal_static_GDI_Proto_Toystore_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
            return new CapabilitiesResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.appPurchaseSupport_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private boolean appPurchaseSupport_;
            private int bitField0_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    capabilitiesResponse.appPurchaseSupport_ = this.appPurchaseSupport_;
                } else {
                    i14 = 0;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_CapabilitiesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesResponse build() {
                CapabilitiesResponse capabilitiesResponseBuildPartial = buildPartial();
                if (capabilitiesResponseBuildPartial.isInitialized()) {
                    return capabilitiesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) capabilitiesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesResponse buildPartial() {
                CapabilitiesResponse capabilitiesResponse = new CapabilitiesResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(capabilitiesResponse);
                }
                onBuilt();
                return capabilitiesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.appPurchaseSupport_ = false;
                return this;
            }

            public Builder clearAppPurchaseSupport() {
                this.bitField0_ &= -2;
                this.appPurchaseSupport_ = false;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.ToystoreProto.CapabilitiesResponseOrBuilder
            public boolean getAppPurchaseSupport() {
                return this.appPurchaseSupport_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.CapabilitiesResponseOrBuilder
            public boolean hasAppPurchaseSupport() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                                    this.appPurchaseSupport_ = codedInputStream.readBool();
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

            public Builder setAppPurchaseSupport(boolean z14) {
                this.appPurchaseSupport_ = z14;
                this.bitField0_ |= 1;
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
            public CapabilitiesResponse getDefaultInstanceForType() {
                return CapabilitiesResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CapabilitiesResponse) {
                    return mergeFrom((CapabilitiesResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CapabilitiesResponse capabilitiesResponse) {
                if (capabilitiesResponse == CapabilitiesResponse.getDefaultInstance()) {
                    return this;
                }
                if (capabilitiesResponse.hasAppPurchaseSupport()) {
                    setAppPurchaseSupport(capabilitiesResponse.getAppPurchaseSupport());
                }
                mergeUnknownFields(capabilitiesResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CapabilitiesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CapabilitiesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CapabilitiesResponse() {
            this.appPurchaseSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CapabilitiesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CapabilitiesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(InputStream inputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConnectIQPurchaseRequest extends GeneratedMessageV3 implements ConnectIQPurchaseRequestOrBuilder {
        public static final int APP_NAME_FIELD_NUMBER = 3;
        public static final int MANIFEST_UUID_FIELD_NUMBER = 1;
        public static final int PROMO_CODE_FIELD_NUMBER = 4;
        public static final int STORE_UUID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object appName_;
        private int bitField0_;
        private ByteString manifestUuid_;
        private byte memoizedIsInitialized;
        private volatile Object promoCode_;
        private ByteString storeUuid_;
        private static final ConnectIQPurchaseRequest DEFAULT_INSTANCE = new ConnectIQPurchaseRequest();

        @Deprecated
        public static final Parser<ConnectIQPurchaseRequest> PARSER = new AbstractParser<ConnectIQPurchaseRequest>() { // from class: com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequest.1
            @Override // com.google.protobuf.Parser
            public ConnectIQPurchaseRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectIQPurchaseRequest.newBuilder();
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

        private ConnectIQPurchaseRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.manifestUuid_ = byteString;
            this.storeUuid_ = byteString;
            this.appName_ = "";
            this.promoCode_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.manifestUuid_ = byteString;
            this.storeUuid_ = byteString;
            this.appName_ = "";
            this.promoCode_ = "";
        }

        public static ConnectIQPurchaseRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQPurchaseRequest_descriptor;
        }

        public static Builder newBuilder(ConnectIQPurchaseRequest connectIQPurchaseRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectIQPurchaseRequest);
        }

        public static ConnectIQPurchaseRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConnectIQPurchaseRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectIQPurchaseRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectIQPurchaseRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectIQPurchaseRequest)) {
                return super.equals(obj);
            }
            ConnectIQPurchaseRequest connectIQPurchaseRequest = (ConnectIQPurchaseRequest) obj;
            if (hasManifestUuid() != connectIQPurchaseRequest.hasManifestUuid()) {
                return false;
            }
            if ((hasManifestUuid() && !getManifestUuid().equals(connectIQPurchaseRequest.getManifestUuid())) || hasStoreUuid() != connectIQPurchaseRequest.hasStoreUuid()) {
                return false;
            }
            if ((hasStoreUuid() && !getStoreUuid().equals(connectIQPurchaseRequest.getStoreUuid())) || hasAppName() != connectIQPurchaseRequest.hasAppName()) {
                return false;
            }
            if ((!hasAppName() || getAppName().equals(connectIQPurchaseRequest.getAppName())) && hasPromoCode() == connectIQPurchaseRequest.hasPromoCode()) {
                return (!hasPromoCode() || getPromoCode().equals(connectIQPurchaseRequest.getPromoCode())) && getUnknownFields().equals(connectIQPurchaseRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
        public String getAppName() {
            Object obj = this.appName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
        public ByteString getAppNameBytes() {
            Object obj = this.appName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
        public ByteString getManifestUuid() {
            return this.manifestUuid_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectIQPurchaseRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
        public String getPromoCode() {
            Object obj = this.promoCode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.promoCode_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
        public ByteString getPromoCodeBytes() {
            Object obj = this.promoCode_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.promoCode_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.manifestUuid_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(2, this.storeUuid_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBytesSize += GeneratedMessageV3.computeStringSize(3, this.appName_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBytesSize += GeneratedMessageV3.computeStringSize(4, this.promoCode_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
        public ByteString getStoreUuid() {
            return this.storeUuid_;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
        public boolean hasAppName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
        public boolean hasManifestUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
        public boolean hasPromoCode() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
        public boolean hasStoreUuid() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasManifestUuid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getManifestUuid().hashCode();
            }
            if (hasStoreUuid()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getStoreUuid().hashCode();
            }
            if (hasAppName()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getAppName().hashCode();
            }
            if (hasPromoCode()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getPromoCode().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQPurchaseRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQPurchaseRequest.class, Builder.class);
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
            if (!hasManifestUuid()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasStoreUuid()) {
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
            return new ConnectIQPurchaseRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.manifestUuid_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.storeUuid_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.appName_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.promoCode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectIQPurchaseRequestOrBuilder {
            private Object appName_;
            private int bitField0_;
            private ByteString manifestUuid_;
            private Object promoCode_;
            private ByteString storeUuid_;

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.manifestUuid_ = byteString;
                this.storeUuid_ = byteString;
                this.appName_ = "";
                this.promoCode_ = "";
            }

            private void buildPartial0(ConnectIQPurchaseRequest connectIQPurchaseRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    connectIQPurchaseRequest.manifestUuid_ = this.manifestUuid_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    connectIQPurchaseRequest.storeUuid_ = this.storeUuid_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    connectIQPurchaseRequest.appName_ = this.appName_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    connectIQPurchaseRequest.promoCode_ = this.promoCode_;
                    i14 |= 8;
                }
                connectIQPurchaseRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQPurchaseRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQPurchaseRequest build() {
                ConnectIQPurchaseRequest connectIQPurchaseRequestBuildPartial = buildPartial();
                if (connectIQPurchaseRequestBuildPartial.isInitialized()) {
                    return connectIQPurchaseRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectIQPurchaseRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQPurchaseRequest buildPartial() {
                ConnectIQPurchaseRequest connectIQPurchaseRequest = new ConnectIQPurchaseRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectIQPurchaseRequest);
                }
                onBuilt();
                return connectIQPurchaseRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.manifestUuid_ = byteString;
                this.storeUuid_ = byteString;
                this.appName_ = "";
                this.promoCode_ = "";
                return this;
            }

            public Builder clearAppName() {
                this.appName_ = ConnectIQPurchaseRequest.getDefaultInstance().getAppName();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearManifestUuid() {
                this.bitField0_ &= -2;
                this.manifestUuid_ = ConnectIQPurchaseRequest.getDefaultInstance().getManifestUuid();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPromoCode() {
                this.promoCode_ = ConnectIQPurchaseRequest.getDefaultInstance().getPromoCode();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearStoreUuid() {
                this.bitField0_ &= -3;
                this.storeUuid_ = ConnectIQPurchaseRequest.getDefaultInstance().getStoreUuid();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
            public String getAppName() {
                Object obj = this.appName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
            public ByteString getAppNameBytes() {
                Object obj = this.appName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQPurchaseRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
            public ByteString getManifestUuid() {
                return this.manifestUuid_;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
            public String getPromoCode() {
                Object obj = this.promoCode_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.promoCode_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
            public ByteString getPromoCodeBytes() {
                Object obj = this.promoCode_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.promoCode_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
            public ByteString getStoreUuid() {
                return this.storeUuid_;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
            public boolean hasAppName() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
            public boolean hasManifestUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
            public boolean hasPromoCode() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseRequestOrBuilder
            public boolean hasStoreUuid() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQPurchaseRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQPurchaseRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasManifestUuid() && hasStoreUuid();
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
                                    this.manifestUuid_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.storeUuid_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.appName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.promoCode_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
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

            public Builder setAppName(String str) {
                str.getClass();
                this.appName_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setAppNameBytes(ByteString byteString) {
                byteString.getClass();
                this.appName_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setManifestUuid(ByteString byteString) {
                byteString.getClass();
                this.manifestUuid_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPromoCode(String str) {
                str.getClass();
                this.promoCode_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPromoCodeBytes(ByteString byteString) {
                byteString.getClass();
                this.promoCode_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStoreUuid(ByteString byteString) {
                byteString.getClass();
                this.storeUuid_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectIQPurchaseRequest getDefaultInstanceForType() {
                return ConnectIQPurchaseRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                ByteString byteString = ByteString.EMPTY;
                this.manifestUuid_ = byteString;
                this.storeUuid_ = byteString;
                this.appName_ = "";
                this.promoCode_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectIQPurchaseRequest) {
                    return mergeFrom((ConnectIQPurchaseRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectIQPurchaseRequest connectIQPurchaseRequest) {
                if (connectIQPurchaseRequest == ConnectIQPurchaseRequest.getDefaultInstance()) {
                    return this;
                }
                if (connectIQPurchaseRequest.hasManifestUuid()) {
                    setManifestUuid(connectIQPurchaseRequest.getManifestUuid());
                }
                if (connectIQPurchaseRequest.hasStoreUuid()) {
                    setStoreUuid(connectIQPurchaseRequest.getStoreUuid());
                }
                if (connectIQPurchaseRequest.hasAppName()) {
                    this.appName_ = connectIQPurchaseRequest.appName_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (connectIQPurchaseRequest.hasPromoCode()) {
                    this.promoCode_ = connectIQPurchaseRequest.promoCode_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                mergeUnknownFields(connectIQPurchaseRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectIQPurchaseRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectIQPurchaseRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQPurchaseRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQPurchaseRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectIQPurchaseRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectIQPurchaseRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectIQPurchaseRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectIQPurchaseRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectIQPurchaseRequest parseFrom(InputStream inputStream) {
            return (ConnectIQPurchaseRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectIQPurchaseRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQPurchaseRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQPurchaseRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConnectIQPurchaseRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectIQPurchaseRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQPurchaseRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ConnectIQPurchaseRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            ByteString byteString = ByteString.EMPTY;
            this.manifestUuid_ = byteString;
            this.storeUuid_ = byteString;
            this.appName_ = "";
            this.promoCode_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ ConnectIQPurchaseRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ConnectIQPurchaseResponse extends GeneratedMessageV3 implements ConnectIQPurchaseResponseOrBuilder {
        private static final ConnectIQPurchaseResponse DEFAULT_INSTANCE = new ConnectIQPurchaseResponse();

        @Deprecated
        public static final Parser<ConnectIQPurchaseResponse> PARSER = new AbstractParser<ConnectIQPurchaseResponse>() { // from class: com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseResponse.1
            @Override // com.google.protobuf.Parser
            public ConnectIQPurchaseResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectIQPurchaseResponse.newBuilder();
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

        private ConnectIQPurchaseResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectIQPurchaseResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQPurchaseResponse_descriptor;
        }

        public static Builder newBuilder(ConnectIQPurchaseResponse connectIQPurchaseResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectIQPurchaseResponse);
        }

        public static ConnectIQPurchaseResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConnectIQPurchaseResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectIQPurchaseResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectIQPurchaseResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectIQPurchaseResponse)) {
                return super.equals(obj);
            }
            ConnectIQPurchaseResponse connectIQPurchaseResponse = (ConnectIQPurchaseResponse) obj;
            if (hasStatus() != connectIQPurchaseResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == connectIQPurchaseResponse.status_) && getUnknownFields().equals(connectIQPurchaseResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectIQPurchaseResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.OK : statusForNumber;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseResponseOrBuilder
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
            return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQPurchaseResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQPurchaseResponse.class, Builder.class);
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
            return new ConnectIQPurchaseResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectIQPurchaseResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(ConnectIQPurchaseResponse connectIQPurchaseResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    connectIQPurchaseResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                connectIQPurchaseResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQPurchaseResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQPurchaseResponse build() {
                ConnectIQPurchaseResponse connectIQPurchaseResponseBuildPartial = buildPartial();
                if (connectIQPurchaseResponseBuildPartial.isInitialized()) {
                    return connectIQPurchaseResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectIQPurchaseResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQPurchaseResponse buildPartial() {
                ConnectIQPurchaseResponse connectIQPurchaseResponse = new ConnectIQPurchaseResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectIQPurchaseResponse);
                }
                onBuilt();
                return connectIQPurchaseResponse;
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
                return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQPurchaseResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.OK : statusForNumber;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQPurchaseResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQPurchaseResponse.class, Builder.class);
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
            public ConnectIQPurchaseResponse getDefaultInstanceForType() {
                return ConnectIQPurchaseResponse.getDefaultInstance();
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
                if (message instanceof ConnectIQPurchaseResponse) {
                    return mergeFrom((ConnectIQPurchaseResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectIQPurchaseResponse connectIQPurchaseResponse) {
                if (connectIQPurchaseResponse == ConnectIQPurchaseResponse.getDefaultInstance()) {
                    return this;
                }
                if (connectIQPurchaseResponse.hasStatus()) {
                    setStatus(connectIQPurchaseResponse.getStatus());
                }
                mergeUnknownFields(connectIQPurchaseResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectIQPurchaseResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectIQPurchaseResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQPurchaseResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQPurchaseResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ConnectIQPurchaseResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConnectIQPurchaseResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConnectIQPurchaseResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectIQPurchaseResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectIQPurchaseResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectIQPurchaseResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectIQPurchaseResponse parseFrom(InputStream inputStream) {
            return (ConnectIQPurchaseResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectIQPurchaseResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQPurchaseResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQPurchaseResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConnectIQPurchaseResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectIQPurchaseResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQPurchaseResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            OK(0),
            NOT_HANDLED(1);

            public static final int NOT_HANDLED_VALUE = 1;
            public static final int OK_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.ToystoreProto.ConnectIQPurchaseResponse.Status.1
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
                    return OK;
                }
                if (i14 != 1) {
                    return null;
                }
                return NOT_HANDLED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConnectIQPurchaseResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class ConnectIQRunCodeRequest extends GeneratedMessageV3 implements ConnectIQRunCodeRequestOrBuilder {
        public static final int APP_UUID_FIELD_NUMBER = 1;
        private static final ConnectIQRunCodeRequest DEFAULT_INSTANCE = new ConnectIQRunCodeRequest();

        @Deprecated
        public static final Parser<ConnectIQRunCodeRequest> PARSER = new AbstractParser<ConnectIQRunCodeRequest>() { // from class: com.garmin.proto.generated.ToystoreProto.ConnectIQRunCodeRequest.1
            @Override // com.google.protobuf.Parser
            public ConnectIQRunCodeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectIQRunCodeRequest.newBuilder();
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
        public static final int RUN_TYPE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private ByteString appUuid_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int runType_;

        private ConnectIQRunCodeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.appUuid_ = ByteString.EMPTY;
            this.runType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectIQRunCodeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQRunCodeRequest_descriptor;
        }

        public static Builder newBuilder(ConnectIQRunCodeRequest connectIQRunCodeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectIQRunCodeRequest);
        }

        public static ConnectIQRunCodeRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConnectIQRunCodeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectIQRunCodeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectIQRunCodeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectIQRunCodeRequest)) {
                return super.equals(obj);
            }
            ConnectIQRunCodeRequest connectIQRunCodeRequest = (ConnectIQRunCodeRequest) obj;
            if (hasAppUuid() != connectIQRunCodeRequest.hasAppUuid()) {
                return false;
            }
            if ((!hasAppUuid() || getAppUuid().equals(connectIQRunCodeRequest.getAppUuid())) && hasRunType() == connectIQRunCodeRequest.hasRunType()) {
                return (!hasRunType() || this.runType_ == connectIQRunCodeRequest.runType_) && getUnknownFields().equals(connectIQRunCodeRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQRunCodeRequestOrBuilder
        public ByteString getAppUuid() {
            return this.appUuid_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectIQRunCodeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQRunCodeRequestOrBuilder
        public RunType getRunType() {
            RunType runTypeForNumber = RunType.forNumber(this.runType_);
            return runTypeForNumber == null ? RunType.AUTHENTICATION : runTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.appUuid_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeEnumSize(2, this.runType_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQRunCodeRequestOrBuilder
        public boolean hasAppUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQRunCodeRequestOrBuilder
        public boolean hasRunType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAppUuid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAppUuid().hashCode();
            }
            if (hasRunType()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.runType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQRunCodeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQRunCodeRequest.class, Builder.class);
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
            return new ConnectIQRunCodeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.appUuid_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.runType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectIQRunCodeRequestOrBuilder {
            private ByteString appUuid_;
            private int bitField0_;
            private int runType_;

            private Builder() {
                this.appUuid_ = ByteString.EMPTY;
                this.runType_ = 0;
            }

            private void buildPartial0(ConnectIQRunCodeRequest connectIQRunCodeRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    connectIQRunCodeRequest.appUuid_ = this.appUuid_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    connectIQRunCodeRequest.runType_ = this.runType_;
                    i14 |= 2;
                }
                connectIQRunCodeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQRunCodeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQRunCodeRequest build() {
                ConnectIQRunCodeRequest connectIQRunCodeRequestBuildPartial = buildPartial();
                if (connectIQRunCodeRequestBuildPartial.isInitialized()) {
                    return connectIQRunCodeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectIQRunCodeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQRunCodeRequest buildPartial() {
                ConnectIQRunCodeRequest connectIQRunCodeRequest = new ConnectIQRunCodeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectIQRunCodeRequest);
                }
                onBuilt();
                return connectIQRunCodeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.appUuid_ = ByteString.EMPTY;
                this.runType_ = 0;
                return this;
            }

            public Builder clearAppUuid() {
                this.bitField0_ &= -2;
                this.appUuid_ = ConnectIQRunCodeRequest.getDefaultInstance().getAppUuid();
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

            public Builder clearRunType() {
                this.bitField0_ &= -3;
                this.runType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQRunCodeRequestOrBuilder
            public ByteString getAppUuid() {
                return this.appUuid_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQRunCodeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQRunCodeRequestOrBuilder
            public RunType getRunType() {
                RunType runTypeForNumber = RunType.forNumber(this.runType_);
                return runTypeForNumber == null ? RunType.AUTHENTICATION : runTypeForNumber;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQRunCodeRequestOrBuilder
            public boolean hasAppUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQRunCodeRequestOrBuilder
            public boolean hasRunType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQRunCodeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQRunCodeRequest.class, Builder.class);
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
                                    this.appUuid_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (RunType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.runType_ = i14;
                                        this.bitField0_ |= 2;
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

            public Builder setAppUuid(ByteString byteString) {
                byteString.getClass();
                this.appUuid_ = byteString;
                this.bitField0_ |= 1;
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

            public Builder setRunType(RunType runType) {
                runType.getClass();
                this.bitField0_ |= 2;
                this.runType_ = runType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectIQRunCodeRequest getDefaultInstanceForType() {
                return ConnectIQRunCodeRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.appUuid_ = ByteString.EMPTY;
                this.runType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectIQRunCodeRequest) {
                    return mergeFrom((ConnectIQRunCodeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectIQRunCodeRequest connectIQRunCodeRequest) {
                if (connectIQRunCodeRequest == ConnectIQRunCodeRequest.getDefaultInstance()) {
                    return this;
                }
                if (connectIQRunCodeRequest.hasAppUuid()) {
                    setAppUuid(connectIQRunCodeRequest.getAppUuid());
                }
                if (connectIQRunCodeRequest.hasRunType()) {
                    setRunType(connectIQRunCodeRequest.getRunType());
                }
                mergeUnknownFields(connectIQRunCodeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectIQRunCodeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectIQRunCodeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQRunCodeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQRunCodeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectIQRunCodeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectIQRunCodeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectIQRunCodeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectIQRunCodeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ ConnectIQRunCodeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConnectIQRunCodeRequest parseFrom(InputStream inputStream) {
            return (ConnectIQRunCodeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private ConnectIQRunCodeRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.appUuid_ = byteString;
            this.runType_ = 0;
        }

        public static ConnectIQRunCodeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQRunCodeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQRunCodeRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConnectIQRunCodeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectIQRunCodeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQRunCodeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum RunType implements ProtocolMessageEnum {
            AUTHENTICATION(0);

            public static final int AUTHENTICATION_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<RunType> internalValueMap = new Internal.EnumLiteMap<RunType>() { // from class: com.garmin.proto.generated.ToystoreProto.ConnectIQRunCodeRequest.RunType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public RunType findValueByNumber(int i14) {
                    return RunType.forNumber(i14);
                }
            };
            private static final RunType[] VALUES = values();

            RunType(int i14) {
                this.value = i14;
            }

            public static RunType forNumber(int i14) {
                if (i14 != 0) {
                    return null;
                }
                return AUTHENTICATION;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConnectIQRunCodeRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<RunType> internalGetValueMap() {
                return internalValueMap;
            }

            public static RunType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static RunType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class ConnectIQRunCodeResponse extends GeneratedMessageV3 implements ConnectIQRunCodeResponseOrBuilder {
        private static final ConnectIQRunCodeResponse DEFAULT_INSTANCE = new ConnectIQRunCodeResponse();

        @Deprecated
        public static final Parser<ConnectIQRunCodeResponse> PARSER = new AbstractParser<ConnectIQRunCodeResponse>() { // from class: com.garmin.proto.generated.ToystoreProto.ConnectIQRunCodeResponse.1
            @Override // com.google.protobuf.Parser
            public ConnectIQRunCodeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectIQRunCodeResponse.newBuilder();
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

        private ConnectIQRunCodeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectIQRunCodeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQRunCodeResponse_descriptor;
        }

        public static Builder newBuilder(ConnectIQRunCodeResponse connectIQRunCodeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectIQRunCodeResponse);
        }

        public static ConnectIQRunCodeResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConnectIQRunCodeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectIQRunCodeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectIQRunCodeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectIQRunCodeResponse)) {
                return super.equals(obj);
            }
            ConnectIQRunCodeResponse connectIQRunCodeResponse = (ConnectIQRunCodeResponse) obj;
            if (hasStatus() != connectIQRunCodeResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == connectIQRunCodeResponse.status_) && getUnknownFields().equals(connectIQRunCodeResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectIQRunCodeResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQRunCodeResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.OK : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQRunCodeResponseOrBuilder
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
            return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQRunCodeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQRunCodeResponse.class, Builder.class);
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
            return new ConnectIQRunCodeResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectIQRunCodeResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(ConnectIQRunCodeResponse connectIQRunCodeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    connectIQRunCodeResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                connectIQRunCodeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQRunCodeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQRunCodeResponse build() {
                ConnectIQRunCodeResponse connectIQRunCodeResponseBuildPartial = buildPartial();
                if (connectIQRunCodeResponseBuildPartial.isInitialized()) {
                    return connectIQRunCodeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectIQRunCodeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQRunCodeResponse buildPartial() {
                ConnectIQRunCodeResponse connectIQRunCodeResponse = new ConnectIQRunCodeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectIQRunCodeResponse);
                }
                onBuilt();
                return connectIQRunCodeResponse;
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
                return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQRunCodeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQRunCodeResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.OK : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ConnectIQRunCodeResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_ConnectIQRunCodeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQRunCodeResponse.class, Builder.class);
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
            public ConnectIQRunCodeResponse getDefaultInstanceForType() {
                return ConnectIQRunCodeResponse.getDefaultInstance();
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
                if (message instanceof ConnectIQRunCodeResponse) {
                    return mergeFrom((ConnectIQRunCodeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectIQRunCodeResponse connectIQRunCodeResponse) {
                if (connectIQRunCodeResponse == ConnectIQRunCodeResponse.getDefaultInstance()) {
                    return this;
                }
                if (connectIQRunCodeResponse.hasStatus()) {
                    setStatus(connectIQRunCodeResponse.getStatus());
                }
                mergeUnknownFields(connectIQRunCodeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectIQRunCodeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectIQRunCodeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQRunCodeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQRunCodeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ConnectIQRunCodeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConnectIQRunCodeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConnectIQRunCodeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectIQRunCodeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectIQRunCodeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectIQRunCodeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectIQRunCodeResponse parseFrom(InputStream inputStream) {
            return (ConnectIQRunCodeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectIQRunCodeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQRunCodeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQRunCodeResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConnectIQRunCodeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectIQRunCodeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQRunCodeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            OK(0),
            UNKNOWN_ERROR(1),
            APP_NOT_INSTALLED(2),
            NOT_ENOUGH_MEMORY(3);

            public static final int APP_NOT_INSTALLED_VALUE = 2;
            public static final int NOT_ENOUGH_MEMORY_VALUE = 3;
            public static final int OK_VALUE = 0;
            public static final int UNKNOWN_ERROR_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.ToystoreProto.ConnectIQRunCodeResponse.ResponseStatus.1
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
                    return OK;
                }
                if (i14 == 1) {
                    return UNKNOWN_ERROR;
                }
                if (i14 == 2) {
                    return APP_NOT_INSTALLED;
                }
                if (i14 != 3) {
                    return null;
                }
                return NOT_ENOUGH_MEMORY;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConnectIQRunCodeResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class ToystoreService extends GeneratedMessageV3 implements ToystoreServiceOrBuilder {
        public static final int CONNECT_IQ_OAUTH_COMPLETE_REQUEST_FIELD_NUMBER = 5;
        public static final int CONNECT_IQ_OAUTH_COMPLETE_RESPONSE_FIELD_NUMBER = 6;
        public static final int CONNECT_IQ_OAUTH_REQUEST_FIELD_NUMBER = 3;
        public static final int CONNECT_IQ_OAUTH_RESPONSE_FIELD_NUMBER = 4;
        private static final ToystoreService DEFAULT_INSTANCE = new ToystoreService();

        @Deprecated
        public static final Parser<ToystoreService> PARSER = new AbstractParser<ToystoreService>() { // from class: com.garmin.proto.generated.ToystoreProto.ToystoreService.1
            @Override // com.google.protobuf.Parser
            public ToystoreService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ToystoreService.newBuilder();
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
        public static final int PURCHASE_REQUEST_FIELD_NUMBER = 7;
        public static final int PURCHASE_RESPONSE_FIELD_NUMBER = 8;
        public static final int RUN_CODE_REQUEST_FIELD_NUMBER = 1;
        public static final int RUN_CODE_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest connectIqOauthCompleteRequest_;
        private GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse connectIqOauthCompleteResponse_;
        private GDIConnectIQHTTPProto.ConnectIQOAuthRequest connectIqOauthRequest_;
        private GDIConnectIQHTTPProto.ConnectIQOAuthResponse connectIqOauthResponse_;
        private byte memoizedIsInitialized;
        private ConnectIQPurchaseRequest purchaseRequest_;
        private ConnectIQPurchaseResponse purchaseResponse_;
        private ConnectIQRunCodeRequest runCodeRequest_;
        private ConnectIQRunCodeResponse runCodeResponse_;

        private ToystoreService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ToystoreService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ToystoreProto.internal_static_GDI_Proto_Toystore_ToystoreService_descriptor;
        }

        public static Builder newBuilder(ToystoreService toystoreService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(toystoreService);
        }

        public static ToystoreService parseDelimitedFrom(InputStream inputStream) {
            return (ToystoreService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ToystoreService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ToystoreService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ToystoreService)) {
                return super.equals(obj);
            }
            ToystoreService toystoreService = (ToystoreService) obj;
            if (hasRunCodeRequest() != toystoreService.hasRunCodeRequest()) {
                return false;
            }
            if ((hasRunCodeRequest() && !getRunCodeRequest().equals(toystoreService.getRunCodeRequest())) || hasRunCodeResponse() != toystoreService.hasRunCodeResponse()) {
                return false;
            }
            if ((hasRunCodeResponse() && !getRunCodeResponse().equals(toystoreService.getRunCodeResponse())) || hasConnectIqOauthRequest() != toystoreService.hasConnectIqOauthRequest()) {
                return false;
            }
            if ((hasConnectIqOauthRequest() && !getConnectIqOauthRequest().equals(toystoreService.getConnectIqOauthRequest())) || hasConnectIqOauthResponse() != toystoreService.hasConnectIqOauthResponse()) {
                return false;
            }
            if ((hasConnectIqOauthResponse() && !getConnectIqOauthResponse().equals(toystoreService.getConnectIqOauthResponse())) || hasConnectIqOauthCompleteRequest() != toystoreService.hasConnectIqOauthCompleteRequest()) {
                return false;
            }
            if ((hasConnectIqOauthCompleteRequest() && !getConnectIqOauthCompleteRequest().equals(toystoreService.getConnectIqOauthCompleteRequest())) || hasConnectIqOauthCompleteResponse() != toystoreService.hasConnectIqOauthCompleteResponse()) {
                return false;
            }
            if ((hasConnectIqOauthCompleteResponse() && !getConnectIqOauthCompleteResponse().equals(toystoreService.getConnectIqOauthCompleteResponse())) || hasPurchaseRequest() != toystoreService.hasPurchaseRequest()) {
                return false;
            }
            if ((!hasPurchaseRequest() || getPurchaseRequest().equals(toystoreService.getPurchaseRequest())) && hasPurchaseResponse() == toystoreService.hasPurchaseResponse()) {
                return (!hasPurchaseResponse() || getPurchaseResponse().equals(toystoreService.getPurchaseResponse())) && getUnknownFields().equals(toystoreService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest getConnectIqOauthCompleteRequest() {
            GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest = this.connectIqOauthCompleteRequest_;
            return connectIQOAuthCompleteRequest == null ? GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.getDefaultInstance() : connectIQOAuthCompleteRequest;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder getConnectIqOauthCompleteRequestOrBuilder() {
            GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest = this.connectIqOauthCompleteRequest_;
            return connectIQOAuthCompleteRequest == null ? GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.getDefaultInstance() : connectIQOAuthCompleteRequest;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse getConnectIqOauthCompleteResponse() {
            GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse = this.connectIqOauthCompleteResponse_;
            return connectIQOAuthCompleteResponse == null ? GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.getDefaultInstance() : connectIQOAuthCompleteResponse;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder getConnectIqOauthCompleteResponseOrBuilder() {
            GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse = this.connectIqOauthCompleteResponse_;
            return connectIQOAuthCompleteResponse == null ? GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.getDefaultInstance() : connectIQOAuthCompleteResponse;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public GDIConnectIQHTTPProto.ConnectIQOAuthRequest getConnectIqOauthRequest() {
            GDIConnectIQHTTPProto.ConnectIQOAuthRequest connectIQOAuthRequest = this.connectIqOauthRequest_;
            return connectIQOAuthRequest == null ? GDIConnectIQHTTPProto.ConnectIQOAuthRequest.getDefaultInstance() : connectIQOAuthRequest;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder getConnectIqOauthRequestOrBuilder() {
            GDIConnectIQHTTPProto.ConnectIQOAuthRequest connectIQOAuthRequest = this.connectIqOauthRequest_;
            return connectIQOAuthRequest == null ? GDIConnectIQHTTPProto.ConnectIQOAuthRequest.getDefaultInstance() : connectIQOAuthRequest;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public GDIConnectIQHTTPProto.ConnectIQOAuthResponse getConnectIqOauthResponse() {
            GDIConnectIQHTTPProto.ConnectIQOAuthResponse connectIQOAuthResponse = this.connectIqOauthResponse_;
            return connectIQOAuthResponse == null ? GDIConnectIQHTTPProto.ConnectIQOAuthResponse.getDefaultInstance() : connectIQOAuthResponse;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder getConnectIqOauthResponseOrBuilder() {
            GDIConnectIQHTTPProto.ConnectIQOAuthResponse connectIQOAuthResponse = this.connectIqOauthResponse_;
            return connectIQOAuthResponse == null ? GDIConnectIQHTTPProto.ConnectIQOAuthResponse.getDefaultInstance() : connectIQOAuthResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ToystoreService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public ConnectIQPurchaseRequest getPurchaseRequest() {
            ConnectIQPurchaseRequest connectIQPurchaseRequest = this.purchaseRequest_;
            return connectIQPurchaseRequest == null ? ConnectIQPurchaseRequest.getDefaultInstance() : connectIQPurchaseRequest;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public ConnectIQPurchaseRequestOrBuilder getPurchaseRequestOrBuilder() {
            ConnectIQPurchaseRequest connectIQPurchaseRequest = this.purchaseRequest_;
            return connectIQPurchaseRequest == null ? ConnectIQPurchaseRequest.getDefaultInstance() : connectIQPurchaseRequest;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public ConnectIQPurchaseResponse getPurchaseResponse() {
            ConnectIQPurchaseResponse connectIQPurchaseResponse = this.purchaseResponse_;
            return connectIQPurchaseResponse == null ? ConnectIQPurchaseResponse.getDefaultInstance() : connectIQPurchaseResponse;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public ConnectIQPurchaseResponseOrBuilder getPurchaseResponseOrBuilder() {
            ConnectIQPurchaseResponse connectIQPurchaseResponse = this.purchaseResponse_;
            return connectIQPurchaseResponse == null ? ConnectIQPurchaseResponse.getDefaultInstance() : connectIQPurchaseResponse;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public ConnectIQRunCodeRequest getRunCodeRequest() {
            ConnectIQRunCodeRequest connectIQRunCodeRequest = this.runCodeRequest_;
            return connectIQRunCodeRequest == null ? ConnectIQRunCodeRequest.getDefaultInstance() : connectIQRunCodeRequest;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public ConnectIQRunCodeRequestOrBuilder getRunCodeRequestOrBuilder() {
            ConnectIQRunCodeRequest connectIQRunCodeRequest = this.runCodeRequest_;
            return connectIQRunCodeRequest == null ? ConnectIQRunCodeRequest.getDefaultInstance() : connectIQRunCodeRequest;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public ConnectIQRunCodeResponse getRunCodeResponse() {
            ConnectIQRunCodeResponse connectIQRunCodeResponse = this.runCodeResponse_;
            return connectIQRunCodeResponse == null ? ConnectIQRunCodeResponse.getDefaultInstance() : connectIQRunCodeResponse;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public ConnectIQRunCodeResponseOrBuilder getRunCodeResponseOrBuilder() {
            ConnectIQRunCodeResponse connectIQRunCodeResponse = this.runCodeResponse_;
            return connectIQRunCodeResponse == null ? ConnectIQRunCodeResponse.getDefaultInstance() : connectIQRunCodeResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getRunCodeRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getRunCodeResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getConnectIqOauthRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getConnectIqOauthResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getConnectIqOauthCompleteRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getConnectIqOauthCompleteResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getPurchaseRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getPurchaseResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public boolean hasConnectIqOauthCompleteRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public boolean hasConnectIqOauthCompleteResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public boolean hasConnectIqOauthRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public boolean hasConnectIqOauthResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public boolean hasPurchaseRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public boolean hasPurchaseResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public boolean hasRunCodeRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
        public boolean hasRunCodeResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRunCodeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getRunCodeRequest().hashCode();
            }
            if (hasRunCodeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getRunCodeResponse().hashCode();
            }
            if (hasConnectIqOauthRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getConnectIqOauthRequest().hashCode();
            }
            if (hasConnectIqOauthResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getConnectIqOauthResponse().hashCode();
            }
            if (hasConnectIqOauthCompleteRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getConnectIqOauthCompleteRequest().hashCode();
            }
            if (hasConnectIqOauthCompleteResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getConnectIqOauthCompleteResponse().hashCode();
            }
            if (hasPurchaseRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getPurchaseRequest().hashCode();
            }
            if (hasPurchaseResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getPurchaseResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ToystoreProto.internal_static_GDI_Proto_Toystore_ToystoreService_fieldAccessorTable.ensureFieldAccessorsInitialized(ToystoreService.class, Builder.class);
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
            if (hasConnectIqOauthRequest() && !getConnectIqOauthRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasConnectIqOauthResponse() && !getConnectIqOauthResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasConnectIqOauthCompleteRequest() && !getConnectIqOauthCompleteRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasConnectIqOauthCompleteResponse() && !getConnectIqOauthCompleteResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasPurchaseRequest() || getPurchaseRequest().isInitialized()) {
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
            return new ToystoreService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getRunCodeRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getRunCodeResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getConnectIqOauthRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getConnectIqOauthResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getConnectIqOauthCompleteRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getConnectIqOauthCompleteResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getPurchaseRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getPurchaseResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ToystoreServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder> connectIqOauthCompleteRequestBuilder_;
            private GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest connectIqOauthCompleteRequest_;
            private SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder> connectIqOauthCompleteResponseBuilder_;
            private GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse connectIqOauthCompleteResponse_;
            private SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthRequest, GDIConnectIQHTTPProto.ConnectIQOAuthRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder> connectIqOauthRequestBuilder_;
            private GDIConnectIQHTTPProto.ConnectIQOAuthRequest connectIqOauthRequest_;
            private SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthResponse, GDIConnectIQHTTPProto.ConnectIQOAuthResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder> connectIqOauthResponseBuilder_;
            private GDIConnectIQHTTPProto.ConnectIQOAuthResponse connectIqOauthResponse_;
            private SingleFieldBuilderV3<ConnectIQPurchaseRequest, ConnectIQPurchaseRequest.Builder, ConnectIQPurchaseRequestOrBuilder> purchaseRequestBuilder_;
            private ConnectIQPurchaseRequest purchaseRequest_;
            private SingleFieldBuilderV3<ConnectIQPurchaseResponse, ConnectIQPurchaseResponse.Builder, ConnectIQPurchaseResponseOrBuilder> purchaseResponseBuilder_;
            private ConnectIQPurchaseResponse purchaseResponse_;
            private SingleFieldBuilderV3<ConnectIQRunCodeRequest, ConnectIQRunCodeRequest.Builder, ConnectIQRunCodeRequestOrBuilder> runCodeRequestBuilder_;
            private ConnectIQRunCodeRequest runCodeRequest_;
            private SingleFieldBuilderV3<ConnectIQRunCodeResponse, ConnectIQRunCodeResponse.Builder, ConnectIQRunCodeResponseOrBuilder> runCodeResponseBuilder_;
            private ConnectIQRunCodeResponse runCodeResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ToystoreService toystoreService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ConnectIQRunCodeRequest, ConnectIQRunCodeRequest.Builder, ConnectIQRunCodeRequestOrBuilder> singleFieldBuilderV3 = this.runCodeRequestBuilder_;
                    toystoreService.runCodeRequest_ = singleFieldBuilderV3 == null ? this.runCodeRequest_ : (ConnectIQRunCodeRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConnectIQRunCodeResponse, ConnectIQRunCodeResponse.Builder, ConnectIQRunCodeResponseOrBuilder> singleFieldBuilderV4 = this.runCodeResponseBuilder_;
                    toystoreService.runCodeResponse_ = singleFieldBuilderV4 == null ? this.runCodeResponse_ : (ConnectIQRunCodeResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthRequest, GDIConnectIQHTTPProto.ConnectIQOAuthRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder> singleFieldBuilderV5 = this.connectIqOauthRequestBuilder_;
                    toystoreService.connectIqOauthRequest_ = singleFieldBuilderV5 == null ? this.connectIqOauthRequest_ : (GDIConnectIQHTTPProto.ConnectIQOAuthRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthResponse, GDIConnectIQHTTPProto.ConnectIQOAuthResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder> singleFieldBuilderV6 = this.connectIqOauthResponseBuilder_;
                    toystoreService.connectIqOauthResponse_ = singleFieldBuilderV6 == null ? this.connectIqOauthResponse_ : (GDIConnectIQHTTPProto.ConnectIQOAuthResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder> singleFieldBuilderV7 = this.connectIqOauthCompleteRequestBuilder_;
                    toystoreService.connectIqOauthCompleteRequest_ = singleFieldBuilderV7 == null ? this.connectIqOauthCompleteRequest_ : (GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder> singleFieldBuilderV8 = this.connectIqOauthCompleteResponseBuilder_;
                    toystoreService.connectIqOauthCompleteResponse_ = singleFieldBuilderV8 == null ? this.connectIqOauthCompleteResponse_ : (GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<ConnectIQPurchaseRequest, ConnectIQPurchaseRequest.Builder, ConnectIQPurchaseRequestOrBuilder> singleFieldBuilderV9 = this.purchaseRequestBuilder_;
                    toystoreService.purchaseRequest_ = singleFieldBuilderV9 == null ? this.purchaseRequest_ : (ConnectIQPurchaseRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<ConnectIQPurchaseResponse, ConnectIQPurchaseResponse.Builder, ConnectIQPurchaseResponseOrBuilder> singleFieldBuilderV10 = this.purchaseResponseBuilder_;
                    toystoreService.purchaseResponse_ = singleFieldBuilderV10 == null ? this.purchaseResponse_ : (ConnectIQPurchaseResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                toystoreService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder> getConnectIqOauthCompleteRequestFieldBuilder() {
                if (this.connectIqOauthCompleteRequestBuilder_ == null) {
                    this.connectIqOauthCompleteRequestBuilder_ = new SingleFieldBuilderV3<>(getConnectIqOauthCompleteRequest(), getParentForChildren(), isClean());
                    this.connectIqOauthCompleteRequest_ = null;
                }
                return this.connectIqOauthCompleteRequestBuilder_;
            }

            private SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder> getConnectIqOauthCompleteResponseFieldBuilder() {
                if (this.connectIqOauthCompleteResponseBuilder_ == null) {
                    this.connectIqOauthCompleteResponseBuilder_ = new SingleFieldBuilderV3<>(getConnectIqOauthCompleteResponse(), getParentForChildren(), isClean());
                    this.connectIqOauthCompleteResponse_ = null;
                }
                return this.connectIqOauthCompleteResponseBuilder_;
            }

            private SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthRequest, GDIConnectIQHTTPProto.ConnectIQOAuthRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder> getConnectIqOauthRequestFieldBuilder() {
                if (this.connectIqOauthRequestBuilder_ == null) {
                    this.connectIqOauthRequestBuilder_ = new SingleFieldBuilderV3<>(getConnectIqOauthRequest(), getParentForChildren(), isClean());
                    this.connectIqOauthRequest_ = null;
                }
                return this.connectIqOauthRequestBuilder_;
            }

            private SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthResponse, GDIConnectIQHTTPProto.ConnectIQOAuthResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder> getConnectIqOauthResponseFieldBuilder() {
                if (this.connectIqOauthResponseBuilder_ == null) {
                    this.connectIqOauthResponseBuilder_ = new SingleFieldBuilderV3<>(getConnectIqOauthResponse(), getParentForChildren(), isClean());
                    this.connectIqOauthResponse_ = null;
                }
                return this.connectIqOauthResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_ToystoreService_descriptor;
            }

            private SingleFieldBuilderV3<ConnectIQPurchaseRequest, ConnectIQPurchaseRequest.Builder, ConnectIQPurchaseRequestOrBuilder> getPurchaseRequestFieldBuilder() {
                if (this.purchaseRequestBuilder_ == null) {
                    this.purchaseRequestBuilder_ = new SingleFieldBuilderV3<>(getPurchaseRequest(), getParentForChildren(), isClean());
                    this.purchaseRequest_ = null;
                }
                return this.purchaseRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConnectIQPurchaseResponse, ConnectIQPurchaseResponse.Builder, ConnectIQPurchaseResponseOrBuilder> getPurchaseResponseFieldBuilder() {
                if (this.purchaseResponseBuilder_ == null) {
                    this.purchaseResponseBuilder_ = new SingleFieldBuilderV3<>(getPurchaseResponse(), getParentForChildren(), isClean());
                    this.purchaseResponse_ = null;
                }
                return this.purchaseResponseBuilder_;
            }

            private SingleFieldBuilderV3<ConnectIQRunCodeRequest, ConnectIQRunCodeRequest.Builder, ConnectIQRunCodeRequestOrBuilder> getRunCodeRequestFieldBuilder() {
                if (this.runCodeRequestBuilder_ == null) {
                    this.runCodeRequestBuilder_ = new SingleFieldBuilderV3<>(getRunCodeRequest(), getParentForChildren(), isClean());
                    this.runCodeRequest_ = null;
                }
                return this.runCodeRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConnectIQRunCodeResponse, ConnectIQRunCodeResponse.Builder, ConnectIQRunCodeResponseOrBuilder> getRunCodeResponseFieldBuilder() {
                if (this.runCodeResponseBuilder_ == null) {
                    this.runCodeResponseBuilder_ = new SingleFieldBuilderV3<>(getRunCodeResponse(), getParentForChildren(), isClean());
                    this.runCodeResponse_ = null;
                }
                return this.runCodeResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getRunCodeRequestFieldBuilder();
                    getRunCodeResponseFieldBuilder();
                    getConnectIqOauthRequestFieldBuilder();
                    getConnectIqOauthResponseFieldBuilder();
                    getConnectIqOauthCompleteRequestFieldBuilder();
                    getConnectIqOauthCompleteResponseFieldBuilder();
                    getPurchaseRequestFieldBuilder();
                    getPurchaseResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ToystoreService build() {
                ToystoreService toystoreServiceBuildPartial = buildPartial();
                if (toystoreServiceBuildPartial.isInitialized()) {
                    return toystoreServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) toystoreServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ToystoreService buildPartial() {
                ToystoreService toystoreService = new ToystoreService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(toystoreService);
                }
                onBuilt();
                return toystoreService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.runCodeRequest_ = null;
                SingleFieldBuilderV3<ConnectIQRunCodeRequest, ConnectIQRunCodeRequest.Builder, ConnectIQRunCodeRequestOrBuilder> singleFieldBuilderV3 = this.runCodeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.runCodeRequestBuilder_ = null;
                }
                this.runCodeResponse_ = null;
                SingleFieldBuilderV3<ConnectIQRunCodeResponse, ConnectIQRunCodeResponse.Builder, ConnectIQRunCodeResponseOrBuilder> singleFieldBuilderV4 = this.runCodeResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.runCodeResponseBuilder_ = null;
                }
                this.connectIqOauthRequest_ = null;
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthRequest, GDIConnectIQHTTPProto.ConnectIQOAuthRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder> singleFieldBuilderV5 = this.connectIqOauthRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.connectIqOauthRequestBuilder_ = null;
                }
                this.connectIqOauthResponse_ = null;
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthResponse, GDIConnectIQHTTPProto.ConnectIQOAuthResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder> singleFieldBuilderV6 = this.connectIqOauthResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.connectIqOauthResponseBuilder_ = null;
                }
                this.connectIqOauthCompleteRequest_ = null;
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder> singleFieldBuilderV7 = this.connectIqOauthCompleteRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.connectIqOauthCompleteRequestBuilder_ = null;
                }
                this.connectIqOauthCompleteResponse_ = null;
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder> singleFieldBuilderV8 = this.connectIqOauthCompleteResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.connectIqOauthCompleteResponseBuilder_ = null;
                }
                this.purchaseRequest_ = null;
                SingleFieldBuilderV3<ConnectIQPurchaseRequest, ConnectIQPurchaseRequest.Builder, ConnectIQPurchaseRequestOrBuilder> singleFieldBuilderV9 = this.purchaseRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.purchaseRequestBuilder_ = null;
                }
                this.purchaseResponse_ = null;
                SingleFieldBuilderV3<ConnectIQPurchaseResponse, ConnectIQPurchaseResponse.Builder, ConnectIQPurchaseResponseOrBuilder> singleFieldBuilderV10 = this.purchaseResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.purchaseResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearConnectIqOauthCompleteRequest() {
                this.bitField0_ &= -17;
                this.connectIqOauthCompleteRequest_ = null;
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectIqOauthCompleteRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectIqOauthCompleteResponse() {
                this.bitField0_ &= -33;
                this.connectIqOauthCompleteResponse_ = null;
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectIqOauthCompleteResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectIqOauthRequest() {
                this.bitField0_ &= -5;
                this.connectIqOauthRequest_ = null;
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthRequest, GDIConnectIQHTTPProto.ConnectIQOAuthRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectIqOauthRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectIqOauthResponse() {
                this.bitField0_ &= -9;
                this.connectIqOauthResponse_ = null;
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthResponse, GDIConnectIQHTTPProto.ConnectIQOAuthResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectIqOauthResponseBuilder_ = null;
                }
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

            public Builder clearPurchaseRequest() {
                this.bitField0_ &= -65;
                this.purchaseRequest_ = null;
                SingleFieldBuilderV3<ConnectIQPurchaseRequest, ConnectIQPurchaseRequest.Builder, ConnectIQPurchaseRequestOrBuilder> singleFieldBuilderV3 = this.purchaseRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.purchaseRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPurchaseResponse() {
                this.bitField0_ &= -129;
                this.purchaseResponse_ = null;
                SingleFieldBuilderV3<ConnectIQPurchaseResponse, ConnectIQPurchaseResponse.Builder, ConnectIQPurchaseResponseOrBuilder> singleFieldBuilderV3 = this.purchaseResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.purchaseResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRunCodeRequest() {
                this.bitField0_ &= -2;
                this.runCodeRequest_ = null;
                SingleFieldBuilderV3<ConnectIQRunCodeRequest, ConnectIQRunCodeRequest.Builder, ConnectIQRunCodeRequestOrBuilder> singleFieldBuilderV3 = this.runCodeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.runCodeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRunCodeResponse() {
                this.bitField0_ &= -3;
                this.runCodeResponse_ = null;
                SingleFieldBuilderV3<ConnectIQRunCodeResponse, ConnectIQRunCodeResponse.Builder, ConnectIQRunCodeResponseOrBuilder> singleFieldBuilderV3 = this.runCodeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.runCodeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest getConnectIqOauthCompleteRequest() {
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest) singleFieldBuilderV3.getMessage();
                }
                GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest = this.connectIqOauthCompleteRequest_;
                return connectIQOAuthCompleteRequest == null ? GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.getDefaultInstance() : connectIQOAuthCompleteRequest;
            }

            public GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.Builder getConnectIqOauthCompleteRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.Builder) getConnectIqOauthCompleteRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder getConnectIqOauthCompleteRequestOrBuilder() {
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest = this.connectIqOauthCompleteRequest_;
                return connectIQOAuthCompleteRequest == null ? GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.getDefaultInstance() : connectIQOAuthCompleteRequest;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse getConnectIqOauthCompleteResponse() {
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse) singleFieldBuilderV3.getMessage();
                }
                GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse = this.connectIqOauthCompleteResponse_;
                return connectIQOAuthCompleteResponse == null ? GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.getDefaultInstance() : connectIQOAuthCompleteResponse;
            }

            public GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.Builder getConnectIqOauthCompleteResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.Builder) getConnectIqOauthCompleteResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder getConnectIqOauthCompleteResponseOrBuilder() {
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse = this.connectIqOauthCompleteResponse_;
                return connectIQOAuthCompleteResponse == null ? GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.getDefaultInstance() : connectIQOAuthCompleteResponse;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public GDIConnectIQHTTPProto.ConnectIQOAuthRequest getConnectIqOauthRequest() {
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthRequest, GDIConnectIQHTTPProto.ConnectIQOAuthRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIConnectIQHTTPProto.ConnectIQOAuthRequest) singleFieldBuilderV3.getMessage();
                }
                GDIConnectIQHTTPProto.ConnectIQOAuthRequest connectIQOAuthRequest = this.connectIqOauthRequest_;
                return connectIQOAuthRequest == null ? GDIConnectIQHTTPProto.ConnectIQOAuthRequest.getDefaultInstance() : connectIQOAuthRequest;
            }

            public GDIConnectIQHTTPProto.ConnectIQOAuthRequest.Builder getConnectIqOauthRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (GDIConnectIQHTTPProto.ConnectIQOAuthRequest.Builder) getConnectIqOauthRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder getConnectIqOauthRequestOrBuilder() {
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthRequest, GDIConnectIQHTTPProto.ConnectIQOAuthRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIConnectIQHTTPProto.ConnectIQOAuthRequest connectIQOAuthRequest = this.connectIqOauthRequest_;
                return connectIQOAuthRequest == null ? GDIConnectIQHTTPProto.ConnectIQOAuthRequest.getDefaultInstance() : connectIQOAuthRequest;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public GDIConnectIQHTTPProto.ConnectIQOAuthResponse getConnectIqOauthResponse() {
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthResponse, GDIConnectIQHTTPProto.ConnectIQOAuthResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIConnectIQHTTPProto.ConnectIQOAuthResponse) singleFieldBuilderV3.getMessage();
                }
                GDIConnectIQHTTPProto.ConnectIQOAuthResponse connectIQOAuthResponse = this.connectIqOauthResponse_;
                return connectIQOAuthResponse == null ? GDIConnectIQHTTPProto.ConnectIQOAuthResponse.getDefaultInstance() : connectIQOAuthResponse;
            }

            public GDIConnectIQHTTPProto.ConnectIQOAuthResponse.Builder getConnectIqOauthResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (GDIConnectIQHTTPProto.ConnectIQOAuthResponse.Builder) getConnectIqOauthResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder getConnectIqOauthResponseOrBuilder() {
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthResponse, GDIConnectIQHTTPProto.ConnectIQOAuthResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIConnectIQHTTPProto.ConnectIQOAuthResponse connectIQOAuthResponse = this.connectIqOauthResponse_;
                return connectIQOAuthResponse == null ? GDIConnectIQHTTPProto.ConnectIQOAuthResponse.getDefaultInstance() : connectIQOAuthResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_ToystoreService_descriptor;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public ConnectIQPurchaseRequest getPurchaseRequest() {
                SingleFieldBuilderV3<ConnectIQPurchaseRequest, ConnectIQPurchaseRequest.Builder, ConnectIQPurchaseRequestOrBuilder> singleFieldBuilderV3 = this.purchaseRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQPurchaseRequest) singleFieldBuilderV3.getMessage();
                }
                ConnectIQPurchaseRequest connectIQPurchaseRequest = this.purchaseRequest_;
                return connectIQPurchaseRequest == null ? ConnectIQPurchaseRequest.getDefaultInstance() : connectIQPurchaseRequest;
            }

            public ConnectIQPurchaseRequest.Builder getPurchaseRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (ConnectIQPurchaseRequest.Builder) getPurchaseRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public ConnectIQPurchaseRequestOrBuilder getPurchaseRequestOrBuilder() {
                SingleFieldBuilderV3<ConnectIQPurchaseRequest, ConnectIQPurchaseRequest.Builder, ConnectIQPurchaseRequestOrBuilder> singleFieldBuilderV3 = this.purchaseRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQPurchaseRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectIQPurchaseRequest connectIQPurchaseRequest = this.purchaseRequest_;
                return connectIQPurchaseRequest == null ? ConnectIQPurchaseRequest.getDefaultInstance() : connectIQPurchaseRequest;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public ConnectIQPurchaseResponse getPurchaseResponse() {
                SingleFieldBuilderV3<ConnectIQPurchaseResponse, ConnectIQPurchaseResponse.Builder, ConnectIQPurchaseResponseOrBuilder> singleFieldBuilderV3 = this.purchaseResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQPurchaseResponse) singleFieldBuilderV3.getMessage();
                }
                ConnectIQPurchaseResponse connectIQPurchaseResponse = this.purchaseResponse_;
                return connectIQPurchaseResponse == null ? ConnectIQPurchaseResponse.getDefaultInstance() : connectIQPurchaseResponse;
            }

            public ConnectIQPurchaseResponse.Builder getPurchaseResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (ConnectIQPurchaseResponse.Builder) getPurchaseResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public ConnectIQPurchaseResponseOrBuilder getPurchaseResponseOrBuilder() {
                SingleFieldBuilderV3<ConnectIQPurchaseResponse, ConnectIQPurchaseResponse.Builder, ConnectIQPurchaseResponseOrBuilder> singleFieldBuilderV3 = this.purchaseResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQPurchaseResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectIQPurchaseResponse connectIQPurchaseResponse = this.purchaseResponse_;
                return connectIQPurchaseResponse == null ? ConnectIQPurchaseResponse.getDefaultInstance() : connectIQPurchaseResponse;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public ConnectIQRunCodeRequest getRunCodeRequest() {
                SingleFieldBuilderV3<ConnectIQRunCodeRequest, ConnectIQRunCodeRequest.Builder, ConnectIQRunCodeRequestOrBuilder> singleFieldBuilderV3 = this.runCodeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQRunCodeRequest) singleFieldBuilderV3.getMessage();
                }
                ConnectIQRunCodeRequest connectIQRunCodeRequest = this.runCodeRequest_;
                return connectIQRunCodeRequest == null ? ConnectIQRunCodeRequest.getDefaultInstance() : connectIQRunCodeRequest;
            }

            public ConnectIQRunCodeRequest.Builder getRunCodeRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConnectIQRunCodeRequest.Builder) getRunCodeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public ConnectIQRunCodeRequestOrBuilder getRunCodeRequestOrBuilder() {
                SingleFieldBuilderV3<ConnectIQRunCodeRequest, ConnectIQRunCodeRequest.Builder, ConnectIQRunCodeRequestOrBuilder> singleFieldBuilderV3 = this.runCodeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQRunCodeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectIQRunCodeRequest connectIQRunCodeRequest = this.runCodeRequest_;
                return connectIQRunCodeRequest == null ? ConnectIQRunCodeRequest.getDefaultInstance() : connectIQRunCodeRequest;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public ConnectIQRunCodeResponse getRunCodeResponse() {
                SingleFieldBuilderV3<ConnectIQRunCodeResponse, ConnectIQRunCodeResponse.Builder, ConnectIQRunCodeResponseOrBuilder> singleFieldBuilderV3 = this.runCodeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQRunCodeResponse) singleFieldBuilderV3.getMessage();
                }
                ConnectIQRunCodeResponse connectIQRunCodeResponse = this.runCodeResponse_;
                return connectIQRunCodeResponse == null ? ConnectIQRunCodeResponse.getDefaultInstance() : connectIQRunCodeResponse;
            }

            public ConnectIQRunCodeResponse.Builder getRunCodeResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConnectIQRunCodeResponse.Builder) getRunCodeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public ConnectIQRunCodeResponseOrBuilder getRunCodeResponseOrBuilder() {
                SingleFieldBuilderV3<ConnectIQRunCodeResponse, ConnectIQRunCodeResponse.Builder, ConnectIQRunCodeResponseOrBuilder> singleFieldBuilderV3 = this.runCodeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQRunCodeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectIQRunCodeResponse connectIQRunCodeResponse = this.runCodeResponse_;
                return connectIQRunCodeResponse == null ? ConnectIQRunCodeResponse.getDefaultInstance() : connectIQRunCodeResponse;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public boolean hasConnectIqOauthCompleteRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public boolean hasConnectIqOauthCompleteResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public boolean hasConnectIqOauthRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public boolean hasConnectIqOauthResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public boolean hasPurchaseRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public boolean hasPurchaseResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public boolean hasRunCodeRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.ToystoreProto.ToystoreServiceOrBuilder
            public boolean hasRunCodeResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ToystoreProto.internal_static_GDI_Proto_Toystore_ToystoreService_fieldAccessorTable.ensureFieldAccessorsInitialized(ToystoreService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasConnectIqOauthRequest() && !getConnectIqOauthRequest().isInitialized()) {
                    return false;
                }
                if (hasConnectIqOauthResponse() && !getConnectIqOauthResponse().isInitialized()) {
                    return false;
                }
                if (hasConnectIqOauthCompleteRequest() && !getConnectIqOauthCompleteRequest().isInitialized()) {
                    return false;
                }
                if (!hasConnectIqOauthCompleteResponse() || getConnectIqOauthCompleteResponse().isInitialized()) {
                    return !hasPurchaseRequest() || getPurchaseRequest().isInitialized();
                }
                return false;
            }

            public Builder mergeConnectIqOauthCompleteRequest(GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest) {
                GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest2;
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectIQOAuthCompleteRequest);
                } else if ((this.bitField0_ & 16) == 0 || (connectIQOAuthCompleteRequest2 = this.connectIqOauthCompleteRequest_) == null || connectIQOAuthCompleteRequest2 == GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.getDefaultInstance()) {
                    this.connectIqOauthCompleteRequest_ = connectIQOAuthCompleteRequest;
                } else {
                    getConnectIqOauthCompleteRequestBuilder().mergeFrom(connectIQOAuthCompleteRequest);
                }
                if (this.connectIqOauthCompleteRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectIqOauthCompleteResponse(GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse) {
                GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse2;
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectIQOAuthCompleteResponse);
                } else if ((this.bitField0_ & 32) == 0 || (connectIQOAuthCompleteResponse2 = this.connectIqOauthCompleteResponse_) == null || connectIQOAuthCompleteResponse2 == GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.getDefaultInstance()) {
                    this.connectIqOauthCompleteResponse_ = connectIQOAuthCompleteResponse;
                } else {
                    getConnectIqOauthCompleteResponseBuilder().mergeFrom(connectIQOAuthCompleteResponse);
                }
                if (this.connectIqOauthCompleteResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectIqOauthRequest(GDIConnectIQHTTPProto.ConnectIQOAuthRequest connectIQOAuthRequest) {
                GDIConnectIQHTTPProto.ConnectIQOAuthRequest connectIQOAuthRequest2;
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthRequest, GDIConnectIQHTTPProto.ConnectIQOAuthRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectIQOAuthRequest);
                } else if ((this.bitField0_ & 4) == 0 || (connectIQOAuthRequest2 = this.connectIqOauthRequest_) == null || connectIQOAuthRequest2 == GDIConnectIQHTTPProto.ConnectIQOAuthRequest.getDefaultInstance()) {
                    this.connectIqOauthRequest_ = connectIQOAuthRequest;
                } else {
                    getConnectIqOauthRequestBuilder().mergeFrom(connectIQOAuthRequest);
                }
                if (this.connectIqOauthRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectIqOauthResponse(GDIConnectIQHTTPProto.ConnectIQOAuthResponse connectIQOAuthResponse) {
                GDIConnectIQHTTPProto.ConnectIQOAuthResponse connectIQOAuthResponse2;
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthResponse, GDIConnectIQHTTPProto.ConnectIQOAuthResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectIQOAuthResponse);
                } else if ((this.bitField0_ & 8) == 0 || (connectIQOAuthResponse2 = this.connectIqOauthResponse_) == null || connectIQOAuthResponse2 == GDIConnectIQHTTPProto.ConnectIQOAuthResponse.getDefaultInstance()) {
                    this.connectIqOauthResponse_ = connectIQOAuthResponse;
                } else {
                    getConnectIqOauthResponseBuilder().mergeFrom(connectIQOAuthResponse);
                }
                if (this.connectIqOauthResponse_ != null) {
                    this.bitField0_ |= 8;
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
                                    codedInputStream.readMessage(getRunCodeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getRunCodeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getConnectIqOauthRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getConnectIqOauthResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getConnectIqOauthCompleteRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getConnectIqOauthCompleteResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getPurchaseRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                } else if (tag == 66) {
                                    codedInputStream.readMessage(getPurchaseResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
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

            public Builder mergePurchaseRequest(ConnectIQPurchaseRequest connectIQPurchaseRequest) {
                ConnectIQPurchaseRequest connectIQPurchaseRequest2;
                SingleFieldBuilderV3<ConnectIQPurchaseRequest, ConnectIQPurchaseRequest.Builder, ConnectIQPurchaseRequestOrBuilder> singleFieldBuilderV3 = this.purchaseRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectIQPurchaseRequest);
                } else if ((this.bitField0_ & 64) == 0 || (connectIQPurchaseRequest2 = this.purchaseRequest_) == null || connectIQPurchaseRequest2 == ConnectIQPurchaseRequest.getDefaultInstance()) {
                    this.purchaseRequest_ = connectIQPurchaseRequest;
                } else {
                    getPurchaseRequestBuilder().mergeFrom(connectIQPurchaseRequest);
                }
                if (this.purchaseRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergePurchaseResponse(ConnectIQPurchaseResponse connectIQPurchaseResponse) {
                ConnectIQPurchaseResponse connectIQPurchaseResponse2;
                SingleFieldBuilderV3<ConnectIQPurchaseResponse, ConnectIQPurchaseResponse.Builder, ConnectIQPurchaseResponseOrBuilder> singleFieldBuilderV3 = this.purchaseResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectIQPurchaseResponse);
                } else if ((this.bitField0_ & 128) == 0 || (connectIQPurchaseResponse2 = this.purchaseResponse_) == null || connectIQPurchaseResponse2 == ConnectIQPurchaseResponse.getDefaultInstance()) {
                    this.purchaseResponse_ = connectIQPurchaseResponse;
                } else {
                    getPurchaseResponseBuilder().mergeFrom(connectIQPurchaseResponse);
                }
                if (this.purchaseResponse_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRunCodeRequest(ConnectIQRunCodeRequest connectIQRunCodeRequest) {
                ConnectIQRunCodeRequest connectIQRunCodeRequest2;
                SingleFieldBuilderV3<ConnectIQRunCodeRequest, ConnectIQRunCodeRequest.Builder, ConnectIQRunCodeRequestOrBuilder> singleFieldBuilderV3 = this.runCodeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectIQRunCodeRequest);
                } else if ((this.bitField0_ & 1) == 0 || (connectIQRunCodeRequest2 = this.runCodeRequest_) == null || connectIQRunCodeRequest2 == ConnectIQRunCodeRequest.getDefaultInstance()) {
                    this.runCodeRequest_ = connectIQRunCodeRequest;
                } else {
                    getRunCodeRequestBuilder().mergeFrom(connectIQRunCodeRequest);
                }
                if (this.runCodeRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRunCodeResponse(ConnectIQRunCodeResponse connectIQRunCodeResponse) {
                ConnectIQRunCodeResponse connectIQRunCodeResponse2;
                SingleFieldBuilderV3<ConnectIQRunCodeResponse, ConnectIQRunCodeResponse.Builder, ConnectIQRunCodeResponseOrBuilder> singleFieldBuilderV3 = this.runCodeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectIQRunCodeResponse);
                } else if ((this.bitField0_ & 2) == 0 || (connectIQRunCodeResponse2 = this.runCodeResponse_) == null || connectIQRunCodeResponse2 == ConnectIQRunCodeResponse.getDefaultInstance()) {
                    this.runCodeResponse_ = connectIQRunCodeResponse;
                } else {
                    getRunCodeResponseBuilder().mergeFrom(connectIQRunCodeResponse);
                }
                if (this.runCodeResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setConnectIqOauthCompleteRequest(GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.Builder builder) {
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectIqOauthCompleteRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setConnectIqOauthCompleteResponse(GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.Builder builder) {
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectIqOauthCompleteResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setConnectIqOauthRequest(GDIConnectIQHTTPProto.ConnectIQOAuthRequest.Builder builder) {
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthRequest, GDIConnectIQHTTPProto.ConnectIQOAuthRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectIqOauthRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConnectIqOauthResponse(GDIConnectIQHTTPProto.ConnectIQOAuthResponse.Builder builder) {
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthResponse, GDIConnectIQHTTPProto.ConnectIQOAuthResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectIqOauthResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPurchaseRequest(ConnectIQPurchaseRequest.Builder builder) {
                SingleFieldBuilderV3<ConnectIQPurchaseRequest, ConnectIQPurchaseRequest.Builder, ConnectIQPurchaseRequestOrBuilder> singleFieldBuilderV3 = this.purchaseRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.purchaseRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setPurchaseResponse(ConnectIQPurchaseResponse.Builder builder) {
                SingleFieldBuilderV3<ConnectIQPurchaseResponse, ConnectIQPurchaseResponse.Builder, ConnectIQPurchaseResponseOrBuilder> singleFieldBuilderV3 = this.purchaseResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.purchaseResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRunCodeRequest(ConnectIQRunCodeRequest.Builder builder) {
                SingleFieldBuilderV3<ConnectIQRunCodeRequest, ConnectIQRunCodeRequest.Builder, ConnectIQRunCodeRequestOrBuilder> singleFieldBuilderV3 = this.runCodeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.runCodeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setRunCodeResponse(ConnectIQRunCodeResponse.Builder builder) {
                SingleFieldBuilderV3<ConnectIQRunCodeResponse, ConnectIQRunCodeResponse.Builder, ConnectIQRunCodeResponseOrBuilder> singleFieldBuilderV3 = this.runCodeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.runCodeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ToystoreService getDefaultInstanceForType() {
                return ToystoreService.getDefaultInstance();
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

            public Builder setConnectIqOauthCompleteRequest(GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest) {
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectIQOAuthCompleteRequest.getClass();
                    this.connectIqOauthCompleteRequest_ = connectIQOAuthCompleteRequest;
                } else {
                    singleFieldBuilderV3.setMessage(connectIQOAuthCompleteRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setConnectIqOauthCompleteResponse(GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse) {
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectIQOAuthCompleteResponse.getClass();
                    this.connectIqOauthCompleteResponse_ = connectIQOAuthCompleteResponse;
                } else {
                    singleFieldBuilderV3.setMessage(connectIQOAuthCompleteResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setConnectIqOauthRequest(GDIConnectIQHTTPProto.ConnectIQOAuthRequest connectIQOAuthRequest) {
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthRequest, GDIConnectIQHTTPProto.ConnectIQOAuthRequest.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectIQOAuthRequest.getClass();
                    this.connectIqOauthRequest_ = connectIQOAuthRequest;
                } else {
                    singleFieldBuilderV3.setMessage(connectIQOAuthRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConnectIqOauthResponse(GDIConnectIQHTTPProto.ConnectIQOAuthResponse connectIQOAuthResponse) {
                SingleFieldBuilderV3<GDIConnectIQHTTPProto.ConnectIQOAuthResponse, GDIConnectIQHTTPProto.ConnectIQOAuthResponse.Builder, GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectIQOAuthResponse.getClass();
                    this.connectIqOauthResponse_ = connectIQOAuthResponse;
                } else {
                    singleFieldBuilderV3.setMessage(connectIQOAuthResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPurchaseRequest(ConnectIQPurchaseRequest connectIQPurchaseRequest) {
                SingleFieldBuilderV3<ConnectIQPurchaseRequest, ConnectIQPurchaseRequest.Builder, ConnectIQPurchaseRequestOrBuilder> singleFieldBuilderV3 = this.purchaseRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectIQPurchaseRequest.getClass();
                    this.purchaseRequest_ = connectIQPurchaseRequest;
                } else {
                    singleFieldBuilderV3.setMessage(connectIQPurchaseRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setPurchaseResponse(ConnectIQPurchaseResponse connectIQPurchaseResponse) {
                SingleFieldBuilderV3<ConnectIQPurchaseResponse, ConnectIQPurchaseResponse.Builder, ConnectIQPurchaseResponseOrBuilder> singleFieldBuilderV3 = this.purchaseResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectIQPurchaseResponse.getClass();
                    this.purchaseResponse_ = connectIQPurchaseResponse;
                } else {
                    singleFieldBuilderV3.setMessage(connectIQPurchaseResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setRunCodeRequest(ConnectIQRunCodeRequest connectIQRunCodeRequest) {
                SingleFieldBuilderV3<ConnectIQRunCodeRequest, ConnectIQRunCodeRequest.Builder, ConnectIQRunCodeRequestOrBuilder> singleFieldBuilderV3 = this.runCodeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectIQRunCodeRequest.getClass();
                    this.runCodeRequest_ = connectIQRunCodeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(connectIQRunCodeRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setRunCodeResponse(ConnectIQRunCodeResponse connectIQRunCodeResponse) {
                SingleFieldBuilderV3<ConnectIQRunCodeResponse, ConnectIQRunCodeResponse.Builder, ConnectIQRunCodeResponseOrBuilder> singleFieldBuilderV3 = this.runCodeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectIQRunCodeResponse.getClass();
                    this.runCodeResponse_ = connectIQRunCodeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(connectIQRunCodeResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ToystoreService) {
                    return mergeFrom((ToystoreService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ToystoreService toystoreService) {
                if (toystoreService == ToystoreService.getDefaultInstance()) {
                    return this;
                }
                if (toystoreService.hasRunCodeRequest()) {
                    mergeRunCodeRequest(toystoreService.getRunCodeRequest());
                }
                if (toystoreService.hasRunCodeResponse()) {
                    mergeRunCodeResponse(toystoreService.getRunCodeResponse());
                }
                if (toystoreService.hasConnectIqOauthRequest()) {
                    mergeConnectIqOauthRequest(toystoreService.getConnectIqOauthRequest());
                }
                if (toystoreService.hasConnectIqOauthResponse()) {
                    mergeConnectIqOauthResponse(toystoreService.getConnectIqOauthResponse());
                }
                if (toystoreService.hasConnectIqOauthCompleteRequest()) {
                    mergeConnectIqOauthCompleteRequest(toystoreService.getConnectIqOauthCompleteRequest());
                }
                if (toystoreService.hasConnectIqOauthCompleteResponse()) {
                    mergeConnectIqOauthCompleteResponse(toystoreService.getConnectIqOauthCompleteResponse());
                }
                if (toystoreService.hasPurchaseRequest()) {
                    mergePurchaseRequest(toystoreService.getPurchaseRequest());
                }
                if (toystoreService.hasPurchaseResponse()) {
                    mergePurchaseResponse(toystoreService.getPurchaseResponse());
                }
                mergeUnknownFields(toystoreService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ToystoreService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ToystoreService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ToystoreService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ToystoreService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ToystoreService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ToystoreService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ToystoreService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ToystoreService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ToystoreService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ToystoreService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ToystoreService parseFrom(InputStream inputStream) {
            return (ToystoreService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ToystoreService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ToystoreService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ToystoreService parseFrom(CodedInputStream codedInputStream) {
            return (ToystoreService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ToystoreService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ToystoreService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}

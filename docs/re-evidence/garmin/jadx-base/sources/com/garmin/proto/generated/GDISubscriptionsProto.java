package com.garmin.proto.generated;

import com.garmin.android.apps.connectmobile.f3;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class GDISubscriptionsProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016GDISubscriptions.proto\u0012\u0017GDI.Proto.Subscriptions\"\u009a\u0002\n\u0013SubscriptionService\u0012c\n customerSubscriptionNotification\u0018\u0001 \u0001(\u000b29.GDI.Proto.Subscriptions.CustomerSubscriptionNotification\u0012M\n\u0016feature_status_request\u0018\u0002 \u0001(\u000b2-.GDI.Proto.Subscriptions.FeatureStatusRequest\u0012O\n\u0017feature_status_response\u0018\u0003 \u0001(\u000b2..GDI.Proto.Subscriptions.FeatureStatusResponse\"\"\n CustomerSubscriptionNotification\"\u0016\n\u0014FeatureStatusRequest\"ã\u0001\n\u0015FeatureStatusResponse\u0012D\n\u0007current\u0018\u0001 \u0003(\u000e23.GDI.Proto.Subscriptions.FeatureStatusResponse.Type\u0012F\n\tavailable\u0018\u0002 \u0003(\u000e23.GDI.Proto.Subscriptions.FeatureStatusResponse.Type\"<\n\u0004Type\u0012\u000e\n\nLIVE_TRACK\u0010\u0001\u0012\u0015\n\u0011LIVE_SESSION_VIEW\u0010\u0002\u0012\r\n\tNUTRITION\u0010\u0003B5\n\u001acom.garmin.proto.generatedB\u0015GDISubscriptionsProtoH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Subscriptions_CustomerSubscriptionNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Subscriptions_CustomerSubscriptionNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Subscriptions_FeatureStatusRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Subscriptions_FeatureStatusRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Subscriptions_FeatureStatusResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Subscriptions_FeatureStatusResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Subscriptions_SubscriptionService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Subscriptions_SubscriptionService_fieldAccessorTable;

    public interface CustomerSubscriptionNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface FeatureStatusRequestOrBuilder extends MessageOrBuilder {
    }

    public interface FeatureStatusResponseOrBuilder extends MessageOrBuilder {
        FeatureStatusResponse.Type getAvailable(int i14);

        int getAvailableCount();

        List<FeatureStatusResponse.Type> getAvailableList();

        FeatureStatusResponse.Type getCurrent(int i14);

        int getCurrentCount();

        List<FeatureStatusResponse.Type> getCurrentList();
    }

    public interface SubscriptionServiceOrBuilder extends MessageOrBuilder {
        CustomerSubscriptionNotification getCustomerSubscriptionNotification();

        CustomerSubscriptionNotificationOrBuilder getCustomerSubscriptionNotificationOrBuilder();

        FeatureStatusRequest getFeatureStatusRequest();

        FeatureStatusRequestOrBuilder getFeatureStatusRequestOrBuilder();

        FeatureStatusResponse getFeatureStatusResponse();

        FeatureStatusResponseOrBuilder getFeatureStatusResponseOrBuilder();

        boolean hasCustomerSubscriptionNotification();

        boolean hasFeatureStatusRequest();

        boolean hasFeatureStatusResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_Subscriptions_SubscriptionService_descriptor = descriptor2;
        internal_static_GDI_Proto_Subscriptions_SubscriptionService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"CustomerSubscriptionNotification", "FeatureStatusRequest", "FeatureStatusResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_Subscriptions_CustomerSubscriptionNotification_descriptor = descriptor3;
        internal_static_GDI_Proto_Subscriptions_CustomerSubscriptionNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_Subscriptions_FeatureStatusRequest_descriptor = descriptor4;
        internal_static_GDI_Proto_Subscriptions_FeatureStatusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[0]);
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_Subscriptions_FeatureStatusResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_Subscriptions_FeatureStatusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Current", "Available"});
    }

    private GDISubscriptionsProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class CustomerSubscriptionNotification extends GeneratedMessageV3 implements CustomerSubscriptionNotificationOrBuilder {
        private static final CustomerSubscriptionNotification DEFAULT_INSTANCE = new CustomerSubscriptionNotification();

        @Deprecated
        public static final Parser<CustomerSubscriptionNotification> PARSER = new AbstractParser<CustomerSubscriptionNotification>() { // from class: com.garmin.proto.generated.GDISubscriptionsProto.CustomerSubscriptionNotification.1
            @Override // com.google.protobuf.Parser
            public CustomerSubscriptionNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CustomerSubscriptionNotification.newBuilder();
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

        private CustomerSubscriptionNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CustomerSubscriptionNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_CustomerSubscriptionNotification_descriptor;
        }

        public static Builder newBuilder(CustomerSubscriptionNotification customerSubscriptionNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(customerSubscriptionNotification);
        }

        public static CustomerSubscriptionNotification parseDelimitedFrom(InputStream inputStream) {
            return (CustomerSubscriptionNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CustomerSubscriptionNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CustomerSubscriptionNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CustomerSubscriptionNotification) {
                return getUnknownFields().equals(((CustomerSubscriptionNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CustomerSubscriptionNotification> getParserForType() {
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
            return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_CustomerSubscriptionNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomerSubscriptionNotification.class, Builder.class);
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
            return new CustomerSubscriptionNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CustomerSubscriptionNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_CustomerSubscriptionNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CustomerSubscriptionNotification build() {
                CustomerSubscriptionNotification customerSubscriptionNotificationBuildPartial = buildPartial();
                if (customerSubscriptionNotificationBuildPartial.isInitialized()) {
                    return customerSubscriptionNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) customerSubscriptionNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CustomerSubscriptionNotification buildPartial() {
                CustomerSubscriptionNotification customerSubscriptionNotification = new CustomerSubscriptionNotification(this);
                onBuilt();
                return customerSubscriptionNotification;
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
                return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_CustomerSubscriptionNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_CustomerSubscriptionNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomerSubscriptionNotification.class, Builder.class);
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
            public CustomerSubscriptionNotification getDefaultInstanceForType() {
                return CustomerSubscriptionNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CustomerSubscriptionNotification) {
                    return mergeFrom((CustomerSubscriptionNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CustomerSubscriptionNotification customerSubscriptionNotification) {
                if (customerSubscriptionNotification == CustomerSubscriptionNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(customerSubscriptionNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CustomerSubscriptionNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CustomerSubscriptionNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CustomerSubscriptionNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CustomerSubscriptionNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CustomerSubscriptionNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CustomerSubscriptionNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CustomerSubscriptionNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CustomerSubscriptionNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CustomerSubscriptionNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CustomerSubscriptionNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CustomerSubscriptionNotification parseFrom(InputStream inputStream) {
            return (CustomerSubscriptionNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CustomerSubscriptionNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CustomerSubscriptionNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CustomerSubscriptionNotification parseFrom(CodedInputStream codedInputStream) {
            return (CustomerSubscriptionNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CustomerSubscriptionNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CustomerSubscriptionNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FeatureStatusRequest extends GeneratedMessageV3 implements FeatureStatusRequestOrBuilder {
        private static final FeatureStatusRequest DEFAULT_INSTANCE = new FeatureStatusRequest();

        @Deprecated
        public static final Parser<FeatureStatusRequest> PARSER = new AbstractParser<FeatureStatusRequest>() { // from class: com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusRequest.1
            @Override // com.google.protobuf.Parser
            public FeatureStatusRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FeatureStatusRequest.newBuilder();
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

        private FeatureStatusRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FeatureStatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_FeatureStatusRequest_descriptor;
        }

        public static Builder newBuilder(FeatureStatusRequest featureStatusRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(featureStatusRequest);
        }

        public static FeatureStatusRequest parseDelimitedFrom(InputStream inputStream) {
            return (FeatureStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FeatureStatusRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FeatureStatusRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof FeatureStatusRequest) {
                return getUnknownFields().equals(((FeatureStatusRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FeatureStatusRequest> getParserForType() {
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
            return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_FeatureStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FeatureStatusRequest.class, Builder.class);
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
            return new FeatureStatusRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FeatureStatusRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_FeatureStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FeatureStatusRequest build() {
                FeatureStatusRequest featureStatusRequestBuildPartial = buildPartial();
                if (featureStatusRequestBuildPartial.isInitialized()) {
                    return featureStatusRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) featureStatusRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FeatureStatusRequest buildPartial() {
                FeatureStatusRequest featureStatusRequest = new FeatureStatusRequest(this);
                onBuilt();
                return featureStatusRequest;
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
                return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_FeatureStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_FeatureStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FeatureStatusRequest.class, Builder.class);
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
            public FeatureStatusRequest getDefaultInstanceForType() {
                return FeatureStatusRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FeatureStatusRequest) {
                    return mergeFrom((FeatureStatusRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FeatureStatusRequest featureStatusRequest) {
                if (featureStatusRequest == FeatureStatusRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(featureStatusRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FeatureStatusRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ FeatureStatusRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private FeatureStatusRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FeatureStatusRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FeatureStatusRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FeatureStatusRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FeatureStatusRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FeatureStatusRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FeatureStatusRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FeatureStatusRequest parseFrom(InputStream inputStream) {
            return (FeatureStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FeatureStatusRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FeatureStatusRequest parseFrom(CodedInputStream codedInputStream) {
            return (FeatureStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FeatureStatusRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FeatureStatusResponse extends GeneratedMessageV3 implements FeatureStatusResponseOrBuilder {
        public static final int AVAILABLE_FIELD_NUMBER = 2;
        public static final int CURRENT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Integer> available_;
        private List<Integer> current_;
        private byte memoizedIsInitialized;
        private static final Internal.ListAdapter.Converter<Integer, Type> current_converter_ = new Internal.ListAdapter.Converter<Integer, Type>() { // from class: com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusResponse.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public Type convert(Integer num) {
                Type typeForNumber = Type.forNumber(num.intValue());
                return typeForNumber == null ? Type.LIVE_TRACK : typeForNumber;
            }
        };
        private static final Internal.ListAdapter.Converter<Integer, Type> available_converter_ = new Internal.ListAdapter.Converter<Integer, Type>() { // from class: com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusResponse.2
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public Type convert(Integer num) {
                Type typeForNumber = Type.forNumber(num.intValue());
                return typeForNumber == null ? Type.LIVE_TRACK : typeForNumber;
            }
        };
        private static final FeatureStatusResponse DEFAULT_INSTANCE = new FeatureStatusResponse();

        @Deprecated
        public static final Parser<FeatureStatusResponse> PARSER = new AbstractParser<FeatureStatusResponse>() { // from class: com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusResponse.3
            @Override // com.google.protobuf.Parser
            public FeatureStatusResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FeatureStatusResponse.newBuilder();
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

        private FeatureStatusResponse() {
            this.memoizedIsInitialized = (byte) -1;
            List<Integer> list = Collections.EMPTY_LIST;
            this.current_ = list;
            this.available_ = list;
        }

        public static FeatureStatusResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_FeatureStatusResponse_descriptor;
        }

        public static Builder newBuilder(FeatureStatusResponse featureStatusResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(featureStatusResponse);
        }

        public static FeatureStatusResponse parseDelimitedFrom(InputStream inputStream) {
            return (FeatureStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FeatureStatusResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FeatureStatusResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FeatureStatusResponse)) {
                return super.equals(obj);
            }
            FeatureStatusResponse featureStatusResponse = (FeatureStatusResponse) obj;
            return this.current_.equals(featureStatusResponse.current_) && this.available_.equals(featureStatusResponse.available_) && getUnknownFields().equals(featureStatusResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusResponseOrBuilder
        public Type getAvailable(int i14) {
            return available_converter_.convert(this.available_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusResponseOrBuilder
        public int getAvailableCount() {
            return this.available_.size();
        }

        @Override // com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusResponseOrBuilder
        public List<Type> getAvailableList() {
            return new Internal.ListAdapter(this.available_, available_converter_);
        }

        @Override // com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusResponseOrBuilder
        public Type getCurrent(int i14) {
            return current_converter_.convert(this.current_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusResponseOrBuilder
        public int getCurrentCount() {
            return this.current_.size();
        }

        @Override // com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusResponseOrBuilder
        public List<Type> getCurrentList() {
            return new Internal.ListAdapter(this.current_, current_converter_);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FeatureStatusResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            List<Integer> list;
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int i16 = 0;
            int iA = 0;
            while (true) {
                int size = this.current_.size();
                list = this.current_;
                if (i16 >= size) {
                    break;
                }
                iA = f3.a(iA, list.get(i16));
                i16++;
            }
            int size2 = list.size() + iA;
            int iA2 = 0;
            while (true) {
                int size3 = this.available_.size();
                List<Integer> list2 = this.available_;
                if (i15 >= size3) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list2.size() + size2 + iA2;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA2 = f3.a(iA2, list2.get(i15));
                i15++;
            }
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getCurrentCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.current_.hashCode();
            }
            if (getAvailableCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.available_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_FeatureStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FeatureStatusResponse.class, Builder.class);
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
            return new FeatureStatusResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iF = 0;
            int iF2 = 0;
            while (iF2 < this.current_.size()) {
                iF2 = f3.f(this.current_.get(iF2), codedOutputStream, 1, iF2, 1);
            }
            while (iF < this.available_.size()) {
                iF = f3.f(this.available_.get(iF), codedOutputStream, 2, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FeatureStatusResponseOrBuilder {
            private List<Integer> available_;
            private int bitField0_;
            private List<Integer> current_;

            private Builder() {
                List<Integer> list = Collections.EMPTY_LIST;
                this.current_ = list;
                this.available_ = list;
            }

            private void buildPartial0(FeatureStatusResponse featureStatusResponse) {
            }

            private void buildPartialRepeatedFields(FeatureStatusResponse featureStatusResponse) {
                if ((this.bitField0_ & 1) != 0) {
                    this.current_ = Collections.unmodifiableList(this.current_);
                    this.bitField0_ &= -2;
                }
                featureStatusResponse.current_ = this.current_;
                if ((this.bitField0_ & 2) != 0) {
                    this.available_ = Collections.unmodifiableList(this.available_);
                    this.bitField0_ &= -3;
                }
                featureStatusResponse.available_ = this.available_;
            }

            private void ensureAvailableIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.available_ = new ArrayList(this.available_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureCurrentIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.current_ = new ArrayList(this.current_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_FeatureStatusResponse_descriptor;
            }

            public Builder addAllAvailable(Iterable<? extends Type> iterable) {
                ensureAvailableIsMutable();
                Iterator<? extends Type> it = iterable.iterator();
                while (it.hasNext()) {
                    this.available_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllCurrent(Iterable<? extends Type> iterable) {
                ensureCurrentIsMutable();
                Iterator<? extends Type> it = iterable.iterator();
                while (it.hasNext()) {
                    this.current_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAvailable(Type type) {
                type.getClass();
                ensureAvailableIsMutable();
                this.available_.add(Integer.valueOf(type.getNumber()));
                onChanged();
                return this;
            }

            public Builder addCurrent(Type type) {
                type.getClass();
                ensureCurrentIsMutable();
                this.current_.add(Integer.valueOf(type.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FeatureStatusResponse build() {
                FeatureStatusResponse featureStatusResponseBuildPartial = buildPartial();
                if (featureStatusResponseBuildPartial.isInitialized()) {
                    return featureStatusResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) featureStatusResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FeatureStatusResponse buildPartial() {
                FeatureStatusResponse featureStatusResponse = new FeatureStatusResponse(this);
                buildPartialRepeatedFields(featureStatusResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(featureStatusResponse);
                }
                onBuilt();
                return featureStatusResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                List<Integer> list = Collections.EMPTY_LIST;
                this.current_ = list;
                this.available_ = list;
                this.bitField0_ = 0;
                return this;
            }

            public Builder clearAvailable() {
                this.available_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearCurrent() {
                this.current_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
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

            @Override // com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusResponseOrBuilder
            public Type getAvailable(int i14) {
                return (Type) FeatureStatusResponse.available_converter_.convert(this.available_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusResponseOrBuilder
            public int getAvailableCount() {
                return this.available_.size();
            }

            @Override // com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusResponseOrBuilder
            public List<Type> getAvailableList() {
                return new Internal.ListAdapter(this.available_, FeatureStatusResponse.available_converter_);
            }

            @Override // com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusResponseOrBuilder
            public Type getCurrent(int i14) {
                return (Type) FeatureStatusResponse.current_converter_.convert(this.current_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusResponseOrBuilder
            public int getCurrentCount() {
                return this.current_.size();
            }

            @Override // com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusResponseOrBuilder
            public List<Type> getCurrentList() {
                return new Internal.ListAdapter(this.current_, FeatureStatusResponse.current_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_FeatureStatusResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_FeatureStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FeatureStatusResponse.class, Builder.class);
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
                                    if (Type.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureCurrentIsMutable();
                                        this.current_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (Type.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureCurrentIsMutable();
                                            this.current_.add(Integer.valueOf(i15));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 16) {
                                    int i16 = codedInputStream.readEnum();
                                    if (Type.forNumber(i16) == null) {
                                        mergeUnknownVarintField(2, i16);
                                    } else {
                                        ensureAvailableIsMutable();
                                        this.available_.add(Integer.valueOf(i16));
                                    }
                                } else if (tag == 18) {
                                    int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i17 = codedInputStream.readEnum();
                                        if (Type.forNumber(i17) == null) {
                                            mergeUnknownVarintField(2, i17);
                                        } else {
                                            ensureAvailableIsMutable();
                                            this.available_.add(Integer.valueOf(i17));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit2);
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

            public Builder setAvailable(int i14, Type type) {
                type.getClass();
                ensureAvailableIsMutable();
                this.available_.set(i14, Integer.valueOf(type.getNumber()));
                onChanged();
                return this;
            }

            public Builder setCurrent(int i14, Type type) {
                type.getClass();
                ensureCurrentIsMutable();
                this.current_.set(i14, Integer.valueOf(type.getNumber()));
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

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FeatureStatusResponse getDefaultInstanceForType() {
                return FeatureStatusResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                List<Integer> list = Collections.EMPTY_LIST;
                this.current_ = list;
                this.available_ = list;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FeatureStatusResponse) {
                    return mergeFrom((FeatureStatusResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FeatureStatusResponse featureStatusResponse) {
                if (featureStatusResponse == FeatureStatusResponse.getDefaultInstance()) {
                    return this;
                }
                if (!featureStatusResponse.current_.isEmpty()) {
                    if (this.current_.isEmpty()) {
                        this.current_ = featureStatusResponse.current_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureCurrentIsMutable();
                        this.current_.addAll(featureStatusResponse.current_);
                    }
                    onChanged();
                }
                if (!featureStatusResponse.available_.isEmpty()) {
                    if (this.available_.isEmpty()) {
                        this.available_ = featureStatusResponse.available_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureAvailableIsMutable();
                        this.available_.addAll(featureStatusResponse.available_);
                    }
                    onChanged();
                }
                mergeUnknownFields(featureStatusResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FeatureStatusResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FeatureStatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FeatureStatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FeatureStatusResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FeatureStatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FeatureStatusResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private FeatureStatusResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FeatureStatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FeatureStatusResponse parseFrom(InputStream inputStream) {
            return (FeatureStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ FeatureStatusResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static FeatureStatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FeatureStatusResponse parseFrom(CodedInputStream codedInputStream) {
            return (FeatureStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FeatureStatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Type implements ProtocolMessageEnum {
            LIVE_TRACK(1),
            LIVE_SESSION_VIEW(2),
            NUTRITION(3);

            public static final int LIVE_SESSION_VIEW_VALUE = 2;
            public static final int LIVE_TRACK_VALUE = 1;
            public static final int NUTRITION_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.garmin.proto.generated.GDISubscriptionsProto.FeatureStatusResponse.Type.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Type findValueByNumber(int i14) {
                    return Type.forNumber(i14);
                }
            };
            private static final Type[] VALUES = values();

            Type(int i14) {
                this.value = i14;
            }

            public static Type forNumber(int i14) {
                if (i14 == 1) {
                    return LIVE_TRACK;
                }
                if (i14 == 2) {
                    return LIVE_SESSION_VIEW;
                }
                if (i14 != 3) {
                    return null;
                }
                return NUTRITION;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return FeatureStatusResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
                return internalValueMap;
            }

            public static Type valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Type valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class SubscriptionService extends GeneratedMessageV3 implements SubscriptionServiceOrBuilder {
        public static final int CUSTOMERSUBSCRIPTIONNOTIFICATION_FIELD_NUMBER = 1;
        public static final int FEATURE_STATUS_REQUEST_FIELD_NUMBER = 2;
        public static final int FEATURE_STATUS_RESPONSE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CustomerSubscriptionNotification customerSubscriptionNotification_;
        private FeatureStatusRequest featureStatusRequest_;
        private FeatureStatusResponse featureStatusResponse_;
        private byte memoizedIsInitialized;
        private static final SubscriptionService DEFAULT_INSTANCE = new SubscriptionService();

        @Deprecated
        public static final Parser<SubscriptionService> PARSER = new AbstractParser<SubscriptionService>() { // from class: com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionService.1
            @Override // com.google.protobuf.Parser
            public SubscriptionService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SubscriptionService.newBuilder();
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

        private SubscriptionService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SubscriptionService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_SubscriptionService_descriptor;
        }

        public static Builder newBuilder(SubscriptionService subscriptionService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(subscriptionService);
        }

        public static SubscriptionService parseDelimitedFrom(InputStream inputStream) {
            return (SubscriptionService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SubscriptionService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SubscriptionService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SubscriptionService)) {
                return super.equals(obj);
            }
            SubscriptionService subscriptionService = (SubscriptionService) obj;
            if (hasCustomerSubscriptionNotification() != subscriptionService.hasCustomerSubscriptionNotification()) {
                return false;
            }
            if ((hasCustomerSubscriptionNotification() && !getCustomerSubscriptionNotification().equals(subscriptionService.getCustomerSubscriptionNotification())) || hasFeatureStatusRequest() != subscriptionService.hasFeatureStatusRequest()) {
                return false;
            }
            if ((!hasFeatureStatusRequest() || getFeatureStatusRequest().equals(subscriptionService.getFeatureStatusRequest())) && hasFeatureStatusResponse() == subscriptionService.hasFeatureStatusResponse()) {
                return (!hasFeatureStatusResponse() || getFeatureStatusResponse().equals(subscriptionService.getFeatureStatusResponse())) && getUnknownFields().equals(subscriptionService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
        public CustomerSubscriptionNotification getCustomerSubscriptionNotification() {
            CustomerSubscriptionNotification customerSubscriptionNotification = this.customerSubscriptionNotification_;
            return customerSubscriptionNotification == null ? CustomerSubscriptionNotification.getDefaultInstance() : customerSubscriptionNotification;
        }

        @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
        public CustomerSubscriptionNotificationOrBuilder getCustomerSubscriptionNotificationOrBuilder() {
            CustomerSubscriptionNotification customerSubscriptionNotification = this.customerSubscriptionNotification_;
            return customerSubscriptionNotification == null ? CustomerSubscriptionNotification.getDefaultInstance() : customerSubscriptionNotification;
        }

        @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
        public FeatureStatusRequest getFeatureStatusRequest() {
            FeatureStatusRequest featureStatusRequest = this.featureStatusRequest_;
            return featureStatusRequest == null ? FeatureStatusRequest.getDefaultInstance() : featureStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
        public FeatureStatusRequestOrBuilder getFeatureStatusRequestOrBuilder() {
            FeatureStatusRequest featureStatusRequest = this.featureStatusRequest_;
            return featureStatusRequest == null ? FeatureStatusRequest.getDefaultInstance() : featureStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
        public FeatureStatusResponse getFeatureStatusResponse() {
            FeatureStatusResponse featureStatusResponse = this.featureStatusResponse_;
            return featureStatusResponse == null ? FeatureStatusResponse.getDefaultInstance() : featureStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
        public FeatureStatusResponseOrBuilder getFeatureStatusResponseOrBuilder() {
            FeatureStatusResponse featureStatusResponse = this.featureStatusResponse_;
            return featureStatusResponse == null ? FeatureStatusResponse.getDefaultInstance() : featureStatusResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SubscriptionService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCustomerSubscriptionNotification()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getFeatureStatusRequest());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getFeatureStatusResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
        public boolean hasCustomerSubscriptionNotification() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
        public boolean hasFeatureStatusRequest() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
        public boolean hasFeatureStatusResponse() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCustomerSubscriptionNotification()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCustomerSubscriptionNotification().hashCode();
            }
            if (hasFeatureStatusRequest()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getFeatureStatusRequest().hashCode();
            }
            if (hasFeatureStatusResponse()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getFeatureStatusResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_SubscriptionService_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscriptionService.class, Builder.class);
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
            return new SubscriptionService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getCustomerSubscriptionNotification());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getFeatureStatusRequest());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getFeatureStatusResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SubscriptionServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CustomerSubscriptionNotification, CustomerSubscriptionNotification.Builder, CustomerSubscriptionNotificationOrBuilder> customerSubscriptionNotificationBuilder_;
            private CustomerSubscriptionNotification customerSubscriptionNotification_;
            private SingleFieldBuilderV3<FeatureStatusRequest, FeatureStatusRequest.Builder, FeatureStatusRequestOrBuilder> featureStatusRequestBuilder_;
            private FeatureStatusRequest featureStatusRequest_;
            private SingleFieldBuilderV3<FeatureStatusResponse, FeatureStatusResponse.Builder, FeatureStatusResponseOrBuilder> featureStatusResponseBuilder_;
            private FeatureStatusResponse featureStatusResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SubscriptionService subscriptionService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<CustomerSubscriptionNotification, CustomerSubscriptionNotification.Builder, CustomerSubscriptionNotificationOrBuilder> singleFieldBuilderV3 = this.customerSubscriptionNotificationBuilder_;
                    subscriptionService.customerSubscriptionNotification_ = singleFieldBuilderV3 == null ? this.customerSubscriptionNotification_ : (CustomerSubscriptionNotification) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<FeatureStatusRequest, FeatureStatusRequest.Builder, FeatureStatusRequestOrBuilder> singleFieldBuilderV4 = this.featureStatusRequestBuilder_;
                    subscriptionService.featureStatusRequest_ = singleFieldBuilderV4 == null ? this.featureStatusRequest_ : (FeatureStatusRequest) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<FeatureStatusResponse, FeatureStatusResponse.Builder, FeatureStatusResponseOrBuilder> singleFieldBuilderV5 = this.featureStatusResponseBuilder_;
                    subscriptionService.featureStatusResponse_ = singleFieldBuilderV5 == null ? this.featureStatusResponse_ : (FeatureStatusResponse) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                subscriptionService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<CustomerSubscriptionNotification, CustomerSubscriptionNotification.Builder, CustomerSubscriptionNotificationOrBuilder> getCustomerSubscriptionNotificationFieldBuilder() {
                if (this.customerSubscriptionNotificationBuilder_ == null) {
                    this.customerSubscriptionNotificationBuilder_ = new SingleFieldBuilderV3<>(getCustomerSubscriptionNotification(), getParentForChildren(), isClean());
                    this.customerSubscriptionNotification_ = null;
                }
                return this.customerSubscriptionNotificationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_SubscriptionService_descriptor;
            }

            private SingleFieldBuilderV3<FeatureStatusRequest, FeatureStatusRequest.Builder, FeatureStatusRequestOrBuilder> getFeatureStatusRequestFieldBuilder() {
                if (this.featureStatusRequestBuilder_ == null) {
                    this.featureStatusRequestBuilder_ = new SingleFieldBuilderV3<>(getFeatureStatusRequest(), getParentForChildren(), isClean());
                    this.featureStatusRequest_ = null;
                }
                return this.featureStatusRequestBuilder_;
            }

            private SingleFieldBuilderV3<FeatureStatusResponse, FeatureStatusResponse.Builder, FeatureStatusResponseOrBuilder> getFeatureStatusResponseFieldBuilder() {
                if (this.featureStatusResponseBuilder_ == null) {
                    this.featureStatusResponseBuilder_ = new SingleFieldBuilderV3<>(getFeatureStatusResponse(), getParentForChildren(), isClean());
                    this.featureStatusResponse_ = null;
                }
                return this.featureStatusResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCustomerSubscriptionNotificationFieldBuilder();
                    getFeatureStatusRequestFieldBuilder();
                    getFeatureStatusResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SubscriptionService build() {
                SubscriptionService subscriptionServiceBuildPartial = buildPartial();
                if (subscriptionServiceBuildPartial.isInitialized()) {
                    return subscriptionServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) subscriptionServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SubscriptionService buildPartial() {
                SubscriptionService subscriptionService = new SubscriptionService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(subscriptionService);
                }
                onBuilt();
                return subscriptionService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.customerSubscriptionNotification_ = null;
                SingleFieldBuilderV3<CustomerSubscriptionNotification, CustomerSubscriptionNotification.Builder, CustomerSubscriptionNotificationOrBuilder> singleFieldBuilderV3 = this.customerSubscriptionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.customerSubscriptionNotificationBuilder_ = null;
                }
                this.featureStatusRequest_ = null;
                SingleFieldBuilderV3<FeatureStatusRequest, FeatureStatusRequest.Builder, FeatureStatusRequestOrBuilder> singleFieldBuilderV4 = this.featureStatusRequestBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.featureStatusRequestBuilder_ = null;
                }
                this.featureStatusResponse_ = null;
                SingleFieldBuilderV3<FeatureStatusResponse, FeatureStatusResponse.Builder, FeatureStatusResponseOrBuilder> singleFieldBuilderV5 = this.featureStatusResponseBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.featureStatusResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearCustomerSubscriptionNotification() {
                this.bitField0_ &= -2;
                this.customerSubscriptionNotification_ = null;
                SingleFieldBuilderV3<CustomerSubscriptionNotification, CustomerSubscriptionNotification.Builder, CustomerSubscriptionNotificationOrBuilder> singleFieldBuilderV3 = this.customerSubscriptionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.customerSubscriptionNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFeatureStatusRequest() {
                this.bitField0_ &= -3;
                this.featureStatusRequest_ = null;
                SingleFieldBuilderV3<FeatureStatusRequest, FeatureStatusRequest.Builder, FeatureStatusRequestOrBuilder> singleFieldBuilderV3 = this.featureStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.featureStatusRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFeatureStatusResponse() {
                this.bitField0_ &= -5;
                this.featureStatusResponse_ = null;
                SingleFieldBuilderV3<FeatureStatusResponse, FeatureStatusResponse.Builder, FeatureStatusResponseOrBuilder> singleFieldBuilderV3 = this.featureStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.featureStatusResponseBuilder_ = null;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
            public CustomerSubscriptionNotification getCustomerSubscriptionNotification() {
                SingleFieldBuilderV3<CustomerSubscriptionNotification, CustomerSubscriptionNotification.Builder, CustomerSubscriptionNotificationOrBuilder> singleFieldBuilderV3 = this.customerSubscriptionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CustomerSubscriptionNotification) singleFieldBuilderV3.getMessage();
                }
                CustomerSubscriptionNotification customerSubscriptionNotification = this.customerSubscriptionNotification_;
                return customerSubscriptionNotification == null ? CustomerSubscriptionNotification.getDefaultInstance() : customerSubscriptionNotification;
            }

            public CustomerSubscriptionNotification.Builder getCustomerSubscriptionNotificationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (CustomerSubscriptionNotification.Builder) getCustomerSubscriptionNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
            public CustomerSubscriptionNotificationOrBuilder getCustomerSubscriptionNotificationOrBuilder() {
                SingleFieldBuilderV3<CustomerSubscriptionNotification, CustomerSubscriptionNotification.Builder, CustomerSubscriptionNotificationOrBuilder> singleFieldBuilderV3 = this.customerSubscriptionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CustomerSubscriptionNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CustomerSubscriptionNotification customerSubscriptionNotification = this.customerSubscriptionNotification_;
                return customerSubscriptionNotification == null ? CustomerSubscriptionNotification.getDefaultInstance() : customerSubscriptionNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_SubscriptionService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
            public FeatureStatusRequest getFeatureStatusRequest() {
                SingleFieldBuilderV3<FeatureStatusRequest, FeatureStatusRequest.Builder, FeatureStatusRequestOrBuilder> singleFieldBuilderV3 = this.featureStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FeatureStatusRequest) singleFieldBuilderV3.getMessage();
                }
                FeatureStatusRequest featureStatusRequest = this.featureStatusRequest_;
                return featureStatusRequest == null ? FeatureStatusRequest.getDefaultInstance() : featureStatusRequest;
            }

            public FeatureStatusRequest.Builder getFeatureStatusRequestBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (FeatureStatusRequest.Builder) getFeatureStatusRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
            public FeatureStatusRequestOrBuilder getFeatureStatusRequestOrBuilder() {
                SingleFieldBuilderV3<FeatureStatusRequest, FeatureStatusRequest.Builder, FeatureStatusRequestOrBuilder> singleFieldBuilderV3 = this.featureStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FeatureStatusRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FeatureStatusRequest featureStatusRequest = this.featureStatusRequest_;
                return featureStatusRequest == null ? FeatureStatusRequest.getDefaultInstance() : featureStatusRequest;
            }

            @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
            public FeatureStatusResponse getFeatureStatusResponse() {
                SingleFieldBuilderV3<FeatureStatusResponse, FeatureStatusResponse.Builder, FeatureStatusResponseOrBuilder> singleFieldBuilderV3 = this.featureStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FeatureStatusResponse) singleFieldBuilderV3.getMessage();
                }
                FeatureStatusResponse featureStatusResponse = this.featureStatusResponse_;
                return featureStatusResponse == null ? FeatureStatusResponse.getDefaultInstance() : featureStatusResponse;
            }

            public FeatureStatusResponse.Builder getFeatureStatusResponseBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (FeatureStatusResponse.Builder) getFeatureStatusResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
            public FeatureStatusResponseOrBuilder getFeatureStatusResponseOrBuilder() {
                SingleFieldBuilderV3<FeatureStatusResponse, FeatureStatusResponse.Builder, FeatureStatusResponseOrBuilder> singleFieldBuilderV3 = this.featureStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FeatureStatusResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FeatureStatusResponse featureStatusResponse = this.featureStatusResponse_;
                return featureStatusResponse == null ? FeatureStatusResponse.getDefaultInstance() : featureStatusResponse;
            }

            @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
            public boolean hasCustomerSubscriptionNotification() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
            public boolean hasFeatureStatusRequest() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDISubscriptionsProto.SubscriptionServiceOrBuilder
            public boolean hasFeatureStatusResponse() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISubscriptionsProto.internal_static_GDI_Proto_Subscriptions_SubscriptionService_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscriptionService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCustomerSubscriptionNotification(CustomerSubscriptionNotification customerSubscriptionNotification) {
                CustomerSubscriptionNotification customerSubscriptionNotification2;
                SingleFieldBuilderV3<CustomerSubscriptionNotification, CustomerSubscriptionNotification.Builder, CustomerSubscriptionNotificationOrBuilder> singleFieldBuilderV3 = this.customerSubscriptionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(customerSubscriptionNotification);
                } else if ((this.bitField0_ & 1) == 0 || (customerSubscriptionNotification2 = this.customerSubscriptionNotification_) == null || customerSubscriptionNotification2 == CustomerSubscriptionNotification.getDefaultInstance()) {
                    this.customerSubscriptionNotification_ = customerSubscriptionNotification;
                } else {
                    getCustomerSubscriptionNotificationBuilder().mergeFrom(customerSubscriptionNotification);
                }
                if (this.customerSubscriptionNotification_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFeatureStatusRequest(FeatureStatusRequest featureStatusRequest) {
                FeatureStatusRequest featureStatusRequest2;
                SingleFieldBuilderV3<FeatureStatusRequest, FeatureStatusRequest.Builder, FeatureStatusRequestOrBuilder> singleFieldBuilderV3 = this.featureStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(featureStatusRequest);
                } else if ((this.bitField0_ & 2) == 0 || (featureStatusRequest2 = this.featureStatusRequest_) == null || featureStatusRequest2 == FeatureStatusRequest.getDefaultInstance()) {
                    this.featureStatusRequest_ = featureStatusRequest;
                } else {
                    getFeatureStatusRequestBuilder().mergeFrom(featureStatusRequest);
                }
                if (this.featureStatusRequest_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFeatureStatusResponse(FeatureStatusResponse featureStatusResponse) {
                FeatureStatusResponse featureStatusResponse2;
                SingleFieldBuilderV3<FeatureStatusResponse, FeatureStatusResponse.Builder, FeatureStatusResponseOrBuilder> singleFieldBuilderV3 = this.featureStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(featureStatusResponse);
                } else if ((this.bitField0_ & 4) == 0 || (featureStatusResponse2 = this.featureStatusResponse_) == null || featureStatusResponse2 == FeatureStatusResponse.getDefaultInstance()) {
                    this.featureStatusResponse_ = featureStatusResponse;
                } else {
                    getFeatureStatusResponseBuilder().mergeFrom(featureStatusResponse);
                }
                if (this.featureStatusResponse_ != null) {
                    this.bitField0_ |= 4;
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
                                    codedInputStream.readMessage(getCustomerSubscriptionNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getFeatureStatusRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getFeatureStatusResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
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

            public Builder setCustomerSubscriptionNotification(CustomerSubscriptionNotification.Builder builder) {
                SingleFieldBuilderV3<CustomerSubscriptionNotification, CustomerSubscriptionNotification.Builder, CustomerSubscriptionNotificationOrBuilder> singleFieldBuilderV3 = this.customerSubscriptionNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.customerSubscriptionNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setFeatureStatusRequest(FeatureStatusRequest.Builder builder) {
                SingleFieldBuilderV3<FeatureStatusRequest, FeatureStatusRequest.Builder, FeatureStatusRequestOrBuilder> singleFieldBuilderV3 = this.featureStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.featureStatusRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFeatureStatusResponse(FeatureStatusResponse.Builder builder) {
                SingleFieldBuilderV3<FeatureStatusResponse, FeatureStatusResponse.Builder, FeatureStatusResponseOrBuilder> singleFieldBuilderV3 = this.featureStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.featureStatusResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
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

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SubscriptionService getDefaultInstanceForType() {
                return SubscriptionService.getDefaultInstance();
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

            public Builder setCustomerSubscriptionNotification(CustomerSubscriptionNotification customerSubscriptionNotification) {
                SingleFieldBuilderV3<CustomerSubscriptionNotification, CustomerSubscriptionNotification.Builder, CustomerSubscriptionNotificationOrBuilder> singleFieldBuilderV3 = this.customerSubscriptionNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    customerSubscriptionNotification.getClass();
                    this.customerSubscriptionNotification_ = customerSubscriptionNotification;
                } else {
                    singleFieldBuilderV3.setMessage(customerSubscriptionNotification);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setFeatureStatusRequest(FeatureStatusRequest featureStatusRequest) {
                SingleFieldBuilderV3<FeatureStatusRequest, FeatureStatusRequest.Builder, FeatureStatusRequestOrBuilder> singleFieldBuilderV3 = this.featureStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    featureStatusRequest.getClass();
                    this.featureStatusRequest_ = featureStatusRequest;
                } else {
                    singleFieldBuilderV3.setMessage(featureStatusRequest);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFeatureStatusResponse(FeatureStatusResponse featureStatusResponse) {
                SingleFieldBuilderV3<FeatureStatusResponse, FeatureStatusResponse.Builder, FeatureStatusResponseOrBuilder> singleFieldBuilderV3 = this.featureStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    featureStatusResponse.getClass();
                    this.featureStatusResponse_ = featureStatusResponse;
                } else {
                    singleFieldBuilderV3.setMessage(featureStatusResponse);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SubscriptionService) {
                    return mergeFrom((SubscriptionService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SubscriptionService subscriptionService) {
                if (subscriptionService == SubscriptionService.getDefaultInstance()) {
                    return this;
                }
                if (subscriptionService.hasCustomerSubscriptionNotification()) {
                    mergeCustomerSubscriptionNotification(subscriptionService.getCustomerSubscriptionNotification());
                }
                if (subscriptionService.hasFeatureStatusRequest()) {
                    mergeFeatureStatusRequest(subscriptionService.getFeatureStatusRequest());
                }
                if (subscriptionService.hasFeatureStatusResponse()) {
                    mergeFeatureStatusResponse(subscriptionService.getFeatureStatusResponse());
                }
                mergeUnknownFields(subscriptionService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SubscriptionService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SubscriptionService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SubscriptionService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SubscriptionService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscriptionService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SubscriptionService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SubscriptionService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SubscriptionService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SubscriptionService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SubscriptionService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SubscriptionService parseFrom(InputStream inputStream) {
            return (SubscriptionService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SubscriptionService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscriptionService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SubscriptionService parseFrom(CodedInputStream codedInputStream) {
            return (SubscriptionService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SubscriptionService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscriptionService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}

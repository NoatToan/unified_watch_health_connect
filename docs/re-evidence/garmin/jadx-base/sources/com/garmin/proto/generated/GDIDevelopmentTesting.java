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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIDevelopmentTesting {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001bGDIDevelopmentTesting.proto\u0012\u001cGDI.Proto.DevelopmentTesting\u001a\u0015GDIEventSharing.proto\"Ø\u0001\n\u0007Service\u0012?\n\ftest_request\u0018\u0001 \u0001(\u000b2).GDI.Proto.DevelopmentTesting.TestRequest\u0012A\n\rtest_response\u0018\u0002 \u0001(\u000b2*.GDI.Proto.DevelopmentTesting.TestResponse\u0012I\n\u0011test_notification\u0018\u0003 \u0001(\u000b2..GDI.Proto.DevelopmentTesting.TestNotification\";\n\u000bTestRequest\u0012\u0011\n\ttest_data\u0018\u0001 \u0001(\f\u0012\u0019\n\u0011timestamp_sent_ms\u0018\u0002 \u0001(\u0007\"<\n\fTestResponse\u0012\u0011\n\ttest_data\u0018\u0001 \u0001(\f\u0012\u0019\n\u0011timestamp_sent_ms\u0018\u0002 \u0001(\u0007\"@\n\u0010TestNotification\u0012\u0011\n\ttest_data\u0018\u0001 \u0001(\f\u0012\u0019\n\u0011timestamp_sent_ms\u0018\u0002 \u0001(\u0007\"¥\u0001\n\fAlertDetails\u0012\u0011\n\ttest_data\u0018\u0001 \u0001(\f\u0012\u0019\n\u0011timestamp_sent_ms\u0018\u0002 \u0001(\u00072g\n\u0007details\u0012).GDI.Proto.EventSharing.AlertNotification\u0018ú\u0007 \u0001(\u000b2*.GDI.Proto.DevelopmentTesting.AlertDetailsB5\n\u001acom.garmin.proto.generatedB\u0015GDIDevelopmentTestingH\u0003"}, new Descriptors.FileDescriptor[]{GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DevelopmentTesting_AlertDetails_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DevelopmentTesting_AlertDetails_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DevelopmentTesting_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DevelopmentTesting_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DevelopmentTesting_TestNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DevelopmentTesting_TestNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DevelopmentTesting_TestRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DevelopmentTesting_TestRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DevelopmentTesting_TestResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DevelopmentTesting_TestResponse_fieldAccessorTable;

    public interface AlertDetailsOrBuilder extends MessageOrBuilder {
        ByteString getTestData();

        int getTimestampSentMs();

        boolean hasTestData();

        boolean hasTimestampSentMs();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        TestNotification getTestNotification();

        TestNotificationOrBuilder getTestNotificationOrBuilder();

        TestRequest getTestRequest();

        TestRequestOrBuilder getTestRequestOrBuilder();

        TestResponse getTestResponse();

        TestResponseOrBuilder getTestResponseOrBuilder();

        boolean hasTestNotification();

        boolean hasTestRequest();

        boolean hasTestResponse();
    }

    public interface TestNotificationOrBuilder extends MessageOrBuilder {
        ByteString getTestData();

        int getTimestampSentMs();

        boolean hasTestData();

        boolean hasTimestampSentMs();
    }

    public interface TestRequestOrBuilder extends MessageOrBuilder {
        ByteString getTestData();

        int getTimestampSentMs();

        boolean hasTestData();

        boolean hasTimestampSentMs();
    }

    public interface TestResponseOrBuilder extends MessageOrBuilder {
        ByteString getTestData();

        int getTimestampSentMs();

        boolean hasTestData();

        boolean hasTimestampSentMs();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_DevelopmentTesting_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_DevelopmentTesting_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"TestRequest", "TestResponse", "TestNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_DevelopmentTesting_TestRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_DevelopmentTesting_TestRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"TestData", "TimestampSentMs"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_DevelopmentTesting_TestResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_DevelopmentTesting_TestResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"TestData", "TimestampSentMs"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_DevelopmentTesting_TestNotification_descriptor = descriptor5;
        internal_static_GDI_Proto_DevelopmentTesting_TestNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"TestData", "TimestampSentMs"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_DevelopmentTesting_AlertDetails_descriptor = descriptor6;
        internal_static_GDI_Proto_DevelopmentTesting_AlertDetails_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"TestData", "TimestampSentMs"});
        GDIEventSharingProto.getDescriptor();
    }

    private GDIDevelopmentTesting() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(AlertDetails.details);
    }

    public static final class AlertDetails extends GeneratedMessageV3 implements AlertDetailsOrBuilder {
        public static final int DETAILS_FIELD_NUMBER = 1018;
        public static final int TEST_DATA_FIELD_NUMBER = 1;
        public static final int TIMESTAMP_SENT_MS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString testData_;
        private int timestampSentMs_;
        private static final AlertDetails DEFAULT_INSTANCE = new AlertDetails();

        @Deprecated
        public static final Parser<AlertDetails> PARSER = new AbstractParser<AlertDetails>() { // from class: com.garmin.proto.generated.GDIDevelopmentTesting.AlertDetails.1
            @Override // com.google.protobuf.Parser
            public AlertDetails parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AlertDetails.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, AlertDetails> details = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, AlertDetails.class, getDefaultInstance());

        private AlertDetails(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.testData_ = ByteString.EMPTY;
            this.timestampSentMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlertDetails getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_AlertDetails_descriptor;
        }

        public static Builder newBuilder(AlertDetails alertDetails) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alertDetails);
        }

        public static AlertDetails parseDelimitedFrom(InputStream inputStream) {
            return (AlertDetails) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlertDetails parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AlertDetails> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlertDetails)) {
                return super.equals(obj);
            }
            AlertDetails alertDetails = (AlertDetails) obj;
            if (hasTestData() != alertDetails.hasTestData()) {
                return false;
            }
            if ((!hasTestData() || getTestData().equals(alertDetails.getTestData())) && hasTimestampSentMs() == alertDetails.hasTimestampSentMs()) {
                return (!hasTimestampSentMs() || getTimestampSentMs() == alertDetails.getTimestampSentMs()) && getUnknownFields().equals(alertDetails.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlertDetails> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.testData_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeFixed32Size(2, this.timestampSentMs_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.AlertDetailsOrBuilder
        public ByteString getTestData() {
            return this.testData_;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.AlertDetailsOrBuilder
        public int getTimestampSentMs() {
            return this.timestampSentMs_;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.AlertDetailsOrBuilder
        public boolean hasTestData() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.AlertDetailsOrBuilder
        public boolean hasTimestampSentMs() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTestData()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTestData().hashCode();
            }
            if (hasTimestampSentMs()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTimestampSentMs();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_AlertDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertDetails.class, Builder.class);
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
            return new AlertDetails();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.testData_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFixed32(2, this.timestampSentMs_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlertDetailsOrBuilder {
            private int bitField0_;
            private ByteString testData_;
            private int timestampSentMs_;

            private Builder() {
                this.testData_ = ByteString.EMPTY;
            }

            private void buildPartial0(AlertDetails alertDetails) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    alertDetails.testData_ = this.testData_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    alertDetails.timestampSentMs_ = this.timestampSentMs_;
                    i14 |= 2;
                }
                alertDetails.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_AlertDetails_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertDetails build() {
                AlertDetails alertDetailsBuildPartial = buildPartial();
                if (alertDetailsBuildPartial.isInitialized()) {
                    return alertDetailsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alertDetailsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertDetails buildPartial() {
                AlertDetails alertDetails = new AlertDetails(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(alertDetails);
                }
                onBuilt();
                return alertDetails;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.testData_ = ByteString.EMPTY;
                this.timestampSentMs_ = 0;
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

            public Builder clearTestData() {
                this.bitField0_ &= -2;
                this.testData_ = AlertDetails.getDefaultInstance().getTestData();
                onChanged();
                return this;
            }

            public Builder clearTimestampSentMs() {
                this.bitField0_ &= -3;
                this.timestampSentMs_ = 0;
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
                return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_AlertDetails_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.AlertDetailsOrBuilder
            public ByteString getTestData() {
                return this.testData_;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.AlertDetailsOrBuilder
            public int getTimestampSentMs() {
                return this.timestampSentMs_;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.AlertDetailsOrBuilder
            public boolean hasTestData() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.AlertDetailsOrBuilder
            public boolean hasTimestampSentMs() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_AlertDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertDetails.class, Builder.class);
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
                                    this.testData_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.timestampSentMs_ = codedInputStream.readFixed32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTestData(ByteString byteString) {
                byteString.getClass();
                this.testData_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTimestampSentMs(int i14) {
                this.timestampSentMs_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlertDetails getDefaultInstanceForType() {
                return AlertDetails.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.testData_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlertDetails) {
                    return mergeFrom((AlertDetails) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlertDetails alertDetails) {
                if (alertDetails == AlertDetails.getDefaultInstance()) {
                    return this;
                }
                if (alertDetails.hasTestData()) {
                    setTestData(alertDetails.getTestData());
                }
                if (alertDetails.hasTimestampSentMs()) {
                    setTimestampSentMs(alertDetails.getTimestampSentMs());
                }
                mergeUnknownFields(alertDetails.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlertDetails getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AlertDetails parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertDetails) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlertDetails parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlertDetails parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlertDetails parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlertDetails parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlertDetails parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ AlertDetails(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AlertDetails parseFrom(InputStream inputStream) {
            return (AlertDetails) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private AlertDetails() {
            ByteString byteString = ByteString.EMPTY;
            this.timestampSentMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.testData_ = byteString;
        }

        public static AlertDetails parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertDetails) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlertDetails parseFrom(CodedInputStream codedInputStream) {
            return (AlertDetails) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AlertDetails parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertDetails) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIDevelopmentTesting.Service.1
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
        public static final int TEST_NOTIFICATION_FIELD_NUMBER = 3;
        public static final int TEST_REQUEST_FIELD_NUMBER = 1;
        public static final int TEST_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private TestNotification testNotification_;
        private TestRequest testRequest_;
        private TestResponse testResponse_;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_Service_descriptor;
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
            if (hasTestRequest() != service.hasTestRequest()) {
                return false;
            }
            if ((hasTestRequest() && !getTestRequest().equals(service.getTestRequest())) || hasTestResponse() != service.hasTestResponse()) {
                return false;
            }
            if ((!hasTestResponse() || getTestResponse().equals(service.getTestResponse())) && hasTestNotification() == service.hasTestNotification()) {
                return (!hasTestNotification() || getTestNotification().equals(service.getTestNotification())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getTestRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getTestResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getTestNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
        public TestNotification getTestNotification() {
            TestNotification testNotification = this.testNotification_;
            return testNotification == null ? TestNotification.getDefaultInstance() : testNotification;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
        public TestNotificationOrBuilder getTestNotificationOrBuilder() {
            TestNotification testNotification = this.testNotification_;
            return testNotification == null ? TestNotification.getDefaultInstance() : testNotification;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
        public TestRequest getTestRequest() {
            TestRequest testRequest = this.testRequest_;
            return testRequest == null ? TestRequest.getDefaultInstance() : testRequest;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
        public TestRequestOrBuilder getTestRequestOrBuilder() {
            TestRequest testRequest = this.testRequest_;
            return testRequest == null ? TestRequest.getDefaultInstance() : testRequest;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
        public TestResponse getTestResponse() {
            TestResponse testResponse = this.testResponse_;
            return testResponse == null ? TestResponse.getDefaultInstance() : testResponse;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
        public TestResponseOrBuilder getTestResponseOrBuilder() {
            TestResponse testResponse = this.testResponse_;
            return testResponse == null ? TestResponse.getDefaultInstance() : testResponse;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
        public boolean hasTestNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
        public boolean hasTestRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
        public boolean hasTestResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTestRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTestRequest().hashCode();
            }
            if (hasTestResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTestResponse().hashCode();
            }
            if (hasTestNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getTestNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getTestRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getTestResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getTestNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<TestNotification, TestNotification.Builder, TestNotificationOrBuilder> testNotificationBuilder_;
            private TestNotification testNotification_;
            private SingleFieldBuilderV3<TestRequest, TestRequest.Builder, TestRequestOrBuilder> testRequestBuilder_;
            private TestRequest testRequest_;
            private SingleFieldBuilderV3<TestResponse, TestResponse.Builder, TestResponseOrBuilder> testResponseBuilder_;
            private TestResponse testResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<TestRequest, TestRequest.Builder, TestRequestOrBuilder> singleFieldBuilderV3 = this.testRequestBuilder_;
                    service.testRequest_ = singleFieldBuilderV3 == null ? this.testRequest_ : (TestRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<TestResponse, TestResponse.Builder, TestResponseOrBuilder> singleFieldBuilderV4 = this.testResponseBuilder_;
                    service.testResponse_ = singleFieldBuilderV4 == null ? this.testResponse_ : (TestResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<TestNotification, TestNotification.Builder, TestNotificationOrBuilder> singleFieldBuilderV5 = this.testNotificationBuilder_;
                    service.testNotification_ = singleFieldBuilderV5 == null ? this.testNotification_ : (TestNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_Service_descriptor;
            }

            private SingleFieldBuilderV3<TestNotification, TestNotification.Builder, TestNotificationOrBuilder> getTestNotificationFieldBuilder() {
                if (this.testNotificationBuilder_ == null) {
                    this.testNotificationBuilder_ = new SingleFieldBuilderV3<>(getTestNotification(), getParentForChildren(), isClean());
                    this.testNotification_ = null;
                }
                return this.testNotificationBuilder_;
            }

            private SingleFieldBuilderV3<TestRequest, TestRequest.Builder, TestRequestOrBuilder> getTestRequestFieldBuilder() {
                if (this.testRequestBuilder_ == null) {
                    this.testRequestBuilder_ = new SingleFieldBuilderV3<>(getTestRequest(), getParentForChildren(), isClean());
                    this.testRequest_ = null;
                }
                return this.testRequestBuilder_;
            }

            private SingleFieldBuilderV3<TestResponse, TestResponse.Builder, TestResponseOrBuilder> getTestResponseFieldBuilder() {
                if (this.testResponseBuilder_ == null) {
                    this.testResponseBuilder_ = new SingleFieldBuilderV3<>(getTestResponse(), getParentForChildren(), isClean());
                    this.testResponse_ = null;
                }
                return this.testResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getTestRequestFieldBuilder();
                    getTestResponseFieldBuilder();
                    getTestNotificationFieldBuilder();
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
                this.testRequest_ = null;
                SingleFieldBuilderV3<TestRequest, TestRequest.Builder, TestRequestOrBuilder> singleFieldBuilderV3 = this.testRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.testRequestBuilder_ = null;
                }
                this.testResponse_ = null;
                SingleFieldBuilderV3<TestResponse, TestResponse.Builder, TestResponseOrBuilder> singleFieldBuilderV4 = this.testResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.testResponseBuilder_ = null;
                }
                this.testNotification_ = null;
                SingleFieldBuilderV3<TestNotification, TestNotification.Builder, TestNotificationOrBuilder> singleFieldBuilderV5 = this.testNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.testNotificationBuilder_ = null;
                }
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

            public Builder clearTestNotification() {
                this.bitField0_ &= -5;
                this.testNotification_ = null;
                SingleFieldBuilderV3<TestNotification, TestNotification.Builder, TestNotificationOrBuilder> singleFieldBuilderV3 = this.testNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.testNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTestRequest() {
                this.bitField0_ &= -2;
                this.testRequest_ = null;
                SingleFieldBuilderV3<TestRequest, TestRequest.Builder, TestRequestOrBuilder> singleFieldBuilderV3 = this.testRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.testRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTestResponse() {
                this.bitField0_ &= -3;
                this.testResponse_ = null;
                SingleFieldBuilderV3<TestResponse, TestResponse.Builder, TestResponseOrBuilder> singleFieldBuilderV3 = this.testResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.testResponseBuilder_ = null;
                }
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
                return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
            public TestNotification getTestNotification() {
                SingleFieldBuilderV3<TestNotification, TestNotification.Builder, TestNotificationOrBuilder> singleFieldBuilderV3 = this.testNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TestNotification) singleFieldBuilderV3.getMessage();
                }
                TestNotification testNotification = this.testNotification_;
                return testNotification == null ? TestNotification.getDefaultInstance() : testNotification;
            }

            public TestNotification.Builder getTestNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (TestNotification.Builder) getTestNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
            public TestNotificationOrBuilder getTestNotificationOrBuilder() {
                SingleFieldBuilderV3<TestNotification, TestNotification.Builder, TestNotificationOrBuilder> singleFieldBuilderV3 = this.testNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TestNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TestNotification testNotification = this.testNotification_;
                return testNotification == null ? TestNotification.getDefaultInstance() : testNotification;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
            public TestRequest getTestRequest() {
                SingleFieldBuilderV3<TestRequest, TestRequest.Builder, TestRequestOrBuilder> singleFieldBuilderV3 = this.testRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TestRequest) singleFieldBuilderV3.getMessage();
                }
                TestRequest testRequest = this.testRequest_;
                return testRequest == null ? TestRequest.getDefaultInstance() : testRequest;
            }

            public TestRequest.Builder getTestRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (TestRequest.Builder) getTestRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
            public TestRequestOrBuilder getTestRequestOrBuilder() {
                SingleFieldBuilderV3<TestRequest, TestRequest.Builder, TestRequestOrBuilder> singleFieldBuilderV3 = this.testRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TestRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TestRequest testRequest = this.testRequest_;
                return testRequest == null ? TestRequest.getDefaultInstance() : testRequest;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
            public TestResponse getTestResponse() {
                SingleFieldBuilderV3<TestResponse, TestResponse.Builder, TestResponseOrBuilder> singleFieldBuilderV3 = this.testResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TestResponse) singleFieldBuilderV3.getMessage();
                }
                TestResponse testResponse = this.testResponse_;
                return testResponse == null ? TestResponse.getDefaultInstance() : testResponse;
            }

            public TestResponse.Builder getTestResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (TestResponse.Builder) getTestResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
            public TestResponseOrBuilder getTestResponseOrBuilder() {
                SingleFieldBuilderV3<TestResponse, TestResponse.Builder, TestResponseOrBuilder> singleFieldBuilderV3 = this.testResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TestResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TestResponse testResponse = this.testResponse_;
                return testResponse == null ? TestResponse.getDefaultInstance() : testResponse;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
            public boolean hasTestNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
            public boolean hasTestRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.ServiceOrBuilder
            public boolean hasTestResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                                    codedInputStream.readMessage(getTestRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getTestResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getTestNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeTestNotification(TestNotification testNotification) {
                TestNotification testNotification2;
                SingleFieldBuilderV3<TestNotification, TestNotification.Builder, TestNotificationOrBuilder> singleFieldBuilderV3 = this.testNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(testNotification);
                } else if ((this.bitField0_ & 4) == 0 || (testNotification2 = this.testNotification_) == null || testNotification2 == TestNotification.getDefaultInstance()) {
                    this.testNotification_ = testNotification;
                } else {
                    getTestNotificationBuilder().mergeFrom(testNotification);
                }
                if (this.testNotification_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTestRequest(TestRequest testRequest) {
                TestRequest testRequest2;
                SingleFieldBuilderV3<TestRequest, TestRequest.Builder, TestRequestOrBuilder> singleFieldBuilderV3 = this.testRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(testRequest);
                } else if ((this.bitField0_ & 1) == 0 || (testRequest2 = this.testRequest_) == null || testRequest2 == TestRequest.getDefaultInstance()) {
                    this.testRequest_ = testRequest;
                } else {
                    getTestRequestBuilder().mergeFrom(testRequest);
                }
                if (this.testRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTestResponse(TestResponse testResponse) {
                TestResponse testResponse2;
                SingleFieldBuilderV3<TestResponse, TestResponse.Builder, TestResponseOrBuilder> singleFieldBuilderV3 = this.testResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(testResponse);
                } else if ((this.bitField0_ & 2) == 0 || (testResponse2 = this.testResponse_) == null || testResponse2 == TestResponse.getDefaultInstance()) {
                    this.testResponse_ = testResponse;
                } else {
                    getTestResponseBuilder().mergeFrom(testResponse);
                }
                if (this.testResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
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

            public Builder setTestNotification(TestNotification.Builder builder) {
                SingleFieldBuilderV3<TestNotification, TestNotification.Builder, TestNotificationOrBuilder> singleFieldBuilderV3 = this.testNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.testNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTestRequest(TestRequest.Builder builder) {
                SingleFieldBuilderV3<TestRequest, TestRequest.Builder, TestRequestOrBuilder> singleFieldBuilderV3 = this.testRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.testRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTestResponse(TestResponse.Builder builder) {
                SingleFieldBuilderV3<TestResponse, TestResponse.Builder, TestResponseOrBuilder> singleFieldBuilderV3 = this.testResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.testResponse_ = builder.build();
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

            public Builder setTestNotification(TestNotification testNotification) {
                SingleFieldBuilderV3<TestNotification, TestNotification.Builder, TestNotificationOrBuilder> singleFieldBuilderV3 = this.testNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    testNotification.getClass();
                    this.testNotification_ = testNotification;
                } else {
                    singleFieldBuilderV3.setMessage(testNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTestRequest(TestRequest testRequest) {
                SingleFieldBuilderV3<TestRequest, TestRequest.Builder, TestRequestOrBuilder> singleFieldBuilderV3 = this.testRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    testRequest.getClass();
                    this.testRequest_ = testRequest;
                } else {
                    singleFieldBuilderV3.setMessage(testRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTestResponse(TestResponse testResponse) {
                SingleFieldBuilderV3<TestResponse, TestResponse.Builder, TestResponseOrBuilder> singleFieldBuilderV3 = this.testResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    testResponse.getClass();
                    this.testResponse_ = testResponse;
                } else {
                    singleFieldBuilderV3.setMessage(testResponse);
                }
                this.bitField0_ |= 2;
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
                if (service.hasTestRequest()) {
                    mergeTestRequest(service.getTestRequest());
                }
                if (service.hasTestResponse()) {
                    mergeTestResponse(service.getTestResponse());
                }
                if (service.hasTestNotification()) {
                    mergeTestNotification(service.getTestNotification());
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

    public static final class TestNotification extends GeneratedMessageV3 implements TestNotificationOrBuilder {
        private static final TestNotification DEFAULT_INSTANCE = new TestNotification();

        @Deprecated
        public static final Parser<TestNotification> PARSER = new AbstractParser<TestNotification>() { // from class: com.garmin.proto.generated.GDIDevelopmentTesting.TestNotification.1
            @Override // com.google.protobuf.Parser
            public TestNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TestNotification.newBuilder();
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
        public static final int TEST_DATA_FIELD_NUMBER = 1;
        public static final int TIMESTAMP_SENT_MS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString testData_;
        private int timestampSentMs_;

        private TestNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.testData_ = ByteString.EMPTY;
            this.timestampSentMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TestNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_TestNotification_descriptor;
        }

        public static Builder newBuilder(TestNotification testNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(testNotification);
        }

        public static TestNotification parseDelimitedFrom(InputStream inputStream) {
            return (TestNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TestNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TestNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TestNotification)) {
                return super.equals(obj);
            }
            TestNotification testNotification = (TestNotification) obj;
            if (hasTestData() != testNotification.hasTestData()) {
                return false;
            }
            if ((!hasTestData() || getTestData().equals(testNotification.getTestData())) && hasTimestampSentMs() == testNotification.hasTimestampSentMs()) {
                return (!hasTimestampSentMs() || getTimestampSentMs() == testNotification.getTimestampSentMs()) && getUnknownFields().equals(testNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TestNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.testData_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeFixed32Size(2, this.timestampSentMs_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestNotificationOrBuilder
        public ByteString getTestData() {
            return this.testData_;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestNotificationOrBuilder
        public int getTimestampSentMs() {
            return this.timestampSentMs_;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestNotificationOrBuilder
        public boolean hasTestData() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestNotificationOrBuilder
        public boolean hasTimestampSentMs() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTestData()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTestData().hashCode();
            }
            if (hasTimestampSentMs()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTimestampSentMs();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_TestNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(TestNotification.class, Builder.class);
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
            return new TestNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.testData_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFixed32(2, this.timestampSentMs_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TestNotificationOrBuilder {
            private int bitField0_;
            private ByteString testData_;
            private int timestampSentMs_;

            private Builder() {
                this.testData_ = ByteString.EMPTY;
            }

            private void buildPartial0(TestNotification testNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    testNotification.testData_ = this.testData_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    testNotification.timestampSentMs_ = this.timestampSentMs_;
                    i14 |= 2;
                }
                testNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_TestNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TestNotification build() {
                TestNotification testNotificationBuildPartial = buildPartial();
                if (testNotificationBuildPartial.isInitialized()) {
                    return testNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) testNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TestNotification buildPartial() {
                TestNotification testNotification = new TestNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(testNotification);
                }
                onBuilt();
                return testNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.testData_ = ByteString.EMPTY;
                this.timestampSentMs_ = 0;
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

            public Builder clearTestData() {
                this.bitField0_ &= -2;
                this.testData_ = TestNotification.getDefaultInstance().getTestData();
                onChanged();
                return this;
            }

            public Builder clearTimestampSentMs() {
                this.bitField0_ &= -3;
                this.timestampSentMs_ = 0;
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
                return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_TestNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestNotificationOrBuilder
            public ByteString getTestData() {
                return this.testData_;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestNotificationOrBuilder
            public int getTimestampSentMs() {
                return this.timestampSentMs_;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestNotificationOrBuilder
            public boolean hasTestData() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestNotificationOrBuilder
            public boolean hasTimestampSentMs() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_TestNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(TestNotification.class, Builder.class);
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
                                    this.testData_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.timestampSentMs_ = codedInputStream.readFixed32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTestData(ByteString byteString) {
                byteString.getClass();
                this.testData_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTimestampSentMs(int i14) {
                this.timestampSentMs_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TestNotification getDefaultInstanceForType() {
                return TestNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.testData_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TestNotification) {
                    return mergeFrom((TestNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TestNotification testNotification) {
                if (testNotification == TestNotification.getDefaultInstance()) {
                    return this;
                }
                if (testNotification.hasTestData()) {
                    setTestData(testNotification.getTestData());
                }
                if (testNotification.hasTimestampSentMs()) {
                    setTimestampSentMs(testNotification.getTimestampSentMs());
                }
                mergeUnknownFields(testNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TestNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TestNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TestNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TestNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TestNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TestNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TestNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TestNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ TestNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TestNotification parseFrom(InputStream inputStream) {
            return (TestNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private TestNotification() {
            ByteString byteString = ByteString.EMPTY;
            this.timestampSentMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.testData_ = byteString;
        }

        public static TestNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TestNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TestNotification parseFrom(CodedInputStream codedInputStream) {
            return (TestNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TestNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TestNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TestRequest extends GeneratedMessageV3 implements TestRequestOrBuilder {
        private static final TestRequest DEFAULT_INSTANCE = new TestRequest();

        @Deprecated
        public static final Parser<TestRequest> PARSER = new AbstractParser<TestRequest>() { // from class: com.garmin.proto.generated.GDIDevelopmentTesting.TestRequest.1
            @Override // com.google.protobuf.Parser
            public TestRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TestRequest.newBuilder();
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
        public static final int TEST_DATA_FIELD_NUMBER = 1;
        public static final int TIMESTAMP_SENT_MS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString testData_;
        private int timestampSentMs_;

        private TestRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.testData_ = ByteString.EMPTY;
            this.timestampSentMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TestRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_TestRequest_descriptor;
        }

        public static Builder newBuilder(TestRequest testRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(testRequest);
        }

        public static TestRequest parseDelimitedFrom(InputStream inputStream) {
            return (TestRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TestRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TestRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TestRequest)) {
                return super.equals(obj);
            }
            TestRequest testRequest = (TestRequest) obj;
            if (hasTestData() != testRequest.hasTestData()) {
                return false;
            }
            if ((!hasTestData() || getTestData().equals(testRequest.getTestData())) && hasTimestampSentMs() == testRequest.hasTimestampSentMs()) {
                return (!hasTimestampSentMs() || getTimestampSentMs() == testRequest.getTimestampSentMs()) && getUnknownFields().equals(testRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TestRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.testData_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeFixed32Size(2, this.timestampSentMs_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestRequestOrBuilder
        public ByteString getTestData() {
            return this.testData_;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestRequestOrBuilder
        public int getTimestampSentMs() {
            return this.timestampSentMs_;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestRequestOrBuilder
        public boolean hasTestData() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestRequestOrBuilder
        public boolean hasTimestampSentMs() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTestData()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTestData().hashCode();
            }
            if (hasTimestampSentMs()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTimestampSentMs();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_TestRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TestRequest.class, Builder.class);
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
            return new TestRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.testData_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFixed32(2, this.timestampSentMs_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TestRequestOrBuilder {
            private int bitField0_;
            private ByteString testData_;
            private int timestampSentMs_;

            private Builder() {
                this.testData_ = ByteString.EMPTY;
            }

            private void buildPartial0(TestRequest testRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    testRequest.testData_ = this.testData_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    testRequest.timestampSentMs_ = this.timestampSentMs_;
                    i14 |= 2;
                }
                testRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_TestRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TestRequest build() {
                TestRequest testRequestBuildPartial = buildPartial();
                if (testRequestBuildPartial.isInitialized()) {
                    return testRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) testRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TestRequest buildPartial() {
                TestRequest testRequest = new TestRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(testRequest);
                }
                onBuilt();
                return testRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.testData_ = ByteString.EMPTY;
                this.timestampSentMs_ = 0;
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

            public Builder clearTestData() {
                this.bitField0_ &= -2;
                this.testData_ = TestRequest.getDefaultInstance().getTestData();
                onChanged();
                return this;
            }

            public Builder clearTimestampSentMs() {
                this.bitField0_ &= -3;
                this.timestampSentMs_ = 0;
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
                return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_TestRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestRequestOrBuilder
            public ByteString getTestData() {
                return this.testData_;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestRequestOrBuilder
            public int getTimestampSentMs() {
                return this.timestampSentMs_;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestRequestOrBuilder
            public boolean hasTestData() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestRequestOrBuilder
            public boolean hasTimestampSentMs() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_TestRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TestRequest.class, Builder.class);
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
                                    this.testData_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.timestampSentMs_ = codedInputStream.readFixed32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTestData(ByteString byteString) {
                byteString.getClass();
                this.testData_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTimestampSentMs(int i14) {
                this.timestampSentMs_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TestRequest getDefaultInstanceForType() {
                return TestRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.testData_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TestRequest) {
                    return mergeFrom((TestRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TestRequest testRequest) {
                if (testRequest == TestRequest.getDefaultInstance()) {
                    return this;
                }
                if (testRequest.hasTestData()) {
                    setTestData(testRequest.getTestData());
                }
                if (testRequest.hasTimestampSentMs()) {
                    setTimestampSentMs(testRequest.getTimestampSentMs());
                }
                mergeUnknownFields(testRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TestRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TestRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TestRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TestRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TestRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TestRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TestRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TestRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ TestRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TestRequest parseFrom(InputStream inputStream) {
            return (TestRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private TestRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.timestampSentMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.testData_ = byteString;
        }

        public static TestRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TestRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TestRequest parseFrom(CodedInputStream codedInputStream) {
            return (TestRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TestRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TestRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TestResponse extends GeneratedMessageV3 implements TestResponseOrBuilder {
        private static final TestResponse DEFAULT_INSTANCE = new TestResponse();

        @Deprecated
        public static final Parser<TestResponse> PARSER = new AbstractParser<TestResponse>() { // from class: com.garmin.proto.generated.GDIDevelopmentTesting.TestResponse.1
            @Override // com.google.protobuf.Parser
            public TestResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TestResponse.newBuilder();
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
        public static final int TEST_DATA_FIELD_NUMBER = 1;
        public static final int TIMESTAMP_SENT_MS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString testData_;
        private int timestampSentMs_;

        private TestResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.testData_ = ByteString.EMPTY;
            this.timestampSentMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TestResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_TestResponse_descriptor;
        }

        public static Builder newBuilder(TestResponse testResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(testResponse);
        }

        public static TestResponse parseDelimitedFrom(InputStream inputStream) {
            return (TestResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TestResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TestResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TestResponse)) {
                return super.equals(obj);
            }
            TestResponse testResponse = (TestResponse) obj;
            if (hasTestData() != testResponse.hasTestData()) {
                return false;
            }
            if ((!hasTestData() || getTestData().equals(testResponse.getTestData())) && hasTimestampSentMs() == testResponse.hasTimestampSentMs()) {
                return (!hasTimestampSentMs() || getTimestampSentMs() == testResponse.getTimestampSentMs()) && getUnknownFields().equals(testResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TestResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.testData_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeFixed32Size(2, this.timestampSentMs_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestResponseOrBuilder
        public ByteString getTestData() {
            return this.testData_;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestResponseOrBuilder
        public int getTimestampSentMs() {
            return this.timestampSentMs_;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestResponseOrBuilder
        public boolean hasTestData() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestResponseOrBuilder
        public boolean hasTimestampSentMs() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTestData()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTestData().hashCode();
            }
            if (hasTimestampSentMs()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTimestampSentMs();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_TestResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TestResponse.class, Builder.class);
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
            return new TestResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.testData_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFixed32(2, this.timestampSentMs_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TestResponseOrBuilder {
            private int bitField0_;
            private ByteString testData_;
            private int timestampSentMs_;

            private Builder() {
                this.testData_ = ByteString.EMPTY;
            }

            private void buildPartial0(TestResponse testResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    testResponse.testData_ = this.testData_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    testResponse.timestampSentMs_ = this.timestampSentMs_;
                    i14 |= 2;
                }
                testResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_TestResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TestResponse build() {
                TestResponse testResponseBuildPartial = buildPartial();
                if (testResponseBuildPartial.isInitialized()) {
                    return testResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) testResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TestResponse buildPartial() {
                TestResponse testResponse = new TestResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(testResponse);
                }
                onBuilt();
                return testResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.testData_ = ByteString.EMPTY;
                this.timestampSentMs_ = 0;
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

            public Builder clearTestData() {
                this.bitField0_ &= -2;
                this.testData_ = TestResponse.getDefaultInstance().getTestData();
                onChanged();
                return this;
            }

            public Builder clearTimestampSentMs() {
                this.bitField0_ &= -3;
                this.timestampSentMs_ = 0;
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
                return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_TestResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestResponseOrBuilder
            public ByteString getTestData() {
                return this.testData_;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestResponseOrBuilder
            public int getTimestampSentMs() {
                return this.timestampSentMs_;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestResponseOrBuilder
            public boolean hasTestData() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDevelopmentTesting.TestResponseOrBuilder
            public boolean hasTimestampSentMs() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDevelopmentTesting.internal_static_GDI_Proto_DevelopmentTesting_TestResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TestResponse.class, Builder.class);
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
                                    this.testData_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.timestampSentMs_ = codedInputStream.readFixed32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTestData(ByteString byteString) {
                byteString.getClass();
                this.testData_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTimestampSentMs(int i14) {
                this.timestampSentMs_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TestResponse getDefaultInstanceForType() {
                return TestResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.testData_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TestResponse) {
                    return mergeFrom((TestResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TestResponse testResponse) {
                if (testResponse == TestResponse.getDefaultInstance()) {
                    return this;
                }
                if (testResponse.hasTestData()) {
                    setTestData(testResponse.getTestData());
                }
                if (testResponse.hasTimestampSentMs()) {
                    setTimestampSentMs(testResponse.getTimestampSentMs());
                }
                mergeUnknownFields(testResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TestResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TestResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TestResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TestResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TestResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TestResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TestResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TestResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ TestResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TestResponse parseFrom(InputStream inputStream) {
            return (TestResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private TestResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.timestampSentMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.testData_ = byteString;
        }

        public static TestResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TestResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TestResponse parseFrom(CodedInputStream codedInputStream) {
            return (TestResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TestResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TestResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}

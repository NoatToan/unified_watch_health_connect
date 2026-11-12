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
public final class PSASample {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012GDIPSASample.proto\u0012\u0013GDI.Proto.PSASample\u001a\rGDICore.proto\u001a\u0015GDIEventSharing.proto\"É\u0001\n\u0007Service\u0012D\n\u0013sample_notification\u0018\u0001 \u0001(\u000b2'.GDI.Proto.PSASample.SampleNotification\u0012:\n\u000esample_request\u0018\u0002 \u0001(\u000b2\".GDI.Proto.PSASample.SampleRequest\u0012<\n\u000fsample_response\u0018\u0003 \u0001(\u000b2#.GDI.Proto.PSASample.SampleResponse\"5\n\u0012SampleNotification\u0012\u000b\n\u0003msg\u0018\u0001 \u0001(\f\u0012\u0012\n\nsample_int\u0018\u0002 \u0001(\r\"0\n\rSampleRequest\u0012\u000b\n\u0003msg\u0018\u0001 \u0001(\f\u0012\u0012\n\nsample_int\u0018\u0002 \u0001(\r\"1\n\u000eSampleResponse\u0012\u000b\n\u0003msg\u0018\u0001 \u0001(\f\u0012\u0012\n\nsample_int\u0018\u0002 \u0001(\r\"\u009a\u0001\n\u0013CapabilitiesRequest\u0012\u0012\n\nsample_int\u0018\u0001 \u0001(\r2o\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018é\u0007 \u0001(\u000b2(.GDI.Proto.PSASample.CapabilitiesRequest\",\n\u0015PSASampleCapabilities\u0012\u0013\n\u000bsample_bool\u0018\u0001 \u0001(\b\"×\u0001\n\u0014CapabilitiesResponse\u0012K\n\u0017psa_sample_capabilities\u0018\u0001 \u0001(\u000b2*.GDI.Proto.PSASample.PSASampleCapabilities2r\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018é\u0007 \u0001(\u000b2).GDI.Proto.PSASample.CapabilitiesResponse\"µ\u0001\n\fAlertDetails\u0012\u0011\n\ttest_data\u0018\u0001 \u0001(\f\u00122\n\ndummy_info\u0018\u0002 \u0001(\u000b2\u001e.GDI.Proto.PSASample.DummyInfo2^\n\u0007details\u0012).GDI.Proto.EventSharing.AlertNotification\u0018û\u0007 \u0001(\u000b2!.GDI.Proto.PSASample.AlertDetails\"v\n\tDummyInfo\u0012@\n\ndummy_type\u0018\u0001 \u0001(\u000e2,.GDI.Proto.PSASample.DummyInfo.DummyInfoType\"'\n\rDummyInfoType\u0012\n\n\u0006DUMMY0\u0010\u0000\u0012\n\n\u0006DUMMY1\u0010\u0001B)\n\u001acom.garmin.proto.generatedB\tPSASampleH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor(), GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_PSASample_AlertDetails_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_PSASample_AlertDetails_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_PSASample_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_PSASample_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_PSASample_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_PSASample_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_PSASample_DummyInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_PSASample_DummyInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_PSASample_PSASampleCapabilities_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_PSASample_PSASampleCapabilities_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_PSASample_SampleNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_PSASample_SampleNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_PSASample_SampleRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_PSASample_SampleRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_PSASample_SampleResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_PSASample_SampleResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_PSASample_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_PSASample_Service_fieldAccessorTable;

    public interface AlertDetailsOrBuilder extends MessageOrBuilder {
        DummyInfo getDummyInfo();

        DummyInfoOrBuilder getDummyInfoOrBuilder();

        ByteString getTestData();

        boolean hasDummyInfo();

        boolean hasTestData();
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
        int getSampleInt();

        boolean hasSampleInt();
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        PSASampleCapabilities getPsaSampleCapabilities();

        PSASampleCapabilitiesOrBuilder getPsaSampleCapabilitiesOrBuilder();

        boolean hasPsaSampleCapabilities();
    }

    public interface DummyInfoOrBuilder extends MessageOrBuilder {
        DummyInfo.DummyInfoType getDummyType();

        boolean hasDummyType();
    }

    public interface PSASampleCapabilitiesOrBuilder extends MessageOrBuilder {
        boolean getSampleBool();

        boolean hasSampleBool();
    }

    public interface SampleNotificationOrBuilder extends MessageOrBuilder {
        ByteString getMsg();

        int getSampleInt();

        boolean hasMsg();

        boolean hasSampleInt();
    }

    public interface SampleRequestOrBuilder extends MessageOrBuilder {
        ByteString getMsg();

        int getSampleInt();

        boolean hasMsg();

        boolean hasSampleInt();
    }

    public interface SampleResponseOrBuilder extends MessageOrBuilder {
        ByteString getMsg();

        int getSampleInt();

        boolean hasMsg();

        boolean hasSampleInt();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        SampleNotification getSampleNotification();

        SampleNotificationOrBuilder getSampleNotificationOrBuilder();

        SampleRequest getSampleRequest();

        SampleRequestOrBuilder getSampleRequestOrBuilder();

        SampleResponse getSampleResponse();

        SampleResponseOrBuilder getSampleResponseOrBuilder();

        boolean hasSampleNotification();

        boolean hasSampleRequest();

        boolean hasSampleResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_PSASample_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_PSASample_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SampleNotification", "SampleRequest", "SampleResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_PSASample_SampleNotification_descriptor = descriptor3;
        internal_static_GDI_Proto_PSASample_SampleNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Msg", "SampleInt"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_PSASample_SampleRequest_descriptor = descriptor4;
        internal_static_GDI_Proto_PSASample_SampleRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Msg", "SampleInt"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_PSASample_SampleResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_PSASample_SampleResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Msg", "SampleInt"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_PSASample_CapabilitiesRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_PSASample_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"SampleInt"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_PSASample_PSASampleCapabilities_descriptor = descriptor7;
        internal_static_GDI_Proto_PSASample_PSASampleCapabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"SampleBool"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_PSASample_CapabilitiesResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_PSASample_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"PsaSampleCapabilities"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_PSASample_AlertDetails_descriptor = descriptor9;
        internal_static_GDI_Proto_PSASample_AlertDetails_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"TestData", "DummyInfo"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_PSASample_DummyInfo_descriptor = descriptor10;
        internal_static_GDI_Proto_PSASample_DummyInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"DummyType"});
        GDICore.getDescriptor();
        GDIEventSharingProto.getDescriptor();
    }

    private PSASample() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
        extensionRegistryLite.add(AlertDetails.details);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 1001;
        public static final int SAMPLE_INT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int sampleInt_;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.PSASample.CapabilitiesRequest.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> featuresRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sampleInt_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PSASample.internal_static_GDI_Proto_PSASample_CapabilitiesRequest_descriptor;
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
            if (!(obj instanceof CapabilitiesRequest)) {
                return super.equals(obj);
            }
            CapabilitiesRequest capabilitiesRequest = (CapabilitiesRequest) obj;
            if (hasSampleInt() != capabilitiesRequest.hasSampleInt()) {
                return false;
            }
            return (!hasSampleInt() || getSampleInt() == capabilitiesRequest.getSampleInt()) && getUnknownFields().equals(capabilitiesRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.PSASample.CapabilitiesRequestOrBuilder
        public int getSampleInt() {
            return this.sampleInt_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.sampleInt_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.PSASample.CapabilitiesRequestOrBuilder
        public boolean hasSampleInt() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSampleInt()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSampleInt();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PSASample.internal_static_GDI_Proto_PSASample_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.sampleInt_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            private int bitField0_;
            private int sampleInt_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CapabilitiesRequest capabilitiesRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    capabilitiesRequest.sampleInt_ = this.sampleInt_;
                } else {
                    i14 = 0;
                }
                capabilitiesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PSASample.internal_static_GDI_Proto_PSASample_CapabilitiesRequest_descriptor;
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
                if (this.bitField0_ != 0) {
                    buildPartial0(capabilitiesRequest);
                }
                onBuilt();
                return capabilitiesRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sampleInt_ = 0;
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

            public Builder clearSampleInt() {
                this.bitField0_ &= -2;
                this.sampleInt_ = 0;
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
                return PSASample.internal_static_GDI_Proto_PSASample_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.PSASample.CapabilitiesRequestOrBuilder
            public int getSampleInt() {
                return this.sampleInt_;
            }

            @Override // com.garmin.proto.generated.PSASample.CapabilitiesRequestOrBuilder
            public boolean hasSampleInt() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PSASample.internal_static_GDI_Proto_PSASample_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                                    this.sampleInt_ = codedInputStream.readUInt32();
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

            public Builder setSampleInt(int i14) {
                this.sampleInt_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
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
                if (capabilitiesRequest.hasSampleInt()) {
                    setSampleInt(capabilitiesRequest.getSampleInt());
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

        public /* synthetic */ CapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CapabilitiesRequest() {
            this.sampleInt_ = 0;
            this.memoizedIsInitialized = (byte) -1;
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

    public static final class PSASampleCapabilities extends GeneratedMessageV3 implements PSASampleCapabilitiesOrBuilder {
        private static final PSASampleCapabilities DEFAULT_INSTANCE = new PSASampleCapabilities();

        @Deprecated
        public static final Parser<PSASampleCapabilities> PARSER = new AbstractParser<PSASampleCapabilities>() { // from class: com.garmin.proto.generated.PSASample.PSASampleCapabilities.1
            @Override // com.google.protobuf.Parser
            public PSASampleCapabilities parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PSASampleCapabilities.newBuilder();
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
        public static final int SAMPLE_BOOL_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean sampleBool_;

        private PSASampleCapabilities(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sampleBool_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PSASampleCapabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PSASample.internal_static_GDI_Proto_PSASample_PSASampleCapabilities_descriptor;
        }

        public static Builder newBuilder(PSASampleCapabilities pSASampleCapabilities) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pSASampleCapabilities);
        }

        public static PSASampleCapabilities parseDelimitedFrom(InputStream inputStream) {
            return (PSASampleCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PSASampleCapabilities parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PSASampleCapabilities> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PSASampleCapabilities)) {
                return super.equals(obj);
            }
            PSASampleCapabilities pSASampleCapabilities = (PSASampleCapabilities) obj;
            if (hasSampleBool() != pSASampleCapabilities.hasSampleBool()) {
                return false;
            }
            return (!hasSampleBool() || getSampleBool() == pSASampleCapabilities.getSampleBool()) && getUnknownFields().equals(pSASampleCapabilities.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PSASampleCapabilities> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.PSASample.PSASampleCapabilitiesOrBuilder
        public boolean getSampleBool() {
            return this.sampleBool_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.sampleBool_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.PSASample.PSASampleCapabilitiesOrBuilder
        public boolean hasSampleBool() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSampleBool()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getSampleBool());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PSASample.internal_static_GDI_Proto_PSASample_PSASampleCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(PSASampleCapabilities.class, Builder.class);
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
            return new PSASampleCapabilities();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.sampleBool_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PSASampleCapabilitiesOrBuilder {
            private int bitField0_;
            private boolean sampleBool_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(PSASampleCapabilities pSASampleCapabilities) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    pSASampleCapabilities.sampleBool_ = this.sampleBool_;
                } else {
                    i14 = 0;
                }
                pSASampleCapabilities.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PSASample.internal_static_GDI_Proto_PSASample_PSASampleCapabilities_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PSASampleCapabilities build() {
                PSASampleCapabilities pSASampleCapabilitiesBuildPartial = buildPartial();
                if (pSASampleCapabilitiesBuildPartial.isInitialized()) {
                    return pSASampleCapabilitiesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pSASampleCapabilitiesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PSASampleCapabilities buildPartial() {
                PSASampleCapabilities pSASampleCapabilities = new PSASampleCapabilities(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(pSASampleCapabilities);
                }
                onBuilt();
                return pSASampleCapabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sampleBool_ = false;
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

            public Builder clearSampleBool() {
                this.bitField0_ &= -2;
                this.sampleBool_ = false;
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
                return PSASample.internal_static_GDI_Proto_PSASample_PSASampleCapabilities_descriptor;
            }

            @Override // com.garmin.proto.generated.PSASample.PSASampleCapabilitiesOrBuilder
            public boolean getSampleBool() {
                return this.sampleBool_;
            }

            @Override // com.garmin.proto.generated.PSASample.PSASampleCapabilitiesOrBuilder
            public boolean hasSampleBool() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PSASample.internal_static_GDI_Proto_PSASample_PSASampleCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(PSASampleCapabilities.class, Builder.class);
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
                                    this.sampleBool_ = codedInputStream.readBool();
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

            public Builder setSampleBool(boolean z14) {
                this.sampleBool_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
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
            public PSASampleCapabilities getDefaultInstanceForType() {
                return PSASampleCapabilities.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PSASampleCapabilities) {
                    return mergeFrom((PSASampleCapabilities) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PSASampleCapabilities pSASampleCapabilities) {
                if (pSASampleCapabilities == PSASampleCapabilities.getDefaultInstance()) {
                    return this;
                }
                if (pSASampleCapabilities.hasSampleBool()) {
                    setSampleBool(pSASampleCapabilities.getSampleBool());
                }
                mergeUnknownFields(pSASampleCapabilities.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PSASampleCapabilities getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PSASampleCapabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PSASampleCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PSASampleCapabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ PSASampleCapabilities(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static PSASampleCapabilities parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private PSASampleCapabilities() {
            this.sampleBool_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PSASampleCapabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PSASampleCapabilities parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PSASampleCapabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PSASampleCapabilities parseFrom(InputStream inputStream) {
            return (PSASampleCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PSASampleCapabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PSASampleCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PSASampleCapabilities parseFrom(CodedInputStream codedInputStream) {
            return (PSASampleCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PSASampleCapabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PSASampleCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AlertDetails extends GeneratedMessageV3 implements AlertDetailsOrBuilder {
        public static final int DETAILS_FIELD_NUMBER = 1019;
        public static final int DUMMY_INFO_FIELD_NUMBER = 2;
        public static final int TEST_DATA_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DummyInfo dummyInfo_;
        private byte memoizedIsInitialized;
        private ByteString testData_;
        private static final AlertDetails DEFAULT_INSTANCE = new AlertDetails();

        @Deprecated
        public static final Parser<AlertDetails> PARSER = new AbstractParser<AlertDetails>() { // from class: com.garmin.proto.generated.PSASample.AlertDetails.1
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
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlertDetails getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PSASample.internal_static_GDI_Proto_PSASample_AlertDetails_descriptor;
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
            if ((!hasTestData() || getTestData().equals(alertDetails.getTestData())) && hasDummyInfo() == alertDetails.hasDummyInfo()) {
                return (!hasDummyInfo() || getDummyInfo().equals(alertDetails.getDummyInfo())) && getUnknownFields().equals(alertDetails.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.PSASample.AlertDetailsOrBuilder
        public DummyInfo getDummyInfo() {
            DummyInfo dummyInfo = this.dummyInfo_;
            return dummyInfo == null ? DummyInfo.getDefaultInstance() : dummyInfo;
        }

        @Override // com.garmin.proto.generated.PSASample.AlertDetailsOrBuilder
        public DummyInfoOrBuilder getDummyInfoOrBuilder() {
            DummyInfo dummyInfo = this.dummyInfo_;
            return dummyInfo == null ? DummyInfo.getDefaultInstance() : dummyInfo;
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
                iComputeBytesSize += CodedOutputStream.computeMessageSize(2, getDummyInfo());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.PSASample.AlertDetailsOrBuilder
        public ByteString getTestData() {
            return this.testData_;
        }

        @Override // com.garmin.proto.generated.PSASample.AlertDetailsOrBuilder
        public boolean hasDummyInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.PSASample.AlertDetailsOrBuilder
        public boolean hasTestData() {
            return (this.bitField0_ & 1) != 0;
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
            if (hasDummyInfo()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDummyInfo().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PSASample.internal_static_GDI_Proto_PSASample_AlertDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertDetails.class, Builder.class);
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
                codedOutputStream.writeMessage(2, getDummyInfo());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlertDetailsOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DummyInfo, DummyInfo.Builder, DummyInfoOrBuilder> dummyInfoBuilder_;
            private DummyInfo dummyInfo_;
            private ByteString testData_;

            private Builder() {
                this.testData_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
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
                    SingleFieldBuilderV3<DummyInfo, DummyInfo.Builder, DummyInfoOrBuilder> singleFieldBuilderV3 = this.dummyInfoBuilder_;
                    alertDetails.dummyInfo_ = singleFieldBuilderV3 == null ? this.dummyInfo_ : (DummyInfo) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                alertDetails.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PSASample.internal_static_GDI_Proto_PSASample_AlertDetails_descriptor;
            }

            private SingleFieldBuilderV3<DummyInfo, DummyInfo.Builder, DummyInfoOrBuilder> getDummyInfoFieldBuilder() {
                if (this.dummyInfoBuilder_ == null) {
                    this.dummyInfoBuilder_ = new SingleFieldBuilderV3<>(getDummyInfo(), getParentForChildren(), isClean());
                    this.dummyInfo_ = null;
                }
                return this.dummyInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDummyInfoFieldBuilder();
                }
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
                this.dummyInfo_ = null;
                SingleFieldBuilderV3<DummyInfo, DummyInfo.Builder, DummyInfoOrBuilder> singleFieldBuilderV3 = this.dummyInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dummyInfoBuilder_ = null;
                }
                return this;
            }

            public Builder clearDummyInfo() {
                this.bitField0_ &= -3;
                this.dummyInfo_ = null;
                SingleFieldBuilderV3<DummyInfo, DummyInfo.Builder, DummyInfoOrBuilder> singleFieldBuilderV3 = this.dummyInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dummyInfoBuilder_ = null;
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

            public Builder clearTestData() {
                this.bitField0_ &= -2;
                this.testData_ = AlertDetails.getDefaultInstance().getTestData();
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
                return PSASample.internal_static_GDI_Proto_PSASample_AlertDetails_descriptor;
            }

            @Override // com.garmin.proto.generated.PSASample.AlertDetailsOrBuilder
            public DummyInfo getDummyInfo() {
                SingleFieldBuilderV3<DummyInfo, DummyInfo.Builder, DummyInfoOrBuilder> singleFieldBuilderV3 = this.dummyInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DummyInfo) singleFieldBuilderV3.getMessage();
                }
                DummyInfo dummyInfo = this.dummyInfo_;
                return dummyInfo == null ? DummyInfo.getDefaultInstance() : dummyInfo;
            }

            public DummyInfo.Builder getDummyInfoBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DummyInfo.Builder) getDummyInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.PSASample.AlertDetailsOrBuilder
            public DummyInfoOrBuilder getDummyInfoOrBuilder() {
                SingleFieldBuilderV3<DummyInfo, DummyInfo.Builder, DummyInfoOrBuilder> singleFieldBuilderV3 = this.dummyInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DummyInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DummyInfo dummyInfo = this.dummyInfo_;
                return dummyInfo == null ? DummyInfo.getDefaultInstance() : dummyInfo;
            }

            @Override // com.garmin.proto.generated.PSASample.AlertDetailsOrBuilder
            public ByteString getTestData() {
                return this.testData_;
            }

            @Override // com.garmin.proto.generated.PSASample.AlertDetailsOrBuilder
            public boolean hasDummyInfo() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.PSASample.AlertDetailsOrBuilder
            public boolean hasTestData() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PSASample.internal_static_GDI_Proto_PSASample_AlertDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertDetails.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDummyInfo(DummyInfo dummyInfo) {
                DummyInfo dummyInfo2;
                SingleFieldBuilderV3<DummyInfo, DummyInfo.Builder, DummyInfoOrBuilder> singleFieldBuilderV3 = this.dummyInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dummyInfo);
                } else if ((this.bitField0_ & 2) == 0 || (dummyInfo2 = this.dummyInfo_) == null || dummyInfo2 == DummyInfo.getDefaultInstance()) {
                    this.dummyInfo_ = dummyInfo;
                } else {
                    getDummyInfoBuilder().mergeFrom(dummyInfo);
                }
                if (this.dummyInfo_ != null) {
                    this.bitField0_ |= 2;
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
                                    this.testData_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getDummyInfoFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setDummyInfo(DummyInfo.Builder builder) {
                SingleFieldBuilderV3<DummyInfo, DummyInfo.Builder, DummyInfoOrBuilder> singleFieldBuilderV3 = this.dummyInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dummyInfo_ = builder.build();
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
                maybeForceBuilderInitialization();
            }

            public Builder setDummyInfo(DummyInfo dummyInfo) {
                SingleFieldBuilderV3<DummyInfo, DummyInfo.Builder, DummyInfoOrBuilder> singleFieldBuilderV3 = this.dummyInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dummyInfo.getClass();
                    this.dummyInfo_ = dummyInfo;
                } else {
                    singleFieldBuilderV3.setMessage(dummyInfo);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
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
                if (alertDetails.hasDummyInfo()) {
                    mergeDummyInfo(alertDetails.getDummyInfo());
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

        public /* synthetic */ AlertDetails(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlertDetails parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private AlertDetails() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.testData_ = byteString;
        }

        public static AlertDetails parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlertDetails parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AlertDetails parseFrom(InputStream inputStream) {
            return (AlertDetails) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
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

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 1001;
        public static final int PSA_SAMPLE_CAPABILITIES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private PSASampleCapabilities psaSampleCapabilities_;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.PSASample.CapabilitiesResponse.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesResponse> featuresResponse = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesResponse.class, getDefaultInstance());

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PSASample.internal_static_GDI_Proto_PSASample_CapabilitiesResponse_descriptor;
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
            if (hasPsaSampleCapabilities() != capabilitiesResponse.hasPsaSampleCapabilities()) {
                return false;
            }
            return (!hasPsaSampleCapabilities() || getPsaSampleCapabilities().equals(capabilitiesResponse.getPsaSampleCapabilities())) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.PSASample.CapabilitiesResponseOrBuilder
        public PSASampleCapabilities getPsaSampleCapabilities() {
            PSASampleCapabilities pSASampleCapabilities = this.psaSampleCapabilities_;
            return pSASampleCapabilities == null ? PSASampleCapabilities.getDefaultInstance() : pSASampleCapabilities;
        }

        @Override // com.garmin.proto.generated.PSASample.CapabilitiesResponseOrBuilder
        public PSASampleCapabilitiesOrBuilder getPsaSampleCapabilitiesOrBuilder() {
            PSASampleCapabilities pSASampleCapabilities = this.psaSampleCapabilities_;
            return pSASampleCapabilities == null ? PSASampleCapabilities.getDefaultInstance() : pSASampleCapabilities;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getPsaSampleCapabilities()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.PSASample.CapabilitiesResponseOrBuilder
        public boolean hasPsaSampleCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPsaSampleCapabilities()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPsaSampleCapabilities().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PSASample.internal_static_GDI_Proto_PSASample_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getPsaSampleCapabilities());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<PSASampleCapabilities, PSASampleCapabilities.Builder, PSASampleCapabilitiesOrBuilder> psaSampleCapabilitiesBuilder_;
            private PSASampleCapabilities psaSampleCapabilities_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<PSASampleCapabilities, PSASampleCapabilities.Builder, PSASampleCapabilitiesOrBuilder> singleFieldBuilderV3 = this.psaSampleCapabilitiesBuilder_;
                    capabilitiesResponse.psaSampleCapabilities_ = singleFieldBuilderV3 == null ? this.psaSampleCapabilities_ : (PSASampleCapabilities) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PSASample.internal_static_GDI_Proto_PSASample_CapabilitiesResponse_descriptor;
            }

            private SingleFieldBuilderV3<PSASampleCapabilities, PSASampleCapabilities.Builder, PSASampleCapabilitiesOrBuilder> getPsaSampleCapabilitiesFieldBuilder() {
                if (this.psaSampleCapabilitiesBuilder_ == null) {
                    this.psaSampleCapabilitiesBuilder_ = new SingleFieldBuilderV3<>(getPsaSampleCapabilities(), getParentForChildren(), isClean());
                    this.psaSampleCapabilities_ = null;
                }
                return this.psaSampleCapabilitiesBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPsaSampleCapabilitiesFieldBuilder();
                }
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
                this.psaSampleCapabilities_ = null;
                SingleFieldBuilderV3<PSASampleCapabilities, PSASampleCapabilities.Builder, PSASampleCapabilitiesOrBuilder> singleFieldBuilderV3 = this.psaSampleCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.psaSampleCapabilitiesBuilder_ = null;
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

            public Builder clearPsaSampleCapabilities() {
                this.bitField0_ &= -2;
                this.psaSampleCapabilities_ = null;
                SingleFieldBuilderV3<PSASampleCapabilities, PSASampleCapabilities.Builder, PSASampleCapabilitiesOrBuilder> singleFieldBuilderV3 = this.psaSampleCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.psaSampleCapabilitiesBuilder_ = null;
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
                return PSASample.internal_static_GDI_Proto_PSASample_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.PSASample.CapabilitiesResponseOrBuilder
            public PSASampleCapabilities getPsaSampleCapabilities() {
                SingleFieldBuilderV3<PSASampleCapabilities, PSASampleCapabilities.Builder, PSASampleCapabilitiesOrBuilder> singleFieldBuilderV3 = this.psaSampleCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PSASampleCapabilities) singleFieldBuilderV3.getMessage();
                }
                PSASampleCapabilities pSASampleCapabilities = this.psaSampleCapabilities_;
                return pSASampleCapabilities == null ? PSASampleCapabilities.getDefaultInstance() : pSASampleCapabilities;
            }

            public PSASampleCapabilities.Builder getPsaSampleCapabilitiesBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (PSASampleCapabilities.Builder) getPsaSampleCapabilitiesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.PSASample.CapabilitiesResponseOrBuilder
            public PSASampleCapabilitiesOrBuilder getPsaSampleCapabilitiesOrBuilder() {
                SingleFieldBuilderV3<PSASampleCapabilities, PSASampleCapabilities.Builder, PSASampleCapabilitiesOrBuilder> singleFieldBuilderV3 = this.psaSampleCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PSASampleCapabilitiesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PSASampleCapabilities pSASampleCapabilities = this.psaSampleCapabilities_;
                return pSASampleCapabilities == null ? PSASampleCapabilities.getDefaultInstance() : pSASampleCapabilities;
            }

            @Override // com.garmin.proto.generated.PSASample.CapabilitiesResponseOrBuilder
            public boolean hasPsaSampleCapabilities() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PSASample.internal_static_GDI_Proto_PSASample_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                                    codedInputStream.readMessage(getPsaSampleCapabilitiesFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergePsaSampleCapabilities(PSASampleCapabilities pSASampleCapabilities) {
                PSASampleCapabilities pSASampleCapabilities2;
                SingleFieldBuilderV3<PSASampleCapabilities, PSASampleCapabilities.Builder, PSASampleCapabilitiesOrBuilder> singleFieldBuilderV3 = this.psaSampleCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(pSASampleCapabilities);
                } else if ((this.bitField0_ & 1) == 0 || (pSASampleCapabilities2 = this.psaSampleCapabilities_) == null || pSASampleCapabilities2 == PSASampleCapabilities.getDefaultInstance()) {
                    this.psaSampleCapabilities_ = pSASampleCapabilities;
                } else {
                    getPsaSampleCapabilitiesBuilder().mergeFrom(pSASampleCapabilities);
                }
                if (this.psaSampleCapabilities_ != null) {
                    this.bitField0_ |= 1;
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

            public Builder setPsaSampleCapabilities(PSASampleCapabilities.Builder builder) {
                SingleFieldBuilderV3<PSASampleCapabilities, PSASampleCapabilities.Builder, PSASampleCapabilitiesOrBuilder> singleFieldBuilderV3 = this.psaSampleCapabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.psaSampleCapabilities_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
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
            public CapabilitiesResponse getDefaultInstanceForType() {
                return CapabilitiesResponse.getDefaultInstance();
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

            public Builder setPsaSampleCapabilities(PSASampleCapabilities pSASampleCapabilities) {
                SingleFieldBuilderV3<PSASampleCapabilities, PSASampleCapabilities.Builder, PSASampleCapabilitiesOrBuilder> singleFieldBuilderV3 = this.psaSampleCapabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    pSASampleCapabilities.getClass();
                    this.psaSampleCapabilities_ = pSASampleCapabilities;
                } else {
                    singleFieldBuilderV3.setMessage(pSASampleCapabilities);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
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
                if (capabilitiesResponse.hasPsaSampleCapabilities()) {
                    mergePsaSampleCapabilities(capabilitiesResponse.getPsaSampleCapabilities());
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

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CapabilitiesResponse() {
            this.memoizedIsInitialized = (byte) -1;
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

        public static CapabilitiesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
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

    public static final class DummyInfo extends GeneratedMessageV3 implements DummyInfoOrBuilder {
        public static final int DUMMY_TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int dummyType_;
        private byte memoizedIsInitialized;
        private static final DummyInfo DEFAULT_INSTANCE = new DummyInfo();

        @Deprecated
        public static final Parser<DummyInfo> PARSER = new AbstractParser<DummyInfo>() { // from class: com.garmin.proto.generated.PSASample.DummyInfo.1
            @Override // com.google.protobuf.Parser
            public DummyInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DummyInfo.newBuilder();
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

        private DummyInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.dummyType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DummyInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PSASample.internal_static_GDI_Proto_PSASample_DummyInfo_descriptor;
        }

        public static Builder newBuilder(DummyInfo dummyInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dummyInfo);
        }

        public static DummyInfo parseDelimitedFrom(InputStream inputStream) {
            return (DummyInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DummyInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DummyInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DummyInfo)) {
                return super.equals(obj);
            }
            DummyInfo dummyInfo = (DummyInfo) obj;
            if (hasDummyType() != dummyInfo.hasDummyType()) {
                return false;
            }
            return (!hasDummyType() || this.dummyType_ == dummyInfo.dummyType_) && getUnknownFields().equals(dummyInfo.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.PSASample.DummyInfoOrBuilder
        public DummyInfoType getDummyType() {
            DummyInfoType dummyInfoTypeForNumber = DummyInfoType.forNumber(this.dummyType_);
            return dummyInfoTypeForNumber == null ? DummyInfoType.DUMMY0 : dummyInfoTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DummyInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.dummyType_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.PSASample.DummyInfoOrBuilder
        public boolean hasDummyType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDummyType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.dummyType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PSASample.internal_static_GDI_Proto_PSASample_DummyInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(DummyInfo.class, Builder.class);
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
            return new DummyInfo();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.dummyType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DummyInfoOrBuilder {
            private int bitField0_;
            private int dummyType_;

            private Builder() {
                this.dummyType_ = 0;
            }

            private void buildPartial0(DummyInfo dummyInfo) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    dummyInfo.dummyType_ = this.dummyType_;
                } else {
                    i14 = 0;
                }
                dummyInfo.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PSASample.internal_static_GDI_Proto_PSASample_DummyInfo_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DummyInfo build() {
                DummyInfo dummyInfoBuildPartial = buildPartial();
                if (dummyInfoBuildPartial.isInitialized()) {
                    return dummyInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dummyInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DummyInfo buildPartial() {
                DummyInfo dummyInfo = new DummyInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dummyInfo);
                }
                onBuilt();
                return dummyInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.dummyType_ = 0;
                return this;
            }

            public Builder clearDummyType() {
                this.bitField0_ &= -2;
                this.dummyType_ = 0;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return PSASample.internal_static_GDI_Proto_PSASample_DummyInfo_descriptor;
            }

            @Override // com.garmin.proto.generated.PSASample.DummyInfoOrBuilder
            public DummyInfoType getDummyType() {
                DummyInfoType dummyInfoTypeForNumber = DummyInfoType.forNumber(this.dummyType_);
                return dummyInfoTypeForNumber == null ? DummyInfoType.DUMMY0 : dummyInfoTypeForNumber;
            }

            @Override // com.garmin.proto.generated.PSASample.DummyInfoOrBuilder
            public boolean hasDummyType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PSASample.internal_static_GDI_Proto_PSASample_DummyInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(DummyInfo.class, Builder.class);
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
                                    if (DummyInfoType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.dummyType_ = i14;
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

            public Builder setDummyType(DummyInfoType dummyInfoType) {
                dummyInfoType.getClass();
                this.bitField0_ |= 1;
                this.dummyType_ = dummyInfoType.getNumber();
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
            public DummyInfo getDefaultInstanceForType() {
                return DummyInfo.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.dummyType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DummyInfo) {
                    return mergeFrom((DummyInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DummyInfo dummyInfo) {
                if (dummyInfo == DummyInfo.getDefaultInstance()) {
                    return this;
                }
                if (dummyInfo.hasDummyType()) {
                    setDummyType(dummyInfo.getDummyType());
                }
                mergeUnknownFields(dummyInfo.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DummyInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DummyInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DummyInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DummyInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DummyInfo(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DummyInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DummyInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.dummyType_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DummyInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DummyInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DummyInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DummyInfo parseFrom(InputStream inputStream) {
            return (DummyInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DummyInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DummyInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DummyInfo parseFrom(CodedInputStream codedInputStream) {
            return (DummyInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DummyInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DummyInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum DummyInfoType implements ProtocolMessageEnum {
            DUMMY0(0),
            DUMMY1(1);

            public static final int DUMMY0_VALUE = 0;
            public static final int DUMMY1_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<DummyInfoType> internalValueMap = new Internal.EnumLiteMap<DummyInfoType>() { // from class: com.garmin.proto.generated.PSASample.DummyInfo.DummyInfoType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public DummyInfoType findValueByNumber(int i14) {
                    return DummyInfoType.forNumber(i14);
                }
            };
            private static final DummyInfoType[] VALUES = values();

            DummyInfoType(int i14) {
                this.value = i14;
            }

            public static DummyInfoType forNumber(int i14) {
                if (i14 == 0) {
                    return DUMMY0;
                }
                if (i14 != 1) {
                    return null;
                }
                return DUMMY1;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return DummyInfo.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<DummyInfoType> internalGetValueMap() {
                return internalValueMap;
            }

            public static DummyInfoType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static DummyInfoType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class SampleNotification extends GeneratedMessageV3 implements SampleNotificationOrBuilder {
        public static final int MSG_FIELD_NUMBER = 1;
        public static final int SAMPLE_INT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString msg_;
        private int sampleInt_;
        private static final SampleNotification DEFAULT_INSTANCE = new SampleNotification();

        @Deprecated
        public static final Parser<SampleNotification> PARSER = new AbstractParser<SampleNotification>() { // from class: com.garmin.proto.generated.PSASample.SampleNotification.1
            @Override // com.google.protobuf.Parser
            public SampleNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SampleNotification.newBuilder();
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

        private SampleNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.msg_ = ByteString.EMPTY;
            this.sampleInt_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SampleNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PSASample.internal_static_GDI_Proto_PSASample_SampleNotification_descriptor;
        }

        public static Builder newBuilder(SampleNotification sampleNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sampleNotification);
        }

        public static SampleNotification parseDelimitedFrom(InputStream inputStream) {
            return (SampleNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SampleNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SampleNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SampleNotification)) {
                return super.equals(obj);
            }
            SampleNotification sampleNotification = (SampleNotification) obj;
            if (hasMsg() != sampleNotification.hasMsg()) {
                return false;
            }
            if ((!hasMsg() || getMsg().equals(sampleNotification.getMsg())) && hasSampleInt() == sampleNotification.hasSampleInt()) {
                return (!hasSampleInt() || getSampleInt() == sampleNotification.getSampleInt()) && getUnknownFields().equals(sampleNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.PSASample.SampleNotificationOrBuilder
        public ByteString getMsg() {
            return this.msg_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SampleNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.PSASample.SampleNotificationOrBuilder
        public int getSampleInt() {
            return this.sampleInt_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.msg_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeUInt32Size(2, this.sampleInt_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.PSASample.SampleNotificationOrBuilder
        public boolean hasMsg() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.PSASample.SampleNotificationOrBuilder
        public boolean hasSampleInt() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMsg()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMsg().hashCode();
            }
            if (hasSampleInt()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSampleInt();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PSASample.internal_static_GDI_Proto_PSASample_SampleNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SampleNotification.class, Builder.class);
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
            return new SampleNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.msg_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.sampleInt_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SampleNotificationOrBuilder {
            private int bitField0_;
            private ByteString msg_;
            private int sampleInt_;

            private Builder() {
                this.msg_ = ByteString.EMPTY;
            }

            private void buildPartial0(SampleNotification sampleNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    sampleNotification.msg_ = this.msg_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    sampleNotification.sampleInt_ = this.sampleInt_;
                    i14 |= 2;
                }
                sampleNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PSASample.internal_static_GDI_Proto_PSASample_SampleNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SampleNotification build() {
                SampleNotification sampleNotificationBuildPartial = buildPartial();
                if (sampleNotificationBuildPartial.isInitialized()) {
                    return sampleNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sampleNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SampleNotification buildPartial() {
                SampleNotification sampleNotification = new SampleNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sampleNotification);
                }
                onBuilt();
                return sampleNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.msg_ = ByteString.EMPTY;
                this.sampleInt_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMsg() {
                this.bitField0_ &= -2;
                this.msg_ = SampleNotification.getDefaultInstance().getMsg();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSampleInt() {
                this.bitField0_ &= -3;
                this.sampleInt_ = 0;
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
                return PSASample.internal_static_GDI_Proto_PSASample_SampleNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.PSASample.SampleNotificationOrBuilder
            public ByteString getMsg() {
                return this.msg_;
            }

            @Override // com.garmin.proto.generated.PSASample.SampleNotificationOrBuilder
            public int getSampleInt() {
                return this.sampleInt_;
            }

            @Override // com.garmin.proto.generated.PSASample.SampleNotificationOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.PSASample.SampleNotificationOrBuilder
            public boolean hasSampleInt() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PSASample.internal_static_GDI_Proto_PSASample_SampleNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SampleNotification.class, Builder.class);
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
                                    this.msg_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.sampleInt_ = codedInputStream.readUInt32();
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

            public Builder setMsg(ByteString byteString) {
                byteString.getClass();
                this.msg_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSampleInt(int i14) {
                this.sampleInt_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SampleNotification getDefaultInstanceForType() {
                return SampleNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.msg_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SampleNotification) {
                    return mergeFrom((SampleNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SampleNotification sampleNotification) {
                if (sampleNotification == SampleNotification.getDefaultInstance()) {
                    return this;
                }
                if (sampleNotification.hasMsg()) {
                    setMsg(sampleNotification.getMsg());
                }
                if (sampleNotification.hasSampleInt()) {
                    setSampleInt(sampleNotification.getSampleInt());
                }
                mergeUnknownFields(sampleNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SampleNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SampleNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SampleNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SampleNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SampleNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SampleNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SampleNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SampleNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ SampleNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SampleNotification parseFrom(InputStream inputStream) {
            return (SampleNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private SampleNotification() {
            ByteString byteString = ByteString.EMPTY;
            this.sampleInt_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.msg_ = byteString;
        }

        public static SampleNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SampleNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SampleNotification parseFrom(CodedInputStream codedInputStream) {
            return (SampleNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SampleNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SampleNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SampleRequest extends GeneratedMessageV3 implements SampleRequestOrBuilder {
        public static final int MSG_FIELD_NUMBER = 1;
        public static final int SAMPLE_INT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString msg_;
        private int sampleInt_;
        private static final SampleRequest DEFAULT_INSTANCE = new SampleRequest();

        @Deprecated
        public static final Parser<SampleRequest> PARSER = new AbstractParser<SampleRequest>() { // from class: com.garmin.proto.generated.PSASample.SampleRequest.1
            @Override // com.google.protobuf.Parser
            public SampleRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SampleRequest.newBuilder();
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

        private SampleRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.msg_ = ByteString.EMPTY;
            this.sampleInt_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SampleRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PSASample.internal_static_GDI_Proto_PSASample_SampleRequest_descriptor;
        }

        public static Builder newBuilder(SampleRequest sampleRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sampleRequest);
        }

        public static SampleRequest parseDelimitedFrom(InputStream inputStream) {
            return (SampleRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SampleRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SampleRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SampleRequest)) {
                return super.equals(obj);
            }
            SampleRequest sampleRequest = (SampleRequest) obj;
            if (hasMsg() != sampleRequest.hasMsg()) {
                return false;
            }
            if ((!hasMsg() || getMsg().equals(sampleRequest.getMsg())) && hasSampleInt() == sampleRequest.hasSampleInt()) {
                return (!hasSampleInt() || getSampleInt() == sampleRequest.getSampleInt()) && getUnknownFields().equals(sampleRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.PSASample.SampleRequestOrBuilder
        public ByteString getMsg() {
            return this.msg_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SampleRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.PSASample.SampleRequestOrBuilder
        public int getSampleInt() {
            return this.sampleInt_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.msg_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeUInt32Size(2, this.sampleInt_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.PSASample.SampleRequestOrBuilder
        public boolean hasMsg() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.PSASample.SampleRequestOrBuilder
        public boolean hasSampleInt() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMsg()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMsg().hashCode();
            }
            if (hasSampleInt()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSampleInt();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PSASample.internal_static_GDI_Proto_PSASample_SampleRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SampleRequest.class, Builder.class);
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
            return new SampleRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.msg_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.sampleInt_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SampleRequestOrBuilder {
            private int bitField0_;
            private ByteString msg_;
            private int sampleInt_;

            private Builder() {
                this.msg_ = ByteString.EMPTY;
            }

            private void buildPartial0(SampleRequest sampleRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    sampleRequest.msg_ = this.msg_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    sampleRequest.sampleInt_ = this.sampleInt_;
                    i14 |= 2;
                }
                sampleRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PSASample.internal_static_GDI_Proto_PSASample_SampleRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SampleRequest build() {
                SampleRequest sampleRequestBuildPartial = buildPartial();
                if (sampleRequestBuildPartial.isInitialized()) {
                    return sampleRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sampleRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SampleRequest buildPartial() {
                SampleRequest sampleRequest = new SampleRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sampleRequest);
                }
                onBuilt();
                return sampleRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.msg_ = ByteString.EMPTY;
                this.sampleInt_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMsg() {
                this.bitField0_ &= -2;
                this.msg_ = SampleRequest.getDefaultInstance().getMsg();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSampleInt() {
                this.bitField0_ &= -3;
                this.sampleInt_ = 0;
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
                return PSASample.internal_static_GDI_Proto_PSASample_SampleRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.PSASample.SampleRequestOrBuilder
            public ByteString getMsg() {
                return this.msg_;
            }

            @Override // com.garmin.proto.generated.PSASample.SampleRequestOrBuilder
            public int getSampleInt() {
                return this.sampleInt_;
            }

            @Override // com.garmin.proto.generated.PSASample.SampleRequestOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.PSASample.SampleRequestOrBuilder
            public boolean hasSampleInt() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PSASample.internal_static_GDI_Proto_PSASample_SampleRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SampleRequest.class, Builder.class);
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
                                    this.msg_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.sampleInt_ = codedInputStream.readUInt32();
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

            public Builder setMsg(ByteString byteString) {
                byteString.getClass();
                this.msg_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSampleInt(int i14) {
                this.sampleInt_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SampleRequest getDefaultInstanceForType() {
                return SampleRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.msg_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SampleRequest) {
                    return mergeFrom((SampleRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SampleRequest sampleRequest) {
                if (sampleRequest == SampleRequest.getDefaultInstance()) {
                    return this;
                }
                if (sampleRequest.hasMsg()) {
                    setMsg(sampleRequest.getMsg());
                }
                if (sampleRequest.hasSampleInt()) {
                    setSampleInt(sampleRequest.getSampleInt());
                }
                mergeUnknownFields(sampleRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SampleRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SampleRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SampleRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SampleRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SampleRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SampleRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SampleRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SampleRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ SampleRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SampleRequest parseFrom(InputStream inputStream) {
            return (SampleRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private SampleRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.sampleInt_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.msg_ = byteString;
        }

        public static SampleRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SampleRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SampleRequest parseFrom(CodedInputStream codedInputStream) {
            return (SampleRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SampleRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SampleRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SampleResponse extends GeneratedMessageV3 implements SampleResponseOrBuilder {
        public static final int MSG_FIELD_NUMBER = 1;
        public static final int SAMPLE_INT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString msg_;
        private int sampleInt_;
        private static final SampleResponse DEFAULT_INSTANCE = new SampleResponse();

        @Deprecated
        public static final Parser<SampleResponse> PARSER = new AbstractParser<SampleResponse>() { // from class: com.garmin.proto.generated.PSASample.SampleResponse.1
            @Override // com.google.protobuf.Parser
            public SampleResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SampleResponse.newBuilder();
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

        private SampleResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.msg_ = ByteString.EMPTY;
            this.sampleInt_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SampleResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PSASample.internal_static_GDI_Proto_PSASample_SampleResponse_descriptor;
        }

        public static Builder newBuilder(SampleResponse sampleResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sampleResponse);
        }

        public static SampleResponse parseDelimitedFrom(InputStream inputStream) {
            return (SampleResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SampleResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SampleResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SampleResponse)) {
                return super.equals(obj);
            }
            SampleResponse sampleResponse = (SampleResponse) obj;
            if (hasMsg() != sampleResponse.hasMsg()) {
                return false;
            }
            if ((!hasMsg() || getMsg().equals(sampleResponse.getMsg())) && hasSampleInt() == sampleResponse.hasSampleInt()) {
                return (!hasSampleInt() || getSampleInt() == sampleResponse.getSampleInt()) && getUnknownFields().equals(sampleResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.PSASample.SampleResponseOrBuilder
        public ByteString getMsg() {
            return this.msg_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SampleResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.PSASample.SampleResponseOrBuilder
        public int getSampleInt() {
            return this.sampleInt_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.msg_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeUInt32Size(2, this.sampleInt_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.PSASample.SampleResponseOrBuilder
        public boolean hasMsg() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.PSASample.SampleResponseOrBuilder
        public boolean hasSampleInt() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMsg()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMsg().hashCode();
            }
            if (hasSampleInt()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSampleInt();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PSASample.internal_static_GDI_Proto_PSASample_SampleResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SampleResponse.class, Builder.class);
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
            return new SampleResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.msg_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.sampleInt_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SampleResponseOrBuilder {
            private int bitField0_;
            private ByteString msg_;
            private int sampleInt_;

            private Builder() {
                this.msg_ = ByteString.EMPTY;
            }

            private void buildPartial0(SampleResponse sampleResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    sampleResponse.msg_ = this.msg_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    sampleResponse.sampleInt_ = this.sampleInt_;
                    i14 |= 2;
                }
                sampleResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PSASample.internal_static_GDI_Proto_PSASample_SampleResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SampleResponse build() {
                SampleResponse sampleResponseBuildPartial = buildPartial();
                if (sampleResponseBuildPartial.isInitialized()) {
                    return sampleResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sampleResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SampleResponse buildPartial() {
                SampleResponse sampleResponse = new SampleResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sampleResponse);
                }
                onBuilt();
                return sampleResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.msg_ = ByteString.EMPTY;
                this.sampleInt_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMsg() {
                this.bitField0_ &= -2;
                this.msg_ = SampleResponse.getDefaultInstance().getMsg();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSampleInt() {
                this.bitField0_ &= -3;
                this.sampleInt_ = 0;
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
                return PSASample.internal_static_GDI_Proto_PSASample_SampleResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.PSASample.SampleResponseOrBuilder
            public ByteString getMsg() {
                return this.msg_;
            }

            @Override // com.garmin.proto.generated.PSASample.SampleResponseOrBuilder
            public int getSampleInt() {
                return this.sampleInt_;
            }

            @Override // com.garmin.proto.generated.PSASample.SampleResponseOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.PSASample.SampleResponseOrBuilder
            public boolean hasSampleInt() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PSASample.internal_static_GDI_Proto_PSASample_SampleResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SampleResponse.class, Builder.class);
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
                                    this.msg_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.sampleInt_ = codedInputStream.readUInt32();
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

            public Builder setMsg(ByteString byteString) {
                byteString.getClass();
                this.msg_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSampleInt(int i14) {
                this.sampleInt_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SampleResponse getDefaultInstanceForType() {
                return SampleResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.msg_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SampleResponse) {
                    return mergeFrom((SampleResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SampleResponse sampleResponse) {
                if (sampleResponse == SampleResponse.getDefaultInstance()) {
                    return this;
                }
                if (sampleResponse.hasMsg()) {
                    setMsg(sampleResponse.getMsg());
                }
                if (sampleResponse.hasSampleInt()) {
                    setSampleInt(sampleResponse.getSampleInt());
                }
                mergeUnknownFields(sampleResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SampleResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SampleResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SampleResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SampleResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SampleResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SampleResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SampleResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SampleResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ SampleResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SampleResponse parseFrom(InputStream inputStream) {
            return (SampleResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private SampleResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.sampleInt_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.msg_ = byteString;
        }

        public static SampleResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SampleResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SampleResponse parseFrom(CodedInputStream codedInputStream) {
            return (SampleResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SampleResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SampleResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.PSASample.Service.1
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
        public static final int SAMPLE_NOTIFICATION_FIELD_NUMBER = 1;
        public static final int SAMPLE_REQUEST_FIELD_NUMBER = 2;
        public static final int SAMPLE_RESPONSE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SampleNotification sampleNotification_;
        private SampleRequest sampleRequest_;
        private SampleResponse sampleResponse_;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PSASample.internal_static_GDI_Proto_PSASample_Service_descriptor;
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
            if (hasSampleNotification() != service.hasSampleNotification()) {
                return false;
            }
            if ((hasSampleNotification() && !getSampleNotification().equals(service.getSampleNotification())) || hasSampleRequest() != service.hasSampleRequest()) {
                return false;
            }
            if ((!hasSampleRequest() || getSampleRequest().equals(service.getSampleRequest())) && hasSampleResponse() == service.hasSampleResponse()) {
                return (!hasSampleResponse() || getSampleResponse().equals(service.getSampleResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Service> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
        public SampleNotification getSampleNotification() {
            SampleNotification sampleNotification = this.sampleNotification_;
            return sampleNotification == null ? SampleNotification.getDefaultInstance() : sampleNotification;
        }

        @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
        public SampleNotificationOrBuilder getSampleNotificationOrBuilder() {
            SampleNotification sampleNotification = this.sampleNotification_;
            return sampleNotification == null ? SampleNotification.getDefaultInstance() : sampleNotification;
        }

        @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
        public SampleRequest getSampleRequest() {
            SampleRequest sampleRequest = this.sampleRequest_;
            return sampleRequest == null ? SampleRequest.getDefaultInstance() : sampleRequest;
        }

        @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
        public SampleRequestOrBuilder getSampleRequestOrBuilder() {
            SampleRequest sampleRequest = this.sampleRequest_;
            return sampleRequest == null ? SampleRequest.getDefaultInstance() : sampleRequest;
        }

        @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
        public SampleResponse getSampleResponse() {
            SampleResponse sampleResponse = this.sampleResponse_;
            return sampleResponse == null ? SampleResponse.getDefaultInstance() : sampleResponse;
        }

        @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
        public SampleResponseOrBuilder getSampleResponseOrBuilder() {
            SampleResponse sampleResponse = this.sampleResponse_;
            return sampleResponse == null ? SampleResponse.getDefaultInstance() : sampleResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSampleNotification()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSampleRequest());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getSampleResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
        public boolean hasSampleNotification() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
        public boolean hasSampleRequest() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
        public boolean hasSampleResponse() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSampleNotification()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSampleNotification().hashCode();
            }
            if (hasSampleRequest()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSampleRequest().hashCode();
            }
            if (hasSampleResponse()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSampleResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PSASample.internal_static_GDI_Proto_PSASample_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getSampleNotification());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSampleRequest());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getSampleResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SampleNotification, SampleNotification.Builder, SampleNotificationOrBuilder> sampleNotificationBuilder_;
            private SampleNotification sampleNotification_;
            private SingleFieldBuilderV3<SampleRequest, SampleRequest.Builder, SampleRequestOrBuilder> sampleRequestBuilder_;
            private SampleRequest sampleRequest_;
            private SingleFieldBuilderV3<SampleResponse, SampleResponse.Builder, SampleResponseOrBuilder> sampleResponseBuilder_;
            private SampleResponse sampleResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SampleNotification, SampleNotification.Builder, SampleNotificationOrBuilder> singleFieldBuilderV3 = this.sampleNotificationBuilder_;
                    service.sampleNotification_ = singleFieldBuilderV3 == null ? this.sampleNotification_ : (SampleNotification) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SampleRequest, SampleRequest.Builder, SampleRequestOrBuilder> singleFieldBuilderV4 = this.sampleRequestBuilder_;
                    service.sampleRequest_ = singleFieldBuilderV4 == null ? this.sampleRequest_ : (SampleRequest) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<SampleResponse, SampleResponse.Builder, SampleResponseOrBuilder> singleFieldBuilderV5 = this.sampleResponseBuilder_;
                    service.sampleResponse_ = singleFieldBuilderV5 == null ? this.sampleResponse_ : (SampleResponse) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PSASample.internal_static_GDI_Proto_PSASample_Service_descriptor;
            }

            private SingleFieldBuilderV3<SampleNotification, SampleNotification.Builder, SampleNotificationOrBuilder> getSampleNotificationFieldBuilder() {
                if (this.sampleNotificationBuilder_ == null) {
                    this.sampleNotificationBuilder_ = new SingleFieldBuilderV3<>(getSampleNotification(), getParentForChildren(), isClean());
                    this.sampleNotification_ = null;
                }
                return this.sampleNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SampleRequest, SampleRequest.Builder, SampleRequestOrBuilder> getSampleRequestFieldBuilder() {
                if (this.sampleRequestBuilder_ == null) {
                    this.sampleRequestBuilder_ = new SingleFieldBuilderV3<>(getSampleRequest(), getParentForChildren(), isClean());
                    this.sampleRequest_ = null;
                }
                return this.sampleRequestBuilder_;
            }

            private SingleFieldBuilderV3<SampleResponse, SampleResponse.Builder, SampleResponseOrBuilder> getSampleResponseFieldBuilder() {
                if (this.sampleResponseBuilder_ == null) {
                    this.sampleResponseBuilder_ = new SingleFieldBuilderV3<>(getSampleResponse(), getParentForChildren(), isClean());
                    this.sampleResponse_ = null;
                }
                return this.sampleResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSampleNotificationFieldBuilder();
                    getSampleRequestFieldBuilder();
                    getSampleResponseFieldBuilder();
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
                this.sampleNotification_ = null;
                SingleFieldBuilderV3<SampleNotification, SampleNotification.Builder, SampleNotificationOrBuilder> singleFieldBuilderV3 = this.sampleNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sampleNotificationBuilder_ = null;
                }
                this.sampleRequest_ = null;
                SingleFieldBuilderV3<SampleRequest, SampleRequest.Builder, SampleRequestOrBuilder> singleFieldBuilderV4 = this.sampleRequestBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.sampleRequestBuilder_ = null;
                }
                this.sampleResponse_ = null;
                SingleFieldBuilderV3<SampleResponse, SampleResponse.Builder, SampleResponseOrBuilder> singleFieldBuilderV5 = this.sampleResponseBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.sampleResponseBuilder_ = null;
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

            public Builder clearSampleNotification() {
                this.bitField0_ &= -2;
                this.sampleNotification_ = null;
                SingleFieldBuilderV3<SampleNotification, SampleNotification.Builder, SampleNotificationOrBuilder> singleFieldBuilderV3 = this.sampleNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sampleNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSampleRequest() {
                this.bitField0_ &= -3;
                this.sampleRequest_ = null;
                SingleFieldBuilderV3<SampleRequest, SampleRequest.Builder, SampleRequestOrBuilder> singleFieldBuilderV3 = this.sampleRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sampleRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSampleResponse() {
                this.bitField0_ &= -5;
                this.sampleResponse_ = null;
                SingleFieldBuilderV3<SampleResponse, SampleResponse.Builder, SampleResponseOrBuilder> singleFieldBuilderV3 = this.sampleResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sampleResponseBuilder_ = null;
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
                return PSASample.internal_static_GDI_Proto_PSASample_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
            public SampleNotification getSampleNotification() {
                SingleFieldBuilderV3<SampleNotification, SampleNotification.Builder, SampleNotificationOrBuilder> singleFieldBuilderV3 = this.sampleNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SampleNotification) singleFieldBuilderV3.getMessage();
                }
                SampleNotification sampleNotification = this.sampleNotification_;
                return sampleNotification == null ? SampleNotification.getDefaultInstance() : sampleNotification;
            }

            public SampleNotification.Builder getSampleNotificationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SampleNotification.Builder) getSampleNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
            public SampleNotificationOrBuilder getSampleNotificationOrBuilder() {
                SingleFieldBuilderV3<SampleNotification, SampleNotification.Builder, SampleNotificationOrBuilder> singleFieldBuilderV3 = this.sampleNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SampleNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SampleNotification sampleNotification = this.sampleNotification_;
                return sampleNotification == null ? SampleNotification.getDefaultInstance() : sampleNotification;
            }

            @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
            public SampleRequest getSampleRequest() {
                SingleFieldBuilderV3<SampleRequest, SampleRequest.Builder, SampleRequestOrBuilder> singleFieldBuilderV3 = this.sampleRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SampleRequest) singleFieldBuilderV3.getMessage();
                }
                SampleRequest sampleRequest = this.sampleRequest_;
                return sampleRequest == null ? SampleRequest.getDefaultInstance() : sampleRequest;
            }

            public SampleRequest.Builder getSampleRequestBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SampleRequest.Builder) getSampleRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
            public SampleRequestOrBuilder getSampleRequestOrBuilder() {
                SingleFieldBuilderV3<SampleRequest, SampleRequest.Builder, SampleRequestOrBuilder> singleFieldBuilderV3 = this.sampleRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SampleRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SampleRequest sampleRequest = this.sampleRequest_;
                return sampleRequest == null ? SampleRequest.getDefaultInstance() : sampleRequest;
            }

            @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
            public SampleResponse getSampleResponse() {
                SingleFieldBuilderV3<SampleResponse, SampleResponse.Builder, SampleResponseOrBuilder> singleFieldBuilderV3 = this.sampleResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SampleResponse) singleFieldBuilderV3.getMessage();
                }
                SampleResponse sampleResponse = this.sampleResponse_;
                return sampleResponse == null ? SampleResponse.getDefaultInstance() : sampleResponse;
            }

            public SampleResponse.Builder getSampleResponseBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SampleResponse.Builder) getSampleResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
            public SampleResponseOrBuilder getSampleResponseOrBuilder() {
                SingleFieldBuilderV3<SampleResponse, SampleResponse.Builder, SampleResponseOrBuilder> singleFieldBuilderV3 = this.sampleResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SampleResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SampleResponse sampleResponse = this.sampleResponse_;
                return sampleResponse == null ? SampleResponse.getDefaultInstance() : sampleResponse;
            }

            @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
            public boolean hasSampleNotification() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
            public boolean hasSampleRequest() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.PSASample.ServiceOrBuilder
            public boolean hasSampleResponse() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PSASample.internal_static_GDI_Proto_PSASample_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                                    codedInputStream.readMessage(getSampleNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSampleRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getSampleResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSampleNotification(SampleNotification sampleNotification) {
                SampleNotification sampleNotification2;
                SingleFieldBuilderV3<SampleNotification, SampleNotification.Builder, SampleNotificationOrBuilder> singleFieldBuilderV3 = this.sampleNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sampleNotification);
                } else if ((this.bitField0_ & 1) == 0 || (sampleNotification2 = this.sampleNotification_) == null || sampleNotification2 == SampleNotification.getDefaultInstance()) {
                    this.sampleNotification_ = sampleNotification;
                } else {
                    getSampleNotificationBuilder().mergeFrom(sampleNotification);
                }
                if (this.sampleNotification_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSampleRequest(SampleRequest sampleRequest) {
                SampleRequest sampleRequest2;
                SingleFieldBuilderV3<SampleRequest, SampleRequest.Builder, SampleRequestOrBuilder> singleFieldBuilderV3 = this.sampleRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sampleRequest);
                } else if ((this.bitField0_ & 2) == 0 || (sampleRequest2 = this.sampleRequest_) == null || sampleRequest2 == SampleRequest.getDefaultInstance()) {
                    this.sampleRequest_ = sampleRequest;
                } else {
                    getSampleRequestBuilder().mergeFrom(sampleRequest);
                }
                if (this.sampleRequest_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSampleResponse(SampleResponse sampleResponse) {
                SampleResponse sampleResponse2;
                SingleFieldBuilderV3<SampleResponse, SampleResponse.Builder, SampleResponseOrBuilder> singleFieldBuilderV3 = this.sampleResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sampleResponse);
                } else if ((this.bitField0_ & 4) == 0 || (sampleResponse2 = this.sampleResponse_) == null || sampleResponse2 == SampleResponse.getDefaultInstance()) {
                    this.sampleResponse_ = sampleResponse;
                } else {
                    getSampleResponseBuilder().mergeFrom(sampleResponse);
                }
                if (this.sampleResponse_ != null) {
                    this.bitField0_ |= 4;
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

            public Builder setSampleNotification(SampleNotification.Builder builder) {
                SingleFieldBuilderV3<SampleNotification, SampleNotification.Builder, SampleNotificationOrBuilder> singleFieldBuilderV3 = this.sampleNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sampleNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSampleRequest(SampleRequest.Builder builder) {
                SingleFieldBuilderV3<SampleRequest, SampleRequest.Builder, SampleRequestOrBuilder> singleFieldBuilderV3 = this.sampleRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sampleRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSampleResponse(SampleResponse.Builder builder) {
                SingleFieldBuilderV3<SampleResponse, SampleResponse.Builder, SampleResponseOrBuilder> singleFieldBuilderV3 = this.sampleResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sampleResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
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

            public Builder setSampleNotification(SampleNotification sampleNotification) {
                SingleFieldBuilderV3<SampleNotification, SampleNotification.Builder, SampleNotificationOrBuilder> singleFieldBuilderV3 = this.sampleNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sampleNotification.getClass();
                    this.sampleNotification_ = sampleNotification;
                } else {
                    singleFieldBuilderV3.setMessage(sampleNotification);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSampleRequest(SampleRequest sampleRequest) {
                SingleFieldBuilderV3<SampleRequest, SampleRequest.Builder, SampleRequestOrBuilder> singleFieldBuilderV3 = this.sampleRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sampleRequest.getClass();
                    this.sampleRequest_ = sampleRequest;
                } else {
                    singleFieldBuilderV3.setMessage(sampleRequest);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSampleResponse(SampleResponse sampleResponse) {
                SingleFieldBuilderV3<SampleResponse, SampleResponse.Builder, SampleResponseOrBuilder> singleFieldBuilderV3 = this.sampleResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sampleResponse.getClass();
                    this.sampleResponse_ = sampleResponse;
                } else {
                    singleFieldBuilderV3.setMessage(sampleResponse);
                }
                this.bitField0_ |= 4;
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
                if (service.hasSampleNotification()) {
                    mergeSampleNotification(service.getSampleNotification());
                }
                if (service.hasSampleRequest()) {
                    mergeSampleRequest(service.getSampleRequest());
                }
                if (service.hasSampleResponse()) {
                    mergeSampleResponse(service.getSampleResponse());
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

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}

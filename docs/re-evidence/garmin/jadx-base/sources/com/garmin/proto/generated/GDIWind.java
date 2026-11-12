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
public final class GDIWind {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rGDIWind.proto\u0012\u000eGDI.Proto.Wind\u001a\u0012GDIDataTypes.proto\"\u0087\u0001\n\u000bWindService\u0012:\n\u0011wind_data_request\u0018\u0001 \u0001(\u000b2\u001f.GDI.Proto.Wind.WindDataRequest\u0012<\n\u0012wind_data_response\u0018\u0002 \u0001(\u000b2 .GDI.Proto.Wind.WindDataResponse\"I\n\u000fWindDataRequest\u00126\n\u0010current_location\u0018\u0001 \u0001(\u000b2\u001c.GDI.Proto.DataTypes.ScPoint\"Ý\u0002\n\u0010WindDataResponse\u0012?\n\u0006status\u0018\u0001 \u0002(\u000e2/.GDI.Proto.Wind.WindDataResponse.ResponseStatus\u0012\u0013\n\u000bwind_origin\u0018\u0002 \u0001(\u0005\u0012\u0014\n\fwind_heading\u0018\u0003 \u0001(\u0005\u0012E\n\u0016wind_compass_direction\u0018\u0004 \u0001(\u000e2%.GDI.Proto.DataTypes.CompassDirection\u0012\u0012\n\nwind_speed\u0018\u0005 \u0001(\u0001\"\u0081\u0001\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0014\n\u0010DATA_UNAVAILABLE\u0010\u0002\u0012\u0011\n\rNETWORK_ERROR\u0010\u0003\u0012!\n\u001dMOBILE_LOCATION_NOT_AVAILABLE\u0010\u0004B'\n\u001acom.garmin.proto.generatedB\u0007GDIWindH\u0003"}, new Descriptors.FileDescriptor[]{GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Wind_WindDataRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Wind_WindDataRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Wind_WindDataResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Wind_WindDataResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Wind_WindService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Wind_WindService_fieldAccessorTable;

    public interface WindDataRequestOrBuilder extends MessageOrBuilder {
        GDIDataTypes.ScPoint getCurrentLocation();

        GDIDataTypes.ScPointOrBuilder getCurrentLocationOrBuilder();

        boolean hasCurrentLocation();
    }

    public interface WindDataResponseOrBuilder extends MessageOrBuilder {
        WindDataResponse.ResponseStatus getStatus();

        GDIDataTypes.CompassDirection getWindCompassDirection();

        int getWindHeading();

        int getWindOrigin();

        double getWindSpeed();

        boolean hasStatus();

        boolean hasWindCompassDirection();

        boolean hasWindHeading();

        boolean hasWindOrigin();

        boolean hasWindSpeed();
    }

    public interface WindServiceOrBuilder extends MessageOrBuilder {
        WindDataRequest getWindDataRequest();

        WindDataRequestOrBuilder getWindDataRequestOrBuilder();

        WindDataResponse getWindDataResponse();

        WindDataResponseOrBuilder getWindDataResponseOrBuilder();

        boolean hasWindDataRequest();

        boolean hasWindDataResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_Wind_WindService_descriptor = descriptor2;
        internal_static_GDI_Proto_Wind_WindService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"WindDataRequest", "WindDataResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_Wind_WindDataRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_Wind_WindDataRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"CurrentLocation"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_Wind_WindDataResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_Wind_WindDataResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status", "WindOrigin", "WindHeading", "WindCompassDirection", "WindSpeed"});
        GDIDataTypes.getDescriptor();
    }

    private GDIWind() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class WindDataRequest extends GeneratedMessageV3 implements WindDataRequestOrBuilder {
        public static final int CURRENT_LOCATION_FIELD_NUMBER = 1;
        private static final WindDataRequest DEFAULT_INSTANCE = new WindDataRequest();

        @Deprecated
        public static final Parser<WindDataRequest> PARSER = new AbstractParser<WindDataRequest>() { // from class: com.garmin.proto.generated.GDIWind.WindDataRequest.1
            @Override // com.google.protobuf.Parser
            public WindDataRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WindDataRequest.newBuilder();
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
        private int bitField0_;
        private GDIDataTypes.ScPoint currentLocation_;
        private byte memoizedIsInitialized;

        private WindDataRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WindDataRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWind.internal_static_GDI_Proto_Wind_WindDataRequest_descriptor;
        }

        public static Builder newBuilder(WindDataRequest windDataRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(windDataRequest);
        }

        public static WindDataRequest parseDelimitedFrom(InputStream inputStream) {
            return (WindDataRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WindDataRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WindDataRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WindDataRequest)) {
                return super.equals(obj);
            }
            WindDataRequest windDataRequest = (WindDataRequest) obj;
            if (hasCurrentLocation() != windDataRequest.hasCurrentLocation()) {
                return false;
            }
            return (!hasCurrentLocation() || getCurrentLocation().equals(windDataRequest.getCurrentLocation())) && getUnknownFields().equals(windDataRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWind.WindDataRequestOrBuilder
        public GDIDataTypes.ScPoint getCurrentLocation() {
            GDIDataTypes.ScPoint scPoint = this.currentLocation_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindDataRequestOrBuilder
        public GDIDataTypes.ScPointOrBuilder getCurrentLocationOrBuilder() {
            GDIDataTypes.ScPoint scPoint = this.currentLocation_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WindDataRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCurrentLocation()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindDataRequestOrBuilder
        public boolean hasCurrentLocation() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCurrentLocation()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCurrentLocation().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWind.internal_static_GDI_Proto_Wind_WindDataRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(WindDataRequest.class, Builder.class);
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
            if (!hasCurrentLocation() || getCurrentLocation().isInitialized()) {
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
            return new WindDataRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getCurrentLocation());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WindDataRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> currentLocationBuilder_;
            private GDIDataTypes.ScPoint currentLocation_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(WindDataRequest windDataRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.currentLocationBuilder_;
                    windDataRequest.currentLocation_ = singleFieldBuilderV3 == null ? this.currentLocation_ : (GDIDataTypes.ScPoint) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                windDataRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> getCurrentLocationFieldBuilder() {
                if (this.currentLocationBuilder_ == null) {
                    this.currentLocationBuilder_ = new SingleFieldBuilderV3<>(getCurrentLocation(), getParentForChildren(), isClean());
                    this.currentLocation_ = null;
                }
                return this.currentLocationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWind.internal_static_GDI_Proto_Wind_WindDataRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCurrentLocationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WindDataRequest build() {
                WindDataRequest windDataRequestBuildPartial = buildPartial();
                if (windDataRequestBuildPartial.isInitialized()) {
                    return windDataRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) windDataRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WindDataRequest buildPartial() {
                WindDataRequest windDataRequest = new WindDataRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(windDataRequest);
                }
                onBuilt();
                return windDataRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.currentLocation_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.currentLocationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.currentLocationBuilder_ = null;
                }
                return this;
            }

            public Builder clearCurrentLocation() {
                this.bitField0_ &= -2;
                this.currentLocation_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.currentLocationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.currentLocationBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIWind.WindDataRequestOrBuilder
            public GDIDataTypes.ScPoint getCurrentLocation() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.currentLocationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPoint) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.ScPoint scPoint = this.currentLocation_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            public GDIDataTypes.ScPoint.Builder getCurrentLocationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.ScPoint.Builder) getCurrentLocationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWind.WindDataRequestOrBuilder
            public GDIDataTypes.ScPointOrBuilder getCurrentLocationOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.currentLocationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.ScPoint scPoint = this.currentLocation_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIWind.internal_static_GDI_Proto_Wind_WindDataRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWind.WindDataRequestOrBuilder
            public boolean hasCurrentLocation() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWind.internal_static_GDI_Proto_Wind_WindDataRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(WindDataRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasCurrentLocation() || getCurrentLocation().isInitialized();
            }

            public Builder mergeCurrentLocation(GDIDataTypes.ScPoint scPoint) {
                GDIDataTypes.ScPoint scPoint2;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.currentLocationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(scPoint);
                } else if ((this.bitField0_ & 1) == 0 || (scPoint2 = this.currentLocation_) == null || scPoint2 == GDIDataTypes.ScPoint.getDefaultInstance()) {
                    this.currentLocation_ = scPoint;
                } else {
                    getCurrentLocationBuilder().mergeFrom(scPoint);
                }
                if (this.currentLocation_ != null) {
                    this.bitField0_ |= 1;
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
                                    codedInputStream.readMessage(getCurrentLocationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setCurrentLocation(GDIDataTypes.ScPoint.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.currentLocationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.currentLocation_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
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

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WindDataRequest getDefaultInstanceForType() {
                return WindDataRequest.getDefaultInstance();
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

            public Builder setCurrentLocation(GDIDataTypes.ScPoint scPoint) {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.currentLocationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    scPoint.getClass();
                    this.currentLocation_ = scPoint;
                } else {
                    singleFieldBuilderV3.setMessage(scPoint);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WindDataRequest) {
                    return mergeFrom((WindDataRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WindDataRequest windDataRequest) {
                if (windDataRequest == WindDataRequest.getDefaultInstance()) {
                    return this;
                }
                if (windDataRequest.hasCurrentLocation()) {
                    mergeCurrentLocation(windDataRequest.getCurrentLocation());
                }
                mergeUnknownFields(windDataRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WindDataRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ WindDataRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private WindDataRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WindDataRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WindDataRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WindDataRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WindDataRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WindDataRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WindDataRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WindDataRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WindDataRequest parseFrom(InputStream inputStream) {
            return (WindDataRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WindDataRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WindDataRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WindDataRequest parseFrom(CodedInputStream codedInputStream) {
            return (WindDataRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WindDataRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WindDataRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WindDataResponse extends GeneratedMessageV3 implements WindDataResponseOrBuilder {
        private static final WindDataResponse DEFAULT_INSTANCE = new WindDataResponse();

        @Deprecated
        public static final Parser<WindDataResponse> PARSER = new AbstractParser<WindDataResponse>() { // from class: com.garmin.proto.generated.GDIWind.WindDataResponse.1
            @Override // com.google.protobuf.Parser
            public WindDataResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WindDataResponse.newBuilder();
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
        public static final int WIND_COMPASS_DIRECTION_FIELD_NUMBER = 4;
        public static final int WIND_HEADING_FIELD_NUMBER = 3;
        public static final int WIND_ORIGIN_FIELD_NUMBER = 2;
        public static final int WIND_SPEED_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;
        private int windCompassDirection_;
        private int windHeading_;
        private int windOrigin_;
        private double windSpeed_;

        private WindDataResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.windOrigin_ = 0;
            this.windHeading_ = 0;
            this.windCompassDirection_ = 0;
            this.windSpeed_ = 0.0d;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WindDataResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWind.internal_static_GDI_Proto_Wind_WindDataResponse_descriptor;
        }

        public static Builder newBuilder(WindDataResponse windDataResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(windDataResponse);
        }

        public static WindDataResponse parseDelimitedFrom(InputStream inputStream) {
            return (WindDataResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WindDataResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WindDataResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WindDataResponse)) {
                return super.equals(obj);
            }
            WindDataResponse windDataResponse = (WindDataResponse) obj;
            if (hasStatus() != windDataResponse.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != windDataResponse.status_) || hasWindOrigin() != windDataResponse.hasWindOrigin()) {
                return false;
            }
            if ((hasWindOrigin() && getWindOrigin() != windDataResponse.getWindOrigin()) || hasWindHeading() != windDataResponse.hasWindHeading()) {
                return false;
            }
            if ((hasWindHeading() && getWindHeading() != windDataResponse.getWindHeading()) || hasWindCompassDirection() != windDataResponse.hasWindCompassDirection()) {
                return false;
            }
            if ((!hasWindCompassDirection() || this.windCompassDirection_ == windDataResponse.windCompassDirection_) && hasWindSpeed() == windDataResponse.hasWindSpeed()) {
                return (!hasWindSpeed() || Double.doubleToLongBits(getWindSpeed()) == Double.doubleToLongBits(windDataResponse.getWindSpeed())) && getUnknownFields().equals(windDataResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WindDataResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeInt32Size(2, this.windOrigin_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeInt32Size(3, this.windHeading_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(4, this.windCompassDirection_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeDoubleSize(5, this.windSpeed_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
        public GDIDataTypes.CompassDirection getWindCompassDirection() {
            GDIDataTypes.CompassDirection compassDirectionForNumber = GDIDataTypes.CompassDirection.forNumber(this.windCompassDirection_);
            return compassDirectionForNumber == null ? GDIDataTypes.CompassDirection.NORTH : compassDirectionForNumber;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
        public int getWindHeading() {
            return this.windHeading_;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
        public int getWindOrigin() {
            return this.windOrigin_;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
        public double getWindSpeed() {
            return this.windSpeed_;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
        public boolean hasWindCompassDirection() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
        public boolean hasWindHeading() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
        public boolean hasWindOrigin() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
        public boolean hasWindSpeed() {
            return (this.bitField0_ & 16) != 0;
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
            if (hasWindOrigin()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getWindOrigin();
            }
            if (hasWindHeading()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getWindHeading();
            }
            if (hasWindCompassDirection()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.windCompassDirection_;
            }
            if (hasWindSpeed()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashLong(Double.doubleToLongBits(getWindSpeed()));
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWind.internal_static_GDI_Proto_Wind_WindDataResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(WindDataResponse.class, Builder.class);
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
            if (hasStatus()) {
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
            return new WindDataResponse();
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
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeInt32(2, this.windOrigin_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeInt32(3, this.windHeading_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.windCompassDirection_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeDouble(5, this.windSpeed_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WindDataResponseOrBuilder {
            private int bitField0_;
            private int status_;
            private int windCompassDirection_;
            private int windHeading_;
            private int windOrigin_;
            private double windSpeed_;

            private Builder() {
                this.status_ = 0;
                this.windCompassDirection_ = 0;
            }

            private void buildPartial0(WindDataResponse windDataResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    windDataResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    windDataResponse.windOrigin_ = this.windOrigin_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    windDataResponse.windHeading_ = this.windHeading_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    windDataResponse.windCompassDirection_ = this.windCompassDirection_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    windDataResponse.windSpeed_ = this.windSpeed_;
                    i14 |= 16;
                }
                windDataResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWind.internal_static_GDI_Proto_Wind_WindDataResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WindDataResponse build() {
                WindDataResponse windDataResponseBuildPartial = buildPartial();
                if (windDataResponseBuildPartial.isInitialized()) {
                    return windDataResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) windDataResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WindDataResponse buildPartial() {
                WindDataResponse windDataResponse = new WindDataResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(windDataResponse);
                }
                onBuilt();
                return windDataResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.windOrigin_ = 0;
                this.windHeading_ = 0;
                this.windCompassDirection_ = 0;
                this.windSpeed_ = 0.0d;
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

            public Builder clearWindCompassDirection() {
                this.bitField0_ &= -9;
                this.windCompassDirection_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWindHeading() {
                this.bitField0_ &= -5;
                this.windHeading_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWindOrigin() {
                this.bitField0_ &= -3;
                this.windOrigin_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWindSpeed() {
                this.bitField0_ &= -17;
                this.windSpeed_ = 0.0d;
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
                return GDIWind.internal_static_GDI_Proto_Wind_WindDataResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
            public GDIDataTypes.CompassDirection getWindCompassDirection() {
                GDIDataTypes.CompassDirection compassDirectionForNumber = GDIDataTypes.CompassDirection.forNumber(this.windCompassDirection_);
                return compassDirectionForNumber == null ? GDIDataTypes.CompassDirection.NORTH : compassDirectionForNumber;
            }

            @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
            public int getWindHeading() {
                return this.windHeading_;
            }

            @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
            public int getWindOrigin() {
                return this.windOrigin_;
            }

            @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
            public double getWindSpeed() {
                return this.windSpeed_;
            }

            @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
            public boolean hasWindCompassDirection() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
            public boolean hasWindHeading() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
            public boolean hasWindOrigin() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWind.WindDataResponseOrBuilder
            public boolean hasWindSpeed() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWind.internal_static_GDI_Proto_Wind_WindDataResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(WindDataResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus();
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
                                } else if (tag == 16) {
                                    this.windOrigin_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.windHeading_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    int i15 = codedInputStream.readEnum();
                                    if (GDIDataTypes.CompassDirection.forNumber(i15) == null) {
                                        mergeUnknownVarintField(4, i15);
                                    } else {
                                        this.windCompassDirection_ = i15;
                                        this.bitField0_ |= 8;
                                    }
                                } else if (tag == 41) {
                                    this.windSpeed_ = codedInputStream.readDouble();
                                    this.bitField0_ |= 16;
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

            public Builder setWindCompassDirection(GDIDataTypes.CompassDirection compassDirection) {
                compassDirection.getClass();
                this.bitField0_ |= 8;
                this.windCompassDirection_ = compassDirection.getNumber();
                onChanged();
                return this;
            }

            public Builder setWindHeading(int i14) {
                this.windHeading_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setWindOrigin(int i14) {
                this.windOrigin_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setWindSpeed(double d14) {
                this.windSpeed_ = d14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WindDataResponse getDefaultInstanceForType() {
                return WindDataResponse.getDefaultInstance();
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
                this.windCompassDirection_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WindDataResponse) {
                    return mergeFrom((WindDataResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WindDataResponse windDataResponse) {
                if (windDataResponse == WindDataResponse.getDefaultInstance()) {
                    return this;
                }
                if (windDataResponse.hasStatus()) {
                    setStatus(windDataResponse.getStatus());
                }
                if (windDataResponse.hasWindOrigin()) {
                    setWindOrigin(windDataResponse.getWindOrigin());
                }
                if (windDataResponse.hasWindHeading()) {
                    setWindHeading(windDataResponse.getWindHeading());
                }
                if (windDataResponse.hasWindCompassDirection()) {
                    setWindCompassDirection(windDataResponse.getWindCompassDirection());
                }
                if (windDataResponse.hasWindSpeed()) {
                    setWindSpeed(windDataResponse.getWindSpeed());
                }
                mergeUnknownFields(windDataResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WindDataResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static WindDataResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WindDataResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WindDataResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WindDataResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WindDataResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WindDataResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WindDataResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WindDataResponse parseFrom(InputStream inputStream) {
            return (WindDataResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WindDataResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WindDataResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WindDataResponse parseFrom(CodedInputStream codedInputStream) {
            return (WindDataResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ WindDataResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static WindDataResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WindDataResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private WindDataResponse() {
            this.windOrigin_ = 0;
            this.windHeading_ = 0;
            this.windSpeed_ = 0.0d;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.windCompassDirection_ = 0;
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(1),
            DATA_UNAVAILABLE(2),
            NETWORK_ERROR(3),
            MOBILE_LOCATION_NOT_AVAILABLE(4);

            public static final int DATA_UNAVAILABLE_VALUE = 2;
            public static final int MOBILE_LOCATION_NOT_AVAILABLE_VALUE = 4;
            public static final int NETWORK_ERROR_VALUE = 3;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIWind.WindDataResponse.ResponseStatus.1
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
                    return UNKNOWN_RESPONSE_STATUS;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 == 2) {
                    return DATA_UNAVAILABLE;
                }
                if (i14 == 3) {
                    return NETWORK_ERROR;
                }
                if (i14 != 4) {
                    return null;
                }
                return MOBILE_LOCATION_NOT_AVAILABLE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return WindDataResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class WindService extends GeneratedMessageV3 implements WindServiceOrBuilder {
        private static final WindService DEFAULT_INSTANCE = new WindService();

        @Deprecated
        public static final Parser<WindService> PARSER = new AbstractParser<WindService>() { // from class: com.garmin.proto.generated.GDIWind.WindService.1
            @Override // com.google.protobuf.Parser
            public WindService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WindService.newBuilder();
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
        public static final int WIND_DATA_REQUEST_FIELD_NUMBER = 1;
        public static final int WIND_DATA_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private WindDataRequest windDataRequest_;
        private WindDataResponse windDataResponse_;

        private WindService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WindService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWind.internal_static_GDI_Proto_Wind_WindService_descriptor;
        }

        public static Builder newBuilder(WindService windService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(windService);
        }

        public static WindService parseDelimitedFrom(InputStream inputStream) {
            return (WindService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WindService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WindService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WindService)) {
                return super.equals(obj);
            }
            WindService windService = (WindService) obj;
            if (hasWindDataRequest() != windService.hasWindDataRequest()) {
                return false;
            }
            if ((!hasWindDataRequest() || getWindDataRequest().equals(windService.getWindDataRequest())) && hasWindDataResponse() == windService.hasWindDataResponse()) {
                return (!hasWindDataResponse() || getWindDataResponse().equals(windService.getWindDataResponse())) && getUnknownFields().equals(windService.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WindService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getWindDataRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getWindDataResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindServiceOrBuilder
        public WindDataRequest getWindDataRequest() {
            WindDataRequest windDataRequest = this.windDataRequest_;
            return windDataRequest == null ? WindDataRequest.getDefaultInstance() : windDataRequest;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindServiceOrBuilder
        public WindDataRequestOrBuilder getWindDataRequestOrBuilder() {
            WindDataRequest windDataRequest = this.windDataRequest_;
            return windDataRequest == null ? WindDataRequest.getDefaultInstance() : windDataRequest;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindServiceOrBuilder
        public WindDataResponse getWindDataResponse() {
            WindDataResponse windDataResponse = this.windDataResponse_;
            return windDataResponse == null ? WindDataResponse.getDefaultInstance() : windDataResponse;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindServiceOrBuilder
        public WindDataResponseOrBuilder getWindDataResponseOrBuilder() {
            WindDataResponse windDataResponse = this.windDataResponse_;
            return windDataResponse == null ? WindDataResponse.getDefaultInstance() : windDataResponse;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindServiceOrBuilder
        public boolean hasWindDataRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWind.WindServiceOrBuilder
        public boolean hasWindDataResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasWindDataRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getWindDataRequest().hashCode();
            }
            if (hasWindDataResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getWindDataResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWind.internal_static_GDI_Proto_Wind_WindService_fieldAccessorTable.ensureFieldAccessorsInitialized(WindService.class, Builder.class);
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
            if (hasWindDataRequest() && !getWindDataRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasWindDataResponse() || getWindDataResponse().isInitialized()) {
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
            return new WindService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getWindDataRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getWindDataResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WindServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<WindDataRequest, WindDataRequest.Builder, WindDataRequestOrBuilder> windDataRequestBuilder_;
            private WindDataRequest windDataRequest_;
            private SingleFieldBuilderV3<WindDataResponse, WindDataResponse.Builder, WindDataResponseOrBuilder> windDataResponseBuilder_;
            private WindDataResponse windDataResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(WindService windService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<WindDataRequest, WindDataRequest.Builder, WindDataRequestOrBuilder> singleFieldBuilderV3 = this.windDataRequestBuilder_;
                    windService.windDataRequest_ = singleFieldBuilderV3 == null ? this.windDataRequest_ : (WindDataRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<WindDataResponse, WindDataResponse.Builder, WindDataResponseOrBuilder> singleFieldBuilderV4 = this.windDataResponseBuilder_;
                    windService.windDataResponse_ = singleFieldBuilderV4 == null ? this.windDataResponse_ : (WindDataResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                windService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWind.internal_static_GDI_Proto_Wind_WindService_descriptor;
            }

            private SingleFieldBuilderV3<WindDataRequest, WindDataRequest.Builder, WindDataRequestOrBuilder> getWindDataRequestFieldBuilder() {
                if (this.windDataRequestBuilder_ == null) {
                    this.windDataRequestBuilder_ = new SingleFieldBuilderV3<>(getWindDataRequest(), getParentForChildren(), isClean());
                    this.windDataRequest_ = null;
                }
                return this.windDataRequestBuilder_;
            }

            private SingleFieldBuilderV3<WindDataResponse, WindDataResponse.Builder, WindDataResponseOrBuilder> getWindDataResponseFieldBuilder() {
                if (this.windDataResponseBuilder_ == null) {
                    this.windDataResponseBuilder_ = new SingleFieldBuilderV3<>(getWindDataResponse(), getParentForChildren(), isClean());
                    this.windDataResponse_ = null;
                }
                return this.windDataResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getWindDataRequestFieldBuilder();
                    getWindDataResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WindService build() {
                WindService windServiceBuildPartial = buildPartial();
                if (windServiceBuildPartial.isInitialized()) {
                    return windServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) windServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WindService buildPartial() {
                WindService windService = new WindService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(windService);
                }
                onBuilt();
                return windService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.windDataRequest_ = null;
                SingleFieldBuilderV3<WindDataRequest, WindDataRequest.Builder, WindDataRequestOrBuilder> singleFieldBuilderV3 = this.windDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.windDataRequestBuilder_ = null;
                }
                this.windDataResponse_ = null;
                SingleFieldBuilderV3<WindDataResponse, WindDataResponse.Builder, WindDataResponseOrBuilder> singleFieldBuilderV4 = this.windDataResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.windDataResponseBuilder_ = null;
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

            public Builder clearWindDataRequest() {
                this.bitField0_ &= -2;
                this.windDataRequest_ = null;
                SingleFieldBuilderV3<WindDataRequest, WindDataRequest.Builder, WindDataRequestOrBuilder> singleFieldBuilderV3 = this.windDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.windDataRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearWindDataResponse() {
                this.bitField0_ &= -3;
                this.windDataResponse_ = null;
                SingleFieldBuilderV3<WindDataResponse, WindDataResponse.Builder, WindDataResponseOrBuilder> singleFieldBuilderV3 = this.windDataResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.windDataResponseBuilder_ = null;
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
                return GDIWind.internal_static_GDI_Proto_Wind_WindService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWind.WindServiceOrBuilder
            public WindDataRequest getWindDataRequest() {
                SingleFieldBuilderV3<WindDataRequest, WindDataRequest.Builder, WindDataRequestOrBuilder> singleFieldBuilderV3 = this.windDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WindDataRequest) singleFieldBuilderV3.getMessage();
                }
                WindDataRequest windDataRequest = this.windDataRequest_;
                return windDataRequest == null ? WindDataRequest.getDefaultInstance() : windDataRequest;
            }

            public WindDataRequest.Builder getWindDataRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (WindDataRequest.Builder) getWindDataRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWind.WindServiceOrBuilder
            public WindDataRequestOrBuilder getWindDataRequestOrBuilder() {
                SingleFieldBuilderV3<WindDataRequest, WindDataRequest.Builder, WindDataRequestOrBuilder> singleFieldBuilderV3 = this.windDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WindDataRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WindDataRequest windDataRequest = this.windDataRequest_;
                return windDataRequest == null ? WindDataRequest.getDefaultInstance() : windDataRequest;
            }

            @Override // com.garmin.proto.generated.GDIWind.WindServiceOrBuilder
            public WindDataResponse getWindDataResponse() {
                SingleFieldBuilderV3<WindDataResponse, WindDataResponse.Builder, WindDataResponseOrBuilder> singleFieldBuilderV3 = this.windDataResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WindDataResponse) singleFieldBuilderV3.getMessage();
                }
                WindDataResponse windDataResponse = this.windDataResponse_;
                return windDataResponse == null ? WindDataResponse.getDefaultInstance() : windDataResponse;
            }

            public WindDataResponse.Builder getWindDataResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (WindDataResponse.Builder) getWindDataResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWind.WindServiceOrBuilder
            public WindDataResponseOrBuilder getWindDataResponseOrBuilder() {
                SingleFieldBuilderV3<WindDataResponse, WindDataResponse.Builder, WindDataResponseOrBuilder> singleFieldBuilderV3 = this.windDataResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WindDataResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WindDataResponse windDataResponse = this.windDataResponse_;
                return windDataResponse == null ? WindDataResponse.getDefaultInstance() : windDataResponse;
            }

            @Override // com.garmin.proto.generated.GDIWind.WindServiceOrBuilder
            public boolean hasWindDataRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWind.WindServiceOrBuilder
            public boolean hasWindDataResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWind.internal_static_GDI_Proto_Wind_WindService_fieldAccessorTable.ensureFieldAccessorsInitialized(WindService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasWindDataRequest() || getWindDataRequest().isInitialized()) {
                    return !hasWindDataResponse() || getWindDataResponse().isInitialized();
                }
                return false;
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
                                    codedInputStream.readMessage(getWindDataRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getWindDataResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeWindDataRequest(WindDataRequest windDataRequest) {
                WindDataRequest windDataRequest2;
                SingleFieldBuilderV3<WindDataRequest, WindDataRequest.Builder, WindDataRequestOrBuilder> singleFieldBuilderV3 = this.windDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(windDataRequest);
                } else if ((this.bitField0_ & 1) == 0 || (windDataRequest2 = this.windDataRequest_) == null || windDataRequest2 == WindDataRequest.getDefaultInstance()) {
                    this.windDataRequest_ = windDataRequest;
                } else {
                    getWindDataRequestBuilder().mergeFrom(windDataRequest);
                }
                if (this.windDataRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeWindDataResponse(WindDataResponse windDataResponse) {
                WindDataResponse windDataResponse2;
                SingleFieldBuilderV3<WindDataResponse, WindDataResponse.Builder, WindDataResponseOrBuilder> singleFieldBuilderV3 = this.windDataResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(windDataResponse);
                } else if ((this.bitField0_ & 2) == 0 || (windDataResponse2 = this.windDataResponse_) == null || windDataResponse2 == WindDataResponse.getDefaultInstance()) {
                    this.windDataResponse_ = windDataResponse;
                } else {
                    getWindDataResponseBuilder().mergeFrom(windDataResponse);
                }
                if (this.windDataResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
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

            public Builder setWindDataRequest(WindDataRequest.Builder builder) {
                SingleFieldBuilderV3<WindDataRequest, WindDataRequest.Builder, WindDataRequestOrBuilder> singleFieldBuilderV3 = this.windDataRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.windDataRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setWindDataResponse(WindDataResponse.Builder builder) {
                SingleFieldBuilderV3<WindDataResponse, WindDataResponse.Builder, WindDataResponseOrBuilder> singleFieldBuilderV3 = this.windDataResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.windDataResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WindService getDefaultInstanceForType() {
                return WindService.getDefaultInstance();
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

            public Builder setWindDataRequest(WindDataRequest windDataRequest) {
                SingleFieldBuilderV3<WindDataRequest, WindDataRequest.Builder, WindDataRequestOrBuilder> singleFieldBuilderV3 = this.windDataRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    windDataRequest.getClass();
                    this.windDataRequest_ = windDataRequest;
                } else {
                    singleFieldBuilderV3.setMessage(windDataRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setWindDataResponse(WindDataResponse windDataResponse) {
                SingleFieldBuilderV3<WindDataResponse, WindDataResponse.Builder, WindDataResponseOrBuilder> singleFieldBuilderV3 = this.windDataResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    windDataResponse.getClass();
                    this.windDataResponse_ = windDataResponse;
                } else {
                    singleFieldBuilderV3.setMessage(windDataResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WindService) {
                    return mergeFrom((WindService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WindService windService) {
                if (windService == WindService.getDefaultInstance()) {
                    return this;
                }
                if (windService.hasWindDataRequest()) {
                    mergeWindDataRequest(windService.getWindDataRequest());
                }
                if (windService.hasWindDataResponse()) {
                    mergeWindDataResponse(windService.getWindDataResponse());
                }
                mergeUnknownFields(windService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WindService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ WindService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private WindService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WindService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WindService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WindService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WindService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WindService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WindService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WindService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WindService parseFrom(InputStream inputStream) {
            return (WindService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WindService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WindService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WindService parseFrom(CodedInputStream codedInputStream) {
            return (WindService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WindService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WindService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}

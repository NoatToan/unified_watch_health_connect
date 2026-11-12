package com.garmin.gcsprotos.generated;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class GpsEphemerisProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012gpsEphemeris.proto\u0012\u0010CSM.Proto.GpsFix\u001a\u000fdataTypes.proto\u001a\fgpsFix.proto\"d\n\u0013GPSEphemerisRequest\u00128\n\u000fgps_fix_request\u0018\u0001 \u0001(\u000b2\u001f.CSM.Proto.GpsFix.GpsFixRequest\u0012\u0013\n\u000bepo_gps_hrs\u0018\u0002 \u0003(\u0004\"\u0089\u0001\n\u0014GPSEphemerisResponse\u0012:\n\u0010gps_fix_response\u0018\u0001 \u0001(\u000b2 .CSM.Proto.GpsFix.GpsFixResponse\u00125\n\repo_ephemeris\u0018\u0002 \u0003(\u000b2\u001e.CSM.Proto.GpsFix.EPOEphemeris\"-\n\fEPOEphemeris\u0012\u000f\n\u0007gps_hrs\u0018\u0001 \u0001(\u0003\u0012\f\n\u0004data\u0018\u0002 \u0001(\fB5\n\u001ecom.garmin.gcsprotos.generatedB\u0011GpsEphemerisProtoH\u0003"}, new Descriptors.FileDescriptor[]{DataTypesProto.getDescriptor(), GpsFixProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_CSM_Proto_GpsFix_EPOEphemeris_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_GpsFix_EPOEphemeris_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_GpsFix_GPSEphemerisRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_GpsFix_GPSEphemerisRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_GpsFix_GPSEphemerisResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_GpsFix_GPSEphemerisResponse_fieldAccessorTable;

    public interface EPOEphemerisOrBuilder extends MessageOrBuilder {
        ByteString getData();

        long getGpsHrs();

        boolean hasData();

        boolean hasGpsHrs();
    }

    public interface GPSEphemerisRequestOrBuilder extends MessageOrBuilder {
        long getEpoGpsHrs(int i14);

        int getEpoGpsHrsCount();

        List<Long> getEpoGpsHrsList();

        GpsFixProto.GpsFixRequest getGpsFixRequest();

        GpsFixProto.GpsFixRequestOrBuilder getGpsFixRequestOrBuilder();

        boolean hasGpsFixRequest();
    }

    public interface GPSEphemerisResponseOrBuilder extends MessageOrBuilder {
        EPOEphemeris getEpoEphemeris(int i14);

        int getEpoEphemerisCount();

        List<EPOEphemeris> getEpoEphemerisList();

        EPOEphemerisOrBuilder getEpoEphemerisOrBuilder(int i14);

        List<? extends EPOEphemerisOrBuilder> getEpoEphemerisOrBuilderList();

        GpsFixProto.GpsFixResponse getGpsFixResponse();

        GpsFixProto.GpsFixResponseOrBuilder getGpsFixResponseOrBuilder();

        boolean hasGpsFixResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_CSM_Proto_GpsFix_GPSEphemerisRequest_descriptor = descriptor2;
        internal_static_CSM_Proto_GpsFix_GPSEphemerisRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"GpsFixRequest", "EpoGpsHrs"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_CSM_Proto_GpsFix_GPSEphemerisResponse_descriptor = descriptor3;
        internal_static_CSM_Proto_GpsFix_GPSEphemerisResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"GpsFixResponse", "EpoEphemeris"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_CSM_Proto_GpsFix_EPOEphemeris_descriptor = descriptor4;
        internal_static_CSM_Proto_GpsFix_EPOEphemeris_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"GpsHrs", "Data"});
        DataTypesProto.getDescriptor();
        GpsFixProto.getDescriptor();
    }

    private GpsEphemerisProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class EPOEphemeris extends GeneratedMessageV3 implements EPOEphemerisOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        public static final int GPS_HRS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString data_;
        private long gpsHrs_;
        private byte memoizedIsInitialized;
        private static final EPOEphemeris DEFAULT_INSTANCE = new EPOEphemeris();

        @Deprecated
        public static final Parser<EPOEphemeris> PARSER = new AbstractParser<EPOEphemeris>() { // from class: com.garmin.gcsprotos.generated.GpsEphemerisProto.EPOEphemeris.1
            @Override // com.google.protobuf.Parser
            public EPOEphemeris parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EPOEphemeris.newBuilder();
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

        private EPOEphemeris(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.gpsHrs_ = 0L;
            this.data_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EPOEphemeris getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GpsEphemerisProto.internal_static_CSM_Proto_GpsFix_EPOEphemeris_descriptor;
        }

        public static Builder newBuilder(EPOEphemeris ePOEphemeris) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ePOEphemeris);
        }

        public static EPOEphemeris parseDelimitedFrom(InputStream inputStream) {
            return (EPOEphemeris) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EPOEphemeris parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EPOEphemeris> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EPOEphemeris)) {
                return super.equals(obj);
            }
            EPOEphemeris ePOEphemeris = (EPOEphemeris) obj;
            if (hasGpsHrs() != ePOEphemeris.hasGpsHrs()) {
                return false;
            }
            if ((!hasGpsHrs() || getGpsHrs() == ePOEphemeris.getGpsHrs()) && hasData() == ePOEphemeris.hasData()) {
                return (!hasData() || getData().equals(ePOEphemeris.getData())) && getUnknownFields().equals(ePOEphemeris.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.EPOEphemerisOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.EPOEphemerisOrBuilder
        public long getGpsHrs() {
            return this.gpsHrs_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EPOEphemeris> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeInt64Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeInt64Size(1, this.gpsHrs_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeInt64Size += CodedOutputStream.computeBytesSize(2, this.data_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.EPOEphemerisOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.EPOEphemerisOrBuilder
        public boolean hasGpsHrs() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGpsHrs()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashLong(getGpsHrs());
            }
            if (hasData()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GpsEphemerisProto.internal_static_CSM_Proto_GpsFix_EPOEphemeris_fieldAccessorTable.ensureFieldAccessorsInitialized(EPOEphemeris.class, Builder.class);
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
            return new EPOEphemeris();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeInt64(1, this.gpsHrs_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.data_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EPOEphemerisOrBuilder {
            private int bitField0_;
            private ByteString data_;
            private long gpsHrs_;

            private Builder() {
                this.data_ = ByteString.EMPTY;
            }

            private void buildPartial0(EPOEphemeris ePOEphemeris) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    ePOEphemeris.gpsHrs_ = this.gpsHrs_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    ePOEphemeris.data_ = this.data_;
                    i14 |= 2;
                }
                ePOEphemeris.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GpsEphemerisProto.internal_static_CSM_Proto_GpsFix_EPOEphemeris_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EPOEphemeris build() {
                EPOEphemeris ePOEphemerisBuildPartial = buildPartial();
                if (ePOEphemerisBuildPartial.isInitialized()) {
                    return ePOEphemerisBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ePOEphemerisBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EPOEphemeris buildPartial() {
                EPOEphemeris ePOEphemeris = new EPOEphemeris(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(ePOEphemeris);
                }
                onBuilt();
                return ePOEphemeris;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.gpsHrs_ = 0L;
                this.data_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearData() {
                this.bitField0_ &= -3;
                this.data_ = EPOEphemeris.getDefaultInstance().getData();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGpsHrs() {
                this.bitField0_ &= -2;
                this.gpsHrs_ = 0L;
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

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.EPOEphemerisOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GpsEphemerisProto.internal_static_CSM_Proto_GpsFix_EPOEphemeris_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.EPOEphemerisOrBuilder
            public long getGpsHrs() {
                return this.gpsHrs_;
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.EPOEphemerisOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.EPOEphemerisOrBuilder
            public boolean hasGpsHrs() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GpsEphemerisProto.internal_static_CSM_Proto_GpsFix_EPOEphemeris_fieldAccessorTable.ensureFieldAccessorsInitialized(EPOEphemeris.class, Builder.class);
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
                                    this.gpsHrs_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
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

            public Builder setGpsHrs(long j8) {
                this.gpsHrs_ = j8;
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
            public EPOEphemeris getDefaultInstanceForType() {
                return EPOEphemeris.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.data_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EPOEphemeris) {
                    return mergeFrom((EPOEphemeris) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EPOEphemeris ePOEphemeris) {
                if (ePOEphemeris == EPOEphemeris.getDefaultInstance()) {
                    return this;
                }
                if (ePOEphemeris.hasGpsHrs()) {
                    setGpsHrs(ePOEphemeris.getGpsHrs());
                }
                if (ePOEphemeris.hasData()) {
                    setData(ePOEphemeris.getData());
                }
                mergeUnknownFields(ePOEphemeris.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EPOEphemeris getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EPOEphemeris parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EPOEphemeris) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EPOEphemeris parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EPOEphemeris parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EPOEphemeris parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EPOEphemeris parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EPOEphemeris parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EPOEphemeris parseFrom(InputStream inputStream) {
            return (EPOEphemeris) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ EPOEphemeris(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private EPOEphemeris() {
            this.gpsHrs_ = 0L;
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.data_ = byteString;
        }

        public static EPOEphemeris parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EPOEphemeris) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EPOEphemeris parseFrom(CodedInputStream codedInputStream) {
            return (EPOEphemeris) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EPOEphemeris parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EPOEphemeris) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GPSEphemerisRequest extends GeneratedMessageV3 implements GPSEphemerisRequestOrBuilder {
        public static final int EPO_GPS_HRS_FIELD_NUMBER = 2;
        public static final int GPS_FIX_REQUEST_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Internal.LongList epoGpsHrs_;
        private GpsFixProto.GpsFixRequest gpsFixRequest_;
        private byte memoizedIsInitialized;
        private static final GPSEphemerisRequest DEFAULT_INSTANCE = new GPSEphemerisRequest();

        @Deprecated
        public static final Parser<GPSEphemerisRequest> PARSER = new AbstractParser<GPSEphemerisRequest>() { // from class: com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisRequest.1
            @Override // com.google.protobuf.Parser
            public GPSEphemerisRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GPSEphemerisRequest.newBuilder();
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

        private GPSEphemerisRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.epoGpsHrs_ = GeneratedMessageV3.emptyLongList();
        }

        public static GPSEphemerisRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GpsEphemerisProto.internal_static_CSM_Proto_GpsFix_GPSEphemerisRequest_descriptor;
        }

        public static Builder newBuilder(GPSEphemerisRequest gPSEphemerisRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gPSEphemerisRequest);
        }

        public static GPSEphemerisRequest parseDelimitedFrom(InputStream inputStream) {
            return (GPSEphemerisRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GPSEphemerisRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GPSEphemerisRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GPSEphemerisRequest)) {
                return super.equals(obj);
            }
            GPSEphemerisRequest gPSEphemerisRequest = (GPSEphemerisRequest) obj;
            if (hasGpsFixRequest() != gPSEphemerisRequest.hasGpsFixRequest()) {
                return false;
            }
            return (!hasGpsFixRequest() || getGpsFixRequest().equals(gPSEphemerisRequest.getGpsFixRequest())) && getEpoGpsHrsList().equals(gPSEphemerisRequest.getEpoGpsHrsList()) && getUnknownFields().equals(gPSEphemerisRequest.getUnknownFields());
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisRequestOrBuilder
        public long getEpoGpsHrs(int i14) {
            return this.epoGpsHrs_.getLong(i14);
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisRequestOrBuilder
        public int getEpoGpsHrsCount() {
            return this.epoGpsHrs_.size();
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisRequestOrBuilder
        public List<Long> getEpoGpsHrsList() {
            return this.epoGpsHrs_;
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisRequestOrBuilder
        public GpsFixProto.GpsFixRequest getGpsFixRequest() {
            GpsFixProto.GpsFixRequest gpsFixRequest = this.gpsFixRequest_;
            return gpsFixRequest == null ? GpsFixProto.GpsFixRequest.getDefaultInstance() : gpsFixRequest;
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisRequestOrBuilder
        public GpsFixProto.GpsFixRequestOrBuilder getGpsFixRequestOrBuilder() {
            GpsFixProto.GpsFixRequest gpsFixRequest = this.gpsFixRequest_;
            return gpsFixRequest == null ? GpsFixProto.GpsFixRequest.getDefaultInstance() : gpsFixRequest;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GPSEphemerisRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getGpsFixRequest()) : 0;
            int iComputeUInt64SizeNoTag = 0;
            for (int i15 = 0; i15 < this.epoGpsHrs_.size(); i15++) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(this.epoGpsHrs_.getLong(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getEpoGpsHrsList().size() + iComputeMessageSize + iComputeUInt64SizeNoTag;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisRequestOrBuilder
        public boolean hasGpsFixRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGpsFixRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGpsFixRequest().hashCode();
            }
            if (getEpoGpsHrsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getEpoGpsHrsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GpsEphemerisProto.internal_static_CSM_Proto_GpsFix_GPSEphemerisRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GPSEphemerisRequest.class, Builder.class);
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
            return new GPSEphemerisRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getGpsFixRequest());
            }
            for (int i14 = 0; i14 < this.epoGpsHrs_.size(); i14++) {
                codedOutputStream.writeUInt64(2, this.epoGpsHrs_.getLong(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GPSEphemerisRequestOrBuilder {
            private int bitField0_;
            private Internal.LongList epoGpsHrs_;
            private SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> gpsFixRequestBuilder_;
            private GpsFixProto.GpsFixRequest gpsFixRequest_;

            private Builder() {
                this.epoGpsHrs_ = GeneratedMessageV3.emptyLongList();
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GPSEphemerisRequest gPSEphemerisRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> singleFieldBuilderV3 = this.gpsFixRequestBuilder_;
                    gPSEphemerisRequest.gpsFixRequest_ = singleFieldBuilderV3 == null ? this.gpsFixRequest_ : (GpsFixProto.GpsFixRequest) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                gPSEphemerisRequest.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(GPSEphemerisRequest gPSEphemerisRequest) {
                if ((this.bitField0_ & 2) != 0) {
                    this.epoGpsHrs_.makeImmutable();
                    this.bitField0_ &= -3;
                }
                gPSEphemerisRequest.epoGpsHrs_ = this.epoGpsHrs_;
            }

            private void ensureEpoGpsHrsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.epoGpsHrs_ = GeneratedMessageV3.mutableCopy(this.epoGpsHrs_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GpsEphemerisProto.internal_static_CSM_Proto_GpsFix_GPSEphemerisRequest_descriptor;
            }

            private SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> getGpsFixRequestFieldBuilder() {
                if (this.gpsFixRequestBuilder_ == null) {
                    this.gpsFixRequestBuilder_ = new SingleFieldBuilderV3<>(getGpsFixRequest(), getParentForChildren(), isClean());
                    this.gpsFixRequest_ = null;
                }
                return this.gpsFixRequestBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getGpsFixRequestFieldBuilder();
                }
            }

            public Builder addAllEpoGpsHrs(Iterable<? extends Long> iterable) {
                ensureEpoGpsHrsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.epoGpsHrs_);
                onChanged();
                return this;
            }

            public Builder addEpoGpsHrs(long j8) {
                ensureEpoGpsHrsIsMutable();
                this.epoGpsHrs_.addLong(j8);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GPSEphemerisRequest build() {
                GPSEphemerisRequest gPSEphemerisRequestBuildPartial = buildPartial();
                if (gPSEphemerisRequestBuildPartial.isInitialized()) {
                    return gPSEphemerisRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) gPSEphemerisRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GPSEphemerisRequest buildPartial() {
                GPSEphemerisRequest gPSEphemerisRequest = new GPSEphemerisRequest(this);
                buildPartialRepeatedFields(gPSEphemerisRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(gPSEphemerisRequest);
                }
                onBuilt();
                return gPSEphemerisRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.gpsFixRequest_ = null;
                SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> singleFieldBuilderV3 = this.gpsFixRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.gpsFixRequestBuilder_ = null;
                }
                this.epoGpsHrs_ = GeneratedMessageV3.emptyLongList();
                return this;
            }

            public Builder clearEpoGpsHrs() {
                this.epoGpsHrs_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGpsFixRequest() {
                this.bitField0_ &= -2;
                this.gpsFixRequest_ = null;
                SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> singleFieldBuilderV3 = this.gpsFixRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.gpsFixRequestBuilder_ = null;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GpsEphemerisProto.internal_static_CSM_Proto_GpsFix_GPSEphemerisRequest_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisRequestOrBuilder
            public long getEpoGpsHrs(int i14) {
                return this.epoGpsHrs_.getLong(i14);
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisRequestOrBuilder
            public int getEpoGpsHrsCount() {
                return this.epoGpsHrs_.size();
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisRequestOrBuilder
            public List<Long> getEpoGpsHrsList() {
                int i14 = this.bitField0_ & 2;
                Internal.LongList longList = this.epoGpsHrs_;
                return i14 != 0 ? Collections.unmodifiableList(longList) : longList;
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisRequestOrBuilder
            public GpsFixProto.GpsFixRequest getGpsFixRequest() {
                SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> singleFieldBuilderV3 = this.gpsFixRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GpsFixProto.GpsFixRequest) singleFieldBuilderV3.getMessage();
                }
                GpsFixProto.GpsFixRequest gpsFixRequest = this.gpsFixRequest_;
                return gpsFixRequest == null ? GpsFixProto.GpsFixRequest.getDefaultInstance() : gpsFixRequest;
            }

            public GpsFixProto.GpsFixRequest.Builder getGpsFixRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GpsFixProto.GpsFixRequest.Builder) getGpsFixRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisRequestOrBuilder
            public GpsFixProto.GpsFixRequestOrBuilder getGpsFixRequestOrBuilder() {
                SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> singleFieldBuilderV3 = this.gpsFixRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GpsFixProto.GpsFixRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GpsFixProto.GpsFixRequest gpsFixRequest = this.gpsFixRequest_;
                return gpsFixRequest == null ? GpsFixProto.GpsFixRequest.getDefaultInstance() : gpsFixRequest;
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisRequestOrBuilder
            public boolean hasGpsFixRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GpsEphemerisProto.internal_static_CSM_Proto_GpsFix_GPSEphemerisRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GPSEphemerisRequest.class, Builder.class);
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
                                    codedInputStream.readMessage(getGpsFixRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    long uInt64 = codedInputStream.readUInt64();
                                    ensureEpoGpsHrsIsMutable();
                                    this.epoGpsHrs_.addLong(uInt64);
                                } else if (tag == 18) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureEpoGpsHrsIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.epoGpsHrs_.addLong(codedInputStream.readUInt64());
                                    }
                                    codedInputStream.popLimit(iPushLimit);
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

            public Builder mergeGpsFixRequest(GpsFixProto.GpsFixRequest gpsFixRequest) {
                GpsFixProto.GpsFixRequest gpsFixRequest2;
                SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> singleFieldBuilderV3 = this.gpsFixRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(gpsFixRequest);
                } else if ((this.bitField0_ & 1) == 0 || (gpsFixRequest2 = this.gpsFixRequest_) == null || gpsFixRequest2 == GpsFixProto.GpsFixRequest.getDefaultInstance()) {
                    this.gpsFixRequest_ = gpsFixRequest;
                } else {
                    getGpsFixRequestBuilder().mergeFrom(gpsFixRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setEpoGpsHrs(int i14, long j8) {
                ensureEpoGpsHrsIsMutable();
                this.epoGpsHrs_.setLong(i14, j8);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGpsFixRequest(GpsFixProto.GpsFixRequest.Builder builder) {
                SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> singleFieldBuilderV3 = this.gpsFixRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.gpsFixRequest_ = builder.build();
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
            public GPSEphemerisRequest getDefaultInstanceForType() {
                return GPSEphemerisRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.epoGpsHrs_ = GeneratedMessageV3.emptyLongList();
                maybeForceBuilderInitialization();
            }

            public Builder setGpsFixRequest(GpsFixProto.GpsFixRequest gpsFixRequest) {
                SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> singleFieldBuilderV3 = this.gpsFixRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    gpsFixRequest.getClass();
                    this.gpsFixRequest_ = gpsFixRequest;
                } else {
                    singleFieldBuilderV3.setMessage(gpsFixRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GPSEphemerisRequest) {
                    return mergeFrom((GPSEphemerisRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GPSEphemerisRequest gPSEphemerisRequest) {
                if (gPSEphemerisRequest == GPSEphemerisRequest.getDefaultInstance()) {
                    return this;
                }
                if (gPSEphemerisRequest.hasGpsFixRequest()) {
                    mergeGpsFixRequest(gPSEphemerisRequest.getGpsFixRequest());
                }
                if (!gPSEphemerisRequest.epoGpsHrs_.isEmpty()) {
                    if (this.epoGpsHrs_.isEmpty()) {
                        this.epoGpsHrs_ = gPSEphemerisRequest.epoGpsHrs_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureEpoGpsHrsIsMutable();
                        this.epoGpsHrs_.addAll(gPSEphemerisRequest.epoGpsHrs_);
                    }
                    onChanged();
                }
                mergeUnknownFields(gPSEphemerisRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GPSEphemerisRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GPSEphemerisRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GPSEphemerisRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GPSEphemerisRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GPSEphemerisRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GPSEphemerisRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GPSEphemerisRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private GPSEphemerisRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GPSEphemerisRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GPSEphemerisRequest parseFrom(InputStream inputStream) {
            return (GPSEphemerisRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ GPSEphemerisRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GPSEphemerisRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GPSEphemerisRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GPSEphemerisRequest parseFrom(CodedInputStream codedInputStream) {
            return (GPSEphemerisRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GPSEphemerisRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GPSEphemerisRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GPSEphemerisResponse extends GeneratedMessageV3 implements GPSEphemerisResponseOrBuilder {
        public static final int EPO_EPHEMERIS_FIELD_NUMBER = 2;
        public static final int GPS_FIX_RESPONSE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<EPOEphemeris> epoEphemeris_;
        private GpsFixProto.GpsFixResponse gpsFixResponse_;
        private byte memoizedIsInitialized;
        private static final GPSEphemerisResponse DEFAULT_INSTANCE = new GPSEphemerisResponse();

        @Deprecated
        public static final Parser<GPSEphemerisResponse> PARSER = new AbstractParser<GPSEphemerisResponse>() { // from class: com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponse.1
            @Override // com.google.protobuf.Parser
            public GPSEphemerisResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GPSEphemerisResponse.newBuilder();
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

        private GPSEphemerisResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.epoEphemeris_ = Collections.EMPTY_LIST;
        }

        public static GPSEphemerisResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GpsEphemerisProto.internal_static_CSM_Proto_GpsFix_GPSEphemerisResponse_descriptor;
        }

        public static Builder newBuilder(GPSEphemerisResponse gPSEphemerisResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gPSEphemerisResponse);
        }

        public static GPSEphemerisResponse parseDelimitedFrom(InputStream inputStream) {
            return (GPSEphemerisResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GPSEphemerisResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GPSEphemerisResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GPSEphemerisResponse)) {
                return super.equals(obj);
            }
            GPSEphemerisResponse gPSEphemerisResponse = (GPSEphemerisResponse) obj;
            if (hasGpsFixResponse() != gPSEphemerisResponse.hasGpsFixResponse()) {
                return false;
            }
            return (!hasGpsFixResponse() || getGpsFixResponse().equals(gPSEphemerisResponse.getGpsFixResponse())) && getEpoEphemerisList().equals(gPSEphemerisResponse.getEpoEphemerisList()) && getUnknownFields().equals(gPSEphemerisResponse.getUnknownFields());
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponseOrBuilder
        public EPOEphemeris getEpoEphemeris(int i14) {
            return this.epoEphemeris_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponseOrBuilder
        public int getEpoEphemerisCount() {
            return this.epoEphemeris_.size();
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponseOrBuilder
        public List<EPOEphemeris> getEpoEphemerisList() {
            return this.epoEphemeris_;
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponseOrBuilder
        public EPOEphemerisOrBuilder getEpoEphemerisOrBuilder(int i14) {
            return this.epoEphemeris_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponseOrBuilder
        public List<? extends EPOEphemerisOrBuilder> getEpoEphemerisOrBuilderList() {
            return this.epoEphemeris_;
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponseOrBuilder
        public GpsFixProto.GpsFixResponse getGpsFixResponse() {
            GpsFixProto.GpsFixResponse gpsFixResponse = this.gpsFixResponse_;
            return gpsFixResponse == null ? GpsFixProto.GpsFixResponse.getDefaultInstance() : gpsFixResponse;
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponseOrBuilder
        public GpsFixProto.GpsFixResponseOrBuilder getGpsFixResponseOrBuilder() {
            GpsFixProto.GpsFixResponse gpsFixResponse = this.gpsFixResponse_;
            return gpsFixResponse == null ? GpsFixProto.GpsFixResponse.getDefaultInstance() : gpsFixResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GPSEphemerisResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getGpsFixResponse()) : 0;
            for (int i15 = 0; i15 < this.epoEphemeris_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.epoEphemeris_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponseOrBuilder
        public boolean hasGpsFixResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGpsFixResponse()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGpsFixResponse().hashCode();
            }
            if (getEpoEphemerisCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getEpoEphemerisList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GpsEphemerisProto.internal_static_CSM_Proto_GpsFix_GPSEphemerisResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GPSEphemerisResponse.class, Builder.class);
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
            return new GPSEphemerisResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getGpsFixResponse());
            }
            for (int i14 = 0; i14 < this.epoEphemeris_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.epoEphemeris_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GPSEphemerisResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> epoEphemerisBuilder_;
            private List<EPOEphemeris> epoEphemeris_;
            private SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> gpsFixResponseBuilder_;
            private GpsFixProto.GpsFixResponse gpsFixResponse_;

            private Builder() {
                this.epoEphemeris_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GPSEphemerisResponse gPSEphemerisResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> singleFieldBuilderV3 = this.gpsFixResponseBuilder_;
                    gPSEphemerisResponse.gpsFixResponse_ = singleFieldBuilderV3 == null ? this.gpsFixResponse_ : (GpsFixProto.GpsFixResponse) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                gPSEphemerisResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(GPSEphemerisResponse gPSEphemerisResponse) {
                RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    gPSEphemerisResponse.epoEphemeris_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.epoEphemeris_ = Collections.unmodifiableList(this.epoEphemeris_);
                    this.bitField0_ &= -3;
                }
                gPSEphemerisResponse.epoEphemeris_ = this.epoEphemeris_;
            }

            private void ensureEpoEphemerisIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.epoEphemeris_ = new ArrayList(this.epoEphemeris_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GpsEphemerisProto.internal_static_CSM_Proto_GpsFix_GPSEphemerisResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> getEpoEphemerisFieldBuilder() {
                if (this.epoEphemerisBuilder_ == null) {
                    this.epoEphemerisBuilder_ = new RepeatedFieldBuilderV3<>(this.epoEphemeris_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.epoEphemeris_ = null;
                }
                return this.epoEphemerisBuilder_;
            }

            private SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> getGpsFixResponseFieldBuilder() {
                if (this.gpsFixResponseBuilder_ == null) {
                    this.gpsFixResponseBuilder_ = new SingleFieldBuilderV3<>(getGpsFixResponse(), getParentForChildren(), isClean());
                    this.gpsFixResponse_ = null;
                }
                return this.gpsFixResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getGpsFixResponseFieldBuilder();
                    getEpoEphemerisFieldBuilder();
                }
            }

            public Builder addAllEpoEphemeris(Iterable<? extends EPOEphemeris> iterable) {
                RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureEpoEphemerisIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.epoEphemeris_);
                onChanged();
                return this;
            }

            public Builder addEpoEphemeris(EPOEphemeris.Builder builder) {
                RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureEpoEphemerisIsMutable();
                this.epoEphemeris_.add(builder.build());
                onChanged();
                return this;
            }

            public EPOEphemeris.Builder addEpoEphemerisBuilder() {
                return (EPOEphemeris.Builder) getEpoEphemerisFieldBuilder().addBuilder(EPOEphemeris.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GPSEphemerisResponse build() {
                GPSEphemerisResponse gPSEphemerisResponseBuildPartial = buildPartial();
                if (gPSEphemerisResponseBuildPartial.isInitialized()) {
                    return gPSEphemerisResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) gPSEphemerisResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GPSEphemerisResponse buildPartial() {
                GPSEphemerisResponse gPSEphemerisResponse = new GPSEphemerisResponse(this);
                buildPartialRepeatedFields(gPSEphemerisResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(gPSEphemerisResponse);
                }
                onBuilt();
                return gPSEphemerisResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.gpsFixResponse_ = null;
                SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> singleFieldBuilderV3 = this.gpsFixResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.gpsFixResponseBuilder_ = null;
                }
                RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.epoEphemeris_ = Collections.EMPTY_LIST;
                } else {
                    this.epoEphemeris_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            public Builder clearEpoEphemeris() {
                RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.epoEphemeris_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGpsFixResponse() {
                this.bitField0_ &= -2;
                this.gpsFixResponse_ = null;
                SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> singleFieldBuilderV3 = this.gpsFixResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.gpsFixResponseBuilder_ = null;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GpsEphemerisProto.internal_static_CSM_Proto_GpsFix_GPSEphemerisResponse_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponseOrBuilder
            public EPOEphemeris getEpoEphemeris(int i14) {
                RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                return repeatedFieldBuilderV3 == null ? this.epoEphemeris_.get(i14) : (EPOEphemeris) repeatedFieldBuilderV3.getMessage(i14);
            }

            public EPOEphemeris.Builder getEpoEphemerisBuilder(int i14) {
                return (EPOEphemeris.Builder) getEpoEphemerisFieldBuilder().getBuilder(i14);
            }

            public List<EPOEphemeris.Builder> getEpoEphemerisBuilderList() {
                return getEpoEphemerisFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponseOrBuilder
            public int getEpoEphemerisCount() {
                RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                return repeatedFieldBuilderV3 == null ? this.epoEphemeris_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponseOrBuilder
            public List<EPOEphemeris> getEpoEphemerisList() {
                RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.epoEphemeris_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponseOrBuilder
            public EPOEphemerisOrBuilder getEpoEphemerisOrBuilder(int i14) {
                RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                return repeatedFieldBuilderV3 == null ? this.epoEphemeris_.get(i14) : (EPOEphemerisOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponseOrBuilder
            public List<? extends EPOEphemerisOrBuilder> getEpoEphemerisOrBuilderList() {
                RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.epoEphemeris_);
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponseOrBuilder
            public GpsFixProto.GpsFixResponse getGpsFixResponse() {
                SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> singleFieldBuilderV3 = this.gpsFixResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GpsFixProto.GpsFixResponse) singleFieldBuilderV3.getMessage();
                }
                GpsFixProto.GpsFixResponse gpsFixResponse = this.gpsFixResponse_;
                return gpsFixResponse == null ? GpsFixProto.GpsFixResponse.getDefaultInstance() : gpsFixResponse;
            }

            public GpsFixProto.GpsFixResponse.Builder getGpsFixResponseBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GpsFixProto.GpsFixResponse.Builder) getGpsFixResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponseOrBuilder
            public GpsFixProto.GpsFixResponseOrBuilder getGpsFixResponseOrBuilder() {
                SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> singleFieldBuilderV3 = this.gpsFixResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GpsFixProto.GpsFixResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GpsFixProto.GpsFixResponse gpsFixResponse = this.gpsFixResponse_;
                return gpsFixResponse == null ? GpsFixProto.GpsFixResponse.getDefaultInstance() : gpsFixResponse;
            }

            @Override // com.garmin.gcsprotos.generated.GpsEphemerisProto.GPSEphemerisResponseOrBuilder
            public boolean hasGpsFixResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GpsEphemerisProto.internal_static_CSM_Proto_GpsFix_GPSEphemerisResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GPSEphemerisResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(GPSEphemerisResponse gPSEphemerisResponse) {
                if (gPSEphemerisResponse == GPSEphemerisResponse.getDefaultInstance()) {
                    return this;
                }
                if (gPSEphemerisResponse.hasGpsFixResponse()) {
                    mergeGpsFixResponse(gPSEphemerisResponse.getGpsFixResponse());
                }
                if (this.epoEphemerisBuilder_ == null) {
                    if (!gPSEphemerisResponse.epoEphemeris_.isEmpty()) {
                        if (this.epoEphemeris_.isEmpty()) {
                            this.epoEphemeris_ = gPSEphemerisResponse.epoEphemeris_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureEpoEphemerisIsMutable();
                            this.epoEphemeris_.addAll(gPSEphemerisResponse.epoEphemeris_);
                        }
                        onChanged();
                    }
                } else if (!gPSEphemerisResponse.epoEphemeris_.isEmpty()) {
                    boolean zIsEmpty = this.epoEphemerisBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.epoEphemerisBuilder_ = null;
                        this.epoEphemeris_ = gPSEphemerisResponse.epoEphemeris_;
                        this.bitField0_ &= -3;
                        this.epoEphemerisBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getEpoEphemerisFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(gPSEphemerisResponse.epoEphemeris_);
                    }
                }
                mergeUnknownFields(gPSEphemerisResponse.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder mergeGpsFixResponse(GpsFixProto.GpsFixResponse gpsFixResponse) {
                GpsFixProto.GpsFixResponse gpsFixResponse2;
                SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> singleFieldBuilderV3 = this.gpsFixResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(gpsFixResponse);
                } else if ((this.bitField0_ & 1) == 0 || (gpsFixResponse2 = this.gpsFixResponse_) == null || gpsFixResponse2 == GpsFixProto.GpsFixResponse.getDefaultInstance()) {
                    this.gpsFixResponse_ = gpsFixResponse;
                } else {
                    getGpsFixResponseBuilder().mergeFrom(gpsFixResponse);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeEpoEphemeris(int i14) {
                RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureEpoEphemerisIsMutable();
                this.epoEphemeris_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setEpoEphemeris(int i14, EPOEphemeris.Builder builder) {
                RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureEpoEphemerisIsMutable();
                this.epoEphemeris_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGpsFixResponse(GpsFixProto.GpsFixResponse.Builder builder) {
                SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> singleFieldBuilderV3 = this.gpsFixResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.gpsFixResponse_ = builder.build();
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
            public GPSEphemerisResponse getDefaultInstanceForType() {
                return GPSEphemerisResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.epoEphemeris_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public EPOEphemeris.Builder addEpoEphemerisBuilder(int i14) {
                return (EPOEphemeris.Builder) getEpoEphemerisFieldBuilder().addBuilder(i14, EPOEphemeris.getDefaultInstance());
            }

            public Builder addEpoEphemeris(int i14, EPOEphemeris ePOEphemeris) {
                RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ePOEphemeris.getClass();
                    ensureEpoEphemerisIsMutable();
                    this.epoEphemeris_.add(i14, ePOEphemeris);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, ePOEphemeris);
                return this;
            }

            public Builder setEpoEphemeris(int i14, EPOEphemeris ePOEphemeris) {
                RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ePOEphemeris.getClass();
                    ensureEpoEphemerisIsMutable();
                    this.epoEphemeris_.set(i14, ePOEphemeris);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, ePOEphemeris);
                return this;
            }

            public Builder setGpsFixResponse(GpsFixProto.GpsFixResponse gpsFixResponse) {
                SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> singleFieldBuilderV3 = this.gpsFixResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    gpsFixResponse.getClass();
                    this.gpsFixResponse_ = gpsFixResponse;
                } else {
                    singleFieldBuilderV3.setMessage(gpsFixResponse);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder addEpoEphemeris(EPOEphemeris ePOEphemeris) {
                RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ePOEphemeris.getClass();
                    ensureEpoEphemerisIsMutable();
                    this.epoEphemeris_.add(ePOEphemeris);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(ePOEphemeris);
                return this;
            }

            public Builder addEpoEphemeris(int i14, EPOEphemeris.Builder builder) {
                RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEpoEphemerisIsMutable();
                    this.epoEphemeris_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GPSEphemerisResponse) {
                    return mergeFrom((GPSEphemerisResponse) message);
                }
                super.mergeFrom(message);
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
                                    codedInputStream.readMessage(getGpsFixResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    EPOEphemeris ePOEphemeris = (EPOEphemeris) codedInputStream.readMessage(EPOEphemeris.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<EPOEphemeris, EPOEphemeris.Builder, EPOEphemerisOrBuilder> repeatedFieldBuilderV3 = this.epoEphemerisBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureEpoEphemerisIsMutable();
                                        this.epoEphemeris_.add(ePOEphemeris);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(ePOEphemeris);
                                    }
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
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GPSEphemerisResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GPSEphemerisResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GPSEphemerisResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GPSEphemerisResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GPSEphemerisResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private GPSEphemerisResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GPSEphemerisResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GPSEphemerisResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ GPSEphemerisResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GPSEphemerisResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GPSEphemerisResponse parseFrom(InputStream inputStream) {
            return (GPSEphemerisResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GPSEphemerisResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GPSEphemerisResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GPSEphemerisResponse parseFrom(CodedInputStream codedInputStream) {
            return (GPSEphemerisResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GPSEphemerisResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GPSEphemerisResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}

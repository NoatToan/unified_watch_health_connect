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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIDataTypes {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012GDIDataTypes.proto\u0012\u0013GDI.Proto.DataTypes\"#\n\u0007ScPoint\u0012\u000b\n\u0003lat\u0018\u0001 \u0002(\u0011\u0012\u000b\n\u0003lon\u0018\u0002 \u0002(\u0011\";\n\u0004UUID\u0012\u0018\n\u0010most_significant\u0018\u0001 \u0002(\u0006\u0012\u0019\n\u0011least_significant\u0018\u0002 \u0002(\u0006\"5\n\u0006Locale\u0012\u0015\n\rlanguage_code\u0018\u0001 \u0002(\t\u0012\u0014\n\fcountry_code\u0018\u0002 \u0001(\t\",\n\u0010DataTransferItem\u0012\n\n\u0002id\u0018\u0001 \u0002(\r\u0012\f\n\u0004size\u0018\u0002 \u0002(\r*\u0092\u0001\n\nGPSFixType\u0012\u0015\n\u0011FORCE_NO_SOLUTION\u0010\u0001\u0012\u000f\n\u000bNO_SOLUTION\u0010\u0002\u0012\u0012\n\u000eDEAD_RECKONING\u0010\u0003\u0012\t\n\u0005TWO_D\u0010\u0004\u0012\u000b\n\u0007THREE_D\u0010\u0005\u0012\u0016\n\u0012TWO_D_DIFFERENTIAL\u0010\u0006\u0012\u0018\n\u0014THREE_D_DIFFERENTIAL\u0010\u0007*ð\b\n\tLanguages\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\r\n\tAFRIKAANS\u0010\u0001\u0012\f\n\bALBANIAN\u0010\u0002\u0012\n\n\u0006ARABIC\u0010\u0003\u0012\f\n\bARMENIAN\u0010\u0004\u0012\u000f\n\u000bAZERBAIJANI\u0010\u0005\u0012\n\n\u0006BASQUE\u0010\u0006\u0012\u000e\n\nBELARUSIAN\u0010\u0007\u0012\u000b\n\u0007BENGALI\u0010\b\u0012\u000b\n\u0007BOSNIAN\u0010\t\u0012\r\n\tBULGARIAN\u0010\n\u0012\u000b\n\u0007CATALAN\u0010\u000b\u0012\u0016\n\u0012CHINESE_SIMPLIFIED\u0010\f\u0012!\n\u001dCHINESE_TRADITIONAL_HONG_KONG\u0010\r\u0012\u001e\n\u001aCHINESE_TRADITIONAL_TAIWAN\u0010\u000e\u0012\f\n\bCROATIAN\u0010\u000f\u0012\t\n\u0005CZECH\u0010\u0010\u0012\n\n\u0006DANISH\u0010\u0011\u0012\t\n\u0005DUTCH\u0010\u0012\u0012\u000e\n\nENGLISH_UK\u0010\u0013\u0012\u000e\n\nENGLISH_US\u0010\u0014\u0012\r\n\tESPERANTO\u0010\u0015\u0012\f\n\bESTONIAN\u0010\u0016\u0012\u000b\n\u0007FAROESE\u0010\u0017\u0012\f\n\bFILIPINO\u0010\u0018\u0012\u000b\n\u0007FINNISH\u0010\u0019\u0012\u0011\n\rFRENCH_CANADA\u0010\u001a\u0012\u0011\n\rFRENCH_FRANCE\u0010\u001b\u0012\u000b\n\u0007FRISIAN\u0010\u001c\u0012\f\n\bGALICIAN\u0010\u001d\u0012\f\n\bGEORGIAN\u0010\u001e\u0012\n\n\u0006GERMAN\u0010\u001f\u0012\t\n\u0005GREEK\u0010 \u0012\n\n\u0006HEBREW\u0010!\u0012\t\n\u0005HINDI\u0010\"\u0012\r\n\tHUNGARIAN\u0010#\u0012\r\n\tICELANDIC\u0010$\u0012\u000e\n\nINDONESIAN\u0010%\u0012\t\n\u0005IRISH\u0010&\u0012\u000b\n\u0007ITALIAN\u0010'\u0012\f\n\bJAPANESE\u0010(\u0012\t\n\u0005KHMER\u0010)\u0012\n\n\u0006KOREAN\u0010*\u0012\u000b\n\u0007KURDISH\u0010+\u0012\t\n\u0005LATIN\u0010,\u0012\u000b\n\u0007LATVIAN\u0010-\u0012\u000e\n\nLITHUANIAN\u0010.\u0012\u000e\n\nMACEDONIAN\u0010/\u0012\t\n\u0005MALAY\u00100\u0012\r\n\tMALAYALAM\u00101\u0012\n\n\u0006NEPALI\u00102\u0012\u0014\n\u0010NORWEGIAN_BOKMAL\u00103\u0012\u0015\n\u0011NORWEGIAN_NYNORSK\u00104\u0012\n\n\u0006PASHTO\u00105\u0012\u000b\n\u0007PERSIAN\u00106\u0012\n\n\u0006POLISH\u00107\u0012\u0015\n\u0011PORTUGUESE_BRAZIL\u00108\u0012\u0017\n\u0013PORTUGUESE_PORTUGAL\u00109\u0012\u000b\n\u0007PUNJABI\u0010:\u0012\f\n\bROMANIAN\u0010;\u0012\u000b\n\u0007RUSSIAN\u0010<\u0012\u000b\n\u0007SERBIAN\u0010=\u0012\n\n\u0006SLOVAK\u0010>\u0012\r\n\tSLOVENIAN\u0010?\u0012\u000b\n\u0007SPANISH\u0010@\u0012\u0011\n\rSPANISH_SPAIN\u0010A\u0012\u000b\n\u0007SWAHILI\u0010B\u0012\u000b\n\u0007SWEDISH\u0010C\u0012\t\n\u0005TAMIL\u0010D\u0012\n\n\u0006TELUGU\u0010E\u0012\b\n\u0004THAI\u0010F\u0012\u000b\n\u0007TURKISH\u0010G\u0012\r\n\tUKRAINIAN\u0010H\u0012\u000e\n\nVIETNAMESE\u0010I\u0012\t\n\u0005WELSH\u0010J\u0012\u0015\n\u0011ENGLISH_AUSTRALIA\u0010K*(\n\u0010CoordinateSystem\u0012\t\n\u0005WGS84\u0010\u0000\u0012\t\n\u0005GCJ02\u0010\u0001*\u009c\u0002\n\u0010CompassDirection\u0012\t\n\u0005NORTH\u0010\u0000\u0012\u0013\n\u000fNORTH_NORTHEAST\u0010\u0001\u0012\r\n\tNORTHEAST\u0010\u0002\u0012\u0012\n\u000eEAST_NORTHEAST\u0010\u0003\u0012\b\n\u0004EAST\u0010\u0004\u0012\u0012\n\u000eEAST_SOUTHEAST\u0010\u0005\u0012\r\n\tSOUTHEAST\u0010\u0006\u0012\u0013\n\u000fSOUTH_SOUTHEAST\u0010\u0007\u0012\t\n\u0005SOUTH\u0010\b\u0012\u0013\n\u000fSOUTH_SOUTHWEST\u0010\t\u0012\r\n\tSOUTHWEST\u0010\n\u0012\u0012\n\u000eWEST_SOUTHWEST\u0010\u000b\u0012\b\n\u0004WEST\u0010\f\u0012\u0012\n\u000eWEST_NORTHWEST\u0010\r\u0012\r\n\tNORTHWEST\u0010\u000e\u0012\u0013\n\u000fNORTH_NORTHWEST\u0010\u000f**\n\u000fMeasurementUnit\u0012\n\n\u0006METRIC\u0010\u0000\u0012\u000b\n\u0007STATUTE\u0010\u0001B,\n\u001acom.garmin.proto.generatedB\fGDIDataTypesH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DataTypes_DataTransferItem_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DataTypes_DataTransferItem_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DataTypes_Locale_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DataTypes_Locale_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DataTypes_ScPoint_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DataTypes_ScPoint_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DataTypes_UUID_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DataTypes_UUID_fieldAccessorTable;

    public interface DataTransferItemOrBuilder extends MessageOrBuilder {
        int getId();

        int getSize();

        boolean hasId();

        boolean hasSize();
    }

    public interface LocaleOrBuilder extends MessageOrBuilder {
        String getCountryCode();

        ByteString getCountryCodeBytes();

        String getLanguageCode();

        ByteString getLanguageCodeBytes();

        boolean hasCountryCode();

        boolean hasLanguageCode();
    }

    public interface ScPointOrBuilder extends MessageOrBuilder {
        int getLat();

        int getLon();

        boolean hasLat();

        boolean hasLon();
    }

    public interface UUIDOrBuilder extends MessageOrBuilder {
        long getLeastSignificant();

        long getMostSignificant();

        boolean hasLeastSignificant();

        boolean hasMostSignificant();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_DataTypes_ScPoint_descriptor = descriptor2;
        internal_static_GDI_Proto_DataTypes_ScPoint_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Lat", "Lon"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_DataTypes_UUID_descriptor = descriptor3;
        internal_static_GDI_Proto_DataTypes_UUID_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"MostSignificant", "LeastSignificant"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_DataTypes_Locale_descriptor = descriptor4;
        internal_static_GDI_Proto_DataTypes_Locale_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"LanguageCode", "CountryCode"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_DataTypes_DataTransferItem_descriptor = descriptor5;
        internal_static_GDI_Proto_DataTypes_DataTransferItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Id", "Size"});
    }

    private GDIDataTypes() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class DataTransferItem extends GeneratedMessageV3 implements DataTransferItemOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int SIZE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int size_;
        private static final DataTransferItem DEFAULT_INSTANCE = new DataTransferItem();

        @Deprecated
        public static final Parser<DataTransferItem> PARSER = new AbstractParser<DataTransferItem>() { // from class: com.garmin.proto.generated.GDIDataTypes.DataTransferItem.1
            @Override // com.google.protobuf.Parser
            public DataTransferItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataTransferItem.newBuilder();
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

        private DataTransferItem(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.size_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataTransferItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDataTypes.internal_static_GDI_Proto_DataTypes_DataTransferItem_descriptor;
        }

        public static Builder newBuilder(DataTransferItem dataTransferItem) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataTransferItem);
        }

        public static DataTransferItem parseDelimitedFrom(InputStream inputStream) {
            return (DataTransferItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataTransferItem parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataTransferItem> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataTransferItem)) {
                return super.equals(obj);
            }
            DataTransferItem dataTransferItem = (DataTransferItem) obj;
            if (hasId() != dataTransferItem.hasId()) {
                return false;
            }
            if ((!hasId() || getId() == dataTransferItem.getId()) && hasSize() == dataTransferItem.hasSize()) {
                return (!hasSize() || getSize() == dataTransferItem.getSize()) && getUnknownFields().equals(dataTransferItem.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.DataTransferItemOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataTransferItem> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.size_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.DataTransferItemOrBuilder
        public int getSize() {
            return this.size_;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.DataTransferItemOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.DataTransferItemOrBuilder
        public boolean hasSize() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getId();
            }
            if (hasSize()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSize();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDataTypes.internal_static_GDI_Proto_DataTypes_DataTransferItem_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTransferItem.class, Builder.class);
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
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSize()) {
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
            return new DataTransferItem();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.size_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataTransferItemOrBuilder {
            private int bitField0_;
            private int id_;
            private int size_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DataTransferItem dataTransferItem) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    dataTransferItem.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    dataTransferItem.size_ = this.size_;
                    i14 |= 2;
                }
                dataTransferItem.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDataTypes.internal_static_GDI_Proto_DataTypes_DataTransferItem_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTransferItem build() {
                DataTransferItem dataTransferItemBuildPartial = buildPartial();
                if (dataTransferItemBuildPartial.isInitialized()) {
                    return dataTransferItemBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataTransferItemBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTransferItem buildPartial() {
                DataTransferItem dataTransferItem = new DataTransferItem(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dataTransferItem);
                }
                onBuilt();
                return dataTransferItem;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.size_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSize() {
                this.bitField0_ &= -3;
                this.size_ = 0;
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
                return GDIDataTypes.internal_static_GDI_Proto_DataTypes_DataTransferItem_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.DataTransferItemOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.DataTransferItemOrBuilder
            public int getSize() {
                return this.size_;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.DataTransferItemOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.DataTransferItemOrBuilder
            public boolean hasSize() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDataTypes.internal_static_GDI_Proto_DataTypes_DataTransferItem_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTransferItem.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasSize();
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
                                    this.id_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.size_ = codedInputStream.readUInt32();
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

            public Builder setId(int i14) {
                this.id_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSize(int i14) {
                this.size_ = i14;
                this.bitField0_ |= 2;
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
            public DataTransferItem getDefaultInstanceForType() {
                return DataTransferItem.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DataTransferItem) {
                    return mergeFrom((DataTransferItem) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataTransferItem dataTransferItem) {
                if (dataTransferItem == DataTransferItem.getDefaultInstance()) {
                    return this;
                }
                if (dataTransferItem.hasId()) {
                    setId(dataTransferItem.getId());
                }
                if (dataTransferItem.hasSize()) {
                    setSize(dataTransferItem.getSize());
                }
                mergeUnknownFields(dataTransferItem.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataTransferItem getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DataTransferItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTransferItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTransferItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DataTransferItem parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataTransferItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ DataTransferItem(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DataTransferItem parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private DataTransferItem() {
            this.id_ = 0;
            this.size_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataTransferItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DataTransferItem parseFrom(InputStream inputStream) {
            return (DataTransferItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DataTransferItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTransferItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTransferItem parseFrom(CodedInputStream codedInputStream) {
            return (DataTransferItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DataTransferItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTransferItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ScPoint extends GeneratedMessageV3 implements ScPointOrBuilder {
        public static final int LAT_FIELD_NUMBER = 1;
        public static final int LON_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int lat_;
        private int lon_;
        private byte memoizedIsInitialized;
        private static final ScPoint DEFAULT_INSTANCE = new ScPoint();

        @Deprecated
        public static final Parser<ScPoint> PARSER = new AbstractParser<ScPoint>() { // from class: com.garmin.proto.generated.GDIDataTypes.ScPoint.1
            @Override // com.google.protobuf.Parser
            public ScPoint parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ScPoint.newBuilder();
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

        private ScPoint(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.lat_ = 0;
            this.lon_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ScPoint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDataTypes.internal_static_GDI_Proto_DataTypes_ScPoint_descriptor;
        }

        public static Builder newBuilder(ScPoint scPoint) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(scPoint);
        }

        public static ScPoint parseDelimitedFrom(InputStream inputStream) {
            return (ScPoint) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ScPoint parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ScPoint> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ScPoint)) {
                return super.equals(obj);
            }
            ScPoint scPoint = (ScPoint) obj;
            if (hasLat() != scPoint.hasLat()) {
                return false;
            }
            if ((!hasLat() || getLat() == scPoint.getLat()) && hasLon() == scPoint.hasLon()) {
                return (!hasLon() || getLon() == scPoint.getLon()) && getUnknownFields().equals(scPoint.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.ScPointOrBuilder
        public int getLat() {
            return this.lat_;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.ScPointOrBuilder
        public int getLon() {
            return this.lon_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ScPoint> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeSInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeSInt32Size(1, this.lat_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeSInt32Size += CodedOutputStream.computeSInt32Size(2, this.lon_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeSInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.ScPointOrBuilder
        public boolean hasLat() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.ScPointOrBuilder
        public boolean hasLon() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLat()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLat();
            }
            if (hasLon()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getLon();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDataTypes.internal_static_GDI_Proto_DataTypes_ScPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(ScPoint.class, Builder.class);
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
            if (!hasLat()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasLon()) {
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
            return new ScPoint();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeSInt32(1, this.lat_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeSInt32(2, this.lon_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ScPointOrBuilder {
            private int bitField0_;
            private int lat_;
            private int lon_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(ScPoint scPoint) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    scPoint.lat_ = this.lat_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    scPoint.lon_ = this.lon_;
                    i14 |= 2;
                }
                scPoint.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDataTypes.internal_static_GDI_Proto_DataTypes_ScPoint_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ScPoint build() {
                ScPoint scPointBuildPartial = buildPartial();
                if (scPointBuildPartial.isInitialized()) {
                    return scPointBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) scPointBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ScPoint buildPartial() {
                ScPoint scPoint = new ScPoint(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(scPoint);
                }
                onBuilt();
                return scPoint;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.lat_ = 0;
                this.lon_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLat() {
                this.bitField0_ &= -2;
                this.lat_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLon() {
                this.bitField0_ &= -3;
                this.lon_ = 0;
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
                return GDIDataTypes.internal_static_GDI_Proto_DataTypes_ScPoint_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.ScPointOrBuilder
            public int getLat() {
                return this.lat_;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.ScPointOrBuilder
            public int getLon() {
                return this.lon_;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.ScPointOrBuilder
            public boolean hasLat() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.ScPointOrBuilder
            public boolean hasLon() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDataTypes.internal_static_GDI_Proto_DataTypes_ScPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(ScPoint.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasLat() && hasLon();
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
                                    this.lat_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.lon_ = codedInputStream.readSInt32();
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

            public Builder setLat(int i14) {
                this.lat_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLon(int i14) {
                this.lon_ = i14;
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

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ScPoint getDefaultInstanceForType() {
                return ScPoint.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ScPoint) {
                    return mergeFrom((ScPoint) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ScPoint scPoint) {
                if (scPoint == ScPoint.getDefaultInstance()) {
                    return this;
                }
                if (scPoint.hasLat()) {
                    setLat(scPoint.getLat());
                }
                if (scPoint.hasLon()) {
                    setLon(scPoint.getLon());
                }
                mergeUnknownFields(scPoint.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ScPoint getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ScPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScPoint) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ScPoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ScPoint parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ScPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ ScPoint(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ScPoint parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private ScPoint() {
            this.lat_ = 0;
            this.lon_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ScPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ScPoint parseFrom(InputStream inputStream) {
            return (ScPoint) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ScPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScPoint) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ScPoint parseFrom(CodedInputStream codedInputStream) {
            return (ScPoint) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ScPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScPoint) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class UUID extends GeneratedMessageV3 implements UUIDOrBuilder {
        public static final int LEAST_SIGNIFICANT_FIELD_NUMBER = 2;
        public static final int MOST_SIGNIFICANT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long leastSignificant_;
        private byte memoizedIsInitialized;
        private long mostSignificant_;
        private static final UUID DEFAULT_INSTANCE = new UUID();

        @Deprecated
        public static final Parser<UUID> PARSER = new AbstractParser<UUID>() { // from class: com.garmin.proto.generated.GDIDataTypes.UUID.1
            @Override // com.google.protobuf.Parser
            public UUID parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UUID.newBuilder();
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

        private UUID(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.mostSignificant_ = 0L;
            this.leastSignificant_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UUID getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDataTypes.internal_static_GDI_Proto_DataTypes_UUID_descriptor;
        }

        public static Builder newBuilder(UUID uuid) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(uuid);
        }

        public static UUID parseDelimitedFrom(InputStream inputStream) {
            return (UUID) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UUID parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UUID> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UUID)) {
                return super.equals(obj);
            }
            UUID uuid = (UUID) obj;
            if (hasMostSignificant() != uuid.hasMostSignificant()) {
                return false;
            }
            if ((!hasMostSignificant() || getMostSignificant() == uuid.getMostSignificant()) && hasLeastSignificant() == uuid.hasLeastSignificant()) {
                return (!hasLeastSignificant() || getLeastSignificant() == uuid.getLeastSignificant()) && getUnknownFields().equals(uuid.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.UUIDOrBuilder
        public long getLeastSignificant() {
            return this.leastSignificant_;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.UUIDOrBuilder
        public long getMostSignificant() {
            return this.mostSignificant_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UUID> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFixed64Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFixed64Size(1, this.mostSignificant_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFixed64Size += CodedOutputStream.computeFixed64Size(2, this.leastSignificant_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFixed64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.UUIDOrBuilder
        public boolean hasLeastSignificant() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.UUIDOrBuilder
        public boolean hasMostSignificant() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMostSignificant()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashLong(getMostSignificant());
            }
            if (hasLeastSignificant()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashLong(getLeastSignificant());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDataTypes.internal_static_GDI_Proto_DataTypes_UUID_fieldAccessorTable.ensureFieldAccessorsInitialized(UUID.class, Builder.class);
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
            if (!hasMostSignificant()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasLeastSignificant()) {
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
            return new UUID();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFixed64(1, this.mostSignificant_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFixed64(2, this.leastSignificant_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UUIDOrBuilder {
            private int bitField0_;
            private long leastSignificant_;
            private long mostSignificant_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(UUID uuid) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    uuid.mostSignificant_ = this.mostSignificant_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    uuid.leastSignificant_ = this.leastSignificant_;
                    i14 |= 2;
                }
                uuid.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDataTypes.internal_static_GDI_Proto_DataTypes_UUID_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UUID build() {
                UUID uuidBuildPartial = buildPartial();
                if (uuidBuildPartial.isInitialized()) {
                    return uuidBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) uuidBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UUID buildPartial() {
                UUID uuid = new UUID(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(uuid);
                }
                onBuilt();
                return uuid;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.mostSignificant_ = 0L;
                this.leastSignificant_ = 0L;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLeastSignificant() {
                this.bitField0_ &= -3;
                this.leastSignificant_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearMostSignificant() {
                this.bitField0_ &= -2;
                this.mostSignificant_ = 0L;
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
                return GDIDataTypes.internal_static_GDI_Proto_DataTypes_UUID_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.UUIDOrBuilder
            public long getLeastSignificant() {
                return this.leastSignificant_;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.UUIDOrBuilder
            public long getMostSignificant() {
                return this.mostSignificant_;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.UUIDOrBuilder
            public boolean hasLeastSignificant() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.UUIDOrBuilder
            public boolean hasMostSignificant() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDataTypes.internal_static_GDI_Proto_DataTypes_UUID_fieldAccessorTable.ensureFieldAccessorsInitialized(UUID.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasMostSignificant() && hasLeastSignificant();
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
                                if (tag == 9) {
                                    this.mostSignificant_ = codedInputStream.readFixed64();
                                    this.bitField0_ |= 1;
                                } else if (tag == 17) {
                                    this.leastSignificant_ = codedInputStream.readFixed64();
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

            public Builder setLeastSignificant(long j8) {
                this.leastSignificant_ = j8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMostSignificant(long j8) {
                this.mostSignificant_ = j8;
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

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UUID getDefaultInstanceForType() {
                return UUID.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UUID) {
                    return mergeFrom((UUID) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UUID uuid) {
                if (uuid == UUID.getDefaultInstance()) {
                    return this;
                }
                if (uuid.hasMostSignificant()) {
                    setMostSignificant(uuid.getMostSignificant());
                }
                if (uuid.hasLeastSignificant()) {
                    setLeastSignificant(uuid.getLeastSignificant());
                }
                mergeUnknownFields(uuid.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UUID getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UUID parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UUID) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UUID parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UUID parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UUID parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UUID parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ UUID(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UUID parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private UUID() {
            this.mostSignificant_ = 0L;
            this.leastSignificant_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UUID parseFrom(InputStream inputStream) {
            return (UUID) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UUID parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UUID) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UUID parseFrom(CodedInputStream codedInputStream) {
            return (UUID) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UUID parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UUID) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Locale extends GeneratedMessageV3 implements LocaleOrBuilder {
        public static final int COUNTRY_CODE_FIELD_NUMBER = 2;
        public static final int LANGUAGE_CODE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object countryCode_;
        private volatile Object languageCode_;
        private byte memoizedIsInitialized;
        private static final Locale DEFAULT_INSTANCE = new Locale();

        @Deprecated
        public static final Parser<Locale> PARSER = new AbstractParser<Locale>() { // from class: com.garmin.proto.generated.GDIDataTypes.Locale.1
            @Override // com.google.protobuf.Parser
            public Locale parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Locale.newBuilder();
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

        private Locale() {
            this.languageCode_ = "";
            this.countryCode_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.languageCode_ = "";
            this.countryCode_ = "";
        }

        public static Locale getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDataTypes.internal_static_GDI_Proto_DataTypes_Locale_descriptor;
        }

        public static Builder newBuilder(Locale locale) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(locale);
        }

        public static Locale parseDelimitedFrom(InputStream inputStream) {
            return (Locale) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Locale parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Locale> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Locale)) {
                return super.equals(obj);
            }
            Locale locale = (Locale) obj;
            if (hasLanguageCode() != locale.hasLanguageCode()) {
                return false;
            }
            if ((!hasLanguageCode() || getLanguageCode().equals(locale.getLanguageCode())) && hasCountryCode() == locale.hasCountryCode()) {
                return (!hasCountryCode() || getCountryCode().equals(locale.getCountryCode())) && getUnknownFields().equals(locale.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.LocaleOrBuilder
        public String getCountryCode() {
            Object obj = this.countryCode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.countryCode_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.LocaleOrBuilder
        public ByteString getCountryCodeBytes() {
            Object obj = this.countryCode_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.countryCode_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.LocaleOrBuilder
        public String getLanguageCode() {
            Object obj = this.languageCode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.languageCode_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.LocaleOrBuilder
        public ByteString getLanguageCodeBytes() {
            Object obj = this.languageCode_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.languageCode_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Locale> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.languageCode_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.countryCode_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.LocaleOrBuilder
        public boolean hasCountryCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTypes.LocaleOrBuilder
        public boolean hasLanguageCode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLanguageCode()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLanguageCode().hashCode();
            }
            if (hasCountryCode()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCountryCode().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDataTypes.internal_static_GDI_Proto_DataTypes_Locale_fieldAccessorTable.ensureFieldAccessorsInitialized(Locale.class, Builder.class);
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
            if (hasLanguageCode()) {
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
            return new Locale();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.languageCode_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.countryCode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LocaleOrBuilder {
            private int bitField0_;
            private Object countryCode_;
            private Object languageCode_;

            private Builder() {
                this.languageCode_ = "";
                this.countryCode_ = "";
            }

            private void buildPartial0(Locale locale) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    locale.languageCode_ = this.languageCode_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    locale.countryCode_ = this.countryCode_;
                    i14 |= 2;
                }
                locale.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDataTypes.internal_static_GDI_Proto_DataTypes_Locale_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Locale build() {
                Locale localeBuildPartial = buildPartial();
                if (localeBuildPartial.isInitialized()) {
                    return localeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) localeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Locale buildPartial() {
                Locale locale = new Locale(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(locale);
                }
                onBuilt();
                return locale;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.languageCode_ = "";
                this.countryCode_ = "";
                return this;
            }

            public Builder clearCountryCode() {
                this.countryCode_ = Locale.getDefaultInstance().getCountryCode();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLanguageCode() {
                this.languageCode_ = Locale.getDefaultInstance().getLanguageCode();
                this.bitField0_ &= -2;
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

            @Override // com.garmin.proto.generated.GDIDataTypes.LocaleOrBuilder
            public String getCountryCode() {
                Object obj = this.countryCode_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.countryCode_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.LocaleOrBuilder
            public ByteString getCountryCodeBytes() {
                Object obj = this.countryCode_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.countryCode_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDataTypes.internal_static_GDI_Proto_DataTypes_Locale_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.LocaleOrBuilder
            public String getLanguageCode() {
                Object obj = this.languageCode_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.languageCode_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.LocaleOrBuilder
            public ByteString getLanguageCodeBytes() {
                Object obj = this.languageCode_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.languageCode_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.LocaleOrBuilder
            public boolean hasCountryCode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTypes.LocaleOrBuilder
            public boolean hasLanguageCode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDataTypes.internal_static_GDI_Proto_DataTypes_Locale_fieldAccessorTable.ensureFieldAccessorsInitialized(Locale.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasLanguageCode();
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
                                    this.languageCode_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.countryCode_ = codedInputStream.readBytes();
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

            public Builder setCountryCode(String str) {
                str.getClass();
                this.countryCode_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCountryCodeBytes(ByteString byteString) {
                byteString.getClass();
                this.countryCode_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLanguageCode(String str) {
                str.getClass();
                this.languageCode_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLanguageCodeBytes(ByteString byteString) {
                byteString.getClass();
                this.languageCode_ = byteString;
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
            public Locale getDefaultInstanceForType() {
                return Locale.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.languageCode_ = "";
                this.countryCode_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Locale) {
                    return mergeFrom((Locale) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Locale locale) {
                if (locale == Locale.getDefaultInstance()) {
                    return this;
                }
                if (locale.hasLanguageCode()) {
                    this.languageCode_ = locale.languageCode_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (locale.hasCountryCode()) {
                    this.countryCode_ = locale.countryCode_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(locale.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Locale getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Locale parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Locale) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Locale parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Locale parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Locale parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Locale parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Locale parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Locale parseFrom(InputStream inputStream) {
            return (Locale) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Locale parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Locale) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private Locale(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.languageCode_ = "";
            this.countryCode_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Locale parseFrom(CodedInputStream codedInputStream) {
            return (Locale) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Locale parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Locale) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ Locale(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum CompassDirection implements ProtocolMessageEnum {
        NORTH(0),
        NORTH_NORTHEAST(1),
        NORTHEAST(2),
        EAST_NORTHEAST(3),
        EAST(4),
        EAST_SOUTHEAST(5),
        SOUTHEAST(6),
        SOUTH_SOUTHEAST(7),
        SOUTH(8),
        SOUTH_SOUTHWEST(9),
        SOUTHWEST(10),
        WEST_SOUTHWEST(11),
        WEST(12),
        WEST_NORTHWEST(13),
        NORTHWEST(14),
        NORTH_NORTHWEST(15);

        public static final int EAST_NORTHEAST_VALUE = 3;
        public static final int EAST_SOUTHEAST_VALUE = 5;
        public static final int EAST_VALUE = 4;
        public static final int NORTHEAST_VALUE = 2;
        public static final int NORTHWEST_VALUE = 14;
        public static final int NORTH_NORTHEAST_VALUE = 1;
        public static final int NORTH_NORTHWEST_VALUE = 15;
        public static final int NORTH_VALUE = 0;
        public static final int SOUTHEAST_VALUE = 6;
        public static final int SOUTHWEST_VALUE = 10;
        public static final int SOUTH_SOUTHEAST_VALUE = 7;
        public static final int SOUTH_SOUTHWEST_VALUE = 9;
        public static final int SOUTH_VALUE = 8;
        public static final int WEST_NORTHWEST_VALUE = 13;
        public static final int WEST_SOUTHWEST_VALUE = 11;
        public static final int WEST_VALUE = 12;
        private final int value;
        private static final Internal.EnumLiteMap<CompassDirection> internalValueMap = new Internal.EnumLiteMap<CompassDirection>() { // from class: com.garmin.proto.generated.GDIDataTypes.CompassDirection.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public CompassDirection findValueByNumber(int i14) {
                return CompassDirection.forNumber(i14);
            }
        };
        private static final CompassDirection[] VALUES = values();

        CompassDirection(int i14) {
            this.value = i14;
        }

        public static CompassDirection forNumber(int i14) {
            switch (i14) {
                case 0:
                    return NORTH;
                case 1:
                    return NORTH_NORTHEAST;
                case 2:
                    return NORTHEAST;
                case 3:
                    return EAST_NORTHEAST;
                case 4:
                    return EAST;
                case 5:
                    return EAST_SOUTHEAST;
                case 6:
                    return SOUTHEAST;
                case 7:
                    return SOUTH_SOUTHEAST;
                case 8:
                    return SOUTH;
                case 9:
                    return SOUTH_SOUTHWEST;
                case 10:
                    return SOUTHWEST;
                case 11:
                    return WEST_SOUTHWEST;
                case 12:
                    return WEST;
                case 13:
                    return WEST_NORTHWEST;
                case 14:
                    return NORTHWEST;
                case 15:
                    return NORTH_NORTHWEST;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIDataTypes.getDescriptor().getEnumTypes().get(3);
        }

        public static Internal.EnumLiteMap<CompassDirection> internalGetValueMap() {
            return internalValueMap;
        }

        public static CompassDirection valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static CompassDirection valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum CoordinateSystem implements ProtocolMessageEnum {
        WGS84(0),
        GCJ02(1);

        public static final int GCJ02_VALUE = 1;
        public static final int WGS84_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<CoordinateSystem> internalValueMap = new Internal.EnumLiteMap<CoordinateSystem>() { // from class: com.garmin.proto.generated.GDIDataTypes.CoordinateSystem.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public CoordinateSystem findValueByNumber(int i14) {
                return CoordinateSystem.forNumber(i14);
            }
        };
        private static final CoordinateSystem[] VALUES = values();

        CoordinateSystem(int i14) {
            this.value = i14;
        }

        public static CoordinateSystem forNumber(int i14) {
            if (i14 == 0) {
                return WGS84;
            }
            if (i14 != 1) {
                return null;
            }
            return GCJ02;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIDataTypes.getDescriptor().getEnumTypes().get(2);
        }

        public static Internal.EnumLiteMap<CoordinateSystem> internalGetValueMap() {
            return internalValueMap;
        }

        public static CoordinateSystem valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static CoordinateSystem valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum GPSFixType implements ProtocolMessageEnum {
        FORCE_NO_SOLUTION(1),
        NO_SOLUTION(2),
        DEAD_RECKONING(3),
        TWO_D(4),
        THREE_D(5),
        TWO_D_DIFFERENTIAL(6),
        THREE_D_DIFFERENTIAL(7);

        public static final int DEAD_RECKONING_VALUE = 3;
        public static final int FORCE_NO_SOLUTION_VALUE = 1;
        public static final int NO_SOLUTION_VALUE = 2;
        public static final int THREE_D_DIFFERENTIAL_VALUE = 7;
        public static final int THREE_D_VALUE = 5;
        public static final int TWO_D_DIFFERENTIAL_VALUE = 6;
        public static final int TWO_D_VALUE = 4;
        private final int value;
        private static final Internal.EnumLiteMap<GPSFixType> internalValueMap = new Internal.EnumLiteMap<GPSFixType>() { // from class: com.garmin.proto.generated.GDIDataTypes.GPSFixType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public GPSFixType findValueByNumber(int i14) {
                return GPSFixType.forNumber(i14);
            }
        };
        private static final GPSFixType[] VALUES = values();

        GPSFixType(int i14) {
            this.value = i14;
        }

        public static GPSFixType forNumber(int i14) {
            switch (i14) {
                case 1:
                    return FORCE_NO_SOLUTION;
                case 2:
                    return NO_SOLUTION;
                case 3:
                    return DEAD_RECKONING;
                case 4:
                    return TWO_D;
                case 5:
                    return THREE_D;
                case 6:
                    return TWO_D_DIFFERENTIAL;
                case 7:
                    return THREE_D_DIFFERENTIAL;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIDataTypes.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<GPSFixType> internalGetValueMap() {
            return internalValueMap;
        }

        public static GPSFixType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static GPSFixType valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum Languages implements ProtocolMessageEnum {
        UNKNOWN(0),
        AFRIKAANS(1),
        ALBANIAN(2),
        ARABIC(3),
        ARMENIAN(4),
        AZERBAIJANI(5),
        BASQUE(6),
        BELARUSIAN(7),
        BENGALI(8),
        BOSNIAN(9),
        BULGARIAN(10),
        CATALAN(11),
        CHINESE_SIMPLIFIED(12),
        CHINESE_TRADITIONAL_HONG_KONG(13),
        CHINESE_TRADITIONAL_TAIWAN(14),
        CROATIAN(15),
        CZECH(16),
        DANISH(17),
        DUTCH(18),
        ENGLISH_UK(19),
        ENGLISH_US(20),
        ESPERANTO(21),
        ESTONIAN(22),
        FAROESE(23),
        FILIPINO(24),
        FINNISH(25),
        FRENCH_CANADA(26),
        FRENCH_FRANCE(27),
        FRISIAN(28),
        GALICIAN(29),
        GEORGIAN(30),
        GERMAN(31),
        GREEK(32),
        HEBREW(33),
        HINDI(34),
        HUNGARIAN(35),
        ICELANDIC(36),
        INDONESIAN(37),
        IRISH(38),
        ITALIAN(39),
        JAPANESE(40),
        KHMER(41),
        KOREAN(42),
        KURDISH(43),
        LATIN(44),
        LATVIAN(45),
        LITHUANIAN(46),
        MACEDONIAN(47),
        MALAY(48),
        MALAYALAM(49),
        NEPALI(50),
        NORWEGIAN_BOKMAL(51),
        NORWEGIAN_NYNORSK(52),
        PASHTO(53),
        PERSIAN(54),
        POLISH(55),
        PORTUGUESE_BRAZIL(56),
        PORTUGUESE_PORTUGAL(57),
        PUNJABI(58),
        ROMANIAN(59),
        RUSSIAN(60),
        SERBIAN(61),
        SLOVAK(62),
        SLOVENIAN(63),
        SPANISH(64),
        SPANISH_SPAIN(65),
        SWAHILI(66),
        SWEDISH(67),
        TAMIL(68),
        TELUGU(69),
        THAI(70),
        TURKISH(71),
        UKRAINIAN(72),
        VIETNAMESE(73),
        WELSH(74),
        ENGLISH_AUSTRALIA(75);

        public static final int AFRIKAANS_VALUE = 1;
        public static final int ALBANIAN_VALUE = 2;
        public static final int ARABIC_VALUE = 3;
        public static final int ARMENIAN_VALUE = 4;
        public static final int AZERBAIJANI_VALUE = 5;
        public static final int BASQUE_VALUE = 6;
        public static final int BELARUSIAN_VALUE = 7;
        public static final int BENGALI_VALUE = 8;
        public static final int BOSNIAN_VALUE = 9;
        public static final int BULGARIAN_VALUE = 10;
        public static final int CATALAN_VALUE = 11;
        public static final int CHINESE_SIMPLIFIED_VALUE = 12;
        public static final int CHINESE_TRADITIONAL_HONG_KONG_VALUE = 13;
        public static final int CHINESE_TRADITIONAL_TAIWAN_VALUE = 14;
        public static final int CROATIAN_VALUE = 15;
        public static final int CZECH_VALUE = 16;
        public static final int DANISH_VALUE = 17;
        public static final int DUTCH_VALUE = 18;
        public static final int ENGLISH_AUSTRALIA_VALUE = 75;
        public static final int ENGLISH_UK_VALUE = 19;
        public static final int ENGLISH_US_VALUE = 20;
        public static final int ESPERANTO_VALUE = 21;
        public static final int ESTONIAN_VALUE = 22;
        public static final int FAROESE_VALUE = 23;
        public static final int FILIPINO_VALUE = 24;
        public static final int FINNISH_VALUE = 25;
        public static final int FRENCH_CANADA_VALUE = 26;
        public static final int FRENCH_FRANCE_VALUE = 27;
        public static final int FRISIAN_VALUE = 28;
        public static final int GALICIAN_VALUE = 29;
        public static final int GEORGIAN_VALUE = 30;
        public static final int GERMAN_VALUE = 31;
        public static final int GREEK_VALUE = 32;
        public static final int HEBREW_VALUE = 33;
        public static final int HINDI_VALUE = 34;
        public static final int HUNGARIAN_VALUE = 35;
        public static final int ICELANDIC_VALUE = 36;
        public static final int INDONESIAN_VALUE = 37;
        public static final int IRISH_VALUE = 38;
        public static final int ITALIAN_VALUE = 39;
        public static final int JAPANESE_VALUE = 40;
        public static final int KHMER_VALUE = 41;
        public static final int KOREAN_VALUE = 42;
        public static final int KURDISH_VALUE = 43;
        public static final int LATIN_VALUE = 44;
        public static final int LATVIAN_VALUE = 45;
        public static final int LITHUANIAN_VALUE = 46;
        public static final int MACEDONIAN_VALUE = 47;
        public static final int MALAYALAM_VALUE = 49;
        public static final int MALAY_VALUE = 48;
        public static final int NEPALI_VALUE = 50;
        public static final int NORWEGIAN_BOKMAL_VALUE = 51;
        public static final int NORWEGIAN_NYNORSK_VALUE = 52;
        public static final int PASHTO_VALUE = 53;
        public static final int PERSIAN_VALUE = 54;
        public static final int POLISH_VALUE = 55;
        public static final int PORTUGUESE_BRAZIL_VALUE = 56;
        public static final int PORTUGUESE_PORTUGAL_VALUE = 57;
        public static final int PUNJABI_VALUE = 58;
        public static final int ROMANIAN_VALUE = 59;
        public static final int RUSSIAN_VALUE = 60;
        public static final int SERBIAN_VALUE = 61;
        public static final int SLOVAK_VALUE = 62;
        public static final int SLOVENIAN_VALUE = 63;
        public static final int SPANISH_SPAIN_VALUE = 65;
        public static final int SPANISH_VALUE = 64;
        public static final int SWAHILI_VALUE = 66;
        public static final int SWEDISH_VALUE = 67;
        public static final int TAMIL_VALUE = 68;
        public static final int TELUGU_VALUE = 69;
        public static final int THAI_VALUE = 70;
        public static final int TURKISH_VALUE = 71;
        public static final int UKRAINIAN_VALUE = 72;
        public static final int UNKNOWN_VALUE = 0;
        public static final int VIETNAMESE_VALUE = 73;
        public static final int WELSH_VALUE = 74;
        private final int value;
        private static final Internal.EnumLiteMap<Languages> internalValueMap = new Internal.EnumLiteMap<Languages>() { // from class: com.garmin.proto.generated.GDIDataTypes.Languages.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Languages findValueByNumber(int i14) {
                return Languages.forNumber(i14);
            }
        };
        private static final Languages[] VALUES = values();

        Languages(int i14) {
            this.value = i14;
        }

        public static Languages forNumber(int i14) {
            switch (i14) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return AFRIKAANS;
                case 2:
                    return ALBANIAN;
                case 3:
                    return ARABIC;
                case 4:
                    return ARMENIAN;
                case 5:
                    return AZERBAIJANI;
                case 6:
                    return BASQUE;
                case 7:
                    return BELARUSIAN;
                case 8:
                    return BENGALI;
                case 9:
                    return BOSNIAN;
                case 10:
                    return BULGARIAN;
                case 11:
                    return CATALAN;
                case 12:
                    return CHINESE_SIMPLIFIED;
                case 13:
                    return CHINESE_TRADITIONAL_HONG_KONG;
                case 14:
                    return CHINESE_TRADITIONAL_TAIWAN;
                case 15:
                    return CROATIAN;
                case 16:
                    return CZECH;
                case 17:
                    return DANISH;
                case 18:
                    return DUTCH;
                case 19:
                    return ENGLISH_UK;
                case 20:
                    return ENGLISH_US;
                case 21:
                    return ESPERANTO;
                case 22:
                    return ESTONIAN;
                case 23:
                    return FAROESE;
                case 24:
                    return FILIPINO;
                case 25:
                    return FINNISH;
                case 26:
                    return FRENCH_CANADA;
                case 27:
                    return FRENCH_FRANCE;
                case 28:
                    return FRISIAN;
                case 29:
                    return GALICIAN;
                case 30:
                    return GEORGIAN;
                case 31:
                    return GERMAN;
                case 32:
                    return GREEK;
                case 33:
                    return HEBREW;
                case 34:
                    return HINDI;
                case 35:
                    return HUNGARIAN;
                case 36:
                    return ICELANDIC;
                case 37:
                    return INDONESIAN;
                case 38:
                    return IRISH;
                case 39:
                    return ITALIAN;
                case 40:
                    return JAPANESE;
                case 41:
                    return KHMER;
                case 42:
                    return KOREAN;
                case 43:
                    return KURDISH;
                case 44:
                    return LATIN;
                case 45:
                    return LATVIAN;
                case 46:
                    return LITHUANIAN;
                case 47:
                    return MACEDONIAN;
                case 48:
                    return MALAY;
                case 49:
                    return MALAYALAM;
                case 50:
                    return NEPALI;
                case 51:
                    return NORWEGIAN_BOKMAL;
                case 52:
                    return NORWEGIAN_NYNORSK;
                case 53:
                    return PASHTO;
                case 54:
                    return PERSIAN;
                case 55:
                    return POLISH;
                case 56:
                    return PORTUGUESE_BRAZIL;
                case 57:
                    return PORTUGUESE_PORTUGAL;
                case 58:
                    return PUNJABI;
                case 59:
                    return ROMANIAN;
                case 60:
                    return RUSSIAN;
                case 61:
                    return SERBIAN;
                case 62:
                    return SLOVAK;
                case 63:
                    return SLOVENIAN;
                case 64:
                    return SPANISH;
                case 65:
                    return SPANISH_SPAIN;
                case 66:
                    return SWAHILI;
                case 67:
                    return SWEDISH;
                case 68:
                    return TAMIL;
                case 69:
                    return TELUGU;
                case 70:
                    return THAI;
                case 71:
                    return TURKISH;
                case 72:
                    return UKRAINIAN;
                case 73:
                    return VIETNAMESE;
                case 74:
                    return WELSH;
                case 75:
                    return ENGLISH_AUSTRALIA;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIDataTypes.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<Languages> internalGetValueMap() {
            return internalValueMap;
        }

        public static Languages valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static Languages valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum MeasurementUnit implements ProtocolMessageEnum {
        METRIC(0),
        STATUTE(1);

        public static final int METRIC_VALUE = 0;
        public static final int STATUTE_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<MeasurementUnit> internalValueMap = new Internal.EnumLiteMap<MeasurementUnit>() { // from class: com.garmin.proto.generated.GDIDataTypes.MeasurementUnit.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public MeasurementUnit findValueByNumber(int i14) {
                return MeasurementUnit.forNumber(i14);
            }
        };
        private static final MeasurementUnit[] VALUES = values();

        MeasurementUnit(int i14) {
            this.value = i14;
        }

        public static MeasurementUnit forNumber(int i14) {
            if (i14 == 0) {
                return METRIC;
            }
            if (i14 != 1) {
                return null;
            }
            return STATUTE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIDataTypes.getDescriptor().getEnumTypes().get(4);
        }

        public static Internal.EnumLiteMap<MeasurementUnit> internalGetValueMap() {
            return internalValueMap;
        }

        public static MeasurementUnit valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static MeasurementUnit valueOf(int i14) {
            return forNumber(i14);
        }
    }
}

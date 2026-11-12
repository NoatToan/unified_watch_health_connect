package com.garmin.proto.generated;

import com.garmin.android.apps.connectmobile.f3;
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
import com.google.protobuf.ProtocolMessageEnum;
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
import java.util.Iterator;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class WifiSetup {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012wifiSetupGDI.proto\u0012\u000bGDI.fitness\"l\n\u0010OAuthCredentials\u0012\u0014\n\fconsumer_key\u0018\u0001 \u0002(\t\u0012\u0017\n\u000fconsumer_secret\u0018\u0002 \u0002(\t\u0012\u0013\n\u000boauth_token\u0018\u0003 \u0002(\t\u0012\u0014\n\foauth_secret\u0018\u0004 \u0002(\t\"\u0082\u0001\n\u0012ScannedAccessPoint\u0012\f\n\u0004ssid\u0018\u0001 \u0002(\t\u00120\n\rsecurity_type\u0018\u0002 \u0002(\u000e2\u0019.GDI.fitness.SecurityType\u0012\u0013\n\u000bmac_address\u0018\u0003 \u0002(\f\u0012\u0017\n\u000fsignal_strength\u0018\u0004 \u0001(\u0005\"\u0095\u0003\n\u0011StoredAccessPoint\u0012\f\n\u0004ssid\u0018\u0001 \u0002(\t\u00120\n\rsecurity_type\u0018\u0002 \u0002(\u000e2\u0019.GDI.fitness.SecurityType\u0012\u0010\n\bfavorite\u0018\u0003 \u0001(\b\u0012\u0011\n\ttimestamp\u0018\u0004 \u0001(\r\u0012\u0010\n\bpassword\u0018\u0005 \u0001(\f\u0012\u0013\n\u000bmac_address\u0018\u0006 \u0001(\f\u0012\u0014\n\fpassword_len\u0018\u0007 \u0002(\u0005\u0012\u0017\n\u000fpassword_is_hex\u0018\b \u0002(\b\u0012,\n\u000bstatus_type\u0018\t \u0001(\u000e2\u0017.GDI.fitness.StatusType\u0012\u0017\n\u000fsignal_strength\u0018\n \u0001(\u0005\u0012\u001a\n\u0012is_current_network\u0018\u000b \u0001(\b\u0012$\n\u0007ap_type\u0018\f \u0001(\u000e2\u0013.GDI.fitness.ApType\u0012\u000f\n\u0007channel\u0018\r \u0001(\r\u0012+\n\fband_enabled\u0018\u000e \u0001(\u000e2\u0015.GDI.fitness.WifiBand\"u\n\u0006Limits\u0012\u0019\n\u0011max_access_points\u0018\u0001 \u0001(\u0005\u0012\u0015\n\rmax_favorites\u0018\u0002 \u0001(\u0005\u00129\n\u0016allowed_security_types\u0018\u0003 \u0003(\u000e2\u0019.GDI.fitness.SecurityType\"Ñ\u0001\n\u000eWifiSetupAgent\u00122\n\u000bcredentials\u0018\u0001 \u0001(\u000b2\u001d.GDI.fitness.OAuthCredentials\u00122\n\nstored_aps\u0018\u0002 \u0003(\u000b2\u001e.GDI.fitness.StoredAccessPoint\u0012#\n\u0006limits\u0018\u0003 \u0001(\u000b2\u0013.GDI.fitness.Limits\u00122\n\fgcs_location\u0018\u0004 \u0001(\u000e2\u001c.GDI.fitness.GcsLocationType\"ù\u0001\n\u000fWifiSetupDevice\u00124\n\u000bscanned_aps\u0018\u0001 \u0003(\u000b2\u001f.GDI.fitness.ScannedAccessPoint\u00122\n\nstored_aps\u0018\u0002 \u0003(\u000b2\u001e.GDI.fitness.StoredAccessPoint\u0012#\n\u0006limits\u0018\u0003 \u0001(\u000b2\u0013.GDI.fitness.Limits\u0012\u0019\n\u0011needs_credentials\u0018\u0004 \u0001(\b\u0012<\n\u0011credentials_types\u0018\u0005 \u0003(\u000e2!.GDI.fitness.ServerCredentialType*>\n\fSecurityType\u0012\b\n\u0004OPEN\u0010\u0000\u0012\u0007\n\u0003WEP\u0010\u0001\u0012\u0007\n\u0003WPA\u0010\u0002\u0012\b\n\u0004WPA2\u0010\u0003\u0012\b\n\u0004WPA3\u0010\u0004*\u0085\u0001\n\nStatusType\u0012\u000b\n\u0007Unknown\u0010\u0000\u0012\u0015\n\u0011ConnectionSuccess\u0010\u0001\u0012\u0016\n\u0012InvalidCredentials\u0010\u0002\u0012\f\n\bNotFound\u0010\u0003\u0012\n\n\u0006NoDHCP\u0010\u0004\u0012\u000e\n\nNoInternet\u0010\u0005\u0012\u0011\n\rCaptivePortal\u0010\u0006*A\n\u000fGcsLocationType\u0012\u000e\n\nPRODUCTION\u0010\u0000\u0012\t\n\u0005CHINA\u0010\u0001\u0012\b\n\u0004TEST\u0010\u0002\u0012\t\n\u0005STAGE\u0010\u0003*Q\n\u0006ApType\u0012\u0013\n\u000fAP_TYPE_UNKNOWN\u0010\u0000\u0012\u001c\n\u0018AP_TYPE_DEVICE_TO_DEVICE\u0010\u0001\u0012\u0014\n\u0010AP_TYPE_INTERNET\u0010\u0002*6\n\bWifiBand\u0012\u0013\n\u000fWIFI_BAND_5_GHZ\u0010\u0000\u0012\u0015\n\u0011WIFI_BAND_2P4_GHZ\u0010\u0001*4\n\u0014ServerCredentialType\u0012\b\n\u0004NONE\u0010\u0000\u0012\u0012\n\u000eCONNECT_OAUTH1\u0010\u0001B)\n\u001acom.garmin.proto.generatedB\tWifiSetupH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_fitness_Limits_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_fitness_Limits_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_fitness_OAuthCredentials_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_fitness_OAuthCredentials_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_fitness_ScannedAccessPoint_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_fitness_ScannedAccessPoint_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_fitness_StoredAccessPoint_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_fitness_StoredAccessPoint_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_fitness_WifiSetupAgent_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_fitness_WifiSetupAgent_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_fitness_WifiSetupDevice_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_fitness_WifiSetupDevice_fieldAccessorTable;

    public interface LimitsOrBuilder extends MessageOrBuilder {
        SecurityType getAllowedSecurityTypes(int i14);

        int getAllowedSecurityTypesCount();

        List<SecurityType> getAllowedSecurityTypesList();

        int getMaxAccessPoints();

        int getMaxFavorites();

        boolean hasMaxAccessPoints();

        boolean hasMaxFavorites();
    }

    public interface OAuthCredentialsOrBuilder extends MessageOrBuilder {
        String getConsumerKey();

        ByteString getConsumerKeyBytes();

        String getConsumerSecret();

        ByteString getConsumerSecretBytes();

        String getOauthSecret();

        ByteString getOauthSecretBytes();

        String getOauthToken();

        ByteString getOauthTokenBytes();

        boolean hasConsumerKey();

        boolean hasConsumerSecret();

        boolean hasOauthSecret();

        boolean hasOauthToken();
    }

    public interface ScannedAccessPointOrBuilder extends MessageOrBuilder {
        ByteString getMacAddress();

        SecurityType getSecurityType();

        int getSignalStrength();

        String getSsid();

        ByteString getSsidBytes();

        boolean hasMacAddress();

        boolean hasSecurityType();

        boolean hasSignalStrength();

        boolean hasSsid();
    }

    public interface StoredAccessPointOrBuilder extends MessageOrBuilder {
        ApType getApType();

        WifiBand getBandEnabled();

        int getChannel();

        boolean getFavorite();

        boolean getIsCurrentNetwork();

        ByteString getMacAddress();

        ByteString getPassword();

        boolean getPasswordIsHex();

        int getPasswordLen();

        SecurityType getSecurityType();

        int getSignalStrength();

        String getSsid();

        ByteString getSsidBytes();

        StatusType getStatusType();

        int getTimestamp();

        boolean hasApType();

        boolean hasBandEnabled();

        boolean hasChannel();

        boolean hasFavorite();

        boolean hasIsCurrentNetwork();

        boolean hasMacAddress();

        boolean hasPassword();

        boolean hasPasswordIsHex();

        boolean hasPasswordLen();

        boolean hasSecurityType();

        boolean hasSignalStrength();

        boolean hasSsid();

        boolean hasStatusType();

        boolean hasTimestamp();
    }

    public interface WifiSetupAgentOrBuilder extends MessageOrBuilder {
        OAuthCredentials getCredentials();

        OAuthCredentialsOrBuilder getCredentialsOrBuilder();

        GcsLocationType getGcsLocation();

        Limits getLimits();

        LimitsOrBuilder getLimitsOrBuilder();

        StoredAccessPoint getStoredAps(int i14);

        int getStoredApsCount();

        List<StoredAccessPoint> getStoredApsList();

        StoredAccessPointOrBuilder getStoredApsOrBuilder(int i14);

        List<? extends StoredAccessPointOrBuilder> getStoredApsOrBuilderList();

        boolean hasCredentials();

        boolean hasGcsLocation();

        boolean hasLimits();
    }

    public interface WifiSetupDeviceOrBuilder extends MessageOrBuilder {
        ServerCredentialType getCredentialsTypes(int i14);

        int getCredentialsTypesCount();

        List<ServerCredentialType> getCredentialsTypesList();

        Limits getLimits();

        LimitsOrBuilder getLimitsOrBuilder();

        boolean getNeedsCredentials();

        ScannedAccessPoint getScannedAps(int i14);

        int getScannedApsCount();

        List<ScannedAccessPoint> getScannedApsList();

        ScannedAccessPointOrBuilder getScannedApsOrBuilder(int i14);

        List<? extends ScannedAccessPointOrBuilder> getScannedApsOrBuilderList();

        StoredAccessPoint getStoredAps(int i14);

        int getStoredApsCount();

        List<StoredAccessPoint> getStoredApsList();

        StoredAccessPointOrBuilder getStoredApsOrBuilder(int i14);

        List<? extends StoredAccessPointOrBuilder> getStoredApsOrBuilderList();

        boolean hasLimits();

        boolean hasNeedsCredentials();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_fitness_OAuthCredentials_descriptor = descriptor2;
        internal_static_GDI_fitness_OAuthCredentials_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ConsumerKey", "ConsumerSecret", "OauthToken", "OauthSecret"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_fitness_ScannedAccessPoint_descriptor = descriptor3;
        internal_static_GDI_fitness_ScannedAccessPoint_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Ssid", "SecurityType", "MacAddress", "SignalStrength"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_fitness_StoredAccessPoint_descriptor = descriptor4;
        internal_static_GDI_fitness_StoredAccessPoint_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Ssid", "SecurityType", "Favorite", "Timestamp", "Password", "MacAddress", "PasswordLen", "PasswordIsHex", "StatusType", "SignalStrength", "IsCurrentNetwork", "ApType", "Channel", "BandEnabled"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_fitness_Limits_descriptor = descriptor5;
        internal_static_GDI_fitness_Limits_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"MaxAccessPoints", "MaxFavorites", "AllowedSecurityTypes"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_fitness_WifiSetupAgent_descriptor = descriptor6;
        internal_static_GDI_fitness_WifiSetupAgent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Credentials", "StoredAps", "Limits", "GcsLocation"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_fitness_WifiSetupDevice_descriptor = descriptor7;
        internal_static_GDI_fitness_WifiSetupDevice_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"ScannedAps", "StoredAps", "Limits", "NeedsCredentials", "CredentialsTypes"});
    }

    private WifiSetup() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class Limits extends GeneratedMessageV3 implements LimitsOrBuilder {
        public static final int ALLOWED_SECURITY_TYPES_FIELD_NUMBER = 3;
        public static final int MAX_ACCESS_POINTS_FIELD_NUMBER = 1;
        public static final int MAX_FAVORITES_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private List<Integer> allowedSecurityTypes_;
        private int bitField0_;
        private int maxAccessPoints_;
        private int maxFavorites_;
        private byte memoizedIsInitialized;
        private static final Internal.ListAdapter.Converter<Integer, SecurityType> allowedSecurityTypes_converter_ = new Internal.ListAdapter.Converter<Integer, SecurityType>() { // from class: com.garmin.proto.generated.WifiSetup.Limits.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public SecurityType convert(Integer num) {
                SecurityType securityTypeForNumber = SecurityType.forNumber(num.intValue());
                return securityTypeForNumber == null ? SecurityType.OPEN : securityTypeForNumber;
            }
        };
        private static final Limits DEFAULT_INSTANCE = new Limits();

        @Deprecated
        public static final Parser<Limits> PARSER = new AbstractParser<Limits>() { // from class: com.garmin.proto.generated.WifiSetup.Limits.2
            @Override // com.google.protobuf.Parser
            public Limits parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Limits.newBuilder();
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

        private Limits() {
            this.maxAccessPoints_ = 0;
            this.maxFavorites_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.allowedSecurityTypes_ = Collections.EMPTY_LIST;
        }

        public static Limits getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WifiSetup.internal_static_GDI_fitness_Limits_descriptor;
        }

        public static Builder newBuilder(Limits limits) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(limits);
        }

        public static Limits parseDelimitedFrom(InputStream inputStream) {
            return (Limits) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Limits parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Limits> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Limits)) {
                return super.equals(obj);
            }
            Limits limits = (Limits) obj;
            if (hasMaxAccessPoints() != limits.hasMaxAccessPoints()) {
                return false;
            }
            if ((!hasMaxAccessPoints() || getMaxAccessPoints() == limits.getMaxAccessPoints()) && hasMaxFavorites() == limits.hasMaxFavorites()) {
                return (!hasMaxFavorites() || getMaxFavorites() == limits.getMaxFavorites()) && this.allowedSecurityTypes_.equals(limits.allowedSecurityTypes_) && getUnknownFields().equals(limits.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.WifiSetup.LimitsOrBuilder
        public SecurityType getAllowedSecurityTypes(int i14) {
            return allowedSecurityTypes_converter_.convert(this.allowedSecurityTypes_.get(i14));
        }

        @Override // com.garmin.proto.generated.WifiSetup.LimitsOrBuilder
        public int getAllowedSecurityTypesCount() {
            return this.allowedSecurityTypes_.size();
        }

        @Override // com.garmin.proto.generated.WifiSetup.LimitsOrBuilder
        public List<SecurityType> getAllowedSecurityTypesList() {
            return new Internal.ListAdapter(this.allowedSecurityTypes_, allowedSecurityTypes_converter_);
        }

        @Override // com.garmin.proto.generated.WifiSetup.LimitsOrBuilder
        public int getMaxAccessPoints() {
            return this.maxAccessPoints_;
        }

        @Override // com.garmin.proto.generated.WifiSetup.LimitsOrBuilder
        public int getMaxFavorites() {
            return this.maxFavorites_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Limits> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iComputeInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeInt32Size(1, this.maxAccessPoints_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.maxFavorites_);
            }
            int iA = 0;
            while (true) {
                int size = this.allowedSecurityTypes_.size();
                List<Integer> list = this.allowedSecurityTypes_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iComputeInt32Size + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.garmin.proto.generated.WifiSetup.LimitsOrBuilder
        public boolean hasMaxAccessPoints() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.LimitsOrBuilder
        public boolean hasMaxFavorites() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMaxAccessPoints()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMaxAccessPoints();
            }
            if (hasMaxFavorites()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMaxFavorites();
            }
            if (getAllowedSecurityTypesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.allowedSecurityTypes_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WifiSetup.internal_static_GDI_fitness_Limits_fieldAccessorTable.ensureFieldAccessorsInitialized(Limits.class, Builder.class);
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
            return new Limits();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeInt32(1, this.maxAccessPoints_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeInt32(2, this.maxFavorites_);
            }
            int iF = 0;
            while (iF < this.allowedSecurityTypes_.size()) {
                iF = f3.f(this.allowedSecurityTypes_.get(iF), codedOutputStream, 3, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LimitsOrBuilder {
            private List<Integer> allowedSecurityTypes_;
            private int bitField0_;
            private int maxAccessPoints_;
            private int maxFavorites_;

            private Builder() {
                this.allowedSecurityTypes_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(Limits limits) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    limits.maxAccessPoints_ = this.maxAccessPoints_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    limits.maxFavorites_ = this.maxFavorites_;
                    i14 |= 2;
                }
                limits.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(Limits limits) {
                if ((this.bitField0_ & 4) != 0) {
                    this.allowedSecurityTypes_ = Collections.unmodifiableList(this.allowedSecurityTypes_);
                    this.bitField0_ &= -5;
                }
                limits.allowedSecurityTypes_ = this.allowedSecurityTypes_;
            }

            private void ensureAllowedSecurityTypesIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.allowedSecurityTypes_ = new ArrayList(this.allowedSecurityTypes_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WifiSetup.internal_static_GDI_fitness_Limits_descriptor;
            }

            public Builder addAllAllowedSecurityTypes(Iterable<? extends SecurityType> iterable) {
                ensureAllowedSecurityTypesIsMutable();
                Iterator<? extends SecurityType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.allowedSecurityTypes_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllowedSecurityTypes(SecurityType securityType) {
                securityType.getClass();
                ensureAllowedSecurityTypesIsMutable();
                this.allowedSecurityTypes_.add(Integer.valueOf(securityType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Limits build() {
                Limits limitsBuildPartial = buildPartial();
                if (limitsBuildPartial.isInitialized()) {
                    return limitsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) limitsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Limits buildPartial() {
                Limits limits = new Limits(this);
                buildPartialRepeatedFields(limits);
                if (this.bitField0_ != 0) {
                    buildPartial0(limits);
                }
                onBuilt();
                return limits;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.maxAccessPoints_ = 0;
                this.maxFavorites_ = 0;
                this.allowedSecurityTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
                return this;
            }

            public Builder clearAllowedSecurityTypes() {
                this.allowedSecurityTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMaxAccessPoints() {
                this.bitField0_ &= -2;
                this.maxAccessPoints_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxFavorites() {
                this.bitField0_ &= -3;
                this.maxFavorites_ = 0;
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

            @Override // com.garmin.proto.generated.WifiSetup.LimitsOrBuilder
            public SecurityType getAllowedSecurityTypes(int i14) {
                return (SecurityType) Limits.allowedSecurityTypes_converter_.convert(this.allowedSecurityTypes_.get(i14));
            }

            @Override // com.garmin.proto.generated.WifiSetup.LimitsOrBuilder
            public int getAllowedSecurityTypesCount() {
                return this.allowedSecurityTypes_.size();
            }

            @Override // com.garmin.proto.generated.WifiSetup.LimitsOrBuilder
            public List<SecurityType> getAllowedSecurityTypesList() {
                return new Internal.ListAdapter(this.allowedSecurityTypes_, Limits.allowedSecurityTypes_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WifiSetup.internal_static_GDI_fitness_Limits_descriptor;
            }

            @Override // com.garmin.proto.generated.WifiSetup.LimitsOrBuilder
            public int getMaxAccessPoints() {
                return this.maxAccessPoints_;
            }

            @Override // com.garmin.proto.generated.WifiSetup.LimitsOrBuilder
            public int getMaxFavorites() {
                return this.maxFavorites_;
            }

            @Override // com.garmin.proto.generated.WifiSetup.LimitsOrBuilder
            public boolean hasMaxAccessPoints() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.LimitsOrBuilder
            public boolean hasMaxFavorites() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WifiSetup.internal_static_GDI_fitness_Limits_fieldAccessorTable.ensureFieldAccessorsInitialized(Limits.class, Builder.class);
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
                                    this.maxAccessPoints_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.maxFavorites_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (SecurityType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        ensureAllowedSecurityTypesIsMutable();
                                        this.allowedSecurityTypes_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 26) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (SecurityType.forNumber(i15) == null) {
                                            mergeUnknownVarintField(3, i15);
                                        } else {
                                            ensureAllowedSecurityTypesIsMutable();
                                            this.allowedSecurityTypes_.add(Integer.valueOf(i15));
                                        }
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAllowedSecurityTypes(int i14, SecurityType securityType) {
                securityType.getClass();
                ensureAllowedSecurityTypesIsMutable();
                this.allowedSecurityTypes_.set(i14, Integer.valueOf(securityType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setMaxAccessPoints(int i14) {
                this.maxAccessPoints_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMaxFavorites(int i14) {
                this.maxFavorites_ = i14;
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

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Limits getDefaultInstanceForType() {
                return Limits.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.allowedSecurityTypes_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Limits) {
                    return mergeFrom((Limits) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Limits limits) {
                if (limits == Limits.getDefaultInstance()) {
                    return this;
                }
                if (limits.hasMaxAccessPoints()) {
                    setMaxAccessPoints(limits.getMaxAccessPoints());
                }
                if (limits.hasMaxFavorites()) {
                    setMaxFavorites(limits.getMaxFavorites());
                }
                if (!limits.allowedSecurityTypes_.isEmpty()) {
                    if (this.allowedSecurityTypes_.isEmpty()) {
                        this.allowedSecurityTypes_ = limits.allowedSecurityTypes_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureAllowedSecurityTypesIsMutable();
                        this.allowedSecurityTypes_.addAll(limits.allowedSecurityTypes_);
                    }
                    onChanged();
                }
                mergeUnknownFields(limits.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Limits getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Limits parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Limits) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Limits parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Limits parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Limits parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Limits parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Limits parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Limits parseFrom(InputStream inputStream) {
            return (Limits) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private Limits(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.maxAccessPoints_ = 0;
            this.maxFavorites_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Limits parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Limits) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Limits parseFrom(CodedInputStream codedInputStream) {
            return (Limits) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ Limits(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Limits parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Limits) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OAuthCredentials extends GeneratedMessageV3 implements OAuthCredentialsOrBuilder {
        public static final int CONSUMER_KEY_FIELD_NUMBER = 1;
        public static final int CONSUMER_SECRET_FIELD_NUMBER = 2;
        public static final int OAUTH_SECRET_FIELD_NUMBER = 4;
        public static final int OAUTH_TOKEN_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object consumerKey_;
        private volatile Object consumerSecret_;
        private byte memoizedIsInitialized;
        private volatile Object oauthSecret_;
        private volatile Object oauthToken_;
        private static final OAuthCredentials DEFAULT_INSTANCE = new OAuthCredentials();

        @Deprecated
        public static final Parser<OAuthCredentials> PARSER = new AbstractParser<OAuthCredentials>() { // from class: com.garmin.proto.generated.WifiSetup.OAuthCredentials.1
            @Override // com.google.protobuf.Parser
            public OAuthCredentials parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = OAuthCredentials.newBuilder();
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

        private OAuthCredentials() {
            this.consumerKey_ = "";
            this.consumerSecret_ = "";
            this.oauthToken_ = "";
            this.oauthSecret_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.consumerKey_ = "";
            this.consumerSecret_ = "";
            this.oauthToken_ = "";
            this.oauthSecret_ = "";
        }

        public static OAuthCredentials getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WifiSetup.internal_static_GDI_fitness_OAuthCredentials_descriptor;
        }

        public static Builder newBuilder(OAuthCredentials oAuthCredentials) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(oAuthCredentials);
        }

        public static OAuthCredentials parseDelimitedFrom(InputStream inputStream) {
            return (OAuthCredentials) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OAuthCredentials parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<OAuthCredentials> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OAuthCredentials)) {
                return super.equals(obj);
            }
            OAuthCredentials oAuthCredentials = (OAuthCredentials) obj;
            if (hasConsumerKey() != oAuthCredentials.hasConsumerKey()) {
                return false;
            }
            if ((hasConsumerKey() && !getConsumerKey().equals(oAuthCredentials.getConsumerKey())) || hasConsumerSecret() != oAuthCredentials.hasConsumerSecret()) {
                return false;
            }
            if ((hasConsumerSecret() && !getConsumerSecret().equals(oAuthCredentials.getConsumerSecret())) || hasOauthToken() != oAuthCredentials.hasOauthToken()) {
                return false;
            }
            if ((!hasOauthToken() || getOauthToken().equals(oAuthCredentials.getOauthToken())) && hasOauthSecret() == oAuthCredentials.hasOauthSecret()) {
                return (!hasOauthSecret() || getOauthSecret().equals(oAuthCredentials.getOauthSecret())) && getUnknownFields().equals(oAuthCredentials.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
        public String getConsumerKey() {
            Object obj = this.consumerKey_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.consumerKey_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
        public ByteString getConsumerKeyBytes() {
            Object obj = this.consumerKey_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.consumerKey_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
        public String getConsumerSecret() {
            Object obj = this.consumerSecret_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.consumerSecret_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
        public ByteString getConsumerSecretBytes() {
            Object obj = this.consumerSecret_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.consumerSecret_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
        public String getOauthSecret() {
            Object obj = this.oauthSecret_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.oauthSecret_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
        public ByteString getOauthSecretBytes() {
            Object obj = this.oauthSecret_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.oauthSecret_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
        public String getOauthToken() {
            Object obj = this.oauthToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.oauthToken_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
        public ByteString getOauthTokenBytes() {
            Object obj = this.oauthToken_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.oauthToken_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<OAuthCredentials> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.consumerKey_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.consumerSecret_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.oauthToken_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.oauthSecret_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
        public boolean hasConsumerKey() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
        public boolean hasConsumerSecret() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
        public boolean hasOauthSecret() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
        public boolean hasOauthToken() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConsumerKey()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConsumerKey().hashCode();
            }
            if (hasConsumerSecret()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConsumerSecret().hashCode();
            }
            if (hasOauthToken()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getOauthToken().hashCode();
            }
            if (hasOauthSecret()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getOauthSecret().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WifiSetup.internal_static_GDI_fitness_OAuthCredentials_fieldAccessorTable.ensureFieldAccessorsInitialized(OAuthCredentials.class, Builder.class);
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
            if (!hasConsumerKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasConsumerSecret()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasOauthToken()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasOauthSecret()) {
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
            return new OAuthCredentials();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.consumerKey_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.consumerSecret_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.oauthToken_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.oauthSecret_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OAuthCredentialsOrBuilder {
            private int bitField0_;
            private Object consumerKey_;
            private Object consumerSecret_;
            private Object oauthSecret_;
            private Object oauthToken_;

            private Builder() {
                this.consumerKey_ = "";
                this.consumerSecret_ = "";
                this.oauthToken_ = "";
                this.oauthSecret_ = "";
            }

            private void buildPartial0(OAuthCredentials oAuthCredentials) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    oAuthCredentials.consumerKey_ = this.consumerKey_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    oAuthCredentials.consumerSecret_ = this.consumerSecret_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    oAuthCredentials.oauthToken_ = this.oauthToken_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    oAuthCredentials.oauthSecret_ = this.oauthSecret_;
                    i14 |= 8;
                }
                oAuthCredentials.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WifiSetup.internal_static_GDI_fitness_OAuthCredentials_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OAuthCredentials build() {
                OAuthCredentials oAuthCredentialsBuildPartial = buildPartial();
                if (oAuthCredentialsBuildPartial.isInitialized()) {
                    return oAuthCredentialsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) oAuthCredentialsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OAuthCredentials buildPartial() {
                OAuthCredentials oAuthCredentials = new OAuthCredentials(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(oAuthCredentials);
                }
                onBuilt();
                return oAuthCredentials;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.consumerKey_ = "";
                this.consumerSecret_ = "";
                this.oauthToken_ = "";
                this.oauthSecret_ = "";
                return this;
            }

            public Builder clearConsumerKey() {
                this.consumerKey_ = OAuthCredentials.getDefaultInstance().getConsumerKey();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearConsumerSecret() {
                this.consumerSecret_ = OAuthCredentials.getDefaultInstance().getConsumerSecret();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOauthSecret() {
                this.oauthSecret_ = OAuthCredentials.getDefaultInstance().getOauthSecret();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearOauthToken() {
                this.oauthToken_ = OAuthCredentials.getDefaultInstance().getOauthToken();
                this.bitField0_ &= -5;
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

            @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
            public String getConsumerKey() {
                Object obj = this.consumerKey_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.consumerKey_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
            public ByteString getConsumerKeyBytes() {
                Object obj = this.consumerKey_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.consumerKey_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
            public String getConsumerSecret() {
                Object obj = this.consumerSecret_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.consumerSecret_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
            public ByteString getConsumerSecretBytes() {
                Object obj = this.consumerSecret_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.consumerSecret_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WifiSetup.internal_static_GDI_fitness_OAuthCredentials_descriptor;
            }

            @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
            public String getOauthSecret() {
                Object obj = this.oauthSecret_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.oauthSecret_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
            public ByteString getOauthSecretBytes() {
                Object obj = this.oauthSecret_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.oauthSecret_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
            public String getOauthToken() {
                Object obj = this.oauthToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.oauthToken_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
            public ByteString getOauthTokenBytes() {
                Object obj = this.oauthToken_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.oauthToken_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
            public boolean hasConsumerKey() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
            public boolean hasConsumerSecret() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
            public boolean hasOauthSecret() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.OAuthCredentialsOrBuilder
            public boolean hasOauthToken() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WifiSetup.internal_static_GDI_fitness_OAuthCredentials_fieldAccessorTable.ensureFieldAccessorsInitialized(OAuthCredentials.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasConsumerKey() && hasConsumerSecret() && hasOauthToken() && hasOauthSecret();
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
                                    this.consumerKey_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.consumerSecret_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.oauthToken_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.oauthSecret_ = codedInputStream.readBytes();
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

            public Builder setConsumerKey(String str) {
                str.getClass();
                this.consumerKey_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConsumerKeyBytes(ByteString byteString) {
                byteString.getClass();
                this.consumerKey_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConsumerSecret(String str) {
                str.getClass();
                this.consumerSecret_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setConsumerSecretBytes(ByteString byteString) {
                byteString.getClass();
                this.consumerSecret_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setOauthSecret(String str) {
                str.getClass();
                this.oauthSecret_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setOauthSecretBytes(ByteString byteString) {
                byteString.getClass();
                this.oauthSecret_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setOauthToken(String str) {
                str.getClass();
                this.oauthToken_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setOauthTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.oauthToken_ = byteString;
                this.bitField0_ |= 4;
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
            public OAuthCredentials getDefaultInstanceForType() {
                return OAuthCredentials.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.consumerKey_ = "";
                this.consumerSecret_ = "";
                this.oauthToken_ = "";
                this.oauthSecret_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof OAuthCredentials) {
                    return mergeFrom((OAuthCredentials) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(OAuthCredentials oAuthCredentials) {
                if (oAuthCredentials == OAuthCredentials.getDefaultInstance()) {
                    return this;
                }
                if (oAuthCredentials.hasConsumerKey()) {
                    this.consumerKey_ = oAuthCredentials.consumerKey_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (oAuthCredentials.hasConsumerSecret()) {
                    this.consumerSecret_ = oAuthCredentials.consumerSecret_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (oAuthCredentials.hasOauthToken()) {
                    this.oauthToken_ = oAuthCredentials.oauthToken_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (oAuthCredentials.hasOauthSecret()) {
                    this.oauthSecret_ = oAuthCredentials.oauthSecret_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                mergeUnknownFields(oAuthCredentials.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OAuthCredentials getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static OAuthCredentials parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthCredentials) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OAuthCredentials parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OAuthCredentials parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OAuthCredentials parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static OAuthCredentials parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static OAuthCredentials parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static OAuthCredentials parseFrom(InputStream inputStream) {
            return (OAuthCredentials) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static OAuthCredentials parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthCredentials) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OAuthCredentials parseFrom(CodedInputStream codedInputStream) {
            return (OAuthCredentials) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static OAuthCredentials parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthCredentials) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private OAuthCredentials(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.consumerKey_ = "";
            this.consumerSecret_ = "";
            this.oauthToken_ = "";
            this.oauthSecret_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ OAuthCredentials(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ScannedAccessPoint extends GeneratedMessageV3 implements ScannedAccessPointOrBuilder {
        public static final int MAC_ADDRESS_FIELD_NUMBER = 3;
        public static final int SECURITY_TYPE_FIELD_NUMBER = 2;
        public static final int SIGNAL_STRENGTH_FIELD_NUMBER = 4;
        public static final int SSID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString macAddress_;
        private byte memoizedIsInitialized;
        private int securityType_;
        private int signalStrength_;
        private volatile Object ssid_;
        private static final ScannedAccessPoint DEFAULT_INSTANCE = new ScannedAccessPoint();

        @Deprecated
        public static final Parser<ScannedAccessPoint> PARSER = new AbstractParser<ScannedAccessPoint>() { // from class: com.garmin.proto.generated.WifiSetup.ScannedAccessPoint.1
            @Override // com.google.protobuf.Parser
            public ScannedAccessPoint parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ScannedAccessPoint.newBuilder();
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

        private ScannedAccessPoint() {
            this.ssid_ = "";
            this.securityType_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.macAddress_ = byteString;
            this.signalStrength_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.ssid_ = "";
            this.securityType_ = 0;
            this.macAddress_ = byteString;
        }

        public static ScannedAccessPoint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WifiSetup.internal_static_GDI_fitness_ScannedAccessPoint_descriptor;
        }

        public static Builder newBuilder(ScannedAccessPoint scannedAccessPoint) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(scannedAccessPoint);
        }

        public static ScannedAccessPoint parseDelimitedFrom(InputStream inputStream) {
            return (ScannedAccessPoint) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ScannedAccessPoint parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ScannedAccessPoint> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ScannedAccessPoint)) {
                return super.equals(obj);
            }
            ScannedAccessPoint scannedAccessPoint = (ScannedAccessPoint) obj;
            if (hasSsid() != scannedAccessPoint.hasSsid()) {
                return false;
            }
            if ((hasSsid() && !getSsid().equals(scannedAccessPoint.getSsid())) || hasSecurityType() != scannedAccessPoint.hasSecurityType()) {
                return false;
            }
            if ((hasSecurityType() && this.securityType_ != scannedAccessPoint.securityType_) || hasMacAddress() != scannedAccessPoint.hasMacAddress()) {
                return false;
            }
            if ((!hasMacAddress() || getMacAddress().equals(scannedAccessPoint.getMacAddress())) && hasSignalStrength() == scannedAccessPoint.hasSignalStrength()) {
                return (!hasSignalStrength() || getSignalStrength() == scannedAccessPoint.getSignalStrength()) && getUnknownFields().equals(scannedAccessPoint.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
        public ByteString getMacAddress() {
            return this.macAddress_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ScannedAccessPoint> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
        public SecurityType getSecurityType() {
            SecurityType securityTypeForNumber = SecurityType.forNumber(this.securityType_);
            return securityTypeForNumber == null ? SecurityType.OPEN : securityTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.ssid_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.securityType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(3, this.macAddress_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(4, this.signalStrength_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
        public int getSignalStrength() {
            return this.signalStrength_;
        }

        @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
        public String getSsid() {
            Object obj = this.ssid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.ssid_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
        public ByteString getSsidBytes() {
            Object obj = this.ssid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ssid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
        public boolean hasMacAddress() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
        public boolean hasSecurityType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
        public boolean hasSignalStrength() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
        public boolean hasSsid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSsid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSsid().hashCode();
            }
            if (hasSecurityType()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.securityType_;
            }
            if (hasMacAddress()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getMacAddress().hashCode();
            }
            if (hasSignalStrength()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getSignalStrength();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WifiSetup.internal_static_GDI_fitness_ScannedAccessPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(ScannedAccessPoint.class, Builder.class);
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
            if (!hasSsid()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSecurityType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasMacAddress()) {
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
            return new ScannedAccessPoint();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.ssid_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.securityType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBytes(3, this.macAddress_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeInt32(4, this.signalStrength_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ScannedAccessPointOrBuilder {
            private int bitField0_;
            private ByteString macAddress_;
            private int securityType_;
            private int signalStrength_;
            private Object ssid_;

            private Builder() {
                this.ssid_ = "";
                this.securityType_ = 0;
                this.macAddress_ = ByteString.EMPTY;
            }

            private void buildPartial0(ScannedAccessPoint scannedAccessPoint) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    scannedAccessPoint.ssid_ = this.ssid_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    scannedAccessPoint.securityType_ = this.securityType_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    scannedAccessPoint.macAddress_ = this.macAddress_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    scannedAccessPoint.signalStrength_ = this.signalStrength_;
                    i14 |= 8;
                }
                scannedAccessPoint.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WifiSetup.internal_static_GDI_fitness_ScannedAccessPoint_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ScannedAccessPoint build() {
                ScannedAccessPoint scannedAccessPointBuildPartial = buildPartial();
                if (scannedAccessPointBuildPartial.isInitialized()) {
                    return scannedAccessPointBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) scannedAccessPointBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ScannedAccessPoint buildPartial() {
                ScannedAccessPoint scannedAccessPoint = new ScannedAccessPoint(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(scannedAccessPoint);
                }
                onBuilt();
                return scannedAccessPoint;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.ssid_ = "";
                this.securityType_ = 0;
                this.macAddress_ = ByteString.EMPTY;
                this.signalStrength_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMacAddress() {
                this.bitField0_ &= -5;
                this.macAddress_ = ScannedAccessPoint.getDefaultInstance().getMacAddress();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSecurityType() {
                this.bitField0_ &= -3;
                this.securityType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSignalStrength() {
                this.bitField0_ &= -9;
                this.signalStrength_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSsid() {
                this.ssid_ = ScannedAccessPoint.getDefaultInstance().getSsid();
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
                return WifiSetup.internal_static_GDI_fitness_ScannedAccessPoint_descriptor;
            }

            @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
            public ByteString getMacAddress() {
                return this.macAddress_;
            }

            @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
            public SecurityType getSecurityType() {
                SecurityType securityTypeForNumber = SecurityType.forNumber(this.securityType_);
                return securityTypeForNumber == null ? SecurityType.OPEN : securityTypeForNumber;
            }

            @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
            public int getSignalStrength() {
                return this.signalStrength_;
            }

            @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
            public String getSsid() {
                Object obj = this.ssid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.ssid_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
            public ByteString getSsidBytes() {
                Object obj = this.ssid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ssid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
            public boolean hasMacAddress() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
            public boolean hasSecurityType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
            public boolean hasSignalStrength() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.ScannedAccessPointOrBuilder
            public boolean hasSsid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WifiSetup.internal_static_GDI_fitness_ScannedAccessPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(ScannedAccessPoint.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSsid() && hasSecurityType() && hasMacAddress();
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
                                    this.ssid_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (SecurityType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.securityType_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 26) {
                                    this.macAddress_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.signalStrength_ = codedInputStream.readInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setMacAddress(ByteString byteString) {
                byteString.getClass();
                this.macAddress_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSecurityType(SecurityType securityType) {
                securityType.getClass();
                this.bitField0_ |= 2;
                this.securityType_ = securityType.getNumber();
                onChanged();
                return this;
            }

            public Builder setSignalStrength(int i14) {
                this.signalStrength_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSsid(String str) {
                str.getClass();
                this.ssid_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSsidBytes(ByteString byteString) {
                byteString.getClass();
                this.ssid_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ScannedAccessPoint getDefaultInstanceForType() {
                return ScannedAccessPoint.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.ssid_ = "";
                this.securityType_ = 0;
                this.macAddress_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ScannedAccessPoint) {
                    return mergeFrom((ScannedAccessPoint) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ScannedAccessPoint scannedAccessPoint) {
                if (scannedAccessPoint == ScannedAccessPoint.getDefaultInstance()) {
                    return this;
                }
                if (scannedAccessPoint.hasSsid()) {
                    this.ssid_ = scannedAccessPoint.ssid_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (scannedAccessPoint.hasSecurityType()) {
                    setSecurityType(scannedAccessPoint.getSecurityType());
                }
                if (scannedAccessPoint.hasMacAddress()) {
                    setMacAddress(scannedAccessPoint.getMacAddress());
                }
                if (scannedAccessPoint.hasSignalStrength()) {
                    setSignalStrength(scannedAccessPoint.getSignalStrength());
                }
                mergeUnknownFields(scannedAccessPoint.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ScannedAccessPoint getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ScannedAccessPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScannedAccessPoint) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ScannedAccessPoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ScannedAccessPoint parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ScannedAccessPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ScannedAccessPoint parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ScannedAccessPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ScannedAccessPoint parseFrom(InputStream inputStream) {
            return (ScannedAccessPoint) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ScannedAccessPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScannedAccessPoint) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ScannedAccessPoint parseFrom(CodedInputStream codedInputStream) {
            return (ScannedAccessPoint) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ScannedAccessPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScannedAccessPoint) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ScannedAccessPoint(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.ssid_ = "";
            this.securityType_ = 0;
            this.macAddress_ = ByteString.EMPTY;
            this.signalStrength_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ ScannedAccessPoint(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class StoredAccessPoint extends GeneratedMessageV3 implements StoredAccessPointOrBuilder {
        public static final int AP_TYPE_FIELD_NUMBER = 12;
        public static final int BAND_ENABLED_FIELD_NUMBER = 14;
        public static final int CHANNEL_FIELD_NUMBER = 13;
        public static final int FAVORITE_FIELD_NUMBER = 3;
        public static final int IS_CURRENT_NETWORK_FIELD_NUMBER = 11;
        public static final int MAC_ADDRESS_FIELD_NUMBER = 6;
        public static final int PASSWORD_FIELD_NUMBER = 5;
        public static final int PASSWORD_IS_HEX_FIELD_NUMBER = 8;
        public static final int PASSWORD_LEN_FIELD_NUMBER = 7;
        public static final int SECURITY_TYPE_FIELD_NUMBER = 2;
        public static final int SIGNAL_STRENGTH_FIELD_NUMBER = 10;
        public static final int SSID_FIELD_NUMBER = 1;
        public static final int STATUS_TYPE_FIELD_NUMBER = 9;
        public static final int TIMESTAMP_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int apType_;
        private int bandEnabled_;
        private int bitField0_;
        private int channel_;
        private boolean favorite_;
        private boolean isCurrentNetwork_;
        private ByteString macAddress_;
        private byte memoizedIsInitialized;
        private boolean passwordIsHex_;
        private int passwordLen_;
        private ByteString password_;
        private int securityType_;
        private int signalStrength_;
        private volatile Object ssid_;
        private int statusType_;
        private int timestamp_;
        private static final StoredAccessPoint DEFAULT_INSTANCE = new StoredAccessPoint();

        @Deprecated
        public static final Parser<StoredAccessPoint> PARSER = new AbstractParser<StoredAccessPoint>() { // from class: com.garmin.proto.generated.WifiSetup.StoredAccessPoint.1
            @Override // com.google.protobuf.Parser
            public StoredAccessPoint parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StoredAccessPoint.newBuilder();
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

        private StoredAccessPoint() {
            this.ssid_ = "";
            this.securityType_ = 0;
            this.favorite_ = false;
            this.timestamp_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.password_ = byteString;
            this.macAddress_ = byteString;
            this.passwordLen_ = 0;
            this.passwordIsHex_ = false;
            this.statusType_ = 0;
            this.signalStrength_ = 0;
            this.isCurrentNetwork_ = false;
            this.apType_ = 0;
            this.channel_ = 0;
            this.bandEnabled_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.ssid_ = "";
            this.securityType_ = 0;
            this.password_ = byteString;
            this.macAddress_ = byteString;
            this.statusType_ = 0;
            this.apType_ = 0;
            this.bandEnabled_ = 0;
        }

        public static StoredAccessPoint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WifiSetup.internal_static_GDI_fitness_StoredAccessPoint_descriptor;
        }

        public static Builder newBuilder(StoredAccessPoint storedAccessPoint) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(storedAccessPoint);
        }

        public static StoredAccessPoint parseDelimitedFrom(InputStream inputStream) {
            return (StoredAccessPoint) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StoredAccessPoint parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StoredAccessPoint> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StoredAccessPoint)) {
                return super.equals(obj);
            }
            StoredAccessPoint storedAccessPoint = (StoredAccessPoint) obj;
            if (hasSsid() != storedAccessPoint.hasSsid()) {
                return false;
            }
            if ((hasSsid() && !getSsid().equals(storedAccessPoint.getSsid())) || hasSecurityType() != storedAccessPoint.hasSecurityType()) {
                return false;
            }
            if ((hasSecurityType() && this.securityType_ != storedAccessPoint.securityType_) || hasFavorite() != storedAccessPoint.hasFavorite()) {
                return false;
            }
            if ((hasFavorite() && getFavorite() != storedAccessPoint.getFavorite()) || hasTimestamp() != storedAccessPoint.hasTimestamp()) {
                return false;
            }
            if ((hasTimestamp() && getTimestamp() != storedAccessPoint.getTimestamp()) || hasPassword() != storedAccessPoint.hasPassword()) {
                return false;
            }
            if ((hasPassword() && !getPassword().equals(storedAccessPoint.getPassword())) || hasMacAddress() != storedAccessPoint.hasMacAddress()) {
                return false;
            }
            if ((hasMacAddress() && !getMacAddress().equals(storedAccessPoint.getMacAddress())) || hasPasswordLen() != storedAccessPoint.hasPasswordLen()) {
                return false;
            }
            if ((hasPasswordLen() && getPasswordLen() != storedAccessPoint.getPasswordLen()) || hasPasswordIsHex() != storedAccessPoint.hasPasswordIsHex()) {
                return false;
            }
            if ((hasPasswordIsHex() && getPasswordIsHex() != storedAccessPoint.getPasswordIsHex()) || hasStatusType() != storedAccessPoint.hasStatusType()) {
                return false;
            }
            if ((hasStatusType() && this.statusType_ != storedAccessPoint.statusType_) || hasSignalStrength() != storedAccessPoint.hasSignalStrength()) {
                return false;
            }
            if ((hasSignalStrength() && getSignalStrength() != storedAccessPoint.getSignalStrength()) || hasIsCurrentNetwork() != storedAccessPoint.hasIsCurrentNetwork()) {
                return false;
            }
            if ((hasIsCurrentNetwork() && getIsCurrentNetwork() != storedAccessPoint.getIsCurrentNetwork()) || hasApType() != storedAccessPoint.hasApType()) {
                return false;
            }
            if ((hasApType() && this.apType_ != storedAccessPoint.apType_) || hasChannel() != storedAccessPoint.hasChannel()) {
                return false;
            }
            if ((!hasChannel() || getChannel() == storedAccessPoint.getChannel()) && hasBandEnabled() == storedAccessPoint.hasBandEnabled()) {
                return (!hasBandEnabled() || this.bandEnabled_ == storedAccessPoint.bandEnabled_) && getUnknownFields().equals(storedAccessPoint.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public ApType getApType() {
            ApType apTypeForNumber = ApType.forNumber(this.apType_);
            return apTypeForNumber == null ? ApType.AP_TYPE_UNKNOWN : apTypeForNumber;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public WifiBand getBandEnabled() {
            WifiBand wifiBandForNumber = WifiBand.forNumber(this.bandEnabled_);
            return wifiBandForNumber == null ? WifiBand.WIFI_BAND_5_GHZ : wifiBandForNumber;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public int getChannel() {
            return this.channel_;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean getFavorite() {
            return this.favorite_;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean getIsCurrentNetwork() {
            return this.isCurrentNetwork_;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public ByteString getMacAddress() {
            return this.macAddress_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StoredAccessPoint> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public ByteString getPassword() {
            return this.password_;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean getPasswordIsHex() {
            return this.passwordIsHex_;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public int getPasswordLen() {
            return this.passwordLen_;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public SecurityType getSecurityType() {
            SecurityType securityTypeForNumber = SecurityType.forNumber(this.securityType_);
            return securityTypeForNumber == null ? SecurityType.OPEN : securityTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.ssid_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.securityType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(3, this.favorite_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(4, this.timestamp_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(5, this.password_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(6, this.macAddress_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(7, this.passwordLen_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(8, this.passwordIsHex_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(9, this.statusType_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(10, this.signalStrength_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(11, this.isCurrentNetwork_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(12, this.apType_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(13, this.channel_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(14, this.bandEnabled_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public int getSignalStrength() {
            return this.signalStrength_;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public String getSsid() {
            Object obj = this.ssid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.ssid_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public ByteString getSsidBytes() {
            Object obj = this.ssid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ssid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public StatusType getStatusType() {
            StatusType statusTypeForNumber = StatusType.forNumber(this.statusType_);
            return statusTypeForNumber == null ? StatusType.Unknown : statusTypeForNumber;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public int getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean hasApType() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean hasBandEnabled() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean hasChannel() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean hasFavorite() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean hasIsCurrentNetwork() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean hasMacAddress() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean hasPassword() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean hasPasswordIsHex() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean hasPasswordLen() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean hasSecurityType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean hasSignalStrength() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean hasSsid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean hasStatusType() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSsid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSsid().hashCode();
            }
            if (hasSecurityType()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.securityType_;
            }
            if (hasFavorite()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getFavorite());
            }
            if (hasTimestamp()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getTimestamp();
            }
            if (hasPassword()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getPassword().hashCode();
            }
            if (hasMacAddress()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getMacAddress().hashCode();
            }
            if (hasPasswordLen()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getPasswordLen();
            }
            if (hasPasswordIsHex()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + Internal.hashBoolean(getPasswordIsHex());
            }
            if (hasStatusType()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + this.statusType_;
            }
            if (hasSignalStrength()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getSignalStrength();
            }
            if (hasIsCurrentNetwork()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + Internal.hashBoolean(getIsCurrentNetwork());
            }
            if (hasApType()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + this.apType_;
            }
            if (hasChannel()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getChannel();
            }
            if (hasBandEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + this.bandEnabled_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WifiSetup.internal_static_GDI_fitness_StoredAccessPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(StoredAccessPoint.class, Builder.class);
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
            if (!hasSsid()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSecurityType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasPasswordLen()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPasswordIsHex()) {
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
            return new StoredAccessPoint();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.ssid_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.securityType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.favorite_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.timestamp_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBytes(5, this.password_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBytes(6, this.macAddress_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeInt32(7, this.passwordLen_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeBool(8, this.passwordIsHex_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeEnum(9, this.statusType_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeInt32(10, this.signalStrength_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeBool(11, this.isCurrentNetwork_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeEnum(12, this.apType_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeUInt32(13, this.channel_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeEnum(14, this.bandEnabled_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StoredAccessPointOrBuilder {
            private int apType_;
            private int bandEnabled_;
            private int bitField0_;
            private int channel_;
            private boolean favorite_;
            private boolean isCurrentNetwork_;
            private ByteString macAddress_;
            private boolean passwordIsHex_;
            private int passwordLen_;
            private ByteString password_;
            private int securityType_;
            private int signalStrength_;
            private Object ssid_;
            private int statusType_;
            private int timestamp_;

            private Builder() {
                this.ssid_ = "";
                this.securityType_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.password_ = byteString;
                this.macAddress_ = byteString;
                this.statusType_ = 0;
                this.apType_ = 0;
                this.bandEnabled_ = 0;
            }

            private void buildPartial0(StoredAccessPoint storedAccessPoint) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    storedAccessPoint.ssid_ = this.ssid_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    storedAccessPoint.securityType_ = this.securityType_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    storedAccessPoint.favorite_ = this.favorite_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    storedAccessPoint.timestamp_ = this.timestamp_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    storedAccessPoint.password_ = this.password_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    storedAccessPoint.macAddress_ = this.macAddress_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    storedAccessPoint.passwordLen_ = this.passwordLen_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    storedAccessPoint.passwordIsHex_ = this.passwordIsHex_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    storedAccessPoint.statusType_ = this.statusType_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    storedAccessPoint.signalStrength_ = this.signalStrength_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    storedAccessPoint.isCurrentNetwork_ = this.isCurrentNetwork_;
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    storedAccessPoint.apType_ = this.apType_;
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    storedAccessPoint.channel_ = this.channel_;
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    storedAccessPoint.bandEnabled_ = this.bandEnabled_;
                    i14 |= 8192;
                }
                storedAccessPoint.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WifiSetup.internal_static_GDI_fitness_StoredAccessPoint_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StoredAccessPoint build() {
                StoredAccessPoint storedAccessPointBuildPartial = buildPartial();
                if (storedAccessPointBuildPartial.isInitialized()) {
                    return storedAccessPointBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) storedAccessPointBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StoredAccessPoint buildPartial() {
                StoredAccessPoint storedAccessPoint = new StoredAccessPoint(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(storedAccessPoint);
                }
                onBuilt();
                return storedAccessPoint;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.ssid_ = "";
                this.securityType_ = 0;
                this.favorite_ = false;
                this.timestamp_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.password_ = byteString;
                this.macAddress_ = byteString;
                this.passwordLen_ = 0;
                this.passwordIsHex_ = false;
                this.statusType_ = 0;
                this.signalStrength_ = 0;
                this.isCurrentNetwork_ = false;
                this.apType_ = 0;
                this.channel_ = 0;
                this.bandEnabled_ = 0;
                return this;
            }

            public Builder clearApType() {
                this.bitField0_ &= -2049;
                this.apType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearBandEnabled() {
                this.bitField0_ &= -8193;
                this.bandEnabled_ = 0;
                onChanged();
                return this;
            }

            public Builder clearChannel() {
                this.bitField0_ &= -4097;
                this.channel_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFavorite() {
                this.bitField0_ &= -5;
                this.favorite_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIsCurrentNetwork() {
                this.bitField0_ &= -1025;
                this.isCurrentNetwork_ = false;
                onChanged();
                return this;
            }

            public Builder clearMacAddress() {
                this.bitField0_ &= -33;
                this.macAddress_ = StoredAccessPoint.getDefaultInstance().getMacAddress();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPassword() {
                this.bitField0_ &= -17;
                this.password_ = StoredAccessPoint.getDefaultInstance().getPassword();
                onChanged();
                return this;
            }

            public Builder clearPasswordIsHex() {
                this.bitField0_ &= -129;
                this.passwordIsHex_ = false;
                onChanged();
                return this;
            }

            public Builder clearPasswordLen() {
                this.bitField0_ &= -65;
                this.passwordLen_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSecurityType() {
                this.bitField0_ &= -3;
                this.securityType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSignalStrength() {
                this.bitField0_ &= -513;
                this.signalStrength_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSsid() {
                this.ssid_ = StoredAccessPoint.getDefaultInstance().getSsid();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearStatusType() {
                this.bitField0_ &= -257;
                this.statusType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.bitField0_ &= -9;
                this.timestamp_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public ApType getApType() {
                ApType apTypeForNumber = ApType.forNumber(this.apType_);
                return apTypeForNumber == null ? ApType.AP_TYPE_UNKNOWN : apTypeForNumber;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public WifiBand getBandEnabled() {
                WifiBand wifiBandForNumber = WifiBand.forNumber(this.bandEnabled_);
                return wifiBandForNumber == null ? WifiBand.WIFI_BAND_5_GHZ : wifiBandForNumber;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public int getChannel() {
                return this.channel_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WifiSetup.internal_static_GDI_fitness_StoredAccessPoint_descriptor;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean getFavorite() {
                return this.favorite_;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean getIsCurrentNetwork() {
                return this.isCurrentNetwork_;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public ByteString getMacAddress() {
                return this.macAddress_;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public ByteString getPassword() {
                return this.password_;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean getPasswordIsHex() {
                return this.passwordIsHex_;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public int getPasswordLen() {
                return this.passwordLen_;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public SecurityType getSecurityType() {
                SecurityType securityTypeForNumber = SecurityType.forNumber(this.securityType_);
                return securityTypeForNumber == null ? SecurityType.OPEN : securityTypeForNumber;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public int getSignalStrength() {
                return this.signalStrength_;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public String getSsid() {
                Object obj = this.ssid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.ssid_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public ByteString getSsidBytes() {
                Object obj = this.ssid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ssid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public StatusType getStatusType() {
                StatusType statusTypeForNumber = StatusType.forNumber(this.statusType_);
                return statusTypeForNumber == null ? StatusType.Unknown : statusTypeForNumber;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public int getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean hasApType() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean hasBandEnabled() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean hasChannel() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean hasFavorite() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean hasIsCurrentNetwork() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean hasMacAddress() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean hasPassword() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean hasPasswordIsHex() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean hasPasswordLen() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean hasSecurityType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean hasSignalStrength() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean hasSsid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean hasStatusType() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.StoredAccessPointOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WifiSetup.internal_static_GDI_fitness_StoredAccessPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(StoredAccessPoint.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSsid() && hasSecurityType() && hasPasswordLen() && hasPasswordIsHex();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 10:
                                    this.ssid_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    int i14 = codedInputStream.readEnum();
                                    if (SecurityType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.securityType_ = i14;
                                        this.bitField0_ |= 2;
                                        continue;
                                    }
                                    break;
                                case 24:
                                    this.favorite_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.timestamp_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    this.password_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    this.macAddress_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 56:
                                    this.passwordLen_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    this.passwordIsHex_ = codedInputStream.readBool();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 72:
                                    int i15 = codedInputStream.readEnum();
                                    if (StatusType.forNumber(i15) == null) {
                                        mergeUnknownVarintField(9, i15);
                                    } else {
                                        this.statusType_ = i15;
                                        this.bitField0_ |= 256;
                                        continue;
                                    }
                                    break;
                                case 80:
                                    this.signalStrength_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 88:
                                    this.isCurrentNetwork_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 96:
                                    int i16 = codedInputStream.readEnum();
                                    if (ApType.forNumber(i16) == null) {
                                        mergeUnknownVarintField(12, i16);
                                    } else {
                                        this.apType_ = i16;
                                        this.bitField0_ |= 2048;
                                        continue;
                                    }
                                    break;
                                case 104:
                                    this.channel_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 112:
                                    int i17 = codedInputStream.readEnum();
                                    if (WifiBand.forNumber(i17) == null) {
                                        mergeUnknownVarintField(14, i17);
                                    } else {
                                        this.bandEnabled_ = i17;
                                        this.bitField0_ |= 8192;
                                        continue;
                                    }
                                    break;
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
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

            public Builder setApType(ApType apType) {
                apType.getClass();
                this.bitField0_ |= 2048;
                this.apType_ = apType.getNumber();
                onChanged();
                return this;
            }

            public Builder setBandEnabled(WifiBand wifiBand) {
                wifiBand.getClass();
                this.bitField0_ |= 8192;
                this.bandEnabled_ = wifiBand.getNumber();
                onChanged();
                return this;
            }

            public Builder setChannel(int i14) {
                this.channel_ = i14;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setFavorite(boolean z14) {
                this.favorite_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIsCurrentNetwork(boolean z14) {
                this.isCurrentNetwork_ = z14;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setMacAddress(ByteString byteString) {
                byteString.getClass();
                this.macAddress_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setPassword(ByteString byteString) {
                byteString.getClass();
                this.password_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setPasswordIsHex(boolean z14) {
                this.passwordIsHex_ = z14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setPasswordLen(int i14) {
                this.passwordLen_ = i14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSecurityType(SecurityType securityType) {
                securityType.getClass();
                this.bitField0_ |= 2;
                this.securityType_ = securityType.getNumber();
                onChanged();
                return this;
            }

            public Builder setSignalStrength(int i14) {
                this.signalStrength_ = i14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSsid(String str) {
                str.getClass();
                this.ssid_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSsidBytes(ByteString byteString) {
                byteString.getClass();
                this.ssid_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStatusType(StatusType statusType) {
                statusType.getClass();
                this.bitField0_ |= 256;
                this.statusType_ = statusType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTimestamp(int i14) {
                this.timestamp_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StoredAccessPoint getDefaultInstanceForType() {
                return StoredAccessPoint.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.ssid_ = "";
                this.securityType_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.password_ = byteString;
                this.macAddress_ = byteString;
                this.statusType_ = 0;
                this.apType_ = 0;
                this.bandEnabled_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StoredAccessPoint) {
                    return mergeFrom((StoredAccessPoint) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StoredAccessPoint storedAccessPoint) {
                if (storedAccessPoint == StoredAccessPoint.getDefaultInstance()) {
                    return this;
                }
                if (storedAccessPoint.hasSsid()) {
                    this.ssid_ = storedAccessPoint.ssid_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (storedAccessPoint.hasSecurityType()) {
                    setSecurityType(storedAccessPoint.getSecurityType());
                }
                if (storedAccessPoint.hasFavorite()) {
                    setFavorite(storedAccessPoint.getFavorite());
                }
                if (storedAccessPoint.hasTimestamp()) {
                    setTimestamp(storedAccessPoint.getTimestamp());
                }
                if (storedAccessPoint.hasPassword()) {
                    setPassword(storedAccessPoint.getPassword());
                }
                if (storedAccessPoint.hasMacAddress()) {
                    setMacAddress(storedAccessPoint.getMacAddress());
                }
                if (storedAccessPoint.hasPasswordLen()) {
                    setPasswordLen(storedAccessPoint.getPasswordLen());
                }
                if (storedAccessPoint.hasPasswordIsHex()) {
                    setPasswordIsHex(storedAccessPoint.getPasswordIsHex());
                }
                if (storedAccessPoint.hasStatusType()) {
                    setStatusType(storedAccessPoint.getStatusType());
                }
                if (storedAccessPoint.hasSignalStrength()) {
                    setSignalStrength(storedAccessPoint.getSignalStrength());
                }
                if (storedAccessPoint.hasIsCurrentNetwork()) {
                    setIsCurrentNetwork(storedAccessPoint.getIsCurrentNetwork());
                }
                if (storedAccessPoint.hasApType()) {
                    setApType(storedAccessPoint.getApType());
                }
                if (storedAccessPoint.hasChannel()) {
                    setChannel(storedAccessPoint.getChannel());
                }
                if (storedAccessPoint.hasBandEnabled()) {
                    setBandEnabled(storedAccessPoint.getBandEnabled());
                }
                mergeUnknownFields(storedAccessPoint.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StoredAccessPoint getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StoredAccessPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StoredAccessPoint) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StoredAccessPoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StoredAccessPoint parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StoredAccessPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StoredAccessPoint parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StoredAccessPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StoredAccessPoint parseFrom(InputStream inputStream) {
            return (StoredAccessPoint) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StoredAccessPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StoredAccessPoint) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StoredAccessPoint parseFrom(CodedInputStream codedInputStream) {
            return (StoredAccessPoint) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StoredAccessPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StoredAccessPoint) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private StoredAccessPoint(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.ssid_ = "";
            this.securityType_ = 0;
            this.favorite_ = false;
            this.timestamp_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.password_ = byteString;
            this.macAddress_ = byteString;
            this.passwordLen_ = 0;
            this.passwordIsHex_ = false;
            this.statusType_ = 0;
            this.signalStrength_ = 0;
            this.isCurrentNetwork_ = false;
            this.apType_ = 0;
            this.channel_ = 0;
            this.bandEnabled_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ StoredAccessPoint(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class WifiSetupAgent extends GeneratedMessageV3 implements WifiSetupAgentOrBuilder {
        public static final int CREDENTIALS_FIELD_NUMBER = 1;
        public static final int GCS_LOCATION_FIELD_NUMBER = 4;
        public static final int LIMITS_FIELD_NUMBER = 3;
        public static final int STORED_APS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private OAuthCredentials credentials_;
        private int gcsLocation_;
        private Limits limits_;
        private byte memoizedIsInitialized;
        private List<StoredAccessPoint> storedAps_;
        private static final WifiSetupAgent DEFAULT_INSTANCE = new WifiSetupAgent();

        @Deprecated
        public static final Parser<WifiSetupAgent> PARSER = new AbstractParser<WifiSetupAgent>() { // from class: com.garmin.proto.generated.WifiSetup.WifiSetupAgent.1
            @Override // com.google.protobuf.Parser
            public WifiSetupAgent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WifiSetupAgent.newBuilder();
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

        private WifiSetupAgent() {
            this.gcsLocation_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.storedAps_ = Collections.EMPTY_LIST;
            this.gcsLocation_ = 0;
        }

        public static WifiSetupAgent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WifiSetup.internal_static_GDI_fitness_WifiSetupAgent_descriptor;
        }

        public static Builder newBuilder(WifiSetupAgent wifiSetupAgent) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(wifiSetupAgent);
        }

        public static WifiSetupAgent parseDelimitedFrom(InputStream inputStream) {
            return (WifiSetupAgent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WifiSetupAgent parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WifiSetupAgent> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WifiSetupAgent)) {
                return super.equals(obj);
            }
            WifiSetupAgent wifiSetupAgent = (WifiSetupAgent) obj;
            if (hasCredentials() != wifiSetupAgent.hasCredentials()) {
                return false;
            }
            if ((hasCredentials() && !getCredentials().equals(wifiSetupAgent.getCredentials())) || !getStoredApsList().equals(wifiSetupAgent.getStoredApsList()) || hasLimits() != wifiSetupAgent.hasLimits()) {
                return false;
            }
            if ((!hasLimits() || getLimits().equals(wifiSetupAgent.getLimits())) && hasGcsLocation() == wifiSetupAgent.hasGcsLocation()) {
                return (!hasGcsLocation() || this.gcsLocation_ == wifiSetupAgent.gcsLocation_) && getUnknownFields().equals(wifiSetupAgent.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
        public OAuthCredentials getCredentials() {
            OAuthCredentials oAuthCredentials = this.credentials_;
            return oAuthCredentials == null ? OAuthCredentials.getDefaultInstance() : oAuthCredentials;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
        public OAuthCredentialsOrBuilder getCredentialsOrBuilder() {
            OAuthCredentials oAuthCredentials = this.credentials_;
            return oAuthCredentials == null ? OAuthCredentials.getDefaultInstance() : oAuthCredentials;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
        public GcsLocationType getGcsLocation() {
            GcsLocationType gcsLocationTypeForNumber = GcsLocationType.forNumber(this.gcsLocation_);
            return gcsLocationTypeForNumber == null ? GcsLocationType.PRODUCTION : gcsLocationTypeForNumber;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
        public Limits getLimits() {
            Limits limits = this.limits_;
            return limits == null ? Limits.getDefaultInstance() : limits;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
        public LimitsOrBuilder getLimitsOrBuilder() {
            Limits limits = this.limits_;
            return limits == null ? Limits.getDefaultInstance() : limits;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WifiSetupAgent> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCredentials()) : 0;
            for (int i15 = 0; i15 < this.storedAps_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.storedAps_.get(i15));
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getLimits());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(4, this.gcsLocation_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
        public StoredAccessPoint getStoredAps(int i14) {
            return this.storedAps_.get(i14);
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
        public int getStoredApsCount() {
            return this.storedAps_.size();
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
        public List<StoredAccessPoint> getStoredApsList() {
            return this.storedAps_;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
        public StoredAccessPointOrBuilder getStoredApsOrBuilder(int i14) {
            return this.storedAps_.get(i14);
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
        public List<? extends StoredAccessPointOrBuilder> getStoredApsOrBuilderList() {
            return this.storedAps_;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
        public boolean hasCredentials() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
        public boolean hasGcsLocation() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
        public boolean hasLimits() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCredentials()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCredentials().hashCode();
            }
            if (getStoredApsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getStoredApsList().hashCode();
            }
            if (hasLimits()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getLimits().hashCode();
            }
            if (hasGcsLocation()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.gcsLocation_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WifiSetup.internal_static_GDI_fitness_WifiSetupAgent_fieldAccessorTable.ensureFieldAccessorsInitialized(WifiSetupAgent.class, Builder.class);
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
            if (hasCredentials() && !getCredentials().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i14 = 0; i14 < getStoredApsCount(); i14++) {
                if (!getStoredAps(i14).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
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
            return new WifiSetupAgent();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getCredentials());
            }
            for (int i14 = 0; i14 < this.storedAps_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.storedAps_.get(i14));
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(3, getLimits());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(4, this.gcsLocation_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WifiSetupAgentOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> credentialsBuilder_;
            private OAuthCredentials credentials_;
            private int gcsLocation_;
            private SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> limitsBuilder_;
            private Limits limits_;
            private RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> storedApsBuilder_;
            private List<StoredAccessPoint> storedAps_;

            private Builder() {
                this.storedAps_ = Collections.EMPTY_LIST;
                this.gcsLocation_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(WifiSetupAgent wifiSetupAgent) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                    wifiSetupAgent.credentials_ = singleFieldBuilderV3 == null ? this.credentials_ : (OAuthCredentials) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> singleFieldBuilderV4 = this.limitsBuilder_;
                    wifiSetupAgent.limits_ = singleFieldBuilderV4 == null ? this.limits_ : (Limits) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 8) != 0) {
                    wifiSetupAgent.gcsLocation_ = this.gcsLocation_;
                    i14 |= 4;
                }
                wifiSetupAgent.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(WifiSetupAgent wifiSetupAgent) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    wifiSetupAgent.storedAps_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.storedAps_ = Collections.unmodifiableList(this.storedAps_);
                    this.bitField0_ &= -3;
                }
                wifiSetupAgent.storedAps_ = this.storedAps_;
            }

            private void ensureStoredApsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.storedAps_ = new ArrayList(this.storedAps_);
                    this.bitField0_ |= 2;
                }
            }

            private SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> getCredentialsFieldBuilder() {
                if (this.credentialsBuilder_ == null) {
                    this.credentialsBuilder_ = new SingleFieldBuilderV3<>(getCredentials(), getParentForChildren(), isClean());
                    this.credentials_ = null;
                }
                return this.credentialsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WifiSetup.internal_static_GDI_fitness_WifiSetupAgent_descriptor;
            }

            private SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> getLimitsFieldBuilder() {
                if (this.limitsBuilder_ == null) {
                    this.limitsBuilder_ = new SingleFieldBuilderV3<>(getLimits(), getParentForChildren(), isClean());
                    this.limits_ = null;
                }
                return this.limitsBuilder_;
            }

            private RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> getStoredApsFieldBuilder() {
                if (this.storedApsBuilder_ == null) {
                    this.storedApsBuilder_ = new RepeatedFieldBuilderV3<>(this.storedAps_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.storedAps_ = null;
                }
                return this.storedApsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCredentialsFieldBuilder();
                    getStoredApsFieldBuilder();
                    getLimitsFieldBuilder();
                }
            }

            public Builder addAllStoredAps(Iterable<? extends StoredAccessPoint> iterable) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureStoredApsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.storedAps_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addStoredAps(StoredAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureStoredApsIsMutable();
                this.storedAps_.add(builder.build());
                onChanged();
                return this;
            }

            public StoredAccessPoint.Builder addStoredApsBuilder() {
                return (StoredAccessPoint.Builder) getStoredApsFieldBuilder().addBuilder(StoredAccessPoint.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WifiSetupAgent build() {
                WifiSetupAgent wifiSetupAgentBuildPartial = buildPartial();
                if (wifiSetupAgentBuildPartial.isInitialized()) {
                    return wifiSetupAgentBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) wifiSetupAgentBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WifiSetupAgent buildPartial() {
                WifiSetupAgent wifiSetupAgent = new WifiSetupAgent(this);
                buildPartialRepeatedFields(wifiSetupAgent);
                if (this.bitField0_ != 0) {
                    buildPartial0(wifiSetupAgent);
                }
                onBuilt();
                return wifiSetupAgent;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.credentials_ = null;
                SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.credentialsBuilder_ = null;
                }
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.storedAps_ = Collections.EMPTY_LIST;
                } else {
                    this.storedAps_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                this.limits_ = null;
                SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> singleFieldBuilderV4 = this.limitsBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.limitsBuilder_ = null;
                }
                this.gcsLocation_ = 0;
                return this;
            }

            public Builder clearCredentials() {
                this.bitField0_ &= -2;
                this.credentials_ = null;
                SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.credentialsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGcsLocation() {
                this.bitField0_ &= -9;
                this.gcsLocation_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLimits() {
                this.bitField0_ &= -5;
                this.limits_ = null;
                SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.limitsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStoredAps() {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.storedAps_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
            public OAuthCredentials getCredentials() {
                SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuthCredentials) singleFieldBuilderV3.getMessage();
                }
                OAuthCredentials oAuthCredentials = this.credentials_;
                return oAuthCredentials == null ? OAuthCredentials.getDefaultInstance() : oAuthCredentials;
            }

            public OAuthCredentials.Builder getCredentialsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (OAuthCredentials.Builder) getCredentialsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
            public OAuthCredentialsOrBuilder getCredentialsOrBuilder() {
                SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuthCredentialsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OAuthCredentials oAuthCredentials = this.credentials_;
                return oAuthCredentials == null ? OAuthCredentials.getDefaultInstance() : oAuthCredentials;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WifiSetup.internal_static_GDI_fitness_WifiSetupAgent_descriptor;
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
            public GcsLocationType getGcsLocation() {
                GcsLocationType gcsLocationTypeForNumber = GcsLocationType.forNumber(this.gcsLocation_);
                return gcsLocationTypeForNumber == null ? GcsLocationType.PRODUCTION : gcsLocationTypeForNumber;
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
            public Limits getLimits() {
                SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Limits) singleFieldBuilderV3.getMessage();
                }
                Limits limits = this.limits_;
                return limits == null ? Limits.getDefaultInstance() : limits;
            }

            public Limits.Builder getLimitsBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (Limits.Builder) getLimitsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
            public LimitsOrBuilder getLimitsOrBuilder() {
                SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LimitsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Limits limits = this.limits_;
                return limits == null ? Limits.getDefaultInstance() : limits;
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
            public StoredAccessPoint getStoredAps(int i14) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.storedAps_.get(i14) : (StoredAccessPoint) repeatedFieldBuilderV3.getMessage(i14);
            }

            public StoredAccessPoint.Builder getStoredApsBuilder(int i14) {
                return (StoredAccessPoint.Builder) getStoredApsFieldBuilder().getBuilder(i14);
            }

            public List<StoredAccessPoint.Builder> getStoredApsBuilderList() {
                return getStoredApsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
            public int getStoredApsCount() {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.storedAps_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
            public List<StoredAccessPoint> getStoredApsList() {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.storedAps_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
            public StoredAccessPointOrBuilder getStoredApsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.storedAps_.get(i14) : (StoredAccessPointOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
            public List<? extends StoredAccessPointOrBuilder> getStoredApsOrBuilderList() {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.storedAps_);
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
            public boolean hasCredentials() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
            public boolean hasGcsLocation() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupAgentOrBuilder
            public boolean hasLimits() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WifiSetup.internal_static_GDI_fitness_WifiSetupAgent_fieldAccessorTable.ensureFieldAccessorsInitialized(WifiSetupAgent.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasCredentials() && !getCredentials().isInitialized()) {
                    return false;
                }
                for (int i14 = 0; i14 < getStoredApsCount(); i14++) {
                    if (!getStoredAps(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeCredentials(OAuthCredentials oAuthCredentials) {
                OAuthCredentials oAuthCredentials2;
                SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(oAuthCredentials);
                } else if ((this.bitField0_ & 1) == 0 || (oAuthCredentials2 = this.credentials_) == null || oAuthCredentials2 == OAuthCredentials.getDefaultInstance()) {
                    this.credentials_ = oAuthCredentials;
                } else {
                    getCredentialsBuilder().mergeFrom(oAuthCredentials);
                }
                if (this.credentials_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFrom(WifiSetupAgent wifiSetupAgent) {
                if (wifiSetupAgent == WifiSetupAgent.getDefaultInstance()) {
                    return this;
                }
                if (wifiSetupAgent.hasCredentials()) {
                    mergeCredentials(wifiSetupAgent.getCredentials());
                }
                if (this.storedApsBuilder_ == null) {
                    if (!wifiSetupAgent.storedAps_.isEmpty()) {
                        if (this.storedAps_.isEmpty()) {
                            this.storedAps_ = wifiSetupAgent.storedAps_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureStoredApsIsMutable();
                            this.storedAps_.addAll(wifiSetupAgent.storedAps_);
                        }
                        onChanged();
                    }
                } else if (!wifiSetupAgent.storedAps_.isEmpty()) {
                    boolean zIsEmpty = this.storedApsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.storedApsBuilder_ = null;
                        this.storedAps_ = wifiSetupAgent.storedAps_;
                        this.bitField0_ &= -3;
                        this.storedApsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getStoredApsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(wifiSetupAgent.storedAps_);
                    }
                }
                if (wifiSetupAgent.hasLimits()) {
                    mergeLimits(wifiSetupAgent.getLimits());
                }
                if (wifiSetupAgent.hasGcsLocation()) {
                    setGcsLocation(wifiSetupAgent.getGcsLocation());
                }
                mergeUnknownFields(wifiSetupAgent.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder mergeLimits(Limits limits) {
                Limits limits2;
                SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(limits);
                } else if ((this.bitField0_ & 4) == 0 || (limits2 = this.limits_) == null || limits2 == Limits.getDefaultInstance()) {
                    this.limits_ = limits;
                } else {
                    getLimitsBuilder().mergeFrom(limits);
                }
                if (this.limits_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeStoredAps(int i14) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureStoredApsIsMutable();
                this.storedAps_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setCredentials(OAuthCredentials.Builder builder) {
                SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.credentials_ = builder.build();
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

            public Builder setGcsLocation(GcsLocationType gcsLocationType) {
                gcsLocationType.getClass();
                this.bitField0_ |= 8;
                this.gcsLocation_ = gcsLocationType.getNumber();
                onChanged();
                return this;
            }

            public Builder setLimits(Limits.Builder builder) {
                SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.limits_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStoredAps(int i14, StoredAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureStoredApsIsMutable();
                this.storedAps_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WifiSetupAgent getDefaultInstanceForType() {
                return WifiSetupAgent.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            public StoredAccessPoint.Builder addStoredApsBuilder(int i14) {
                return (StoredAccessPoint.Builder) getStoredApsFieldBuilder().addBuilder(i14, StoredAccessPoint.getDefaultInstance());
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.storedAps_ = Collections.EMPTY_LIST;
                this.gcsLocation_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder addStoredAps(int i14, StoredAccessPoint storedAccessPoint) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    storedAccessPoint.getClass();
                    ensureStoredApsIsMutable();
                    this.storedAps_.add(i14, storedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, storedAccessPoint);
                return this;
            }

            public Builder setCredentials(OAuthCredentials oAuthCredentials) {
                SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    oAuthCredentials.getClass();
                    this.credentials_ = oAuthCredentials;
                } else {
                    singleFieldBuilderV3.setMessage(oAuthCredentials);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLimits(Limits limits) {
                SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    limits.getClass();
                    this.limits_ = limits;
                } else {
                    singleFieldBuilderV3.setMessage(limits);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStoredAps(int i14, StoredAccessPoint storedAccessPoint) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    storedAccessPoint.getClass();
                    ensureStoredApsIsMutable();
                    this.storedAps_.set(i14, storedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, storedAccessPoint);
                return this;
            }

            public Builder addStoredAps(StoredAccessPoint storedAccessPoint) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    storedAccessPoint.getClass();
                    ensureStoredApsIsMutable();
                    this.storedAps_.add(storedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(storedAccessPoint);
                return this;
            }

            public Builder addStoredAps(int i14, StoredAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureStoredApsIsMutable();
                    this.storedAps_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WifiSetupAgent) {
                    return mergeFrom((WifiSetupAgent) message);
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
                                    codedInputStream.readMessage(getCredentialsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    StoredAccessPoint storedAccessPoint = (StoredAccessPoint) codedInputStream.readMessage(StoredAccessPoint.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureStoredApsIsMutable();
                                        this.storedAps_.add(storedAccessPoint);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(storedAccessPoint);
                                    }
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getLimitsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag != 32) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i14 = codedInputStream.readEnum();
                                    if (GcsLocationType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(4, i14);
                                    } else {
                                        this.gcsLocation_ = i14;
                                        this.bitField0_ |= 8;
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
        public WifiSetupAgent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static WifiSetupAgent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiSetupAgent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WifiSetupAgent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WifiSetupAgent parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WifiSetupAgent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WifiSetupAgent parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WifiSetupAgent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WifiSetupAgent parseFrom(InputStream inputStream) {
            return (WifiSetupAgent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private WifiSetupAgent(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.gcsLocation_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WifiSetupAgent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiSetupAgent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WifiSetupAgent parseFrom(CodedInputStream codedInputStream) {
            return (WifiSetupAgent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ WifiSetupAgent(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static WifiSetupAgent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiSetupAgent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WifiSetupDevice extends GeneratedMessageV3 implements WifiSetupDeviceOrBuilder {
        public static final int CREDENTIALS_TYPES_FIELD_NUMBER = 5;
        public static final int LIMITS_FIELD_NUMBER = 3;
        public static final int NEEDS_CREDENTIALS_FIELD_NUMBER = 4;
        public static final int SCANNED_APS_FIELD_NUMBER = 1;
        public static final int STORED_APS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<Integer> credentialsTypes_;
        private Limits limits_;
        private byte memoizedIsInitialized;
        private boolean needsCredentials_;
        private List<ScannedAccessPoint> scannedAps_;
        private List<StoredAccessPoint> storedAps_;
        private static final Internal.ListAdapter.Converter<Integer, ServerCredentialType> credentialsTypes_converter_ = new Internal.ListAdapter.Converter<Integer, ServerCredentialType>() { // from class: com.garmin.proto.generated.WifiSetup.WifiSetupDevice.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public ServerCredentialType convert(Integer num) {
                ServerCredentialType serverCredentialTypeForNumber = ServerCredentialType.forNumber(num.intValue());
                return serverCredentialTypeForNumber == null ? ServerCredentialType.NONE : serverCredentialTypeForNumber;
            }
        };
        private static final WifiSetupDevice DEFAULT_INSTANCE = new WifiSetupDevice();

        @Deprecated
        public static final Parser<WifiSetupDevice> PARSER = new AbstractParser<WifiSetupDevice>() { // from class: com.garmin.proto.generated.WifiSetup.WifiSetupDevice.2
            @Override // com.google.protobuf.Parser
            public WifiSetupDevice parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WifiSetupDevice.newBuilder();
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

        private WifiSetupDevice() {
            this.needsCredentials_ = false;
            this.memoizedIsInitialized = (byte) -1;
            List list = Collections.EMPTY_LIST;
            this.scannedAps_ = list;
            this.storedAps_ = list;
            this.credentialsTypes_ = list;
        }

        public static WifiSetupDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WifiSetup.internal_static_GDI_fitness_WifiSetupDevice_descriptor;
        }

        public static Builder newBuilder(WifiSetupDevice wifiSetupDevice) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(wifiSetupDevice);
        }

        public static WifiSetupDevice parseDelimitedFrom(InputStream inputStream) {
            return (WifiSetupDevice) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WifiSetupDevice parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WifiSetupDevice> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WifiSetupDevice)) {
                return super.equals(obj);
            }
            WifiSetupDevice wifiSetupDevice = (WifiSetupDevice) obj;
            if (!getScannedApsList().equals(wifiSetupDevice.getScannedApsList()) || !getStoredApsList().equals(wifiSetupDevice.getStoredApsList()) || hasLimits() != wifiSetupDevice.hasLimits()) {
                return false;
            }
            if ((!hasLimits() || getLimits().equals(wifiSetupDevice.getLimits())) && hasNeedsCredentials() == wifiSetupDevice.hasNeedsCredentials()) {
                return (!hasNeedsCredentials() || getNeedsCredentials() == wifiSetupDevice.getNeedsCredentials()) && this.credentialsTypes_.equals(wifiSetupDevice.credentialsTypes_) && getUnknownFields().equals(wifiSetupDevice.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public ServerCredentialType getCredentialsTypes(int i14) {
            return credentialsTypes_converter_.convert(this.credentialsTypes_.get(i14));
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public int getCredentialsTypesCount() {
            return this.credentialsTypes_.size();
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public List<ServerCredentialType> getCredentialsTypesList() {
            return new Internal.ListAdapter(this.credentialsTypes_, credentialsTypes_converter_);
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public Limits getLimits() {
            Limits limits = this.limits_;
            return limits == null ? Limits.getDefaultInstance() : limits;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public LimitsOrBuilder getLimitsOrBuilder() {
            Limits limits = this.limits_;
            return limits == null ? Limits.getDefaultInstance() : limits;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public boolean getNeedsCredentials() {
            return this.needsCredentials_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WifiSetupDevice> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public ScannedAccessPoint getScannedAps(int i14) {
            return this.scannedAps_.get(i14);
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public int getScannedApsCount() {
            return this.scannedAps_.size();
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public List<ScannedAccessPoint> getScannedApsList() {
            return this.scannedAps_;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public ScannedAccessPointOrBuilder getScannedApsOrBuilder(int i14) {
            return this.scannedAps_.get(i14);
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public List<? extends ScannedAccessPointOrBuilder> getScannedApsOrBuilderList() {
            return this.scannedAps_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iComputeBoolSize = 0;
            for (int i16 = 0; i16 < this.scannedAps_.size(); i16++) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(1, this.scannedAps_.get(i16));
            }
            for (int i17 = 0; i17 < this.storedAps_.size(); i17++) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(2, this.storedAps_.get(i17));
            }
            if ((this.bitField0_ & 1) != 0) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(3, getLimits());
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(4, this.needsCredentials_);
            }
            int iA = 0;
            while (true) {
                int size = this.credentialsTypes_.size();
                List<Integer> list = this.credentialsTypes_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iComputeBoolSize + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public StoredAccessPoint getStoredAps(int i14) {
            return this.storedAps_.get(i14);
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public int getStoredApsCount() {
            return this.storedAps_.size();
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public List<StoredAccessPoint> getStoredApsList() {
            return this.storedAps_;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public StoredAccessPointOrBuilder getStoredApsOrBuilder(int i14) {
            return this.storedAps_.get(i14);
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public List<? extends StoredAccessPointOrBuilder> getStoredApsOrBuilderList() {
            return this.storedAps_;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public boolean hasLimits() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
        public boolean hasNeedsCredentials() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getScannedApsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getScannedApsList().hashCode();
            }
            if (getStoredApsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getStoredApsList().hashCode();
            }
            if (hasLimits()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getLimits().hashCode();
            }
            if (hasNeedsCredentials()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getNeedsCredentials());
            }
            if (getCredentialsTypesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + this.credentialsTypes_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WifiSetup.internal_static_GDI_fitness_WifiSetupDevice_fieldAccessorTable.ensureFieldAccessorsInitialized(WifiSetupDevice.class, Builder.class);
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
            for (int i14 = 0; i14 < getScannedApsCount(); i14++) {
                if (!getScannedAps(i14).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < getStoredApsCount(); i15++) {
                if (!getStoredAps(i15).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
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
            return new WifiSetupDevice();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iF = 0;
            for (int i14 = 0; i14 < this.scannedAps_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.scannedAps_.get(i14));
            }
            for (int i15 = 0; i15 < this.storedAps_.size(); i15++) {
                codedOutputStream.writeMessage(2, this.storedAps_.get(i15));
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(3, getLimits());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(4, this.needsCredentials_);
            }
            while (iF < this.credentialsTypes_.size()) {
                iF = f3.f(this.credentialsTypes_.get(iF), codedOutputStream, 5, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WifiSetupDeviceOrBuilder {
            private int bitField0_;
            private List<Integer> credentialsTypes_;
            private SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> limitsBuilder_;
            private Limits limits_;
            private boolean needsCredentials_;
            private RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> scannedApsBuilder_;
            private List<ScannedAccessPoint> scannedAps_;
            private RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> storedApsBuilder_;
            private List<StoredAccessPoint> storedAps_;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.scannedAps_ = list;
                this.storedAps_ = list;
                this.credentialsTypes_ = list;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(WifiSetupDevice wifiSetupDevice) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                    wifiSetupDevice.limits_ = singleFieldBuilderV3 == null ? this.limits_ : (Limits) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 8) != 0) {
                    wifiSetupDevice.needsCredentials_ = this.needsCredentials_;
                    i14 |= 2;
                }
                wifiSetupDevice.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(WifiSetupDevice wifiSetupDevice) {
                RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.scannedAps_ = Collections.unmodifiableList(this.scannedAps_);
                        this.bitField0_ &= -2;
                    }
                    wifiSetupDevice.scannedAps_ = this.scannedAps_;
                } else {
                    wifiSetupDevice.scannedAps_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV4 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV4 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.storedAps_ = Collections.unmodifiableList(this.storedAps_);
                        this.bitField0_ &= -3;
                    }
                    wifiSetupDevice.storedAps_ = this.storedAps_;
                } else {
                    wifiSetupDevice.storedAps_ = repeatedFieldBuilderV4.build();
                }
                if ((this.bitField0_ & 16) != 0) {
                    this.credentialsTypes_ = Collections.unmodifiableList(this.credentialsTypes_);
                    this.bitField0_ &= -17;
                }
                wifiSetupDevice.credentialsTypes_ = this.credentialsTypes_;
            }

            private void ensureCredentialsTypesIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.credentialsTypes_ = new ArrayList(this.credentialsTypes_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureScannedApsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.scannedAps_ = new ArrayList(this.scannedAps_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureStoredApsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.storedAps_ = new ArrayList(this.storedAps_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WifiSetup.internal_static_GDI_fitness_WifiSetupDevice_descriptor;
            }

            private SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> getLimitsFieldBuilder() {
                if (this.limitsBuilder_ == null) {
                    this.limitsBuilder_ = new SingleFieldBuilderV3<>(getLimits(), getParentForChildren(), isClean());
                    this.limits_ = null;
                }
                return this.limitsBuilder_;
            }

            private RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> getScannedApsFieldBuilder() {
                if (this.scannedApsBuilder_ == null) {
                    this.scannedApsBuilder_ = new RepeatedFieldBuilderV3<>(this.scannedAps_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.scannedAps_ = null;
                }
                return this.scannedApsBuilder_;
            }

            private RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> getStoredApsFieldBuilder() {
                if (this.storedApsBuilder_ == null) {
                    this.storedApsBuilder_ = new RepeatedFieldBuilderV3<>(this.storedAps_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.storedAps_ = null;
                }
                return this.storedApsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getScannedApsFieldBuilder();
                    getStoredApsFieldBuilder();
                    getLimitsFieldBuilder();
                }
            }

            public Builder addAllCredentialsTypes(Iterable<? extends ServerCredentialType> iterable) {
                ensureCredentialsTypesIsMutable();
                Iterator<? extends ServerCredentialType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.credentialsTypes_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllScannedAps(Iterable<? extends ScannedAccessPoint> iterable) {
                RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureScannedApsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.scannedAps_);
                onChanged();
                return this;
            }

            public Builder addAllStoredAps(Iterable<? extends StoredAccessPoint> iterable) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureStoredApsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.storedAps_);
                onChanged();
                return this;
            }

            public Builder addCredentialsTypes(ServerCredentialType serverCredentialType) {
                serverCredentialType.getClass();
                ensureCredentialsTypesIsMutable();
                this.credentialsTypes_.add(Integer.valueOf(serverCredentialType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addScannedAps(ScannedAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureScannedApsIsMutable();
                this.scannedAps_.add(builder.build());
                onChanged();
                return this;
            }

            public ScannedAccessPoint.Builder addScannedApsBuilder() {
                return (ScannedAccessPoint.Builder) getScannedApsFieldBuilder().addBuilder(ScannedAccessPoint.getDefaultInstance());
            }

            public Builder addStoredAps(StoredAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureStoredApsIsMutable();
                this.storedAps_.add(builder.build());
                onChanged();
                return this;
            }

            public StoredAccessPoint.Builder addStoredApsBuilder() {
                return (StoredAccessPoint.Builder) getStoredApsFieldBuilder().addBuilder(StoredAccessPoint.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WifiSetupDevice build() {
                WifiSetupDevice wifiSetupDeviceBuildPartial = buildPartial();
                if (wifiSetupDeviceBuildPartial.isInitialized()) {
                    return wifiSetupDeviceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) wifiSetupDeviceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WifiSetupDevice buildPartial() {
                WifiSetupDevice wifiSetupDevice = new WifiSetupDevice(this);
                buildPartialRepeatedFields(wifiSetupDevice);
                if (this.bitField0_ != 0) {
                    buildPartial0(wifiSetupDevice);
                }
                onBuilt();
                return wifiSetupDevice;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.scannedAps_ = Collections.EMPTY_LIST;
                } else {
                    this.scannedAps_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV4 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV4 == null) {
                    this.storedAps_ = Collections.EMPTY_LIST;
                } else {
                    this.storedAps_ = null;
                    repeatedFieldBuilderV4.clear();
                }
                this.bitField0_ &= -3;
                this.limits_ = null;
                SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.limitsBuilder_ = null;
                }
                this.needsCredentials_ = false;
                this.credentialsTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
                return this;
            }

            public Builder clearCredentialsTypes() {
                this.credentialsTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLimits() {
                this.bitField0_ &= -5;
                this.limits_ = null;
                SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.limitsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearNeedsCredentials() {
                this.bitField0_ &= -9;
                this.needsCredentials_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearScannedAps() {
                RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.scannedAps_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearStoredAps() {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.storedAps_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public ServerCredentialType getCredentialsTypes(int i14) {
                return (ServerCredentialType) WifiSetupDevice.credentialsTypes_converter_.convert(this.credentialsTypes_.get(i14));
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public int getCredentialsTypesCount() {
                return this.credentialsTypes_.size();
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public List<ServerCredentialType> getCredentialsTypesList() {
                return new Internal.ListAdapter(this.credentialsTypes_, WifiSetupDevice.credentialsTypes_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WifiSetup.internal_static_GDI_fitness_WifiSetupDevice_descriptor;
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public Limits getLimits() {
                SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Limits) singleFieldBuilderV3.getMessage();
                }
                Limits limits = this.limits_;
                return limits == null ? Limits.getDefaultInstance() : limits;
            }

            public Limits.Builder getLimitsBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (Limits.Builder) getLimitsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public LimitsOrBuilder getLimitsOrBuilder() {
                SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LimitsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Limits limits = this.limits_;
                return limits == null ? Limits.getDefaultInstance() : limits;
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public boolean getNeedsCredentials() {
                return this.needsCredentials_;
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public ScannedAccessPoint getScannedAps(int i14) {
                RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.scannedAps_.get(i14) : (ScannedAccessPoint) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ScannedAccessPoint.Builder getScannedApsBuilder(int i14) {
                return (ScannedAccessPoint.Builder) getScannedApsFieldBuilder().getBuilder(i14);
            }

            public List<ScannedAccessPoint.Builder> getScannedApsBuilderList() {
                return getScannedApsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public int getScannedApsCount() {
                RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.scannedAps_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public List<ScannedAccessPoint> getScannedApsList() {
                RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.scannedAps_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public ScannedAccessPointOrBuilder getScannedApsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.scannedAps_.get(i14) : (ScannedAccessPointOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public List<? extends ScannedAccessPointOrBuilder> getScannedApsOrBuilderList() {
                RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.scannedAps_);
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public StoredAccessPoint getStoredAps(int i14) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.storedAps_.get(i14) : (StoredAccessPoint) repeatedFieldBuilderV3.getMessage(i14);
            }

            public StoredAccessPoint.Builder getStoredApsBuilder(int i14) {
                return (StoredAccessPoint.Builder) getStoredApsFieldBuilder().getBuilder(i14);
            }

            public List<StoredAccessPoint.Builder> getStoredApsBuilderList() {
                return getStoredApsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public int getStoredApsCount() {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.storedAps_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public List<StoredAccessPoint> getStoredApsList() {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.storedAps_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public StoredAccessPointOrBuilder getStoredApsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.storedAps_.get(i14) : (StoredAccessPointOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public List<? extends StoredAccessPointOrBuilder> getStoredApsOrBuilderList() {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.storedAps_);
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public boolean hasLimits() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.WifiSetup.WifiSetupDeviceOrBuilder
            public boolean hasNeedsCredentials() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WifiSetup.internal_static_GDI_fitness_WifiSetupDevice_fieldAccessorTable.ensureFieldAccessorsInitialized(WifiSetupDevice.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getScannedApsCount(); i14++) {
                    if (!getScannedAps(i14).isInitialized()) {
                        return false;
                    }
                }
                for (int i15 = 0; i15 < getStoredApsCount(); i15++) {
                    if (!getStoredAps(i15).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(WifiSetupDevice wifiSetupDevice) {
                if (wifiSetupDevice == WifiSetupDevice.getDefaultInstance()) {
                    return this;
                }
                if (this.scannedApsBuilder_ == null) {
                    if (!wifiSetupDevice.scannedAps_.isEmpty()) {
                        if (this.scannedAps_.isEmpty()) {
                            this.scannedAps_ = wifiSetupDevice.scannedAps_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureScannedApsIsMutable();
                            this.scannedAps_.addAll(wifiSetupDevice.scannedAps_);
                        }
                        onChanged();
                    }
                } else if (!wifiSetupDevice.scannedAps_.isEmpty()) {
                    boolean zIsEmpty = this.scannedApsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.scannedApsBuilder_ = null;
                        this.scannedAps_ = wifiSetupDevice.scannedAps_;
                        this.bitField0_ &= -2;
                        this.scannedApsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getScannedApsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(wifiSetupDevice.scannedAps_);
                    }
                }
                if (this.storedApsBuilder_ == null) {
                    if (!wifiSetupDevice.storedAps_.isEmpty()) {
                        if (this.storedAps_.isEmpty()) {
                            this.storedAps_ = wifiSetupDevice.storedAps_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureStoredApsIsMutable();
                            this.storedAps_.addAll(wifiSetupDevice.storedAps_);
                        }
                        onChanged();
                    }
                } else if (!wifiSetupDevice.storedAps_.isEmpty()) {
                    boolean zIsEmpty2 = this.storedApsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV4 = this.storedApsBuilder_;
                    if (zIsEmpty2) {
                        repeatedFieldBuilderV4.dispose();
                        this.storedApsBuilder_ = null;
                        this.storedAps_ = wifiSetupDevice.storedAps_;
                        this.bitField0_ &= -3;
                        this.storedApsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getStoredApsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV4.addAllMessages(wifiSetupDevice.storedAps_);
                    }
                }
                if (wifiSetupDevice.hasLimits()) {
                    mergeLimits(wifiSetupDevice.getLimits());
                }
                if (wifiSetupDevice.hasNeedsCredentials()) {
                    setNeedsCredentials(wifiSetupDevice.getNeedsCredentials());
                }
                if (!wifiSetupDevice.credentialsTypes_.isEmpty()) {
                    if (this.credentialsTypes_.isEmpty()) {
                        this.credentialsTypes_ = wifiSetupDevice.credentialsTypes_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureCredentialsTypesIsMutable();
                        this.credentialsTypes_.addAll(wifiSetupDevice.credentialsTypes_);
                    }
                    onChanged();
                }
                mergeUnknownFields(wifiSetupDevice.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder mergeLimits(Limits limits) {
                Limits limits2;
                SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(limits);
                } else if ((this.bitField0_ & 4) == 0 || (limits2 = this.limits_) == null || limits2 == Limits.getDefaultInstance()) {
                    this.limits_ = limits;
                } else {
                    getLimitsBuilder().mergeFrom(limits);
                }
                if (this.limits_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeScannedAps(int i14) {
                RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureScannedApsIsMutable();
                this.scannedAps_.remove(i14);
                onChanged();
                return this;
            }

            public Builder removeStoredAps(int i14) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureStoredApsIsMutable();
                this.storedAps_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setCredentialsTypes(int i14, ServerCredentialType serverCredentialType) {
                serverCredentialType.getClass();
                ensureCredentialsTypesIsMutable();
                this.credentialsTypes_.set(i14, Integer.valueOf(serverCredentialType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLimits(Limits.Builder builder) {
                SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.limits_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setNeedsCredentials(boolean z14) {
                this.needsCredentials_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setScannedAps(int i14, ScannedAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureScannedApsIsMutable();
                this.scannedAps_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setStoredAps(int i14, StoredAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureStoredApsIsMutable();
                this.storedAps_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WifiSetupDevice getDefaultInstanceForType() {
                return WifiSetupDevice.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public ScannedAccessPoint.Builder addScannedApsBuilder(int i14) {
                return (ScannedAccessPoint.Builder) getScannedApsFieldBuilder().addBuilder(i14, ScannedAccessPoint.getDefaultInstance());
            }

            public StoredAccessPoint.Builder addStoredApsBuilder(int i14) {
                return (StoredAccessPoint.Builder) getStoredApsFieldBuilder().addBuilder(i14, StoredAccessPoint.getDefaultInstance());
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                List list = Collections.EMPTY_LIST;
                this.scannedAps_ = list;
                this.storedAps_ = list;
                this.credentialsTypes_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addScannedAps(int i14, ScannedAccessPoint scannedAccessPoint) {
                RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    scannedAccessPoint.getClass();
                    ensureScannedApsIsMutable();
                    this.scannedAps_.add(i14, scannedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, scannedAccessPoint);
                return this;
            }

            public Builder addStoredAps(int i14, StoredAccessPoint storedAccessPoint) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    storedAccessPoint.getClass();
                    ensureStoredApsIsMutable();
                    this.storedAps_.add(i14, storedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, storedAccessPoint);
                return this;
            }

            public Builder setLimits(Limits limits) {
                SingleFieldBuilderV3<Limits, Limits.Builder, LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    limits.getClass();
                    this.limits_ = limits;
                } else {
                    singleFieldBuilderV3.setMessage(limits);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setScannedAps(int i14, ScannedAccessPoint scannedAccessPoint) {
                RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    scannedAccessPoint.getClass();
                    ensureScannedApsIsMutable();
                    this.scannedAps_.set(i14, scannedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, scannedAccessPoint);
                return this;
            }

            public Builder setStoredAps(int i14, StoredAccessPoint storedAccessPoint) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    storedAccessPoint.getClass();
                    ensureStoredApsIsMutable();
                    this.storedAps_.set(i14, storedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, storedAccessPoint);
                return this;
            }

            public Builder addScannedAps(ScannedAccessPoint scannedAccessPoint) {
                RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    scannedAccessPoint.getClass();
                    ensureScannedApsIsMutable();
                    this.scannedAps_.add(scannedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(scannedAccessPoint);
                return this;
            }

            public Builder addStoredAps(StoredAccessPoint storedAccessPoint) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    storedAccessPoint.getClass();
                    ensureStoredApsIsMutable();
                    this.storedAps_.add(storedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(storedAccessPoint);
                return this;
            }

            public Builder addScannedAps(int i14, ScannedAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureScannedApsIsMutable();
                    this.scannedAps_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            public Builder addStoredAps(int i14, StoredAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureStoredApsIsMutable();
                    this.storedAps_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WifiSetupDevice) {
                    return mergeFrom((WifiSetupDevice) message);
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
                                    ScannedAccessPoint scannedAccessPoint = (ScannedAccessPoint) codedInputStream.readMessage(ScannedAccessPoint.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ScannedAccessPoint, ScannedAccessPoint.Builder, ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureScannedApsIsMutable();
                                        this.scannedAps_.add(scannedAccessPoint);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(scannedAccessPoint);
                                    }
                                } else if (tag == 18) {
                                    StoredAccessPoint storedAccessPoint = (StoredAccessPoint) codedInputStream.readMessage(StoredAccessPoint.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<StoredAccessPoint, StoredAccessPoint.Builder, StoredAccessPointOrBuilder> repeatedFieldBuilderV4 = this.storedApsBuilder_;
                                    if (repeatedFieldBuilderV4 == null) {
                                        ensureStoredApsIsMutable();
                                        this.storedAps_.add(storedAccessPoint);
                                    } else {
                                        repeatedFieldBuilderV4.addMessage(storedAccessPoint);
                                    }
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getLimitsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.needsCredentials_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ServerCredentialType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(5, i14);
                                    } else {
                                        ensureCredentialsTypesIsMutable();
                                        this.credentialsTypes_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag != 42) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (ServerCredentialType.forNumber(i15) == null) {
                                            mergeUnknownVarintField(5, i15);
                                        } else {
                                            ensureCredentialsTypesIsMutable();
                                            this.credentialsTypes_.add(Integer.valueOf(i15));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
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
        public WifiSetupDevice getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static WifiSetupDevice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiSetupDevice) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WifiSetupDevice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WifiSetupDevice parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WifiSetupDevice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WifiSetupDevice parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WifiSetupDevice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WifiSetupDevice parseFrom(InputStream inputStream) {
            return (WifiSetupDevice) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WifiSetupDevice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiSetupDevice) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private WifiSetupDevice(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.needsCredentials_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WifiSetupDevice parseFrom(CodedInputStream codedInputStream) {
            return (WifiSetupDevice) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WifiSetupDevice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiSetupDevice) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ WifiSetupDevice(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum ApType implements ProtocolMessageEnum {
        AP_TYPE_UNKNOWN(0),
        AP_TYPE_DEVICE_TO_DEVICE(1),
        AP_TYPE_INTERNET(2);

        public static final int AP_TYPE_DEVICE_TO_DEVICE_VALUE = 1;
        public static final int AP_TYPE_INTERNET_VALUE = 2;
        public static final int AP_TYPE_UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<ApType> internalValueMap = new Internal.EnumLiteMap<ApType>() { // from class: com.garmin.proto.generated.WifiSetup.ApType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ApType findValueByNumber(int i14) {
                return ApType.forNumber(i14);
            }
        };
        private static final ApType[] VALUES = values();

        ApType(int i14) {
            this.value = i14;
        }

        public static ApType forNumber(int i14) {
            if (i14 == 0) {
                return AP_TYPE_UNKNOWN;
            }
            if (i14 == 1) {
                return AP_TYPE_DEVICE_TO_DEVICE;
            }
            if (i14 != 2) {
                return null;
            }
            return AP_TYPE_INTERNET;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return WifiSetup.getDescriptor().getEnumTypes().get(3);
        }

        public static Internal.EnumLiteMap<ApType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ApType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static ApType valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum GcsLocationType implements ProtocolMessageEnum {
        PRODUCTION(0),
        CHINA(1),
        TEST(2),
        STAGE(3);

        public static final int CHINA_VALUE = 1;
        public static final int PRODUCTION_VALUE = 0;
        public static final int STAGE_VALUE = 3;
        public static final int TEST_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<GcsLocationType> internalValueMap = new Internal.EnumLiteMap<GcsLocationType>() { // from class: com.garmin.proto.generated.WifiSetup.GcsLocationType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public GcsLocationType findValueByNumber(int i14) {
                return GcsLocationType.forNumber(i14);
            }
        };
        private static final GcsLocationType[] VALUES = values();

        GcsLocationType(int i14) {
            this.value = i14;
        }

        public static GcsLocationType forNumber(int i14) {
            if (i14 == 0) {
                return PRODUCTION;
            }
            if (i14 == 1) {
                return CHINA;
            }
            if (i14 == 2) {
                return TEST;
            }
            if (i14 != 3) {
                return null;
            }
            return STAGE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return WifiSetup.getDescriptor().getEnumTypes().get(2);
        }

        public static Internal.EnumLiteMap<GcsLocationType> internalGetValueMap() {
            return internalValueMap;
        }

        public static GcsLocationType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static GcsLocationType valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum SecurityType implements ProtocolMessageEnum {
        OPEN(0),
        WEP(1),
        WPA(2),
        WPA2(3),
        WPA3(4);

        public static final int OPEN_VALUE = 0;
        public static final int WEP_VALUE = 1;
        public static final int WPA2_VALUE = 3;
        public static final int WPA3_VALUE = 4;
        public static final int WPA_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<SecurityType> internalValueMap = new Internal.EnumLiteMap<SecurityType>() { // from class: com.garmin.proto.generated.WifiSetup.SecurityType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SecurityType findValueByNumber(int i14) {
                return SecurityType.forNumber(i14);
            }
        };
        private static final SecurityType[] VALUES = values();

        SecurityType(int i14) {
            this.value = i14;
        }

        public static SecurityType forNumber(int i14) {
            if (i14 == 0) {
                return OPEN;
            }
            if (i14 == 1) {
                return WEP;
            }
            if (i14 == 2) {
                return WPA;
            }
            if (i14 == 3) {
                return WPA2;
            }
            if (i14 != 4) {
                return null;
            }
            return WPA3;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return WifiSetup.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<SecurityType> internalGetValueMap() {
            return internalValueMap;
        }

        public static SecurityType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static SecurityType valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum ServerCredentialType implements ProtocolMessageEnum {
        NONE(0),
        CONNECT_OAUTH1(1);

        public static final int CONNECT_OAUTH1_VALUE = 1;
        public static final int NONE_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<ServerCredentialType> internalValueMap = new Internal.EnumLiteMap<ServerCredentialType>() { // from class: com.garmin.proto.generated.WifiSetup.ServerCredentialType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ServerCredentialType findValueByNumber(int i14) {
                return ServerCredentialType.forNumber(i14);
            }
        };
        private static final ServerCredentialType[] VALUES = values();

        ServerCredentialType(int i14) {
            this.value = i14;
        }

        public static ServerCredentialType forNumber(int i14) {
            if (i14 == 0) {
                return NONE;
            }
            if (i14 != 1) {
                return null;
            }
            return CONNECT_OAUTH1;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return WifiSetup.getDescriptor().getEnumTypes().get(5);
        }

        public static Internal.EnumLiteMap<ServerCredentialType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ServerCredentialType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static ServerCredentialType valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum StatusType implements ProtocolMessageEnum {
        Unknown(0),
        ConnectionSuccess(1),
        InvalidCredentials(2),
        NotFound(3),
        NoDHCP(4),
        NoInternet(5),
        CaptivePortal(6);

        public static final int CaptivePortal_VALUE = 6;
        public static final int ConnectionSuccess_VALUE = 1;
        public static final int InvalidCredentials_VALUE = 2;
        public static final int NoDHCP_VALUE = 4;
        public static final int NoInternet_VALUE = 5;
        public static final int NotFound_VALUE = 3;
        public static final int Unknown_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<StatusType> internalValueMap = new Internal.EnumLiteMap<StatusType>() { // from class: com.garmin.proto.generated.WifiSetup.StatusType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public StatusType findValueByNumber(int i14) {
                return StatusType.forNumber(i14);
            }
        };
        private static final StatusType[] VALUES = values();

        StatusType(int i14) {
            this.value = i14;
        }

        public static StatusType forNumber(int i14) {
            switch (i14) {
                case 0:
                    return Unknown;
                case 1:
                    return ConnectionSuccess;
                case 2:
                    return InvalidCredentials;
                case 3:
                    return NotFound;
                case 4:
                    return NoDHCP;
                case 5:
                    return NoInternet;
                case 6:
                    return CaptivePortal;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return WifiSetup.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<StatusType> internalGetValueMap() {
            return internalValueMap;
        }

        public static StatusType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static StatusType valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum WifiBand implements ProtocolMessageEnum {
        WIFI_BAND_5_GHZ(0),
        WIFI_BAND_2P4_GHZ(1);

        public static final int WIFI_BAND_2P4_GHZ_VALUE = 1;
        public static final int WIFI_BAND_5_GHZ_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<WifiBand> internalValueMap = new Internal.EnumLiteMap<WifiBand>() { // from class: com.garmin.proto.generated.WifiSetup.WifiBand.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WifiBand findValueByNumber(int i14) {
                return WifiBand.forNumber(i14);
            }
        };
        private static final WifiBand[] VALUES = values();

        WifiBand(int i14) {
            this.value = i14;
        }

        public static WifiBand forNumber(int i14) {
            if (i14 == 0) {
                return WIFI_BAND_5_GHZ;
            }
            if (i14 != 1) {
                return null;
            }
            return WIFI_BAND_2P4_GHZ;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return WifiSetup.getDescriptor().getEnumTypes().get(4);
        }

        public static Internal.EnumLiteMap<WifiBand> internalGetValueMap() {
            return internalValueMap;
        }

        public static WifiBand valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static WifiBand valueOf(int i14) {
            return forNumber(i14);
        }
    }
}

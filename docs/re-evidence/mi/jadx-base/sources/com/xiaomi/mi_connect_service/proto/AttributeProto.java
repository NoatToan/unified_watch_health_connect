package com.xiaomi.mi_connect_service.proto;

import androidx.room.util.TableInfo;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.b;
import com.google.protobuf.d0;
import com.google.protobuf.j;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import defpackage.bsf;
import defpackage.vkh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class AttributeProto {

    /* JADX INFO: renamed from: com.xiaomi.mi_connect_service.proto.AttributeProto$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class AttrAdvData extends GeneratedMessageLite<AttrAdvData, Builder> implements AttrAdvDataOrBuilder {
        public static final int APPIDS_FIELD_NUMBER = 13;
        public static final int APPSDATA_FIELD_NUMBER = 9;
        public static final int APPS_FIELD_NUMBER = 3;
        public static final int COMMDATA_FIELD_NUMBER = 14;
        public static final int CURRENTSETTING_FIELD_NUMBER = 11;
        private static final AttrAdvData DEFAULT_INSTANCE;
        public static final int DEVICETYPE_FIELD_NUMBER = 7;
        public static final int FLAGS_FIELD_NUMBER = 4;
        public static final int IDHASH_FIELD_NUMBER = 6;
        public static final int NAME_FIELD_NUMBER = 5;
        private static volatile vkh<AttrAdvData> PARSER = null;
        public static final int SECURITYMODE_FIELD_NUMBER = 8;
        public static final int SUPPORTSETTING_FIELD_NUMBER = 10;
        public static final int VERSIONMAJOR_FIELD_NUMBER = 1;
        public static final int VERSIONMINOR_FIELD_NUMBER = 2;
        public static final int WIFIMAC_FIELD_NUMBER = 12;
        public static final int ZIPED_FIELD_NUMBER = 15;
        private int appIdsMemoizedSerializedSize = -1;
        private d0.g appIds_;
        private d0.i<ByteString> appsData_;
        private ByteString apps_;
        private int commData_;
        private d0.i<ByteString> currentSetting_;
        private int deviceType_;
        private ByteString flags_;
        private ByteString idHash_;
        private String name_;
        private int securityMode_;
        private d0.i<ByteString> supportSetting_;
        private int versionMajor_;
        private int versionMinor_;
        private String wifiMac_;
        private boolean ziped_;

        public static final class Builder extends GeneratedMessageLite.a<AttrAdvData, Builder> implements AttrAdvDataOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllAppIds(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((AttrAdvData) this.instance).addAllAppIds(iterable);
                return this;
            }

            public Builder addAllAppsData(Iterable<? extends ByteString> iterable) {
                copyOnWrite();
                ((AttrAdvData) this.instance).addAllAppsData(iterable);
                return this;
            }

            public Builder addAllCurrentSetting(Iterable<? extends ByteString> iterable) {
                copyOnWrite();
                ((AttrAdvData) this.instance).addAllCurrentSetting(iterable);
                return this;
            }

            public Builder addAllSupportSetting(Iterable<? extends ByteString> iterable) {
                copyOnWrite();
                ((AttrAdvData) this.instance).addAllSupportSetting(iterable);
                return this;
            }

            public Builder addAppIds(int i) {
                copyOnWrite();
                ((AttrAdvData) this.instance).addAppIds(i);
                return this;
            }

            public Builder addAppsData(ByteString byteString) {
                copyOnWrite();
                ((AttrAdvData) this.instance).addAppsData(byteString);
                return this;
            }

            public Builder addCurrentSetting(ByteString byteString) {
                copyOnWrite();
                ((AttrAdvData) this.instance).addCurrentSetting(byteString);
                return this;
            }

            public Builder addSupportSetting(ByteString byteString) {
                copyOnWrite();
                ((AttrAdvData) this.instance).addSupportSetting(byteString);
                return this;
            }

            public Builder clearAppIds() {
                copyOnWrite();
                ((AttrAdvData) this.instance).clearAppIds();
                return this;
            }

            public Builder clearApps() {
                copyOnWrite();
                ((AttrAdvData) this.instance).clearApps();
                return this;
            }

            public Builder clearAppsData() {
                copyOnWrite();
                ((AttrAdvData) this.instance).clearAppsData();
                return this;
            }

            public Builder clearCommData() {
                copyOnWrite();
                ((AttrAdvData) this.instance).clearCommData();
                return this;
            }

            public Builder clearCurrentSetting() {
                copyOnWrite();
                ((AttrAdvData) this.instance).clearCurrentSetting();
                return this;
            }

            public Builder clearDeviceType() {
                copyOnWrite();
                ((AttrAdvData) this.instance).clearDeviceType();
                return this;
            }

            public Builder clearFlags() {
                copyOnWrite();
                ((AttrAdvData) this.instance).clearFlags();
                return this;
            }

            public Builder clearIdHash() {
                copyOnWrite();
                ((AttrAdvData) this.instance).clearIdHash();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((AttrAdvData) this.instance).clearName();
                return this;
            }

            public Builder clearSecurityMode() {
                copyOnWrite();
                ((AttrAdvData) this.instance).clearSecurityMode();
                return this;
            }

            public Builder clearSupportSetting() {
                copyOnWrite();
                ((AttrAdvData) this.instance).clearSupportSetting();
                return this;
            }

            public Builder clearVersionMajor() {
                copyOnWrite();
                ((AttrAdvData) this.instance).clearVersionMajor();
                return this;
            }

            public Builder clearVersionMinor() {
                copyOnWrite();
                ((AttrAdvData) this.instance).clearVersionMinor();
                return this;
            }

            public Builder clearWifiMac() {
                copyOnWrite();
                ((AttrAdvData) this.instance).clearWifiMac();
                return this;
            }

            public Builder clearZiped() {
                copyOnWrite();
                ((AttrAdvData) this.instance).clearZiped();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public int getAppIds(int i) {
                return ((AttrAdvData) this.instance).getAppIds(i);
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public int getAppIdsCount() {
                return ((AttrAdvData) this.instance).getAppIdsCount();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public List<Integer> getAppIdsList() {
                return Collections.unmodifiableList(((AttrAdvData) this.instance).getAppIdsList());
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public ByteString getApps() {
                return ((AttrAdvData) this.instance).getApps();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public ByteString getAppsData(int i) {
                return ((AttrAdvData) this.instance).getAppsData(i);
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public int getAppsDataCount() {
                return ((AttrAdvData) this.instance).getAppsDataCount();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public List<ByteString> getAppsDataList() {
                return Collections.unmodifiableList(((AttrAdvData) this.instance).getAppsDataList());
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public int getCommData() {
                return ((AttrAdvData) this.instance).getCommData();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public ByteString getCurrentSetting(int i) {
                return ((AttrAdvData) this.instance).getCurrentSetting(i);
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public int getCurrentSettingCount() {
                return ((AttrAdvData) this.instance).getCurrentSettingCount();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public List<ByteString> getCurrentSettingList() {
                return Collections.unmodifiableList(((AttrAdvData) this.instance).getCurrentSettingList());
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public int getDeviceType() {
                return ((AttrAdvData) this.instance).getDeviceType();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public ByteString getFlags() {
                return ((AttrAdvData) this.instance).getFlags();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public ByteString getIdHash() {
                return ((AttrAdvData) this.instance).getIdHash();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public String getName() {
                return ((AttrAdvData) this.instance).getName();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public ByteString getNameBytes() {
                return ((AttrAdvData) this.instance).getNameBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public int getSecurityMode() {
                return ((AttrAdvData) this.instance).getSecurityMode();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public ByteString getSupportSetting(int i) {
                return ((AttrAdvData) this.instance).getSupportSetting(i);
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public int getSupportSettingCount() {
                return ((AttrAdvData) this.instance).getSupportSettingCount();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public List<ByteString> getSupportSettingList() {
                return Collections.unmodifiableList(((AttrAdvData) this.instance).getSupportSettingList());
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public int getVersionMajor() {
                return ((AttrAdvData) this.instance).getVersionMajor();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public int getVersionMinor() {
                return ((AttrAdvData) this.instance).getVersionMinor();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public String getWifiMac() {
                return ((AttrAdvData) this.instance).getWifiMac();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public ByteString getWifiMacBytes() {
                return ((AttrAdvData) this.instance).getWifiMacBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
            public boolean getZiped() {
                return ((AttrAdvData) this.instance).getZiped();
            }

            public Builder setAppIds(int i, int i2) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setAppIds(i, i2);
                return this;
            }

            public Builder setApps(ByteString byteString) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setApps(byteString);
                return this;
            }

            public Builder setAppsData(int i, ByteString byteString) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setAppsData(i, byteString);
                return this;
            }

            public Builder setCommData(int i) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setCommData(i);
                return this;
            }

            public Builder setCurrentSetting(int i, ByteString byteString) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setCurrentSetting(i, byteString);
                return this;
            }

            public Builder setDeviceType(int i) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setDeviceType(i);
                return this;
            }

            public Builder setFlags(ByteString byteString) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setFlags(byteString);
                return this;
            }

            public Builder setIdHash(ByteString byteString) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setIdHash(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setSecurityMode(int i) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setSecurityMode(i);
                return this;
            }

            public Builder setSupportSetting(int i, ByteString byteString) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setSupportSetting(i, byteString);
                return this;
            }

            public Builder setVersionMajor(int i) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setVersionMajor(i);
                return this;
            }

            public Builder setVersionMinor(int i) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setVersionMinor(i);
                return this;
            }

            public Builder setWifiMac(String str) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setWifiMac(str);
                return this;
            }

            public Builder setWifiMacBytes(ByteString byteString) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setWifiMacBytes(byteString);
                return this;
            }

            public Builder setZiped(boolean z) {
                copyOnWrite();
                ((AttrAdvData) this.instance).setZiped(z);
                return this;
            }

            private Builder() {
                super(AttrAdvData.DEFAULT_INSTANCE);
            }
        }

        static {
            AttrAdvData attrAdvData = new AttrAdvData();
            DEFAULT_INSTANCE = attrAdvData;
            GeneratedMessageLite.registerDefaultInstance(AttrAdvData.class, attrAdvData);
        }

        private AttrAdvData() {
            ByteString byteString = ByteString.EMPTY;
            this.apps_ = byteString;
            this.flags_ = byteString;
            this.name_ = "";
            this.idHash_ = byteString;
            this.appsData_ = GeneratedMessageLite.emptyProtobufList();
            this.supportSetting_ = GeneratedMessageLite.emptyProtobufList();
            this.currentSetting_ = GeneratedMessageLite.emptyProtobufList();
            this.wifiMac_ = "";
            this.appIds_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAppIds(Iterable<? extends Integer> iterable) {
            ensureAppIdsIsMutable();
            b.addAll((Iterable) iterable, (List) this.appIds_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAppsData(Iterable<? extends ByteString> iterable) {
            ensureAppsDataIsMutable();
            b.addAll((Iterable) iterable, (List) this.appsData_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCurrentSetting(Iterable<? extends ByteString> iterable) {
            ensureCurrentSettingIsMutable();
            b.addAll((Iterable) iterable, (List) this.currentSetting_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSupportSetting(Iterable<? extends ByteString> iterable) {
            ensureSupportSettingIsMutable();
            b.addAll((Iterable) iterable, (List) this.supportSetting_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAppIds(int i) {
            ensureAppIdsIsMutable();
            this.appIds_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAppsData(ByteString byteString) {
            byteString.getClass();
            ensureAppsDataIsMutable();
            this.appsData_.add(byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrentSetting(ByteString byteString) {
            byteString.getClass();
            ensureCurrentSettingIsMutable();
            this.currentSetting_.add(byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportSetting(ByteString byteString) {
            byteString.getClass();
            ensureSupportSettingIsMutable();
            this.supportSetting_.add(byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppIds() {
            this.appIds_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearApps() {
            this.apps_ = getDefaultInstance().getApps();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppsData() {
            this.appsData_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCommData() {
            this.commData_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentSetting() {
            this.currentSetting_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceType() {
            this.deviceType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlags() {
            this.flags_ = getDefaultInstance().getFlags();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdHash() {
            this.idHash_ = getDefaultInstance().getIdHash();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecurityMode() {
            this.securityMode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSupportSetting() {
            this.supportSetting_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersionMajor() {
            this.versionMajor_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersionMinor() {
            this.versionMinor_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWifiMac() {
            this.wifiMac_ = getDefaultInstance().getWifiMac();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearZiped() {
            this.ziped_ = false;
        }

        private void ensureAppIdsIsMutable() {
            d0.g gVar = this.appIds_;
            if (gVar.c()) {
                return;
            }
            this.appIds_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureAppsDataIsMutable() {
            d0.i<ByteString> iVar = this.appsData_;
            if (iVar.c()) {
                return;
            }
            this.appsData_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        private void ensureCurrentSettingIsMutable() {
            d0.i<ByteString> iVar = this.currentSetting_;
            if (iVar.c()) {
                return;
            }
            this.currentSetting_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        private void ensureSupportSettingIsMutable() {
            d0.i<ByteString> iVar = this.supportSetting_;
            if (iVar.c()) {
                return;
            }
            this.supportSetting_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        public static AttrAdvData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AttrAdvData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AttrAdvData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrAdvData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AttrAdvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AttrAdvData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppIds(int i, int i2) {
            ensureAppIdsIsMutable();
            this.appIds_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApps(ByteString byteString) {
            byteString.getClass();
            this.apps_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppsData(int i, ByteString byteString) {
            byteString.getClass();
            ensureAppsDataIsMutable();
            this.appsData_.set(i, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommData(int i) {
            this.commData_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentSetting(int i, ByteString byteString) {
            byteString.getClass();
            ensureCurrentSettingIsMutable();
            this.currentSetting_.set(i, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceType(int i) {
            this.deviceType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlags(ByteString byteString) {
            byteString.getClass();
            this.flags_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdHash(ByteString byteString) {
            byteString.getClass();
            this.idHash_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecurityMode(int i) {
            this.securityMode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSupportSetting(int i, ByteString byteString) {
            byteString.getClass();
            ensureSupportSettingIsMutable();
            this.supportSetting_.set(i, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionMajor(int i) {
            this.versionMajor_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionMinor(int i) {
            this.versionMinor_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiMac(String str) {
            str.getClass();
            this.wifiMac_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiMacBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.wifiMac_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setZiped(boolean z) {
            this.ziped_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AttrAdvData();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0004\u0000\u0001\u0004\u0002\u0004\u0003\n\u0004\n\u0005Ȉ\u0006\n\u0007\u0004\b\u0004\t\u001c\n\u001c\u000b\u001c\fȈ\r'\u000e\u0004\u000f\u0007", new Object[]{"versionMajor_", "versionMinor_", "apps_", "flags_", "name_", "idHash_", "deviceType_", "securityMode_", "appsData_", "supportSetting_", "currentSetting_", "wifiMac_", "appIds_", "commData_", "ziped_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AttrAdvData> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AttrAdvData.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public int getAppIds(int i) {
            return this.appIds_.getInt(i);
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public int getAppIdsCount() {
            return this.appIds_.size();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public List<Integer> getAppIdsList() {
            return this.appIds_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public ByteString getApps() {
            return this.apps_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public ByteString getAppsData(int i) {
            return this.appsData_.get(i);
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public int getAppsDataCount() {
            return this.appsData_.size();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public List<ByteString> getAppsDataList() {
            return this.appsData_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public int getCommData() {
            return this.commData_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public ByteString getCurrentSetting(int i) {
            return this.currentSetting_.get(i);
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public int getCurrentSettingCount() {
            return this.currentSetting_.size();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public List<ByteString> getCurrentSettingList() {
            return this.currentSetting_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public int getDeviceType() {
            return this.deviceType_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public ByteString getFlags() {
            return this.flags_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public ByteString getIdHash() {
            return this.idHash_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public int getSecurityMode() {
            return this.securityMode_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public ByteString getSupportSetting(int i) {
            return this.supportSetting_.get(i);
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public int getSupportSettingCount() {
            return this.supportSetting_.size();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public List<ByteString> getSupportSettingList() {
            return this.supportSetting_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public int getVersionMajor() {
            return this.versionMajor_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public int getVersionMinor() {
            return this.versionMinor_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public String getWifiMac() {
            return this.wifiMac_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public ByteString getWifiMacBytes() {
            return ByteString.copyFromUtf8(this.wifiMac_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrAdvDataOrBuilder
        public boolean getZiped() {
            return this.ziped_;
        }

        public static Builder newBuilder(AttrAdvData attrAdvData) {
            return DEFAULT_INSTANCE.createBuilder(attrAdvData);
        }

        public static AttrAdvData parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrAdvData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrAdvData parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AttrAdvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AttrAdvData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AttrAdvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AttrAdvData parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AttrAdvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AttrAdvData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AttrAdvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AttrAdvData parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AttrAdvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AttrAdvData parseFrom(InputStream inputStream) throws IOException {
            return (AttrAdvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrAdvData parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrAdvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrAdvData parseFrom(j jVar) throws IOException {
            return (AttrAdvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AttrAdvData parseFrom(j jVar, t tVar) throws IOException {
            return (AttrAdvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AttrAdvDataOrBuilder extends bsf {
        int getAppIds(int i);

        int getAppIdsCount();

        List<Integer> getAppIdsList();

        ByteString getApps();

        ByteString getAppsData(int i);

        int getAppsDataCount();

        List<ByteString> getAppsDataList();

        int getCommData();

        ByteString getCurrentSetting(int i);

        int getCurrentSettingCount();

        List<ByteString> getCurrentSettingList();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDeviceType();

        ByteString getFlags();

        ByteString getIdHash();

        String getName();

        ByteString getNameBytes();

        int getSecurityMode();

        ByteString getSupportSetting(int i);

        int getSupportSettingCount();

        List<ByteString> getSupportSettingList();

        int getVersionMajor();

        int getVersionMinor();

        String getWifiMac();

        ByteString getWifiMacBytes();

        boolean getZiped();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AttrNotifyPull extends GeneratedMessageLite<AttrNotifyPull, Builder> implements AttrNotifyPullOrBuilder {
        private static final AttrNotifyPull DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 1;
        private static volatile vkh<AttrNotifyPull> PARSER;
        private int index_;

        public static final class Builder extends GeneratedMessageLite.a<AttrNotifyPull, Builder> implements AttrNotifyPullOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((AttrNotifyPull) this.instance).clearIndex();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyPullOrBuilder
            public int getIndex() {
                return ((AttrNotifyPull) this.instance).getIndex();
            }

            public Builder setIndex(int i) {
                copyOnWrite();
                ((AttrNotifyPull) this.instance).setIndex(i);
                return this;
            }

            private Builder() {
                super(AttrNotifyPull.DEFAULT_INSTANCE);
            }
        }

        static {
            AttrNotifyPull attrNotifyPull = new AttrNotifyPull();
            DEFAULT_INSTANCE = attrNotifyPull;
            GeneratedMessageLite.registerDefaultInstance(AttrNotifyPull.class, attrNotifyPull);
        }

        private AttrNotifyPull() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        public static AttrNotifyPull getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AttrNotifyPull parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AttrNotifyPull) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrNotifyPull parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AttrNotifyPull) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AttrNotifyPull> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.index_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AttrNotifyPull();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{TableInfo.Index.DEFAULT_PREFIX});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AttrNotifyPull> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AttrNotifyPull.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyPullOrBuilder
        public int getIndex() {
            return this.index_;
        }

        public static Builder newBuilder(AttrNotifyPull attrNotifyPull) {
            return DEFAULT_INSTANCE.createBuilder(attrNotifyPull);
        }

        public static AttrNotifyPull parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrNotifyPull) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrNotifyPull parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AttrNotifyPull) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AttrNotifyPull parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AttrNotifyPull) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AttrNotifyPull parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AttrNotifyPull) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AttrNotifyPull parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AttrNotifyPull) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AttrNotifyPull parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AttrNotifyPull) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AttrNotifyPull parseFrom(InputStream inputStream) throws IOException {
            return (AttrNotifyPull) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrNotifyPull parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrNotifyPull) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrNotifyPull parseFrom(j jVar) throws IOException {
            return (AttrNotifyPull) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AttrNotifyPull parseFrom(j jVar, t tVar) throws IOException {
            return (AttrNotifyPull) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AttrNotifyPullOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getIndex();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AttrNotifyPush extends GeneratedMessageLite<AttrNotifyPush, Builder> implements AttrNotifyPushOrBuilder {
        private static final AttrNotifyPush DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 1;
        private static volatile vkh<AttrNotifyPush> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 3;
        public static final int ZIPED_FIELD_NUMBER = 4;
        private int index_;
        private String uuid_ = "";
        private ByteString value_ = ByteString.EMPTY;
        private boolean ziped_;

        public static final class Builder extends GeneratedMessageLite.a<AttrNotifyPush, Builder> implements AttrNotifyPushOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((AttrNotifyPush) this.instance).clearIndex();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((AttrNotifyPush) this.instance).clearUuid();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((AttrNotifyPush) this.instance).clearValue();
                return this;
            }

            public Builder clearZiped() {
                copyOnWrite();
                ((AttrNotifyPush) this.instance).clearZiped();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyPushOrBuilder
            public int getIndex() {
                return ((AttrNotifyPush) this.instance).getIndex();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyPushOrBuilder
            public String getUuid() {
                return ((AttrNotifyPush) this.instance).getUuid();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyPushOrBuilder
            public ByteString getUuidBytes() {
                return ((AttrNotifyPush) this.instance).getUuidBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyPushOrBuilder
            public ByteString getValue() {
                return ((AttrNotifyPush) this.instance).getValue();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyPushOrBuilder
            public boolean getZiped() {
                return ((AttrNotifyPush) this.instance).getZiped();
            }

            public Builder setIndex(int i) {
                copyOnWrite();
                ((AttrNotifyPush) this.instance).setIndex(i);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((AttrNotifyPush) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) {
                copyOnWrite();
                ((AttrNotifyPush) this.instance).setUuidBytes(byteString);
                return this;
            }

            public Builder setValue(ByteString byteString) {
                copyOnWrite();
                ((AttrNotifyPush) this.instance).setValue(byteString);
                return this;
            }

            public Builder setZiped(boolean z) {
                copyOnWrite();
                ((AttrNotifyPush) this.instance).setZiped(z);
                return this;
            }

            private Builder() {
                super(AttrNotifyPush.DEFAULT_INSTANCE);
            }
        }

        static {
            AttrNotifyPush attrNotifyPush = new AttrNotifyPush();
            DEFAULT_INSTANCE = attrNotifyPush;
            GeneratedMessageLite.registerDefaultInstance(AttrNotifyPush.class, attrNotifyPush);
        }

        private AttrNotifyPush() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearZiped() {
            this.ziped_ = false;
        }

        public static AttrNotifyPush getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AttrNotifyPush parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AttrNotifyPush) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrNotifyPush parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AttrNotifyPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AttrNotifyPush> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(ByteString byteString) {
            byteString.getClass();
            this.value_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setZiped(boolean z) {
            this.ziped_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AttrNotifyPush();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\n\u0004\u0007", new Object[]{TableInfo.Index.DEFAULT_PREFIX, "uuid_", "value_", "ziped_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AttrNotifyPush> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AttrNotifyPush.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyPushOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyPushOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyPushOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyPushOrBuilder
        public ByteString getValue() {
            return this.value_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyPushOrBuilder
        public boolean getZiped() {
            return this.ziped_;
        }

        public static Builder newBuilder(AttrNotifyPush attrNotifyPush) {
            return DEFAULT_INSTANCE.createBuilder(attrNotifyPush);
        }

        public static AttrNotifyPush parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrNotifyPush) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrNotifyPush parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AttrNotifyPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AttrNotifyPush parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AttrNotifyPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AttrNotifyPush parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AttrNotifyPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AttrNotifyPush parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AttrNotifyPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AttrNotifyPush parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AttrNotifyPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AttrNotifyPush parseFrom(InputStream inputStream) throws IOException {
            return (AttrNotifyPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrNotifyPush parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrNotifyPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrNotifyPush parseFrom(j jVar) throws IOException {
            return (AttrNotifyPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AttrNotifyPush parseFrom(j jVar, t tVar) throws IOException {
            return (AttrNotifyPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AttrNotifyPushOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getIndex();

        String getUuid();

        ByteString getUuidBytes();

        ByteString getValue();

        boolean getZiped();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AttrNotifyRequest extends GeneratedMessageLite<AttrNotifyRequest, Builder> implements AttrNotifyRequestOrBuilder {
        private static final AttrNotifyRequest DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 3;
        private static volatile vkh<AttrNotifyRequest> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        public static final int ZIPED_FIELD_NUMBER = 4;
        private int index_;
        private String uuid_ = "";
        private ByteString value_ = ByteString.EMPTY;
        private boolean ziped_;

        public static final class Builder extends GeneratedMessageLite.a<AttrNotifyRequest, Builder> implements AttrNotifyRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((AttrNotifyRequest) this.instance).clearIndex();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((AttrNotifyRequest) this.instance).clearUuid();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((AttrNotifyRequest) this.instance).clearValue();
                return this;
            }

            public Builder clearZiped() {
                copyOnWrite();
                ((AttrNotifyRequest) this.instance).clearZiped();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyRequestOrBuilder
            public int getIndex() {
                return ((AttrNotifyRequest) this.instance).getIndex();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyRequestOrBuilder
            public String getUuid() {
                return ((AttrNotifyRequest) this.instance).getUuid();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyRequestOrBuilder
            public ByteString getUuidBytes() {
                return ((AttrNotifyRequest) this.instance).getUuidBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyRequestOrBuilder
            public ByteString getValue() {
                return ((AttrNotifyRequest) this.instance).getValue();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyRequestOrBuilder
            public boolean getZiped() {
                return ((AttrNotifyRequest) this.instance).getZiped();
            }

            public Builder setIndex(int i) {
                copyOnWrite();
                ((AttrNotifyRequest) this.instance).setIndex(i);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((AttrNotifyRequest) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) {
                copyOnWrite();
                ((AttrNotifyRequest) this.instance).setUuidBytes(byteString);
                return this;
            }

            public Builder setValue(ByteString byteString) {
                copyOnWrite();
                ((AttrNotifyRequest) this.instance).setValue(byteString);
                return this;
            }

            public Builder setZiped(boolean z) {
                copyOnWrite();
                ((AttrNotifyRequest) this.instance).setZiped(z);
                return this;
            }

            private Builder() {
                super(AttrNotifyRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            AttrNotifyRequest attrNotifyRequest = new AttrNotifyRequest();
            DEFAULT_INSTANCE = attrNotifyRequest;
            GeneratedMessageLite.registerDefaultInstance(AttrNotifyRequest.class, attrNotifyRequest);
        }

        private AttrNotifyRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearZiped() {
            this.ziped_ = false;
        }

        public static AttrNotifyRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AttrNotifyRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AttrNotifyRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrNotifyRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AttrNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AttrNotifyRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(ByteString byteString) {
            byteString.getClass();
            this.value_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setZiped(boolean z) {
            this.ziped_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AttrNotifyRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\u0004\u0004\u0007", new Object[]{"uuid_", "value_", TableInfo.Index.DEFAULT_PREFIX, "ziped_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AttrNotifyRequest> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AttrNotifyRequest.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyRequestOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyRequestOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyRequestOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyRequestOrBuilder
        public ByteString getValue() {
            return this.value_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyRequestOrBuilder
        public boolean getZiped() {
            return this.ziped_;
        }

        public static Builder newBuilder(AttrNotifyRequest attrNotifyRequest) {
            return DEFAULT_INSTANCE.createBuilder(attrNotifyRequest);
        }

        public static AttrNotifyRequest parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrNotifyRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrNotifyRequest parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AttrNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AttrNotifyRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AttrNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AttrNotifyRequest parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AttrNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AttrNotifyRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AttrNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AttrNotifyRequest parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AttrNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AttrNotifyRequest parseFrom(InputStream inputStream) throws IOException {
            return (AttrNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrNotifyRequest parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrNotifyRequest parseFrom(j jVar) throws IOException {
            return (AttrNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AttrNotifyRequest parseFrom(j jVar, t tVar) throws IOException {
            return (AttrNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AttrNotifyRequestOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getIndex();

        String getUuid();

        ByteString getUuidBytes();

        ByteString getValue();

        boolean getZiped();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AttrNotifyResponse extends GeneratedMessageLite<AttrNotifyResponse, Builder> implements AttrNotifyResponseOrBuilder {
        private static final AttrNotifyResponse DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 2;
        private static volatile vkh<AttrNotifyResponse> PARSER = null;
        public static final int RES_FIELD_NUMBER = 1;
        private int index_;
        private int res_;

        public static final class Builder extends GeneratedMessageLite.a<AttrNotifyResponse, Builder> implements AttrNotifyResponseOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((AttrNotifyResponse) this.instance).clearIndex();
                return this;
            }

            public Builder clearRes() {
                copyOnWrite();
                ((AttrNotifyResponse) this.instance).clearRes();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyResponseOrBuilder
            public int getIndex() {
                return ((AttrNotifyResponse) this.instance).getIndex();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyResponseOrBuilder
            public ResultEnum getRes() {
                return ((AttrNotifyResponse) this.instance).getRes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyResponseOrBuilder
            public int getResValue() {
                return ((AttrNotifyResponse) this.instance).getResValue();
            }

            public Builder setIndex(int i) {
                copyOnWrite();
                ((AttrNotifyResponse) this.instance).setIndex(i);
                return this;
            }

            public Builder setRes(ResultEnum resultEnum) {
                copyOnWrite();
                ((AttrNotifyResponse) this.instance).setRes(resultEnum);
                return this;
            }

            public Builder setResValue(int i) {
                copyOnWrite();
                ((AttrNotifyResponse) this.instance).setResValue(i);
                return this;
            }

            private Builder() {
                super(AttrNotifyResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            AttrNotifyResponse attrNotifyResponse = new AttrNotifyResponse();
            DEFAULT_INSTANCE = attrNotifyResponse;
            GeneratedMessageLite.registerDefaultInstance(AttrNotifyResponse.class, attrNotifyResponse);
        }

        private AttrNotifyResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRes() {
            this.res_ = 0;
        }

        public static AttrNotifyResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AttrNotifyResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AttrNotifyResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrNotifyResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AttrNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AttrNotifyResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRes(ResultEnum resultEnum) {
            this.res_ = resultEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResValue(int i) {
            this.res_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AttrNotifyResponse();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"res_", TableInfo.Index.DEFAULT_PREFIX});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AttrNotifyResponse> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AttrNotifyResponse.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyResponseOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyResponseOrBuilder
        public ResultEnum getRes() {
            ResultEnum resultEnumForNumber = ResultEnum.forNumber(this.res_);
            return resultEnumForNumber == null ? ResultEnum.UNRECOGNIZED : resultEnumForNumber;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrNotifyResponseOrBuilder
        public int getResValue() {
            return this.res_;
        }

        public static Builder newBuilder(AttrNotifyResponse attrNotifyResponse) {
            return DEFAULT_INSTANCE.createBuilder(attrNotifyResponse);
        }

        public static AttrNotifyResponse parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrNotifyResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrNotifyResponse parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AttrNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AttrNotifyResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AttrNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AttrNotifyResponse parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AttrNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AttrNotifyResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AttrNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AttrNotifyResponse parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AttrNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AttrNotifyResponse parseFrom(InputStream inputStream) throws IOException {
            return (AttrNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrNotifyResponse parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrNotifyResponse parseFrom(j jVar) throws IOException {
            return (AttrNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AttrNotifyResponse parseFrom(j jVar, t tVar) throws IOException {
            return (AttrNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AttrNotifyResponseOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getIndex();

        ResultEnum getRes();

        int getResValue();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AttrOps extends GeneratedMessageLite<AttrOps, Builder> implements AttrOpsOrBuilder {
        public static final int ADVDATA_FIELD_NUMBER = 1;
        private static final AttrOps DEFAULT_INSTANCE;
        public static final int NOTIFYPULL_FIELD_NUMBER = 12;
        public static final int NOTIFYPUSH_FIELD_NUMBER = 13;
        public static final int NOTIFYREQ_FIELD_NUMBER = 10;
        public static final int NOTIFYRSP_FIELD_NUMBER = 11;
        private static volatile vkh<AttrOps> PARSER = null;
        public static final int READREQ_FIELD_NUMBER = 4;
        public static final int READRSP_FIELD_NUMBER = 5;
        public static final int SETNOTIFYREQ_FIELD_NUMBER = 6;
        public static final int SETNOTIFYRSP_FIELD_NUMBER = 7;
        public static final int UNSETNOTIFYREQ_FIELD_NUMBER = 8;
        public static final int UNSETNOTIFYRSP_FIELD_NUMBER = 9;
        public static final int WRITEREQ_FIELD_NUMBER = 2;
        public static final int WRITERSP_FIELD_NUMBER = 3;
        private int actionCase_ = 0;
        private Object action_;

        public enum ActionCase {
            ADVDATA(1),
            WRITEREQ(2),
            WRITERSP(3),
            READREQ(4),
            READRSP(5),
            SETNOTIFYREQ(6),
            SETNOTIFYRSP(7),
            UNSETNOTIFYREQ(8),
            UNSETNOTIFYRSP(9),
            NOTIFYREQ(10),
            NOTIFYRSP(11),
            NOTIFYPULL(12),
            NOTIFYPUSH(13),
            ACTION_NOT_SET(0);

            private final int value;

            ActionCase(int i) {
                this.value = i;
            }

            public static ActionCase forNumber(int i) {
                switch (i) {
                    case 0:
                        return ACTION_NOT_SET;
                    case 1:
                        return ADVDATA;
                    case 2:
                        return WRITEREQ;
                    case 3:
                        return WRITERSP;
                    case 4:
                        return READREQ;
                    case 5:
                        return READRSP;
                    case 6:
                        return SETNOTIFYREQ;
                    case 7:
                        return SETNOTIFYRSP;
                    case 8:
                        return UNSETNOTIFYREQ;
                    case 9:
                        return UNSETNOTIFYRSP;
                    case 10:
                        return NOTIFYREQ;
                    case 11:
                        return NOTIFYRSP;
                    case 12:
                        return NOTIFYPULL;
                    case 13:
                        return NOTIFYPUSH;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ActionCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class Builder extends GeneratedMessageLite.a<AttrOps, Builder> implements AttrOpsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAction() {
                copyOnWrite();
                ((AttrOps) this.instance).clearAction();
                return this;
            }

            public Builder clearAdvData() {
                copyOnWrite();
                ((AttrOps) this.instance).clearAdvData();
                return this;
            }

            public Builder clearNotifyPull() {
                copyOnWrite();
                ((AttrOps) this.instance).clearNotifyPull();
                return this;
            }

            public Builder clearNotifyPush() {
                copyOnWrite();
                ((AttrOps) this.instance).clearNotifyPush();
                return this;
            }

            public Builder clearNotifyReq() {
                copyOnWrite();
                ((AttrOps) this.instance).clearNotifyReq();
                return this;
            }

            public Builder clearNotifyRsp() {
                copyOnWrite();
                ((AttrOps) this.instance).clearNotifyRsp();
                return this;
            }

            public Builder clearReadReq() {
                copyOnWrite();
                ((AttrOps) this.instance).clearReadReq();
                return this;
            }

            public Builder clearReadRsp() {
                copyOnWrite();
                ((AttrOps) this.instance).clearReadRsp();
                return this;
            }

            public Builder clearSetNotifyReq() {
                copyOnWrite();
                ((AttrOps) this.instance).clearSetNotifyReq();
                return this;
            }

            public Builder clearSetNotifyRsp() {
                copyOnWrite();
                ((AttrOps) this.instance).clearSetNotifyRsp();
                return this;
            }

            public Builder clearUnsetNotifyReq() {
                copyOnWrite();
                ((AttrOps) this.instance).clearUnsetNotifyReq();
                return this;
            }

            public Builder clearUnsetNotifyRsp() {
                copyOnWrite();
                ((AttrOps) this.instance).clearUnsetNotifyRsp();
                return this;
            }

            public Builder clearWriteReq() {
                copyOnWrite();
                ((AttrOps) this.instance).clearWriteReq();
                return this;
            }

            public Builder clearWriteRsp() {
                copyOnWrite();
                ((AttrOps) this.instance).clearWriteRsp();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public ActionCase getActionCase() {
                return ((AttrOps) this.instance).getActionCase();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public AttrAdvData getAdvData() {
                return ((AttrOps) this.instance).getAdvData();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public AttrNotifyPull getNotifyPull() {
                return ((AttrOps) this.instance).getNotifyPull();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public AttrNotifyPush getNotifyPush() {
                return ((AttrOps) this.instance).getNotifyPush();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public AttrNotifyRequest getNotifyReq() {
                return ((AttrOps) this.instance).getNotifyReq();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public AttrNotifyResponse getNotifyRsp() {
                return ((AttrOps) this.instance).getNotifyRsp();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public AttrReadRequest getReadReq() {
                return ((AttrOps) this.instance).getReadReq();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public AttrReadResponse getReadRsp() {
                return ((AttrOps) this.instance).getReadRsp();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public AttrSetNotifyRequest getSetNotifyReq() {
                return ((AttrOps) this.instance).getSetNotifyReq();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public AttrSetNotifyResponse getSetNotifyRsp() {
                return ((AttrOps) this.instance).getSetNotifyRsp();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public AttrUnsetNotifyRequest getUnsetNotifyReq() {
                return ((AttrOps) this.instance).getUnsetNotifyReq();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public AttrUnsetNotifyResponse getUnsetNotifyRsp() {
                return ((AttrOps) this.instance).getUnsetNotifyRsp();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public AttrWriteRequest getWriteReq() {
                return ((AttrOps) this.instance).getWriteReq();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public AttrWriteResponse getWriteRsp() {
                return ((AttrOps) this.instance).getWriteRsp();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public boolean hasAdvData() {
                return ((AttrOps) this.instance).hasAdvData();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public boolean hasNotifyPull() {
                return ((AttrOps) this.instance).hasNotifyPull();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public boolean hasNotifyPush() {
                return ((AttrOps) this.instance).hasNotifyPush();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public boolean hasNotifyReq() {
                return ((AttrOps) this.instance).hasNotifyReq();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public boolean hasNotifyRsp() {
                return ((AttrOps) this.instance).hasNotifyRsp();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public boolean hasReadReq() {
                return ((AttrOps) this.instance).hasReadReq();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public boolean hasReadRsp() {
                return ((AttrOps) this.instance).hasReadRsp();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public boolean hasSetNotifyReq() {
                return ((AttrOps) this.instance).hasSetNotifyReq();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public boolean hasSetNotifyRsp() {
                return ((AttrOps) this.instance).hasSetNotifyRsp();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public boolean hasUnsetNotifyReq() {
                return ((AttrOps) this.instance).hasUnsetNotifyReq();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public boolean hasUnsetNotifyRsp() {
                return ((AttrOps) this.instance).hasUnsetNotifyRsp();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public boolean hasWriteReq() {
                return ((AttrOps) this.instance).hasWriteReq();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
            public boolean hasWriteRsp() {
                return ((AttrOps) this.instance).hasWriteRsp();
            }

            public Builder mergeAdvData(AttrAdvData attrAdvData) {
                copyOnWrite();
                ((AttrOps) this.instance).mergeAdvData(attrAdvData);
                return this;
            }

            public Builder mergeNotifyPull(AttrNotifyPull attrNotifyPull) {
                copyOnWrite();
                ((AttrOps) this.instance).mergeNotifyPull(attrNotifyPull);
                return this;
            }

            public Builder mergeNotifyPush(AttrNotifyPush attrNotifyPush) {
                copyOnWrite();
                ((AttrOps) this.instance).mergeNotifyPush(attrNotifyPush);
                return this;
            }

            public Builder mergeNotifyReq(AttrNotifyRequest attrNotifyRequest) {
                copyOnWrite();
                ((AttrOps) this.instance).mergeNotifyReq(attrNotifyRequest);
                return this;
            }

            public Builder mergeNotifyRsp(AttrNotifyResponse attrNotifyResponse) {
                copyOnWrite();
                ((AttrOps) this.instance).mergeNotifyRsp(attrNotifyResponse);
                return this;
            }

            public Builder mergeReadReq(AttrReadRequest attrReadRequest) {
                copyOnWrite();
                ((AttrOps) this.instance).mergeReadReq(attrReadRequest);
                return this;
            }

            public Builder mergeReadRsp(AttrReadResponse attrReadResponse) {
                copyOnWrite();
                ((AttrOps) this.instance).mergeReadRsp(attrReadResponse);
                return this;
            }

            public Builder mergeSetNotifyReq(AttrSetNotifyRequest attrSetNotifyRequest) {
                copyOnWrite();
                ((AttrOps) this.instance).mergeSetNotifyReq(attrSetNotifyRequest);
                return this;
            }

            public Builder mergeSetNotifyRsp(AttrSetNotifyResponse attrSetNotifyResponse) {
                copyOnWrite();
                ((AttrOps) this.instance).mergeSetNotifyRsp(attrSetNotifyResponse);
                return this;
            }

            public Builder mergeUnsetNotifyReq(AttrUnsetNotifyRequest attrUnsetNotifyRequest) {
                copyOnWrite();
                ((AttrOps) this.instance).mergeUnsetNotifyReq(attrUnsetNotifyRequest);
                return this;
            }

            public Builder mergeUnsetNotifyRsp(AttrUnsetNotifyResponse attrUnsetNotifyResponse) {
                copyOnWrite();
                ((AttrOps) this.instance).mergeUnsetNotifyRsp(attrUnsetNotifyResponse);
                return this;
            }

            public Builder mergeWriteReq(AttrWriteRequest attrWriteRequest) {
                copyOnWrite();
                ((AttrOps) this.instance).mergeWriteReq(attrWriteRequest);
                return this;
            }

            public Builder mergeWriteRsp(AttrWriteResponse attrWriteResponse) {
                copyOnWrite();
                ((AttrOps) this.instance).mergeWriteRsp(attrWriteResponse);
                return this;
            }

            public Builder setAdvData(AttrAdvData attrAdvData) {
                copyOnWrite();
                ((AttrOps) this.instance).setAdvData(attrAdvData);
                return this;
            }

            public Builder setNotifyPull(AttrNotifyPull attrNotifyPull) {
                copyOnWrite();
                ((AttrOps) this.instance).setNotifyPull(attrNotifyPull);
                return this;
            }

            public Builder setNotifyPush(AttrNotifyPush attrNotifyPush) {
                copyOnWrite();
                ((AttrOps) this.instance).setNotifyPush(attrNotifyPush);
                return this;
            }

            public Builder setNotifyReq(AttrNotifyRequest attrNotifyRequest) {
                copyOnWrite();
                ((AttrOps) this.instance).setNotifyReq(attrNotifyRequest);
                return this;
            }

            public Builder setNotifyRsp(AttrNotifyResponse attrNotifyResponse) {
                copyOnWrite();
                ((AttrOps) this.instance).setNotifyRsp(attrNotifyResponse);
                return this;
            }

            public Builder setReadReq(AttrReadRequest attrReadRequest) {
                copyOnWrite();
                ((AttrOps) this.instance).setReadReq(attrReadRequest);
                return this;
            }

            public Builder setReadRsp(AttrReadResponse attrReadResponse) {
                copyOnWrite();
                ((AttrOps) this.instance).setReadRsp(attrReadResponse);
                return this;
            }

            public Builder setSetNotifyReq(AttrSetNotifyRequest attrSetNotifyRequest) {
                copyOnWrite();
                ((AttrOps) this.instance).setSetNotifyReq(attrSetNotifyRequest);
                return this;
            }

            public Builder setSetNotifyRsp(AttrSetNotifyResponse attrSetNotifyResponse) {
                copyOnWrite();
                ((AttrOps) this.instance).setSetNotifyRsp(attrSetNotifyResponse);
                return this;
            }

            public Builder setUnsetNotifyReq(AttrUnsetNotifyRequest attrUnsetNotifyRequest) {
                copyOnWrite();
                ((AttrOps) this.instance).setUnsetNotifyReq(attrUnsetNotifyRequest);
                return this;
            }

            public Builder setUnsetNotifyRsp(AttrUnsetNotifyResponse attrUnsetNotifyResponse) {
                copyOnWrite();
                ((AttrOps) this.instance).setUnsetNotifyRsp(attrUnsetNotifyResponse);
                return this;
            }

            public Builder setWriteReq(AttrWriteRequest attrWriteRequest) {
                copyOnWrite();
                ((AttrOps) this.instance).setWriteReq(attrWriteRequest);
                return this;
            }

            public Builder setWriteRsp(AttrWriteResponse attrWriteResponse) {
                copyOnWrite();
                ((AttrOps) this.instance).setWriteRsp(attrWriteResponse);
                return this;
            }

            private Builder() {
                super(AttrOps.DEFAULT_INSTANCE);
            }

            public Builder setAdvData(AttrAdvData.Builder builder) {
                copyOnWrite();
                ((AttrOps) this.instance).setAdvData(builder.build());
                return this;
            }

            public Builder setNotifyPull(AttrNotifyPull.Builder builder) {
                copyOnWrite();
                ((AttrOps) this.instance).setNotifyPull(builder.build());
                return this;
            }

            public Builder setNotifyPush(AttrNotifyPush.Builder builder) {
                copyOnWrite();
                ((AttrOps) this.instance).setNotifyPush(builder.build());
                return this;
            }

            public Builder setNotifyReq(AttrNotifyRequest.Builder builder) {
                copyOnWrite();
                ((AttrOps) this.instance).setNotifyReq(builder.build());
                return this;
            }

            public Builder setNotifyRsp(AttrNotifyResponse.Builder builder) {
                copyOnWrite();
                ((AttrOps) this.instance).setNotifyRsp(builder.build());
                return this;
            }

            public Builder setReadReq(AttrReadRequest.Builder builder) {
                copyOnWrite();
                ((AttrOps) this.instance).setReadReq(builder.build());
                return this;
            }

            public Builder setReadRsp(AttrReadResponse.Builder builder) {
                copyOnWrite();
                ((AttrOps) this.instance).setReadRsp(builder.build());
                return this;
            }

            public Builder setSetNotifyReq(AttrSetNotifyRequest.Builder builder) {
                copyOnWrite();
                ((AttrOps) this.instance).setSetNotifyReq(builder.build());
                return this;
            }

            public Builder setSetNotifyRsp(AttrSetNotifyResponse.Builder builder) {
                copyOnWrite();
                ((AttrOps) this.instance).setSetNotifyRsp(builder.build());
                return this;
            }

            public Builder setUnsetNotifyReq(AttrUnsetNotifyRequest.Builder builder) {
                copyOnWrite();
                ((AttrOps) this.instance).setUnsetNotifyReq(builder.build());
                return this;
            }

            public Builder setUnsetNotifyRsp(AttrUnsetNotifyResponse.Builder builder) {
                copyOnWrite();
                ((AttrOps) this.instance).setUnsetNotifyRsp(builder.build());
                return this;
            }

            public Builder setWriteReq(AttrWriteRequest.Builder builder) {
                copyOnWrite();
                ((AttrOps) this.instance).setWriteReq(builder.build());
                return this;
            }

            public Builder setWriteRsp(AttrWriteResponse.Builder builder) {
                copyOnWrite();
                ((AttrOps) this.instance).setWriteRsp(builder.build());
                return this;
            }
        }

        static {
            AttrOps attrOps = new AttrOps();
            DEFAULT_INSTANCE = attrOps;
            GeneratedMessageLite.registerDefaultInstance(AttrOps.class, attrOps);
        }

        private AttrOps() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdvData() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotifyPull() {
            if (this.actionCase_ == 12) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotifyPush() {
            if (this.actionCase_ == 13) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotifyReq() {
            if (this.actionCase_ == 10) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotifyRsp() {
            if (this.actionCase_ == 11) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReadReq() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReadRsp() {
            if (this.actionCase_ == 5) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSetNotifyReq() {
            if (this.actionCase_ == 6) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSetNotifyRsp() {
            if (this.actionCase_ == 7) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnsetNotifyReq() {
            if (this.actionCase_ == 8) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnsetNotifyRsp() {
            if (this.actionCase_ == 9) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWriteReq() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWriteRsp() {
            if (this.actionCase_ == 3) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static AttrOps getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAdvData(AttrAdvData attrAdvData) {
            attrAdvData.getClass();
            if (this.actionCase_ != 1 || this.action_ == AttrAdvData.getDefaultInstance()) {
                this.action_ = attrAdvData;
            } else {
                this.action_ = AttrAdvData.newBuilder((AttrAdvData) this.action_).mergeFrom(attrAdvData).buildPartial();
            }
            this.actionCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNotifyPull(AttrNotifyPull attrNotifyPull) {
            attrNotifyPull.getClass();
            if (this.actionCase_ != 12 || this.action_ == AttrNotifyPull.getDefaultInstance()) {
                this.action_ = attrNotifyPull;
            } else {
                this.action_ = AttrNotifyPull.newBuilder((AttrNotifyPull) this.action_).mergeFrom(attrNotifyPull).buildPartial();
            }
            this.actionCase_ = 12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNotifyPush(AttrNotifyPush attrNotifyPush) {
            attrNotifyPush.getClass();
            if (this.actionCase_ != 13 || this.action_ == AttrNotifyPush.getDefaultInstance()) {
                this.action_ = attrNotifyPush;
            } else {
                this.action_ = AttrNotifyPush.newBuilder((AttrNotifyPush) this.action_).mergeFrom(attrNotifyPush).buildPartial();
            }
            this.actionCase_ = 13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNotifyReq(AttrNotifyRequest attrNotifyRequest) {
            attrNotifyRequest.getClass();
            if (this.actionCase_ != 10 || this.action_ == AttrNotifyRequest.getDefaultInstance()) {
                this.action_ = attrNotifyRequest;
            } else {
                this.action_ = AttrNotifyRequest.newBuilder((AttrNotifyRequest) this.action_).mergeFrom(attrNotifyRequest).buildPartial();
            }
            this.actionCase_ = 10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNotifyRsp(AttrNotifyResponse attrNotifyResponse) {
            attrNotifyResponse.getClass();
            if (this.actionCase_ != 11 || this.action_ == AttrNotifyResponse.getDefaultInstance()) {
                this.action_ = attrNotifyResponse;
            } else {
                this.action_ = AttrNotifyResponse.newBuilder((AttrNotifyResponse) this.action_).mergeFrom(attrNotifyResponse).buildPartial();
            }
            this.actionCase_ = 11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeReadReq(AttrReadRequest attrReadRequest) {
            attrReadRequest.getClass();
            if (this.actionCase_ != 4 || this.action_ == AttrReadRequest.getDefaultInstance()) {
                this.action_ = attrReadRequest;
            } else {
                this.action_ = AttrReadRequest.newBuilder((AttrReadRequest) this.action_).mergeFrom(attrReadRequest).buildPartial();
            }
            this.actionCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeReadRsp(AttrReadResponse attrReadResponse) {
            attrReadResponse.getClass();
            if (this.actionCase_ != 5 || this.action_ == AttrReadResponse.getDefaultInstance()) {
                this.action_ = attrReadResponse;
            } else {
                this.action_ = AttrReadResponse.newBuilder((AttrReadResponse) this.action_).mergeFrom(attrReadResponse).buildPartial();
            }
            this.actionCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSetNotifyReq(AttrSetNotifyRequest attrSetNotifyRequest) {
            attrSetNotifyRequest.getClass();
            if (this.actionCase_ != 6 || this.action_ == AttrSetNotifyRequest.getDefaultInstance()) {
                this.action_ = attrSetNotifyRequest;
            } else {
                this.action_ = AttrSetNotifyRequest.newBuilder((AttrSetNotifyRequest) this.action_).mergeFrom(attrSetNotifyRequest).buildPartial();
            }
            this.actionCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSetNotifyRsp(AttrSetNotifyResponse attrSetNotifyResponse) {
            attrSetNotifyResponse.getClass();
            if (this.actionCase_ != 7 || this.action_ == AttrSetNotifyResponse.getDefaultInstance()) {
                this.action_ = attrSetNotifyResponse;
            } else {
                this.action_ = AttrSetNotifyResponse.newBuilder((AttrSetNotifyResponse) this.action_).mergeFrom(attrSetNotifyResponse).buildPartial();
            }
            this.actionCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUnsetNotifyReq(AttrUnsetNotifyRequest attrUnsetNotifyRequest) {
            attrUnsetNotifyRequest.getClass();
            if (this.actionCase_ != 8 || this.action_ == AttrUnsetNotifyRequest.getDefaultInstance()) {
                this.action_ = attrUnsetNotifyRequest;
            } else {
                this.action_ = AttrUnsetNotifyRequest.newBuilder((AttrUnsetNotifyRequest) this.action_).mergeFrom(attrUnsetNotifyRequest).buildPartial();
            }
            this.actionCase_ = 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUnsetNotifyRsp(AttrUnsetNotifyResponse attrUnsetNotifyResponse) {
            attrUnsetNotifyResponse.getClass();
            if (this.actionCase_ != 9 || this.action_ == AttrUnsetNotifyResponse.getDefaultInstance()) {
                this.action_ = attrUnsetNotifyResponse;
            } else {
                this.action_ = AttrUnsetNotifyResponse.newBuilder((AttrUnsetNotifyResponse) this.action_).mergeFrom(attrUnsetNotifyResponse).buildPartial();
            }
            this.actionCase_ = 9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWriteReq(AttrWriteRequest attrWriteRequest) {
            attrWriteRequest.getClass();
            if (this.actionCase_ != 2 || this.action_ == AttrWriteRequest.getDefaultInstance()) {
                this.action_ = attrWriteRequest;
            } else {
                this.action_ = AttrWriteRequest.newBuilder((AttrWriteRequest) this.action_).mergeFrom(attrWriteRequest).buildPartial();
            }
            this.actionCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWriteRsp(AttrWriteResponse attrWriteResponse) {
            attrWriteResponse.getClass();
            if (this.actionCase_ != 3 || this.action_ == AttrWriteResponse.getDefaultInstance()) {
                this.action_ = attrWriteResponse;
            } else {
                this.action_ = AttrWriteResponse.newBuilder((AttrWriteResponse) this.action_).mergeFrom(attrWriteResponse).buildPartial();
            }
            this.actionCase_ = 3;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AttrOps parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AttrOps) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrOps parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AttrOps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AttrOps> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdvData(AttrAdvData attrAdvData) {
            attrAdvData.getClass();
            this.action_ = attrAdvData;
            this.actionCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyPull(AttrNotifyPull attrNotifyPull) {
            attrNotifyPull.getClass();
            this.action_ = attrNotifyPull;
            this.actionCase_ = 12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyPush(AttrNotifyPush attrNotifyPush) {
            attrNotifyPush.getClass();
            this.action_ = attrNotifyPush;
            this.actionCase_ = 13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyReq(AttrNotifyRequest attrNotifyRequest) {
            attrNotifyRequest.getClass();
            this.action_ = attrNotifyRequest;
            this.actionCase_ = 10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyRsp(AttrNotifyResponse attrNotifyResponse) {
            attrNotifyResponse.getClass();
            this.action_ = attrNotifyResponse;
            this.actionCase_ = 11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReadReq(AttrReadRequest attrReadRequest) {
            attrReadRequest.getClass();
            this.action_ = attrReadRequest;
            this.actionCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReadRsp(AttrReadResponse attrReadResponse) {
            attrReadResponse.getClass();
            this.action_ = attrReadResponse;
            this.actionCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetNotifyReq(AttrSetNotifyRequest attrSetNotifyRequest) {
            attrSetNotifyRequest.getClass();
            this.action_ = attrSetNotifyRequest;
            this.actionCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetNotifyRsp(AttrSetNotifyResponse attrSetNotifyResponse) {
            attrSetNotifyResponse.getClass();
            this.action_ = attrSetNotifyResponse;
            this.actionCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnsetNotifyReq(AttrUnsetNotifyRequest attrUnsetNotifyRequest) {
            attrUnsetNotifyRequest.getClass();
            this.action_ = attrUnsetNotifyRequest;
            this.actionCase_ = 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnsetNotifyRsp(AttrUnsetNotifyResponse attrUnsetNotifyResponse) {
            attrUnsetNotifyResponse.getClass();
            this.action_ = attrUnsetNotifyResponse;
            this.actionCase_ = 9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWriteReq(AttrWriteRequest attrWriteRequest) {
            attrWriteRequest.getClass();
            this.action_ = attrWriteRequest;
            this.actionCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWriteRsp(AttrWriteResponse attrWriteResponse) {
            attrWriteResponse.getClass();
            this.action_ = attrWriteResponse;
            this.actionCase_ = 3;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AttrOps();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"action_", "actionCase_", AttrAdvData.class, AttrWriteRequest.class, AttrWriteResponse.class, AttrReadRequest.class, AttrReadResponse.class, AttrSetNotifyRequest.class, AttrSetNotifyResponse.class, AttrUnsetNotifyRequest.class, AttrUnsetNotifyResponse.class, AttrNotifyRequest.class, AttrNotifyResponse.class, AttrNotifyPull.class, AttrNotifyPush.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AttrOps> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AttrOps.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public ActionCase getActionCase() {
            return ActionCase.forNumber(this.actionCase_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public AttrAdvData getAdvData() {
            return this.actionCase_ == 1 ? (AttrAdvData) this.action_ : AttrAdvData.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public AttrNotifyPull getNotifyPull() {
            return this.actionCase_ == 12 ? (AttrNotifyPull) this.action_ : AttrNotifyPull.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public AttrNotifyPush getNotifyPush() {
            return this.actionCase_ == 13 ? (AttrNotifyPush) this.action_ : AttrNotifyPush.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public AttrNotifyRequest getNotifyReq() {
            return this.actionCase_ == 10 ? (AttrNotifyRequest) this.action_ : AttrNotifyRequest.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public AttrNotifyResponse getNotifyRsp() {
            return this.actionCase_ == 11 ? (AttrNotifyResponse) this.action_ : AttrNotifyResponse.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public AttrReadRequest getReadReq() {
            return this.actionCase_ == 4 ? (AttrReadRequest) this.action_ : AttrReadRequest.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public AttrReadResponse getReadRsp() {
            return this.actionCase_ == 5 ? (AttrReadResponse) this.action_ : AttrReadResponse.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public AttrSetNotifyRequest getSetNotifyReq() {
            return this.actionCase_ == 6 ? (AttrSetNotifyRequest) this.action_ : AttrSetNotifyRequest.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public AttrSetNotifyResponse getSetNotifyRsp() {
            return this.actionCase_ == 7 ? (AttrSetNotifyResponse) this.action_ : AttrSetNotifyResponse.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public AttrUnsetNotifyRequest getUnsetNotifyReq() {
            return this.actionCase_ == 8 ? (AttrUnsetNotifyRequest) this.action_ : AttrUnsetNotifyRequest.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public AttrUnsetNotifyResponse getUnsetNotifyRsp() {
            return this.actionCase_ == 9 ? (AttrUnsetNotifyResponse) this.action_ : AttrUnsetNotifyResponse.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public AttrWriteRequest getWriteReq() {
            return this.actionCase_ == 2 ? (AttrWriteRequest) this.action_ : AttrWriteRequest.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public AttrWriteResponse getWriteRsp() {
            return this.actionCase_ == 3 ? (AttrWriteResponse) this.action_ : AttrWriteResponse.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public boolean hasAdvData() {
            return this.actionCase_ == 1;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public boolean hasNotifyPull() {
            return this.actionCase_ == 12;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public boolean hasNotifyPush() {
            return this.actionCase_ == 13;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public boolean hasNotifyReq() {
            return this.actionCase_ == 10;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public boolean hasNotifyRsp() {
            return this.actionCase_ == 11;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public boolean hasReadReq() {
            return this.actionCase_ == 4;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public boolean hasReadRsp() {
            return this.actionCase_ == 5;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public boolean hasSetNotifyReq() {
            return this.actionCase_ == 6;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public boolean hasSetNotifyRsp() {
            return this.actionCase_ == 7;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public boolean hasUnsetNotifyReq() {
            return this.actionCase_ == 8;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public boolean hasUnsetNotifyRsp() {
            return this.actionCase_ == 9;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public boolean hasWriteReq() {
            return this.actionCase_ == 2;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrOpsOrBuilder
        public boolean hasWriteRsp() {
            return this.actionCase_ == 3;
        }

        public static Builder newBuilder(AttrOps attrOps) {
            return DEFAULT_INSTANCE.createBuilder(attrOps);
        }

        public static AttrOps parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrOps) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrOps parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AttrOps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AttrOps parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AttrOps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AttrOps parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AttrOps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AttrOps parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AttrOps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AttrOps parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AttrOps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AttrOps parseFrom(InputStream inputStream) throws IOException {
            return (AttrOps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrOps parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrOps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrOps parseFrom(j jVar) throws IOException {
            return (AttrOps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AttrOps parseFrom(j jVar, t tVar) throws IOException {
            return (AttrOps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AttrOpsOrBuilder extends bsf {
        AttrOps.ActionCase getActionCase();

        AttrAdvData getAdvData();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        AttrNotifyPull getNotifyPull();

        AttrNotifyPush getNotifyPush();

        AttrNotifyRequest getNotifyReq();

        AttrNotifyResponse getNotifyRsp();

        AttrReadRequest getReadReq();

        AttrReadResponse getReadRsp();

        AttrSetNotifyRequest getSetNotifyReq();

        AttrSetNotifyResponse getSetNotifyRsp();

        AttrUnsetNotifyRequest getUnsetNotifyReq();

        AttrUnsetNotifyResponse getUnsetNotifyRsp();

        AttrWriteRequest getWriteReq();

        AttrWriteResponse getWriteRsp();

        boolean hasAdvData();

        boolean hasNotifyPull();

        boolean hasNotifyPush();

        boolean hasNotifyReq();

        boolean hasNotifyRsp();

        boolean hasReadReq();

        boolean hasReadRsp();

        boolean hasSetNotifyReq();

        boolean hasSetNotifyRsp();

        boolean hasUnsetNotifyReq();

        boolean hasUnsetNotifyRsp();

        boolean hasWriteReq();

        boolean hasWriteRsp();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AttrReadRequest extends GeneratedMessageLite<AttrReadRequest, Builder> implements AttrReadRequestOrBuilder {
        private static final AttrReadRequest DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 2;
        private static volatile vkh<AttrReadRequest> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private int index_;
        private String uuid_ = "";

        public static final class Builder extends GeneratedMessageLite.a<AttrReadRequest, Builder> implements AttrReadRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((AttrReadRequest) this.instance).clearIndex();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((AttrReadRequest) this.instance).clearUuid();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrReadRequestOrBuilder
            public int getIndex() {
                return ((AttrReadRequest) this.instance).getIndex();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrReadRequestOrBuilder
            public String getUuid() {
                return ((AttrReadRequest) this.instance).getUuid();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrReadRequestOrBuilder
            public ByteString getUuidBytes() {
                return ((AttrReadRequest) this.instance).getUuidBytes();
            }

            public Builder setIndex(int i) {
                copyOnWrite();
                ((AttrReadRequest) this.instance).setIndex(i);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((AttrReadRequest) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) {
                copyOnWrite();
                ((AttrReadRequest) this.instance).setUuidBytes(byteString);
                return this;
            }

            private Builder() {
                super(AttrReadRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            AttrReadRequest attrReadRequest = new AttrReadRequest();
            DEFAULT_INSTANCE = attrReadRequest;
            GeneratedMessageLite.registerDefaultInstance(AttrReadRequest.class, attrReadRequest);
        }

        private AttrReadRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static AttrReadRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AttrReadRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AttrReadRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrReadRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AttrReadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AttrReadRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AttrReadRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"uuid_", TableInfo.Index.DEFAULT_PREFIX});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AttrReadRequest> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AttrReadRequest.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrReadRequestOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrReadRequestOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrReadRequestOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        public static Builder newBuilder(AttrReadRequest attrReadRequest) {
            return DEFAULT_INSTANCE.createBuilder(attrReadRequest);
        }

        public static AttrReadRequest parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrReadRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrReadRequest parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AttrReadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AttrReadRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AttrReadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AttrReadRequest parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AttrReadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AttrReadRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AttrReadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AttrReadRequest parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AttrReadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AttrReadRequest parseFrom(InputStream inputStream) throws IOException {
            return (AttrReadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrReadRequest parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrReadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrReadRequest parseFrom(j jVar) throws IOException {
            return (AttrReadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AttrReadRequest parseFrom(j jVar, t tVar) throws IOException {
            return (AttrReadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AttrReadRequestOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getIndex();

        String getUuid();

        ByteString getUuidBytes();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AttrReadResponse extends GeneratedMessageLite<AttrReadResponse, Builder> implements AttrReadResponseOrBuilder {
        private static final AttrReadResponse DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 3;
        private static volatile vkh<AttrReadResponse> PARSER = null;
        public static final int RES_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        public static final int ZIPED_FIELD_NUMBER = 4;
        private int index_;
        private int res_;
        private ByteString value_ = ByteString.EMPTY;
        private boolean ziped_;

        public static final class Builder extends GeneratedMessageLite.a<AttrReadResponse, Builder> implements AttrReadResponseOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((AttrReadResponse) this.instance).clearIndex();
                return this;
            }

            public Builder clearRes() {
                copyOnWrite();
                ((AttrReadResponse) this.instance).clearRes();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((AttrReadResponse) this.instance).clearValue();
                return this;
            }

            public Builder clearZiped() {
                copyOnWrite();
                ((AttrReadResponse) this.instance).clearZiped();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrReadResponseOrBuilder
            public int getIndex() {
                return ((AttrReadResponse) this.instance).getIndex();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrReadResponseOrBuilder
            public ResultEnum getRes() {
                return ((AttrReadResponse) this.instance).getRes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrReadResponseOrBuilder
            public int getResValue() {
                return ((AttrReadResponse) this.instance).getResValue();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrReadResponseOrBuilder
            public ByteString getValue() {
                return ((AttrReadResponse) this.instance).getValue();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrReadResponseOrBuilder
            public boolean getZiped() {
                return ((AttrReadResponse) this.instance).getZiped();
            }

            public Builder setIndex(int i) {
                copyOnWrite();
                ((AttrReadResponse) this.instance).setIndex(i);
                return this;
            }

            public Builder setRes(ResultEnum resultEnum) {
                copyOnWrite();
                ((AttrReadResponse) this.instance).setRes(resultEnum);
                return this;
            }

            public Builder setResValue(int i) {
                copyOnWrite();
                ((AttrReadResponse) this.instance).setResValue(i);
                return this;
            }

            public Builder setValue(ByteString byteString) {
                copyOnWrite();
                ((AttrReadResponse) this.instance).setValue(byteString);
                return this;
            }

            public Builder setZiped(boolean z) {
                copyOnWrite();
                ((AttrReadResponse) this.instance).setZiped(z);
                return this;
            }

            private Builder() {
                super(AttrReadResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            AttrReadResponse attrReadResponse = new AttrReadResponse();
            DEFAULT_INSTANCE = attrReadResponse;
            GeneratedMessageLite.registerDefaultInstance(AttrReadResponse.class, attrReadResponse);
        }

        private AttrReadResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRes() {
            this.res_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearZiped() {
            this.ziped_ = false;
        }

        public static AttrReadResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AttrReadResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AttrReadResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrReadResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AttrReadResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AttrReadResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRes(ResultEnum resultEnum) {
            this.res_ = resultEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResValue(int i) {
            this.res_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(ByteString byteString) {
            byteString.getClass();
            this.value_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setZiped(boolean z) {
            this.ziped_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AttrReadResponse();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\n\u0003\u0004\u0004\u0007", new Object[]{"res_", "value_", TableInfo.Index.DEFAULT_PREFIX, "ziped_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AttrReadResponse> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AttrReadResponse.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrReadResponseOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrReadResponseOrBuilder
        public ResultEnum getRes() {
            ResultEnum resultEnumForNumber = ResultEnum.forNumber(this.res_);
            return resultEnumForNumber == null ? ResultEnum.UNRECOGNIZED : resultEnumForNumber;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrReadResponseOrBuilder
        public int getResValue() {
            return this.res_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrReadResponseOrBuilder
        public ByteString getValue() {
            return this.value_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrReadResponseOrBuilder
        public boolean getZiped() {
            return this.ziped_;
        }

        public static Builder newBuilder(AttrReadResponse attrReadResponse) {
            return DEFAULT_INSTANCE.createBuilder(attrReadResponse);
        }

        public static AttrReadResponse parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrReadResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrReadResponse parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AttrReadResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AttrReadResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AttrReadResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AttrReadResponse parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AttrReadResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AttrReadResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AttrReadResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AttrReadResponse parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AttrReadResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AttrReadResponse parseFrom(InputStream inputStream) throws IOException {
            return (AttrReadResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrReadResponse parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrReadResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrReadResponse parseFrom(j jVar) throws IOException {
            return (AttrReadResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AttrReadResponse parseFrom(j jVar, t tVar) throws IOException {
            return (AttrReadResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AttrReadResponseOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getIndex();

        ResultEnum getRes();

        int getResValue();

        ByteString getValue();

        boolean getZiped();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AttrSetNotifyRequest extends GeneratedMessageLite<AttrSetNotifyRequest, Builder> implements AttrSetNotifyRequestOrBuilder {
        private static final AttrSetNotifyRequest DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 2;
        private static volatile vkh<AttrSetNotifyRequest> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private int index_;
        private String uuid_ = "";

        public static final class Builder extends GeneratedMessageLite.a<AttrSetNotifyRequest, Builder> implements AttrSetNotifyRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((AttrSetNotifyRequest) this.instance).clearIndex();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((AttrSetNotifyRequest) this.instance).clearUuid();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrSetNotifyRequestOrBuilder
            public int getIndex() {
                return ((AttrSetNotifyRequest) this.instance).getIndex();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrSetNotifyRequestOrBuilder
            public String getUuid() {
                return ((AttrSetNotifyRequest) this.instance).getUuid();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrSetNotifyRequestOrBuilder
            public ByteString getUuidBytes() {
                return ((AttrSetNotifyRequest) this.instance).getUuidBytes();
            }

            public Builder setIndex(int i) {
                copyOnWrite();
                ((AttrSetNotifyRequest) this.instance).setIndex(i);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((AttrSetNotifyRequest) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) {
                copyOnWrite();
                ((AttrSetNotifyRequest) this.instance).setUuidBytes(byteString);
                return this;
            }

            private Builder() {
                super(AttrSetNotifyRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            AttrSetNotifyRequest attrSetNotifyRequest = new AttrSetNotifyRequest();
            DEFAULT_INSTANCE = attrSetNotifyRequest;
            GeneratedMessageLite.registerDefaultInstance(AttrSetNotifyRequest.class, attrSetNotifyRequest);
        }

        private AttrSetNotifyRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static AttrSetNotifyRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AttrSetNotifyRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AttrSetNotifyRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrSetNotifyRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AttrSetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AttrSetNotifyRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AttrSetNotifyRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"uuid_", TableInfo.Index.DEFAULT_PREFIX});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AttrSetNotifyRequest> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AttrSetNotifyRequest.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrSetNotifyRequestOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrSetNotifyRequestOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrSetNotifyRequestOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        public static Builder newBuilder(AttrSetNotifyRequest attrSetNotifyRequest) {
            return DEFAULT_INSTANCE.createBuilder(attrSetNotifyRequest);
        }

        public static AttrSetNotifyRequest parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrSetNotifyRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrSetNotifyRequest parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AttrSetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AttrSetNotifyRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AttrSetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AttrSetNotifyRequest parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AttrSetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AttrSetNotifyRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AttrSetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AttrSetNotifyRequest parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AttrSetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AttrSetNotifyRequest parseFrom(InputStream inputStream) throws IOException {
            return (AttrSetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrSetNotifyRequest parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrSetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrSetNotifyRequest parseFrom(j jVar) throws IOException {
            return (AttrSetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AttrSetNotifyRequest parseFrom(j jVar, t tVar) throws IOException {
            return (AttrSetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AttrSetNotifyRequestOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getIndex();

        String getUuid();

        ByteString getUuidBytes();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AttrSetNotifyResponse extends GeneratedMessageLite<AttrSetNotifyResponse, Builder> implements AttrSetNotifyResponseOrBuilder {
        private static final AttrSetNotifyResponse DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 2;
        private static volatile vkh<AttrSetNotifyResponse> PARSER = null;
        public static final int RES_FIELD_NUMBER = 1;
        private int index_;
        private int res_;

        public static final class Builder extends GeneratedMessageLite.a<AttrSetNotifyResponse, Builder> implements AttrSetNotifyResponseOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((AttrSetNotifyResponse) this.instance).clearIndex();
                return this;
            }

            public Builder clearRes() {
                copyOnWrite();
                ((AttrSetNotifyResponse) this.instance).clearRes();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrSetNotifyResponseOrBuilder
            public int getIndex() {
                return ((AttrSetNotifyResponse) this.instance).getIndex();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrSetNotifyResponseOrBuilder
            public ResultEnum getRes() {
                return ((AttrSetNotifyResponse) this.instance).getRes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrSetNotifyResponseOrBuilder
            public int getResValue() {
                return ((AttrSetNotifyResponse) this.instance).getResValue();
            }

            public Builder setIndex(int i) {
                copyOnWrite();
                ((AttrSetNotifyResponse) this.instance).setIndex(i);
                return this;
            }

            public Builder setRes(ResultEnum resultEnum) {
                copyOnWrite();
                ((AttrSetNotifyResponse) this.instance).setRes(resultEnum);
                return this;
            }

            public Builder setResValue(int i) {
                copyOnWrite();
                ((AttrSetNotifyResponse) this.instance).setResValue(i);
                return this;
            }

            private Builder() {
                super(AttrSetNotifyResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            AttrSetNotifyResponse attrSetNotifyResponse = new AttrSetNotifyResponse();
            DEFAULT_INSTANCE = attrSetNotifyResponse;
            GeneratedMessageLite.registerDefaultInstance(AttrSetNotifyResponse.class, attrSetNotifyResponse);
        }

        private AttrSetNotifyResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRes() {
            this.res_ = 0;
        }

        public static AttrSetNotifyResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AttrSetNotifyResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AttrSetNotifyResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrSetNotifyResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AttrSetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AttrSetNotifyResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRes(ResultEnum resultEnum) {
            this.res_ = resultEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResValue(int i) {
            this.res_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AttrSetNotifyResponse();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"res_", TableInfo.Index.DEFAULT_PREFIX});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AttrSetNotifyResponse> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AttrSetNotifyResponse.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrSetNotifyResponseOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrSetNotifyResponseOrBuilder
        public ResultEnum getRes() {
            ResultEnum resultEnumForNumber = ResultEnum.forNumber(this.res_);
            return resultEnumForNumber == null ? ResultEnum.UNRECOGNIZED : resultEnumForNumber;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrSetNotifyResponseOrBuilder
        public int getResValue() {
            return this.res_;
        }

        public static Builder newBuilder(AttrSetNotifyResponse attrSetNotifyResponse) {
            return DEFAULT_INSTANCE.createBuilder(attrSetNotifyResponse);
        }

        public static AttrSetNotifyResponse parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrSetNotifyResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrSetNotifyResponse parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AttrSetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AttrSetNotifyResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AttrSetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AttrSetNotifyResponse parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AttrSetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AttrSetNotifyResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AttrSetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AttrSetNotifyResponse parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AttrSetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AttrSetNotifyResponse parseFrom(InputStream inputStream) throws IOException {
            return (AttrSetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrSetNotifyResponse parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrSetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrSetNotifyResponse parseFrom(j jVar) throws IOException {
            return (AttrSetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AttrSetNotifyResponse parseFrom(j jVar, t tVar) throws IOException {
            return (AttrSetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AttrSetNotifyResponseOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getIndex();

        ResultEnum getRes();

        int getResValue();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AttrUnsetNotifyRequest extends GeneratedMessageLite<AttrUnsetNotifyRequest, Builder> implements AttrUnsetNotifyRequestOrBuilder {
        private static final AttrUnsetNotifyRequest DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 2;
        private static volatile vkh<AttrUnsetNotifyRequest> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private int index_;
        private String uuid_ = "";

        public static final class Builder extends GeneratedMessageLite.a<AttrUnsetNotifyRequest, Builder> implements AttrUnsetNotifyRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((AttrUnsetNotifyRequest) this.instance).clearIndex();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((AttrUnsetNotifyRequest) this.instance).clearUuid();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrUnsetNotifyRequestOrBuilder
            public int getIndex() {
                return ((AttrUnsetNotifyRequest) this.instance).getIndex();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrUnsetNotifyRequestOrBuilder
            public String getUuid() {
                return ((AttrUnsetNotifyRequest) this.instance).getUuid();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrUnsetNotifyRequestOrBuilder
            public ByteString getUuidBytes() {
                return ((AttrUnsetNotifyRequest) this.instance).getUuidBytes();
            }

            public Builder setIndex(int i) {
                copyOnWrite();
                ((AttrUnsetNotifyRequest) this.instance).setIndex(i);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((AttrUnsetNotifyRequest) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) {
                copyOnWrite();
                ((AttrUnsetNotifyRequest) this.instance).setUuidBytes(byteString);
                return this;
            }

            private Builder() {
                super(AttrUnsetNotifyRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            AttrUnsetNotifyRequest attrUnsetNotifyRequest = new AttrUnsetNotifyRequest();
            DEFAULT_INSTANCE = attrUnsetNotifyRequest;
            GeneratedMessageLite.registerDefaultInstance(AttrUnsetNotifyRequest.class, attrUnsetNotifyRequest);
        }

        private AttrUnsetNotifyRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static AttrUnsetNotifyRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AttrUnsetNotifyRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AttrUnsetNotifyRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrUnsetNotifyRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AttrUnsetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AttrUnsetNotifyRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AttrUnsetNotifyRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"uuid_", TableInfo.Index.DEFAULT_PREFIX});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AttrUnsetNotifyRequest> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AttrUnsetNotifyRequest.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrUnsetNotifyRequestOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrUnsetNotifyRequestOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrUnsetNotifyRequestOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        public static Builder newBuilder(AttrUnsetNotifyRequest attrUnsetNotifyRequest) {
            return DEFAULT_INSTANCE.createBuilder(attrUnsetNotifyRequest);
        }

        public static AttrUnsetNotifyRequest parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrUnsetNotifyRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrUnsetNotifyRequest parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AttrUnsetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AttrUnsetNotifyRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AttrUnsetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AttrUnsetNotifyRequest parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AttrUnsetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AttrUnsetNotifyRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AttrUnsetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AttrUnsetNotifyRequest parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AttrUnsetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AttrUnsetNotifyRequest parseFrom(InputStream inputStream) throws IOException {
            return (AttrUnsetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrUnsetNotifyRequest parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrUnsetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrUnsetNotifyRequest parseFrom(j jVar) throws IOException {
            return (AttrUnsetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AttrUnsetNotifyRequest parseFrom(j jVar, t tVar) throws IOException {
            return (AttrUnsetNotifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AttrUnsetNotifyRequestOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getIndex();

        String getUuid();

        ByteString getUuidBytes();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AttrUnsetNotifyResponse extends GeneratedMessageLite<AttrUnsetNotifyResponse, Builder> implements AttrUnsetNotifyResponseOrBuilder {
        private static final AttrUnsetNotifyResponse DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 2;
        private static volatile vkh<AttrUnsetNotifyResponse> PARSER = null;
        public static final int RES_FIELD_NUMBER = 1;
        private int index_;
        private int res_;

        public static final class Builder extends GeneratedMessageLite.a<AttrUnsetNotifyResponse, Builder> implements AttrUnsetNotifyResponseOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((AttrUnsetNotifyResponse) this.instance).clearIndex();
                return this;
            }

            public Builder clearRes() {
                copyOnWrite();
                ((AttrUnsetNotifyResponse) this.instance).clearRes();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrUnsetNotifyResponseOrBuilder
            public int getIndex() {
                return ((AttrUnsetNotifyResponse) this.instance).getIndex();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrUnsetNotifyResponseOrBuilder
            public ResultEnum getRes() {
                return ((AttrUnsetNotifyResponse) this.instance).getRes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrUnsetNotifyResponseOrBuilder
            public int getResValue() {
                return ((AttrUnsetNotifyResponse) this.instance).getResValue();
            }

            public Builder setIndex(int i) {
                copyOnWrite();
                ((AttrUnsetNotifyResponse) this.instance).setIndex(i);
                return this;
            }

            public Builder setRes(ResultEnum resultEnum) {
                copyOnWrite();
                ((AttrUnsetNotifyResponse) this.instance).setRes(resultEnum);
                return this;
            }

            public Builder setResValue(int i) {
                copyOnWrite();
                ((AttrUnsetNotifyResponse) this.instance).setResValue(i);
                return this;
            }

            private Builder() {
                super(AttrUnsetNotifyResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            AttrUnsetNotifyResponse attrUnsetNotifyResponse = new AttrUnsetNotifyResponse();
            DEFAULT_INSTANCE = attrUnsetNotifyResponse;
            GeneratedMessageLite.registerDefaultInstance(AttrUnsetNotifyResponse.class, attrUnsetNotifyResponse);
        }

        private AttrUnsetNotifyResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRes() {
            this.res_ = 0;
        }

        public static AttrUnsetNotifyResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AttrUnsetNotifyResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AttrUnsetNotifyResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrUnsetNotifyResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AttrUnsetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AttrUnsetNotifyResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRes(ResultEnum resultEnum) {
            this.res_ = resultEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResValue(int i) {
            this.res_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AttrUnsetNotifyResponse();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"res_", TableInfo.Index.DEFAULT_PREFIX});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AttrUnsetNotifyResponse> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AttrUnsetNotifyResponse.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrUnsetNotifyResponseOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrUnsetNotifyResponseOrBuilder
        public ResultEnum getRes() {
            ResultEnum resultEnumForNumber = ResultEnum.forNumber(this.res_);
            return resultEnumForNumber == null ? ResultEnum.UNRECOGNIZED : resultEnumForNumber;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrUnsetNotifyResponseOrBuilder
        public int getResValue() {
            return this.res_;
        }

        public static Builder newBuilder(AttrUnsetNotifyResponse attrUnsetNotifyResponse) {
            return DEFAULT_INSTANCE.createBuilder(attrUnsetNotifyResponse);
        }

        public static AttrUnsetNotifyResponse parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrUnsetNotifyResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrUnsetNotifyResponse parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AttrUnsetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AttrUnsetNotifyResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AttrUnsetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AttrUnsetNotifyResponse parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AttrUnsetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AttrUnsetNotifyResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AttrUnsetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AttrUnsetNotifyResponse parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AttrUnsetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AttrUnsetNotifyResponse parseFrom(InputStream inputStream) throws IOException {
            return (AttrUnsetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrUnsetNotifyResponse parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrUnsetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrUnsetNotifyResponse parseFrom(j jVar) throws IOException {
            return (AttrUnsetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AttrUnsetNotifyResponse parseFrom(j jVar, t tVar) throws IOException {
            return (AttrUnsetNotifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AttrUnsetNotifyResponseOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getIndex();

        ResultEnum getRes();

        int getResValue();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AttrWriteRequest extends GeneratedMessageLite<AttrWriteRequest, Builder> implements AttrWriteRequestOrBuilder {
        private static final AttrWriteRequest DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 3;
        private static volatile vkh<AttrWriteRequest> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        public static final int ZIPED_FIELD_NUMBER = 4;
        private int index_;
        private String uuid_ = "";
        private ByteString value_ = ByteString.EMPTY;
        private boolean ziped_;

        public static final class Builder extends GeneratedMessageLite.a<AttrWriteRequest, Builder> implements AttrWriteRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((AttrWriteRequest) this.instance).clearIndex();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((AttrWriteRequest) this.instance).clearUuid();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((AttrWriteRequest) this.instance).clearValue();
                return this;
            }

            public Builder clearZiped() {
                copyOnWrite();
                ((AttrWriteRequest) this.instance).clearZiped();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrWriteRequestOrBuilder
            public int getIndex() {
                return ((AttrWriteRequest) this.instance).getIndex();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrWriteRequestOrBuilder
            public String getUuid() {
                return ((AttrWriteRequest) this.instance).getUuid();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrWriteRequestOrBuilder
            public ByteString getUuidBytes() {
                return ((AttrWriteRequest) this.instance).getUuidBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrWriteRequestOrBuilder
            public ByteString getValue() {
                return ((AttrWriteRequest) this.instance).getValue();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrWriteRequestOrBuilder
            public boolean getZiped() {
                return ((AttrWriteRequest) this.instance).getZiped();
            }

            public Builder setIndex(int i) {
                copyOnWrite();
                ((AttrWriteRequest) this.instance).setIndex(i);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((AttrWriteRequest) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) {
                copyOnWrite();
                ((AttrWriteRequest) this.instance).setUuidBytes(byteString);
                return this;
            }

            public Builder setValue(ByteString byteString) {
                copyOnWrite();
                ((AttrWriteRequest) this.instance).setValue(byteString);
                return this;
            }

            public Builder setZiped(boolean z) {
                copyOnWrite();
                ((AttrWriteRequest) this.instance).setZiped(z);
                return this;
            }

            private Builder() {
                super(AttrWriteRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            AttrWriteRequest attrWriteRequest = new AttrWriteRequest();
            DEFAULT_INSTANCE = attrWriteRequest;
            GeneratedMessageLite.registerDefaultInstance(AttrWriteRequest.class, attrWriteRequest);
        }

        private AttrWriteRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearZiped() {
            this.ziped_ = false;
        }

        public static AttrWriteRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AttrWriteRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AttrWriteRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrWriteRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AttrWriteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AttrWriteRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(ByteString byteString) {
            byteString.getClass();
            this.value_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setZiped(boolean z) {
            this.ziped_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AttrWriteRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\u0004\u0004\u0007", new Object[]{"uuid_", "value_", TableInfo.Index.DEFAULT_PREFIX, "ziped_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AttrWriteRequest> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AttrWriteRequest.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrWriteRequestOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrWriteRequestOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrWriteRequestOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrWriteRequestOrBuilder
        public ByteString getValue() {
            return this.value_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrWriteRequestOrBuilder
        public boolean getZiped() {
            return this.ziped_;
        }

        public static Builder newBuilder(AttrWriteRequest attrWriteRequest) {
            return DEFAULT_INSTANCE.createBuilder(attrWriteRequest);
        }

        public static AttrWriteRequest parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrWriteRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrWriteRequest parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AttrWriteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AttrWriteRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AttrWriteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AttrWriteRequest parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AttrWriteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AttrWriteRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AttrWriteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AttrWriteRequest parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AttrWriteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AttrWriteRequest parseFrom(InputStream inputStream) throws IOException {
            return (AttrWriteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrWriteRequest parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrWriteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrWriteRequest parseFrom(j jVar) throws IOException {
            return (AttrWriteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AttrWriteRequest parseFrom(j jVar, t tVar) throws IOException {
            return (AttrWriteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AttrWriteRequestOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getIndex();

        String getUuid();

        ByteString getUuidBytes();

        ByteString getValue();

        boolean getZiped();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AttrWriteResponse extends GeneratedMessageLite<AttrWriteResponse, Builder> implements AttrWriteResponseOrBuilder {
        private static final AttrWriteResponse DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 2;
        private static volatile vkh<AttrWriteResponse> PARSER = null;
        public static final int RES_FIELD_NUMBER = 1;
        private int index_;
        private int res_;

        public static final class Builder extends GeneratedMessageLite.a<AttrWriteResponse, Builder> implements AttrWriteResponseOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((AttrWriteResponse) this.instance).clearIndex();
                return this;
            }

            public Builder clearRes() {
                copyOnWrite();
                ((AttrWriteResponse) this.instance).clearRes();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrWriteResponseOrBuilder
            public int getIndex() {
                return ((AttrWriteResponse) this.instance).getIndex();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrWriteResponseOrBuilder
            public ResultEnum getRes() {
                return ((AttrWriteResponse) this.instance).getRes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrWriteResponseOrBuilder
            public int getResValue() {
                return ((AttrWriteResponse) this.instance).getResValue();
            }

            public Builder setIndex(int i) {
                copyOnWrite();
                ((AttrWriteResponse) this.instance).setIndex(i);
                return this;
            }

            public Builder setRes(ResultEnum resultEnum) {
                copyOnWrite();
                ((AttrWriteResponse) this.instance).setRes(resultEnum);
                return this;
            }

            public Builder setResValue(int i) {
                copyOnWrite();
                ((AttrWriteResponse) this.instance).setResValue(i);
                return this;
            }

            private Builder() {
                super(AttrWriteResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            AttrWriteResponse attrWriteResponse = new AttrWriteResponse();
            DEFAULT_INSTANCE = attrWriteResponse;
            GeneratedMessageLite.registerDefaultInstance(AttrWriteResponse.class, attrWriteResponse);
        }

        private AttrWriteResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRes() {
            this.res_ = 0;
        }

        public static AttrWriteResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AttrWriteResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AttrWriteResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrWriteResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AttrWriteResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AttrWriteResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRes(ResultEnum resultEnum) {
            this.res_ = resultEnum.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResValue(int i) {
            this.res_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AttrWriteResponse();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"res_", TableInfo.Index.DEFAULT_PREFIX});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AttrWriteResponse> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AttrWriteResponse.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrWriteResponseOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrWriteResponseOrBuilder
        public ResultEnum getRes() {
            ResultEnum resultEnumForNumber = ResultEnum.forNumber(this.res_);
            return resultEnumForNumber == null ? ResultEnum.UNRECOGNIZED : resultEnumForNumber;
        }

        @Override // com.xiaomi.mi_connect_service.proto.AttributeProto.AttrWriteResponseOrBuilder
        public int getResValue() {
            return this.res_;
        }

        public static Builder newBuilder(AttrWriteResponse attrWriteResponse) {
            return DEFAULT_INSTANCE.createBuilder(attrWriteResponse);
        }

        public static AttrWriteResponse parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrWriteResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrWriteResponse parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AttrWriteResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AttrWriteResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AttrWriteResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AttrWriteResponse parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AttrWriteResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AttrWriteResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AttrWriteResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AttrWriteResponse parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AttrWriteResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AttrWriteResponse parseFrom(InputStream inputStream) throws IOException {
            return (AttrWriteResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AttrWriteResponse parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AttrWriteResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AttrWriteResponse parseFrom(j jVar) throws IOException {
            return (AttrWriteResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AttrWriteResponse parseFrom(j jVar, t tVar) throws IOException {
            return (AttrWriteResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AttrWriteResponseOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getIndex();

        ResultEnum getRes();

        int getResValue();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public enum ResultEnum implements d0.c {
        SUCCESS(0),
        FAIL(1),
        UNRECOGNIZED(-1);

        public static final int FAIL_VALUE = 1;
        public static final int SUCCESS_VALUE = 0;
        private static final d0.d<ResultEnum> internalValueMap = new d0.d<ResultEnum>() { // from class: com.xiaomi.mi_connect_service.proto.AttributeProto.ResultEnum.1
            @Override // com.google.protobuf.d0.d
            public ResultEnum findValueByNumber(int i) {
                return ResultEnum.forNumber(i);
            }
        };
        private final int value;

        public static final class ResultEnumVerifier implements d0.e {
            static final d0.e INSTANCE = new ResultEnumVerifier();

            private ResultEnumVerifier() {
            }

            @Override // com.google.protobuf.d0.e
            public boolean isInRange(int i) {
                return ResultEnum.forNumber(i) != null;
            }
        }

        ResultEnum(int i) {
            this.value = i;
        }

        public static ResultEnum forNumber(int i) {
            if (i == 0) {
                return SUCCESS;
            }
            if (i != 1) {
                return null;
            }
            return FAIL;
        }

        public static d0.d<ResultEnum> internalGetValueMap() {
            return internalValueMap;
        }

        public static d0.e internalGetVerifier() {
            return ResultEnumVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.d0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ResultEnum valueOf(int i) {
            return forNumber(i);
        }
    }

    private AttributeProto() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}

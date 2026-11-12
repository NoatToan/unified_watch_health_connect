package com.xiaomi.mi_connect_service.proto;

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
public final class ConnectionProto {

    /* JADX INFO: renamed from: com.xiaomi.mi_connect_service.proto.ConnectionProto$1, reason: invalid class name */
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

    public static final class AppAuthRead extends GeneratedMessageLite<AppAuthRead, Builder> implements AppAuthReadOrBuilder {
        private static final AppAuthRead DEFAULT_INSTANCE;
        private static volatile vkh<AppAuthRead> PARSER = null;
        public static final int RESPONSE_FIELD_NUMBER = 1;
        private String response_ = "";

        public static final class Builder extends GeneratedMessageLite.a<AppAuthRead, Builder> implements AppAuthReadOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearResponse() {
                copyOnWrite();
                ((AppAuthRead) this.instance).clearResponse();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppAuthReadOrBuilder
            public String getResponse() {
                return ((AppAuthRead) this.instance).getResponse();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppAuthReadOrBuilder
            public ByteString getResponseBytes() {
                return ((AppAuthRead) this.instance).getResponseBytes();
            }

            public Builder setResponse(String str) {
                copyOnWrite();
                ((AppAuthRead) this.instance).setResponse(str);
                return this;
            }

            public Builder setResponseBytes(ByteString byteString) {
                copyOnWrite();
                ((AppAuthRead) this.instance).setResponseBytes(byteString);
                return this;
            }

            private Builder() {
                super(AppAuthRead.DEFAULT_INSTANCE);
            }
        }

        static {
            AppAuthRead appAuthRead = new AppAuthRead();
            DEFAULT_INSTANCE = appAuthRead;
            GeneratedMessageLite.registerDefaultInstance(AppAuthRead.class, appAuthRead);
        }

        private AppAuthRead() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResponse() {
            this.response_ = getDefaultInstance().getResponse();
        }

        public static AppAuthRead getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppAuthRead parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppAuthRead) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppAuthRead parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppAuthRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AppAuthRead> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponse(String str) {
            str.getClass();
            this.response_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponseBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.response_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AppAuthRead();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"response_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AppAuthRead> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AppAuthRead.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppAuthReadOrBuilder
        public String getResponse() {
            return this.response_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppAuthReadOrBuilder
        public ByteString getResponseBytes() {
            return ByteString.copyFromUtf8(this.response_);
        }

        public static Builder newBuilder(AppAuthRead appAuthRead) {
            return DEFAULT_INSTANCE.createBuilder(appAuthRead);
        }

        public static AppAuthRead parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppAuthRead) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppAuthRead parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AppAuthRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AppAuthRead parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppAuthRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AppAuthRead parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AppAuthRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AppAuthRead parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppAuthRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppAuthRead parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AppAuthRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AppAuthRead parseFrom(InputStream inputStream) throws IOException {
            return (AppAuthRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppAuthRead parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppAuthRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppAuthRead parseFrom(j jVar) throws IOException {
            return (AppAuthRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AppAuthRead parseFrom(j jVar, t tVar) throws IOException {
            return (AppAuthRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AppAuthReadOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        String getResponse();

        ByteString getResponseBytes();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AppAuthWrite extends GeneratedMessageLite<AppAuthWrite, Builder> implements AppAuthWriteOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final AppAuthWrite DEFAULT_INSTANCE;
        private static volatile vkh<AppAuthWrite> PARSER;
        private String data_ = "";

        public static final class Builder extends GeneratedMessageLite.a<AppAuthWrite, Builder> implements AppAuthWriteOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearData() {
                copyOnWrite();
                ((AppAuthWrite) this.instance).clearData();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppAuthWriteOrBuilder
            public String getData() {
                return ((AppAuthWrite) this.instance).getData();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppAuthWriteOrBuilder
            public ByteString getDataBytes() {
                return ((AppAuthWrite) this.instance).getDataBytes();
            }

            public Builder setData(String str) {
                copyOnWrite();
                ((AppAuthWrite) this.instance).setData(str);
                return this;
            }

            public Builder setDataBytes(ByteString byteString) {
                copyOnWrite();
                ((AppAuthWrite) this.instance).setDataBytes(byteString);
                return this;
            }

            private Builder() {
                super(AppAuthWrite.DEFAULT_INSTANCE);
            }
        }

        static {
            AppAuthWrite appAuthWrite = new AppAuthWrite();
            DEFAULT_INSTANCE = appAuthWrite;
            GeneratedMessageLite.registerDefaultInstance(AppAuthWrite.class, appAuthWrite);
        }

        private AppAuthWrite() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        public static AppAuthWrite getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppAuthWrite parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppAuthWrite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppAuthWrite parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppAuthWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AppAuthWrite> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(String str) {
            str.getClass();
            this.data_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.data_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AppAuthWrite();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AppAuthWrite> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AppAuthWrite.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppAuthWriteOrBuilder
        public String getData() {
            return this.data_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppAuthWriteOrBuilder
        public ByteString getDataBytes() {
            return ByteString.copyFromUtf8(this.data_);
        }

        public static Builder newBuilder(AppAuthWrite appAuthWrite) {
            return DEFAULT_INSTANCE.createBuilder(appAuthWrite);
        }

        public static AppAuthWrite parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppAuthWrite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppAuthWrite parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AppAuthWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AppAuthWrite parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppAuthWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AppAuthWrite parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AppAuthWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AppAuthWrite parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppAuthWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppAuthWrite parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AppAuthWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AppAuthWrite parseFrom(InputStream inputStream) throws IOException {
            return (AppAuthWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppAuthWrite parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppAuthWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppAuthWrite parseFrom(j jVar) throws IOException {
            return (AppAuthWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AppAuthWrite parseFrom(j jVar, t tVar) throws IOException {
            return (AppAuthWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AppAuthWriteOrBuilder extends bsf {
        String getData();

        ByteString getDataBytes();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AppCommSubTypeBt extends GeneratedMessageLite<AppCommSubTypeBt, Builder> implements AppCommSubTypeBtOrBuilder {
        public static final int BDADDR_FIELD_NUMBER = 1;
        private static final AppCommSubTypeBt DEFAULT_INSTANCE;
        private static volatile vkh<AppCommSubTypeBt> PARSER;
        private String bdAddr_ = "";

        public static final class Builder extends GeneratedMessageLite.a<AppCommSubTypeBt, Builder> implements AppCommSubTypeBtOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBdAddr() {
                copyOnWrite();
                ((AppCommSubTypeBt) this.instance).clearBdAddr();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeBtOrBuilder
            public String getBdAddr() {
                return ((AppCommSubTypeBt) this.instance).getBdAddr();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeBtOrBuilder
            public ByteString getBdAddrBytes() {
                return ((AppCommSubTypeBt) this.instance).getBdAddrBytes();
            }

            public Builder setBdAddr(String str) {
                copyOnWrite();
                ((AppCommSubTypeBt) this.instance).setBdAddr(str);
                return this;
            }

            public Builder setBdAddrBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeBt) this.instance).setBdAddrBytes(byteString);
                return this;
            }

            private Builder() {
                super(AppCommSubTypeBt.DEFAULT_INSTANCE);
            }
        }

        static {
            AppCommSubTypeBt appCommSubTypeBt = new AppCommSubTypeBt();
            DEFAULT_INSTANCE = appCommSubTypeBt;
            GeneratedMessageLite.registerDefaultInstance(AppCommSubTypeBt.class, appCommSubTypeBt);
        }

        private AppCommSubTypeBt() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBdAddr() {
            this.bdAddr_ = getDefaultInstance().getBdAddr();
        }

        public static AppCommSubTypeBt getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppCommSubTypeBt parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppCommSubTypeBt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppCommSubTypeBt parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppCommSubTypeBt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AppCommSubTypeBt> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBdAddr(String str) {
            str.getClass();
            this.bdAddr_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBdAddrBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.bdAddr_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AppCommSubTypeBt();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"bdAddr_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AppCommSubTypeBt> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AppCommSubTypeBt.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeBtOrBuilder
        public String getBdAddr() {
            return this.bdAddr_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeBtOrBuilder
        public ByteString getBdAddrBytes() {
            return ByteString.copyFromUtf8(this.bdAddr_);
        }

        public static Builder newBuilder(AppCommSubTypeBt appCommSubTypeBt) {
            return DEFAULT_INSTANCE.createBuilder(appCommSubTypeBt);
        }

        public static AppCommSubTypeBt parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppCommSubTypeBt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppCommSubTypeBt parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AppCommSubTypeBt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AppCommSubTypeBt parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppCommSubTypeBt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AppCommSubTypeBt parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AppCommSubTypeBt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AppCommSubTypeBt parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppCommSubTypeBt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppCommSubTypeBt parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AppCommSubTypeBt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AppCommSubTypeBt parseFrom(InputStream inputStream) throws IOException {
            return (AppCommSubTypeBt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppCommSubTypeBt parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppCommSubTypeBt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppCommSubTypeBt parseFrom(j jVar) throws IOException {
            return (AppCommSubTypeBt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AppCommSubTypeBt parseFrom(j jVar, t tVar) throws IOException {
            return (AppCommSubTypeBt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AppCommSubTypeBtOrBuilder extends bsf {
        String getBdAddr();

        ByteString getBdAddrBytes();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AppCommSubTypeIp extends GeneratedMessageLite<AppCommSubTypeIp, Builder> implements AppCommSubTypeIpOrBuilder {
        public static final int APMACADDR_FIELD_NUMBER = 4;
        public static final int APPWD_FIELD_NUMBER = 6;
        public static final int APSSID_FIELD_NUMBER = 5;
        private static final AppCommSubTypeIp DEFAULT_INSTANCE;
        public static final int IPV4ADDR_FIELD_NUMBER = 2;
        public static final int IPV6ADDR_FIELD_NUMBER = 3;
        public static final int MACADDR_FIELD_NUMBER = 1;
        private static volatile vkh<AppCommSubTypeIp> PARSER = null;
        public static final int TDLS_FIELD_NUMBER = 7;
        private boolean tdls_;
        private String macAddr_ = "";
        private String ipv4Addr_ = "";
        private String ipv6Addr_ = "";
        private String apMacAddr_ = "";
        private String apSsid_ = "";
        private String apPwd_ = "";

        public static final class Builder extends GeneratedMessageLite.a<AppCommSubTypeIp, Builder> implements AppCommSubTypeIpOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearApMacAddr() {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).clearApMacAddr();
                return this;
            }

            public Builder clearApPwd() {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).clearApPwd();
                return this;
            }

            public Builder clearApSsid() {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).clearApSsid();
                return this;
            }

            public Builder clearIpv4Addr() {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).clearIpv4Addr();
                return this;
            }

            public Builder clearIpv6Addr() {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).clearIpv6Addr();
                return this;
            }

            public Builder clearMacAddr() {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).clearMacAddr();
                return this;
            }

            public Builder clearTdls() {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).clearTdls();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
            public String getApMacAddr() {
                return ((AppCommSubTypeIp) this.instance).getApMacAddr();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
            public ByteString getApMacAddrBytes() {
                return ((AppCommSubTypeIp) this.instance).getApMacAddrBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
            public String getApPwd() {
                return ((AppCommSubTypeIp) this.instance).getApPwd();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
            public ByteString getApPwdBytes() {
                return ((AppCommSubTypeIp) this.instance).getApPwdBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
            public String getApSsid() {
                return ((AppCommSubTypeIp) this.instance).getApSsid();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
            public ByteString getApSsidBytes() {
                return ((AppCommSubTypeIp) this.instance).getApSsidBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
            public String getIpv4Addr() {
                return ((AppCommSubTypeIp) this.instance).getIpv4Addr();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
            public ByteString getIpv4AddrBytes() {
                return ((AppCommSubTypeIp) this.instance).getIpv4AddrBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
            public String getIpv6Addr() {
                return ((AppCommSubTypeIp) this.instance).getIpv6Addr();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
            public ByteString getIpv6AddrBytes() {
                return ((AppCommSubTypeIp) this.instance).getIpv6AddrBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
            public String getMacAddr() {
                return ((AppCommSubTypeIp) this.instance).getMacAddr();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
            public ByteString getMacAddrBytes() {
                return ((AppCommSubTypeIp) this.instance).getMacAddrBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
            public boolean getTdls() {
                return ((AppCommSubTypeIp) this.instance).getTdls();
            }

            public Builder setApMacAddr(String str) {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).setApMacAddr(str);
                return this;
            }

            public Builder setApMacAddrBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).setApMacAddrBytes(byteString);
                return this;
            }

            public Builder setApPwd(String str) {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).setApPwd(str);
                return this;
            }

            public Builder setApPwdBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).setApPwdBytes(byteString);
                return this;
            }

            public Builder setApSsid(String str) {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).setApSsid(str);
                return this;
            }

            public Builder setApSsidBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).setApSsidBytes(byteString);
                return this;
            }

            public Builder setIpv4Addr(String str) {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).setIpv4Addr(str);
                return this;
            }

            public Builder setIpv4AddrBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).setIpv4AddrBytes(byteString);
                return this;
            }

            public Builder setIpv6Addr(String str) {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).setIpv6Addr(str);
                return this;
            }

            public Builder setIpv6AddrBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).setIpv6AddrBytes(byteString);
                return this;
            }

            public Builder setMacAddr(String str) {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).setMacAddr(str);
                return this;
            }

            public Builder setMacAddrBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).setMacAddrBytes(byteString);
                return this;
            }

            public Builder setTdls(boolean z) {
                copyOnWrite();
                ((AppCommSubTypeIp) this.instance).setTdls(z);
                return this;
            }

            private Builder() {
                super(AppCommSubTypeIp.DEFAULT_INSTANCE);
            }
        }

        static {
            AppCommSubTypeIp appCommSubTypeIp = new AppCommSubTypeIp();
            DEFAULT_INSTANCE = appCommSubTypeIp;
            GeneratedMessageLite.registerDefaultInstance(AppCommSubTypeIp.class, appCommSubTypeIp);
        }

        private AppCommSubTypeIp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearApMacAddr() {
            this.apMacAddr_ = getDefaultInstance().getApMacAddr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearApPwd() {
            this.apPwd_ = getDefaultInstance().getApPwd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearApSsid() {
            this.apSsid_ = getDefaultInstance().getApSsid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIpv4Addr() {
            this.ipv4Addr_ = getDefaultInstance().getIpv4Addr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIpv6Addr() {
            this.ipv6Addr_ = getDefaultInstance().getIpv6Addr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMacAddr() {
            this.macAddr_ = getDefaultInstance().getMacAddr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTdls() {
            this.tdls_ = false;
        }

        public static AppCommSubTypeIp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppCommSubTypeIp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppCommSubTypeIp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppCommSubTypeIp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppCommSubTypeIp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AppCommSubTypeIp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApMacAddr(String str) {
            str.getClass();
            this.apMacAddr_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApMacAddrBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.apMacAddr_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApPwd(String str) {
            str.getClass();
            this.apPwd_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApPwdBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.apPwd_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApSsid(String str) {
            str.getClass();
            this.apSsid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApSsidBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.apSsid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv4Addr(String str) {
            str.getClass();
            this.ipv4Addr_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv4AddrBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.ipv4Addr_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv6Addr(String str) {
            str.getClass();
            this.ipv6Addr_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv6AddrBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.ipv6Addr_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMacAddr(String str) {
            str.getClass();
            this.macAddr_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMacAddrBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.macAddr_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTdls(boolean z) {
            this.tdls_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AppCommSubTypeIp();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0007", new Object[]{"macAddr_", "ipv4Addr_", "ipv6Addr_", "apMacAddr_", "apSsid_", "apPwd_", "tdls_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AppCommSubTypeIp> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AppCommSubTypeIp.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
        public String getApMacAddr() {
            return this.apMacAddr_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
        public ByteString getApMacAddrBytes() {
            return ByteString.copyFromUtf8(this.apMacAddr_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
        public String getApPwd() {
            return this.apPwd_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
        public ByteString getApPwdBytes() {
            return ByteString.copyFromUtf8(this.apPwd_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
        public String getApSsid() {
            return this.apSsid_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
        public ByteString getApSsidBytes() {
            return ByteString.copyFromUtf8(this.apSsid_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
        public String getIpv4Addr() {
            return this.ipv4Addr_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
        public ByteString getIpv4AddrBytes() {
            return ByteString.copyFromUtf8(this.ipv4Addr_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
        public String getIpv6Addr() {
            return this.ipv6Addr_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
        public ByteString getIpv6AddrBytes() {
            return ByteString.copyFromUtf8(this.ipv6Addr_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
        public String getMacAddr() {
            return this.macAddr_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
        public ByteString getMacAddrBytes() {
            return ByteString.copyFromUtf8(this.macAddr_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeIpOrBuilder
        public boolean getTdls() {
            return this.tdls_;
        }

        public static Builder newBuilder(AppCommSubTypeIp appCommSubTypeIp) {
            return DEFAULT_INSTANCE.createBuilder(appCommSubTypeIp);
        }

        public static AppCommSubTypeIp parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppCommSubTypeIp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppCommSubTypeIp parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AppCommSubTypeIp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AppCommSubTypeIp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppCommSubTypeIp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AppCommSubTypeIp parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AppCommSubTypeIp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AppCommSubTypeIp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppCommSubTypeIp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppCommSubTypeIp parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AppCommSubTypeIp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AppCommSubTypeIp parseFrom(InputStream inputStream) throws IOException {
            return (AppCommSubTypeIp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppCommSubTypeIp parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppCommSubTypeIp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppCommSubTypeIp parseFrom(j jVar) throws IOException {
            return (AppCommSubTypeIp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AppCommSubTypeIp parseFrom(j jVar, t tVar) throws IOException {
            return (AppCommSubTypeIp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AppCommSubTypeIpOrBuilder extends bsf {
        String getApMacAddr();

        ByteString getApMacAddrBytes();

        String getApPwd();

        ByteString getApPwdBytes();

        String getApSsid();

        ByteString getApSsidBytes();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        String getIpv4Addr();

        ByteString getIpv4AddrBytes();

        String getIpv6Addr();

        ByteString getIpv6AddrBytes();

        String getMacAddr();

        ByteString getMacAddrBytes();

        boolean getTdls();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AppCommSubTypeP2p extends GeneratedMessageLite<AppCommSubTypeP2p, Builder> implements AppCommSubTypeP2pOrBuilder {
        public static final int CHANNEL_FIELD_NUMBER = 4;
        public static final int DBS_FIELD_NUMBER = 6;
        private static final AppCommSubTypeP2p DEFAULT_INSTANCE;
        public static final int EFFECTIVEPERIOD_FIELD_NUMBER = 11;
        public static final int GCMACADDR_FIELD_NUMBER = 1;
        public static final int GOMACADDR_FIELD_NUMBER = 7;
        public static final int IPV4ADDR_FIELD_NUMBER = 2;
        public static final int IPV6ADDR_FIELD_NUMBER = 3;
        public static final int IS5G_FIELD_NUMBER = 5;
        public static final int ISGO_FIELD_NUMBER = 10;
        private static volatile vkh<AppCommSubTypeP2p> PARSER = null;
        public static final int PWD_FIELD_NUMBER = 9;
        public static final int SSID_FIELD_NUMBER = 8;
        private int channel_;
        private boolean dbs_;
        private boolean is5G_;
        private Object isGoOneof_;
        private Object periodOneof_;
        private int isGoOneofCase_ = 0;
        private int periodOneofCase_ = 0;
        private String gcMacAddr_ = "";
        private String ipv4Addr_ = "";
        private String ipv6Addr_ = "";
        private String goMacAddr_ = "";
        private String ssid_ = "";
        private String pwd_ = "";

        public static final class Builder extends GeneratedMessageLite.a<AppCommSubTypeP2p, Builder> implements AppCommSubTypeP2pOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearChannel() {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).clearChannel();
                return this;
            }

            public Builder clearDbs() {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).clearDbs();
                return this;
            }

            public Builder clearEffectivePeriod() {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).clearEffectivePeriod();
                return this;
            }

            public Builder clearGcMacAddr() {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).clearGcMacAddr();
                return this;
            }

            public Builder clearGoMacAddr() {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).clearGoMacAddr();
                return this;
            }

            public Builder clearIpv4Addr() {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).clearIpv4Addr();
                return this;
            }

            public Builder clearIpv6Addr() {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).clearIpv6Addr();
                return this;
            }

            public Builder clearIs5G() {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).clearIs5G();
                return this;
            }

            public Builder clearIsGo() {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).clearIsGo();
                return this;
            }

            public Builder clearIsGoOneof() {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).clearIsGoOneof();
                return this;
            }

            public Builder clearPeriodOneof() {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).clearPeriodOneof();
                return this;
            }

            public Builder clearPwd() {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).clearPwd();
                return this;
            }

            public Builder clearSsid() {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).clearSsid();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public int getChannel() {
                return ((AppCommSubTypeP2p) this.instance).getChannel();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public boolean getDbs() {
                return ((AppCommSubTypeP2p) this.instance).getDbs();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public long getEffectivePeriod() {
                return ((AppCommSubTypeP2p) this.instance).getEffectivePeriod();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public String getGcMacAddr() {
                return ((AppCommSubTypeP2p) this.instance).getGcMacAddr();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public ByteString getGcMacAddrBytes() {
                return ((AppCommSubTypeP2p) this.instance).getGcMacAddrBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public String getGoMacAddr() {
                return ((AppCommSubTypeP2p) this.instance).getGoMacAddr();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public ByteString getGoMacAddrBytes() {
                return ((AppCommSubTypeP2p) this.instance).getGoMacAddrBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public String getIpv4Addr() {
                return ((AppCommSubTypeP2p) this.instance).getIpv4Addr();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public ByteString getIpv4AddrBytes() {
                return ((AppCommSubTypeP2p) this.instance).getIpv4AddrBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public String getIpv6Addr() {
                return ((AppCommSubTypeP2p) this.instance).getIpv6Addr();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public ByteString getIpv6AddrBytes() {
                return ((AppCommSubTypeP2p) this.instance).getIpv6AddrBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public boolean getIs5G() {
                return ((AppCommSubTypeP2p) this.instance).getIs5G();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public boolean getIsGo() {
                return ((AppCommSubTypeP2p) this.instance).getIsGo();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public IsGoOneofCase getIsGoOneofCase() {
                return ((AppCommSubTypeP2p) this.instance).getIsGoOneofCase();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public PeriodOneofCase getPeriodOneofCase() {
                return ((AppCommSubTypeP2p) this.instance).getPeriodOneofCase();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public String getPwd() {
                return ((AppCommSubTypeP2p) this.instance).getPwd();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public ByteString getPwdBytes() {
                return ((AppCommSubTypeP2p) this.instance).getPwdBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public String getSsid() {
                return ((AppCommSubTypeP2p) this.instance).getSsid();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public ByteString getSsidBytes() {
                return ((AppCommSubTypeP2p) this.instance).getSsidBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public boolean hasEffectivePeriod() {
                return ((AppCommSubTypeP2p) this.instance).hasEffectivePeriod();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
            public boolean hasIsGo() {
                return ((AppCommSubTypeP2p) this.instance).hasIsGo();
            }

            public Builder setChannel(int i) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setChannel(i);
                return this;
            }

            public Builder setDbs(boolean z) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setDbs(z);
                return this;
            }

            public Builder setEffectivePeriod(long j) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setEffectivePeriod(j);
                return this;
            }

            public Builder setGcMacAddr(String str) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setGcMacAddr(str);
                return this;
            }

            public Builder setGcMacAddrBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setGcMacAddrBytes(byteString);
                return this;
            }

            public Builder setGoMacAddr(String str) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setGoMacAddr(str);
                return this;
            }

            public Builder setGoMacAddrBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setGoMacAddrBytes(byteString);
                return this;
            }

            public Builder setIpv4Addr(String str) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setIpv4Addr(str);
                return this;
            }

            public Builder setIpv4AddrBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setIpv4AddrBytes(byteString);
                return this;
            }

            public Builder setIpv6Addr(String str) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setIpv6Addr(str);
                return this;
            }

            public Builder setIpv6AddrBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setIpv6AddrBytes(byteString);
                return this;
            }

            public Builder setIs5G(boolean z) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setIs5G(z);
                return this;
            }

            public Builder setIsGo(boolean z) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setIsGo(z);
                return this;
            }

            public Builder setPwd(String str) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setPwd(str);
                return this;
            }

            public Builder setPwdBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setPwdBytes(byteString);
                return this;
            }

            public Builder setSsid(String str) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setSsid(str);
                return this;
            }

            public Builder setSsidBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeP2p) this.instance).setSsidBytes(byteString);
                return this;
            }

            private Builder() {
                super(AppCommSubTypeP2p.DEFAULT_INSTANCE);
            }
        }

        public enum IsGoOneofCase {
            ISGO(10),
            ISGOONEOF_NOT_SET(0);

            private final int value;

            IsGoOneofCase(int i) {
                this.value = i;
            }

            public static IsGoOneofCase forNumber(int i) {
                if (i == 0) {
                    return ISGOONEOF_NOT_SET;
                }
                if (i != 10) {
                    return null;
                }
                return ISGO;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static IsGoOneofCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public enum PeriodOneofCase {
            EFFECTIVEPERIOD(11),
            PERIODONEOF_NOT_SET(0);

            private final int value;

            PeriodOneofCase(int i) {
                this.value = i;
            }

            public static PeriodOneofCase forNumber(int i) {
                if (i == 0) {
                    return PERIODONEOF_NOT_SET;
                }
                if (i != 11) {
                    return null;
                }
                return EFFECTIVEPERIOD;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static PeriodOneofCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            AppCommSubTypeP2p appCommSubTypeP2p = new AppCommSubTypeP2p();
            DEFAULT_INSTANCE = appCommSubTypeP2p;
            GeneratedMessageLite.registerDefaultInstance(AppCommSubTypeP2p.class, appCommSubTypeP2p);
        }

        private AppCommSubTypeP2p() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChannel() {
            this.channel_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDbs() {
            this.dbs_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEffectivePeriod() {
            if (this.periodOneofCase_ == 11) {
                this.periodOneofCase_ = 0;
                this.periodOneof_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGcMacAddr() {
            this.gcMacAddr_ = getDefaultInstance().getGcMacAddr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGoMacAddr() {
            this.goMacAddr_ = getDefaultInstance().getGoMacAddr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIpv4Addr() {
            this.ipv4Addr_ = getDefaultInstance().getIpv4Addr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIpv6Addr() {
            this.ipv6Addr_ = getDefaultInstance().getIpv6Addr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIs5G() {
            this.is5G_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsGo() {
            if (this.isGoOneofCase_ == 10) {
                this.isGoOneofCase_ = 0;
                this.isGoOneof_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsGoOneof() {
            this.isGoOneofCase_ = 0;
            this.isGoOneof_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPeriodOneof() {
            this.periodOneofCase_ = 0;
            this.periodOneof_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPwd() {
            this.pwd_ = getDefaultInstance().getPwd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSsid() {
            this.ssid_ = getDefaultInstance().getSsid();
        }

        public static AppCommSubTypeP2p getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppCommSubTypeP2p parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppCommSubTypeP2p) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppCommSubTypeP2p parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppCommSubTypeP2p) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AppCommSubTypeP2p> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChannel(int i) {
            this.channel_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDbs(boolean z) {
            this.dbs_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEffectivePeriod(long j) {
            this.periodOneofCase_ = 11;
            this.periodOneof_ = Long.valueOf(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGcMacAddr(String str) {
            str.getClass();
            this.gcMacAddr_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGcMacAddrBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.gcMacAddr_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoMacAddr(String str) {
            str.getClass();
            this.goMacAddr_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoMacAddrBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.goMacAddr_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv4Addr(String str) {
            str.getClass();
            this.ipv4Addr_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv4AddrBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.ipv4Addr_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv6Addr(String str) {
            str.getClass();
            this.ipv6Addr_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv6AddrBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.ipv6Addr_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIs5G(boolean z) {
            this.is5G_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsGo(boolean z) {
            this.isGoOneofCase_ = 10;
            this.isGoOneof_ = Boolean.valueOf(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPwd(String str) {
            str.getClass();
            this.pwd_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPwdBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.pwd_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSsid(String str) {
            str.getClass();
            this.ssid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSsidBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.ssid_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AppCommSubTypeP2p();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0002\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\u0007\u0006\u0007\u0007Ȉ\bȈ\tȈ\n:\u0000\u000b5\u0001", new Object[]{"isGoOneof_", "isGoOneofCase_", "periodOneof_", "periodOneofCase_", "gcMacAddr_", "ipv4Addr_", "ipv6Addr_", "channel_", "is5G_", "dbs_", "goMacAddr_", "ssid_", "pwd_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AppCommSubTypeP2p> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AppCommSubTypeP2p.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public int getChannel() {
            return this.channel_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public boolean getDbs() {
            return this.dbs_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public long getEffectivePeriod() {
            if (this.periodOneofCase_ == 11) {
                return ((Long) this.periodOneof_).longValue();
            }
            return 0L;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public String getGcMacAddr() {
            return this.gcMacAddr_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public ByteString getGcMacAddrBytes() {
            return ByteString.copyFromUtf8(this.gcMacAddr_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public String getGoMacAddr() {
            return this.goMacAddr_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public ByteString getGoMacAddrBytes() {
            return ByteString.copyFromUtf8(this.goMacAddr_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public String getIpv4Addr() {
            return this.ipv4Addr_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public ByteString getIpv4AddrBytes() {
            return ByteString.copyFromUtf8(this.ipv4Addr_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public String getIpv6Addr() {
            return this.ipv6Addr_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public ByteString getIpv6AddrBytes() {
            return ByteString.copyFromUtf8(this.ipv6Addr_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public boolean getIs5G() {
            return this.is5G_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public boolean getIsGo() {
            if (this.isGoOneofCase_ == 10) {
                return ((Boolean) this.isGoOneof_).booleanValue();
            }
            return false;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public IsGoOneofCase getIsGoOneofCase() {
            return IsGoOneofCase.forNumber(this.isGoOneofCase_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public PeriodOneofCase getPeriodOneofCase() {
            return PeriodOneofCase.forNumber(this.periodOneofCase_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public String getPwd() {
            return this.pwd_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public ByteString getPwdBytes() {
            return ByteString.copyFromUtf8(this.pwd_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public String getSsid() {
            return this.ssid_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public ByteString getSsidBytes() {
            return ByteString.copyFromUtf8(this.ssid_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public boolean hasEffectivePeriod() {
            return this.periodOneofCase_ == 11;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeP2pOrBuilder
        public boolean hasIsGo() {
            return this.isGoOneofCase_ == 10;
        }

        public static Builder newBuilder(AppCommSubTypeP2p appCommSubTypeP2p) {
            return DEFAULT_INSTANCE.createBuilder(appCommSubTypeP2p);
        }

        public static AppCommSubTypeP2p parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppCommSubTypeP2p) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppCommSubTypeP2p parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AppCommSubTypeP2p) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AppCommSubTypeP2p parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppCommSubTypeP2p) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AppCommSubTypeP2p parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AppCommSubTypeP2p) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AppCommSubTypeP2p parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppCommSubTypeP2p) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppCommSubTypeP2p parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AppCommSubTypeP2p) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AppCommSubTypeP2p parseFrom(InputStream inputStream) throws IOException {
            return (AppCommSubTypeP2p) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppCommSubTypeP2p parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppCommSubTypeP2p) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppCommSubTypeP2p parseFrom(j jVar) throws IOException {
            return (AppCommSubTypeP2p) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AppCommSubTypeP2p parseFrom(j jVar, t tVar) throws IOException {
            return (AppCommSubTypeP2p) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AppCommSubTypeP2pOrBuilder extends bsf {
        int getChannel();

        boolean getDbs();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        long getEffectivePeriod();

        String getGcMacAddr();

        ByteString getGcMacAddrBytes();

        String getGoMacAddr();

        ByteString getGoMacAddrBytes();

        String getIpv4Addr();

        ByteString getIpv4AddrBytes();

        String getIpv6Addr();

        ByteString getIpv6AddrBytes();

        boolean getIs5G();

        boolean getIsGo();

        AppCommSubTypeP2p.IsGoOneofCase getIsGoOneofCase();

        AppCommSubTypeP2p.PeriodOneofCase getPeriodOneofCase();

        String getPwd();

        ByteString getPwdBytes();

        String getSsid();

        ByteString getSsidBytes();

        boolean hasEffectivePeriod();

        boolean hasIsGo();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AppCommSubTypeSoftap extends GeneratedMessageLite<AppCommSubTypeSoftap, Builder> implements AppCommSubTypeSoftapOrBuilder {
        public static final int CHANNEL_FIELD_NUMBER = 4;
        public static final int DBS_FIELD_NUMBER = 6;
        private static final AppCommSubTypeSoftap DEFAULT_INSTANCE;
        public static final int IPV4ADDR_FIELD_NUMBER = 2;
        public static final int IPV6ADDR_FIELD_NUMBER = 3;
        public static final int IS5G_FIELD_NUMBER = 5;
        public static final int ISAP_FIELD_NUMBER = 9;
        public static final int MACADDR_FIELD_NUMBER = 1;
        private static volatile vkh<AppCommSubTypeSoftap> PARSER = null;
        public static final int PWD_FIELD_NUMBER = 8;
        public static final int SSID_FIELD_NUMBER = 7;
        private boolean dbs_;
        private boolean is5G_;
        private Object isApOneof_;
        private int isApOneofCase_ = 0;
        private int channelMemoizedSerializedSize = -1;
        private String macAddr_ = "";
        private String ipv4Addr_ = "";
        private String ipv6Addr_ = "";
        private d0.g channel_ = GeneratedMessageLite.emptyIntList();
        private String ssid_ = "";
        private String pwd_ = "";

        public static final class Builder extends GeneratedMessageLite.a<AppCommSubTypeSoftap, Builder> implements AppCommSubTypeSoftapOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllChannel(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).addAllChannel(iterable);
                return this;
            }

            public Builder addChannel(int i) {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).addChannel(i);
                return this;
            }

            public Builder clearChannel() {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).clearChannel();
                return this;
            }

            public Builder clearDbs() {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).clearDbs();
                return this;
            }

            public Builder clearIpv4Addr() {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).clearIpv4Addr();
                return this;
            }

            public Builder clearIpv6Addr() {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).clearIpv6Addr();
                return this;
            }

            public Builder clearIs5G() {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).clearIs5G();
                return this;
            }

            public Builder clearIsAp() {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).clearIsAp();
                return this;
            }

            public Builder clearIsApOneof() {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).clearIsApOneof();
                return this;
            }

            public Builder clearMacAddr() {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).clearMacAddr();
                return this;
            }

            public Builder clearPwd() {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).clearPwd();
                return this;
            }

            public Builder clearSsid() {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).clearSsid();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public int getChannel(int i) {
                return ((AppCommSubTypeSoftap) this.instance).getChannel(i);
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public int getChannelCount() {
                return ((AppCommSubTypeSoftap) this.instance).getChannelCount();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public List<Integer> getChannelList() {
                return Collections.unmodifiableList(((AppCommSubTypeSoftap) this.instance).getChannelList());
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public boolean getDbs() {
                return ((AppCommSubTypeSoftap) this.instance).getDbs();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public String getIpv4Addr() {
                return ((AppCommSubTypeSoftap) this.instance).getIpv4Addr();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public ByteString getIpv4AddrBytes() {
                return ((AppCommSubTypeSoftap) this.instance).getIpv4AddrBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public String getIpv6Addr() {
                return ((AppCommSubTypeSoftap) this.instance).getIpv6Addr();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public ByteString getIpv6AddrBytes() {
                return ((AppCommSubTypeSoftap) this.instance).getIpv6AddrBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public boolean getIs5G() {
                return ((AppCommSubTypeSoftap) this.instance).getIs5G();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public boolean getIsAp() {
                return ((AppCommSubTypeSoftap) this.instance).getIsAp();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public IsApOneofCase getIsApOneofCase() {
                return ((AppCommSubTypeSoftap) this.instance).getIsApOneofCase();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public String getMacAddr() {
                return ((AppCommSubTypeSoftap) this.instance).getMacAddr();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public ByteString getMacAddrBytes() {
                return ((AppCommSubTypeSoftap) this.instance).getMacAddrBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public String getPwd() {
                return ((AppCommSubTypeSoftap) this.instance).getPwd();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public ByteString getPwdBytes() {
                return ((AppCommSubTypeSoftap) this.instance).getPwdBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public String getSsid() {
                return ((AppCommSubTypeSoftap) this.instance).getSsid();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public ByteString getSsidBytes() {
                return ((AppCommSubTypeSoftap) this.instance).getSsidBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
            public boolean hasIsAp() {
                return ((AppCommSubTypeSoftap) this.instance).hasIsAp();
            }

            public Builder setChannel(int i, int i2) {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).setChannel(i, i2);
                return this;
            }

            public Builder setDbs(boolean z) {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).setDbs(z);
                return this;
            }

            public Builder setIpv4Addr(String str) {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).setIpv4Addr(str);
                return this;
            }

            public Builder setIpv4AddrBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).setIpv4AddrBytes(byteString);
                return this;
            }

            public Builder setIpv6Addr(String str) {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).setIpv6Addr(str);
                return this;
            }

            public Builder setIpv6AddrBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).setIpv6AddrBytes(byteString);
                return this;
            }

            public Builder setIs5G(boolean z) {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).setIs5G(z);
                return this;
            }

            public Builder setIsAp(boolean z) {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).setIsAp(z);
                return this;
            }

            public Builder setMacAddr(String str) {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).setMacAddr(str);
                return this;
            }

            public Builder setMacAddrBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).setMacAddrBytes(byteString);
                return this;
            }

            public Builder setPwd(String str) {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).setPwd(str);
                return this;
            }

            public Builder setPwdBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).setPwdBytes(byteString);
                return this;
            }

            public Builder setSsid(String str) {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).setSsid(str);
                return this;
            }

            public Builder setSsidBytes(ByteString byteString) {
                copyOnWrite();
                ((AppCommSubTypeSoftap) this.instance).setSsidBytes(byteString);
                return this;
            }

            private Builder() {
                super(AppCommSubTypeSoftap.DEFAULT_INSTANCE);
            }
        }

        public enum IsApOneofCase {
            ISAP(9),
            ISAPONEOF_NOT_SET(0);

            private final int value;

            IsApOneofCase(int i) {
                this.value = i;
            }

            public static IsApOneofCase forNumber(int i) {
                if (i == 0) {
                    return ISAPONEOF_NOT_SET;
                }
                if (i != 9) {
                    return null;
                }
                return ISAP;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static IsApOneofCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            AppCommSubTypeSoftap appCommSubTypeSoftap = new AppCommSubTypeSoftap();
            DEFAULT_INSTANCE = appCommSubTypeSoftap;
            GeneratedMessageLite.registerDefaultInstance(AppCommSubTypeSoftap.class, appCommSubTypeSoftap);
        }

        private AppCommSubTypeSoftap() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllChannel(Iterable<? extends Integer> iterable) {
            ensureChannelIsMutable();
            b.addAll((Iterable) iterable, (List) this.channel_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addChannel(int i) {
            ensureChannelIsMutable();
            this.channel_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChannel() {
            this.channel_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDbs() {
            this.dbs_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIpv4Addr() {
            this.ipv4Addr_ = getDefaultInstance().getIpv4Addr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIpv6Addr() {
            this.ipv6Addr_ = getDefaultInstance().getIpv6Addr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIs5G() {
            this.is5G_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsAp() {
            if (this.isApOneofCase_ == 9) {
                this.isApOneofCase_ = 0;
                this.isApOneof_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsApOneof() {
            this.isApOneofCase_ = 0;
            this.isApOneof_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMacAddr() {
            this.macAddr_ = getDefaultInstance().getMacAddr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPwd() {
            this.pwd_ = getDefaultInstance().getPwd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSsid() {
            this.ssid_ = getDefaultInstance().getSsid();
        }

        private void ensureChannelIsMutable() {
            d0.g gVar = this.channel_;
            if (gVar.c()) {
                return;
            }
            this.channel_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        public static AppCommSubTypeSoftap getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppCommSubTypeSoftap parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppCommSubTypeSoftap) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppCommSubTypeSoftap parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppCommSubTypeSoftap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AppCommSubTypeSoftap> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChannel(int i, int i2) {
            ensureChannelIsMutable();
            this.channel_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDbs(boolean z) {
            this.dbs_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv4Addr(String str) {
            str.getClass();
            this.ipv4Addr_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv4AddrBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.ipv4Addr_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv6Addr(String str) {
            str.getClass();
            this.ipv6Addr_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv6AddrBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.ipv6Addr_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIs5G(boolean z) {
            this.is5G_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsAp(boolean z) {
            this.isApOneofCase_ = 9;
            this.isApOneof_ = Boolean.valueOf(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMacAddr(String str) {
            str.getClass();
            this.macAddr_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMacAddrBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.macAddr_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPwd(String str) {
            str.getClass();
            this.pwd_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPwdBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.pwd_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSsid(String str) {
            str.getClass();
            this.ssid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSsidBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.ssid_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AppCommSubTypeSoftap();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004'\u0005\u0007\u0006\u0007\u0007Ȉ\bȈ\t:\u0000", new Object[]{"isApOneof_", "isApOneofCase_", "macAddr_", "ipv4Addr_", "ipv6Addr_", "channel_", "is5G_", "dbs_", "ssid_", "pwd_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AppCommSubTypeSoftap> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AppCommSubTypeSoftap.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public int getChannel(int i) {
            return this.channel_.getInt(i);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public int getChannelCount() {
            return this.channel_.size();
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public List<Integer> getChannelList() {
            return this.channel_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public boolean getDbs() {
            return this.dbs_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public String getIpv4Addr() {
            return this.ipv4Addr_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public ByteString getIpv4AddrBytes() {
            return ByteString.copyFromUtf8(this.ipv4Addr_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public String getIpv6Addr() {
            return this.ipv6Addr_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public ByteString getIpv6AddrBytes() {
            return ByteString.copyFromUtf8(this.ipv6Addr_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public boolean getIs5G() {
            return this.is5G_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public boolean getIsAp() {
            if (this.isApOneofCase_ == 9) {
                return ((Boolean) this.isApOneof_).booleanValue();
            }
            return false;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public IsApOneofCase getIsApOneofCase() {
            return IsApOneofCase.forNumber(this.isApOneofCase_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public String getMacAddr() {
            return this.macAddr_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public ByteString getMacAddrBytes() {
            return ByteString.copyFromUtf8(this.macAddr_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public String getPwd() {
            return this.pwd_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public ByteString getPwdBytes() {
            return ByteString.copyFromUtf8(this.pwd_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public String getSsid() {
            return this.ssid_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public ByteString getSsidBytes() {
            return ByteString.copyFromUtf8(this.ssid_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommSubTypeSoftapOrBuilder
        public boolean hasIsAp() {
            return this.isApOneofCase_ == 9;
        }

        public static Builder newBuilder(AppCommSubTypeSoftap appCommSubTypeSoftap) {
            return DEFAULT_INSTANCE.createBuilder(appCommSubTypeSoftap);
        }

        public static AppCommSubTypeSoftap parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppCommSubTypeSoftap) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppCommSubTypeSoftap parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AppCommSubTypeSoftap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AppCommSubTypeSoftap parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppCommSubTypeSoftap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AppCommSubTypeSoftap parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AppCommSubTypeSoftap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AppCommSubTypeSoftap parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppCommSubTypeSoftap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppCommSubTypeSoftap parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AppCommSubTypeSoftap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AppCommSubTypeSoftap parseFrom(InputStream inputStream) throws IOException {
            return (AppCommSubTypeSoftap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppCommSubTypeSoftap parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppCommSubTypeSoftap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppCommSubTypeSoftap parseFrom(j jVar) throws IOException {
            return (AppCommSubTypeSoftap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AppCommSubTypeSoftap parseFrom(j jVar, t tVar) throws IOException {
            return (AppCommSubTypeSoftap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AppCommSubTypeSoftapOrBuilder extends bsf {
        int getChannel(int i);

        int getChannelCount();

        List<Integer> getChannelList();

        boolean getDbs();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        String getIpv4Addr();

        ByteString getIpv4AddrBytes();

        String getIpv6Addr();

        ByteString getIpv6AddrBytes();

        boolean getIs5G();

        boolean getIsAp();

        AppCommSubTypeSoftap.IsApOneofCase getIsApOneofCase();

        String getMacAddr();

        ByteString getMacAddrBytes();

        String getPwd();

        ByteString getPwdBytes();

        String getSsid();

        ByteString getSsidBytes();

        boolean hasIsAp();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public enum AppCommType implements d0.c {
        COMM_TYPE_NONE(0),
        COMM_TYPE_BT(1),
        COMM_TYPE_IP(2),
        COMM_TYPE_WIFI_P2P(3),
        COMM_TYPE_WIFI_SOFTAP(4),
        UNRECOGNIZED(-1);

        public static final int COMM_TYPE_BT_VALUE = 1;
        public static final int COMM_TYPE_IP_VALUE = 2;
        public static final int COMM_TYPE_NONE_VALUE = 0;
        public static final int COMM_TYPE_WIFI_P2P_VALUE = 3;
        public static final int COMM_TYPE_WIFI_SOFTAP_VALUE = 4;
        private static final d0.d<AppCommType> internalValueMap = new d0.d<AppCommType>() { // from class: com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCommType.1
            @Override // com.google.protobuf.d0.d
            public AppCommType findValueByNumber(int i) {
                return AppCommType.forNumber(i);
            }
        };
        private final int value;

        public static final class AppCommTypeVerifier implements d0.e {
            static final d0.e INSTANCE = new AppCommTypeVerifier();

            private AppCommTypeVerifier() {
            }

            @Override // com.google.protobuf.d0.e
            public boolean isInRange(int i) {
                return AppCommType.forNumber(i) != null;
            }
        }

        AppCommType(int i) {
            this.value = i;
        }

        public static AppCommType forNumber(int i) {
            if (i == 0) {
                return COMM_TYPE_NONE;
            }
            if (i == 1) {
                return COMM_TYPE_BT;
            }
            if (i == 2) {
                return COMM_TYPE_IP;
            }
            if (i == 3) {
                return COMM_TYPE_WIFI_P2P;
            }
            if (i != 4) {
                return null;
            }
            return COMM_TYPE_WIFI_SOFTAP;
        }

        public static d0.d<AppCommType> internalGetValueMap() {
            return internalValueMap;
        }

        public static d0.e internalGetVerifier() {
            return AppCommTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.d0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static AppCommType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class AppConnSetting extends GeneratedMessageLite<AppConnSetting, Builder> implements AppConnSettingOrBuilder {
        public static final int BTSETTING_FIELD_NUMBER = 2;
        public static final int COMMTYPE_FIELD_NUMBER = 1;
        private static final AppConnSetting DEFAULT_INSTANCE;
        public static final int IPSETTING_FIELD_NUMBER = 3;
        public static final int P2PSETTING_FIELD_NUMBER = 4;
        private static volatile vkh<AppConnSetting> PARSER = null;
        public static final int SOFTAPSETTING_FIELD_NUMBER = 5;
        private int commType_;
        private int settingOneofCase_ = 0;
        private Object settingOneof_;

        public static final class Builder extends GeneratedMessageLite.a<AppConnSetting, Builder> implements AppConnSettingOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBtSetting() {
                copyOnWrite();
                ((AppConnSetting) this.instance).clearBtSetting();
                return this;
            }

            public Builder clearCommType() {
                copyOnWrite();
                ((AppConnSetting) this.instance).clearCommType();
                return this;
            }

            public Builder clearIpSetting() {
                copyOnWrite();
                ((AppConnSetting) this.instance).clearIpSetting();
                return this;
            }

            public Builder clearP2PSetting() {
                copyOnWrite();
                ((AppConnSetting) this.instance).clearP2PSetting();
                return this;
            }

            public Builder clearSettingOneof() {
                copyOnWrite();
                ((AppConnSetting) this.instance).clearSettingOneof();
                return this;
            }

            public Builder clearSoftapSetting() {
                copyOnWrite();
                ((AppConnSetting) this.instance).clearSoftapSetting();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
            public AppCommSubTypeBt getBtSetting() {
                return ((AppConnSetting) this.instance).getBtSetting();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
            public AppCommType getCommType() {
                return ((AppConnSetting) this.instance).getCommType();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
            public int getCommTypeValue() {
                return ((AppConnSetting) this.instance).getCommTypeValue();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
            public AppCommSubTypeIp getIpSetting() {
                return ((AppConnSetting) this.instance).getIpSetting();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
            public AppCommSubTypeP2p getP2PSetting() {
                return ((AppConnSetting) this.instance).getP2PSetting();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
            public SettingOneofCase getSettingOneofCase() {
                return ((AppConnSetting) this.instance).getSettingOneofCase();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
            public AppCommSubTypeSoftap getSoftapSetting() {
                return ((AppConnSetting) this.instance).getSoftapSetting();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
            public boolean hasBtSetting() {
                return ((AppConnSetting) this.instance).hasBtSetting();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
            public boolean hasIpSetting() {
                return ((AppConnSetting) this.instance).hasIpSetting();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
            public boolean hasP2PSetting() {
                return ((AppConnSetting) this.instance).hasP2PSetting();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
            public boolean hasSoftapSetting() {
                return ((AppConnSetting) this.instance).hasSoftapSetting();
            }

            public Builder mergeBtSetting(AppCommSubTypeBt appCommSubTypeBt) {
                copyOnWrite();
                ((AppConnSetting) this.instance).mergeBtSetting(appCommSubTypeBt);
                return this;
            }

            public Builder mergeIpSetting(AppCommSubTypeIp appCommSubTypeIp) {
                copyOnWrite();
                ((AppConnSetting) this.instance).mergeIpSetting(appCommSubTypeIp);
                return this;
            }

            public Builder mergeP2PSetting(AppCommSubTypeP2p appCommSubTypeP2p) {
                copyOnWrite();
                ((AppConnSetting) this.instance).mergeP2PSetting(appCommSubTypeP2p);
                return this;
            }

            public Builder mergeSoftapSetting(AppCommSubTypeSoftap appCommSubTypeSoftap) {
                copyOnWrite();
                ((AppConnSetting) this.instance).mergeSoftapSetting(appCommSubTypeSoftap);
                return this;
            }

            public Builder setBtSetting(AppCommSubTypeBt appCommSubTypeBt) {
                copyOnWrite();
                ((AppConnSetting) this.instance).setBtSetting(appCommSubTypeBt);
                return this;
            }

            public Builder setCommType(AppCommType appCommType) {
                copyOnWrite();
                ((AppConnSetting) this.instance).setCommType(appCommType);
                return this;
            }

            public Builder setCommTypeValue(int i) {
                copyOnWrite();
                ((AppConnSetting) this.instance).setCommTypeValue(i);
                return this;
            }

            public Builder setIpSetting(AppCommSubTypeIp appCommSubTypeIp) {
                copyOnWrite();
                ((AppConnSetting) this.instance).setIpSetting(appCommSubTypeIp);
                return this;
            }

            public Builder setP2PSetting(AppCommSubTypeP2p appCommSubTypeP2p) {
                copyOnWrite();
                ((AppConnSetting) this.instance).setP2PSetting(appCommSubTypeP2p);
                return this;
            }

            public Builder setSoftapSetting(AppCommSubTypeSoftap appCommSubTypeSoftap) {
                copyOnWrite();
                ((AppConnSetting) this.instance).setSoftapSetting(appCommSubTypeSoftap);
                return this;
            }

            private Builder() {
                super(AppConnSetting.DEFAULT_INSTANCE);
            }

            public Builder setBtSetting(AppCommSubTypeBt.Builder builder) {
                copyOnWrite();
                ((AppConnSetting) this.instance).setBtSetting(builder.build());
                return this;
            }

            public Builder setIpSetting(AppCommSubTypeIp.Builder builder) {
                copyOnWrite();
                ((AppConnSetting) this.instance).setIpSetting(builder.build());
                return this;
            }

            public Builder setP2PSetting(AppCommSubTypeP2p.Builder builder) {
                copyOnWrite();
                ((AppConnSetting) this.instance).setP2PSetting(builder.build());
                return this;
            }

            public Builder setSoftapSetting(AppCommSubTypeSoftap.Builder builder) {
                copyOnWrite();
                ((AppConnSetting) this.instance).setSoftapSetting(builder.build());
                return this;
            }
        }

        public enum SettingOneofCase {
            BTSETTING(2),
            IPSETTING(3),
            P2PSETTING(4),
            SOFTAPSETTING(5),
            SETTINGONEOF_NOT_SET(0);

            private final int value;

            SettingOneofCase(int i) {
                this.value = i;
            }

            public static SettingOneofCase forNumber(int i) {
                if (i == 0) {
                    return SETTINGONEOF_NOT_SET;
                }
                if (i == 2) {
                    return BTSETTING;
                }
                if (i == 3) {
                    return IPSETTING;
                }
                if (i == 4) {
                    return P2PSETTING;
                }
                if (i != 5) {
                    return null;
                }
                return SOFTAPSETTING;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static SettingOneofCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            AppConnSetting appConnSetting = new AppConnSetting();
            DEFAULT_INSTANCE = appConnSetting;
            GeneratedMessageLite.registerDefaultInstance(AppConnSetting.class, appConnSetting);
        }

        private AppConnSetting() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBtSetting() {
            if (this.settingOneofCase_ == 2) {
                this.settingOneofCase_ = 0;
                this.settingOneof_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCommType() {
            this.commType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIpSetting() {
            if (this.settingOneofCase_ == 3) {
                this.settingOneofCase_ = 0;
                this.settingOneof_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearP2PSetting() {
            if (this.settingOneofCase_ == 4) {
                this.settingOneofCase_ = 0;
                this.settingOneof_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingOneof() {
            this.settingOneofCase_ = 0;
            this.settingOneof_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSoftapSetting() {
            if (this.settingOneofCase_ == 5) {
                this.settingOneofCase_ = 0;
                this.settingOneof_ = null;
            }
        }

        public static AppConnSetting getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBtSetting(AppCommSubTypeBt appCommSubTypeBt) {
            appCommSubTypeBt.getClass();
            if (this.settingOneofCase_ != 2 || this.settingOneof_ == AppCommSubTypeBt.getDefaultInstance()) {
                this.settingOneof_ = appCommSubTypeBt;
            } else {
                this.settingOneof_ = AppCommSubTypeBt.newBuilder((AppCommSubTypeBt) this.settingOneof_).mergeFrom(appCommSubTypeBt).buildPartial();
            }
            this.settingOneofCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIpSetting(AppCommSubTypeIp appCommSubTypeIp) {
            appCommSubTypeIp.getClass();
            if (this.settingOneofCase_ != 3 || this.settingOneof_ == AppCommSubTypeIp.getDefaultInstance()) {
                this.settingOneof_ = appCommSubTypeIp;
            } else {
                this.settingOneof_ = AppCommSubTypeIp.newBuilder((AppCommSubTypeIp) this.settingOneof_).mergeFrom(appCommSubTypeIp).buildPartial();
            }
            this.settingOneofCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeP2PSetting(AppCommSubTypeP2p appCommSubTypeP2p) {
            appCommSubTypeP2p.getClass();
            if (this.settingOneofCase_ != 4 || this.settingOneof_ == AppCommSubTypeP2p.getDefaultInstance()) {
                this.settingOneof_ = appCommSubTypeP2p;
            } else {
                this.settingOneof_ = AppCommSubTypeP2p.newBuilder((AppCommSubTypeP2p) this.settingOneof_).mergeFrom(appCommSubTypeP2p).buildPartial();
            }
            this.settingOneofCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSoftapSetting(AppCommSubTypeSoftap appCommSubTypeSoftap) {
            appCommSubTypeSoftap.getClass();
            if (this.settingOneofCase_ != 5 || this.settingOneof_ == AppCommSubTypeSoftap.getDefaultInstance()) {
                this.settingOneof_ = appCommSubTypeSoftap;
            } else {
                this.settingOneof_ = AppCommSubTypeSoftap.newBuilder((AppCommSubTypeSoftap) this.settingOneof_).mergeFrom(appCommSubTypeSoftap).buildPartial();
            }
            this.settingOneofCase_ = 5;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppConnSetting parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppConnSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppConnSetting parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppConnSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AppConnSetting> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBtSetting(AppCommSubTypeBt appCommSubTypeBt) {
            appCommSubTypeBt.getClass();
            this.settingOneof_ = appCommSubTypeBt;
            this.settingOneofCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommType(AppCommType appCommType) {
            this.commType_ = appCommType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommTypeValue(int i) {
            this.commType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpSetting(AppCommSubTypeIp appCommSubTypeIp) {
            appCommSubTypeIp.getClass();
            this.settingOneof_ = appCommSubTypeIp;
            this.settingOneofCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setP2PSetting(AppCommSubTypeP2p appCommSubTypeP2p) {
            appCommSubTypeP2p.getClass();
            this.settingOneof_ = appCommSubTypeP2p;
            this.settingOneofCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSoftapSetting(AppCommSubTypeSoftap appCommSubTypeSoftap) {
            appCommSubTypeSoftap.getClass();
            this.settingOneof_ = appCommSubTypeSoftap;
            this.settingOneofCase_ = 5;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AppConnSetting();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"settingOneof_", "settingOneofCase_", "commType_", AppCommSubTypeBt.class, AppCommSubTypeIp.class, AppCommSubTypeP2p.class, AppCommSubTypeSoftap.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AppConnSetting> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AppConnSetting.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
        public AppCommSubTypeBt getBtSetting() {
            return this.settingOneofCase_ == 2 ? (AppCommSubTypeBt) this.settingOneof_ : AppCommSubTypeBt.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
        public AppCommType getCommType() {
            AppCommType appCommTypeForNumber = AppCommType.forNumber(this.commType_);
            return appCommTypeForNumber == null ? AppCommType.UNRECOGNIZED : appCommTypeForNumber;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
        public int getCommTypeValue() {
            return this.commType_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
        public AppCommSubTypeIp getIpSetting() {
            return this.settingOneofCase_ == 3 ? (AppCommSubTypeIp) this.settingOneof_ : AppCommSubTypeIp.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
        public AppCommSubTypeP2p getP2PSetting() {
            return this.settingOneofCase_ == 4 ? (AppCommSubTypeP2p) this.settingOneof_ : AppCommSubTypeP2p.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
        public SettingOneofCase getSettingOneofCase() {
            return SettingOneofCase.forNumber(this.settingOneofCase_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
        public AppCommSubTypeSoftap getSoftapSetting() {
            return this.settingOneofCase_ == 5 ? (AppCommSubTypeSoftap) this.settingOneof_ : AppCommSubTypeSoftap.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
        public boolean hasBtSetting() {
            return this.settingOneofCase_ == 2;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
        public boolean hasIpSetting() {
            return this.settingOneofCase_ == 3;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
        public boolean hasP2PSetting() {
            return this.settingOneofCase_ == 4;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingOrBuilder
        public boolean hasSoftapSetting() {
            return this.settingOneofCase_ == 5;
        }

        public static Builder newBuilder(AppConnSetting appConnSetting) {
            return DEFAULT_INSTANCE.createBuilder(appConnSetting);
        }

        public static AppConnSetting parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppConnSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppConnSetting parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AppConnSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AppConnSetting parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppConnSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AppConnSetting parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AppConnSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AppConnSetting parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppConnSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppConnSetting parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AppConnSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AppConnSetting parseFrom(InputStream inputStream) throws IOException {
            return (AppConnSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppConnSetting parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppConnSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppConnSetting parseFrom(j jVar) throws IOException {
            return (AppConnSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AppConnSetting parseFrom(j jVar, t tVar) throws IOException {
            return (AppConnSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AppConnSettingOrBuilder extends bsf {
        AppCommSubTypeBt getBtSetting();

        AppCommType getCommType();

        int getCommTypeValue();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        AppCommSubTypeIp getIpSetting();

        AppCommSubTypeP2p getP2PSetting();

        AppConnSetting.SettingOneofCase getSettingOneofCase();

        AppCommSubTypeSoftap getSoftapSetting();

        boolean hasBtSetting();

        boolean hasIpSetting();

        boolean hasP2PSetting();

        boolean hasSoftapSetting();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AppConnSettings extends GeneratedMessageLite<AppConnSettings, Builder> implements AppConnSettingsOrBuilder {
        public static final int CONNSETTINGS_FIELD_NUMBER = 1;
        private static final AppConnSettings DEFAULT_INSTANCE;
        private static volatile vkh<AppConnSettings> PARSER;
        private d0.i<AppConnSetting> connSettings_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.a<AppConnSettings, Builder> implements AppConnSettingsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllConnSettings(Iterable<? extends AppConnSetting> iterable) {
                copyOnWrite();
                ((AppConnSettings) this.instance).addAllConnSettings(iterable);
                return this;
            }

            public Builder addConnSettings(AppConnSetting appConnSetting) {
                copyOnWrite();
                ((AppConnSettings) this.instance).addConnSettings(appConnSetting);
                return this;
            }

            public Builder clearConnSettings() {
                copyOnWrite();
                ((AppConnSettings) this.instance).clearConnSettings();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingsOrBuilder
            public AppConnSetting getConnSettings(int i) {
                return ((AppConnSettings) this.instance).getConnSettings(i);
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingsOrBuilder
            public int getConnSettingsCount() {
                return ((AppConnSettings) this.instance).getConnSettingsCount();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingsOrBuilder
            public List<AppConnSetting> getConnSettingsList() {
                return Collections.unmodifiableList(((AppConnSettings) this.instance).getConnSettingsList());
            }

            public Builder removeConnSettings(int i) {
                copyOnWrite();
                ((AppConnSettings) this.instance).removeConnSettings(i);
                return this;
            }

            public Builder setConnSettings(int i, AppConnSetting appConnSetting) {
                copyOnWrite();
                ((AppConnSettings) this.instance).setConnSettings(i, appConnSetting);
                return this;
            }

            private Builder() {
                super(AppConnSettings.DEFAULT_INSTANCE);
            }

            public Builder addConnSettings(int i, AppConnSetting appConnSetting) {
                copyOnWrite();
                ((AppConnSettings) this.instance).addConnSettings(i, appConnSetting);
                return this;
            }

            public Builder setConnSettings(int i, AppConnSetting.Builder builder) {
                copyOnWrite();
                ((AppConnSettings) this.instance).setConnSettings(i, builder.build());
                return this;
            }

            public Builder addConnSettings(AppConnSetting.Builder builder) {
                copyOnWrite();
                ((AppConnSettings) this.instance).addConnSettings(builder.build());
                return this;
            }

            public Builder addConnSettings(int i, AppConnSetting.Builder builder) {
                copyOnWrite();
                ((AppConnSettings) this.instance).addConnSettings(i, builder.build());
                return this;
            }
        }

        static {
            AppConnSettings appConnSettings = new AppConnSettings();
            DEFAULT_INSTANCE = appConnSettings;
            GeneratedMessageLite.registerDefaultInstance(AppConnSettings.class, appConnSettings);
        }

        private AppConnSettings() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllConnSettings(Iterable<? extends AppConnSetting> iterable) {
            ensureConnSettingsIsMutable();
            b.addAll((Iterable) iterable, (List) this.connSettings_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConnSettings(AppConnSetting appConnSetting) {
            appConnSetting.getClass();
            ensureConnSettingsIsMutable();
            this.connSettings_.add(appConnSetting);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnSettings() {
            this.connSettings_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureConnSettingsIsMutable() {
            d0.i<AppConnSetting> iVar = this.connSettings_;
            if (iVar.c()) {
                return;
            }
            this.connSettings_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        public static AppConnSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppConnSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppConnSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppConnSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppConnSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AppConnSettings> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeConnSettings(int i) {
            ensureConnSettingsIsMutable();
            this.connSettings_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnSettings(int i, AppConnSetting appConnSetting) {
            appConnSetting.getClass();
            ensureConnSettingsIsMutable();
            this.connSettings_.set(i, appConnSetting);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AppConnSettings();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"connSettings_", AppConnSetting.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AppConnSettings> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AppConnSettings.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingsOrBuilder
        public AppConnSetting getConnSettings(int i) {
            return this.connSettings_.get(i);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingsOrBuilder
        public int getConnSettingsCount() {
            return this.connSettings_.size();
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppConnSettingsOrBuilder
        public List<AppConnSetting> getConnSettingsList() {
            return this.connSettings_;
        }

        public AppConnSettingOrBuilder getConnSettingsOrBuilder(int i) {
            return this.connSettings_.get(i);
        }

        public List<? extends AppConnSettingOrBuilder> getConnSettingsOrBuilderList() {
            return this.connSettings_;
        }

        public static Builder newBuilder(AppConnSettings appConnSettings) {
            return DEFAULT_INSTANCE.createBuilder(appConnSettings);
        }

        public static AppConnSettings parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppConnSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppConnSettings parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AppConnSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AppConnSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppConnSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConnSettings(int i, AppConnSetting appConnSetting) {
            appConnSetting.getClass();
            ensureConnSettingsIsMutable();
            this.connSettings_.add(i, appConnSetting);
        }

        public static AppConnSettings parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AppConnSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AppConnSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppConnSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppConnSettings parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AppConnSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AppConnSettings parseFrom(InputStream inputStream) throws IOException {
            return (AppConnSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppConnSettings parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppConnSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppConnSettings parseFrom(j jVar) throws IOException {
            return (AppConnSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AppConnSettings parseFrom(j jVar, t tVar) throws IOException {
            return (AppConnSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AppConnSettingsOrBuilder extends bsf {
        AppConnSetting getConnSettings(int i);

        int getConnSettingsCount();

        List<AppConnSetting> getConnSettingsList();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AppCurrSetting extends GeneratedMessageLite<AppCurrSetting, Builder> implements AppCurrSettingOrBuilder {
        public static final int APPPRIVSETTING_FIELD_NUMBER = 1;
        public static final int CONNSETTING_FIELD_NUMBER = 2;
        private static final AppCurrSetting DEFAULT_INSTANCE;
        private static volatile vkh<AppCurrSetting> PARSER;
        private ByteString appPrivSetting_ = ByteString.EMPTY;
        private AppConnSetting connSetting_;

        public static final class Builder extends GeneratedMessageLite.a<AppCurrSetting, Builder> implements AppCurrSettingOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppPrivSetting() {
                copyOnWrite();
                ((AppCurrSetting) this.instance).clearAppPrivSetting();
                return this;
            }

            public Builder clearConnSetting() {
                copyOnWrite();
                ((AppCurrSetting) this.instance).clearConnSetting();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCurrSettingOrBuilder
            public ByteString getAppPrivSetting() {
                return ((AppCurrSetting) this.instance).getAppPrivSetting();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCurrSettingOrBuilder
            public AppConnSetting getConnSetting() {
                return ((AppCurrSetting) this.instance).getConnSetting();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCurrSettingOrBuilder
            public boolean hasConnSetting() {
                return ((AppCurrSetting) this.instance).hasConnSetting();
            }

            public Builder mergeConnSetting(AppConnSetting appConnSetting) {
                copyOnWrite();
                ((AppCurrSetting) this.instance).mergeConnSetting(appConnSetting);
                return this;
            }

            public Builder setAppPrivSetting(ByteString byteString) {
                copyOnWrite();
                ((AppCurrSetting) this.instance).setAppPrivSetting(byteString);
                return this;
            }

            public Builder setConnSetting(AppConnSetting appConnSetting) {
                copyOnWrite();
                ((AppCurrSetting) this.instance).setConnSetting(appConnSetting);
                return this;
            }

            private Builder() {
                super(AppCurrSetting.DEFAULT_INSTANCE);
            }

            public Builder setConnSetting(AppConnSetting.Builder builder) {
                copyOnWrite();
                ((AppCurrSetting) this.instance).setConnSetting(builder.build());
                return this;
            }
        }

        static {
            AppCurrSetting appCurrSetting = new AppCurrSetting();
            DEFAULT_INSTANCE = appCurrSetting;
            GeneratedMessageLite.registerDefaultInstance(AppCurrSetting.class, appCurrSetting);
        }

        private AppCurrSetting() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppPrivSetting() {
            this.appPrivSetting_ = getDefaultInstance().getAppPrivSetting();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnSetting() {
            this.connSetting_ = null;
        }

        public static AppCurrSetting getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConnSetting(AppConnSetting appConnSetting) {
            appConnSetting.getClass();
            AppConnSetting appConnSetting2 = this.connSetting_;
            if (appConnSetting2 == null || appConnSetting2 == AppConnSetting.getDefaultInstance()) {
                this.connSetting_ = appConnSetting;
            } else {
                this.connSetting_ = AppConnSetting.newBuilder(this.connSetting_).mergeFrom(appConnSetting).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppCurrSetting parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppCurrSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppCurrSetting parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppCurrSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AppCurrSetting> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppPrivSetting(ByteString byteString) {
            byteString.getClass();
            this.appPrivSetting_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnSetting(AppConnSetting appConnSetting) {
            appConnSetting.getClass();
            this.connSetting_ = appConnSetting;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AppCurrSetting();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\t", new Object[]{"appPrivSetting_", "connSetting_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AppCurrSetting> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AppCurrSetting.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCurrSettingOrBuilder
        public ByteString getAppPrivSetting() {
            return this.appPrivSetting_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCurrSettingOrBuilder
        public AppConnSetting getConnSetting() {
            AppConnSetting appConnSetting = this.connSetting_;
            return appConnSetting == null ? AppConnSetting.getDefaultInstance() : appConnSetting;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppCurrSettingOrBuilder
        public boolean hasConnSetting() {
            return this.connSetting_ != null;
        }

        public static Builder newBuilder(AppCurrSetting appCurrSetting) {
            return DEFAULT_INSTANCE.createBuilder(appCurrSetting);
        }

        public static AppCurrSetting parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppCurrSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppCurrSetting parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AppCurrSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AppCurrSetting parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppCurrSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AppCurrSetting parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AppCurrSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AppCurrSetting parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppCurrSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppCurrSetting parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AppCurrSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AppCurrSetting parseFrom(InputStream inputStream) throws IOException {
            return (AppCurrSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppCurrSetting parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppCurrSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppCurrSetting parseFrom(j jVar) throws IOException {
            return (AppCurrSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AppCurrSetting parseFrom(j jVar, t tVar) throws IOException {
            return (AppCurrSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AppCurrSettingOrBuilder extends bsf {
        ByteString getAppPrivSetting();

        AppConnSetting getConnSetting();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        boolean hasConnSetting();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AppPairRead extends GeneratedMessageLite<AppPairRead, Builder> implements AppPairReadOrBuilder {
        public static final int CB_FIELD_NUMBER = 4;
        private static final AppPairRead DEFAULT_INSTANCE;
        public static final int NB_FIELD_NUMBER = 3;
        private static volatile vkh<AppPairRead> PARSER = null;
        public static final int PB_FIELD_NUMBER = 2;
        public static final int VER_FIELD_NUMBER = 1;
        private int ver_;
        private String pb_ = "";
        private String nb_ = "";
        private String cb_ = "";

        public static final class Builder extends GeneratedMessageLite.a<AppPairRead, Builder> implements AppPairReadOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCb() {
                copyOnWrite();
                ((AppPairRead) this.instance).clearCb();
                return this;
            }

            public Builder clearNb() {
                copyOnWrite();
                ((AppPairRead) this.instance).clearNb();
                return this;
            }

            public Builder clearPb() {
                copyOnWrite();
                ((AppPairRead) this.instance).clearPb();
                return this;
            }

            public Builder clearVer() {
                copyOnWrite();
                ((AppPairRead) this.instance).clearVer();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairReadOrBuilder
            public String getCb() {
                return ((AppPairRead) this.instance).getCb();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairReadOrBuilder
            public ByteString getCbBytes() {
                return ((AppPairRead) this.instance).getCbBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairReadOrBuilder
            public String getNb() {
                return ((AppPairRead) this.instance).getNb();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairReadOrBuilder
            public ByteString getNbBytes() {
                return ((AppPairRead) this.instance).getNbBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairReadOrBuilder
            public String getPb() {
                return ((AppPairRead) this.instance).getPb();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairReadOrBuilder
            public ByteString getPbBytes() {
                return ((AppPairRead) this.instance).getPbBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairReadOrBuilder
            public int getVer() {
                return ((AppPairRead) this.instance).getVer();
            }

            public Builder setCb(String str) {
                copyOnWrite();
                ((AppPairRead) this.instance).setCb(str);
                return this;
            }

            public Builder setCbBytes(ByteString byteString) {
                copyOnWrite();
                ((AppPairRead) this.instance).setCbBytes(byteString);
                return this;
            }

            public Builder setNb(String str) {
                copyOnWrite();
                ((AppPairRead) this.instance).setNb(str);
                return this;
            }

            public Builder setNbBytes(ByteString byteString) {
                copyOnWrite();
                ((AppPairRead) this.instance).setNbBytes(byteString);
                return this;
            }

            public Builder setPb(String str) {
                copyOnWrite();
                ((AppPairRead) this.instance).setPb(str);
                return this;
            }

            public Builder setPbBytes(ByteString byteString) {
                copyOnWrite();
                ((AppPairRead) this.instance).setPbBytes(byteString);
                return this;
            }

            public Builder setVer(int i) {
                copyOnWrite();
                ((AppPairRead) this.instance).setVer(i);
                return this;
            }

            private Builder() {
                super(AppPairRead.DEFAULT_INSTANCE);
            }
        }

        static {
            AppPairRead appPairRead = new AppPairRead();
            DEFAULT_INSTANCE = appPairRead;
            GeneratedMessageLite.registerDefaultInstance(AppPairRead.class, appPairRead);
        }

        private AppPairRead() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCb() {
            this.cb_ = getDefaultInstance().getCb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNb() {
            this.nb_ = getDefaultInstance().getNb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPb() {
            this.pb_ = getDefaultInstance().getPb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVer() {
            this.ver_ = 0;
        }

        public static AppPairRead getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppPairRead parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppPairRead) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppPairRead parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppPairRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AppPairRead> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCb(String str) {
            str.getClass();
            this.cb_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCbBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.cb_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNb(String str) {
            str.getClass();
            this.nb_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNbBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.nb_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPb(String str) {
            str.getClass();
            this.pb_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPbBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.pb_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVer(int i) {
            this.ver_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AppPairRead();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"ver_", "pb_", "nb_", "cb_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AppPairRead> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AppPairRead.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairReadOrBuilder
        public String getCb() {
            return this.cb_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairReadOrBuilder
        public ByteString getCbBytes() {
            return ByteString.copyFromUtf8(this.cb_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairReadOrBuilder
        public String getNb() {
            return this.nb_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairReadOrBuilder
        public ByteString getNbBytes() {
            return ByteString.copyFromUtf8(this.nb_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairReadOrBuilder
        public String getPb() {
            return this.pb_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairReadOrBuilder
        public ByteString getPbBytes() {
            return ByteString.copyFromUtf8(this.pb_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairReadOrBuilder
        public int getVer() {
            return this.ver_;
        }

        public static Builder newBuilder(AppPairRead appPairRead) {
            return DEFAULT_INSTANCE.createBuilder(appPairRead);
        }

        public static AppPairRead parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppPairRead) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppPairRead parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AppPairRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AppPairRead parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppPairRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AppPairRead parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AppPairRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AppPairRead parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppPairRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppPairRead parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AppPairRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AppPairRead parseFrom(InputStream inputStream) throws IOException {
            return (AppPairRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppPairRead parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppPairRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppPairRead parseFrom(j jVar) throws IOException {
            return (AppPairRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AppPairRead parseFrom(j jVar, t tVar) throws IOException {
            return (AppPairRead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AppPairReadOrBuilder extends bsf {
        String getCb();

        ByteString getCbBytes();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        String getNb();

        ByteString getNbBytes();

        String getPb();

        ByteString getPbBytes();

        int getVer();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AppPairWrite extends GeneratedMessageLite<AppPairWrite, Builder> implements AppPairWriteOrBuilder {
        private static final AppPairWrite DEFAULT_INSTANCE;
        public static final int NA_FIELD_NUMBER = 3;
        private static volatile vkh<AppPairWrite> PARSER = null;
        public static final int PA_FIELD_NUMBER = 2;
        public static final int VER_FIELD_NUMBER = 1;
        private int ver_;
        private String pa_ = "";
        private String na_ = "";

        public static final class Builder extends GeneratedMessageLite.a<AppPairWrite, Builder> implements AppPairWriteOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearNa() {
                copyOnWrite();
                ((AppPairWrite) this.instance).clearNa();
                return this;
            }

            public Builder clearPa() {
                copyOnWrite();
                ((AppPairWrite) this.instance).clearPa();
                return this;
            }

            public Builder clearVer() {
                copyOnWrite();
                ((AppPairWrite) this.instance).clearVer();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairWriteOrBuilder
            public String getNa() {
                return ((AppPairWrite) this.instance).getNa();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairWriteOrBuilder
            public ByteString getNaBytes() {
                return ((AppPairWrite) this.instance).getNaBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairWriteOrBuilder
            public String getPa() {
                return ((AppPairWrite) this.instance).getPa();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairWriteOrBuilder
            public ByteString getPaBytes() {
                return ((AppPairWrite) this.instance).getPaBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairWriteOrBuilder
            public int getVer() {
                return ((AppPairWrite) this.instance).getVer();
            }

            public Builder setNa(String str) {
                copyOnWrite();
                ((AppPairWrite) this.instance).setNa(str);
                return this;
            }

            public Builder setNaBytes(ByteString byteString) {
                copyOnWrite();
                ((AppPairWrite) this.instance).setNaBytes(byteString);
                return this;
            }

            public Builder setPa(String str) {
                copyOnWrite();
                ((AppPairWrite) this.instance).setPa(str);
                return this;
            }

            public Builder setPaBytes(ByteString byteString) {
                copyOnWrite();
                ((AppPairWrite) this.instance).setPaBytes(byteString);
                return this;
            }

            public Builder setVer(int i) {
                copyOnWrite();
                ((AppPairWrite) this.instance).setVer(i);
                return this;
            }

            private Builder() {
                super(AppPairWrite.DEFAULT_INSTANCE);
            }
        }

        static {
            AppPairWrite appPairWrite = new AppPairWrite();
            DEFAULT_INSTANCE = appPairWrite;
            GeneratedMessageLite.registerDefaultInstance(AppPairWrite.class, appPairWrite);
        }

        private AppPairWrite() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNa() {
            this.na_ = getDefaultInstance().getNa();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPa() {
            this.pa_ = getDefaultInstance().getPa();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVer() {
            this.ver_ = 0;
        }

        public static AppPairWrite getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppPairWrite parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppPairWrite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppPairWrite parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppPairWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AppPairWrite> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNa(String str) {
            str.getClass();
            this.na_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNaBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.na_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPa(String str) {
            str.getClass();
            this.pa_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.pa_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVer(int i) {
            this.ver_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AppPairWrite();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ", new Object[]{"ver_", "pa_", "na_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AppPairWrite> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AppPairWrite.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairWriteOrBuilder
        public String getNa() {
            return this.na_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairWriteOrBuilder
        public ByteString getNaBytes() {
            return ByteString.copyFromUtf8(this.na_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairWriteOrBuilder
        public String getPa() {
            return this.pa_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairWriteOrBuilder
        public ByteString getPaBytes() {
            return ByteString.copyFromUtf8(this.pa_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPairWriteOrBuilder
        public int getVer() {
            return this.ver_;
        }

        public static Builder newBuilder(AppPairWrite appPairWrite) {
            return DEFAULT_INSTANCE.createBuilder(appPairWrite);
        }

        public static AppPairWrite parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppPairWrite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppPairWrite parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AppPairWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AppPairWrite parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppPairWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AppPairWrite parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AppPairWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AppPairWrite parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppPairWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppPairWrite parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AppPairWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AppPairWrite parseFrom(InputStream inputStream) throws IOException {
            return (AppPairWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppPairWrite parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppPairWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppPairWrite parseFrom(j jVar) throws IOException {
            return (AppPairWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AppPairWrite parseFrom(j jVar, t tVar) throws IOException {
            return (AppPairWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AppPairWriteOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        String getNa();

        ByteString getNaBytes();

        String getPa();

        ByteString getPaBytes();

        int getVer();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AppPayloadMsg extends GeneratedMessageLite<AppPayloadMsg, Builder> implements AppPayloadMsgOrBuilder {
        private static final AppPayloadMsg DEFAULT_INSTANCE;
        private static volatile vkh<AppPayloadMsg> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 3;
        public static final int TIMEMILLIS_FIELD_NUMBER = 2;
        public static final int VER_FIELD_NUMBER = 1;
        private String payload_ = "";
        private long timeMillis_;
        private int ver_;

        public static final class Builder extends GeneratedMessageLite.a<AppPayloadMsg, Builder> implements AppPayloadMsgOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearPayload() {
                copyOnWrite();
                ((AppPayloadMsg) this.instance).clearPayload();
                return this;
            }

            public Builder clearTimeMillis() {
                copyOnWrite();
                ((AppPayloadMsg) this.instance).clearTimeMillis();
                return this;
            }

            public Builder clearVer() {
                copyOnWrite();
                ((AppPayloadMsg) this.instance).clearVer();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPayloadMsgOrBuilder
            public String getPayload() {
                return ((AppPayloadMsg) this.instance).getPayload();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPayloadMsgOrBuilder
            public ByteString getPayloadBytes() {
                return ((AppPayloadMsg) this.instance).getPayloadBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPayloadMsgOrBuilder
            public long getTimeMillis() {
                return ((AppPayloadMsg) this.instance).getTimeMillis();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPayloadMsgOrBuilder
            public int getVer() {
                return ((AppPayloadMsg) this.instance).getVer();
            }

            public Builder setPayload(String str) {
                copyOnWrite();
                ((AppPayloadMsg) this.instance).setPayload(str);
                return this;
            }

            public Builder setPayloadBytes(ByteString byteString) {
                copyOnWrite();
                ((AppPayloadMsg) this.instance).setPayloadBytes(byteString);
                return this;
            }

            public Builder setTimeMillis(long j) {
                copyOnWrite();
                ((AppPayloadMsg) this.instance).setTimeMillis(j);
                return this;
            }

            public Builder setVer(int i) {
                copyOnWrite();
                ((AppPayloadMsg) this.instance).setVer(i);
                return this;
            }

            private Builder() {
                super(AppPayloadMsg.DEFAULT_INSTANCE);
            }
        }

        static {
            AppPayloadMsg appPayloadMsg = new AppPayloadMsg();
            DEFAULT_INSTANCE = appPayloadMsg;
            GeneratedMessageLite.registerDefaultInstance(AppPayloadMsg.class, appPayloadMsg);
        }

        private AppPayloadMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = getDefaultInstance().getPayload();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeMillis() {
            this.timeMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVer() {
            this.ver_ = 0;
        }

        public static AppPayloadMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppPayloadMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppPayloadMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppPayloadMsg parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppPayloadMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AppPayloadMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayload(String str) {
            str.getClass();
            this.payload_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayloadBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.payload_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeMillis(long j) {
            this.timeMillis_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVer(int i) {
            this.ver_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AppPayloadMsg();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003Ȉ", new Object[]{"ver_", "timeMillis_", "payload_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AppPayloadMsg> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AppPayloadMsg.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPayloadMsgOrBuilder
        public String getPayload() {
            return this.payload_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPayloadMsgOrBuilder
        public ByteString getPayloadBytes() {
            return ByteString.copyFromUtf8(this.payload_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPayloadMsgOrBuilder
        public long getTimeMillis() {
            return this.timeMillis_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppPayloadMsgOrBuilder
        public int getVer() {
            return this.ver_;
        }

        public static Builder newBuilder(AppPayloadMsg appPayloadMsg) {
            return DEFAULT_INSTANCE.createBuilder(appPayloadMsg);
        }

        public static AppPayloadMsg parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppPayloadMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppPayloadMsg parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AppPayloadMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AppPayloadMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppPayloadMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AppPayloadMsg parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AppPayloadMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AppPayloadMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppPayloadMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppPayloadMsg parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AppPayloadMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AppPayloadMsg parseFrom(InputStream inputStream) throws IOException {
            return (AppPayloadMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppPayloadMsg parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppPayloadMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppPayloadMsg parseFrom(j jVar) throws IOException {
            return (AppPayloadMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AppPayloadMsg parseFrom(j jVar, t tVar) throws IOException {
            return (AppPayloadMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AppPayloadMsgOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        String getPayload();

        ByteString getPayloadBytes();

        long getTimeMillis();

        int getVer();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class AppSuppSetting extends GeneratedMessageLite<AppSuppSetting, Builder> implements AppSuppSettingOrBuilder {
        public static final int APPPRIVSETTING_FIELD_NUMBER = 1;
        public static final int CONNSETTINGS_FIELD_NUMBER = 2;
        private static final AppSuppSetting DEFAULT_INSTANCE;
        private static volatile vkh<AppSuppSetting> PARSER;
        private ByteString appPrivSetting_ = ByteString.EMPTY;
        private AppConnSettings connSettings_;

        public static final class Builder extends GeneratedMessageLite.a<AppSuppSetting, Builder> implements AppSuppSettingOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppPrivSetting() {
                copyOnWrite();
                ((AppSuppSetting) this.instance).clearAppPrivSetting();
                return this;
            }

            public Builder clearConnSettings() {
                copyOnWrite();
                ((AppSuppSetting) this.instance).clearConnSettings();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppSuppSettingOrBuilder
            public ByteString getAppPrivSetting() {
                return ((AppSuppSetting) this.instance).getAppPrivSetting();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppSuppSettingOrBuilder
            public AppConnSettings getConnSettings() {
                return ((AppSuppSetting) this.instance).getConnSettings();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppSuppSettingOrBuilder
            public boolean hasConnSettings() {
                return ((AppSuppSetting) this.instance).hasConnSettings();
            }

            public Builder mergeConnSettings(AppConnSettings appConnSettings) {
                copyOnWrite();
                ((AppSuppSetting) this.instance).mergeConnSettings(appConnSettings);
                return this;
            }

            public Builder setAppPrivSetting(ByteString byteString) {
                copyOnWrite();
                ((AppSuppSetting) this.instance).setAppPrivSetting(byteString);
                return this;
            }

            public Builder setConnSettings(AppConnSettings appConnSettings) {
                copyOnWrite();
                ((AppSuppSetting) this.instance).setConnSettings(appConnSettings);
                return this;
            }

            private Builder() {
                super(AppSuppSetting.DEFAULT_INSTANCE);
            }

            public Builder setConnSettings(AppConnSettings.Builder builder) {
                copyOnWrite();
                ((AppSuppSetting) this.instance).setConnSettings(builder.build());
                return this;
            }
        }

        static {
            AppSuppSetting appSuppSetting = new AppSuppSetting();
            DEFAULT_INSTANCE = appSuppSetting;
            GeneratedMessageLite.registerDefaultInstance(AppSuppSetting.class, appSuppSetting);
        }

        private AppSuppSetting() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppPrivSetting() {
            this.appPrivSetting_ = getDefaultInstance().getAppPrivSetting();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnSettings() {
            this.connSettings_ = null;
        }

        public static AppSuppSetting getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConnSettings(AppConnSettings appConnSettings) {
            appConnSettings.getClass();
            AppConnSettings appConnSettings2 = this.connSettings_;
            if (appConnSettings2 == null || appConnSettings2 == AppConnSettings.getDefaultInstance()) {
                this.connSettings_ = appConnSettings;
            } else {
                this.connSettings_ = AppConnSettings.newBuilder(this.connSettings_).mergeFrom(appConnSettings).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppSuppSetting parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppSuppSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppSuppSetting parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppSuppSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<AppSuppSetting> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppPrivSetting(ByteString byteString) {
            byteString.getClass();
            this.appPrivSetting_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnSettings(AppConnSettings appConnSettings) {
            appConnSettings.getClass();
            this.connSettings_ = appConnSettings;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AppSuppSetting();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\t", new Object[]{"appPrivSetting_", "connSettings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<AppSuppSetting> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (AppSuppSetting.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppSuppSettingOrBuilder
        public ByteString getAppPrivSetting() {
            return this.appPrivSetting_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppSuppSettingOrBuilder
        public AppConnSettings getConnSettings() {
            AppConnSettings appConnSettings = this.connSettings_;
            return appConnSettings == null ? AppConnSettings.getDefaultInstance() : appConnSettings;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.AppSuppSettingOrBuilder
        public boolean hasConnSettings() {
            return this.connSettings_ != null;
        }

        public static Builder newBuilder(AppSuppSetting appSuppSetting) {
            return DEFAULT_INSTANCE.createBuilder(appSuppSetting);
        }

        public static AppSuppSetting parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppSuppSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppSuppSetting parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (AppSuppSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static AppSuppSetting parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppSuppSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AppSuppSetting parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (AppSuppSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static AppSuppSetting parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppSuppSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppSuppSetting parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (AppSuppSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static AppSuppSetting parseFrom(InputStream inputStream) throws IOException {
            return (AppSuppSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppSuppSetting parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (AppSuppSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static AppSuppSetting parseFrom(j jVar) throws IOException {
            return (AppSuppSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AppSuppSetting parseFrom(j jVar, t tVar) throws IOException {
            return (AppSuppSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface AppSuppSettingOrBuilder extends bsf {
        ByteString getAppPrivSetting();

        AppConnSettings getConnSettings();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        boolean hasConnSettings();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class ConnectionMsg extends GeneratedMessageLite<ConnectionMsg, Builder> implements ConnectionMsgOrBuilder {
        private static final ConnectionMsg DEFAULT_INSTANCE;
        public static final int MSG_FIELD_NUMBER = 4;
        private static volatile vkh<ConnectionMsg> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 3;
        public static final int TIMEMILLIS_FIELD_NUMBER = 2;
        public static final int VER_FIELD_NUMBER = 1;
        private long timeMillis_;
        private int ver_;
        private ByteString payload_ = ByteString.EMPTY;
        private String msg_ = "";

        public static final class Builder extends GeneratedMessageLite.a<ConnectionMsg, Builder> implements ConnectionMsgOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearMsg() {
                copyOnWrite();
                ((ConnectionMsg) this.instance).clearMsg();
                return this;
            }

            public Builder clearPayload() {
                copyOnWrite();
                ((ConnectionMsg) this.instance).clearPayload();
                return this;
            }

            public Builder clearTimeMillis() {
                copyOnWrite();
                ((ConnectionMsg) this.instance).clearTimeMillis();
                return this;
            }

            public Builder clearVer() {
                copyOnWrite();
                ((ConnectionMsg) this.instance).clearVer();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.ConnectionMsgOrBuilder
            public String getMsg() {
                return ((ConnectionMsg) this.instance).getMsg();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.ConnectionMsgOrBuilder
            public ByteString getMsgBytes() {
                return ((ConnectionMsg) this.instance).getMsgBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.ConnectionMsgOrBuilder
            public ByteString getPayload() {
                return ((ConnectionMsg) this.instance).getPayload();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.ConnectionMsgOrBuilder
            public long getTimeMillis() {
                return ((ConnectionMsg) this.instance).getTimeMillis();
            }

            @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.ConnectionMsgOrBuilder
            public int getVer() {
                return ((ConnectionMsg) this.instance).getVer();
            }

            public Builder setMsg(String str) {
                copyOnWrite();
                ((ConnectionMsg) this.instance).setMsg(str);
                return this;
            }

            public Builder setMsgBytes(ByteString byteString) {
                copyOnWrite();
                ((ConnectionMsg) this.instance).setMsgBytes(byteString);
                return this;
            }

            public Builder setPayload(ByteString byteString) {
                copyOnWrite();
                ((ConnectionMsg) this.instance).setPayload(byteString);
                return this;
            }

            public Builder setTimeMillis(long j) {
                copyOnWrite();
                ((ConnectionMsg) this.instance).setTimeMillis(j);
                return this;
            }

            public Builder setVer(int i) {
                copyOnWrite();
                ((ConnectionMsg) this.instance).setVer(i);
                return this;
            }

            private Builder() {
                super(ConnectionMsg.DEFAULT_INSTANCE);
            }
        }

        static {
            ConnectionMsg connectionMsg = new ConnectionMsg();
            DEFAULT_INSTANCE = connectionMsg;
            GeneratedMessageLite.registerDefaultInstance(ConnectionMsg.class, connectionMsg);
        }

        private ConnectionMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsg() {
            this.msg_ = getDefaultInstance().getMsg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = getDefaultInstance().getPayload();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeMillis() {
            this.timeMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVer() {
            this.ver_ = 0;
        }

        public static ConnectionMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ConnectionMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ConnectionMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConnectionMsg parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ConnectionMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<ConnectionMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsg(String str) {
            str.getClass();
            this.msg_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.msg_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayload(ByteString byteString) {
            byteString.getClass();
            this.payload_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeMillis(long j) {
            this.timeMillis_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVer(int i) {
            this.ver_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ConnectionMsg();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\n\u0004Ȉ", new Object[]{"ver_", "timeMillis_", "payload_", "msg_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<ConnectionMsg> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (ConnectionMsg.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.ConnectionMsgOrBuilder
        public String getMsg() {
            return this.msg_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.ConnectionMsgOrBuilder
        public ByteString getMsgBytes() {
            return ByteString.copyFromUtf8(this.msg_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.ConnectionMsgOrBuilder
        public ByteString getPayload() {
            return this.payload_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.ConnectionMsgOrBuilder
        public long getTimeMillis() {
            return this.timeMillis_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.ConnectionProto.ConnectionMsgOrBuilder
        public int getVer() {
            return this.ver_;
        }

        public static Builder newBuilder(ConnectionMsg connectionMsg) {
            return DEFAULT_INSTANCE.createBuilder(connectionMsg);
        }

        public static ConnectionMsg parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (ConnectionMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ConnectionMsg parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (ConnectionMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static ConnectionMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ConnectionMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ConnectionMsg parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (ConnectionMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static ConnectionMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ConnectionMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ConnectionMsg parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (ConnectionMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static ConnectionMsg parseFrom(InputStream inputStream) throws IOException {
            return (ConnectionMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConnectionMsg parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (ConnectionMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ConnectionMsg parseFrom(j jVar) throws IOException {
            return (ConnectionMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ConnectionMsg parseFrom(j jVar, t tVar) throws IOException {
            return (ConnectionMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface ConnectionMsgOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        String getMsg();

        ByteString getMsgBytes();

        ByteString getPayload();

        long getTimeMillis();

        int getVer();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private ConnectionProto() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}

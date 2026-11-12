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
public final class CloudCtrlProto {

    /* JADX INFO: renamed from: com.xiaomi.mi_connect_service.proto.CloudCtrlProto$1, reason: invalid class name */
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

    public static final class ServiceConfig extends GeneratedMessageLite<ServiceConfig, Builder> implements ServiceConfigOrBuilder {
        private static final ServiceConfig DEFAULT_INSTANCE;
        private static volatile vkh<ServiceConfig> PARSER = null;
        public static final int SERVICETYPEID_FIELD_NUMBER = 1;
        public static final int SERVICETYPE_FIELD_NUMBER = 2;
        private int serviceTypeId_;
        private String serviceType_ = "";

        public static final class Builder extends GeneratedMessageLite.a<ServiceConfig, Builder> implements ServiceConfigOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearServiceType() {
                copyOnWrite();
                ((ServiceConfig) this.instance).clearServiceType();
                return this;
            }

            public Builder clearServiceTypeId() {
                copyOnWrite();
                ((ServiceConfig) this.instance).clearServiceTypeId();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.CloudCtrlProto.ServiceConfigOrBuilder
            public String getServiceType() {
                return ((ServiceConfig) this.instance).getServiceType();
            }

            @Override // com.xiaomi.mi_connect_service.proto.CloudCtrlProto.ServiceConfigOrBuilder
            public ByteString getServiceTypeBytes() {
                return ((ServiceConfig) this.instance).getServiceTypeBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.CloudCtrlProto.ServiceConfigOrBuilder
            public int getServiceTypeId() {
                return ((ServiceConfig) this.instance).getServiceTypeId();
            }

            public Builder setServiceType(String str) {
                copyOnWrite();
                ((ServiceConfig) this.instance).setServiceType(str);
                return this;
            }

            public Builder setServiceTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((ServiceConfig) this.instance).setServiceTypeBytes(byteString);
                return this;
            }

            public Builder setServiceTypeId(int i) {
                copyOnWrite();
                ((ServiceConfig) this.instance).setServiceTypeId(i);
                return this;
            }

            private Builder() {
                super(ServiceConfig.DEFAULT_INSTANCE);
            }
        }

        static {
            ServiceConfig serviceConfig = new ServiceConfig();
            DEFAULT_INSTANCE = serviceConfig;
            GeneratedMessageLite.registerDefaultInstance(ServiceConfig.class, serviceConfig);
        }

        private ServiceConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServiceType() {
            this.serviceType_ = getDefaultInstance().getServiceType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServiceTypeId() {
            this.serviceTypeId_ = 0;
        }

        public static ServiceConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ServiceConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ServiceConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ServiceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<ServiceConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceType(String str) {
            str.getClass();
            this.serviceType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceTypeBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.serviceType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceTypeId(int i) {
            this.serviceTypeId_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ServiceConfig();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"serviceTypeId_", "serviceType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<ServiceConfig> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (ServiceConfig.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.CloudCtrlProto.ServiceConfigOrBuilder
        public String getServiceType() {
            return this.serviceType_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.CloudCtrlProto.ServiceConfigOrBuilder
        public ByteString getServiceTypeBytes() {
            return ByteString.copyFromUtf8(this.serviceType_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.CloudCtrlProto.ServiceConfigOrBuilder
        public int getServiceTypeId() {
            return this.serviceTypeId_;
        }

        public static Builder newBuilder(ServiceConfig serviceConfig) {
            return DEFAULT_INSTANCE.createBuilder(serviceConfig);
        }

        public static ServiceConfig parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (ServiceConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ServiceConfig parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (ServiceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static ServiceConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ServiceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ServiceConfig parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (ServiceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static ServiceConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ServiceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServiceConfig parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (ServiceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static ServiceConfig parseFrom(InputStream inputStream) throws IOException {
            return (ServiceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceConfig parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (ServiceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ServiceConfig parseFrom(j jVar) throws IOException {
            return (ServiceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ServiceConfig parseFrom(j jVar, t tVar) throws IOException {
            return (ServiceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface ServiceConfigOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        String getServiceType();

        ByteString getServiceTypeBytes();

        int getServiceTypeId();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class ServiceConfigs extends GeneratedMessageLite<ServiceConfigs, Builder> implements ServiceConfigsOrBuilder {
        private static final ServiceConfigs DEFAULT_INSTANCE;
        private static volatile vkh<ServiceConfigs> PARSER = null;
        public static final int SERVICECONFIG_FIELD_NUMBER = 1;
        private d0.i<ServiceConfig> serviceConfig_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.a<ServiceConfigs, Builder> implements ServiceConfigsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllServiceConfig(Iterable<? extends ServiceConfig> iterable) {
                copyOnWrite();
                ((ServiceConfigs) this.instance).addAllServiceConfig(iterable);
                return this;
            }

            public Builder addServiceConfig(ServiceConfig serviceConfig) {
                copyOnWrite();
                ((ServiceConfigs) this.instance).addServiceConfig(serviceConfig);
                return this;
            }

            public Builder clearServiceConfig() {
                copyOnWrite();
                ((ServiceConfigs) this.instance).clearServiceConfig();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.CloudCtrlProto.ServiceConfigsOrBuilder
            public ServiceConfig getServiceConfig(int i) {
                return ((ServiceConfigs) this.instance).getServiceConfig(i);
            }

            @Override // com.xiaomi.mi_connect_service.proto.CloudCtrlProto.ServiceConfigsOrBuilder
            public int getServiceConfigCount() {
                return ((ServiceConfigs) this.instance).getServiceConfigCount();
            }

            @Override // com.xiaomi.mi_connect_service.proto.CloudCtrlProto.ServiceConfigsOrBuilder
            public List<ServiceConfig> getServiceConfigList() {
                return Collections.unmodifiableList(((ServiceConfigs) this.instance).getServiceConfigList());
            }

            public Builder removeServiceConfig(int i) {
                copyOnWrite();
                ((ServiceConfigs) this.instance).removeServiceConfig(i);
                return this;
            }

            public Builder setServiceConfig(int i, ServiceConfig serviceConfig) {
                copyOnWrite();
                ((ServiceConfigs) this.instance).setServiceConfig(i, serviceConfig);
                return this;
            }

            private Builder() {
                super(ServiceConfigs.DEFAULT_INSTANCE);
            }

            public Builder addServiceConfig(int i, ServiceConfig serviceConfig) {
                copyOnWrite();
                ((ServiceConfigs) this.instance).addServiceConfig(i, serviceConfig);
                return this;
            }

            public Builder setServiceConfig(int i, ServiceConfig.Builder builder) {
                copyOnWrite();
                ((ServiceConfigs) this.instance).setServiceConfig(i, builder.build());
                return this;
            }

            public Builder addServiceConfig(ServiceConfig.Builder builder) {
                copyOnWrite();
                ((ServiceConfigs) this.instance).addServiceConfig(builder.build());
                return this;
            }

            public Builder addServiceConfig(int i, ServiceConfig.Builder builder) {
                copyOnWrite();
                ((ServiceConfigs) this.instance).addServiceConfig(i, builder.build());
                return this;
            }
        }

        static {
            ServiceConfigs serviceConfigs = new ServiceConfigs();
            DEFAULT_INSTANCE = serviceConfigs;
            GeneratedMessageLite.registerDefaultInstance(ServiceConfigs.class, serviceConfigs);
        }

        private ServiceConfigs() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllServiceConfig(Iterable<? extends ServiceConfig> iterable) {
            ensureServiceConfigIsMutable();
            b.addAll((Iterable) iterable, (List) this.serviceConfig_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addServiceConfig(ServiceConfig serviceConfig) {
            serviceConfig.getClass();
            ensureServiceConfigIsMutable();
            this.serviceConfig_.add(serviceConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServiceConfig() {
            this.serviceConfig_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureServiceConfigIsMutable() {
            d0.i<ServiceConfig> iVar = this.serviceConfig_;
            if (iVar.c()) {
                return;
            }
            this.serviceConfig_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        public static ServiceConfigs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ServiceConfigs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ServiceConfigs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceConfigs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ServiceConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<ServiceConfigs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeServiceConfig(int i) {
            ensureServiceConfigIsMutable();
            this.serviceConfig_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceConfig(int i, ServiceConfig serviceConfig) {
            serviceConfig.getClass();
            ensureServiceConfigIsMutable();
            this.serviceConfig_.set(i, serviceConfig);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ServiceConfigs();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"serviceConfig_", ServiceConfig.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<ServiceConfigs> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (ServiceConfigs.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.CloudCtrlProto.ServiceConfigsOrBuilder
        public ServiceConfig getServiceConfig(int i) {
            return this.serviceConfig_.get(i);
        }

        @Override // com.xiaomi.mi_connect_service.proto.CloudCtrlProto.ServiceConfigsOrBuilder
        public int getServiceConfigCount() {
            return this.serviceConfig_.size();
        }

        @Override // com.xiaomi.mi_connect_service.proto.CloudCtrlProto.ServiceConfigsOrBuilder
        public List<ServiceConfig> getServiceConfigList() {
            return this.serviceConfig_;
        }

        public ServiceConfigOrBuilder getServiceConfigOrBuilder(int i) {
            return this.serviceConfig_.get(i);
        }

        public List<? extends ServiceConfigOrBuilder> getServiceConfigOrBuilderList() {
            return this.serviceConfig_;
        }

        public static Builder newBuilder(ServiceConfigs serviceConfigs) {
            return DEFAULT_INSTANCE.createBuilder(serviceConfigs);
        }

        public static ServiceConfigs parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (ServiceConfigs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ServiceConfigs parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (ServiceConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static ServiceConfigs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ServiceConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addServiceConfig(int i, ServiceConfig serviceConfig) {
            serviceConfig.getClass();
            ensureServiceConfigIsMutable();
            this.serviceConfig_.add(i, serviceConfig);
        }

        public static ServiceConfigs parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (ServiceConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static ServiceConfigs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ServiceConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServiceConfigs parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (ServiceConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static ServiceConfigs parseFrom(InputStream inputStream) throws IOException {
            return (ServiceConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceConfigs parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (ServiceConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ServiceConfigs parseFrom(j jVar) throws IOException {
            return (ServiceConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ServiceConfigs parseFrom(j jVar, t tVar) throws IOException {
            return (ServiceConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface ServiceConfigsOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        ServiceConfig getServiceConfig(int i);

        int getServiceConfigCount();

        List<ServiceConfig> getServiceConfigList();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private CloudCtrlProto() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}

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
public final class IDMSecurityManagerProto {

    /* JADX INFO: renamed from: com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto$1, reason: invalid class name */
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

    public static final class checkPermissionByBlockListParam extends GeneratedMessageLite<checkPermissionByBlockListParam, Builder> implements checkPermissionByBlockListParamOrBuilder {
        public static final int CLIENTID_FIELD_NUMBER = 3;
        public static final int COMMTYPE_FIELD_NUMBER = 5;
        private static final checkPermissionByBlockListParam DEFAULT_INSTANCE;
        public static final int DISCTYPE_FIELD_NUMBER = 6;
        public static final int INTERFACENAME_FIELD_NUMBER = 4;
        public static final int ISDISCTYPEREQUIRED_FIELD_NUMBER = 8;
        private static volatile vkh<checkPermissionByBlockListParam> PARSER = null;
        public static final int PID_FIELD_NUMBER = 1;
        public static final int SERVICETYPES_FIELD_NUMBER = 7;
        public static final int UID_FIELD_NUMBER = 2;
        private int commType_;
        private int discType_;
        private boolean isDiscTypeRequired_;
        private int pid_;
        private int uid_;
        private String clientId_ = "";
        private String interfaceName_ = "";
        private d0.i<String> serviceTypes_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.a<checkPermissionByBlockListParam, Builder> implements checkPermissionByBlockListParamOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllServiceTypes(Iterable<String> iterable) {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).addAllServiceTypes(iterable);
                return this;
            }

            public Builder addServiceTypes(String str) {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).addServiceTypes(str);
                return this;
            }

            public Builder addServiceTypesBytes(ByteString byteString) {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).addServiceTypesBytes(byteString);
                return this;
            }

            public Builder clearClientId() {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).clearClientId();
                return this;
            }

            public Builder clearCommType() {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).clearCommType();
                return this;
            }

            public Builder clearDiscType() {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).clearDiscType();
                return this;
            }

            public Builder clearInterfaceName() {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).clearInterfaceName();
                return this;
            }

            public Builder clearIsDiscTypeRequired() {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).clearIsDiscTypeRequired();
                return this;
            }

            public Builder clearPid() {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).clearPid();
                return this;
            }

            public Builder clearServiceTypes() {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).clearServiceTypes();
                return this;
            }

            public Builder clearUid() {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).clearUid();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
            public String getClientId() {
                return ((checkPermissionByBlockListParam) this.instance).getClientId();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
            public ByteString getClientIdBytes() {
                return ((checkPermissionByBlockListParam) this.instance).getClientIdBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
            public int getCommType() {
                return ((checkPermissionByBlockListParam) this.instance).getCommType();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
            public int getDiscType() {
                return ((checkPermissionByBlockListParam) this.instance).getDiscType();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
            public String getInterfaceName() {
                return ((checkPermissionByBlockListParam) this.instance).getInterfaceName();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
            public ByteString getInterfaceNameBytes() {
                return ((checkPermissionByBlockListParam) this.instance).getInterfaceNameBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
            public boolean getIsDiscTypeRequired() {
                return ((checkPermissionByBlockListParam) this.instance).getIsDiscTypeRequired();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
            public int getPid() {
                return ((checkPermissionByBlockListParam) this.instance).getPid();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
            public String getServiceTypes(int i) {
                return ((checkPermissionByBlockListParam) this.instance).getServiceTypes(i);
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
            public ByteString getServiceTypesBytes(int i) {
                return ((checkPermissionByBlockListParam) this.instance).getServiceTypesBytes(i);
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
            public int getServiceTypesCount() {
                return ((checkPermissionByBlockListParam) this.instance).getServiceTypesCount();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
            public List<String> getServiceTypesList() {
                return Collections.unmodifiableList(((checkPermissionByBlockListParam) this.instance).getServiceTypesList());
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
            public int getUid() {
                return ((checkPermissionByBlockListParam) this.instance).getUid();
            }

            public Builder setClientId(String str) {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).setClientId(str);
                return this;
            }

            public Builder setClientIdBytes(ByteString byteString) {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).setClientIdBytes(byteString);
                return this;
            }

            public Builder setCommType(int i) {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).setCommType(i);
                return this;
            }

            public Builder setDiscType(int i) {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).setDiscType(i);
                return this;
            }

            public Builder setInterfaceName(String str) {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).setInterfaceName(str);
                return this;
            }

            public Builder setInterfaceNameBytes(ByteString byteString) {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).setInterfaceNameBytes(byteString);
                return this;
            }

            public Builder setIsDiscTypeRequired(boolean z) {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).setIsDiscTypeRequired(z);
                return this;
            }

            public Builder setPid(int i) {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).setPid(i);
                return this;
            }

            public Builder setServiceTypes(int i, String str) {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).setServiceTypes(i, str);
                return this;
            }

            public Builder setUid(int i) {
                copyOnWrite();
                ((checkPermissionByBlockListParam) this.instance).setUid(i);
                return this;
            }

            private Builder() {
                super(checkPermissionByBlockListParam.DEFAULT_INSTANCE);
            }
        }

        static {
            checkPermissionByBlockListParam checkpermissionbyblocklistparam = new checkPermissionByBlockListParam();
            DEFAULT_INSTANCE = checkpermissionbyblocklistparam;
            GeneratedMessageLite.registerDefaultInstance(checkPermissionByBlockListParam.class, checkpermissionbyblocklistparam);
        }

        private checkPermissionByBlockListParam() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllServiceTypes(Iterable<String> iterable) {
            ensureServiceTypesIsMutable();
            b.addAll((Iterable) iterable, (List) this.serviceTypes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addServiceTypes(String str) {
            str.getClass();
            ensureServiceTypesIsMutable();
            this.serviceTypes_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addServiceTypesBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            ensureServiceTypesIsMutable();
            this.serviceTypes_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientId() {
            this.clientId_ = getDefaultInstance().getClientId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCommType() {
            this.commType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDiscType() {
            this.discType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInterfaceName() {
            this.interfaceName_ = getDefaultInstance().getInterfaceName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsDiscTypeRequired() {
            this.isDiscTypeRequired_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPid() {
            this.pid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServiceTypes() {
            this.serviceTypes_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUid() {
            this.uid_ = 0;
        }

        private void ensureServiceTypesIsMutable() {
            d0.i<String> iVar = this.serviceTypes_;
            if (iVar.c()) {
                return;
            }
            this.serviceTypes_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        public static checkPermissionByBlockListParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static checkPermissionByBlockListParam parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (checkPermissionByBlockListParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static checkPermissionByBlockListParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (checkPermissionByBlockListParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<checkPermissionByBlockListParam> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientId(String str) {
            str.getClass();
            this.clientId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientIdBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.clientId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommType(int i) {
            this.commType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDiscType(int i) {
            this.discType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInterfaceName(String str) {
            str.getClass();
            this.interfaceName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInterfaceNameBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.interfaceName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsDiscTypeRequired(boolean z) {
            this.isDiscTypeRequired_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPid(int i) {
            this.pid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceTypes(int i, String str) {
            str.getClass();
            ensureServiceTypesIsMutable();
            this.serviceTypes_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUid(int i) {
            this.uid_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new checkPermissionByBlockListParam();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006\u0004\u0007Ț\b\u0007", new Object[]{"pid_", "uid_", "clientId_", "interfaceName_", "commType_", "discType_", "serviceTypes_", "isDiscTypeRequired_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<checkPermissionByBlockListParam> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (checkPermissionByBlockListParam.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
        public String getClientId() {
            return this.clientId_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
        public ByteString getClientIdBytes() {
            return ByteString.copyFromUtf8(this.clientId_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
        public int getCommType() {
            return this.commType_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
        public int getDiscType() {
            return this.discType_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
        public String getInterfaceName() {
            return this.interfaceName_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
        public ByteString getInterfaceNameBytes() {
            return ByteString.copyFromUtf8(this.interfaceName_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
        public boolean getIsDiscTypeRequired() {
            return this.isDiscTypeRequired_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
        public int getPid() {
            return this.pid_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
        public String getServiceTypes(int i) {
            return this.serviceTypes_.get(i);
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
        public ByteString getServiceTypesBytes(int i) {
            return ByteString.copyFromUtf8(this.serviceTypes_.get(i));
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
        public int getServiceTypesCount() {
            return this.serviceTypes_.size();
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
        public List<String> getServiceTypesList() {
            return this.serviceTypes_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListParamOrBuilder
        public int getUid() {
            return this.uid_;
        }

        public static Builder newBuilder(checkPermissionByBlockListParam checkpermissionbyblocklistparam) {
            return DEFAULT_INSTANCE.createBuilder(checkpermissionbyblocklistparam);
        }

        public static checkPermissionByBlockListParam parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (checkPermissionByBlockListParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static checkPermissionByBlockListParam parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (checkPermissionByBlockListParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static checkPermissionByBlockListParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (checkPermissionByBlockListParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static checkPermissionByBlockListParam parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (checkPermissionByBlockListParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static checkPermissionByBlockListParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (checkPermissionByBlockListParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static checkPermissionByBlockListParam parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (checkPermissionByBlockListParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static checkPermissionByBlockListParam parseFrom(InputStream inputStream) throws IOException {
            return (checkPermissionByBlockListParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static checkPermissionByBlockListParam parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (checkPermissionByBlockListParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static checkPermissionByBlockListParam parseFrom(j jVar) throws IOException {
            return (checkPermissionByBlockListParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static checkPermissionByBlockListParam parseFrom(j jVar, t tVar) throws IOException {
            return (checkPermissionByBlockListParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface checkPermissionByBlockListParamOrBuilder extends bsf {
        String getClientId();

        ByteString getClientIdBytes();

        int getCommType();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDiscType();

        String getInterfaceName();

        ByteString getInterfaceNameBytes();

        boolean getIsDiscTypeRequired();

        int getPid();

        String getServiceTypes(int i);

        ByteString getServiceTypesBytes(int i);

        int getServiceTypesCount();

        List<String> getServiceTypesList();

        int getUid();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class checkPermissionByBlockListResult extends GeneratedMessageLite<checkPermissionByBlockListResult, Builder> implements checkPermissionByBlockListResultOrBuilder {
        public static final int COMMTYPE_FIELD_NUMBER = 1;
        private static final checkPermissionByBlockListResult DEFAULT_INSTANCE;
        public static final int DISCTYPE_FIELD_NUMBER = 2;
        public static final int ISBLOCK_FIELD_NUMBER = 4;
        private static volatile vkh<checkPermissionByBlockListResult> PARSER = null;
        public static final int SERVICETYPES_FIELD_NUMBER = 3;
        private int commType_;
        private int discType_;
        private boolean isBlock_;
        private d0.i<String> serviceTypes_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.a<checkPermissionByBlockListResult, Builder> implements checkPermissionByBlockListResultOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllServiceTypes(Iterable<String> iterable) {
                copyOnWrite();
                ((checkPermissionByBlockListResult) this.instance).addAllServiceTypes(iterable);
                return this;
            }

            public Builder addServiceTypes(String str) {
                copyOnWrite();
                ((checkPermissionByBlockListResult) this.instance).addServiceTypes(str);
                return this;
            }

            public Builder addServiceTypesBytes(ByteString byteString) {
                copyOnWrite();
                ((checkPermissionByBlockListResult) this.instance).addServiceTypesBytes(byteString);
                return this;
            }

            public Builder clearCommType() {
                copyOnWrite();
                ((checkPermissionByBlockListResult) this.instance).clearCommType();
                return this;
            }

            public Builder clearDiscType() {
                copyOnWrite();
                ((checkPermissionByBlockListResult) this.instance).clearDiscType();
                return this;
            }

            public Builder clearIsBlock() {
                copyOnWrite();
                ((checkPermissionByBlockListResult) this.instance).clearIsBlock();
                return this;
            }

            public Builder clearServiceTypes() {
                copyOnWrite();
                ((checkPermissionByBlockListResult) this.instance).clearServiceTypes();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListResultOrBuilder
            public int getCommType() {
                return ((checkPermissionByBlockListResult) this.instance).getCommType();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListResultOrBuilder
            public int getDiscType() {
                return ((checkPermissionByBlockListResult) this.instance).getDiscType();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListResultOrBuilder
            public boolean getIsBlock() {
                return ((checkPermissionByBlockListResult) this.instance).getIsBlock();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListResultOrBuilder
            public String getServiceTypes(int i) {
                return ((checkPermissionByBlockListResult) this.instance).getServiceTypes(i);
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListResultOrBuilder
            public ByteString getServiceTypesBytes(int i) {
                return ((checkPermissionByBlockListResult) this.instance).getServiceTypesBytes(i);
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListResultOrBuilder
            public int getServiceTypesCount() {
                return ((checkPermissionByBlockListResult) this.instance).getServiceTypesCount();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListResultOrBuilder
            public List<String> getServiceTypesList() {
                return Collections.unmodifiableList(((checkPermissionByBlockListResult) this.instance).getServiceTypesList());
            }

            public Builder setCommType(int i) {
                copyOnWrite();
                ((checkPermissionByBlockListResult) this.instance).setCommType(i);
                return this;
            }

            public Builder setDiscType(int i) {
                copyOnWrite();
                ((checkPermissionByBlockListResult) this.instance).setDiscType(i);
                return this;
            }

            public Builder setIsBlock(boolean z) {
                copyOnWrite();
                ((checkPermissionByBlockListResult) this.instance).setIsBlock(z);
                return this;
            }

            public Builder setServiceTypes(int i, String str) {
                copyOnWrite();
                ((checkPermissionByBlockListResult) this.instance).setServiceTypes(i, str);
                return this;
            }

            private Builder() {
                super(checkPermissionByBlockListResult.DEFAULT_INSTANCE);
            }
        }

        static {
            checkPermissionByBlockListResult checkpermissionbyblocklistresult = new checkPermissionByBlockListResult();
            DEFAULT_INSTANCE = checkpermissionbyblocklistresult;
            GeneratedMessageLite.registerDefaultInstance(checkPermissionByBlockListResult.class, checkpermissionbyblocklistresult);
        }

        private checkPermissionByBlockListResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllServiceTypes(Iterable<String> iterable) {
            ensureServiceTypesIsMutable();
            b.addAll((Iterable) iterable, (List) this.serviceTypes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addServiceTypes(String str) {
            str.getClass();
            ensureServiceTypesIsMutable();
            this.serviceTypes_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addServiceTypesBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            ensureServiceTypesIsMutable();
            this.serviceTypes_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCommType() {
            this.commType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDiscType() {
            this.discType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsBlock() {
            this.isBlock_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServiceTypes() {
            this.serviceTypes_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureServiceTypesIsMutable() {
            d0.i<String> iVar = this.serviceTypes_;
            if (iVar.c()) {
                return;
            }
            this.serviceTypes_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        public static checkPermissionByBlockListResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static checkPermissionByBlockListResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (checkPermissionByBlockListResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static checkPermissionByBlockListResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (checkPermissionByBlockListResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<checkPermissionByBlockListResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommType(int i) {
            this.commType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDiscType(int i) {
            this.discType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsBlock(boolean z) {
            this.isBlock_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceTypes(int i, String str) {
            str.getClass();
            ensureServiceTypesIsMutable();
            this.serviceTypes_.set(i, str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new checkPermissionByBlockListResult();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003Ț\u0004\u0007", new Object[]{"commType_", "discType_", "serviceTypes_", "isBlock_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<checkPermissionByBlockListResult> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (checkPermissionByBlockListResult.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListResultOrBuilder
        public int getCommType() {
            return this.commType_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListResultOrBuilder
        public int getDiscType() {
            return this.discType_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListResultOrBuilder
        public boolean getIsBlock() {
            return this.isBlock_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListResultOrBuilder
        public String getServiceTypes(int i) {
            return this.serviceTypes_.get(i);
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListResultOrBuilder
        public ByteString getServiceTypesBytes(int i) {
            return ByteString.copyFromUtf8(this.serviceTypes_.get(i));
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListResultOrBuilder
        public int getServiceTypesCount() {
            return this.serviceTypes_.size();
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPermissionByBlockListResultOrBuilder
        public List<String> getServiceTypesList() {
            return this.serviceTypes_;
        }

        public static Builder newBuilder(checkPermissionByBlockListResult checkpermissionbyblocklistresult) {
            return DEFAULT_INSTANCE.createBuilder(checkpermissionbyblocklistresult);
        }

        public static checkPermissionByBlockListResult parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (checkPermissionByBlockListResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static checkPermissionByBlockListResult parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (checkPermissionByBlockListResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static checkPermissionByBlockListResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (checkPermissionByBlockListResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static checkPermissionByBlockListResult parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (checkPermissionByBlockListResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static checkPermissionByBlockListResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (checkPermissionByBlockListResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static checkPermissionByBlockListResult parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (checkPermissionByBlockListResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static checkPermissionByBlockListResult parseFrom(InputStream inputStream) throws IOException {
            return (checkPermissionByBlockListResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static checkPermissionByBlockListResult parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (checkPermissionByBlockListResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static checkPermissionByBlockListResult parseFrom(j jVar) throws IOException {
            return (checkPermissionByBlockListResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static checkPermissionByBlockListResult parseFrom(j jVar, t tVar) throws IOException {
            return (checkPermissionByBlockListResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface checkPermissionByBlockListResultOrBuilder extends bsf {
        int getCommType();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDiscType();

        boolean getIsBlock();

        String getServiceTypes(int i);

        ByteString getServiceTypesBytes(int i);

        int getServiceTypesCount();

        List<String> getServiceTypesList();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class checkPkgSignatureParam extends GeneratedMessageLite<checkPkgSignatureParam, Builder> implements checkPkgSignatureParamOrBuilder {
        private static final checkPkgSignatureParam DEFAULT_INSTANCE;
        private static volatile vkh<checkPkgSignatureParam> PARSER = null;
        public static final int PID_FIELD_NUMBER = 1;
        public static final int UID_FIELD_NUMBER = 2;
        private int pid_;
        private int uid_;

        public static final class Builder extends GeneratedMessageLite.a<checkPkgSignatureParam, Builder> implements checkPkgSignatureParamOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearPid() {
                copyOnWrite();
                ((checkPkgSignatureParam) this.instance).clearPid();
                return this;
            }

            public Builder clearUid() {
                copyOnWrite();
                ((checkPkgSignatureParam) this.instance).clearUid();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPkgSignatureParamOrBuilder
            public int getPid() {
                return ((checkPkgSignatureParam) this.instance).getPid();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPkgSignatureParamOrBuilder
            public int getUid() {
                return ((checkPkgSignatureParam) this.instance).getUid();
            }

            public Builder setPid(int i) {
                copyOnWrite();
                ((checkPkgSignatureParam) this.instance).setPid(i);
                return this;
            }

            public Builder setUid(int i) {
                copyOnWrite();
                ((checkPkgSignatureParam) this.instance).setUid(i);
                return this;
            }

            private Builder() {
                super(checkPkgSignatureParam.DEFAULT_INSTANCE);
            }
        }

        static {
            checkPkgSignatureParam checkpkgsignatureparam = new checkPkgSignatureParam();
            DEFAULT_INSTANCE = checkpkgsignatureparam;
            GeneratedMessageLite.registerDefaultInstance(checkPkgSignatureParam.class, checkpkgsignatureparam);
        }

        private checkPkgSignatureParam() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPid() {
            this.pid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUid() {
            this.uid_ = 0;
        }

        public static checkPkgSignatureParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static checkPkgSignatureParam parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (checkPkgSignatureParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static checkPkgSignatureParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (checkPkgSignatureParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<checkPkgSignatureParam> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPid(int i) {
            this.pid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUid(int i) {
            this.uid_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new checkPkgSignatureParam();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"pid_", "uid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<checkPkgSignatureParam> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (checkPkgSignatureParam.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPkgSignatureParamOrBuilder
        public int getPid() {
            return this.pid_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkPkgSignatureParamOrBuilder
        public int getUid() {
            return this.uid_;
        }

        public static Builder newBuilder(checkPkgSignatureParam checkpkgsignatureparam) {
            return DEFAULT_INSTANCE.createBuilder(checkpkgsignatureparam);
        }

        public static checkPkgSignatureParam parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (checkPkgSignatureParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static checkPkgSignatureParam parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (checkPkgSignatureParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static checkPkgSignatureParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (checkPkgSignatureParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static checkPkgSignatureParam parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (checkPkgSignatureParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static checkPkgSignatureParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (checkPkgSignatureParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static checkPkgSignatureParam parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (checkPkgSignatureParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static checkPkgSignatureParam parseFrom(InputStream inputStream) throws IOException {
            return (checkPkgSignatureParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static checkPkgSignatureParam parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (checkPkgSignatureParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static checkPkgSignatureParam parseFrom(j jVar) throws IOException {
            return (checkPkgSignatureParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static checkPkgSignatureParam parseFrom(j jVar, t tVar) throws IOException {
            return (checkPkgSignatureParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface checkPkgSignatureParamOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getPid();

        int getUid();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class checkRegisterClientIdParam extends GeneratedMessageLite<checkRegisterClientIdParam, Builder> implements checkRegisterClientIdParamOrBuilder {
        public static final int CLIENTID_FIELD_NUMBER = 3;
        private static final checkRegisterClientIdParam DEFAULT_INSTANCE;
        private static volatile vkh<checkRegisterClientIdParam> PARSER = null;
        public static final int PID_FIELD_NUMBER = 1;
        public static final int UID_FIELD_NUMBER = 2;
        private String clientId_ = "";
        private int pid_;
        private int uid_;

        public static final class Builder extends GeneratedMessageLite.a<checkRegisterClientIdParam, Builder> implements checkRegisterClientIdParamOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearClientId() {
                copyOnWrite();
                ((checkRegisterClientIdParam) this.instance).clearClientId();
                return this;
            }

            public Builder clearPid() {
                copyOnWrite();
                ((checkRegisterClientIdParam) this.instance).clearPid();
                return this;
            }

            public Builder clearUid() {
                copyOnWrite();
                ((checkRegisterClientIdParam) this.instance).clearUid();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkRegisterClientIdParamOrBuilder
            public String getClientId() {
                return ((checkRegisterClientIdParam) this.instance).getClientId();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkRegisterClientIdParamOrBuilder
            public ByteString getClientIdBytes() {
                return ((checkRegisterClientIdParam) this.instance).getClientIdBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkRegisterClientIdParamOrBuilder
            public int getPid() {
                return ((checkRegisterClientIdParam) this.instance).getPid();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkRegisterClientIdParamOrBuilder
            public int getUid() {
                return ((checkRegisterClientIdParam) this.instance).getUid();
            }

            public Builder setClientId(String str) {
                copyOnWrite();
                ((checkRegisterClientIdParam) this.instance).setClientId(str);
                return this;
            }

            public Builder setClientIdBytes(ByteString byteString) {
                copyOnWrite();
                ((checkRegisterClientIdParam) this.instance).setClientIdBytes(byteString);
                return this;
            }

            public Builder setPid(int i) {
                copyOnWrite();
                ((checkRegisterClientIdParam) this.instance).setPid(i);
                return this;
            }

            public Builder setUid(int i) {
                copyOnWrite();
                ((checkRegisterClientIdParam) this.instance).setUid(i);
                return this;
            }

            private Builder() {
                super(checkRegisterClientIdParam.DEFAULT_INSTANCE);
            }
        }

        static {
            checkRegisterClientIdParam checkregisterclientidparam = new checkRegisterClientIdParam();
            DEFAULT_INSTANCE = checkregisterclientidparam;
            GeneratedMessageLite.registerDefaultInstance(checkRegisterClientIdParam.class, checkregisterclientidparam);
        }

        private checkRegisterClientIdParam() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientId() {
            this.clientId_ = getDefaultInstance().getClientId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPid() {
            this.pid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUid() {
            this.uid_ = 0;
        }

        public static checkRegisterClientIdParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static checkRegisterClientIdParam parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (checkRegisterClientIdParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static checkRegisterClientIdParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (checkRegisterClientIdParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<checkRegisterClientIdParam> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientId(String str) {
            str.getClass();
            this.clientId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientIdBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.clientId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPid(int i) {
            this.pid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUid(int i) {
            this.uid_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new checkRegisterClientIdParam();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003Ȉ", new Object[]{"pid_", "uid_", "clientId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<checkRegisterClientIdParam> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (checkRegisterClientIdParam.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkRegisterClientIdParamOrBuilder
        public String getClientId() {
            return this.clientId_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkRegisterClientIdParamOrBuilder
        public ByteString getClientIdBytes() {
            return ByteString.copyFromUtf8(this.clientId_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkRegisterClientIdParamOrBuilder
        public int getPid() {
            return this.pid_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkRegisterClientIdParamOrBuilder
        public int getUid() {
            return this.uid_;
        }

        public static Builder newBuilder(checkRegisterClientIdParam checkregisterclientidparam) {
            return DEFAULT_INSTANCE.createBuilder(checkregisterclientidparam);
        }

        public static checkRegisterClientIdParam parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (checkRegisterClientIdParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static checkRegisterClientIdParam parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (checkRegisterClientIdParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static checkRegisterClientIdParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (checkRegisterClientIdParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static checkRegisterClientIdParam parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (checkRegisterClientIdParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static checkRegisterClientIdParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (checkRegisterClientIdParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static checkRegisterClientIdParam parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (checkRegisterClientIdParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static checkRegisterClientIdParam parseFrom(InputStream inputStream) throws IOException {
            return (checkRegisterClientIdParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static checkRegisterClientIdParam parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (checkRegisterClientIdParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static checkRegisterClientIdParam parseFrom(j jVar) throws IOException {
            return (checkRegisterClientIdParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static checkRegisterClientIdParam parseFrom(j jVar, t tVar) throws IOException {
            return (checkRegisterClientIdParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface checkRegisterClientIdParamOrBuilder extends bsf {
        String getClientId();

        ByteString getClientIdBytes();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getPid();

        int getUid();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class checkServiceFindableParam extends GeneratedMessageLite<checkServiceFindableParam, Builder> implements checkServiceFindableParamOrBuilder {
        public static final int CLIENTID_FIELD_NUMBER = 3;
        private static final checkServiceFindableParam DEFAULT_INSTANCE;
        private static volatile vkh<checkServiceFindableParam> PARSER = null;
        public static final int PID_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 4;
        public static final int UID_FIELD_NUMBER = 2;
        private int pid_;
        private int uid_;
        private String clientId_ = "";
        private d0.i<String> type_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.a<checkServiceFindableParam, Builder> implements checkServiceFindableParamOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllType(Iterable<String> iterable) {
                copyOnWrite();
                ((checkServiceFindableParam) this.instance).addAllType(iterable);
                return this;
            }

            public Builder addType(String str) {
                copyOnWrite();
                ((checkServiceFindableParam) this.instance).addType(str);
                return this;
            }

            public Builder addTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((checkServiceFindableParam) this.instance).addTypeBytes(byteString);
                return this;
            }

            public Builder clearClientId() {
                copyOnWrite();
                ((checkServiceFindableParam) this.instance).clearClientId();
                return this;
            }

            public Builder clearPid() {
                copyOnWrite();
                ((checkServiceFindableParam) this.instance).clearPid();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((checkServiceFindableParam) this.instance).clearType();
                return this;
            }

            public Builder clearUid() {
                copyOnWrite();
                ((checkServiceFindableParam) this.instance).clearUid();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceFindableParamOrBuilder
            public String getClientId() {
                return ((checkServiceFindableParam) this.instance).getClientId();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceFindableParamOrBuilder
            public ByteString getClientIdBytes() {
                return ((checkServiceFindableParam) this.instance).getClientIdBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceFindableParamOrBuilder
            public int getPid() {
                return ((checkServiceFindableParam) this.instance).getPid();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceFindableParamOrBuilder
            public String getType(int i) {
                return ((checkServiceFindableParam) this.instance).getType(i);
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceFindableParamOrBuilder
            public ByteString getTypeBytes(int i) {
                return ((checkServiceFindableParam) this.instance).getTypeBytes(i);
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceFindableParamOrBuilder
            public int getTypeCount() {
                return ((checkServiceFindableParam) this.instance).getTypeCount();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceFindableParamOrBuilder
            public List<String> getTypeList() {
                return Collections.unmodifiableList(((checkServiceFindableParam) this.instance).getTypeList());
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceFindableParamOrBuilder
            public int getUid() {
                return ((checkServiceFindableParam) this.instance).getUid();
            }

            public Builder setClientId(String str) {
                copyOnWrite();
                ((checkServiceFindableParam) this.instance).setClientId(str);
                return this;
            }

            public Builder setClientIdBytes(ByteString byteString) {
                copyOnWrite();
                ((checkServiceFindableParam) this.instance).setClientIdBytes(byteString);
                return this;
            }

            public Builder setPid(int i) {
                copyOnWrite();
                ((checkServiceFindableParam) this.instance).setPid(i);
                return this;
            }

            public Builder setType(int i, String str) {
                copyOnWrite();
                ((checkServiceFindableParam) this.instance).setType(i, str);
                return this;
            }

            public Builder setUid(int i) {
                copyOnWrite();
                ((checkServiceFindableParam) this.instance).setUid(i);
                return this;
            }

            private Builder() {
                super(checkServiceFindableParam.DEFAULT_INSTANCE);
            }
        }

        static {
            checkServiceFindableParam checkservicefindableparam = new checkServiceFindableParam();
            DEFAULT_INSTANCE = checkservicefindableparam;
            GeneratedMessageLite.registerDefaultInstance(checkServiceFindableParam.class, checkservicefindableparam);
        }

        private checkServiceFindableParam() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllType(Iterable<String> iterable) {
            ensureTypeIsMutable();
            b.addAll((Iterable) iterable, (List) this.type_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addType(String str) {
            str.getClass();
            ensureTypeIsMutable();
            this.type_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTypeBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            ensureTypeIsMutable();
            this.type_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientId() {
            this.clientId_ = getDefaultInstance().getClientId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPid() {
            this.pid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUid() {
            this.uid_ = 0;
        }

        private void ensureTypeIsMutable() {
            d0.i<String> iVar = this.type_;
            if (iVar.c()) {
                return;
            }
            this.type_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        public static checkServiceFindableParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static checkServiceFindableParam parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (checkServiceFindableParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static checkServiceFindableParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (checkServiceFindableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<checkServiceFindableParam> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientId(String str) {
            str.getClass();
            this.clientId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientIdBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.clientId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPid(int i) {
            this.pid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i, String str) {
            str.getClass();
            ensureTypeIsMutable();
            this.type_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUid(int i) {
            this.uid_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new checkServiceFindableParam();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003Ȉ\u0004Ț", new Object[]{"pid_", "uid_", "clientId_", "type_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<checkServiceFindableParam> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (checkServiceFindableParam.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceFindableParamOrBuilder
        public String getClientId() {
            return this.clientId_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceFindableParamOrBuilder
        public ByteString getClientIdBytes() {
            return ByteString.copyFromUtf8(this.clientId_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceFindableParamOrBuilder
        public int getPid() {
            return this.pid_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceFindableParamOrBuilder
        public String getType(int i) {
            return this.type_.get(i);
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceFindableParamOrBuilder
        public ByteString getTypeBytes(int i) {
            return ByteString.copyFromUtf8(this.type_.get(i));
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceFindableParamOrBuilder
        public int getTypeCount() {
            return this.type_.size();
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceFindableParamOrBuilder
        public List<String> getTypeList() {
            return this.type_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceFindableParamOrBuilder
        public int getUid() {
            return this.uid_;
        }

        public static Builder newBuilder(checkServiceFindableParam checkservicefindableparam) {
            return DEFAULT_INSTANCE.createBuilder(checkservicefindableparam);
        }

        public static checkServiceFindableParam parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (checkServiceFindableParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static checkServiceFindableParam parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (checkServiceFindableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static checkServiceFindableParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (checkServiceFindableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static checkServiceFindableParam parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (checkServiceFindableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static checkServiceFindableParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (checkServiceFindableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static checkServiceFindableParam parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (checkServiceFindableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static checkServiceFindableParam parseFrom(InputStream inputStream) throws IOException {
            return (checkServiceFindableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static checkServiceFindableParam parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (checkServiceFindableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static checkServiceFindableParam parseFrom(j jVar) throws IOException {
            return (checkServiceFindableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static checkServiceFindableParam parseFrom(j jVar, t tVar) throws IOException {
            return (checkServiceFindableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface checkServiceFindableParamOrBuilder extends bsf {
        String getClientId();

        ByteString getClientIdBytes();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getPid();

        String getType(int i);

        ByteString getTypeBytes(int i);

        int getTypeCount();

        List<String> getTypeList();

        int getUid();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class checkServiceRegistrableParam extends GeneratedMessageLite<checkServiceRegistrableParam, Builder> implements checkServiceRegistrableParamOrBuilder {
        public static final int CLIENTID_FIELD_NUMBER = 1;
        private static final checkServiceRegistrableParam DEFAULT_INSTANCE;
        private static volatile vkh<checkServiceRegistrableParam> PARSER = null;
        public static final int PID_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 2;
        public static final int UID_FIELD_NUMBER = 4;
        private int pid_;
        private int uid_;
        private String clientId_ = "";
        private String type_ = "";

        public static final class Builder extends GeneratedMessageLite.a<checkServiceRegistrableParam, Builder> implements checkServiceRegistrableParamOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearClientId() {
                copyOnWrite();
                ((checkServiceRegistrableParam) this.instance).clearClientId();
                return this;
            }

            public Builder clearPid() {
                copyOnWrite();
                ((checkServiceRegistrableParam) this.instance).clearPid();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((checkServiceRegistrableParam) this.instance).clearType();
                return this;
            }

            public Builder clearUid() {
                copyOnWrite();
                ((checkServiceRegistrableParam) this.instance).clearUid();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceRegistrableParamOrBuilder
            public String getClientId() {
                return ((checkServiceRegistrableParam) this.instance).getClientId();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceRegistrableParamOrBuilder
            public ByteString getClientIdBytes() {
                return ((checkServiceRegistrableParam) this.instance).getClientIdBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceRegistrableParamOrBuilder
            public int getPid() {
                return ((checkServiceRegistrableParam) this.instance).getPid();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceRegistrableParamOrBuilder
            public String getType() {
                return ((checkServiceRegistrableParam) this.instance).getType();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceRegistrableParamOrBuilder
            public ByteString getTypeBytes() {
                return ((checkServiceRegistrableParam) this.instance).getTypeBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceRegistrableParamOrBuilder
            public int getUid() {
                return ((checkServiceRegistrableParam) this.instance).getUid();
            }

            public Builder setClientId(String str) {
                copyOnWrite();
                ((checkServiceRegistrableParam) this.instance).setClientId(str);
                return this;
            }

            public Builder setClientIdBytes(ByteString byteString) {
                copyOnWrite();
                ((checkServiceRegistrableParam) this.instance).setClientIdBytes(byteString);
                return this;
            }

            public Builder setPid(int i) {
                copyOnWrite();
                ((checkServiceRegistrableParam) this.instance).setPid(i);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((checkServiceRegistrableParam) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((checkServiceRegistrableParam) this.instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setUid(int i) {
                copyOnWrite();
                ((checkServiceRegistrableParam) this.instance).setUid(i);
                return this;
            }

            private Builder() {
                super(checkServiceRegistrableParam.DEFAULT_INSTANCE);
            }
        }

        static {
            checkServiceRegistrableParam checkserviceregistrableparam = new checkServiceRegistrableParam();
            DEFAULT_INSTANCE = checkserviceregistrableparam;
            GeneratedMessageLite.registerDefaultInstance(checkServiceRegistrableParam.class, checkserviceregistrableparam);
        }

        private checkServiceRegistrableParam() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientId() {
            this.clientId_ = getDefaultInstance().getClientId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPid() {
            this.pid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUid() {
            this.uid_ = 0;
        }

        public static checkServiceRegistrableParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static checkServiceRegistrableParam parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (checkServiceRegistrableParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static checkServiceRegistrableParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (checkServiceRegistrableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<checkServiceRegistrableParam> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientId(String str) {
            str.getClass();
            this.clientId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientIdBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.clientId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPid(int i) {
            this.pid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUid(int i) {
            this.uid_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new checkServiceRegistrableParam();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004", new Object[]{"clientId_", "type_", "pid_", "uid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<checkServiceRegistrableParam> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (checkServiceRegistrableParam.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceRegistrableParamOrBuilder
        public String getClientId() {
            return this.clientId_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceRegistrableParamOrBuilder
        public ByteString getClientIdBytes() {
            return ByteString.copyFromUtf8(this.clientId_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceRegistrableParamOrBuilder
        public int getPid() {
            return this.pid_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceRegistrableParamOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceRegistrableParamOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.checkServiceRegistrableParamOrBuilder
        public int getUid() {
            return this.uid_;
        }

        public static Builder newBuilder(checkServiceRegistrableParam checkserviceregistrableparam) {
            return DEFAULT_INSTANCE.createBuilder(checkserviceregistrableparam);
        }

        public static checkServiceRegistrableParam parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (checkServiceRegistrableParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static checkServiceRegistrableParam parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (checkServiceRegistrableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static checkServiceRegistrableParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (checkServiceRegistrableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static checkServiceRegistrableParam parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (checkServiceRegistrableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static checkServiceRegistrableParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (checkServiceRegistrableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static checkServiceRegistrableParam parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (checkServiceRegistrableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static checkServiceRegistrableParam parseFrom(InputStream inputStream) throws IOException {
            return (checkServiceRegistrableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static checkServiceRegistrableParam parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (checkServiceRegistrableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static checkServiceRegistrableParam parseFrom(j jVar) throws IOException {
            return (checkServiceRegistrableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static checkServiceRegistrableParam parseFrom(j jVar, t tVar) throws IOException {
            return (checkServiceRegistrableParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface checkServiceRegistrableParamOrBuilder extends bsf {
        String getClientId();

        ByteString getClientIdBytes();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getPid();

        String getType();

        ByteString getTypeBytes();

        int getUid();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class filterAdvDiscTypeParam extends GeneratedMessageLite<filterAdvDiscTypeParam, Builder> implements filterAdvDiscTypeParamOrBuilder {
        private static final filterAdvDiscTypeParam DEFAULT_INSTANCE;
        public static final int DISCTYPE_FIELD_NUMBER = 1;
        private static volatile vkh<filterAdvDiscTypeParam> PARSER = null;
        public static final int PID_FIELD_NUMBER = 2;
        public static final int UID_FIELD_NUMBER = 3;
        private int discType_;
        private int pid_;
        private int uid_;

        public static final class Builder extends GeneratedMessageLite.a<filterAdvDiscTypeParam, Builder> implements filterAdvDiscTypeParamOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDiscType() {
                copyOnWrite();
                ((filterAdvDiscTypeParam) this.instance).clearDiscType();
                return this;
            }

            public Builder clearPid() {
                copyOnWrite();
                ((filterAdvDiscTypeParam) this.instance).clearPid();
                return this;
            }

            public Builder clearUid() {
                copyOnWrite();
                ((filterAdvDiscTypeParam) this.instance).clearUid();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.filterAdvDiscTypeParamOrBuilder
            public int getDiscType() {
                return ((filterAdvDiscTypeParam) this.instance).getDiscType();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.filterAdvDiscTypeParamOrBuilder
            public int getPid() {
                return ((filterAdvDiscTypeParam) this.instance).getPid();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.filterAdvDiscTypeParamOrBuilder
            public int getUid() {
                return ((filterAdvDiscTypeParam) this.instance).getUid();
            }

            public Builder setDiscType(int i) {
                copyOnWrite();
                ((filterAdvDiscTypeParam) this.instance).setDiscType(i);
                return this;
            }

            public Builder setPid(int i) {
                copyOnWrite();
                ((filterAdvDiscTypeParam) this.instance).setPid(i);
                return this;
            }

            public Builder setUid(int i) {
                copyOnWrite();
                ((filterAdvDiscTypeParam) this.instance).setUid(i);
                return this;
            }

            private Builder() {
                super(filterAdvDiscTypeParam.DEFAULT_INSTANCE);
            }
        }

        static {
            filterAdvDiscTypeParam filteradvdisctypeparam = new filterAdvDiscTypeParam();
            DEFAULT_INSTANCE = filteradvdisctypeparam;
            GeneratedMessageLite.registerDefaultInstance(filterAdvDiscTypeParam.class, filteradvdisctypeparam);
        }

        private filterAdvDiscTypeParam() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDiscType() {
            this.discType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPid() {
            this.pid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUid() {
            this.uid_ = 0;
        }

        public static filterAdvDiscTypeParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static filterAdvDiscTypeParam parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (filterAdvDiscTypeParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static filterAdvDiscTypeParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (filterAdvDiscTypeParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<filterAdvDiscTypeParam> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDiscType(int i) {
            this.discType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPid(int i) {
            this.pid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUid(int i) {
            this.uid_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new filterAdvDiscTypeParam();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"discType_", "pid_", "uid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<filterAdvDiscTypeParam> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (filterAdvDiscTypeParam.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.filterAdvDiscTypeParamOrBuilder
        public int getDiscType() {
            return this.discType_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.filterAdvDiscTypeParamOrBuilder
        public int getPid() {
            return this.pid_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.filterAdvDiscTypeParamOrBuilder
        public int getUid() {
            return this.uid_;
        }

        public static Builder newBuilder(filterAdvDiscTypeParam filteradvdisctypeparam) {
            return DEFAULT_INSTANCE.createBuilder(filteradvdisctypeparam);
        }

        public static filterAdvDiscTypeParam parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (filterAdvDiscTypeParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static filterAdvDiscTypeParam parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (filterAdvDiscTypeParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static filterAdvDiscTypeParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (filterAdvDiscTypeParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static filterAdvDiscTypeParam parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (filterAdvDiscTypeParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static filterAdvDiscTypeParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (filterAdvDiscTypeParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static filterAdvDiscTypeParam parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (filterAdvDiscTypeParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static filterAdvDiscTypeParam parseFrom(InputStream inputStream) throws IOException {
            return (filterAdvDiscTypeParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static filterAdvDiscTypeParam parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (filterAdvDiscTypeParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static filterAdvDiscTypeParam parseFrom(j jVar) throws IOException {
            return (filterAdvDiscTypeParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static filterAdvDiscTypeParam parseFrom(j jVar, t tVar) throws IOException {
            return (filterAdvDiscTypeParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface filterAdvDiscTypeParamOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDiscType();

        int getPid();

        int getUid();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class filterCommParam extends GeneratedMessageLite<filterCommParam, Builder> implements filterCommParamOrBuilder {
        public static final int COMMTYPE_FIELD_NUMBER = 1;
        private static final filterCommParam DEFAULT_INSTANCE;
        private static volatile vkh<filterCommParam> PARSER = null;
        public static final int PID_FIELD_NUMBER = 2;
        public static final int UID_FIELD_NUMBER = 3;
        private int commType_;
        private int pid_;
        private int uid_;

        public static final class Builder extends GeneratedMessageLite.a<filterCommParam, Builder> implements filterCommParamOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCommType() {
                copyOnWrite();
                ((filterCommParam) this.instance).clearCommType();
                return this;
            }

            public Builder clearPid() {
                copyOnWrite();
                ((filterCommParam) this.instance).clearPid();
                return this;
            }

            public Builder clearUid() {
                copyOnWrite();
                ((filterCommParam) this.instance).clearUid();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.filterCommParamOrBuilder
            public int getCommType() {
                return ((filterCommParam) this.instance).getCommType();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.filterCommParamOrBuilder
            public int getPid() {
                return ((filterCommParam) this.instance).getPid();
            }

            @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.filterCommParamOrBuilder
            public int getUid() {
                return ((filterCommParam) this.instance).getUid();
            }

            public Builder setCommType(int i) {
                copyOnWrite();
                ((filterCommParam) this.instance).setCommType(i);
                return this;
            }

            public Builder setPid(int i) {
                copyOnWrite();
                ((filterCommParam) this.instance).setPid(i);
                return this;
            }

            public Builder setUid(int i) {
                copyOnWrite();
                ((filterCommParam) this.instance).setUid(i);
                return this;
            }

            private Builder() {
                super(filterCommParam.DEFAULT_INSTANCE);
            }
        }

        static {
            filterCommParam filtercommparam = new filterCommParam();
            DEFAULT_INSTANCE = filtercommparam;
            GeneratedMessageLite.registerDefaultInstance(filterCommParam.class, filtercommparam);
        }

        private filterCommParam() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCommType() {
            this.commType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPid() {
            this.pid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUid() {
            this.uid_ = 0;
        }

        public static filterCommParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static filterCommParam parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (filterCommParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static filterCommParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (filterCommParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<filterCommParam> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommType(int i) {
            this.commType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPid(int i) {
            this.pid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUid(int i) {
            this.uid_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new filterCommParam();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"commType_", "pid_", "uid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<filterCommParam> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (filterCommParam.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.filterCommParamOrBuilder
        public int getCommType() {
            return this.commType_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.filterCommParamOrBuilder
        public int getPid() {
            return this.pid_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.IDMSecurityManagerProto.filterCommParamOrBuilder
        public int getUid() {
            return this.uid_;
        }

        public static Builder newBuilder(filterCommParam filtercommparam) {
            return DEFAULT_INSTANCE.createBuilder(filtercommparam);
        }

        public static filterCommParam parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (filterCommParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static filterCommParam parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (filterCommParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static filterCommParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (filterCommParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static filterCommParam parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (filterCommParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static filterCommParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (filterCommParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static filterCommParam parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (filterCommParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static filterCommParam parseFrom(InputStream inputStream) throws IOException {
            return (filterCommParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static filterCommParam parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (filterCommParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static filterCommParam parseFrom(j jVar) throws IOException {
            return (filterCommParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static filterCommParam parseFrom(j jVar, t tVar) throws IOException {
            return (filterCommParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface filterCommParamOrBuilder extends bsf {
        int getCommType();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getPid();

        int getUid();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private IDMSecurityManagerProto() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}

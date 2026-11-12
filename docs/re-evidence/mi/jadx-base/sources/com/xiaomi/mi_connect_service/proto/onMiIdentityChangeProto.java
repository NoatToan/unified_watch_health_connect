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

/* JADX INFO: loaded from: classes11.dex */
public final class onMiIdentityChangeProto {

    /* JADX INFO: renamed from: com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto$1, reason: invalid class name */
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

    public enum ChangeType implements d0.c {
        ACCOUNT(0),
        OTHER(15),
        UNRECOGNIZED(-1);

        public static final int ACCOUNT_VALUE = 0;
        public static final int OTHER_VALUE = 15;
        private static final d0.d<ChangeType> internalValueMap = new d0.d<ChangeType>() { // from class: com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.ChangeType.1
            @Override // com.google.protobuf.d0.d
            public ChangeType findValueByNumber(int i) {
                return ChangeType.forNumber(i);
            }
        };
        private final int value;

        public static final class ChangeTypeVerifier implements d0.e {
            static final d0.e INSTANCE = new ChangeTypeVerifier();

            private ChangeTypeVerifier() {
            }

            @Override // com.google.protobuf.d0.e
            public boolean isInRange(int i) {
                return ChangeType.forNumber(i) != null;
            }
        }

        ChangeType(int i) {
            this.value = i;
        }

        public static ChangeType forNumber(int i) {
            if (i == 0) {
                return ACCOUNT;
            }
            if (i != 15) {
                return null;
            }
            return OTHER;
        }

        public static d0.d<ChangeType> internalGetValueMap() {
            return internalValueMap;
        }

        public static d0.e internalGetVerifier() {
            return ChangeTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.d0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ChangeType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class OnAccountChangeResult extends GeneratedMessageLite<OnAccountChangeResult, Builder> implements OnAccountChangeResultOrBuilder {
        private static final OnAccountChangeResult DEFAULT_INSTANCE;
        public static final int IDHASH_FIELD_NUMBER = 2;
        public static final int NEWACCOUNT_FIELD_NUMBER = 4;
        public static final int OLDACCOUNT_FIELD_NUMBER = 3;
        private static volatile vkh<OnAccountChangeResult> PARSER = null;
        public static final int SUBCHANGETYPE_FIELD_NUMBER = 1;
        private int subChangeType_;
        private ByteString idHash_ = ByteString.EMPTY;
        private String oldAccount_ = "";
        private String newAccount_ = "";

        public static final class Builder extends GeneratedMessageLite.a<OnAccountChangeResult, Builder> implements OnAccountChangeResultOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIdHash() {
                copyOnWrite();
                ((OnAccountChangeResult) this.instance).clearIdHash();
                return this;
            }

            public Builder clearNewAccount() {
                copyOnWrite();
                ((OnAccountChangeResult) this.instance).clearNewAccount();
                return this;
            }

            public Builder clearOldAccount() {
                copyOnWrite();
                ((OnAccountChangeResult) this.instance).clearOldAccount();
                return this;
            }

            public Builder clearSubChangeType() {
                copyOnWrite();
                ((OnAccountChangeResult) this.instance).clearSubChangeType();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.OnAccountChangeResultOrBuilder
            public ByteString getIdHash() {
                return ((OnAccountChangeResult) this.instance).getIdHash();
            }

            @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.OnAccountChangeResultOrBuilder
            public String getNewAccount() {
                return ((OnAccountChangeResult) this.instance).getNewAccount();
            }

            @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.OnAccountChangeResultOrBuilder
            public ByteString getNewAccountBytes() {
                return ((OnAccountChangeResult) this.instance).getNewAccountBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.OnAccountChangeResultOrBuilder
            public String getOldAccount() {
                return ((OnAccountChangeResult) this.instance).getOldAccount();
            }

            @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.OnAccountChangeResultOrBuilder
            public ByteString getOldAccountBytes() {
                return ((OnAccountChangeResult) this.instance).getOldAccountBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.OnAccountChangeResultOrBuilder
            public SubChangeType getSubChangeType() {
                return ((OnAccountChangeResult) this.instance).getSubChangeType();
            }

            @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.OnAccountChangeResultOrBuilder
            public int getSubChangeTypeValue() {
                return ((OnAccountChangeResult) this.instance).getSubChangeTypeValue();
            }

            public Builder setIdHash(ByteString byteString) {
                copyOnWrite();
                ((OnAccountChangeResult) this.instance).setIdHash(byteString);
                return this;
            }

            public Builder setNewAccount(String str) {
                copyOnWrite();
                ((OnAccountChangeResult) this.instance).setNewAccount(str);
                return this;
            }

            public Builder setNewAccountBytes(ByteString byteString) {
                copyOnWrite();
                ((OnAccountChangeResult) this.instance).setNewAccountBytes(byteString);
                return this;
            }

            public Builder setOldAccount(String str) {
                copyOnWrite();
                ((OnAccountChangeResult) this.instance).setOldAccount(str);
                return this;
            }

            public Builder setOldAccountBytes(ByteString byteString) {
                copyOnWrite();
                ((OnAccountChangeResult) this.instance).setOldAccountBytes(byteString);
                return this;
            }

            public Builder setSubChangeType(SubChangeType subChangeType) {
                copyOnWrite();
                ((OnAccountChangeResult) this.instance).setSubChangeType(subChangeType);
                return this;
            }

            public Builder setSubChangeTypeValue(int i) {
                copyOnWrite();
                ((OnAccountChangeResult) this.instance).setSubChangeTypeValue(i);
                return this;
            }

            private Builder() {
                super(OnAccountChangeResult.DEFAULT_INSTANCE);
            }
        }

        static {
            OnAccountChangeResult onAccountChangeResult = new OnAccountChangeResult();
            DEFAULT_INSTANCE = onAccountChangeResult;
            GeneratedMessageLite.registerDefaultInstance(OnAccountChangeResult.class, onAccountChangeResult);
        }

        private OnAccountChangeResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdHash() {
            this.idHash_ = getDefaultInstance().getIdHash();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNewAccount() {
            this.newAccount_ = getDefaultInstance().getNewAccount();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOldAccount() {
            this.oldAccount_ = getDefaultInstance().getOldAccount();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubChangeType() {
            this.subChangeType_ = 0;
        }

        public static OnAccountChangeResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OnAccountChangeResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OnAccountChangeResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OnAccountChangeResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OnAccountChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<OnAccountChangeResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdHash(ByteString byteString) {
            byteString.getClass();
            this.idHash_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewAccount(String str) {
            str.getClass();
            this.newAccount_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewAccountBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.newAccount_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOldAccount(String str) {
            str.getClass();
            this.oldAccount_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOldAccountBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.oldAccount_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubChangeType(SubChangeType subChangeType) {
            this.subChangeType_ = subChangeType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubChangeTypeValue(int i) {
            this.subChangeType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new OnAccountChangeResult();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\n\u0003Ȉ\u0004Ȉ", new Object[]{"subChangeType_", "idHash_", "oldAccount_", "newAccount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<OnAccountChangeResult> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (OnAccountChangeResult.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.OnAccountChangeResultOrBuilder
        public ByteString getIdHash() {
            return this.idHash_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.OnAccountChangeResultOrBuilder
        public String getNewAccount() {
            return this.newAccount_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.OnAccountChangeResultOrBuilder
        public ByteString getNewAccountBytes() {
            return ByteString.copyFromUtf8(this.newAccount_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.OnAccountChangeResultOrBuilder
        public String getOldAccount() {
            return this.oldAccount_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.OnAccountChangeResultOrBuilder
        public ByteString getOldAccountBytes() {
            return ByteString.copyFromUtf8(this.oldAccount_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.OnAccountChangeResultOrBuilder
        public SubChangeType getSubChangeType() {
            SubChangeType subChangeTypeForNumber = SubChangeType.forNumber(this.subChangeType_);
            return subChangeTypeForNumber == null ? SubChangeType.UNRECOGNIZED : subChangeTypeForNumber;
        }

        @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.OnAccountChangeResultOrBuilder
        public int getSubChangeTypeValue() {
            return this.subChangeType_;
        }

        public static Builder newBuilder(OnAccountChangeResult onAccountChangeResult) {
            return DEFAULT_INSTANCE.createBuilder(onAccountChangeResult);
        }

        public static OnAccountChangeResult parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (OnAccountChangeResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static OnAccountChangeResult parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (OnAccountChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static OnAccountChangeResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OnAccountChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OnAccountChangeResult parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (OnAccountChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static OnAccountChangeResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OnAccountChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OnAccountChangeResult parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (OnAccountChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static OnAccountChangeResult parseFrom(InputStream inputStream) throws IOException {
            return (OnAccountChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OnAccountChangeResult parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (OnAccountChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static OnAccountChangeResult parseFrom(j jVar) throws IOException {
            return (OnAccountChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static OnAccountChangeResult parseFrom(j jVar, t tVar) throws IOException {
            return (OnAccountChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface OnAccountChangeResultOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        ByteString getIdHash();

        String getNewAccount();

        ByteString getNewAccountBytes();

        String getOldAccount();

        ByteString getOldAccountBytes();

        SubChangeType getSubChangeType();

        int getSubChangeTypeValue();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public enum SubChangeType implements d0.c {
        LOGIN(0),
        LOGOUT(1),
        CHANGE(2),
        UNRECOGNIZED(-1);

        public static final int CHANGE_VALUE = 2;
        public static final int LOGIN_VALUE = 0;
        public static final int LOGOUT_VALUE = 1;
        private static final d0.d<SubChangeType> internalValueMap = new d0.d<SubChangeType>() { // from class: com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.SubChangeType.1
            @Override // com.google.protobuf.d0.d
            public SubChangeType findValueByNumber(int i) {
                return SubChangeType.forNumber(i);
            }
        };
        private final int value;

        public static final class SubChangeTypeVerifier implements d0.e {
            static final d0.e INSTANCE = new SubChangeTypeVerifier();

            private SubChangeTypeVerifier() {
            }

            @Override // com.google.protobuf.d0.e
            public boolean isInRange(int i) {
                return SubChangeType.forNumber(i) != null;
            }
        }

        SubChangeType(int i) {
            this.value = i;
        }

        public static SubChangeType forNumber(int i) {
            if (i == 0) {
                return LOGIN;
            }
            if (i == 1) {
                return LOGOUT;
            }
            if (i != 2) {
                return null;
            }
            return CHANGE;
        }

        public static d0.d<SubChangeType> internalGetValueMap() {
            return internalValueMap;
        }

        public static d0.e internalGetVerifier() {
            return SubChangeTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.d0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static SubChangeType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class onMiIdentityChangeResult extends GeneratedMessageLite<onMiIdentityChangeResult, Builder> implements onMiIdentityChangeResultOrBuilder {
        public static final int CHANGETYPE_FIELD_NUMBER = 1;
        private static final onMiIdentityChangeResult DEFAULT_INSTANCE;
        public static final int ONACCOUNTCHANGEMESSAGE_FIELD_NUMBER = 2;
        private static volatile vkh<onMiIdentityChangeResult> PARSER;
        private int changeMessageCase_ = 0;
        private Object changeMessage_;
        private int changeType_;

        public static final class Builder extends GeneratedMessageLite.a<onMiIdentityChangeResult, Builder> implements onMiIdentityChangeResultOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearChangeMessage() {
                copyOnWrite();
                ((onMiIdentityChangeResult) this.instance).clearChangeMessage();
                return this;
            }

            public Builder clearChangeType() {
                copyOnWrite();
                ((onMiIdentityChangeResult) this.instance).clearChangeType();
                return this;
            }

            public Builder clearOnAccountChangeMessage() {
                copyOnWrite();
                ((onMiIdentityChangeResult) this.instance).clearOnAccountChangeMessage();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.onMiIdentityChangeResultOrBuilder
            public ChangeMessageCase getChangeMessageCase() {
                return ((onMiIdentityChangeResult) this.instance).getChangeMessageCase();
            }

            @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.onMiIdentityChangeResultOrBuilder
            public ChangeType getChangeType() {
                return ((onMiIdentityChangeResult) this.instance).getChangeType();
            }

            @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.onMiIdentityChangeResultOrBuilder
            public int getChangeTypeValue() {
                return ((onMiIdentityChangeResult) this.instance).getChangeTypeValue();
            }

            @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.onMiIdentityChangeResultOrBuilder
            public OnAccountChangeResult getOnAccountChangeMessage() {
                return ((onMiIdentityChangeResult) this.instance).getOnAccountChangeMessage();
            }

            @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.onMiIdentityChangeResultOrBuilder
            public boolean hasOnAccountChangeMessage() {
                return ((onMiIdentityChangeResult) this.instance).hasOnAccountChangeMessage();
            }

            public Builder mergeOnAccountChangeMessage(OnAccountChangeResult onAccountChangeResult) {
                copyOnWrite();
                ((onMiIdentityChangeResult) this.instance).mergeOnAccountChangeMessage(onAccountChangeResult);
                return this;
            }

            public Builder setChangeType(ChangeType changeType) {
                copyOnWrite();
                ((onMiIdentityChangeResult) this.instance).setChangeType(changeType);
                return this;
            }

            public Builder setChangeTypeValue(int i) {
                copyOnWrite();
                ((onMiIdentityChangeResult) this.instance).setChangeTypeValue(i);
                return this;
            }

            public Builder setOnAccountChangeMessage(OnAccountChangeResult onAccountChangeResult) {
                copyOnWrite();
                ((onMiIdentityChangeResult) this.instance).setOnAccountChangeMessage(onAccountChangeResult);
                return this;
            }

            private Builder() {
                super(onMiIdentityChangeResult.DEFAULT_INSTANCE);
            }

            public Builder setOnAccountChangeMessage(OnAccountChangeResult.Builder builder) {
                copyOnWrite();
                ((onMiIdentityChangeResult) this.instance).setOnAccountChangeMessage(builder.build());
                return this;
            }
        }

        public enum ChangeMessageCase {
            ONACCOUNTCHANGEMESSAGE(2),
            CHANGEMESSAGE_NOT_SET(0);

            private final int value;

            ChangeMessageCase(int i) {
                this.value = i;
            }

            public static ChangeMessageCase forNumber(int i) {
                if (i == 0) {
                    return CHANGEMESSAGE_NOT_SET;
                }
                if (i != 2) {
                    return null;
                }
                return ONACCOUNTCHANGEMESSAGE;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ChangeMessageCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            onMiIdentityChangeResult onmiidentitychangeresult = new onMiIdentityChangeResult();
            DEFAULT_INSTANCE = onmiidentitychangeresult;
            GeneratedMessageLite.registerDefaultInstance(onMiIdentityChangeResult.class, onmiidentitychangeresult);
        }

        private onMiIdentityChangeResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChangeMessage() {
            this.changeMessageCase_ = 0;
            this.changeMessage_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChangeType() {
            this.changeType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOnAccountChangeMessage() {
            if (this.changeMessageCase_ == 2) {
                this.changeMessageCase_ = 0;
                this.changeMessage_ = null;
            }
        }

        public static onMiIdentityChangeResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOnAccountChangeMessage(OnAccountChangeResult onAccountChangeResult) {
            onAccountChangeResult.getClass();
            if (this.changeMessageCase_ != 2 || this.changeMessage_ == OnAccountChangeResult.getDefaultInstance()) {
                this.changeMessage_ = onAccountChangeResult;
            } else {
                this.changeMessage_ = OnAccountChangeResult.newBuilder((OnAccountChangeResult) this.changeMessage_).mergeFrom(onAccountChangeResult).buildPartial();
            }
            this.changeMessageCase_ = 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static onMiIdentityChangeResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (onMiIdentityChangeResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static onMiIdentityChangeResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (onMiIdentityChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<onMiIdentityChangeResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChangeType(ChangeType changeType) {
            this.changeType_ = changeType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChangeTypeValue(int i) {
            this.changeType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOnAccountChangeMessage(OnAccountChangeResult onAccountChangeResult) {
            onAccountChangeResult.getClass();
            this.changeMessage_ = onAccountChangeResult;
            this.changeMessageCase_ = 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new onMiIdentityChangeResult();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"changeMessage_", "changeMessageCase_", "changeType_", OnAccountChangeResult.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<onMiIdentityChangeResult> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (onMiIdentityChangeResult.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.onMiIdentityChangeResultOrBuilder
        public ChangeMessageCase getChangeMessageCase() {
            return ChangeMessageCase.forNumber(this.changeMessageCase_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.onMiIdentityChangeResultOrBuilder
        public ChangeType getChangeType() {
            ChangeType changeTypeForNumber = ChangeType.forNumber(this.changeType_);
            return changeTypeForNumber == null ? ChangeType.UNRECOGNIZED : changeTypeForNumber;
        }

        @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.onMiIdentityChangeResultOrBuilder
        public int getChangeTypeValue() {
            return this.changeType_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.onMiIdentityChangeResultOrBuilder
        public OnAccountChangeResult getOnAccountChangeMessage() {
            return this.changeMessageCase_ == 2 ? (OnAccountChangeResult) this.changeMessage_ : OnAccountChangeResult.getDefaultInstance();
        }

        @Override // com.xiaomi.mi_connect_service.proto.onMiIdentityChangeProto.onMiIdentityChangeResultOrBuilder
        public boolean hasOnAccountChangeMessage() {
            return this.changeMessageCase_ == 2;
        }

        public static Builder newBuilder(onMiIdentityChangeResult onmiidentitychangeresult) {
            return DEFAULT_INSTANCE.createBuilder(onmiidentitychangeresult);
        }

        public static onMiIdentityChangeResult parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (onMiIdentityChangeResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static onMiIdentityChangeResult parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (onMiIdentityChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static onMiIdentityChangeResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (onMiIdentityChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static onMiIdentityChangeResult parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (onMiIdentityChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static onMiIdentityChangeResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (onMiIdentityChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static onMiIdentityChangeResult parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (onMiIdentityChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static onMiIdentityChangeResult parseFrom(InputStream inputStream) throws IOException {
            return (onMiIdentityChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static onMiIdentityChangeResult parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (onMiIdentityChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static onMiIdentityChangeResult parseFrom(j jVar) throws IOException {
            return (onMiIdentityChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static onMiIdentityChangeResult parseFrom(j jVar, t tVar) throws IOException {
            return (onMiIdentityChangeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface onMiIdentityChangeResultOrBuilder extends bsf {
        onMiIdentityChangeResult.ChangeMessageCase getChangeMessageCase();

        ChangeType getChangeType();

        int getChangeTypeValue();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        OnAccountChangeResult getOnAccountChangeMessage();

        boolean hasOnAccountChangeMessage();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private onMiIdentityChangeProto() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}

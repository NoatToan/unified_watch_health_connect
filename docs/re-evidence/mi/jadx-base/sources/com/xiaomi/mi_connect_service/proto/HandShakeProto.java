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
public final class HandShakeProto {

    /* JADX INFO: renamed from: com.xiaomi.mi_connect_service.proto.HandShakeProto$1, reason: invalid class name */
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

    public static final class HandShakeMessage extends GeneratedMessageLite<HandShakeMessage, Builder> implements HandShakeMessageOrBuilder {
        public static final int AUTHSTATUS_FIELD_NUMBER = 5;
        public static final int CERT_FIELD_NUMBER = 4;
        private static final HandShakeMessage DEFAULT_INSTANCE;
        public static final int ENCRYPTEDSIGN_FIELD_NUMBER = 15;
        public static final int HASHDATA_FIELD_NUMBER = 14;
        private static volatile vkh<HandShakeMessage> PARSER = null;
        public static final int PUBLICKEY_FIELD_NUMBER = 3;
        public static final int SESSIONID_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int authStatus_;
        private String cert_;
        private ByteString encryptedSign_;
        private ByteString hashData_;
        private ByteString publicKey_;
        private String sessionId_ = "";
        private int type_;

        public static final class Builder extends GeneratedMessageLite.a<HandShakeMessage, Builder> implements HandShakeMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAuthStatus() {
                copyOnWrite();
                ((HandShakeMessage) this.instance).clearAuthStatus();
                return this;
            }

            public Builder clearCert() {
                copyOnWrite();
                ((HandShakeMessage) this.instance).clearCert();
                return this;
            }

            public Builder clearEncryptedSign() {
                copyOnWrite();
                ((HandShakeMessage) this.instance).clearEncryptedSign();
                return this;
            }

            public Builder clearHashData() {
                copyOnWrite();
                ((HandShakeMessage) this.instance).clearHashData();
                return this;
            }

            public Builder clearPublicKey() {
                copyOnWrite();
                ((HandShakeMessage) this.instance).clearPublicKey();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((HandShakeMessage) this.instance).clearSessionId();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((HandShakeMessage) this.instance).clearType();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
            public int getAuthStatus() {
                return ((HandShakeMessage) this.instance).getAuthStatus();
            }

            @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
            public String getCert() {
                return ((HandShakeMessage) this.instance).getCert();
            }

            @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
            public ByteString getCertBytes() {
                return ((HandShakeMessage) this.instance).getCertBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
            public ByteString getEncryptedSign() {
                return ((HandShakeMessage) this.instance).getEncryptedSign();
            }

            @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
            public ByteString getHashData() {
                return ((HandShakeMessage) this.instance).getHashData();
            }

            @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
            public ByteString getPublicKey() {
                return ((HandShakeMessage) this.instance).getPublicKey();
            }

            @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
            public String getSessionId() {
                return ((HandShakeMessage) this.instance).getSessionId();
            }

            @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
            public ByteString getSessionIdBytes() {
                return ((HandShakeMessage) this.instance).getSessionIdBytes();
            }

            @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
            public MessageType getType() {
                return ((HandShakeMessage) this.instance).getType();
            }

            @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
            public int getTypeValue() {
                return ((HandShakeMessage) this.instance).getTypeValue();
            }

            public Builder setAuthStatus(int i) {
                copyOnWrite();
                ((HandShakeMessage) this.instance).setAuthStatus(i);
                return this;
            }

            public Builder setCert(String str) {
                copyOnWrite();
                ((HandShakeMessage) this.instance).setCert(str);
                return this;
            }

            public Builder setCertBytes(ByteString byteString) {
                copyOnWrite();
                ((HandShakeMessage) this.instance).setCertBytes(byteString);
                return this;
            }

            public Builder setEncryptedSign(ByteString byteString) {
                copyOnWrite();
                ((HandShakeMessage) this.instance).setEncryptedSign(byteString);
                return this;
            }

            public Builder setHashData(ByteString byteString) {
                copyOnWrite();
                ((HandShakeMessage) this.instance).setHashData(byteString);
                return this;
            }

            public Builder setPublicKey(ByteString byteString) {
                copyOnWrite();
                ((HandShakeMessage) this.instance).setPublicKey(byteString);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((HandShakeMessage) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((HandShakeMessage) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public Builder setType(MessageType messageType) {
                copyOnWrite();
                ((HandShakeMessage) this.instance).setType(messageType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((HandShakeMessage) this.instance).setTypeValue(i);
                return this;
            }

            private Builder() {
                super(HandShakeMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            HandShakeMessage handShakeMessage = new HandShakeMessage();
            DEFAULT_INSTANCE = handShakeMessage;
            GeneratedMessageLite.registerDefaultInstance(HandShakeMessage.class, handShakeMessage);
        }

        private HandShakeMessage() {
            ByteString byteString = ByteString.EMPTY;
            this.publicKey_ = byteString;
            this.cert_ = "";
            this.hashData_ = byteString;
            this.encryptedSign_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuthStatus() {
            this.authStatus_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCert() {
            this.cert_ = getDefaultInstance().getCert();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEncryptedSign() {
            this.encryptedSign_ = getDefaultInstance().getEncryptedSign();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHashData() {
            this.hashData_ = getDefaultInstance().getHashData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPublicKey() {
            this.publicKey_ = getDefaultInstance().getPublicKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static HandShakeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HandShakeMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HandShakeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HandShakeMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HandShakeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<HandShakeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuthStatus(int i) {
            this.authStatus_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCert(String str) {
            str.getClass();
            this.cert_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCertBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.cert_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEncryptedSign(ByteString byteString) {
            byteString.getClass();
            this.encryptedSign_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHashData(ByteString byteString) {
            byteString.getClass();
            this.hashData_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublicKey(ByteString byteString) {
            byteString.getClass();
            this.publicKey_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.sessionId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(MessageType messageType) {
            this.type_ = messageType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new HandShakeMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u000f\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\n\u0004Ȉ\u0005\u0004\u000e\n\u000f\n", new Object[]{"sessionId_", "type_", "publicKey_", "cert_", "authStatus_", "hashData_", "encryptedSign_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<HandShakeMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (HandShakeMessage.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
        public int getAuthStatus() {
            return this.authStatus_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
        public String getCert() {
            return this.cert_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
        public ByteString getCertBytes() {
            return ByteString.copyFromUtf8(this.cert_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
        public ByteString getEncryptedSign() {
            return this.encryptedSign_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
        public ByteString getHashData() {
            return this.hashData_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
        public ByteString getPublicKey() {
            return this.publicKey_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
        public MessageType getType() {
            MessageType messageTypeForNumber = MessageType.forNumber(this.type_);
            return messageTypeForNumber == null ? MessageType.UNRECOGNIZED : messageTypeForNumber;
        }

        @Override // com.xiaomi.mi_connect_service.proto.HandShakeProto.HandShakeMessageOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        public static Builder newBuilder(HandShakeMessage handShakeMessage) {
            return DEFAULT_INSTANCE.createBuilder(handShakeMessage);
        }

        public static HandShakeMessage parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (HandShakeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static HandShakeMessage parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (HandShakeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static HandShakeMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HandShakeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HandShakeMessage parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (HandShakeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static HandShakeMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HandShakeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HandShakeMessage parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (HandShakeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static HandShakeMessage parseFrom(InputStream inputStream) throws IOException {
            return (HandShakeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HandShakeMessage parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (HandShakeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static HandShakeMessage parseFrom(j jVar) throws IOException {
            return (HandShakeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static HandShakeMessage parseFrom(j jVar, t tVar) throws IOException {
            return (HandShakeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface HandShakeMessageOrBuilder extends bsf {
        int getAuthStatus();

        String getCert();

        ByteString getCertBytes();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        ByteString getEncryptedSign();

        ByteString getHashData();

        ByteString getPublicKey();

        String getSessionId();

        ByteString getSessionIdBytes();

        MessageType getType();

        int getTypeValue();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public enum MessageType implements d0.c {
        ClientHello(0),
        Auth(1),
        UNRECOGNIZED(-1);

        public static final int Auth_VALUE = 1;
        public static final int ClientHello_VALUE = 0;
        private static final d0.d<MessageType> internalValueMap = new d0.d<MessageType>() { // from class: com.xiaomi.mi_connect_service.proto.HandShakeProto.MessageType.1
            @Override // com.google.protobuf.d0.d
            public MessageType findValueByNumber(int i) {
                return MessageType.forNumber(i);
            }
        };
        private final int value;

        public static final class MessageTypeVerifier implements d0.e {
            static final d0.e INSTANCE = new MessageTypeVerifier();

            private MessageTypeVerifier() {
            }

            @Override // com.google.protobuf.d0.e
            public boolean isInRange(int i) {
                return MessageType.forNumber(i) != null;
            }
        }

        MessageType(int i) {
            this.value = i;
        }

        public static MessageType forNumber(int i) {
            if (i == 0) {
                return ClientHello;
            }
            if (i != 1) {
                return null;
            }
            return Auth;
        }

        public static d0.d<MessageType> internalGetValueMap() {
            return internalValueMap;
        }

        public static d0.e internalGetVerifier() {
            return MessageTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.d0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static MessageType valueOf(int i) {
            return forNumber(i);
        }
    }

    private HandShakeProto() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}

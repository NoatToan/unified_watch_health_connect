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
public final class CoapMessageProto {

    /* JADX INFO: renamed from: com.xiaomi.mi_connect_service.proto.CoapMessageProto$1, reason: invalid class name */
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

    public static final class CoapMessage extends GeneratedMessageLite<CoapMessage, Builder> implements CoapMessageOrBuilder {
        private static final CoapMessage DEFAULT_INSTANCE;
        public static final int IP_FIELD_NUMBER = 4;
        private static volatile vkh<CoapMessage> PARSER = null;
        public static final int PORT_FIELD_NUMBER = 5;
        public static final int TARGETID_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int ip_;
        private int port_;
        private int targetId_;
        private int type_;
        private ByteString value_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.a<CoapMessage, Builder> implements CoapMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIp() {
                copyOnWrite();
                ((CoapMessage) this.instance).clearIp();
                return this;
            }

            public Builder clearPort() {
                copyOnWrite();
                ((CoapMessage) this.instance).clearPort();
                return this;
            }

            public Builder clearTargetId() {
                copyOnWrite();
                ((CoapMessage) this.instance).clearTargetId();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((CoapMessage) this.instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((CoapMessage) this.instance).clearValue();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessageOrBuilder
            public int getIp() {
                return ((CoapMessage) this.instance).getIp();
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessageOrBuilder
            public int getPort() {
                return ((CoapMessage) this.instance).getPort();
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessageOrBuilder
            public int getTargetId() {
                return ((CoapMessage) this.instance).getTargetId();
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessageOrBuilder
            public CoapMessageType getType() {
                return ((CoapMessage) this.instance).getType();
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessageOrBuilder
            public int getTypeValue() {
                return ((CoapMessage) this.instance).getTypeValue();
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessageOrBuilder
            public ByteString getValue() {
                return ((CoapMessage) this.instance).getValue();
            }

            public Builder setIp(int i) {
                copyOnWrite();
                ((CoapMessage) this.instance).setIp(i);
                return this;
            }

            public Builder setPort(int i) {
                copyOnWrite();
                ((CoapMessage) this.instance).setPort(i);
                return this;
            }

            public Builder setTargetId(int i) {
                copyOnWrite();
                ((CoapMessage) this.instance).setTargetId(i);
                return this;
            }

            public Builder setType(CoapMessageType coapMessageType) {
                copyOnWrite();
                ((CoapMessage) this.instance).setType(coapMessageType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((CoapMessage) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setValue(ByteString byteString) {
                copyOnWrite();
                ((CoapMessage) this.instance).setValue(byteString);
                return this;
            }

            private Builder() {
                super(CoapMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            CoapMessage coapMessage = new CoapMessage();
            DEFAULT_INSTANCE = coapMessage;
            GeneratedMessageLite.registerDefaultInstance(CoapMessage.class, coapMessage);
        }

        private CoapMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIp() {
            this.ip_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPort() {
            this.port_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTargetId() {
            this.targetId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static CoapMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CoapMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CoapMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CoapMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CoapMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<CoapMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIp(int i) {
            this.ip_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPort(int i) {
            this.port_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTargetId(int i) {
            this.targetId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(CoapMessageType coapMessageType) {
            this.type_ = coapMessageType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(ByteString byteString) {
            byteString.getClass();
            this.value_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CoapMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\n\u0004\u0004\u0005\u0004", new Object[]{"type_", "targetId_", "value_", "ip_", "port_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<CoapMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (CoapMessage.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessageOrBuilder
        public int getIp() {
            return this.ip_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessageOrBuilder
        public int getPort() {
            return this.port_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessageOrBuilder
        public int getTargetId() {
            return this.targetId_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessageOrBuilder
        public CoapMessageType getType() {
            CoapMessageType coapMessageTypeForNumber = CoapMessageType.forNumber(this.type_);
            return coapMessageTypeForNumber == null ? CoapMessageType.UNRECOGNIZED : coapMessageTypeForNumber;
        }

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessageOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessageOrBuilder
        public ByteString getValue() {
            return this.value_;
        }

        public static Builder newBuilder(CoapMessage coapMessage) {
            return DEFAULT_INSTANCE.createBuilder(coapMessage);
        }

        public static CoapMessage parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (CoapMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static CoapMessage parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (CoapMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static CoapMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CoapMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CoapMessage parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (CoapMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static CoapMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CoapMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CoapMessage parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (CoapMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static CoapMessage parseFrom(InputStream inputStream) throws IOException {
            return (CoapMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CoapMessage parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (CoapMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static CoapMessage parseFrom(j jVar) throws IOException {
            return (CoapMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static CoapMessage parseFrom(j jVar, t tVar) throws IOException {
            return (CoapMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface CoapMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getIp();

        int getPort();

        int getTargetId();

        CoapMessageType getType();

        int getTypeValue();

        ByteString getValue();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public enum CoapMessageType implements d0.c {
        READ(0),
        WRITE(1),
        NOTIFY(2),
        UNRECOGNIZED(-1);

        public static final int NOTIFY_VALUE = 2;
        public static final int READ_VALUE = 0;
        public static final int WRITE_VALUE = 1;
        private static final d0.d<CoapMessageType> internalValueMap = new d0.d<CoapMessageType>() { // from class: com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessageType.1
            @Override // com.google.protobuf.d0.d
            public CoapMessageType findValueByNumber(int i) {
                return CoapMessageType.forNumber(i);
            }
        };
        private final int value;

        public static final class CoapMessageTypeVerifier implements d0.e {
            static final d0.e INSTANCE = new CoapMessageTypeVerifier();

            private CoapMessageTypeVerifier() {
            }

            @Override // com.google.protobuf.d0.e
            public boolean isInRange(int i) {
                return CoapMessageType.forNumber(i) != null;
            }
        }

        CoapMessageType(int i) {
            this.value = i;
        }

        public static CoapMessageType forNumber(int i) {
            if (i == 0) {
                return READ;
            }
            if (i == 1) {
                return WRITE;
            }
            if (i != 2) {
                return null;
            }
            return NOTIFY;
        }

        public static d0.d<CoapMessageType> internalGetValueMap() {
            return internalValueMap;
        }

        public static d0.e internalGetVerifier() {
            return CoapMessageTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.d0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static CoapMessageType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class CoapMessages extends GeneratedMessageLite<CoapMessages, Builder> implements CoapMessagesOrBuilder {
        private static final CoapMessages DEFAULT_INSTANCE;
        public static final int MESSAGES_FIELD_NUMBER = 1;
        private static volatile vkh<CoapMessages> PARSER;
        private d0.i<CoapMessage> messages_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.a<CoapMessages, Builder> implements CoapMessagesOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllMessages(Iterable<? extends CoapMessage> iterable) {
                copyOnWrite();
                ((CoapMessages) this.instance).addAllMessages(iterable);
                return this;
            }

            public Builder addMessages(CoapMessage coapMessage) {
                copyOnWrite();
                ((CoapMessages) this.instance).addMessages(coapMessage);
                return this;
            }

            public Builder clearMessages() {
                copyOnWrite();
                ((CoapMessages) this.instance).clearMessages();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessagesOrBuilder
            public CoapMessage getMessages(int i) {
                return ((CoapMessages) this.instance).getMessages(i);
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessagesOrBuilder
            public int getMessagesCount() {
                return ((CoapMessages) this.instance).getMessagesCount();
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessagesOrBuilder
            public List<CoapMessage> getMessagesList() {
                return Collections.unmodifiableList(((CoapMessages) this.instance).getMessagesList());
            }

            public Builder removeMessages(int i) {
                copyOnWrite();
                ((CoapMessages) this.instance).removeMessages(i);
                return this;
            }

            public Builder setMessages(int i, CoapMessage coapMessage) {
                copyOnWrite();
                ((CoapMessages) this.instance).setMessages(i, coapMessage);
                return this;
            }

            private Builder() {
                super(CoapMessages.DEFAULT_INSTANCE);
            }

            public Builder addMessages(int i, CoapMessage coapMessage) {
                copyOnWrite();
                ((CoapMessages) this.instance).addMessages(i, coapMessage);
                return this;
            }

            public Builder setMessages(int i, CoapMessage.Builder builder) {
                copyOnWrite();
                ((CoapMessages) this.instance).setMessages(i, builder.build());
                return this;
            }

            public Builder addMessages(CoapMessage.Builder builder) {
                copyOnWrite();
                ((CoapMessages) this.instance).addMessages(builder.build());
                return this;
            }

            public Builder addMessages(int i, CoapMessage.Builder builder) {
                copyOnWrite();
                ((CoapMessages) this.instance).addMessages(i, builder.build());
                return this;
            }
        }

        static {
            CoapMessages coapMessages = new CoapMessages();
            DEFAULT_INSTANCE = coapMessages;
            GeneratedMessageLite.registerDefaultInstance(CoapMessages.class, coapMessages);
        }

        private CoapMessages() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMessages(Iterable<? extends CoapMessage> iterable) {
            ensureMessagesIsMutable();
            b.addAll((Iterable) iterable, (List) this.messages_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMessages(CoapMessage coapMessage) {
            coapMessage.getClass();
            ensureMessagesIsMutable();
            this.messages_.add(coapMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessages() {
            this.messages_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureMessagesIsMutable() {
            d0.i<CoapMessage> iVar = this.messages_;
            if (iVar.c()) {
                return;
            }
            this.messages_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        public static CoapMessages getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CoapMessages parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CoapMessages) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CoapMessages parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CoapMessages) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<CoapMessages> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMessages(int i) {
            ensureMessagesIsMutable();
            this.messages_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessages(int i, CoapMessage coapMessage) {
            coapMessage.getClass();
            ensureMessagesIsMutable();
            this.messages_.set(i, coapMessage);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CoapMessages();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"messages_", CoapMessage.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<CoapMessages> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (CoapMessages.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessagesOrBuilder
        public CoapMessage getMessages(int i) {
            return this.messages_.get(i);
        }

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessagesOrBuilder
        public int getMessagesCount() {
            return this.messages_.size();
        }

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapMessagesOrBuilder
        public List<CoapMessage> getMessagesList() {
            return this.messages_;
        }

        public CoapMessageOrBuilder getMessagesOrBuilder(int i) {
            return this.messages_.get(i);
        }

        public List<? extends CoapMessageOrBuilder> getMessagesOrBuilderList() {
            return this.messages_;
        }

        public static Builder newBuilder(CoapMessages coapMessages) {
            return DEFAULT_INSTANCE.createBuilder(coapMessages);
        }

        public static CoapMessages parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (CoapMessages) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static CoapMessages parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (CoapMessages) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static CoapMessages parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CoapMessages) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMessages(int i, CoapMessage coapMessage) {
            coapMessage.getClass();
            ensureMessagesIsMutable();
            this.messages_.add(i, coapMessage);
        }

        public static CoapMessages parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (CoapMessages) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static CoapMessages parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CoapMessages) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CoapMessages parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (CoapMessages) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static CoapMessages parseFrom(InputStream inputStream) throws IOException {
            return (CoapMessages) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CoapMessages parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (CoapMessages) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static CoapMessages parseFrom(j jVar) throws IOException {
            return (CoapMessages) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static CoapMessages parseFrom(j jVar, t tVar) throws IOException {
            return (CoapMessages) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface CoapMessagesOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        CoapMessage getMessages(int i);

        int getMessagesCount();

        List<CoapMessage> getMessagesList();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class CoapResponse extends GeneratedMessageLite<CoapResponse, Builder> implements CoapResponseOrBuilder {
        private static final CoapResponse DEFAULT_INSTANCE;
        public static final int HASVALUE_FIELD_NUMBER = 4;
        private static volatile vkh<CoapResponse> PARSER = null;
        public static final int SUCCESS_FIELD_NUMBER = 3;
        public static final int TARGETID_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 5;
        private boolean hasValue_;
        private boolean success_;
        private int targetId_;
        private int type_;
        private ByteString value_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.a<CoapResponse, Builder> implements CoapResponseOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearHasValue() {
                copyOnWrite();
                ((CoapResponse) this.instance).clearHasValue();
                return this;
            }

            public Builder clearSuccess() {
                copyOnWrite();
                ((CoapResponse) this.instance).clearSuccess();
                return this;
            }

            public Builder clearTargetId() {
                copyOnWrite();
                ((CoapResponse) this.instance).clearTargetId();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((CoapResponse) this.instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((CoapResponse) this.instance).clearValue();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponseOrBuilder
            public boolean getHasValue() {
                return ((CoapResponse) this.instance).getHasValue();
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponseOrBuilder
            public boolean getSuccess() {
                return ((CoapResponse) this.instance).getSuccess();
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponseOrBuilder
            public int getTargetId() {
                return ((CoapResponse) this.instance).getTargetId();
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponseOrBuilder
            public CoapMessageType getType() {
                return ((CoapResponse) this.instance).getType();
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponseOrBuilder
            public int getTypeValue() {
                return ((CoapResponse) this.instance).getTypeValue();
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponseOrBuilder
            public ByteString getValue() {
                return ((CoapResponse) this.instance).getValue();
            }

            public Builder setHasValue(boolean z) {
                copyOnWrite();
                ((CoapResponse) this.instance).setHasValue(z);
                return this;
            }

            public Builder setSuccess(boolean z) {
                copyOnWrite();
                ((CoapResponse) this.instance).setSuccess(z);
                return this;
            }

            public Builder setTargetId(int i) {
                copyOnWrite();
                ((CoapResponse) this.instance).setTargetId(i);
                return this;
            }

            public Builder setType(CoapMessageType coapMessageType) {
                copyOnWrite();
                ((CoapResponse) this.instance).setType(coapMessageType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((CoapResponse) this.instance).setTypeValue(i);
                return this;
            }

            public Builder setValue(ByteString byteString) {
                copyOnWrite();
                ((CoapResponse) this.instance).setValue(byteString);
                return this;
            }

            private Builder() {
                super(CoapResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            CoapResponse coapResponse = new CoapResponse();
            DEFAULT_INSTANCE = coapResponse;
            GeneratedMessageLite.registerDefaultInstance(CoapResponse.class, coapResponse);
        }

        private CoapResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasValue() {
            this.hasValue_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSuccess() {
            this.success_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTargetId() {
            this.targetId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static CoapResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CoapResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CoapResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CoapResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CoapResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<CoapResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasValue(boolean z) {
            this.hasValue_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSuccess(boolean z) {
            this.success_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTargetId(int i) {
            this.targetId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(CoapMessageType coapMessageType) {
            this.type_ = coapMessageType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(ByteString byteString) {
            byteString.getClass();
            this.value_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CoapResponse();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0007\u0004\u0007\u0005\n", new Object[]{"type_", "targetId_", "success_", "hasValue_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<CoapResponse> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (CoapResponse.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponseOrBuilder
        public boolean getHasValue() {
            return this.hasValue_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponseOrBuilder
        public boolean getSuccess() {
            return this.success_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponseOrBuilder
        public int getTargetId() {
            return this.targetId_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponseOrBuilder
        public CoapMessageType getType() {
            CoapMessageType coapMessageTypeForNumber = CoapMessageType.forNumber(this.type_);
            return coapMessageTypeForNumber == null ? CoapMessageType.UNRECOGNIZED : coapMessageTypeForNumber;
        }

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponseOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponseOrBuilder
        public ByteString getValue() {
            return this.value_;
        }

        public static Builder newBuilder(CoapResponse coapResponse) {
            return DEFAULT_INSTANCE.createBuilder(coapResponse);
        }

        public static CoapResponse parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (CoapResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static CoapResponse parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (CoapResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static CoapResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CoapResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CoapResponse parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (CoapResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static CoapResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CoapResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CoapResponse parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (CoapResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static CoapResponse parseFrom(InputStream inputStream) throws IOException {
            return (CoapResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CoapResponse parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (CoapResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static CoapResponse parseFrom(j jVar) throws IOException {
            return (CoapResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static CoapResponse parseFrom(j jVar, t tVar) throws IOException {
            return (CoapResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface CoapResponseOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        boolean getHasValue();

        boolean getSuccess();

        int getTargetId();

        CoapMessageType getType();

        int getTypeValue();

        ByteString getValue();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class CoapResponses extends GeneratedMessageLite<CoapResponses, Builder> implements CoapResponsesOrBuilder {
        private static final CoapResponses DEFAULT_INSTANCE;
        private static volatile vkh<CoapResponses> PARSER = null;
        public static final int RESPONSES_FIELD_NUMBER = 1;
        private d0.i<CoapResponse> responses_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.a<CoapResponses, Builder> implements CoapResponsesOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllResponses(Iterable<? extends CoapResponse> iterable) {
                copyOnWrite();
                ((CoapResponses) this.instance).addAllResponses(iterable);
                return this;
            }

            public Builder addResponses(CoapResponse coapResponse) {
                copyOnWrite();
                ((CoapResponses) this.instance).addResponses(coapResponse);
                return this;
            }

            public Builder clearResponses() {
                copyOnWrite();
                ((CoapResponses) this.instance).clearResponses();
                return this;
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponsesOrBuilder
            public CoapResponse getResponses(int i) {
                return ((CoapResponses) this.instance).getResponses(i);
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponsesOrBuilder
            public int getResponsesCount() {
                return ((CoapResponses) this.instance).getResponsesCount();
            }

            @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponsesOrBuilder
            public List<CoapResponse> getResponsesList() {
                return Collections.unmodifiableList(((CoapResponses) this.instance).getResponsesList());
            }

            public Builder removeResponses(int i) {
                copyOnWrite();
                ((CoapResponses) this.instance).removeResponses(i);
                return this;
            }

            public Builder setResponses(int i, CoapResponse coapResponse) {
                copyOnWrite();
                ((CoapResponses) this.instance).setResponses(i, coapResponse);
                return this;
            }

            private Builder() {
                super(CoapResponses.DEFAULT_INSTANCE);
            }

            public Builder addResponses(int i, CoapResponse coapResponse) {
                copyOnWrite();
                ((CoapResponses) this.instance).addResponses(i, coapResponse);
                return this;
            }

            public Builder setResponses(int i, CoapResponse.Builder builder) {
                copyOnWrite();
                ((CoapResponses) this.instance).setResponses(i, builder.build());
                return this;
            }

            public Builder addResponses(CoapResponse.Builder builder) {
                copyOnWrite();
                ((CoapResponses) this.instance).addResponses(builder.build());
                return this;
            }

            public Builder addResponses(int i, CoapResponse.Builder builder) {
                copyOnWrite();
                ((CoapResponses) this.instance).addResponses(i, builder.build());
                return this;
            }
        }

        static {
            CoapResponses coapResponses = new CoapResponses();
            DEFAULT_INSTANCE = coapResponses;
            GeneratedMessageLite.registerDefaultInstance(CoapResponses.class, coapResponses);
        }

        private CoapResponses() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllResponses(Iterable<? extends CoapResponse> iterable) {
            ensureResponsesIsMutable();
            b.addAll((Iterable) iterable, (List) this.responses_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResponses(CoapResponse coapResponse) {
            coapResponse.getClass();
            ensureResponsesIsMutable();
            this.responses_.add(coapResponse);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResponses() {
            this.responses_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureResponsesIsMutable() {
            d0.i<CoapResponse> iVar = this.responses_;
            if (iVar.c()) {
                return;
            }
            this.responses_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        public static CoapResponses getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CoapResponses parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CoapResponses) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CoapResponses parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CoapResponses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<CoapResponses> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeResponses(int i) {
            ensureResponsesIsMutable();
            this.responses_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponses(int i, CoapResponse coapResponse) {
            coapResponse.getClass();
            ensureResponsesIsMutable();
            this.responses_.set(i, coapResponse);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CoapResponses();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"responses_", CoapResponse.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<CoapResponses> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (CoapResponses.class) {
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

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponsesOrBuilder
        public CoapResponse getResponses(int i) {
            return this.responses_.get(i);
        }

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponsesOrBuilder
        public int getResponsesCount() {
            return this.responses_.size();
        }

        @Override // com.xiaomi.mi_connect_service.proto.CoapMessageProto.CoapResponsesOrBuilder
        public List<CoapResponse> getResponsesList() {
            return this.responses_;
        }

        public CoapResponseOrBuilder getResponsesOrBuilder(int i) {
            return this.responses_.get(i);
        }

        public List<? extends CoapResponseOrBuilder> getResponsesOrBuilderList() {
            return this.responses_;
        }

        public static Builder newBuilder(CoapResponses coapResponses) {
            return DEFAULT_INSTANCE.createBuilder(coapResponses);
        }

        public static CoapResponses parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (CoapResponses) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static CoapResponses parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return (CoapResponses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static CoapResponses parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CoapResponses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResponses(int i, CoapResponse coapResponse) {
            coapResponse.getClass();
            ensureResponsesIsMutable();
            this.responses_.add(i, coapResponse);
        }

        public static CoapResponses parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (CoapResponses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static CoapResponses parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CoapResponses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CoapResponses parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (CoapResponses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static CoapResponses parseFrom(InputStream inputStream) throws IOException {
            return (CoapResponses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CoapResponses parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (CoapResponses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static CoapResponses parseFrom(j jVar) throws IOException {
            return (CoapResponses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static CoapResponses parseFrom(j jVar, t tVar) throws IOException {
            return (CoapResponses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface CoapResponsesOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        CoapResponse getResponses(int i);

        int getResponsesCount();

        List<CoapResponse> getResponsesList();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private CoapMessageProto() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}

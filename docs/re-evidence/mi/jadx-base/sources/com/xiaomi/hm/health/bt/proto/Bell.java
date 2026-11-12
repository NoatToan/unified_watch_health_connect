package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.j;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import defpackage.bsf;
import defpackage.vkh;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public final class Bell {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Bell$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

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

    public static final class BellEventMessage extends GeneratedMessageLite<BellEventMessage, Builder> implements BellEventMessageOrBuilder {
        private static final BellEventMessage DEFAULT_INSTANCE;
        private static volatile vkh<BellEventMessage> PARSER = null;
        public static final int SLOT_FIELD_NUMBER = 3;
        public static final int USE_COUNT_FIELD_NUMBER = 1;
        public static final int USE_TIME_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private UseTimeSlot.UseTimeSlotMessage slot_;
        private int useCount_;
        private int useTime_;

        public static final class Builder extends GeneratedMessageLite.a<BellEventMessage, Builder> implements BellEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearSlot() {
                copyOnWrite();
                ((BellEventMessage) this.instance).clearSlot();
                return this;
            }

            public Builder clearUseCount() {
                copyOnWrite();
                ((BellEventMessage) this.instance).clearUseCount();
                return this;
            }

            public Builder clearUseTime() {
                copyOnWrite();
                ((BellEventMessage) this.instance).clearUseTime();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
            public UseTimeSlot.UseTimeSlotMessage getSlot() {
                return ((BellEventMessage) this.instance).getSlot();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
            public int getUseCount() {
                return ((BellEventMessage) this.instance).getUseCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
            public int getUseTime() {
                return ((BellEventMessage) this.instance).getUseTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
            public boolean hasSlot() {
                return ((BellEventMessage) this.instance).hasSlot();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
            public boolean hasUseCount() {
                return ((BellEventMessage) this.instance).hasUseCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
            public boolean hasUseTime() {
                return ((BellEventMessage) this.instance).hasUseTime();
            }

            public Builder mergeSlot(UseTimeSlot.UseTimeSlotMessage useTimeSlotMessage) {
                copyOnWrite();
                ((BellEventMessage) this.instance).mergeSlot(useTimeSlotMessage);
                return this;
            }

            public Builder setSlot(UseTimeSlot.UseTimeSlotMessage useTimeSlotMessage) {
                copyOnWrite();
                ((BellEventMessage) this.instance).setSlot(useTimeSlotMessage);
                return this;
            }

            public Builder setUseCount(int i) {
                copyOnWrite();
                ((BellEventMessage) this.instance).setUseCount(i);
                return this;
            }

            public Builder setUseTime(int i) {
                copyOnWrite();
                ((BellEventMessage) this.instance).setUseTime(i);
                return this;
            }

            private Builder() {
                super(BellEventMessage.DEFAULT_INSTANCE);
            }

            public Builder setSlot(UseTimeSlot.UseTimeSlotMessage.Builder builder) {
                copyOnWrite();
                ((BellEventMessage) this.instance).setSlot(builder.build());
                return this;
            }
        }

        static {
            BellEventMessage bellEventMessage = new BellEventMessage();
            DEFAULT_INSTANCE = bellEventMessage;
            GeneratedMessageLite.registerDefaultInstance(BellEventMessage.class, bellEventMessage);
        }

        private BellEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSlot() {
            this.slot_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUseCount() {
            this.bitField0_ &= -2;
            this.useCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUseTime() {
            this.bitField0_ &= -3;
            this.useTime_ = 0;
        }

        public static BellEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSlot(UseTimeSlot.UseTimeSlotMessage useTimeSlotMessage) {
            useTimeSlotMessage.getClass();
            UseTimeSlot.UseTimeSlotMessage useTimeSlotMessage2 = this.slot_;
            if (useTimeSlotMessage2 == null || useTimeSlotMessage2 == UseTimeSlot.UseTimeSlotMessage.getDefaultInstance()) {
                this.slot_ = useTimeSlotMessage;
            } else {
                this.slot_ = UseTimeSlot.UseTimeSlotMessage.newBuilder(this.slot_).mergeFrom(useTimeSlotMessage).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BellEventMessage parseDelimitedFrom(InputStream inputStream) {
            return (BellEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BellEventMessage parseFrom(ByteBuffer byteBuffer) {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<BellEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSlot(UseTimeSlot.UseTimeSlotMessage useTimeSlotMessage) {
            useTimeSlotMessage.getClass();
            this.slot_ = useTimeSlotMessage;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUseCount(int i) {
            this.bitField0_ |= 1;
            this.useCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUseTime(int i) {
            this.bitField0_ |= 2;
            this.useTime_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new BellEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "useCount_", "useTime_", "slot_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<BellEventMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (BellEventMessage.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
        public UseTimeSlot.UseTimeSlotMessage getSlot() {
            UseTimeSlot.UseTimeSlotMessage useTimeSlotMessage = this.slot_;
            return useTimeSlotMessage == null ? UseTimeSlot.UseTimeSlotMessage.getDefaultInstance() : useTimeSlotMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
        public int getUseCount() {
            return this.useCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
        public int getUseTime() {
            return this.useTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
        public boolean hasSlot() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
        public boolean hasUseCount() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
        public boolean hasUseTime() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(BellEventMessage bellEventMessage) {
            return DEFAULT_INSTANCE.createBuilder(bellEventMessage);
        }

        public static BellEventMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (BellEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static BellEventMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static BellEventMessage parseFrom(ByteString byteString) {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BellEventMessage parseFrom(ByteString byteString, t tVar) {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static BellEventMessage parseFrom(byte[] bArr) {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BellEventMessage parseFrom(byte[] bArr, t tVar) {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static BellEventMessage parseFrom(InputStream inputStream) {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BellEventMessage parseFrom(InputStream inputStream, t tVar) {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static BellEventMessage parseFrom(j jVar) {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static BellEventMessage parseFrom(j jVar, t tVar) {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface BellEventMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        UseTimeSlot.UseTimeSlotMessage getSlot();

        int getUseCount();

        int getUseTime();

        boolean hasSlot();

        boolean hasUseCount();

        boolean hasUseTime();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class BellStatisticsMessage extends GeneratedMessageLite<BellStatisticsMessage, Builder> implements BellStatisticsMessageOrBuilder {
        private static final BellStatisticsMessage DEFAULT_INSTANCE;
        public static final int LEFT_FIELD_NUMBER = 2;
        private static volatile vkh<BellStatisticsMessage> PARSER = null;
        public static final int RIGHT_FIELD_NUMBER = 3;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int bitField0_;
        private BellEventMessage left_;
        private byte memoizedIsInitialized = 2;
        private BellEventMessage right_;
        private int version_;

        public static final class Builder extends GeneratedMessageLite.a<BellStatisticsMessage, Builder> implements BellStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearLeft() {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).clearLeft();
                return this;
            }

            public Builder clearRight() {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).clearRight();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).clearVersion();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
            public BellEventMessage getLeft() {
                return ((BellStatisticsMessage) this.instance).getLeft();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
            public BellEventMessage getRight() {
                return ((BellStatisticsMessage) this.instance).getRight();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
            public int getVersion() {
                return ((BellStatisticsMessage) this.instance).getVersion();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
            public boolean hasLeft() {
                return ((BellStatisticsMessage) this.instance).hasLeft();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
            public boolean hasRight() {
                return ((BellStatisticsMessage) this.instance).hasRight();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
            public boolean hasVersion() {
                return ((BellStatisticsMessage) this.instance).hasVersion();
            }

            public Builder mergeLeft(BellEventMessage bellEventMessage) {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).mergeLeft(bellEventMessage);
                return this;
            }

            public Builder mergeRight(BellEventMessage bellEventMessage) {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).mergeRight(bellEventMessage);
                return this;
            }

            public Builder setLeft(BellEventMessage bellEventMessage) {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).setLeft(bellEventMessage);
                return this;
            }

            public Builder setRight(BellEventMessage bellEventMessage) {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).setRight(bellEventMessage);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).setVersion(i);
                return this;
            }

            private Builder() {
                super(BellStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setLeft(BellEventMessage.Builder builder) {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).setLeft(builder.build());
                return this;
            }

            public Builder setRight(BellEventMessage.Builder builder) {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).setRight(builder.build());
                return this;
            }
        }

        static {
            BellStatisticsMessage bellStatisticsMessage = new BellStatisticsMessage();
            DEFAULT_INSTANCE = bellStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(BellStatisticsMessage.class, bellStatisticsMessage);
        }

        private BellStatisticsMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeft() {
            this.left_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRight() {
            this.right_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.bitField0_ &= -2;
            this.version_ = 0;
        }

        public static BellStatisticsMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLeft(BellEventMessage bellEventMessage) {
            bellEventMessage.getClass();
            BellEventMessage bellEventMessage2 = this.left_;
            if (bellEventMessage2 == null || bellEventMessage2 == BellEventMessage.getDefaultInstance()) {
                this.left_ = bellEventMessage;
            } else {
                this.left_ = BellEventMessage.newBuilder(this.left_).mergeFrom(bellEventMessage).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRight(BellEventMessage bellEventMessage) {
            bellEventMessage.getClass();
            BellEventMessage bellEventMessage2 = this.right_;
            if (bellEventMessage2 == null || bellEventMessage2 == BellEventMessage.getDefaultInstance()) {
                this.right_ = bellEventMessage;
            } else {
                this.right_ = BellEventMessage.newBuilder(this.right_).mergeFrom(bellEventMessage).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BellStatisticsMessage parseDelimitedFrom(InputStream inputStream) {
            return (BellStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BellStatisticsMessage parseFrom(ByteBuffer byteBuffer) {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<BellStatisticsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeft(BellEventMessage bellEventMessage) {
            bellEventMessage.getClass();
            this.left_ = bellEventMessage;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRight(BellEventMessage bellEventMessage) {
            bellEventMessage.getClass();
            this.right_ = bellEventMessage;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i) {
            this.bitField0_ |= 1;
            this.version_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new BellStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "version_", "left_", "right_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<BellStatisticsMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (BellStatisticsMessage.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
        public BellEventMessage getLeft() {
            BellEventMessage bellEventMessage = this.left_;
            return bellEventMessage == null ? BellEventMessage.getDefaultInstance() : bellEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
        public BellEventMessage getRight() {
            BellEventMessage bellEventMessage = this.right_;
            return bellEventMessage == null ? BellEventMessage.getDefaultInstance() : bellEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
        public boolean hasLeft() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
        public boolean hasRight() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
        public boolean hasVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BellStatisticsMessage bellStatisticsMessage) {
            return DEFAULT_INSTANCE.createBuilder(bellStatisticsMessage);
        }

        public static BellStatisticsMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (BellStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static BellStatisticsMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static BellStatisticsMessage parseFrom(ByteString byteString) {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BellStatisticsMessage parseFrom(ByteString byteString, t tVar) {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static BellStatisticsMessage parseFrom(byte[] bArr) {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BellStatisticsMessage parseFrom(byte[] bArr, t tVar) {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static BellStatisticsMessage parseFrom(InputStream inputStream) {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BellStatisticsMessage parseFrom(InputStream inputStream, t tVar) {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static BellStatisticsMessage parseFrom(j jVar) {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static BellStatisticsMessage parseFrom(j jVar, t tVar) {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface BellStatisticsMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        BellEventMessage getLeft();

        BellEventMessage getRight();

        int getVersion();

        boolean hasLeft();

        boolean hasRight();

        boolean hasVersion();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private Bell() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}

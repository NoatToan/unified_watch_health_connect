package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.b;
import com.google.protobuf.d0;
import com.google.protobuf.j;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import defpackage.bsf;
import defpackage.vkh;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class UseTimeSlot {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.UseTimeSlot$1, reason: invalid class name */
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

    public static final class UseTimeSlotMessage extends GeneratedMessageLite<UseTimeSlotMessage, Builder> implements UseTimeSlotMessageOrBuilder {
        private static final UseTimeSlotMessage DEFAULT_INSTANCE;
        private static volatile vkh<UseTimeSlotMessage> PARSER = null;
        public static final int SLOT_FIELD_NUMBER = 1;
        private byte memoizedIsInitialized = 2;
        private d0.i<UseTimeSlotUnitMessage> slot_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.a<UseTimeSlotMessage, Builder> implements UseTimeSlotMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllSlot(Iterable<? extends UseTimeSlotUnitMessage> iterable) {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).addAllSlot(iterable);
                return this;
            }

            public Builder addSlot(UseTimeSlotUnitMessage useTimeSlotUnitMessage) {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).addSlot(useTimeSlotUnitMessage);
                return this;
            }

            public Builder clearSlot() {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).clearSlot();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotMessageOrBuilder
            public UseTimeSlotUnitMessage getSlot(int i) {
                return ((UseTimeSlotMessage) this.instance).getSlot(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotMessageOrBuilder
            public int getSlotCount() {
                return ((UseTimeSlotMessage) this.instance).getSlotCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotMessageOrBuilder
            public List<UseTimeSlotUnitMessage> getSlotList() {
                return Collections.unmodifiableList(((UseTimeSlotMessage) this.instance).getSlotList());
            }

            public Builder removeSlot(int i) {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).removeSlot(i);
                return this;
            }

            public Builder setSlot(int i, UseTimeSlotUnitMessage useTimeSlotUnitMessage) {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).setSlot(i, useTimeSlotUnitMessage);
                return this;
            }

            private Builder() {
                super(UseTimeSlotMessage.DEFAULT_INSTANCE);
            }

            public Builder addSlot(int i, UseTimeSlotUnitMessage useTimeSlotUnitMessage) {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).addSlot(i, useTimeSlotUnitMessage);
                return this;
            }

            public Builder setSlot(int i, UseTimeSlotUnitMessage.Builder builder) {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).setSlot(i, builder.build());
                return this;
            }

            public Builder addSlot(UseTimeSlotUnitMessage.Builder builder) {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).addSlot(builder.build());
                return this;
            }

            public Builder addSlot(int i, UseTimeSlotUnitMessage.Builder builder) {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).addSlot(i, builder.build());
                return this;
            }
        }

        static {
            UseTimeSlotMessage useTimeSlotMessage = new UseTimeSlotMessage();
            DEFAULT_INSTANCE = useTimeSlotMessage;
            GeneratedMessageLite.registerDefaultInstance(UseTimeSlotMessage.class, useTimeSlotMessage);
        }

        private UseTimeSlotMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSlot(Iterable<? extends UseTimeSlotUnitMessage> iterable) {
            ensureSlotIsMutable();
            b.addAll((Iterable) iterable, (List) this.slot_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSlot(UseTimeSlotUnitMessage useTimeSlotUnitMessage) {
            useTimeSlotUnitMessage.getClass();
            ensureSlotIsMutable();
            this.slot_.add(useTimeSlotUnitMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSlot() {
            this.slot_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureSlotIsMutable() {
            d0.i<UseTimeSlotUnitMessage> iVar = this.slot_;
            if (iVar.c()) {
                return;
            }
            this.slot_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        public static UseTimeSlotMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UseTimeSlotMessage parseDelimitedFrom(InputStream inputStream) {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UseTimeSlotMessage parseFrom(ByteBuffer byteBuffer) {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<UseTimeSlotMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSlot(int i) {
            ensureSlotIsMutable();
            this.slot_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSlot(int i, UseTimeSlotUnitMessage useTimeSlotUnitMessage) {
            useTimeSlotUnitMessage.getClass();
            ensureSlotIsMutable();
            this.slot_.set(i, useTimeSlotUnitMessage);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new UseTimeSlotMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"slot_", UseTimeSlotUnitMessage.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<UseTimeSlotMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (UseTimeSlotMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotMessageOrBuilder
        public UseTimeSlotUnitMessage getSlot(int i) {
            return this.slot_.get(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotMessageOrBuilder
        public int getSlotCount() {
            return this.slot_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotMessageOrBuilder
        public List<UseTimeSlotUnitMessage> getSlotList() {
            return this.slot_;
        }

        public UseTimeSlotUnitMessageOrBuilder getSlotOrBuilder(int i) {
            return this.slot_.get(i);
        }

        public List<? extends UseTimeSlotUnitMessageOrBuilder> getSlotOrBuilderList() {
            return this.slot_;
        }

        public static Builder newBuilder(UseTimeSlotMessage useTimeSlotMessage) {
            return DEFAULT_INSTANCE.createBuilder(useTimeSlotMessage);
        }

        public static UseTimeSlotMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static UseTimeSlotMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static UseTimeSlotMessage parseFrom(ByteString byteString) {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSlot(int i, UseTimeSlotUnitMessage useTimeSlotUnitMessage) {
            useTimeSlotUnitMessage.getClass();
            ensureSlotIsMutable();
            this.slot_.add(i, useTimeSlotUnitMessage);
        }

        public static UseTimeSlotMessage parseFrom(ByteString byteString, t tVar) {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static UseTimeSlotMessage parseFrom(byte[] bArr) {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UseTimeSlotMessage parseFrom(byte[] bArr, t tVar) {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static UseTimeSlotMessage parseFrom(InputStream inputStream) {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UseTimeSlotMessage parseFrom(InputStream inputStream, t tVar) {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static UseTimeSlotMessage parseFrom(j jVar) {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static UseTimeSlotMessage parseFrom(j jVar, t tVar) {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface UseTimeSlotMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        UseTimeSlotUnitMessage getSlot(int i);

        int getSlotCount();

        List<UseTimeSlotUnitMessage> getSlotList();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class UseTimeSlotUnitMessage extends GeneratedMessageLite<UseTimeSlotUnitMessage, Builder> implements UseTimeSlotUnitMessageOrBuilder {
        public static final int BATTERY_FIELD_NUMBER = 3;
        private static final UseTimeSlotUnitMessage DEFAULT_INSTANCE;
        public static final int MODE_FIELD_NUMBER = 2;
        private static volatile vkh<UseTimeSlotUnitMessage> PARSER = null;
        public static final int TIME_FIELD_NUMBER = 1;
        private int battery_;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int mode_;
        private int time_;

        public static final class Builder extends GeneratedMessageLite.a<UseTimeSlotUnitMessage, Builder> implements UseTimeSlotUnitMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBattery() {
                copyOnWrite();
                ((UseTimeSlotUnitMessage) this.instance).clearBattery();
                return this;
            }

            public Builder clearMode() {
                copyOnWrite();
                ((UseTimeSlotUnitMessage) this.instance).clearMode();
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                ((UseTimeSlotUnitMessage) this.instance).clearTime();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
            public int getBattery() {
                return ((UseTimeSlotUnitMessage) this.instance).getBattery();
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
            public int getMode() {
                return ((UseTimeSlotUnitMessage) this.instance).getMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
            public int getTime() {
                return ((UseTimeSlotUnitMessage) this.instance).getTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
            public boolean hasBattery() {
                return ((UseTimeSlotUnitMessage) this.instance).hasBattery();
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
            public boolean hasMode() {
                return ((UseTimeSlotUnitMessage) this.instance).hasMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
            public boolean hasTime() {
                return ((UseTimeSlotUnitMessage) this.instance).hasTime();
            }

            public Builder setBattery(int i) {
                copyOnWrite();
                ((UseTimeSlotUnitMessage) this.instance).setBattery(i);
                return this;
            }

            public Builder setMode(int i) {
                copyOnWrite();
                ((UseTimeSlotUnitMessage) this.instance).setMode(i);
                return this;
            }

            public Builder setTime(int i) {
                copyOnWrite();
                ((UseTimeSlotUnitMessage) this.instance).setTime(i);
                return this;
            }

            private Builder() {
                super(UseTimeSlotUnitMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            UseTimeSlotUnitMessage useTimeSlotUnitMessage = new UseTimeSlotUnitMessage();
            DEFAULT_INSTANCE = useTimeSlotUnitMessage;
            GeneratedMessageLite.registerDefaultInstance(UseTimeSlotUnitMessage.class, useTimeSlotUnitMessage);
        }

        private UseTimeSlotUnitMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBattery() {
            this.bitField0_ &= -5;
            this.battery_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMode() {
            this.bitField0_ &= -3;
            this.mode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTime() {
            this.bitField0_ &= -2;
            this.time_ = 0;
        }

        public static UseTimeSlotUnitMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UseTimeSlotUnitMessage parseDelimitedFrom(InputStream inputStream) {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UseTimeSlotUnitMessage parseFrom(ByteBuffer byteBuffer) {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<UseTimeSlotUnitMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBattery(int i) {
            this.bitField0_ |= 4;
            this.battery_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMode(int i) {
            this.bitField0_ |= 2;
            this.mode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTime(int i) {
            this.bitField0_ |= 1;
            this.time_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new UseTimeSlotUnitMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"bitField0_", "time_", "mode_", "battery_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<UseTimeSlotUnitMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (UseTimeSlotUnitMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
        public int getBattery() {
            return this.battery_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
        public int getMode() {
            return this.mode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
        public int getTime() {
            return this.time_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
        public boolean hasBattery() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
        public boolean hasMode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
        public boolean hasTime() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(UseTimeSlotUnitMessage useTimeSlotUnitMessage) {
            return DEFAULT_INSTANCE.createBuilder(useTimeSlotUnitMessage);
        }

        public static UseTimeSlotUnitMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static UseTimeSlotUnitMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static UseTimeSlotUnitMessage parseFrom(ByteString byteString) {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UseTimeSlotUnitMessage parseFrom(ByteString byteString, t tVar) {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static UseTimeSlotUnitMessage parseFrom(byte[] bArr) {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UseTimeSlotUnitMessage parseFrom(byte[] bArr, t tVar) {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static UseTimeSlotUnitMessage parseFrom(InputStream inputStream) {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UseTimeSlotUnitMessage parseFrom(InputStream inputStream, t tVar) {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static UseTimeSlotUnitMessage parseFrom(j jVar) {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static UseTimeSlotUnitMessage parseFrom(j jVar, t tVar) {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface UseTimeSlotUnitMessageOrBuilder extends bsf {
        int getBattery();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getMode();

        int getTime();

        boolean hasBattery();

        boolean hasMode();

        boolean hasTime();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private UseTimeSlot() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}

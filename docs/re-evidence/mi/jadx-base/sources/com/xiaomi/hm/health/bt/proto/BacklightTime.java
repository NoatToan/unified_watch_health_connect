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
public final class BacklightTime {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.BacklightTime$1, reason: invalid class name */
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

    public static final class BacklightTimeDayMessage extends GeneratedMessageLite<BacklightTimeDayMessage, Builder> implements BacklightTimeDayMessageOrBuilder {
        private static final BacklightTimeDayMessage DEFAULT_INSTANCE;
        public static final int LCDONTIMEBYEVENT_FIELD_NUMBER = 2;
        public static final int LCDONTIMEBYPRESS_FIELD_NUMBER = 1;
        private static volatile vkh<BacklightTimeDayMessage> PARSER;
        private d0.g lcdOnTimeByPress_ = GeneratedMessageLite.emptyIntList();
        private d0.g lcdOnTimeByEvent_ = GeneratedMessageLite.emptyIntList();

        public static final class Builder extends GeneratedMessageLite.a<BacklightTimeDayMessage, Builder> implements BacklightTimeDayMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllLcdOnTimeByEvent(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((BacklightTimeDayMessage) this.instance).addAllLcdOnTimeByEvent(iterable);
                return this;
            }

            public Builder addAllLcdOnTimeByPress(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((BacklightTimeDayMessage) this.instance).addAllLcdOnTimeByPress(iterable);
                return this;
            }

            public Builder addLcdOnTimeByEvent(int i) {
                copyOnWrite();
                ((BacklightTimeDayMessage) this.instance).addLcdOnTimeByEvent(i);
                return this;
            }

            public Builder addLcdOnTimeByPress(int i) {
                copyOnWrite();
                ((BacklightTimeDayMessage) this.instance).addLcdOnTimeByPress(i);
                return this;
            }

            public Builder clearLcdOnTimeByEvent() {
                copyOnWrite();
                ((BacklightTimeDayMessage) this.instance).clearLcdOnTimeByEvent();
                return this;
            }

            public Builder clearLcdOnTimeByPress() {
                copyOnWrite();
                ((BacklightTimeDayMessage) this.instance).clearLcdOnTimeByPress();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
            public int getLcdOnTimeByEvent(int i) {
                return ((BacklightTimeDayMessage) this.instance).getLcdOnTimeByEvent(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
            public int getLcdOnTimeByEventCount() {
                return ((BacklightTimeDayMessage) this.instance).getLcdOnTimeByEventCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
            public List<Integer> getLcdOnTimeByEventList() {
                return Collections.unmodifiableList(((BacklightTimeDayMessage) this.instance).getLcdOnTimeByEventList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
            public int getLcdOnTimeByPress(int i) {
                return ((BacklightTimeDayMessage) this.instance).getLcdOnTimeByPress(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
            public int getLcdOnTimeByPressCount() {
                return ((BacklightTimeDayMessage) this.instance).getLcdOnTimeByPressCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
            public List<Integer> getLcdOnTimeByPressList() {
                return Collections.unmodifiableList(((BacklightTimeDayMessage) this.instance).getLcdOnTimeByPressList());
            }

            public Builder setLcdOnTimeByEvent(int i, int i2) {
                copyOnWrite();
                ((BacklightTimeDayMessage) this.instance).setLcdOnTimeByEvent(i, i2);
                return this;
            }

            public Builder setLcdOnTimeByPress(int i, int i2) {
                copyOnWrite();
                ((BacklightTimeDayMessage) this.instance).setLcdOnTimeByPress(i, i2);
                return this;
            }

            private Builder() {
                super(BacklightTimeDayMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            BacklightTimeDayMessage backlightTimeDayMessage = new BacklightTimeDayMessage();
            DEFAULT_INSTANCE = backlightTimeDayMessage;
            GeneratedMessageLite.registerDefaultInstance(BacklightTimeDayMessage.class, backlightTimeDayMessage);
        }

        private BacklightTimeDayMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLcdOnTimeByEvent(Iterable<? extends Integer> iterable) {
            ensureLcdOnTimeByEventIsMutable();
            b.addAll((Iterable) iterable, (List) this.lcdOnTimeByEvent_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLcdOnTimeByPress(Iterable<? extends Integer> iterable) {
            ensureLcdOnTimeByPressIsMutable();
            b.addAll((Iterable) iterable, (List) this.lcdOnTimeByPress_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLcdOnTimeByEvent(int i) {
            ensureLcdOnTimeByEventIsMutable();
            this.lcdOnTimeByEvent_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLcdOnTimeByPress(int i) {
            ensureLcdOnTimeByPressIsMutable();
            this.lcdOnTimeByPress_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnTimeByEvent() {
            this.lcdOnTimeByEvent_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnTimeByPress() {
            this.lcdOnTimeByPress_ = GeneratedMessageLite.emptyIntList();
        }

        private void ensureLcdOnTimeByEventIsMutable() {
            d0.g gVar = this.lcdOnTimeByEvent_;
            if (gVar.c()) {
                return;
            }
            this.lcdOnTimeByEvent_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureLcdOnTimeByPressIsMutable() {
            d0.g gVar = this.lcdOnTimeByPress_;
            if (gVar.c()) {
                return;
            }
            this.lcdOnTimeByPress_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        public static BacklightTimeDayMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BacklightTimeDayMessage parseDelimitedFrom(InputStream inputStream) {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BacklightTimeDayMessage parseFrom(ByteBuffer byteBuffer) {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<BacklightTimeDayMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnTimeByEvent(int i, int i2) {
            ensureLcdOnTimeByEventIsMutable();
            this.lcdOnTimeByEvent_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnTimeByPress(int i, int i2) {
            ensureLcdOnTimeByPressIsMutable();
            this.lcdOnTimeByPress_.K(i, i2);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new BacklightTimeDayMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001d\u0002\u001d", new Object[]{"lcdOnTimeByPress_", "lcdOnTimeByEvent_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<BacklightTimeDayMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (BacklightTimeDayMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
        public int getLcdOnTimeByEvent(int i) {
            return this.lcdOnTimeByEvent_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
        public int getLcdOnTimeByEventCount() {
            return this.lcdOnTimeByEvent_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
        public List<Integer> getLcdOnTimeByEventList() {
            return this.lcdOnTimeByEvent_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
        public int getLcdOnTimeByPress(int i) {
            return this.lcdOnTimeByPress_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
        public int getLcdOnTimeByPressCount() {
            return this.lcdOnTimeByPress_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
        public List<Integer> getLcdOnTimeByPressList() {
            return this.lcdOnTimeByPress_;
        }

        public static Builder newBuilder(BacklightTimeDayMessage backlightTimeDayMessage) {
            return DEFAULT_INSTANCE.createBuilder(backlightTimeDayMessage);
        }

        public static BacklightTimeDayMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static BacklightTimeDayMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static BacklightTimeDayMessage parseFrom(ByteString byteString) {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BacklightTimeDayMessage parseFrom(ByteString byteString, t tVar) {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static BacklightTimeDayMessage parseFrom(byte[] bArr) {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BacklightTimeDayMessage parseFrom(byte[] bArr, t tVar) {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static BacklightTimeDayMessage parseFrom(InputStream inputStream) {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BacklightTimeDayMessage parseFrom(InputStream inputStream, t tVar) {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static BacklightTimeDayMessage parseFrom(j jVar) {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static BacklightTimeDayMessage parseFrom(j jVar, t tVar) {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface BacklightTimeDayMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getLcdOnTimeByEvent(int i);

        int getLcdOnTimeByEventCount();

        List<Integer> getLcdOnTimeByEventList();

        int getLcdOnTimeByPress(int i);

        int getLcdOnTimeByPressCount();

        List<Integer> getLcdOnTimeByPressList();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class BacklightTimeWeekMessage extends GeneratedMessageLite<BacklightTimeWeekMessage, Builder> implements BacklightTimeWeekMessageOrBuilder {
        private static final BacklightTimeWeekMessage DEFAULT_INSTANCE;
        public static final int LCDONDAYTIME_FIELD_NUMBER = 1;
        private static volatile vkh<BacklightTimeWeekMessage> PARSER;
        private d0.i<BacklightTimeDayMessage> lcdOnDayTime_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.a<BacklightTimeWeekMessage, Builder> implements BacklightTimeWeekMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllLcdOnDayTime(Iterable<? extends BacklightTimeDayMessage> iterable) {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).addAllLcdOnDayTime(iterable);
                return this;
            }

            public Builder addLcdOnDayTime(BacklightTimeDayMessage backlightTimeDayMessage) {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).addLcdOnDayTime(backlightTimeDayMessage);
                return this;
            }

            public Builder clearLcdOnDayTime() {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).clearLcdOnDayTime();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeWeekMessageOrBuilder
            public BacklightTimeDayMessage getLcdOnDayTime(int i) {
                return ((BacklightTimeWeekMessage) this.instance).getLcdOnDayTime(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeWeekMessageOrBuilder
            public int getLcdOnDayTimeCount() {
                return ((BacklightTimeWeekMessage) this.instance).getLcdOnDayTimeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeWeekMessageOrBuilder
            public List<BacklightTimeDayMessage> getLcdOnDayTimeList() {
                return Collections.unmodifiableList(((BacklightTimeWeekMessage) this.instance).getLcdOnDayTimeList());
            }

            public Builder removeLcdOnDayTime(int i) {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).removeLcdOnDayTime(i);
                return this;
            }

            public Builder setLcdOnDayTime(int i, BacklightTimeDayMessage backlightTimeDayMessage) {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).setLcdOnDayTime(i, backlightTimeDayMessage);
                return this;
            }

            private Builder() {
                super(BacklightTimeWeekMessage.DEFAULT_INSTANCE);
            }

            public Builder addLcdOnDayTime(int i, BacklightTimeDayMessage backlightTimeDayMessage) {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).addLcdOnDayTime(i, backlightTimeDayMessage);
                return this;
            }

            public Builder setLcdOnDayTime(int i, BacklightTimeDayMessage.Builder builder) {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).setLcdOnDayTime(i, builder.build());
                return this;
            }

            public Builder addLcdOnDayTime(BacklightTimeDayMessage.Builder builder) {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).addLcdOnDayTime(builder.build());
                return this;
            }

            public Builder addLcdOnDayTime(int i, BacklightTimeDayMessage.Builder builder) {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).addLcdOnDayTime(i, builder.build());
                return this;
            }
        }

        static {
            BacklightTimeWeekMessage backlightTimeWeekMessage = new BacklightTimeWeekMessage();
            DEFAULT_INSTANCE = backlightTimeWeekMessage;
            GeneratedMessageLite.registerDefaultInstance(BacklightTimeWeekMessage.class, backlightTimeWeekMessage);
        }

        private BacklightTimeWeekMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLcdOnDayTime(Iterable<? extends BacklightTimeDayMessage> iterable) {
            ensureLcdOnDayTimeIsMutable();
            b.addAll((Iterable) iterable, (List) this.lcdOnDayTime_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLcdOnDayTime(BacklightTimeDayMessage backlightTimeDayMessage) {
            backlightTimeDayMessage.getClass();
            ensureLcdOnDayTimeIsMutable();
            this.lcdOnDayTime_.add(backlightTimeDayMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnDayTime() {
            this.lcdOnDayTime_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureLcdOnDayTimeIsMutable() {
            d0.i<BacklightTimeDayMessage> iVar = this.lcdOnDayTime_;
            if (iVar.c()) {
                return;
            }
            this.lcdOnDayTime_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        public static BacklightTimeWeekMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BacklightTimeWeekMessage parseDelimitedFrom(InputStream inputStream) {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BacklightTimeWeekMessage parseFrom(ByteBuffer byteBuffer) {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<BacklightTimeWeekMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLcdOnDayTime(int i) {
            ensureLcdOnDayTimeIsMutable();
            this.lcdOnDayTime_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnDayTime(int i, BacklightTimeDayMessage backlightTimeDayMessage) {
            backlightTimeDayMessage.getClass();
            ensureLcdOnDayTimeIsMutable();
            this.lcdOnDayTime_.set(i, backlightTimeDayMessage);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new BacklightTimeWeekMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"lcdOnDayTime_", BacklightTimeDayMessage.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<BacklightTimeWeekMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (BacklightTimeWeekMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeWeekMessageOrBuilder
        public BacklightTimeDayMessage getLcdOnDayTime(int i) {
            return this.lcdOnDayTime_.get(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeWeekMessageOrBuilder
        public int getLcdOnDayTimeCount() {
            return this.lcdOnDayTime_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeWeekMessageOrBuilder
        public List<BacklightTimeDayMessage> getLcdOnDayTimeList() {
            return this.lcdOnDayTime_;
        }

        public BacklightTimeDayMessageOrBuilder getLcdOnDayTimeOrBuilder(int i) {
            return this.lcdOnDayTime_.get(i);
        }

        public List<? extends BacklightTimeDayMessageOrBuilder> getLcdOnDayTimeOrBuilderList() {
            return this.lcdOnDayTime_;
        }

        public static Builder newBuilder(BacklightTimeWeekMessage backlightTimeWeekMessage) {
            return DEFAULT_INSTANCE.createBuilder(backlightTimeWeekMessage);
        }

        public static BacklightTimeWeekMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static BacklightTimeWeekMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static BacklightTimeWeekMessage parseFrom(ByteString byteString) {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLcdOnDayTime(int i, BacklightTimeDayMessage backlightTimeDayMessage) {
            backlightTimeDayMessage.getClass();
            ensureLcdOnDayTimeIsMutable();
            this.lcdOnDayTime_.add(i, backlightTimeDayMessage);
        }

        public static BacklightTimeWeekMessage parseFrom(ByteString byteString, t tVar) {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static BacklightTimeWeekMessage parseFrom(byte[] bArr) {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BacklightTimeWeekMessage parseFrom(byte[] bArr, t tVar) {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static BacklightTimeWeekMessage parseFrom(InputStream inputStream) {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BacklightTimeWeekMessage parseFrom(InputStream inputStream, t tVar) {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static BacklightTimeWeekMessage parseFrom(j jVar) {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static BacklightTimeWeekMessage parseFrom(j jVar, t tVar) {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface BacklightTimeWeekMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        BacklightTimeDayMessage getLcdOnDayTime(int i);

        int getLcdOnDayTimeCount();

        List<BacklightTimeDayMessage> getLcdOnDayTimeList();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private BacklightTime() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}

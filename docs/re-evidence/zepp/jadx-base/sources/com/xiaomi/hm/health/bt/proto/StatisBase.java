package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class StatisBase {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.StatisBase$1, reason: invalid class name */
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

    public static final class StatisBaseMessage extends GeneratedMessageLite<StatisBaseMessage, Builder> implements StatisBaseMessageOrBuilder {
        public static final int ALARMSCOUNT_FIELD_NUMBER = 16;
        public static final int ALGTIME_FIELD_NUMBER = 8;
        public static final int APPNOTIFYCOUNT_FIELD_NUMBER = 13;
        public static final int CONNTIME_FIELD_NUMBER = 6;
        private static final StatisBaseMessage DEFAULT_INSTANCE;
        public static final int DISCONNECTCOUNT_FIELD_NUMBER = 10;
        public static final int FLASHTIME_FIELD_NUMBER = 5;
        public static final int KEYCOUNT_FIELD_NUMBER = 11;
        public static final int LCDTIME_FIELD_NUMBER = 4;
        public static final int LIFTWRISTCOUNT_FIELD_NUMBER = 12;
        private static volatile Parser<StatisBaseMessage> PARSER = null;
        public static final int PHONECOUNT_FIELD_NUMBER = 14;
        public static final int PPGTIME_FIELD_NUMBER = 2;
        public static final int REBOOTCOUNT_FIELD_NUMBER = 9;
        public static final int RUNTIME_FIELD_NUMBER = 7;
        public static final int SEDCOUNT_FIELD_NUMBER = 15;
        public static final int UPTIME_FIELD_NUMBER = 1;
        public static final int VIBTIME_FIELD_NUMBER = 3;
        private int alarmsCount_;
        private int algTime_;
        private int appNotifyCount_;
        private int bitField0_;
        private int connTime_;
        private int disconnectCount_;
        private int flashTime_;
        private int keyCount_;
        private int lcdTime_;
        private int liftWristCount_;
        private byte memoizedIsInitialized = 2;
        private int phoneCount_;
        private int ppgTime_;
        private int rebootCount_;
        private int runTime_;
        private int sedCount_;
        private int upTime_;
        private int vibTime_;

        public static final class Builder extends GeneratedMessageLite.Builder<StatisBaseMessage, Builder> implements StatisBaseMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmsCount() {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).clearAlarmsCount();
                return this;
            }

            public Builder clearAlgTime() {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).clearAlgTime();
                return this;
            }

            public Builder clearAppNotifyCount() {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).clearAppNotifyCount();
                return this;
            }

            public Builder clearConnTime() {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).clearConnTime();
                return this;
            }

            public Builder clearDisconnectCount() {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).clearDisconnectCount();
                return this;
            }

            public Builder clearFlashTime() {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).clearFlashTime();
                return this;
            }

            public Builder clearKeyCount() {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).clearKeyCount();
                return this;
            }

            public Builder clearLcdTime() {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).clearLcdTime();
                return this;
            }

            public Builder clearLiftWristCount() {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).clearLiftWristCount();
                return this;
            }

            public Builder clearPhoneCount() {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).clearPhoneCount();
                return this;
            }

            public Builder clearPpgTime() {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).clearPpgTime();
                return this;
            }

            public Builder clearRebootCount() {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).clearRebootCount();
                return this;
            }

            public Builder clearRunTime() {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).clearRunTime();
                return this;
            }

            public Builder clearSedCount() {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).clearSedCount();
                return this;
            }

            public Builder clearUpTime() {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).clearUpTime();
                return this;
            }

            public Builder clearVibTime() {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).clearVibTime();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public int getAlarmsCount() {
                return ((StatisBaseMessage) this.instance).getAlarmsCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public int getAlgTime() {
                return ((StatisBaseMessage) this.instance).getAlgTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public int getAppNotifyCount() {
                return ((StatisBaseMessage) this.instance).getAppNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public int getConnTime() {
                return ((StatisBaseMessage) this.instance).getConnTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public int getDisconnectCount() {
                return ((StatisBaseMessage) this.instance).getDisconnectCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public int getFlashTime() {
                return ((StatisBaseMessage) this.instance).getFlashTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public int getKeyCount() {
                return ((StatisBaseMessage) this.instance).getKeyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public int getLcdTime() {
                return ((StatisBaseMessage) this.instance).getLcdTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public int getLiftWristCount() {
                return ((StatisBaseMessage) this.instance).getLiftWristCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public int getPhoneCount() {
                return ((StatisBaseMessage) this.instance).getPhoneCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public int getPpgTime() {
                return ((StatisBaseMessage) this.instance).getPpgTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public int getRebootCount() {
                return ((StatisBaseMessage) this.instance).getRebootCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public int getRunTime() {
                return ((StatisBaseMessage) this.instance).getRunTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public int getSedCount() {
                return ((StatisBaseMessage) this.instance).getSedCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public int getUpTime() {
                return ((StatisBaseMessage) this.instance).getUpTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public int getVibTime() {
                return ((StatisBaseMessage) this.instance).getVibTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public boolean hasAlarmsCount() {
                return ((StatisBaseMessage) this.instance).hasAlarmsCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public boolean hasAlgTime() {
                return ((StatisBaseMessage) this.instance).hasAlgTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public boolean hasAppNotifyCount() {
                return ((StatisBaseMessage) this.instance).hasAppNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public boolean hasConnTime() {
                return ((StatisBaseMessage) this.instance).hasConnTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public boolean hasDisconnectCount() {
                return ((StatisBaseMessage) this.instance).hasDisconnectCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public boolean hasFlashTime() {
                return ((StatisBaseMessage) this.instance).hasFlashTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public boolean hasKeyCount() {
                return ((StatisBaseMessage) this.instance).hasKeyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public boolean hasLcdTime() {
                return ((StatisBaseMessage) this.instance).hasLcdTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public boolean hasLiftWristCount() {
                return ((StatisBaseMessage) this.instance).hasLiftWristCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public boolean hasPhoneCount() {
                return ((StatisBaseMessage) this.instance).hasPhoneCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public boolean hasPpgTime() {
                return ((StatisBaseMessage) this.instance).hasPpgTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public boolean hasRebootCount() {
                return ((StatisBaseMessage) this.instance).hasRebootCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public boolean hasRunTime() {
                return ((StatisBaseMessage) this.instance).hasRunTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public boolean hasSedCount() {
                return ((StatisBaseMessage) this.instance).hasSedCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public boolean hasUpTime() {
                return ((StatisBaseMessage) this.instance).hasUpTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
            public boolean hasVibTime() {
                return ((StatisBaseMessage) this.instance).hasVibTime();
            }

            public Builder setAlarmsCount(int value) {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).setAlarmsCount(value);
                return this;
            }

            public Builder setAlgTime(int value) {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).setAlgTime(value);
                return this;
            }

            public Builder setAppNotifyCount(int value) {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).setAppNotifyCount(value);
                return this;
            }

            public Builder setConnTime(int value) {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).setConnTime(value);
                return this;
            }

            public Builder setDisconnectCount(int value) {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).setDisconnectCount(value);
                return this;
            }

            public Builder setFlashTime(int value) {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).setFlashTime(value);
                return this;
            }

            public Builder setKeyCount(int value) {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).setKeyCount(value);
                return this;
            }

            public Builder setLcdTime(int value) {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).setLcdTime(value);
                return this;
            }

            public Builder setLiftWristCount(int value) {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).setLiftWristCount(value);
                return this;
            }

            public Builder setPhoneCount(int value) {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).setPhoneCount(value);
                return this;
            }

            public Builder setPpgTime(int value) {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).setPpgTime(value);
                return this;
            }

            public Builder setRebootCount(int value) {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).setRebootCount(value);
                return this;
            }

            public Builder setRunTime(int value) {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).setRunTime(value);
                return this;
            }

            public Builder setSedCount(int value) {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).setSedCount(value);
                return this;
            }

            public Builder setUpTime(int value) {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).setUpTime(value);
                return this;
            }

            public Builder setVibTime(int value) {
                copyOnWrite();
                ((StatisBaseMessage) this.instance).setVibTime(value);
                return this;
            }

            private Builder() {
                super(StatisBaseMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            StatisBaseMessage statisBaseMessage = new StatisBaseMessage();
            DEFAULT_INSTANCE = statisBaseMessage;
            GeneratedMessageLite.registerDefaultInstance(StatisBaseMessage.class, statisBaseMessage);
        }

        private StatisBaseMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmsCount() {
            this.bitField0_ &= -32769;
            this.alarmsCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlgTime() {
            this.bitField0_ &= -129;
            this.algTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppNotifyCount() {
            this.bitField0_ &= -4097;
            this.appNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnTime() {
            this.bitField0_ &= -33;
            this.connTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisconnectCount() {
            this.bitField0_ &= -513;
            this.disconnectCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlashTime() {
            this.bitField0_ &= -17;
            this.flashTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyCount() {
            this.bitField0_ &= -1025;
            this.keyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdTime() {
            this.bitField0_ &= -9;
            this.lcdTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLiftWristCount() {
            this.bitField0_ &= -2049;
            this.liftWristCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhoneCount() {
            this.bitField0_ &= -8193;
            this.phoneCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPpgTime() {
            this.bitField0_ &= -3;
            this.ppgTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRebootCount() {
            this.bitField0_ &= -257;
            this.rebootCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRunTime() {
            this.bitField0_ &= -65;
            this.runTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSedCount() {
            this.bitField0_ &= -16385;
            this.sedCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpTime() {
            this.bitField0_ &= -2;
            this.upTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVibTime() {
            this.bitField0_ &= -5;
            this.vibTime_ = 0;
        }

        public static StatisBaseMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StatisBaseMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (StatisBaseMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static StatisBaseMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (StatisBaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<StatisBaseMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmsCount(int value) {
            this.bitField0_ |= 32768;
            this.alarmsCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlgTime(int value) {
            this.bitField0_ |= 128;
            this.algTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppNotifyCount(int value) {
            this.bitField0_ |= 4096;
            this.appNotifyCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnTime(int value) {
            this.bitField0_ |= 32;
            this.connTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisconnectCount(int value) {
            this.bitField0_ |= 512;
            this.disconnectCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlashTime(int value) {
            this.bitField0_ |= 16;
            this.flashTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyCount(int value) {
            this.bitField0_ |= 1024;
            this.keyCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdTime(int value) {
            this.bitField0_ |= 8;
            this.lcdTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLiftWristCount(int value) {
            this.bitField0_ |= 2048;
            this.liftWristCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneCount(int value) {
            this.bitField0_ |= 8192;
            this.phoneCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPpgTime(int value) {
            this.bitField0_ |= 2;
            this.ppgTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebootCount(int value) {
            this.bitField0_ |= 256;
            this.rebootCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRunTime(int value) {
            this.bitField0_ |= 64;
            this.runTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSedCount(int value) {
            this.bitField0_ |= 16384;
            this.sedCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpTime(int value) {
            this.bitField0_ |= 1;
            this.upTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVibTime(int value) {
            this.bitField0_ |= 4;
            this.vibTime_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new StatisBaseMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0010\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f", new Object[]{"bitField0_", "upTime_", "ppgTime_", "vibTime_", "lcdTime_", "flashTime_", "connTime_", "runTime_", "algTime_", "rebootCount_", "disconnectCount_", "keyCount_", "liftWristCount_", "appNotifyCount_", "phoneCount_", "sedCount_", "alarmsCount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StatisBaseMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (StatisBaseMessage.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public int getAlarmsCount() {
            return this.alarmsCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public int getAlgTime() {
            return this.algTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public int getAppNotifyCount() {
            return this.appNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public int getConnTime() {
            return this.connTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public int getDisconnectCount() {
            return this.disconnectCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public int getFlashTime() {
            return this.flashTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public int getKeyCount() {
            return this.keyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public int getLcdTime() {
            return this.lcdTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public int getLiftWristCount() {
            return this.liftWristCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public int getPhoneCount() {
            return this.phoneCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public int getPpgTime() {
            return this.ppgTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public int getRebootCount() {
            return this.rebootCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public int getRunTime() {
            return this.runTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public int getSedCount() {
            return this.sedCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public int getUpTime() {
            return this.upTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public int getVibTime() {
            return this.vibTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public boolean hasAlarmsCount() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public boolean hasAlgTime() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public boolean hasAppNotifyCount() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public boolean hasConnTime() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public boolean hasDisconnectCount() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public boolean hasFlashTime() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public boolean hasKeyCount() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public boolean hasLcdTime() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public boolean hasLiftWristCount() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public boolean hasPhoneCount() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public boolean hasPpgTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public boolean hasRebootCount() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public boolean hasRunTime() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public boolean hasSedCount() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public boolean hasUpTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.StatisBase.StatisBaseMessageOrBuilder
        public boolean hasVibTime() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(StatisBaseMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static StatisBaseMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (StatisBaseMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static StatisBaseMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (StatisBaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static StatisBaseMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (StatisBaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static StatisBaseMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (StatisBaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static StatisBaseMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (StatisBaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static StatisBaseMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (StatisBaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static StatisBaseMessage parseFrom(InputStream input) throws IOException {
            return (StatisBaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static StatisBaseMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (StatisBaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static StatisBaseMessage parseFrom(CodedInputStream input) throws IOException {
            return (StatisBaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static StatisBaseMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (StatisBaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface StatisBaseMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlarmsCount();

        int getAlgTime();

        int getAppNotifyCount();

        int getConnTime();

        int getDisconnectCount();

        int getFlashTime();

        int getKeyCount();

        int getLcdTime();

        int getLiftWristCount();

        int getPhoneCount();

        int getPpgTime();

        int getRebootCount();

        int getRunTime();

        int getSedCount();

        int getUpTime();

        int getVibTime();

        boolean hasAlarmsCount();

        boolean hasAlgTime();

        boolean hasAppNotifyCount();

        boolean hasConnTime();

        boolean hasDisconnectCount();

        boolean hasFlashTime();

        boolean hasKeyCount();

        boolean hasLcdTime();

        boolean hasLiftWristCount();

        boolean hasPhoneCount();

        boolean hasPpgTime();

        boolean hasRebootCount();

        boolean hasRunTime();

        boolean hasSedCount();

        boolean hasUpTime();

        boolean hasVibTime();
    }

    private StatisBase() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}

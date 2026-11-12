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
public final class Mozart {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Mozart$1, reason: invalid class name */
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

    public static final class MozartEventMessage extends GeneratedMessageLite<MozartEventMessage, Builder> implements MozartEventMessageOrBuilder {
        public static final int A2DPCONNTIME_FIELD_NUMBER = 5;
        public static final int ALGTIME_FIELD_NUMBER = 7;
        public static final int BLECONNTIME_FIELD_NUMBER = 3;
        public static final int BLEDISCONNECTCOUNT_FIELD_NUMBER = 10;
        public static final int BTDISCONNECTCOUNT_FIELD_NUMBER = 11;
        public static final int CALLTIME_FIELD_NUMBER = 14;
        private static final MozartEventMessage DEFAULT_INSTANCE;
        public static final int DOUBLETAPCOUNT_FIELD_NUMBER = 13;
        public static final int EXCEPTIONCOUNT_FIELD_NUMBER = 9;
        public static final int NOMALBOOTCOUNT_FIELD_NUMBER = 8;
        private static volatile Parser<MozartEventMessage> PARSER = null;
        public static final int PPGTIME_FIELD_NUMBER = 2;
        public static final int RUNTIME_FIELD_NUMBER = 6;
        public static final int SIGLETAPCOUNT_FIELD_NUMBER = 12;
        public static final int SLOT_FIELD_NUMBER = 17;
        public static final int SPPCONNTIME_FIELD_NUMBER = 4;
        public static final int UPTIME_FIELD_NUMBER = 1;
        public static final int USETIMESLOT_FIELD_NUMBER = 16;
        public static final int WEARTIME_FIELD_NUMBER = 15;
        private int a2DPconnTime_;
        private int algTime_;
        private int bLEconnTime_;
        private int bLEdisconnectCount_;
        private int bTdisconnectCount_;
        private int bitField0_;
        private int callTime_;
        private int doubleTapCount_;
        private int exceptionCount_;
        private byte memoizedIsInitialized = 2;
        private int nomalBootCount_;
        private int ppgTime_;
        private int runTime_;
        private int sPPconnTime_;
        private int sigleTapCount_;
        private UseTimeSlot.UseTimeSlotMessage slot_;
        private int upTime_;
        private int useTimeSlot_;
        private int wearTime_;

        public static final class Builder extends GeneratedMessageLite.Builder<MozartEventMessage, Builder> implements MozartEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearA2DPconnTime() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearA2DPconnTime();
                return this;
            }

            public Builder clearAlgTime() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearAlgTime();
                return this;
            }

            public Builder clearBLEconnTime() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearBLEconnTime();
                return this;
            }

            public Builder clearBLEdisconnectCount() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearBLEdisconnectCount();
                return this;
            }

            public Builder clearBTdisconnectCount() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearBTdisconnectCount();
                return this;
            }

            public Builder clearCallTime() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearCallTime();
                return this;
            }

            public Builder clearDoubleTapCount() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearDoubleTapCount();
                return this;
            }

            public Builder clearExceptionCount() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearExceptionCount();
                return this;
            }

            public Builder clearNomalBootCount() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearNomalBootCount();
                return this;
            }

            public Builder clearPpgTime() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearPpgTime();
                return this;
            }

            public Builder clearRunTime() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearRunTime();
                return this;
            }

            public Builder clearSPPconnTime() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearSPPconnTime();
                return this;
            }

            public Builder clearSigleTapCount() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearSigleTapCount();
                return this;
            }

            public Builder clearSlot() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearSlot();
                return this;
            }

            public Builder clearUpTime() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearUpTime();
                return this;
            }

            public Builder clearUseTimeSlot() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearUseTimeSlot();
                return this;
            }

            public Builder clearWearTime() {
                copyOnWrite();
                ((MozartEventMessage) this.instance).clearWearTime();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public int getA2DPconnTime() {
                return ((MozartEventMessage) this.instance).getA2DPconnTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public int getAlgTime() {
                return ((MozartEventMessage) this.instance).getAlgTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public int getBLEconnTime() {
                return ((MozartEventMessage) this.instance).getBLEconnTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public int getBLEdisconnectCount() {
                return ((MozartEventMessage) this.instance).getBLEdisconnectCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public int getBTdisconnectCount() {
                return ((MozartEventMessage) this.instance).getBTdisconnectCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public int getCallTime() {
                return ((MozartEventMessage) this.instance).getCallTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public int getDoubleTapCount() {
                return ((MozartEventMessage) this.instance).getDoubleTapCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public int getExceptionCount() {
                return ((MozartEventMessage) this.instance).getExceptionCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public int getNomalBootCount() {
                return ((MozartEventMessage) this.instance).getNomalBootCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public int getPpgTime() {
                return ((MozartEventMessage) this.instance).getPpgTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public int getRunTime() {
                return ((MozartEventMessage) this.instance).getRunTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public int getSPPconnTime() {
                return ((MozartEventMessage) this.instance).getSPPconnTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public int getSigleTapCount() {
                return ((MozartEventMessage) this.instance).getSigleTapCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public UseTimeSlot.UseTimeSlotMessage getSlot() {
                return ((MozartEventMessage) this.instance).getSlot();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public int getUpTime() {
                return ((MozartEventMessage) this.instance).getUpTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public int getUseTimeSlot() {
                return ((MozartEventMessage) this.instance).getUseTimeSlot();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public int getWearTime() {
                return ((MozartEventMessage) this.instance).getWearTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasA2DPconnTime() {
                return ((MozartEventMessage) this.instance).hasA2DPconnTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasAlgTime() {
                return ((MozartEventMessage) this.instance).hasAlgTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasBLEconnTime() {
                return ((MozartEventMessage) this.instance).hasBLEconnTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasBLEdisconnectCount() {
                return ((MozartEventMessage) this.instance).hasBLEdisconnectCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasBTdisconnectCount() {
                return ((MozartEventMessage) this.instance).hasBTdisconnectCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasCallTime() {
                return ((MozartEventMessage) this.instance).hasCallTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasDoubleTapCount() {
                return ((MozartEventMessage) this.instance).hasDoubleTapCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasExceptionCount() {
                return ((MozartEventMessage) this.instance).hasExceptionCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasNomalBootCount() {
                return ((MozartEventMessage) this.instance).hasNomalBootCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasPpgTime() {
                return ((MozartEventMessage) this.instance).hasPpgTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasRunTime() {
                return ((MozartEventMessage) this.instance).hasRunTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasSPPconnTime() {
                return ((MozartEventMessage) this.instance).hasSPPconnTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasSigleTapCount() {
                return ((MozartEventMessage) this.instance).hasSigleTapCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasSlot() {
                return ((MozartEventMessage) this.instance).hasSlot();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasUpTime() {
                return ((MozartEventMessage) this.instance).hasUpTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasUseTimeSlot() {
                return ((MozartEventMessage) this.instance).hasUseTimeSlot();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
            public boolean hasWearTime() {
                return ((MozartEventMessage) this.instance).hasWearTime();
            }

            public Builder mergeSlot(UseTimeSlot.UseTimeSlotMessage value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).mergeSlot(value);
                return this;
            }

            public Builder setA2DPconnTime(int value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setA2DPconnTime(value);
                return this;
            }

            public Builder setAlgTime(int value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setAlgTime(value);
                return this;
            }

            public Builder setBLEconnTime(int value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setBLEconnTime(value);
                return this;
            }

            public Builder setBLEdisconnectCount(int value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setBLEdisconnectCount(value);
                return this;
            }

            public Builder setBTdisconnectCount(int value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setBTdisconnectCount(value);
                return this;
            }

            public Builder setCallTime(int value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setCallTime(value);
                return this;
            }

            public Builder setDoubleTapCount(int value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setDoubleTapCount(value);
                return this;
            }

            public Builder setExceptionCount(int value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setExceptionCount(value);
                return this;
            }

            public Builder setNomalBootCount(int value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setNomalBootCount(value);
                return this;
            }

            public Builder setPpgTime(int value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setPpgTime(value);
                return this;
            }

            public Builder setRunTime(int value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setRunTime(value);
                return this;
            }

            public Builder setSPPconnTime(int value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setSPPconnTime(value);
                return this;
            }

            public Builder setSigleTapCount(int value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setSigleTapCount(value);
                return this;
            }

            public Builder setSlot(UseTimeSlot.UseTimeSlotMessage value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setSlot(value);
                return this;
            }

            public Builder setUpTime(int value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setUpTime(value);
                return this;
            }

            public Builder setUseTimeSlot(int value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setUseTimeSlot(value);
                return this;
            }

            public Builder setWearTime(int value) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setWearTime(value);
                return this;
            }

            private Builder() {
                super(MozartEventMessage.DEFAULT_INSTANCE);
            }

            public Builder setSlot(UseTimeSlot.UseTimeSlotMessage.Builder builderForValue) {
                copyOnWrite();
                ((MozartEventMessage) this.instance).setSlot(builderForValue.build());
                return this;
            }
        }

        static {
            MozartEventMessage mozartEventMessage = new MozartEventMessage();
            DEFAULT_INSTANCE = mozartEventMessage;
            GeneratedMessageLite.registerDefaultInstance(MozartEventMessage.class, mozartEventMessage);
        }

        private MozartEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearA2DPconnTime() {
            this.bitField0_ &= -17;
            this.a2DPconnTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlgTime() {
            this.bitField0_ &= -65;
            this.algTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBLEconnTime() {
            this.bitField0_ &= -5;
            this.bLEconnTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBLEdisconnectCount() {
            this.bitField0_ &= -513;
            this.bLEdisconnectCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBTdisconnectCount() {
            this.bitField0_ &= -1025;
            this.bTdisconnectCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallTime() {
            this.bitField0_ &= -8193;
            this.callTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDoubleTapCount() {
            this.bitField0_ &= -4097;
            this.doubleTapCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExceptionCount() {
            this.bitField0_ &= -257;
            this.exceptionCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNomalBootCount() {
            this.bitField0_ &= -129;
            this.nomalBootCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPpgTime() {
            this.bitField0_ &= -3;
            this.ppgTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRunTime() {
            this.bitField0_ &= -33;
            this.runTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSPPconnTime() {
            this.bitField0_ &= -9;
            this.sPPconnTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSigleTapCount() {
            this.bitField0_ &= -2049;
            this.sigleTapCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSlot() {
            this.slot_ = null;
            this.bitField0_ &= -65537;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpTime() {
            this.bitField0_ &= -2;
            this.upTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUseTimeSlot() {
            this.bitField0_ &= -32769;
            this.useTimeSlot_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWearTime() {
            this.bitField0_ &= -16385;
            this.wearTime_ = 0;
        }

        public static MozartEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSlot(UseTimeSlot.UseTimeSlotMessage value) {
            value.getClass();
            UseTimeSlot.UseTimeSlotMessage useTimeSlotMessage = this.slot_;
            if (useTimeSlotMessage == null || useTimeSlotMessage == UseTimeSlot.UseTimeSlotMessage.getDefaultInstance()) {
                this.slot_ = value;
            } else {
                this.slot_ = UseTimeSlot.UseTimeSlotMessage.newBuilder(this.slot_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 65536;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MozartEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (MozartEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static MozartEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (MozartEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<MozartEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setA2DPconnTime(int value) {
            this.bitField0_ |= 16;
            this.a2DPconnTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlgTime(int value) {
            this.bitField0_ |= 64;
            this.algTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBLEconnTime(int value) {
            this.bitField0_ |= 4;
            this.bLEconnTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBLEdisconnectCount(int value) {
            this.bitField0_ |= 512;
            this.bLEdisconnectCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBTdisconnectCount(int value) {
            this.bitField0_ |= 1024;
            this.bTdisconnectCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallTime(int value) {
            this.bitField0_ |= 8192;
            this.callTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDoubleTapCount(int value) {
            this.bitField0_ |= 4096;
            this.doubleTapCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExceptionCount(int value) {
            this.bitField0_ |= 256;
            this.exceptionCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNomalBootCount(int value) {
            this.bitField0_ |= 128;
            this.nomalBootCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPpgTime(int value) {
            this.bitField0_ |= 2;
            this.ppgTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRunTime(int value) {
            this.bitField0_ |= 32;
            this.runTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSPPconnTime(int value) {
            this.bitField0_ |= 8;
            this.sPPconnTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSigleTapCount(int value) {
            this.bitField0_ |= 2048;
            this.sigleTapCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSlot(UseTimeSlot.UseTimeSlotMessage value) {
            value.getClass();
            this.slot_ = value;
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpTime(int value) {
            this.bitField0_ |= 1;
            this.upTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUseTimeSlot(int value) {
            this.bitField0_ |= 32768;
            this.useTimeSlot_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWearTime(int value) {
            this.bitField0_ |= 16384;
            this.wearTime_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new MozartEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0011\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᐉ\u0010", new Object[]{"bitField0_", "upTime_", "ppgTime_", "bLEconnTime_", "sPPconnTime_", "a2DPconnTime_", "runTime_", "algTime_", "nomalBootCount_", "exceptionCount_", "bLEdisconnectCount_", "bTdisconnectCount_", "sigleTapCount_", "doubleTapCount_", "callTime_", "wearTime_", "useTimeSlot_", "slot_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MozartEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (MozartEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public int getA2DPconnTime() {
            return this.a2DPconnTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public int getAlgTime() {
            return this.algTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public int getBLEconnTime() {
            return this.bLEconnTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public int getBLEdisconnectCount() {
            return this.bLEdisconnectCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public int getBTdisconnectCount() {
            return this.bTdisconnectCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public int getCallTime() {
            return this.callTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public int getDoubleTapCount() {
            return this.doubleTapCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public int getExceptionCount() {
            return this.exceptionCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public int getNomalBootCount() {
            return this.nomalBootCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public int getPpgTime() {
            return this.ppgTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public int getRunTime() {
            return this.runTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public int getSPPconnTime() {
            return this.sPPconnTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public int getSigleTapCount() {
            return this.sigleTapCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public UseTimeSlot.UseTimeSlotMessage getSlot() {
            UseTimeSlot.UseTimeSlotMessage useTimeSlotMessage = this.slot_;
            return useTimeSlotMessage == null ? UseTimeSlot.UseTimeSlotMessage.getDefaultInstance() : useTimeSlotMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public int getUpTime() {
            return this.upTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public int getUseTimeSlot() {
            return this.useTimeSlot_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public int getWearTime() {
            return this.wearTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasA2DPconnTime() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasAlgTime() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasBLEconnTime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasBLEdisconnectCount() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasBTdisconnectCount() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasCallTime() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasDoubleTapCount() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasExceptionCount() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasNomalBootCount() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasPpgTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasRunTime() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasSPPconnTime() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasSigleTapCount() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasSlot() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasUpTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasUseTimeSlot() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartEventMessageOrBuilder
        public boolean hasWearTime() {
            return (this.bitField0_ & 16384) != 0;
        }

        public static Builder newBuilder(MozartEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static MozartEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MozartEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MozartEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MozartEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MozartEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (MozartEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MozartEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MozartEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MozartEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (MozartEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MozartEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MozartEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MozartEventMessage parseFrom(InputStream input) throws IOException {
            return (MozartEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MozartEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MozartEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MozartEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (MozartEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MozartEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MozartEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface MozartEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getA2DPconnTime();

        int getAlgTime();

        int getBLEconnTime();

        int getBLEdisconnectCount();

        int getBTdisconnectCount();

        int getCallTime();

        int getDoubleTapCount();

        int getExceptionCount();

        int getNomalBootCount();

        int getPpgTime();

        int getRunTime();

        int getSPPconnTime();

        int getSigleTapCount();

        UseTimeSlot.UseTimeSlotMessage getSlot();

        int getUpTime();

        int getUseTimeSlot();

        int getWearTime();

        boolean hasA2DPconnTime();

        boolean hasAlgTime();

        boolean hasBLEconnTime();

        boolean hasBLEdisconnectCount();

        boolean hasBTdisconnectCount();

        boolean hasCallTime();

        boolean hasDoubleTapCount();

        boolean hasExceptionCount();

        boolean hasNomalBootCount();

        boolean hasPpgTime();

        boolean hasRunTime();

        boolean hasSPPconnTime();

        boolean hasSigleTapCount();

        boolean hasSlot();

        boolean hasUpTime();

        boolean hasUseTimeSlot();

        boolean hasWearTime();
    }

    public static final class MozartStatisticsMessage extends GeneratedMessageLite<MozartStatisticsMessage, Builder> implements MozartStatisticsMessageOrBuilder {
        private static final MozartStatisticsMessage DEFAULT_INSTANCE;
        public static final int LEFT_FIELD_NUMBER = 2;
        private static volatile Parser<MozartStatisticsMessage> PARSER = null;
        public static final int RIGHT_FIELD_NUMBER = 3;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int bitField0_;
        private MozartEventMessage left_;
        private byte memoizedIsInitialized = 2;
        private MozartEventMessage right_;
        private int version_;

        public static final class Builder extends GeneratedMessageLite.Builder<MozartStatisticsMessage, Builder> implements MozartStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearLeft() {
                copyOnWrite();
                ((MozartStatisticsMessage) this.instance).clearLeft();
                return this;
            }

            public Builder clearRight() {
                copyOnWrite();
                ((MozartStatisticsMessage) this.instance).clearRight();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((MozartStatisticsMessage) this.instance).clearVersion();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartStatisticsMessageOrBuilder
            public MozartEventMessage getLeft() {
                return ((MozartStatisticsMessage) this.instance).getLeft();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartStatisticsMessageOrBuilder
            public MozartEventMessage getRight() {
                return ((MozartStatisticsMessage) this.instance).getRight();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartStatisticsMessageOrBuilder
            public int getVersion() {
                return ((MozartStatisticsMessage) this.instance).getVersion();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartStatisticsMessageOrBuilder
            public boolean hasLeft() {
                return ((MozartStatisticsMessage) this.instance).hasLeft();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartStatisticsMessageOrBuilder
            public boolean hasRight() {
                return ((MozartStatisticsMessage) this.instance).hasRight();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartStatisticsMessageOrBuilder
            public boolean hasVersion() {
                return ((MozartStatisticsMessage) this.instance).hasVersion();
            }

            public Builder mergeLeft(MozartEventMessage value) {
                copyOnWrite();
                ((MozartStatisticsMessage) this.instance).mergeLeft(value);
                return this;
            }

            public Builder mergeRight(MozartEventMessage value) {
                copyOnWrite();
                ((MozartStatisticsMessage) this.instance).mergeRight(value);
                return this;
            }

            public Builder setLeft(MozartEventMessage value) {
                copyOnWrite();
                ((MozartStatisticsMessage) this.instance).setLeft(value);
                return this;
            }

            public Builder setRight(MozartEventMessage value) {
                copyOnWrite();
                ((MozartStatisticsMessage) this.instance).setRight(value);
                return this;
            }

            public Builder setVersion(int value) {
                copyOnWrite();
                ((MozartStatisticsMessage) this.instance).setVersion(value);
                return this;
            }

            private Builder() {
                super(MozartStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setLeft(MozartEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((MozartStatisticsMessage) this.instance).setLeft(builderForValue.build());
                return this;
            }

            public Builder setRight(MozartEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((MozartStatisticsMessage) this.instance).setRight(builderForValue.build());
                return this;
            }
        }

        static {
            MozartStatisticsMessage mozartStatisticsMessage = new MozartStatisticsMessage();
            DEFAULT_INSTANCE = mozartStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(MozartStatisticsMessage.class, mozartStatisticsMessage);
        }

        private MozartStatisticsMessage() {
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

        public static MozartStatisticsMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLeft(MozartEventMessage value) {
            value.getClass();
            MozartEventMessage mozartEventMessage = this.left_;
            if (mozartEventMessage == null || mozartEventMessage == MozartEventMessage.getDefaultInstance()) {
                this.left_ = value;
            } else {
                this.left_ = MozartEventMessage.newBuilder(this.left_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRight(MozartEventMessage value) {
            value.getClass();
            MozartEventMessage mozartEventMessage = this.right_;
            if (mozartEventMessage == null || mozartEventMessage == MozartEventMessage.getDefaultInstance()) {
                this.right_ = value;
            } else {
                this.right_ = MozartEventMessage.newBuilder(this.right_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MozartStatisticsMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (MozartStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static MozartStatisticsMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (MozartStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<MozartStatisticsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeft(MozartEventMessage value) {
            value.getClass();
            this.left_ = value;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRight(MozartEventMessage value) {
            value.getClass();
            this.right_ = value;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int value) {
            this.bitField0_ |= 1;
            this.version_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new MozartStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "version_", "left_", "right_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MozartStatisticsMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (MozartStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartStatisticsMessageOrBuilder
        public MozartEventMessage getLeft() {
            MozartEventMessage mozartEventMessage = this.left_;
            return mozartEventMessage == null ? MozartEventMessage.getDefaultInstance() : mozartEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartStatisticsMessageOrBuilder
        public MozartEventMessage getRight() {
            MozartEventMessage mozartEventMessage = this.right_;
            return mozartEventMessage == null ? MozartEventMessage.getDefaultInstance() : mozartEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartStatisticsMessageOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartStatisticsMessageOrBuilder
        public boolean hasLeft() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartStatisticsMessageOrBuilder
        public boolean hasRight() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Mozart.MozartStatisticsMessageOrBuilder
        public boolean hasVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(MozartStatisticsMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static MozartStatisticsMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MozartStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MozartStatisticsMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MozartStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MozartStatisticsMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (MozartStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MozartStatisticsMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MozartStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MozartStatisticsMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (MozartStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MozartStatisticsMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MozartStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MozartStatisticsMessage parseFrom(InputStream input) throws IOException {
            return (MozartStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MozartStatisticsMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MozartStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MozartStatisticsMessage parseFrom(CodedInputStream input) throws IOException {
            return (MozartStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MozartStatisticsMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MozartStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface MozartStatisticsMessageOrBuilder extends MessageLiteOrBuilder {
        MozartEventMessage getLeft();

        MozartEventMessage getRight();

        int getVersion();

        boolean hasLeft();

        boolean hasRight();

        boolean hasVersion();
    }

    private Mozart() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}

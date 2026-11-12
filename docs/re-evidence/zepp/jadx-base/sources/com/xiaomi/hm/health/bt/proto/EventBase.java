package com.xiaomi.hm.health.bt.proto;

import com.autonavi.amap.mapcore.AMapEngineUtils;
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
public final class EventBase {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.EventBase$1, reason: invalid class name */
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

    public static final class AbnormalRebootCountMessage extends GeneratedMessageLite<AbnormalRebootCountMessage, Builder> implements AbnormalRebootCountMessageOrBuilder {
        private static final AbnormalRebootCountMessage DEFAULT_INSTANCE;
        private static volatile Parser<AbnormalRebootCountMessage> PARSER = null;
        public static final int REBOOTDFUFAILCOUNT_FIELD_NUMBER = 8;
        public static final int REBOOTESDCOUNT_FIELD_NUMBER = 4;
        public static final int REBOOTHARDFAULTCOUNT_FIELD_NUMBER = 1;
        public static final int REBOOTIICCOUNT_FIELD_NUMBER = 3;
        public static final int REBOOTMALLOCFAILCOUNT_FIELD_NUMBER = 9;
        public static final int REBOOTNFCESECOUNT_FIELD_NUMBER = 7;
        public static final int REBOOTNFCINITFAILCOUNT_FIELD_NUMBER = 6;
        public static final int REBOOTNFCTIMEOUTCOUNT_FIELD_NUMBER = 5;
        public static final int REBOOTOTHERSYSERRORCOUNT_FIELD_NUMBER = 11;
        public static final int REBOOTSTACKOVERFLOWCOUNT_FIELD_NUMBER = 10;
        public static final int REBOOTWDGCOUNT_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int rebootDfuFailCount_;
        private int rebootEsdCount_;
        private int rebootHardfaultCount_;
        private int rebootIicCount_;
        private int rebootMallocFailCount_;
        private int rebootNfcEseCount_;
        private int rebootNfcInitFailCount_;
        private int rebootNfcTimeoutCount_;
        private int rebootOtherSysErrorCount_;
        private int rebootStackOverflowCount_;
        private int rebootWdgCount_;

        public static final class Builder extends GeneratedMessageLite.Builder<AbnormalRebootCountMessage, Builder> implements AbnormalRebootCountMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearRebootDfuFailCount() {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).clearRebootDfuFailCount();
                return this;
            }

            public Builder clearRebootEsdCount() {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).clearRebootEsdCount();
                return this;
            }

            public Builder clearRebootHardfaultCount() {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).clearRebootHardfaultCount();
                return this;
            }

            public Builder clearRebootIicCount() {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).clearRebootIicCount();
                return this;
            }

            public Builder clearRebootMallocFailCount() {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).clearRebootMallocFailCount();
                return this;
            }

            public Builder clearRebootNfcEseCount() {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).clearRebootNfcEseCount();
                return this;
            }

            public Builder clearRebootNfcInitFailCount() {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).clearRebootNfcInitFailCount();
                return this;
            }

            public Builder clearRebootNfcTimeoutCount() {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).clearRebootNfcTimeoutCount();
                return this;
            }

            public Builder clearRebootOtherSysErrorCount() {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).clearRebootOtherSysErrorCount();
                return this;
            }

            public Builder clearRebootStackOverflowCount() {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).clearRebootStackOverflowCount();
                return this;
            }

            public Builder clearRebootWdgCount() {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).clearRebootWdgCount();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public int getRebootDfuFailCount() {
                return ((AbnormalRebootCountMessage) this.instance).getRebootDfuFailCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public int getRebootEsdCount() {
                return ((AbnormalRebootCountMessage) this.instance).getRebootEsdCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public int getRebootHardfaultCount() {
                return ((AbnormalRebootCountMessage) this.instance).getRebootHardfaultCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public int getRebootIicCount() {
                return ((AbnormalRebootCountMessage) this.instance).getRebootIicCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public int getRebootMallocFailCount() {
                return ((AbnormalRebootCountMessage) this.instance).getRebootMallocFailCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public int getRebootNfcEseCount() {
                return ((AbnormalRebootCountMessage) this.instance).getRebootNfcEseCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public int getRebootNfcInitFailCount() {
                return ((AbnormalRebootCountMessage) this.instance).getRebootNfcInitFailCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public int getRebootNfcTimeoutCount() {
                return ((AbnormalRebootCountMessage) this.instance).getRebootNfcTimeoutCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public int getRebootOtherSysErrorCount() {
                return ((AbnormalRebootCountMessage) this.instance).getRebootOtherSysErrorCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public int getRebootStackOverflowCount() {
                return ((AbnormalRebootCountMessage) this.instance).getRebootStackOverflowCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public int getRebootWdgCount() {
                return ((AbnormalRebootCountMessage) this.instance).getRebootWdgCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public boolean hasRebootDfuFailCount() {
                return ((AbnormalRebootCountMessage) this.instance).hasRebootDfuFailCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public boolean hasRebootEsdCount() {
                return ((AbnormalRebootCountMessage) this.instance).hasRebootEsdCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public boolean hasRebootHardfaultCount() {
                return ((AbnormalRebootCountMessage) this.instance).hasRebootHardfaultCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public boolean hasRebootIicCount() {
                return ((AbnormalRebootCountMessage) this.instance).hasRebootIicCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public boolean hasRebootMallocFailCount() {
                return ((AbnormalRebootCountMessage) this.instance).hasRebootMallocFailCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public boolean hasRebootNfcEseCount() {
                return ((AbnormalRebootCountMessage) this.instance).hasRebootNfcEseCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public boolean hasRebootNfcInitFailCount() {
                return ((AbnormalRebootCountMessage) this.instance).hasRebootNfcInitFailCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public boolean hasRebootNfcTimeoutCount() {
                return ((AbnormalRebootCountMessage) this.instance).hasRebootNfcTimeoutCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public boolean hasRebootOtherSysErrorCount() {
                return ((AbnormalRebootCountMessage) this.instance).hasRebootOtherSysErrorCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public boolean hasRebootStackOverflowCount() {
                return ((AbnormalRebootCountMessage) this.instance).hasRebootStackOverflowCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
            public boolean hasRebootWdgCount() {
                return ((AbnormalRebootCountMessage) this.instance).hasRebootWdgCount();
            }

            public Builder setRebootDfuFailCount(int value) {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).setRebootDfuFailCount(value);
                return this;
            }

            public Builder setRebootEsdCount(int value) {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).setRebootEsdCount(value);
                return this;
            }

            public Builder setRebootHardfaultCount(int value) {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).setRebootHardfaultCount(value);
                return this;
            }

            public Builder setRebootIicCount(int value) {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).setRebootIicCount(value);
                return this;
            }

            public Builder setRebootMallocFailCount(int value) {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).setRebootMallocFailCount(value);
                return this;
            }

            public Builder setRebootNfcEseCount(int value) {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).setRebootNfcEseCount(value);
                return this;
            }

            public Builder setRebootNfcInitFailCount(int value) {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).setRebootNfcInitFailCount(value);
                return this;
            }

            public Builder setRebootNfcTimeoutCount(int value) {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).setRebootNfcTimeoutCount(value);
                return this;
            }

            public Builder setRebootOtherSysErrorCount(int value) {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).setRebootOtherSysErrorCount(value);
                return this;
            }

            public Builder setRebootStackOverflowCount(int value) {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).setRebootStackOverflowCount(value);
                return this;
            }

            public Builder setRebootWdgCount(int value) {
                copyOnWrite();
                ((AbnormalRebootCountMessage) this.instance).setRebootWdgCount(value);
                return this;
            }

            private Builder() {
                super(AbnormalRebootCountMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            AbnormalRebootCountMessage abnormalRebootCountMessage = new AbnormalRebootCountMessage();
            DEFAULT_INSTANCE = abnormalRebootCountMessage;
            GeneratedMessageLite.registerDefaultInstance(AbnormalRebootCountMessage.class, abnormalRebootCountMessage);
        }

        private AbnormalRebootCountMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRebootDfuFailCount() {
            this.bitField0_ &= -129;
            this.rebootDfuFailCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRebootEsdCount() {
            this.bitField0_ &= -9;
            this.rebootEsdCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRebootHardfaultCount() {
            this.bitField0_ &= -2;
            this.rebootHardfaultCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRebootIicCount() {
            this.bitField0_ &= -5;
            this.rebootIicCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRebootMallocFailCount() {
            this.bitField0_ &= -257;
            this.rebootMallocFailCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRebootNfcEseCount() {
            this.bitField0_ &= -65;
            this.rebootNfcEseCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRebootNfcInitFailCount() {
            this.bitField0_ &= -33;
            this.rebootNfcInitFailCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRebootNfcTimeoutCount() {
            this.bitField0_ &= -17;
            this.rebootNfcTimeoutCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRebootOtherSysErrorCount() {
            this.bitField0_ &= -1025;
            this.rebootOtherSysErrorCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRebootStackOverflowCount() {
            this.bitField0_ &= -513;
            this.rebootStackOverflowCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRebootWdgCount() {
            this.bitField0_ &= -3;
            this.rebootWdgCount_ = 0;
        }

        public static AbnormalRebootCountMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AbnormalRebootCountMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (AbnormalRebootCountMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static AbnormalRebootCountMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (AbnormalRebootCountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<AbnormalRebootCountMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebootDfuFailCount(int value) {
            this.bitField0_ |= 128;
            this.rebootDfuFailCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebootEsdCount(int value) {
            this.bitField0_ |= 8;
            this.rebootEsdCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebootHardfaultCount(int value) {
            this.bitField0_ |= 1;
            this.rebootHardfaultCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebootIicCount(int value) {
            this.bitField0_ |= 4;
            this.rebootIicCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebootMallocFailCount(int value) {
            this.bitField0_ |= 256;
            this.rebootMallocFailCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebootNfcEseCount(int value) {
            this.bitField0_ |= 64;
            this.rebootNfcEseCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebootNfcInitFailCount(int value) {
            this.bitField0_ |= 32;
            this.rebootNfcInitFailCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebootNfcTimeoutCount(int value) {
            this.bitField0_ |= 16;
            this.rebootNfcTimeoutCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebootOtherSysErrorCount(int value) {
            this.bitField0_ |= 1024;
            this.rebootOtherSysErrorCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebootStackOverflowCount(int value) {
            this.bitField0_ |= 512;
            this.rebootStackOverflowCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebootWdgCount(int value) {
            this.bitField0_ |= 2;
            this.rebootWdgCount_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new AbnormalRebootCountMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u000b\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n", new Object[]{"bitField0_", "rebootHardfaultCount_", "rebootWdgCount_", "rebootIicCount_", "rebootEsdCount_", "rebootNfcTimeoutCount_", "rebootNfcInitFailCount_", "rebootNfcEseCount_", "rebootDfuFailCount_", "rebootMallocFailCount_", "rebootStackOverflowCount_", "rebootOtherSysErrorCount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AbnormalRebootCountMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AbnormalRebootCountMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public int getRebootDfuFailCount() {
            return this.rebootDfuFailCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public int getRebootEsdCount() {
            return this.rebootEsdCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public int getRebootHardfaultCount() {
            return this.rebootHardfaultCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public int getRebootIicCount() {
            return this.rebootIicCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public int getRebootMallocFailCount() {
            return this.rebootMallocFailCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public int getRebootNfcEseCount() {
            return this.rebootNfcEseCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public int getRebootNfcInitFailCount() {
            return this.rebootNfcInitFailCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public int getRebootNfcTimeoutCount() {
            return this.rebootNfcTimeoutCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public int getRebootOtherSysErrorCount() {
            return this.rebootOtherSysErrorCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public int getRebootStackOverflowCount() {
            return this.rebootStackOverflowCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public int getRebootWdgCount() {
            return this.rebootWdgCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public boolean hasRebootDfuFailCount() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public boolean hasRebootEsdCount() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public boolean hasRebootHardfaultCount() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public boolean hasRebootIicCount() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public boolean hasRebootMallocFailCount() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public boolean hasRebootNfcEseCount() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public boolean hasRebootNfcInitFailCount() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public boolean hasRebootNfcTimeoutCount() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public boolean hasRebootOtherSysErrorCount() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public boolean hasRebootStackOverflowCount() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AbnormalRebootCountMessageOrBuilder
        public boolean hasRebootWdgCount() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(AbnormalRebootCountMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static AbnormalRebootCountMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AbnormalRebootCountMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static AbnormalRebootCountMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AbnormalRebootCountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static AbnormalRebootCountMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (AbnormalRebootCountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static AbnormalRebootCountMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AbnormalRebootCountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static AbnormalRebootCountMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (AbnormalRebootCountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static AbnormalRebootCountMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AbnormalRebootCountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static AbnormalRebootCountMessage parseFrom(InputStream input) throws IOException {
            return (AbnormalRebootCountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static AbnormalRebootCountMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AbnormalRebootCountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static AbnormalRebootCountMessage parseFrom(CodedInputStream input) throws IOException {
            return (AbnormalRebootCountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static AbnormalRebootCountMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AbnormalRebootCountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface AbnormalRebootCountMessageOrBuilder extends MessageLiteOrBuilder {
        int getRebootDfuFailCount();

        int getRebootEsdCount();

        int getRebootHardfaultCount();

        int getRebootIicCount();

        int getRebootMallocFailCount();

        int getRebootNfcEseCount();

        int getRebootNfcInitFailCount();

        int getRebootNfcTimeoutCount();

        int getRebootOtherSysErrorCount();

        int getRebootStackOverflowCount();

        int getRebootWdgCount();

        boolean hasRebootDfuFailCount();

        boolean hasRebootEsdCount();

        boolean hasRebootHardfaultCount();

        boolean hasRebootIicCount();

        boolean hasRebootMallocFailCount();

        boolean hasRebootNfcEseCount();

        boolean hasRebootNfcInitFailCount();

        boolean hasRebootNfcTimeoutCount();

        boolean hasRebootOtherSysErrorCount();

        boolean hasRebootStackOverflowCount();

        boolean hasRebootWdgCount();
    }

    public static final class AlexaEventMessage extends GeneratedMessageLite<AlexaEventMessage, Builder> implements AlexaEventMessageOrBuilder {
        public static final int ALEXAPAGE_FIELD_NUMBER = 1;
        public static final int DATAUPLOADING_FIELD_NUMBER = 9;
        private static final AlexaEventMessage DEFAULT_INSTANCE;
        private static volatile Parser<AlexaEventMessage> PARSER = null;
        public static final int REQRETUNKNOWERROR_FIELD_NUMBER = 3;
        public static final int REQUESTSUCCESS_FIELD_NUMBER = 2;
        public static final int RETAANGR_FIELD_NUMBER = 10;
        public static final int RETERRORNOAUTHORIZE_FIELD_NUMBER = 6;
        public static final int RETLIST_FIELD_NUMBER = 12;
        public static final int RETNAMEDAANDR_FIELD_NUMBER = 11;
        public static final int RETNETERRORTIMEOUT_FIELD_NUMBER = 5;
        public static final int RETNETERROR_FIELD_NUMBER = 4;
        public static final int RETWEATHER_FIELD_NUMBER = 13;
        public static final int STATUSNOTCONNECT_FIELD_NUMBER = 8;
        public static final int TTSTIMEOUT_FIELD_NUMBER = 7;
        private int alexaPage_;
        private int bitField0_;
        private int dataUploading_;
        private byte memoizedIsInitialized = 2;
        private int reqretUnknowError_;
        private int requestSuccess_;
        private int retAangR_;
        private int retErrorNoAuthorize_;
        private int retList_;
        private int retNamedAandR_;
        private int retNetErrorTimeout_;
        private int retNetError_;
        private int retWeather_;
        private int statusNotConnect_;
        private int ttsTimeout_;

        public static final class Builder extends GeneratedMessageLite.Builder<AlexaEventMessage, Builder> implements AlexaEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlexaPage() {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).clearAlexaPage();
                return this;
            }

            public Builder clearDataUploading() {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).clearDataUploading();
                return this;
            }

            public Builder clearReqretUnknowError() {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).clearReqretUnknowError();
                return this;
            }

            public Builder clearRequestSuccess() {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).clearRequestSuccess();
                return this;
            }

            public Builder clearRetAangR() {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).clearRetAangR();
                return this;
            }

            public Builder clearRetErrorNoAuthorize() {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).clearRetErrorNoAuthorize();
                return this;
            }

            public Builder clearRetList() {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).clearRetList();
                return this;
            }

            public Builder clearRetNamedAandR() {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).clearRetNamedAandR();
                return this;
            }

            public Builder clearRetNetError() {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).clearRetNetError();
                return this;
            }

            public Builder clearRetNetErrorTimeout() {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).clearRetNetErrorTimeout();
                return this;
            }

            public Builder clearRetWeather() {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).clearRetWeather();
                return this;
            }

            public Builder clearStatusNotConnect() {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).clearStatusNotConnect();
                return this;
            }

            public Builder clearTtsTimeout() {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).clearTtsTimeout();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public int getAlexaPage() {
                return ((AlexaEventMessage) this.instance).getAlexaPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public int getDataUploading() {
                return ((AlexaEventMessage) this.instance).getDataUploading();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public int getReqretUnknowError() {
                return ((AlexaEventMessage) this.instance).getReqretUnknowError();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public int getRequestSuccess() {
                return ((AlexaEventMessage) this.instance).getRequestSuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public int getRetAangR() {
                return ((AlexaEventMessage) this.instance).getRetAangR();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public int getRetErrorNoAuthorize() {
                return ((AlexaEventMessage) this.instance).getRetErrorNoAuthorize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public int getRetList() {
                return ((AlexaEventMessage) this.instance).getRetList();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public int getRetNamedAandR() {
                return ((AlexaEventMessage) this.instance).getRetNamedAandR();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public int getRetNetError() {
                return ((AlexaEventMessage) this.instance).getRetNetError();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public int getRetNetErrorTimeout() {
                return ((AlexaEventMessage) this.instance).getRetNetErrorTimeout();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public int getRetWeather() {
                return ((AlexaEventMessage) this.instance).getRetWeather();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public int getStatusNotConnect() {
                return ((AlexaEventMessage) this.instance).getStatusNotConnect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public int getTtsTimeout() {
                return ((AlexaEventMessage) this.instance).getTtsTimeout();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public boolean hasAlexaPage() {
                return ((AlexaEventMessage) this.instance).hasAlexaPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public boolean hasDataUploading() {
                return ((AlexaEventMessage) this.instance).hasDataUploading();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public boolean hasReqretUnknowError() {
                return ((AlexaEventMessage) this.instance).hasReqretUnknowError();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public boolean hasRequestSuccess() {
                return ((AlexaEventMessage) this.instance).hasRequestSuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public boolean hasRetAangR() {
                return ((AlexaEventMessage) this.instance).hasRetAangR();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public boolean hasRetErrorNoAuthorize() {
                return ((AlexaEventMessage) this.instance).hasRetErrorNoAuthorize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public boolean hasRetList() {
                return ((AlexaEventMessage) this.instance).hasRetList();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public boolean hasRetNamedAandR() {
                return ((AlexaEventMessage) this.instance).hasRetNamedAandR();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public boolean hasRetNetError() {
                return ((AlexaEventMessage) this.instance).hasRetNetError();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public boolean hasRetNetErrorTimeout() {
                return ((AlexaEventMessage) this.instance).hasRetNetErrorTimeout();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public boolean hasRetWeather() {
                return ((AlexaEventMessage) this.instance).hasRetWeather();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public boolean hasStatusNotConnect() {
                return ((AlexaEventMessage) this.instance).hasStatusNotConnect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
            public boolean hasTtsTimeout() {
                return ((AlexaEventMessage) this.instance).hasTtsTimeout();
            }

            public Builder setAlexaPage(int value) {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).setAlexaPage(value);
                return this;
            }

            public Builder setDataUploading(int value) {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).setDataUploading(value);
                return this;
            }

            public Builder setReqretUnknowError(int value) {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).setReqretUnknowError(value);
                return this;
            }

            public Builder setRequestSuccess(int value) {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).setRequestSuccess(value);
                return this;
            }

            public Builder setRetAangR(int value) {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).setRetAangR(value);
                return this;
            }

            public Builder setRetErrorNoAuthorize(int value) {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).setRetErrorNoAuthorize(value);
                return this;
            }

            public Builder setRetList(int value) {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).setRetList(value);
                return this;
            }

            public Builder setRetNamedAandR(int value) {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).setRetNamedAandR(value);
                return this;
            }

            public Builder setRetNetError(int value) {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).setRetNetError(value);
                return this;
            }

            public Builder setRetNetErrorTimeout(int value) {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).setRetNetErrorTimeout(value);
                return this;
            }

            public Builder setRetWeather(int value) {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).setRetWeather(value);
                return this;
            }

            public Builder setStatusNotConnect(int value) {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).setStatusNotConnect(value);
                return this;
            }

            public Builder setTtsTimeout(int value) {
                copyOnWrite();
                ((AlexaEventMessage) this.instance).setTtsTimeout(value);
                return this;
            }

            private Builder() {
                super(AlexaEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            AlexaEventMessage alexaEventMessage = new AlexaEventMessage();
            DEFAULT_INSTANCE = alexaEventMessage;
            GeneratedMessageLite.registerDefaultInstance(AlexaEventMessage.class, alexaEventMessage);
        }

        private AlexaEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlexaPage() {
            this.bitField0_ &= -2;
            this.alexaPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDataUploading() {
            this.bitField0_ &= -257;
            this.dataUploading_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReqretUnknowError() {
            this.bitField0_ &= -5;
            this.reqretUnknowError_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestSuccess() {
            this.bitField0_ &= -3;
            this.requestSuccess_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetAangR() {
            this.bitField0_ &= -513;
            this.retAangR_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetErrorNoAuthorize() {
            this.bitField0_ &= -33;
            this.retErrorNoAuthorize_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetList() {
            this.bitField0_ &= -2049;
            this.retList_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetNamedAandR() {
            this.bitField0_ &= -1025;
            this.retNamedAandR_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetNetError() {
            this.bitField0_ &= -9;
            this.retNetError_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetNetErrorTimeout() {
            this.bitField0_ &= -17;
            this.retNetErrorTimeout_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetWeather() {
            this.bitField0_ &= -4097;
            this.retWeather_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusNotConnect() {
            this.bitField0_ &= -129;
            this.statusNotConnect_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTtsTimeout() {
            this.bitField0_ &= -65;
            this.ttsTimeout_ = 0;
        }

        public static AlexaEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AlexaEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (AlexaEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static AlexaEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (AlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<AlexaEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlexaPage(int value) {
            this.bitField0_ |= 1;
            this.alexaPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataUploading(int value) {
            this.bitField0_ |= 256;
            this.dataUploading_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReqretUnknowError(int value) {
            this.bitField0_ |= 4;
            this.reqretUnknowError_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestSuccess(int value) {
            this.bitField0_ |= 2;
            this.requestSuccess_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetAangR(int value) {
            this.bitField0_ |= 512;
            this.retAangR_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetErrorNoAuthorize(int value) {
            this.bitField0_ |= 32;
            this.retErrorNoAuthorize_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetList(int value) {
            this.bitField0_ |= 2048;
            this.retList_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetNamedAandR(int value) {
            this.bitField0_ |= 1024;
            this.retNamedAandR_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetNetError(int value) {
            this.bitField0_ |= 8;
            this.retNetError_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetNetErrorTimeout(int value) {
            this.bitField0_ |= 16;
            this.retNetErrorTimeout_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetWeather(int value) {
            this.bitField0_ |= 4096;
            this.retWeather_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusNotConnect(int value) {
            this.bitField0_ |= 128;
            this.statusNotConnect_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTtsTimeout(int value) {
            this.bitField0_ |= 64;
            this.ttsTimeout_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new AlexaEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\r\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f", new Object[]{"bitField0_", "alexaPage_", "requestSuccess_", "reqretUnknowError_", "retNetError_", "retNetErrorTimeout_", "retErrorNoAuthorize_", "ttsTimeout_", "statusNotConnect_", "dataUploading_", "retAangR_", "retNamedAandR_", "retList_", "retWeather_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AlexaEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AlexaEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public int getAlexaPage() {
            return this.alexaPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public int getDataUploading() {
            return this.dataUploading_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public int getReqretUnknowError() {
            return this.reqretUnknowError_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public int getRequestSuccess() {
            return this.requestSuccess_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public int getRetAangR() {
            return this.retAangR_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public int getRetErrorNoAuthorize() {
            return this.retErrorNoAuthorize_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public int getRetList() {
            return this.retList_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public int getRetNamedAandR() {
            return this.retNamedAandR_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public int getRetNetError() {
            return this.retNetError_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public int getRetNetErrorTimeout() {
            return this.retNetErrorTimeout_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public int getRetWeather() {
            return this.retWeather_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public int getStatusNotConnect() {
            return this.statusNotConnect_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public int getTtsTimeout() {
            return this.ttsTimeout_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public boolean hasAlexaPage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public boolean hasDataUploading() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public boolean hasReqretUnknowError() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public boolean hasRequestSuccess() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public boolean hasRetAangR() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public boolean hasRetErrorNoAuthorize() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public boolean hasRetList() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public boolean hasRetNamedAandR() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public boolean hasRetNetError() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public boolean hasRetNetErrorTimeout() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public boolean hasRetWeather() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public boolean hasStatusNotConnect() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlexaEventMessageOrBuilder
        public boolean hasTtsTimeout() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(AlexaEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static AlexaEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AlexaEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static AlexaEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static AlexaEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (AlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static AlexaEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static AlexaEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (AlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static AlexaEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static AlexaEventMessage parseFrom(InputStream input) throws IOException {
            return (AlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static AlexaEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static AlexaEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (AlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static AlexaEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface AlexaEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlexaPage();

        int getDataUploading();

        int getReqretUnknowError();

        int getRequestSuccess();

        int getRetAangR();

        int getRetErrorNoAuthorize();

        int getRetList();

        int getRetNamedAandR();

        int getRetNetError();

        int getRetNetErrorTimeout();

        int getRetWeather();

        int getStatusNotConnect();

        int getTtsTimeout();

        boolean hasAlexaPage();

        boolean hasDataUploading();

        boolean hasReqretUnknowError();

        boolean hasRequestSuccess();

        boolean hasRetAangR();

        boolean hasRetErrorNoAuthorize();

        boolean hasRetList();

        boolean hasRetNamedAandR();

        boolean hasRetNetError();

        boolean hasRetNetErrorTimeout();

        boolean hasRetWeather();

        boolean hasStatusNotConnect();

        boolean hasTtsTimeout();
    }

    public static final class AlipayEventMessage extends GeneratedMessageLite<AlipayEventMessage, Builder> implements AlipayEventMessageOrBuilder {
        public static final int ALIPAYBRDISPLAYMORE_FIELD_NUMBER = 1;
        public static final int ALIPAYBRDISPLAYWIDGET_FIELD_NUMBER = 3;
        public static final int ALIPAYBRTIMELEVELFIVE_FIELD_NUMBER = 14;
        public static final int ALIPAYBRTIMELEVELFOUR_FIELD_NUMBER = 13;
        public static final int ALIPAYBRTIMELEVELONE_FIELD_NUMBER = 10;
        public static final int ALIPAYBRTIMELEVELTHREE_FIELD_NUMBER = 12;
        public static final int ALIPAYBRTIMELEVELTWO_FIELD_NUMBER = 11;
        public static final int ALIPAYQRDISPLAYMORE_FIELD_NUMBER = 2;
        public static final int ALIPAYQRDISPLAYWIDGET_FIELD_NUMBER = 4;
        public static final int ALIPAYQRTIMELEVELFIVE_FIELD_NUMBER = 9;
        public static final int ALIPAYQRTIMELEVELFOUR_FIELD_NUMBER = 8;
        public static final int ALIPAYQRTIMELEVELONE_FIELD_NUMBER = 5;
        public static final int ALIPAYQRTIMELEVELTHREE_FIELD_NUMBER = 7;
        public static final int ALIPAYQRTIMELEVELTWO_FIELD_NUMBER = 6;
        private static final AlipayEventMessage DEFAULT_INSTANCE;
        private static volatile Parser<AlipayEventMessage> PARSER;
        private int alipayBrDisplayMore_;
        private int alipayBrDisplayWidget_;
        private int alipayBrTimeLevelFive_;
        private int alipayBrTimeLevelFour_;
        private int alipayBrTimeLevelOne_;
        private int alipayBrTimeLevelThree_;
        private int alipayBrTimeLevelTwo_;
        private int alipayQrDisplayMore_;
        private int alipayQrDisplayWidget_;
        private int alipayQrTimeLevelFive_;
        private int alipayQrTimeLevelFour_;
        private int alipayQrTimeLevelOne_;
        private int alipayQrTimeLevelThree_;
        private int alipayQrTimeLevelTwo_;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends GeneratedMessageLite.Builder<AlipayEventMessage, Builder> implements AlipayEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlipayBrDisplayMore() {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).clearAlipayBrDisplayMore();
                return this;
            }

            public Builder clearAlipayBrDisplayWidget() {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).clearAlipayBrDisplayWidget();
                return this;
            }

            public Builder clearAlipayBrTimeLevelFive() {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).clearAlipayBrTimeLevelFive();
                return this;
            }

            public Builder clearAlipayBrTimeLevelFour() {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).clearAlipayBrTimeLevelFour();
                return this;
            }

            public Builder clearAlipayBrTimeLevelOne() {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).clearAlipayBrTimeLevelOne();
                return this;
            }

            public Builder clearAlipayBrTimeLevelThree() {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).clearAlipayBrTimeLevelThree();
                return this;
            }

            public Builder clearAlipayBrTimeLevelTwo() {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).clearAlipayBrTimeLevelTwo();
                return this;
            }

            public Builder clearAlipayQrDisplayMore() {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).clearAlipayQrDisplayMore();
                return this;
            }

            public Builder clearAlipayQrDisplayWidget() {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).clearAlipayQrDisplayWidget();
                return this;
            }

            public Builder clearAlipayQrTimeLevelFive() {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).clearAlipayQrTimeLevelFive();
                return this;
            }

            public Builder clearAlipayQrTimeLevelFour() {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).clearAlipayQrTimeLevelFour();
                return this;
            }

            public Builder clearAlipayQrTimeLevelOne() {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).clearAlipayQrTimeLevelOne();
                return this;
            }

            public Builder clearAlipayQrTimeLevelThree() {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).clearAlipayQrTimeLevelThree();
                return this;
            }

            public Builder clearAlipayQrTimeLevelTwo() {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).clearAlipayQrTimeLevelTwo();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public int getAlipayBrDisplayMore() {
                return ((AlipayEventMessage) this.instance).getAlipayBrDisplayMore();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public int getAlipayBrDisplayWidget() {
                return ((AlipayEventMessage) this.instance).getAlipayBrDisplayWidget();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public int getAlipayBrTimeLevelFive() {
                return ((AlipayEventMessage) this.instance).getAlipayBrTimeLevelFive();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public int getAlipayBrTimeLevelFour() {
                return ((AlipayEventMessage) this.instance).getAlipayBrTimeLevelFour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public int getAlipayBrTimeLevelOne() {
                return ((AlipayEventMessage) this.instance).getAlipayBrTimeLevelOne();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public int getAlipayBrTimeLevelThree() {
                return ((AlipayEventMessage) this.instance).getAlipayBrTimeLevelThree();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public int getAlipayBrTimeLevelTwo() {
                return ((AlipayEventMessage) this.instance).getAlipayBrTimeLevelTwo();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public int getAlipayQrDisplayMore() {
                return ((AlipayEventMessage) this.instance).getAlipayQrDisplayMore();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public int getAlipayQrDisplayWidget() {
                return ((AlipayEventMessage) this.instance).getAlipayQrDisplayWidget();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public int getAlipayQrTimeLevelFive() {
                return ((AlipayEventMessage) this.instance).getAlipayQrTimeLevelFive();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public int getAlipayQrTimeLevelFour() {
                return ((AlipayEventMessage) this.instance).getAlipayQrTimeLevelFour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public int getAlipayQrTimeLevelOne() {
                return ((AlipayEventMessage) this.instance).getAlipayQrTimeLevelOne();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public int getAlipayQrTimeLevelThree() {
                return ((AlipayEventMessage) this.instance).getAlipayQrTimeLevelThree();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public int getAlipayQrTimeLevelTwo() {
                return ((AlipayEventMessage) this.instance).getAlipayQrTimeLevelTwo();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public boolean hasAlipayBrDisplayMore() {
                return ((AlipayEventMessage) this.instance).hasAlipayBrDisplayMore();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public boolean hasAlipayBrDisplayWidget() {
                return ((AlipayEventMessage) this.instance).hasAlipayBrDisplayWidget();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public boolean hasAlipayBrTimeLevelFive() {
                return ((AlipayEventMessage) this.instance).hasAlipayBrTimeLevelFive();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public boolean hasAlipayBrTimeLevelFour() {
                return ((AlipayEventMessage) this.instance).hasAlipayBrTimeLevelFour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public boolean hasAlipayBrTimeLevelOne() {
                return ((AlipayEventMessage) this.instance).hasAlipayBrTimeLevelOne();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public boolean hasAlipayBrTimeLevelThree() {
                return ((AlipayEventMessage) this.instance).hasAlipayBrTimeLevelThree();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public boolean hasAlipayBrTimeLevelTwo() {
                return ((AlipayEventMessage) this.instance).hasAlipayBrTimeLevelTwo();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public boolean hasAlipayQrDisplayMore() {
                return ((AlipayEventMessage) this.instance).hasAlipayQrDisplayMore();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public boolean hasAlipayQrDisplayWidget() {
                return ((AlipayEventMessage) this.instance).hasAlipayQrDisplayWidget();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public boolean hasAlipayQrTimeLevelFive() {
                return ((AlipayEventMessage) this.instance).hasAlipayQrTimeLevelFive();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public boolean hasAlipayQrTimeLevelFour() {
                return ((AlipayEventMessage) this.instance).hasAlipayQrTimeLevelFour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public boolean hasAlipayQrTimeLevelOne() {
                return ((AlipayEventMessage) this.instance).hasAlipayQrTimeLevelOne();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public boolean hasAlipayQrTimeLevelThree() {
                return ((AlipayEventMessage) this.instance).hasAlipayQrTimeLevelThree();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
            public boolean hasAlipayQrTimeLevelTwo() {
                return ((AlipayEventMessage) this.instance).hasAlipayQrTimeLevelTwo();
            }

            public Builder setAlipayBrDisplayMore(int value) {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).setAlipayBrDisplayMore(value);
                return this;
            }

            public Builder setAlipayBrDisplayWidget(int value) {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).setAlipayBrDisplayWidget(value);
                return this;
            }

            public Builder setAlipayBrTimeLevelFive(int value) {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).setAlipayBrTimeLevelFive(value);
                return this;
            }

            public Builder setAlipayBrTimeLevelFour(int value) {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).setAlipayBrTimeLevelFour(value);
                return this;
            }

            public Builder setAlipayBrTimeLevelOne(int value) {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).setAlipayBrTimeLevelOne(value);
                return this;
            }

            public Builder setAlipayBrTimeLevelThree(int value) {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).setAlipayBrTimeLevelThree(value);
                return this;
            }

            public Builder setAlipayBrTimeLevelTwo(int value) {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).setAlipayBrTimeLevelTwo(value);
                return this;
            }

            public Builder setAlipayQrDisplayMore(int value) {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).setAlipayQrDisplayMore(value);
                return this;
            }

            public Builder setAlipayQrDisplayWidget(int value) {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).setAlipayQrDisplayWidget(value);
                return this;
            }

            public Builder setAlipayQrTimeLevelFive(int value) {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).setAlipayQrTimeLevelFive(value);
                return this;
            }

            public Builder setAlipayQrTimeLevelFour(int value) {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).setAlipayQrTimeLevelFour(value);
                return this;
            }

            public Builder setAlipayQrTimeLevelOne(int value) {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).setAlipayQrTimeLevelOne(value);
                return this;
            }

            public Builder setAlipayQrTimeLevelThree(int value) {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).setAlipayQrTimeLevelThree(value);
                return this;
            }

            public Builder setAlipayQrTimeLevelTwo(int value) {
                copyOnWrite();
                ((AlipayEventMessage) this.instance).setAlipayQrTimeLevelTwo(value);
                return this;
            }

            private Builder() {
                super(AlipayEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            AlipayEventMessage alipayEventMessage = new AlipayEventMessage();
            DEFAULT_INSTANCE = alipayEventMessage;
            GeneratedMessageLite.registerDefaultInstance(AlipayEventMessage.class, alipayEventMessage);
        }

        private AlipayEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayBrDisplayMore() {
            this.bitField0_ &= -2;
            this.alipayBrDisplayMore_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayBrDisplayWidget() {
            this.bitField0_ &= -5;
            this.alipayBrDisplayWidget_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayBrTimeLevelFive() {
            this.bitField0_ &= -8193;
            this.alipayBrTimeLevelFive_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayBrTimeLevelFour() {
            this.bitField0_ &= -4097;
            this.alipayBrTimeLevelFour_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayBrTimeLevelOne() {
            this.bitField0_ &= -513;
            this.alipayBrTimeLevelOne_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayBrTimeLevelThree() {
            this.bitField0_ &= -2049;
            this.alipayBrTimeLevelThree_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayBrTimeLevelTwo() {
            this.bitField0_ &= -1025;
            this.alipayBrTimeLevelTwo_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQrDisplayMore() {
            this.bitField0_ &= -3;
            this.alipayQrDisplayMore_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQrDisplayWidget() {
            this.bitField0_ &= -9;
            this.alipayQrDisplayWidget_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQrTimeLevelFive() {
            this.bitField0_ &= -257;
            this.alipayQrTimeLevelFive_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQrTimeLevelFour() {
            this.bitField0_ &= -129;
            this.alipayQrTimeLevelFour_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQrTimeLevelOne() {
            this.bitField0_ &= -17;
            this.alipayQrTimeLevelOne_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQrTimeLevelThree() {
            this.bitField0_ &= -65;
            this.alipayQrTimeLevelThree_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQrTimeLevelTwo() {
            this.bitField0_ &= -33;
            this.alipayQrTimeLevelTwo_ = 0;
        }

        public static AlipayEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AlipayEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (AlipayEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static AlipayEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (AlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<AlipayEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayBrDisplayMore(int value) {
            this.bitField0_ |= 1;
            this.alipayBrDisplayMore_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayBrDisplayWidget(int value) {
            this.bitField0_ |= 4;
            this.alipayBrDisplayWidget_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayBrTimeLevelFive(int value) {
            this.bitField0_ |= 8192;
            this.alipayBrTimeLevelFive_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayBrTimeLevelFour(int value) {
            this.bitField0_ |= 4096;
            this.alipayBrTimeLevelFour_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayBrTimeLevelOne(int value) {
            this.bitField0_ |= 512;
            this.alipayBrTimeLevelOne_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayBrTimeLevelThree(int value) {
            this.bitField0_ |= 2048;
            this.alipayBrTimeLevelThree_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayBrTimeLevelTwo(int value) {
            this.bitField0_ |= 1024;
            this.alipayBrTimeLevelTwo_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQrDisplayMore(int value) {
            this.bitField0_ |= 2;
            this.alipayQrDisplayMore_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQrDisplayWidget(int value) {
            this.bitField0_ |= 8;
            this.alipayQrDisplayWidget_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQrTimeLevelFive(int value) {
            this.bitField0_ |= 256;
            this.alipayQrTimeLevelFive_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQrTimeLevelFour(int value) {
            this.bitField0_ |= 128;
            this.alipayQrTimeLevelFour_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQrTimeLevelOne(int value) {
            this.bitField0_ |= 16;
            this.alipayQrTimeLevelOne_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQrTimeLevelThree(int value) {
            this.bitField0_ |= 64;
            this.alipayQrTimeLevelThree_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQrTimeLevelTwo(int value) {
            this.bitField0_ |= 32;
            this.alipayQrTimeLevelTwo_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new AlipayEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u000e\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r", new Object[]{"bitField0_", "alipayBrDisplayMore_", "alipayQrDisplayMore_", "alipayBrDisplayWidget_", "alipayQrDisplayWidget_", "alipayQrTimeLevelOne_", "alipayQrTimeLevelTwo_", "alipayQrTimeLevelThree_", "alipayQrTimeLevelFour_", "alipayQrTimeLevelFive_", "alipayBrTimeLevelOne_", "alipayBrTimeLevelTwo_", "alipayBrTimeLevelThree_", "alipayBrTimeLevelFour_", "alipayBrTimeLevelFive_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AlipayEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AlipayEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public int getAlipayBrDisplayMore() {
            return this.alipayBrDisplayMore_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public int getAlipayBrDisplayWidget() {
            return this.alipayBrDisplayWidget_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public int getAlipayBrTimeLevelFive() {
            return this.alipayBrTimeLevelFive_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public int getAlipayBrTimeLevelFour() {
            return this.alipayBrTimeLevelFour_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public int getAlipayBrTimeLevelOne() {
            return this.alipayBrTimeLevelOne_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public int getAlipayBrTimeLevelThree() {
            return this.alipayBrTimeLevelThree_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public int getAlipayBrTimeLevelTwo() {
            return this.alipayBrTimeLevelTwo_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public int getAlipayQrDisplayMore() {
            return this.alipayQrDisplayMore_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public int getAlipayQrDisplayWidget() {
            return this.alipayQrDisplayWidget_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public int getAlipayQrTimeLevelFive() {
            return this.alipayQrTimeLevelFive_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public int getAlipayQrTimeLevelFour() {
            return this.alipayQrTimeLevelFour_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public int getAlipayQrTimeLevelOne() {
            return this.alipayQrTimeLevelOne_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public int getAlipayQrTimeLevelThree() {
            return this.alipayQrTimeLevelThree_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public int getAlipayQrTimeLevelTwo() {
            return this.alipayQrTimeLevelTwo_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public boolean hasAlipayBrDisplayMore() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public boolean hasAlipayBrDisplayWidget() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public boolean hasAlipayBrTimeLevelFive() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public boolean hasAlipayBrTimeLevelFour() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public boolean hasAlipayBrTimeLevelOne() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public boolean hasAlipayBrTimeLevelThree() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public boolean hasAlipayBrTimeLevelTwo() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public boolean hasAlipayQrDisplayMore() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public boolean hasAlipayQrDisplayWidget() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public boolean hasAlipayQrTimeLevelFive() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public boolean hasAlipayQrTimeLevelFour() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public boolean hasAlipayQrTimeLevelOne() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public boolean hasAlipayQrTimeLevelThree() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.AlipayEventMessageOrBuilder
        public boolean hasAlipayQrTimeLevelTwo() {
            return (this.bitField0_ & 32) != 0;
        }

        public static Builder newBuilder(AlipayEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static AlipayEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AlipayEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static AlipayEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static AlipayEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (AlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static AlipayEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static AlipayEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (AlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static AlipayEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static AlipayEventMessage parseFrom(InputStream input) throws IOException {
            return (AlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static AlipayEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static AlipayEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (AlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static AlipayEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface AlipayEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlipayBrDisplayMore();

        int getAlipayBrDisplayWidget();

        int getAlipayBrTimeLevelFive();

        int getAlipayBrTimeLevelFour();

        int getAlipayBrTimeLevelOne();

        int getAlipayBrTimeLevelThree();

        int getAlipayBrTimeLevelTwo();

        int getAlipayQrDisplayMore();

        int getAlipayQrDisplayWidget();

        int getAlipayQrTimeLevelFive();

        int getAlipayQrTimeLevelFour();

        int getAlipayQrTimeLevelOne();

        int getAlipayQrTimeLevelThree();

        int getAlipayQrTimeLevelTwo();

        boolean hasAlipayBrDisplayMore();

        boolean hasAlipayBrDisplayWidget();

        boolean hasAlipayBrTimeLevelFive();

        boolean hasAlipayBrTimeLevelFour();

        boolean hasAlipayBrTimeLevelOne();

        boolean hasAlipayBrTimeLevelThree();

        boolean hasAlipayBrTimeLevelTwo();

        boolean hasAlipayQrDisplayMore();

        boolean hasAlipayQrDisplayWidget();

        boolean hasAlipayQrTimeLevelFive();

        boolean hasAlipayQrTimeLevelFour();

        boolean hasAlipayQrTimeLevelOne();

        boolean hasAlipayQrTimeLevelThree();

        boolean hasAlipayQrTimeLevelTwo();
    }

    public static final class DialEventMessage extends GeneratedMessageLite<DialEventMessage, Builder> implements DialEventMessageOrBuilder {
        private static final DialEventMessage DEFAULT_INSTANCE;
        public static final int DIALEDITPAGE_FIELD_NUMBER = 2;
        public static final int DIALLISTDISPLAYPAGE_FIELD_NUMBER = 1;
        public static final int EDITDIAL1_FIELD_NUMBER = 3;
        public static final int EDITDIAL2_FIELD_NUMBER = 4;
        public static final int EDITDIAL3_FIELD_NUMBER = 5;
        private static volatile Parser<DialEventMessage> PARSER;
        private int bitField0_;
        private int dialEditpage_;
        private int dialListDisplayPage_;
        private EditDialEventMessage editDial1_;
        private EditDialEventMessage editDial2_;
        private EditDialEventMessage editDial3_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends GeneratedMessageLite.Builder<DialEventMessage, Builder> implements DialEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDialEditpage() {
                copyOnWrite();
                ((DialEventMessage) this.instance).clearDialEditpage();
                return this;
            }

            public Builder clearDialListDisplayPage() {
                copyOnWrite();
                ((DialEventMessage) this.instance).clearDialListDisplayPage();
                return this;
            }

            public Builder clearEditDial1() {
                copyOnWrite();
                ((DialEventMessage) this.instance).clearEditDial1();
                return this;
            }

            public Builder clearEditDial2() {
                copyOnWrite();
                ((DialEventMessage) this.instance).clearEditDial2();
                return this;
            }

            public Builder clearEditDial3() {
                copyOnWrite();
                ((DialEventMessage) this.instance).clearEditDial3();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
            public int getDialEditpage() {
                return ((DialEventMessage) this.instance).getDialEditpage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
            public int getDialListDisplayPage() {
                return ((DialEventMessage) this.instance).getDialListDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
            public EditDialEventMessage getEditDial1() {
                return ((DialEventMessage) this.instance).getEditDial1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
            public EditDialEventMessage getEditDial2() {
                return ((DialEventMessage) this.instance).getEditDial2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
            public EditDialEventMessage getEditDial3() {
                return ((DialEventMessage) this.instance).getEditDial3();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
            public boolean hasDialEditpage() {
                return ((DialEventMessage) this.instance).hasDialEditpage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
            public boolean hasDialListDisplayPage() {
                return ((DialEventMessage) this.instance).hasDialListDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
            public boolean hasEditDial1() {
                return ((DialEventMessage) this.instance).hasEditDial1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
            public boolean hasEditDial2() {
                return ((DialEventMessage) this.instance).hasEditDial2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
            public boolean hasEditDial3() {
                return ((DialEventMessage) this.instance).hasEditDial3();
            }

            public Builder mergeEditDial1(EditDialEventMessage value) {
                copyOnWrite();
                ((DialEventMessage) this.instance).mergeEditDial1(value);
                return this;
            }

            public Builder mergeEditDial2(EditDialEventMessage value) {
                copyOnWrite();
                ((DialEventMessage) this.instance).mergeEditDial2(value);
                return this;
            }

            public Builder mergeEditDial3(EditDialEventMessage value) {
                copyOnWrite();
                ((DialEventMessage) this.instance).mergeEditDial3(value);
                return this;
            }

            public Builder setDialEditpage(int value) {
                copyOnWrite();
                ((DialEventMessage) this.instance).setDialEditpage(value);
                return this;
            }

            public Builder setDialListDisplayPage(int value) {
                copyOnWrite();
                ((DialEventMessage) this.instance).setDialListDisplayPage(value);
                return this;
            }

            public Builder setEditDial1(EditDialEventMessage value) {
                copyOnWrite();
                ((DialEventMessage) this.instance).setEditDial1(value);
                return this;
            }

            public Builder setEditDial2(EditDialEventMessage value) {
                copyOnWrite();
                ((DialEventMessage) this.instance).setEditDial2(value);
                return this;
            }

            public Builder setEditDial3(EditDialEventMessage value) {
                copyOnWrite();
                ((DialEventMessage) this.instance).setEditDial3(value);
                return this;
            }

            private Builder() {
                super(DialEventMessage.DEFAULT_INSTANCE);
            }

            public Builder setEditDial1(EditDialEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((DialEventMessage) this.instance).setEditDial1(builderForValue.build());
                return this;
            }

            public Builder setEditDial2(EditDialEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((DialEventMessage) this.instance).setEditDial2(builderForValue.build());
                return this;
            }

            public Builder setEditDial3(EditDialEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((DialEventMessage) this.instance).setEditDial3(builderForValue.build());
                return this;
            }
        }

        static {
            DialEventMessage dialEventMessage = new DialEventMessage();
            DEFAULT_INSTANCE = dialEventMessage;
            GeneratedMessageLite.registerDefaultInstance(DialEventMessage.class, dialEventMessage);
        }

        private DialEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialEditpage() {
            this.bitField0_ &= -3;
            this.dialEditpage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialListDisplayPage() {
            this.bitField0_ &= -2;
            this.dialListDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditDial1() {
            this.editDial1_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditDial2() {
            this.editDial2_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditDial3() {
            this.editDial3_ = null;
            this.bitField0_ &= -17;
        }

        public static DialEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEditDial1(EditDialEventMessage value) {
            value.getClass();
            EditDialEventMessage editDialEventMessage = this.editDial1_;
            if (editDialEventMessage == null || editDialEventMessage == EditDialEventMessage.getDefaultInstance()) {
                this.editDial1_ = value;
            } else {
                this.editDial1_ = EditDialEventMessage.newBuilder(this.editDial1_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEditDial2(EditDialEventMessage value) {
            value.getClass();
            EditDialEventMessage editDialEventMessage = this.editDial2_;
            if (editDialEventMessage == null || editDialEventMessage == EditDialEventMessage.getDefaultInstance()) {
                this.editDial2_ = value;
            } else {
                this.editDial2_ = EditDialEventMessage.newBuilder(this.editDial2_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEditDial3(EditDialEventMessage value) {
            value.getClass();
            EditDialEventMessage editDialEventMessage = this.editDial3_;
            if (editDialEventMessage == null || editDialEventMessage == EditDialEventMessage.getDefaultInstance()) {
                this.editDial3_ = value;
            } else {
                this.editDial3_ = EditDialEventMessage.newBuilder(this.editDial3_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DialEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (DialEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static DialEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (DialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<DialEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialEditpage(int value) {
            this.bitField0_ |= 2;
            this.dialEditpage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialListDisplayPage(int value) {
            this.bitField0_ |= 1;
            this.dialListDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditDial1(EditDialEventMessage value) {
            value.getClass();
            this.editDial1_ = value;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditDial2(EditDialEventMessage value) {
            value.getClass();
            this.editDial2_ = value;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditDial3(EditDialEventMessage value) {
            value.getClass();
            this.editDial3_ = value;
            this.bitField0_ |= 16;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new DialEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔉ\u0002\u0004ᔉ\u0003\u0005ᔉ\u0004", new Object[]{"bitField0_", "dialListDisplayPage_", "dialEditpage_", "editDial1_", "editDial2_", "editDial3_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DialEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DialEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
        public int getDialEditpage() {
            return this.dialEditpage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
        public int getDialListDisplayPage() {
            return this.dialListDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
        public EditDialEventMessage getEditDial1() {
            EditDialEventMessage editDialEventMessage = this.editDial1_;
            return editDialEventMessage == null ? EditDialEventMessage.getDefaultInstance() : editDialEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
        public EditDialEventMessage getEditDial2() {
            EditDialEventMessage editDialEventMessage = this.editDial2_;
            return editDialEventMessage == null ? EditDialEventMessage.getDefaultInstance() : editDialEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
        public EditDialEventMessage getEditDial3() {
            EditDialEventMessage editDialEventMessage = this.editDial3_;
            return editDialEventMessage == null ? EditDialEventMessage.getDefaultInstance() : editDialEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
        public boolean hasDialEditpage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
        public boolean hasDialListDisplayPage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
        public boolean hasEditDial1() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
        public boolean hasEditDial2() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.DialEventMessageOrBuilder
        public boolean hasEditDial3() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(DialEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static DialEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DialEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DialEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DialEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (DialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DialEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DialEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (DialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DialEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DialEventMessage parseFrom(InputStream input) throws IOException {
            return (DialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DialEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DialEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (DialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DialEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface DialEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getDialEditpage();

        int getDialListDisplayPage();

        EditDialEventMessage getEditDial1();

        EditDialEventMessage getEditDial2();

        EditDialEventMessage getEditDial3();

        boolean hasDialEditpage();

        boolean hasDialListDisplayPage();

        boolean hasEditDial1();

        boolean hasEditDial2();

        boolean hasEditDial3();
    }

    public static final class EditDialEventMessage extends GeneratedMessageLite<EditDialEventMessage, Builder> implements EditDialEventMessageOrBuilder {
        public static final int AIRQUALITYPAGE_FIELD_NUMBER = 12;
        public static final int ALARMPAGE_FIELD_NUMBER = 14;
        public static final int ALLDAYHR_FIELD_NUMBER = 8;
        public static final int BATTERYPAGE_FIELD_NUMBER = 5;
        public static final int CALENDARPAGE_FIELD_NUMBER = 15;
        public static final int CALPAGE_FIELD_NUMBER = 3;
        public static final int DAYPAIPAGE_FIELD_NUMBER = 6;
        private static final EditDialEventMessage DEFAULT_INSTANCE;
        public static final int EVENTREMINDPAGE_FIELD_NUMBER = 13;
        public static final int HOURSTEPPAGE_FIELD_NUMBER = 7;
        public static final int HRPAGE_FIELD_NUMBER = 2;
        public static final int OTHERWEATEHRPAGE_FIELD_NUMBER = 11;
        public static final int PAIPAGE_FIELD_NUMBER = 4;
        private static volatile Parser<EditDialEventMessage> PARSER = null;
        public static final int SPORTPAGE_FIELD_NUMBER = 16;
        public static final int STEPIDPAGE_FIELD_NUMBER = 1;
        public static final int SUNRISEPAGE_FIELD_NUMBER = 10;
        public static final int WEATHERPAGE_FIELD_NUMBER = 9;
        private int airQualityPage_;
        private int alarmPage_;
        private int allDayHr_;
        private int batteryPage_;
        private int bitField0_;
        private int calPage_;
        private int calendarPage_;
        private int dayPaiPage_;
        private int eventRemindPage_;
        private int hourStepPage_;
        private int hrPage_;
        private byte memoizedIsInitialized = 2;
        private int otherWeatehrPage_;
        private int paiPage_;
        private int sportPage_;
        private int stepIdPage_;
        private int sunrisePage_;
        private int weatherPage_;

        public static final class Builder extends GeneratedMessageLite.Builder<EditDialEventMessage, Builder> implements EditDialEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAirQualityPage() {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).clearAirQualityPage();
                return this;
            }

            public Builder clearAlarmPage() {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).clearAlarmPage();
                return this;
            }

            public Builder clearAllDayHr() {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).clearAllDayHr();
                return this;
            }

            public Builder clearBatteryPage() {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).clearBatteryPage();
                return this;
            }

            public Builder clearCalPage() {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).clearCalPage();
                return this;
            }

            public Builder clearCalendarPage() {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).clearCalendarPage();
                return this;
            }

            public Builder clearDayPaiPage() {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).clearDayPaiPage();
                return this;
            }

            public Builder clearEventRemindPage() {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).clearEventRemindPage();
                return this;
            }

            public Builder clearHourStepPage() {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).clearHourStepPage();
                return this;
            }

            public Builder clearHrPage() {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).clearHrPage();
                return this;
            }

            public Builder clearOtherWeatehrPage() {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).clearOtherWeatehrPage();
                return this;
            }

            public Builder clearPaiPage() {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).clearPaiPage();
                return this;
            }

            public Builder clearSportPage() {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).clearSportPage();
                return this;
            }

            public Builder clearStepIdPage() {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).clearStepIdPage();
                return this;
            }

            public Builder clearSunrisePage() {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).clearSunrisePage();
                return this;
            }

            public Builder clearWeatherPage() {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).clearWeatherPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public int getAirQualityPage() {
                return ((EditDialEventMessage) this.instance).getAirQualityPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public int getAlarmPage() {
                return ((EditDialEventMessage) this.instance).getAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public int getAllDayHr() {
                return ((EditDialEventMessage) this.instance).getAllDayHr();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public int getBatteryPage() {
                return ((EditDialEventMessage) this.instance).getBatteryPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public int getCalPage() {
                return ((EditDialEventMessage) this.instance).getCalPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public int getCalendarPage() {
                return ((EditDialEventMessage) this.instance).getCalendarPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public int getDayPaiPage() {
                return ((EditDialEventMessage) this.instance).getDayPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public int getEventRemindPage() {
                return ((EditDialEventMessage) this.instance).getEventRemindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public int getHourStepPage() {
                return ((EditDialEventMessage) this.instance).getHourStepPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public int getHrPage() {
                return ((EditDialEventMessage) this.instance).getHrPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public int getOtherWeatehrPage() {
                return ((EditDialEventMessage) this.instance).getOtherWeatehrPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public int getPaiPage() {
                return ((EditDialEventMessage) this.instance).getPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public int getSportPage() {
                return ((EditDialEventMessage) this.instance).getSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public int getStepIdPage() {
                return ((EditDialEventMessage) this.instance).getStepIdPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public int getSunrisePage() {
                return ((EditDialEventMessage) this.instance).getSunrisePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public int getWeatherPage() {
                return ((EditDialEventMessage) this.instance).getWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public boolean hasAirQualityPage() {
                return ((EditDialEventMessage) this.instance).hasAirQualityPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public boolean hasAlarmPage() {
                return ((EditDialEventMessage) this.instance).hasAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public boolean hasAllDayHr() {
                return ((EditDialEventMessage) this.instance).hasAllDayHr();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public boolean hasBatteryPage() {
                return ((EditDialEventMessage) this.instance).hasBatteryPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public boolean hasCalPage() {
                return ((EditDialEventMessage) this.instance).hasCalPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public boolean hasCalendarPage() {
                return ((EditDialEventMessage) this.instance).hasCalendarPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public boolean hasDayPaiPage() {
                return ((EditDialEventMessage) this.instance).hasDayPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public boolean hasEventRemindPage() {
                return ((EditDialEventMessage) this.instance).hasEventRemindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public boolean hasHourStepPage() {
                return ((EditDialEventMessage) this.instance).hasHourStepPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public boolean hasHrPage() {
                return ((EditDialEventMessage) this.instance).hasHrPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public boolean hasOtherWeatehrPage() {
                return ((EditDialEventMessage) this.instance).hasOtherWeatehrPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public boolean hasPaiPage() {
                return ((EditDialEventMessage) this.instance).hasPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public boolean hasSportPage() {
                return ((EditDialEventMessage) this.instance).hasSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public boolean hasStepIdPage() {
                return ((EditDialEventMessage) this.instance).hasStepIdPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public boolean hasSunrisePage() {
                return ((EditDialEventMessage) this.instance).hasSunrisePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
            public boolean hasWeatherPage() {
                return ((EditDialEventMessage) this.instance).hasWeatherPage();
            }

            public Builder setAirQualityPage(int value) {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).setAirQualityPage(value);
                return this;
            }

            public Builder setAlarmPage(int value) {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).setAlarmPage(value);
                return this;
            }

            public Builder setAllDayHr(int value) {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).setAllDayHr(value);
                return this;
            }

            public Builder setBatteryPage(int value) {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).setBatteryPage(value);
                return this;
            }

            public Builder setCalPage(int value) {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).setCalPage(value);
                return this;
            }

            public Builder setCalendarPage(int value) {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).setCalendarPage(value);
                return this;
            }

            public Builder setDayPaiPage(int value) {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).setDayPaiPage(value);
                return this;
            }

            public Builder setEventRemindPage(int value) {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).setEventRemindPage(value);
                return this;
            }

            public Builder setHourStepPage(int value) {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).setHourStepPage(value);
                return this;
            }

            public Builder setHrPage(int value) {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).setHrPage(value);
                return this;
            }

            public Builder setOtherWeatehrPage(int value) {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).setOtherWeatehrPage(value);
                return this;
            }

            public Builder setPaiPage(int value) {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).setPaiPage(value);
                return this;
            }

            public Builder setSportPage(int value) {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).setSportPage(value);
                return this;
            }

            public Builder setStepIdPage(int value) {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).setStepIdPage(value);
                return this;
            }

            public Builder setSunrisePage(int value) {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).setSunrisePage(value);
                return this;
            }

            public Builder setWeatherPage(int value) {
                copyOnWrite();
                ((EditDialEventMessage) this.instance).setWeatherPage(value);
                return this;
            }

            private Builder() {
                super(EditDialEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            EditDialEventMessage editDialEventMessage = new EditDialEventMessage();
            DEFAULT_INSTANCE = editDialEventMessage;
            GeneratedMessageLite.registerDefaultInstance(EditDialEventMessage.class, editDialEventMessage);
        }

        private EditDialEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAirQualityPage() {
            this.bitField0_ &= -2049;
            this.airQualityPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmPage() {
            this.bitField0_ &= -8193;
            this.alarmPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllDayHr() {
            this.bitField0_ &= -129;
            this.allDayHr_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatteryPage() {
            this.bitField0_ &= -17;
            this.batteryPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCalPage() {
            this.bitField0_ &= -5;
            this.calPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCalendarPage() {
            this.bitField0_ &= -16385;
            this.calendarPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDayPaiPage() {
            this.bitField0_ &= -33;
            this.dayPaiPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventRemindPage() {
            this.bitField0_ &= -4097;
            this.eventRemindPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHourStepPage() {
            this.bitField0_ &= -65;
            this.hourStepPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHrPage() {
            this.bitField0_ &= -3;
            this.hrPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherWeatehrPage() {
            this.bitField0_ &= -1025;
            this.otherWeatehrPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaiPage() {
            this.bitField0_ &= -9;
            this.paiPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportPage() {
            this.bitField0_ &= -32769;
            this.sportPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStepIdPage() {
            this.bitField0_ &= -2;
            this.stepIdPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSunrisePage() {
            this.bitField0_ &= -513;
            this.sunrisePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeatherPage() {
            this.bitField0_ &= -257;
            this.weatherPage_ = 0;
        }

        public static EditDialEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EditDialEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (EditDialEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static EditDialEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (EditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<EditDialEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAirQualityPage(int value) {
            this.bitField0_ |= 2048;
            this.airQualityPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPage(int value) {
            this.bitField0_ |= 8192;
            this.alarmPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllDayHr(int value) {
            this.bitField0_ |= 128;
            this.allDayHr_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatteryPage(int value) {
            this.bitField0_ |= 16;
            this.batteryPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalPage(int value) {
            this.bitField0_ |= 4;
            this.calPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalendarPage(int value) {
            this.bitField0_ |= 16384;
            this.calendarPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDayPaiPage(int value) {
            this.bitField0_ |= 32;
            this.dayPaiPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventRemindPage(int value) {
            this.bitField0_ |= 4096;
            this.eventRemindPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHourStepPage(int value) {
            this.bitField0_ |= 64;
            this.hourStepPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrPage(int value) {
            this.bitField0_ |= 2;
            this.hrPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherWeatehrPage(int value) {
            this.bitField0_ |= 1024;
            this.otherWeatehrPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaiPage(int value) {
            this.bitField0_ |= 8;
            this.paiPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportPage(int value) {
            this.bitField0_ |= 32768;
            this.sportPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStepIdPage(int value) {
            this.bitField0_ |= 1;
            this.stepIdPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSunrisePage(int value) {
            this.bitField0_ |= 512;
            this.sunrisePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherPage(int value) {
            this.bitField0_ |= 256;
            this.weatherPage_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new EditDialEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0010\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f", new Object[]{"bitField0_", "stepIdPage_", "hrPage_", "calPage_", "paiPage_", "batteryPage_", "dayPaiPage_", "hourStepPage_", "allDayHr_", "weatherPage_", "sunrisePage_", "otherWeatehrPage_", "airQualityPage_", "eventRemindPage_", "alarmPage_", "calendarPage_", "sportPage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EditDialEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (EditDialEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public int getAirQualityPage() {
            return this.airQualityPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public int getAlarmPage() {
            return this.alarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public int getAllDayHr() {
            return this.allDayHr_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public int getBatteryPage() {
            return this.batteryPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public int getCalPage() {
            return this.calPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public int getCalendarPage() {
            return this.calendarPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public int getDayPaiPage() {
            return this.dayPaiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public int getEventRemindPage() {
            return this.eventRemindPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public int getHourStepPage() {
            return this.hourStepPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public int getHrPage() {
            return this.hrPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public int getOtherWeatehrPage() {
            return this.otherWeatehrPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public int getPaiPage() {
            return this.paiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public int getSportPage() {
            return this.sportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public int getStepIdPage() {
            return this.stepIdPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public int getSunrisePage() {
            return this.sunrisePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public int getWeatherPage() {
            return this.weatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public boolean hasAirQualityPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public boolean hasAlarmPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public boolean hasAllDayHr() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public boolean hasBatteryPage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public boolean hasCalPage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public boolean hasCalendarPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public boolean hasDayPaiPage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public boolean hasEventRemindPage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public boolean hasHourStepPage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public boolean hasHrPage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public boolean hasOtherWeatehrPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public boolean hasPaiPage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public boolean hasSportPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public boolean hasStepIdPage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public boolean hasSunrisePage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.EditDialEventMessageOrBuilder
        public boolean hasWeatherPage() {
            return (this.bitField0_ & 256) != 0;
        }

        public static Builder newBuilder(EditDialEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static EditDialEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EditDialEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static EditDialEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static EditDialEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (EditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static EditDialEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static EditDialEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (EditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static EditDialEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static EditDialEventMessage parseFrom(InputStream input) throws IOException {
            return (EditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static EditDialEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static EditDialEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (EditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static EditDialEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface EditDialEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAirQualityPage();

        int getAlarmPage();

        int getAllDayHr();

        int getBatteryPage();

        int getCalPage();

        int getCalendarPage();

        int getDayPaiPage();

        int getEventRemindPage();

        int getHourStepPage();

        int getHrPage();

        int getOtherWeatehrPage();

        int getPaiPage();

        int getSportPage();

        int getStepIdPage();

        int getSunrisePage();

        int getWeatherPage();

        boolean hasAirQualityPage();

        boolean hasAlarmPage();

        boolean hasAllDayHr();

        boolean hasBatteryPage();

        boolean hasCalPage();

        boolean hasCalendarPage();

        boolean hasDayPaiPage();

        boolean hasEventRemindPage();

        boolean hasHourStepPage();

        boolean hasHrPage();

        boolean hasOtherWeatehrPage();

        boolean hasPaiPage();

        boolean hasSportPage();

        boolean hasStepIdPage();

        boolean hasSunrisePage();

        boolean hasWeatherPage();
    }

    public static final class LcdEventMessage extends GeneratedMessageLite<LcdEventMessage, Builder> implements LcdEventMessageOrBuilder {
        private static final LcdEventMessage DEFAULT_INSTANCE;
        public static final int LCDONBECAUSEOFEVENT_FIELD_NUMBER = 2;
        public static final int LCDONBECAUSEOFNOTIFY_FIELD_NUMBER = 3;
        public static final int LCDONBECAUSEOFPRESS_FIELD_NUMBER = 1;
        private static volatile Parser<LcdEventMessage> PARSER;
        private int bitField0_;
        private int lcdOnBecauseOfEvent_;
        private int lcdOnBecauseOfNotify_;
        private int lcdOnBecauseOfPress_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends GeneratedMessageLite.Builder<LcdEventMessage, Builder> implements LcdEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearLcdOnBecauseOfEvent() {
                copyOnWrite();
                ((LcdEventMessage) this.instance).clearLcdOnBecauseOfEvent();
                return this;
            }

            public Builder clearLcdOnBecauseOfNotify() {
                copyOnWrite();
                ((LcdEventMessage) this.instance).clearLcdOnBecauseOfNotify();
                return this;
            }

            public Builder clearLcdOnBecauseOfPress() {
                copyOnWrite();
                ((LcdEventMessage) this.instance).clearLcdOnBecauseOfPress();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.LcdEventMessageOrBuilder
            public int getLcdOnBecauseOfEvent() {
                return ((LcdEventMessage) this.instance).getLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.LcdEventMessageOrBuilder
            public int getLcdOnBecauseOfNotify() {
                return ((LcdEventMessage) this.instance).getLcdOnBecauseOfNotify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.LcdEventMessageOrBuilder
            public int getLcdOnBecauseOfPress() {
                return ((LcdEventMessage) this.instance).getLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.LcdEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfEvent() {
                return ((LcdEventMessage) this.instance).hasLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.LcdEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfNotify() {
                return ((LcdEventMessage) this.instance).hasLcdOnBecauseOfNotify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.LcdEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfPress() {
                return ((LcdEventMessage) this.instance).hasLcdOnBecauseOfPress();
            }

            public Builder setLcdOnBecauseOfEvent(int value) {
                copyOnWrite();
                ((LcdEventMessage) this.instance).setLcdOnBecauseOfEvent(value);
                return this;
            }

            public Builder setLcdOnBecauseOfNotify(int value) {
                copyOnWrite();
                ((LcdEventMessage) this.instance).setLcdOnBecauseOfNotify(value);
                return this;
            }

            public Builder setLcdOnBecauseOfPress(int value) {
                copyOnWrite();
                ((LcdEventMessage) this.instance).setLcdOnBecauseOfPress(value);
                return this;
            }

            private Builder() {
                super(LcdEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            LcdEventMessage lcdEventMessage = new LcdEventMessage();
            DEFAULT_INSTANCE = lcdEventMessage;
            GeneratedMessageLite.registerDefaultInstance(LcdEventMessage.class, lcdEventMessage);
        }

        private LcdEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnBecauseOfEvent() {
            this.bitField0_ &= -3;
            this.lcdOnBecauseOfEvent_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnBecauseOfNotify() {
            this.bitField0_ &= -5;
            this.lcdOnBecauseOfNotify_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnBecauseOfPress() {
            this.bitField0_ &= -2;
            this.lcdOnBecauseOfPress_ = 0;
        }

        public static LcdEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LcdEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (LcdEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static LcdEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (LcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<LcdEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfEvent(int value) {
            this.bitField0_ |= 2;
            this.lcdOnBecauseOfEvent_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfNotify(int value) {
            this.bitField0_ |= 4;
            this.lcdOnBecauseOfNotify_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfPress(int value) {
            this.bitField0_ |= 1;
            this.lcdOnBecauseOfPress_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new LcdEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"bitField0_", "lcdOnBecauseOfPress_", "lcdOnBecauseOfEvent_", "lcdOnBecauseOfNotify_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<LcdEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (LcdEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.LcdEventMessageOrBuilder
        public int getLcdOnBecauseOfEvent() {
            return this.lcdOnBecauseOfEvent_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.LcdEventMessageOrBuilder
        public int getLcdOnBecauseOfNotify() {
            return this.lcdOnBecauseOfNotify_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.LcdEventMessageOrBuilder
        public int getLcdOnBecauseOfPress() {
            return this.lcdOnBecauseOfPress_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.LcdEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfEvent() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.LcdEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfNotify() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.LcdEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfPress() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(LcdEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static LcdEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LcdEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static LcdEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static LcdEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (LcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static LcdEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static LcdEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (LcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static LcdEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static LcdEventMessage parseFrom(InputStream input) throws IOException {
            return (LcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static LcdEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static LcdEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (LcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static LcdEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface LcdEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getLcdOnBecauseOfEvent();

        int getLcdOnBecauseOfNotify();

        int getLcdOnBecauseOfPress();

        boolean hasLcdOnBecauseOfEvent();

        boolean hasLcdOnBecauseOfNotify();

        boolean hasLcdOnBecauseOfPress();
    }

    public static final class MenuEventMessage extends GeneratedMessageLite<MenuEventMessage, Builder> implements MenuEventMessageOrBuilder {
        public static final int ALARMPAGE_FIELD_NUMBER = 14;
        public static final int ALIPAYPAGE_FIELD_NUMBER = 20;
        public static final int BREATHEPAGE_FIELD_NUMBER = 6;
        public static final int CALENDERPAGE_FIELD_NUMBER = 22;
        public static final int CAMERAPAGE_FIELD_NUMBER = 15;
        public static final int COUNTDOWNPAGE_FIELD_NUMBER = 17;
        private static final MenuEventMessage DEFAULT_INSTANCE;
        public static final int DIALPAGE_FIELD_NUMBER = 23;
        public static final int EVENTREMINDPAGE_FIELD_NUMBER = 8;
        public static final int FINDPHONEPAGE_FIELD_NUMBER = 18;
        public static final int FLASHLIGHTPAGE_FIELD_NUMBER = 27;
        public static final int HEARTPAGE_FIELD_NUMBER = 2;
        public static final int MOREPAGE_FIELD_NUMBER = 12;
        public static final int MUSICPAGECOUNT_FIELD_NUMBER = 16;
        public static final int NFCPAGE_FIELD_NUMBER = 11;
        public static final int NOTIFYPAGE_FIELD_NUMBER = 4;
        public static final int PAIPAGE_FIELD_NUMBER = 3;
        private static volatile Parser<MenuEventMessage> PARSER = null;
        public static final int PHONEMUTEPAGE_FIELD_NUMBER = 19;
        public static final int PRESSUREPAGE_FIELD_NUMBER = 5;
        public static final int PROMODOROPAGE_FIELD_NUMBER = 28;
        public static final int SETTINGPAGE_FIELD_NUMBER = 24;
        public static final int SILENCEPAGE_FIELD_NUMBER = 13;
        public static final int SLEEPPAGE_FIELD_NUMBER = 29;
        public static final int SPO2PAGE_FIELD_NUMBER = 25;
        public static final int SPORTPAGE_FIELD_NUMBER = 10;
        public static final int SPORTRECODEPAGE_FIELD_NUMBER = 30;
        public static final int STATUSPAGE_FIELD_NUMBER = 1;
        public static final int WEATHERPAGE_FIELD_NUMBER = 9;
        public static final int WEICHATPAYPAGE_FIELD_NUMBER = 26;
        public static final int WOMENHEALTHPAGE_FIELD_NUMBER = 7;
        public static final int WORLDTIMEPAGE_FIELD_NUMBER = 21;
        private int alarmPage_;
        private int alipayPage_;
        private int bitField0_;
        private int breathePage_;
        private int calenderPage_;
        private int cameraPage_;
        private int countdownPage_;
        private int dialPage_;
        private int eventRemindPage_;
        private int findphonePage_;
        private int flashlightPage_;
        private int heartPage_;
        private byte memoizedIsInitialized = 2;
        private int morePage_;
        private int musicPageCount_;
        private int nfcPage_;
        private int notifyPage_;
        private int paiPage_;
        private int phonemutePage_;
        private int pressurePage_;
        private int promodoroPage_;
        private int settingPage_;
        private int silencePage_;
        private int sleepPage_;
        private int spo2Page_;
        private int sportPage_;
        private int sportrecodePage_;
        private int statusPage_;
        private int weatherPage_;
        private int weichatpayPage_;
        private int womenHealthPage_;
        private int worldTimePage_;

        public static final class Builder extends GeneratedMessageLite.Builder<MenuEventMessage, Builder> implements MenuEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearAlarmPage();
                return this;
            }

            public Builder clearAlipayPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearAlipayPage();
                return this;
            }

            public Builder clearBreathePage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearBreathePage();
                return this;
            }

            public Builder clearCalenderPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearCalenderPage();
                return this;
            }

            public Builder clearCameraPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearCameraPage();
                return this;
            }

            public Builder clearCountdownPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearCountdownPage();
                return this;
            }

            public Builder clearDialPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearDialPage();
                return this;
            }

            public Builder clearEventRemindPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearEventRemindPage();
                return this;
            }

            public Builder clearFindphonePage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearFindphonePage();
                return this;
            }

            public Builder clearFlashlightPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearFlashlightPage();
                return this;
            }

            public Builder clearHeartPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearHeartPage();
                return this;
            }

            public Builder clearMorePage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearMorePage();
                return this;
            }

            public Builder clearMusicPageCount() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearMusicPageCount();
                return this;
            }

            public Builder clearNfcPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearNfcPage();
                return this;
            }

            public Builder clearNotifyPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearNotifyPage();
                return this;
            }

            public Builder clearPaiPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearPaiPage();
                return this;
            }

            public Builder clearPhonemutePage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearPhonemutePage();
                return this;
            }

            public Builder clearPressurePage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearPressurePage();
                return this;
            }

            public Builder clearPromodoroPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearPromodoroPage();
                return this;
            }

            public Builder clearSettingPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearSettingPage();
                return this;
            }

            public Builder clearSilencePage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearSilencePage();
                return this;
            }

            public Builder clearSleepPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearSleepPage();
                return this;
            }

            public Builder clearSpo2Page() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearSpo2Page();
                return this;
            }

            public Builder clearSportPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearSportPage();
                return this;
            }

            public Builder clearSportrecodePage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearSportrecodePage();
                return this;
            }

            public Builder clearStatusPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearStatusPage();
                return this;
            }

            public Builder clearWeatherPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearWeatherPage();
                return this;
            }

            public Builder clearWeichatpayPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearWeichatpayPage();
                return this;
            }

            public Builder clearWomenHealthPage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearWomenHealthPage();
                return this;
            }

            public Builder clearWorldTimePage() {
                copyOnWrite();
                ((MenuEventMessage) this.instance).clearWorldTimePage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getAlarmPage() {
                return ((MenuEventMessage) this.instance).getAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getAlipayPage() {
                return ((MenuEventMessage) this.instance).getAlipayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getBreathePage() {
                return ((MenuEventMessage) this.instance).getBreathePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getCalenderPage() {
                return ((MenuEventMessage) this.instance).getCalenderPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getCameraPage() {
                return ((MenuEventMessage) this.instance).getCameraPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getCountdownPage() {
                return ((MenuEventMessage) this.instance).getCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getDialPage() {
                return ((MenuEventMessage) this.instance).getDialPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getEventRemindPage() {
                return ((MenuEventMessage) this.instance).getEventRemindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getFindphonePage() {
                return ((MenuEventMessage) this.instance).getFindphonePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getFlashlightPage() {
                return ((MenuEventMessage) this.instance).getFlashlightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getHeartPage() {
                return ((MenuEventMessage) this.instance).getHeartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getMorePage() {
                return ((MenuEventMessage) this.instance).getMorePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getMusicPageCount() {
                return ((MenuEventMessage) this.instance).getMusicPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getNfcPage() {
                return ((MenuEventMessage) this.instance).getNfcPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getNotifyPage() {
                return ((MenuEventMessage) this.instance).getNotifyPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getPaiPage() {
                return ((MenuEventMessage) this.instance).getPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getPhonemutePage() {
                return ((MenuEventMessage) this.instance).getPhonemutePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getPressurePage() {
                return ((MenuEventMessage) this.instance).getPressurePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getPromodoroPage() {
                return ((MenuEventMessage) this.instance).getPromodoroPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getSettingPage() {
                return ((MenuEventMessage) this.instance).getSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getSilencePage() {
                return ((MenuEventMessage) this.instance).getSilencePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getSleepPage() {
                return ((MenuEventMessage) this.instance).getSleepPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getSpo2Page() {
                return ((MenuEventMessage) this.instance).getSpo2Page();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getSportPage() {
                return ((MenuEventMessage) this.instance).getSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getSportrecodePage() {
                return ((MenuEventMessage) this.instance).getSportrecodePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getStatusPage() {
                return ((MenuEventMessage) this.instance).getStatusPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getWeatherPage() {
                return ((MenuEventMessage) this.instance).getWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getWeichatpayPage() {
                return ((MenuEventMessage) this.instance).getWeichatpayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getWomenHealthPage() {
                return ((MenuEventMessage) this.instance).getWomenHealthPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public int getWorldTimePage() {
                return ((MenuEventMessage) this.instance).getWorldTimePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasAlarmPage() {
                return ((MenuEventMessage) this.instance).hasAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasAlipayPage() {
                return ((MenuEventMessage) this.instance).hasAlipayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasBreathePage() {
                return ((MenuEventMessage) this.instance).hasBreathePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasCalenderPage() {
                return ((MenuEventMessage) this.instance).hasCalenderPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasCameraPage() {
                return ((MenuEventMessage) this.instance).hasCameraPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasCountdownPage() {
                return ((MenuEventMessage) this.instance).hasCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasDialPage() {
                return ((MenuEventMessage) this.instance).hasDialPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasEventRemindPage() {
                return ((MenuEventMessage) this.instance).hasEventRemindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasFindphonePage() {
                return ((MenuEventMessage) this.instance).hasFindphonePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasFlashlightPage() {
                return ((MenuEventMessage) this.instance).hasFlashlightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasHeartPage() {
                return ((MenuEventMessage) this.instance).hasHeartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasMorePage() {
                return ((MenuEventMessage) this.instance).hasMorePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasMusicPageCount() {
                return ((MenuEventMessage) this.instance).hasMusicPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasNfcPage() {
                return ((MenuEventMessage) this.instance).hasNfcPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasNotifyPage() {
                return ((MenuEventMessage) this.instance).hasNotifyPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasPaiPage() {
                return ((MenuEventMessage) this.instance).hasPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasPhonemutePage() {
                return ((MenuEventMessage) this.instance).hasPhonemutePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasPressurePage() {
                return ((MenuEventMessage) this.instance).hasPressurePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasPromodoroPage() {
                return ((MenuEventMessage) this.instance).hasPromodoroPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasSettingPage() {
                return ((MenuEventMessage) this.instance).hasSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasSilencePage() {
                return ((MenuEventMessage) this.instance).hasSilencePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasSleepPage() {
                return ((MenuEventMessage) this.instance).hasSleepPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasSpo2Page() {
                return ((MenuEventMessage) this.instance).hasSpo2Page();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasSportPage() {
                return ((MenuEventMessage) this.instance).hasSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasSportrecodePage() {
                return ((MenuEventMessage) this.instance).hasSportrecodePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasStatusPage() {
                return ((MenuEventMessage) this.instance).hasStatusPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasWeatherPage() {
                return ((MenuEventMessage) this.instance).hasWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasWeichatpayPage() {
                return ((MenuEventMessage) this.instance).hasWeichatpayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasWomenHealthPage() {
                return ((MenuEventMessage) this.instance).hasWomenHealthPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
            public boolean hasWorldTimePage() {
                return ((MenuEventMessage) this.instance).hasWorldTimePage();
            }

            public Builder setAlarmPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setAlarmPage(value);
                return this;
            }

            public Builder setAlipayPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setAlipayPage(value);
                return this;
            }

            public Builder setBreathePage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setBreathePage(value);
                return this;
            }

            public Builder setCalenderPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setCalenderPage(value);
                return this;
            }

            public Builder setCameraPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setCameraPage(value);
                return this;
            }

            public Builder setCountdownPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setCountdownPage(value);
                return this;
            }

            public Builder setDialPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setDialPage(value);
                return this;
            }

            public Builder setEventRemindPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setEventRemindPage(value);
                return this;
            }

            public Builder setFindphonePage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setFindphonePage(value);
                return this;
            }

            public Builder setFlashlightPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setFlashlightPage(value);
                return this;
            }

            public Builder setHeartPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setHeartPage(value);
                return this;
            }

            public Builder setMorePage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setMorePage(value);
                return this;
            }

            public Builder setMusicPageCount(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setMusicPageCount(value);
                return this;
            }

            public Builder setNfcPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setNfcPage(value);
                return this;
            }

            public Builder setNotifyPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setNotifyPage(value);
                return this;
            }

            public Builder setPaiPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setPaiPage(value);
                return this;
            }

            public Builder setPhonemutePage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setPhonemutePage(value);
                return this;
            }

            public Builder setPressurePage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setPressurePage(value);
                return this;
            }

            public Builder setPromodoroPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setPromodoroPage(value);
                return this;
            }

            public Builder setSettingPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setSettingPage(value);
                return this;
            }

            public Builder setSilencePage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setSilencePage(value);
                return this;
            }

            public Builder setSleepPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setSleepPage(value);
                return this;
            }

            public Builder setSpo2Page(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setSpo2Page(value);
                return this;
            }

            public Builder setSportPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setSportPage(value);
                return this;
            }

            public Builder setSportrecodePage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setSportrecodePage(value);
                return this;
            }

            public Builder setStatusPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setStatusPage(value);
                return this;
            }

            public Builder setWeatherPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setWeatherPage(value);
                return this;
            }

            public Builder setWeichatpayPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setWeichatpayPage(value);
                return this;
            }

            public Builder setWomenHealthPage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setWomenHealthPage(value);
                return this;
            }

            public Builder setWorldTimePage(int value) {
                copyOnWrite();
                ((MenuEventMessage) this.instance).setWorldTimePage(value);
                return this;
            }

            private Builder() {
                super(MenuEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            MenuEventMessage menuEventMessage = new MenuEventMessage();
            DEFAULT_INSTANCE = menuEventMessage;
            GeneratedMessageLite.registerDefaultInstance(MenuEventMessage.class, menuEventMessage);
        }

        private MenuEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmPage() {
            this.bitField0_ &= -8193;
            this.alarmPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayPage() {
            this.bitField0_ &= -524289;
            this.alipayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBreathePage() {
            this.bitField0_ &= -33;
            this.breathePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCalenderPage() {
            this.bitField0_ &= -2097153;
            this.calenderPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCameraPage() {
            this.bitField0_ &= -16385;
            this.cameraPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountdownPage() {
            this.bitField0_ &= -65537;
            this.countdownPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialPage() {
            this.bitField0_ &= -4194305;
            this.dialPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventRemindPage() {
            this.bitField0_ &= -129;
            this.eventRemindPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindphonePage() {
            this.bitField0_ &= -131073;
            this.findphonePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlashlightPage() {
            this.bitField0_ &= -67108865;
            this.flashlightPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeartPage() {
            this.bitField0_ &= -3;
            this.heartPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMorePage() {
            this.bitField0_ &= -2049;
            this.morePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicPageCount() {
            this.bitField0_ &= -32769;
            this.musicPageCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNfcPage() {
            this.bitField0_ &= -1025;
            this.nfcPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotifyPage() {
            this.bitField0_ &= -9;
            this.notifyPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaiPage() {
            this.bitField0_ &= -5;
            this.paiPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhonemutePage() {
            this.bitField0_ &= -262145;
            this.phonemutePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPressurePage() {
            this.bitField0_ &= -17;
            this.pressurePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPromodoroPage() {
            this.bitField0_ &= -134217729;
            this.promodoroPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingPage() {
            this.bitField0_ &= -8388609;
            this.settingPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilencePage() {
            this.bitField0_ &= -4097;
            this.silencePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSleepPage() {
            this.bitField0_ &= -268435457;
            this.sleepPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpo2Page() {
            this.bitField0_ &= -16777217;
            this.spo2Page_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportPage() {
            this.bitField0_ &= -513;
            this.sportPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportrecodePage() {
            this.bitField0_ &= -536870913;
            this.sportrecodePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusPage() {
            this.bitField0_ &= -2;
            this.statusPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeatherPage() {
            this.bitField0_ &= -257;
            this.weatherPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeichatpayPage() {
            this.bitField0_ &= -33554433;
            this.weichatpayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWomenHealthPage() {
            this.bitField0_ &= -65;
            this.womenHealthPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWorldTimePage() {
            this.bitField0_ &= -1048577;
            this.worldTimePage_ = 0;
        }

        public static MenuEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MenuEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (MenuEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static MenuEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (MenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<MenuEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPage(int value) {
            this.bitField0_ |= 8192;
            this.alarmPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayPage(int value) {
            this.bitField0_ |= 524288;
            this.alipayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBreathePage(int value) {
            this.bitField0_ |= 32;
            this.breathePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalenderPage(int value) {
            this.bitField0_ |= 2097152;
            this.calenderPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCameraPage(int value) {
            this.bitField0_ |= 16384;
            this.cameraPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountdownPage(int value) {
            this.bitField0_ |= 65536;
            this.countdownPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialPage(int value) {
            this.bitField0_ |= 4194304;
            this.dialPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventRemindPage(int value) {
            this.bitField0_ |= 128;
            this.eventRemindPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindphonePage(int value) {
            this.bitField0_ |= 131072;
            this.findphonePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlashlightPage(int value) {
            this.bitField0_ |= 67108864;
            this.flashlightPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeartPage(int value) {
            this.bitField0_ |= 2;
            this.heartPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMorePage(int value) {
            this.bitField0_ |= 2048;
            this.morePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicPageCount(int value) {
            this.bitField0_ |= 32768;
            this.musicPageCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNfcPage(int value) {
            this.bitField0_ |= 1024;
            this.nfcPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyPage(int value) {
            this.bitField0_ |= 8;
            this.notifyPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaiPage(int value) {
            this.bitField0_ |= 4;
            this.paiPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhonemutePage(int value) {
            this.bitField0_ |= 262144;
            this.phonemutePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPressurePage(int value) {
            this.bitField0_ |= 16;
            this.pressurePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPromodoroPage(int value) {
            this.bitField0_ |= AMapEngineUtils.HALF_MAX_P20_WIDTH;
            this.promodoroPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingPage(int value) {
            this.bitField0_ |= 8388608;
            this.settingPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilencePage(int value) {
            this.bitField0_ |= 4096;
            this.silencePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepPage(int value) {
            this.bitField0_ |= 268435456;
            this.sleepPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpo2Page(int value) {
            this.bitField0_ |= 16777216;
            this.spo2Page_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportPage(int value) {
            this.bitField0_ |= 512;
            this.sportPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportrecodePage(int value) {
            this.bitField0_ |= 536870912;
            this.sportrecodePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusPage(int value) {
            this.bitField0_ |= 1;
            this.statusPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherPage(int value) {
            this.bitField0_ |= 256;
            this.weatherPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeichatpayPage(int value) {
            this.bitField0_ |= 33554432;
            this.weichatpayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWomenHealthPage(int value) {
            this.bitField0_ |= 64;
            this.womenHealthPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWorldTimePage(int value) {
            this.bitField0_ |= 1048576;
            this.worldTimePage_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new MenuEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001e\u0000\u0001\u0001\u001e\u001e\u0000\u0000\u001e\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018\u001aᔋ\u0019\u001bᔋ\u001a\u001cᔋ\u001b\u001dᔋ\u001c\u001eᔋ\u001d", new Object[]{"bitField0_", "statusPage_", "heartPage_", "paiPage_", "notifyPage_", "pressurePage_", "breathePage_", "womenHealthPage_", "eventRemindPage_", "weatherPage_", "sportPage_", "nfcPage_", "morePage_", "silencePage_", "alarmPage_", "cameraPage_", "musicPageCount_", "countdownPage_", "findphonePage_", "phonemutePage_", "alipayPage_", "worldTimePage_", "calenderPage_", "dialPage_", "settingPage_", "spo2Page_", "weichatpayPage_", "flashlightPage_", "promodoroPage_", "sleepPage_", "sportrecodePage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MenuEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (MenuEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getAlarmPage() {
            return this.alarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getAlipayPage() {
            return this.alipayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getBreathePage() {
            return this.breathePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getCalenderPage() {
            return this.calenderPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getCameraPage() {
            return this.cameraPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getCountdownPage() {
            return this.countdownPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getDialPage() {
            return this.dialPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getEventRemindPage() {
            return this.eventRemindPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getFindphonePage() {
            return this.findphonePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getFlashlightPage() {
            return this.flashlightPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getHeartPage() {
            return this.heartPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getMorePage() {
            return this.morePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getMusicPageCount() {
            return this.musicPageCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getNfcPage() {
            return this.nfcPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getNotifyPage() {
            return this.notifyPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getPaiPage() {
            return this.paiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getPhonemutePage() {
            return this.phonemutePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getPressurePage() {
            return this.pressurePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getPromodoroPage() {
            return this.promodoroPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getSettingPage() {
            return this.settingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getSilencePage() {
            return this.silencePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getSleepPage() {
            return this.sleepPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getSpo2Page() {
            return this.spo2Page_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getSportPage() {
            return this.sportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getSportrecodePage() {
            return this.sportrecodePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getStatusPage() {
            return this.statusPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getWeatherPage() {
            return this.weatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getWeichatpayPage() {
            return this.weichatpayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getWomenHealthPage() {
            return this.womenHealthPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public int getWorldTimePage() {
            return this.worldTimePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasAlarmPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasAlipayPage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasBreathePage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasCalenderPage() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasCameraPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasCountdownPage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasDialPage() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasEventRemindPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasFindphonePage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasFlashlightPage() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasHeartPage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasMorePage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasMusicPageCount() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasNfcPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasNotifyPage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasPaiPage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasPhonemutePage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasPressurePage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasPromodoroPage() {
            return (this.bitField0_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasSettingPage() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasSilencePage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasSleepPage() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasSpo2Page() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasSportPage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasSportrecodePage() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasStatusPage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasWeatherPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasWeichatpayPage() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasWomenHealthPage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MenuEventMessageOrBuilder
        public boolean hasWorldTimePage() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public static Builder newBuilder(MenuEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static MenuEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MenuEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MenuEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MenuEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (MenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MenuEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MenuEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (MenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MenuEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MenuEventMessage parseFrom(InputStream input) throws IOException {
            return (MenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MenuEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MenuEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (MenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MenuEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface MenuEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlarmPage();

        int getAlipayPage();

        int getBreathePage();

        int getCalenderPage();

        int getCameraPage();

        int getCountdownPage();

        int getDialPage();

        int getEventRemindPage();

        int getFindphonePage();

        int getFlashlightPage();

        int getHeartPage();

        int getMorePage();

        int getMusicPageCount();

        int getNfcPage();

        int getNotifyPage();

        int getPaiPage();

        int getPhonemutePage();

        int getPressurePage();

        int getPromodoroPage();

        int getSettingPage();

        int getSilencePage();

        int getSleepPage();

        int getSpo2Page();

        int getSportPage();

        int getSportrecodePage();

        int getStatusPage();

        int getWeatherPage();

        int getWeichatpayPage();

        int getWomenHealthPage();

        int getWorldTimePage();

        boolean hasAlarmPage();

        boolean hasAlipayPage();

        boolean hasBreathePage();

        boolean hasCalenderPage();

        boolean hasCameraPage();

        boolean hasCountdownPage();

        boolean hasDialPage();

        boolean hasEventRemindPage();

        boolean hasFindphonePage();

        boolean hasFlashlightPage();

        boolean hasHeartPage();

        boolean hasMorePage();

        boolean hasMusicPageCount();

        boolean hasNfcPage();

        boolean hasNotifyPage();

        boolean hasPaiPage();

        boolean hasPhonemutePage();

        boolean hasPressurePage();

        boolean hasPromodoroPage();

        boolean hasSettingPage();

        boolean hasSilencePage();

        boolean hasSleepPage();

        boolean hasSpo2Page();

        boolean hasSportPage();

        boolean hasSportrecodePage();

        boolean hasStatusPage();

        boolean hasWeatherPage();

        boolean hasWeichatpayPage();

        boolean hasWomenHealthPage();

        boolean hasWorldTimePage();
    }

    public static final class MoreEventMessage extends GeneratedMessageLite<MoreEventMessage, Builder> implements MoreEventMessageOrBuilder {
        public static final int ALARMCLOSEPAGE_FIELD_NUMBER = 4;
        public static final int ALARMCREATEBYALEAXPAGE_FIELD_NUMBER = 23;
        public static final int ALARMCREATEBYAPPPAGE_FIELD_NUMBER = 3;
        public static final int ALARMCREATEBYXIAOAIPAGE_FIELD_NUMBER = 2;
        public static final int ALARMOPENPAGE_FIELD_NUMBER = 1;
        public static final int ALIPAYBINDPAGE_FIELD_NUMBER = 16;
        public static final int AUTOCLOSELCDPAGE_FIELD_NUMBER = 20;
        public static final int BRIGHTPAGE_FIELD_NUMBER = 19;
        private static final MoreEventMessage DEFAULT_INSTANCE;
        public static final int EVENTCREATEBYALEAXPAGE_FIELD_NUMBER = 24;
        public static final int EVENTCREATEBYAPPPAGE_FIELD_NUMBER = 6;
        public static final int EVENTCREATEBYXIAOAIPAGE_FIELD_NUMBER = 5;
        public static final int LOOKSCREENCLOASEPAGE_FIELD_NUMBER = 18;
        public static final int LOOKSCREENOPENPAGE_FIELD_NUMBER = 17;
        public static final int MUSICCONTROLPAUSEPAGE1_FIELD_NUMBER = 10;
        public static final int MUSICCONTROLPAUSEPAGE2_FIELD_NUMBER = 13;
        public static final int MUSICCONTROLPAUSEPAGE3_FIELD_NUMBER = 27;
        public static final int MUSICCONTROLPRENEXTPAGE1_FIELD_NUMBER = 9;
        public static final int MUSICCONTROLPRENEXTPAGE2_FIELD_NUMBER = 12;
        public static final int MUSICCONTROLPRENEXTPAGE3_FIELD_NUMBER = 26;
        public static final int MUSICCONTROLVOLUMEPAGE1_FIELD_NUMBER = 8;
        public static final int MUSICCONTROLVOLUMEPAGE2_FIELD_NUMBER = 11;
        public static final int MUSICCONTROLVOLUMEPAGE3_FIELD_NUMBER = 25;
        public static final int MUTECLOSEPAGE_FIELD_NUMBER = 15;
        public static final int MUTEOPENPAGE_FIELD_NUMBER = 14;
        private static volatile Parser<MoreEventMessage> PARSER = null;
        public static final int SHORTCUTPAGE_FIELD_NUMBER = 21;
        public static final int TAKEPHOTOSPAGE_FIELD_NUMBER = 7;
        public static final int WEICHATPAYBINDPAGE_FIELD_NUMBER = 22;
        private int alarmClosePage_;
        private int alarmCreateByAleaxPage_;
        private int alarmCreateByAppPage_;
        private int alarmCreateByXiaoaiPage_;
        private int alarmOpenPage_;
        private int alipayBindPage_;
        private int autoCloseLcdPage_;
        private int bitField0_;
        private int brightPage_;
        private int eventCreateByAleaxPage_;
        private int eventCreateByAppPage_;
        private int eventCreateByXiaoaiPage_;
        private int lookScreenCloasePage_;
        private int lookScreenOpenPage_;
        private byte memoizedIsInitialized = 2;
        private int musicControlPausePage1_;
        private int musicControlPausePage2_;
        private int musicControlPausePage3_;
        private int musicControlPreNextPage1_;
        private int musicControlPreNextPage2_;
        private int musicControlPreNextPage3_;
        private int musicControlVolumePage1_;
        private int musicControlVolumePage2_;
        private int musicControlVolumePage3_;
        private int muteClosePage_;
        private int muteOpenPage_;
        private int shortcutPage_;
        private int takePhotosPage_;
        private int weichatpayBindPage_;

        public static final class Builder extends GeneratedMessageLite.Builder<MoreEventMessage, Builder> implements MoreEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmClosePage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearAlarmClosePage();
                return this;
            }

            public Builder clearAlarmCreateByAleaxPage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearAlarmCreateByAleaxPage();
                return this;
            }

            public Builder clearAlarmCreateByAppPage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearAlarmCreateByAppPage();
                return this;
            }

            public Builder clearAlarmCreateByXiaoaiPage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearAlarmCreateByXiaoaiPage();
                return this;
            }

            public Builder clearAlarmOpenPage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearAlarmOpenPage();
                return this;
            }

            public Builder clearAlipayBindPage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearAlipayBindPage();
                return this;
            }

            public Builder clearAutoCloseLcdPage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearAutoCloseLcdPage();
                return this;
            }

            public Builder clearBrightPage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearBrightPage();
                return this;
            }

            public Builder clearEventCreateByAleaxPage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearEventCreateByAleaxPage();
                return this;
            }

            public Builder clearEventCreateByAppPage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearEventCreateByAppPage();
                return this;
            }

            public Builder clearEventCreateByXiaoaiPage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearEventCreateByXiaoaiPage();
                return this;
            }

            public Builder clearLookScreenCloasePage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearLookScreenCloasePage();
                return this;
            }

            public Builder clearLookScreenOpenPage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearLookScreenOpenPage();
                return this;
            }

            public Builder clearMusicControlPausePage1() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearMusicControlPausePage1();
                return this;
            }

            public Builder clearMusicControlPausePage2() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearMusicControlPausePage2();
                return this;
            }

            public Builder clearMusicControlPausePage3() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearMusicControlPausePage3();
                return this;
            }

            public Builder clearMusicControlPreNextPage1() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearMusicControlPreNextPage1();
                return this;
            }

            public Builder clearMusicControlPreNextPage2() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearMusicControlPreNextPage2();
                return this;
            }

            public Builder clearMusicControlPreNextPage3() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearMusicControlPreNextPage3();
                return this;
            }

            public Builder clearMusicControlVolumePage1() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearMusicControlVolumePage1();
                return this;
            }

            public Builder clearMusicControlVolumePage2() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearMusicControlVolumePage2();
                return this;
            }

            public Builder clearMusicControlVolumePage3() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearMusicControlVolumePage3();
                return this;
            }

            public Builder clearMuteClosePage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearMuteClosePage();
                return this;
            }

            public Builder clearMuteOpenPage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearMuteOpenPage();
                return this;
            }

            public Builder clearShortcutPage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearShortcutPage();
                return this;
            }

            public Builder clearTakePhotosPage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearTakePhotosPage();
                return this;
            }

            public Builder clearWeichatpayBindPage() {
                copyOnWrite();
                ((MoreEventMessage) this.instance).clearWeichatpayBindPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getAlarmClosePage() {
                return ((MoreEventMessage) this.instance).getAlarmClosePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getAlarmCreateByAleaxPage() {
                return ((MoreEventMessage) this.instance).getAlarmCreateByAleaxPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getAlarmCreateByAppPage() {
                return ((MoreEventMessage) this.instance).getAlarmCreateByAppPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getAlarmCreateByXiaoaiPage() {
                return ((MoreEventMessage) this.instance).getAlarmCreateByXiaoaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getAlarmOpenPage() {
                return ((MoreEventMessage) this.instance).getAlarmOpenPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getAlipayBindPage() {
                return ((MoreEventMessage) this.instance).getAlipayBindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getAutoCloseLcdPage() {
                return ((MoreEventMessage) this.instance).getAutoCloseLcdPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getBrightPage() {
                return ((MoreEventMessage) this.instance).getBrightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getEventCreateByAleaxPage() {
                return ((MoreEventMessage) this.instance).getEventCreateByAleaxPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getEventCreateByAppPage() {
                return ((MoreEventMessage) this.instance).getEventCreateByAppPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getEventCreateByXiaoaiPage() {
                return ((MoreEventMessage) this.instance).getEventCreateByXiaoaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getLookScreenCloasePage() {
                return ((MoreEventMessage) this.instance).getLookScreenCloasePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getLookScreenOpenPage() {
                return ((MoreEventMessage) this.instance).getLookScreenOpenPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getMusicControlPausePage1() {
                return ((MoreEventMessage) this.instance).getMusicControlPausePage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getMusicControlPausePage2() {
                return ((MoreEventMessage) this.instance).getMusicControlPausePage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getMusicControlPausePage3() {
                return ((MoreEventMessage) this.instance).getMusicControlPausePage3();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getMusicControlPreNextPage1() {
                return ((MoreEventMessage) this.instance).getMusicControlPreNextPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getMusicControlPreNextPage2() {
                return ((MoreEventMessage) this.instance).getMusicControlPreNextPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getMusicControlPreNextPage3() {
                return ((MoreEventMessage) this.instance).getMusicControlPreNextPage3();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getMusicControlVolumePage1() {
                return ((MoreEventMessage) this.instance).getMusicControlVolumePage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getMusicControlVolumePage2() {
                return ((MoreEventMessage) this.instance).getMusicControlVolumePage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getMusicControlVolumePage3() {
                return ((MoreEventMessage) this.instance).getMusicControlVolumePage3();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getMuteClosePage() {
                return ((MoreEventMessage) this.instance).getMuteClosePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getMuteOpenPage() {
                return ((MoreEventMessage) this.instance).getMuteOpenPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getShortcutPage() {
                return ((MoreEventMessage) this.instance).getShortcutPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getTakePhotosPage() {
                return ((MoreEventMessage) this.instance).getTakePhotosPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public int getWeichatpayBindPage() {
                return ((MoreEventMessage) this.instance).getWeichatpayBindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasAlarmClosePage() {
                return ((MoreEventMessage) this.instance).hasAlarmClosePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasAlarmCreateByAleaxPage() {
                return ((MoreEventMessage) this.instance).hasAlarmCreateByAleaxPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasAlarmCreateByAppPage() {
                return ((MoreEventMessage) this.instance).hasAlarmCreateByAppPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasAlarmCreateByXiaoaiPage() {
                return ((MoreEventMessage) this.instance).hasAlarmCreateByXiaoaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasAlarmOpenPage() {
                return ((MoreEventMessage) this.instance).hasAlarmOpenPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasAlipayBindPage() {
                return ((MoreEventMessage) this.instance).hasAlipayBindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasAutoCloseLcdPage() {
                return ((MoreEventMessage) this.instance).hasAutoCloseLcdPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasBrightPage() {
                return ((MoreEventMessage) this.instance).hasBrightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasEventCreateByAleaxPage() {
                return ((MoreEventMessage) this.instance).hasEventCreateByAleaxPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasEventCreateByAppPage() {
                return ((MoreEventMessage) this.instance).hasEventCreateByAppPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasEventCreateByXiaoaiPage() {
                return ((MoreEventMessage) this.instance).hasEventCreateByXiaoaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasLookScreenCloasePage() {
                return ((MoreEventMessage) this.instance).hasLookScreenCloasePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasLookScreenOpenPage() {
                return ((MoreEventMessage) this.instance).hasLookScreenOpenPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasMusicControlPausePage1() {
                return ((MoreEventMessage) this.instance).hasMusicControlPausePage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasMusicControlPausePage2() {
                return ((MoreEventMessage) this.instance).hasMusicControlPausePage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasMusicControlPausePage3() {
                return ((MoreEventMessage) this.instance).hasMusicControlPausePage3();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasMusicControlPreNextPage1() {
                return ((MoreEventMessage) this.instance).hasMusicControlPreNextPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasMusicControlPreNextPage2() {
                return ((MoreEventMessage) this.instance).hasMusicControlPreNextPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasMusicControlPreNextPage3() {
                return ((MoreEventMessage) this.instance).hasMusicControlPreNextPage3();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasMusicControlVolumePage1() {
                return ((MoreEventMessage) this.instance).hasMusicControlVolumePage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasMusicControlVolumePage2() {
                return ((MoreEventMessage) this.instance).hasMusicControlVolumePage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasMusicControlVolumePage3() {
                return ((MoreEventMessage) this.instance).hasMusicControlVolumePage3();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasMuteClosePage() {
                return ((MoreEventMessage) this.instance).hasMuteClosePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasMuteOpenPage() {
                return ((MoreEventMessage) this.instance).hasMuteOpenPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasShortcutPage() {
                return ((MoreEventMessage) this.instance).hasShortcutPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasTakePhotosPage() {
                return ((MoreEventMessage) this.instance).hasTakePhotosPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
            public boolean hasWeichatpayBindPage() {
                return ((MoreEventMessage) this.instance).hasWeichatpayBindPage();
            }

            public Builder setAlarmClosePage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setAlarmClosePage(value);
                return this;
            }

            public Builder setAlarmCreateByAleaxPage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setAlarmCreateByAleaxPage(value);
                return this;
            }

            public Builder setAlarmCreateByAppPage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setAlarmCreateByAppPage(value);
                return this;
            }

            public Builder setAlarmCreateByXiaoaiPage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setAlarmCreateByXiaoaiPage(value);
                return this;
            }

            public Builder setAlarmOpenPage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setAlarmOpenPage(value);
                return this;
            }

            public Builder setAlipayBindPage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setAlipayBindPage(value);
                return this;
            }

            public Builder setAutoCloseLcdPage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setAutoCloseLcdPage(value);
                return this;
            }

            public Builder setBrightPage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setBrightPage(value);
                return this;
            }

            public Builder setEventCreateByAleaxPage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setEventCreateByAleaxPage(value);
                return this;
            }

            public Builder setEventCreateByAppPage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setEventCreateByAppPage(value);
                return this;
            }

            public Builder setEventCreateByXiaoaiPage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setEventCreateByXiaoaiPage(value);
                return this;
            }

            public Builder setLookScreenCloasePage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setLookScreenCloasePage(value);
                return this;
            }

            public Builder setLookScreenOpenPage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setLookScreenOpenPage(value);
                return this;
            }

            public Builder setMusicControlPausePage1(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setMusicControlPausePage1(value);
                return this;
            }

            public Builder setMusicControlPausePage2(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setMusicControlPausePage2(value);
                return this;
            }

            public Builder setMusicControlPausePage3(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setMusicControlPausePage3(value);
                return this;
            }

            public Builder setMusicControlPreNextPage1(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setMusicControlPreNextPage1(value);
                return this;
            }

            public Builder setMusicControlPreNextPage2(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setMusicControlPreNextPage2(value);
                return this;
            }

            public Builder setMusicControlPreNextPage3(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setMusicControlPreNextPage3(value);
                return this;
            }

            public Builder setMusicControlVolumePage1(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setMusicControlVolumePage1(value);
                return this;
            }

            public Builder setMusicControlVolumePage2(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setMusicControlVolumePage2(value);
                return this;
            }

            public Builder setMusicControlVolumePage3(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setMusicControlVolumePage3(value);
                return this;
            }

            public Builder setMuteClosePage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setMuteClosePage(value);
                return this;
            }

            public Builder setMuteOpenPage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setMuteOpenPage(value);
                return this;
            }

            public Builder setShortcutPage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setShortcutPage(value);
                return this;
            }

            public Builder setTakePhotosPage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setTakePhotosPage(value);
                return this;
            }

            public Builder setWeichatpayBindPage(int value) {
                copyOnWrite();
                ((MoreEventMessage) this.instance).setWeichatpayBindPage(value);
                return this;
            }

            private Builder() {
                super(MoreEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            MoreEventMessage moreEventMessage = new MoreEventMessage();
            DEFAULT_INSTANCE = moreEventMessage;
            GeneratedMessageLite.registerDefaultInstance(MoreEventMessage.class, moreEventMessage);
        }

        private MoreEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmClosePage() {
            this.bitField0_ &= -9;
            this.alarmClosePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmCreateByAleaxPage() {
            this.bitField0_ &= -4194305;
            this.alarmCreateByAleaxPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmCreateByAppPage() {
            this.bitField0_ &= -5;
            this.alarmCreateByAppPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmCreateByXiaoaiPage() {
            this.bitField0_ &= -3;
            this.alarmCreateByXiaoaiPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmOpenPage() {
            this.bitField0_ &= -2;
            this.alarmOpenPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayBindPage() {
            this.bitField0_ &= -32769;
            this.alipayBindPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoCloseLcdPage() {
            this.bitField0_ &= -524289;
            this.autoCloseLcdPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBrightPage() {
            this.bitField0_ &= -262145;
            this.brightPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventCreateByAleaxPage() {
            this.bitField0_ &= -8388609;
            this.eventCreateByAleaxPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventCreateByAppPage() {
            this.bitField0_ &= -33;
            this.eventCreateByAppPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventCreateByXiaoaiPage() {
            this.bitField0_ &= -17;
            this.eventCreateByXiaoaiPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLookScreenCloasePage() {
            this.bitField0_ &= -131073;
            this.lookScreenCloasePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLookScreenOpenPage() {
            this.bitField0_ &= -65537;
            this.lookScreenOpenPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicControlPausePage1() {
            this.bitField0_ &= -513;
            this.musicControlPausePage1_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicControlPausePage2() {
            this.bitField0_ &= -4097;
            this.musicControlPausePage2_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicControlPausePage3() {
            this.bitField0_ &= -67108865;
            this.musicControlPausePage3_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicControlPreNextPage1() {
            this.bitField0_ &= -257;
            this.musicControlPreNextPage1_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicControlPreNextPage2() {
            this.bitField0_ &= -2049;
            this.musicControlPreNextPage2_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicControlPreNextPage3() {
            this.bitField0_ &= -33554433;
            this.musicControlPreNextPage3_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicControlVolumePage1() {
            this.bitField0_ &= -129;
            this.musicControlVolumePage1_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicControlVolumePage2() {
            this.bitField0_ &= -1025;
            this.musicControlVolumePage2_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicControlVolumePage3() {
            this.bitField0_ &= -16777217;
            this.musicControlVolumePage3_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMuteClosePage() {
            this.bitField0_ &= -16385;
            this.muteClosePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMuteOpenPage() {
            this.bitField0_ &= -8193;
            this.muteOpenPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShortcutPage() {
            this.bitField0_ &= -1048577;
            this.shortcutPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTakePhotosPage() {
            this.bitField0_ &= -65;
            this.takePhotosPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeichatpayBindPage() {
            this.bitField0_ &= -2097153;
            this.weichatpayBindPage_ = 0;
        }

        public static MoreEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MoreEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (MoreEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static MoreEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (MoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<MoreEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmClosePage(int value) {
            this.bitField0_ |= 8;
            this.alarmClosePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmCreateByAleaxPage(int value) {
            this.bitField0_ |= 4194304;
            this.alarmCreateByAleaxPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmCreateByAppPage(int value) {
            this.bitField0_ |= 4;
            this.alarmCreateByAppPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmCreateByXiaoaiPage(int value) {
            this.bitField0_ |= 2;
            this.alarmCreateByXiaoaiPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmOpenPage(int value) {
            this.bitField0_ |= 1;
            this.alarmOpenPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayBindPage(int value) {
            this.bitField0_ |= 32768;
            this.alipayBindPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoCloseLcdPage(int value) {
            this.bitField0_ |= 524288;
            this.autoCloseLcdPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrightPage(int value) {
            this.bitField0_ |= 262144;
            this.brightPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventCreateByAleaxPage(int value) {
            this.bitField0_ |= 8388608;
            this.eventCreateByAleaxPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventCreateByAppPage(int value) {
            this.bitField0_ |= 32;
            this.eventCreateByAppPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventCreateByXiaoaiPage(int value) {
            this.bitField0_ |= 16;
            this.eventCreateByXiaoaiPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLookScreenCloasePage(int value) {
            this.bitField0_ |= 131072;
            this.lookScreenCloasePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLookScreenOpenPage(int value) {
            this.bitField0_ |= 65536;
            this.lookScreenOpenPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicControlPausePage1(int value) {
            this.bitField0_ |= 512;
            this.musicControlPausePage1_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicControlPausePage2(int value) {
            this.bitField0_ |= 4096;
            this.musicControlPausePage2_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicControlPausePage3(int value) {
            this.bitField0_ |= 67108864;
            this.musicControlPausePage3_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicControlPreNextPage1(int value) {
            this.bitField0_ |= 256;
            this.musicControlPreNextPage1_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicControlPreNextPage2(int value) {
            this.bitField0_ |= 2048;
            this.musicControlPreNextPage2_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicControlPreNextPage3(int value) {
            this.bitField0_ |= 33554432;
            this.musicControlPreNextPage3_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicControlVolumePage1(int value) {
            this.bitField0_ |= 128;
            this.musicControlVolumePage1_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicControlVolumePage2(int value) {
            this.bitField0_ |= 1024;
            this.musicControlVolumePage2_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicControlVolumePage3(int value) {
            this.bitField0_ |= 16777216;
            this.musicControlVolumePage3_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMuteClosePage(int value) {
            this.bitField0_ |= 16384;
            this.muteClosePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMuteOpenPage(int value) {
            this.bitField0_ |= 8192;
            this.muteOpenPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutPage(int value) {
            this.bitField0_ |= 1048576;
            this.shortcutPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTakePhotosPage(int value) {
            this.bitField0_ |= 64;
            this.takePhotosPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeichatpayBindPage(int value) {
            this.bitField0_ |= 2097152;
            this.weichatpayBindPage_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new MoreEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0000\u001b\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018\u001aᔋ\u0019\u001bᔋ\u001a", new Object[]{"bitField0_", "alarmOpenPage_", "alarmCreateByXiaoaiPage_", "alarmCreateByAppPage_", "alarmClosePage_", "eventCreateByXiaoaiPage_", "eventCreateByAppPage_", "takePhotosPage_", "musicControlVolumePage1_", "musicControlPreNextPage1_", "musicControlPausePage1_", "musicControlVolumePage2_", "musicControlPreNextPage2_", "musicControlPausePage2_", "muteOpenPage_", "muteClosePage_", "alipayBindPage_", "lookScreenOpenPage_", "lookScreenCloasePage_", "brightPage_", "autoCloseLcdPage_", "shortcutPage_", "weichatpayBindPage_", "alarmCreateByAleaxPage_", "eventCreateByAleaxPage_", "musicControlVolumePage3_", "musicControlPreNextPage3_", "musicControlPausePage3_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MoreEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (MoreEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getAlarmClosePage() {
            return this.alarmClosePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getAlarmCreateByAleaxPage() {
            return this.alarmCreateByAleaxPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getAlarmCreateByAppPage() {
            return this.alarmCreateByAppPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getAlarmCreateByXiaoaiPage() {
            return this.alarmCreateByXiaoaiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getAlarmOpenPage() {
            return this.alarmOpenPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getAlipayBindPage() {
            return this.alipayBindPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getAutoCloseLcdPage() {
            return this.autoCloseLcdPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getBrightPage() {
            return this.brightPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getEventCreateByAleaxPage() {
            return this.eventCreateByAleaxPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getEventCreateByAppPage() {
            return this.eventCreateByAppPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getEventCreateByXiaoaiPage() {
            return this.eventCreateByXiaoaiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getLookScreenCloasePage() {
            return this.lookScreenCloasePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getLookScreenOpenPage() {
            return this.lookScreenOpenPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getMusicControlPausePage1() {
            return this.musicControlPausePage1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getMusicControlPausePage2() {
            return this.musicControlPausePage2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getMusicControlPausePage3() {
            return this.musicControlPausePage3_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getMusicControlPreNextPage1() {
            return this.musicControlPreNextPage1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getMusicControlPreNextPage2() {
            return this.musicControlPreNextPage2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getMusicControlPreNextPage3() {
            return this.musicControlPreNextPage3_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getMusicControlVolumePage1() {
            return this.musicControlVolumePage1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getMusicControlVolumePage2() {
            return this.musicControlVolumePage2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getMusicControlVolumePage3() {
            return this.musicControlVolumePage3_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getMuteClosePage() {
            return this.muteClosePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getMuteOpenPage() {
            return this.muteOpenPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getShortcutPage() {
            return this.shortcutPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getTakePhotosPage() {
            return this.takePhotosPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public int getWeichatpayBindPage() {
            return this.weichatpayBindPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasAlarmClosePage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasAlarmCreateByAleaxPage() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasAlarmCreateByAppPage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasAlarmCreateByXiaoaiPage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasAlarmOpenPage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasAlipayBindPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasAutoCloseLcdPage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasBrightPage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasEventCreateByAleaxPage() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasEventCreateByAppPage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasEventCreateByXiaoaiPage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasLookScreenCloasePage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasLookScreenOpenPage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasMusicControlPausePage1() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasMusicControlPausePage2() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasMusicControlPausePage3() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasMusicControlPreNextPage1() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasMusicControlPreNextPage2() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasMusicControlPreNextPage3() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasMusicControlVolumePage1() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasMusicControlVolumePage2() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasMusicControlVolumePage3() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasMuteClosePage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasMuteOpenPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasShortcutPage() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasTakePhotosPage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.MoreEventMessageOrBuilder
        public boolean hasWeichatpayBindPage() {
            return (this.bitField0_ & 2097152) != 0;
        }

        public static Builder newBuilder(MoreEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static MoreEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MoreEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MoreEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MoreEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (MoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MoreEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MoreEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (MoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MoreEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MoreEventMessage parseFrom(InputStream input) throws IOException {
            return (MoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MoreEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MoreEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (MoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MoreEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface MoreEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlarmClosePage();

        int getAlarmCreateByAleaxPage();

        int getAlarmCreateByAppPage();

        int getAlarmCreateByXiaoaiPage();

        int getAlarmOpenPage();

        int getAlipayBindPage();

        int getAutoCloseLcdPage();

        int getBrightPage();

        int getEventCreateByAleaxPage();

        int getEventCreateByAppPage();

        int getEventCreateByXiaoaiPage();

        int getLookScreenCloasePage();

        int getLookScreenOpenPage();

        int getMusicControlPausePage1();

        int getMusicControlPausePage2();

        int getMusicControlPausePage3();

        int getMusicControlPreNextPage1();

        int getMusicControlPreNextPage2();

        int getMusicControlPreNextPage3();

        int getMusicControlVolumePage1();

        int getMusicControlVolumePage2();

        int getMusicControlVolumePage3();

        int getMuteClosePage();

        int getMuteOpenPage();

        int getShortcutPage();

        int getTakePhotosPage();

        int getWeichatpayBindPage();

        boolean hasAlarmClosePage();

        boolean hasAlarmCreateByAleaxPage();

        boolean hasAlarmCreateByAppPage();

        boolean hasAlarmCreateByXiaoaiPage();

        boolean hasAlarmOpenPage();

        boolean hasAlipayBindPage();

        boolean hasAutoCloseLcdPage();

        boolean hasBrightPage();

        boolean hasEventCreateByAleaxPage();

        boolean hasEventCreateByAppPage();

        boolean hasEventCreateByXiaoaiPage();

        boolean hasLookScreenCloasePage();

        boolean hasLookScreenOpenPage();

        boolean hasMusicControlPausePage1();

        boolean hasMusicControlPausePage2();

        boolean hasMusicControlPausePage3();

        boolean hasMusicControlPreNextPage1();

        boolean hasMusicControlPreNextPage2();

        boolean hasMusicControlPreNextPage3();

        boolean hasMusicControlVolumePage1();

        boolean hasMusicControlVolumePage2();

        boolean hasMusicControlVolumePage3();

        boolean hasMuteClosePage();

        boolean hasMuteOpenPage();

        boolean hasShortcutPage();

        boolean hasTakePhotosPage();

        boolean hasWeichatpayBindPage();
    }

    public static final class NotifyEventMessage extends GeneratedMessageLite<NotifyEventMessage, Builder> implements NotifyEventMessageOrBuilder {
        public static final int ALARMONCLOSEPAGE_FIELD_NUMBER = 8;
        public static final int ALARMONLATERONPAGE_FIELD_NUMBER = 7;
        public static final int APPNOTIFYDISPALYPAGE_FIELD_NUMBER = 2;
        public static final int CALLINGPAGE_FIELD_NUMBER = 3;
        private static final NotifyEventMessage DEFAULT_INSTANCE;
        public static final int EVENTREMINDPAGE_FIELD_NUMBER = 6;
        public static final int LINKDISCONPAGE_FIELD_NUMBER = 5;
        public static final int LONGSITEPAGE_FIELD_NUMBER = 4;
        public static final int NOTIFYDISPLAYPAGE_FIELD_NUMBER = 1;
        private static volatile Parser<NotifyEventMessage> PARSER = null;
        public static final int REMINDCYCLEIGNOREPAGE_FIELD_NUMBER = 10;
        public static final int REMINDCYCLESTARTPAGE_FIELD_NUMBER = 9;
        public static final int REMINDOVULATIONIGNORE_FIELD_NUMBER = 12;
        public static final int REMINDOVULATIONOPENCYCLE_FIELD_NUMBER = 11;
        private int alarmOnClosePage_;
        private int alarmOnLaterOnPage_;
        private int appNotifyDispalyPage_;
        private int bitField0_;
        private int callingPage_;
        private int eventRemindPage_;
        private int linkDisconpage_;
        private int longSitePage_;
        private byte memoizedIsInitialized = 2;
        private int notifyDisplayPage_;
        private int remindCycleIgnorePage_;
        private int remindCycleStartPage_;
        private int remindOvulationIgnore_;
        private int remindOvulationOpenCycle_;

        public static final class Builder extends GeneratedMessageLite.Builder<NotifyEventMessage, Builder> implements NotifyEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmOnClosePage() {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).clearAlarmOnClosePage();
                return this;
            }

            public Builder clearAlarmOnLaterOnPage() {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).clearAlarmOnLaterOnPage();
                return this;
            }

            public Builder clearAppNotifyDispalyPage() {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).clearAppNotifyDispalyPage();
                return this;
            }

            public Builder clearCallingPage() {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).clearCallingPage();
                return this;
            }

            public Builder clearEventRemindPage() {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).clearEventRemindPage();
                return this;
            }

            public Builder clearLinkDisconpage() {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).clearLinkDisconpage();
                return this;
            }

            public Builder clearLongSitePage() {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).clearLongSitePage();
                return this;
            }

            public Builder clearNotifyDisplayPage() {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).clearNotifyDisplayPage();
                return this;
            }

            public Builder clearRemindCycleIgnorePage() {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).clearRemindCycleIgnorePage();
                return this;
            }

            public Builder clearRemindCycleStartPage() {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).clearRemindCycleStartPage();
                return this;
            }

            public Builder clearRemindOvulationIgnore() {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).clearRemindOvulationIgnore();
                return this;
            }

            public Builder clearRemindOvulationOpenCycle() {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).clearRemindOvulationOpenCycle();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public int getAlarmOnClosePage() {
                return ((NotifyEventMessage) this.instance).getAlarmOnClosePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public int getAlarmOnLaterOnPage() {
                return ((NotifyEventMessage) this.instance).getAlarmOnLaterOnPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public int getAppNotifyDispalyPage() {
                return ((NotifyEventMessage) this.instance).getAppNotifyDispalyPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public int getCallingPage() {
                return ((NotifyEventMessage) this.instance).getCallingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public int getEventRemindPage() {
                return ((NotifyEventMessage) this.instance).getEventRemindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public int getLinkDisconpage() {
                return ((NotifyEventMessage) this.instance).getLinkDisconpage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public int getLongSitePage() {
                return ((NotifyEventMessage) this.instance).getLongSitePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public int getNotifyDisplayPage() {
                return ((NotifyEventMessage) this.instance).getNotifyDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public int getRemindCycleIgnorePage() {
                return ((NotifyEventMessage) this.instance).getRemindCycleIgnorePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public int getRemindCycleStartPage() {
                return ((NotifyEventMessage) this.instance).getRemindCycleStartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public int getRemindOvulationIgnore() {
                return ((NotifyEventMessage) this.instance).getRemindOvulationIgnore();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public int getRemindOvulationOpenCycle() {
                return ((NotifyEventMessage) this.instance).getRemindOvulationOpenCycle();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public boolean hasAlarmOnClosePage() {
                return ((NotifyEventMessage) this.instance).hasAlarmOnClosePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public boolean hasAlarmOnLaterOnPage() {
                return ((NotifyEventMessage) this.instance).hasAlarmOnLaterOnPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public boolean hasAppNotifyDispalyPage() {
                return ((NotifyEventMessage) this.instance).hasAppNotifyDispalyPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public boolean hasCallingPage() {
                return ((NotifyEventMessage) this.instance).hasCallingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public boolean hasEventRemindPage() {
                return ((NotifyEventMessage) this.instance).hasEventRemindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public boolean hasLinkDisconpage() {
                return ((NotifyEventMessage) this.instance).hasLinkDisconpage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public boolean hasLongSitePage() {
                return ((NotifyEventMessage) this.instance).hasLongSitePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public boolean hasNotifyDisplayPage() {
                return ((NotifyEventMessage) this.instance).hasNotifyDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public boolean hasRemindCycleIgnorePage() {
                return ((NotifyEventMessage) this.instance).hasRemindCycleIgnorePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public boolean hasRemindCycleStartPage() {
                return ((NotifyEventMessage) this.instance).hasRemindCycleStartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public boolean hasRemindOvulationIgnore() {
                return ((NotifyEventMessage) this.instance).hasRemindOvulationIgnore();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
            public boolean hasRemindOvulationOpenCycle() {
                return ((NotifyEventMessage) this.instance).hasRemindOvulationOpenCycle();
            }

            public Builder setAlarmOnClosePage(int value) {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).setAlarmOnClosePage(value);
                return this;
            }

            public Builder setAlarmOnLaterOnPage(int value) {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).setAlarmOnLaterOnPage(value);
                return this;
            }

            public Builder setAppNotifyDispalyPage(int value) {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).setAppNotifyDispalyPage(value);
                return this;
            }

            public Builder setCallingPage(int value) {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).setCallingPage(value);
                return this;
            }

            public Builder setEventRemindPage(int value) {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).setEventRemindPage(value);
                return this;
            }

            public Builder setLinkDisconpage(int value) {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).setLinkDisconpage(value);
                return this;
            }

            public Builder setLongSitePage(int value) {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).setLongSitePage(value);
                return this;
            }

            public Builder setNotifyDisplayPage(int value) {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).setNotifyDisplayPage(value);
                return this;
            }

            public Builder setRemindCycleIgnorePage(int value) {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).setRemindCycleIgnorePage(value);
                return this;
            }

            public Builder setRemindCycleStartPage(int value) {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).setRemindCycleStartPage(value);
                return this;
            }

            public Builder setRemindOvulationIgnore(int value) {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).setRemindOvulationIgnore(value);
                return this;
            }

            public Builder setRemindOvulationOpenCycle(int value) {
                copyOnWrite();
                ((NotifyEventMessage) this.instance).setRemindOvulationOpenCycle(value);
                return this;
            }

            private Builder() {
                super(NotifyEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            NotifyEventMessage notifyEventMessage = new NotifyEventMessage();
            DEFAULT_INSTANCE = notifyEventMessage;
            GeneratedMessageLite.registerDefaultInstance(NotifyEventMessage.class, notifyEventMessage);
        }

        private NotifyEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmOnClosePage() {
            this.bitField0_ &= -129;
            this.alarmOnClosePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmOnLaterOnPage() {
            this.bitField0_ &= -65;
            this.alarmOnLaterOnPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppNotifyDispalyPage() {
            this.bitField0_ &= -3;
            this.appNotifyDispalyPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallingPage() {
            this.bitField0_ &= -5;
            this.callingPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventRemindPage() {
            this.bitField0_ &= -33;
            this.eventRemindPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLinkDisconpage() {
            this.bitField0_ &= -17;
            this.linkDisconpage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLongSitePage() {
            this.bitField0_ &= -9;
            this.longSitePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotifyDisplayPage() {
            this.bitField0_ &= -2;
            this.notifyDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemindCycleIgnorePage() {
            this.bitField0_ &= -513;
            this.remindCycleIgnorePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemindCycleStartPage() {
            this.bitField0_ &= -257;
            this.remindCycleStartPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemindOvulationIgnore() {
            this.bitField0_ &= -2049;
            this.remindOvulationIgnore_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemindOvulationOpenCycle() {
            this.bitField0_ &= -1025;
            this.remindOvulationOpenCycle_ = 0;
        }

        public static NotifyEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (NotifyEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static NotifyEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (NotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<NotifyEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmOnClosePage(int value) {
            this.bitField0_ |= 128;
            this.alarmOnClosePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmOnLaterOnPage(int value) {
            this.bitField0_ |= 64;
            this.alarmOnLaterOnPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppNotifyDispalyPage(int value) {
            this.bitField0_ |= 2;
            this.appNotifyDispalyPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallingPage(int value) {
            this.bitField0_ |= 4;
            this.callingPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventRemindPage(int value) {
            this.bitField0_ |= 32;
            this.eventRemindPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkDisconpage(int value) {
            this.bitField0_ |= 16;
            this.linkDisconpage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongSitePage(int value) {
            this.bitField0_ |= 8;
            this.longSitePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyDisplayPage(int value) {
            this.bitField0_ |= 1;
            this.notifyDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemindCycleIgnorePage(int value) {
            this.bitField0_ |= 512;
            this.remindCycleIgnorePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemindCycleStartPage(int value) {
            this.bitField0_ |= 256;
            this.remindCycleStartPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemindOvulationIgnore(int value) {
            this.bitField0_ |= 2048;
            this.remindOvulationIgnore_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemindOvulationOpenCycle(int value) {
            this.bitField0_ |= 1024;
            this.remindOvulationOpenCycle_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new NotifyEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\f\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b", new Object[]{"bitField0_", "notifyDisplayPage_", "appNotifyDispalyPage_", "callingPage_", "longSitePage_", "linkDisconpage_", "eventRemindPage_", "alarmOnLaterOnPage_", "alarmOnClosePage_", "remindCycleStartPage_", "remindCycleIgnorePage_", "remindOvulationOpenCycle_", "remindOvulationIgnore_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NotifyEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (NotifyEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public int getAlarmOnClosePage() {
            return this.alarmOnClosePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public int getAlarmOnLaterOnPage() {
            return this.alarmOnLaterOnPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public int getAppNotifyDispalyPage() {
            return this.appNotifyDispalyPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public int getCallingPage() {
            return this.callingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public int getEventRemindPage() {
            return this.eventRemindPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public int getLinkDisconpage() {
            return this.linkDisconpage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public int getLongSitePage() {
            return this.longSitePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public int getNotifyDisplayPage() {
            return this.notifyDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public int getRemindCycleIgnorePage() {
            return this.remindCycleIgnorePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public int getRemindCycleStartPage() {
            return this.remindCycleStartPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public int getRemindOvulationIgnore() {
            return this.remindOvulationIgnore_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public int getRemindOvulationOpenCycle() {
            return this.remindOvulationOpenCycle_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public boolean hasAlarmOnClosePage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public boolean hasAlarmOnLaterOnPage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public boolean hasAppNotifyDispalyPage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public boolean hasCallingPage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public boolean hasEventRemindPage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public boolean hasLinkDisconpage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public boolean hasLongSitePage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public boolean hasNotifyDisplayPage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public boolean hasRemindCycleIgnorePage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public boolean hasRemindCycleStartPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public boolean hasRemindOvulationIgnore() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.NotifyEventMessageOrBuilder
        public boolean hasRemindOvulationOpenCycle() {
            return (this.bitField0_ & 1024) != 0;
        }

        public static Builder newBuilder(NotifyEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static NotifyEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NotifyEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NotifyEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NotifyEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (NotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NotifyEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NotifyEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (NotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NotifyEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NotifyEventMessage parseFrom(InputStream input) throws IOException {
            return (NotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NotifyEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NotifyEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (NotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NotifyEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface NotifyEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlarmOnClosePage();

        int getAlarmOnLaterOnPage();

        int getAppNotifyDispalyPage();

        int getCallingPage();

        int getEventRemindPage();

        int getLinkDisconpage();

        int getLongSitePage();

        int getNotifyDisplayPage();

        int getRemindCycleIgnorePage();

        int getRemindCycleStartPage();

        int getRemindOvulationIgnore();

        int getRemindOvulationOpenCycle();

        boolean hasAlarmOnClosePage();

        boolean hasAlarmOnLaterOnPage();

        boolean hasAppNotifyDispalyPage();

        boolean hasCallingPage();

        boolean hasEventRemindPage();

        boolean hasLinkDisconpage();

        boolean hasLongSitePage();

        boolean hasNotifyDisplayPage();

        boolean hasRemindCycleIgnorePage();

        boolean hasRemindCycleStartPage();

        boolean hasRemindOvulationIgnore();

        boolean hasRemindOvulationOpenCycle();
    }

    public static final class ShortcutEventMessage extends GeneratedMessageLite<ShortcutEventMessage, Builder> implements ShortcutEventMessageOrBuilder {
        public static final int ALARMDISPLAYPAGE_FIELD_NUMBER = 15;
        public static final int ALIPAYBRDISPLAYPAGE_FIELD_NUMBER = 21;
        public static final int ALIPAYQRDISPLAYPAGE_FIELD_NUMBER = 22;
        public static final int BREATHEDISPLAYPAGE_FIELD_NUMBER = 9;
        public static final int CALENDARDISPLAYPAGE_FIELD_NUMBER = 24;
        public static final int CAMERADISPLAYPAGE_FIELD_NUMBER = 16;
        public static final int COUNTDOWNDISPLAYPAGE_FIELD_NUMBER = 18;
        private static final ShortcutEventMessage DEFAULT_INSTANCE;
        public static final int EVENTREMINDDISPLAYPAGE_FIELD_NUMBER = 11;
        public static final int FINDPHONEDISPLAYPAGE_FIELD_NUMBER = 19;
        public static final int FLASHLIGHTDISPLAYPAGE_FIELD_NUMBER = 27;
        public static final int HEARTDISPLAYPAGE_FIELD_NUMBER = 7;
        public static final int MUSICDISPLAYPAGE_FIELD_NUMBER = 4;
        public static final int NFCDISPLAYPAGE_FIELD_NUMBER = 13;
        public static final int NOTIFYDISPLAYPAGE_FIELD_NUMBER = 1;
        public static final int PAIDISPLAYPAGE_FIELD_NUMBER = 6;
        private static volatile Parser<ShortcutEventMessage> PARSER = null;
        public static final int PHONEMUTEDISPLAYPAGE_FIELD_NUMBER = 20;
        public static final int PRESSUREDISPLAYPAGE_FIELD_NUMBER = 8;
        public static final int PROMODORODISPLAYPAGE_FIELD_NUMBER = 28;
        public static final int SILENCEDISPLAYPAGE_FIELD_NUMBER = 14;
        public static final int SLEEPDISPLAYPAGE_FIELD_NUMBER = 29;
        public static final int SPORTDISPLAYPAGE_FIELD_NUMBER = 12;
        public static final int STATUSDISPLAYPAGE_FIELD_NUMBER = 5;
        public static final int STOPWATCHDISPLAYPAGE_FIELD_NUMBER = 17;
        public static final int WEATEHRDISPLAYPAGE_FIELD_NUMBER = 3;
        public static final int WEICHATPAYBRDISPLAYPAGE_FIELD_NUMBER = 25;
        public static final int WEICHATPAYQRDISPLAYPAGE_FIELD_NUMBER = 26;
        public static final int WOMENHEALTHDISPLAYPAGE_FIELD_NUMBER = 10;
        public static final int WORLDTIMEDISPLAYPAGE_FIELD_NUMBER = 23;
        public static final int XIAOAIDISPLAYPAGE_FIELD_NUMBER = 2;
        private int alarmDisplayPage_;
        private int alipayBrDisplayPage_;
        private int alipayQrDisplayPage_;
        private int bitField0_;
        private int breatheDisplayPage_;
        private int calendarDisplayPage_;
        private int cameraDisplayPage_;
        private int countDownDisplayPage_;
        private int eventRemindDisplayPage_;
        private int findPhoneDisplayPage_;
        private int flashlightDisplayPage_;
        private int heartDisplayPage_;
        private byte memoizedIsInitialized = 2;
        private int musicDisplayPage_;
        private int nfcDisplayPage_;
        private int notifyDisplayPage_;
        private int paiDisplayPage_;
        private int phoneMuteDisplayPage_;
        private int pressureDisplayPage_;
        private int promodoroDisplayPage_;
        private int silenceDisplayPage_;
        private int sleepDisplayPage_;
        private int sportDisplayPage_;
        private int statusDisplayPage_;
        private int stopWatchDisplayPage_;
        private int weatehrDisplayPage_;
        private int weichatpayBrDisplayPage_;
        private int weichatpayQrDisplayPage_;
        private int womenHealthDisplayPage_;
        private int worldTimeDisplayPage_;
        private int xiaoaiDisplayPage_;

        public static final class Builder extends GeneratedMessageLite.Builder<ShortcutEventMessage, Builder> implements ShortcutEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearAlarmDisplayPage();
                return this;
            }

            public Builder clearAlipayBrDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearAlipayBrDisplayPage();
                return this;
            }

            public Builder clearAlipayQrDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearAlipayQrDisplayPage();
                return this;
            }

            public Builder clearBreatheDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearBreatheDisplayPage();
                return this;
            }

            public Builder clearCalendarDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearCalendarDisplayPage();
                return this;
            }

            public Builder clearCameraDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearCameraDisplayPage();
                return this;
            }

            public Builder clearCountDownDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearCountDownDisplayPage();
                return this;
            }

            public Builder clearEventRemindDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearEventRemindDisplayPage();
                return this;
            }

            public Builder clearFindPhoneDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearFindPhoneDisplayPage();
                return this;
            }

            public Builder clearFlashlightDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearFlashlightDisplayPage();
                return this;
            }

            public Builder clearHeartDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearHeartDisplayPage();
                return this;
            }

            public Builder clearMusicDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearMusicDisplayPage();
                return this;
            }

            public Builder clearNfcDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearNfcDisplayPage();
                return this;
            }

            public Builder clearNotifyDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearNotifyDisplayPage();
                return this;
            }

            public Builder clearPaiDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearPaiDisplayPage();
                return this;
            }

            public Builder clearPhoneMuteDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearPhoneMuteDisplayPage();
                return this;
            }

            public Builder clearPressureDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearPressureDisplayPage();
                return this;
            }

            public Builder clearPromodoroDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearPromodoroDisplayPage();
                return this;
            }

            public Builder clearSilenceDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearSilenceDisplayPage();
                return this;
            }

            public Builder clearSleepDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearSleepDisplayPage();
                return this;
            }

            public Builder clearSportDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearSportDisplayPage();
                return this;
            }

            public Builder clearStatusDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearStatusDisplayPage();
                return this;
            }

            public Builder clearStopWatchDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearStopWatchDisplayPage();
                return this;
            }

            public Builder clearWeatehrDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearWeatehrDisplayPage();
                return this;
            }

            public Builder clearWeichatpayBrDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearWeichatpayBrDisplayPage();
                return this;
            }

            public Builder clearWeichatpayQrDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearWeichatpayQrDisplayPage();
                return this;
            }

            public Builder clearWomenHealthDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearWomenHealthDisplayPage();
                return this;
            }

            public Builder clearWorldTimeDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearWorldTimeDisplayPage();
                return this;
            }

            public Builder clearXiaoaiDisplayPage() {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).clearXiaoaiDisplayPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getAlarmDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getAlarmDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getAlipayBrDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getAlipayBrDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getAlipayQrDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getAlipayQrDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getBreatheDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getBreatheDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getCalendarDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getCalendarDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getCameraDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getCameraDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getCountDownDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getCountDownDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getEventRemindDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getEventRemindDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getFindPhoneDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getFindPhoneDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getFlashlightDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getFlashlightDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getHeartDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getHeartDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getMusicDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getMusicDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getNfcDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getNfcDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getNotifyDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getNotifyDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getPaiDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getPaiDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getPhoneMuteDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getPhoneMuteDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getPressureDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getPressureDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getPromodoroDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getPromodoroDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getSilenceDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getSilenceDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getSleepDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getSleepDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getSportDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getSportDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getStatusDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getStatusDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getStopWatchDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getStopWatchDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getWeatehrDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getWeatehrDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getWeichatpayBrDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getWeichatpayBrDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getWeichatpayQrDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getWeichatpayQrDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getWomenHealthDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getWomenHealthDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getWorldTimeDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getWorldTimeDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public int getXiaoaiDisplayPage() {
                return ((ShortcutEventMessage) this.instance).getXiaoaiDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasAlarmDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasAlarmDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasAlipayBrDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasAlipayBrDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasAlipayQrDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasAlipayQrDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasBreatheDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasBreatheDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasCalendarDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasCalendarDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasCameraDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasCameraDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasCountDownDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasCountDownDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasEventRemindDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasEventRemindDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasFindPhoneDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasFindPhoneDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasFlashlightDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasFlashlightDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasHeartDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasHeartDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasMusicDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasMusicDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasNfcDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasNfcDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasNotifyDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasNotifyDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasPaiDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasPaiDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasPhoneMuteDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasPhoneMuteDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasPressureDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasPressureDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasPromodoroDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasPromodoroDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasSilenceDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasSilenceDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasSleepDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasSleepDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasSportDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasSportDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasStatusDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasStatusDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasStopWatchDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasStopWatchDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasWeatehrDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasWeatehrDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasWeichatpayBrDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasWeichatpayBrDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasWeichatpayQrDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasWeichatpayQrDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasWomenHealthDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasWomenHealthDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasWorldTimeDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasWorldTimeDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
            public boolean hasXiaoaiDisplayPage() {
                return ((ShortcutEventMessage) this.instance).hasXiaoaiDisplayPage();
            }

            public Builder setAlarmDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setAlarmDisplayPage(value);
                return this;
            }

            public Builder setAlipayBrDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setAlipayBrDisplayPage(value);
                return this;
            }

            public Builder setAlipayQrDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setAlipayQrDisplayPage(value);
                return this;
            }

            public Builder setBreatheDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setBreatheDisplayPage(value);
                return this;
            }

            public Builder setCalendarDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setCalendarDisplayPage(value);
                return this;
            }

            public Builder setCameraDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setCameraDisplayPage(value);
                return this;
            }

            public Builder setCountDownDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setCountDownDisplayPage(value);
                return this;
            }

            public Builder setEventRemindDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setEventRemindDisplayPage(value);
                return this;
            }

            public Builder setFindPhoneDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setFindPhoneDisplayPage(value);
                return this;
            }

            public Builder setFlashlightDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setFlashlightDisplayPage(value);
                return this;
            }

            public Builder setHeartDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setHeartDisplayPage(value);
                return this;
            }

            public Builder setMusicDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setMusicDisplayPage(value);
                return this;
            }

            public Builder setNfcDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setNfcDisplayPage(value);
                return this;
            }

            public Builder setNotifyDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setNotifyDisplayPage(value);
                return this;
            }

            public Builder setPaiDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setPaiDisplayPage(value);
                return this;
            }

            public Builder setPhoneMuteDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setPhoneMuteDisplayPage(value);
                return this;
            }

            public Builder setPressureDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setPressureDisplayPage(value);
                return this;
            }

            public Builder setPromodoroDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setPromodoroDisplayPage(value);
                return this;
            }

            public Builder setSilenceDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setSilenceDisplayPage(value);
                return this;
            }

            public Builder setSleepDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setSleepDisplayPage(value);
                return this;
            }

            public Builder setSportDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setSportDisplayPage(value);
                return this;
            }

            public Builder setStatusDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setStatusDisplayPage(value);
                return this;
            }

            public Builder setStopWatchDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setStopWatchDisplayPage(value);
                return this;
            }

            public Builder setWeatehrDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setWeatehrDisplayPage(value);
                return this;
            }

            public Builder setWeichatpayBrDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setWeichatpayBrDisplayPage(value);
                return this;
            }

            public Builder setWeichatpayQrDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setWeichatpayQrDisplayPage(value);
                return this;
            }

            public Builder setWomenHealthDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setWomenHealthDisplayPage(value);
                return this;
            }

            public Builder setWorldTimeDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setWorldTimeDisplayPage(value);
                return this;
            }

            public Builder setXiaoaiDisplayPage(int value) {
                copyOnWrite();
                ((ShortcutEventMessage) this.instance).setXiaoaiDisplayPage(value);
                return this;
            }

            private Builder() {
                super(ShortcutEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            ShortcutEventMessage shortcutEventMessage = new ShortcutEventMessage();
            DEFAULT_INSTANCE = shortcutEventMessage;
            GeneratedMessageLite.registerDefaultInstance(ShortcutEventMessage.class, shortcutEventMessage);
        }

        private ShortcutEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmDisplayPage() {
            this.bitField0_ &= -16385;
            this.alarmDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayBrDisplayPage() {
            this.bitField0_ &= -1048577;
            this.alipayBrDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQrDisplayPage() {
            this.bitField0_ &= -2097153;
            this.alipayQrDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBreatheDisplayPage() {
            this.bitField0_ &= -257;
            this.breatheDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCalendarDisplayPage() {
            this.bitField0_ &= -8388609;
            this.calendarDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCameraDisplayPage() {
            this.bitField0_ &= -32769;
            this.cameraDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountDownDisplayPage() {
            this.bitField0_ &= -131073;
            this.countDownDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventRemindDisplayPage() {
            this.bitField0_ &= -1025;
            this.eventRemindDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindPhoneDisplayPage() {
            this.bitField0_ &= -262145;
            this.findPhoneDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlashlightDisplayPage() {
            this.bitField0_ &= -67108865;
            this.flashlightDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeartDisplayPage() {
            this.bitField0_ &= -65;
            this.heartDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicDisplayPage() {
            this.bitField0_ &= -9;
            this.musicDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNfcDisplayPage() {
            this.bitField0_ &= -4097;
            this.nfcDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotifyDisplayPage() {
            this.bitField0_ &= -2;
            this.notifyDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaiDisplayPage() {
            this.bitField0_ &= -33;
            this.paiDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhoneMuteDisplayPage() {
            this.bitField0_ &= -524289;
            this.phoneMuteDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPressureDisplayPage() {
            this.bitField0_ &= -129;
            this.pressureDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPromodoroDisplayPage() {
            this.bitField0_ &= -134217729;
            this.promodoroDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilenceDisplayPage() {
            this.bitField0_ &= -8193;
            this.silenceDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSleepDisplayPage() {
            this.bitField0_ &= -268435457;
            this.sleepDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportDisplayPage() {
            this.bitField0_ &= -2049;
            this.sportDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusDisplayPage() {
            this.bitField0_ &= -17;
            this.statusDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopWatchDisplayPage() {
            this.bitField0_ &= -65537;
            this.stopWatchDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeatehrDisplayPage() {
            this.bitField0_ &= -5;
            this.weatehrDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeichatpayBrDisplayPage() {
            this.bitField0_ &= -16777217;
            this.weichatpayBrDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeichatpayQrDisplayPage() {
            this.bitField0_ &= -33554433;
            this.weichatpayQrDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWomenHealthDisplayPage() {
            this.bitField0_ &= -513;
            this.womenHealthDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWorldTimeDisplayPage() {
            this.bitField0_ &= -4194305;
            this.worldTimeDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearXiaoaiDisplayPage() {
            this.bitField0_ &= -3;
            this.xiaoaiDisplayPage_ = 0;
        }

        public static ShortcutEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ShortcutEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (ShortcutEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ShortcutEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (ShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<ShortcutEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmDisplayPage(int value) {
            this.bitField0_ |= 16384;
            this.alarmDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayBrDisplayPage(int value) {
            this.bitField0_ |= 1048576;
            this.alipayBrDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQrDisplayPage(int value) {
            this.bitField0_ |= 2097152;
            this.alipayQrDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBreatheDisplayPage(int value) {
            this.bitField0_ |= 256;
            this.breatheDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalendarDisplayPage(int value) {
            this.bitField0_ |= 8388608;
            this.calendarDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCameraDisplayPage(int value) {
            this.bitField0_ |= 32768;
            this.cameraDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountDownDisplayPage(int value) {
            this.bitField0_ |= 131072;
            this.countDownDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventRemindDisplayPage(int value) {
            this.bitField0_ |= 1024;
            this.eventRemindDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhoneDisplayPage(int value) {
            this.bitField0_ |= 262144;
            this.findPhoneDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlashlightDisplayPage(int value) {
            this.bitField0_ |= 67108864;
            this.flashlightDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeartDisplayPage(int value) {
            this.bitField0_ |= 64;
            this.heartDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicDisplayPage(int value) {
            this.bitField0_ |= 8;
            this.musicDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNfcDisplayPage(int value) {
            this.bitField0_ |= 4096;
            this.nfcDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyDisplayPage(int value) {
            this.bitField0_ |= 1;
            this.notifyDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaiDisplayPage(int value) {
            this.bitField0_ |= 32;
            this.paiDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneMuteDisplayPage(int value) {
            this.bitField0_ |= 524288;
            this.phoneMuteDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPressureDisplayPage(int value) {
            this.bitField0_ |= 128;
            this.pressureDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPromodoroDisplayPage(int value) {
            this.bitField0_ |= AMapEngineUtils.HALF_MAX_P20_WIDTH;
            this.promodoroDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceDisplayPage(int value) {
            this.bitField0_ |= 8192;
            this.silenceDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepDisplayPage(int value) {
            this.bitField0_ |= 268435456;
            this.sleepDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportDisplayPage(int value) {
            this.bitField0_ |= 2048;
            this.sportDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusDisplayPage(int value) {
            this.bitField0_ |= 16;
            this.statusDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopWatchDisplayPage(int value) {
            this.bitField0_ |= 65536;
            this.stopWatchDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatehrDisplayPage(int value) {
            this.bitField0_ |= 4;
            this.weatehrDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeichatpayBrDisplayPage(int value) {
            this.bitField0_ |= 16777216;
            this.weichatpayBrDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeichatpayQrDisplayPage(int value) {
            this.bitField0_ |= 33554432;
            this.weichatpayQrDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWomenHealthDisplayPage(int value) {
            this.bitField0_ |= 512;
            this.womenHealthDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWorldTimeDisplayPage(int value) {
            this.bitField0_ |= 4194304;
            this.worldTimeDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setXiaoaiDisplayPage(int value) {
            this.bitField0_ |= 2;
            this.xiaoaiDisplayPage_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new ShortcutEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001d\u0000\u0001\u0001\u001d\u001d\u0000\u0000\u001d\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018\u001aᔋ\u0019\u001bᔋ\u001a\u001cᔋ\u001b\u001dᔋ\u001c", new Object[]{"bitField0_", "notifyDisplayPage_", "xiaoaiDisplayPage_", "weatehrDisplayPage_", "musicDisplayPage_", "statusDisplayPage_", "paiDisplayPage_", "heartDisplayPage_", "pressureDisplayPage_", "breatheDisplayPage_", "womenHealthDisplayPage_", "eventRemindDisplayPage_", "sportDisplayPage_", "nfcDisplayPage_", "silenceDisplayPage_", "alarmDisplayPage_", "cameraDisplayPage_", "stopWatchDisplayPage_", "countDownDisplayPage_", "findPhoneDisplayPage_", "phoneMuteDisplayPage_", "alipayBrDisplayPage_", "alipayQrDisplayPage_", "worldTimeDisplayPage_", "calendarDisplayPage_", "weichatpayBrDisplayPage_", "weichatpayQrDisplayPage_", "flashlightDisplayPage_", "promodoroDisplayPage_", "sleepDisplayPage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ShortcutEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ShortcutEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getAlarmDisplayPage() {
            return this.alarmDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getAlipayBrDisplayPage() {
            return this.alipayBrDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getAlipayQrDisplayPage() {
            return this.alipayQrDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getBreatheDisplayPage() {
            return this.breatheDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getCalendarDisplayPage() {
            return this.calendarDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getCameraDisplayPage() {
            return this.cameraDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getCountDownDisplayPage() {
            return this.countDownDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getEventRemindDisplayPage() {
            return this.eventRemindDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getFindPhoneDisplayPage() {
            return this.findPhoneDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getFlashlightDisplayPage() {
            return this.flashlightDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getHeartDisplayPage() {
            return this.heartDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getMusicDisplayPage() {
            return this.musicDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getNfcDisplayPage() {
            return this.nfcDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getNotifyDisplayPage() {
            return this.notifyDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getPaiDisplayPage() {
            return this.paiDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getPhoneMuteDisplayPage() {
            return this.phoneMuteDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getPressureDisplayPage() {
            return this.pressureDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getPromodoroDisplayPage() {
            return this.promodoroDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getSilenceDisplayPage() {
            return this.silenceDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getSleepDisplayPage() {
            return this.sleepDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getSportDisplayPage() {
            return this.sportDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getStatusDisplayPage() {
            return this.statusDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getStopWatchDisplayPage() {
            return this.stopWatchDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getWeatehrDisplayPage() {
            return this.weatehrDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getWeichatpayBrDisplayPage() {
            return this.weichatpayBrDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getWeichatpayQrDisplayPage() {
            return this.weichatpayQrDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getWomenHealthDisplayPage() {
            return this.womenHealthDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getWorldTimeDisplayPage() {
            return this.worldTimeDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public int getXiaoaiDisplayPage() {
            return this.xiaoaiDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasAlarmDisplayPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasAlipayBrDisplayPage() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasAlipayQrDisplayPage() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasBreatheDisplayPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasCalendarDisplayPage() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasCameraDisplayPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasCountDownDisplayPage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasEventRemindDisplayPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasFindPhoneDisplayPage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasFlashlightDisplayPage() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasHeartDisplayPage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasMusicDisplayPage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasNfcDisplayPage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasNotifyDisplayPage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasPaiDisplayPage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasPhoneMuteDisplayPage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasPressureDisplayPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasPromodoroDisplayPage() {
            return (this.bitField0_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasSilenceDisplayPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasSleepDisplayPage() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasSportDisplayPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasStatusDisplayPage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasStopWatchDisplayPage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasWeatehrDisplayPage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasWeichatpayBrDisplayPage() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasWeichatpayQrDisplayPage() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasWomenHealthDisplayPage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasWorldTimeDisplayPage() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.ShortcutEventMessageOrBuilder
        public boolean hasXiaoaiDisplayPage() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(ShortcutEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static ShortcutEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ShortcutEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ShortcutEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ShortcutEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ShortcutEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ShortcutEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ShortcutEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ShortcutEventMessage parseFrom(InputStream input) throws IOException {
            return (ShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ShortcutEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ShortcutEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (ShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ShortcutEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface ShortcutEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlarmDisplayPage();

        int getAlipayBrDisplayPage();

        int getAlipayQrDisplayPage();

        int getBreatheDisplayPage();

        int getCalendarDisplayPage();

        int getCameraDisplayPage();

        int getCountDownDisplayPage();

        int getEventRemindDisplayPage();

        int getFindPhoneDisplayPage();

        int getFlashlightDisplayPage();

        int getHeartDisplayPage();

        int getMusicDisplayPage();

        int getNfcDisplayPage();

        int getNotifyDisplayPage();

        int getPaiDisplayPage();

        int getPhoneMuteDisplayPage();

        int getPressureDisplayPage();

        int getPromodoroDisplayPage();

        int getSilenceDisplayPage();

        int getSleepDisplayPage();

        int getSportDisplayPage();

        int getStatusDisplayPage();

        int getStopWatchDisplayPage();

        int getWeatehrDisplayPage();

        int getWeichatpayBrDisplayPage();

        int getWeichatpayQrDisplayPage();

        int getWomenHealthDisplayPage();

        int getWorldTimeDisplayPage();

        int getXiaoaiDisplayPage();

        boolean hasAlarmDisplayPage();

        boolean hasAlipayBrDisplayPage();

        boolean hasAlipayQrDisplayPage();

        boolean hasBreatheDisplayPage();

        boolean hasCalendarDisplayPage();

        boolean hasCameraDisplayPage();

        boolean hasCountDownDisplayPage();

        boolean hasEventRemindDisplayPage();

        boolean hasFindPhoneDisplayPage();

        boolean hasFlashlightDisplayPage();

        boolean hasHeartDisplayPage();

        boolean hasMusicDisplayPage();

        boolean hasNfcDisplayPage();

        boolean hasNotifyDisplayPage();

        boolean hasPaiDisplayPage();

        boolean hasPhoneMuteDisplayPage();

        boolean hasPressureDisplayPage();

        boolean hasPromodoroDisplayPage();

        boolean hasSilenceDisplayPage();

        boolean hasSleepDisplayPage();

        boolean hasSportDisplayPage();

        boolean hasStatusDisplayPage();

        boolean hasStopWatchDisplayPage();

        boolean hasWeatehrDisplayPage();

        boolean hasWeichatpayBrDisplayPage();

        boolean hasWeichatpayQrDisplayPage();

        boolean hasWomenHealthDisplayPage();

        boolean hasWorldTimeDisplayPage();

        boolean hasXiaoaiDisplayPage();
    }

    public static final class SportEventMessage extends GeneratedMessageLite<SportEventMessage, Builder> implements SportEventMessageOrBuilder {
        public static final int AUTODETECTOTHER_FIELD_NUMBER = 14;
        public static final int AUTODETECTRECODE_FIELD_NUMBER = 15;
        public static final int AUTODETECTRUN_FIELD_NUMBER = 13;
        public static final int AUTODETECTTRIGER_FIELD_NUMBER = 11;
        public static final int AUTODETECTWALK_FIELD_NUMBER = 12;
        public static final int BEFORESPORTSKIPGPSLOC_FIELD_NUMBER = 1;
        public static final int BEFORESPORTSUCCGPSLOC_FIELD_NUMBER = 2;
        private static final SportEventMessage DEFAULT_INSTANCE;
        public static final int MANUALSTARTRECODE_FIELD_NUMBER = 16;
        private static volatile Parser<SportEventMessage> PARSER = null;
        public static final int SPORTINGDISCONPAGE_FIELD_NUMBER = 9;
        public static final int SPORTINGRECONNECTPAGE_FIELD_NUMBER = 10;
        public static final int SPORTINGSUCCGPSLOCPAGE_FIELD_NUMBER = 8;
        public static final int SPORTINGSUCCGPSLOCTIMELESS10S_FIELD_NUMBER = 6;
        public static final int SPORTINGSUCCGPSLOCTIMELESS1S_FIELD_NUMBER = 3;
        public static final int SPORTINGSUCCGPSLOCTIMELESS3S_FIELD_NUMBER = 4;
        public static final int SPORTINGSUCCGPSLOCTIMELESS5S_FIELD_NUMBER = 5;
        public static final int SPORTINGSUCCGPSLOCTIMELESSOTHER_FIELD_NUMBER = 7;
        private int autoDetectOther_;
        private int autoDetectRecode_;
        private int autoDetectRun_;
        private int autoDetectTriger_;
        private int autoDetectWalk_;
        private int beforeSportSkipGpsLoc_;
        private int beforeSportSuccGpsLoc_;
        private int bitField0_;
        private int manualStartRecode_;
        private byte memoizedIsInitialized = 2;
        private int sportingDisconPage_;
        private int sportingReconnectPage_;
        private int sportingSuccGpsLocPage_;
        private int sportingSuccGpsLocTimeLess10S_;
        private int sportingSuccGpsLocTimeLess1S_;
        private int sportingSuccGpsLocTimeLess3S_;
        private int sportingSuccGpsLocTimeLess5S_;
        private int sportingSuccGpsLocTimeLessOther_;

        public static final class Builder extends GeneratedMessageLite.Builder<SportEventMessage, Builder> implements SportEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAutoDetectOther() {
                copyOnWrite();
                ((SportEventMessage) this.instance).clearAutoDetectOther();
                return this;
            }

            public Builder clearAutoDetectRecode() {
                copyOnWrite();
                ((SportEventMessage) this.instance).clearAutoDetectRecode();
                return this;
            }

            public Builder clearAutoDetectRun() {
                copyOnWrite();
                ((SportEventMessage) this.instance).clearAutoDetectRun();
                return this;
            }

            public Builder clearAutoDetectTriger() {
                copyOnWrite();
                ((SportEventMessage) this.instance).clearAutoDetectTriger();
                return this;
            }

            public Builder clearAutoDetectWalk() {
                copyOnWrite();
                ((SportEventMessage) this.instance).clearAutoDetectWalk();
                return this;
            }

            public Builder clearBeforeSportSkipGpsLoc() {
                copyOnWrite();
                ((SportEventMessage) this.instance).clearBeforeSportSkipGpsLoc();
                return this;
            }

            public Builder clearBeforeSportSuccGpsLoc() {
                copyOnWrite();
                ((SportEventMessage) this.instance).clearBeforeSportSuccGpsLoc();
                return this;
            }

            public Builder clearManualStartRecode() {
                copyOnWrite();
                ((SportEventMessage) this.instance).clearManualStartRecode();
                return this;
            }

            public Builder clearSportingDisconPage() {
                copyOnWrite();
                ((SportEventMessage) this.instance).clearSportingDisconPage();
                return this;
            }

            public Builder clearSportingReconnectPage() {
                copyOnWrite();
                ((SportEventMessage) this.instance).clearSportingReconnectPage();
                return this;
            }

            public Builder clearSportingSuccGpsLocPage() {
                copyOnWrite();
                ((SportEventMessage) this.instance).clearSportingSuccGpsLocPage();
                return this;
            }

            public Builder clearSportingSuccGpsLocTimeLess10S() {
                copyOnWrite();
                ((SportEventMessage) this.instance).clearSportingSuccGpsLocTimeLess10S();
                return this;
            }

            public Builder clearSportingSuccGpsLocTimeLess1S() {
                copyOnWrite();
                ((SportEventMessage) this.instance).clearSportingSuccGpsLocTimeLess1S();
                return this;
            }

            public Builder clearSportingSuccGpsLocTimeLess3S() {
                copyOnWrite();
                ((SportEventMessage) this.instance).clearSportingSuccGpsLocTimeLess3S();
                return this;
            }

            public Builder clearSportingSuccGpsLocTimeLess5S() {
                copyOnWrite();
                ((SportEventMessage) this.instance).clearSportingSuccGpsLocTimeLess5S();
                return this;
            }

            public Builder clearSportingSuccGpsLocTimeLessOther() {
                copyOnWrite();
                ((SportEventMessage) this.instance).clearSportingSuccGpsLocTimeLessOther();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public int getAutoDetectOther() {
                return ((SportEventMessage) this.instance).getAutoDetectOther();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public int getAutoDetectRecode() {
                return ((SportEventMessage) this.instance).getAutoDetectRecode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public int getAutoDetectRun() {
                return ((SportEventMessage) this.instance).getAutoDetectRun();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public int getAutoDetectTriger() {
                return ((SportEventMessage) this.instance).getAutoDetectTriger();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public int getAutoDetectWalk() {
                return ((SportEventMessage) this.instance).getAutoDetectWalk();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public int getBeforeSportSkipGpsLoc() {
                return ((SportEventMessage) this.instance).getBeforeSportSkipGpsLoc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public int getBeforeSportSuccGpsLoc() {
                return ((SportEventMessage) this.instance).getBeforeSportSuccGpsLoc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public int getManualStartRecode() {
                return ((SportEventMessage) this.instance).getManualStartRecode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public int getSportingDisconPage() {
                return ((SportEventMessage) this.instance).getSportingDisconPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public int getSportingReconnectPage() {
                return ((SportEventMessage) this.instance).getSportingReconnectPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public int getSportingSuccGpsLocPage() {
                return ((SportEventMessage) this.instance).getSportingSuccGpsLocPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public int getSportingSuccGpsLocTimeLess10S() {
                return ((SportEventMessage) this.instance).getSportingSuccGpsLocTimeLess10S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public int getSportingSuccGpsLocTimeLess1S() {
                return ((SportEventMessage) this.instance).getSportingSuccGpsLocTimeLess1S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public int getSportingSuccGpsLocTimeLess3S() {
                return ((SportEventMessage) this.instance).getSportingSuccGpsLocTimeLess3S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public int getSportingSuccGpsLocTimeLess5S() {
                return ((SportEventMessage) this.instance).getSportingSuccGpsLocTimeLess5S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public int getSportingSuccGpsLocTimeLessOther() {
                return ((SportEventMessage) this.instance).getSportingSuccGpsLocTimeLessOther();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public boolean hasAutoDetectOther() {
                return ((SportEventMessage) this.instance).hasAutoDetectOther();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public boolean hasAutoDetectRecode() {
                return ((SportEventMessage) this.instance).hasAutoDetectRecode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public boolean hasAutoDetectRun() {
                return ((SportEventMessage) this.instance).hasAutoDetectRun();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public boolean hasAutoDetectTriger() {
                return ((SportEventMessage) this.instance).hasAutoDetectTriger();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public boolean hasAutoDetectWalk() {
                return ((SportEventMessage) this.instance).hasAutoDetectWalk();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public boolean hasBeforeSportSkipGpsLoc() {
                return ((SportEventMessage) this.instance).hasBeforeSportSkipGpsLoc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public boolean hasBeforeSportSuccGpsLoc() {
                return ((SportEventMessage) this.instance).hasBeforeSportSuccGpsLoc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public boolean hasManualStartRecode() {
                return ((SportEventMessage) this.instance).hasManualStartRecode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public boolean hasSportingDisconPage() {
                return ((SportEventMessage) this.instance).hasSportingDisconPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public boolean hasSportingReconnectPage() {
                return ((SportEventMessage) this.instance).hasSportingReconnectPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public boolean hasSportingSuccGpsLocPage() {
                return ((SportEventMessage) this.instance).hasSportingSuccGpsLocPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public boolean hasSportingSuccGpsLocTimeLess10S() {
                return ((SportEventMessage) this.instance).hasSportingSuccGpsLocTimeLess10S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public boolean hasSportingSuccGpsLocTimeLess1S() {
                return ((SportEventMessage) this.instance).hasSportingSuccGpsLocTimeLess1S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public boolean hasSportingSuccGpsLocTimeLess3S() {
                return ((SportEventMessage) this.instance).hasSportingSuccGpsLocTimeLess3S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public boolean hasSportingSuccGpsLocTimeLess5S() {
                return ((SportEventMessage) this.instance).hasSportingSuccGpsLocTimeLess5S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
            public boolean hasSportingSuccGpsLocTimeLessOther() {
                return ((SportEventMessage) this.instance).hasSportingSuccGpsLocTimeLessOther();
            }

            public Builder setAutoDetectOther(int value) {
                copyOnWrite();
                ((SportEventMessage) this.instance).setAutoDetectOther(value);
                return this;
            }

            public Builder setAutoDetectRecode(int value) {
                copyOnWrite();
                ((SportEventMessage) this.instance).setAutoDetectRecode(value);
                return this;
            }

            public Builder setAutoDetectRun(int value) {
                copyOnWrite();
                ((SportEventMessage) this.instance).setAutoDetectRun(value);
                return this;
            }

            public Builder setAutoDetectTriger(int value) {
                copyOnWrite();
                ((SportEventMessage) this.instance).setAutoDetectTriger(value);
                return this;
            }

            public Builder setAutoDetectWalk(int value) {
                copyOnWrite();
                ((SportEventMessage) this.instance).setAutoDetectWalk(value);
                return this;
            }

            public Builder setBeforeSportSkipGpsLoc(int value) {
                copyOnWrite();
                ((SportEventMessage) this.instance).setBeforeSportSkipGpsLoc(value);
                return this;
            }

            public Builder setBeforeSportSuccGpsLoc(int value) {
                copyOnWrite();
                ((SportEventMessage) this.instance).setBeforeSportSuccGpsLoc(value);
                return this;
            }

            public Builder setManualStartRecode(int value) {
                copyOnWrite();
                ((SportEventMessage) this.instance).setManualStartRecode(value);
                return this;
            }

            public Builder setSportingDisconPage(int value) {
                copyOnWrite();
                ((SportEventMessage) this.instance).setSportingDisconPage(value);
                return this;
            }

            public Builder setSportingReconnectPage(int value) {
                copyOnWrite();
                ((SportEventMessage) this.instance).setSportingReconnectPage(value);
                return this;
            }

            public Builder setSportingSuccGpsLocPage(int value) {
                copyOnWrite();
                ((SportEventMessage) this.instance).setSportingSuccGpsLocPage(value);
                return this;
            }

            public Builder setSportingSuccGpsLocTimeLess10S(int value) {
                copyOnWrite();
                ((SportEventMessage) this.instance).setSportingSuccGpsLocTimeLess10S(value);
                return this;
            }

            public Builder setSportingSuccGpsLocTimeLess1S(int value) {
                copyOnWrite();
                ((SportEventMessage) this.instance).setSportingSuccGpsLocTimeLess1S(value);
                return this;
            }

            public Builder setSportingSuccGpsLocTimeLess3S(int value) {
                copyOnWrite();
                ((SportEventMessage) this.instance).setSportingSuccGpsLocTimeLess3S(value);
                return this;
            }

            public Builder setSportingSuccGpsLocTimeLess5S(int value) {
                copyOnWrite();
                ((SportEventMessage) this.instance).setSportingSuccGpsLocTimeLess5S(value);
                return this;
            }

            public Builder setSportingSuccGpsLocTimeLessOther(int value) {
                copyOnWrite();
                ((SportEventMessage) this.instance).setSportingSuccGpsLocTimeLessOther(value);
                return this;
            }

            private Builder() {
                super(SportEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            SportEventMessage sportEventMessage = new SportEventMessage();
            DEFAULT_INSTANCE = sportEventMessage;
            GeneratedMessageLite.registerDefaultInstance(SportEventMessage.class, sportEventMessage);
        }

        private SportEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoDetectOther() {
            this.bitField0_ &= -8193;
            this.autoDetectOther_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoDetectRecode() {
            this.bitField0_ &= -16385;
            this.autoDetectRecode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoDetectRun() {
            this.bitField0_ &= -4097;
            this.autoDetectRun_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoDetectTriger() {
            this.bitField0_ &= -1025;
            this.autoDetectTriger_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoDetectWalk() {
            this.bitField0_ &= -2049;
            this.autoDetectWalk_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBeforeSportSkipGpsLoc() {
            this.bitField0_ &= -2;
            this.beforeSportSkipGpsLoc_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBeforeSportSuccGpsLoc() {
            this.bitField0_ &= -3;
            this.beforeSportSuccGpsLoc_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearManualStartRecode() {
            this.bitField0_ &= -32769;
            this.manualStartRecode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportingDisconPage() {
            this.bitField0_ &= -257;
            this.sportingDisconPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportingReconnectPage() {
            this.bitField0_ &= -513;
            this.sportingReconnectPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportingSuccGpsLocPage() {
            this.bitField0_ &= -129;
            this.sportingSuccGpsLocPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportingSuccGpsLocTimeLess10S() {
            this.bitField0_ &= -33;
            this.sportingSuccGpsLocTimeLess10S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportingSuccGpsLocTimeLess1S() {
            this.bitField0_ &= -5;
            this.sportingSuccGpsLocTimeLess1S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportingSuccGpsLocTimeLess3S() {
            this.bitField0_ &= -9;
            this.sportingSuccGpsLocTimeLess3S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportingSuccGpsLocTimeLess5S() {
            this.bitField0_ &= -17;
            this.sportingSuccGpsLocTimeLess5S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportingSuccGpsLocTimeLessOther() {
            this.bitField0_ &= -65;
            this.sportingSuccGpsLocTimeLessOther_ = 0;
        }

        public static SportEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SportEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (SportEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static SportEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (SportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<SportEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoDetectOther(int value) {
            this.bitField0_ |= 8192;
            this.autoDetectOther_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoDetectRecode(int value) {
            this.bitField0_ |= 16384;
            this.autoDetectRecode_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoDetectRun(int value) {
            this.bitField0_ |= 4096;
            this.autoDetectRun_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoDetectTriger(int value) {
            this.bitField0_ |= 1024;
            this.autoDetectTriger_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoDetectWalk(int value) {
            this.bitField0_ |= 2048;
            this.autoDetectWalk_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBeforeSportSkipGpsLoc(int value) {
            this.bitField0_ |= 1;
            this.beforeSportSkipGpsLoc_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBeforeSportSuccGpsLoc(int value) {
            this.bitField0_ |= 2;
            this.beforeSportSuccGpsLoc_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setManualStartRecode(int value) {
            this.bitField0_ |= 32768;
            this.manualStartRecode_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportingDisconPage(int value) {
            this.bitField0_ |= 256;
            this.sportingDisconPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportingReconnectPage(int value) {
            this.bitField0_ |= 512;
            this.sportingReconnectPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportingSuccGpsLocPage(int value) {
            this.bitField0_ |= 128;
            this.sportingSuccGpsLocPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportingSuccGpsLocTimeLess10S(int value) {
            this.bitField0_ |= 32;
            this.sportingSuccGpsLocTimeLess10S_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportingSuccGpsLocTimeLess1S(int value) {
            this.bitField0_ |= 4;
            this.sportingSuccGpsLocTimeLess1S_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportingSuccGpsLocTimeLess3S(int value) {
            this.bitField0_ |= 8;
            this.sportingSuccGpsLocTimeLess3S_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportingSuccGpsLocTimeLess5S(int value) {
            this.bitField0_ |= 16;
            this.sportingSuccGpsLocTimeLess5S_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportingSuccGpsLocTimeLessOther(int value) {
            this.bitField0_ |= 64;
            this.sportingSuccGpsLocTimeLessOther_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new SportEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0010\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f", new Object[]{"bitField0_", "beforeSportSkipGpsLoc_", "beforeSportSuccGpsLoc_", "sportingSuccGpsLocTimeLess1S_", "sportingSuccGpsLocTimeLess3S_", "sportingSuccGpsLocTimeLess5S_", "sportingSuccGpsLocTimeLess10S_", "sportingSuccGpsLocTimeLessOther_", "sportingSuccGpsLocPage_", "sportingDisconPage_", "sportingReconnectPage_", "autoDetectTriger_", "autoDetectWalk_", "autoDetectRun_", "autoDetectOther_", "autoDetectRecode_", "manualStartRecode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SportEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SportEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public int getAutoDetectOther() {
            return this.autoDetectOther_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public int getAutoDetectRecode() {
            return this.autoDetectRecode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public int getAutoDetectRun() {
            return this.autoDetectRun_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public int getAutoDetectTriger() {
            return this.autoDetectTriger_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public int getAutoDetectWalk() {
            return this.autoDetectWalk_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public int getBeforeSportSkipGpsLoc() {
            return this.beforeSportSkipGpsLoc_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public int getBeforeSportSuccGpsLoc() {
            return this.beforeSportSuccGpsLoc_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public int getManualStartRecode() {
            return this.manualStartRecode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public int getSportingDisconPage() {
            return this.sportingDisconPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public int getSportingReconnectPage() {
            return this.sportingReconnectPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public int getSportingSuccGpsLocPage() {
            return this.sportingSuccGpsLocPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public int getSportingSuccGpsLocTimeLess10S() {
            return this.sportingSuccGpsLocTimeLess10S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public int getSportingSuccGpsLocTimeLess1S() {
            return this.sportingSuccGpsLocTimeLess1S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public int getSportingSuccGpsLocTimeLess3S() {
            return this.sportingSuccGpsLocTimeLess3S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public int getSportingSuccGpsLocTimeLess5S() {
            return this.sportingSuccGpsLocTimeLess5S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public int getSportingSuccGpsLocTimeLessOther() {
            return this.sportingSuccGpsLocTimeLessOther_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public boolean hasAutoDetectOther() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public boolean hasAutoDetectRecode() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public boolean hasAutoDetectRun() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public boolean hasAutoDetectTriger() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public boolean hasAutoDetectWalk() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public boolean hasBeforeSportSkipGpsLoc() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public boolean hasBeforeSportSuccGpsLoc() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public boolean hasManualStartRecode() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public boolean hasSportingDisconPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public boolean hasSportingReconnectPage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public boolean hasSportingSuccGpsLocPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public boolean hasSportingSuccGpsLocTimeLess10S() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public boolean hasSportingSuccGpsLocTimeLess1S() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public boolean hasSportingSuccGpsLocTimeLess3S() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public boolean hasSportingSuccGpsLocTimeLess5S() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.SportEventMessageOrBuilder
        public boolean hasSportingSuccGpsLocTimeLessOther() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(SportEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static SportEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SportEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SportEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SportEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (SportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SportEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SportEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (SportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SportEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SportEventMessage parseFrom(InputStream input) throws IOException {
            return (SportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SportEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SportEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (SportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SportEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface SportEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAutoDetectOther();

        int getAutoDetectRecode();

        int getAutoDetectRun();

        int getAutoDetectTriger();

        int getAutoDetectWalk();

        int getBeforeSportSkipGpsLoc();

        int getBeforeSportSuccGpsLoc();

        int getManualStartRecode();

        int getSportingDisconPage();

        int getSportingReconnectPage();

        int getSportingSuccGpsLocPage();

        int getSportingSuccGpsLocTimeLess10S();

        int getSportingSuccGpsLocTimeLess1S();

        int getSportingSuccGpsLocTimeLess3S();

        int getSportingSuccGpsLocTimeLess5S();

        int getSportingSuccGpsLocTimeLessOther();

        boolean hasAutoDetectOther();

        boolean hasAutoDetectRecode();

        boolean hasAutoDetectRun();

        boolean hasAutoDetectTriger();

        boolean hasAutoDetectWalk();

        boolean hasBeforeSportSkipGpsLoc();

        boolean hasBeforeSportSuccGpsLoc();

        boolean hasManualStartRecode();

        boolean hasSportingDisconPage();

        boolean hasSportingReconnectPage();

        boolean hasSportingSuccGpsLocPage();

        boolean hasSportingSuccGpsLocTimeLess10S();

        boolean hasSportingSuccGpsLocTimeLess1S();

        boolean hasSportingSuccGpsLocTimeLess3S();

        boolean hasSportingSuccGpsLocTimeLess5S();

        boolean hasSportingSuccGpsLocTimeLessOther();
    }

    public static final class UpgrateEventMessage extends GeneratedMessageLite<UpgrateEventMessage, Builder> implements UpgrateEventMessageOrBuilder {
        private static final UpgrateEventMessage DEFAULT_INSTANCE;
        public static final int FIRMWAREUPGRATEFAILED_FIELD_NUMBER = 6;
        public static final int FIRMWAREUPGRATESUCESS_FIELD_NUMBER = 5;
        public static final int FONTUPGRATEFAILED_FIELD_NUMBER = 2;
        public static final int FONTUPGRATESUCESS_FIELD_NUMBER = 1;
        private static volatile Parser<UpgrateEventMessage> PARSER = null;
        public static final int RESOURCEUPGRATEFAILED_FIELD_NUMBER = 4;
        public static final int RESOURCEUPGRATESUCESS_FIELD_NUMBER = 3;
        private int bitField0_;
        private int firmwareUpgrateFailed_;
        private int firmwareUpgrateSucess_;
        private int fontUpgrateFailed_;
        private int fontUpgrateSucess_;
        private byte memoizedIsInitialized = 2;
        private int resourceUpgrateFailed_;
        private int resourceUpgrateSucess_;

        public static final class Builder extends GeneratedMessageLite.Builder<UpgrateEventMessage, Builder> implements UpgrateEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearFirmwareUpgrateFailed() {
                copyOnWrite();
                ((UpgrateEventMessage) this.instance).clearFirmwareUpgrateFailed();
                return this;
            }

            public Builder clearFirmwareUpgrateSucess() {
                copyOnWrite();
                ((UpgrateEventMessage) this.instance).clearFirmwareUpgrateSucess();
                return this;
            }

            public Builder clearFontUpgrateFailed() {
                copyOnWrite();
                ((UpgrateEventMessage) this.instance).clearFontUpgrateFailed();
                return this;
            }

            public Builder clearFontUpgrateSucess() {
                copyOnWrite();
                ((UpgrateEventMessage) this.instance).clearFontUpgrateSucess();
                return this;
            }

            public Builder clearResourceUpgrateFailed() {
                copyOnWrite();
                ((UpgrateEventMessage) this.instance).clearResourceUpgrateFailed();
                return this;
            }

            public Builder clearResourceUpgrateSucess() {
                copyOnWrite();
                ((UpgrateEventMessage) this.instance).clearResourceUpgrateSucess();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
            public int getFirmwareUpgrateFailed() {
                return ((UpgrateEventMessage) this.instance).getFirmwareUpgrateFailed();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
            public int getFirmwareUpgrateSucess() {
                return ((UpgrateEventMessage) this.instance).getFirmwareUpgrateSucess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
            public int getFontUpgrateFailed() {
                return ((UpgrateEventMessage) this.instance).getFontUpgrateFailed();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
            public int getFontUpgrateSucess() {
                return ((UpgrateEventMessage) this.instance).getFontUpgrateSucess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
            public int getResourceUpgrateFailed() {
                return ((UpgrateEventMessage) this.instance).getResourceUpgrateFailed();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
            public int getResourceUpgrateSucess() {
                return ((UpgrateEventMessage) this.instance).getResourceUpgrateSucess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
            public boolean hasFirmwareUpgrateFailed() {
                return ((UpgrateEventMessage) this.instance).hasFirmwareUpgrateFailed();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
            public boolean hasFirmwareUpgrateSucess() {
                return ((UpgrateEventMessage) this.instance).hasFirmwareUpgrateSucess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
            public boolean hasFontUpgrateFailed() {
                return ((UpgrateEventMessage) this.instance).hasFontUpgrateFailed();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
            public boolean hasFontUpgrateSucess() {
                return ((UpgrateEventMessage) this.instance).hasFontUpgrateSucess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
            public boolean hasResourceUpgrateFailed() {
                return ((UpgrateEventMessage) this.instance).hasResourceUpgrateFailed();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
            public boolean hasResourceUpgrateSucess() {
                return ((UpgrateEventMessage) this.instance).hasResourceUpgrateSucess();
            }

            public Builder setFirmwareUpgrateFailed(int value) {
                copyOnWrite();
                ((UpgrateEventMessage) this.instance).setFirmwareUpgrateFailed(value);
                return this;
            }

            public Builder setFirmwareUpgrateSucess(int value) {
                copyOnWrite();
                ((UpgrateEventMessage) this.instance).setFirmwareUpgrateSucess(value);
                return this;
            }

            public Builder setFontUpgrateFailed(int value) {
                copyOnWrite();
                ((UpgrateEventMessage) this.instance).setFontUpgrateFailed(value);
                return this;
            }

            public Builder setFontUpgrateSucess(int value) {
                copyOnWrite();
                ((UpgrateEventMessage) this.instance).setFontUpgrateSucess(value);
                return this;
            }

            public Builder setResourceUpgrateFailed(int value) {
                copyOnWrite();
                ((UpgrateEventMessage) this.instance).setResourceUpgrateFailed(value);
                return this;
            }

            public Builder setResourceUpgrateSucess(int value) {
                copyOnWrite();
                ((UpgrateEventMessage) this.instance).setResourceUpgrateSucess(value);
                return this;
            }

            private Builder() {
                super(UpgrateEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            UpgrateEventMessage upgrateEventMessage = new UpgrateEventMessage();
            DEFAULT_INSTANCE = upgrateEventMessage;
            GeneratedMessageLite.registerDefaultInstance(UpgrateEventMessage.class, upgrateEventMessage);
        }

        private UpgrateEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFirmwareUpgrateFailed() {
            this.bitField0_ &= -33;
            this.firmwareUpgrateFailed_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFirmwareUpgrateSucess() {
            this.bitField0_ &= -17;
            this.firmwareUpgrateSucess_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFontUpgrateFailed() {
            this.bitField0_ &= -3;
            this.fontUpgrateFailed_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFontUpgrateSucess() {
            this.bitField0_ &= -2;
            this.fontUpgrateSucess_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResourceUpgrateFailed() {
            this.bitField0_ &= -9;
            this.resourceUpgrateFailed_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResourceUpgrateSucess() {
            this.bitField0_ &= -5;
            this.resourceUpgrateSucess_ = 0;
        }

        public static UpgrateEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UpgrateEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (UpgrateEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static UpgrateEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (UpgrateEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<UpgrateEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFirmwareUpgrateFailed(int value) {
            this.bitField0_ |= 32;
            this.firmwareUpgrateFailed_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFirmwareUpgrateSucess(int value) {
            this.bitField0_ |= 16;
            this.firmwareUpgrateSucess_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFontUpgrateFailed(int value) {
            this.bitField0_ |= 2;
            this.fontUpgrateFailed_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFontUpgrateSucess(int value) {
            this.bitField0_ |= 1;
            this.fontUpgrateSucess_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResourceUpgrateFailed(int value) {
            this.bitField0_ |= 8;
            this.resourceUpgrateFailed_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResourceUpgrateSucess(int value) {
            this.bitField0_ |= 4;
            this.resourceUpgrateSucess_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new UpgrateEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005", new Object[]{"bitField0_", "fontUpgrateSucess_", "fontUpgrateFailed_", "resourceUpgrateSucess_", "resourceUpgrateFailed_", "firmwareUpgrateSucess_", "firmwareUpgrateFailed_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<UpgrateEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (UpgrateEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
        public int getFirmwareUpgrateFailed() {
            return this.firmwareUpgrateFailed_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
        public int getFirmwareUpgrateSucess() {
            return this.firmwareUpgrateSucess_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
        public int getFontUpgrateFailed() {
            return this.fontUpgrateFailed_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
        public int getFontUpgrateSucess() {
            return this.fontUpgrateSucess_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
        public int getResourceUpgrateFailed() {
            return this.resourceUpgrateFailed_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
        public int getResourceUpgrateSucess() {
            return this.resourceUpgrateSucess_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
        public boolean hasFirmwareUpgrateFailed() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
        public boolean hasFirmwareUpgrateSucess() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
        public boolean hasFontUpgrateFailed() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
        public boolean hasFontUpgrateSucess() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
        public boolean hasResourceUpgrateFailed() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.UpgrateEventMessageOrBuilder
        public boolean hasResourceUpgrateSucess() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(UpgrateEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static UpgrateEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UpgrateEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static UpgrateEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UpgrateEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static UpgrateEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (UpgrateEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static UpgrateEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UpgrateEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static UpgrateEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (UpgrateEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static UpgrateEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UpgrateEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static UpgrateEventMessage parseFrom(InputStream input) throws IOException {
            return (UpgrateEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static UpgrateEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UpgrateEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static UpgrateEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (UpgrateEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static UpgrateEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UpgrateEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface UpgrateEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getFirmwareUpgrateFailed();

        int getFirmwareUpgrateSucess();

        int getFontUpgrateFailed();

        int getFontUpgrateSucess();

        int getResourceUpgrateFailed();

        int getResourceUpgrateSucess();

        boolean hasFirmwareUpgrateFailed();

        boolean hasFirmwareUpgrateSucess();

        boolean hasFontUpgrateFailed();

        boolean hasFontUpgrateSucess();

        boolean hasResourceUpgrateFailed();

        boolean hasResourceUpgrateSucess();
    }

    public static final class XiaoaiEventMessage extends GeneratedMessageLite<XiaoaiEventMessage, Builder> implements XiaoaiEventMessageOrBuilder {
        private static final XiaoaiEventMessage DEFAULT_INSTANCE;
        public static final int GUIDANCEPAGE_FIELD_NUMBER = 6;
        public static final int IDENTIFYFAILPAGE_FIELD_NUMBER = 5;
        public static final int IDENTIFYSUCCPAGE_FIELD_NUMBER = 3;
        public static final int LINKFAIL_FIELD_NUMBER = 2;
        private static volatile Parser<XiaoaiEventMessage> PARSER = null;
        public static final int UNAUTHORIZED_FIELD_NUMBER = 4;
        public static final int XIAOAIPAGE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int guidancePage_;
        private int identifyFailPage_;
        private int identifySuccPage_;
        private int linkFail_;
        private byte memoizedIsInitialized = 2;
        private int unauthorized_;
        private int xiaoaiPage_;

        public static final class Builder extends GeneratedMessageLite.Builder<XiaoaiEventMessage, Builder> implements XiaoaiEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearGuidancePage() {
                copyOnWrite();
                ((XiaoaiEventMessage) this.instance).clearGuidancePage();
                return this;
            }

            public Builder clearIdentifyFailPage() {
                copyOnWrite();
                ((XiaoaiEventMessage) this.instance).clearIdentifyFailPage();
                return this;
            }

            public Builder clearIdentifySuccPage() {
                copyOnWrite();
                ((XiaoaiEventMessage) this.instance).clearIdentifySuccPage();
                return this;
            }

            public Builder clearLinkFail() {
                copyOnWrite();
                ((XiaoaiEventMessage) this.instance).clearLinkFail();
                return this;
            }

            public Builder clearUnauthorized() {
                copyOnWrite();
                ((XiaoaiEventMessage) this.instance).clearUnauthorized();
                return this;
            }

            public Builder clearXiaoaiPage() {
                copyOnWrite();
                ((XiaoaiEventMessage) this.instance).clearXiaoaiPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
            public int getGuidancePage() {
                return ((XiaoaiEventMessage) this.instance).getGuidancePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
            public int getIdentifyFailPage() {
                return ((XiaoaiEventMessage) this.instance).getIdentifyFailPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
            public int getIdentifySuccPage() {
                return ((XiaoaiEventMessage) this.instance).getIdentifySuccPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
            public int getLinkFail() {
                return ((XiaoaiEventMessage) this.instance).getLinkFail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
            public int getUnauthorized() {
                return ((XiaoaiEventMessage) this.instance).getUnauthorized();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
            public int getXiaoaiPage() {
                return ((XiaoaiEventMessage) this.instance).getXiaoaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
            public boolean hasGuidancePage() {
                return ((XiaoaiEventMessage) this.instance).hasGuidancePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
            public boolean hasIdentifyFailPage() {
                return ((XiaoaiEventMessage) this.instance).hasIdentifyFailPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
            public boolean hasIdentifySuccPage() {
                return ((XiaoaiEventMessage) this.instance).hasIdentifySuccPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
            public boolean hasLinkFail() {
                return ((XiaoaiEventMessage) this.instance).hasLinkFail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
            public boolean hasUnauthorized() {
                return ((XiaoaiEventMessage) this.instance).hasUnauthorized();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
            public boolean hasXiaoaiPage() {
                return ((XiaoaiEventMessage) this.instance).hasXiaoaiPage();
            }

            public Builder setGuidancePage(int value) {
                copyOnWrite();
                ((XiaoaiEventMessage) this.instance).setGuidancePage(value);
                return this;
            }

            public Builder setIdentifyFailPage(int value) {
                copyOnWrite();
                ((XiaoaiEventMessage) this.instance).setIdentifyFailPage(value);
                return this;
            }

            public Builder setIdentifySuccPage(int value) {
                copyOnWrite();
                ((XiaoaiEventMessage) this.instance).setIdentifySuccPage(value);
                return this;
            }

            public Builder setLinkFail(int value) {
                copyOnWrite();
                ((XiaoaiEventMessage) this.instance).setLinkFail(value);
                return this;
            }

            public Builder setUnauthorized(int value) {
                copyOnWrite();
                ((XiaoaiEventMessage) this.instance).setUnauthorized(value);
                return this;
            }

            public Builder setXiaoaiPage(int value) {
                copyOnWrite();
                ((XiaoaiEventMessage) this.instance).setXiaoaiPage(value);
                return this;
            }

            private Builder() {
                super(XiaoaiEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            XiaoaiEventMessage xiaoaiEventMessage = new XiaoaiEventMessage();
            DEFAULT_INSTANCE = xiaoaiEventMessage;
            GeneratedMessageLite.registerDefaultInstance(XiaoaiEventMessage.class, xiaoaiEventMessage);
        }

        private XiaoaiEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGuidancePage() {
            this.bitField0_ &= -33;
            this.guidancePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdentifyFailPage() {
            this.bitField0_ &= -17;
            this.identifyFailPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdentifySuccPage() {
            this.bitField0_ &= -5;
            this.identifySuccPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLinkFail() {
            this.bitField0_ &= -3;
            this.linkFail_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnauthorized() {
            this.bitField0_ &= -9;
            this.unauthorized_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearXiaoaiPage() {
            this.bitField0_ &= -2;
            this.xiaoaiPage_ = 0;
        }

        public static XiaoaiEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static XiaoaiEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (XiaoaiEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static XiaoaiEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (XiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<XiaoaiEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuidancePage(int value) {
            this.bitField0_ |= 32;
            this.guidancePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifyFailPage(int value) {
            this.bitField0_ |= 16;
            this.identifyFailPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifySuccPage(int value) {
            this.bitField0_ |= 4;
            this.identifySuccPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkFail(int value) {
            this.bitField0_ |= 2;
            this.linkFail_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnauthorized(int value) {
            this.bitField0_ |= 8;
            this.unauthorized_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setXiaoaiPage(int value) {
            this.bitField0_ |= 1;
            this.xiaoaiPage_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new XiaoaiEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005", new Object[]{"bitField0_", "xiaoaiPage_", "linkFail_", "identifySuccPage_", "unauthorized_", "identifyFailPage_", "guidancePage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<XiaoaiEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (XiaoaiEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
        public int getGuidancePage() {
            return this.guidancePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
        public int getIdentifyFailPage() {
            return this.identifyFailPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
        public int getIdentifySuccPage() {
            return this.identifySuccPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
        public int getLinkFail() {
            return this.linkFail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
        public int getUnauthorized() {
            return this.unauthorized_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
        public int getXiaoaiPage() {
            return this.xiaoaiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
        public boolean hasGuidancePage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
        public boolean hasIdentifyFailPage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
        public boolean hasIdentifySuccPage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
        public boolean hasLinkFail() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
        public boolean hasUnauthorized() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.XiaoaiEventMessageOrBuilder
        public boolean hasXiaoaiPage() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(XiaoaiEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static XiaoaiEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (XiaoaiEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static XiaoaiEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (XiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static XiaoaiEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (XiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static XiaoaiEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (XiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static XiaoaiEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (XiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static XiaoaiEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (XiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static XiaoaiEventMessage parseFrom(InputStream input) throws IOException {
            return (XiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static XiaoaiEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (XiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static XiaoaiEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (XiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static XiaoaiEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (XiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface XiaoaiEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getGuidancePage();

        int getIdentifyFailPage();

        int getIdentifySuccPage();

        int getLinkFail();

        int getUnauthorized();

        int getXiaoaiPage();

        boolean hasGuidancePage();

        boolean hasIdentifyFailPage();

        boolean hasIdentifySuccPage();

        boolean hasLinkFail();

        boolean hasUnauthorized();

        boolean hasXiaoaiPage();
    }

    public static final class breathEventMessage extends GeneratedMessageLite<breathEventMessage, Builder> implements breathEventMessageOrBuilder {
        public static final int BREATHFIVEMINUTE_FIELD_NUMBER = 10;
        public static final int BREATHFOURMINUTE_FIELD_NUMBER = 9;
        public static final int BREATHHRHIGHER_FIELD_NUMBER = 2;
        public static final int BREATHHRLOWER_FIELD_NUMBER = 1;
        public static final int BREATHHRNOCHANGE_FIELD_NUMBER = 3;
        public static final int BREATHHRNOWEAR_FIELD_NUMBER = 5;
        public static final int BREATHHRONLYONE_FIELD_NUMBER = 4;
        public static final int BREATHONEMINUTE_FIELD_NUMBER = 6;
        public static final int BREATHTHREEMINUTE_FIELD_NUMBER = 8;
        public static final int BREATHTWOMINUTE_FIELD_NUMBER = 7;
        private static final breathEventMessage DEFAULT_INSTANCE;
        private static volatile Parser<breathEventMessage> PARSER;
        private int bitField0_;
        private int breathFiveMinute_;
        private int breathFourMinute_;
        private int breathHrHigher_;
        private int breathHrLower_;
        private int breathHrNoChange_;
        private int breathHrNoWear_;
        private int breathHrOnlyOne_;
        private int breathOneMinute_;
        private int breathThreeMinute_;
        private int breathTwoMinute_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends GeneratedMessageLite.Builder<breathEventMessage, Builder> implements breathEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBreathFiveMinute() {
                copyOnWrite();
                ((breathEventMessage) this.instance).clearBreathFiveMinute();
                return this;
            }

            public Builder clearBreathFourMinute() {
                copyOnWrite();
                ((breathEventMessage) this.instance).clearBreathFourMinute();
                return this;
            }

            public Builder clearBreathHrHigher() {
                copyOnWrite();
                ((breathEventMessage) this.instance).clearBreathHrHigher();
                return this;
            }

            public Builder clearBreathHrLower() {
                copyOnWrite();
                ((breathEventMessage) this.instance).clearBreathHrLower();
                return this;
            }

            public Builder clearBreathHrNoChange() {
                copyOnWrite();
                ((breathEventMessage) this.instance).clearBreathHrNoChange();
                return this;
            }

            public Builder clearBreathHrNoWear() {
                copyOnWrite();
                ((breathEventMessage) this.instance).clearBreathHrNoWear();
                return this;
            }

            public Builder clearBreathHrOnlyOne() {
                copyOnWrite();
                ((breathEventMessage) this.instance).clearBreathHrOnlyOne();
                return this;
            }

            public Builder clearBreathOneMinute() {
                copyOnWrite();
                ((breathEventMessage) this.instance).clearBreathOneMinute();
                return this;
            }

            public Builder clearBreathThreeMinute() {
                copyOnWrite();
                ((breathEventMessage) this.instance).clearBreathThreeMinute();
                return this;
            }

            public Builder clearBreathTwoMinute() {
                copyOnWrite();
                ((breathEventMessage) this.instance).clearBreathTwoMinute();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public int getBreathFiveMinute() {
                return ((breathEventMessage) this.instance).getBreathFiveMinute();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public int getBreathFourMinute() {
                return ((breathEventMessage) this.instance).getBreathFourMinute();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public int getBreathHrHigher() {
                return ((breathEventMessage) this.instance).getBreathHrHigher();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public int getBreathHrLower() {
                return ((breathEventMessage) this.instance).getBreathHrLower();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public int getBreathHrNoChange() {
                return ((breathEventMessage) this.instance).getBreathHrNoChange();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public int getBreathHrNoWear() {
                return ((breathEventMessage) this.instance).getBreathHrNoWear();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public int getBreathHrOnlyOne() {
                return ((breathEventMessage) this.instance).getBreathHrOnlyOne();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public int getBreathOneMinute() {
                return ((breathEventMessage) this.instance).getBreathOneMinute();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public int getBreathThreeMinute() {
                return ((breathEventMessage) this.instance).getBreathThreeMinute();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public int getBreathTwoMinute() {
                return ((breathEventMessage) this.instance).getBreathTwoMinute();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public boolean hasBreathFiveMinute() {
                return ((breathEventMessage) this.instance).hasBreathFiveMinute();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public boolean hasBreathFourMinute() {
                return ((breathEventMessage) this.instance).hasBreathFourMinute();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public boolean hasBreathHrHigher() {
                return ((breathEventMessage) this.instance).hasBreathHrHigher();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public boolean hasBreathHrLower() {
                return ((breathEventMessage) this.instance).hasBreathHrLower();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public boolean hasBreathHrNoChange() {
                return ((breathEventMessage) this.instance).hasBreathHrNoChange();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public boolean hasBreathHrNoWear() {
                return ((breathEventMessage) this.instance).hasBreathHrNoWear();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public boolean hasBreathHrOnlyOne() {
                return ((breathEventMessage) this.instance).hasBreathHrOnlyOne();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public boolean hasBreathOneMinute() {
                return ((breathEventMessage) this.instance).hasBreathOneMinute();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public boolean hasBreathThreeMinute() {
                return ((breathEventMessage) this.instance).hasBreathThreeMinute();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
            public boolean hasBreathTwoMinute() {
                return ((breathEventMessage) this.instance).hasBreathTwoMinute();
            }

            public Builder setBreathFiveMinute(int value) {
                copyOnWrite();
                ((breathEventMessage) this.instance).setBreathFiveMinute(value);
                return this;
            }

            public Builder setBreathFourMinute(int value) {
                copyOnWrite();
                ((breathEventMessage) this.instance).setBreathFourMinute(value);
                return this;
            }

            public Builder setBreathHrHigher(int value) {
                copyOnWrite();
                ((breathEventMessage) this.instance).setBreathHrHigher(value);
                return this;
            }

            public Builder setBreathHrLower(int value) {
                copyOnWrite();
                ((breathEventMessage) this.instance).setBreathHrLower(value);
                return this;
            }

            public Builder setBreathHrNoChange(int value) {
                copyOnWrite();
                ((breathEventMessage) this.instance).setBreathHrNoChange(value);
                return this;
            }

            public Builder setBreathHrNoWear(int value) {
                copyOnWrite();
                ((breathEventMessage) this.instance).setBreathHrNoWear(value);
                return this;
            }

            public Builder setBreathHrOnlyOne(int value) {
                copyOnWrite();
                ((breathEventMessage) this.instance).setBreathHrOnlyOne(value);
                return this;
            }

            public Builder setBreathOneMinute(int value) {
                copyOnWrite();
                ((breathEventMessage) this.instance).setBreathOneMinute(value);
                return this;
            }

            public Builder setBreathThreeMinute(int value) {
                copyOnWrite();
                ((breathEventMessage) this.instance).setBreathThreeMinute(value);
                return this;
            }

            public Builder setBreathTwoMinute(int value) {
                copyOnWrite();
                ((breathEventMessage) this.instance).setBreathTwoMinute(value);
                return this;
            }

            private Builder() {
                super(breathEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            breathEventMessage breatheventmessage = new breathEventMessage();
            DEFAULT_INSTANCE = breatheventmessage;
            GeneratedMessageLite.registerDefaultInstance(breathEventMessage.class, breatheventmessage);
        }

        private breathEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBreathFiveMinute() {
            this.bitField0_ &= -513;
            this.breathFiveMinute_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBreathFourMinute() {
            this.bitField0_ &= -257;
            this.breathFourMinute_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBreathHrHigher() {
            this.bitField0_ &= -3;
            this.breathHrHigher_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBreathHrLower() {
            this.bitField0_ &= -2;
            this.breathHrLower_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBreathHrNoChange() {
            this.bitField0_ &= -5;
            this.breathHrNoChange_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBreathHrNoWear() {
            this.bitField0_ &= -17;
            this.breathHrNoWear_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBreathHrOnlyOne() {
            this.bitField0_ &= -9;
            this.breathHrOnlyOne_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBreathOneMinute() {
            this.bitField0_ &= -33;
            this.breathOneMinute_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBreathThreeMinute() {
            this.bitField0_ &= -129;
            this.breathThreeMinute_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBreathTwoMinute() {
            this.bitField0_ &= -65;
            this.breathTwoMinute_ = 0;
        }

        public static breathEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static breathEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (breathEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static breathEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (breathEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<breathEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBreathFiveMinute(int value) {
            this.bitField0_ |= 512;
            this.breathFiveMinute_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBreathFourMinute(int value) {
            this.bitField0_ |= 256;
            this.breathFourMinute_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBreathHrHigher(int value) {
            this.bitField0_ |= 2;
            this.breathHrHigher_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBreathHrLower(int value) {
            this.bitField0_ |= 1;
            this.breathHrLower_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBreathHrNoChange(int value) {
            this.bitField0_ |= 4;
            this.breathHrNoChange_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBreathHrNoWear(int value) {
            this.bitField0_ |= 16;
            this.breathHrNoWear_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBreathHrOnlyOne(int value) {
            this.bitField0_ |= 8;
            this.breathHrOnlyOne_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBreathOneMinute(int value) {
            this.bitField0_ |= 32;
            this.breathOneMinute_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBreathThreeMinute(int value) {
            this.bitField0_ |= 128;
            this.breathThreeMinute_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBreathTwoMinute(int value) {
            this.bitField0_ |= 64;
            this.breathTwoMinute_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new breathEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\n\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t", new Object[]{"bitField0_", "breathHrLower_", "breathHrHigher_", "breathHrNoChange_", "breathHrOnlyOne_", "breathHrNoWear_", "breathOneMinute_", "breathTwoMinute_", "breathThreeMinute_", "breathFourMinute_", "breathFiveMinute_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<breathEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (breathEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public int getBreathFiveMinute() {
            return this.breathFiveMinute_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public int getBreathFourMinute() {
            return this.breathFourMinute_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public int getBreathHrHigher() {
            return this.breathHrHigher_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public int getBreathHrLower() {
            return this.breathHrLower_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public int getBreathHrNoChange() {
            return this.breathHrNoChange_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public int getBreathHrNoWear() {
            return this.breathHrNoWear_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public int getBreathHrOnlyOne() {
            return this.breathHrOnlyOne_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public int getBreathOneMinute() {
            return this.breathOneMinute_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public int getBreathThreeMinute() {
            return this.breathThreeMinute_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public int getBreathTwoMinute() {
            return this.breathTwoMinute_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public boolean hasBreathFiveMinute() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public boolean hasBreathFourMinute() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public boolean hasBreathHrHigher() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public boolean hasBreathHrLower() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public boolean hasBreathHrNoChange() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public boolean hasBreathHrNoWear() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public boolean hasBreathHrOnlyOne() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public boolean hasBreathOneMinute() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public boolean hasBreathThreeMinute() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.breathEventMessageOrBuilder
        public boolean hasBreathTwoMinute() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(breathEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static breathEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (breathEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static breathEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (breathEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static breathEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (breathEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static breathEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (breathEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static breathEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (breathEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static breathEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (breathEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static breathEventMessage parseFrom(InputStream input) throws IOException {
            return (breathEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static breathEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (breathEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static breathEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (breathEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static breathEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (breathEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface breathEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getBreathFiveMinute();

        int getBreathFourMinute();

        int getBreathHrHigher();

        int getBreathHrLower();

        int getBreathHrNoChange();

        int getBreathHrNoWear();

        int getBreathHrOnlyOne();

        int getBreathOneMinute();

        int getBreathThreeMinute();

        int getBreathTwoMinute();

        boolean hasBreathFiveMinute();

        boolean hasBreathFourMinute();

        boolean hasBreathHrHigher();

        boolean hasBreathHrLower();

        boolean hasBreathHrNoChange();

        boolean hasBreathHrNoWear();

        boolean hasBreathHrOnlyOne();

        boolean hasBreathOneMinute();

        boolean hasBreathThreeMinute();

        boolean hasBreathTwoMinute();
    }

    public static final class cycleEventMessage extends GeneratedMessageLite<cycleEventMessage, Builder> implements cycleEventMessageOrBuilder {
        public static final int CYCLERECBYAPPDETAIL_FIELD_NUMBER = 2;
        public static final int CYCLERECBYREMIND_FIELD_NUMBER = 3;
        public static final int CYCLERECBYSHORTCUT_FIELD_NUMBER = 1;
        private static final cycleEventMessage DEFAULT_INSTANCE;
        public static final int OVERCYCLERECBYAPPDETAIL_FIELD_NUMBER = 5;
        public static final int OVERCYCLERECBYSHORTCUT_FIELD_NUMBER = 4;
        private static volatile Parser<cycleEventMessage> PARSER;
        private int bitField0_;
        private int cycleRecByAppDetail_;
        private int cycleRecByRemind_;
        private int cycleRecByShortcut_;
        private byte memoizedIsInitialized = 2;
        private int overCycleRecByAppDetail_;
        private int overCycleRecByShortcut_;

        public static final class Builder extends GeneratedMessageLite.Builder<cycleEventMessage, Builder> implements cycleEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCycleRecByAppDetail() {
                copyOnWrite();
                ((cycleEventMessage) this.instance).clearCycleRecByAppDetail();
                return this;
            }

            public Builder clearCycleRecByRemind() {
                copyOnWrite();
                ((cycleEventMessage) this.instance).clearCycleRecByRemind();
                return this;
            }

            public Builder clearCycleRecByShortcut() {
                copyOnWrite();
                ((cycleEventMessage) this.instance).clearCycleRecByShortcut();
                return this;
            }

            public Builder clearOverCycleRecByAppDetail() {
                copyOnWrite();
                ((cycleEventMessage) this.instance).clearOverCycleRecByAppDetail();
                return this;
            }

            public Builder clearOverCycleRecByShortcut() {
                copyOnWrite();
                ((cycleEventMessage) this.instance).clearOverCycleRecByShortcut();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
            public int getCycleRecByAppDetail() {
                return ((cycleEventMessage) this.instance).getCycleRecByAppDetail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
            public int getCycleRecByRemind() {
                return ((cycleEventMessage) this.instance).getCycleRecByRemind();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
            public int getCycleRecByShortcut() {
                return ((cycleEventMessage) this.instance).getCycleRecByShortcut();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
            public int getOverCycleRecByAppDetail() {
                return ((cycleEventMessage) this.instance).getOverCycleRecByAppDetail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
            public int getOverCycleRecByShortcut() {
                return ((cycleEventMessage) this.instance).getOverCycleRecByShortcut();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
            public boolean hasCycleRecByAppDetail() {
                return ((cycleEventMessage) this.instance).hasCycleRecByAppDetail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
            public boolean hasCycleRecByRemind() {
                return ((cycleEventMessage) this.instance).hasCycleRecByRemind();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
            public boolean hasCycleRecByShortcut() {
                return ((cycleEventMessage) this.instance).hasCycleRecByShortcut();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
            public boolean hasOverCycleRecByAppDetail() {
                return ((cycleEventMessage) this.instance).hasOverCycleRecByAppDetail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
            public boolean hasOverCycleRecByShortcut() {
                return ((cycleEventMessage) this.instance).hasOverCycleRecByShortcut();
            }

            public Builder setCycleRecByAppDetail(int value) {
                copyOnWrite();
                ((cycleEventMessage) this.instance).setCycleRecByAppDetail(value);
                return this;
            }

            public Builder setCycleRecByRemind(int value) {
                copyOnWrite();
                ((cycleEventMessage) this.instance).setCycleRecByRemind(value);
                return this;
            }

            public Builder setCycleRecByShortcut(int value) {
                copyOnWrite();
                ((cycleEventMessage) this.instance).setCycleRecByShortcut(value);
                return this;
            }

            public Builder setOverCycleRecByAppDetail(int value) {
                copyOnWrite();
                ((cycleEventMessage) this.instance).setOverCycleRecByAppDetail(value);
                return this;
            }

            public Builder setOverCycleRecByShortcut(int value) {
                copyOnWrite();
                ((cycleEventMessage) this.instance).setOverCycleRecByShortcut(value);
                return this;
            }

            private Builder() {
                super(cycleEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            cycleEventMessage cycleeventmessage = new cycleEventMessage();
            DEFAULT_INSTANCE = cycleeventmessage;
            GeneratedMessageLite.registerDefaultInstance(cycleEventMessage.class, cycleeventmessage);
        }

        private cycleEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCycleRecByAppDetail() {
            this.bitField0_ &= -3;
            this.cycleRecByAppDetail_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCycleRecByRemind() {
            this.bitField0_ &= -5;
            this.cycleRecByRemind_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCycleRecByShortcut() {
            this.bitField0_ &= -2;
            this.cycleRecByShortcut_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOverCycleRecByAppDetail() {
            this.bitField0_ &= -17;
            this.overCycleRecByAppDetail_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOverCycleRecByShortcut() {
            this.bitField0_ &= -9;
            this.overCycleRecByShortcut_ = 0;
        }

        public static cycleEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static cycleEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (cycleEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static cycleEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (cycleEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<cycleEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCycleRecByAppDetail(int value) {
            this.bitField0_ |= 2;
            this.cycleRecByAppDetail_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCycleRecByRemind(int value) {
            this.bitField0_ |= 4;
            this.cycleRecByRemind_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCycleRecByShortcut(int value) {
            this.bitField0_ |= 1;
            this.cycleRecByShortcut_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOverCycleRecByAppDetail(int value) {
            this.bitField0_ |= 16;
            this.overCycleRecByAppDetail_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOverCycleRecByShortcut(int value) {
            this.bitField0_ |= 8;
            this.overCycleRecByShortcut_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new cycleEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004", new Object[]{"bitField0_", "cycleRecByShortcut_", "cycleRecByAppDetail_", "cycleRecByRemind_", "overCycleRecByShortcut_", "overCycleRecByAppDetail_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<cycleEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (cycleEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
        public int getCycleRecByAppDetail() {
            return this.cycleRecByAppDetail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
        public int getCycleRecByRemind() {
            return this.cycleRecByRemind_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
        public int getCycleRecByShortcut() {
            return this.cycleRecByShortcut_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
        public int getOverCycleRecByAppDetail() {
            return this.overCycleRecByAppDetail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
        public int getOverCycleRecByShortcut() {
            return this.overCycleRecByShortcut_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
        public boolean hasCycleRecByAppDetail() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
        public boolean hasCycleRecByRemind() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
        public boolean hasCycleRecByShortcut() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
        public boolean hasOverCycleRecByAppDetail() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.cycleEventMessageOrBuilder
        public boolean hasOverCycleRecByShortcut() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(cycleEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static cycleEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (cycleEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static cycleEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (cycleEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static cycleEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (cycleEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static cycleEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (cycleEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static cycleEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (cycleEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static cycleEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (cycleEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static cycleEventMessage parseFrom(InputStream input) throws IOException {
            return (cycleEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static cycleEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (cycleEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static cycleEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (cycleEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static cycleEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (cycleEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface cycleEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getCycleRecByAppDetail();

        int getCycleRecByRemind();

        int getCycleRecByShortcut();

        int getOverCycleRecByAppDetail();

        int getOverCycleRecByShortcut();

        boolean hasCycleRecByAppDetail();

        boolean hasCycleRecByRemind();

        boolean hasCycleRecByShortcut();

        boolean hasOverCycleRecByAppDetail();

        boolean hasOverCycleRecByShortcut();
    }

    public static final class fitDataMeasureEventMessage extends GeneratedMessageLite<fitDataMeasureEventMessage, Builder> implements fitDataMeasureEventMessageOrBuilder {
        private static final fitDataMeasureEventMessage DEFAULT_INSTANCE;
        public static final int MEAFAILBYBADSIGNAL_FIELD_NUMBER = 3;
        public static final int MEAFAILBYOFFWRIST_FIELD_NUMBER = 4;
        public static final int MEASUCBYAPPDETAIL_FIELD_NUMBER = 2;
        public static final int MEASUCBYSHORTCUT_FIELD_NUMBER = 1;
        public static final int MEASUCTIMELEVELFOUR_FIELD_NUMBER = 10;
        public static final int MEASUCTIMELEVELONE_FIELD_NUMBER = 7;
        public static final int MEASUCTIMELEVELTREE_FIELD_NUMBER = 9;
        public static final int MEASUCTIMELEVELTWO_FIELD_NUMBER = 8;
        private static volatile Parser<fitDataMeasureEventMessage> PARSER = null;
        public static final int STARTMEABYAPPDETAIL_FIELD_NUMBER = 6;
        public static final int STARTMEABYSHORTCUT_FIELD_NUMBER = 5;
        private int bitField0_;
        private int meaFailByBadSignal_;
        private int meaFailByOffWrist_;
        private int meaSucByAppDetail_;
        private int meaSucByShortCut_;
        private int meaSucTimeLevelFour_;
        private int meaSucTimeLevelOne_;
        private int meaSucTimeLevelTree_;
        private int meaSucTimeLevelTwo_;
        private byte memoizedIsInitialized = 2;
        private int startMeaByAppDetail_;
        private int startMeaByShortCut_;

        public static final class Builder extends GeneratedMessageLite.Builder<fitDataMeasureEventMessage, Builder> implements fitDataMeasureEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearMeaFailByBadSignal() {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).clearMeaFailByBadSignal();
                return this;
            }

            public Builder clearMeaFailByOffWrist() {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).clearMeaFailByOffWrist();
                return this;
            }

            public Builder clearMeaSucByAppDetail() {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).clearMeaSucByAppDetail();
                return this;
            }

            public Builder clearMeaSucByShortCut() {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).clearMeaSucByShortCut();
                return this;
            }

            public Builder clearMeaSucTimeLevelFour() {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).clearMeaSucTimeLevelFour();
                return this;
            }

            public Builder clearMeaSucTimeLevelOne() {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).clearMeaSucTimeLevelOne();
                return this;
            }

            public Builder clearMeaSucTimeLevelTree() {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).clearMeaSucTimeLevelTree();
                return this;
            }

            public Builder clearMeaSucTimeLevelTwo() {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).clearMeaSucTimeLevelTwo();
                return this;
            }

            public Builder clearStartMeaByAppDetail() {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).clearStartMeaByAppDetail();
                return this;
            }

            public Builder clearStartMeaByShortCut() {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).clearStartMeaByShortCut();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public int getMeaFailByBadSignal() {
                return ((fitDataMeasureEventMessage) this.instance).getMeaFailByBadSignal();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public int getMeaFailByOffWrist() {
                return ((fitDataMeasureEventMessage) this.instance).getMeaFailByOffWrist();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public int getMeaSucByAppDetail() {
                return ((fitDataMeasureEventMessage) this.instance).getMeaSucByAppDetail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public int getMeaSucByShortCut() {
                return ((fitDataMeasureEventMessage) this.instance).getMeaSucByShortCut();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public int getMeaSucTimeLevelFour() {
                return ((fitDataMeasureEventMessage) this.instance).getMeaSucTimeLevelFour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public int getMeaSucTimeLevelOne() {
                return ((fitDataMeasureEventMessage) this.instance).getMeaSucTimeLevelOne();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public int getMeaSucTimeLevelTree() {
                return ((fitDataMeasureEventMessage) this.instance).getMeaSucTimeLevelTree();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public int getMeaSucTimeLevelTwo() {
                return ((fitDataMeasureEventMessage) this.instance).getMeaSucTimeLevelTwo();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public int getStartMeaByAppDetail() {
                return ((fitDataMeasureEventMessage) this.instance).getStartMeaByAppDetail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public int getStartMeaByShortCut() {
                return ((fitDataMeasureEventMessage) this.instance).getStartMeaByShortCut();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public boolean hasMeaFailByBadSignal() {
                return ((fitDataMeasureEventMessage) this.instance).hasMeaFailByBadSignal();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public boolean hasMeaFailByOffWrist() {
                return ((fitDataMeasureEventMessage) this.instance).hasMeaFailByOffWrist();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public boolean hasMeaSucByAppDetail() {
                return ((fitDataMeasureEventMessage) this.instance).hasMeaSucByAppDetail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public boolean hasMeaSucByShortCut() {
                return ((fitDataMeasureEventMessage) this.instance).hasMeaSucByShortCut();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public boolean hasMeaSucTimeLevelFour() {
                return ((fitDataMeasureEventMessage) this.instance).hasMeaSucTimeLevelFour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public boolean hasMeaSucTimeLevelOne() {
                return ((fitDataMeasureEventMessage) this.instance).hasMeaSucTimeLevelOne();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public boolean hasMeaSucTimeLevelTree() {
                return ((fitDataMeasureEventMessage) this.instance).hasMeaSucTimeLevelTree();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public boolean hasMeaSucTimeLevelTwo() {
                return ((fitDataMeasureEventMessage) this.instance).hasMeaSucTimeLevelTwo();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public boolean hasStartMeaByAppDetail() {
                return ((fitDataMeasureEventMessage) this.instance).hasStartMeaByAppDetail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
            public boolean hasStartMeaByShortCut() {
                return ((fitDataMeasureEventMessage) this.instance).hasStartMeaByShortCut();
            }

            public Builder setMeaFailByBadSignal(int value) {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).setMeaFailByBadSignal(value);
                return this;
            }

            public Builder setMeaFailByOffWrist(int value) {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).setMeaFailByOffWrist(value);
                return this;
            }

            public Builder setMeaSucByAppDetail(int value) {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).setMeaSucByAppDetail(value);
                return this;
            }

            public Builder setMeaSucByShortCut(int value) {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).setMeaSucByShortCut(value);
                return this;
            }

            public Builder setMeaSucTimeLevelFour(int value) {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).setMeaSucTimeLevelFour(value);
                return this;
            }

            public Builder setMeaSucTimeLevelOne(int value) {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).setMeaSucTimeLevelOne(value);
                return this;
            }

            public Builder setMeaSucTimeLevelTree(int value) {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).setMeaSucTimeLevelTree(value);
                return this;
            }

            public Builder setMeaSucTimeLevelTwo(int value) {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).setMeaSucTimeLevelTwo(value);
                return this;
            }

            public Builder setStartMeaByAppDetail(int value) {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).setStartMeaByAppDetail(value);
                return this;
            }

            public Builder setStartMeaByShortCut(int value) {
                copyOnWrite();
                ((fitDataMeasureEventMessage) this.instance).setStartMeaByShortCut(value);
                return this;
            }

            private Builder() {
                super(fitDataMeasureEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            fitDataMeasureEventMessage fitdatameasureeventmessage = new fitDataMeasureEventMessage();
            DEFAULT_INSTANCE = fitdatameasureeventmessage;
            GeneratedMessageLite.registerDefaultInstance(fitDataMeasureEventMessage.class, fitdatameasureeventmessage);
        }

        private fitDataMeasureEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeaFailByBadSignal() {
            this.bitField0_ &= -5;
            this.meaFailByBadSignal_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeaFailByOffWrist() {
            this.bitField0_ &= -9;
            this.meaFailByOffWrist_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeaSucByAppDetail() {
            this.bitField0_ &= -3;
            this.meaSucByAppDetail_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeaSucByShortCut() {
            this.bitField0_ &= -2;
            this.meaSucByShortCut_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeaSucTimeLevelFour() {
            this.bitField0_ &= -513;
            this.meaSucTimeLevelFour_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeaSucTimeLevelOne() {
            this.bitField0_ &= -65;
            this.meaSucTimeLevelOne_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeaSucTimeLevelTree() {
            this.bitField0_ &= -257;
            this.meaSucTimeLevelTree_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeaSucTimeLevelTwo() {
            this.bitField0_ &= -129;
            this.meaSucTimeLevelTwo_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartMeaByAppDetail() {
            this.bitField0_ &= -33;
            this.startMeaByAppDetail_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartMeaByShortCut() {
            this.bitField0_ &= -17;
            this.startMeaByShortCut_ = 0;
        }

        public static fitDataMeasureEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static fitDataMeasureEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (fitDataMeasureEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static fitDataMeasureEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (fitDataMeasureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<fitDataMeasureEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeaFailByBadSignal(int value) {
            this.bitField0_ |= 4;
            this.meaFailByBadSignal_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeaFailByOffWrist(int value) {
            this.bitField0_ |= 8;
            this.meaFailByOffWrist_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeaSucByAppDetail(int value) {
            this.bitField0_ |= 2;
            this.meaSucByAppDetail_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeaSucByShortCut(int value) {
            this.bitField0_ |= 1;
            this.meaSucByShortCut_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeaSucTimeLevelFour(int value) {
            this.bitField0_ |= 512;
            this.meaSucTimeLevelFour_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeaSucTimeLevelOne(int value) {
            this.bitField0_ |= 64;
            this.meaSucTimeLevelOne_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeaSucTimeLevelTree(int value) {
            this.bitField0_ |= 256;
            this.meaSucTimeLevelTree_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeaSucTimeLevelTwo(int value) {
            this.bitField0_ |= 128;
            this.meaSucTimeLevelTwo_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartMeaByAppDetail(int value) {
            this.bitField0_ |= 32;
            this.startMeaByAppDetail_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartMeaByShortCut(int value) {
            this.bitField0_ |= 16;
            this.startMeaByShortCut_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new fitDataMeasureEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\n\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t", new Object[]{"bitField0_", "meaSucByShortCut_", "meaSucByAppDetail_", "meaFailByBadSignal_", "meaFailByOffWrist_", "startMeaByShortCut_", "startMeaByAppDetail_", "meaSucTimeLevelOne_", "meaSucTimeLevelTwo_", "meaSucTimeLevelTree_", "meaSucTimeLevelFour_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<fitDataMeasureEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (fitDataMeasureEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public int getMeaFailByBadSignal() {
            return this.meaFailByBadSignal_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public int getMeaFailByOffWrist() {
            return this.meaFailByOffWrist_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public int getMeaSucByAppDetail() {
            return this.meaSucByAppDetail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public int getMeaSucByShortCut() {
            return this.meaSucByShortCut_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public int getMeaSucTimeLevelFour() {
            return this.meaSucTimeLevelFour_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public int getMeaSucTimeLevelOne() {
            return this.meaSucTimeLevelOne_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public int getMeaSucTimeLevelTree() {
            return this.meaSucTimeLevelTree_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public int getMeaSucTimeLevelTwo() {
            return this.meaSucTimeLevelTwo_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public int getStartMeaByAppDetail() {
            return this.startMeaByAppDetail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public int getStartMeaByShortCut() {
            return this.startMeaByShortCut_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public boolean hasMeaFailByBadSignal() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public boolean hasMeaFailByOffWrist() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public boolean hasMeaSucByAppDetail() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public boolean hasMeaSucByShortCut() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public boolean hasMeaSucTimeLevelFour() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public boolean hasMeaSucTimeLevelOne() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public boolean hasMeaSucTimeLevelTree() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public boolean hasMeaSucTimeLevelTwo() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public boolean hasStartMeaByAppDetail() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.fitDataMeasureEventMessageOrBuilder
        public boolean hasStartMeaByShortCut() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(fitDataMeasureEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static fitDataMeasureEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (fitDataMeasureEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static fitDataMeasureEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (fitDataMeasureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static fitDataMeasureEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (fitDataMeasureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static fitDataMeasureEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (fitDataMeasureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static fitDataMeasureEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (fitDataMeasureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static fitDataMeasureEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (fitDataMeasureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static fitDataMeasureEventMessage parseFrom(InputStream input) throws IOException {
            return (fitDataMeasureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static fitDataMeasureEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (fitDataMeasureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static fitDataMeasureEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (fitDataMeasureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static fitDataMeasureEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (fitDataMeasureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface fitDataMeasureEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getMeaFailByBadSignal();

        int getMeaFailByOffWrist();

        int getMeaSucByAppDetail();

        int getMeaSucByShortCut();

        int getMeaSucTimeLevelFour();

        int getMeaSucTimeLevelOne();

        int getMeaSucTimeLevelTree();

        int getMeaSucTimeLevelTwo();

        int getStartMeaByAppDetail();

        int getStartMeaByShortCut();

        boolean hasMeaFailByBadSignal();

        boolean hasMeaFailByOffWrist();

        boolean hasMeaSucByAppDetail();

        boolean hasMeaSucByShortCut();

        boolean hasMeaSucTimeLevelFour();

        boolean hasMeaSucTimeLevelOne();

        boolean hasMeaSucTimeLevelTree();

        boolean hasMeaSucTimeLevelTwo();

        boolean hasStartMeaByAppDetail();

        boolean hasStartMeaByShortCut();
    }

    public static final class nfcEventMessage extends GeneratedMessageLite<nfcEventMessage, Builder> implements nfcEventMessageOrBuilder {
        public static final int CARDTYPEACCESS_FIELD_NUMBER = 2;
        public static final int CARDTYPEBUS_FIELD_NUMBER = 1;
        public static final int CARDTYPEMASTERCARD_FIELD_NUMBER = 4;
        public static final int CARDTYPEUNIONPAY_FIELD_NUMBER = 3;
        private static final nfcEventMessage DEFAULT_INSTANCE;
        private static volatile Parser<nfcEventMessage> PARSER;
        private int bitField0_;
        private int cardTypeAccess_;
        private int cardTypeBus_;
        private int cardTypeMasterCard_;
        private int cardTypeUnionPay_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends GeneratedMessageLite.Builder<nfcEventMessage, Builder> implements nfcEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCardTypeAccess() {
                copyOnWrite();
                ((nfcEventMessage) this.instance).clearCardTypeAccess();
                return this;
            }

            public Builder clearCardTypeBus() {
                copyOnWrite();
                ((nfcEventMessage) this.instance).clearCardTypeBus();
                return this;
            }

            public Builder clearCardTypeMasterCard() {
                copyOnWrite();
                ((nfcEventMessage) this.instance).clearCardTypeMasterCard();
                return this;
            }

            public Builder clearCardTypeUnionPay() {
                copyOnWrite();
                ((nfcEventMessage) this.instance).clearCardTypeUnionPay();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.nfcEventMessageOrBuilder
            public int getCardTypeAccess() {
                return ((nfcEventMessage) this.instance).getCardTypeAccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.nfcEventMessageOrBuilder
            public int getCardTypeBus() {
                return ((nfcEventMessage) this.instance).getCardTypeBus();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.nfcEventMessageOrBuilder
            public int getCardTypeMasterCard() {
                return ((nfcEventMessage) this.instance).getCardTypeMasterCard();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.nfcEventMessageOrBuilder
            public int getCardTypeUnionPay() {
                return ((nfcEventMessage) this.instance).getCardTypeUnionPay();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.nfcEventMessageOrBuilder
            public boolean hasCardTypeAccess() {
                return ((nfcEventMessage) this.instance).hasCardTypeAccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.nfcEventMessageOrBuilder
            public boolean hasCardTypeBus() {
                return ((nfcEventMessage) this.instance).hasCardTypeBus();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.nfcEventMessageOrBuilder
            public boolean hasCardTypeMasterCard() {
                return ((nfcEventMessage) this.instance).hasCardTypeMasterCard();
            }

            @Override // com.xiaomi.hm.health.bt.proto.EventBase.nfcEventMessageOrBuilder
            public boolean hasCardTypeUnionPay() {
                return ((nfcEventMessage) this.instance).hasCardTypeUnionPay();
            }

            public Builder setCardTypeAccess(int value) {
                copyOnWrite();
                ((nfcEventMessage) this.instance).setCardTypeAccess(value);
                return this;
            }

            public Builder setCardTypeBus(int value) {
                copyOnWrite();
                ((nfcEventMessage) this.instance).setCardTypeBus(value);
                return this;
            }

            public Builder setCardTypeMasterCard(int value) {
                copyOnWrite();
                ((nfcEventMessage) this.instance).setCardTypeMasterCard(value);
                return this;
            }

            public Builder setCardTypeUnionPay(int value) {
                copyOnWrite();
                ((nfcEventMessage) this.instance).setCardTypeUnionPay(value);
                return this;
            }

            private Builder() {
                super(nfcEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            nfcEventMessage nfceventmessage = new nfcEventMessage();
            DEFAULT_INSTANCE = nfceventmessage;
            GeneratedMessageLite.registerDefaultInstance(nfcEventMessage.class, nfceventmessage);
        }

        private nfcEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCardTypeAccess() {
            this.bitField0_ &= -3;
            this.cardTypeAccess_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCardTypeBus() {
            this.bitField0_ &= -2;
            this.cardTypeBus_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCardTypeMasterCard() {
            this.bitField0_ &= -9;
            this.cardTypeMasterCard_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCardTypeUnionPay() {
            this.bitField0_ &= -5;
            this.cardTypeUnionPay_ = 0;
        }

        public static nfcEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static nfcEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (nfcEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static nfcEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (nfcEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<nfcEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardTypeAccess(int value) {
            this.bitField0_ |= 2;
            this.cardTypeAccess_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardTypeBus(int value) {
            this.bitField0_ |= 1;
            this.cardTypeBus_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardTypeMasterCard(int value) {
            this.bitField0_ |= 8;
            this.cardTypeMasterCard_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardTypeUnionPay(int value) {
            this.bitField0_ |= 4;
            this.cardTypeUnionPay_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new nfcEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003", new Object[]{"bitField0_", "cardTypeBus_", "cardTypeAccess_", "cardTypeUnionPay_", "cardTypeMasterCard_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<nfcEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (nfcEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.nfcEventMessageOrBuilder
        public int getCardTypeAccess() {
            return this.cardTypeAccess_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.nfcEventMessageOrBuilder
        public int getCardTypeBus() {
            return this.cardTypeBus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.nfcEventMessageOrBuilder
        public int getCardTypeMasterCard() {
            return this.cardTypeMasterCard_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.nfcEventMessageOrBuilder
        public int getCardTypeUnionPay() {
            return this.cardTypeUnionPay_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.nfcEventMessageOrBuilder
        public boolean hasCardTypeAccess() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.nfcEventMessageOrBuilder
        public boolean hasCardTypeBus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.nfcEventMessageOrBuilder
        public boolean hasCardTypeMasterCard() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.EventBase.nfcEventMessageOrBuilder
        public boolean hasCardTypeUnionPay() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(nfcEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static nfcEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (nfcEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static nfcEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (nfcEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static nfcEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (nfcEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static nfcEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (nfcEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static nfcEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (nfcEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static nfcEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (nfcEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static nfcEventMessage parseFrom(InputStream input) throws IOException {
            return (nfcEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static nfcEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (nfcEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static nfcEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (nfcEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static nfcEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (nfcEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface nfcEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getCardTypeAccess();

        int getCardTypeBus();

        int getCardTypeMasterCard();

        int getCardTypeUnionPay();

        boolean hasCardTypeAccess();

        boolean hasCardTypeBus();

        boolean hasCardTypeMasterCard();

        boolean hasCardTypeUnionPay();
    }

    private EventBase() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}

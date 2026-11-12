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
public final class Event {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Event$1, reason: invalid class name */
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

    public static final class BatterySaverMode extends GeneratedMessageLite<BatterySaverMode, Builder> implements BatterySaverModeOrBuilder {
        public static final int BATTERYVALUE_FIELD_NUMBER = 2;
        public static final int COUNT_FIELD_NUMBER = 1;
        private static final BatterySaverMode DEFAULT_INSTANCE;
        private static volatile vkh<BatterySaverMode> PARSER;
        private int batteryValue_;
        private int bitField0_;
        private int count_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends GeneratedMessageLite.a<BatterySaverMode, Builder> implements BatterySaverModeOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBatteryValue() {
                copyOnWrite();
                ((BatterySaverMode) this.instance).clearBatteryValue();
                return this;
            }

            public Builder clearCount() {
                copyOnWrite();
                ((BatterySaverMode) this.instance).clearCount();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.BatterySaverModeOrBuilder
            public int getBatteryValue() {
                return ((BatterySaverMode) this.instance).getBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.BatterySaverModeOrBuilder
            public int getCount() {
                return ((BatterySaverMode) this.instance).getCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.BatterySaverModeOrBuilder
            public boolean hasBatteryValue() {
                return ((BatterySaverMode) this.instance).hasBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.BatterySaverModeOrBuilder
            public boolean hasCount() {
                return ((BatterySaverMode) this.instance).hasCount();
            }

            public Builder setBatteryValue(int i) {
                copyOnWrite();
                ((BatterySaverMode) this.instance).setBatteryValue(i);
                return this;
            }

            public Builder setCount(int i) {
                copyOnWrite();
                ((BatterySaverMode) this.instance).setCount(i);
                return this;
            }

            private Builder() {
                super(BatterySaverMode.DEFAULT_INSTANCE);
            }
        }

        static {
            BatterySaverMode batterySaverMode = new BatterySaverMode();
            DEFAULT_INSTANCE = batterySaverMode;
            GeneratedMessageLite.registerDefaultInstance(BatterySaverMode.class, batterySaverMode);
        }

        private BatterySaverMode() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatteryValue() {
            this.bitField0_ &= -3;
            this.batteryValue_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCount() {
            this.bitField0_ &= -2;
            this.count_ = 0;
        }

        public static BatterySaverMode getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BatterySaverMode parseDelimitedFrom(InputStream inputStream) {
            return (BatterySaverMode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BatterySaverMode parseFrom(ByteBuffer byteBuffer) {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<BatterySaverMode> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatteryValue(int i) {
            this.bitField0_ |= 2;
            this.batteryValue_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCount(int i) {
            this.bitField0_ |= 1;
            this.count_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new BatterySaverMode();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔋ\u0000\u0002ᔋ\u0001", new Object[]{"bitField0_", "count_", "batteryValue_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<BatterySaverMode> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (BatterySaverMode.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.BatterySaverModeOrBuilder
        public int getBatteryValue() {
            return this.batteryValue_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.BatterySaverModeOrBuilder
        public int getCount() {
            return this.count_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.BatterySaverModeOrBuilder
        public boolean hasBatteryValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.BatterySaverModeOrBuilder
        public boolean hasCount() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BatterySaverMode batterySaverMode) {
            return DEFAULT_INSTANCE.createBuilder(batterySaverMode);
        }

        public static BatterySaverMode parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (BatterySaverMode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static BatterySaverMode parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static BatterySaverMode parseFrom(ByteString byteString) {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BatterySaverMode parseFrom(ByteString byteString, t tVar) {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static BatterySaverMode parseFrom(byte[] bArr) {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BatterySaverMode parseFrom(byte[] bArr, t tVar) {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static BatterySaverMode parseFrom(InputStream inputStream) {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BatterySaverMode parseFrom(InputStream inputStream, t tVar) {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static BatterySaverMode parseFrom(j jVar) {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static BatterySaverMode parseFrom(j jVar, t tVar) {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface BatterySaverModeOrBuilder extends bsf {
        int getBatteryValue();

        int getCount();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        boolean hasBatteryValue();

        boolean hasCount();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class DfuUpgradeMessage extends GeneratedMessageLite<DfuUpgradeMessage, Builder> implements DfuUpgradeMessageOrBuilder {
        private static final DfuUpgradeMessage DEFAULT_INSTANCE;
        private static volatile vkh<DfuUpgradeMessage> PARSER = null;
        public static final int UPGRADEFAILTIME_FIELD_NUMBER = 2;
        public static final int UPGRADETIME_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int upgradeFailTime_;
        private int upgradeTime_;

        public static final class Builder extends GeneratedMessageLite.a<DfuUpgradeMessage, Builder> implements DfuUpgradeMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearUpgradeFailTime() {
                copyOnWrite();
                ((DfuUpgradeMessage) this.instance).clearUpgradeFailTime();
                return this;
            }

            public Builder clearUpgradeTime() {
                copyOnWrite();
                ((DfuUpgradeMessage) this.instance).clearUpgradeTime();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DfuUpgradeMessageOrBuilder
            public int getUpgradeFailTime() {
                return ((DfuUpgradeMessage) this.instance).getUpgradeFailTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DfuUpgradeMessageOrBuilder
            public int getUpgradeTime() {
                return ((DfuUpgradeMessage) this.instance).getUpgradeTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DfuUpgradeMessageOrBuilder
            public boolean hasUpgradeFailTime() {
                return ((DfuUpgradeMessage) this.instance).hasUpgradeFailTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DfuUpgradeMessageOrBuilder
            public boolean hasUpgradeTime() {
                return ((DfuUpgradeMessage) this.instance).hasUpgradeTime();
            }

            public Builder setUpgradeFailTime(int i) {
                copyOnWrite();
                ((DfuUpgradeMessage) this.instance).setUpgradeFailTime(i);
                return this;
            }

            public Builder setUpgradeTime(int i) {
                copyOnWrite();
                ((DfuUpgradeMessage) this.instance).setUpgradeTime(i);
                return this;
            }

            private Builder() {
                super(DfuUpgradeMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            DfuUpgradeMessage dfuUpgradeMessage = new DfuUpgradeMessage();
            DEFAULT_INSTANCE = dfuUpgradeMessage;
            GeneratedMessageLite.registerDefaultInstance(DfuUpgradeMessage.class, dfuUpgradeMessage);
        }

        private DfuUpgradeMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpgradeFailTime() {
            this.bitField0_ &= -3;
            this.upgradeFailTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpgradeTime() {
            this.bitField0_ &= -2;
            this.upgradeTime_ = 0;
        }

        public static DfuUpgradeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DfuUpgradeMessage parseDelimitedFrom(InputStream inputStream) {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DfuUpgradeMessage parseFrom(ByteBuffer byteBuffer) {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<DfuUpgradeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpgradeFailTime(int i) {
            this.bitField0_ |= 2;
            this.upgradeFailTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpgradeTime(int i) {
            this.bitField0_ |= 1;
            this.upgradeTime_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DfuUpgradeMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔋ\u0000\u0002ᔋ\u0001", new Object[]{"bitField0_", "upgradeTime_", "upgradeFailTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<DfuUpgradeMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (DfuUpgradeMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.DfuUpgradeMessageOrBuilder
        public int getUpgradeFailTime() {
            return this.upgradeFailTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DfuUpgradeMessageOrBuilder
        public int getUpgradeTime() {
            return this.upgradeTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DfuUpgradeMessageOrBuilder
        public boolean hasUpgradeFailTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DfuUpgradeMessageOrBuilder
        public boolean hasUpgradeTime() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(DfuUpgradeMessage dfuUpgradeMessage) {
            return DEFAULT_INSTANCE.createBuilder(dfuUpgradeMessage);
        }

        public static DfuUpgradeMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static DfuUpgradeMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static DfuUpgradeMessage parseFrom(ByteString byteString) {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DfuUpgradeMessage parseFrom(ByteString byteString, t tVar) {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static DfuUpgradeMessage parseFrom(byte[] bArr) {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DfuUpgradeMessage parseFrom(byte[] bArr, t tVar) {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static DfuUpgradeMessage parseFrom(InputStream inputStream) {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DfuUpgradeMessage parseFrom(InputStream inputStream, t tVar) {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static DfuUpgradeMessage parseFrom(j jVar) {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static DfuUpgradeMessage parseFrom(j jVar, t tVar) {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface DfuUpgradeMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getUpgradeFailTime();

        int getUpgradeTime();

        boolean hasUpgradeFailTime();

        boolean hasUpgradeTime();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class DialtoolMessage extends GeneratedMessageLite<DialtoolMessage, Builder> implements DialtoolMessageOrBuilder {
        private static final DialtoolMessage DEFAULT_INSTANCE;
        public static final int DIALID_FIELD_NUMBER = 1;
        public static final int DIALSELECTID_FIELD_NUMBER = 3;
        public static final int DIALTOOLID_FIELD_NUMBER = 2;
        private static volatile vkh<DialtoolMessage> PARSER;
        private int bitField0_;
        private int dialid_;
        private int dialselectid_;
        private int dialtoolid_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends GeneratedMessageLite.a<DialtoolMessage, Builder> implements DialtoolMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDialid() {
                copyOnWrite();
                ((DialtoolMessage) this.instance).clearDialid();
                return this;
            }

            public Builder clearDialselectid() {
                copyOnWrite();
                ((DialtoolMessage) this.instance).clearDialselectid();
                return this;
            }

            public Builder clearDialtoolid() {
                copyOnWrite();
                ((DialtoolMessage) this.instance).clearDialtoolid();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
            public int getDialid() {
                return ((DialtoolMessage) this.instance).getDialid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
            public int getDialselectid() {
                return ((DialtoolMessage) this.instance).getDialselectid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
            public int getDialtoolid() {
                return ((DialtoolMessage) this.instance).getDialtoolid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
            public boolean hasDialid() {
                return ((DialtoolMessage) this.instance).hasDialid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
            public boolean hasDialselectid() {
                return ((DialtoolMessage) this.instance).hasDialselectid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
            public boolean hasDialtoolid() {
                return ((DialtoolMessage) this.instance).hasDialtoolid();
            }

            public Builder setDialid(int i) {
                copyOnWrite();
                ((DialtoolMessage) this.instance).setDialid(i);
                return this;
            }

            public Builder setDialselectid(int i) {
                copyOnWrite();
                ((DialtoolMessage) this.instance).setDialselectid(i);
                return this;
            }

            public Builder setDialtoolid(int i) {
                copyOnWrite();
                ((DialtoolMessage) this.instance).setDialtoolid(i);
                return this;
            }

            private Builder() {
                super(DialtoolMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            DialtoolMessage dialtoolMessage = new DialtoolMessage();
            DEFAULT_INSTANCE = dialtoolMessage;
            GeneratedMessageLite.registerDefaultInstance(DialtoolMessage.class, dialtoolMessage);
        }

        private DialtoolMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialid() {
            this.bitField0_ &= -2;
            this.dialid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialselectid() {
            this.bitField0_ &= -5;
            this.dialselectid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialtoolid() {
            this.bitField0_ &= -3;
            this.dialtoolid_ = 0;
        }

        public static DialtoolMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DialtoolMessage parseDelimitedFrom(InputStream inputStream) {
            return (DialtoolMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DialtoolMessage parseFrom(ByteBuffer byteBuffer) {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<DialtoolMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialid(int i) {
            this.bitField0_ |= 1;
            this.dialid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialselectid(int i) {
            this.bitField0_ |= 4;
            this.dialselectid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialtoolid(int i) {
            this.bitField0_ |= 2;
            this.dialtoolid_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DialtoolMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"bitField0_", "dialid_", "dialtoolid_", "dialselectid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<DialtoolMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (DialtoolMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
        public int getDialid() {
            return this.dialid_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
        public int getDialselectid() {
            return this.dialselectid_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
        public int getDialtoolid() {
            return this.dialtoolid_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
        public boolean hasDialid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
        public boolean hasDialselectid() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
        public boolean hasDialtoolid() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(DialtoolMessage dialtoolMessage) {
            return DEFAULT_INSTANCE.createBuilder(dialtoolMessage);
        }

        public static DialtoolMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (DialtoolMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static DialtoolMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static DialtoolMessage parseFrom(ByteString byteString) {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DialtoolMessage parseFrom(ByteString byteString, t tVar) {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static DialtoolMessage parseFrom(byte[] bArr) {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DialtoolMessage parseFrom(byte[] bArr, t tVar) {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static DialtoolMessage parseFrom(InputStream inputStream) {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DialtoolMessage parseFrom(InputStream inputStream, t tVar) {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static DialtoolMessage parseFrom(j jVar) {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static DialtoolMessage parseFrom(j jVar, t tVar) {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface DialtoolMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDialid();

        int getDialselectid();

        int getDialtoolid();

        boolean hasDialid();

        boolean hasDialselectid();

        boolean hasDialtoolid();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class DndEventMessage extends GeneratedMessageLite<DndEventMessage, Builder> implements DndEventMessageOrBuilder {
        private static final DndEventMessage DEFAULT_INSTANCE;
        public static final int DNDINHOUR_FIELD_NUMBER = 2;
        public static final int DNDINMIN_FIELD_NUMBER = 3;
        public static final int DNDMODE_FIELD_NUMBER = 1;
        public static final int DNDOUTHOUR_FIELD_NUMBER = 4;
        public static final int DNDOUTMIN_FIELD_NUMBER = 5;
        private static volatile vkh<DndEventMessage> PARSER;
        private int bitField0_;
        private int dndInHour_;
        private int dndInMin_;
        private int dndMode_;
        private int dndOutHour_;
        private int dndOutMin_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends GeneratedMessageLite.a<DndEventMessage, Builder> implements DndEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDndInHour() {
                copyOnWrite();
                ((DndEventMessage) this.instance).clearDndInHour();
                return this;
            }

            public Builder clearDndInMin() {
                copyOnWrite();
                ((DndEventMessage) this.instance).clearDndInMin();
                return this;
            }

            public Builder clearDndMode() {
                copyOnWrite();
                ((DndEventMessage) this.instance).clearDndMode();
                return this;
            }

            public Builder clearDndOutHour() {
                copyOnWrite();
                ((DndEventMessage) this.instance).clearDndOutHour();
                return this;
            }

            public Builder clearDndOutMin() {
                copyOnWrite();
                ((DndEventMessage) this.instance).clearDndOutMin();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public int getDndInHour() {
                return ((DndEventMessage) this.instance).getDndInHour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public int getDndInMin() {
                return ((DndEventMessage) this.instance).getDndInMin();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public int getDndMode() {
                return ((DndEventMessage) this.instance).getDndMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public int getDndOutHour() {
                return ((DndEventMessage) this.instance).getDndOutHour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public int getDndOutMin() {
                return ((DndEventMessage) this.instance).getDndOutMin();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public boolean hasDndInHour() {
                return ((DndEventMessage) this.instance).hasDndInHour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public boolean hasDndInMin() {
                return ((DndEventMessage) this.instance).hasDndInMin();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public boolean hasDndMode() {
                return ((DndEventMessage) this.instance).hasDndMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public boolean hasDndOutHour() {
                return ((DndEventMessage) this.instance).hasDndOutHour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public boolean hasDndOutMin() {
                return ((DndEventMessage) this.instance).hasDndOutMin();
            }

            public Builder setDndInHour(int i) {
                copyOnWrite();
                ((DndEventMessage) this.instance).setDndInHour(i);
                return this;
            }

            public Builder setDndInMin(int i) {
                copyOnWrite();
                ((DndEventMessage) this.instance).setDndInMin(i);
                return this;
            }

            public Builder setDndMode(int i) {
                copyOnWrite();
                ((DndEventMessage) this.instance).setDndMode(i);
                return this;
            }

            public Builder setDndOutHour(int i) {
                copyOnWrite();
                ((DndEventMessage) this.instance).setDndOutHour(i);
                return this;
            }

            public Builder setDndOutMin(int i) {
                copyOnWrite();
                ((DndEventMessage) this.instance).setDndOutMin(i);
                return this;
            }

            private Builder() {
                super(DndEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            DndEventMessage dndEventMessage = new DndEventMessage();
            DEFAULT_INSTANCE = dndEventMessage;
            GeneratedMessageLite.registerDefaultInstance(DndEventMessage.class, dndEventMessage);
        }

        private DndEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDndInHour() {
            this.bitField0_ &= -3;
            this.dndInHour_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDndInMin() {
            this.bitField0_ &= -5;
            this.dndInMin_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDndMode() {
            this.bitField0_ &= -2;
            this.dndMode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDndOutHour() {
            this.bitField0_ &= -9;
            this.dndOutHour_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDndOutMin() {
            this.bitField0_ &= -17;
            this.dndOutMin_ = 0;
        }

        public static DndEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DndEventMessage parseDelimitedFrom(InputStream inputStream) {
            return (DndEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DndEventMessage parseFrom(ByteBuffer byteBuffer) {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<DndEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDndInHour(int i) {
            this.bitField0_ |= 2;
            this.dndInHour_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDndInMin(int i) {
            this.bitField0_ |= 4;
            this.dndInMin_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDndMode(int i) {
            this.bitField0_ |= 1;
            this.dndMode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDndOutHour(int i) {
            this.bitField0_ |= 8;
            this.dndOutHour_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDndOutMin(int i) {
            this.bitField0_ |= 16;
            this.dndOutMin_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DndEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004", new Object[]{"bitField0_", "dndMode_", "dndInHour_", "dndInMin_", "dndOutHour_", "dndOutMin_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<DndEventMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (DndEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public int getDndInHour() {
            return this.dndInHour_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public int getDndInMin() {
            return this.dndInMin_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public int getDndMode() {
            return this.dndMode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public int getDndOutHour() {
            return this.dndOutHour_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public int getDndOutMin() {
            return this.dndOutMin_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public boolean hasDndInHour() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public boolean hasDndInMin() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public boolean hasDndMode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public boolean hasDndOutHour() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public boolean hasDndOutMin() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(DndEventMessage dndEventMessage) {
            return DEFAULT_INSTANCE.createBuilder(dndEventMessage);
        }

        public static DndEventMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (DndEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static DndEventMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static DndEventMessage parseFrom(ByteString byteString) {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DndEventMessage parseFrom(ByteString byteString, t tVar) {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static DndEventMessage parseFrom(byte[] bArr) {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DndEventMessage parseFrom(byte[] bArr, t tVar) {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static DndEventMessage parseFrom(InputStream inputStream) {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DndEventMessage parseFrom(InputStream inputStream, t tVar) {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static DndEventMessage parseFrom(j jVar) {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static DndEventMessage parseFrom(j jVar, t tVar) {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface DndEventMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDndInHour();

        int getDndInMin();

        int getDndMode();

        int getDndOutHour();

        int getDndOutMin();

        boolean hasDndInHour();

        boolean hasDndInMin();

        boolean hasDndMode();

        boolean hasDndOutHour();

        boolean hasDndOutMin();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class NandMessage extends GeneratedMessageLite<NandMessage, Builder> implements NandMessageOrBuilder {
        private static final NandMessage DEFAULT_INSTANCE;
        public static final int ERASETIMES_FIELD_NUMBER = 3;
        private static volatile vkh<NandMessage> PARSER = null;
        public static final int READTIMES_FIELD_NUMBER = 2;
        public static final int WRITETIMES_FIELD_NUMBER = 1;
        private int bitField0_;
        private int eraseTimes_;
        private byte memoizedIsInitialized = 2;
        private int readTimes_;
        private int writeTimes_;

        public static final class Builder extends GeneratedMessageLite.a<NandMessage, Builder> implements NandMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearEraseTimes() {
                copyOnWrite();
                ((NandMessage) this.instance).clearEraseTimes();
                return this;
            }

            public Builder clearReadTimes() {
                copyOnWrite();
                ((NandMessage) this.instance).clearReadTimes();
                return this;
            }

            public Builder clearWriteTimes() {
                copyOnWrite();
                ((NandMessage) this.instance).clearWriteTimes();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
            public int getEraseTimes() {
                return ((NandMessage) this.instance).getEraseTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
            public int getReadTimes() {
                return ((NandMessage) this.instance).getReadTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
            public int getWriteTimes() {
                return ((NandMessage) this.instance).getWriteTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
            public boolean hasEraseTimes() {
                return ((NandMessage) this.instance).hasEraseTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
            public boolean hasReadTimes() {
                return ((NandMessage) this.instance).hasReadTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
            public boolean hasWriteTimes() {
                return ((NandMessage) this.instance).hasWriteTimes();
            }

            public Builder setEraseTimes(int i) {
                copyOnWrite();
                ((NandMessage) this.instance).setEraseTimes(i);
                return this;
            }

            public Builder setReadTimes(int i) {
                copyOnWrite();
                ((NandMessage) this.instance).setReadTimes(i);
                return this;
            }

            public Builder setWriteTimes(int i) {
                copyOnWrite();
                ((NandMessage) this.instance).setWriteTimes(i);
                return this;
            }

            private Builder() {
                super(NandMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            NandMessage nandMessage = new NandMessage();
            DEFAULT_INSTANCE = nandMessage;
            GeneratedMessageLite.registerDefaultInstance(NandMessage.class, nandMessage);
        }

        private NandMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEraseTimes() {
            this.bitField0_ &= -5;
            this.eraseTimes_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReadTimes() {
            this.bitField0_ &= -3;
            this.readTimes_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWriteTimes() {
            this.bitField0_ &= -2;
            this.writeTimes_ = 0;
        }

        public static NandMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NandMessage parseDelimitedFrom(InputStream inputStream) {
            return (NandMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NandMessage parseFrom(ByteBuffer byteBuffer) {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<NandMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEraseTimes(int i) {
            this.bitField0_ |= 4;
            this.eraseTimes_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReadTimes(int i) {
            this.bitField0_ |= 2;
            this.readTimes_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWriteTimes(int i) {
            this.bitField0_ |= 1;
            this.writeTimes_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NandMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"bitField0_", "writeTimes_", "readTimes_", "eraseTimes_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<NandMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (NandMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
        public int getEraseTimes() {
            return this.eraseTimes_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
        public int getReadTimes() {
            return this.readTimes_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
        public int getWriteTimes() {
            return this.writeTimes_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
        public boolean hasEraseTimes() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
        public boolean hasReadTimes() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
        public boolean hasWriteTimes() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(NandMessage nandMessage) {
            return DEFAULT_INSTANCE.createBuilder(nandMessage);
        }

        public static NandMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (NandMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static NandMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static NandMessage parseFrom(ByteString byteString) {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NandMessage parseFrom(ByteString byteString, t tVar) {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static NandMessage parseFrom(byte[] bArr) {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NandMessage parseFrom(byte[] bArr, t tVar) {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static NandMessage parseFrom(InputStream inputStream) {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NandMessage parseFrom(InputStream inputStream, t tVar) {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static NandMessage parseFrom(j jVar) {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NandMessage parseFrom(j jVar, t tVar) {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface NandMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getEraseTimes();

        int getReadTimes();

        int getWriteTimes();

        boolean hasEraseTimes();

        boolean hasReadTimes();

        boolean hasWriteTimes();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class NotifyMessage extends GeneratedMessageLite<NotifyMessage, Builder> implements NotifyMessageOrBuilder {
        private static final NotifyMessage DEFAULT_INSTANCE;
        public static final int DETAIL_FIELD_NUMBER = 2;
        private static volatile vkh<NotifyMessage> PARSER = null;
        public static final int RECIVE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int detail_;
        private byte memoizedIsInitialized = 2;
        private int recive_;

        public static final class Builder extends GeneratedMessageLite.a<NotifyMessage, Builder> implements NotifyMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDetail() {
                copyOnWrite();
                ((NotifyMessage) this.instance).clearDetail();
                return this;
            }

            public Builder clearRecive() {
                copyOnWrite();
                ((NotifyMessage) this.instance).clearRecive();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NotifyMessageOrBuilder
            public int getDetail() {
                return ((NotifyMessage) this.instance).getDetail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NotifyMessageOrBuilder
            public int getRecive() {
                return ((NotifyMessage) this.instance).getRecive();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NotifyMessageOrBuilder
            public boolean hasDetail() {
                return ((NotifyMessage) this.instance).hasDetail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NotifyMessageOrBuilder
            public boolean hasRecive() {
                return ((NotifyMessage) this.instance).hasRecive();
            }

            public Builder setDetail(int i) {
                copyOnWrite();
                ((NotifyMessage) this.instance).setDetail(i);
                return this;
            }

            public Builder setRecive(int i) {
                copyOnWrite();
                ((NotifyMessage) this.instance).setRecive(i);
                return this;
            }

            private Builder() {
                super(NotifyMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            NotifyMessage notifyMessage = new NotifyMessage();
            DEFAULT_INSTANCE = notifyMessage;
            GeneratedMessageLite.registerDefaultInstance(NotifyMessage.class, notifyMessage);
        }

        private NotifyMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDetail() {
            this.bitField0_ &= -3;
            this.detail_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecive() {
            this.bitField0_ &= -2;
            this.recive_ = 0;
        }

        public static NotifyMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyMessage parseDelimitedFrom(InputStream inputStream) {
            return (NotifyMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyMessage parseFrom(ByteBuffer byteBuffer) {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<NotifyMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDetail(int i) {
            this.bitField0_ |= 2;
            this.detail_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecive(int i) {
            this.bitField0_ |= 1;
            this.recive_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NotifyMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔋ\u0000\u0002ᔋ\u0001", new Object[]{"bitField0_", "recive_", "detail_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<NotifyMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (NotifyMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.NotifyMessageOrBuilder
        public int getDetail() {
            return this.detail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.NotifyMessageOrBuilder
        public int getRecive() {
            return this.recive_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.NotifyMessageOrBuilder
        public boolean hasDetail() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.NotifyMessageOrBuilder
        public boolean hasRecive() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(NotifyMessage notifyMessage) {
            return DEFAULT_INSTANCE.createBuilder(notifyMessage);
        }

        public static NotifyMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (NotifyMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static NotifyMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static NotifyMessage parseFrom(ByteString byteString) {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NotifyMessage parseFrom(ByteString byteString, t tVar) {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static NotifyMessage parseFrom(byte[] bArr) {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotifyMessage parseFrom(byte[] bArr, t tVar) {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static NotifyMessage parseFrom(InputStream inputStream) {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotifyMessage parseFrom(InputStream inputStream, t tVar) {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static NotifyMessage parseFrom(j jVar) {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NotifyMessage parseFrom(j jVar, t tVar) {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface NotifyMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDetail();

        int getRecive();

        boolean hasDetail();

        boolean hasRecive();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class SportStatusMessage extends GeneratedMessageLite<SportStatusMessage, Builder> implements SportStatusMessageOrBuilder {
        public static final int AUTOPAUSE_FIELD_NUMBER = 4;
        public static final int CALTARGE_FIELD_NUMBER = 3;
        private static final SportStatusMessage DEFAULT_INSTANCE;
        public static final int DISTANCETARGE_FIELD_NUMBER = 1;
        private static volatile vkh<SportStatusMessage> PARSER = null;
        public static final int SPORTGRAPH_FIELD_NUMBER = 5;
        public static final int TIMETARGE_FIELD_NUMBER = 2;
        private boolean autoPause_;
        private int bitField0_;
        private int calTarge_;
        private int distanceTarge_;
        private byte memoizedIsInitialized = 2;
        private int sportGraph_;
        private int timeTarge_;

        public static final class Builder extends GeneratedMessageLite.a<SportStatusMessage, Builder> implements SportStatusMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAutoPause() {
                copyOnWrite();
                ((SportStatusMessage) this.instance).clearAutoPause();
                return this;
            }

            public Builder clearCalTarge() {
                copyOnWrite();
                ((SportStatusMessage) this.instance).clearCalTarge();
                return this;
            }

            public Builder clearDistanceTarge() {
                copyOnWrite();
                ((SportStatusMessage) this.instance).clearDistanceTarge();
                return this;
            }

            public Builder clearSportGraph() {
                copyOnWrite();
                ((SportStatusMessage) this.instance).clearSportGraph();
                return this;
            }

            public Builder clearTimeTarge() {
                copyOnWrite();
                ((SportStatusMessage) this.instance).clearTimeTarge();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public boolean getAutoPause() {
                return ((SportStatusMessage) this.instance).getAutoPause();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public int getCalTarge() {
                return ((SportStatusMessage) this.instance).getCalTarge();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public int getDistanceTarge() {
                return ((SportStatusMessage) this.instance).getDistanceTarge();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public int getSportGraph() {
                return ((SportStatusMessage) this.instance).getSportGraph();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public int getTimeTarge() {
                return ((SportStatusMessage) this.instance).getTimeTarge();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public boolean hasAutoPause() {
                return ((SportStatusMessage) this.instance).hasAutoPause();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public boolean hasCalTarge() {
                return ((SportStatusMessage) this.instance).hasCalTarge();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public boolean hasDistanceTarge() {
                return ((SportStatusMessage) this.instance).hasDistanceTarge();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public boolean hasSportGraph() {
                return ((SportStatusMessage) this.instance).hasSportGraph();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public boolean hasTimeTarge() {
                return ((SportStatusMessage) this.instance).hasTimeTarge();
            }

            public Builder setAutoPause(boolean z) {
                copyOnWrite();
                ((SportStatusMessage) this.instance).setAutoPause(z);
                return this;
            }

            public Builder setCalTarge(int i) {
                copyOnWrite();
                ((SportStatusMessage) this.instance).setCalTarge(i);
                return this;
            }

            public Builder setDistanceTarge(int i) {
                copyOnWrite();
                ((SportStatusMessage) this.instance).setDistanceTarge(i);
                return this;
            }

            public Builder setSportGraph(int i) {
                copyOnWrite();
                ((SportStatusMessage) this.instance).setSportGraph(i);
                return this;
            }

            public Builder setTimeTarge(int i) {
                copyOnWrite();
                ((SportStatusMessage) this.instance).setTimeTarge(i);
                return this;
            }

            private Builder() {
                super(SportStatusMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            SportStatusMessage sportStatusMessage = new SportStatusMessage();
            DEFAULT_INSTANCE = sportStatusMessage;
            GeneratedMessageLite.registerDefaultInstance(SportStatusMessage.class, sportStatusMessage);
        }

        private SportStatusMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoPause() {
            this.bitField0_ &= -9;
            this.autoPause_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCalTarge() {
            this.bitField0_ &= -5;
            this.calTarge_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDistanceTarge() {
            this.bitField0_ &= -2;
            this.distanceTarge_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportGraph() {
            this.bitField0_ &= -17;
            this.sportGraph_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeTarge() {
            this.bitField0_ &= -3;
            this.timeTarge_ = 0;
        }

        public static SportStatusMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SportStatusMessage parseDelimitedFrom(InputStream inputStream) {
            return (SportStatusMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SportStatusMessage parseFrom(ByteBuffer byteBuffer) {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<SportStatusMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoPause(boolean z) {
            this.bitField0_ |= 8;
            this.autoPause_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalTarge(int i) {
            this.bitField0_ |= 4;
            this.calTarge_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDistanceTarge(int i) {
            this.bitField0_ |= 1;
            this.distanceTarge_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportGraph(int i) {
            this.bitField0_ |= 16;
            this.sportGraph_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeTarge(int i) {
            this.bitField0_ |= 2;
            this.timeTarge_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SportStatusMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ᔇ\u0003\u0005ᔋ\u0004", new Object[]{"bitField0_", "distanceTarge_", "timeTarge_", "calTarge_", "autoPause_", "sportGraph_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<SportStatusMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (SportStatusMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public boolean getAutoPause() {
            return this.autoPause_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public int getCalTarge() {
            return this.calTarge_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public int getDistanceTarge() {
            return this.distanceTarge_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public int getSportGraph() {
            return this.sportGraph_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public int getTimeTarge() {
            return this.timeTarge_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public boolean hasAutoPause() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public boolean hasCalTarge() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public boolean hasDistanceTarge() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public boolean hasSportGraph() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public boolean hasTimeTarge() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(SportStatusMessage sportStatusMessage) {
            return DEFAULT_INSTANCE.createBuilder(sportStatusMessage);
        }

        public static SportStatusMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (SportStatusMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SportStatusMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static SportStatusMessage parseFrom(ByteString byteString) {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SportStatusMessage parseFrom(ByteString byteString, t tVar) {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static SportStatusMessage parseFrom(byte[] bArr) {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SportStatusMessage parseFrom(byte[] bArr, t tVar) {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static SportStatusMessage parseFrom(InputStream inputStream) {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SportStatusMessage parseFrom(InputStream inputStream, t tVar) {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SportStatusMessage parseFrom(j jVar) {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static SportStatusMessage parseFrom(j jVar, t tVar) {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface SportStatusMessageOrBuilder extends bsf {
        boolean getAutoPause();

        int getCalTarge();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDistanceTarge();

        int getSportGraph();

        int getTimeTarge();

        boolean hasAutoPause();

        boolean hasCalTarge();

        boolean hasDistanceTarge();

        boolean hasSportGraph();

        boolean hasTimeTarge();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class lightscreentimeMessage extends GeneratedMessageLite<lightscreentimeMessage, Builder> implements lightscreentimeMessageOrBuilder {
        private static final lightscreentimeMessage DEFAULT_INSTANCE;
        public static final int ENDTIME_FIELD_NUMBER = 2;
        private static volatile vkh<lightscreentimeMessage> PARSER = null;
        public static final int STARTTIME_FIELD_NUMBER = 1;
        private int bitField0_;
        private int endtime_;
        private byte memoizedIsInitialized = 2;
        private int starttime_;

        public static final class Builder extends GeneratedMessageLite.a<lightscreentimeMessage, Builder> implements lightscreentimeMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearEndtime() {
                copyOnWrite();
                ((lightscreentimeMessage) this.instance).clearEndtime();
                return this;
            }

            public Builder clearStarttime() {
                copyOnWrite();
                ((lightscreentimeMessage) this.instance).clearStarttime();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.lightscreentimeMessageOrBuilder
            public int getEndtime() {
                return ((lightscreentimeMessage) this.instance).getEndtime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.lightscreentimeMessageOrBuilder
            public int getStarttime() {
                return ((lightscreentimeMessage) this.instance).getStarttime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.lightscreentimeMessageOrBuilder
            public boolean hasEndtime() {
                return ((lightscreentimeMessage) this.instance).hasEndtime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.lightscreentimeMessageOrBuilder
            public boolean hasStarttime() {
                return ((lightscreentimeMessage) this.instance).hasStarttime();
            }

            public Builder setEndtime(int i) {
                copyOnWrite();
                ((lightscreentimeMessage) this.instance).setEndtime(i);
                return this;
            }

            public Builder setStarttime(int i) {
                copyOnWrite();
                ((lightscreentimeMessage) this.instance).setStarttime(i);
                return this;
            }

            private Builder() {
                super(lightscreentimeMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            lightscreentimeMessage lightscreentimemessage = new lightscreentimeMessage();
            DEFAULT_INSTANCE = lightscreentimemessage;
            GeneratedMessageLite.registerDefaultInstance(lightscreentimeMessage.class, lightscreentimemessage);
        }

        private lightscreentimeMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndtime() {
            this.bitField0_ &= -3;
            this.endtime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStarttime() {
            this.bitField0_ &= -2;
            this.starttime_ = 0;
        }

        public static lightscreentimeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static lightscreentimeMessage parseDelimitedFrom(InputStream inputStream) {
            return (lightscreentimeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static lightscreentimeMessage parseFrom(ByteBuffer byteBuffer) {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<lightscreentimeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndtime(int i) {
            this.bitField0_ |= 2;
            this.endtime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStarttime(int i) {
            this.bitField0_ |= 1;
            this.starttime_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new lightscreentimeMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔋ\u0000\u0002ᔋ\u0001", new Object[]{"bitField0_", "starttime_", "endtime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<lightscreentimeMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (lightscreentimeMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.lightscreentimeMessageOrBuilder
        public int getEndtime() {
            return this.endtime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.lightscreentimeMessageOrBuilder
        public int getStarttime() {
            return this.starttime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.lightscreentimeMessageOrBuilder
        public boolean hasEndtime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.lightscreentimeMessageOrBuilder
        public boolean hasStarttime() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(lightscreentimeMessage lightscreentimemessage) {
            return DEFAULT_INSTANCE.createBuilder(lightscreentimemessage);
        }

        public static lightscreentimeMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (lightscreentimeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static lightscreentimeMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static lightscreentimeMessage parseFrom(ByteString byteString) {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static lightscreentimeMessage parseFrom(ByteString byteString, t tVar) {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static lightscreentimeMessage parseFrom(byte[] bArr) {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static lightscreentimeMessage parseFrom(byte[] bArr, t tVar) {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static lightscreentimeMessage parseFrom(InputStream inputStream) {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static lightscreentimeMessage parseFrom(InputStream inputStream, t tVar) {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static lightscreentimeMessage parseFrom(j jVar) {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static lightscreentimeMessage parseFrom(j jVar, t tVar) {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface lightscreentimeMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getEndtime();

        int getStarttime();

        boolean hasEndtime();

        boolean hasStarttime();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class wifiuseMessage extends GeneratedMessageLite<wifiuseMessage, Builder> implements wifiuseMessageOrBuilder {
        private static final wifiuseMessage DEFAULT_INSTANCE;
        public static final int ENDTIME_FIELD_NUMBER = 2;
        private static volatile vkh<wifiuseMessage> PARSER = null;
        public static final int STARTTIME_FIELD_NUMBER = 1;
        private int bitField0_;
        private int endtime_;
        private byte memoizedIsInitialized = 2;
        private int starttime_;

        public static final class Builder extends GeneratedMessageLite.a<wifiuseMessage, Builder> implements wifiuseMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearEndtime() {
                copyOnWrite();
                ((wifiuseMessage) this.instance).clearEndtime();
                return this;
            }

            public Builder clearStarttime() {
                copyOnWrite();
                ((wifiuseMessage) this.instance).clearStarttime();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.wifiuseMessageOrBuilder
            public int getEndtime() {
                return ((wifiuseMessage) this.instance).getEndtime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.wifiuseMessageOrBuilder
            public int getStarttime() {
                return ((wifiuseMessage) this.instance).getStarttime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.wifiuseMessageOrBuilder
            public boolean hasEndtime() {
                return ((wifiuseMessage) this.instance).hasEndtime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.wifiuseMessageOrBuilder
            public boolean hasStarttime() {
                return ((wifiuseMessage) this.instance).hasStarttime();
            }

            public Builder setEndtime(int i) {
                copyOnWrite();
                ((wifiuseMessage) this.instance).setEndtime(i);
                return this;
            }

            public Builder setStarttime(int i) {
                copyOnWrite();
                ((wifiuseMessage) this.instance).setStarttime(i);
                return this;
            }

            private Builder() {
                super(wifiuseMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            wifiuseMessage wifiusemessage = new wifiuseMessage();
            DEFAULT_INSTANCE = wifiusemessage;
            GeneratedMessageLite.registerDefaultInstance(wifiuseMessage.class, wifiusemessage);
        }

        private wifiuseMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndtime() {
            this.bitField0_ &= -3;
            this.endtime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStarttime() {
            this.bitField0_ &= -2;
            this.starttime_ = 0;
        }

        public static wifiuseMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static wifiuseMessage parseDelimitedFrom(InputStream inputStream) {
            return (wifiuseMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static wifiuseMessage parseFrom(ByteBuffer byteBuffer) {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<wifiuseMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndtime(int i) {
            this.bitField0_ |= 2;
            this.endtime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStarttime(int i) {
            this.bitField0_ |= 1;
            this.starttime_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new wifiuseMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔋ\u0000\u0002ᔋ\u0001", new Object[]{"bitField0_", "starttime_", "endtime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<wifiuseMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (wifiuseMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.wifiuseMessageOrBuilder
        public int getEndtime() {
            return this.endtime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.wifiuseMessageOrBuilder
        public int getStarttime() {
            return this.starttime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.wifiuseMessageOrBuilder
        public boolean hasEndtime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.wifiuseMessageOrBuilder
        public boolean hasStarttime() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(wifiuseMessage wifiusemessage) {
            return DEFAULT_INSTANCE.createBuilder(wifiusemessage);
        }

        public static wifiuseMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (wifiuseMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static wifiuseMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static wifiuseMessage parseFrom(ByteString byteString) {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static wifiuseMessage parseFrom(ByteString byteString, t tVar) {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static wifiuseMessage parseFrom(byte[] bArr) {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static wifiuseMessage parseFrom(byte[] bArr, t tVar) {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static wifiuseMessage parseFrom(InputStream inputStream) {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static wifiuseMessage parseFrom(InputStream inputStream, t tVar) {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static wifiuseMessage parseFrom(j jVar) {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static wifiuseMessage parseFrom(j jVar, t tVar) {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface wifiuseMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getEndtime();

        int getStarttime();

        boolean hasEndtime();

        boolean hasStarttime();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private Event() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}

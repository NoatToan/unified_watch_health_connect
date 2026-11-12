package com.huami.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.b;
import com.google.protobuf.d0;
import com.google.protobuf.j;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import defpackage.bsf;
import defpackage.vkh;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Phn {

    /* JADX INFO: renamed from: com.huami.proto.Phn$1, reason: invalid class name */
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

    public static final class PHNExerciseInfoMessage extends GeneratedMessageLite<PHNExerciseInfoMessage, Builder> implements PHNExerciseInfoMessageOrBuilder {
        public static final int DAILY_RECOMMEND_INTENSITY_FIELD_NUMBER = 11;
        private static final PHNExerciseInfoMessage DEFAULT_INSTANCE;
        public static final int DURATION_ZONE1_FIELD_NUMBER = 8;
        public static final int DURATION_ZONE2_FIELD_NUMBER = 9;
        public static final int DURATION_ZONE3_FIELD_NUMBER = 10;
        public static final int FLAG_RECOMMENDED_EXERCISE_FIELD_NUMBER = 1;
        public static final int HR_LOWER_ZONE1_FIELD_NUMBER = 2;
        public static final int HR_LOWER_ZONE2_FIELD_NUMBER = 4;
        public static final int HR_LOWER_ZONE3_FIELD_NUMBER = 6;
        public static final int HR_UPPER_ZONE1_FIELD_NUMBER = 3;
        public static final int HR_UPPER_ZONE2_FIELD_NUMBER = 5;
        public static final int HR_UPPER_ZONE3_FIELD_NUMBER = 7;
        private static volatile vkh<PHNExerciseInfoMessage> PARSER;
        private int bitField0_;
        private int dailyRecommendIntensity_;
        private int durationZone1_;
        private int durationZone2_;
        private int durationZone3_;
        private int flagRecommendedExercise_;
        private int hrLowerZone1_;
        private int hrLowerZone2_;
        private int hrLowerZone3_;
        private int hrUpperZone1_;
        private int hrUpperZone2_;
        private int hrUpperZone3_;

        public static final class Builder extends GeneratedMessageLite.a<PHNExerciseInfoMessage, Builder> implements PHNExerciseInfoMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDailyRecommendIntensity() {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).clearDailyRecommendIntensity();
                return this;
            }

            public Builder clearDurationZone1() {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).clearDurationZone1();
                return this;
            }

            public Builder clearDurationZone2() {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).clearDurationZone2();
                return this;
            }

            public Builder clearDurationZone3() {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).clearDurationZone3();
                return this;
            }

            public Builder clearFlagRecommendedExercise() {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).clearFlagRecommendedExercise();
                return this;
            }

            public Builder clearHrLowerZone1() {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).clearHrLowerZone1();
                return this;
            }

            public Builder clearHrLowerZone2() {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).clearHrLowerZone2();
                return this;
            }

            public Builder clearHrLowerZone3() {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).clearHrLowerZone3();
                return this;
            }

            public Builder clearHrUpperZone1() {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).clearHrUpperZone1();
                return this;
            }

            public Builder clearHrUpperZone2() {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).clearHrUpperZone2();
                return this;
            }

            public Builder clearHrUpperZone3() {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).clearHrUpperZone3();
                return this;
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public int getDailyRecommendIntensity() {
                return ((PHNExerciseInfoMessage) this.instance).getDailyRecommendIntensity();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public int getDurationZone1() {
                return ((PHNExerciseInfoMessage) this.instance).getDurationZone1();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public int getDurationZone2() {
                return ((PHNExerciseInfoMessage) this.instance).getDurationZone2();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public int getDurationZone3() {
                return ((PHNExerciseInfoMessage) this.instance).getDurationZone3();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public int getFlagRecommendedExercise() {
                return ((PHNExerciseInfoMessage) this.instance).getFlagRecommendedExercise();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public int getHrLowerZone1() {
                return ((PHNExerciseInfoMessage) this.instance).getHrLowerZone1();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public int getHrLowerZone2() {
                return ((PHNExerciseInfoMessage) this.instance).getHrLowerZone2();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public int getHrLowerZone3() {
                return ((PHNExerciseInfoMessage) this.instance).getHrLowerZone3();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public int getHrUpperZone1() {
                return ((PHNExerciseInfoMessage) this.instance).getHrUpperZone1();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public int getHrUpperZone2() {
                return ((PHNExerciseInfoMessage) this.instance).getHrUpperZone2();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public int getHrUpperZone3() {
                return ((PHNExerciseInfoMessage) this.instance).getHrUpperZone3();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public boolean hasDailyRecommendIntensity() {
                return ((PHNExerciseInfoMessage) this.instance).hasDailyRecommendIntensity();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public boolean hasDurationZone1() {
                return ((PHNExerciseInfoMessage) this.instance).hasDurationZone1();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public boolean hasDurationZone2() {
                return ((PHNExerciseInfoMessage) this.instance).hasDurationZone2();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public boolean hasDurationZone3() {
                return ((PHNExerciseInfoMessage) this.instance).hasDurationZone3();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public boolean hasFlagRecommendedExercise() {
                return ((PHNExerciseInfoMessage) this.instance).hasFlagRecommendedExercise();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public boolean hasHrLowerZone1() {
                return ((PHNExerciseInfoMessage) this.instance).hasHrLowerZone1();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public boolean hasHrLowerZone2() {
                return ((PHNExerciseInfoMessage) this.instance).hasHrLowerZone2();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public boolean hasHrLowerZone3() {
                return ((PHNExerciseInfoMessage) this.instance).hasHrLowerZone3();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public boolean hasHrUpperZone1() {
                return ((PHNExerciseInfoMessage) this.instance).hasHrUpperZone1();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public boolean hasHrUpperZone2() {
                return ((PHNExerciseInfoMessage) this.instance).hasHrUpperZone2();
            }

            @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
            public boolean hasHrUpperZone3() {
                return ((PHNExerciseInfoMessage) this.instance).hasHrUpperZone3();
            }

            public Builder setDailyRecommendIntensity(int i) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setDailyRecommendIntensity(i);
                return this;
            }

            public Builder setDurationZone1(int i) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setDurationZone1(i);
                return this;
            }

            public Builder setDurationZone2(int i) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setDurationZone2(i);
                return this;
            }

            public Builder setDurationZone3(int i) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setDurationZone3(i);
                return this;
            }

            public Builder setFlagRecommendedExercise(int i) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setFlagRecommendedExercise(i);
                return this;
            }

            public Builder setHrLowerZone1(int i) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setHrLowerZone1(i);
                return this;
            }

            public Builder setHrLowerZone2(int i) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setHrLowerZone2(i);
                return this;
            }

            public Builder setHrLowerZone3(int i) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setHrLowerZone3(i);
                return this;
            }

            public Builder setHrUpperZone1(int i) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setHrUpperZone1(i);
                return this;
            }

            public Builder setHrUpperZone2(int i) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setHrUpperZone2(i);
                return this;
            }

            public Builder setHrUpperZone3(int i) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setHrUpperZone3(i);
                return this;
            }

            private Builder() {
                super(PHNExerciseInfoMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            PHNExerciseInfoMessage pHNExerciseInfoMessage = new PHNExerciseInfoMessage();
            DEFAULT_INSTANCE = pHNExerciseInfoMessage;
            GeneratedMessageLite.registerDefaultInstance(PHNExerciseInfoMessage.class, pHNExerciseInfoMessage);
        }

        private PHNExerciseInfoMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDailyRecommendIntensity() {
            this.bitField0_ &= -1025;
            this.dailyRecommendIntensity_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDurationZone1() {
            this.bitField0_ &= -129;
            this.durationZone1_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDurationZone2() {
            this.bitField0_ &= -257;
            this.durationZone2_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDurationZone3() {
            this.bitField0_ &= -513;
            this.durationZone3_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlagRecommendedExercise() {
            this.bitField0_ &= -2;
            this.flagRecommendedExercise_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHrLowerZone1() {
            this.bitField0_ &= -3;
            this.hrLowerZone1_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHrLowerZone2() {
            this.bitField0_ &= -9;
            this.hrLowerZone2_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHrLowerZone3() {
            this.bitField0_ &= -33;
            this.hrLowerZone3_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHrUpperZone1() {
            this.bitField0_ &= -5;
            this.hrUpperZone1_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHrUpperZone2() {
            this.bitField0_ &= -17;
            this.hrUpperZone2_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHrUpperZone3() {
            this.bitField0_ &= -65;
            this.hrUpperZone3_ = 0;
        }

        public static PHNExerciseInfoMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PHNExerciseInfoMessage parseDelimitedFrom(InputStream inputStream) {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PHNExerciseInfoMessage parseFrom(ByteBuffer byteBuffer) {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<PHNExerciseInfoMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDailyRecommendIntensity(int i) {
            this.bitField0_ |= 1024;
            this.dailyRecommendIntensity_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDurationZone1(int i) {
            this.bitField0_ |= 128;
            this.durationZone1_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDurationZone2(int i) {
            this.bitField0_ |= 256;
            this.durationZone2_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDurationZone3(int i) {
            this.bitField0_ |= 512;
            this.durationZone3_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagRecommendedExercise(int i) {
            this.bitField0_ |= 1;
            this.flagRecommendedExercise_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrLowerZone1(int i) {
            this.bitField0_ |= 2;
            this.hrLowerZone1_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrLowerZone2(int i) {
            this.bitField0_ |= 8;
            this.hrLowerZone2_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrLowerZone3(int i) {
            this.bitField0_ |= 32;
            this.hrLowerZone3_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrUpperZone1(int i) {
            this.bitField0_ |= 4;
            this.hrUpperZone1_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrUpperZone2(int i) {
            this.bitField0_ |= 16;
            this.hrUpperZone2_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrUpperZone3(int i) {
            this.bitField0_ |= 64;
            this.hrUpperZone3_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new PHNExerciseInfoMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t\u000bဋ\n", new Object[]{"bitField0_", "flagRecommendedExercise_", "hrLowerZone1_", "hrUpperZone1_", "hrLowerZone2_", "hrUpperZone2_", "hrLowerZone3_", "hrUpperZone3_", "durationZone1_", "durationZone2_", "durationZone3_", "dailyRecommendIntensity_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<PHNExerciseInfoMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (PHNExerciseInfoMessage.class) {
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

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public int getDailyRecommendIntensity() {
            return this.dailyRecommendIntensity_;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public int getDurationZone1() {
            return this.durationZone1_;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public int getDurationZone2() {
            return this.durationZone2_;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public int getDurationZone3() {
            return this.durationZone3_;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public int getFlagRecommendedExercise() {
            return this.flagRecommendedExercise_;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public int getHrLowerZone1() {
            return this.hrLowerZone1_;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public int getHrLowerZone2() {
            return this.hrLowerZone2_;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public int getHrLowerZone3() {
            return this.hrLowerZone3_;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public int getHrUpperZone1() {
            return this.hrUpperZone1_;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public int getHrUpperZone2() {
            return this.hrUpperZone2_;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public int getHrUpperZone3() {
            return this.hrUpperZone3_;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public boolean hasDailyRecommendIntensity() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public boolean hasDurationZone1() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public boolean hasDurationZone2() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public boolean hasDurationZone3() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public boolean hasFlagRecommendedExercise() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public boolean hasHrLowerZone1() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public boolean hasHrLowerZone2() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public boolean hasHrLowerZone3() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public boolean hasHrUpperZone1() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public boolean hasHrUpperZone2() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.huami.proto.Phn.PHNExerciseInfoMessageOrBuilder
        public boolean hasHrUpperZone3() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(PHNExerciseInfoMessage pHNExerciseInfoMessage) {
            return DEFAULT_INSTANCE.createBuilder(pHNExerciseInfoMessage);
        }

        public static PHNExerciseInfoMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static PHNExerciseInfoMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static PHNExerciseInfoMessage parseFrom(ByteString byteString) {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PHNExerciseInfoMessage parseFrom(ByteString byteString, t tVar) {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static PHNExerciseInfoMessage parseFrom(byte[] bArr) {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PHNExerciseInfoMessage parseFrom(byte[] bArr, t tVar) {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static PHNExerciseInfoMessage parseFrom(InputStream inputStream) {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PHNExerciseInfoMessage parseFrom(InputStream inputStream, t tVar) {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static PHNExerciseInfoMessage parseFrom(j jVar) {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PHNExerciseInfoMessage parseFrom(j jVar, t tVar) {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface PHNExerciseInfoMessageOrBuilder extends bsf {
        int getDailyRecommendIntensity();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDurationZone1();

        int getDurationZone2();

        int getDurationZone3();

        int getFlagRecommendedExercise();

        int getHrLowerZone1();

        int getHrLowerZone2();

        int getHrLowerZone3();

        int getHrUpperZone1();

        int getHrUpperZone2();

        int getHrUpperZone3();

        boolean hasDailyRecommendIntensity();

        boolean hasDurationZone1();

        boolean hasDurationZone2();

        boolean hasDurationZone3();

        boolean hasFlagRecommendedExercise();

        boolean hasHrLowerZone1();

        boolean hasHrLowerZone2();

        boolean hasHrLowerZone3();

        boolean hasHrUpperZone1();

        boolean hasHrUpperZone2();

        boolean hasHrUpperZone3();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class PHNFlagsMessage extends GeneratedMessageLite<PHNFlagsMessage, Builder> implements PHNFlagsMessageOrBuilder {
        private static final PHNFlagsMessage DEFAULT_INSTANCE;
        public static final int FLAG_COMPARE_LAST_WEEK_RECOMMEND_FIELD_NUMBER = 2;
        public static final int FLAG_CURRENT_EXERCISE_STANDARD_FIELD_NUMBER = 10;
        public static final int FLAG_DAILY_RECOMMEND_EXCESS_FIELD_NUMBER = 7;
        public static final int FLAG_EXERCISE_BEFORE_GO_TO_BED_FIELD_NUMBER = 6;
        public static final int FLAG_EXERCISE_ON_REST_DAYS_FIELD_NUMBER = 4;
        public static final int FLAG_EXERCISE_WAKE_UP_FIELD_NUMBER = 8;
        public static final int FLAG_LAST_WEEK_TRIMP_COMPLETED_FIELD_NUMBER = 1;
        public static final int FLAG_LAST_WEEK_TSB_FIELD_NUMBER = 3;
        public static final int FLAG_SLEEP_STATE_LAST_NIGHT_FIELD_NUMBER = 5;
        public static final int FLAG_WARM_UP_ALERT_FIELD_NUMBER = 9;
        private static volatile vkh<PHNFlagsMessage> PARSER;
        private int bitField0_;
        private int flagCompareLastWeekRecommend_;
        private int flagCurrentExerciseStandard_;
        private int flagDailyRecommendExcess_;
        private int flagExerciseBeforeGoToBed_;
        private int flagExerciseOnRestDays_;
        private int flagExerciseWakeUp_;
        private int flagLastWeekTSB_;
        private int flagLastWeekTrimpCompleted_;
        private int flagSleepStateLastNight_;
        private int flagWarmUpAlert_;

        public static final class Builder extends GeneratedMessageLite.a<PHNFlagsMessage, Builder> implements PHNFlagsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearFlagCompareLastWeekRecommend() {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).clearFlagCompareLastWeekRecommend();
                return this;
            }

            public Builder clearFlagCurrentExerciseStandard() {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).clearFlagCurrentExerciseStandard();
                return this;
            }

            public Builder clearFlagDailyRecommendExcess() {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).clearFlagDailyRecommendExcess();
                return this;
            }

            public Builder clearFlagExerciseBeforeGoToBed() {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).clearFlagExerciseBeforeGoToBed();
                return this;
            }

            public Builder clearFlagExerciseOnRestDays() {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).clearFlagExerciseOnRestDays();
                return this;
            }

            public Builder clearFlagExerciseWakeUp() {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).clearFlagExerciseWakeUp();
                return this;
            }

            public Builder clearFlagLastWeekTSB() {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).clearFlagLastWeekTSB();
                return this;
            }

            public Builder clearFlagLastWeekTrimpCompleted() {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).clearFlagLastWeekTrimpCompleted();
                return this;
            }

            public Builder clearFlagSleepStateLastNight() {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).clearFlagSleepStateLastNight();
                return this;
            }

            public Builder clearFlagWarmUpAlert() {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).clearFlagWarmUpAlert();
                return this;
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public int getFlagCompareLastWeekRecommend() {
                return ((PHNFlagsMessage) this.instance).getFlagCompareLastWeekRecommend();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public int getFlagCurrentExerciseStandard() {
                return ((PHNFlagsMessage) this.instance).getFlagCurrentExerciseStandard();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public int getFlagDailyRecommendExcess() {
                return ((PHNFlagsMessage) this.instance).getFlagDailyRecommendExcess();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public int getFlagExerciseBeforeGoToBed() {
                return ((PHNFlagsMessage) this.instance).getFlagExerciseBeforeGoToBed();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public int getFlagExerciseOnRestDays() {
                return ((PHNFlagsMessage) this.instance).getFlagExerciseOnRestDays();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public int getFlagExerciseWakeUp() {
                return ((PHNFlagsMessage) this.instance).getFlagExerciseWakeUp();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public int getFlagLastWeekTSB() {
                return ((PHNFlagsMessage) this.instance).getFlagLastWeekTSB();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public int getFlagLastWeekTrimpCompleted() {
                return ((PHNFlagsMessage) this.instance).getFlagLastWeekTrimpCompleted();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public int getFlagSleepStateLastNight() {
                return ((PHNFlagsMessage) this.instance).getFlagSleepStateLastNight();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public int getFlagWarmUpAlert() {
                return ((PHNFlagsMessage) this.instance).getFlagWarmUpAlert();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public boolean hasFlagCompareLastWeekRecommend() {
                return ((PHNFlagsMessage) this.instance).hasFlagCompareLastWeekRecommend();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public boolean hasFlagCurrentExerciseStandard() {
                return ((PHNFlagsMessage) this.instance).hasFlagCurrentExerciseStandard();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public boolean hasFlagDailyRecommendExcess() {
                return ((PHNFlagsMessage) this.instance).hasFlagDailyRecommendExcess();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public boolean hasFlagExerciseBeforeGoToBed() {
                return ((PHNFlagsMessage) this.instance).hasFlagExerciseBeforeGoToBed();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public boolean hasFlagExerciseOnRestDays() {
                return ((PHNFlagsMessage) this.instance).hasFlagExerciseOnRestDays();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public boolean hasFlagExerciseWakeUp() {
                return ((PHNFlagsMessage) this.instance).hasFlagExerciseWakeUp();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public boolean hasFlagLastWeekTSB() {
                return ((PHNFlagsMessage) this.instance).hasFlagLastWeekTSB();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public boolean hasFlagLastWeekTrimpCompleted() {
                return ((PHNFlagsMessage) this.instance).hasFlagLastWeekTrimpCompleted();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public boolean hasFlagSleepStateLastNight() {
                return ((PHNFlagsMessage) this.instance).hasFlagSleepStateLastNight();
            }

            @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
            public boolean hasFlagWarmUpAlert() {
                return ((PHNFlagsMessage) this.instance).hasFlagWarmUpAlert();
            }

            public Builder setFlagCompareLastWeekRecommend(int i) {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).setFlagCompareLastWeekRecommend(i);
                return this;
            }

            public Builder setFlagCurrentExerciseStandard(int i) {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).setFlagCurrentExerciseStandard(i);
                return this;
            }

            public Builder setFlagDailyRecommendExcess(int i) {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).setFlagDailyRecommendExcess(i);
                return this;
            }

            public Builder setFlagExerciseBeforeGoToBed(int i) {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).setFlagExerciseBeforeGoToBed(i);
                return this;
            }

            public Builder setFlagExerciseOnRestDays(int i) {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).setFlagExerciseOnRestDays(i);
                return this;
            }

            public Builder setFlagExerciseWakeUp(int i) {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).setFlagExerciseWakeUp(i);
                return this;
            }

            public Builder setFlagLastWeekTSB(int i) {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).setFlagLastWeekTSB(i);
                return this;
            }

            public Builder setFlagLastWeekTrimpCompleted(int i) {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).setFlagLastWeekTrimpCompleted(i);
                return this;
            }

            public Builder setFlagSleepStateLastNight(int i) {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).setFlagSleepStateLastNight(i);
                return this;
            }

            public Builder setFlagWarmUpAlert(int i) {
                copyOnWrite();
                ((PHNFlagsMessage) this.instance).setFlagWarmUpAlert(i);
                return this;
            }

            private Builder() {
                super(PHNFlagsMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            PHNFlagsMessage pHNFlagsMessage = new PHNFlagsMessage();
            DEFAULT_INSTANCE = pHNFlagsMessage;
            GeneratedMessageLite.registerDefaultInstance(PHNFlagsMessage.class, pHNFlagsMessage);
        }

        private PHNFlagsMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlagCompareLastWeekRecommend() {
            this.bitField0_ &= -3;
            this.flagCompareLastWeekRecommend_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlagCurrentExerciseStandard() {
            this.bitField0_ &= -513;
            this.flagCurrentExerciseStandard_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlagDailyRecommendExcess() {
            this.bitField0_ &= -65;
            this.flagDailyRecommendExcess_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlagExerciseBeforeGoToBed() {
            this.bitField0_ &= -33;
            this.flagExerciseBeforeGoToBed_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlagExerciseOnRestDays() {
            this.bitField0_ &= -9;
            this.flagExerciseOnRestDays_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlagExerciseWakeUp() {
            this.bitField0_ &= -129;
            this.flagExerciseWakeUp_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlagLastWeekTSB() {
            this.bitField0_ &= -5;
            this.flagLastWeekTSB_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlagLastWeekTrimpCompleted() {
            this.bitField0_ &= -2;
            this.flagLastWeekTrimpCompleted_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlagSleepStateLastNight() {
            this.bitField0_ &= -17;
            this.flagSleepStateLastNight_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlagWarmUpAlert() {
            this.bitField0_ &= -257;
            this.flagWarmUpAlert_ = 0;
        }

        public static PHNFlagsMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PHNFlagsMessage parseDelimitedFrom(InputStream inputStream) {
            return (PHNFlagsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PHNFlagsMessage parseFrom(ByteBuffer byteBuffer) {
            return (PHNFlagsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<PHNFlagsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagCompareLastWeekRecommend(int i) {
            this.bitField0_ |= 2;
            this.flagCompareLastWeekRecommend_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagCurrentExerciseStandard(int i) {
            this.bitField0_ |= 512;
            this.flagCurrentExerciseStandard_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagDailyRecommendExcess(int i) {
            this.bitField0_ |= 64;
            this.flagDailyRecommendExcess_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagExerciseBeforeGoToBed(int i) {
            this.bitField0_ |= 32;
            this.flagExerciseBeforeGoToBed_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagExerciseOnRestDays(int i) {
            this.bitField0_ |= 8;
            this.flagExerciseOnRestDays_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagExerciseWakeUp(int i) {
            this.bitField0_ |= 128;
            this.flagExerciseWakeUp_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagLastWeekTSB(int i) {
            this.bitField0_ |= 4;
            this.flagLastWeekTSB_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagLastWeekTrimpCompleted(int i) {
            this.bitField0_ |= 1;
            this.flagLastWeekTrimpCompleted_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagSleepStateLastNight(int i) {
            this.bitField0_ |= 16;
            this.flagSleepStateLastNight_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagWarmUpAlert(int i) {
            this.bitField0_ |= 256;
            this.flagWarmUpAlert_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new PHNFlagsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t", new Object[]{"bitField0_", "flagLastWeekTrimpCompleted_", "flagCompareLastWeekRecommend_", "flagLastWeekTSB_", "flagExerciseOnRestDays_", "flagSleepStateLastNight_", "flagExerciseBeforeGoToBed_", "flagDailyRecommendExcess_", "flagExerciseWakeUp_", "flagWarmUpAlert_", "flagCurrentExerciseStandard_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<PHNFlagsMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (PHNFlagsMessage.class) {
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

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public int getFlagCompareLastWeekRecommend() {
            return this.flagCompareLastWeekRecommend_;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public int getFlagCurrentExerciseStandard() {
            return this.flagCurrentExerciseStandard_;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public int getFlagDailyRecommendExcess() {
            return this.flagDailyRecommendExcess_;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public int getFlagExerciseBeforeGoToBed() {
            return this.flagExerciseBeforeGoToBed_;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public int getFlagExerciseOnRestDays() {
            return this.flagExerciseOnRestDays_;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public int getFlagExerciseWakeUp() {
            return this.flagExerciseWakeUp_;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public int getFlagLastWeekTSB() {
            return this.flagLastWeekTSB_;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public int getFlagLastWeekTrimpCompleted() {
            return this.flagLastWeekTrimpCompleted_;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public int getFlagSleepStateLastNight() {
            return this.flagSleepStateLastNight_;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public int getFlagWarmUpAlert() {
            return this.flagWarmUpAlert_;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public boolean hasFlagCompareLastWeekRecommend() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public boolean hasFlagCurrentExerciseStandard() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public boolean hasFlagDailyRecommendExcess() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public boolean hasFlagExerciseBeforeGoToBed() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public boolean hasFlagExerciseOnRestDays() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public boolean hasFlagExerciseWakeUp() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public boolean hasFlagLastWeekTSB() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public boolean hasFlagLastWeekTrimpCompleted() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public boolean hasFlagSleepStateLastNight() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.huami.proto.Phn.PHNFlagsMessageOrBuilder
        public boolean hasFlagWarmUpAlert() {
            return (this.bitField0_ & 256) != 0;
        }

        public static Builder newBuilder(PHNFlagsMessage pHNFlagsMessage) {
            return DEFAULT_INSTANCE.createBuilder(pHNFlagsMessage);
        }

        public static PHNFlagsMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (PHNFlagsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static PHNFlagsMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (PHNFlagsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static PHNFlagsMessage parseFrom(ByteString byteString) {
            return (PHNFlagsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PHNFlagsMessage parseFrom(ByteString byteString, t tVar) {
            return (PHNFlagsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static PHNFlagsMessage parseFrom(byte[] bArr) {
            return (PHNFlagsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PHNFlagsMessage parseFrom(byte[] bArr, t tVar) {
            return (PHNFlagsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static PHNFlagsMessage parseFrom(InputStream inputStream) {
            return (PHNFlagsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PHNFlagsMessage parseFrom(InputStream inputStream, t tVar) {
            return (PHNFlagsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static PHNFlagsMessage parseFrom(j jVar) {
            return (PHNFlagsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PHNFlagsMessage parseFrom(j jVar, t tVar) {
            return (PHNFlagsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface PHNFlagsMessageOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getFlagCompareLastWeekRecommend();

        int getFlagCurrentExerciseStandard();

        int getFlagDailyRecommendExcess();

        int getFlagExerciseBeforeGoToBed();

        int getFlagExerciseOnRestDays();

        int getFlagExerciseWakeUp();

        int getFlagLastWeekTSB();

        int getFlagLastWeekTrimpCompleted();

        int getFlagSleepStateLastNight();

        int getFlagWarmUpAlert();

        boolean hasFlagCompareLastWeekRecommend();

        boolean hasFlagCurrentExerciseStandard();

        boolean hasFlagDailyRecommendExcess();

        boolean hasFlagExerciseBeforeGoToBed();

        boolean hasFlagExerciseOnRestDays();

        boolean hasFlagExerciseWakeUp();

        boolean hasFlagLastWeekTSB();

        boolean hasFlagLastWeekTrimpCompleted();

        boolean hasFlagSleepStateLastNight();

        boolean hasFlagWarmUpAlert();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class PHNResultMessage extends GeneratedMessageLite<PHNResultMessage, Builder> implements PHNResultMessageOrBuilder {
        public static final int ATL_42_DAYS_FIELD_NUMBER = 5;
        public static final int COMPARE_LAST_WEEK_RECOMMEND_PERCENT_FIELD_NUMBER = 46;
        public static final int COUNTER_TRAINING_CYCLE_FIELD_NUMBER = 33;
        public static final int COUNT_DAILY_EXERCISE_FIELD_NUMBER = 16;
        public static final int CTL_42_DAYS_FIELD_NUMBER = 6;
        public static final int CURRENT_WEEKDAY_FIELD_NUMBER = 8;
        public static final int DAILY_ACTIVE_TRIMP_FIELD_NUMBER = 43;
        public static final int DAILY_EXERCISE_MINS_FIELD_NUMBER = 45;
        public static final int DAILY_EXERCISE_TRIMP_FIELD_NUMBER = 44;
        public static final int DAILY_HIGH_INTENSITY_MINS_FIELD_NUMBER = 42;
        public static final int DAILY_TRIMP_SCORES_FIELD_NUMBER = 2;
        public static final int DAYS_OF_PHN_PLAN_FIELD_NUMBER = 30;
        private static final PHNResultMessage DEFAULT_INSTANCE;
        public static final int EXERCISE_DAY_FIELD_NUMBER = 28;
        public static final int EXERCISE_RECOMMENDED_INFO_FIELD_NUMBER = 23;
        public static final int FLAG_HISTORICAL_TRIMP_FIELD_NUMBER = 12;
        public static final int FLAG_SET_HIGH_INTENSITY_DAY_FIELD_NUMBER = 29;
        public static final int FLAG_TSB_BELOW_20_EVER_FIELD_NUMBER = 11;
        public static final int FLAG_TSB_BELOW_20_IN_10_DAYS_FIELD_NUMBER = 10;
        public static final int FLAG_TSB_BELOW_20_IN_A_WEEK_FIELD_NUMBER = 9;
        public static final int LAST_UPDATE_TIME_FIELD_NUMBER = 24;
        public static final int LAST_UPDATE_TIME_ZONE_FIELD_NUMBER = 25;
        public static final int LAST_WEEK_TRIMP_COMPLETED_FIELD_NUMBER = 36;
        public static final int LAST_WEEK_TRIMP_COMPLETED_PERCENT_FIELD_NUMBER = 37;
        public static final int LAST_WEEK_TRIMP_RECOMMEND_FIELD_NUMBER = 35;
        public static final int MINUTES_OVER_20M_FIELD_NUMBER = 3;
        private static volatile vkh<PHNResultMessage> PARSER = null;
        public static final int PERCENT_COMPLETED_DAILY_TRIMP_FIELD_NUMBER = 22;
        public static final int PERCENT_COMPLETED_WEEK_TRIMP_FIELD_NUMBER = 21;
        public static final int PHN_FLAGS_FIELD_NUMBER = 48;
        public static final int PLAN_START_UTC0_TIME_FIELD_NUMBER = 27;
        public static final int RAMP_RATE_FIELD_NUMBER = 34;
        public static final int SET_REDUCE_INTENSITY_FIELD_NUMBER = 32;
        public static final int THELAST_HISTORICAL_TRIMP_CTL_FIELD_NUMBER = 13;
        public static final int THELAST_TRIMP_CTL_A_WEEK_BEFORE_LAST_WEEK_FIELD_NUMBER = 15;
        public static final int THELAST_TRIMP_CTL_LAST_WEEK_FIELD_NUMBER = 14;
        public static final int THIS_WEEK_ACHIEVED_DAILY_COMPLETED_PERCENT_FIELD_NUMBER = 41;
        public static final int THIS_WEEK_ACHIEVED_INTENSITY_FIELD_NUMBER = 38;
        public static final int THIS_WEEK_ACHIEVED_WEEKLY_COMPLETED_PERCENT_FIELD_NUMBER = 40;
        public static final int TRIMP_42_DAYS_FIELD_NUMBER = 4;
        public static final int TRIMP_DAILY_MAX_FIELD_NUMBER = 18;
        public static final int TRIMP_DAILY_RECOMMENDED_FIELD_NUMBER = 19;
        public static final int TRIMP_WEEKLY_RECOMMEND_FIELD_NUMBER = 17;
        public static final int TRIMP_WEEK_COMPLETED_FIELD_NUMBER = 20;
        public static final int TSB_42_DAYS_FIELD_NUMBER = 7;
        public static final int VERSION_FIELD_NUMBER = 1;
        public static final int WEEKLY_HIGH_INTENSITY_DAY_FIELD_NUMBER = 39;
        public static final int WEEKLY_SET_EXERCISE_DAYS_FIELD_NUMBER = 31;
        public static final int YESTERDAY_RECOMMEND_FLAG_FIELD_NUMBER = 47;
        private int bitField0_;
        private int bitField1_;
        private int compareLastWeekRecommendPercent_;
        private int countDailyExercise_;
        private int counterTrainingCycle_;
        private int currentWeekday_;
        private int dailyActiveTrimp_;
        private int dailyExerciseMins_;
        private int dailyExerciseTrimp_;
        private int dailyHighIntensityMins_;
        private int dailyTrimpScores_;
        private int daysOfPhnPlan_;
        private int exerciseDay_;
        private PHNExerciseInfoMessage exerciseRecommendedInfo_;
        private int flagHistoricalTrimp_;
        private int flagSetHighIntensityDay_;
        private int flagTsbBelow20Ever_;
        private int flagTsbBelow20In10Days_;
        private int flagTsbBelow20InAWeek_;
        private int lastUpdateTimeZone_;
        private int lastUpdateTime_;
        private int lastWeekTrimpCompletedPercent_;
        private float lastWeekTrimpCompleted_;
        private float lastWeekTrimpRecommend_;
        private int minutesOver20M_;
        private int percentCompletedDailyTrimp_;
        private int percentCompletedWeekTrimp_;
        private PHNFlagsMessage phnFlags_;
        private int planStartUtc0Time_;
        private float rampRate_;
        private int setReduceIntensity_;
        private float thelastHistoricalTrimpCtl_;
        private float thelastTrimpCtlAWeekBeforeLastWeek_;
        private float thelastTrimpCtlLastWeek_;
        private float trimpDailyMax_;
        private float trimpDailyRecommended_;
        private float trimpWeekCompleted_;
        private float trimpWeeklyRecommend_;
        private int weeklySetExerciseDays_;
        private int yesterdayRecommendFlag_;
        private byte memoizedIsInitialized = 2;
        private String version_ = "";
        private d0.g trimp42Days_ = GeneratedMessageLite.emptyIntList();
        private d0.f atl42Days_ = GeneratedMessageLite.emptyFloatList();
        private d0.f ctl42Days_ = GeneratedMessageLite.emptyFloatList();
        private d0.f tsb42Days_ = GeneratedMessageLite.emptyFloatList();
        private d0.g thisWeekAchievedIntensity_ = GeneratedMessageLite.emptyIntList();
        private d0.g weeklyHighIntensityDay_ = GeneratedMessageLite.emptyIntList();
        private d0.g thisWeekAchievedWeeklyCompletedPercent_ = GeneratedMessageLite.emptyIntList();
        private d0.g thisWeekAchievedDailyCompletedPercent_ = GeneratedMessageLite.emptyIntList();

        public static final class Builder extends GeneratedMessageLite.a<PHNResultMessage, Builder> implements PHNResultMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllAtl42Days(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addAllAtl42Days(iterable);
                return this;
            }

            public Builder addAllCtl42Days(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addAllCtl42Days(iterable);
                return this;
            }

            public Builder addAllThisWeekAchievedDailyCompletedPercent(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addAllThisWeekAchievedDailyCompletedPercent(iterable);
                return this;
            }

            public Builder addAllThisWeekAchievedIntensity(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addAllThisWeekAchievedIntensity(iterable);
                return this;
            }

            public Builder addAllThisWeekAchievedWeeklyCompletedPercent(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addAllThisWeekAchievedWeeklyCompletedPercent(iterable);
                return this;
            }

            public Builder addAllTrimp42Days(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addAllTrimp42Days(iterable);
                return this;
            }

            public Builder addAllTsb42Days(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addAllTsb42Days(iterable);
                return this;
            }

            public Builder addAllWeeklyHighIntensityDay(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addAllWeeklyHighIntensityDay(iterable);
                return this;
            }

            public Builder addAtl42Days(float f) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addAtl42Days(f);
                return this;
            }

            public Builder addCtl42Days(float f) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addCtl42Days(f);
                return this;
            }

            public Builder addThisWeekAchievedDailyCompletedPercent(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addThisWeekAchievedDailyCompletedPercent(i);
                return this;
            }

            public Builder addThisWeekAchievedIntensity(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addThisWeekAchievedIntensity(i);
                return this;
            }

            public Builder addThisWeekAchievedWeeklyCompletedPercent(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addThisWeekAchievedWeeklyCompletedPercent(i);
                return this;
            }

            public Builder addTrimp42Days(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addTrimp42Days(i);
                return this;
            }

            public Builder addTsb42Days(float f) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addTsb42Days(f);
                return this;
            }

            public Builder addWeeklyHighIntensityDay(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addWeeklyHighIntensityDay(i);
                return this;
            }

            public Builder clearAtl42Days() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearAtl42Days();
                return this;
            }

            public Builder clearCompareLastWeekRecommendPercent() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearCompareLastWeekRecommendPercent();
                return this;
            }

            public Builder clearCountDailyExercise() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearCountDailyExercise();
                return this;
            }

            public Builder clearCounterTrainingCycle() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearCounterTrainingCycle();
                return this;
            }

            public Builder clearCtl42Days() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearCtl42Days();
                return this;
            }

            public Builder clearCurrentWeekday() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearCurrentWeekday();
                return this;
            }

            public Builder clearDailyActiveTrimp() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearDailyActiveTrimp();
                return this;
            }

            public Builder clearDailyExerciseMins() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearDailyExerciseMins();
                return this;
            }

            public Builder clearDailyExerciseTrimp() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearDailyExerciseTrimp();
                return this;
            }

            public Builder clearDailyHighIntensityMins() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearDailyHighIntensityMins();
                return this;
            }

            public Builder clearDailyTrimpScores() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearDailyTrimpScores();
                return this;
            }

            public Builder clearDaysOfPhnPlan() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearDaysOfPhnPlan();
                return this;
            }

            public Builder clearExerciseDay() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearExerciseDay();
                return this;
            }

            public Builder clearExerciseRecommendedInfo() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearExerciseRecommendedInfo();
                return this;
            }

            public Builder clearFlagHistoricalTrimp() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearFlagHistoricalTrimp();
                return this;
            }

            public Builder clearFlagSetHighIntensityDay() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearFlagSetHighIntensityDay();
                return this;
            }

            public Builder clearFlagTsbBelow20Ever() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearFlagTsbBelow20Ever();
                return this;
            }

            public Builder clearFlagTsbBelow20In10Days() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearFlagTsbBelow20In10Days();
                return this;
            }

            public Builder clearFlagTsbBelow20InAWeek() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearFlagTsbBelow20InAWeek();
                return this;
            }

            public Builder clearLastUpdateTime() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearLastUpdateTime();
                return this;
            }

            public Builder clearLastUpdateTimeZone() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearLastUpdateTimeZone();
                return this;
            }

            public Builder clearLastWeekTrimpCompleted() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearLastWeekTrimpCompleted();
                return this;
            }

            public Builder clearLastWeekTrimpCompletedPercent() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearLastWeekTrimpCompletedPercent();
                return this;
            }

            public Builder clearLastWeekTrimpRecommend() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearLastWeekTrimpRecommend();
                return this;
            }

            public Builder clearMinutesOver20M() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearMinutesOver20M();
                return this;
            }

            public Builder clearPercentCompletedDailyTrimp() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearPercentCompletedDailyTrimp();
                return this;
            }

            public Builder clearPercentCompletedWeekTrimp() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearPercentCompletedWeekTrimp();
                return this;
            }

            public Builder clearPhnFlags() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearPhnFlags();
                return this;
            }

            public Builder clearPlanStartUtc0Time() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearPlanStartUtc0Time();
                return this;
            }

            public Builder clearRampRate() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearRampRate();
                return this;
            }

            public Builder clearSetReduceIntensity() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearSetReduceIntensity();
                return this;
            }

            public Builder clearThelastHistoricalTrimpCtl() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearThelastHistoricalTrimpCtl();
                return this;
            }

            public Builder clearThelastTrimpCtlAWeekBeforeLastWeek() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearThelastTrimpCtlAWeekBeforeLastWeek();
                return this;
            }

            public Builder clearThelastTrimpCtlLastWeek() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearThelastTrimpCtlLastWeek();
                return this;
            }

            public Builder clearThisWeekAchievedDailyCompletedPercent() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearThisWeekAchievedDailyCompletedPercent();
                return this;
            }

            public Builder clearThisWeekAchievedIntensity() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearThisWeekAchievedIntensity();
                return this;
            }

            public Builder clearThisWeekAchievedWeeklyCompletedPercent() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearThisWeekAchievedWeeklyCompletedPercent();
                return this;
            }

            public Builder clearTrimp42Days() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearTrimp42Days();
                return this;
            }

            public Builder clearTrimpDailyMax() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearTrimpDailyMax();
                return this;
            }

            public Builder clearTrimpDailyRecommended() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearTrimpDailyRecommended();
                return this;
            }

            public Builder clearTrimpWeekCompleted() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearTrimpWeekCompleted();
                return this;
            }

            public Builder clearTrimpWeeklyRecommend() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearTrimpWeeklyRecommend();
                return this;
            }

            public Builder clearTsb42Days() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearTsb42Days();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearVersion();
                return this;
            }

            public Builder clearWeeklyHighIntensityDay() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearWeeklyHighIntensityDay();
                return this;
            }

            public Builder clearWeeklySetExerciseDays() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearWeeklySetExerciseDays();
                return this;
            }

            public Builder clearYesterdayRecommendFlag() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearYesterdayRecommendFlag();
                return this;
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public float getAtl42Days(int i) {
                return ((PHNResultMessage) this.instance).getAtl42Days(i);
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getAtl42DaysCount() {
                return ((PHNResultMessage) this.instance).getAtl42DaysCount();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public List<Float> getAtl42DaysList() {
                return Collections.unmodifiableList(((PHNResultMessage) this.instance).getAtl42DaysList());
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getCompareLastWeekRecommendPercent() {
                return ((PHNResultMessage) this.instance).getCompareLastWeekRecommendPercent();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getCountDailyExercise() {
                return ((PHNResultMessage) this.instance).getCountDailyExercise();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getCounterTrainingCycle() {
                return ((PHNResultMessage) this.instance).getCounterTrainingCycle();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public float getCtl42Days(int i) {
                return ((PHNResultMessage) this.instance).getCtl42Days(i);
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getCtl42DaysCount() {
                return ((PHNResultMessage) this.instance).getCtl42DaysCount();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public List<Float> getCtl42DaysList() {
                return Collections.unmodifiableList(((PHNResultMessage) this.instance).getCtl42DaysList());
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getCurrentWeekday() {
                return ((PHNResultMessage) this.instance).getCurrentWeekday();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getDailyActiveTrimp() {
                return ((PHNResultMessage) this.instance).getDailyActiveTrimp();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getDailyExerciseMins() {
                return ((PHNResultMessage) this.instance).getDailyExerciseMins();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getDailyExerciseTrimp() {
                return ((PHNResultMessage) this.instance).getDailyExerciseTrimp();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getDailyHighIntensityMins() {
                return ((PHNResultMessage) this.instance).getDailyHighIntensityMins();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getDailyTrimpScores() {
                return ((PHNResultMessage) this.instance).getDailyTrimpScores();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getDaysOfPhnPlan() {
                return ((PHNResultMessage) this.instance).getDaysOfPhnPlan();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getExerciseDay() {
                return ((PHNResultMessage) this.instance).getExerciseDay();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public PHNExerciseInfoMessage getExerciseRecommendedInfo() {
                return ((PHNResultMessage) this.instance).getExerciseRecommendedInfo();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getFlagHistoricalTrimp() {
                return ((PHNResultMessage) this.instance).getFlagHistoricalTrimp();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getFlagSetHighIntensityDay() {
                return ((PHNResultMessage) this.instance).getFlagSetHighIntensityDay();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getFlagTsbBelow20Ever() {
                return ((PHNResultMessage) this.instance).getFlagTsbBelow20Ever();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getFlagTsbBelow20In10Days() {
                return ((PHNResultMessage) this.instance).getFlagTsbBelow20In10Days();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getFlagTsbBelow20InAWeek() {
                return ((PHNResultMessage) this.instance).getFlagTsbBelow20InAWeek();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getLastUpdateTime() {
                return ((PHNResultMessage) this.instance).getLastUpdateTime();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getLastUpdateTimeZone() {
                return ((PHNResultMessage) this.instance).getLastUpdateTimeZone();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public float getLastWeekTrimpCompleted() {
                return ((PHNResultMessage) this.instance).getLastWeekTrimpCompleted();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getLastWeekTrimpCompletedPercent() {
                return ((PHNResultMessage) this.instance).getLastWeekTrimpCompletedPercent();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public float getLastWeekTrimpRecommend() {
                return ((PHNResultMessage) this.instance).getLastWeekTrimpRecommend();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getMinutesOver20M() {
                return ((PHNResultMessage) this.instance).getMinutesOver20M();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getPercentCompletedDailyTrimp() {
                return ((PHNResultMessage) this.instance).getPercentCompletedDailyTrimp();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getPercentCompletedWeekTrimp() {
                return ((PHNResultMessage) this.instance).getPercentCompletedWeekTrimp();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public PHNFlagsMessage getPhnFlags() {
                return ((PHNResultMessage) this.instance).getPhnFlags();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getPlanStartUtc0Time() {
                return ((PHNResultMessage) this.instance).getPlanStartUtc0Time();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public float getRampRate() {
                return ((PHNResultMessage) this.instance).getRampRate();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getSetReduceIntensity() {
                return ((PHNResultMessage) this.instance).getSetReduceIntensity();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public float getThelastHistoricalTrimpCtl() {
                return ((PHNResultMessage) this.instance).getThelastHistoricalTrimpCtl();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public float getThelastTrimpCtlAWeekBeforeLastWeek() {
                return ((PHNResultMessage) this.instance).getThelastTrimpCtlAWeekBeforeLastWeek();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public float getThelastTrimpCtlLastWeek() {
                return ((PHNResultMessage) this.instance).getThelastTrimpCtlLastWeek();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getThisWeekAchievedDailyCompletedPercent(int i) {
                return ((PHNResultMessage) this.instance).getThisWeekAchievedDailyCompletedPercent(i);
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getThisWeekAchievedDailyCompletedPercentCount() {
                return ((PHNResultMessage) this.instance).getThisWeekAchievedDailyCompletedPercentCount();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public List<Integer> getThisWeekAchievedDailyCompletedPercentList() {
                return Collections.unmodifiableList(((PHNResultMessage) this.instance).getThisWeekAchievedDailyCompletedPercentList());
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getThisWeekAchievedIntensity(int i) {
                return ((PHNResultMessage) this.instance).getThisWeekAchievedIntensity(i);
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getThisWeekAchievedIntensityCount() {
                return ((PHNResultMessage) this.instance).getThisWeekAchievedIntensityCount();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public List<Integer> getThisWeekAchievedIntensityList() {
                return Collections.unmodifiableList(((PHNResultMessage) this.instance).getThisWeekAchievedIntensityList());
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getThisWeekAchievedWeeklyCompletedPercent(int i) {
                return ((PHNResultMessage) this.instance).getThisWeekAchievedWeeklyCompletedPercent(i);
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getThisWeekAchievedWeeklyCompletedPercentCount() {
                return ((PHNResultMessage) this.instance).getThisWeekAchievedWeeklyCompletedPercentCount();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public List<Integer> getThisWeekAchievedWeeklyCompletedPercentList() {
                return Collections.unmodifiableList(((PHNResultMessage) this.instance).getThisWeekAchievedWeeklyCompletedPercentList());
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getTrimp42Days(int i) {
                return ((PHNResultMessage) this.instance).getTrimp42Days(i);
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getTrimp42DaysCount() {
                return ((PHNResultMessage) this.instance).getTrimp42DaysCount();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public List<Integer> getTrimp42DaysList() {
                return Collections.unmodifiableList(((PHNResultMessage) this.instance).getTrimp42DaysList());
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public float getTrimpDailyMax() {
                return ((PHNResultMessage) this.instance).getTrimpDailyMax();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public float getTrimpDailyRecommended() {
                return ((PHNResultMessage) this.instance).getTrimpDailyRecommended();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public float getTrimpWeekCompleted() {
                return ((PHNResultMessage) this.instance).getTrimpWeekCompleted();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public float getTrimpWeeklyRecommend() {
                return ((PHNResultMessage) this.instance).getTrimpWeeklyRecommend();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public float getTsb42Days(int i) {
                return ((PHNResultMessage) this.instance).getTsb42Days(i);
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getTsb42DaysCount() {
                return ((PHNResultMessage) this.instance).getTsb42DaysCount();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public List<Float> getTsb42DaysList() {
                return Collections.unmodifiableList(((PHNResultMessage) this.instance).getTsb42DaysList());
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public String getVersion() {
                return ((PHNResultMessage) this.instance).getVersion();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public ByteString getVersionBytes() {
                return ((PHNResultMessage) this.instance).getVersionBytes();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getWeeklyHighIntensityDay(int i) {
                return ((PHNResultMessage) this.instance).getWeeklyHighIntensityDay(i);
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getWeeklyHighIntensityDayCount() {
                return ((PHNResultMessage) this.instance).getWeeklyHighIntensityDayCount();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public List<Integer> getWeeklyHighIntensityDayList() {
                return Collections.unmodifiableList(((PHNResultMessage) this.instance).getWeeklyHighIntensityDayList());
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getWeeklySetExerciseDays() {
                return ((PHNResultMessage) this.instance).getWeeklySetExerciseDays();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getYesterdayRecommendFlag() {
                return ((PHNResultMessage) this.instance).getYesterdayRecommendFlag();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasCompareLastWeekRecommendPercent() {
                return ((PHNResultMessage) this.instance).hasCompareLastWeekRecommendPercent();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasCountDailyExercise() {
                return ((PHNResultMessage) this.instance).hasCountDailyExercise();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasCounterTrainingCycle() {
                return ((PHNResultMessage) this.instance).hasCounterTrainingCycle();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasCurrentWeekday() {
                return ((PHNResultMessage) this.instance).hasCurrentWeekday();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasDailyActiveTrimp() {
                return ((PHNResultMessage) this.instance).hasDailyActiveTrimp();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasDailyExerciseMins() {
                return ((PHNResultMessage) this.instance).hasDailyExerciseMins();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasDailyExerciseTrimp() {
                return ((PHNResultMessage) this.instance).hasDailyExerciseTrimp();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasDailyHighIntensityMins() {
                return ((PHNResultMessage) this.instance).hasDailyHighIntensityMins();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasDailyTrimpScores() {
                return ((PHNResultMessage) this.instance).hasDailyTrimpScores();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasDaysOfPhnPlan() {
                return ((PHNResultMessage) this.instance).hasDaysOfPhnPlan();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasExerciseDay() {
                return ((PHNResultMessage) this.instance).hasExerciseDay();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasExerciseRecommendedInfo() {
                return ((PHNResultMessage) this.instance).hasExerciseRecommendedInfo();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasFlagHistoricalTrimp() {
                return ((PHNResultMessage) this.instance).hasFlagHistoricalTrimp();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasFlagSetHighIntensityDay() {
                return ((PHNResultMessage) this.instance).hasFlagSetHighIntensityDay();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasFlagTsbBelow20Ever() {
                return ((PHNResultMessage) this.instance).hasFlagTsbBelow20Ever();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasFlagTsbBelow20In10Days() {
                return ((PHNResultMessage) this.instance).hasFlagTsbBelow20In10Days();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasFlagTsbBelow20InAWeek() {
                return ((PHNResultMessage) this.instance).hasFlagTsbBelow20InAWeek();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasLastUpdateTime() {
                return ((PHNResultMessage) this.instance).hasLastUpdateTime();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasLastUpdateTimeZone() {
                return ((PHNResultMessage) this.instance).hasLastUpdateTimeZone();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasLastWeekTrimpCompleted() {
                return ((PHNResultMessage) this.instance).hasLastWeekTrimpCompleted();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasLastWeekTrimpCompletedPercent() {
                return ((PHNResultMessage) this.instance).hasLastWeekTrimpCompletedPercent();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasLastWeekTrimpRecommend() {
                return ((PHNResultMessage) this.instance).hasLastWeekTrimpRecommend();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasMinutesOver20M() {
                return ((PHNResultMessage) this.instance).hasMinutesOver20M();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasPercentCompletedDailyTrimp() {
                return ((PHNResultMessage) this.instance).hasPercentCompletedDailyTrimp();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasPercentCompletedWeekTrimp() {
                return ((PHNResultMessage) this.instance).hasPercentCompletedWeekTrimp();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasPhnFlags() {
                return ((PHNResultMessage) this.instance).hasPhnFlags();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasPlanStartUtc0Time() {
                return ((PHNResultMessage) this.instance).hasPlanStartUtc0Time();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasRampRate() {
                return ((PHNResultMessage) this.instance).hasRampRate();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasSetReduceIntensity() {
                return ((PHNResultMessage) this.instance).hasSetReduceIntensity();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasThelastHistoricalTrimpCtl() {
                return ((PHNResultMessage) this.instance).hasThelastHistoricalTrimpCtl();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasThelastTrimpCtlAWeekBeforeLastWeek() {
                return ((PHNResultMessage) this.instance).hasThelastTrimpCtlAWeekBeforeLastWeek();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasThelastTrimpCtlLastWeek() {
                return ((PHNResultMessage) this.instance).hasThelastTrimpCtlLastWeek();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasTrimpDailyMax() {
                return ((PHNResultMessage) this.instance).hasTrimpDailyMax();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasTrimpDailyRecommended() {
                return ((PHNResultMessage) this.instance).hasTrimpDailyRecommended();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasTrimpWeekCompleted() {
                return ((PHNResultMessage) this.instance).hasTrimpWeekCompleted();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasTrimpWeeklyRecommend() {
                return ((PHNResultMessage) this.instance).hasTrimpWeeklyRecommend();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasVersion() {
                return ((PHNResultMessage) this.instance).hasVersion();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasWeeklySetExerciseDays() {
                return ((PHNResultMessage) this.instance).hasWeeklySetExerciseDays();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasYesterdayRecommendFlag() {
                return ((PHNResultMessage) this.instance).hasYesterdayRecommendFlag();
            }

            public Builder mergeExerciseRecommendedInfo(PHNExerciseInfoMessage pHNExerciseInfoMessage) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).mergeExerciseRecommendedInfo(pHNExerciseInfoMessage);
                return this;
            }

            public Builder mergePhnFlags(PHNFlagsMessage pHNFlagsMessage) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).mergePhnFlags(pHNFlagsMessage);
                return this;
            }

            public Builder setAtl42Days(int i, float f) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setAtl42Days(i, f);
                return this;
            }

            public Builder setCompareLastWeekRecommendPercent(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setCompareLastWeekRecommendPercent(i);
                return this;
            }

            public Builder setCountDailyExercise(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setCountDailyExercise(i);
                return this;
            }

            public Builder setCounterTrainingCycle(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setCounterTrainingCycle(i);
                return this;
            }

            public Builder setCtl42Days(int i, float f) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setCtl42Days(i, f);
                return this;
            }

            public Builder setCurrentWeekday(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setCurrentWeekday(i);
                return this;
            }

            public Builder setDailyActiveTrimp(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setDailyActiveTrimp(i);
                return this;
            }

            public Builder setDailyExerciseMins(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setDailyExerciseMins(i);
                return this;
            }

            public Builder setDailyExerciseTrimp(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setDailyExerciseTrimp(i);
                return this;
            }

            public Builder setDailyHighIntensityMins(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setDailyHighIntensityMins(i);
                return this;
            }

            public Builder setDailyTrimpScores(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setDailyTrimpScores(i);
                return this;
            }

            public Builder setDaysOfPhnPlan(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setDaysOfPhnPlan(i);
                return this;
            }

            public Builder setExerciseDay(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setExerciseDay(i);
                return this;
            }

            public Builder setExerciseRecommendedInfo(PHNExerciseInfoMessage pHNExerciseInfoMessage) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setExerciseRecommendedInfo(pHNExerciseInfoMessage);
                return this;
            }

            public Builder setFlagHistoricalTrimp(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setFlagHistoricalTrimp(i);
                return this;
            }

            public Builder setFlagSetHighIntensityDay(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setFlagSetHighIntensityDay(i);
                return this;
            }

            public Builder setFlagTsbBelow20Ever(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setFlagTsbBelow20Ever(i);
                return this;
            }

            public Builder setFlagTsbBelow20In10Days(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setFlagTsbBelow20In10Days(i);
                return this;
            }

            public Builder setFlagTsbBelow20InAWeek(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setFlagTsbBelow20InAWeek(i);
                return this;
            }

            public Builder setLastUpdateTime(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setLastUpdateTime(i);
                return this;
            }

            public Builder setLastUpdateTimeZone(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setLastUpdateTimeZone(i);
                return this;
            }

            public Builder setLastWeekTrimpCompleted(float f) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setLastWeekTrimpCompleted(f);
                return this;
            }

            public Builder setLastWeekTrimpCompletedPercent(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setLastWeekTrimpCompletedPercent(i);
                return this;
            }

            public Builder setLastWeekTrimpRecommend(float f) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setLastWeekTrimpRecommend(f);
                return this;
            }

            public Builder setMinutesOver20M(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setMinutesOver20M(i);
                return this;
            }

            public Builder setPercentCompletedDailyTrimp(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setPercentCompletedDailyTrimp(i);
                return this;
            }

            public Builder setPercentCompletedWeekTrimp(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setPercentCompletedWeekTrimp(i);
                return this;
            }

            public Builder setPhnFlags(PHNFlagsMessage pHNFlagsMessage) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setPhnFlags(pHNFlagsMessage);
                return this;
            }

            public Builder setPlanStartUtc0Time(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setPlanStartUtc0Time(i);
                return this;
            }

            public Builder setRampRate(float f) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setRampRate(f);
                return this;
            }

            public Builder setSetReduceIntensity(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setSetReduceIntensity(i);
                return this;
            }

            public Builder setThelastHistoricalTrimpCtl(float f) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setThelastHistoricalTrimpCtl(f);
                return this;
            }

            public Builder setThelastTrimpCtlAWeekBeforeLastWeek(float f) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setThelastTrimpCtlAWeekBeforeLastWeek(f);
                return this;
            }

            public Builder setThelastTrimpCtlLastWeek(float f) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setThelastTrimpCtlLastWeek(f);
                return this;
            }

            public Builder setThisWeekAchievedDailyCompletedPercent(int i, int i2) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setThisWeekAchievedDailyCompletedPercent(i, i2);
                return this;
            }

            public Builder setThisWeekAchievedIntensity(int i, int i2) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setThisWeekAchievedIntensity(i, i2);
                return this;
            }

            public Builder setThisWeekAchievedWeeklyCompletedPercent(int i, int i2) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setThisWeekAchievedWeeklyCompletedPercent(i, i2);
                return this;
            }

            public Builder setTrimp42Days(int i, int i2) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setTrimp42Days(i, i2);
                return this;
            }

            public Builder setTrimpDailyMax(float f) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setTrimpDailyMax(f);
                return this;
            }

            public Builder setTrimpDailyRecommended(float f) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setTrimpDailyRecommended(f);
                return this;
            }

            public Builder setTrimpWeekCompleted(float f) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setTrimpWeekCompleted(f);
                return this;
            }

            public Builder setTrimpWeeklyRecommend(float f) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setTrimpWeeklyRecommend(f);
                return this;
            }

            public Builder setTsb42Days(int i, float f) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setTsb42Days(i, f);
                return this;
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setVersion(str);
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setVersionBytes(byteString);
                return this;
            }

            public Builder setWeeklyHighIntensityDay(int i, int i2) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setWeeklyHighIntensityDay(i, i2);
                return this;
            }

            public Builder setWeeklySetExerciseDays(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setWeeklySetExerciseDays(i);
                return this;
            }

            public Builder setYesterdayRecommendFlag(int i) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setYesterdayRecommendFlag(i);
                return this;
            }

            private Builder() {
                super(PHNResultMessage.DEFAULT_INSTANCE);
            }

            public Builder setExerciseRecommendedInfo(PHNExerciseInfoMessage.Builder builder) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setExerciseRecommendedInfo(builder.build());
                return this;
            }

            public Builder setPhnFlags(PHNFlagsMessage.Builder builder) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setPhnFlags(builder.build());
                return this;
            }
        }

        static {
            PHNResultMessage pHNResultMessage = new PHNResultMessage();
            DEFAULT_INSTANCE = pHNResultMessage;
            GeneratedMessageLite.registerDefaultInstance(PHNResultMessage.class, pHNResultMessage);
        }

        private PHNResultMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAtl42Days(Iterable<? extends Float> iterable) {
            ensureAtl42DaysIsMutable();
            b.addAll((Iterable) iterable, (List) this.atl42Days_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCtl42Days(Iterable<? extends Float> iterable) {
            ensureCtl42DaysIsMutable();
            b.addAll((Iterable) iterable, (List) this.ctl42Days_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllThisWeekAchievedDailyCompletedPercent(Iterable<? extends Integer> iterable) {
            ensureThisWeekAchievedDailyCompletedPercentIsMutable();
            b.addAll((Iterable) iterable, (List) this.thisWeekAchievedDailyCompletedPercent_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllThisWeekAchievedIntensity(Iterable<? extends Integer> iterable) {
            ensureThisWeekAchievedIntensityIsMutable();
            b.addAll((Iterable) iterable, (List) this.thisWeekAchievedIntensity_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllThisWeekAchievedWeeklyCompletedPercent(Iterable<? extends Integer> iterable) {
            ensureThisWeekAchievedWeeklyCompletedPercentIsMutable();
            b.addAll((Iterable) iterable, (List) this.thisWeekAchievedWeeklyCompletedPercent_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTrimp42Days(Iterable<? extends Integer> iterable) {
            ensureTrimp42DaysIsMutable();
            b.addAll((Iterable) iterable, (List) this.trimp42Days_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTsb42Days(Iterable<? extends Float> iterable) {
            ensureTsb42DaysIsMutable();
            b.addAll((Iterable) iterable, (List) this.tsb42Days_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllWeeklyHighIntensityDay(Iterable<? extends Integer> iterable) {
            ensureWeeklyHighIntensityDayIsMutable();
            b.addAll((Iterable) iterable, (List) this.weeklyHighIntensityDay_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAtl42Days(float f) {
            ensureAtl42DaysIsMutable();
            this.atl42Days_.J(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCtl42Days(float f) {
            ensureCtl42DaysIsMutable();
            this.ctl42Days_.J(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addThisWeekAchievedDailyCompletedPercent(int i) {
            ensureThisWeekAchievedDailyCompletedPercentIsMutable();
            this.thisWeekAchievedDailyCompletedPercent_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addThisWeekAchievedIntensity(int i) {
            ensureThisWeekAchievedIntensityIsMutable();
            this.thisWeekAchievedIntensity_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addThisWeekAchievedWeeklyCompletedPercent(int i) {
            ensureThisWeekAchievedWeeklyCompletedPercentIsMutable();
            this.thisWeekAchievedWeeklyCompletedPercent_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrimp42Days(int i) {
            ensureTrimp42DaysIsMutable();
            this.trimp42Days_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTsb42Days(float f) {
            ensureTsb42DaysIsMutable();
            this.tsb42Days_.J(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addWeeklyHighIntensityDay(int i) {
            ensureWeeklyHighIntensityDayIsMutable();
            this.weeklyHighIntensityDay_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAtl42Days() {
            this.atl42Days_ = GeneratedMessageLite.emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCompareLastWeekRecommendPercent() {
            this.bitField1_ &= -17;
            this.compareLastWeekRecommendPercent_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountDailyExercise() {
            this.bitField0_ &= -2049;
            this.countDailyExercise_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCounterTrainingCycle() {
            this.bitField0_ &= -134217729;
            this.counterTrainingCycle_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCtl42Days() {
            this.ctl42Days_ = GeneratedMessageLite.emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentWeekday() {
            this.bitField0_ &= -9;
            this.currentWeekday_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDailyActiveTrimp() {
            this.bitField1_ &= -3;
            this.dailyActiveTrimp_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDailyExerciseMins() {
            this.bitField1_ &= -9;
            this.dailyExerciseMins_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDailyExerciseTrimp() {
            this.bitField1_ &= -5;
            this.dailyExerciseTrimp_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDailyHighIntensityMins() {
            this.bitField1_ &= -2;
            this.dailyHighIntensityMins_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDailyTrimpScores() {
            this.bitField0_ &= -3;
            this.dailyTrimpScores_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDaysOfPhnPlan() {
            this.bitField0_ &= -16777217;
            this.daysOfPhnPlan_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExerciseDay() {
            this.bitField0_ &= -4194305;
            this.exerciseDay_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExerciseRecommendedInfo() {
            this.exerciseRecommendedInfo_ = null;
            this.bitField0_ &= -262145;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlagHistoricalTrimp() {
            this.bitField0_ &= -129;
            this.flagHistoricalTrimp_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlagSetHighIntensityDay() {
            this.bitField0_ &= -8388609;
            this.flagSetHighIntensityDay_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlagTsbBelow20Ever() {
            this.bitField0_ &= -65;
            this.flagTsbBelow20Ever_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlagTsbBelow20In10Days() {
            this.bitField0_ &= -33;
            this.flagTsbBelow20In10Days_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlagTsbBelow20InAWeek() {
            this.bitField0_ &= -17;
            this.flagTsbBelow20InAWeek_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastUpdateTime() {
            this.bitField0_ &= -524289;
            this.lastUpdateTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastUpdateTimeZone() {
            this.bitField0_ &= -1048577;
            this.lastUpdateTimeZone_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastWeekTrimpCompleted() {
            this.bitField0_ &= -1073741825;
            this.lastWeekTrimpCompleted_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastWeekTrimpCompletedPercent() {
            this.bitField0_ &= Integer.MAX_VALUE;
            this.lastWeekTrimpCompletedPercent_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastWeekTrimpRecommend() {
            this.bitField0_ &= -536870913;
            this.lastWeekTrimpRecommend_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMinutesOver20M() {
            this.bitField0_ &= -5;
            this.minutesOver20M_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPercentCompletedDailyTrimp() {
            this.bitField0_ &= -131073;
            this.percentCompletedDailyTrimp_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPercentCompletedWeekTrimp() {
            this.bitField0_ &= -65537;
            this.percentCompletedWeekTrimp_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhnFlags() {
            this.phnFlags_ = null;
            this.bitField1_ &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlanStartUtc0Time() {
            this.bitField0_ &= -2097153;
            this.planStartUtc0Time_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRampRate() {
            this.bitField0_ &= -268435457;
            this.rampRate_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSetReduceIntensity() {
            this.bitField0_ &= -67108865;
            this.setReduceIntensity_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThelastHistoricalTrimpCtl() {
            this.bitField0_ &= -257;
            this.thelastHistoricalTrimpCtl_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThelastTrimpCtlAWeekBeforeLastWeek() {
            this.bitField0_ &= -1025;
            this.thelastTrimpCtlAWeekBeforeLastWeek_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThelastTrimpCtlLastWeek() {
            this.bitField0_ &= -513;
            this.thelastTrimpCtlLastWeek_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThisWeekAchievedDailyCompletedPercent() {
            this.thisWeekAchievedDailyCompletedPercent_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThisWeekAchievedIntensity() {
            this.thisWeekAchievedIntensity_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThisWeekAchievedWeeklyCompletedPercent() {
            this.thisWeekAchievedWeeklyCompletedPercent_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrimp42Days() {
            this.trimp42Days_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrimpDailyMax() {
            this.bitField0_ &= -8193;
            this.trimpDailyMax_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrimpDailyRecommended() {
            this.bitField0_ &= -16385;
            this.trimpDailyRecommended_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrimpWeekCompleted() {
            this.bitField0_ &= -32769;
            this.trimpWeekCompleted_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrimpWeeklyRecommend() {
            this.bitField0_ &= -4097;
            this.trimpWeeklyRecommend_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTsb42Days() {
            this.tsb42Days_ = GeneratedMessageLite.emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.bitField0_ &= -2;
            this.version_ = getDefaultInstance().getVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeeklyHighIntensityDay() {
            this.weeklyHighIntensityDay_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeeklySetExerciseDays() {
            this.bitField0_ &= -33554433;
            this.weeklySetExerciseDays_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearYesterdayRecommendFlag() {
            this.bitField1_ &= -33;
            this.yesterdayRecommendFlag_ = 0;
        }

        private void ensureAtl42DaysIsMutable() {
            d0.f fVar = this.atl42Days_;
            if (fVar.c()) {
                return;
            }
            this.atl42Days_ = GeneratedMessageLite.mutableCopy(fVar);
        }

        private void ensureCtl42DaysIsMutable() {
            d0.f fVar = this.ctl42Days_;
            if (fVar.c()) {
                return;
            }
            this.ctl42Days_ = GeneratedMessageLite.mutableCopy(fVar);
        }

        private void ensureThisWeekAchievedDailyCompletedPercentIsMutable() {
            d0.g gVar = this.thisWeekAchievedDailyCompletedPercent_;
            if (gVar.c()) {
                return;
            }
            this.thisWeekAchievedDailyCompletedPercent_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureThisWeekAchievedIntensityIsMutable() {
            d0.g gVar = this.thisWeekAchievedIntensity_;
            if (gVar.c()) {
                return;
            }
            this.thisWeekAchievedIntensity_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureThisWeekAchievedWeeklyCompletedPercentIsMutable() {
            d0.g gVar = this.thisWeekAchievedWeeklyCompletedPercent_;
            if (gVar.c()) {
                return;
            }
            this.thisWeekAchievedWeeklyCompletedPercent_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureTrimp42DaysIsMutable() {
            d0.g gVar = this.trimp42Days_;
            if (gVar.c()) {
                return;
            }
            this.trimp42Days_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureTsb42DaysIsMutable() {
            d0.f fVar = this.tsb42Days_;
            if (fVar.c()) {
                return;
            }
            this.tsb42Days_ = GeneratedMessageLite.mutableCopy(fVar);
        }

        private void ensureWeeklyHighIntensityDayIsMutable() {
            d0.g gVar = this.weeklyHighIntensityDay_;
            if (gVar.c()) {
                return;
            }
            this.weeklyHighIntensityDay_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        public static PHNResultMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExerciseRecommendedInfo(PHNExerciseInfoMessage pHNExerciseInfoMessage) {
            pHNExerciseInfoMessage.getClass();
            PHNExerciseInfoMessage pHNExerciseInfoMessage2 = this.exerciseRecommendedInfo_;
            if (pHNExerciseInfoMessage2 == null || pHNExerciseInfoMessage2 == PHNExerciseInfoMessage.getDefaultInstance()) {
                this.exerciseRecommendedInfo_ = pHNExerciseInfoMessage;
            } else {
                this.exerciseRecommendedInfo_ = PHNExerciseInfoMessage.newBuilder(this.exerciseRecommendedInfo_).mergeFrom(pHNExerciseInfoMessage).buildPartial();
            }
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePhnFlags(PHNFlagsMessage pHNFlagsMessage) {
            pHNFlagsMessage.getClass();
            PHNFlagsMessage pHNFlagsMessage2 = this.phnFlags_;
            if (pHNFlagsMessage2 == null || pHNFlagsMessage2 == PHNFlagsMessage.getDefaultInstance()) {
                this.phnFlags_ = pHNFlagsMessage;
            } else {
                this.phnFlags_ = PHNFlagsMessage.newBuilder(this.phnFlags_).mergeFrom(pHNFlagsMessage).buildPartial();
            }
            this.bitField1_ |= 64;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PHNResultMessage parseDelimitedFrom(InputStream inputStream) {
            return (PHNResultMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PHNResultMessage parseFrom(ByteBuffer byteBuffer) {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<PHNResultMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAtl42Days(int i, float f) {
            ensureAtl42DaysIsMutable();
            this.atl42Days_.M(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCompareLastWeekRecommendPercent(int i) {
            this.bitField1_ |= 16;
            this.compareLastWeekRecommendPercent_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountDailyExercise(int i) {
            this.bitField0_ |= 2048;
            this.countDailyExercise_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCounterTrainingCycle(int i) {
            this.bitField0_ |= 134217728;
            this.counterTrainingCycle_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCtl42Days(int i, float f) {
            ensureCtl42DaysIsMutable();
            this.ctl42Days_.M(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentWeekday(int i) {
            this.bitField0_ |= 8;
            this.currentWeekday_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDailyActiveTrimp(int i) {
            this.bitField1_ |= 2;
            this.dailyActiveTrimp_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDailyExerciseMins(int i) {
            this.bitField1_ |= 8;
            this.dailyExerciseMins_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDailyExerciseTrimp(int i) {
            this.bitField1_ |= 4;
            this.dailyExerciseTrimp_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDailyHighIntensityMins(int i) {
            this.bitField1_ |= 1;
            this.dailyHighIntensityMins_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDailyTrimpScores(int i) {
            this.bitField0_ |= 2;
            this.dailyTrimpScores_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDaysOfPhnPlan(int i) {
            this.bitField0_ |= 16777216;
            this.daysOfPhnPlan_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExerciseDay(int i) {
            this.bitField0_ |= 4194304;
            this.exerciseDay_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExerciseRecommendedInfo(PHNExerciseInfoMessage pHNExerciseInfoMessage) {
            pHNExerciseInfoMessage.getClass();
            this.exerciseRecommendedInfo_ = pHNExerciseInfoMessage;
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagHistoricalTrimp(int i) {
            this.bitField0_ |= 128;
            this.flagHistoricalTrimp_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagSetHighIntensityDay(int i) {
            this.bitField0_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
            this.flagSetHighIntensityDay_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagTsbBelow20Ever(int i) {
            this.bitField0_ |= 64;
            this.flagTsbBelow20Ever_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagTsbBelow20In10Days(int i) {
            this.bitField0_ |= 32;
            this.flagTsbBelow20In10Days_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagTsbBelow20InAWeek(int i) {
            this.bitField0_ |= 16;
            this.flagTsbBelow20InAWeek_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastUpdateTime(int i) {
            this.bitField0_ |= 524288;
            this.lastUpdateTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastUpdateTimeZone(int i) {
            this.bitField0_ |= EventRecurrence.TH;
            this.lastUpdateTimeZone_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastWeekTrimpCompleted(float f) {
            this.bitField0_ |= 1073741824;
            this.lastWeekTrimpCompleted_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastWeekTrimpCompletedPercent(int i) {
            this.bitField0_ |= Integer.MIN_VALUE;
            this.lastWeekTrimpCompletedPercent_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastWeekTrimpRecommend(float f) {
            this.bitField0_ |= 536870912;
            this.lastWeekTrimpRecommend_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinutesOver20M(int i) {
            this.bitField0_ |= 4;
            this.minutesOver20M_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPercentCompletedDailyTrimp(int i) {
            this.bitField0_ |= 131072;
            this.percentCompletedDailyTrimp_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPercentCompletedWeekTrimp(int i) {
            this.bitField0_ |= 65536;
            this.percentCompletedWeekTrimp_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhnFlags(PHNFlagsMessage pHNFlagsMessage) {
            pHNFlagsMessage.getClass();
            this.phnFlags_ = pHNFlagsMessage;
            this.bitField1_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlanStartUtc0Time(int i) {
            this.bitField0_ |= 2097152;
            this.planStartUtc0Time_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRampRate(float f) {
            this.bitField0_ |= 268435456;
            this.rampRate_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetReduceIntensity(int i) {
            this.bitField0_ |= 67108864;
            this.setReduceIntensity_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThelastHistoricalTrimpCtl(float f) {
            this.bitField0_ |= 256;
            this.thelastHistoricalTrimpCtl_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThelastTrimpCtlAWeekBeforeLastWeek(float f) {
            this.bitField0_ |= 1024;
            this.thelastTrimpCtlAWeekBeforeLastWeek_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThelastTrimpCtlLastWeek(float f) {
            this.bitField0_ |= 512;
            this.thelastTrimpCtlLastWeek_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThisWeekAchievedDailyCompletedPercent(int i, int i2) {
            ensureThisWeekAchievedDailyCompletedPercentIsMutable();
            this.thisWeekAchievedDailyCompletedPercent_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThisWeekAchievedIntensity(int i, int i2) {
            ensureThisWeekAchievedIntensityIsMutable();
            this.thisWeekAchievedIntensity_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThisWeekAchievedWeeklyCompletedPercent(int i, int i2) {
            ensureThisWeekAchievedWeeklyCompletedPercentIsMutable();
            this.thisWeekAchievedWeeklyCompletedPercent_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrimp42Days(int i, int i2) {
            ensureTrimp42DaysIsMutable();
            this.trimp42Days_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrimpDailyMax(float f) {
            this.bitField0_ |= 8192;
            this.trimpDailyMax_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrimpDailyRecommended(float f) {
            this.bitField0_ |= 16384;
            this.trimpDailyRecommended_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrimpWeekCompleted(float f) {
            this.bitField0_ |= 32768;
            this.trimpWeekCompleted_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrimpWeeklyRecommend(float f) {
            this.bitField0_ |= 4096;
            this.trimpWeeklyRecommend_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTsb42Days(int i, float f) {
            ensureTsb42DaysIsMutable();
            this.tsb42Days_.M(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(ByteString byteString) {
            this.version_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeeklyHighIntensityDay(int i, int i2) {
            ensureWeeklyHighIntensityDayIsMutable();
            this.weeklyHighIntensityDay_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeeklySetExerciseDays(int i) {
            this.bitField0_ |= 33554432;
            this.weeklySetExerciseDays_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setYesterdayRecommendFlag(int i) {
            this.bitField1_ |= 32;
            this.yesterdayRecommendFlag_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new PHNResultMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001/\u0000\u0002\u00010/\u0000\b\u0003\u0001ᔈ\u0000\u0002င\u0001\u0003ဋ\u0002\u0004\u0016\u0005\u0013\u0006\u0013\u0007\u0013\bဋ\u0003\tဋ\u0004\nဋ\u0005\u000bဋ\u0006\fဋ\u0007\rခ\b\u000eခ\t\u000fခ\n\u0010ဋ\u000b\u0011ခ\f\u0012ခ\r\u0013ခ\u000e\u0014ခ\u000f\u0015ဋ\u0010\u0016ဋ\u0011\u0017ဉ\u0012\u0018ᔋ\u0013\u0019ᔄ\u0014\u001bဋ\u0015\u001cဋ\u0016\u001dဋ\u0017\u001eဋ\u0018\u001fဋ\u0019 ဋ\u001a!ဋ\u001b\"ခ\u001c#ခ\u001d$ခ\u001e%ဋ\u001f&\u001d'\u001d(\u001d)\u001d*ဋ +ဋ!,ဋ\"-ဋ#.င$/ဋ%0ဉ&", new Object[]{"bitField0_", "bitField1_", "version_", "dailyTrimpScores_", "minutesOver20M_", "trimp42Days_", "atl42Days_", "ctl42Days_", "tsb42Days_", "currentWeekday_", "flagTsbBelow20InAWeek_", "flagTsbBelow20In10Days_", "flagTsbBelow20Ever_", "flagHistoricalTrimp_", "thelastHistoricalTrimpCtl_", "thelastTrimpCtlLastWeek_", "thelastTrimpCtlAWeekBeforeLastWeek_", "countDailyExercise_", "trimpWeeklyRecommend_", "trimpDailyMax_", "trimpDailyRecommended_", "trimpWeekCompleted_", "percentCompletedWeekTrimp_", "percentCompletedDailyTrimp_", "exerciseRecommendedInfo_", "lastUpdateTime_", "lastUpdateTimeZone_", "planStartUtc0Time_", "exerciseDay_", "flagSetHighIntensityDay_", "daysOfPhnPlan_", "weeklySetExerciseDays_", "setReduceIntensity_", "counterTrainingCycle_", "rampRate_", "lastWeekTrimpRecommend_", "lastWeekTrimpCompleted_", "lastWeekTrimpCompletedPercent_", "thisWeekAchievedIntensity_", "weeklyHighIntensityDay_", "thisWeekAchievedWeeklyCompletedPercent_", "thisWeekAchievedDailyCompletedPercent_", "dailyHighIntensityMins_", "dailyActiveTrimp_", "dailyExerciseTrimp_", "dailyExerciseMins_", "compareLastWeekRecommendPercent_", "yesterdayRecommendFlag_", "phnFlags_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<PHNResultMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (PHNResultMessage.class) {
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

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public float getAtl42Days(int i) {
            return this.atl42Days_.getFloat(i);
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getAtl42DaysCount() {
            return this.atl42Days_.size();
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public List<Float> getAtl42DaysList() {
            return this.atl42Days_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getCompareLastWeekRecommendPercent() {
            return this.compareLastWeekRecommendPercent_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getCountDailyExercise() {
            return this.countDailyExercise_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getCounterTrainingCycle() {
            return this.counterTrainingCycle_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public float getCtl42Days(int i) {
            return this.ctl42Days_.getFloat(i);
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getCtl42DaysCount() {
            return this.ctl42Days_.size();
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public List<Float> getCtl42DaysList() {
            return this.ctl42Days_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getCurrentWeekday() {
            return this.currentWeekday_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getDailyActiveTrimp() {
            return this.dailyActiveTrimp_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getDailyExerciseMins() {
            return this.dailyExerciseMins_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getDailyExerciseTrimp() {
            return this.dailyExerciseTrimp_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getDailyHighIntensityMins() {
            return this.dailyHighIntensityMins_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getDailyTrimpScores() {
            return this.dailyTrimpScores_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getDaysOfPhnPlan() {
            return this.daysOfPhnPlan_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getExerciseDay() {
            return this.exerciseDay_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public PHNExerciseInfoMessage getExerciseRecommendedInfo() {
            PHNExerciseInfoMessage pHNExerciseInfoMessage = this.exerciseRecommendedInfo_;
            return pHNExerciseInfoMessage == null ? PHNExerciseInfoMessage.getDefaultInstance() : pHNExerciseInfoMessage;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getFlagHistoricalTrimp() {
            return this.flagHistoricalTrimp_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getFlagSetHighIntensityDay() {
            return this.flagSetHighIntensityDay_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getFlagTsbBelow20Ever() {
            return this.flagTsbBelow20Ever_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getFlagTsbBelow20In10Days() {
            return this.flagTsbBelow20In10Days_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getFlagTsbBelow20InAWeek() {
            return this.flagTsbBelow20InAWeek_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getLastUpdateTime() {
            return this.lastUpdateTime_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getLastUpdateTimeZone() {
            return this.lastUpdateTimeZone_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public float getLastWeekTrimpCompleted() {
            return this.lastWeekTrimpCompleted_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getLastWeekTrimpCompletedPercent() {
            return this.lastWeekTrimpCompletedPercent_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public float getLastWeekTrimpRecommend() {
            return this.lastWeekTrimpRecommend_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getMinutesOver20M() {
            return this.minutesOver20M_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getPercentCompletedDailyTrimp() {
            return this.percentCompletedDailyTrimp_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getPercentCompletedWeekTrimp() {
            return this.percentCompletedWeekTrimp_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public PHNFlagsMessage getPhnFlags() {
            PHNFlagsMessage pHNFlagsMessage = this.phnFlags_;
            return pHNFlagsMessage == null ? PHNFlagsMessage.getDefaultInstance() : pHNFlagsMessage;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getPlanStartUtc0Time() {
            return this.planStartUtc0Time_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public float getRampRate() {
            return this.rampRate_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getSetReduceIntensity() {
            return this.setReduceIntensity_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public float getThelastHistoricalTrimpCtl() {
            return this.thelastHistoricalTrimpCtl_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public float getThelastTrimpCtlAWeekBeforeLastWeek() {
            return this.thelastTrimpCtlAWeekBeforeLastWeek_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public float getThelastTrimpCtlLastWeek() {
            return this.thelastTrimpCtlLastWeek_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getThisWeekAchievedDailyCompletedPercent(int i) {
            return this.thisWeekAchievedDailyCompletedPercent_.getInt(i);
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getThisWeekAchievedDailyCompletedPercentCount() {
            return this.thisWeekAchievedDailyCompletedPercent_.size();
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public List<Integer> getThisWeekAchievedDailyCompletedPercentList() {
            return this.thisWeekAchievedDailyCompletedPercent_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getThisWeekAchievedIntensity(int i) {
            return this.thisWeekAchievedIntensity_.getInt(i);
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getThisWeekAchievedIntensityCount() {
            return this.thisWeekAchievedIntensity_.size();
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public List<Integer> getThisWeekAchievedIntensityList() {
            return this.thisWeekAchievedIntensity_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getThisWeekAchievedWeeklyCompletedPercent(int i) {
            return this.thisWeekAchievedWeeklyCompletedPercent_.getInt(i);
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getThisWeekAchievedWeeklyCompletedPercentCount() {
            return this.thisWeekAchievedWeeklyCompletedPercent_.size();
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public List<Integer> getThisWeekAchievedWeeklyCompletedPercentList() {
            return this.thisWeekAchievedWeeklyCompletedPercent_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getTrimp42Days(int i) {
            return this.trimp42Days_.getInt(i);
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getTrimp42DaysCount() {
            return this.trimp42Days_.size();
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public List<Integer> getTrimp42DaysList() {
            return this.trimp42Days_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public float getTrimpDailyMax() {
            return this.trimpDailyMax_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public float getTrimpDailyRecommended() {
            return this.trimpDailyRecommended_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public float getTrimpWeekCompleted() {
            return this.trimpWeekCompleted_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public float getTrimpWeeklyRecommend() {
            return this.trimpWeeklyRecommend_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public float getTsb42Days(int i) {
            return this.tsb42Days_.getFloat(i);
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getTsb42DaysCount() {
            return this.tsb42Days_.size();
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public List<Float> getTsb42DaysList() {
            return this.tsb42Days_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public String getVersion() {
            return this.version_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getWeeklyHighIntensityDay(int i) {
            return this.weeklyHighIntensityDay_.getInt(i);
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getWeeklyHighIntensityDayCount() {
            return this.weeklyHighIntensityDay_.size();
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public List<Integer> getWeeklyHighIntensityDayList() {
            return this.weeklyHighIntensityDay_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getWeeklySetExerciseDays() {
            return this.weeklySetExerciseDays_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getYesterdayRecommendFlag() {
            return this.yesterdayRecommendFlag_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasCompareLastWeekRecommendPercent() {
            return (this.bitField1_ & 16) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasCountDailyExercise() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasCounterTrainingCycle() {
            return (this.bitField0_ & 134217728) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasCurrentWeekday() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasDailyActiveTrimp() {
            return (this.bitField1_ & 2) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasDailyExerciseMins() {
            return (this.bitField1_ & 8) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasDailyExerciseTrimp() {
            return (this.bitField1_ & 4) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasDailyHighIntensityMins() {
            return (this.bitField1_ & 1) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasDailyTrimpScores() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasDaysOfPhnPlan() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasExerciseDay() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasExerciseRecommendedInfo() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasFlagHistoricalTrimp() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasFlagSetHighIntensityDay() {
            return (this.bitField0_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasFlagTsbBelow20Ever() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasFlagTsbBelow20In10Days() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasFlagTsbBelow20InAWeek() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasLastUpdateTime() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasLastUpdateTimeZone() {
            return (this.bitField0_ & EventRecurrence.TH) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasLastWeekTrimpCompleted() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasLastWeekTrimpCompletedPercent() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasLastWeekTrimpRecommend() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasMinutesOver20M() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasPercentCompletedDailyTrimp() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasPercentCompletedWeekTrimp() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasPhnFlags() {
            return (this.bitField1_ & 64) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasPlanStartUtc0Time() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasRampRate() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasSetReduceIntensity() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasThelastHistoricalTrimpCtl() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasThelastTrimpCtlAWeekBeforeLastWeek() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasThelastTrimpCtlLastWeek() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasTrimpDailyMax() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasTrimpDailyRecommended() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasTrimpWeekCompleted() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasTrimpWeeklyRecommend() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasWeeklySetExerciseDays() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasYesterdayRecommendFlag() {
            return (this.bitField1_ & 32) != 0;
        }

        public static Builder newBuilder(PHNResultMessage pHNResultMessage) {
            return DEFAULT_INSTANCE.createBuilder(pHNResultMessage);
        }

        public static PHNResultMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (PHNResultMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static PHNResultMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static PHNResultMessage parseFrom(ByteString byteString) {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PHNResultMessage parseFrom(ByteString byteString, t tVar) {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static PHNResultMessage parseFrom(byte[] bArr) {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PHNResultMessage parseFrom(byte[] bArr, t tVar) {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static PHNResultMessage parseFrom(InputStream inputStream) {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PHNResultMessage parseFrom(InputStream inputStream, t tVar) {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static PHNResultMessage parseFrom(j jVar) {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PHNResultMessage parseFrom(j jVar, t tVar) {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface PHNResultMessageOrBuilder extends bsf {
        float getAtl42Days(int i);

        int getAtl42DaysCount();

        List<Float> getAtl42DaysList();

        int getCompareLastWeekRecommendPercent();

        int getCountDailyExercise();

        int getCounterTrainingCycle();

        float getCtl42Days(int i);

        int getCtl42DaysCount();

        List<Float> getCtl42DaysList();

        int getCurrentWeekday();

        int getDailyActiveTrimp();

        int getDailyExerciseMins();

        int getDailyExerciseTrimp();

        int getDailyHighIntensityMins();

        int getDailyTrimpScores();

        int getDaysOfPhnPlan();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getExerciseDay();

        PHNExerciseInfoMessage getExerciseRecommendedInfo();

        int getFlagHistoricalTrimp();

        int getFlagSetHighIntensityDay();

        int getFlagTsbBelow20Ever();

        int getFlagTsbBelow20In10Days();

        int getFlagTsbBelow20InAWeek();

        int getLastUpdateTime();

        int getLastUpdateTimeZone();

        float getLastWeekTrimpCompleted();

        int getLastWeekTrimpCompletedPercent();

        float getLastWeekTrimpRecommend();

        int getMinutesOver20M();

        int getPercentCompletedDailyTrimp();

        int getPercentCompletedWeekTrimp();

        PHNFlagsMessage getPhnFlags();

        int getPlanStartUtc0Time();

        float getRampRate();

        int getSetReduceIntensity();

        float getThelastHistoricalTrimpCtl();

        float getThelastTrimpCtlAWeekBeforeLastWeek();

        float getThelastTrimpCtlLastWeek();

        int getThisWeekAchievedDailyCompletedPercent(int i);

        int getThisWeekAchievedDailyCompletedPercentCount();

        List<Integer> getThisWeekAchievedDailyCompletedPercentList();

        int getThisWeekAchievedIntensity(int i);

        int getThisWeekAchievedIntensityCount();

        List<Integer> getThisWeekAchievedIntensityList();

        int getThisWeekAchievedWeeklyCompletedPercent(int i);

        int getThisWeekAchievedWeeklyCompletedPercentCount();

        List<Integer> getThisWeekAchievedWeeklyCompletedPercentList();

        int getTrimp42Days(int i);

        int getTrimp42DaysCount();

        List<Integer> getTrimp42DaysList();

        float getTrimpDailyMax();

        float getTrimpDailyRecommended();

        float getTrimpWeekCompleted();

        float getTrimpWeeklyRecommend();

        float getTsb42Days(int i);

        int getTsb42DaysCount();

        List<Float> getTsb42DaysList();

        String getVersion();

        ByteString getVersionBytes();

        int getWeeklyHighIntensityDay(int i);

        int getWeeklyHighIntensityDayCount();

        List<Integer> getWeeklyHighIntensityDayList();

        int getWeeklySetExerciseDays();

        int getYesterdayRecommendFlag();

        boolean hasCompareLastWeekRecommendPercent();

        boolean hasCountDailyExercise();

        boolean hasCounterTrainingCycle();

        boolean hasCurrentWeekday();

        boolean hasDailyActiveTrimp();

        boolean hasDailyExerciseMins();

        boolean hasDailyExerciseTrimp();

        boolean hasDailyHighIntensityMins();

        boolean hasDailyTrimpScores();

        boolean hasDaysOfPhnPlan();

        boolean hasExerciseDay();

        boolean hasExerciseRecommendedInfo();

        boolean hasFlagHistoricalTrimp();

        boolean hasFlagSetHighIntensityDay();

        boolean hasFlagTsbBelow20Ever();

        boolean hasFlagTsbBelow20In10Days();

        boolean hasFlagTsbBelow20InAWeek();

        boolean hasLastUpdateTime();

        boolean hasLastUpdateTimeZone();

        boolean hasLastWeekTrimpCompleted();

        boolean hasLastWeekTrimpCompletedPercent();

        boolean hasLastWeekTrimpRecommend();

        boolean hasMinutesOver20M();

        boolean hasPercentCompletedDailyTrimp();

        boolean hasPercentCompletedWeekTrimp();

        boolean hasPhnFlags();

        boolean hasPlanStartUtc0Time();

        boolean hasRampRate();

        boolean hasSetReduceIntensity();

        boolean hasThelastHistoricalTrimpCtl();

        boolean hasThelastTrimpCtlAWeekBeforeLastWeek();

        boolean hasThelastTrimpCtlLastWeek();

        boolean hasTrimpDailyMax();

        boolean hasTrimpDailyRecommended();

        boolean hasTrimpWeekCompleted();

        boolean hasTrimpWeeklyRecommend();

        boolean hasVersion();

        boolean hasWeeklySetExerciseDays();

        boolean hasYesterdayRecommendFlag();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private Phn() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}

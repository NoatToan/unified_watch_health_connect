package com.huami.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class Phn {

    public static final class PHNExerciseInfoMessage extends GeneratedMessageLite<PHNExerciseInfoMessage, Builder> implements PHNExerciseInfoMessageOrBuilder {
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
        private static volatile Parser<PHNExerciseInfoMessage> PARSER;
        private int bitField0_;
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

        public static final class Builder extends GeneratedMessageLite.Builder<PHNExerciseInfoMessage, Builder> implements PHNExerciseInfoMessageOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
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

            public Builder setDurationZone1(int value) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setDurationZone1(value);
                return this;
            }

            public Builder setDurationZone2(int value) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setDurationZone2(value);
                return this;
            }

            public Builder setDurationZone3(int value) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setDurationZone3(value);
                return this;
            }

            public Builder setFlagRecommendedExercise(int value) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setFlagRecommendedExercise(value);
                return this;
            }

            public Builder setHrLowerZone1(int value) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setHrLowerZone1(value);
                return this;
            }

            public Builder setHrLowerZone2(int value) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setHrLowerZone2(value);
                return this;
            }

            public Builder setHrLowerZone3(int value) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setHrLowerZone3(value);
                return this;
            }

            public Builder setHrUpperZone1(int value) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setHrUpperZone1(value);
                return this;
            }

            public Builder setHrUpperZone2(int value) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setHrUpperZone2(value);
                return this;
            }

            public Builder setHrUpperZone3(int value) {
                copyOnWrite();
                ((PHNExerciseInfoMessage) this.instance).setHrUpperZone3(value);
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

        public static PHNExerciseInfoMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static PHNExerciseInfoMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<PHNExerciseInfoMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDurationZone1(int value) {
            this.bitField0_ |= 128;
            this.durationZone1_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDurationZone2(int value) {
            this.bitField0_ |= 256;
            this.durationZone2_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDurationZone3(int value) {
            this.bitField0_ |= 512;
            this.durationZone3_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagRecommendedExercise(int value) {
            this.bitField0_ |= 1;
            this.flagRecommendedExercise_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrLowerZone1(int value) {
            this.bitField0_ |= 2;
            this.hrLowerZone1_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrLowerZone2(int value) {
            this.bitField0_ |= 8;
            this.hrLowerZone2_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrLowerZone3(int value) {
            this.bitField0_ |= 32;
            this.hrLowerZone3_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrUpperZone1(int value) {
            this.bitField0_ |= 4;
            this.hrUpperZone1_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrUpperZone2(int value) {
            this.bitField0_ |= 16;
            this.hrUpperZone2_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrUpperZone3(int value) {
            this.bitField0_ |= 64;
            this.hrUpperZone3_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            a aVar = null;
            switch (a.a[method.ordinal()]) {
                case 1:
                    return new PHNExerciseInfoMessage();
                case 2:
                    return new Builder(aVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t", new Object[]{"bitField0_", "flagRecommendedExercise_", "hrLowerZone1_", "hrUpperZone1_", "hrLowerZone2_", "hrUpperZone2_", "hrLowerZone3_", "hrUpperZone3_", "durationZone1_", "durationZone2_", "durationZone3_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PHNExerciseInfoMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (PHNExerciseInfoMessage.class) {
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
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
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

        public static Builder newBuilder(PHNExerciseInfoMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static PHNExerciseInfoMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PHNExerciseInfoMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PHNExerciseInfoMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PHNExerciseInfoMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PHNExerciseInfoMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PHNExerciseInfoMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PHNExerciseInfoMessage parseFrom(InputStream input) throws IOException {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PHNExerciseInfoMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PHNExerciseInfoMessage parseFrom(CodedInputStream input) throws IOException {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PHNExerciseInfoMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PHNExerciseInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface PHNExerciseInfoMessageOrBuilder extends MessageLiteOrBuilder {
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
    }

    public static final class PHNResultMessage extends GeneratedMessageLite<PHNResultMessage, Builder> implements PHNResultMessageOrBuilder {
        public static final int ATL_42_DAYS_FIELD_NUMBER = 5;
        public static final int COUNT_DAILY_EXERCISE_FIELD_NUMBER = 16;
        public static final int CTL_42_DAYS_FIELD_NUMBER = 6;
        public static final int CURRENT_WEEKDAY_FIELD_NUMBER = 8;
        public static final int DAILY_TRIMP_SCORES_FIELD_NUMBER = 2;
        private static final PHNResultMessage DEFAULT_INSTANCE;
        public static final int EXERCISE_RECOMMENDED_INFO_FIELD_NUMBER = 23;
        public static final int FLAG_HISTORICAL_TRIMP_FIELD_NUMBER = 12;
        public static final int FLAG_TSB_BELOW_20_EVER_FIELD_NUMBER = 11;
        public static final int FLAG_TSB_BELOW_20_IN_10_DAYS_FIELD_NUMBER = 10;
        public static final int FLAG_TSB_BELOW_20_IN_A_WEEK_FIELD_NUMBER = 9;
        public static final int LAST_UPDATE_TIME_FIELD_NUMBER = 24;
        public static final int LAST_UPDATE_TIME_ZONE_FIELD_NUMBER = 25;
        public static final int MINUTES_OVER_20M_FIELD_NUMBER = 3;
        private static volatile Parser<PHNResultMessage> PARSER = null;
        public static final int PERCENT_COMPLETED_DAILY_TRIMP_FIELD_NUMBER = 22;
        public static final int PERCENT_COMPLETED_WEEK_TRIMP_FIELD_NUMBER = 21;
        public static final int PLAN_START_UTC0_TIME_FIELD_NUMBER = 27;
        public static final int REST_DAY_FIELD_NUMBER = 26;
        public static final int THELAST_HISTORICAL_TRIMP_CTL_FIELD_NUMBER = 13;
        public static final int THELAST_TRIMP_CTL_A_WEEK_BEFORE_LAST_WEEK_FIELD_NUMBER = 15;
        public static final int THELAST_TRIMP_CTL_LAST_WEEK_FIELD_NUMBER = 14;
        public static final int TRIMP_42_DAYS_FIELD_NUMBER = 4;
        public static final int TRIMP_DAILY_MAX_FIELD_NUMBER = 18;
        public static final int TRIMP_DAILY_RECOMMENDED_FIELD_NUMBER = 19;
        public static final int TRIMP_WEEKLY_RECOMMEND_FIELD_NUMBER = 17;
        public static final int TRIMP_WEEK_COMPLETED_FIELD_NUMBER = 20;
        public static final int TSB_42_DAYS_FIELD_NUMBER = 7;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int bitField0_;
        private int countDailyExercise_;
        private int currentWeekday_;
        private int dailyTrimpScores_;
        private PHNExerciseInfoMessage exerciseRecommendedInfo_;
        private int flagHistoricalTrimp_;
        private int flagTsbBelow20Ever_;
        private int flagTsbBelow20In10Days_;
        private int flagTsbBelow20InAWeek_;
        private int lastUpdateTimeZone_;
        private int lastUpdateTime_;
        private int minutesOver20M_;
        private int percentCompletedDailyTrimp_;
        private int percentCompletedWeekTrimp_;
        private int planStartUtc0Time_;
        private int restDay_;
        private float thelastHistoricalTrimpCtl_;
        private float thelastTrimpCtlAWeekBeforeLastWeek_;
        private float thelastTrimpCtlLastWeek_;
        private float trimpDailyMax_;
        private float trimpDailyRecommended_;
        private float trimpWeekCompleted_;
        private float trimpWeeklyRecommend_;
        private byte memoizedIsInitialized = 2;
        private String version_ = "";
        private Internal.IntList trimp42Days_ = GeneratedMessageLite.emptyIntList();
        private Internal.FloatList atl42Days_ = GeneratedMessageLite.emptyFloatList();
        private Internal.FloatList ctl42Days_ = GeneratedMessageLite.emptyFloatList();
        private Internal.FloatList tsb42Days_ = GeneratedMessageLite.emptyFloatList();

        public static final class Builder extends GeneratedMessageLite.Builder<PHNResultMessage, Builder> implements PHNResultMessageOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder addAllAtl42Days(Iterable<? extends Float> values) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addAllAtl42Days(values);
                return this;
            }

            public Builder addAllCtl42Days(Iterable<? extends Float> values) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addAllCtl42Days(values);
                return this;
            }

            public Builder addAllTrimp42Days(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addAllTrimp42Days(values);
                return this;
            }

            public Builder addAllTsb42Days(Iterable<? extends Float> values) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addAllTsb42Days(values);
                return this;
            }

            public Builder addAtl42Days(float value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addAtl42Days(value);
                return this;
            }

            public Builder addCtl42Days(float value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addCtl42Days(value);
                return this;
            }

            public Builder addTrimp42Days(int value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addTrimp42Days(value);
                return this;
            }

            public Builder addTsb42Days(float value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).addTsb42Days(value);
                return this;
            }

            public Builder clearAtl42Days() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearAtl42Days();
                return this;
            }

            public Builder clearCountDailyExercise() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearCountDailyExercise();
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

            public Builder clearDailyTrimpScores() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearDailyTrimpScores();
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

            public Builder clearPlanStartUtc0Time() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearPlanStartUtc0Time();
                return this;
            }

            public Builder clearRestDay() {
                copyOnWrite();
                ((PHNResultMessage) this.instance).clearRestDay();
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

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public float getAtl42Days(int index) {
                return ((PHNResultMessage) this.instance).getAtl42Days(index);
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
            public int getCountDailyExercise() {
                return ((PHNResultMessage) this.instance).getCountDailyExercise();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public float getCtl42Days(int index) {
                return ((PHNResultMessage) this.instance).getCtl42Days(index);
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
            public int getDailyTrimpScores() {
                return ((PHNResultMessage) this.instance).getDailyTrimpScores();
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
            public int getPlanStartUtc0Time() {
                return ((PHNResultMessage) this.instance).getPlanStartUtc0Time();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public int getRestDay() {
                return ((PHNResultMessage) this.instance).getRestDay();
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
            public int getTrimp42Days(int index) {
                return ((PHNResultMessage) this.instance).getTrimp42Days(index);
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
            public float getTsb42Days(int index) {
                return ((PHNResultMessage) this.instance).getTsb42Days(index);
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
            public boolean hasCountDailyExercise() {
                return ((PHNResultMessage) this.instance).hasCountDailyExercise();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasCurrentWeekday() {
                return ((PHNResultMessage) this.instance).hasCurrentWeekday();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasDailyTrimpScores() {
                return ((PHNResultMessage) this.instance).hasDailyTrimpScores();
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
            public boolean hasPlanStartUtc0Time() {
                return ((PHNResultMessage) this.instance).hasPlanStartUtc0Time();
            }

            @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
            public boolean hasRestDay() {
                return ((PHNResultMessage) this.instance).hasRestDay();
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

            public Builder mergeExerciseRecommendedInfo(PHNExerciseInfoMessage value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).mergeExerciseRecommendedInfo(value);
                return this;
            }

            public Builder setAtl42Days(int index, float value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setAtl42Days(index, value);
                return this;
            }

            public Builder setCountDailyExercise(int value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setCountDailyExercise(value);
                return this;
            }

            public Builder setCtl42Days(int index, float value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setCtl42Days(index, value);
                return this;
            }

            public Builder setCurrentWeekday(int value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setCurrentWeekday(value);
                return this;
            }

            public Builder setDailyTrimpScores(int value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setDailyTrimpScores(value);
                return this;
            }

            public Builder setExerciseRecommendedInfo(PHNExerciseInfoMessage value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setExerciseRecommendedInfo(value);
                return this;
            }

            public Builder setFlagHistoricalTrimp(int value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setFlagHistoricalTrimp(value);
                return this;
            }

            public Builder setFlagTsbBelow20Ever(int value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setFlagTsbBelow20Ever(value);
                return this;
            }

            public Builder setFlagTsbBelow20In10Days(int value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setFlagTsbBelow20In10Days(value);
                return this;
            }

            public Builder setFlagTsbBelow20InAWeek(int value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setFlagTsbBelow20InAWeek(value);
                return this;
            }

            public Builder setLastUpdateTime(int value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setLastUpdateTime(value);
                return this;
            }

            public Builder setLastUpdateTimeZone(int value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setLastUpdateTimeZone(value);
                return this;
            }

            public Builder setMinutesOver20M(int value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setMinutesOver20M(value);
                return this;
            }

            public Builder setPercentCompletedDailyTrimp(int value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setPercentCompletedDailyTrimp(value);
                return this;
            }

            public Builder setPercentCompletedWeekTrimp(int value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setPercentCompletedWeekTrimp(value);
                return this;
            }

            public Builder setPlanStartUtc0Time(int value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setPlanStartUtc0Time(value);
                return this;
            }

            public Builder setRestDay(int value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setRestDay(value);
                return this;
            }

            public Builder setThelastHistoricalTrimpCtl(float value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setThelastHistoricalTrimpCtl(value);
                return this;
            }

            public Builder setThelastTrimpCtlAWeekBeforeLastWeek(float value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setThelastTrimpCtlAWeekBeforeLastWeek(value);
                return this;
            }

            public Builder setThelastTrimpCtlLastWeek(float value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setThelastTrimpCtlLastWeek(value);
                return this;
            }

            public Builder setTrimp42Days(int index, int value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setTrimp42Days(index, value);
                return this;
            }

            public Builder setTrimpDailyMax(float value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setTrimpDailyMax(value);
                return this;
            }

            public Builder setTrimpDailyRecommended(float value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setTrimpDailyRecommended(value);
                return this;
            }

            public Builder setTrimpWeekCompleted(float value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setTrimpWeekCompleted(value);
                return this;
            }

            public Builder setTrimpWeeklyRecommend(float value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setTrimpWeeklyRecommend(value);
                return this;
            }

            public Builder setTsb42Days(int index, float value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setTsb42Days(index, value);
                return this;
            }

            public Builder setVersion(String value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setVersion(value);
                return this;
            }

            public Builder setVersionBytes(ByteString value) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setVersionBytes(value);
                return this;
            }

            private Builder() {
                super(PHNResultMessage.DEFAULT_INSTANCE);
            }

            public Builder setExerciseRecommendedInfo(PHNExerciseInfoMessage.Builder builderForValue) {
                copyOnWrite();
                ((PHNResultMessage) this.instance).setExerciseRecommendedInfo(builderForValue.build());
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
        public void addAllAtl42Days(Iterable<? extends Float> values) {
            ensureAtl42DaysIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.atl42Days_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCtl42Days(Iterable<? extends Float> values) {
            ensureCtl42DaysIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.ctl42Days_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTrimp42Days(Iterable<? extends Integer> values) {
            ensureTrimp42DaysIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.trimp42Days_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTsb42Days(Iterable<? extends Float> values) {
            ensureTsb42DaysIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.tsb42Days_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAtl42Days(float value) {
            ensureAtl42DaysIsMutable();
            this.atl42Days_.addFloat(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCtl42Days(float value) {
            ensureCtl42DaysIsMutable();
            this.ctl42Days_.addFloat(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrimp42Days(int value) {
            ensureTrimp42DaysIsMutable();
            this.trimp42Days_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTsb42Days(float value) {
            ensureTsb42DaysIsMutable();
            this.tsb42Days_.addFloat(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAtl42Days() {
            this.atl42Days_ = GeneratedMessageLite.emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountDailyExercise() {
            this.bitField0_ &= -2049;
            this.countDailyExercise_ = 0;
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
        public void clearDailyTrimpScores() {
            this.bitField0_ &= -3;
            this.dailyTrimpScores_ = 0;
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
        public void clearPlanStartUtc0Time() {
            this.bitField0_ &= -4194305;
            this.planStartUtc0Time_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRestDay() {
            this.bitField0_ &= -2097153;
            this.restDay_ = 0;
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

        private void ensureAtl42DaysIsMutable() {
            Internal.FloatList floatList = this.atl42Days_;
            if (floatList.isModifiable()) {
                return;
            }
            this.atl42Days_ = GeneratedMessageLite.mutableCopy(floatList);
        }

        private void ensureCtl42DaysIsMutable() {
            Internal.FloatList floatList = this.ctl42Days_;
            if (floatList.isModifiable()) {
                return;
            }
            this.ctl42Days_ = GeneratedMessageLite.mutableCopy(floatList);
        }

        private void ensureTrimp42DaysIsMutable() {
            Internal.IntList intList = this.trimp42Days_;
            if (intList.isModifiable()) {
                return;
            }
            this.trimp42Days_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureTsb42DaysIsMutable() {
            Internal.FloatList floatList = this.tsb42Days_;
            if (floatList.isModifiable()) {
                return;
            }
            this.tsb42Days_ = GeneratedMessageLite.mutableCopy(floatList);
        }

        public static PHNResultMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExerciseRecommendedInfo(PHNExerciseInfoMessage value) {
            value.getClass();
            PHNExerciseInfoMessage pHNExerciseInfoMessage = this.exerciseRecommendedInfo_;
            if (pHNExerciseInfoMessage == null || pHNExerciseInfoMessage == PHNExerciseInfoMessage.getDefaultInstance()) {
                this.exerciseRecommendedInfo_ = value;
            } else {
                this.exerciseRecommendedInfo_ = PHNExerciseInfoMessage.newBuilder(this.exerciseRecommendedInfo_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 262144;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PHNResultMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (PHNResultMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static PHNResultMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<PHNResultMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAtl42Days(int index, float value) {
            ensureAtl42DaysIsMutable();
            this.atl42Days_.setFloat(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountDailyExercise(int value) {
            this.bitField0_ |= 2048;
            this.countDailyExercise_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCtl42Days(int index, float value) {
            ensureCtl42DaysIsMutable();
            this.ctl42Days_.setFloat(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentWeekday(int value) {
            this.bitField0_ |= 8;
            this.currentWeekday_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDailyTrimpScores(int value) {
            this.bitField0_ |= 2;
            this.dailyTrimpScores_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExerciseRecommendedInfo(PHNExerciseInfoMessage value) {
            value.getClass();
            this.exerciseRecommendedInfo_ = value;
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagHistoricalTrimp(int value) {
            this.bitField0_ |= 128;
            this.flagHistoricalTrimp_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagTsbBelow20Ever(int value) {
            this.bitField0_ |= 64;
            this.flagTsbBelow20Ever_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagTsbBelow20In10Days(int value) {
            this.bitField0_ |= 32;
            this.flagTsbBelow20In10Days_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlagTsbBelow20InAWeek(int value) {
            this.bitField0_ |= 16;
            this.flagTsbBelow20InAWeek_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastUpdateTime(int value) {
            this.bitField0_ |= 524288;
            this.lastUpdateTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastUpdateTimeZone(int value) {
            this.bitField0_ |= 1048576;
            this.lastUpdateTimeZone_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinutesOver20M(int value) {
            this.bitField0_ |= 4;
            this.minutesOver20M_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPercentCompletedDailyTrimp(int value) {
            this.bitField0_ |= 131072;
            this.percentCompletedDailyTrimp_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPercentCompletedWeekTrimp(int value) {
            this.bitField0_ |= 65536;
            this.percentCompletedWeekTrimp_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlanStartUtc0Time(int value) {
            this.bitField0_ |= 4194304;
            this.planStartUtc0Time_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRestDay(int value) {
            this.bitField0_ |= 2097152;
            this.restDay_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThelastHistoricalTrimpCtl(float value) {
            this.bitField0_ |= 256;
            this.thelastHistoricalTrimpCtl_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThelastTrimpCtlAWeekBeforeLastWeek(float value) {
            this.bitField0_ |= 1024;
            this.thelastTrimpCtlAWeekBeforeLastWeek_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThelastTrimpCtlLastWeek(float value) {
            this.bitField0_ |= 512;
            this.thelastTrimpCtlLastWeek_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrimp42Days(int index, int value) {
            ensureTrimp42DaysIsMutable();
            this.trimp42Days_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrimpDailyMax(float value) {
            this.bitField0_ |= 8192;
            this.trimpDailyMax_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrimpDailyRecommended(float value) {
            this.bitField0_ |= 16384;
            this.trimpDailyRecommended_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrimpWeekCompleted(float value) {
            this.bitField0_ |= 32768;
            this.trimpWeekCompleted_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrimpWeeklyRecommend(float value) {
            this.bitField0_ |= 4096;
            this.trimpWeeklyRecommend_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTsb42Days(int index, float value) {
            ensureTsb42DaysIsMutable();
            this.tsb42Days_.setFloat(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.version_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(ByteString value) {
            this.version_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            a aVar = null;
            switch (a.a[method.ordinal()]) {
                case 1:
                    return new PHNResultMessage();
                case 2:
                    return new Builder(aVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0004\u0003\u0001ᔈ\u0000\u0002င\u0001\u0003ဋ\u0002\u0004\u0016\u0005\u0013\u0006\u0013\u0007\u0013\bဋ\u0003\tဋ\u0004\nဋ\u0005\u000bဋ\u0006\fဋ\u0007\rခ\b\u000eခ\t\u000fခ\n\u0010ဋ\u000b\u0011ခ\f\u0012ခ\r\u0013ခ\u000e\u0014ခ\u000f\u0015ဋ\u0010\u0016ဋ\u0011\u0017ဉ\u0012\u0018ᔋ\u0013\u0019ᔄ\u0014\u001aဋ\u0015\u001bဋ\u0016", new Object[]{"bitField0_", "version_", "dailyTrimpScores_", "minutesOver20M_", "trimp42Days_", "atl42Days_", "ctl42Days_", "tsb42Days_", "currentWeekday_", "flagTsbBelow20InAWeek_", "flagTsbBelow20In10Days_", "flagTsbBelow20Ever_", "flagHistoricalTrimp_", "thelastHistoricalTrimpCtl_", "thelastTrimpCtlLastWeek_", "thelastTrimpCtlAWeekBeforeLastWeek_", "countDailyExercise_", "trimpWeeklyRecommend_", "trimpDailyMax_", "trimpDailyRecommended_", "trimpWeekCompleted_", "percentCompletedWeekTrimp_", "percentCompletedDailyTrimp_", "exerciseRecommendedInfo_", "lastUpdateTime_", "lastUpdateTimeZone_", "restDay_", "planStartUtc0Time_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PHNResultMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (PHNResultMessage.class) {
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

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public float getAtl42Days(int index) {
            return this.atl42Days_.getFloat(index);
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
        public int getCountDailyExercise() {
            return this.countDailyExercise_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public float getCtl42Days(int index) {
            return this.ctl42Days_.getFloat(index);
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
        public int getDailyTrimpScores() {
            return this.dailyTrimpScores_;
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
        public int getPlanStartUtc0Time() {
            return this.planStartUtc0Time_;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public int getRestDay() {
            return this.restDay_;
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
        public int getTrimp42Days(int index) {
            return this.trimp42Days_.getInt(index);
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
        public float getTsb42Days(int index) {
            return this.tsb42Days_.getFloat(index);
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
        public boolean hasCountDailyExercise() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasCurrentWeekday() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasDailyTrimpScores() {
            return (this.bitField0_ & 2) != 0;
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
            return (this.bitField0_ & 1048576) != 0;
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
        public boolean hasPlanStartUtc0Time() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.huami.proto.Phn.PHNResultMessageOrBuilder
        public boolean hasRestDay() {
            return (this.bitField0_ & 2097152) != 0;
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

        public static Builder newBuilder(PHNResultMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static PHNResultMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PHNResultMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PHNResultMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PHNResultMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PHNResultMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PHNResultMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PHNResultMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PHNResultMessage parseFrom(InputStream input) throws IOException {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PHNResultMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PHNResultMessage parseFrom(CodedInputStream input) throws IOException {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PHNResultMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PHNResultMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface PHNResultMessageOrBuilder extends MessageLiteOrBuilder {
        float getAtl42Days(int index);

        int getAtl42DaysCount();

        List<Float> getAtl42DaysList();

        int getCountDailyExercise();

        float getCtl42Days(int index);

        int getCtl42DaysCount();

        List<Float> getCtl42DaysList();

        int getCurrentWeekday();

        int getDailyTrimpScores();

        PHNExerciseInfoMessage getExerciseRecommendedInfo();

        int getFlagHistoricalTrimp();

        int getFlagTsbBelow20Ever();

        int getFlagTsbBelow20In10Days();

        int getFlagTsbBelow20InAWeek();

        int getLastUpdateTime();

        int getLastUpdateTimeZone();

        int getMinutesOver20M();

        int getPercentCompletedDailyTrimp();

        int getPercentCompletedWeekTrimp();

        int getPlanStartUtc0Time();

        int getRestDay();

        float getThelastHistoricalTrimpCtl();

        float getThelastTrimpCtlAWeekBeforeLastWeek();

        float getThelastTrimpCtlLastWeek();

        int getTrimp42Days(int index);

        int getTrimp42DaysCount();

        List<Integer> getTrimp42DaysList();

        float getTrimpDailyMax();

        float getTrimpDailyRecommended();

        float getTrimpWeekCompleted();

        float getTrimpWeeklyRecommend();

        float getTsb42Days(int index);

        int getTsb42DaysCount();

        List<Float> getTsb42DaysList();

        String getVersion();

        ByteString getVersionBytes();

        boolean hasCountDailyExercise();

        boolean hasCurrentWeekday();

        boolean hasDailyTrimpScores();

        boolean hasExerciseRecommendedInfo();

        boolean hasFlagHistoricalTrimp();

        boolean hasFlagTsbBelow20Ever();

        boolean hasFlagTsbBelow20In10Days();

        boolean hasFlagTsbBelow20InAWeek();

        boolean hasLastUpdateTime();

        boolean hasLastUpdateTimeZone();

        boolean hasMinutesOver20M();

        boolean hasPercentCompletedDailyTrimp();

        boolean hasPercentCompletedWeekTrimp();

        boolean hasPlanStartUtc0Time();

        boolean hasRestDay();

        boolean hasThelastHistoricalTrimpCtl();

        boolean hasThelastTrimpCtlAWeekBeforeLastWeek();

        boolean hasThelastTrimpCtlLastWeek();

        boolean hasTrimpDailyMax();

        boolean hasTrimpDailyRecommended();

        boolean hasTrimpWeekCompleted();

        boolean hasTrimpWeeklyRecommend();

        boolean hasVersion();
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private Phn() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}

package com.xiaomi.hm.health.bt.proto;

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

/* JADX INFO: loaded from: classes20.dex */
public final class SportSummary2 {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.SportSummary2$1, reason: invalid class name */
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

    public static final class AltitudeMessage extends GeneratedMessageLite<AltitudeMessage, Builder> implements AltitudeMessageOrBuilder {
        public static final int AVERAGEALTITUDE_FIELD_NUMBER = 3;
        private static final AltitudeMessage DEFAULT_INSTANCE;
        public static final int ELEVATIONGAIN_FIELD_NUMBER = 5;
        public static final int ELEVATIONLOSS_FIELD_NUMBER = 6;
        public static final int HIGHESTALTITUDE_FIELD_NUMBER = 1;
        public static final int LOWESTALTITUDE_FIELD_NUMBER = 2;
        private static volatile Parser<AltitudeMessage> PARSER = null;
        public static final int TOTALCLIMBDISTANCE_FIELD_NUMBER = 4;
        private int averageAltitude_;
        private int bitField0_;
        private int elevationGain_;
        private int elevationLoss_;
        private int highestAltitude_;
        private int lowestAltitude_;
        private int totalClimbDistance_;

        public static final class Builder extends GeneratedMessageLite.Builder<AltitudeMessage, Builder> implements AltitudeMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAverageAltitude() {
                copyOnWrite();
                ((AltitudeMessage) this.instance).clearAverageAltitude();
                return this;
            }

            public Builder clearElevationGain() {
                copyOnWrite();
                ((AltitudeMessage) this.instance).clearElevationGain();
                return this;
            }

            public Builder clearElevationLoss() {
                copyOnWrite();
                ((AltitudeMessage) this.instance).clearElevationLoss();
                return this;
            }

            public Builder clearHighestAltitude() {
                copyOnWrite();
                ((AltitudeMessage) this.instance).clearHighestAltitude();
                return this;
            }

            public Builder clearLowestAltitude() {
                copyOnWrite();
                ((AltitudeMessage) this.instance).clearLowestAltitude();
                return this;
            }

            public Builder clearTotalClimbDistance() {
                copyOnWrite();
                ((AltitudeMessage) this.instance).clearTotalClimbDistance();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
            public int getAverageAltitude() {
                return ((AltitudeMessage) this.instance).getAverageAltitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
            public int getElevationGain() {
                return ((AltitudeMessage) this.instance).getElevationGain();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
            public int getElevationLoss() {
                return ((AltitudeMessage) this.instance).getElevationLoss();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
            public int getHighestAltitude() {
                return ((AltitudeMessage) this.instance).getHighestAltitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
            public int getLowestAltitude() {
                return ((AltitudeMessage) this.instance).getLowestAltitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
            public int getTotalClimbDistance() {
                return ((AltitudeMessage) this.instance).getTotalClimbDistance();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
            public boolean hasAverageAltitude() {
                return ((AltitudeMessage) this.instance).hasAverageAltitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
            public boolean hasElevationGain() {
                return ((AltitudeMessage) this.instance).hasElevationGain();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
            public boolean hasElevationLoss() {
                return ((AltitudeMessage) this.instance).hasElevationLoss();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
            public boolean hasHighestAltitude() {
                return ((AltitudeMessage) this.instance).hasHighestAltitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
            public boolean hasLowestAltitude() {
                return ((AltitudeMessage) this.instance).hasLowestAltitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
            public boolean hasTotalClimbDistance() {
                return ((AltitudeMessage) this.instance).hasTotalClimbDistance();
            }

            public Builder setAverageAltitude(int value) {
                copyOnWrite();
                ((AltitudeMessage) this.instance).setAverageAltitude(value);
                return this;
            }

            public Builder setElevationGain(int value) {
                copyOnWrite();
                ((AltitudeMessage) this.instance).setElevationGain(value);
                return this;
            }

            public Builder setElevationLoss(int value) {
                copyOnWrite();
                ((AltitudeMessage) this.instance).setElevationLoss(value);
                return this;
            }

            public Builder setHighestAltitude(int value) {
                copyOnWrite();
                ((AltitudeMessage) this.instance).setHighestAltitude(value);
                return this;
            }

            public Builder setLowestAltitude(int value) {
                copyOnWrite();
                ((AltitudeMessage) this.instance).setLowestAltitude(value);
                return this;
            }

            public Builder setTotalClimbDistance(int value) {
                copyOnWrite();
                ((AltitudeMessage) this.instance).setTotalClimbDistance(value);
                return this;
            }

            private Builder() {
                super(AltitudeMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            AltitudeMessage altitudeMessage = new AltitudeMessage();
            DEFAULT_INSTANCE = altitudeMessage;
            GeneratedMessageLite.registerDefaultInstance(AltitudeMessage.class, altitudeMessage);
        }

        private AltitudeMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageAltitude() {
            this.bitField0_ &= -5;
            this.averageAltitude_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearElevationGain() {
            this.bitField0_ &= -17;
            this.elevationGain_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearElevationLoss() {
            this.bitField0_ &= -33;
            this.elevationLoss_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHighestAltitude() {
            this.bitField0_ &= -2;
            this.highestAltitude_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLowestAltitude() {
            this.bitField0_ &= -3;
            this.lowestAltitude_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalClimbDistance() {
            this.bitField0_ &= -9;
            this.totalClimbDistance_ = 0;
        }

        public static AltitudeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AltitudeMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (AltitudeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static AltitudeMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<AltitudeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageAltitude(int value) {
            this.bitField0_ |= 4;
            this.averageAltitude_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setElevationGain(int value) {
            this.bitField0_ |= 16;
            this.elevationGain_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setElevationLoss(int value) {
            this.bitField0_ |= 32;
            this.elevationLoss_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHighestAltitude(int value) {
            this.bitField0_ |= 1;
            this.highestAltitude_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLowestAltitude(int value) {
            this.bitField0_ |= 2;
            this.lowestAltitude_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalClimbDistance(int value) {
            this.bitField0_ |= 8;
            this.totalClimbDistance_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new AltitudeMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဏ\u0000\u0002ဏ\u0001\u0003ဏ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005", new Object[]{"bitField0_", "highestAltitude_", "lowestAltitude_", "averageAltitude_", "totalClimbDistance_", "elevationGain_", "elevationLoss_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AltitudeMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AltitudeMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
        public int getAverageAltitude() {
            return this.averageAltitude_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
        public int getElevationGain() {
            return this.elevationGain_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
        public int getElevationLoss() {
            return this.elevationLoss_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
        public int getHighestAltitude() {
            return this.highestAltitude_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
        public int getLowestAltitude() {
            return this.lowestAltitude_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
        public int getTotalClimbDistance() {
            return this.totalClimbDistance_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
        public boolean hasAverageAltitude() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
        public boolean hasElevationGain() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
        public boolean hasElevationLoss() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
        public boolean hasHighestAltitude() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
        public boolean hasLowestAltitude() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.AltitudeMessageOrBuilder
        public boolean hasTotalClimbDistance() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(AltitudeMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static AltitudeMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AltitudeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static AltitudeMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static AltitudeMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static AltitudeMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static AltitudeMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static AltitudeMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static AltitudeMessage parseFrom(InputStream input) throws IOException {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static AltitudeMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static AltitudeMessage parseFrom(CodedInputStream input) throws IOException {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static AltitudeMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AltitudeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface AltitudeMessageOrBuilder extends MessageLiteOrBuilder {
        int getAverageAltitude();

        int getElevationGain();

        int getElevationLoss();

        int getHighestAltitude();

        int getLowestAltitude();

        int getTotalClimbDistance();

        boolean hasAverageAltitude();

        boolean hasElevationGain();

        boolean hasElevationLoss();

        boolean hasHighestAltitude();

        boolean hasLowestAltitude();

        boolean hasTotalClimbDistance();
    }

    public static final class CaloriesMessage extends GeneratedMessageLite<CaloriesMessage, Builder> implements CaloriesMessageOrBuilder {
        public static final int CAL_FIELD_NUMBER = 1;
        private static final CaloriesMessage DEFAULT_INSTANCE;
        private static volatile Parser<CaloriesMessage> PARSER;
        private int bitField0_;
        private int cal_;

        public static final class Builder extends GeneratedMessageLite.Builder<CaloriesMessage, Builder> implements CaloriesMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCal() {
                copyOnWrite();
                ((CaloriesMessage) this.instance).clearCal();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.CaloriesMessageOrBuilder
            public int getCal() {
                return ((CaloriesMessage) this.instance).getCal();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.CaloriesMessageOrBuilder
            public boolean hasCal() {
                return ((CaloriesMessage) this.instance).hasCal();
            }

            public Builder setCal(int value) {
                copyOnWrite();
                ((CaloriesMessage) this.instance).setCal(value);
                return this;
            }

            private Builder() {
                super(CaloriesMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            CaloriesMessage caloriesMessage = new CaloriesMessage();
            DEFAULT_INSTANCE = caloriesMessage;
            GeneratedMessageLite.registerDefaultInstance(CaloriesMessage.class, caloriesMessage);
        }

        private CaloriesMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCal() {
            this.bitField0_ &= -2;
            this.cal_ = 0;
        }

        public static CaloriesMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CaloriesMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (CaloriesMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static CaloriesMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<CaloriesMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCal(int value) {
            this.bitField0_ |= 1;
            this.cal_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new CaloriesMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"bitField0_", "cal_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CaloriesMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (CaloriesMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.CaloriesMessageOrBuilder
        public int getCal() {
            return this.cal_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.CaloriesMessageOrBuilder
        public boolean hasCal() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(CaloriesMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static CaloriesMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CaloriesMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CaloriesMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CaloriesMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CaloriesMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CaloriesMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CaloriesMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CaloriesMessage parseFrom(InputStream input) throws IOException {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CaloriesMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CaloriesMessage parseFrom(CodedInputStream input) throws IOException {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CaloriesMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CaloriesMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface CaloriesMessageOrBuilder extends MessageLiteOrBuilder {
        int getCal();

        boolean hasCal();
    }

    public static final class ChartMessage extends GeneratedMessageLite<ChartMessage, Builder> implements ChartMessageOrBuilder {
        public static final int ALTITUDE_FIELD_NUMBER = 4;
        private static final ChartMessage DEFAULT_INSTANCE;
        public static final int GPS_FIELD_NUMBER = 5;
        public static final int HR_FIELD_NUMBER = 1;
        public static final int PACE_FIELD_NUMBER = 3;
        private static volatile Parser<ChartMessage> PARSER = null;
        public static final int SPEED_FIELD_NUMBER = 2;
        public static final int TEMP_FIELD_NUMBER = 6;
        private boolean altitude_;
        private int bitField0_;
        private boolean gps_;
        private boolean hr_;
        private boolean pace_;
        private boolean speed_;
        private boolean temp_;

        public static final class Builder extends GeneratedMessageLite.Builder<ChartMessage, Builder> implements ChartMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAltitude() {
                copyOnWrite();
                ((ChartMessage) this.instance).clearAltitude();
                return this;
            }

            public Builder clearGps() {
                copyOnWrite();
                ((ChartMessage) this.instance).clearGps();
                return this;
            }

            public Builder clearHr() {
                copyOnWrite();
                ((ChartMessage) this.instance).clearHr();
                return this;
            }

            public Builder clearPace() {
                copyOnWrite();
                ((ChartMessage) this.instance).clearPace();
                return this;
            }

            public Builder clearSpeed() {
                copyOnWrite();
                ((ChartMessage) this.instance).clearSpeed();
                return this;
            }

            public Builder clearTemp() {
                copyOnWrite();
                ((ChartMessage) this.instance).clearTemp();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
            public boolean getAltitude() {
                return ((ChartMessage) this.instance).getAltitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
            public boolean getGps() {
                return ((ChartMessage) this.instance).getGps();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
            public boolean getHr() {
                return ((ChartMessage) this.instance).getHr();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
            public boolean getPace() {
                return ((ChartMessage) this.instance).getPace();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
            public boolean getSpeed() {
                return ((ChartMessage) this.instance).getSpeed();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
            public boolean getTemp() {
                return ((ChartMessage) this.instance).getTemp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
            public boolean hasAltitude() {
                return ((ChartMessage) this.instance).hasAltitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
            public boolean hasGps() {
                return ((ChartMessage) this.instance).hasGps();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
            public boolean hasHr() {
                return ((ChartMessage) this.instance).hasHr();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
            public boolean hasPace() {
                return ((ChartMessage) this.instance).hasPace();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
            public boolean hasSpeed() {
                return ((ChartMessage) this.instance).hasSpeed();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
            public boolean hasTemp() {
                return ((ChartMessage) this.instance).hasTemp();
            }

            public Builder setAltitude(boolean value) {
                copyOnWrite();
                ((ChartMessage) this.instance).setAltitude(value);
                return this;
            }

            public Builder setGps(boolean value) {
                copyOnWrite();
                ((ChartMessage) this.instance).setGps(value);
                return this;
            }

            public Builder setHr(boolean value) {
                copyOnWrite();
                ((ChartMessage) this.instance).setHr(value);
                return this;
            }

            public Builder setPace(boolean value) {
                copyOnWrite();
                ((ChartMessage) this.instance).setPace(value);
                return this;
            }

            public Builder setSpeed(boolean value) {
                copyOnWrite();
                ((ChartMessage) this.instance).setSpeed(value);
                return this;
            }

            public Builder setTemp(boolean value) {
                copyOnWrite();
                ((ChartMessage) this.instance).setTemp(value);
                return this;
            }

            private Builder() {
                super(ChartMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            ChartMessage chartMessage = new ChartMessage();
            DEFAULT_INSTANCE = chartMessage;
            GeneratedMessageLite.registerDefaultInstance(ChartMessage.class, chartMessage);
        }

        private ChartMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAltitude() {
            this.bitField0_ &= -9;
            this.altitude_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGps() {
            this.bitField0_ &= -17;
            this.gps_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHr() {
            this.bitField0_ &= -2;
            this.hr_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPace() {
            this.bitField0_ &= -5;
            this.pace_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpeed() {
            this.bitField0_ &= -3;
            this.speed_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemp() {
            this.bitField0_ &= -33;
            this.temp_ = false;
        }

        public static ChartMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ChartMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (ChartMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ChartMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<ChartMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAltitude(boolean value) {
            this.bitField0_ |= 8;
            this.altitude_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGps(boolean value) {
            this.bitField0_ |= 16;
            this.gps_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHr(boolean value) {
            this.bitField0_ |= 1;
            this.hr_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPace(boolean value) {
            this.bitField0_ |= 4;
            this.pace_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpeed(boolean value) {
            this.bitField0_ |= 2;
            this.speed_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemp(boolean value) {
            this.bitField0_ |= 32;
            this.temp_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new ChartMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "hr_", "speed_", "pace_", "altitude_", "gps_", "temp_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ChartMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ChartMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
        public boolean getAltitude() {
            return this.altitude_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
        public boolean getGps() {
            return this.gps_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
        public boolean getHr() {
            return this.hr_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
        public boolean getPace() {
            return this.pace_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
        public boolean getSpeed() {
            return this.speed_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
        public boolean getTemp() {
            return this.temp_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
        public boolean hasAltitude() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
        public boolean hasGps() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
        public boolean hasHr() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
        public boolean hasPace() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
        public boolean hasSpeed() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.ChartMessageOrBuilder
        public boolean hasTemp() {
            return (this.bitField0_ & 32) != 0;
        }

        public static Builder newBuilder(ChartMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static ChartMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ChartMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ChartMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ChartMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ChartMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ChartMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ChartMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ChartMessage parseFrom(InputStream input) throws IOException {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ChartMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ChartMessage parseFrom(CodedInputStream input) throws IOException {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ChartMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface ChartMessageOrBuilder extends MessageLiteOrBuilder {
        boolean getAltitude();

        boolean getGps();

        boolean getHr();

        boolean getPace();

        boolean getSpeed();

        boolean getTemp();

        boolean hasAltitude();

        boolean hasGps();

        boolean hasHr();

        boolean hasPace();

        boolean hasSpeed();

        boolean hasTemp();
    }

    public static final class DistanceMessage extends GeneratedMessageLite<DistanceMessage, Builder> implements DistanceMessageOrBuilder {
        private static final DistanceMessage DEFAULT_INSTANCE;
        public static final int DISTANCE_FIELD_NUMBER = 1;
        private static volatile Parser<DistanceMessage> PARSER;
        private int bitField0_;
        private float distance_;

        public static final class Builder extends GeneratedMessageLite.Builder<DistanceMessage, Builder> implements DistanceMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDistance() {
                copyOnWrite();
                ((DistanceMessage) this.instance).clearDistance();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DistanceMessageOrBuilder
            public float getDistance() {
                return ((DistanceMessage) this.instance).getDistance();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DistanceMessageOrBuilder
            public boolean hasDistance() {
                return ((DistanceMessage) this.instance).hasDistance();
            }

            public Builder setDistance(float value) {
                copyOnWrite();
                ((DistanceMessage) this.instance).setDistance(value);
                return this;
            }

            private Builder() {
                super(DistanceMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            DistanceMessage distanceMessage = new DistanceMessage();
            DEFAULT_INSTANCE = distanceMessage;
            GeneratedMessageLite.registerDefaultInstance(DistanceMessage.class, distanceMessage);
        }

        private DistanceMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDistance() {
            this.bitField0_ &= -2;
            this.distance_ = 0.0f;
        }

        public static DistanceMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DistanceMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (DistanceMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static DistanceMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<DistanceMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDistance(float value) {
            this.bitField0_ |= 1;
            this.distance_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new DistanceMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"bitField0_", "distance_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DistanceMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DistanceMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DistanceMessageOrBuilder
        public float getDistance() {
            return this.distance_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DistanceMessageOrBuilder
        public boolean hasDistance() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(DistanceMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static DistanceMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DistanceMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DistanceMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DistanceMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DistanceMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DistanceMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DistanceMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DistanceMessage parseFrom(InputStream input) throws IOException {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DistanceMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DistanceMessage parseFrom(CodedInputStream input) throws IOException {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DistanceMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DistanceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface DistanceMessageOrBuilder extends MessageLiteOrBuilder {
        float getDistance();

        boolean hasDistance();
    }

    public static final class DownhillMessage extends GeneratedMessageLite<DownhillMessage, Builder> implements DownhillMessageOrBuilder {
        private static final DownhillMessage DEFAULT_INSTANCE;
        public static final int MAXIMUMDOWNHILLDROP_FIELD_NUMBER = 3;
        private static volatile Parser<DownhillMessage> PARSER = null;
        public static final int TIMESOFDOWNHILL_FIELD_NUMBER = 1;
        public static final int TOTALDISTANCEOFDOWNHILL_FIELD_NUMBER = 2;
        public static final int TOTALDOWNHILLDROP_FIELD_NUMBER = 4;
        private int bitField0_;
        private int maximumDownhillDrop_;
        private int timesOfDownhill_;
        private int totalDistanceOfDownhill_;
        private int totalDownhillDrop_;

        public static final class Builder extends GeneratedMessageLite.Builder<DownhillMessage, Builder> implements DownhillMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearMaximumDownhillDrop() {
                copyOnWrite();
                ((DownhillMessage) this.instance).clearMaximumDownhillDrop();
                return this;
            }

            public Builder clearTimesOfDownhill() {
                copyOnWrite();
                ((DownhillMessage) this.instance).clearTimesOfDownhill();
                return this;
            }

            public Builder clearTotalDistanceOfDownhill() {
                copyOnWrite();
                ((DownhillMessage) this.instance).clearTotalDistanceOfDownhill();
                return this;
            }

            public Builder clearTotalDownhillDrop() {
                copyOnWrite();
                ((DownhillMessage) this.instance).clearTotalDownhillDrop();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DownhillMessageOrBuilder
            public int getMaximumDownhillDrop() {
                return ((DownhillMessage) this.instance).getMaximumDownhillDrop();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DownhillMessageOrBuilder
            public int getTimesOfDownhill() {
                return ((DownhillMessage) this.instance).getTimesOfDownhill();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DownhillMessageOrBuilder
            public int getTotalDistanceOfDownhill() {
                return ((DownhillMessage) this.instance).getTotalDistanceOfDownhill();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DownhillMessageOrBuilder
            public int getTotalDownhillDrop() {
                return ((DownhillMessage) this.instance).getTotalDownhillDrop();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DownhillMessageOrBuilder
            public boolean hasMaximumDownhillDrop() {
                return ((DownhillMessage) this.instance).hasMaximumDownhillDrop();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DownhillMessageOrBuilder
            public boolean hasTimesOfDownhill() {
                return ((DownhillMessage) this.instance).hasTimesOfDownhill();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DownhillMessageOrBuilder
            public boolean hasTotalDistanceOfDownhill() {
                return ((DownhillMessage) this.instance).hasTotalDistanceOfDownhill();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DownhillMessageOrBuilder
            public boolean hasTotalDownhillDrop() {
                return ((DownhillMessage) this.instance).hasTotalDownhillDrop();
            }

            public Builder setMaximumDownhillDrop(int value) {
                copyOnWrite();
                ((DownhillMessage) this.instance).setMaximumDownhillDrop(value);
                return this;
            }

            public Builder setTimesOfDownhill(int value) {
                copyOnWrite();
                ((DownhillMessage) this.instance).setTimesOfDownhill(value);
                return this;
            }

            public Builder setTotalDistanceOfDownhill(int value) {
                copyOnWrite();
                ((DownhillMessage) this.instance).setTotalDistanceOfDownhill(value);
                return this;
            }

            public Builder setTotalDownhillDrop(int value) {
                copyOnWrite();
                ((DownhillMessage) this.instance).setTotalDownhillDrop(value);
                return this;
            }

            private Builder() {
                super(DownhillMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            DownhillMessage downhillMessage = new DownhillMessage();
            DEFAULT_INSTANCE = downhillMessage;
            GeneratedMessageLite.registerDefaultInstance(DownhillMessage.class, downhillMessage);
        }

        private DownhillMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaximumDownhillDrop() {
            this.bitField0_ &= -5;
            this.maximumDownhillDrop_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimesOfDownhill() {
            this.bitField0_ &= -2;
            this.timesOfDownhill_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalDistanceOfDownhill() {
            this.bitField0_ &= -3;
            this.totalDistanceOfDownhill_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalDownhillDrop() {
            this.bitField0_ &= -9;
            this.totalDownhillDrop_ = 0;
        }

        public static DownhillMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DownhillMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (DownhillMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static DownhillMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<DownhillMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumDownhillDrop(int value) {
            this.bitField0_ |= 4;
            this.maximumDownhillDrop_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimesOfDownhill(int value) {
            this.bitField0_ |= 1;
            this.timesOfDownhill_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalDistanceOfDownhill(int value) {
            this.bitField0_ |= 2;
            this.totalDistanceOfDownhill_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalDownhillDrop(int value) {
            this.bitField0_ |= 8;
            this.totalDownhillDrop_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new DownhillMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "timesOfDownhill_", "totalDistanceOfDownhill_", "maximumDownhillDrop_", "totalDownhillDrop_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DownhillMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DownhillMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DownhillMessageOrBuilder
        public int getMaximumDownhillDrop() {
            return this.maximumDownhillDrop_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DownhillMessageOrBuilder
        public int getTimesOfDownhill() {
            return this.timesOfDownhill_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DownhillMessageOrBuilder
        public int getTotalDistanceOfDownhill() {
            return this.totalDistanceOfDownhill_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DownhillMessageOrBuilder
        public int getTotalDownhillDrop() {
            return this.totalDownhillDrop_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DownhillMessageOrBuilder
        public boolean hasMaximumDownhillDrop() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DownhillMessageOrBuilder
        public boolean hasTimesOfDownhill() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DownhillMessageOrBuilder
        public boolean hasTotalDistanceOfDownhill() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.DownhillMessageOrBuilder
        public boolean hasTotalDownhillDrop() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(DownhillMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static DownhillMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DownhillMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DownhillMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DownhillMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DownhillMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DownhillMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DownhillMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DownhillMessage parseFrom(InputStream input) throws IOException {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DownhillMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DownhillMessage parseFrom(CodedInputStream input) throws IOException {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DownhillMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DownhillMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface DownhillMessageOrBuilder extends MessageLiteOrBuilder {
        int getMaximumDownhillDrop();

        int getTimesOfDownhill();

        int getTotalDistanceOfDownhill();

        int getTotalDownhillDrop();

        boolean hasMaximumDownhillDrop();

        boolean hasTimesOfDownhill();

        boolean hasTotalDistanceOfDownhill();

        boolean hasTotalDownhillDrop();
    }

    public static final class FloorsMessage extends GeneratedMessageLite<FloorsMessage, Builder> implements FloorsMessageOrBuilder {
        public static final int AVERAGEFLOORSCLIMBEDPERMINUTE_FIELD_NUMBER = 5;
        private static final FloorsMessage DEFAULT_INSTANCE;
        public static final int DOWNSTAIRFLOORS_FIELD_NUMBER = 2;
        public static final int DOWNSTAIRHEIGHT_FIELD_NUMBER = 4;
        private static volatile Parser<FloorsMessage> PARSER = null;
        public static final int UPSTAIRFLOORS_FIELD_NUMBER = 1;
        public static final int UPSTAIRHEIGHT_FIELD_NUMBER = 3;
        private float averageFloorsClimbedPerMinute_;
        private int bitField0_;
        private int downstairFloors_;
        private float downstairHeight_;
        private int upstairFloors_;
        private float upstairHeight_;

        public static final class Builder extends GeneratedMessageLite.Builder<FloorsMessage, Builder> implements FloorsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAverageFloorsClimbedPerMinute() {
                copyOnWrite();
                ((FloorsMessage) this.instance).clearAverageFloorsClimbedPerMinute();
                return this;
            }

            public Builder clearDownstairFloors() {
                copyOnWrite();
                ((FloorsMessage) this.instance).clearDownstairFloors();
                return this;
            }

            public Builder clearDownstairHeight() {
                copyOnWrite();
                ((FloorsMessage) this.instance).clearDownstairHeight();
                return this;
            }

            public Builder clearUpstairFloors() {
                copyOnWrite();
                ((FloorsMessage) this.instance).clearUpstairFloors();
                return this;
            }

            public Builder clearUpstairHeight() {
                copyOnWrite();
                ((FloorsMessage) this.instance).clearUpstairHeight();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
            public float getAverageFloorsClimbedPerMinute() {
                return ((FloorsMessage) this.instance).getAverageFloorsClimbedPerMinute();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
            public int getDownstairFloors() {
                return ((FloorsMessage) this.instance).getDownstairFloors();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
            public float getDownstairHeight() {
                return ((FloorsMessage) this.instance).getDownstairHeight();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
            public int getUpstairFloors() {
                return ((FloorsMessage) this.instance).getUpstairFloors();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
            public float getUpstairHeight() {
                return ((FloorsMessage) this.instance).getUpstairHeight();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
            public boolean hasAverageFloorsClimbedPerMinute() {
                return ((FloorsMessage) this.instance).hasAverageFloorsClimbedPerMinute();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
            public boolean hasDownstairFloors() {
                return ((FloorsMessage) this.instance).hasDownstairFloors();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
            public boolean hasDownstairHeight() {
                return ((FloorsMessage) this.instance).hasDownstairHeight();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
            public boolean hasUpstairFloors() {
                return ((FloorsMessage) this.instance).hasUpstairFloors();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
            public boolean hasUpstairHeight() {
                return ((FloorsMessage) this.instance).hasUpstairHeight();
            }

            public Builder setAverageFloorsClimbedPerMinute(float value) {
                copyOnWrite();
                ((FloorsMessage) this.instance).setAverageFloorsClimbedPerMinute(value);
                return this;
            }

            public Builder setDownstairFloors(int value) {
                copyOnWrite();
                ((FloorsMessage) this.instance).setDownstairFloors(value);
                return this;
            }

            public Builder setDownstairHeight(float value) {
                copyOnWrite();
                ((FloorsMessage) this.instance).setDownstairHeight(value);
                return this;
            }

            public Builder setUpstairFloors(int value) {
                copyOnWrite();
                ((FloorsMessage) this.instance).setUpstairFloors(value);
                return this;
            }

            public Builder setUpstairHeight(float value) {
                copyOnWrite();
                ((FloorsMessage) this.instance).setUpstairHeight(value);
                return this;
            }

            private Builder() {
                super(FloorsMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            FloorsMessage floorsMessage = new FloorsMessage();
            DEFAULT_INSTANCE = floorsMessage;
            GeneratedMessageLite.registerDefaultInstance(FloorsMessage.class, floorsMessage);
        }

        private FloorsMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageFloorsClimbedPerMinute() {
            this.bitField0_ &= -17;
            this.averageFloorsClimbedPerMinute_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDownstairFloors() {
            this.bitField0_ &= -3;
            this.downstairFloors_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDownstairHeight() {
            this.bitField0_ &= -9;
            this.downstairHeight_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpstairFloors() {
            this.bitField0_ &= -2;
            this.upstairFloors_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpstairHeight() {
            this.bitField0_ &= -5;
            this.upstairHeight_ = 0.0f;
        }

        public static FloorsMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FloorsMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (FloorsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static FloorsMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<FloorsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageFloorsClimbedPerMinute(float value) {
            this.bitField0_ |= 16;
            this.averageFloorsClimbedPerMinute_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDownstairFloors(int value) {
            this.bitField0_ |= 2;
            this.downstairFloors_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDownstairHeight(float value) {
            this.bitField0_ |= 8;
            this.downstairHeight_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpstairFloors(int value) {
            this.bitField0_ |= 1;
            this.upstairFloors_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpstairHeight(float value) {
            this.bitField0_ |= 4;
            this.upstairHeight_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new FloorsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"bitField0_", "upstairFloors_", "downstairFloors_", "upstairHeight_", "downstairHeight_", "averageFloorsClimbedPerMinute_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FloorsMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (FloorsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
        public float getAverageFloorsClimbedPerMinute() {
            return this.averageFloorsClimbedPerMinute_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
        public int getDownstairFloors() {
            return this.downstairFloors_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
        public float getDownstairHeight() {
            return this.downstairHeight_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
        public int getUpstairFloors() {
            return this.upstairFloors_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
        public float getUpstairHeight() {
            return this.upstairHeight_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
        public boolean hasAverageFloorsClimbedPerMinute() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
        public boolean hasDownstairFloors() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
        public boolean hasDownstairHeight() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
        public boolean hasUpstairFloors() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FloorsMessageOrBuilder
        public boolean hasUpstairHeight() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(FloorsMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static FloorsMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FloorsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FloorsMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FloorsMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FloorsMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FloorsMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FloorsMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FloorsMessage parseFrom(InputStream input) throws IOException {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FloorsMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FloorsMessage parseFrom(CodedInputStream input) throws IOException {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FloorsMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FloorsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface FloorsMessageOrBuilder extends MessageLiteOrBuilder {
        float getAverageFloorsClimbedPerMinute();

        int getDownstairFloors();

        float getDownstairHeight();

        int getUpstairFloors();

        float getUpstairHeight();

        boolean hasAverageFloorsClimbedPerMinute();

        boolean hasDownstairFloors();

        boolean hasDownstairHeight();

        boolean hasUpstairFloors();

        boolean hasUpstairHeight();
    }

    public static final class FrequencyMessage extends GeneratedMessageLite<FrequencyMessage, Builder> implements FrequencyMessageOrBuilder {
        public static final int AVERAGEFREQUENCY_FIELD_NUMBER = 1;
        private static final FrequencyMessage DEFAULT_INSTANCE;
        public static final int HIGHESTFREQUENCY_FIELD_NUMBER = 2;
        private static volatile Parser<FrequencyMessage> PARSER;
        private int averageFrequency_;
        private int bitField0_;
        private int highestFrequency_;

        public static final class Builder extends GeneratedMessageLite.Builder<FrequencyMessage, Builder> implements FrequencyMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAverageFrequency() {
                copyOnWrite();
                ((FrequencyMessage) this.instance).clearAverageFrequency();
                return this;
            }

            public Builder clearHighestFrequency() {
                copyOnWrite();
                ((FrequencyMessage) this.instance).clearHighestFrequency();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FrequencyMessageOrBuilder
            public int getAverageFrequency() {
                return ((FrequencyMessage) this.instance).getAverageFrequency();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FrequencyMessageOrBuilder
            public int getHighestFrequency() {
                return ((FrequencyMessage) this.instance).getHighestFrequency();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FrequencyMessageOrBuilder
            public boolean hasAverageFrequency() {
                return ((FrequencyMessage) this.instance).hasAverageFrequency();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FrequencyMessageOrBuilder
            public boolean hasHighestFrequency() {
                return ((FrequencyMessage) this.instance).hasHighestFrequency();
            }

            public Builder setAverageFrequency(int value) {
                copyOnWrite();
                ((FrequencyMessage) this.instance).setAverageFrequency(value);
                return this;
            }

            public Builder setHighestFrequency(int value) {
                copyOnWrite();
                ((FrequencyMessage) this.instance).setHighestFrequency(value);
                return this;
            }

            private Builder() {
                super(FrequencyMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            FrequencyMessage frequencyMessage = new FrequencyMessage();
            DEFAULT_INSTANCE = frequencyMessage;
            GeneratedMessageLite.registerDefaultInstance(FrequencyMessage.class, frequencyMessage);
        }

        private FrequencyMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageFrequency() {
            this.bitField0_ &= -2;
            this.averageFrequency_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHighestFrequency() {
            this.bitField0_ &= -3;
            this.highestFrequency_ = 0;
        }

        public static FrequencyMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FrequencyMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (FrequencyMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static FrequencyMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<FrequencyMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageFrequency(int value) {
            this.bitField0_ |= 1;
            this.averageFrequency_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHighestFrequency(int value) {
            this.bitField0_ |= 2;
            this.highestFrequency_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new FrequencyMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "averageFrequency_", "highestFrequency_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FrequencyMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (FrequencyMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FrequencyMessageOrBuilder
        public int getAverageFrequency() {
            return this.averageFrequency_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FrequencyMessageOrBuilder
        public int getHighestFrequency() {
            return this.highestFrequency_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FrequencyMessageOrBuilder
        public boolean hasAverageFrequency() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.FrequencyMessageOrBuilder
        public boolean hasHighestFrequency() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(FrequencyMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static FrequencyMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FrequencyMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FrequencyMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FrequencyMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FrequencyMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FrequencyMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FrequencyMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FrequencyMessage parseFrom(InputStream input) throws IOException {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FrequencyMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FrequencyMessage parseFrom(CodedInputStream input) throws IOException {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FrequencyMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FrequencyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface FrequencyMessageOrBuilder extends MessageLiteOrBuilder {
        int getAverageFrequency();

        int getHighestFrequency();

        boolean hasAverageFrequency();

        boolean hasHighestFrequency();
    }

    public static final class GoalMessage extends GeneratedMessageLite<GoalMessage, Builder> implements GoalMessageOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final GoalMessage DEFAULT_INSTANCE;
        private static volatile Parser<GoalMessage> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private float data_;
        private byte memoizedIsInitialized = 2;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.Builder<GoalMessage, Builder> implements GoalMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearData() {
                copyOnWrite();
                ((GoalMessage) this.instance).clearData();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((GoalMessage) this.instance).clearType();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GoalMessageOrBuilder
            public float getData() {
                return ((GoalMessage) this.instance).getData();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GoalMessageOrBuilder
            public int getType() {
                return ((GoalMessage) this.instance).getType();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GoalMessageOrBuilder
            public boolean hasData() {
                return ((GoalMessage) this.instance).hasData();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GoalMessageOrBuilder
            public boolean hasType() {
                return ((GoalMessage) this.instance).hasType();
            }

            public Builder setData(float value) {
                copyOnWrite();
                ((GoalMessage) this.instance).setData(value);
                return this;
            }

            public Builder setType(int value) {
                copyOnWrite();
                ((GoalMessage) this.instance).setType(value);
                return this;
            }

            private Builder() {
                super(GoalMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            GoalMessage goalMessage = new GoalMessage();
            DEFAULT_INSTANCE = goalMessage;
            GeneratedMessageLite.registerDefaultInstance(GoalMessage.class, goalMessage);
        }

        private GoalMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -3;
            this.data_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static GoalMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GoalMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (GoalMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static GoalMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<GoalMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(float value) {
            this.bitField0_ |= 2;
            this.data_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new GoalMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔋ\u0000\u0002ᔁ\u0001", new Object[]{"bitField0_", "type_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<GoalMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (GoalMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GoalMessageOrBuilder
        public float getData() {
            return this.data_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GoalMessageOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GoalMessageOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GoalMessageOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(GoalMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static GoalMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoalMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static GoalMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static GoalMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static GoalMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static GoalMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static GoalMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static GoalMessage parseFrom(InputStream input) throws IOException {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static GoalMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static GoalMessage parseFrom(CodedInputStream input) throws IOException {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static GoalMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface GoalMessageOrBuilder extends MessageLiteOrBuilder {
        float getData();

        int getType();

        boolean hasData();

        boolean hasType();
    }

    public static final class GolfMessage extends GeneratedMessageLite<GolfMessage, Builder> implements GolfMessageOrBuilder {
        public static final int AVERAGEANGLE_FIELD_NUMBER = 7;
        public static final int AVERAGEBEAT_FIELD_NUMBER = 2;
        public static final int AVERAGEDOWNTIME_FIELD_NUMBER = 4;
        public static final int AVERAGESCORE_FIELD_NUMBER = 6;
        public static final int AVERAGEUPTIME_FIELD_NUMBER = 3;
        private static final GolfMessage DEFAULT_INSTANCE;
        private static volatile Parser<GolfMessage> PARSER = null;
        public static final int TOTALSWINGS_FIELD_NUMBER = 1;
        private int averageAngle_;
        private float averageBeat_;
        private float averageDownTime_;
        private int averageScore_;
        private float averageUpTime_;
        private int bitField0_;
        private int totalSwings_;

        public static final class Builder extends GeneratedMessageLite.Builder<GolfMessage, Builder> implements GolfMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAverageAngle() {
                copyOnWrite();
                ((GolfMessage) this.instance).clearAverageAngle();
                return this;
            }

            public Builder clearAverageBeat() {
                copyOnWrite();
                ((GolfMessage) this.instance).clearAverageBeat();
                return this;
            }

            public Builder clearAverageDownTime() {
                copyOnWrite();
                ((GolfMessage) this.instance).clearAverageDownTime();
                return this;
            }

            public Builder clearAverageScore() {
                copyOnWrite();
                ((GolfMessage) this.instance).clearAverageScore();
                return this;
            }

            public Builder clearAverageUpTime() {
                copyOnWrite();
                ((GolfMessage) this.instance).clearAverageUpTime();
                return this;
            }

            public Builder clearTotalSwings() {
                copyOnWrite();
                ((GolfMessage) this.instance).clearTotalSwings();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
            public int getAverageAngle() {
                return ((GolfMessage) this.instance).getAverageAngle();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
            public float getAverageBeat() {
                return ((GolfMessage) this.instance).getAverageBeat();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
            public float getAverageDownTime() {
                return ((GolfMessage) this.instance).getAverageDownTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
            public int getAverageScore() {
                return ((GolfMessage) this.instance).getAverageScore();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
            public float getAverageUpTime() {
                return ((GolfMessage) this.instance).getAverageUpTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
            public int getTotalSwings() {
                return ((GolfMessage) this.instance).getTotalSwings();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
            public boolean hasAverageAngle() {
                return ((GolfMessage) this.instance).hasAverageAngle();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
            public boolean hasAverageBeat() {
                return ((GolfMessage) this.instance).hasAverageBeat();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
            public boolean hasAverageDownTime() {
                return ((GolfMessage) this.instance).hasAverageDownTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
            public boolean hasAverageScore() {
                return ((GolfMessage) this.instance).hasAverageScore();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
            public boolean hasAverageUpTime() {
                return ((GolfMessage) this.instance).hasAverageUpTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
            public boolean hasTotalSwings() {
                return ((GolfMessage) this.instance).hasTotalSwings();
            }

            public Builder setAverageAngle(int value) {
                copyOnWrite();
                ((GolfMessage) this.instance).setAverageAngle(value);
                return this;
            }

            public Builder setAverageBeat(float value) {
                copyOnWrite();
                ((GolfMessage) this.instance).setAverageBeat(value);
                return this;
            }

            public Builder setAverageDownTime(float value) {
                copyOnWrite();
                ((GolfMessage) this.instance).setAverageDownTime(value);
                return this;
            }

            public Builder setAverageScore(int value) {
                copyOnWrite();
                ((GolfMessage) this.instance).setAverageScore(value);
                return this;
            }

            public Builder setAverageUpTime(float value) {
                copyOnWrite();
                ((GolfMessage) this.instance).setAverageUpTime(value);
                return this;
            }

            public Builder setTotalSwings(int value) {
                copyOnWrite();
                ((GolfMessage) this.instance).setTotalSwings(value);
                return this;
            }

            private Builder() {
                super(GolfMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            GolfMessage golfMessage = new GolfMessage();
            DEFAULT_INSTANCE = golfMessage;
            GeneratedMessageLite.registerDefaultInstance(GolfMessage.class, golfMessage);
        }

        private GolfMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageAngle() {
            this.bitField0_ &= -33;
            this.averageAngle_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageBeat() {
            this.bitField0_ &= -3;
            this.averageBeat_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageDownTime() {
            this.bitField0_ &= -9;
            this.averageDownTime_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageScore() {
            this.bitField0_ &= -17;
            this.averageScore_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageUpTime() {
            this.bitField0_ &= -5;
            this.averageUpTime_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalSwings() {
            this.bitField0_ &= -2;
            this.totalSwings_ = 0;
        }

        public static GolfMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GolfMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (GolfMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static GolfMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<GolfMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageAngle(int value) {
            this.bitField0_ |= 32;
            this.averageAngle_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageBeat(float value) {
            this.bitField0_ |= 2;
            this.averageBeat_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageDownTime(float value) {
            this.bitField0_ |= 8;
            this.averageDownTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageScore(int value) {
            this.bitField0_ |= 16;
            this.averageScore_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageUpTime(float value) {
            this.bitField0_ |= 4;
            this.averageUpTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalSwings(int value) {
            this.bitField0_ |= 1;
            this.totalSwings_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new GolfMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဋ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0006ဋ\u0004\u0007င\u0005", new Object[]{"bitField0_", "totalSwings_", "averageBeat_", "averageUpTime_", "averageDownTime_", "averageScore_", "averageAngle_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<GolfMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (GolfMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
        public int getAverageAngle() {
            return this.averageAngle_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
        public float getAverageBeat() {
            return this.averageBeat_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
        public float getAverageDownTime() {
            return this.averageDownTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
        public int getAverageScore() {
            return this.averageScore_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
        public float getAverageUpTime() {
            return this.averageUpTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
        public int getTotalSwings() {
            return this.totalSwings_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
        public boolean hasAverageAngle() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
        public boolean hasAverageBeat() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
        public boolean hasAverageDownTime() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
        public boolean hasAverageScore() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
        public boolean hasAverageUpTime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.GolfMessageOrBuilder
        public boolean hasTotalSwings() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(GolfMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static GolfMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GolfMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static GolfMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static GolfMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static GolfMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static GolfMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static GolfMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static GolfMessage parseFrom(InputStream input) throws IOException {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static GolfMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static GolfMessage parseFrom(CodedInputStream input) throws IOException {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static GolfMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GolfMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface GolfMessageOrBuilder extends MessageLiteOrBuilder {
        int getAverageAngle();

        float getAverageBeat();

        float getAverageDownTime();

        int getAverageScore();

        float getAverageUpTime();

        int getTotalSwings();

        boolean hasAverageAngle();

        boolean hasAverageBeat();

        boolean hasAverageDownTime();

        boolean hasAverageScore();

        boolean hasAverageUpTime();

        boolean hasTotalSwings();
    }

    public static final class HeartRateMessage extends GeneratedMessageLite<HeartRateMessage, Builder> implements HeartRateMessageOrBuilder {
        public static final int AVERAGEHEARTRATE_FIELD_NUMBER = 1;
        private static final HeartRateMessage DEFAULT_INSTANCE;
        public static final int MAXIMUMHEARTRATE_FIELD_NUMBER = 2;
        public static final int MINIMUMHEARTRATE_FIELD_NUMBER = 3;
        private static volatile Parser<HeartRateMessage> PARSER;
        private int averageHeartRate_;
        private int bitField0_;
        private int maximumHeartRate_;
        private int minimumHeartRate_;

        public static final class Builder extends GeneratedMessageLite.Builder<HeartRateMessage, Builder> implements HeartRateMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAverageHeartRate() {
                copyOnWrite();
                ((HeartRateMessage) this.instance).clearAverageHeartRate();
                return this;
            }

            public Builder clearMaximumHeartRate() {
                copyOnWrite();
                ((HeartRateMessage) this.instance).clearMaximumHeartRate();
                return this;
            }

            public Builder clearMinimumHeartRate() {
                copyOnWrite();
                ((HeartRateMessage) this.instance).clearMinimumHeartRate();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartRateMessageOrBuilder
            public int getAverageHeartRate() {
                return ((HeartRateMessage) this.instance).getAverageHeartRate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartRateMessageOrBuilder
            public int getMaximumHeartRate() {
                return ((HeartRateMessage) this.instance).getMaximumHeartRate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartRateMessageOrBuilder
            public int getMinimumHeartRate() {
                return ((HeartRateMessage) this.instance).getMinimumHeartRate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartRateMessageOrBuilder
            public boolean hasAverageHeartRate() {
                return ((HeartRateMessage) this.instance).hasAverageHeartRate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartRateMessageOrBuilder
            public boolean hasMaximumHeartRate() {
                return ((HeartRateMessage) this.instance).hasMaximumHeartRate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartRateMessageOrBuilder
            public boolean hasMinimumHeartRate() {
                return ((HeartRateMessage) this.instance).hasMinimumHeartRate();
            }

            public Builder setAverageHeartRate(int value) {
                copyOnWrite();
                ((HeartRateMessage) this.instance).setAverageHeartRate(value);
                return this;
            }

            public Builder setMaximumHeartRate(int value) {
                copyOnWrite();
                ((HeartRateMessage) this.instance).setMaximumHeartRate(value);
                return this;
            }

            public Builder setMinimumHeartRate(int value) {
                copyOnWrite();
                ((HeartRateMessage) this.instance).setMinimumHeartRate(value);
                return this;
            }

            private Builder() {
                super(HeartRateMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            HeartRateMessage heartRateMessage = new HeartRateMessage();
            DEFAULT_INSTANCE = heartRateMessage;
            GeneratedMessageLite.registerDefaultInstance(HeartRateMessage.class, heartRateMessage);
        }

        private HeartRateMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageHeartRate() {
            this.bitField0_ &= -2;
            this.averageHeartRate_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaximumHeartRate() {
            this.bitField0_ &= -3;
            this.maximumHeartRate_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMinimumHeartRate() {
            this.bitField0_ &= -5;
            this.minimumHeartRate_ = 0;
        }

        public static HeartRateMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HeartRateMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (HeartRateMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static HeartRateMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<HeartRateMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageHeartRate(int value) {
            this.bitField0_ |= 1;
            this.averageHeartRate_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumHeartRate(int value) {
            this.bitField0_ |= 2;
            this.maximumHeartRate_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinimumHeartRate(int value) {
            this.bitField0_ |= 4;
            this.minimumHeartRate_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new HeartRateMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "averageHeartRate_", "maximumHeartRate_", "minimumHeartRate_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HeartRateMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (HeartRateMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartRateMessageOrBuilder
        public int getAverageHeartRate() {
            return this.averageHeartRate_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartRateMessageOrBuilder
        public int getMaximumHeartRate() {
            return this.maximumHeartRate_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartRateMessageOrBuilder
        public int getMinimumHeartRate() {
            return this.minimumHeartRate_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartRateMessageOrBuilder
        public boolean hasAverageHeartRate() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartRateMessageOrBuilder
        public boolean hasMaximumHeartRate() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartRateMessageOrBuilder
        public boolean hasMinimumHeartRate() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(HeartRateMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static HeartRateMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (HeartRateMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static HeartRateMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static HeartRateMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static HeartRateMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static HeartRateMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static HeartRateMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static HeartRateMessage parseFrom(InputStream input) throws IOException {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static HeartRateMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static HeartRateMessage parseFrom(CodedInputStream input) throws IOException {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static HeartRateMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (HeartRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface HeartRateMessageOrBuilder extends MessageLiteOrBuilder {
        int getAverageHeartRate();

        int getMaximumHeartRate();

        int getMinimumHeartRate();

        boolean hasAverageHeartRate();

        boolean hasMaximumHeartRate();

        boolean hasMinimumHeartRate();
    }

    public static final class HeartrateZoneMessage extends GeneratedMessageLite<HeartrateZoneMessage, Builder> implements HeartrateZoneMessageOrBuilder {
        private static final HeartrateZoneMessage DEFAULT_INSTANCE;
        public static final int HEART_FIELD_NUMBER = 2;
        private static volatile Parser<HeartrateZoneMessage> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int ZONE_FIELD_NUMBER = 3;
        private int bitField0_;
        private int type_;
        private byte memoizedIsInitialized = 2;
        private Internal.IntList heart_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList zone_ = GeneratedMessageLite.emptyIntList();

        public static final class Builder extends GeneratedMessageLite.Builder<HeartrateZoneMessage, Builder> implements HeartrateZoneMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllHeart(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).addAllHeart(values);
                return this;
            }

            public Builder addAllZone(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).addAllZone(values);
                return this;
            }

            public Builder addHeart(int value) {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).addHeart(value);
                return this;
            }

            public Builder addZone(int value) {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).addZone(value);
                return this;
            }

            public Builder clearHeart() {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).clearHeart();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).clearType();
                return this;
            }

            public Builder clearZone() {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).clearZone();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
            public int getHeart(int index) {
                return ((HeartrateZoneMessage) this.instance).getHeart(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
            public int getHeartCount() {
                return ((HeartrateZoneMessage) this.instance).getHeartCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
            public List<Integer> getHeartList() {
                return Collections.unmodifiableList(((HeartrateZoneMessage) this.instance).getHeartList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
            public int getType() {
                return ((HeartrateZoneMessage) this.instance).getType();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
            public int getZone(int index) {
                return ((HeartrateZoneMessage) this.instance).getZone(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
            public int getZoneCount() {
                return ((HeartrateZoneMessage) this.instance).getZoneCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
            public List<Integer> getZoneList() {
                return Collections.unmodifiableList(((HeartrateZoneMessage) this.instance).getZoneList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
            public boolean hasType() {
                return ((HeartrateZoneMessage) this.instance).hasType();
            }

            public Builder setHeart(int index, int value) {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).setHeart(index, value);
                return this;
            }

            public Builder setType(int value) {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).setType(value);
                return this;
            }

            public Builder setZone(int index, int value) {
                copyOnWrite();
                ((HeartrateZoneMessage) this.instance).setZone(index, value);
                return this;
            }

            private Builder() {
                super(HeartrateZoneMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            HeartrateZoneMessage heartrateZoneMessage = new HeartrateZoneMessage();
            DEFAULT_INSTANCE = heartrateZoneMessage;
            GeneratedMessageLite.registerDefaultInstance(HeartrateZoneMessage.class, heartrateZoneMessage);
        }

        private HeartrateZoneMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllHeart(Iterable<? extends Integer> values) {
            ensureHeartIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.heart_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllZone(Iterable<? extends Integer> values) {
            ensureZoneIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.zone_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addHeart(int value) {
            ensureHeartIsMutable();
            this.heart_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addZone(int value) {
            ensureZoneIsMutable();
            this.zone_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeart() {
            this.heart_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearZone() {
            this.zone_ = GeneratedMessageLite.emptyIntList();
        }

        private void ensureHeartIsMutable() {
            Internal.IntList intList = this.heart_;
            if (intList.isModifiable()) {
                return;
            }
            this.heart_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureZoneIsMutable() {
            Internal.IntList intList = this.zone_;
            if (intList.isModifiable()) {
                return;
            }
            this.zone_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static HeartrateZoneMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HeartrateZoneMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static HeartrateZoneMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<HeartrateZoneMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeart(int index, int value) {
            ensureHeartIsMutable();
            this.heart_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setZone(int index, int value) {
            ensureZoneIsMutable();
            this.zone_.setInt(index, value);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new HeartrateZoneMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001ᔋ\u0000\u0002\u001d\u0003\u001d", new Object[]{"bitField0_", "type_", "heart_", "zone_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HeartrateZoneMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (HeartrateZoneMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
        public int getHeart(int index) {
            return this.heart_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
        public int getHeartCount() {
            return this.heart_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
        public List<Integer> getHeartList() {
            return this.heart_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
        public int getZone(int index) {
            return this.zone_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
        public int getZoneCount() {
            return this.zone_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
        public List<Integer> getZoneList() {
            return this.zone_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.HeartrateZoneMessageOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(HeartrateZoneMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static HeartrateZoneMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static HeartrateZoneMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static HeartrateZoneMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static HeartrateZoneMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static HeartrateZoneMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static HeartrateZoneMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static HeartrateZoneMessage parseFrom(InputStream input) throws IOException {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static HeartrateZoneMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static HeartrateZoneMessage parseFrom(CodedInputStream input) throws IOException {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static HeartrateZoneMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (HeartrateZoneMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface HeartrateZoneMessageOrBuilder extends MessageLiteOrBuilder {
        int getHeart(int index);

        int getHeartCount();

        List<Integer> getHeartList();

        int getType();

        int getZone(int index);

        int getZoneCount();

        List<Integer> getZoneList();

        boolean hasType();
    }

    public static final class MarathonMessage extends GeneratedMessageLite<MarathonMessage, Builder> implements MarathonMessageOrBuilder {
        private static final MarathonMessage DEFAULT_INSTANCE;
        public static final int DISTANCE_FIELD_NUMBER = 3;
        private static volatile Parser<MarathonMessage> PARSER = null;
        public static final int TIMEUSAGE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int distance_;
        private byte memoizedIsInitialized = 2;
        private int timeUsage_;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.Builder<MarathonMessage, Builder> implements MarathonMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDistance() {
                copyOnWrite();
                ((MarathonMessage) this.instance).clearDistance();
                return this;
            }

            public Builder clearTimeUsage() {
                copyOnWrite();
                ((MarathonMessage) this.instance).clearTimeUsage();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((MarathonMessage) this.instance).clearType();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.MarathonMessageOrBuilder
            public int getDistance() {
                return ((MarathonMessage) this.instance).getDistance();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.MarathonMessageOrBuilder
            public int getTimeUsage() {
                return ((MarathonMessage) this.instance).getTimeUsage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.MarathonMessageOrBuilder
            public int getType() {
                return ((MarathonMessage) this.instance).getType();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.MarathonMessageOrBuilder
            public boolean hasDistance() {
                return ((MarathonMessage) this.instance).hasDistance();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.MarathonMessageOrBuilder
            public boolean hasTimeUsage() {
                return ((MarathonMessage) this.instance).hasTimeUsage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.MarathonMessageOrBuilder
            public boolean hasType() {
                return ((MarathonMessage) this.instance).hasType();
            }

            public Builder setDistance(int value) {
                copyOnWrite();
                ((MarathonMessage) this.instance).setDistance(value);
                return this;
            }

            public Builder setTimeUsage(int value) {
                copyOnWrite();
                ((MarathonMessage) this.instance).setTimeUsage(value);
                return this;
            }

            public Builder setType(int value) {
                copyOnWrite();
                ((MarathonMessage) this.instance).setType(value);
                return this;
            }

            private Builder() {
                super(MarathonMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            MarathonMessage marathonMessage = new MarathonMessage();
            DEFAULT_INSTANCE = marathonMessage;
            GeneratedMessageLite.registerDefaultInstance(MarathonMessage.class, marathonMessage);
        }

        private MarathonMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDistance() {
            this.bitField0_ &= -5;
            this.distance_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeUsage() {
            this.bitField0_ &= -3;
            this.timeUsage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static MarathonMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MarathonMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (MarathonMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static MarathonMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<MarathonMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDistance(int value) {
            this.bitField0_ |= 4;
            this.distance_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeUsage(int value) {
            this.bitField0_ |= 2;
            this.timeUsage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new MarathonMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"bitField0_", "type_", "timeUsage_", "distance_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MarathonMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (MarathonMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.MarathonMessageOrBuilder
        public int getDistance() {
            return this.distance_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.MarathonMessageOrBuilder
        public int getTimeUsage() {
            return this.timeUsage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.MarathonMessageOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.MarathonMessageOrBuilder
        public boolean hasDistance() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.MarathonMessageOrBuilder
        public boolean hasTimeUsage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.MarathonMessageOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(MarathonMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static MarathonMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MarathonMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MarathonMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MarathonMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MarathonMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MarathonMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MarathonMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MarathonMessage parseFrom(InputStream input) throws IOException {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MarathonMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MarathonMessage parseFrom(CodedInputStream input) throws IOException {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MarathonMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MarathonMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface MarathonMessageOrBuilder extends MessageLiteOrBuilder {
        int getDistance();

        int getTimeUsage();

        int getType();

        boolean hasDistance();

        boolean hasTimeUsage();

        boolean hasType();
    }

    public static final class NumberMessage extends GeneratedMessageLite<NumberMessage, Builder> implements NumberMessageOrBuilder {
        private static final NumberMessage DEFAULT_INSTANCE;
        public static final int NUMBEROFBREAK_FIELD_NUMBER = 3;
        private static volatile Parser<NumberMessage> PARSER = null;
        public static final int TOTALNUMBEROFJUMPS_FIELD_NUMBER = 1;
        public static final int TOTALTIMESOFROWING_FIELD_NUMBER = 2;
        private int bitField0_;
        private int numberOfBreak_;
        private int totalNumberOfJumps_;
        private int totalTimesOfRowing_;

        public static final class Builder extends GeneratedMessageLite.Builder<NumberMessage, Builder> implements NumberMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearNumberOfBreak() {
                copyOnWrite();
                ((NumberMessage) this.instance).clearNumberOfBreak();
                return this;
            }

            public Builder clearTotalNumberOfJumps() {
                copyOnWrite();
                ((NumberMessage) this.instance).clearTotalNumberOfJumps();
                return this;
            }

            public Builder clearTotalTimesOfRowing() {
                copyOnWrite();
                ((NumberMessage) this.instance).clearTotalTimesOfRowing();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.NumberMessageOrBuilder
            public int getNumberOfBreak() {
                return ((NumberMessage) this.instance).getNumberOfBreak();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.NumberMessageOrBuilder
            public int getTotalNumberOfJumps() {
                return ((NumberMessage) this.instance).getTotalNumberOfJumps();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.NumberMessageOrBuilder
            public int getTotalTimesOfRowing() {
                return ((NumberMessage) this.instance).getTotalTimesOfRowing();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.NumberMessageOrBuilder
            public boolean hasNumberOfBreak() {
                return ((NumberMessage) this.instance).hasNumberOfBreak();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.NumberMessageOrBuilder
            public boolean hasTotalNumberOfJumps() {
                return ((NumberMessage) this.instance).hasTotalNumberOfJumps();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.NumberMessageOrBuilder
            public boolean hasTotalTimesOfRowing() {
                return ((NumberMessage) this.instance).hasTotalTimesOfRowing();
            }

            public Builder setNumberOfBreak(int value) {
                copyOnWrite();
                ((NumberMessage) this.instance).setNumberOfBreak(value);
                return this;
            }

            public Builder setTotalNumberOfJumps(int value) {
                copyOnWrite();
                ((NumberMessage) this.instance).setTotalNumberOfJumps(value);
                return this;
            }

            public Builder setTotalTimesOfRowing(int value) {
                copyOnWrite();
                ((NumberMessage) this.instance).setTotalTimesOfRowing(value);
                return this;
            }

            private Builder() {
                super(NumberMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            NumberMessage numberMessage = new NumberMessage();
            DEFAULT_INSTANCE = numberMessage;
            GeneratedMessageLite.registerDefaultInstance(NumberMessage.class, numberMessage);
        }

        private NumberMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumberOfBreak() {
            this.bitField0_ &= -5;
            this.numberOfBreak_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalNumberOfJumps() {
            this.bitField0_ &= -2;
            this.totalNumberOfJumps_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalTimesOfRowing() {
            this.bitField0_ &= -3;
            this.totalTimesOfRowing_ = 0;
        }

        public static NumberMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NumberMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (NumberMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static NumberMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<NumberMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumberOfBreak(int value) {
            this.bitField0_ |= 4;
            this.numberOfBreak_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalNumberOfJumps(int value) {
            this.bitField0_ |= 1;
            this.totalNumberOfJumps_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalTimesOfRowing(int value) {
            this.bitField0_ |= 2;
            this.totalTimesOfRowing_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new NumberMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "totalNumberOfJumps_", "totalTimesOfRowing_", "numberOfBreak_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NumberMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (NumberMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.NumberMessageOrBuilder
        public int getNumberOfBreak() {
            return this.numberOfBreak_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.NumberMessageOrBuilder
        public int getTotalNumberOfJumps() {
            return this.totalNumberOfJumps_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.NumberMessageOrBuilder
        public int getTotalTimesOfRowing() {
            return this.totalTimesOfRowing_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.NumberMessageOrBuilder
        public boolean hasNumberOfBreak() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.NumberMessageOrBuilder
        public boolean hasTotalNumberOfJumps() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.NumberMessageOrBuilder
        public boolean hasTotalTimesOfRowing() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(NumberMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static NumberMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NumberMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NumberMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NumberMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NumberMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NumberMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NumberMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NumberMessage parseFrom(InputStream input) throws IOException {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NumberMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NumberMessage parseFrom(CodedInputStream input) throws IOException {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NumberMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NumberMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface NumberMessageOrBuilder extends MessageLiteOrBuilder {
        int getNumberOfBreak();

        int getTotalNumberOfJumps();

        int getTotalTimesOfRowing();

        boolean hasNumberOfBreak();

        boolean hasTotalNumberOfJumps();

        boolean hasTotalTimesOfRowing();
    }

    public static final class OtherMessage extends GeneratedMessageLite<OtherMessage, Builder> implements OtherMessageOrBuilder {
        public static final int AEROBICTRAININGEFFECT_FIELD_NUMBER = 4;
        public static final int ANAEROBICTRAININGEFFECT_FIELD_NUMBER = 5;
        private static final OtherMessage DEFAULT_INSTANCE;
        public static final int MAXIMUMSPO2_FIELD_NUMBER = 2;
        public static final int MINIMUMSPO2_FIELD_NUMBER = 3;
        private static volatile Parser<OtherMessage> PARSER = null;
        public static final int TOTALGROUPS_FIELD_NUMBER = 1;
        public static final int TRAININGLOADOFTHISACTIVITY_FIELD_NUMBER = 6;
        public static final int VO2MAX_FIELD_NUMBER = 7;
        private float aerobicTrainingEffect_;
        private float anaerobicTrainingEffect_;
        private int bitField0_;
        private int maximumSpO2_;
        private int minimumSpO2_;
        private int totalGroups_;
        private int trainingLoadOfThisActivity_;
        private int vO2Max_;

        public static final class Builder extends GeneratedMessageLite.Builder<OtherMessage, Builder> implements OtherMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAerobicTrainingEffect() {
                copyOnWrite();
                ((OtherMessage) this.instance).clearAerobicTrainingEffect();
                return this;
            }

            public Builder clearAnaerobicTrainingEffect() {
                copyOnWrite();
                ((OtherMessage) this.instance).clearAnaerobicTrainingEffect();
                return this;
            }

            public Builder clearMaximumSpO2() {
                copyOnWrite();
                ((OtherMessage) this.instance).clearMaximumSpO2();
                return this;
            }

            public Builder clearMinimumSpO2() {
                copyOnWrite();
                ((OtherMessage) this.instance).clearMinimumSpO2();
                return this;
            }

            public Builder clearTotalGroups() {
                copyOnWrite();
                ((OtherMessage) this.instance).clearTotalGroups();
                return this;
            }

            public Builder clearTrainingLoadOfThisActivity() {
                copyOnWrite();
                ((OtherMessage) this.instance).clearTrainingLoadOfThisActivity();
                return this;
            }

            public Builder clearVO2Max() {
                copyOnWrite();
                ((OtherMessage) this.instance).clearVO2Max();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
            public float getAerobicTrainingEffect() {
                return ((OtherMessage) this.instance).getAerobicTrainingEffect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
            public float getAnaerobicTrainingEffect() {
                return ((OtherMessage) this.instance).getAnaerobicTrainingEffect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
            public int getMaximumSpO2() {
                return ((OtherMessage) this.instance).getMaximumSpO2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
            public int getMinimumSpO2() {
                return ((OtherMessage) this.instance).getMinimumSpO2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
            public int getTotalGroups() {
                return ((OtherMessage) this.instance).getTotalGroups();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
            public int getTrainingLoadOfThisActivity() {
                return ((OtherMessage) this.instance).getTrainingLoadOfThisActivity();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
            public int getVO2Max() {
                return ((OtherMessage) this.instance).getVO2Max();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
            public boolean hasAerobicTrainingEffect() {
                return ((OtherMessage) this.instance).hasAerobicTrainingEffect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
            public boolean hasAnaerobicTrainingEffect() {
                return ((OtherMessage) this.instance).hasAnaerobicTrainingEffect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
            public boolean hasMaximumSpO2() {
                return ((OtherMessage) this.instance).hasMaximumSpO2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
            public boolean hasMinimumSpO2() {
                return ((OtherMessage) this.instance).hasMinimumSpO2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
            public boolean hasTotalGroups() {
                return ((OtherMessage) this.instance).hasTotalGroups();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
            public boolean hasTrainingLoadOfThisActivity() {
                return ((OtherMessage) this.instance).hasTrainingLoadOfThisActivity();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
            public boolean hasVO2Max() {
                return ((OtherMessage) this.instance).hasVO2Max();
            }

            public Builder setAerobicTrainingEffect(float value) {
                copyOnWrite();
                ((OtherMessage) this.instance).setAerobicTrainingEffect(value);
                return this;
            }

            public Builder setAnaerobicTrainingEffect(float value) {
                copyOnWrite();
                ((OtherMessage) this.instance).setAnaerobicTrainingEffect(value);
                return this;
            }

            public Builder setMaximumSpO2(int value) {
                copyOnWrite();
                ((OtherMessage) this.instance).setMaximumSpO2(value);
                return this;
            }

            public Builder setMinimumSpO2(int value) {
                copyOnWrite();
                ((OtherMessage) this.instance).setMinimumSpO2(value);
                return this;
            }

            public Builder setTotalGroups(int value) {
                copyOnWrite();
                ((OtherMessage) this.instance).setTotalGroups(value);
                return this;
            }

            public Builder setTrainingLoadOfThisActivity(int value) {
                copyOnWrite();
                ((OtherMessage) this.instance).setTrainingLoadOfThisActivity(value);
                return this;
            }

            public Builder setVO2Max(int value) {
                copyOnWrite();
                ((OtherMessage) this.instance).setVO2Max(value);
                return this;
            }

            private Builder() {
                super(OtherMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            OtherMessage otherMessage = new OtherMessage();
            DEFAULT_INSTANCE = otherMessage;
            GeneratedMessageLite.registerDefaultInstance(OtherMessage.class, otherMessage);
        }

        private OtherMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAerobicTrainingEffect() {
            this.bitField0_ &= -9;
            this.aerobicTrainingEffect_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnaerobicTrainingEffect() {
            this.bitField0_ &= -17;
            this.anaerobicTrainingEffect_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaximumSpO2() {
            this.bitField0_ &= -3;
            this.maximumSpO2_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMinimumSpO2() {
            this.bitField0_ &= -5;
            this.minimumSpO2_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalGroups() {
            this.bitField0_ &= -2;
            this.totalGroups_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainingLoadOfThisActivity() {
            this.bitField0_ &= -33;
            this.trainingLoadOfThisActivity_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVO2Max() {
            this.bitField0_ &= -65;
            this.vO2Max_ = 0;
        }

        public static OtherMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OtherMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (OtherMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static OtherMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<OtherMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAerobicTrainingEffect(float value) {
            this.bitField0_ |= 8;
            this.aerobicTrainingEffect_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnaerobicTrainingEffect(float value) {
            this.bitField0_ |= 16;
            this.anaerobicTrainingEffect_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumSpO2(int value) {
            this.bitField0_ |= 2;
            this.maximumSpO2_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinimumSpO2(int value) {
            this.bitField0_ |= 4;
            this.minimumSpO2_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalGroups(int value) {
            this.bitField0_ |= 1;
            this.totalGroups_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainingLoadOfThisActivity(int value) {
            this.bitField0_ |= 32;
            this.trainingLoadOfThisActivity_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVO2Max(int value) {
            this.bitField0_ |= 64;
            this.vO2Max_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new OtherMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဋ\u0005\u0007ဋ\u0006", new Object[]{"bitField0_", "totalGroups_", "maximumSpO2_", "minimumSpO2_", "aerobicTrainingEffect_", "anaerobicTrainingEffect_", "trainingLoadOfThisActivity_", "vO2Max_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OtherMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (OtherMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
        public float getAerobicTrainingEffect() {
            return this.aerobicTrainingEffect_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
        public float getAnaerobicTrainingEffect() {
            return this.anaerobicTrainingEffect_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
        public int getMaximumSpO2() {
            return this.maximumSpO2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
        public int getMinimumSpO2() {
            return this.minimumSpO2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
        public int getTotalGroups() {
            return this.totalGroups_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
        public int getTrainingLoadOfThisActivity() {
            return this.trainingLoadOfThisActivity_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
        public int getVO2Max() {
            return this.vO2Max_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
        public boolean hasAerobicTrainingEffect() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
        public boolean hasAnaerobicTrainingEffect() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
        public boolean hasMaximumSpO2() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
        public boolean hasMinimumSpO2() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
        public boolean hasTotalGroups() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
        public boolean hasTrainingLoadOfThisActivity() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.OtherMessageOrBuilder
        public boolean hasVO2Max() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(OtherMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static OtherMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OtherMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static OtherMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OtherMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OtherMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OtherMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OtherMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OtherMessage parseFrom(InputStream input) throws IOException {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static OtherMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static OtherMessage parseFrom(CodedInputStream input) throws IOException {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static OtherMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OtherMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface OtherMessageOrBuilder extends MessageLiteOrBuilder {
        float getAerobicTrainingEffect();

        float getAnaerobicTrainingEffect();

        int getMaximumSpO2();

        int getMinimumSpO2();

        int getTotalGroups();

        int getTrainingLoadOfThisActivity();

        int getVO2Max();

        boolean hasAerobicTrainingEffect();

        boolean hasAnaerobicTrainingEffect();

        boolean hasMaximumSpO2();

        boolean hasMinimumSpO2();

        boolean hasTotalGroups();

        boolean hasTrainingLoadOfThisActivity();

        boolean hasVO2Max();
    }

    public static final class PaceMessage extends GeneratedMessageLite<PaceMessage, Builder> implements PaceMessageOrBuilder {
        public static final int AVERAGEPACE_FIELD_NUMBER = 1;
        public static final int BESTPACE_FIELD_NUMBER = 2;
        private static final PaceMessage DEFAULT_INSTANCE;
        private static volatile Parser<PaceMessage> PARSER;
        private float averagePace_;
        private float bestPace_;
        private int bitField0_;

        public static final class Builder extends GeneratedMessageLite.Builder<PaceMessage, Builder> implements PaceMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAveragePace() {
                copyOnWrite();
                ((PaceMessage) this.instance).clearAveragePace();
                return this;
            }

            public Builder clearBestPace() {
                copyOnWrite();
                ((PaceMessage) this.instance).clearBestPace();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PaceMessageOrBuilder
            public float getAveragePace() {
                return ((PaceMessage) this.instance).getAveragePace();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PaceMessageOrBuilder
            public float getBestPace() {
                return ((PaceMessage) this.instance).getBestPace();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PaceMessageOrBuilder
            public boolean hasAveragePace() {
                return ((PaceMessage) this.instance).hasAveragePace();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PaceMessageOrBuilder
            public boolean hasBestPace() {
                return ((PaceMessage) this.instance).hasBestPace();
            }

            public Builder setAveragePace(float value) {
                copyOnWrite();
                ((PaceMessage) this.instance).setAveragePace(value);
                return this;
            }

            public Builder setBestPace(float value) {
                copyOnWrite();
                ((PaceMessage) this.instance).setBestPace(value);
                return this;
            }

            private Builder() {
                super(PaceMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            PaceMessage paceMessage = new PaceMessage();
            DEFAULT_INSTANCE = paceMessage;
            GeneratedMessageLite.registerDefaultInstance(PaceMessage.class, paceMessage);
        }

        private PaceMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAveragePace() {
            this.bitField0_ &= -2;
            this.averagePace_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBestPace() {
            this.bitField0_ &= -3;
            this.bestPace_ = 0.0f;
        }

        public static PaceMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PaceMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (PaceMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static PaceMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<PaceMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAveragePace(float value) {
            this.bitField0_ |= 1;
            this.averagePace_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBestPace(float value) {
            this.bitField0_ |= 2;
            this.bestPace_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new PaceMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"bitField0_", "averagePace_", "bestPace_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PaceMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (PaceMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PaceMessageOrBuilder
        public float getAveragePace() {
            return this.averagePace_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PaceMessageOrBuilder
        public float getBestPace() {
            return this.bestPace_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PaceMessageOrBuilder
        public boolean hasAveragePace() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PaceMessageOrBuilder
        public boolean hasBestPace() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(PaceMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static PaceMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PaceMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PaceMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PaceMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PaceMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PaceMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PaceMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PaceMessage parseFrom(InputStream input) throws IOException {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PaceMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PaceMessage parseFrom(CodedInputStream input) throws IOException {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PaceMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface PaceMessageOrBuilder extends MessageLiteOrBuilder {
        float getAveragePace();

        float getBestPace();

        boolean hasAveragePace();

        boolean hasBestPace();
    }

    public static final class PowerMessage extends GeneratedMessageLite<PowerMessage, Builder> implements PowerMessageOrBuilder {
        public static final int AVERAGEPOWER_FIELD_NUMBER = 1;
        private static final PowerMessage DEFAULT_INSTANCE;
        public static final int DEVICEWORK_FIELD_NUMBER = 3;
        public static final int MAXIMUMPOWER_FIELD_NUMBER = 2;
        private static volatile Parser<PowerMessage> PARSER;
        private int averagePower_;
        private int bitField0_;
        private int deviceWork_;
        private int maximumPower_;

        public static final class Builder extends GeneratedMessageLite.Builder<PowerMessage, Builder> implements PowerMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAveragePower() {
                copyOnWrite();
                ((PowerMessage) this.instance).clearAveragePower();
                return this;
            }

            public Builder clearDeviceWork() {
                copyOnWrite();
                ((PowerMessage) this.instance).clearDeviceWork();
                return this;
            }

            public Builder clearMaximumPower() {
                copyOnWrite();
                ((PowerMessage) this.instance).clearMaximumPower();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PowerMessageOrBuilder
            public int getAveragePower() {
                return ((PowerMessage) this.instance).getAveragePower();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PowerMessageOrBuilder
            public int getDeviceWork() {
                return ((PowerMessage) this.instance).getDeviceWork();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PowerMessageOrBuilder
            public int getMaximumPower() {
                return ((PowerMessage) this.instance).getMaximumPower();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PowerMessageOrBuilder
            public boolean hasAveragePower() {
                return ((PowerMessage) this.instance).hasAveragePower();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PowerMessageOrBuilder
            public boolean hasDeviceWork() {
                return ((PowerMessage) this.instance).hasDeviceWork();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PowerMessageOrBuilder
            public boolean hasMaximumPower() {
                return ((PowerMessage) this.instance).hasMaximumPower();
            }

            public Builder setAveragePower(int value) {
                copyOnWrite();
                ((PowerMessage) this.instance).setAveragePower(value);
                return this;
            }

            public Builder setDeviceWork(int value) {
                copyOnWrite();
                ((PowerMessage) this.instance).setDeviceWork(value);
                return this;
            }

            public Builder setMaximumPower(int value) {
                copyOnWrite();
                ((PowerMessage) this.instance).setMaximumPower(value);
                return this;
            }

            private Builder() {
                super(PowerMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            PowerMessage powerMessage = new PowerMessage();
            DEFAULT_INSTANCE = powerMessage;
            GeneratedMessageLite.registerDefaultInstance(PowerMessage.class, powerMessage);
        }

        private PowerMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAveragePower() {
            this.bitField0_ &= -2;
            this.averagePower_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceWork() {
            this.bitField0_ &= -5;
            this.deviceWork_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaximumPower() {
            this.bitField0_ &= -3;
            this.maximumPower_ = 0;
        }

        public static PowerMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PowerMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (PowerMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static PowerMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<PowerMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAveragePower(int value) {
            this.bitField0_ |= 1;
            this.averagePower_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceWork(int value) {
            this.bitField0_ |= 4;
            this.deviceWork_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumPower(int value) {
            this.bitField0_ |= 2;
            this.maximumPower_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new PowerMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "averagePower_", "maximumPower_", "deviceWork_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PowerMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (PowerMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PowerMessageOrBuilder
        public int getAveragePower() {
            return this.averagePower_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PowerMessageOrBuilder
        public int getDeviceWork() {
            return this.deviceWork_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PowerMessageOrBuilder
        public int getMaximumPower() {
            return this.maximumPower_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PowerMessageOrBuilder
        public boolean hasAveragePower() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PowerMessageOrBuilder
        public boolean hasDeviceWork() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PowerMessageOrBuilder
        public boolean hasMaximumPower() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(PowerMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static PowerMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PowerMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PowerMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PowerMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PowerMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PowerMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PowerMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PowerMessage parseFrom(InputStream input) throws IOException {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PowerMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PowerMessage parseFrom(CodedInputStream input) throws IOException {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PowerMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PowerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface PowerMessageOrBuilder extends MessageLiteOrBuilder {
        int getAveragePower();

        int getDeviceWork();

        int getMaximumPower();

        boolean hasAveragePower();

        boolean hasDeviceWork();

        boolean hasMaximumPower();
    }

    public static final class PressureMessage extends GeneratedMessageLite<PressureMessage, Builder> implements PressureMessageOrBuilder {
        public static final int AVERAGEPRESSURE_FIELD_NUMBER = 1;
        private static final PressureMessage DEFAULT_INSTANCE;
        public static final int MAXIMUMPRESSURE_FIELD_NUMBER = 2;
        public static final int MINIMUMPRESSURE_FIELD_NUMBER = 3;
        private static volatile Parser<PressureMessage> PARSER;
        private int averagePressure_;
        private int bitField0_;
        private int maximumPressure_;
        private int minimumPressure_;

        public static final class Builder extends GeneratedMessageLite.Builder<PressureMessage, Builder> implements PressureMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAveragePressure() {
                copyOnWrite();
                ((PressureMessage) this.instance).clearAveragePressure();
                return this;
            }

            public Builder clearMaximumPressure() {
                copyOnWrite();
                ((PressureMessage) this.instance).clearMaximumPressure();
                return this;
            }

            public Builder clearMinimumPressure() {
                copyOnWrite();
                ((PressureMessage) this.instance).clearMinimumPressure();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PressureMessageOrBuilder
            public int getAveragePressure() {
                return ((PressureMessage) this.instance).getAveragePressure();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PressureMessageOrBuilder
            public int getMaximumPressure() {
                return ((PressureMessage) this.instance).getMaximumPressure();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PressureMessageOrBuilder
            public int getMinimumPressure() {
                return ((PressureMessage) this.instance).getMinimumPressure();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PressureMessageOrBuilder
            public boolean hasAveragePressure() {
                return ((PressureMessage) this.instance).hasAveragePressure();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PressureMessageOrBuilder
            public boolean hasMaximumPressure() {
                return ((PressureMessage) this.instance).hasMaximumPressure();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PressureMessageOrBuilder
            public boolean hasMinimumPressure() {
                return ((PressureMessage) this.instance).hasMinimumPressure();
            }

            public Builder setAveragePressure(int value) {
                copyOnWrite();
                ((PressureMessage) this.instance).setAveragePressure(value);
                return this;
            }

            public Builder setMaximumPressure(int value) {
                copyOnWrite();
                ((PressureMessage) this.instance).setMaximumPressure(value);
                return this;
            }

            public Builder setMinimumPressure(int value) {
                copyOnWrite();
                ((PressureMessage) this.instance).setMinimumPressure(value);
                return this;
            }

            private Builder() {
                super(PressureMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            PressureMessage pressureMessage = new PressureMessage();
            DEFAULT_INSTANCE = pressureMessage;
            GeneratedMessageLite.registerDefaultInstance(PressureMessage.class, pressureMessage);
        }

        private PressureMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAveragePressure() {
            this.bitField0_ &= -2;
            this.averagePressure_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaximumPressure() {
            this.bitField0_ &= -3;
            this.maximumPressure_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMinimumPressure() {
            this.bitField0_ &= -5;
            this.minimumPressure_ = 0;
        }

        public static PressureMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PressureMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (PressureMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static PressureMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<PressureMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAveragePressure(int value) {
            this.bitField0_ |= 1;
            this.averagePressure_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumPressure(int value) {
            this.bitField0_ |= 2;
            this.maximumPressure_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinimumPressure(int value) {
            this.bitField0_ |= 4;
            this.minimumPressure_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new PressureMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "averagePressure_", "maximumPressure_", "minimumPressure_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PressureMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (PressureMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PressureMessageOrBuilder
        public int getAveragePressure() {
            return this.averagePressure_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PressureMessageOrBuilder
        public int getMaximumPressure() {
            return this.maximumPressure_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PressureMessageOrBuilder
        public int getMinimumPressure() {
            return this.minimumPressure_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PressureMessageOrBuilder
        public boolean hasAveragePressure() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PressureMessageOrBuilder
        public boolean hasMaximumPressure() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.PressureMessageOrBuilder
        public boolean hasMinimumPressure() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(PressureMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static PressureMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PressureMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PressureMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PressureMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PressureMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PressureMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PressureMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PressureMessage parseFrom(InputStream input) throws IOException {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PressureMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PressureMessage parseFrom(CodedInputStream input) throws IOException {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PressureMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PressureMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface PressureMessageOrBuilder extends MessageLiteOrBuilder {
        int getAveragePressure();

        int getMaximumPressure();

        int getMinimumPressure();

        boolean hasAveragePressure();

        boolean hasMaximumPressure();

        boolean hasMinimumPressure();
    }

    public static final class RecordMessage extends GeneratedMessageLite<RecordMessage, Builder> implements RecordMessageOrBuilder {
        public static final int ALTITUDE_FIELD_NUMBER = 7;
        public static final int COURSETITLE_FIELD_NUMBER = 12;
        private static final RecordMessage DEFAULT_INSTANCE;
        public static final int LATITUDE_FIELD_NUMBER = 5;
        public static final int LONGITUDE_FIELD_NUMBER = 6;
        public static final int MAXLATITUDE_FIELD_NUMBER = 8;
        public static final int MAXLONGITUDE_FIELD_NUMBER = 10;
        public static final int MINLATITUDE_FIELD_NUMBER = 9;
        public static final int MINLONGITUDE_FIELD_NUMBER = 11;
        public static final int PARENTID_FIELD_NUMBER = 2;
        private static volatile Parser<RecordMessage> PARSER = null;
        public static final int TRACKID_FIELD_NUMBER = 1;
        public static final int ZONE_FIELD_NUMBER = 3;
        private int altitude_;
        private int bitField0_;
        private int latitude_;
        private int longitude_;
        private int maxLatitude_;
        private int maxLongitude_;
        private int minLatitude_;
        private int minLongitude_;
        private int parentId_;
        private int trackId_;
        private int zone_;
        private byte memoizedIsInitialized = 2;
        private String courseTitle_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<RecordMessage, Builder> implements RecordMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAltitude() {
                copyOnWrite();
                ((RecordMessage) this.instance).clearAltitude();
                return this;
            }

            public Builder clearCourseTitle() {
                copyOnWrite();
                ((RecordMessage) this.instance).clearCourseTitle();
                return this;
            }

            public Builder clearLatitude() {
                copyOnWrite();
                ((RecordMessage) this.instance).clearLatitude();
                return this;
            }

            public Builder clearLongitude() {
                copyOnWrite();
                ((RecordMessage) this.instance).clearLongitude();
                return this;
            }

            public Builder clearMaxLatitude() {
                copyOnWrite();
                ((RecordMessage) this.instance).clearMaxLatitude();
                return this;
            }

            public Builder clearMaxLongitude() {
                copyOnWrite();
                ((RecordMessage) this.instance).clearMaxLongitude();
                return this;
            }

            public Builder clearMinLatitude() {
                copyOnWrite();
                ((RecordMessage) this.instance).clearMinLatitude();
                return this;
            }

            public Builder clearMinLongitude() {
                copyOnWrite();
                ((RecordMessage) this.instance).clearMinLongitude();
                return this;
            }

            public Builder clearParentId() {
                copyOnWrite();
                ((RecordMessage) this.instance).clearParentId();
                return this;
            }

            public Builder clearTrackId() {
                copyOnWrite();
                ((RecordMessage) this.instance).clearTrackId();
                return this;
            }

            public Builder clearZone() {
                copyOnWrite();
                ((RecordMessage) this.instance).clearZone();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public int getAltitude() {
                return ((RecordMessage) this.instance).getAltitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public String getCourseTitle() {
                return ((RecordMessage) this.instance).getCourseTitle();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public ByteString getCourseTitleBytes() {
                return ((RecordMessage) this.instance).getCourseTitleBytes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public int getLatitude() {
                return ((RecordMessage) this.instance).getLatitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public int getLongitude() {
                return ((RecordMessage) this.instance).getLongitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public int getMaxLatitude() {
                return ((RecordMessage) this.instance).getMaxLatitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public int getMaxLongitude() {
                return ((RecordMessage) this.instance).getMaxLongitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public int getMinLatitude() {
                return ((RecordMessage) this.instance).getMinLatitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public int getMinLongitude() {
                return ((RecordMessage) this.instance).getMinLongitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public int getParentId() {
                return ((RecordMessage) this.instance).getParentId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public int getTrackId() {
                return ((RecordMessage) this.instance).getTrackId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public int getZone() {
                return ((RecordMessage) this.instance).getZone();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public boolean hasAltitude() {
                return ((RecordMessage) this.instance).hasAltitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public boolean hasCourseTitle() {
                return ((RecordMessage) this.instance).hasCourseTitle();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public boolean hasLatitude() {
                return ((RecordMessage) this.instance).hasLatitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public boolean hasLongitude() {
                return ((RecordMessage) this.instance).hasLongitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public boolean hasMaxLatitude() {
                return ((RecordMessage) this.instance).hasMaxLatitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public boolean hasMaxLongitude() {
                return ((RecordMessage) this.instance).hasMaxLongitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public boolean hasMinLatitude() {
                return ((RecordMessage) this.instance).hasMinLatitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public boolean hasMinLongitude() {
                return ((RecordMessage) this.instance).hasMinLongitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public boolean hasParentId() {
                return ((RecordMessage) this.instance).hasParentId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public boolean hasTrackId() {
                return ((RecordMessage) this.instance).hasTrackId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
            public boolean hasZone() {
                return ((RecordMessage) this.instance).hasZone();
            }

            public Builder setAltitude(int value) {
                copyOnWrite();
                ((RecordMessage) this.instance).setAltitude(value);
                return this;
            }

            public Builder setCourseTitle(String value) {
                copyOnWrite();
                ((RecordMessage) this.instance).setCourseTitle(value);
                return this;
            }

            public Builder setCourseTitleBytes(ByteString value) {
                copyOnWrite();
                ((RecordMessage) this.instance).setCourseTitleBytes(value);
                return this;
            }

            public Builder setLatitude(int value) {
                copyOnWrite();
                ((RecordMessage) this.instance).setLatitude(value);
                return this;
            }

            public Builder setLongitude(int value) {
                copyOnWrite();
                ((RecordMessage) this.instance).setLongitude(value);
                return this;
            }

            public Builder setMaxLatitude(int value) {
                copyOnWrite();
                ((RecordMessage) this.instance).setMaxLatitude(value);
                return this;
            }

            public Builder setMaxLongitude(int value) {
                copyOnWrite();
                ((RecordMessage) this.instance).setMaxLongitude(value);
                return this;
            }

            public Builder setMinLatitude(int value) {
                copyOnWrite();
                ((RecordMessage) this.instance).setMinLatitude(value);
                return this;
            }

            public Builder setMinLongitude(int value) {
                copyOnWrite();
                ((RecordMessage) this.instance).setMinLongitude(value);
                return this;
            }

            public Builder setParentId(int value) {
                copyOnWrite();
                ((RecordMessage) this.instance).setParentId(value);
                return this;
            }

            public Builder setTrackId(int value) {
                copyOnWrite();
                ((RecordMessage) this.instance).setTrackId(value);
                return this;
            }

            public Builder setZone(int value) {
                copyOnWrite();
                ((RecordMessage) this.instance).setZone(value);
                return this;
            }

            private Builder() {
                super(RecordMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            RecordMessage recordMessage = new RecordMessage();
            DEFAULT_INSTANCE = recordMessage;
            GeneratedMessageLite.registerDefaultInstance(RecordMessage.class, recordMessage);
        }

        private RecordMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAltitude() {
            this.bitField0_ &= -33;
            this.altitude_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCourseTitle() {
            this.bitField0_ &= -1025;
            this.courseTitle_ = getDefaultInstance().getCourseTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLatitude() {
            this.bitField0_ &= -9;
            this.latitude_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLongitude() {
            this.bitField0_ &= -17;
            this.longitude_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxLatitude() {
            this.bitField0_ &= -65;
            this.maxLatitude_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxLongitude() {
            this.bitField0_ &= -257;
            this.maxLongitude_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMinLatitude() {
            this.bitField0_ &= -129;
            this.minLatitude_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMinLongitude() {
            this.bitField0_ &= -513;
            this.minLongitude_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParentId() {
            this.bitField0_ &= -3;
            this.parentId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackId() {
            this.bitField0_ &= -2;
            this.trackId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearZone() {
            this.bitField0_ &= -5;
            this.zone_ = 0;
        }

        public static RecordMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RecordMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (RecordMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static RecordMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<RecordMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAltitude(int value) {
            this.bitField0_ |= 32;
            this.altitude_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCourseTitle(String value) {
            value.getClass();
            this.bitField0_ |= 1024;
            this.courseTitle_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCourseTitleBytes(ByteString value) {
            this.courseTitle_ = value.toStringUtf8();
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLatitude(int value) {
            this.bitField0_ |= 8;
            this.latitude_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongitude(int value) {
            this.bitField0_ |= 16;
            this.longitude_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxLatitude(int value) {
            this.bitField0_ |= 64;
            this.maxLatitude_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxLongitude(int value) {
            this.bitField0_ |= 256;
            this.maxLongitude_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinLatitude(int value) {
            this.bitField0_ |= 128;
            this.minLatitude_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinLongitude(int value) {
            this.bitField0_ |= 512;
            this.minLongitude_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParentId(int value) {
            this.bitField0_ |= 2;
            this.parentId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackId(int value) {
            this.bitField0_ |= 1;
            this.trackId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setZone(int value) {
            this.bitField0_ |= 4;
            this.zone_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new RecordMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔄ\u0002\u0005ဏ\u0003\u0006ဏ\u0004\u0007ဏ\u0005\bင\u0006\tင\u0007\nင\b\u000bင\t\fဈ\n", new Object[]{"bitField0_", "trackId_", "parentId_", "zone_", "latitude_", "longitude_", "altitude_", "maxLatitude_", "minLatitude_", "maxLongitude_", "minLongitude_", "courseTitle_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RecordMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (RecordMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public int getAltitude() {
            return this.altitude_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public String getCourseTitle() {
            return this.courseTitle_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public ByteString getCourseTitleBytes() {
            return ByteString.copyFromUtf8(this.courseTitle_);
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public int getLatitude() {
            return this.latitude_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public int getLongitude() {
            return this.longitude_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public int getMaxLatitude() {
            return this.maxLatitude_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public int getMaxLongitude() {
            return this.maxLongitude_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public int getMinLatitude() {
            return this.minLatitude_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public int getMinLongitude() {
            return this.minLongitude_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public int getParentId() {
            return this.parentId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public int getTrackId() {
            return this.trackId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public int getZone() {
            return this.zone_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public boolean hasAltitude() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public boolean hasCourseTitle() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public boolean hasLatitude() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public boolean hasLongitude() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public boolean hasMaxLatitude() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public boolean hasMaxLongitude() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public boolean hasMinLatitude() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public boolean hasMinLongitude() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public boolean hasParentId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public boolean hasTrackId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RecordMessageOrBuilder
        public boolean hasZone() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(RecordMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static RecordMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RecordMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static RecordMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RecordMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static RecordMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RecordMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static RecordMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RecordMessage parseFrom(InputStream input) throws IOException {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static RecordMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static RecordMessage parseFrom(CodedInputStream input) throws IOException {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static RecordMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RecordMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface RecordMessageOrBuilder extends MessageLiteOrBuilder {
        int getAltitude();

        String getCourseTitle();

        ByteString getCourseTitleBytes();

        int getLatitude();

        int getLongitude();

        int getMaxLatitude();

        int getMaxLongitude();

        int getMinLatitude();

        int getMinLongitude();

        int getParentId();

        int getTrackId();

        int getZone();

        boolean hasAltitude();

        boolean hasCourseTitle();

        boolean hasLatitude();

        boolean hasLongitude();

        boolean hasMaxLatitude();

        boolean hasMaxLongitude();

        boolean hasMinLatitude();

        boolean hasMinLongitude();

        boolean hasParentId();

        boolean hasTrackId();

        boolean hasZone();
    }

    public static final class RowingMessage extends GeneratedMessageLite<RowingMessage, Builder> implements RowingMessageOrBuilder {
        public static final int AVERAGEPADDLETIME_FIELD_NUMBER = 4;
        public static final int AVERAGEPULLINGTIME_FIELD_NUMBER = 3;
        public static final int AVERAGEROWINGFREQUENCY_FIELD_NUMBER = 1;
        private static final RowingMessage DEFAULT_INSTANCE;
        public static final int HIGHESTROWINGFREQUENCY_FIELD_NUMBER = 2;
        private static volatile Parser<RowingMessage> PARSER;
        private float averagePaddleTime_;
        private float averagePullingTime_;
        private int averageRowingFrequency_;
        private int bitField0_;
        private int highestRowingFrequency_;

        public static final class Builder extends GeneratedMessageLite.Builder<RowingMessage, Builder> implements RowingMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAveragePaddleTime() {
                copyOnWrite();
                ((RowingMessage) this.instance).clearAveragePaddleTime();
                return this;
            }

            public Builder clearAveragePullingTime() {
                copyOnWrite();
                ((RowingMessage) this.instance).clearAveragePullingTime();
                return this;
            }

            public Builder clearAverageRowingFrequency() {
                copyOnWrite();
                ((RowingMessage) this.instance).clearAverageRowingFrequency();
                return this;
            }

            public Builder clearHighestRowingFrequency() {
                copyOnWrite();
                ((RowingMessage) this.instance).clearHighestRowingFrequency();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RowingMessageOrBuilder
            public float getAveragePaddleTime() {
                return ((RowingMessage) this.instance).getAveragePaddleTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RowingMessageOrBuilder
            public float getAveragePullingTime() {
                return ((RowingMessage) this.instance).getAveragePullingTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RowingMessageOrBuilder
            public int getAverageRowingFrequency() {
                return ((RowingMessage) this.instance).getAverageRowingFrequency();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RowingMessageOrBuilder
            public int getHighestRowingFrequency() {
                return ((RowingMessage) this.instance).getHighestRowingFrequency();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RowingMessageOrBuilder
            public boolean hasAveragePaddleTime() {
                return ((RowingMessage) this.instance).hasAveragePaddleTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RowingMessageOrBuilder
            public boolean hasAveragePullingTime() {
                return ((RowingMessage) this.instance).hasAveragePullingTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RowingMessageOrBuilder
            public boolean hasAverageRowingFrequency() {
                return ((RowingMessage) this.instance).hasAverageRowingFrequency();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RowingMessageOrBuilder
            public boolean hasHighestRowingFrequency() {
                return ((RowingMessage) this.instance).hasHighestRowingFrequency();
            }

            public Builder setAveragePaddleTime(float value) {
                copyOnWrite();
                ((RowingMessage) this.instance).setAveragePaddleTime(value);
                return this;
            }

            public Builder setAveragePullingTime(float value) {
                copyOnWrite();
                ((RowingMessage) this.instance).setAveragePullingTime(value);
                return this;
            }

            public Builder setAverageRowingFrequency(int value) {
                copyOnWrite();
                ((RowingMessage) this.instance).setAverageRowingFrequency(value);
                return this;
            }

            public Builder setHighestRowingFrequency(int value) {
                copyOnWrite();
                ((RowingMessage) this.instance).setHighestRowingFrequency(value);
                return this;
            }

            private Builder() {
                super(RowingMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            RowingMessage rowingMessage = new RowingMessage();
            DEFAULT_INSTANCE = rowingMessage;
            GeneratedMessageLite.registerDefaultInstance(RowingMessage.class, rowingMessage);
        }

        private RowingMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAveragePaddleTime() {
            this.bitField0_ &= -9;
            this.averagePaddleTime_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAveragePullingTime() {
            this.bitField0_ &= -5;
            this.averagePullingTime_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageRowingFrequency() {
            this.bitField0_ &= -2;
            this.averageRowingFrequency_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHighestRowingFrequency() {
            this.bitField0_ &= -3;
            this.highestRowingFrequency_ = 0;
        }

        public static RowingMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RowingMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (RowingMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static RowingMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<RowingMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAveragePaddleTime(float value) {
            this.bitField0_ |= 8;
            this.averagePaddleTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAveragePullingTime(float value) {
            this.bitField0_ |= 4;
            this.averagePullingTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageRowingFrequency(int value) {
            this.bitField0_ |= 1;
            this.averageRowingFrequency_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHighestRowingFrequency(int value) {
            this.bitField0_ |= 2;
            this.highestRowingFrequency_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new RowingMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"bitField0_", "averageRowingFrequency_", "highestRowingFrequency_", "averagePullingTime_", "averagePaddleTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RowingMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (RowingMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RowingMessageOrBuilder
        public float getAveragePaddleTime() {
            return this.averagePaddleTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RowingMessageOrBuilder
        public float getAveragePullingTime() {
            return this.averagePullingTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RowingMessageOrBuilder
        public int getAverageRowingFrequency() {
            return this.averageRowingFrequency_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RowingMessageOrBuilder
        public int getHighestRowingFrequency() {
            return this.highestRowingFrequency_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RowingMessageOrBuilder
        public boolean hasAveragePaddleTime() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RowingMessageOrBuilder
        public boolean hasAveragePullingTime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RowingMessageOrBuilder
        public boolean hasAverageRowingFrequency() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.RowingMessageOrBuilder
        public boolean hasHighestRowingFrequency() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(RowingMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static RowingMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RowingMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static RowingMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RowingMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static RowingMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RowingMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static RowingMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RowingMessage parseFrom(InputStream input) throws IOException {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static RowingMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static RowingMessage parseFrom(CodedInputStream input) throws IOException {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static RowingMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RowingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface RowingMessageOrBuilder extends MessageLiteOrBuilder {
        float getAveragePaddleTime();

        float getAveragePullingTime();

        int getAverageRowingFrequency();

        int getHighestRowingFrequency();

        boolean hasAveragePaddleTime();

        boolean hasAveragePullingTime();

        boolean hasAverageRowingFrequency();

        boolean hasHighestRowingFrequency();
    }

    public static final class SWingMessage extends GeneratedMessageLite<SWingMessage, Builder> implements SWingMessageOrBuilder {
        public static final int BACKHANDPERCENTAGE_FIELD_NUMBER = 6;
        private static final SWingMessage DEFAULT_INSTANCE;
        public static final int FOREHANDPERCENTAGE_FIELD_NUMBER = 5;
        private static volatile Parser<SWingMessage> PARSER = null;
        public static final int PERCENTAGEOFSERVETIMES_FIELD_NUMBER = 7;
        public static final int SERVETIMES_FIELD_NUMBER = 4;
        public static final int TIMESOFBACKHANDSWING_FIELD_NUMBER = 3;
        public static final int TIMESOFFOREHANDSWING_FIELD_NUMBER = 2;
        public static final int TOTALTIMESOFSWING_FIELD_NUMBER = 1;
        private int backhandPercentage_;
        private int bitField0_;
        private int forehandPercentage_;
        private int percentageOfServeTimes_;
        private int serveTimes_;
        private int timesOfBackhandSwing_;
        private int timesOfForehandSwing_;
        private int totalTimesOfSwing_;

        public static final class Builder extends GeneratedMessageLite.Builder<SWingMessage, Builder> implements SWingMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBackhandPercentage() {
                copyOnWrite();
                ((SWingMessage) this.instance).clearBackhandPercentage();
                return this;
            }

            public Builder clearForehandPercentage() {
                copyOnWrite();
                ((SWingMessage) this.instance).clearForehandPercentage();
                return this;
            }

            public Builder clearPercentageOfServeTimes() {
                copyOnWrite();
                ((SWingMessage) this.instance).clearPercentageOfServeTimes();
                return this;
            }

            public Builder clearServeTimes() {
                copyOnWrite();
                ((SWingMessage) this.instance).clearServeTimes();
                return this;
            }

            public Builder clearTimesOfBackhandSwing() {
                copyOnWrite();
                ((SWingMessage) this.instance).clearTimesOfBackhandSwing();
                return this;
            }

            public Builder clearTimesOfForehandSwing() {
                copyOnWrite();
                ((SWingMessage) this.instance).clearTimesOfForehandSwing();
                return this;
            }

            public Builder clearTotalTimesOfSwing() {
                copyOnWrite();
                ((SWingMessage) this.instance).clearTotalTimesOfSwing();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
            public int getBackhandPercentage() {
                return ((SWingMessage) this.instance).getBackhandPercentage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
            public int getForehandPercentage() {
                return ((SWingMessage) this.instance).getForehandPercentage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
            public int getPercentageOfServeTimes() {
                return ((SWingMessage) this.instance).getPercentageOfServeTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
            public int getServeTimes() {
                return ((SWingMessage) this.instance).getServeTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
            public int getTimesOfBackhandSwing() {
                return ((SWingMessage) this.instance).getTimesOfBackhandSwing();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
            public int getTimesOfForehandSwing() {
                return ((SWingMessage) this.instance).getTimesOfForehandSwing();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
            public int getTotalTimesOfSwing() {
                return ((SWingMessage) this.instance).getTotalTimesOfSwing();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
            public boolean hasBackhandPercentage() {
                return ((SWingMessage) this.instance).hasBackhandPercentage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
            public boolean hasForehandPercentage() {
                return ((SWingMessage) this.instance).hasForehandPercentage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
            public boolean hasPercentageOfServeTimes() {
                return ((SWingMessage) this.instance).hasPercentageOfServeTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
            public boolean hasServeTimes() {
                return ((SWingMessage) this.instance).hasServeTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
            public boolean hasTimesOfBackhandSwing() {
                return ((SWingMessage) this.instance).hasTimesOfBackhandSwing();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
            public boolean hasTimesOfForehandSwing() {
                return ((SWingMessage) this.instance).hasTimesOfForehandSwing();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
            public boolean hasTotalTimesOfSwing() {
                return ((SWingMessage) this.instance).hasTotalTimesOfSwing();
            }

            public Builder setBackhandPercentage(int value) {
                copyOnWrite();
                ((SWingMessage) this.instance).setBackhandPercentage(value);
                return this;
            }

            public Builder setForehandPercentage(int value) {
                copyOnWrite();
                ((SWingMessage) this.instance).setForehandPercentage(value);
                return this;
            }

            public Builder setPercentageOfServeTimes(int value) {
                copyOnWrite();
                ((SWingMessage) this.instance).setPercentageOfServeTimes(value);
                return this;
            }

            public Builder setServeTimes(int value) {
                copyOnWrite();
                ((SWingMessage) this.instance).setServeTimes(value);
                return this;
            }

            public Builder setTimesOfBackhandSwing(int value) {
                copyOnWrite();
                ((SWingMessage) this.instance).setTimesOfBackhandSwing(value);
                return this;
            }

            public Builder setTimesOfForehandSwing(int value) {
                copyOnWrite();
                ((SWingMessage) this.instance).setTimesOfForehandSwing(value);
                return this;
            }

            public Builder setTotalTimesOfSwing(int value) {
                copyOnWrite();
                ((SWingMessage) this.instance).setTotalTimesOfSwing(value);
                return this;
            }

            private Builder() {
                super(SWingMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            SWingMessage sWingMessage = new SWingMessage();
            DEFAULT_INSTANCE = sWingMessage;
            GeneratedMessageLite.registerDefaultInstance(SWingMessage.class, sWingMessage);
        }

        private SWingMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackhandPercentage() {
            this.bitField0_ &= -33;
            this.backhandPercentage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearForehandPercentage() {
            this.bitField0_ &= -17;
            this.forehandPercentage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPercentageOfServeTimes() {
            this.bitField0_ &= -65;
            this.percentageOfServeTimes_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServeTimes() {
            this.bitField0_ &= -9;
            this.serveTimes_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimesOfBackhandSwing() {
            this.bitField0_ &= -5;
            this.timesOfBackhandSwing_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimesOfForehandSwing() {
            this.bitField0_ &= -3;
            this.timesOfForehandSwing_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalTimesOfSwing() {
            this.bitField0_ &= -2;
            this.totalTimesOfSwing_ = 0;
        }

        public static SWingMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SWingMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (SWingMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static SWingMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<SWingMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackhandPercentage(int value) {
            this.bitField0_ |= 32;
            this.backhandPercentage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForehandPercentage(int value) {
            this.bitField0_ |= 16;
            this.forehandPercentage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPercentageOfServeTimes(int value) {
            this.bitField0_ |= 64;
            this.percentageOfServeTimes_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServeTimes(int value) {
            this.bitField0_ |= 8;
            this.serveTimes_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimesOfBackhandSwing(int value) {
            this.bitField0_ |= 4;
            this.timesOfBackhandSwing_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimesOfForehandSwing(int value) {
            this.bitField0_ |= 2;
            this.timesOfForehandSwing_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalTimesOfSwing(int value) {
            this.bitField0_ |= 1;
            this.totalTimesOfSwing_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new SWingMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006", new Object[]{"bitField0_", "totalTimesOfSwing_", "timesOfForehandSwing_", "timesOfBackhandSwing_", "serveTimes_", "forehandPercentage_", "backhandPercentage_", "percentageOfServeTimes_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SWingMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SWingMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
        public int getBackhandPercentage() {
            return this.backhandPercentage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
        public int getForehandPercentage() {
            return this.forehandPercentage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
        public int getPercentageOfServeTimes() {
            return this.percentageOfServeTimes_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
        public int getServeTimes() {
            return this.serveTimes_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
        public int getTimesOfBackhandSwing() {
            return this.timesOfBackhandSwing_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
        public int getTimesOfForehandSwing() {
            return this.timesOfForehandSwing_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
        public int getTotalTimesOfSwing() {
            return this.totalTimesOfSwing_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
        public boolean hasBackhandPercentage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
        public boolean hasForehandPercentage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
        public boolean hasPercentageOfServeTimes() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
        public boolean hasServeTimes() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
        public boolean hasTimesOfBackhandSwing() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
        public boolean hasTimesOfForehandSwing() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SWingMessageOrBuilder
        public boolean hasTotalTimesOfSwing() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SWingMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static SWingMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SWingMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SWingMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SWingMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SWingMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SWingMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SWingMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SWingMessage parseFrom(InputStream input) throws IOException {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SWingMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SWingMessage parseFrom(CodedInputStream input) throws IOException {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SWingMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SWingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface SWingMessageOrBuilder extends MessageLiteOrBuilder {
        int getBackhandPercentage();

        int getForehandPercentage();

        int getPercentageOfServeTimes();

        int getServeTimes();

        int getTimesOfBackhandSwing();

        int getTimesOfForehandSwing();

        int getTotalTimesOfSwing();

        boolean hasBackhandPercentage();

        boolean hasForehandPercentage();

        boolean hasPercentageOfServeTimes();

        boolean hasServeTimes();

        boolean hasTimesOfBackhandSwing();

        boolean hasTimesOfForehandSwing();

        boolean hasTotalTimesOfSwing();
    }

    public static final class SlopeChartMessage extends GeneratedMessageLite<SlopeChartMessage, Builder> implements SlopeChartMessageOrBuilder {
        private static final SlopeChartMessage DEFAULT_INSTANCE;
        public static final int DOWNHILLDISTANCE_FIELD_NUMBER = 2;
        public static final int DOWNHILLTIME_FIELD_NUMBER = 4;
        private static volatile Parser<SlopeChartMessage> PARSER = null;
        public static final int UPHILLDISTANCE_FIELD_NUMBER = 1;
        public static final int UPHILLTIME_FIELD_NUMBER = 3;
        private int bitField0_;
        private int downhillDistance_;
        private int downhillTime_;
        private int uphillDistance_;
        private int uphillTime_;

        public static final class Builder extends GeneratedMessageLite.Builder<SlopeChartMessage, Builder> implements SlopeChartMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDownhillDistance() {
                copyOnWrite();
                ((SlopeChartMessage) this.instance).clearDownhillDistance();
                return this;
            }

            public Builder clearDownhillTime() {
                copyOnWrite();
                ((SlopeChartMessage) this.instance).clearDownhillTime();
                return this;
            }

            public Builder clearUphillDistance() {
                copyOnWrite();
                ((SlopeChartMessage) this.instance).clearUphillDistance();
                return this;
            }

            public Builder clearUphillTime() {
                copyOnWrite();
                ((SlopeChartMessage) this.instance).clearUphillTime();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeChartMessageOrBuilder
            public int getDownhillDistance() {
                return ((SlopeChartMessage) this.instance).getDownhillDistance();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeChartMessageOrBuilder
            public int getDownhillTime() {
                return ((SlopeChartMessage) this.instance).getDownhillTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeChartMessageOrBuilder
            public int getUphillDistance() {
                return ((SlopeChartMessage) this.instance).getUphillDistance();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeChartMessageOrBuilder
            public int getUphillTime() {
                return ((SlopeChartMessage) this.instance).getUphillTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeChartMessageOrBuilder
            public boolean hasDownhillDistance() {
                return ((SlopeChartMessage) this.instance).hasDownhillDistance();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeChartMessageOrBuilder
            public boolean hasDownhillTime() {
                return ((SlopeChartMessage) this.instance).hasDownhillTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeChartMessageOrBuilder
            public boolean hasUphillDistance() {
                return ((SlopeChartMessage) this.instance).hasUphillDistance();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeChartMessageOrBuilder
            public boolean hasUphillTime() {
                return ((SlopeChartMessage) this.instance).hasUphillTime();
            }

            public Builder setDownhillDistance(int value) {
                copyOnWrite();
                ((SlopeChartMessage) this.instance).setDownhillDistance(value);
                return this;
            }

            public Builder setDownhillTime(int value) {
                copyOnWrite();
                ((SlopeChartMessage) this.instance).setDownhillTime(value);
                return this;
            }

            public Builder setUphillDistance(int value) {
                copyOnWrite();
                ((SlopeChartMessage) this.instance).setUphillDistance(value);
                return this;
            }

            public Builder setUphillTime(int value) {
                copyOnWrite();
                ((SlopeChartMessage) this.instance).setUphillTime(value);
                return this;
            }

            private Builder() {
                super(SlopeChartMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            SlopeChartMessage slopeChartMessage = new SlopeChartMessage();
            DEFAULT_INSTANCE = slopeChartMessage;
            GeneratedMessageLite.registerDefaultInstance(SlopeChartMessage.class, slopeChartMessage);
        }

        private SlopeChartMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDownhillDistance() {
            this.bitField0_ &= -3;
            this.downhillDistance_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDownhillTime() {
            this.bitField0_ &= -9;
            this.downhillTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUphillDistance() {
            this.bitField0_ &= -2;
            this.uphillDistance_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUphillTime() {
            this.bitField0_ &= -5;
            this.uphillTime_ = 0;
        }

        public static SlopeChartMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SlopeChartMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (SlopeChartMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static SlopeChartMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<SlopeChartMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDownhillDistance(int value) {
            this.bitField0_ |= 2;
            this.downhillDistance_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDownhillTime(int value) {
            this.bitField0_ |= 8;
            this.downhillTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUphillDistance(int value) {
            this.bitField0_ |= 1;
            this.uphillDistance_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUphillTime(int value) {
            this.bitField0_ |= 4;
            this.uphillTime_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new SlopeChartMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "uphillDistance_", "downhillDistance_", "uphillTime_", "downhillTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SlopeChartMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SlopeChartMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeChartMessageOrBuilder
        public int getDownhillDistance() {
            return this.downhillDistance_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeChartMessageOrBuilder
        public int getDownhillTime() {
            return this.downhillTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeChartMessageOrBuilder
        public int getUphillDistance() {
            return this.uphillDistance_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeChartMessageOrBuilder
        public int getUphillTime() {
            return this.uphillTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeChartMessageOrBuilder
        public boolean hasDownhillDistance() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeChartMessageOrBuilder
        public boolean hasDownhillTime() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeChartMessageOrBuilder
        public boolean hasUphillDistance() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeChartMessageOrBuilder
        public boolean hasUphillTime() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(SlopeChartMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static SlopeChartMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SlopeChartMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SlopeChartMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SlopeChartMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SlopeChartMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SlopeChartMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SlopeChartMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SlopeChartMessage parseFrom(InputStream input) throws IOException {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SlopeChartMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SlopeChartMessage parseFrom(CodedInputStream input) throws IOException {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SlopeChartMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SlopeChartMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface SlopeChartMessageOrBuilder extends MessageLiteOrBuilder {
        int getDownhillDistance();

        int getDownhillTime();

        int getUphillDistance();

        int getUphillTime();

        boolean hasDownhillDistance();

        boolean hasDownhillTime();

        boolean hasUphillDistance();

        boolean hasUphillTime();
    }

    public static final class SlopeMessage extends GeneratedMessageLite<SlopeMessage, Builder> implements SlopeMessageOrBuilder {
        public static final int AVERAGESLOPE_FIELD_NUMBER = 1;
        private static final SlopeMessage DEFAULT_INSTANCE;
        public static final int MAXIMUMSLOPE_FIELD_NUMBER = 2;
        private static volatile Parser<SlopeMessage> PARSER;
        private int averageSlope_;
        private int bitField0_;
        private int maximumSlope_;

        public static final class Builder extends GeneratedMessageLite.Builder<SlopeMessage, Builder> implements SlopeMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAverageSlope() {
                copyOnWrite();
                ((SlopeMessage) this.instance).clearAverageSlope();
                return this;
            }

            public Builder clearMaximumSlope() {
                copyOnWrite();
                ((SlopeMessage) this.instance).clearMaximumSlope();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeMessageOrBuilder
            public int getAverageSlope() {
                return ((SlopeMessage) this.instance).getAverageSlope();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeMessageOrBuilder
            public int getMaximumSlope() {
                return ((SlopeMessage) this.instance).getMaximumSlope();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeMessageOrBuilder
            public boolean hasAverageSlope() {
                return ((SlopeMessage) this.instance).hasAverageSlope();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeMessageOrBuilder
            public boolean hasMaximumSlope() {
                return ((SlopeMessage) this.instance).hasMaximumSlope();
            }

            public Builder setAverageSlope(int value) {
                copyOnWrite();
                ((SlopeMessage) this.instance).setAverageSlope(value);
                return this;
            }

            public Builder setMaximumSlope(int value) {
                copyOnWrite();
                ((SlopeMessage) this.instance).setMaximumSlope(value);
                return this;
            }

            private Builder() {
                super(SlopeMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            SlopeMessage slopeMessage = new SlopeMessage();
            DEFAULT_INSTANCE = slopeMessage;
            GeneratedMessageLite.registerDefaultInstance(SlopeMessage.class, slopeMessage);
        }

        private SlopeMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageSlope() {
            this.bitField0_ &= -2;
            this.averageSlope_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaximumSlope() {
            this.bitField0_ &= -3;
            this.maximumSlope_ = 0;
        }

        public static SlopeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SlopeMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (SlopeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static SlopeMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<SlopeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageSlope(int value) {
            this.bitField0_ |= 1;
            this.averageSlope_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumSlope(int value) {
            this.bitField0_ |= 2;
            this.maximumSlope_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new SlopeMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "averageSlope_", "maximumSlope_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SlopeMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SlopeMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeMessageOrBuilder
        public int getAverageSlope() {
            return this.averageSlope_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeMessageOrBuilder
        public int getMaximumSlope() {
            return this.maximumSlope_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeMessageOrBuilder
        public boolean hasAverageSlope() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SlopeMessageOrBuilder
        public boolean hasMaximumSlope() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(SlopeMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static SlopeMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SlopeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SlopeMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SlopeMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SlopeMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SlopeMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SlopeMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SlopeMessage parseFrom(InputStream input) throws IOException {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SlopeMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SlopeMessage parseFrom(CodedInputStream input) throws IOException {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SlopeMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SlopeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface SlopeMessageOrBuilder extends MessageLiteOrBuilder {
        int getAverageSlope();

        int getMaximumSlope();

        boolean hasAverageSlope();

        boolean hasMaximumSlope();
    }

    public static final class SpeedMessage extends GeneratedMessageLite<SpeedMessage, Builder> implements SpeedMessageOrBuilder {
        public static final int AVERAGESPEED_FIELD_NUMBER = 1;
        private static final SpeedMessage DEFAULT_INSTANCE;
        public static final int MAXIMUMSPEED_FIELD_NUMBER = 2;
        private static volatile Parser<SpeedMessage> PARSER;
        private float averageSpeed_;
        private int bitField0_;
        private float maximumSpeed_;

        public static final class Builder extends GeneratedMessageLite.Builder<SpeedMessage, Builder> implements SpeedMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAverageSpeed() {
                copyOnWrite();
                ((SpeedMessage) this.instance).clearAverageSpeed();
                return this;
            }

            public Builder clearMaximumSpeed() {
                copyOnWrite();
                ((SpeedMessage) this.instance).clearMaximumSpeed();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SpeedMessageOrBuilder
            public float getAverageSpeed() {
                return ((SpeedMessage) this.instance).getAverageSpeed();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SpeedMessageOrBuilder
            public float getMaximumSpeed() {
                return ((SpeedMessage) this.instance).getMaximumSpeed();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SpeedMessageOrBuilder
            public boolean hasAverageSpeed() {
                return ((SpeedMessage) this.instance).hasAverageSpeed();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SpeedMessageOrBuilder
            public boolean hasMaximumSpeed() {
                return ((SpeedMessage) this.instance).hasMaximumSpeed();
            }

            public Builder setAverageSpeed(float value) {
                copyOnWrite();
                ((SpeedMessage) this.instance).setAverageSpeed(value);
                return this;
            }

            public Builder setMaximumSpeed(float value) {
                copyOnWrite();
                ((SpeedMessage) this.instance).setMaximumSpeed(value);
                return this;
            }

            private Builder() {
                super(SpeedMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            SpeedMessage speedMessage = new SpeedMessage();
            DEFAULT_INSTANCE = speedMessage;
            GeneratedMessageLite.registerDefaultInstance(SpeedMessage.class, speedMessage);
        }

        private SpeedMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageSpeed() {
            this.bitField0_ &= -2;
            this.averageSpeed_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaximumSpeed() {
            this.bitField0_ &= -3;
            this.maximumSpeed_ = 0.0f;
        }

        public static SpeedMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SpeedMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (SpeedMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static SpeedMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<SpeedMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageSpeed(float value) {
            this.bitField0_ |= 1;
            this.averageSpeed_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumSpeed(float value) {
            this.bitField0_ |= 2;
            this.maximumSpeed_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new SpeedMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"bitField0_", "averageSpeed_", "maximumSpeed_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SpeedMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SpeedMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SpeedMessageOrBuilder
        public float getAverageSpeed() {
            return this.averageSpeed_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SpeedMessageOrBuilder
        public float getMaximumSpeed() {
            return this.maximumSpeed_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SpeedMessageOrBuilder
        public boolean hasAverageSpeed() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SpeedMessageOrBuilder
        public boolean hasMaximumSpeed() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(SpeedMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static SpeedMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SpeedMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SpeedMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SpeedMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SpeedMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SpeedMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SpeedMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SpeedMessage parseFrom(InputStream input) throws IOException {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SpeedMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SpeedMessage parseFrom(CodedInputStream input) throws IOException {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SpeedMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SpeedMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface SpeedMessageOrBuilder extends MessageLiteOrBuilder {
        float getAverageSpeed();

        float getMaximumSpeed();

        boolean hasAverageSpeed();

        boolean hasMaximumSpeed();
    }

    public static final class SportSummaryMessage extends GeneratedMessageLite<SportSummaryMessage, Builder> implements SportSummaryMessageOrBuilder {
        public static final int ALTITUDE_FIELD_NUMBER = 13;
        public static final int CALORIES_FIELD_NUMBER = 16;
        private static final SportSummaryMessage DEFAULT_INSTANCE;
        public static final int DISTANCE_FIELD_NUMBER = 4;
        public static final int DOWNHILL_FIELD_NUMBER = 6;
        public static final int FLOORS_FIELD_NUMBER = 8;
        public static final int FREQUENCY_FIELD_NUMBER = 18;
        public static final int GOAL_FIELD_NUMBER = 28;
        public static final int GOLF_FIELD_NUMBER = 29;
        public static final int HEARTRATE_FIELD_NUMBER = 19;
        public static final int HRZONE_FIELD_NUMBER = 22;
        public static final int MARATHON_FIELD_NUMBER = 26;
        public static final int NUMBER_FIELD_NUMBER = 5;
        public static final int OTHER_FIELD_NUMBER = 21;
        public static final int PACE_FIELD_NUMBER = 10;
        private static volatile Parser<SportSummaryMessage> PARSER = null;
        public static final int POWER_FIELD_NUMBER = 30;
        public static final int PRESSURE_FIELD_NUMBER = 27;
        public static final int RECORD_FIELD_NUMBER = 2;
        public static final int ROWING_FIELD_NUMBER = 17;
        public static final int SLOPECHART_FIELD_NUMBER = 23;
        public static final int SLOPE_FIELD_NUMBER = 14;
        public static final int STEPS_FIELD_NUMBER = 11;
        public static final int SWIM_FIELD_NUMBER = 9;
        public static final int SWING_FIELD_NUMBER = 15;
        public static final int TEMP_FIELD_NUMBER = 20;
        public static final int TIMES_FIELD_NUMBER = 7;
        public static final int TYPE_FIELD_NUMBER = 3;
        public static final int VERSION_FIELD_NUMBER = 1;
        private AltitudeMessage altitude_;
        private int bitField0_;
        private CaloriesMessage calories_;
        private DistanceMessage distance_;
        private DownhillMessage downhill_;
        private FloorsMessage floors_;
        private FrequencyMessage frequency_;
        private GoalMessage goal_;
        private GolfMessage golf_;
        private HeartRateMessage heartRate_;
        private HeartrateZoneMessage hrZone_;
        private NumberMessage number_;
        private OtherMessage other_;
        private PaceMessage pace_;
        private PowerMessage power_;
        private PressureMessage pressure_;
        private RecordMessage record_;
        private RowingMessage rowing_;
        private SlopeChartMessage slopeChart_;
        private SlopeMessage slope_;
        private StepsMessage steps_;
        private SwimMessage swim_;
        private SWingMessage swing_;
        private TempMessage temp_;
        private TimeMessage times_;
        private TypeMessage type_;
        private byte memoizedIsInitialized = 2;
        private String version_ = "2.1";
        private Internal.ProtobufList<MarathonMessage> marathon_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<SportSummaryMessage, Builder> implements SportSummaryMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllMarathon(Iterable<? extends MarathonMessage> values) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).addAllMarathon(values);
                return this;
            }

            public Builder addMarathon(MarathonMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).addMarathon(value);
                return this;
            }

            public Builder clearAltitude() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearAltitude();
                return this;
            }

            public Builder clearCalories() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearCalories();
                return this;
            }

            public Builder clearDistance() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearDistance();
                return this;
            }

            public Builder clearDownhill() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearDownhill();
                return this;
            }

            public Builder clearFloors() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearFloors();
                return this;
            }

            public Builder clearFrequency() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearFrequency();
                return this;
            }

            public Builder clearGoal() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearGoal();
                return this;
            }

            public Builder clearGolf() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearGolf();
                return this;
            }

            public Builder clearHeartRate() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearHeartRate();
                return this;
            }

            public Builder clearHrZone() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearHrZone();
                return this;
            }

            public Builder clearMarathon() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearMarathon();
                return this;
            }

            public Builder clearNumber() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearNumber();
                return this;
            }

            public Builder clearOther() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearOther();
                return this;
            }

            public Builder clearPace() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearPace();
                return this;
            }

            public Builder clearPower() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearPower();
                return this;
            }

            public Builder clearPressure() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearPressure();
                return this;
            }

            public Builder clearRecord() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearRecord();
                return this;
            }

            public Builder clearRowing() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearRowing();
                return this;
            }

            public Builder clearSlope() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearSlope();
                return this;
            }

            public Builder clearSlopeChart() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearSlopeChart();
                return this;
            }

            public Builder clearSteps() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearSteps();
                return this;
            }

            public Builder clearSwim() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearSwim();
                return this;
            }

            public Builder clearSwing() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearSwing();
                return this;
            }

            public Builder clearTemp() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearTemp();
                return this;
            }

            public Builder clearTimes() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearTimes();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearType();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).clearVersion();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public AltitudeMessage getAltitude() {
                return ((SportSummaryMessage) this.instance).getAltitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public CaloriesMessage getCalories() {
                return ((SportSummaryMessage) this.instance).getCalories();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public DistanceMessage getDistance() {
                return ((SportSummaryMessage) this.instance).getDistance();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public DownhillMessage getDownhill() {
                return ((SportSummaryMessage) this.instance).getDownhill();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public FloorsMessage getFloors() {
                return ((SportSummaryMessage) this.instance).getFloors();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public FrequencyMessage getFrequency() {
                return ((SportSummaryMessage) this.instance).getFrequency();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public GoalMessage getGoal() {
                return ((SportSummaryMessage) this.instance).getGoal();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public GolfMessage getGolf() {
                return ((SportSummaryMessage) this.instance).getGolf();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public HeartRateMessage getHeartRate() {
                return ((SportSummaryMessage) this.instance).getHeartRate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public HeartrateZoneMessage getHrZone() {
                return ((SportSummaryMessage) this.instance).getHrZone();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public MarathonMessage getMarathon(int index) {
                return ((SportSummaryMessage) this.instance).getMarathon(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public int getMarathonCount() {
                return ((SportSummaryMessage) this.instance).getMarathonCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public List<MarathonMessage> getMarathonList() {
                return Collections.unmodifiableList(((SportSummaryMessage) this.instance).getMarathonList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public NumberMessage getNumber() {
                return ((SportSummaryMessage) this.instance).getNumber();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public OtherMessage getOther() {
                return ((SportSummaryMessage) this.instance).getOther();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public PaceMessage getPace() {
                return ((SportSummaryMessage) this.instance).getPace();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public PowerMessage getPower() {
                return ((SportSummaryMessage) this.instance).getPower();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public PressureMessage getPressure() {
                return ((SportSummaryMessage) this.instance).getPressure();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public RecordMessage getRecord() {
                return ((SportSummaryMessage) this.instance).getRecord();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public RowingMessage getRowing() {
                return ((SportSummaryMessage) this.instance).getRowing();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public SlopeMessage getSlope() {
                return ((SportSummaryMessage) this.instance).getSlope();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public SlopeChartMessage getSlopeChart() {
                return ((SportSummaryMessage) this.instance).getSlopeChart();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public StepsMessage getSteps() {
                return ((SportSummaryMessage) this.instance).getSteps();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public SwimMessage getSwim() {
                return ((SportSummaryMessage) this.instance).getSwim();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public SWingMessage getSwing() {
                return ((SportSummaryMessage) this.instance).getSwing();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public TempMessage getTemp() {
                return ((SportSummaryMessage) this.instance).getTemp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public TimeMessage getTimes() {
                return ((SportSummaryMessage) this.instance).getTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public TypeMessage getType() {
                return ((SportSummaryMessage) this.instance).getType();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public String getVersion() {
                return ((SportSummaryMessage) this.instance).getVersion();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public ByteString getVersionBytes() {
                return ((SportSummaryMessage) this.instance).getVersionBytes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasAltitude() {
                return ((SportSummaryMessage) this.instance).hasAltitude();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasCalories() {
                return ((SportSummaryMessage) this.instance).hasCalories();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasDistance() {
                return ((SportSummaryMessage) this.instance).hasDistance();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasDownhill() {
                return ((SportSummaryMessage) this.instance).hasDownhill();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasFloors() {
                return ((SportSummaryMessage) this.instance).hasFloors();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasFrequency() {
                return ((SportSummaryMessage) this.instance).hasFrequency();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasGoal() {
                return ((SportSummaryMessage) this.instance).hasGoal();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasGolf() {
                return ((SportSummaryMessage) this.instance).hasGolf();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasHeartRate() {
                return ((SportSummaryMessage) this.instance).hasHeartRate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasHrZone() {
                return ((SportSummaryMessage) this.instance).hasHrZone();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasNumber() {
                return ((SportSummaryMessage) this.instance).hasNumber();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasOther() {
                return ((SportSummaryMessage) this.instance).hasOther();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasPace() {
                return ((SportSummaryMessage) this.instance).hasPace();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasPower() {
                return ((SportSummaryMessage) this.instance).hasPower();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasPressure() {
                return ((SportSummaryMessage) this.instance).hasPressure();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasRecord() {
                return ((SportSummaryMessage) this.instance).hasRecord();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasRowing() {
                return ((SportSummaryMessage) this.instance).hasRowing();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasSlope() {
                return ((SportSummaryMessage) this.instance).hasSlope();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasSlopeChart() {
                return ((SportSummaryMessage) this.instance).hasSlopeChart();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasSteps() {
                return ((SportSummaryMessage) this.instance).hasSteps();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasSwim() {
                return ((SportSummaryMessage) this.instance).hasSwim();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasSwing() {
                return ((SportSummaryMessage) this.instance).hasSwing();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasTemp() {
                return ((SportSummaryMessage) this.instance).hasTemp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasTimes() {
                return ((SportSummaryMessage) this.instance).hasTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasType() {
                return ((SportSummaryMessage) this.instance).hasType();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
            public boolean hasVersion() {
                return ((SportSummaryMessage) this.instance).hasVersion();
            }

            public Builder mergeAltitude(AltitudeMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeAltitude(value);
                return this;
            }

            public Builder mergeCalories(CaloriesMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeCalories(value);
                return this;
            }

            public Builder mergeDistance(DistanceMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeDistance(value);
                return this;
            }

            public Builder mergeDownhill(DownhillMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeDownhill(value);
                return this;
            }

            public Builder mergeFloors(FloorsMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeFloors(value);
                return this;
            }

            public Builder mergeFrequency(FrequencyMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeFrequency(value);
                return this;
            }

            public Builder mergeGoal(GoalMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeGoal(value);
                return this;
            }

            public Builder mergeGolf(GolfMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeGolf(value);
                return this;
            }

            public Builder mergeHeartRate(HeartRateMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeHeartRate(value);
                return this;
            }

            public Builder mergeHrZone(HeartrateZoneMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeHrZone(value);
                return this;
            }

            public Builder mergeNumber(NumberMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeNumber(value);
                return this;
            }

            public Builder mergeOther(OtherMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeOther(value);
                return this;
            }

            public Builder mergePace(PaceMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergePace(value);
                return this;
            }

            public Builder mergePower(PowerMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergePower(value);
                return this;
            }

            public Builder mergePressure(PressureMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergePressure(value);
                return this;
            }

            public Builder mergeRecord(RecordMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeRecord(value);
                return this;
            }

            public Builder mergeRowing(RowingMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeRowing(value);
                return this;
            }

            public Builder mergeSlope(SlopeMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeSlope(value);
                return this;
            }

            public Builder mergeSlopeChart(SlopeChartMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeSlopeChart(value);
                return this;
            }

            public Builder mergeSteps(StepsMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeSteps(value);
                return this;
            }

            public Builder mergeSwim(SwimMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeSwim(value);
                return this;
            }

            public Builder mergeSwing(SWingMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeSwing(value);
                return this;
            }

            public Builder mergeTemp(TempMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeTemp(value);
                return this;
            }

            public Builder mergeTimes(TimeMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeTimes(value);
                return this;
            }

            public Builder mergeType(TypeMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).mergeType(value);
                return this;
            }

            public Builder removeMarathon(int index) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).removeMarathon(index);
                return this;
            }

            public Builder setAltitude(AltitudeMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setAltitude(value);
                return this;
            }

            public Builder setCalories(CaloriesMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setCalories(value);
                return this;
            }

            public Builder setDistance(DistanceMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setDistance(value);
                return this;
            }

            public Builder setDownhill(DownhillMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setDownhill(value);
                return this;
            }

            public Builder setFloors(FloorsMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setFloors(value);
                return this;
            }

            public Builder setFrequency(FrequencyMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setFrequency(value);
                return this;
            }

            public Builder setGoal(GoalMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setGoal(value);
                return this;
            }

            public Builder setGolf(GolfMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setGolf(value);
                return this;
            }

            public Builder setHeartRate(HeartRateMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setHeartRate(value);
                return this;
            }

            public Builder setHrZone(HeartrateZoneMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setHrZone(value);
                return this;
            }

            public Builder setMarathon(int index, MarathonMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setMarathon(index, value);
                return this;
            }

            public Builder setNumber(NumberMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setNumber(value);
                return this;
            }

            public Builder setOther(OtherMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setOther(value);
                return this;
            }

            public Builder setPace(PaceMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setPace(value);
                return this;
            }

            public Builder setPower(PowerMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setPower(value);
                return this;
            }

            public Builder setPressure(PressureMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setPressure(value);
                return this;
            }

            public Builder setRecord(RecordMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setRecord(value);
                return this;
            }

            public Builder setRowing(RowingMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setRowing(value);
                return this;
            }

            public Builder setSlope(SlopeMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSlope(value);
                return this;
            }

            public Builder setSlopeChart(SlopeChartMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSlopeChart(value);
                return this;
            }

            public Builder setSteps(StepsMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSteps(value);
                return this;
            }

            public Builder setSwim(SwimMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSwim(value);
                return this;
            }

            public Builder setSwing(SWingMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSwing(value);
                return this;
            }

            public Builder setTemp(TempMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setTemp(value);
                return this;
            }

            public Builder setTimes(TimeMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setTimes(value);
                return this;
            }

            public Builder setType(TypeMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setType(value);
                return this;
            }

            public Builder setVersion(String value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setVersion(value);
                return this;
            }

            public Builder setVersionBytes(ByteString value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setVersionBytes(value);
                return this;
            }

            private Builder() {
                super(SportSummaryMessage.DEFAULT_INSTANCE);
            }

            public Builder addMarathon(int index, MarathonMessage value) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).addMarathon(index, value);
                return this;
            }

            public Builder setAltitude(AltitudeMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setAltitude(builderForValue.build());
                return this;
            }

            public Builder setCalories(CaloriesMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setCalories(builderForValue.build());
                return this;
            }

            public Builder setDistance(DistanceMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setDistance(builderForValue.build());
                return this;
            }

            public Builder setDownhill(DownhillMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setDownhill(builderForValue.build());
                return this;
            }

            public Builder setFloors(FloorsMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setFloors(builderForValue.build());
                return this;
            }

            public Builder setFrequency(FrequencyMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setFrequency(builderForValue.build());
                return this;
            }

            public Builder setGoal(GoalMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setGoal(builderForValue.build());
                return this;
            }

            public Builder setGolf(GolfMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setGolf(builderForValue.build());
                return this;
            }

            public Builder setHeartRate(HeartRateMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setHeartRate(builderForValue.build());
                return this;
            }

            public Builder setHrZone(HeartrateZoneMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setHrZone(builderForValue.build());
                return this;
            }

            public Builder setMarathon(int index, MarathonMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setMarathon(index, builderForValue.build());
                return this;
            }

            public Builder setNumber(NumberMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setNumber(builderForValue.build());
                return this;
            }

            public Builder setOther(OtherMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setOther(builderForValue.build());
                return this;
            }

            public Builder setPace(PaceMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setPace(builderForValue.build());
                return this;
            }

            public Builder setPower(PowerMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setPower(builderForValue.build());
                return this;
            }

            public Builder setPressure(PressureMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setPressure(builderForValue.build());
                return this;
            }

            public Builder setRecord(RecordMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setRecord(builderForValue.build());
                return this;
            }

            public Builder setRowing(RowingMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setRowing(builderForValue.build());
                return this;
            }

            public Builder setSlope(SlopeMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSlope(builderForValue.build());
                return this;
            }

            public Builder setSlopeChart(SlopeChartMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSlopeChart(builderForValue.build());
                return this;
            }

            public Builder setSteps(StepsMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSteps(builderForValue.build());
                return this;
            }

            public Builder setSwim(SwimMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSwim(builderForValue.build());
                return this;
            }

            public Builder setSwing(SWingMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setSwing(builderForValue.build());
                return this;
            }

            public Builder setTemp(TempMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setTemp(builderForValue.build());
                return this;
            }

            public Builder setTimes(TimeMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setTimes(builderForValue.build());
                return this;
            }

            public Builder setType(TypeMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).setType(builderForValue.build());
                return this;
            }

            public Builder addMarathon(MarathonMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).addMarathon(builderForValue.build());
                return this;
            }

            public Builder addMarathon(int index, MarathonMessage.Builder builderForValue) {
                copyOnWrite();
                ((SportSummaryMessage) this.instance).addMarathon(index, builderForValue.build());
                return this;
            }
        }

        static {
            SportSummaryMessage sportSummaryMessage = new SportSummaryMessage();
            DEFAULT_INSTANCE = sportSummaryMessage;
            GeneratedMessageLite.registerDefaultInstance(SportSummaryMessage.class, sportSummaryMessage);
        }

        private SportSummaryMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMarathon(Iterable<? extends MarathonMessage> values) {
            ensureMarathonIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.marathon_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMarathon(MarathonMessage value) {
            value.getClass();
            ensureMarathonIsMutable();
            this.marathon_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAltitude() {
            this.altitude_ = null;
            this.bitField0_ &= -2049;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCalories() {
            this.calories_ = null;
            this.bitField0_ &= -16385;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDistance() {
            this.distance_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDownhill() {
            this.downhill_ = null;
            this.bitField0_ &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFloors() {
            this.floors_ = null;
            this.bitField0_ &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrequency() {
            this.frequency_ = null;
            this.bitField0_ &= -65537;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGoal() {
            this.goal_ = null;
            this.bitField0_ &= -8388609;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGolf() {
            this.golf_ = null;
            this.bitField0_ &= -16777217;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeartRate() {
            this.heartRate_ = null;
            this.bitField0_ &= -131073;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHrZone() {
            this.hrZone_ = null;
            this.bitField0_ &= -1048577;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMarathon() {
            this.marathon_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumber() {
            this.number_ = null;
            this.bitField0_ &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOther() {
            this.other_ = null;
            this.bitField0_ &= -524289;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPace() {
            this.pace_ = null;
            this.bitField0_ &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPower() {
            this.power_ = null;
            this.bitField0_ &= -33554433;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPressure() {
            this.pressure_ = null;
            this.bitField0_ &= -4194305;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecord() {
            this.record_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRowing() {
            this.rowing_ = null;
            this.bitField0_ &= -32769;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSlope() {
            this.slope_ = null;
            this.bitField0_ &= -4097;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSlopeChart() {
            this.slopeChart_ = null;
            this.bitField0_ &= -2097153;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSteps() {
            this.steps_ = null;
            this.bitField0_ &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwim() {
            this.swim_ = null;
            this.bitField0_ &= -257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwing() {
            this.swing_ = null;
            this.bitField0_ &= -8193;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemp() {
            this.temp_ = null;
            this.bitField0_ &= -262145;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimes() {
            this.times_ = null;
            this.bitField0_ &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.bitField0_ &= -2;
            this.version_ = getDefaultInstance().getVersion();
        }

        private void ensureMarathonIsMutable() {
            Internal.ProtobufList<MarathonMessage> protobufList = this.marathon_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.marathon_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static SportSummaryMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAltitude(AltitudeMessage value) {
            value.getClass();
            AltitudeMessage altitudeMessage = this.altitude_;
            if (altitudeMessage == null || altitudeMessage == AltitudeMessage.getDefaultInstance()) {
                this.altitude_ = value;
            } else {
                this.altitude_ = AltitudeMessage.newBuilder(this.altitude_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCalories(CaloriesMessage value) {
            value.getClass();
            CaloriesMessage caloriesMessage = this.calories_;
            if (caloriesMessage == null || caloriesMessage == CaloriesMessage.getDefaultInstance()) {
                this.calories_ = value;
            } else {
                this.calories_ = CaloriesMessage.newBuilder(this.calories_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDistance(DistanceMessage value) {
            value.getClass();
            DistanceMessage distanceMessage = this.distance_;
            if (distanceMessage == null || distanceMessage == DistanceMessage.getDefaultInstance()) {
                this.distance_ = value;
            } else {
                this.distance_ = DistanceMessage.newBuilder(this.distance_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDownhill(DownhillMessage value) {
            value.getClass();
            DownhillMessage downhillMessage = this.downhill_;
            if (downhillMessage == null || downhillMessage == DownhillMessage.getDefaultInstance()) {
                this.downhill_ = value;
            } else {
                this.downhill_ = DownhillMessage.newBuilder(this.downhill_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFloors(FloorsMessage value) {
            value.getClass();
            FloorsMessage floorsMessage = this.floors_;
            if (floorsMessage == null || floorsMessage == FloorsMessage.getDefaultInstance()) {
                this.floors_ = value;
            } else {
                this.floors_ = FloorsMessage.newBuilder(this.floors_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFrequency(FrequencyMessage value) {
            value.getClass();
            FrequencyMessage frequencyMessage = this.frequency_;
            if (frequencyMessage == null || frequencyMessage == FrequencyMessage.getDefaultInstance()) {
                this.frequency_ = value;
            } else {
                this.frequency_ = FrequencyMessage.newBuilder(this.frequency_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGoal(GoalMessage value) {
            value.getClass();
            GoalMessage goalMessage = this.goal_;
            if (goalMessage == null || goalMessage == GoalMessage.getDefaultInstance()) {
                this.goal_ = value;
            } else {
                this.goal_ = GoalMessage.newBuilder(this.goal_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 8388608;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGolf(GolfMessage value) {
            value.getClass();
            GolfMessage golfMessage = this.golf_;
            if (golfMessage == null || golfMessage == GolfMessage.getDefaultInstance()) {
                this.golf_ = value;
            } else {
                this.golf_ = GolfMessage.newBuilder(this.golf_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 16777216;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHeartRate(HeartRateMessage value) {
            value.getClass();
            HeartRateMessage heartRateMessage = this.heartRate_;
            if (heartRateMessage == null || heartRateMessage == HeartRateMessage.getDefaultInstance()) {
                this.heartRate_ = value;
            } else {
                this.heartRate_ = HeartRateMessage.newBuilder(this.heartRate_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHrZone(HeartrateZoneMessage value) {
            value.getClass();
            HeartrateZoneMessage heartrateZoneMessage = this.hrZone_;
            if (heartrateZoneMessage == null || heartrateZoneMessage == HeartrateZoneMessage.getDefaultInstance()) {
                this.hrZone_ = value;
            } else {
                this.hrZone_ = HeartrateZoneMessage.newBuilder(this.hrZone_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 1048576;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNumber(NumberMessage value) {
            value.getClass();
            NumberMessage numberMessage = this.number_;
            if (numberMessage == null || numberMessage == NumberMessage.getDefaultInstance()) {
                this.number_ = value;
            } else {
                this.number_ = NumberMessage.newBuilder(this.number_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOther(OtherMessage value) {
            value.getClass();
            OtherMessage otherMessage = this.other_;
            if (otherMessage == null || otherMessage == OtherMessage.getDefaultInstance()) {
                this.other_ = value;
            } else {
                this.other_ = OtherMessage.newBuilder(this.other_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePace(PaceMessage value) {
            value.getClass();
            PaceMessage paceMessage = this.pace_;
            if (paceMessage == null || paceMessage == PaceMessage.getDefaultInstance()) {
                this.pace_ = value;
            } else {
                this.pace_ = PaceMessage.newBuilder(this.pace_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePower(PowerMessage value) {
            value.getClass();
            PowerMessage powerMessage = this.power_;
            if (powerMessage == null || powerMessage == PowerMessage.getDefaultInstance()) {
                this.power_ = value;
            } else {
                this.power_ = PowerMessage.newBuilder(this.power_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 33554432;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePressure(PressureMessage value) {
            value.getClass();
            PressureMessage pressureMessage = this.pressure_;
            if (pressureMessage == null || pressureMessage == PressureMessage.getDefaultInstance()) {
                this.pressure_ = value;
            } else {
                this.pressure_ = PressureMessage.newBuilder(this.pressure_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 4194304;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRecord(RecordMessage value) {
            value.getClass();
            RecordMessage recordMessage = this.record_;
            if (recordMessage == null || recordMessage == RecordMessage.getDefaultInstance()) {
                this.record_ = value;
            } else {
                this.record_ = RecordMessage.newBuilder(this.record_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRowing(RowingMessage value) {
            value.getClass();
            RowingMessage rowingMessage = this.rowing_;
            if (rowingMessage == null || rowingMessage == RowingMessage.getDefaultInstance()) {
                this.rowing_ = value;
            } else {
                this.rowing_ = RowingMessage.newBuilder(this.rowing_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSlope(SlopeMessage value) {
            value.getClass();
            SlopeMessage slopeMessage = this.slope_;
            if (slopeMessage == null || slopeMessage == SlopeMessage.getDefaultInstance()) {
                this.slope_ = value;
            } else {
                this.slope_ = SlopeMessage.newBuilder(this.slope_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSlopeChart(SlopeChartMessage value) {
            value.getClass();
            SlopeChartMessage slopeChartMessage = this.slopeChart_;
            if (slopeChartMessage == null || slopeChartMessage == SlopeChartMessage.getDefaultInstance()) {
                this.slopeChart_ = value;
            } else {
                this.slopeChart_ = SlopeChartMessage.newBuilder(this.slopeChart_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 2097152;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSteps(StepsMessage value) {
            value.getClass();
            StepsMessage stepsMessage = this.steps_;
            if (stepsMessage == null || stepsMessage == StepsMessage.getDefaultInstance()) {
                this.steps_ = value;
            } else {
                this.steps_ = StepsMessage.newBuilder(this.steps_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSwim(SwimMessage value) {
            value.getClass();
            SwimMessage swimMessage = this.swim_;
            if (swimMessage == null || swimMessage == SwimMessage.getDefaultInstance()) {
                this.swim_ = value;
            } else {
                this.swim_ = SwimMessage.newBuilder(this.swim_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSwing(SWingMessage value) {
            value.getClass();
            SWingMessage sWingMessage = this.swing_;
            if (sWingMessage == null || sWingMessage == SWingMessage.getDefaultInstance()) {
                this.swing_ = value;
            } else {
                this.swing_ = SWingMessage.newBuilder(this.swing_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemp(TempMessage value) {
            value.getClass();
            TempMessage tempMessage = this.temp_;
            if (tempMessage == null || tempMessage == TempMessage.getDefaultInstance()) {
                this.temp_ = value;
            } else {
                this.temp_ = TempMessage.newBuilder(this.temp_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimes(TimeMessage value) {
            value.getClass();
            TimeMessage timeMessage = this.times_;
            if (timeMessage == null || timeMessage == TimeMessage.getDefaultInstance()) {
                this.times_ = value;
            } else {
                this.times_ = TimeMessage.newBuilder(this.times_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeType(TypeMessage value) {
            value.getClass();
            TypeMessage typeMessage = this.type_;
            if (typeMessage == null || typeMessage == TypeMessage.getDefaultInstance()) {
                this.type_ = value;
            } else {
                this.type_ = TypeMessage.newBuilder(this.type_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SportSummaryMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (SportSummaryMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static SportSummaryMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<SportSummaryMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMarathon(int index) {
            ensureMarathonIsMutable();
            this.marathon_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAltitude(AltitudeMessage value) {
            value.getClass();
            this.altitude_ = value;
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalories(CaloriesMessage value) {
            value.getClass();
            this.calories_ = value;
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDistance(DistanceMessage value) {
            value.getClass();
            this.distance_ = value;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDownhill(DownhillMessage value) {
            value.getClass();
            this.downhill_ = value;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloors(FloorsMessage value) {
            value.getClass();
            this.floors_ = value;
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrequency(FrequencyMessage value) {
            value.getClass();
            this.frequency_ = value;
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoal(GoalMessage value) {
            value.getClass();
            this.goal_ = value;
            this.bitField0_ |= 8388608;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGolf(GolfMessage value) {
            value.getClass();
            this.golf_ = value;
            this.bitField0_ |= 16777216;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeartRate(HeartRateMessage value) {
            value.getClass();
            this.heartRate_ = value;
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrZone(HeartrateZoneMessage value) {
            value.getClass();
            this.hrZone_ = value;
            this.bitField0_ |= 1048576;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMarathon(int index, MarathonMessage value) {
            value.getClass();
            ensureMarathonIsMutable();
            this.marathon_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(NumberMessage value) {
            value.getClass();
            this.number_ = value;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOther(OtherMessage value) {
            value.getClass();
            this.other_ = value;
            this.bitField0_ |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPace(PaceMessage value) {
            value.getClass();
            this.pace_ = value;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPower(PowerMessage value) {
            value.getClass();
            this.power_ = value;
            this.bitField0_ |= 33554432;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPressure(PressureMessage value) {
            value.getClass();
            this.pressure_ = value;
            this.bitField0_ |= 4194304;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecord(RecordMessage value) {
            value.getClass();
            this.record_ = value;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRowing(RowingMessage value) {
            value.getClass();
            this.rowing_ = value;
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSlope(SlopeMessage value) {
            value.getClass();
            this.slope_ = value;
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSlopeChart(SlopeChartMessage value) {
            value.getClass();
            this.slopeChart_ = value;
            this.bitField0_ |= 2097152;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSteps(StepsMessage value) {
            value.getClass();
            this.steps_ = value;
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwim(SwimMessage value) {
            value.getClass();
            this.swim_ = value;
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwing(SWingMessage value) {
            value.getClass();
            this.swing_ = value;
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemp(TempMessage value) {
            value.getClass();
            this.temp_ = value;
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimes(TimeMessage value) {
            value.getClass();
            this.times_ = value;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(TypeMessage value) {
            value.getClass();
            this.type_ = value;
            this.bitField0_ |= 4;
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
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new SportSummaryMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001b\u0000\u0001\u0001\u001e\u001b\u0000\u0001\u0006\u0001ᔈ\u0000\u0002ᔉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\rဉ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011\u0014ဉ\u0012\u0015ဉ\u0013\u0016ᐉ\u0014\u0017ဉ\u0015\u001aЛ\u001bဉ\u0016\u001cᐉ\u0017\u001dဉ\u0018\u001eဉ\u0019", new Object[]{"bitField0_", "version_", "record_", "type_", "distance_", "number_", "downhill_", "times_", "floors_", "swim_", "pace_", "steps_", "altitude_", "slope_", "swing_", "calories_", "rowing_", "frequency_", "heartRate_", "temp_", "other_", "hrZone_", "slopeChart_", "marathon_", MarathonMessage.class, "pressure_", "goal_", "golf_", "power_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SportSummaryMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SportSummaryMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public AltitudeMessage getAltitude() {
            AltitudeMessage altitudeMessage = this.altitude_;
            return altitudeMessage == null ? AltitudeMessage.getDefaultInstance() : altitudeMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public CaloriesMessage getCalories() {
            CaloriesMessage caloriesMessage = this.calories_;
            return caloriesMessage == null ? CaloriesMessage.getDefaultInstance() : caloriesMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public DistanceMessage getDistance() {
            DistanceMessage distanceMessage = this.distance_;
            return distanceMessage == null ? DistanceMessage.getDefaultInstance() : distanceMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public DownhillMessage getDownhill() {
            DownhillMessage downhillMessage = this.downhill_;
            return downhillMessage == null ? DownhillMessage.getDefaultInstance() : downhillMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public FloorsMessage getFloors() {
            FloorsMessage floorsMessage = this.floors_;
            return floorsMessage == null ? FloorsMessage.getDefaultInstance() : floorsMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public FrequencyMessage getFrequency() {
            FrequencyMessage frequencyMessage = this.frequency_;
            return frequencyMessage == null ? FrequencyMessage.getDefaultInstance() : frequencyMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public GoalMessage getGoal() {
            GoalMessage goalMessage = this.goal_;
            return goalMessage == null ? GoalMessage.getDefaultInstance() : goalMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public GolfMessage getGolf() {
            GolfMessage golfMessage = this.golf_;
            return golfMessage == null ? GolfMessage.getDefaultInstance() : golfMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public HeartRateMessage getHeartRate() {
            HeartRateMessage heartRateMessage = this.heartRate_;
            return heartRateMessage == null ? HeartRateMessage.getDefaultInstance() : heartRateMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public HeartrateZoneMessage getHrZone() {
            HeartrateZoneMessage heartrateZoneMessage = this.hrZone_;
            return heartrateZoneMessage == null ? HeartrateZoneMessage.getDefaultInstance() : heartrateZoneMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public MarathonMessage getMarathon(int index) {
            return this.marathon_.get(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public int getMarathonCount() {
            return this.marathon_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public List<MarathonMessage> getMarathonList() {
            return this.marathon_;
        }

        public MarathonMessageOrBuilder getMarathonOrBuilder(int index) {
            return this.marathon_.get(index);
        }

        public List<? extends MarathonMessageOrBuilder> getMarathonOrBuilderList() {
            return this.marathon_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public NumberMessage getNumber() {
            NumberMessage numberMessage = this.number_;
            return numberMessage == null ? NumberMessage.getDefaultInstance() : numberMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public OtherMessage getOther() {
            OtherMessage otherMessage = this.other_;
            return otherMessage == null ? OtherMessage.getDefaultInstance() : otherMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public PaceMessage getPace() {
            PaceMessage paceMessage = this.pace_;
            return paceMessage == null ? PaceMessage.getDefaultInstance() : paceMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public PowerMessage getPower() {
            PowerMessage powerMessage = this.power_;
            return powerMessage == null ? PowerMessage.getDefaultInstance() : powerMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public PressureMessage getPressure() {
            PressureMessage pressureMessage = this.pressure_;
            return pressureMessage == null ? PressureMessage.getDefaultInstance() : pressureMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public RecordMessage getRecord() {
            RecordMessage recordMessage = this.record_;
            return recordMessage == null ? RecordMessage.getDefaultInstance() : recordMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public RowingMessage getRowing() {
            RowingMessage rowingMessage = this.rowing_;
            return rowingMessage == null ? RowingMessage.getDefaultInstance() : rowingMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public SlopeMessage getSlope() {
            SlopeMessage slopeMessage = this.slope_;
            return slopeMessage == null ? SlopeMessage.getDefaultInstance() : slopeMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public SlopeChartMessage getSlopeChart() {
            SlopeChartMessage slopeChartMessage = this.slopeChart_;
            return slopeChartMessage == null ? SlopeChartMessage.getDefaultInstance() : slopeChartMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public StepsMessage getSteps() {
            StepsMessage stepsMessage = this.steps_;
            return stepsMessage == null ? StepsMessage.getDefaultInstance() : stepsMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public SwimMessage getSwim() {
            SwimMessage swimMessage = this.swim_;
            return swimMessage == null ? SwimMessage.getDefaultInstance() : swimMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public SWingMessage getSwing() {
            SWingMessage sWingMessage = this.swing_;
            return sWingMessage == null ? SWingMessage.getDefaultInstance() : sWingMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public TempMessage getTemp() {
            TempMessage tempMessage = this.temp_;
            return tempMessage == null ? TempMessage.getDefaultInstance() : tempMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public TimeMessage getTimes() {
            TimeMessage timeMessage = this.times_;
            return timeMessage == null ? TimeMessage.getDefaultInstance() : timeMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public TypeMessage getType() {
            TypeMessage typeMessage = this.type_;
            return typeMessage == null ? TypeMessage.getDefaultInstance() : typeMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public String getVersion() {
            return this.version_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasAltitude() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasCalories() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasDistance() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasDownhill() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasFloors() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasFrequency() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasGoal() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasGolf() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasHeartRate() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasHrZone() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasNumber() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasOther() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasPace() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasPower() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasPressure() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasRecord() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasRowing() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasSlope() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasSlopeChart() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasSteps() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasSwim() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasSwing() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasTemp() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasTimes() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SportSummaryMessageOrBuilder
        public boolean hasVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SportSummaryMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static SportSummaryMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SportSummaryMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SportSummaryMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SportSummaryMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMarathon(int index, MarathonMessage value) {
            value.getClass();
            ensureMarathonIsMutable();
            this.marathon_.add(index, value);
        }

        public static SportSummaryMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SportSummaryMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SportSummaryMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SportSummaryMessage parseFrom(InputStream input) throws IOException {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SportSummaryMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SportSummaryMessage parseFrom(CodedInputStream input) throws IOException {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SportSummaryMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SportSummaryMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface SportSummaryMessageOrBuilder extends MessageLiteOrBuilder {
        AltitudeMessage getAltitude();

        CaloriesMessage getCalories();

        DistanceMessage getDistance();

        DownhillMessage getDownhill();

        FloorsMessage getFloors();

        FrequencyMessage getFrequency();

        GoalMessage getGoal();

        GolfMessage getGolf();

        HeartRateMessage getHeartRate();

        HeartrateZoneMessage getHrZone();

        MarathonMessage getMarathon(int index);

        int getMarathonCount();

        List<MarathonMessage> getMarathonList();

        NumberMessage getNumber();

        OtherMessage getOther();

        PaceMessage getPace();

        PowerMessage getPower();

        PressureMessage getPressure();

        RecordMessage getRecord();

        RowingMessage getRowing();

        SlopeMessage getSlope();

        SlopeChartMessage getSlopeChart();

        StepsMessage getSteps();

        SwimMessage getSwim();

        SWingMessage getSwing();

        TempMessage getTemp();

        TimeMessage getTimes();

        TypeMessage getType();

        String getVersion();

        ByteString getVersionBytes();

        boolean hasAltitude();

        boolean hasCalories();

        boolean hasDistance();

        boolean hasDownhill();

        boolean hasFloors();

        boolean hasFrequency();

        boolean hasGoal();

        boolean hasGolf();

        boolean hasHeartRate();

        boolean hasHrZone();

        boolean hasNumber();

        boolean hasOther();

        boolean hasPace();

        boolean hasPower();

        boolean hasPressure();

        boolean hasRecord();

        boolean hasRowing();

        boolean hasSlope();

        boolean hasSlopeChart();

        boolean hasSteps();

        boolean hasSwim();

        boolean hasSwing();

        boolean hasTemp();

        boolean hasTimes();

        boolean hasType();

        boolean hasVersion();
    }

    public static final class StepsMessage extends GeneratedMessageLite<StepsMessage, Builder> implements StepsMessageOrBuilder {
        public static final int AVERAGECADENCE_FIELD_NUMBER = 1;
        public static final int AVERAGESTRIDE_FIELD_NUMBER = 3;
        private static final StepsMessage DEFAULT_INSTANCE;
        public static final int MAXIMUMCADENCE_FIELD_NUMBER = 2;
        private static volatile Parser<StepsMessage> PARSER = null;
        public static final int STEPS_FIELD_NUMBER = 4;
        private float averageCadence_;
        private int averageStride_;
        private int bitField0_;
        private float maximumCadence_;
        private int steps_;

        public static final class Builder extends GeneratedMessageLite.Builder<StepsMessage, Builder> implements StepsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAverageCadence() {
                copyOnWrite();
                ((StepsMessage) this.instance).clearAverageCadence();
                return this;
            }

            public Builder clearAverageStride() {
                copyOnWrite();
                ((StepsMessage) this.instance).clearAverageStride();
                return this;
            }

            public Builder clearMaximumCadence() {
                copyOnWrite();
                ((StepsMessage) this.instance).clearMaximumCadence();
                return this;
            }

            public Builder clearSteps() {
                copyOnWrite();
                ((StepsMessage) this.instance).clearSteps();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.StepsMessageOrBuilder
            public float getAverageCadence() {
                return ((StepsMessage) this.instance).getAverageCadence();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.StepsMessageOrBuilder
            public int getAverageStride() {
                return ((StepsMessage) this.instance).getAverageStride();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.StepsMessageOrBuilder
            public float getMaximumCadence() {
                return ((StepsMessage) this.instance).getMaximumCadence();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.StepsMessageOrBuilder
            public int getSteps() {
                return ((StepsMessage) this.instance).getSteps();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.StepsMessageOrBuilder
            public boolean hasAverageCadence() {
                return ((StepsMessage) this.instance).hasAverageCadence();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.StepsMessageOrBuilder
            public boolean hasAverageStride() {
                return ((StepsMessage) this.instance).hasAverageStride();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.StepsMessageOrBuilder
            public boolean hasMaximumCadence() {
                return ((StepsMessage) this.instance).hasMaximumCadence();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.StepsMessageOrBuilder
            public boolean hasSteps() {
                return ((StepsMessage) this.instance).hasSteps();
            }

            public Builder setAverageCadence(float value) {
                copyOnWrite();
                ((StepsMessage) this.instance).setAverageCadence(value);
                return this;
            }

            public Builder setAverageStride(int value) {
                copyOnWrite();
                ((StepsMessage) this.instance).setAverageStride(value);
                return this;
            }

            public Builder setMaximumCadence(float value) {
                copyOnWrite();
                ((StepsMessage) this.instance).setMaximumCadence(value);
                return this;
            }

            public Builder setSteps(int value) {
                copyOnWrite();
                ((StepsMessage) this.instance).setSteps(value);
                return this;
            }

            private Builder() {
                super(StepsMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            StepsMessage stepsMessage = new StepsMessage();
            DEFAULT_INSTANCE = stepsMessage;
            GeneratedMessageLite.registerDefaultInstance(StepsMessage.class, stepsMessage);
        }

        private StepsMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageCadence() {
            this.bitField0_ &= -2;
            this.averageCadence_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageStride() {
            this.bitField0_ &= -5;
            this.averageStride_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaximumCadence() {
            this.bitField0_ &= -3;
            this.maximumCadence_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSteps() {
            this.bitField0_ &= -9;
            this.steps_ = 0;
        }

        public static StepsMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StepsMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (StepsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static StepsMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<StepsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageCadence(float value) {
            this.bitField0_ |= 1;
            this.averageCadence_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageStride(int value) {
            this.bitField0_ |= 4;
            this.averageStride_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumCadence(float value) {
            this.bitField0_ |= 2;
            this.maximumCadence_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSteps(int value) {
            this.bitField0_ |= 8;
            this.steps_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new StepsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "averageCadence_", "maximumCadence_", "averageStride_", "steps_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StepsMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (StepsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.StepsMessageOrBuilder
        public float getAverageCadence() {
            return this.averageCadence_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.StepsMessageOrBuilder
        public int getAverageStride() {
            return this.averageStride_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.StepsMessageOrBuilder
        public float getMaximumCadence() {
            return this.maximumCadence_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.StepsMessageOrBuilder
        public int getSteps() {
            return this.steps_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.StepsMessageOrBuilder
        public boolean hasAverageCadence() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.StepsMessageOrBuilder
        public boolean hasAverageStride() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.StepsMessageOrBuilder
        public boolean hasMaximumCadence() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.StepsMessageOrBuilder
        public boolean hasSteps() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(StepsMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static StepsMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (StepsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static StepsMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static StepsMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static StepsMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static StepsMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static StepsMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static StepsMessage parseFrom(InputStream input) throws IOException {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static StepsMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static StepsMessage parseFrom(CodedInputStream input) throws IOException {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static StepsMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (StepsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface StepsMessageOrBuilder extends MessageLiteOrBuilder {
        float getAverageCadence();

        int getAverageStride();

        float getMaximumCadence();

        int getSteps();

        boolean hasAverageCadence();

        boolean hasAverageStride();

        boolean hasMaximumCadence();

        boolean hasSteps();
    }

    public static final class SwimMessage extends GeneratedMessageLite<SwimMessage, Builder> implements SwimMessageOrBuilder {
        public static final int AVERAGEDISTANCEPERSTROKE_FIELD_NUMBER = 4;
        public static final int AVERAGESTROKERATE_FIELD_NUMBER = 6;
        private static final SwimMessage DEFAULT_INSTANCE;
        public static final int MAINSWIMMINGSTYLE_FIELD_NUMBER = 1;
        public static final int MAXIMUMSTROKERATE_FIELD_NUMBER = 7;
        private static volatile Parser<SwimMessage> PARSER = null;
        public static final int POOLLENGTH_FIELD_NUMBER = 8;
        public static final int SWOLF_FIELD_NUMBER = 5;
        public static final int TOTALSTROKES_FIELD_NUMBER = 3;
        public static final int TRIPS_FIELD_NUMBER = 2;
        public static final int UNIT_FIELD_NUMBER = 9;
        private int averageDistancePerStroke_;
        private int averageStrokeRate_;
        private int bitField0_;
        private int mainSwimmingStyle_;
        private int maximumStrokeRate_;
        private int poolLength_;
        private int swolf_;
        private int totalStrokes_;
        private int trips_;
        private int unit_;

        public static final class Builder extends GeneratedMessageLite.Builder<SwimMessage, Builder> implements SwimMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAverageDistancePerStroke() {
                copyOnWrite();
                ((SwimMessage) this.instance).clearAverageDistancePerStroke();
                return this;
            }

            public Builder clearAverageStrokeRate() {
                copyOnWrite();
                ((SwimMessage) this.instance).clearAverageStrokeRate();
                return this;
            }

            public Builder clearMainSwimmingStyle() {
                copyOnWrite();
                ((SwimMessage) this.instance).clearMainSwimmingStyle();
                return this;
            }

            public Builder clearMaximumStrokeRate() {
                copyOnWrite();
                ((SwimMessage) this.instance).clearMaximumStrokeRate();
                return this;
            }

            public Builder clearPoolLength() {
                copyOnWrite();
                ((SwimMessage) this.instance).clearPoolLength();
                return this;
            }

            public Builder clearSwolf() {
                copyOnWrite();
                ((SwimMessage) this.instance).clearSwolf();
                return this;
            }

            public Builder clearTotalStrokes() {
                copyOnWrite();
                ((SwimMessage) this.instance).clearTotalStrokes();
                return this;
            }

            public Builder clearTrips() {
                copyOnWrite();
                ((SwimMessage) this.instance).clearTrips();
                return this;
            }

            public Builder clearUnit() {
                copyOnWrite();
                ((SwimMessage) this.instance).clearUnit();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public int getAverageDistancePerStroke() {
                return ((SwimMessage) this.instance).getAverageDistancePerStroke();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public int getAverageStrokeRate() {
                return ((SwimMessage) this.instance).getAverageStrokeRate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public int getMainSwimmingStyle() {
                return ((SwimMessage) this.instance).getMainSwimmingStyle();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public int getMaximumStrokeRate() {
                return ((SwimMessage) this.instance).getMaximumStrokeRate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public int getPoolLength() {
                return ((SwimMessage) this.instance).getPoolLength();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public int getSwolf() {
                return ((SwimMessage) this.instance).getSwolf();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public int getTotalStrokes() {
                return ((SwimMessage) this.instance).getTotalStrokes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public int getTrips() {
                return ((SwimMessage) this.instance).getTrips();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public int getUnit() {
                return ((SwimMessage) this.instance).getUnit();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public boolean hasAverageDistancePerStroke() {
                return ((SwimMessage) this.instance).hasAverageDistancePerStroke();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public boolean hasAverageStrokeRate() {
                return ((SwimMessage) this.instance).hasAverageStrokeRate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public boolean hasMainSwimmingStyle() {
                return ((SwimMessage) this.instance).hasMainSwimmingStyle();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public boolean hasMaximumStrokeRate() {
                return ((SwimMessage) this.instance).hasMaximumStrokeRate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public boolean hasPoolLength() {
                return ((SwimMessage) this.instance).hasPoolLength();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public boolean hasSwolf() {
                return ((SwimMessage) this.instance).hasSwolf();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public boolean hasTotalStrokes() {
                return ((SwimMessage) this.instance).hasTotalStrokes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public boolean hasTrips() {
                return ((SwimMessage) this.instance).hasTrips();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
            public boolean hasUnit() {
                return ((SwimMessage) this.instance).hasUnit();
            }

            public Builder setAverageDistancePerStroke(int value) {
                copyOnWrite();
                ((SwimMessage) this.instance).setAverageDistancePerStroke(value);
                return this;
            }

            public Builder setAverageStrokeRate(int value) {
                copyOnWrite();
                ((SwimMessage) this.instance).setAverageStrokeRate(value);
                return this;
            }

            public Builder setMainSwimmingStyle(int value) {
                copyOnWrite();
                ((SwimMessage) this.instance).setMainSwimmingStyle(value);
                return this;
            }

            public Builder setMaximumStrokeRate(int value) {
                copyOnWrite();
                ((SwimMessage) this.instance).setMaximumStrokeRate(value);
                return this;
            }

            public Builder setPoolLength(int value) {
                copyOnWrite();
                ((SwimMessage) this.instance).setPoolLength(value);
                return this;
            }

            public Builder setSwolf(int value) {
                copyOnWrite();
                ((SwimMessage) this.instance).setSwolf(value);
                return this;
            }

            public Builder setTotalStrokes(int value) {
                copyOnWrite();
                ((SwimMessage) this.instance).setTotalStrokes(value);
                return this;
            }

            public Builder setTrips(int value) {
                copyOnWrite();
                ((SwimMessage) this.instance).setTrips(value);
                return this;
            }

            public Builder setUnit(int value) {
                copyOnWrite();
                ((SwimMessage) this.instance).setUnit(value);
                return this;
            }

            private Builder() {
                super(SwimMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            SwimMessage swimMessage = new SwimMessage();
            DEFAULT_INSTANCE = swimMessage;
            GeneratedMessageLite.registerDefaultInstance(SwimMessage.class, swimMessage);
        }

        private SwimMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageDistancePerStroke() {
            this.bitField0_ &= -9;
            this.averageDistancePerStroke_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageStrokeRate() {
            this.bitField0_ &= -33;
            this.averageStrokeRate_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMainSwimmingStyle() {
            this.bitField0_ &= -2;
            this.mainSwimmingStyle_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaximumStrokeRate() {
            this.bitField0_ &= -65;
            this.maximumStrokeRate_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPoolLength() {
            this.bitField0_ &= -129;
            this.poolLength_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwolf() {
            this.bitField0_ &= -17;
            this.swolf_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalStrokes() {
            this.bitField0_ &= -5;
            this.totalStrokes_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrips() {
            this.bitField0_ &= -3;
            this.trips_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnit() {
            this.bitField0_ &= -257;
            this.unit_ = 0;
        }

        public static SwimMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SwimMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (SwimMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static SwimMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<SwimMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageDistancePerStroke(int value) {
            this.bitField0_ |= 8;
            this.averageDistancePerStroke_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageStrokeRate(int value) {
            this.bitField0_ |= 32;
            this.averageStrokeRate_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMainSwimmingStyle(int value) {
            this.bitField0_ |= 1;
            this.mainSwimmingStyle_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumStrokeRate(int value) {
            this.bitField0_ |= 64;
            this.maximumStrokeRate_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPoolLength(int value) {
            this.bitField0_ |= 128;
            this.poolLength_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwolf(int value) {
            this.bitField0_ |= 16;
            this.swolf_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalStrokes(int value) {
            this.bitField0_ |= 4;
            this.totalStrokes_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrips(int value) {
            this.bitField0_ |= 2;
            this.trips_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnit(int value) {
            this.bitField0_ |= 256;
            this.unit_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new SwimMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b", new Object[]{"bitField0_", "mainSwimmingStyle_", "trips_", "totalStrokes_", "averageDistancePerStroke_", "swolf_", "averageStrokeRate_", "maximumStrokeRate_", "poolLength_", "unit_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SwimMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SwimMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public int getAverageDistancePerStroke() {
            return this.averageDistancePerStroke_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public int getAverageStrokeRate() {
            return this.averageStrokeRate_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public int getMainSwimmingStyle() {
            return this.mainSwimmingStyle_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public int getMaximumStrokeRate() {
            return this.maximumStrokeRate_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public int getPoolLength() {
            return this.poolLength_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public int getSwolf() {
            return this.swolf_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public int getTotalStrokes() {
            return this.totalStrokes_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public int getTrips() {
            return this.trips_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public int getUnit() {
            return this.unit_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public boolean hasAverageDistancePerStroke() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public boolean hasAverageStrokeRate() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public boolean hasMainSwimmingStyle() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public boolean hasMaximumStrokeRate() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public boolean hasPoolLength() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public boolean hasSwolf() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public boolean hasTotalStrokes() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public boolean hasTrips() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.SwimMessageOrBuilder
        public boolean hasUnit() {
            return (this.bitField0_ & 256) != 0;
        }

        public static Builder newBuilder(SwimMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static SwimMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SwimMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SwimMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SwimMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SwimMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SwimMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SwimMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SwimMessage parseFrom(InputStream input) throws IOException {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SwimMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SwimMessage parseFrom(CodedInputStream input) throws IOException {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SwimMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SwimMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface SwimMessageOrBuilder extends MessageLiteOrBuilder {
        int getAverageDistancePerStroke();

        int getAverageStrokeRate();

        int getMainSwimmingStyle();

        int getMaximumStrokeRate();

        int getPoolLength();

        int getSwolf();

        int getTotalStrokes();

        int getTrips();

        int getUnit();

        boolean hasAverageDistancePerStroke();

        boolean hasAverageStrokeRate();

        boolean hasMainSwimmingStyle();

        boolean hasMaximumStrokeRate();

        boolean hasPoolLength();

        boolean hasSwolf();

        boolean hasTotalStrokes();

        boolean hasTrips();

        boolean hasUnit();
    }

    public static final class TempMessage extends GeneratedMessageLite<TempMessage, Builder> implements TempMessageOrBuilder {
        public static final int AVERAGETEMPERATURE_FIELD_NUMBER = 1;
        private static final TempMessage DEFAULT_INSTANCE;
        public static final int HIGHESTTEMPERATURE_FIELD_NUMBER = 2;
        public static final int LOWESTTEMPERATURE_FIELD_NUMBER = 3;
        private static volatile Parser<TempMessage> PARSER;
        private float averageTemperature_;
        private int bitField0_;
        private float highestTemperature_;
        private float lowestTemperature_;

        public static final class Builder extends GeneratedMessageLite.Builder<TempMessage, Builder> implements TempMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAverageTemperature() {
                copyOnWrite();
                ((TempMessage) this.instance).clearAverageTemperature();
                return this;
            }

            public Builder clearHighestTemperature() {
                copyOnWrite();
                ((TempMessage) this.instance).clearHighestTemperature();
                return this;
            }

            public Builder clearLowestTemperature() {
                copyOnWrite();
                ((TempMessage) this.instance).clearLowestTemperature();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TempMessageOrBuilder
            public float getAverageTemperature() {
                return ((TempMessage) this.instance).getAverageTemperature();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TempMessageOrBuilder
            public float getHighestTemperature() {
                return ((TempMessage) this.instance).getHighestTemperature();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TempMessageOrBuilder
            public float getLowestTemperature() {
                return ((TempMessage) this.instance).getLowestTemperature();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TempMessageOrBuilder
            public boolean hasAverageTemperature() {
                return ((TempMessage) this.instance).hasAverageTemperature();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TempMessageOrBuilder
            public boolean hasHighestTemperature() {
                return ((TempMessage) this.instance).hasHighestTemperature();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TempMessageOrBuilder
            public boolean hasLowestTemperature() {
                return ((TempMessage) this.instance).hasLowestTemperature();
            }

            public Builder setAverageTemperature(float value) {
                copyOnWrite();
                ((TempMessage) this.instance).setAverageTemperature(value);
                return this;
            }

            public Builder setHighestTemperature(float value) {
                copyOnWrite();
                ((TempMessage) this.instance).setHighestTemperature(value);
                return this;
            }

            public Builder setLowestTemperature(float value) {
                copyOnWrite();
                ((TempMessage) this.instance).setLowestTemperature(value);
                return this;
            }

            private Builder() {
                super(TempMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            TempMessage tempMessage = new TempMessage();
            DEFAULT_INSTANCE = tempMessage;
            GeneratedMessageLite.registerDefaultInstance(TempMessage.class, tempMessage);
        }

        private TempMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAverageTemperature() {
            this.bitField0_ &= -2;
            this.averageTemperature_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHighestTemperature() {
            this.bitField0_ &= -3;
            this.highestTemperature_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLowestTemperature() {
            this.bitField0_ &= -5;
            this.lowestTemperature_ = 0.0f;
        }

        public static TempMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TempMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (TempMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static TempMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<TempMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAverageTemperature(float value) {
            this.bitField0_ |= 1;
            this.averageTemperature_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHighestTemperature(float value) {
            this.bitField0_ |= 2;
            this.highestTemperature_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLowestTemperature(float value) {
            this.bitField0_ |= 4;
            this.lowestTemperature_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new TempMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"bitField0_", "averageTemperature_", "highestTemperature_", "lowestTemperature_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TempMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (TempMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TempMessageOrBuilder
        public float getAverageTemperature() {
            return this.averageTemperature_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TempMessageOrBuilder
        public float getHighestTemperature() {
            return this.highestTemperature_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TempMessageOrBuilder
        public float getLowestTemperature() {
            return this.lowestTemperature_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TempMessageOrBuilder
        public boolean hasAverageTemperature() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TempMessageOrBuilder
        public boolean hasHighestTemperature() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TempMessageOrBuilder
        public boolean hasLowestTemperature() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(TempMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static TempMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TempMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TempMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TempMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TempMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TempMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TempMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TempMessage parseFrom(InputStream input) throws IOException {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TempMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TempMessage parseFrom(CodedInputStream input) throws IOException {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TempMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TempMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface TempMessageOrBuilder extends MessageLiteOrBuilder {
        float getAverageTemperature();

        float getHighestTemperature();

        float getLowestTemperature();

        boolean hasAverageTemperature();

        boolean hasHighestTemperature();

        boolean hasLowestTemperature();
    }

    public static final class TimeMessage extends GeneratedMessageLite<TimeMessage, Builder> implements TimeMessageOrBuilder {
        public static final int CYCLINGTIME_FIELD_NUMBER = 6;
        private static final TimeMessage DEFAULT_INSTANCE;
        public static final int EXERCISETIME_FIELD_NUMBER = 2;
        private static volatile Parser<TimeMessage> PARSER = null;
        public static final int PAUSETIME_FIELD_NUMBER = 3;
        public static final int RESTTIMEBETWEENGROUPS_FIELD_NUMBER = 4;
        public static final int RUNNINGTIME_FIELD_NUMBER = 7;
        public static final int SWIMMINGTIME_FIELD_NUMBER = 5;
        public static final int SWITCHTIME1_FIELD_NUMBER = 8;
        public static final int SWITCHTIME2_FIELD_NUMBER = 9;
        public static final int TOTALTIME_FIELD_NUMBER = 1;
        private int bitField0_;
        private int cyclingTime_;
        private int exerciseTime_;
        private int pauseTime_;
        private int restTimeBetweenGroups_;
        private int runningTime_;
        private int swimmingTime_;
        private int switchTime1_;
        private int switchTime2_;
        private int totalTime_;

        public static final class Builder extends GeneratedMessageLite.Builder<TimeMessage, Builder> implements TimeMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCyclingTime() {
                copyOnWrite();
                ((TimeMessage) this.instance).clearCyclingTime();
                return this;
            }

            public Builder clearExerciseTime() {
                copyOnWrite();
                ((TimeMessage) this.instance).clearExerciseTime();
                return this;
            }

            public Builder clearPauseTime() {
                copyOnWrite();
                ((TimeMessage) this.instance).clearPauseTime();
                return this;
            }

            public Builder clearRestTimeBetweenGroups() {
                copyOnWrite();
                ((TimeMessage) this.instance).clearRestTimeBetweenGroups();
                return this;
            }

            public Builder clearRunningTime() {
                copyOnWrite();
                ((TimeMessage) this.instance).clearRunningTime();
                return this;
            }

            public Builder clearSwimmingTime() {
                copyOnWrite();
                ((TimeMessage) this.instance).clearSwimmingTime();
                return this;
            }

            public Builder clearSwitchTime1() {
                copyOnWrite();
                ((TimeMessage) this.instance).clearSwitchTime1();
                return this;
            }

            public Builder clearSwitchTime2() {
                copyOnWrite();
                ((TimeMessage) this.instance).clearSwitchTime2();
                return this;
            }

            public Builder clearTotalTime() {
                copyOnWrite();
                ((TimeMessage) this.instance).clearTotalTime();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public int getCyclingTime() {
                return ((TimeMessage) this.instance).getCyclingTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public int getExerciseTime() {
                return ((TimeMessage) this.instance).getExerciseTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public int getPauseTime() {
                return ((TimeMessage) this.instance).getPauseTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public int getRestTimeBetweenGroups() {
                return ((TimeMessage) this.instance).getRestTimeBetweenGroups();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public int getRunningTime() {
                return ((TimeMessage) this.instance).getRunningTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public int getSwimmingTime() {
                return ((TimeMessage) this.instance).getSwimmingTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public int getSwitchTime1() {
                return ((TimeMessage) this.instance).getSwitchTime1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public int getSwitchTime2() {
                return ((TimeMessage) this.instance).getSwitchTime2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public int getTotalTime() {
                return ((TimeMessage) this.instance).getTotalTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public boolean hasCyclingTime() {
                return ((TimeMessage) this.instance).hasCyclingTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public boolean hasExerciseTime() {
                return ((TimeMessage) this.instance).hasExerciseTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public boolean hasPauseTime() {
                return ((TimeMessage) this.instance).hasPauseTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public boolean hasRestTimeBetweenGroups() {
                return ((TimeMessage) this.instance).hasRestTimeBetweenGroups();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public boolean hasRunningTime() {
                return ((TimeMessage) this.instance).hasRunningTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public boolean hasSwimmingTime() {
                return ((TimeMessage) this.instance).hasSwimmingTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public boolean hasSwitchTime1() {
                return ((TimeMessage) this.instance).hasSwitchTime1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public boolean hasSwitchTime2() {
                return ((TimeMessage) this.instance).hasSwitchTime2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
            public boolean hasTotalTime() {
                return ((TimeMessage) this.instance).hasTotalTime();
            }

            public Builder setCyclingTime(int value) {
                copyOnWrite();
                ((TimeMessage) this.instance).setCyclingTime(value);
                return this;
            }

            public Builder setExerciseTime(int value) {
                copyOnWrite();
                ((TimeMessage) this.instance).setExerciseTime(value);
                return this;
            }

            public Builder setPauseTime(int value) {
                copyOnWrite();
                ((TimeMessage) this.instance).setPauseTime(value);
                return this;
            }

            public Builder setRestTimeBetweenGroups(int value) {
                copyOnWrite();
                ((TimeMessage) this.instance).setRestTimeBetweenGroups(value);
                return this;
            }

            public Builder setRunningTime(int value) {
                copyOnWrite();
                ((TimeMessage) this.instance).setRunningTime(value);
                return this;
            }

            public Builder setSwimmingTime(int value) {
                copyOnWrite();
                ((TimeMessage) this.instance).setSwimmingTime(value);
                return this;
            }

            public Builder setSwitchTime1(int value) {
                copyOnWrite();
                ((TimeMessage) this.instance).setSwitchTime1(value);
                return this;
            }

            public Builder setSwitchTime2(int value) {
                copyOnWrite();
                ((TimeMessage) this.instance).setSwitchTime2(value);
                return this;
            }

            public Builder setTotalTime(int value) {
                copyOnWrite();
                ((TimeMessage) this.instance).setTotalTime(value);
                return this;
            }

            private Builder() {
                super(TimeMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            TimeMessage timeMessage = new TimeMessage();
            DEFAULT_INSTANCE = timeMessage;
            GeneratedMessageLite.registerDefaultInstance(TimeMessage.class, timeMessage);
        }

        private TimeMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCyclingTime() {
            this.bitField0_ &= -33;
            this.cyclingTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExerciseTime() {
            this.bitField0_ &= -3;
            this.exerciseTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPauseTime() {
            this.bitField0_ &= -5;
            this.pauseTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRestTimeBetweenGroups() {
            this.bitField0_ &= -9;
            this.restTimeBetweenGroups_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRunningTime() {
            this.bitField0_ &= -65;
            this.runningTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwimmingTime() {
            this.bitField0_ &= -17;
            this.swimmingTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwitchTime1() {
            this.bitField0_ &= -129;
            this.switchTime1_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwitchTime2() {
            this.bitField0_ &= -257;
            this.switchTime2_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalTime() {
            this.bitField0_ &= -2;
            this.totalTime_ = 0;
        }

        public static TimeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TimeMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (TimeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static TimeMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<TimeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCyclingTime(int value) {
            this.bitField0_ |= 32;
            this.cyclingTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExerciseTime(int value) {
            this.bitField0_ |= 2;
            this.exerciseTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPauseTime(int value) {
            this.bitField0_ |= 4;
            this.pauseTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRestTimeBetweenGroups(int value) {
            this.bitField0_ |= 8;
            this.restTimeBetweenGroups_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRunningTime(int value) {
            this.bitField0_ |= 64;
            this.runningTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwimmingTime(int value) {
            this.bitField0_ |= 16;
            this.swimmingTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwitchTime1(int value) {
            this.bitField0_ |= 128;
            this.switchTime1_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwitchTime2(int value) {
            this.bitField0_ |= 256;
            this.switchTime2_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalTime(int value) {
            this.bitField0_ |= 1;
            this.totalTime_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new TimeMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b", new Object[]{"bitField0_", "totalTime_", "exerciseTime_", "pauseTime_", "restTimeBetweenGroups_", "swimmingTime_", "cyclingTime_", "runningTime_", "switchTime1_", "switchTime2_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TimeMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (TimeMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public int getCyclingTime() {
            return this.cyclingTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public int getExerciseTime() {
            return this.exerciseTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public int getPauseTime() {
            return this.pauseTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public int getRestTimeBetweenGroups() {
            return this.restTimeBetweenGroups_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public int getRunningTime() {
            return this.runningTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public int getSwimmingTime() {
            return this.swimmingTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public int getSwitchTime1() {
            return this.switchTime1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public int getSwitchTime2() {
            return this.switchTime2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public int getTotalTime() {
            return this.totalTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public boolean hasCyclingTime() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public boolean hasExerciseTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public boolean hasPauseTime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public boolean hasRestTimeBetweenGroups() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public boolean hasRunningTime() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public boolean hasSwimmingTime() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public boolean hasSwitchTime1() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public boolean hasSwitchTime2() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TimeMessageOrBuilder
        public boolean hasTotalTime() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TimeMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static TimeMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TimeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TimeMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TimeMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TimeMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TimeMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TimeMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TimeMessage parseFrom(InputStream input) throws IOException {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TimeMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TimeMessage parseFrom(CodedInputStream input) throws IOException {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TimeMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface TimeMessageOrBuilder extends MessageLiteOrBuilder {
        int getCyclingTime();

        int getExerciseTime();

        int getPauseTime();

        int getRestTimeBetweenGroups();

        int getRunningTime();

        int getSwimmingTime();

        int getSwitchTime1();

        int getSwitchTime2();

        int getTotalTime();

        boolean hasCyclingTime();

        boolean hasExerciseTime();

        boolean hasPauseTime();

        boolean hasRestTimeBetweenGroups();

        boolean hasRunningTime();

        boolean hasSwimmingTime();

        boolean hasSwitchTime1();

        boolean hasSwitchTime2();

        boolean hasTotalTime();
    }

    public static final class TypeMessage extends GeneratedMessageLite<TypeMessage, Builder> implements TypeMessageOrBuilder {
        private static final TypeMessage DEFAULT_INSTANCE;
        private static volatile Parser<TypeMessage> PARSER = null;
        public static final int SUBTYPE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int subtype_;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.Builder<TypeMessage, Builder> implements TypeMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearSubtype() {
                copyOnWrite();
                ((TypeMessage) this.instance).clearSubtype();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((TypeMessage) this.instance).clearType();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TypeMessageOrBuilder
            public int getSubtype() {
                return ((TypeMessage) this.instance).getSubtype();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TypeMessageOrBuilder
            public int getType() {
                return ((TypeMessage) this.instance).getType();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TypeMessageOrBuilder
            public boolean hasSubtype() {
                return ((TypeMessage) this.instance).hasSubtype();
            }

            @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TypeMessageOrBuilder
            public boolean hasType() {
                return ((TypeMessage) this.instance).hasType();
            }

            public Builder setSubtype(int value) {
                copyOnWrite();
                ((TypeMessage) this.instance).setSubtype(value);
                return this;
            }

            public Builder setType(int value) {
                copyOnWrite();
                ((TypeMessage) this.instance).setType(value);
                return this;
            }

            private Builder() {
                super(TypeMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            TypeMessage typeMessage = new TypeMessage();
            DEFAULT_INSTANCE = typeMessage;
            GeneratedMessageLite.registerDefaultInstance(TypeMessage.class, typeMessage);
        }

        private TypeMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubtype() {
            this.bitField0_ &= -3;
            this.subtype_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static TypeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TypeMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (TypeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static TypeMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<TypeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubtype(int value) {
            this.bitField0_ |= 2;
            this.subtype_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new TypeMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔋ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "type_", "subtype_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TypeMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (TypeMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TypeMessageOrBuilder
        public int getSubtype() {
            return this.subtype_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TypeMessageOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TypeMessageOrBuilder
        public boolean hasSubtype() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.SportSummary2.TypeMessageOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TypeMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static TypeMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TypeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TypeMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TypeMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TypeMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TypeMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TypeMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TypeMessage parseFrom(InputStream input) throws IOException {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TypeMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TypeMessage parseFrom(CodedInputStream input) throws IOException {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TypeMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TypeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface TypeMessageOrBuilder extends MessageLiteOrBuilder {
        int getSubtype();

        int getType();

        boolean hasSubtype();

        boolean hasType();
    }

    private SportSummary2() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
